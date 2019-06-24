/*******************************************************************************
 * FACE Data Model to AADL Translator
 * 
 * Copyright 2018 Carnegie Mellon University. All Rights Reserved.
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
 * DM18-0762
 *******************************************************************************/
package org.osate.face2aadl.logic

import face.ArchitectureModel
import face.datamodel.platform.View
import face.integration.IntegrationContext
import face.integration.IntegrationModel
import face.integration.TSNodeConnection
import face.integration.TSNodeInputPort
import face.integration.TSNodeOutputPort
import face.integration.TSNodePortBase
import face.integration.TransportChannel
import face.integration.TransportNode
import face.integration.UoPEndPoint
import face.integration.UoPInputEndPoint
import face.integration.UoPInstance
import face.integration.UoPOutputEndPoint
import face.uop.ClientServerConnection
import face.uop.PlatformSpecificComponent
import face.uop.PortableComponent
import face.uop.PubSubConnection
import face.uop.UnitOfPortability
import java.util.Optional
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

import static org.osate.face2aadl.logic.TranslatorUtil.sanitizeID
import static org.osate.face2aadl.logic.TranslatorUtil.translateDescription
import static org.osate.face2aadl.logic.TranslatorUtil.translateUUID
import static org.osate.face2aadl.logic.TranslatorUtil.translateViewReference

import static extension org.eclipse.xtext.EcoreUtil2.eAll
import static extension org.eclipse.xtext.EcoreUtil2.getContainerOfType

@FinalFieldsConstructor
package class IntegrationModelTranslator {
	val String faceFileName
	val String packageName
	val String dataModelPackageName
	val String psssPackageName
	val String pcsPackageName
	val String timestamp
	
	def package Optional<String> translate(ArchitectureModel model) {
		val integrationModels = model.im.map[it.eAll.toIterable].flatten.filter(IntegrationModel)
		val classifiers = integrationModels.map[translateIntegrationModel(it)]
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
				--Generated from "«faceFileName»" at «timestamp»
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
	
	def private String translateIntegrationModel(IntegrationModel model) {
		val name = sanitizeID(model.name)
		
		val uopInstances = model.element.filter(UoPInstance)
		val processes = uopInstances.map[translateUoPInstance(it)]
		
		val transportChannels = model.element.filter(TransportChannel)
		val virtualBuses = transportChannels.map[translateTransportChannel(it)]
		
		val transportNodes = model.element.filter(IntegrationContext).map[it.node].flatten.toList
		val nodeSubcomponents = transportNodes.map[translateTransportNodeSubcomponent(it)]
		
		val subcomponents = processes + virtualBuses + nodeSubcomponents
		val subcomponentsString = subcomponents.join(System.lineSeparator)
		val uuid = translateUUID(model)
		
		val tsNodeConnections = model.element.filter(IntegrationContext).map[it.connection].flatten.toList
		
		'''
			«translateDescription(model)»
			system «name»
				«IF !uuid.empty»
				properties
					«uuid»
				«ENDIF»
			end «name»;
			
			system implementation «name».impl
				«IF !subcomponentsString.empty»
				subcomponents
					«subcomponentsString»
				«ENDIF»
				«IF !tsNodeConnections.empty»
				connections
					«FOR connection : tsNodeConnections.indexed»
					«translateTSNodeConnection(connection.value, connection.key)»
					«ENDFOR»
				«ENDIF»
			end «name».impl;
			«FOR node : transportNodes»
			
			«translateTransportNode(node)»
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
	
	def private String translateTransportNode(TransportNode node) {
		val name = sanitizeID(node.name)
		
		'''
			«translateDescription(node)»
			abstract «name»
				«IF !node.inPort.empty || node.outPort !== null»
				features
					«FOR inPort : node.inPort.indexed»
					«translateTSNodePort(inPort.value, inPort.key)»
					«ENDFOR»
					«IF node.outPort !== null»
					«translateTSNodePort(node.outPort)»
					«ENDIF»
				«ENDIF»
				properties
					FACE::Segment => TSS;
					«translateUUID(node)»
			end «name»;
		'''
	}
	
	def private String translateTSNodePort(TSNodeInputPort port, int index) {
		val uuid = translateUUID(port)
		
		'''
			input«index»: in feature «translateViewReference(port.view)»«IF !uuid.empty» {
				«uuid»
			}«ENDIF»;'''
	}
	
	def private String translateTSNodePort(TSNodeOutputPort port) {
		val uuid = translateUUID(port)
		
		'''
			output: out feature «translateViewReference(port.view)»«IF !uuid.empty» {
				«uuid»
			}«ENDIF»;'''
	}
	
	def private String translateTransportNodeSubcomponent(TransportNode node) {
		val name = sanitizeID(node.name)
		
		'''«name»: abstract «name»;'''
	}
	
	def private String translateViewReference(View view) {
		translateViewReference(dataModelPackageName, view)
	}
	
	def private String translateTSNodeConnection(TSNodeConnection connection, int index) {
		val uuid = translateUUID(connection)
		val src = translatePortBaseReference(connection.source)
		val dst = translatePortBaseReference(connection.destination)
		
		'''
			connection«index»: feature «src» -> «dst»«IF !uuid.empty» {
				«uuid»
			}«ENDIF»;'''
	}
	
	def private String translatePortBaseReference(TSNodePortBase portBase) {
		switch portBase {
			TSNodeInputPort: {
				val node = portBase.getContainerOfType(TransportNode)
				
				sanitizeID(node.name) + ".input" + node.inPort.indexOf(portBase)
			}
			TSNodeOutputPort: sanitizeID(portBase.getContainerOfType(TransportNode).name) + ".output"
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