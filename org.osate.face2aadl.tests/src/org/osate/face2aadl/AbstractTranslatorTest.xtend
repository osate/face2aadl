package org.osate.face2aadl

import face.ArchitectureModel
import face.FacePackage
import java.time.LocalDateTime
import org.apache.commons.io.IOUtils
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.junit.Before
import org.junit.Test
import org.osate.face2aadl.logic.ArchitectureModelTranslator
import org.osate.face2aadl.logic.ArchitectureModelTranslator.TranslatedPackage

import static extension org.junit.Assert.assertEquals
import static extension org.junit.Assert.assertNotNull
import static extension org.junit.Assert.assertNull

abstract class AbstractTranslatorTest {
	val String faceFileName
	val boolean platformOnly
	val time = LocalDateTime.of(2018, 3, 29, 15, 02, 31, 883_000_000).toString
	
	ArchitectureModelTranslator translator
	
	new(String baseName, boolean platformOnly) {
		faceFileName = baseName + ".face"
		this.platformOnly = platformOnly
	}
	
	@Before
	def void loadModel() {
		FacePackage.eINSTANCE.assertNotNull
		val resourceSet = new ResourceSetImpl
		resourceSet.resourceFactoryRegistry.extensionToFactoryMap.put("face", new XMIResourceFactoryImpl)
		val resource = resourceSet.createResource(URI.createURI("synthetic:/" + faceFileName))
		resource.load(class.getResourceAsStream(faceFileName), null)
		val model = resource.contents.head as ArchitectureModel
		translator = new ArchitectureModelTranslator(model, faceFileName, time, platformOnly)
	}
	
	@Test
	def void testDataModel() {
		testModel(translator.translateDataModel)
	}
	
	@Test
	def void testPSSS() {
		testModel(translator.translatePSSS)
	}
	
	@Test
	def void testPCS() {
		testModel(translator.translatePCS)
	}
	
	@Test
	def void testIntegrationModel() {
		testModel(translator.translateIntegrationModel)
	}
	
	def private void testModel(TranslatedPackage translated) {
		val expected = class.getResourceAsStream(translated.name + ".aadl")
		if (translated.contents.present) {
			IOUtils.toString(expected).assertEquals(translated.contents.get.replace("\r", ""))
		} else {
			expected.assertNull
		}
	}
}