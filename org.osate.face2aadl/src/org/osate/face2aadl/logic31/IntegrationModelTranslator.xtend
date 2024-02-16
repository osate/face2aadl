/**
 * FACE Data Model to AADL Translator
 * 
 * Copyright 2023 Carnegie Mellon University.
 * 
 * NO WARRANTY. THIS CARNEGIE MELLON UNIVERSITY AND SOFTWARE ENGINEERING INSTITUTE MATERIAL IS FURNISHED ON
 * AN "AS-IS" BASIS. CARNEGIE MELLON UNIVERSITY MAKES NO WARRANTIES OF ANY KIND, EITHER EXPRESSED OR IMPLIED,
 * AS TO ANY MATTER INCLUDING, BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR PURPOSE OR MERCHANTABILITY,
 * EXCLUSIVITY, OR RESULTS OBTAINED FROM USE OF THE MATERIAL. CARNEGIE MELLON UNIVERSITY DOES NOT MAKE ANY
 * WARRANTY OF ANY KIND WITH RESPECT TO FREEDOM FROM PATENT, TRADEMARK, OR COPYRIGHT INFRINGEMENT.
 * 
 * Released under an Eclipse Public License - v1.0-style license, please see license.txt or contact
 * permission@sei.cmu.edu for full terms.
 * 
 * [DISTRIBUTION STATEMENT A] This material has been approved for public release and unlimited distribution.
 * Please see Copyright notice for non-US Government use and distribution.
 * 
 * DM23-0412
 */
package org.osate.face2aadl.logic31

import java.util.List
import java.util.Map
import java.util.Optional
import org.eclipse.emf.ecore.xmi.XMLResource
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.jgrapht.alg.connectivity.BiconnectivityInspector
import org.jgrapht.graph.DefaultEdge
import org.jgrapht.graph.SimpleGraph
import org.jgrapht.graph.builder.GraphBuilder
import org.osate.face31.ArchitectureModel
import org.osate.face31.integration.IntegrationContext
import org.osate.face31.integration.IntegrationModel
import org.osate.face31.integration.TSNodeConnection
import org.osate.face31.integration.TSNodeInputPort
import org.osate.face31.integration.TSNodeOutputPort
import org.osate.face31.integration.TSNodePort
import org.osate.face31.integration.TSNodePortBase
import org.osate.face31.integration.TransportChannel
import org.osate.face31.integration.TransportNode
import org.osate.face31.integration.UoPEndPoint
import org.osate.face31.integration.UoPInputEndPoint
import org.osate.face31.integration.UoPInstance
import org.osate.face31.integration.UoPOutputEndPoint
import org.osate.face31.uop.ClientServerConnection
import org.osate.face31.uop.MessageType
import org.osate.face31.uop.PlatformSpecificComponent
import org.osate.face31.uop.PortableComponent
import org.osate.face31.uop.PubSubConnection
import org.osate.face31.uop.QueuingConnection
import org.osate.face31.uop.SingleInstanceMessageConnection
import org.osate.face31.uop.UnitOfPortability

import static org.osate.face2aadl.common.TranslatorCommonUtil.sanitizeID
import static org.osate.face2aadl.common.TranslatorCommonUtil.translateUUID
import static org.osate.face2aadl.logic31.Translator31Util.translateDescription
import static org.osate.face2aadl.logic31.Translator31Util.translateMessageTypeReference

import static extension org.eclipse.xtext.EcoreUtil2.eAllOfType
import static extension org.eclipse.xtext.EcoreUtil2.getContainerOfType

@FinalFieldsConstructor
package class IntegrationModelTranslator {
	val String faceFileName
	val String packageName
	val String dataModelPackageName
	val String psssPackageName
	val String pcsPackageName
	
	def package Optional<String> translate(ArchitectureModel model) {
		translate(model.im.flatMap[it.eAllOfType(IntegrationModel)].toList)
	}
	
	def package Optional<String> translate(List<IntegrationModel> integrationModels) {
		val graphBuilder = new GraphBuilder(new SimpleGraph(DefaultEdge))
		integrationModels.flatMap[it.element.filter(IntegrationContext).flatMap[it.connection]]
			.forEach[tsNodeConnection |
				val sourceIntegrationModel = tsNodeConnection.source.getContainerOfType(IntegrationModel)
				val destinationIntegrationModel = tsNodeConnection.destination.getContainerOfType(IntegrationModel)
				if (sourceIntegrationModel != destinationIntegrationModel) {
					graphBuilder.addEdge(sourceIntegrationModel, destinationIntegrationModel)
				}
			]
		// Keeps track of each collection of merged IntegrationModels and whether they have been translated yet.
		val mergedIntegrationModels = new BiconnectivityInspector(graphBuilder.buildAsUnmodifiable)
			.connectedComponents
			.map[subgraph | subgraph.vertexSet.sortBy[integrationModels.indexOf(it)]]
			.toInvertedMap[false]
		val allMergedIntegrationModels = mergedIntegrationModels.keySet.toList
		
		val transportNodes = integrationModels.flatMap[it.element.filter(IntegrationContext).flatMap[it.node]].toList
		val transportNodeNames = generateUniqueNames(transportNodes)
		
		val classifiers = integrationModels.map[model |
			val merged = mergedIntegrationModels.keySet.findFirst[it.contains(model)]
			if (merged === null) {
				translateIntegrationModels(#[model], transportNodeNames, allMergedIntegrationModels)
			} else if (!mergedIntegrationModels.get(merged)) {
				mergedIntegrationModels.put(merged, true)
				translateIntegrationModels(merged, transportNodeNames, allMergedIntegrationModels)
			} else {
				null
			}
		].filterNull
		val classifiersString = classifiers.join(System.lineSeparator)
		
		if (classifiersString.empty) {
			Optional.empty
		} else {
			val withs = newArrayList
			if (classifiersString.contains("FACE::")) {
				withs += "FACE"
			}
			if (classifiersString.contains(dataModelPackageName + "::")) {
				withs += dataModelPackageName
			}
			if (classifiersString.contains(psssPackageName + "::")) {
				withs += psssPackageName
			}
			if (classifiersString.contains(pcsPackageName + "::")) {
				withs += pcsPackageName
			}
			
			Optional.of('''
				--Generated from "«faceFileName»"
				package «packageName»
				public
					«IF !withs.empty»
					«FOR modelUnit : withs.sortBy[it.toUpperCase]»
					with «modelUnit»;
					«ENDFOR»
					
					«ENDIF»
					«classifiersString»
				end «packageName»;''')
		}
	}
	
	/*
	 * In FACE, TransportNodes do not need to have unique names. This is different from many other FACE elements which
	 * do require unique names. The translator converts TransportNodes into abstract types and abstract subcomponents in
	 * AADL. AADL does require unique names for classifiers and for subcomponents. This method ensures that each
	 * TransportNode will have a unique name when translated into AADL.
	 * 
	 * TransportNode names that are already unique are left alone. Duplicate names are appended with
	 * "_with_unique_name_" and an index.
	 */
	def private Map<TransportNode, String> generateUniqueNames(List<TransportNode> transportNodes) {
		val transportNodeNames = newHashMap
		transportNodes.groupBy[sanitizeID(it.name)].forEach[name, nodes |
			if (nodes.size == 1) {
				transportNodeNames.put(nodes.head, name)
			} else {
				nodes.forEach[node, index | transportNodeNames.put(node, '''«name»_with_unique_name_«index + 1»''')]
			}
		]
		return transportNodeNames
	}
	
	/*
	 * This method handles the translation of a single IntegrationModel as well as merged IntegerationModels. When the
	 * models parameter contains multiple IntegrationModels, then they are considered to be merged. Otherwise, the one
	 * model is translated as a single IntegrationModel.
	 */
	def private String translateIntegrationModels(List<IntegrationModel> models,
		Map<TransportNode, String> transportNodeNames, List<List<IntegrationModel>> allMergedIntegrationModels
	) {
		if (models.empty) {
			throw new IllegalArgumentException("models cannot be empty.")
		}
		
		val comments = if (models.size == 1) {
			translateDescription(models.head)
		} else {
			'''
				--Merged from the following Integration Models:
				«FOR model : models»
				--  «model.name»
				«ENDFOR»
				«FOR model : models»
				«IF !model.description.empty»
				--
				--Description of «model.name»:
				«translateDescription(model)»
				«ENDIF»
				«ENDFOR»
			'''
		}
		
		val name = if (models.size == 1) {
			sanitizeID(models.head.name)
		} else {
			"Merged_Integration_Models_" + (allMergedIntegrationModels.indexOf(models) + 1)
		}
		
		val uuidProperty = if (models.size == 1) {
			translateUUID(models.head)
		} else {
			val records = models.map[model | model -> (model.eResource as XMLResource).getID(model)]
				.filter[it.value !== null]
				.map['''[Integration_Model => "«sanitizeID(it.key.name)»"; UUID => "«it.value»";]''']
				.join(",\n")
			'''
				«IF !records.empty»
				FACE::Merged_UUIDs => (
					«records»
				);
				«ENDIF»
			'''
		}
		
		val uopInstances = models.flatMap[it.element.filter(UoPInstance)]
		val processes = uopInstances.map[translateUoPInstance(it)]
		
		val transportChannels = models.flatMap[it.element.filter(TransportChannel)]
		val virtualBuses = transportChannels.map[translateTransportChannel(it)]
		
		val transportNodes = models.flatMap[it.element.filter(IntegrationContext)].flatMap[it.node].toList
		val nodeSubcomponents = transportNodes.map[translateTransportNodeSubcomponent(it, transportNodeNames)]
		
		val subcomponents = processes + virtualBuses + nodeSubcomponents
		val subcomponentsString = subcomponents.join(System.lineSeparator)
		
		val tsNodeConnections = models.flatMap[it.element.filter(IntegrationContext)].flatMap[it.connection].toList
		
		val featureKinds = <TransportNode, String>newHashMap
		val connectionKinds = <TSNodeConnection, String>newHashMap
		
		// Vertex type is either TransportNode or UoPEndPoint
		val graphBuilder = new GraphBuilder(new SimpleGraph(TSNodeConnection))
		tsNodeConnections.forEach[tsNodeConnection |
			val sourceVertex = switch source : tsNodeConnection.source {
				TSNodePort: source.getContainerOfType(TransportNode)
				UoPEndPoint: source
			}
			val destinationVertex = switch destination : tsNodeConnection.destination {
				TSNodePort: destination.getContainerOfType(TransportNode)
				UoPEndPoint: destination
			}
			graphBuilder.addEdge(sourceVertex, destinationVertex, tsNodeConnection)
		]
		for (subgraph : new BiconnectivityInspector(graphBuilder.buildAsUnmodifiable).connectedComponents) {
			val portKindsSet = subgraph.vertexSet.filter(UoPEndPoint).map[vertex |
				switch vertex.connection {
					ClientServerConnection,
					QueuingConnection: "event data port"
					SingleInstanceMessageConnection: "data port"
				}
			].toSet
			if (portKindsSet.size == 1) {
				featureKinds.putAll(subgraph.vertexSet.filter(TransportNode).toInvertedMap[portKindsSet.head])
				connectionKinds.putAll(subgraph.edgeSet.toInvertedMap["port"])
			}
		}
		
		'''
			«comments»
			system «name»
				«IF !uuidProperty.empty»
				properties
					«uuidProperty»
				«ENDIF»
			end «name»;
			
			system implementation «name».impl
				«IF !subcomponentsString.empty»
				subcomponents
					«subcomponentsString»
				«ENDIF»
				«IF !tsNodeConnections.empty»
				connections
					«FOR tsNodeConnection : tsNodeConnections.indexed»
					«val index = tsNodeConnection.key»
					«val connection = tsNodeConnection.value»
					«val connectionKind = connectionKinds.getOrDefault(connection, "feature")»
					«translateTSNodeConnection(connection, index, connectionKind, transportNodeNames)»
					«ENDFOR»
				«ENDIF»
			end «name».impl;
			«FOR node : transportNodes»
			
			«translateTransportNode(node, transportNodeNames, featureKinds.getOrDefault(node, "feature"))»
			«ENDFOR»
		'''
	}
	
	def private String translateUoPInstance(UoPInstance uop) {
		val uopReference = translateUoPReference(uop.realizes)
		val uuid = translateUUID(uop)
		
		'''
			«translateDescription(uop)»
			«sanitizeID(uop.name)»: process «uopReference»«IF !uuid.empty» {
				«uuid»
			}«ENDIF»;'''
	}
	
	def private String translateUoPReference(UnitOfPortability uop) {
		val packageName = switch uop {
			PlatformSpecificComponent: psssPackageName
			PortableComponent: pcsPackageName
		}
		
		'''«packageName»::«sanitizeID(uop.name)»_process.impl'''
	}
	
	def private String translateTransportChannel(TransportChannel channel) {
		val uuid = translateUUID(channel)
		
		'''
			«translateDescription(channel)»
			«sanitizeID(channel.name)»: virtual bus«IF !uuid.empty» {
				«uuid»
			}«ENDIF»;'''
	}
	
	def private String translateTransportNode(TransportNode node, Map<TransportNode, String> transportNodeNames,
		String featureKind
	) {
		val name = transportNodeNames.get(node)
		
		'''
			«translateDescription(node)»
			abstract «name»
				«IF !node.inPort.empty || node.outPort !== null»
				features
					«FOR inPort : node.inPort.indexed»
					«translateTSNodePort(inPort.value, inPort.key, featureKind)»
					«ENDFOR»
					«IF node.outPort !== null»
					«translateTSNodePort(node.outPort, featureKind)»
					«ENDIF»
				«ENDIF»
				properties
					FACE::Segment => TSS;
					«translateUUID(node)»
			end «name»;
		'''
	}
	
	def private String translateTSNodePort(TSNodeInputPort port, int index, String featureKind) {
		val uuid = translateUUID(port)
		
		'''
			input«index»: in «featureKind» «translateMessageTypeReference(port.view)»«IF !uuid.empty» {
				«uuid»
			}«ENDIF»;'''
	}
	
	def private String translateTSNodePort(TSNodeOutputPort port, String featureKind) {
		val uuid = translateUUID(port)
		
		'''
			output: out «featureKind» «translateMessageTypeReference(port.view)»«IF !uuid.empty» {
				«uuid»
			}«ENDIF»;'''
	}
	
	def private String translateTransportNodeSubcomponent(TransportNode node,
		Map<TransportNode, String> transportNodeNames
	) {
		val name = transportNodeNames.get(node)
		
		'''«name»: abstract «name»;'''
	}
	
	def private String translateMessageTypeReference(MessageType messageType) {
		translateMessageTypeReference(dataModelPackageName, messageType)
	}
	
	def private String translateTSNodeConnection(TSNodeConnection connection, int index, String connectionKind,
		Map<TransportNode, String> transportNodeNames
	) {
		val uuid = translateUUID(connection)
		val src = translatePortBaseReference(connection.source, transportNodeNames)
		val dst = translatePortBaseReference(connection.destination, transportNodeNames)
		
		'''
			connection«index»: «connectionKind» «src» -> «dst»«IF !uuid.empty» {
				«uuid»
			}«ENDIF»;'''
	}
	
	def private String translatePortBaseReference(TSNodePortBase portBase,
		Map<TransportNode, String> transportNodeNames
	) {
		switch portBase {
			TSNodeInputPort: {
				val node = portBase.getContainerOfType(TransportNode)
				
				transportNodeNames.get(node) + ".input" + node.inPort.indexOf(portBase)
			}
			TSNodeOutputPort: transportNodeNames.get(portBase.getContainerOfType(TransportNode)) + ".output"
			UoPEndPoint: {
				val subcomponentName = sanitizeID(portBase.getContainerOfType(UoPInstance).name)
				val uopConnection = portBase.connection
				val suffix = switch uopConnection {
					ClientServerConnection: {
						val isResponse = switch uopConnection.role {
							case CLIENT: portBase instanceof UoPInputEndPoint
							case SERVER: portBase instanceof UoPOutputEndPoint
						}
						if (isResponse) {
							"_response"
						} else {
							"_request"
						}
					}
					PubSubConnection: ""
				}
				
				subcomponentName + "." + sanitizeID(uopConnection.name) + suffix
			}
		}
	}
}