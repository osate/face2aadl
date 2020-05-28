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
package org.osate.simpleidl.linking

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.linking.impl.DefaultLinkingService
import org.eclipse.xtext.linking.impl.IllegalNodeException
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.resource.IResourceDescriptionsProvider
import org.osate.simpleidl.simpleIDL.Module
import org.osate.simpleidl.simpleIDL.SimpleIDLPackage

import static extension java.util.Collections.singletonList
import static extension org.eclipse.xtext.EcoreUtil2.getContainerOfType

class SimpleIDLLinkingService extends DefaultLinkingService {
	val extension SimpleIDLPackage = SimpleIDLPackage.eINSTANCE
	
	@Inject
	IResourceDescriptionsProvider descriptionsProvider
	@Inject
	IQualifiedNameConverter nameConverter
	@Inject
	IQualifiedNameProvider nameProvider
	
	override getLinkedObjects(EObject context, EReference ref, INode node) throws IllegalNodeException {
		val crossRefString = getCrossRefNodeAsString(node).replaceAll("\\s", "")
		val result = if (!crossRefString.nullOrEmpty) {
			val descriptions = descriptionsProvider.getResourceDescriptions(context.eResource.resourceSet)
			switch ref {
				case structForward_Struct: {
					val module = context.getContainerOfType(Module)
					val lookupName = nameProvider.getFullyQualifiedName(module).append(crossRefString)
					descriptions.getExportedObjects(struct, lookupName, true).head
				}
				case arrayType_Type,
				case member_Type,
				case case_Type,
				case referencedType_Type,
				case boundedSequence_Type,
				case unboundedSequence_Type: {
					if (crossRefString.startsWith("::")) {
						val lookupName = nameConverter.toQualifiedName(crossRefString.substring(2))
						descriptions.getExportedObjects(definition, lookupName, true).head
					} else {
						val crossRef = nameConverter.toQualifiedName(crossRefString)
						val lookupNames = newArrayList
						var module = context.getContainerOfType(Module)
						while (module !== null) {
							lookupNames += nameProvider.getFullyQualifiedName(module).append(crossRef)
							module = module.eContainer.getContainerOfType(Module)
						}
						lookupNames += crossRef
						lookupNames.flatMap[descriptions.getExportedObjects(definition, it, true)].head
					}
				}
				default: null
			}
		} else {
			null
		}
		result?.EObjectOrProxy?.singletonList ?: emptyList
	}
}