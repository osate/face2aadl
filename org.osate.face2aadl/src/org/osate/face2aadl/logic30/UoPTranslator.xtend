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
package org.osate.face2aadl.logic30

import face.ArchitectureModel
import face.datamodel.platform.View
import face.uop.ClientServerConnection
import face.uop.PlatformSpecificComponent
import face.uop.PortableComponent
import face.uop.PubSubConnection
import face.uop.QueuingConnection
import face.uop.SingleInstanceMessageConnection
import face.uop.UnitOfPortability
import java.util.Optional
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

import static org.osate.face2aadl.common.TranslatorCommonUtil.sanitizeID
import static org.osate.face2aadl.common.TranslatorCommonUtil.translateThreadPeriod
import static org.osate.face2aadl.common.TranslatorCommonUtil.translateUUID
import static org.osate.face2aadl.logic30.Translator30Util.translateDescription
import static org.osate.face2aadl.logic30.Translator30Util.translateViewReference

import static extension org.eclipse.xtext.EcoreUtil2.getAllContentsOfType

@FinalFieldsConstructor
package class UoPTranslator {
	val String faceFileName
	val String packageName
	val String dataModelPackageName
	
	def package Optional<String> translate(ArchitectureModel model, Class<? extends UnitOfPortability> segmentType,
		boolean createFlows
	) {
		translate(model.um.map[it.getAllContentsOfType(segmentType)].flatten, createFlows)
	}
	
	def package Optional<String> translate(Iterable<? extends UnitOfPortability> uops, boolean createFlows) {
		val classifiers = uops.map[translateUoP(it, createFlows)]
		val classifiersString = classifiers.join(System.lineSeparator)
		
		if (classifiersString.empty) {
			Optional.empty
		} else {
			val withs = newArrayList("FACE")
			if (classifiersString.contains(dataModelPackageName + "::")) {
				withs += dataModelPackageName
			}
			
			Optional.of('''
				--Generated from "«faceFileName»"
				package «packageName»
				public
					«FOR modelUnit : withs.sortBy[it.toUpperCase]»
					with «modelUnit»;
					«ENDFOR»
					
					«classifiersString»
				end «packageName»;''')
		}
	}
	
	def private String translateUoP(UnitOfPortability component, boolean createFlows) {
		val name = sanitizeID(component.name)
		val processName = name + "_process"
		
		val portsString = component.connection.map[translateConnection(it)].join(System.lineSeparator)
		
		val profile = switch component.faceProfile {
			case GENERAL_PURPOSE: "general"
			case SECURITY: "security"
			case SAFETY_BASE: "safety"
			case SAFETY_EXTENDED: "safety_extended"
		}
		val segment = switch component {
			PlatformSpecificComponent: "PSSS"
			PortableComponent: "PCS"
		}
		
		val connections = component.connection.map[createPortMappings(it, name)]
		val connectionsString = connections.join(System.lineSeparator)
		
		'''
			«translateDescription(component)»
			thread group «name»
				«IF !portsString.empty»
				features
					«portsString»
				«ENDIF»
				properties
					FACE::Profile => «profile»;
					FACE::Segment => «segment»;
					«translateUUID(component)»
			end «name»;
			
			thread group implementation «name».impl
				«IF !component.thread.empty»
				subcomponents
					«FOR thread : component.thread.indexed»
					thread«thread.key»: thread {
						«val executionTime = translateThreadPeriod(thread.value.timeCapacity)»
						Compute_Execution_Time => «executionTime» .. «executionTime»;
						Period => «translateThreadPeriod(thread.value.period)»;
						Priority => «thread.value.relativePriority»;
					};
					«ENDFOR»
				«ENDIF»
			end «name».impl;
			
			process «processName»
				«IF !portsString.empty»
				features
					«portsString»
				«IF createFlows»
				flows
					«FOR connection : component.connection»
					«createFlowSpecs(connection)»
					«ENDFOR»
				«ENDIF»
				«ENDIF»
			end «processName»;
			
			process implementation «processName».impl
				subcomponents
					«name»: thread group «name».impl;
				«IF !connectionsString.empty»
				connections
					«connectionsString»
				«IF createFlows»
				flows
					«FOR connection : component.connection»
					«createFlowImpls(connection, name)»
					«ENDFOR»
				«ENDIF»
				«ENDIF»
			end «processName».impl;
		'''
	}
	
	def private dispatch String translateConnection(ClientServerConnection connection) {
		var String requestDirection
		var String responseDirection
		switch connection.role {
			case CLIENT: {
				requestDirection = "out"
				responseDirection = "in"
			}
			case SERVER: {
				requestDirection = "in"
				responseDirection = "out"
			}
		}
		val requestType = translateViewReference(connection.requestType)
		val responseType = translateViewReference(connection.responseType)
		val frequency = if (connection.period == 0.0f) {
			0.0
		} else {
			1.0 / connection.period
		}
		'''
			«translateDescription(connection)»
			«sanitizeID(connection.name)»_request: «requestDirection» event data port «requestType» {
				«requestDirection.toFirstUpper»put_Rate => [Value_Range => «frequency» .. «frequency»; Rate_Unit => PerSecond;];
				«translateUUID(connection)»
			};
			«translateDescription(connection)»
			«sanitizeID(connection.name)»_response: «responseDirection» event data port «responseType» {
				«responseDirection.toFirstUpper»put_Rate => [Value_Range => «frequency» .. «frequency»; Rate_Unit => PerSecond;];
				«translateUUID(connection)»
			};'''
	}
	
	def private dispatch String translateConnection(QueuingConnection connection) {
		val direction = switch connection.messageExchangeType {
			case INBOUND_MESSAGE: "in"
			case OUTBOUND_MESSAGE: "out"
		}
		val messageType = translateViewReference(connection.messageType)
		val frequency = if (connection.period == 0.0f) {
			0.0
		} else {
			1.0 / connection.period
		}
		'''
			«translateDescription(connection)»
			«sanitizeID(connection.name)»: «direction» event data port «messageType» {
				«direction.toFirstUpper»put_Rate => [Value_Range => «frequency» .. «frequency»; Rate_Unit => PerSecond;];
				Queue_Size => «connection.depth»;
				«translateUUID(connection)»
			};'''
	}
	
	def private dispatch String translateConnection(SingleInstanceMessageConnection connection) {
		val direction = switch connection.messageExchangeType {
			case INBOUND_MESSAGE: "in"
			case OUTBOUND_MESSAGE: "out"
		}
		val messageType = translateViewReference(connection.messageType)
		val frequency = if (connection.period == 0.0f) {
			0.0
		} else {
			1.0 / connection.period
		}
		'''
			«translateDescription(connection)»
			«sanitizeID(connection.name)»: «direction» data port «messageType» {
				«direction.toFirstUpper»put_Rate => [Value_Range => «frequency» .. «frequency»; Rate_Unit => PerSecond;];
				«translateUUID(connection)»
			};'''
	}
	
	def private String translateViewReference(View view) {
		translateViewReference(dataModelPackageName, view)
	}
	
	def private dispatch String createFlowSpecs(ClientServerConnection connection) {
		val name = sanitizeID(connection.name)
		val requestName = name + "_request"
		val responseName = name + "_response"
		
		switch connection.role {
			case CLIENT: '''
				«requestName»_source: flow source «requestName»;
				«responseName»_sink: flow sink «responseName»;'''
			case SERVER: '''
				«requestName»_sink: flow sink «requestName»;
				«responseName»_source: flow source «responseName»;'''
		}
	}
	
	def private dispatch String createFlowSpecs(PubSubConnection connection) {
		val name = sanitizeID(connection.name)
		
		switch connection.messageExchangeType {
			case INBOUND_MESSAGE: '''«name»_sink: flow sink «name»;'''
			case OUTBOUND_MESSAGE: '''«name»_source: flow source «name»;'''
		}
	}
	
	def private dispatch String createPortMappings(ClientServerConnection connection, String uopName) {
		val name = sanitizeID(connection.name)
		val requestName = name + "_request"
		val responseName = name + "_response"
		
		switch connection.role {
			case CLIENT: '''
				«requestName»_connection: port «uopName».«requestName» -> «requestName»;
				«responseName»_connection: port «responseName» -> «uopName».«responseName»;'''
			case SERVER: '''
				«requestName»_connection: port «requestName» -> «uopName».«requestName»;
				«responseName»_connection: port «uopName».«responseName» -> «responseName»;'''
		}
	}
	
	def private dispatch String createPortMappings(PubSubConnection connection, String uopName) {
		val name = sanitizeID(connection.name)
		
		switch connection.messageExchangeType {
			case INBOUND_MESSAGE: '''«name»_connection: port «name» -> «uopName».«name»;'''
			case OUTBOUND_MESSAGE: '''«name»_connection: port «uopName».«name» -> «name»;'''
		}
	}
	
	def private dispatch String createFlowImpls(ClientServerConnection connection, String uopName) {
		val name = sanitizeID(connection.name)
		val requestName = name + "_request"
		val responseName = name + "_response"
		
		switch connection.role {
			case CLIENT: '''
				«requestName»_source: flow source «uopName» -> «requestName»_connection -> «requestName»;
				«responseName»_sink: flow sink «responseName» -> «responseName»_connection -> «uopName»;'''
			case SERVER: '''
				«requestName»_sink: flow sink «requestName» -> «requestName»_connection -> «uopName»;
				«responseName»_source: flow source «uopName» -> «responseName»_connection -> «responseName»;'''
		}
	}
	
	def private dispatch String createFlowImpls(PubSubConnection connection, String uopName) {
		val name = sanitizeID(connection.name)
		
		switch connection.messageExchangeType {
			case INBOUND_MESSAGE: '''«name»_sink: flow sink «name» -> «name»_connection -> «uopName»;'''
			case OUTBOUND_MESSAGE: '''«name»_source: flow source «uopName» -> «name»_connection -> «name»;'''
		}
	}
}