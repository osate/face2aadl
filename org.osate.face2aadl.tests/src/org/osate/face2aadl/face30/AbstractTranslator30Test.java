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
package org.osate.face2aadl.face30

import face.ArchitectureModel
import face.FacePackage
import face.integration.IntegrationModel
import face.uop.UnitOfPortability
import java.util.List
import java.util.Optional
import org.apache.commons.io.IOUtils
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.junit.Before
import org.junit.Test
import org.osate.face2aadl.common.TranslatedPackage
import org.osate.face2aadl.logic30.ArchitectureModelTranslator

import static extension org.eclipse.xtext.EcoreUtil2.getAllContentsOfType
import static extension org.junit.Assert.assertEquals
import static extension org.junit.Assert.assertNotNull
import static extension org.junit.Assert.assertNull

abstract class AbstractTranslator30Test {
	val String faceFileName
	val boolean platformOnly
	val List<String> uopNames
	val List<String> integrationModelNames
	val boolean createFlows
	
	ArchitectureModelTranslator translator
	
	new(String baseName, boolean platformOnly, boolean createFlows) {
		this(baseName, platformOnly, null, null, createFlows)
	}
	
	new(String baseName, boolean platformOnly, List<String> uopNames, List<String> integrationModelNames,
		boolean createFlows
	) {
		faceFileName = baseName + ".face"
		this.platformOnly = platformOnly
		this.uopNames = uopNames
		this.integrationModelNames = integrationModelNames
		this.createFlows = createFlows
	}
	
	@Before
	def void loadModel() {
		FacePackage.eINSTANCE.assertNotNull
		val resourceSet = new ResourceSetImpl
		resourceSet.resourceFactoryRegistry.extensionToFactoryMap.put("face", new XMIResourceFactoryImpl)
		val resource = resourceSet.createResource(URI.createURI("synthetic:/" + faceFileName))
		resource.load(class.getResourceAsStream(faceFileName), null)
		val model = resource.contents.head as ArchitectureModel
		translator = if (uopNames === null) {
			ArchitectureModelTranslator.create(model, faceFileName, platformOnly, createFlows, Optional.empty)
		} else {
			val allUoPs = model.getAllContentsOfType(UnitOfPortability)
			val allIntegrationModels = model.getAllContentsOfType(IntegrationModel)
			val uops = uopNames.map[name | allUoPs.findFirst[it.name == name]]
			val integrationModels = integrationModelNames.map[name | allIntegrationModels.findFirst[it.name == name]]
			ArchitectureModelTranslator.create(model, uops, integrationModels, faceFileName, platformOnly, createFlows,
				Optional.empty
			)
		}
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
			IOUtils.toString(expected).replace("\r", "").assertEquals(translated.contents.get.replace("\r", ""))
		} else {
			expected.assertNull
		}
	}
}