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
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.IResourceDescriptions
import org.eclipse.xtext.resource.IResourceDescriptionsProvider
import org.osate.simpleidl.simpleIDL.BooleanType
import org.osate.simpleidl.simpleIDL.BoundedSequence
import org.osate.simpleidl.simpleIDL.BoundedString
import org.osate.simpleidl.simpleIDL.BoundedWideString
import org.osate.simpleidl.simpleIDL.CharType
import org.osate.simpleidl.simpleIDL.Definition
import org.osate.simpleidl.simpleIDL.DoubleType
import org.osate.simpleidl.simpleIDL.Enum
import org.osate.simpleidl.simpleIDL.FixedPtType
import org.osate.simpleidl.simpleIDL.FloatType
import org.osate.simpleidl.simpleIDL.LongDoubleType
import org.osate.simpleidl.simpleIDL.Member
import org.osate.simpleidl.simpleIDL.Module
import org.osate.simpleidl.simpleIDL.OctetType
import org.osate.simpleidl.simpleIDL.ReferencedType
import org.osate.simpleidl.simpleIDL.SignedLongInt
import org.osate.simpleidl.simpleIDL.SignedLongLongInt
import org.osate.simpleidl.simpleIDL.SignedShortInt
import org.osate.simpleidl.simpleIDL.SimpleIDLPackage
import org.osate.simpleidl.simpleIDL.Struct
import org.osate.simpleidl.simpleIDL.StructForward
import org.osate.simpleidl.simpleIDL.Type
import org.osate.simpleidl.simpleIDL.Typedef
import org.osate.simpleidl.simpleIDL.UnboundedSequence
import org.osate.simpleidl.simpleIDL.UnboundedString
import org.osate.simpleidl.simpleIDL.UnboundedWideString
import org.osate.simpleidl.simpleIDL.Union
import org.osate.simpleidl.simpleIDL.UnsignedLongInt
import org.osate.simpleidl.simpleIDL.UnsignedLongLongInt
import org.osate.simpleidl.simpleIDL.UnsignedShortInt
import org.osate.simpleidl.simpleIDL.WideCharType

import static org.osate.face2aadl.logic.TranslatorUtil.sanitizeID
import static org.osate.face2aadl.logic.TranslatorUtil.translateDescription
import static org.osate.face2aadl.logic.TranslatorUtil.translateName
import static org.osate.face2aadl.logic.TranslatorUtil.translateUUID

import static extension org.eclipse.emf.ecore.util.EcoreUtil.resolve
import static extension org.eclipse.xtext.EcoreUtil2.getAllContentsOfType
import static extension org.eclipse.xtext.EcoreUtil2.getContainerOfType

package class DataModelTranslator {
	val String faceFileName
	val String packageName
	//TODO Combine into a triple
	val Optional<Pair<ResourceSet, IResourceDescriptions>> idlOption
	val IQualifiedNameProvider idlNameProvider
	
	new(String faceFileName, String packageName, Optional<Pair<Injector, ResourceSet>> idlOption) {
		this.faceFileName = faceFileName
		this.packageName = packageName
		this.idlOption = idlOption.map[pair |
			val injector = pair.key
			val resourceSet = pair.value
			resourceSet -> injector.getInstance(IResourceDescriptionsProvider).getResourceDescriptions(resourceSet)
		]
		if (idlOption.present) {
			idlNameProvider = idlOption.get.key.getInstance(IQualifiedNameProvider)
		} else {
			idlNameProvider = null
		}
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
				val idlBasedContents = idlOption.map[option |
					val resourceSet = option.key
					val descriptions = option.value
					val definitionType = SimpleIDLPackage.eINSTANCE.definition
					val dataModel = element.getContainerOfType(DataModel)
					val lookupName = QualifiedName.create("FACE", "DM", dataModel.name, element.name)
					val objects = descriptions.getExportedObjects(definitionType, lookupName, true).toList
					if (objects.size == 0) {
//						println("Could not find " + lookupName.toString("::"))
						val name = translateName(element)
						'''
							«translateDescription(element)»
							data «name»
								properties
									FACE::Realization_Tier => platform;
									«translateUUID(element)»
							end «name»;
							
							data implementation «name».impl
							end «name».impl;
						'''
					} else if (objects.size == 1) {
						val object = objects.head.EObjectOrProxy.resolve(resourceSet)
						switch object {
							Module: throw new UnsupportedOperationException(lookupName.toString("::") + " is a Module")
							Struct: {
								val name = translateName(element)
								'''
									«translateDescription(element)»
									data «name»
										properties
											FACE::Realization_Tier => platform;
											«translateUUID(element)»
									end «name»;
									
									data implementation «name».impl
										subcomponents
											«FOR member : object.members»
											«FOR memberName : member.names»
											«translateMember(member, memberName, lookupName)»
											«ENDFOR»
											«ENDFOR»
									end «name».impl;
								'''
							}
							StructForward: throw new UnsupportedOperationException(lookupName.toString("::") + " is a StructForward")
							Union: throw new UnsupportedOperationException(lookupName.toString("::") + " is a Union")
							Enum: {
								val name = translateName(element)
								'''
									«translateDescription(element)»
									data «name»
										properties
											Data_Model::Data_Representation => Enum;
											FACE::Realization_Tier => platform;
											«translateUUID(element)»
									end «name»;
									
									data implementation «name».impl
									end «name».impl;
								'''
							}
							Typedef: {
								switch type : object.type {
									SignedShortInt: {
										val name = translateName(element)
										'''
											«translateDescription(element)»
											data «name» extends Base_Types::Integer_16
												properties
													FACE::Realization_Tier => platform;
													«translateUUID(element)»
											end «name»;
											
											data implementation «name».impl
											end «name».impl;
										'''
									}
									SignedLongInt: {
										val name = translateName(element)
										'''
											«translateDescription(element)»
											data «name» extends Base_Types::Integer_32
												properties
													FACE::Realization_Tier => platform;
													«translateUUID(element)»
											end «name»;
											
											data implementation «name».impl
											end «name».impl;
										'''
									}
									SignedLongLongInt: {
										val name = translateName(element)
										'''
											«translateDescription(element)»
											data «name» extends Base_Types::Integer_64
												properties
													FACE::Realization_Tier => platform;
													«translateUUID(element)»
											end «name»;
											
											data implementation «name».impl
											end «name».impl;
										'''
									}
									UnsignedShortInt: {
										val name = translateName(element)
										'''
											«translateDescription(element)»
											data «name» extends Base_Types::Unsigned_16
												properties
													FACE::Realization_Tier => platform;
													«translateUUID(element)»
											end «name»;
											
											data implementation «name».impl
											end «name».impl;
										'''
									}
									UnsignedLongInt: {
										val name = translateName(element)
										'''
											«translateDescription(element)»
											data «name» extends Base_Types::Unsigned_32
												properties
													FACE::Realization_Tier => platform;
													«translateUUID(element)»
											end «name»;
											
											data implementation «name».impl
											end «name».impl;
										'''
									}
									UnsignedLongLongInt: {
										val name = translateName(element)
										'''
											«translateDescription(element)»
											data «name» extends Base_Types::Unsigned_64
												properties
													FACE::Realization_Tier => platform;
													«translateUUID(element)»
											end «name»;
											
											data implementation «name».impl
											end «name».impl;
										'''
									}
									FloatType: {
										val name = translateName(element)
										'''
											«translateDescription(element)»
											data «name» extends Base_Types::Float_32
												properties
													FACE::Realization_Tier => platform;
													«translateUUID(element)»
											end «name»;
											
											data implementation «name».impl
											end «name».impl;
										'''
									}
									DoubleType: {
										val name = translateName(element)
										'''
											«translateDescription(element)»
											data «name» extends Base_Types::Float_64
												properties
													FACE::Realization_Tier => platform;
													«translateUUID(element)»
											end «name»;
											
											data implementation «name».impl
											end «name».impl;
										'''
									}
									LongDoubleType: {
										val name = translateName(element)
										'''
											«translateDescription(element)»
											data «name» extends Base_Types::Float
												properties
													FACE::Realization_Tier => platform;
													«translateUUID(element)»
											end «name»;
											
											data implementation «name».impl
											end «name».impl;
										'''
									}
									CharType: {
										val name = translateName(element)
										'''
											«translateDescription(element)»
											data «name» extends Base_Types::Character
												properties
													FACE::Realization_Tier => platform;
													«translateUUID(element)»
											end «name»;
											
											data implementation «name».impl
											end «name».impl;
										'''
									}
									WideCharType: throw new UnsupportedOperationException(lookupName.toString("::") + " is a WideCharType")
									BooleanType: {
										val name = translateName(element)
										'''
											«translateDescription(element)»
											data «name» extends Base_Types::Boolean
												properties
													FACE::Realization_Tier => platform;
													«translateUUID(element)»
											end «name»;
											
											data implementation «name».impl
											end «name».impl;
										'''
									}
									OctetType: {
										val name = translateName(element)
										'''
											«translateDescription(element)»
											data «name»
												properties
													Data_Size => 8 bits;
													FACE::Realization_Tier => platform;
													«translateUUID(element)»
											end «name»;
											
											data implementation «name».impl
											end «name».impl;
										'''
									}
									ReferencedType: throw new UnsupportedOperationException(lookupName.toString("::") + " is a ReferencedType")
									BoundedSequence: throw new UnsupportedOperationException(lookupName.toString("::") + " is a BoundedSequence")
									UnboundedSequence: throw new UnsupportedOperationException(lookupName.toString("::") + " is a UnboundedSequence")
									BoundedString: {
										val name = translateName(element)
										'''
											«translateDescription(element)»
											data «name» extends Base_Types::String
												properties
													Data_Size => «type.size» Bytes;
													FACE::Realization_Tier => platform;
													«translateUUID(element)»
											end «name»;
											
											data implementation «name».impl
											end «name».impl;
										'''
									}
									UnboundedString: {
										val name = translateName(element)
										'''
											«translateDescription(element)»
											data «name» extends Base_Types::String
												properties
													FACE::Realization_Tier => platform;
													«translateUUID(element)»
											end «name»;
											
											data implementation «name».impl
											end «name».impl;
										'''
									}
									BoundedWideString: throw new UnsupportedOperationException(lookupName.toString("::") + " is a BoundedWideString")
									UnboundedWideString: throw new UnsupportedOperationException(lookupName.toString("::") + " is a UnboundedWideString")
									FixedPtType: {
										val name = translateName(element)
										'''
											«translateDescription(element)»
											data «name»
												properties
													Data_Model::Data_Representation => Fixed;
													FACE::Realization_Tier => platform;
													«translateUUID(element)»
											end «name»;
											
											data implementation «name».impl
											end «name».impl;
										'''
									}
								}
							}
						}
					} else {
						throw new AssertionError("Multiple definitions found for " + lookupName.toString("::"))
					}
				]
				idlBasedContents.orElseGet[
					val name = translateName(element)
					'''
						«translateDescription(element)»
						data «name»
							properties
								FACE::Realization_Tier => platform;
								«translateUUID(element)»
						end «name»;
						
						data implementation «name».impl
						end «name».impl;
					'''
				]
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
	
	def private getBaseTypeAndArrays(Member member, String memberName, QualifiedName lookupName) {
		switch type : followReferences(member.type) {
			Typedef: {
				switch typedefType : type.type {
					BoundedSequence: followReferences(typedefType.type) -> '''[«typedefType.size»]'''
					UnboundedSequence: followReferences(typedefType.type) -> "[]"
					case type.names.head.arraySizes.size == 1: followReferences(typedefType) -> '''[«type.names.head.arraySizes.head»]'''
					case type.names.head.arraySizes.size > 1: throw new UnsupportedOperationException('''«lookupName.toString("::")».«memberName» is a multi-dimensional array''')
					default: type -> ""
				}
			}
			default: type -> ""
		}
	}
	
	def private String translateMember(Member member, String memberName, ArchitectureModel architectureModel, Set<Struct> idlOnlyStructs, QualifiedName lookupName) {
		val baseTypeAndArrays = getBaseTypeAndArrays(member, memberName, lookupName)
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
		
		val implName = if (isIdlOnlyStruct) {
			sanitizeID(idlNameProvider.getFullyQualifiedName(baseType).toString("_")) + "_IDL.impl"
		} else {
			sanitizeID(baseType.name) + "_Platform.impl"
		}
		
		'''«sanitizeID(memberName)»: data «implName»«arrays»;'''
	}
	
	def private String translateMember(Member member, String memberName, QualifiedName lookupName) {
		val baseTypeAndArrays = getBaseTypeAndArrays(member, memberName, lookupName)
		val baseType = baseTypeAndArrays.key
		val arrays = baseTypeAndArrays.value
		
		'''«sanitizeID(memberName)»: data «sanitizeID(baseType.name)»_Platform.impl«arrays»;'''
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
	
	//TODO Handle cycles
	def private Definition followReferences(Definition object) {
		if (object.eIsProxy) {
			throw new UnsupportedOperationException("Found a proxy")
		}
		if (object instanceof Typedef) {
			val type = object.type
			if (!object.names.head.arraySizes.empty) {
				object
			} else if (type instanceof ReferencedType) {
				followReferences(type.type)
			} else {
				object
			}
		} else {
			object
		}
	}
	
	def private Definition followReferences(Type type) {
		if (type instanceof ReferencedType) {
			followReferences(type.type)
		} else {
			throw new UnsupportedOperationException("Type is not a Referencedtype")
		}
	}
	
	def private String translateView(View view, boolean platformOnly) {
		switch view {
			Template: {
				val idlBasedContents = idlOption.map[option |
					val resourceSet = option.key
					val descriptions = option.value
					val definitionType = SimpleIDLPackage.eINSTANCE.definition
					val dataModel = view.getContainerOfType(DataModel)
					val lookupName = QualifiedName.create("FACE", "DM", dataModel.name, view.name)
					val objects = descriptions.getExportedObjects(definitionType, lookupName, true).toList
					if (objects.size == 0) {
//						println("Could not find " + lookupName.toString("::"))
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
					} else if (objects.size == 1) {
						val object = followReferences(objects.head.EObjectOrProxy.resolve(resourceSet) as Definition)
						switch object {
							Module: throw new UnsupportedOperationException(lookupName.toString("::") + " is a Module")
							Struct: {
								val name = translateName(view)
								val realizes = view.boundQuery?.realizes
								val idlOnlyStructs = newLinkedHashSet
								'''
									«translateDescription(view)»
									data «name»«IF realizes !== null» «translateExtends(realizes, platformOnly)»«ENDIF»
										properties
											FACE::Realization_Tier => platform;
											«translateUUID(view)»
									end «name»;
									
									data implementation «name».impl
										subcomponents
											«FOR member : object.members»
											«FOR memberName : member.names»
											«translateMember(member, memberName, view.getContainerOfType(ArchitectureModel), idlOnlyStructs, lookupName)»
											«ENDFOR»
											«ENDFOR»
									end «name».impl;
									«FOR struct : idlOnlyStructs»
									
									«val structName = sanitizeID(idlNameProvider.getFullyQualifiedName(struct).toString("_"))»
									--Generated from «idlNameProvider.getFullyQualifiedName(struct).toString("::")»
									data «structName»_IDL
									end «structName»_IDL;
									
									data implementation «structName»_IDL.impl
										subcomponents
											«FOR member : struct.members»
											«FOR memberName : member.names»
											«translateMember(member, memberName, lookupName)»
											«ENDFOR»
											«ENDFOR»
									end «structName»_IDL.impl;
									«ENDFOR»
								'''
							}
							StructForward: throw new UnsupportedOperationException(lookupName.toString("::") + " is a StructForward")
							Union: throw new UnsupportedOperationException(lookupName.toString("::") + " is a Union")
							Enum: throw new UnsupportedOperationException(lookupName.toString("::") + " is an Enum")
							Typedef: {
								switch object.type {
									SignedShortInt: throw new UnsupportedOperationException(lookupName.toString("::") + " is a SignedShortInt")
									SignedLongInt: throw new UnsupportedOperationException(lookupName.toString("::") + " is a SignedLongInt")
									SignedLongLongInt: throw new UnsupportedOperationException(lookupName.toString("::") + " is a SignedLongLongInt")
									UnsignedShortInt: throw new UnsupportedOperationException(lookupName.toString("::") + " is an UnsignedShortInt")
									UnsignedLongInt: throw new UnsupportedOperationException(lookupName.toString("::") + " is a UnsignedLongInt")
									UnsignedLongLongInt: throw new UnsupportedOperationException(lookupName.toString("::") + " is a UnsignedLongLongInt")
									FloatType: throw new UnsupportedOperationException(lookupName.toString("::") + " is a FloatType")
									DoubleType: throw new UnsupportedOperationException(lookupName.toString("::") + " is a DoubleType")
									LongDoubleType: throw new UnsupportedOperationException(lookupName.toString("::") + " is a LongDoubleType")
									CharType: throw new UnsupportedOperationException(lookupName.toString("::") + " is a CharType")
									WideCharType: throw new UnsupportedOperationException(lookupName.toString("::") + " is a WideCharType")
									BooleanType: throw new UnsupportedOperationException(lookupName.toString("::") + " is a BooleanType")
									OctetType: throw new UnsupportedOperationException(lookupName.toString("::") + " is a OctetType")
									ReferencedType: throw new UnsupportedOperationException(lookupName.toString("::") + " is a ReferencedType")
									BoundedSequence: throw new UnsupportedOperationException(lookupName.toString("::") + " is a BoundedSequence")
									UnboundedSequence: throw new UnsupportedOperationException(lookupName.toString("::") + " is a UnboundedSequence")
									BoundedString: throw new UnsupportedOperationException(lookupName.toString("::") + " is a BoundedString")
									UnboundedString: throw new UnsupportedOperationException(lookupName.toString("::") + " is a UnboundedString")
									BoundedWideString: throw new UnsupportedOperationException(lookupName.toString("::") + " is a BoundedWideString")
									UnboundedWideString: throw new UnsupportedOperationException(lookupName.toString("::") + " is a UnboundedWideString")
									FixedPtType: throw new UnsupportedOperationException(lookupName.toString("::") + " is a FixedPtType")
								}
							}
						}
					} else {
						throw new AssertionError("Multiple definitions found for " + lookupName.toString("::"))
					}
				]
				idlBasedContents.orElseGet[
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
				]
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
	
	def private String getName(Definition definition) {
		switch definition {
			Module: definition.name
			Struct: definition.name
			Union: definition.name
			Enum: definition.name
			Typedef: definition.names.head.name
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