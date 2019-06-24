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
import face.datamodel.conceptual.ComposableElement
import face.datamodel.conceptual.CompositeQuery
import face.datamodel.conceptual.Query
import face.datamodel.conceptual.QueryComposition
import face.datamodel.conceptual.View
import face.datamodel.logical.Entity
import face.datamodel.platform.CompositeTemplate
import face.datamodel.platform.Element
import face.datamodel.platform.PhysicalDataType
import face.datamodel.platform.Template
import face.datamodel.platform.TemplateComposition
import java.util.Optional
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

import static org.osate.face2aadl.logic.TranslatorUtil.sanitizeID
import static org.osate.face2aadl.logic.TranslatorUtil.translateDescription
import static org.osate.face2aadl.logic.TranslatorUtil.translateName
import static org.osate.face2aadl.logic.TranslatorUtil.translateUUID

@FinalFieldsConstructor
class DataModelTranslator implements ModelTranslator {
	val String faceFileName
	val String packageName
	val String timestamp
	val boolean platformOnly
	
	override translate(ArchitectureModel model) {
		val dataModelObjects = model.dm.map[it.eAllContents.toIterable].flatten
		val filtered = if (platformOnly) {
			dataModelObjects.filter(Element)
		} else {
			dataModelObjects
		}
		val classifiers = filtered.map[translateDataModelObject(it)].filterNull
		val classifiersString = classifiers.join(System.lineSeparator)
		
		if (classifiersString.empty) {
			Optional.empty
		} else {
			Optional.of('''
				--Generated from "«faceFileName»" at «timestamp»
				package «packageName»
				public
					with FACE;
					
					«classifiersString»
				end «packageName»;''')
		}
	}
	
	def private String translateDataModelObject(EObject object) {
		switch object {
			//Conceptual
			ComposableElement,
			Query: {
				val name = translateName(object)
				'''
					«translateDescription(object)»
					data «name»
						properties
							FACE::Realization_Tier => conceptual;
							«translateUUID(object)»
					end «name»;
				'''
			}
			CompositeQuery: {
				val name = translateName(object)
				'''
					«translateDescription(object)»
					data «name»
						properties
							«IF object.isUnion»
							FACE::Is_Union => true;
							«ENDIF»
							FACE::Realization_Tier => conceptual;
							«translateUUID(object)»
					end «name»;
					
					data implementation «name».impl
						subcomponents
							«FOR composition : object.composition»
							«translateQueryComposition(composition)»
							«ENDFOR»
					end «name».impl;
				'''
			}
			
			//Logical
			Entity: {
				val name = translateName(object)
				'''
					«translateDescription(object)»
					data «name» extends «translateName(object.realizes)»
						properties
							FACE::Realization_Tier => logical;
							«translateUUID(object)»
					end «name»;
				'''
			}
			face.datamodel.logical.Query: {
				val name = translateName(object)
				'''
					«translateDescription(object)»
					data «name»«IF object.realizes !== null» extends «translateName(object.realizes)»«ENDIF»
						properties
							FACE::Realization_Tier => logical;
							«translateUUID(object)»
					end «name»;
				'''
			}
			face.datamodel.logical.CompositeQuery: {
				val name = translateName(object)
				'''
					«translateDescription(object)»
					data «name»«IF object.realizes !== null» extends «translateName(object.realizes)»«ENDIF»
						properties
							«IF object.isUnion»
							FACE::Is_Union => true;
							«ENDIF»
							FACE::Realization_Tier => logical;
							«translateUUID(object)»
					end «name»;
					
					data implementation «name».impl
						subcomponents
							«FOR composition : object.composition»
							«translateQueryComposition(composition)»
							«ENDFOR»
					end «name».impl;
				'''
			}
			
			//Platform
			PhysicalDataType: {
				val name = translateName(object)
				'''
					«translateDescription(object)»
					data «name»
						properties
							FACE::Realization_Tier => platform;
							«translateUUID(object)»
					end «name»;
				'''
			}
			face.datamodel.platform.Entity: {
				val name = translateName(object)
				'''
					«translateDescription(object)»
					data «name» «translateExtends(object.realizes)»
						properties
							FACE::Realization_Tier => platform;
							«translateUUID(object)»
					end «name»;
				'''
			}
			Template: {
				val name = translateName(object)
				val realizes = object.boundQuery?.realizes
				'''
					«translateDescription(object)»
					data «name»«IF realizes !== null» «translateExtends(realizes)»«ENDIF»
						properties
							FACE::Realization_Tier => platform;
							«translateUUID(object)»
					end «name»;
				'''
			}
			CompositeTemplate: {
				val name = translateName(object)
				'''
					«translateDescription(object)»
					data «name»«IF object.realizes !== null» «translateExtends(object.realizes)»«ENDIF»
						properties
							«IF object.isUnion»
							FACE::Is_Union => true;
							«ENDIF»
							FACE::Realization_Tier => platform;
							«translateUUID(object)»
					end «name»;
					
					data implementation «name».impl
						subcomponents
							«FOR composition : object.composition»
							«translateTemplateComposition(composition)»
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
	
	def private String translateQueryComposition(face.datamodel.logical.QueryComposition composition) {
		val viewReference = translateViewReference(composition.type)
		val uuid = translateUUID(composition)
		
		'''
			«sanitizeID(composition.rolename)»: data «viewReference»«IF !uuid.empty» {
				«uuid»
			}«ENDIF»;'''
	}
	
	def private String translateTemplateComposition(TemplateComposition composition) {
		val viewReference = translateViewReference(composition.type)
		val uuid = translateUUID(composition)
		
		'''
			«sanitizeID(composition.rolename)»: data «viewReference»«IF !uuid.empty» {
				«uuid»
			}«ENDIF»;'''
	}
	
	def private String translateExtends(face.datamodel.logical.Element extendedElement) {
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
	
	def private String translateViewReference(face.datamodel.logical.View view) {
		'''«translateName(view)»«IF view instanceof face.datamodel.logical.CompositeQuery».impl«ENDIF»'''
	}
	
	def private String translateViewReference(face.datamodel.platform.View view) {
		'''«translateName(view)»«IF view instanceof CompositeTemplate».impl«ENDIF»'''
	}
}