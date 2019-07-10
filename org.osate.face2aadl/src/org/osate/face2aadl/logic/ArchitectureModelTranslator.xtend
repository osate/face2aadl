package org.osate.face2aadl.logic

import face.ArchitectureModel
import face.Element
import face.datamodel.logical.CompositeQuery
import face.datamodel.logical.Query
import face.datamodel.logical.View
import face.datamodel.platform.CompositeTemplate
import face.datamodel.platform.Template
import face.integration.IntegrationContext
import face.integration.IntegrationModel
import face.integration.UoPInstance
import face.uop.ClientServerConnection
import face.uop.PlatformSpecificComponent
import face.uop.PortableComponent
import face.uop.PubSubConnection
import face.uop.UnitOfPortability
import java.util.List
import java.util.Optional
import java.util.Set
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

import static org.osate.face2aadl.logic.TranslatorUtil.sanitizeID

import static extension org.eclipse.xtext.EcoreUtil2.getAllContentsOfType

class ArchitectureModelTranslator {
	val String faceFileName
	val String timestamp
	
	val String dataModelPackageName
	val String psssPackageName
	val String pcsPackageName
	val String integrationModelPackageName
	
	val TranslationInput translationInput
	
	private new(String faceFileName, String timestamp, TranslationInput translationInput) {
		this.faceFileName = faceFileName
		this.timestamp = timestamp
		
		val baseFileName = sanitizeID(removeExtension(faceFileName))
		dataModelPackageName = baseFileName + "_data_model"
		psssPackageName = baseFileName + "_PSSS"
		pcsPackageName = baseFileName + "_PCS"
		integrationModelPackageName = baseFileName + "_integration_model"
		
		this.translationInput = translationInput
	}
	
	def static ArchitectureModelTranslator create(ArchitectureModel model, String faceFileName, String timestamp,
		boolean platformOnly
	) {
		new ArchitectureModelTranslator(faceFileName, timestamp, new WholeModel(model, platformOnly))
	}
	
	def static ArchitectureModelTranslator create(ArchitectureModel model, Iterable<UnitOfPortability> selectedUoPs,
		Iterable<IntegrationModel> selectedIntegrationModels, String faceFileName, String timestamp,
		boolean platformOnly
	) {
		val requiredIntegrationModels = selectedIntegrationModels.toSet
		val orderedIntegrationModels = requiredIntegrationModels.sort(model, IntegrationModel)
		
		val requiredUoPs = calculateRequiredUoPs(selectedUoPs, requiredIntegrationModels)
		val uops = requiredUoPs.sort(model, UnitOfPortability)
		val orderedPsssUoPs = uops.filter(PlatformSpecificComponent).toList
		val orderedPcsUoPs = uops.filter(PortableComponent).toList
		
		val requiredPlatformViews = calculateRequiredPlatformViews(requiredIntegrationModels, requiredUoPs)
		val orderedPlatformViews = requiredPlatformViews.sort(model, face.datamodel.platform.View)
		
		val translationInput = if (platformOnly) {
			new FilteredPlatformOnly(orderedPlatformViews, orderedPsssUoPs, orderedPcsUoPs, orderedIntegrationModels)
		} else {
			val requiredLogicalViews = calculateRequiredLogicalViews(requiredPlatformViews)
			val orderedLogicalViews = requiredLogicalViews.sort(model, View)
			
			val requiredConceptualViews = calculateRequiredConceptualViews(requiredLogicalViews)
			val orderedConceptualViews = requiredConceptualViews.sort(model, face.datamodel.conceptual.View)
			
			new FilteredAllLevels(orderedConceptualViews, orderedLogicalViews, orderedPlatformViews, orderedPsssUoPs,
				orderedPcsUoPs, orderedIntegrationModels
			)
		}
		
		new ArchitectureModelTranslator(faceFileName, timestamp, translationInput)
	}
	
	def TranslatedPackage translateDataModel() {
		val dataModelTranslator = new DataModelTranslator(faceFileName, dataModelPackageName, timestamp)
		val result = switch translationInput {
			WholeModel: dataModelTranslator.translate(translationInput.model, translationInput.platformOnly)
			FilteredAllLevels: dataModelTranslator.translate(translationInput.conceptualViews,
				translationInput.logicalViews, translationInput.platformViews
			)
			FilteredPlatformOnly: dataModelTranslator.translate(translationInput.platformViews)
		}
		new TranslatedPackage(dataModelPackageName, result)
	}
	
	def TranslatedPackage translatePSSS() {
		val psssTranslator = new UoPTranslator(faceFileName, psssPackageName, dataModelPackageName, timestamp)
		val result = switch translationInput {
			WholeModel: psssTranslator.translate(translationInput.model, PlatformSpecificComponent)
			Filtered: psssTranslator.translate(translationInput.psssUoPs)
		}
		new TranslatedPackage(psssPackageName, result)
	}
	
	def TranslatedPackage translatePCS() {
		val pcsTranslator = new UoPTranslator(faceFileName, pcsPackageName, dataModelPackageName, timestamp)
		val result = switch translationInput {
			WholeModel: pcsTranslator.translate(translationInput.model, PortableComponent)
			Filtered: pcsTranslator.translate(translationInput.pcsUoPs)
		}
		new TranslatedPackage(pcsPackageName, result)
	}
	
	def TranslatedPackage translateIntegrationModel() {
		val integrationModelTranslator = new IntegrationModelTranslator(faceFileName, integrationModelPackageName,
			dataModelPackageName, psssPackageName, pcsPackageName, timestamp
		)
		val result = switch translationInput {
			WholeModel: integrationModelTranslator.translate(translationInput.model)
			Filtered: integrationModelTranslator.translate(translationInput.integrationModels)
		}
		new TranslatedPackage(integrationModelPackageName, result)
	}
	
	@Accessors
	static class TranslatedPackage {
		val String name
		val Optional<String> contents
	}
	
	def private static <T extends Element> List<T> sort(Set<T> elements, ArchitectureModel model, Class<T> type) {
		model.getAllContentsOfType(type).filter[elements.contains(it)].toList
	}
	
	def private static Set<face.datamodel.conceptual.View> calculateRequiredConceptualViews(Set<View> logicalViews) {
		val requiredConceptualViews = (
			logicalViews.filter(Query).map[it.realizes] +
			logicalViews.filter(CompositeQuery).map[it.realizes]
		).filterNull.toSet
		val compositeQueries = requiredConceptualViews.filter(face.datamodel.conceptual.CompositeQuery).toList
		compositeQueries.forEach[addAllMembers(it, requiredConceptualViews)]
		requiredConceptualViews
	}
	
	def private static void addAllMembers(face.datamodel.conceptual.CompositeQuery compositeQuery,
		Set<face.datamodel.conceptual.View> requiredConceptualViews
	) {
		val unvisited = compositeQuery.composition.map[it.type].filter[!requiredConceptualViews.contains(it)].toList
		requiredConceptualViews += unvisited
		unvisited.filter(face.datamodel.conceptual.CompositeQuery).forEach[addAllMembers(it, requiredConceptualViews)]
	}
	
	def private static Set<View> calculateRequiredLogicalViews(Set<face.datamodel.platform.View> platformViews) {
		val requiredLogicalViews = (
			platformViews.filter(Template).map[it.boundQuery?.realizes] +
			platformViews.filter(CompositeTemplate).map[it.realizes]
		).filterNull.toSet
		requiredLogicalViews.filter(CompositeQuery).toList.forEach[addAllMembers(it, requiredLogicalViews)]
		requiredLogicalViews
	}
	
	def private static void addAllMembers(CompositeQuery compositeQuery, Set<View> requiredLogicalViews) {
		val unvisited = compositeQuery.composition.map[it.type].filter[!requiredLogicalViews.contains(it)].toList
		requiredLogicalViews += unvisited
		unvisited.filter(CompositeQuery).forEach[addAllMembers(it, requiredLogicalViews)]
	}
	
	def private static Set<face.datamodel.platform.View> calculateRequiredPlatformViews(
		Set<IntegrationModel> integrationModels, Set<UnitOfPortability> uops
	) {
		val integrationContexts = integrationModels.flatMap[it.element].filter(IntegrationContext)
		val transportNodes = integrationContexts.flatMap[it.node].toList
		val connections = uops.flatMap[it.connection].toList
		val clientServerConnections = connections.filter(ClientServerConnection).toList
		val requiredPlatformViews = (
			transportNodes.flatMap[it.inPort].map[it.view] +
			transportNodes.map[it.outPort].filterNull.map[it.view] +
			clientServerConnections.map[it.requestType] +
			clientServerConnections.map[it.responseType] +
			connections.filter(PubSubConnection).map[it.messageType]
		).toSet
		requiredPlatformViews.filter(CompositeTemplate).toList.forEach[addAllMembers(it, requiredPlatformViews)]
		requiredPlatformViews
	}
	
	def private static void addAllMembers(CompositeTemplate compositeTemplate,
		Set<face.datamodel.platform.View> requiredPlatformViews
	) {
		val unvisited = compositeTemplate.composition.map[it.type].filter[!requiredPlatformViews.contains(it)].toList
		requiredPlatformViews += unvisited
		unvisited.filter(CompositeTemplate).forEach[addAllMembers(it, requiredPlatformViews)]
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
		val public List<face.datamodel.platform.View> platformViews
		val public List<PlatformSpecificComponent> psssUoPs
		val public List<PortableComponent> pcsUoPs
		val public List<IntegrationModel> integrationModels
	}
	
	private static class FilteredAllLevels extends Filtered {
		val public List<face.datamodel.conceptual.View> conceptualViews
		val public List<View> logicalViews
		
		new(List<face.datamodel.conceptual.View> conceptualViews, List<View> logicalViews,
			List<face.datamodel.platform.View> platformViews, List<PlatformSpecificComponent> psssUoPs,
			List<PortableComponent> pcsUoPs, List<IntegrationModel> integrationModels
		) {
			super(platformViews, psssUoPs, pcsUoPs, integrationModels)
			this.conceptualViews = conceptualViews
			this.logicalViews = logicalViews
		}
	}
	
	@FinalFieldsConstructor
	private static class FilteredPlatformOnly extends Filtered {}
	
	def private static String removeExtension(String fileName) {
		val lastDot = fileName.lastIndexOf('.')
		if (lastDot == -1) {
			fileName
		} else {
			fileName.substring(0, lastDot)
		}
	}
}