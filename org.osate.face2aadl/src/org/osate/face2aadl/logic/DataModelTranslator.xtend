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

import com.google.inject.Injector
import face.ArchitectureModel
import face.datamodel.DataModel
import face.datamodel.Element
import face.datamodel.PlatformDataModel
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
import java.util.Set
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.IResourceDescriptions
import org.eclipse.xtext.resource.IResourceDescriptionsProvider
import org.eclipse.xtext.util.Triple
import org.eclipse.xtext.util.Tuples
import org.osate.simpleidl.simpleIDL.ArrayType
import org.osate.simpleidl.simpleIDL.BooleanType
import org.osate.simpleidl.simpleIDL.BoundedSequence
import org.osate.simpleidl.simpleIDL.BoundedString
import org.osate.simpleidl.simpleIDL.CharType
import org.osate.simpleidl.simpleIDL.DoubleType
import org.osate.simpleidl.simpleIDL.Enum
import org.osate.simpleidl.simpleIDL.FixedPtType
import org.osate.simpleidl.simpleIDL.FloatType
import org.osate.simpleidl.simpleIDL.LongDoubleType
import org.osate.simpleidl.simpleIDL.Member
import org.osate.simpleidl.simpleIDL.NamedDefinition
import org.osate.simpleidl.simpleIDL.OctetType
import org.osate.simpleidl.simpleIDL.ReferencedType
import org.osate.simpleidl.simpleIDL.SignedLongInt
import org.osate.simpleidl.simpleIDL.SignedLongLongInt
import org.osate.simpleidl.simpleIDL.SignedShortInt
import org.osate.simpleidl.simpleIDL.SimpleIDLPackage
import org.osate.simpleidl.simpleIDL.Struct
import org.osate.simpleidl.simpleIDL.UnboundedSequence
import org.osate.simpleidl.simpleIDL.UnboundedString
import org.osate.simpleidl.simpleIDL.UnsignedLongInt
import org.osate.simpleidl.simpleIDL.UnsignedLongLongInt
import org.osate.simpleidl.simpleIDL.UnsignedShortInt

import static org.osate.face2aadl.logic.TranslatorUtil.sanitizeID
import static org.osate.face2aadl.logic.TranslatorUtil.translateDescription
import static org.osate.face2aadl.logic.TranslatorUtil.translateName
import static org.osate.face2aadl.logic.TranslatorUtil.translateUUID

import static extension org.eclipse.emf.ecore.util.EcoreUtil.resolve
import static extension org.eclipse.xtext.EcoreUtil2.getAllContentsOfType
import static extension org.eclipse.xtext.EcoreUtil2.getContainerOfType

package class DataModelTranslator {
	val static EClass NAMED_DEFINITION_TYPE = SimpleIDLPackage.eINSTANCE.namedDefinition
	
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
				
				val idlContents = idlOption.map[option |
					val resourceSet = option.first
					val descriptions = option.second
					val dataModel = element.getContainerOfType(DataModel)
					val lookupName = QualifiedName.create("FACE", "DM", dataModel.name, element.name)
					val lookupObject = descriptions.getExportedObjects(NAMED_DEFINITION_TYPE, lookupName, true).head
					val resolved = if (lookupObject !== null) {
						followReferences(lookupObject.EObjectOrProxy.resolve(resourceSet) as NamedDefinition)
					}
					val typeExtension = switch resolved {
						SignedShortInt: " extends Base_Types::Integer_16"
						SignedLongInt: " extends Base_Types::Integer_32"
						SignedLongLongInt: " extends Base_Types::Integer_64"
						UnsignedShortInt: " extends Base_Types::Unsigned_16"
						UnsignedLongInt: " extends Base_Types::Unsigned_32"
						UnsignedLongLongInt: " extends Base_Types::Unsigned_64"
						FloatType: " extends Base_Types::Float_32"
						DoubleType: " extends Base_Types::Float_64"
						LongDoubleType: " extends Base_Types::Float"
						CharType: " extends Base_Types::Character"
						BooleanType: " extends Base_Types::Boolean"
						BoundedString,
						UnboundedString: " extends Base_Types::String"
					}
					val dataProperty = switch resolved {
						Enum: "Data_Model::Data_Representation => Enum;"
						OctetType: "Data_Size => 8 bits;"
						BoundedString: '''Data_Size => «resolved.size» Bytes;'''
						FixedPtType: "Data_Model::Data_Representation => Fixed;"
					}
					val subcomponents = if (resolved instanceof Struct) {
						'''
							subcomponents
								«FOR member : resolved.members»
								«translateMember(member)»
								«ENDFOR»
						'''
					}
					Tuples.create(typeExtension, dataProperty, subcomponents)
				].orElse(Tuples.create(null, null, null))
				val typeExtension = idlContents.first
				val dataProperty = idlContents.second
				val subcomponents = idlContents.third
				
				
				'''
					«translateDescription(element)»
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
				
				val subcomponentsAndAdditionalComponents = idlOption.map[option |
					val resourceSet = option.first
					val descriptions = option.second
					val idlNameProvider = option.third
					val dataModel = view.getContainerOfType(DataModel)
					val lookupName = QualifiedName.create("FACE", "DM", dataModel.name, view.name)
					val lookupObject = descriptions.getExportedObjects(NAMED_DEFINITION_TYPE, lookupName, true).head
					val resolved = if (lookupObject !== null) {
						followReferences(lookupObject.EObjectOrProxy.resolve(resourceSet) as NamedDefinition)
					}
					if (resolved instanceof Struct) {
						val architectureModel = view.getContainerOfType(ArchitectureModel)
						val idlOnlyStructs = <Struct>newLinkedHashSet
						val subcomponents = '''
							subcomponents
								«FOR member : resolved.members»
								«translateMember(member, architectureModel, idlNameProvider, idlOnlyStructs)»
								«ENDFOR»
						'''
						val additionalComponents = '''
							«FOR struct : idlOnlyStructs»
							
							«val qualifiedName = idlNameProvider.getFullyQualifiedName(struct)»
							«val structName = sanitizeID(qualifiedName.toString("_")) + "_IDL"»
							--Generated from «qualifiedName.toString("::")»
							data «structName»
							end «structName»;
							
							data implementation «structName».impl
								subcomponents
									«FOR member : struct.members»
									«translateMember(member)»
									«ENDFOR»
							end «structName».impl;
							«ENDFOR»
						'''
						subcomponents -> additionalComponents
					} else {
						null -> null
					}
				].orElse(null -> null)
				val subcomponents = subcomponentsAndAdditionalComponents.key
				val additionalComponents = subcomponentsAndAdditionalComponents.value
				
				'''
					«translateDescription(view)»
					data «name»«IF realizes !== null» «translateExtends(realizes, platformOnly)»«ENDIF»
						properties
							FACE::Realization_Tier => platform;
							«translateUUID(view)»
					end «name»;
					
					data implementation «name».impl
						«subcomponents»
					end «name».impl;
					«additionalComponents»
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
	
	def private NamedDefinition followReferences(NamedDefinition definition) {
		var current = definition
		val visited = <NamedDefinition>newHashSet
		
		while (current instanceof ReferencedType && !visited.contains(current)) {
			visited += current
			current = (current as ReferencedType).type
		}
		
		if (visited.contains(current) || current.eIsProxy) {
			null
		} else {
			current
		}
	}
	
	def private String translateMember(
		Member member,
		ArchitectureModel architectureModel,
		IQualifiedNameProvider idlNameProvider,
		Set<Struct> idlOnlyStructs
	) {
		val baseTypeAndArrays = getBaseTypeAndArrays(member)
		val baseType = baseTypeAndArrays.key
		val arrays = baseTypeAndArrays.value
		
		val isIdlOnlyStruct = baseType instanceof Struct && {
			val treeIterator = architectureModel.eAllContents
			val filtered = treeIterator.filter[
				if (!(it instanceof ArchitectureModel || it instanceof DataModel || it instanceof PlatformDataModel)) {
					treeIterator.prune
				}
				it instanceof PhysicalDataType || it instanceof View
			]
			!filtered.exists[(it as face.Element).name == baseType.name]
		}
		if (isIdlOnlyStruct) {
			idlOnlyStructs += baseType as Struct
		}
		
		val implName = if (baseType === null) {
			null
		} else if (isIdlOnlyStruct) {
			''' «sanitizeID(idlNameProvider.getFullyQualifiedName(baseType).toString("_"))»_IDL.impl'''
		} else {
			''' «sanitizeID(baseType.name)»_Platform.impl'''
		}
		
		'''«sanitizeID(member.name)»: data«implName»«arrays»;'''
	}
	
	def private String translateMember(Member member) {
		val baseTypeAndArrays = getBaseTypeAndArrays(member)
		val baseType = baseTypeAndArrays.key
		val arrays = baseTypeAndArrays.value
		
		val implName = if (baseType !== null) {
			''' «sanitizeID(baseType.name)»_Platform.impl'''
		}
		
		'''«sanitizeID(member.name)»: data«implName»«arrays»;'''
	}
	
	def private Pair<NamedDefinition, String> getBaseTypeAndArrays(Member member) {
		switch type : followReferences(member.type) {
			BoundedSequence: followReferences(type.type) -> '''[«type.size»]'''
			UnboundedSequence: followReferences(type.type) -> "[]"
			ArrayType: followReferences(type.type) -> '''[«type.size»]'''
			default: type -> ""
		}
	}
}