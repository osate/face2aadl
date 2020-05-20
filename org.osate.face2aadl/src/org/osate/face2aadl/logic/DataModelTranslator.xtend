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
											«val type = (member.type as ReferencedType).type»
											«if (type.eIsProxy) throw new UnsupportedOperationException("Proxy found")»
											«FOR memberName : member.names»
											«sanitizeID(memberName)»: data «sanitizeID(type.name)»_Platform.impl;
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
									SignedLongInt: throw new UnsupportedOperationException(lookupName.toString("::") + " is a SignedLongInt")
									SignedLongLongInt: throw new UnsupportedOperationException(lookupName.toString("::") + " is a SignedLongLongInt")
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
									UnsignedLongLongInt: throw new UnsupportedOperationException(lookupName.toString("::") + " is a UnsignedLongLongInt")
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
									LongDoubleType: throw new UnsupportedOperationException(lookupName.toString("::") + " is a LongDoubleType")
									CharType: throw new UnsupportedOperationException(lookupName.toString("::") + " is a CharType")
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
									OctetType: throw new UnsupportedOperationException(lookupName.toString("::") + " is a OctetType")
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
									FixedPtType: throw new UnsupportedOperationException(lookupName.toString("::") + " is a FixedPtType")
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
	
	def private String translateMember(Member member, String memberName, ArchitectureModel architectureModel, Set<Struct> idlOnlyStructs, QualifiedName lookupName) {
		val type = (member.type as ReferencedType).type
		if (type.eIsProxy) {
			throw new UnsupportedOperationException("Proxy found")
		}
		if (type instanceof Typedef) {
			val typedefType = type.type
			if (type.names.head.arraySizes.size == 1) {
				val arrayType = (typedefType as ReferencedType).type
				if (arrayType.eIsProxy) {
					throw new UnsupportedOperationException("Proxy found")
				}
				'''«sanitizeID(memberName)»: data «sanitizeID(arrayType.name)»_Platform.impl[«type.names.head.arraySizes.head»];'''
			} else if (type.names.head.arraySizes.size > 1) {
				throw new UnsupportedOperationException(lookupName.toString("::") + "." + memberName + " is a multi-dimensional array")
			} else {
				if (typedefType instanceof BoundedSequence) {
					val sequenceType = (typedefType.type as ReferencedType).type
					if (sequenceType.eIsProxy) {
						throw new UnsupportedOperationException("Proxy found")
					}
					if (sequenceType instanceof Struct) {
						val structName = sequenceType.name
						if (architectureModel.eAllContents.filter(face.Element).filter[it instanceof PhysicalDataType || it instanceof View].exists[it.name == structName]) {
							'''«sanitizeID(memberName)»: data «sanitizeID(structName)»_Platform.impl[«typedefType.size»];'''
						} else {
							idlOnlyStructs += sequenceType
							'''«sanitizeID(memberName)»: data «sanitizeID(idlNameProvider.getFullyQualifiedName(sequenceType).toString("_"))»_IDL.impl[«typedefType.size»];'''
						}
					} else {
						'''«sanitizeID(memberName)»: data «sanitizeID(sequenceType.name)»_Platform.impl[«typedefType.size»];'''
					}
				} else if (typedefType instanceof UnboundedSequence) {
					throw new UnsupportedOperationException(lookupName.toString("::") + "." + memberName + " is an UnboundedSequence")
				} else {
					'''«sanitizeID(memberName)»: data «sanitizeID(type.name)»_Platform.impl;'''
				}
			}
		} else {
			if (type instanceof Struct) {
				val structName = type.name
				if (architectureModel.eAllContents.filter(face.Element).filter[it instanceof PhysicalDataType || it instanceof View].exists[it.name == structName]) {
					'''«sanitizeID(memberName)»: data «sanitizeID(type.name)»_Platform.impl;'''
				} else {
					idlOnlyStructs += type
					'''«sanitizeID(memberName)»: data «sanitizeID(idlNameProvider.getFullyQualifiedName(type).toString("_"))»_IDL.impl;'''
				}
			} else {
				'''«sanitizeID(memberName)»: data «sanitizeID(type.name)»_Platform.impl;'''
			}
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
	
	//TODO Handle cycles
	def private Definition followReferences(Definition object) {
		if (object instanceof Typedef) {
			val type = object.type
			if (type instanceof ReferencedType) {
				if (type.type.eIsProxy) {
					throw new UnsupportedOperationException("Found a proxy")
				} else {
					followReferences(type.type)
				}
			} else {
				object
			}
		} else {
			object
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
«««											«val type = (member.type as ReferencedType).type»
«««											«if (type.eIsProxy) throw new UnsupportedOperationException("Proxy found")»
											«FOR memberName : member.names»
«««											«IF type instanceof Typedef»
«««											«val typedefType = type.type»
«««											«IF typedefType instanceof BoundedSequence»
«««											«val sequenceType = (typedefType.type as ReferencedType).type»
«««											«if (sequenceType.eIsProxy) throw new UnsupportedOperationException("Proxy found")»
«««											«IF sequenceType instanceof Struct»
«««											«val structName = sequenceType.name»
«««											«IF view.getContainerOfType(ArchitectureModel).eAllContents.filter(face.Element).filter[it instanceof PhysicalDataType || it instanceof View].exists[it.name == structName]»
«««											«sanitizeID(memberName)»: data «sanitizeID(structName)»_Platform.impl[«typedefType.size»];
«««											«ELSE»
«««											«val unused = idlOnlyStructs += sequenceType»
«««											«sanitizeID(memberName)»: data «sanitizeID(idlNameProvider.getFullyQualifiedName(sequenceType).toString("_"))»_IDL.impl[«typedefType.size»];
«««											«ENDIF»
«««											«ELSE»
«««											«sanitizeID(memberName)»: data «sanitizeID(sequenceType.name)»_Platform.impl[«typedefType.size»];
«««											«ENDIF»
«««											«ELSE»
«««											«if (typedefType instanceof UnboundedSequence) throw new UnsupportedOperationException(lookupName.toString("::") + "." + memberName + " is an UnboundedSequence")»
«««											«sanitizeID(memberName)»: data «sanitizeID(type.name)»_Platform.impl;
«««											«ENDIF»
«««											«ELSE»
«««											«sanitizeID(memberName)»: data «sanitizeID(type.name)»_Platform.impl;
«««											«ENDIF»
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
											«val type = (member.type as ReferencedType).type»
											«if (type.eIsProxy) throw new UnsupportedOperationException("Proxy found")»
											«FOR memberName : member.names»
											«IF type instanceof Typedef»
											«val typedefType = type.type»
											«IF typedefType instanceof BoundedSequence»
											«val sequenceType = (typedefType.type as ReferencedType).type»
											«if (sequenceType.eIsProxy) throw new UnsupportedOperationException("Proxy found")»
											«sanitizeID(memberName)»: data «sanitizeID(sequenceType.name)»_Platform.impl[«typedefType.size»];
											«ELSE»
											«if (typedefType instanceof UnboundedSequence) throw new UnsupportedOperationException(lookupName.toString("::") + "." + memberName + " is an UnboundedSequence")»
											«sanitizeID(memberName)»: data «sanitizeID(type.name)»_Platform.impl;
											«ENDIF»
											«ELSE»
											«sanitizeID(memberName)»: data «sanitizeID(type.name)»_Platform.impl;
											«ENDIF»
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