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
import java.util.List
import java.util.Optional
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.osate.datamodel10.logical.CompositeQuery
import org.osate.datamodel10.logical.Query
import org.osate.datamodel10.logical.View
import org.osate.face2aadl.common.TranslatedPackage
import org.osate.face31.ArchitectureModel
import org.osate.face31.integration.IntegrationContext
import org.osate.face31.integration.IntegrationModel
import org.osate.face31.integration.UoPInstance
import org.osate.face31.uop.ClientServerConnection
import org.osate.face31.uop.CompositeTemplate
import org.osate.face31.uop.MessageType
import org.osate.face31.uop.PlatformSpecificComponent
import org.osate.face31.uop.PortableComponent
import org.osate.face31.uop.PubSubConnection
import org.osate.face31.uop.Template
import org.osate.face31.uop.UnitOfPortability

import static org.osate.face2aadl.common.TranslatorCommonUtil.removeExtension
import static org.osate.face2aadl.common.TranslatorCommonUtil.sanitizeID

import static extension org.eclipse.xtext.EcoreUtil2.getAllContentsOfType

class ArchitectureModelTranslator {
	val String faceFileName
	
	val String dataModelPackageName
	val String psssPackageName
	val String pcsPackageName
	val String integrationModelPackageName
	
	val boolean createFlows
	val Optional<Pair<Injector, ResourceSet>> idlOption
	
	val TranslationInput translationInput
	
	private new(String faceFileName, boolean createFlows, Optional<Pair<Injector, ResourceSet>> idlOption,
		TranslationInput translationInput
	) {
		this.faceFileName = faceFileName
		
		val baseFileName = sanitizeID(removeExtension(faceFileName))
		dataModelPackageName = baseFileName + "_data_model"
		psssPackageName = baseFileName + "_PSSS"
		pcsPackageName = baseFileName + "_PCS"
		integrationModelPackageName = baseFileName + "_integration_model"
		
		this.createFlows = createFlows
		this.idlOption = idlOption
		
		this.translationInput = translationInput
	}
	
	def static ArchitectureModelTranslator create(ArchitectureModel model, String faceFileName, boolean platformOnly,
		boolean createFlows, Optional<Pair<Injector, ResourceSet>> idlOption
	) {
		new ArchitectureModelTranslator(faceFileName, createFlows, idlOption, new WholeModel(model, platformOnly))
	}
	
	def static ArchitectureModelTranslator create(ArchitectureModel model, Iterable<UnitOfPortability> selectedUoPs,
		Iterable<IntegrationModel> selectedIntegrationModels, String faceFileName, boolean platformOnly,
		boolean createFlows, Optional<Pair<Injector, ResourceSet>> idlOption
	) {
		val requiredIntegrationModels = selectedIntegrationModels.toSet
		val orderedIntegrationModels = requiredIntegrationModels.sort(model, IntegrationModel)
		
		val requiredUoPs = calculateRequiredUoPs(selectedUoPs, requiredIntegrationModels)
		val uops = requiredUoPs.sort(model, UnitOfPortability)
		val orderedPsssUoPs = uops.filter(PlatformSpecificComponent).toList
		val orderedPcsUoPs = uops.filter(PortableComponent).toList
		
		val requiredMessageTypes = calculateRequiredMessageTypes(requiredIntegrationModels, requiredUoPs)
		val orderedMessageTypes = requiredMessageTypes.sort(model, MessageType)
		
		val translationInput = if (platformOnly) {
			new FilteredPlatformOnly(orderedMessageTypes, orderedPsssUoPs, orderedPcsUoPs, orderedIntegrationModels)
		} else {
			val requiredLogicalViews = calculateRequiredLogicalViews(requiredMessageTypes)
			val orderedLogicalViews = requiredLogicalViews.sort(model, View)
			
			val requiredConceptualViews = calculateRequiredConceptualViews(requiredLogicalViews)
			val orderedConceptualViews = requiredConceptualViews.sort(model, org.osate.datamodel10.conceptual.View)
			
			new FilteredAllLevels(orderedConceptualViews, orderedLogicalViews, orderedMessageTypes, orderedPsssUoPs,
				orderedPcsUoPs, orderedIntegrationModels
			)
		}
		
		new ArchitectureModelTranslator(faceFileName, createFlows, idlOption, translationInput)
	}
	
	def TranslatedPackage translateDataModel() {
		val dataModelTranslator = new DataModelTranslator(faceFileName, dataModelPackageName, idlOption)
		//TODO modify to handle different translation inputs.
		val result = switch translationInput {
			WholeModel: dataModelTranslator.translate(translationInput.model, translationInput.platformOnly)
			FilteredAllLevels: dataModelTranslator.translate(translationInput.conceptualViews,
				translationInput.logicalViews, translationInput.messageTypes
			)
			FilteredPlatformOnly: dataModelTranslator.translate(translationInput.messageTypes)
		}
		new TranslatedPackage(dataModelPackageName, result)
	}
	
	def TranslatedPackage translatePSSS() {
		val psssTranslator = new UoPTranslator(faceFileName, psssPackageName, dataModelPackageName)
		val result = switch translationInput {
			WholeModel: psssTranslator.translate(translationInput.model, PlatformSpecificComponent, createFlows)
			Filtered: psssTranslator.translate(translationInput.psssUoPs, createFlows)
		}
		new TranslatedPackage(psssPackageName, result)
	}
	
	def TranslatedPackage translatePCS() {
		val pcsTranslator = new UoPTranslator(faceFileName, pcsPackageName, dataModelPackageName)
		val result = switch translationInput {
			WholeModel: pcsTranslator.translate(translationInput.model, PortableComponent, createFlows)
			Filtered: pcsTranslator.translate(translationInput.pcsUoPs, createFlows)
		}
		new TranslatedPackage(pcsPackageName, result)
	}
	
	def TranslatedPackage translateIntegrationModel() {
		val integrationModelTranslator = new IntegrationModelTranslator(faceFileName, integrationModelPackageName,
			dataModelPackageName, psssPackageName, pcsPackageName
		)
		val result = switch translationInput {
			WholeModel: integrationModelTranslator.translate(translationInput.model)
			Filtered: integrationModelTranslator.translate(translationInput.integrationModels)
		}
		new TranslatedPackage(integrationModelPackageName, result)
	}
	
	def private static <T extends EObject> List<T> sort(Set<T> elements, ArchitectureModel model, Class<T> type) {
		model.getAllContentsOfType(type).filter[elements.contains(it)].toList
	}
	
	def private static Set<org.osate.datamodel10.conceptual.View> calculateRequiredConceptualViews(
		Set<View> logicalViews
	) {
		val requiredConceptualViews = (
			logicalViews.filter(Query).map[it.realizes] +
			logicalViews.filter(CompositeQuery).map[it.realizes]
		).filterNull.toSet
		val compositeQueries = requiredConceptualViews.filter(org.osate.datamodel10.conceptual.CompositeQuery).toList
		compositeQueries.forEach[addAllMembers(it, requiredConceptualViews)]
		requiredConceptualViews
	}
	
	def private static void addAllMembers(org.osate.datamodel10.conceptual.CompositeQuery compositeQuery,
		Set<org.osate.datamodel10.conceptual.View> requiredConceptualViews
	) {
		val unvisited = compositeQuery.composition.map[it.type].filter[!requiredConceptualViews.contains(it)].toList
		requiredConceptualViews += unvisited
		unvisited.filter(org.osate.datamodel10.conceptual.CompositeQuery).forEach[
			addAllMembers(it, requiredConceptualViews)
		]
	}
	
	def private static Set<View> calculateRequiredLogicalViews(Set<MessageType> messageTypes) {
		val requiredLogicalViews = (
			messageTypes.filter(Template).map[it.boundQuery?.realizes] +
			messageTypes.filter(CompositeTemplate).map[it.realizes]
		).filterNull.toSet
		requiredLogicalViews.filter(CompositeQuery).toList.forEach[addAllMembers(it, requiredLogicalViews)]
		requiredLogicalViews
	}
	
	def private static void addAllMembers(CompositeQuery compositeQuery, Set<View> requiredLogicalViews) {
		val unvisited = compositeQuery.composition.map[it.type].filter[!requiredLogicalViews.contains(it)].toList
		requiredLogicalViews += unvisited
		unvisited.filter(CompositeQuery).forEach[addAllMembers(it, requiredLogicalViews)]
	}
	
	def private static Set<MessageType> calculateRequiredMessageTypes(Set<IntegrationModel> integrationModels,
		Set<UnitOfPortability> uops
	) {
		val integrationContexts = integrationModels.flatMap[it.element].filter(IntegrationContext)
		val transportNodes = integrationContexts.flatMap[it.node].toList
		val connections = uops.flatMap[it.connection].toList
		val clientServerConnections = connections.filter(ClientServerConnection).toList
		val requiredMessageTypes = (
			transportNodes.flatMap[it.inPort].map[it.view] +
			transportNodes.map[it.outPort].filterNull.map[it.view] +
			clientServerConnections.map[it.requestType] +
			clientServerConnections.map[it.responseType] +
			connections.filter(PubSubConnection).map[it.messageType]
		).toSet
		requiredMessageTypes.filter(CompositeTemplate).toList.forEach[addAllMembers(it, requiredMessageTypes)]
		requiredMessageTypes
	}
	
	def private static void addAllMembers(CompositeTemplate compositeTemplate, Set<MessageType> requiredMessageTypes) {
		val unvisited = compositeTemplate.composition.map[it.type].filter[!requiredMessageTypes.contains(it)].toList
		requiredMessageTypes += unvisited
		unvisited.filter(CompositeTemplate).forEach[addAllMembers(it, requiredMessageTypes)]
	}
	
	def private static Set<UnitOfPortability> calculateRequiredUoPs(Iterable<UnitOfPortability> uops,
		Set<IntegrationModel> integrationModels
	) {
		(uops + integrationModels.flatMap[it.element].filter(UoPInstance).map[it.realizes]).toSet
	}
	
	private interface TranslationInput {}
	
	@FinalFieldsConstructor
	private static class WholeModel implements TranslationInput {
		val public ArchitectureModel model
		val public boolean platformOnly
	}
	
	@FinalFieldsConstructor
	private static abstract class Filtered implements TranslationInput {
		val public List<MessageType> messageTypes
		val public List<PlatformSpecificComponent> psssUoPs
		val public List<PortableComponent> pcsUoPs
		val public List<IntegrationModel> integrationModels
	}
	
	private static class FilteredAllLevels extends Filtered {
		val public List<org.osate.datamodel10.conceptual.View> conceptualViews
		val public List<View> logicalViews
		
		new(List<org.osate.datamodel10.conceptual.View> conceptualViews, List<View> logicalViews,
			List<MessageType> messageTypes, List<PlatformSpecificComponent> psssUoPs, List<PortableComponent> pcsUoPs,
			List<IntegrationModel> integrationModels
		) {
			super(messageTypes, psssUoPs, pcsUoPs, integrationModels)
			this.conceptualViews = conceptualViews
			this.logicalViews = logicalViews
		}
	}
	
	@FinalFieldsConstructor
	private static class FilteredPlatformOnly extends Filtered {}
}