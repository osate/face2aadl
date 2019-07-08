package org.osate.face2aadl.logic

import face.ArchitectureModel
import face.Element
import face.datamodel.logical.CompositeQuery
import face.datamodel.logical.Query
import face.datamodel.platform.CompositeTemplate
import face.datamodel.platform.Template
import face.datamodel.platform.View
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
import org.apache.commons.io.FilenameUtils
import org.eclipse.xtend.lib.annotations.Accessors

import static org.osate.face2aadl.logic.TranslatorUtil.sanitizeID

import static extension org.eclipse.xtext.EcoreUtil2.getAllContentsOfType

class ArchitectureModelTranslator {
	val String faceFileName
	val String timestamp
	
	val String dataModelPackageName
	val String psssPackageName
	val String pcsPackageName
	val String integrationModelPackageName
	
	val (DataModelTranslator)=>Optional<String> dataModelFunction
	val (UoPTranslator)=>Optional<String> psssFunction
	val (UoPTranslator)=>Optional<String> pcsFunction
	val (IntegrationModelTranslator)=>Optional<String> integrationModelFunction
	
	private new(String faceFileName, String timestamp, (DataModelTranslator)=>Optional<String> dataModelFunction,
		(UoPTranslator)=>Optional<String> psssFunction, (UoPTranslator)=>Optional<String> pcsFunction,
		(IntegrationModelTranslator)=>Optional<String> integrationModelFunction
	) {
		this.faceFileName = faceFileName
		this.timestamp = timestamp
		
		val baseFileName = sanitizeID(FilenameUtils.removeExtension(faceFileName))
		dataModelPackageName = baseFileName + "_data_model"
		psssPackageName = baseFileName + "_PSSS"
		pcsPackageName = baseFileName + "_PCS"
		integrationModelPackageName = baseFileName + "_integration_model"
		
		this.dataModelFunction = dataModelFunction
		this.psssFunction = psssFunction
		this.pcsFunction = pcsFunction
		this.integrationModelFunction = integrationModelFunction
	}
	
	def static ArchitectureModelTranslator create(ArchitectureModel model, String faceFileName, String timestamp,
		boolean platformOnly
	) {
		new ArchitectureModelTranslator(faceFileName, timestamp,
			[dataModelTranslator | dataModelTranslator.translate(model, platformOnly)],
			[psssTranslator | psssTranslator.translate(model, PlatformSpecificComponent)],
			[pcsTranslator | pcsTranslator.translate(model, PortableComponent)],
			[integrationModelTranslator | integrationModelTranslator.translate(model)]
		)
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
		val orderedPlatformViews = requiredPlatformViews.sort(model, View)
		
		val dataModelFunction = if (platformOnly) {
			[DataModelTranslator it | it.translate(orderedPlatformViews)]
		} else {
			val requiredLogicalViews = calculateRequiredLogicalViews(requiredPlatformViews)
			val orderedLogicalViews = requiredLogicalViews.sort(model, face.datamodel.logical.View)
			
			val requiredConceptualViews = calculateRequiredConceptualViews(requiredLogicalViews)
			val orderedConceptualViews = requiredConceptualViews.sort(model, face.datamodel.conceptual.View);
			
			[DataModelTranslator it | it.translate(orderedConceptualViews, orderedLogicalViews, orderedPlatformViews)]
		}
		
		new ArchitectureModelTranslator(faceFileName, timestamp, dataModelFunction,
			[psssTranslator | psssTranslator.translate(orderedPsssUoPs)],
			[pcsTranslator | pcsTranslator.translate(orderedPcsUoPs)],
			[integrationModelTranslator | integrationModelTranslator.translate(orderedIntegrationModels)]
		)
	}
	
	def TranslatedPackage translateDataModel() {
		val dataModelTranslator = new DataModelTranslator(faceFileName, dataModelPackageName, timestamp)
		new TranslatedPackage(dataModelPackageName, dataModelFunction.apply(dataModelTranslator))
	}
	
	def TranslatedPackage translatePSSS() {
		val psssTranslator = new UoPTranslator(faceFileName, psssPackageName, dataModelPackageName, timestamp)
		new TranslatedPackage(psssPackageName, psssFunction.apply(psssTranslator))
	}
	
	def TranslatedPackage translatePCS() {
		val pcsTranslator = new UoPTranslator(faceFileName, pcsPackageName, dataModelPackageName, timestamp)
		new TranslatedPackage(pcsPackageName, pcsFunction.apply(pcsTranslator))
	}
	
	def TranslatedPackage translateIntegrationModel() {
		val integrationModelTranslator = new IntegrationModelTranslator(faceFileName, integrationModelPackageName,
			dataModelPackageName, psssPackageName, pcsPackageName, timestamp
		)
		new TranslatedPackage(integrationModelPackageName, integrationModelFunction.apply(integrationModelTranslator))
	}
	
	@Accessors
	static class TranslatedPackage {
		val String name
		val Optional<String> contents
	}
	
	def private static <T extends Element> List<T> sort(Set<T> elements, ArchitectureModel model, Class<T> type) {
		model.getAllContentsOfType(type).filter[elements.contains(it)].toList
	}
	
	def private static Set<face.datamodel.conceptual.View> calculateRequiredConceptualViews(
		Set<face.datamodel.logical.View> logicalViews
	) {
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
	
	def private static Set<face.datamodel.logical.View> calculateRequiredLogicalViews(Set<View> platformViews) {
		val requiredLogicalViews = (
			platformViews.filter(Template).map[it.boundQuery?.realizes] +
			platformViews.filter(CompositeTemplate).map[it.realizes]
		).filterNull.toSet
		requiredLogicalViews.filter(CompositeQuery).toList.forEach[addAllMembers(it, requiredLogicalViews)]
		requiredLogicalViews
	}
	
	def private static void addAllMembers(CompositeQuery compositeQuery,
		Set<face.datamodel.logical.View> requiredLogicalViews
	) {
		val unvisited = compositeQuery.composition.map[it.type].filter[!requiredLogicalViews.contains(it)].toList
		requiredLogicalViews += unvisited
		unvisited.filter(CompositeQuery).forEach[addAllMembers(it, requiredLogicalViews)]
	}
	
	def private static Set<View> calculateRequiredPlatformViews(Set<IntegrationModel> integrationModels,
		Set<UnitOfPortability> uops
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
	
	def private static void addAllMembers(CompositeTemplate compositeTemplate, Set<View> requiredPlatformViews) {
		val unvisited = compositeTemplate.composition.map[it.type].filter[!requiredPlatformViews.contains(it)].toList
		requiredPlatformViews += unvisited
		unvisited.filter(CompositeTemplate).forEach[addAllMembers(it, requiredPlatformViews)]
	}
	
	def private static Set<UnitOfPortability> calculateRequiredUoPs(Iterable<UnitOfPortability> uops,
		Set<IntegrationModel> integrationModels
	) {
		(uops + integrationModels.flatMap[it.element].filter(UoPInstance).map[it.realizes]).toSet
	}
}