/*******************************************************************************
 * FACE Data Model to AADL Translator
 * 
 * Copyright 2018 Carnegie Mellon University. All Rights Reserved.
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
 * DM18-0762
 *******************************************************************************/
package org.osate.face2aadl

import face.ArchitectureModel
import face.uop.PlatformSpecificComponent
import face.uop.PortableComponent
import java.io.ByteArrayInputStream
import java.lang.reflect.InvocationTargetException
import java.time.LocalDateTime
import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IFolder
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.SubMonitor
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.common.util.WrappedException
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.PackageNotFoundException
import org.eclipse.ui.actions.WorkspaceModifyOperation
import org.eclipse.ui.statushandlers.StatusManager
import org.osate.face2aadl.logic.DataModelTranslator
import org.osate.face2aadl.logic.IntegrationModelTranslator
import org.osate.face2aadl.logic.ModelTranslator
import org.osate.face2aadl.logic.UoPTranslator

import static org.osate.face2aadl.logic.TranslatorUtil.sanitizeID

import static extension org.eclipse.ui.handlers.HandlerUtil.getActiveWorkbenchWindow
import static extension org.eclipse.ui.handlers.HandlerUtil.getCurrentStructuredSelection

class TranslatorHandler extends AbstractHandler {
	override execute(ExecutionEvent event) throws ExecutionException {
		val faceFile = event.currentStructuredSelection.firstElement as IFile
		
		val WorkspaceModifyOperation operation = [monitor |
			val subMonitor = SubMonitor.convert(monitor, 5)
			
			val modelGenDirectory = faceFile.project.getFolder("model-gen")
			if (!modelGenDirectory.exists) {
				modelGenDirectory.create(false, true, subMonitor.split(1))
			}
			subMonitor.workRemaining = 4
			
			val baseFileName = sanitizeID(faceFile.fullPath.removeFileExtension.lastSegment)
			val resourceSet = new ResourceSetImpl
			val faceURI = URI.createPlatformResourceURI(faceFile.fullPath.toString, true)
			val faceResource = resourceSet.getResource(faceURI, true)
			val root = faceResource.contents.head as ArchitectureModel
			val timestamp = LocalDateTime.now.toString
			
			val dataModelPackageName = baseFileName + "_data_model"
			val dataModelTranslator = new DataModelTranslator(faceFile.name, dataModelPackageName, timestamp, false)
			translateModel(dataModelTranslator, root, dataModelPackageName, modelGenDirectory, subMonitor.split(1))
			
			val psssPackageName = baseFileName + "_PSSS"
			val psssTranslator = new UoPTranslator(PlatformSpecificComponent, faceFile.name, psssPackageName,
				dataModelPackageName, timestamp
			)
			translateModel(psssTranslator, root, psssPackageName, modelGenDirectory, subMonitor.split(1))
			
			val pcsPackageName = baseFileName + "_PCS"
			val pcsTranslator = new UoPTranslator(PortableComponent, faceFile.name, pcsPackageName,
				dataModelPackageName, timestamp
			)
			translateModel(pcsTranslator, root, pcsPackageName, modelGenDirectory, subMonitor.split(1))
			
			val integrationModelPackageName = baseFileName + "_integration_model"
			val integrationModelTranslator = new IntegrationModelTranslator(faceFile.name, integrationModelPackageName,
				dataModelPackageName, psssPackageName, pcsPackageName, timestamp
			)
			translateModel(integrationModelTranslator, root, integrationModelPackageName, modelGenDirectory,
				subMonitor.split(1)
			)
		]
		try {
			event.activeWorkbenchWindow.run(true, true, operation)
		} catch (InvocationTargetException e) {
			val target = e.targetException
			
			if (target instanceof WrappedException && target.cause instanceof PackageNotFoundException) {
				val message = '''"«faceFile.name»" is not a FACE 3.0 Data Model.'''
				
				val logStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, message, target)
				StatusManager.manager.handle(logStatus, StatusManager.LOG)
				
				val dialogStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, message)
				StatusManager.manager.handle(dialogStatus, StatusManager.SHOW)
			} else {
				val status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error while translating.", target)
				StatusManager.manager.handle(status, StatusManager.LOG.bitwiseOr(StatusManager.SHOW))
			}
		} catch (InterruptedException e) {
			//Do nothing.
		}
		
		null
	}
	
	def private void translateModel(ModelTranslator translator, ArchitectureModel model, String packageName,
		IFolder modelGenDirectory, IProgressMonitor monitor
	) {
		translator.translate(model).ifPresent[packageContents |
			val packageStream = new ByteArrayInputStream(packageContents.bytes)
			val packageFile = modelGenDirectory.getFile(packageName + ".aadl")
			if (packageFile.exists) {
				packageFile.setContents(packageStream, false, true, monitor)
			} else {
				packageFile.create(packageStream, false, monitor)
			}
		]
	}
}