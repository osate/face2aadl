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
package org.osate.face2aadl.face30;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.apache.commons.io.IOUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.EcoreUtil2;
import org.junit.Before;
import org.junit.Test;
import org.osate.face2aadl.common.TranslatedPackage;
import org.osate.face2aadl.logic30.ArchitectureModelTranslator;

import face.ArchitectureModel;
import face.FacePackage;
import face.integration.IntegrationModel;
import face.uop.UnitOfPortability;

public abstract class AbstractTranslator30Test {
	private final String faceFileName;
	private final boolean platformOnly;
	private final List<String> uopNames;
	private final List<String> integrationModelNames;
	private final boolean createFlows;

	private ArchitectureModelTranslator translator;

	public AbstractTranslator30Test(String baseName, boolean platformOnly, boolean createFlows) {
		this(baseName, platformOnly, null, null, createFlows);
	}

	public AbstractTranslator30Test(String baseName, boolean platformOnly, List<String> uopNames,
			List<String> integrationModelNames, boolean createFlows) {
		faceFileName = baseName + ".face";
		this.platformOnly = platformOnly;
		this.uopNames = uopNames;
		this.integrationModelNames = integrationModelNames;
		this.createFlows = createFlows;
	}

	@Before
	public void loadModel() throws IOException {
		assertNotNull(FacePackage.eINSTANCE);
		var resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("face", new XMIResourceFactoryImpl());
		var resource = resourceSet.createResource(URI.createURI("synthetic:/" + faceFileName));
		resource.load(getClass().getResourceAsStream(faceFileName), null);
		var model = (ArchitectureModel) resource.getContents().get(0);
		if (uopNames == null) {
			translator = ArchitectureModelTranslator.create(model, faceFileName, platformOnly, createFlows,
					Optional.empty());
		} else {
			var allUoPs = EcoreUtil2.getAllContentsOfType(model, UnitOfPortability.class);
			var allIntegrationModels = EcoreUtil2.getAllContentsOfType(model, IntegrationModel.class);
			var uops = uopNames.stream()
					.map(name -> allUoPs.stream().filter(uop -> uop.getName().equals(name)).findFirst().get())
					.toList();
			var integrationModels = integrationModelNames.stream()
					.map(name -> allIntegrationModels.stream()
							.filter(integrationModel -> integrationModel.getName().equals(name))
							.findFirst()
							.get())
					.toList();
			translator = ArchitectureModelTranslator.create(model, uops, integrationModels, faceFileName, platformOnly,
					createFlows, Optional.empty());
		}
	}

	@Test
	public void testDataModel() throws IOException {
		testModel(translator.translateDataModel());
	}

	@Test
	public void testPSSS() throws IOException {
		testModel(translator.translatePSSS());
	}

	@Test
	public void testPCS() throws IOException {
		testModel(translator.translatePCS());
	}

	@Test
	public void testIntegrationModel() throws IOException {
		testModel(translator.translateIntegrationModel());
	}

	private void testModel(TranslatedPackage translated) throws IOException {
		var expected = getClass().getResourceAsStream(translated.getName() + ".aadl");
		if (translated.getContents().isPresent()) {
			assertEquals(IOUtils.toString(expected).replace("\r", ""),
					translated.getContents().get().replace("\r", ""));
		} else {
			assertNull(expected);
		}
	}
}