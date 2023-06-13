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

import com.google.inject.Injector
import java.util.Optional
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.resource.IResourceDescriptions
import org.eclipse.xtext.resource.IResourceDescriptionsProvider
import org.eclipse.xtext.util.Triple
import org.eclipse.xtext.util.Tuples
import org.osate.datamodel10.Element
import org.osate.datamodel10.conceptual.ComposableElement
import org.osate.datamodel10.conceptual.CompositeQuery
import org.osate.datamodel10.conceptual.Query
import org.osate.datamodel10.conceptual.QueryComposition
import org.osate.datamodel10.conceptual.View
import org.osate.datamodel10.logical.Entity
import org.osate.datamodel10.platform.PlatformDataType
import org.osate.face31.ArchitectureModel
import org.osate.face31.uop.CompositeTemplate
import org.osate.face31.uop.MessageType
import org.osate.face31.uop.Template
import org.osate.face31.uop.TemplateComposition

import static org.osate.face2aadl.common.TranslatorCommonUtil.sanitizeID
import static org.osate.face2aadl.common.TranslatorCommonUtil.translateUUID
import static org.osate.face2aadl.logic31.Translator31Util.translateDescription
import static org.osate.face2aadl.logic31.Translator31Util.translateName

import static extension org.eclipse.xtext.EcoreUtil2.getAllContentsOfType

package class DataModelTranslator {
	val String faceFileName
	val String packageName
	val Optional<Triple<ResourceSet, IResourceDescriptions, IQualifiedNameProvider>> idlOption
	
	new(String faceFileName, String packageName, Optional<Pair<Injector, ResourceSet>> idlOption) {
		this.faceFileName = faceFileName
		this.packageName = packageName
		this.idlOption = idlOption.map[pair |
			val injector = pair.key
			val resourceSet = pair.value
			Tuples.create(
				resourceSet,
				injector.getInstance(IResourceDescriptionsProvider).getResourceDescriptions(resourceSet),
				injector.getInstance(IQualifiedNameProvider)
			)
		]
	}
	
	def package Optional<String> translate(ArchitectureModel model, boolean platformOnly) {
		val dataModelElements = if (platformOnly) {
			model.dm.flatMap[it.pdm].flatMap[it.getAllContentsOfType(org.osate.datamodel10.platform.Element)]
		} else {
			model.dm.flatMap[it.getAllContentsOfType(Element)]
		}
		val messageTypes = model.um.flatMap[it.getAllContentsOfType(MessageType)]
		val allElements = dataModelElements + messageTypes
		generateOutput(allElements.map[translateDataModelObject(it, platformOnly)].filterNull)
	}
	
	def package Optional<String> translate(Iterable<View> conceptualViews,
		Iterable<org.osate.datamodel10.logical.View> logicalViews, Iterable<MessageType> messageTypes
	) {
		generateOutput(
			conceptualViews.map[translateView(it)] +
			logicalViews.map[translateView(it)] +
			messageTypes.map[translateMessageType(it, false)]
		)
	}
	
	def package Optional<String> translate(Iterable<MessageType> messageTypes) {
		generateOutput(messageTypes.map[translateMessageType(it, true)])
	}
	
	def private Optional<String> generateOutput(Iterable<String> classifiers) {
		val classifiersString = classifiers.join(System.lineSeparator)
		
		if (classifiersString.empty) {
			Optional.empty
		} else {
			Optional.of('''
				--Generated from "«faceFileName»"
				package «packageName»
				public
					«IF classifiersString.contains("Base_Types::")»
					with Base_Types;
					«ENDIF»
					«IF classifiersString.contains("Data_Model::")»
					with Data_Model;
					«ENDIF»
					with FACE;
					
					«classifiersString»
				end «packageName»;''')
		}
	}
	
	def private String translateDataModelObject(EObject element, boolean platformOnly) {
		switch element {
			//Conceptual
			ComposableElement: {
				val name = translateName(element)
				'''
					«translateDescription(element)»
					data «name»
						properties
							FACE::Realization_Tier => conceptual;
							«translateUUID(element)»
					end «name»;
				'''
			}
			View: translateView(element)
			
			//Logical
			Entity: {
				val name = translateName(element)
				'''
					«translateDescription(element)»
					data «name» extends «translateName(element.realizes)»
						properties
							FACE::Realization_Tier => logical;
							«translateUUID(element)»
					end «name»;
				'''
			}
			org.osate.datamodel10.logical.View: translateView(element)
			
			//Platform
			PlatformDataType: {
				val name = translateName(element)
				
				var String errorComment = null
				var String typeExtension = null
				var String dataProperty = null
				var String subcomponents = null
				if (idlOption.present) {
					//TODO Fill this part in if we decide to support IDL processing for 3.1
				}
				
				'''
					«translateDescription(element)»
					«errorComment»
					data «name»«typeExtension»
						properties
							«dataProperty»
							FACE::Realization_Tier => platform;
							«translateUUID(element)»
					end «name»;
					
					data implementation «name».impl
						«subcomponents»
					end «name».impl;
				'''
			}
			org.osate.datamodel10.platform.Entity: {
				val name = translateName(element)
				'''
					«translateDescription(element)»
					data «name» «translateExtends(element.realizes, platformOnly)»
						properties
							FACE::Realization_Tier => platform;
							«translateUUID(element)»
					end «name»;
				'''
			}
			MessageType: translateMessageType(element, platformOnly)
		}
	}
	
	def private String translateView(View view) {
		switch view {
			Query: {
				val name = translateName(view)
				'''
					«translateDescription(view)»
					data «name»
						properties
							FACE::Realization_Tier => conceptual;
							«translateUUID(view)»
					end «name»;
				'''
			}
			CompositeQuery: {
				val name = translateName(view)
				'''
					«translateDescription(view)»
					data «name»
						properties
							«IF view.isUnion»
							FACE::Is_Union => true;
							«ENDIF»
							FACE::Realization_Tier => conceptual;
							«translateUUID(view)»
					end «name»;
					
					data implementation «name».impl
						subcomponents
							«FOR composition : view.composition»
							«translateQueryComposition(composition)»
							«ENDFOR»
					end «name».impl;
				'''
			}
		}
	}
	
	def private String translateQueryComposition(QueryComposition composition) {
		val viewReference = translateViewReference(composition.type)
		val uuid = translateUUID(composition)
		
		'''
			«sanitizeID(composition.rolename)»: data «viewReference»«IF !uuid.empty» {
				«uuid»
			}«ENDIF»;'''
	}
	
	def private String translateView(org.osate.datamodel10.logical.View view) {
		switch view {
			org.osate.datamodel10.logical.Query: {
				val name = translateName(view)
				'''
					«translateDescription(view)»
					data «name»«IF view.realizes !== null» extends «translateName(view.realizes)»«ENDIF»
						properties
							FACE::Realization_Tier => logical;
							«translateUUID(view)»
					end «name»;
				'''
			}
			org.osate.datamodel10.logical.CompositeQuery: {
				val name = translateName(view)
				'''
					«translateDescription(view)»
					data «name»«IF view.realizes !== null» extends «translateName(view.realizes)»«ENDIF»
						properties
							«IF view.isUnion»
							FACE::Is_Union => true;
							«ENDIF»
							FACE::Realization_Tier => logical;
							«translateUUID(view)»
					end «name»;
					
					data implementation «name».impl
						subcomponents
							«FOR composition : view.composition»
							«translateQueryComposition(composition)»
							«ENDFOR»
					end «name».impl;
				'''
			}
		}
	}
	
	def private String translateQueryComposition(org.osate.datamodel10.logical.QueryComposition composition) {
		val viewReference = translateViewReference(composition.type)
		val uuid = translateUUID(composition)
		
		'''
			«sanitizeID(composition.rolename)»: data «viewReference»«IF !uuid.empty» {
				«uuid»
			}«ENDIF»;'''
	}
	
	def private String translateMessageType(MessageType messageType, boolean platformOnly) {
		switch messageType {
			Template: {
				val name = translateName(messageType)
				val realizes = messageType.boundQuery?.realizes
				var String errorComment = null
				var String subcomponents = null
				var String additionalComponents = null
				if (idlOption.present) {
					//TODO Fill this part in if we decide to support IDL processing for 3.1
				}
				
				'''
					«translateDescription(messageType)»
					«errorComment»
					data «name»«IF realizes !== null» «translateExtends(realizes, platformOnly)»«ENDIF»
						properties
							FACE::Realization_Tier => platform;
							«translateUUID(messageType)»
					end «name»;
					
					data implementation «name».impl
						«subcomponents»
					end «name».impl;
					«additionalComponents»
				'''
			}
			CompositeTemplate: {
				val name = translateName(messageType)
				'''
					«translateDescription(messageType)»
					data «name»«IF messageType.realizes !== null» «translateExtends(messageType.realizes, platformOnly)»«ENDIF»
						properties
							«IF messageType.isUnion»
							FACE::Is_Union => true;
							«ENDIF»
							FACE::Realization_Tier => platform;
							«translateUUID(messageType)»
					end «name»;
					
					data implementation «name».impl
						subcomponents
							«FOR composition : messageType.composition»
							«translateTemplateComposition(composition)»
							«ENDFOR»
					end «name».impl;
				'''
			}
		}
	}
	
	def private String translateTemplateComposition(TemplateComposition composition) {
		val messageTypeReference = translateMessageTypeReference(composition.type)
		val uuid = translateUUID(composition)
		
		'''
			«sanitizeID(composition.rolename)»: data «messageTypeReference»«IF !uuid.empty» {
				«uuid»
			}«ENDIF»;'''
	}
	
	def private String translateExtends(org.osate.datamodel10.logical.Element extendedElement, boolean platformOnly) {
		val name = translateName(extendedElement)
		if (platformOnly) {
			'''--extension of «name» not translated'''
		} else {
			"extends " + name
		}
	}
	
	def private String translateViewReference(View view) {
		'''«translateName(view)»«IF view instanceof CompositeQuery».impl«ENDIF»'''
	}
	
	def private String translateViewReference(org.osate.datamodel10.logical.View view) {
		'''«translateName(view)»«IF view instanceof org.osate.datamodel10.logical.CompositeQuery».impl«ENDIF»'''
	}
	
	def private String translateMessageTypeReference(MessageType messageType) {
		'''«translateName(messageType)».impl'''
	}
}