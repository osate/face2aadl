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
import face.datamodel.Element
import face.datamodel.conceptual.ComposableElement
import face.datamodel.conceptual.CompositeQuery
import face.datamodel.conceptual.Query
import face.datamodel.conceptual.QueryComposition
import face.datamodel.logical.Entity
import face.datamodel.platform.CompositeTemplate
import face.datamodel.platform.PhysicalDataType
import face.datamodel.platform.Template
import face.datamodel.platform.TemplateComposition
import face.datamodel.platform.View
import java.util.Optional
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

import static org.osate.face2aadl.logic.TranslatorUtil.sanitizeID
import static org.osate.face2aadl.logic.TranslatorUtil.translateDescription
import static org.osate.face2aadl.logic.TranslatorUtil.translateName
import static org.osate.face2aadl.logic.TranslatorUtil.translateUUID

import static extension org.eclipse.xtext.EcoreUtil2.getAllContentsOfType

@FinalFieldsConstructor
package class DataModelTranslator {
	val String faceFileName
	val String packageName
	
	def package Optional<String> translate(ArchitectureModel model, boolean platformOnly) {
		val elements = if (platformOnly) {
			model.dm.flatMap[it.pdm].flatMap[it.getAllContentsOfType(face.datamodel.platform.Element)]
		} else {
			model.dm.flatMap[it.getAllContentsOfType(Element)]
		}
		generateOutput(elements.map[translateDataModelObject(it, platformOnly)].filterNull)
	}
	
	def package Optional<String> translate(Iterable<face.datamodel.conceptual.View> conceptualViews,
		Iterable<face.datamodel.logical.View> logicalViews, Iterable<View> platformViews
	) {
		generateOutput(
			conceptualViews.map[translateView(it)] +
			logicalViews.map[translateView(it)] +
			platformViews.map[translateView(it, false)]
		)
	}
	
	def package Optional<String> translate(Iterable<View> platformViews) {
		generateOutput(platformViews.map[translateView(it, true)])
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
					with FACE;
					
					«classifiersString»
				end «packageName»;''')
		}
	}
	
	def private String translateDataModelObject(Element element, boolean platformOnly) {
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
			face.datamodel.conceptual.View: translateView(element)
			
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
			face.datamodel.logical.View: translateView(element)
			
			//Platform
			PhysicalDataType: {
				val name = translateName(element)
				'''
					«translateDescription(element)»
					data «name»
						properties
							FACE::Realization_Tier => platform;
							«translateUUID(element)»
					end «name»;
				'''
			}
			face.datamodel.platform.Entity: {
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
			View: translateView(element, platformOnly)
		}
	}
	
	def private String translateView(face.datamodel.conceptual.View view) {
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
	
	def private String translateView(face.datamodel.logical.View view) {
		switch view {
			face.datamodel.logical.Query: {
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
			face.datamodel.logical.CompositeQuery: {
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
	
	def private String translateQueryComposition(face.datamodel.logical.QueryComposition composition) {
		val viewReference = translateViewReference(composition.type)
		val uuid = translateUUID(composition)
		
		'''
			«sanitizeID(composition.rolename)»: data «viewReference»«IF !uuid.empty» {
				«uuid»
			}«ENDIF»;'''
	}
	
	def private String translateView(View view, boolean platformOnly) {
		switch view {
			Template: {
				val name = translateName(view)
				val realizes = view.boundQuery?.realizes
				'''
					«translateDescription(view)»
					data «name»«IF realizes !== null» «translateExtends(realizes, platformOnly)»«ENDIF»
						properties
							FACE::Realization_Tier => platform;
							«translateUUID(view)»
					end «name»;
					
					data implementation «name».impl
					end «name».impl;
				'''
			}
			CompositeTemplate: {
				val name = translateName(view)
				'''
					«translateDescription(view)»
					data «name»«IF view.realizes !== null» «translateExtends(view.realizes, platformOnly)»«ENDIF»
						properties
							«IF view.isUnion»
							FACE::Is_Union => true;
							«ENDIF»
							FACE::Realization_Tier => platform;
							«translateUUID(view)»
					end «name»;
					
					data implementation «name».impl
						subcomponents
							«FOR composition : view.composition»
							«translateTemplateComposition(composition)»
							«ENDFOR»
					end «name».impl;
				'''
			}
		}
	}
	
	def private String translateTemplateComposition(TemplateComposition composition) {
		val viewReference = translateViewReference(composition.type)
		val uuid = translateUUID(composition)
		
		'''
			«sanitizeID(composition.rolename)»: data «viewReference»«IF !uuid.empty» {
				«uuid»
			}«ENDIF»;'''
	}
	
	def private String translateExtends(face.datamodel.logical.Element extendedElement, boolean platformOnly) {
		val name = translateName(extendedElement)
		if (platformOnly) {
			'''--extension of «name» not translated'''
		} else {
			"extends " + name
		}
	}
	
	def private String translateViewReference(face.datamodel.conceptual.View view) {
		'''«translateName(view)»«IF view instanceof CompositeQuery».impl«ENDIF»'''
	}
	
	def private String translateViewReference(face.datamodel.logical.View view) {
		'''«translateName(view)»«IF view instanceof face.datamodel.logical.CompositeQuery».impl«ENDIF»'''
	}
	
	def private String translateViewReference(View view) {
		'''«translateName(view)».impl'''
	}
}