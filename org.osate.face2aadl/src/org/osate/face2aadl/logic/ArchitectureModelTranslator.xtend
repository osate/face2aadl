package org.osate.face2aadl.logic

import face.ArchitectureModel
import face.datamodel.conceptual.CompositeQuery
import face.datamodel.conceptual.View
import face.datamodel.logical.Query
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
import java.util.Optional
import java.util.Set
import org.apache.commons.io.FilenameUtils
import org.eclipse.xtend.lib.annotations.Accessors

import static org.osate.face2aadl.logic.TranslatorUtil.sanitizeID

import static extension org.eclipse.xtext.EcoreUtil2.eAllOfType
import static extension org.eclipse.xtext.EcoreUtil2.getAllContentsOfType

class ArchitectureModelTranslator {
	val ArchitectureModel model
	val String faceFileName
	val String timestamp
	val boolean platformOnly
	
	val String dataModelPackageName
	val String psssPackageName
	val String pcsPackageName
	val String integrationModelPackageName
	
	val Iterable<View> conceptualViews
	val Iterable<face.datamodel.logical.View> logicalViews
	val Iterable<face.datamodel.platform.View> platformViews
	val Iterable<PlatformSpecificComponent> psssUoPs
	val Iterable<PortableComponent> pcsUoPs
	val Iterable<IntegrationModel> integrationModels
	
	new(ArchitectureModel model, String faceFileName, String timestamp, boolean platformOnly) {
		this.model = model
		this.faceFileName = faceFileName
		this.timestamp = timestamp
		this.platformOnly = platformOnly
		
		val baseFileName = sanitizeID(FilenameUtils.removeExtension(faceFileName))
		dataModelPackageName = baseFileName + "_data_model"
		psssPackageName = baseFileName + "_PSSS"
		pcsPackageName = baseFileName + "_PCS"
		integrationModelPackageName = baseFileName + "_integration_model"
		
		conceptualViews = null
		logicalViews = null
		platformViews = null
		psssUoPs = null
		pcsUoPs = null
		integrationModels = null
	}
	
	new(ArchitectureModel model, Iterable<UnitOfPortability> selectedUoPs, Iterable<IntegrationModel> selectedIntegrationModels, String faceFileName, String timestamp, boolean platformOnly) {
		this.model = model
		this.faceFileName = faceFileName
		this.timestamp = timestamp
		this.platformOnly = platformOnly
		
		val baseFileName = sanitizeID(FilenameUtils.removeExtension(faceFileName))
		dataModelPackageName = baseFileName + "_data_model"
		psssPackageName = baseFileName + "_PSSS"
		pcsPackageName = baseFileName + "_PCS"
		integrationModelPackageName = baseFileName + "_integration_model"
		
		val requiredIntegrationModels = selectedIntegrationModels.toSet
		integrationModels = model.im.flatMap[it.eAllOfType(IntegrationModel)].filter[requiredIntegrationModels.contains(it)]
		
		val requiredUoPs = (selectedUoPs + requiredIntegrationModels.flatMap[it.element].filter(UoPInstance).map[it.realizes]).toSet
		val uops = model.um.flatMap[it.getAllContentsOfType(UnitOfPortability)].filter[requiredUoPs.contains(it)].toList
		psssUoPs = uops.filter(PlatformSpecificComponent)
		pcsUoPs = uops.filter(PortableComponent)
		
		val transportNodes = requiredIntegrationModels.flatMap[it.element].filter(IntegrationContext).flatMap[it.node].toList
		val connections = requiredUoPs.flatMap[it.connection].toList
		val clientServerConnections = connections.filter(ClientServerConnection).toList
		val requiredPlatformViews = (
			transportNodes.flatMap[it.inPort].map[it.view] +
			transportNodes.map[it.outPort].filterNull.map[it.view] +
			clientServerConnections.map[it.requestType] +
			clientServerConnections.map[it.responseType] +
			connections.filter(PubSubConnection).map[it.messageType]
		).toSet
		requiredPlatformViews.filter(CompositeTemplate).toList.forEach[addAllMembers(it, requiredPlatformViews)]
		platformViews = model.dm.flatMap[it.pdm].flatMap[it.getAllContentsOfType(face.datamodel.platform.View)].filter[requiredPlatformViews.contains(it)]
		
		if (!platformOnly) {
			val requiredLogicalViews = (
				requiredPlatformViews.filter(Template).map[it.boundQuery?.realizes] +
				requiredPlatformViews.filter(CompositeTemplate).map[it.realizes]
			).filterNull.toSet
			requiredLogicalViews.filter(face.datamodel.logical.CompositeQuery).toList.forEach[addAllMembers(it, requiredLogicalViews)]
			logicalViews = model.dm.flatMap[it.ldm].flatMap[it.getAllContentsOfType(face.datamodel.logical.View)].filter[requiredLogicalViews.contains(it)]
			
			
			val requiredConceptualViews = (
				requiredLogicalViews.filter(Query).map[it.realizes] +
				requiredLogicalViews.filter(face.datamodel.logical.CompositeQuery).map[it.realizes]
			).filterNull.toSet
			requiredConceptualViews.filter(CompositeQuery).toList.forEach[addAllMembers(it, requiredConceptualViews)]
			conceptualViews = model.dm.flatMap[it.cdm].flatMap[it.getAllContentsOfType(View)].filter[requiredConceptualViews.contains(it)]
		} else {
			conceptualViews = null
			logicalViews = null
		}
	}
	
	def private void addAllMembers(CompositeQuery compositeQuery, Set<View> requiredConceptualViews) {
		val unvisited = compositeQuery.composition.map[it.type].filter[!requiredConceptualViews.contains(it)].toList
		requiredConceptualViews += unvisited
		unvisited.filter(CompositeQuery).forEach[addAllMembers(it, requiredConceptualViews)]
	}
	
	def private void addAllMembers(face.datamodel.logical.CompositeQuery compositeQuery, Set<face.datamodel.logical.View> requiredLogicalViews) {
		val unvisited = compositeQuery.composition.map[it.type].filter[!requiredLogicalViews.contains(it)].toList
		requiredLogicalViews += unvisited
		unvisited.filter(face.datamodel.logical.CompositeQuery).forEach[addAllMembers(it, requiredLogicalViews)]
	}
	
	def private void addAllMembers(CompositeTemplate compositeTemplate, Set<face.datamodel.platform.View> requiredPlatformViews) {
		val unvisited = compositeTemplate.composition.map[it.type].filter[!requiredPlatformViews.contains(it)].toList
		requiredPlatformViews += unvisited
		unvisited.filter(CompositeTemplate).forEach[addAllMembers(it, requiredPlatformViews)]
	}
	
	def TranslatedPackage translateDataModel() {
		val dataModelTranslator = new DataModelTranslator(faceFileName, dataModelPackageName, timestamp)
		val result = if (platformViews === null) {
			dataModelTranslator.translate(model, platformOnly)
		} else if (platformOnly) {
			dataModelTranslator.translate(platformViews)
		} else {
			dataModelTranslator.translate(conceptualViews, logicalViews, platformViews)
		}
		new TranslatedPackage(dataModelPackageName, result)
	}
	
	def TranslatedPackage translatePSSS() {
		val psssTranslator = new UoPTranslator(faceFileName, psssPackageName, dataModelPackageName, timestamp)
		val result = if (psssUoPs === null) {
			psssTranslator.translate(model, PlatformSpecificComponent)
		} else {
			psssTranslator.translate(psssUoPs)
		}
		new TranslatedPackage(psssPackageName, result)
	}
	
	def TranslatedPackage translatePCS() {
		val pcsTranslator = new UoPTranslator(faceFileName, pcsPackageName, dataModelPackageName, timestamp)
		val result = if (pcsUoPs === null) {
			pcsTranslator.translate(model, PortableComponent)
		} else {
			pcsTranslator.translate(pcsUoPs)
		}
		new TranslatedPackage(pcsPackageName, result)
	}
	
	def TranslatedPackage translateIntegrationModel() {
		val integrationModelTranslator = new IntegrationModelTranslator(faceFileName, integrationModelPackageName,
			dataModelPackageName, psssPackageName, pcsPackageName, timestamp
		)
		val result = if (integrationModels === null) {
			integrationModelTranslator.translate(model)
		} else {
			integrationModelTranslator.translate(integrationModels)
		}
		new TranslatedPackage(integrationModelPackageName, result)
	}
	
	@Accessors
	static class TranslatedPackage {
		val String name
		val Optional<String> contents
	}
}