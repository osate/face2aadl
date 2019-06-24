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
	
	@Accessors
	val String dataModelPackageName
	@Accessors
	val String psssPackageName
	@Accessors
	val String pcsPackageName
	@Accessors
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
	
	def Optional<String> translateDataModel() {
		val dataModelTranslator = new DataModelTranslator(faceFileName, dataModelPackageName, timestamp, platformOnly)
		dataModelTranslator.translate(model)
	}
	
	def Optional<String> translatePSSS() {
		val psssTranslator = new UoPTranslator(PlatformSpecificComponent, faceFileName, psssPackageName,
			dataModelPackageName, timestamp
		)
		psssTranslator.translate(model)
	}
	
	def Optional<String> translatePCS() {
		val pcsTranslator = new UoPTranslator(PortableComponent, faceFileName, pcsPackageName, dataModelPackageName,
			timestamp
		)
		pcsTranslator.translate(model)
	}
	
	def Optional<String> translateIntegrationModel() {
		val integrationModelTranslator = new IntegrationModelTranslator(faceFileName, integrationModelPackageName,
			dataModelPackageName, psssPackageName, pcsPackageName, timestamp
		)
		integrationModelTranslator.translate(model)
	}
}