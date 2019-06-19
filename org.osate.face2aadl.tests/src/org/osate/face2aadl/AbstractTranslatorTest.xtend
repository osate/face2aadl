package org.osate.face2aadl

import face.ArchitectureModel
import face.FacePackage
import face.uop.PlatformSpecificComponent
import face.uop.PortableComponent
import java.nio.charset.Charset
import java.time.LocalDateTime
import org.apache.commons.io.IOUtils
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.junit.Before
import org.junit.Test
import org.osate.face2aadl.logic.DataModelTranslator
import org.osate.face2aadl.logic.IntegrationModelTranslator
import org.osate.face2aadl.logic.ModelTranslator
import org.osate.face2aadl.logic.UoPTranslator

import static org.osate.face2aadl.logic.TranslatorUtil.sanitizeID

import static extension org.junit.Assert.assertEquals
import static extension org.junit.Assert.assertNotNull
import static extension org.junit.Assert.assertNull

abstract class AbstractTranslatorTest {
	val String faceFileName
	val String dataModelName
	val String psssName
	val String pcsName
	val String integrationModelName
	val boolean platformOnly
	val time = LocalDateTime.of(2018, 3, 29, 15, 02, 31, 883_000_000).toString
	
	ArchitectureModel root
	
	new(String baseName, boolean platformOnly) {
		faceFileName = baseName + ".face"
		val aadlName = sanitizeID(baseName)
		dataModelName = aadlName + "_data_model"
		psssName = aadlName + "_PSSS"
		pcsName = aadlName + "_PCS"
		integrationModelName = aadlName + "_integration_model"
		this.platformOnly = platformOnly
	}
	
	@Before
	def void loadModel() {
		FacePackage.eINSTANCE.assertNotNull
		val resourceSet = new ResourceSetImpl
		resourceSet.resourceFactoryRegistry.extensionToFactoryMap.put("face", new XMIResourceFactoryImpl)
		val resource = resourceSet.createResource(URI.createURI("synthetic:/" + faceFileName))
		resource.load(class.getResourceAsStream(faceFileName), null)
		root = resource.contents.head as ArchitectureModel
	}
	
	@Test
	def void testDataModel() {
		val translator = new DataModelTranslator(faceFileName, dataModelName, time, platformOnly)
		testModel(translator, dataModelName)
	}
	
	@Test
	def void testPSSS() {
		val translator = new UoPTranslator(PlatformSpecificComponent, faceFileName, psssName, dataModelName,
			time
		)
		testModel(translator, psssName)
	}
	
	@Test
	def void testPCS() {
		val translator = new UoPTranslator(PortableComponent, faceFileName, pcsName, dataModelName, time)
		testModel(translator, pcsName)
	}
	
	@Test
	def void testIntegrationModel() {
		val translator = new IntegrationModelTranslator(faceFileName, integrationModelName, dataModelName,
			psssName, pcsName, time
		)
		testModel(translator, integrationModelName)
	}
	
	def private void testModel(ModelTranslator translator, String packageName) {
		val expected = class.getResourceAsStream(packageName + ".aadl")
		val actual = translator.translate(root)
		if (actual.present) {
			IOUtils.toString(expected, Charset.defaultCharset).assertEquals(actual.get.replace("\r", ""))
		} else {
			expected.assertNull
		}
	}
}