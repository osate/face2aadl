package org.osate.face2aadl.logic

import face.ArchitectureModel
import face.uop.PlatformSpecificComponent
import face.uop.PortableComponent
import java.util.Optional
import org.apache.commons.io.FilenameUtils
import org.eclipse.xtend.lib.annotations.Accessors

import static org.osate.face2aadl.logic.TranslatorUtil.sanitizeID

class ArchitectureModelTranslator {
	val ArchitectureModel model
	val String faceFileName
	val String timestamp
	val boolean platformOnly
	
	val String dataModelPackageName
	val String psssPackageName
	val String pcsPackageName
	val String integrationModelPackageName
	
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
	}
	
	def TranslatedPackage translateDataModel() {
		val dataModelTranslator = new DataModelTranslator(faceFileName, dataModelPackageName, timestamp)
		new TranslatedPackage(dataModelPackageName, dataModelTranslator.translate(model, platformOnly))
	}
	
	def TranslatedPackage translatePSSS() {
		val psssTranslator = new UoPTranslator(faceFileName, psssPackageName, dataModelPackageName, timestamp)
		new TranslatedPackage(psssPackageName, psssTranslator.translate(model, PlatformSpecificComponent))
	}
	
	def TranslatedPackage translatePCS() {
		val pcsTranslator = new UoPTranslator(faceFileName, pcsPackageName, dataModelPackageName, timestamp)
		new TranslatedPackage(pcsPackageName, pcsTranslator.translate(model, PortableComponent))
	}
	
	def TranslatedPackage translateIntegrationModel() {
		val integrationModelTranslator = new IntegrationModelTranslator(faceFileName, integrationModelPackageName,
			dataModelPackageName, psssPackageName, pcsPackageName, timestamp
		)
		new TranslatedPackage(integrationModelPackageName, integrationModelTranslator.translate(model))
	}
	
	@Accessors
	static class TranslatedPackage {
		val String name
		val Optional<String> contents
	}
}