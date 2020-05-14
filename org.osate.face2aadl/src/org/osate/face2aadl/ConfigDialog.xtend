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

import face.Element
import face.integration.IntegrationModel
import face.uop.PlatformSpecificComponent
import face.uop.PortableComponent
import face.uop.UnitOfPortability
import java.util.List
import org.eclipse.jface.dialogs.IDialogConstants
import org.eclipse.jface.dialogs.TitleAreaDialog
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.jface.viewers.CheckboxTableViewer
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.jface.viewers.ViewerComparator
import org.eclipse.swt.SWT
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.graphics.Point
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Group
import org.eclipse.swt.widgets.Shell
import org.eclipse.xtend.lib.annotations.Accessors

import static extension org.eclipse.jface.dialogs.DialogSettings.getOrCreateSection

class ConfigDialog extends TitleAreaDialog {
	val static PLATFORM_ONLY_SETTING = "PLATFORM_ONLY_SETTING"
	val static FILTER_SETTING = "FILTER_SETTING"
	val static CHECKED_ELEMENTS_SETTING = "CHECKED_ELEMENTS_SETTING"
	val static PROCESS_IDL_SETTING = "PROCESS_IDL_SETTING"
	val static CREATE_FLOWS_SETTING = "CREATE_FLOWS_SETTING"
	
	val List<Element> uopsAndIntegrationModels
	
	val dialogSettings = Activator.^default.dialogSettings.getOrCreateSection(class.name)
	
	Button allLevelsButton
	Button platformOnlyButton
	Button filterButton
	CheckboxTableViewer tableViewer
	Button selectAllButton
	Button deselectAllButton
	Button processIdlButton
	Button createFlowsButton
	
	@Accessors(PUBLIC_GETTER)
	boolean platformOnly
	@Accessors(PUBLIC_GETTER)
	boolean filter
	@Accessors(PUBLIC_GETTER)
	List<UnitOfPortability> selectedUoPs
	@Accessors(PUBLIC_GETTER)
	List<IntegrationModel> selectedIntegrationModels
	@Accessors(PUBLIC_GETTER)
	boolean processIdl
	@Accessors(PUBLIC_GETTER)
	boolean createFlows
	
	new(Shell parentShell, List<Element> uopsAndIntegrationModels) {
		super(parentShell)
		this.uopsAndIntegrationModels = uopsAndIntegrationModels
	}
	
	new (Shell parentShell, Iterable<UnitOfPortability> uops, Iterable<IntegrationModel> integrationModels) {
		super(parentShell)
		helpAvailable = false
		uopsAndIntegrationModels = (uops + integrationModels).toList
	}
	
	override protected isResizable() {
		true
	}
	
	override protected getInitialSize() {
		new Point(super.initialSize.x, convertVerticalDLUsToPixels(250))
	}
	
	override protected getDialogBoundsSettings() {
		dialogSettings
	}
	
	override protected configureShell(Shell newShell) {
		super.configureShell(newShell)
		newShell.text = "Translate to AADL"
	}
	
	override create() {
		super.create
		title = "Configure Translation Options"
		loadFromSettings
		addListeners
	}
	
	override protected createDialogArea(Composite parent) {
		super.createDialogArea(parent) as Composite => [outerComposite |
			new Composite(outerComposite, SWT.NONE) => [innerComposite |
				innerComposite.layout = new GridLayout
				innerComposite.layoutData = new GridData(SWT.FILL, SWT.FILL, true, true)
				new Group(innerComposite, SWT.SHADOW_NONE) => [levelGroup |
					levelGroup.text = "Data model levels to translate"
					levelGroup.layout = new GridLayout
					levelGroup.layoutData = new GridData(SWT.FILL, SWT.TOP, true, false)
					allLevelsButton = new Button(levelGroup, SWT.RADIO) => [button |
						button.text = "Conceptual, logical, and platform"
						button.layoutData = new GridData(SWT.LEFT, SWT.CENTER, false, false)
					]
					platformOnlyButton = new Button(levelGroup, SWT.RADIO) => [button |
						button.text = "Platform only"
						button.layoutData = new GridData(SWT.LEFT, SWT.CENTER, false, false)
					]
				]
				new Group(innerComposite, SWT.SHADOW_NONE) => [filteringGroup |
					filteringGroup.text = "Element filtering"
					filteringGroup.layout = new GridLayout(2, false)
					filteringGroup.layoutData = new GridData(SWT.FILL, SWT.FILL, true, true)
					filterButton = new Button(filteringGroup, SWT.CHECK) => [button |
						button.text = "Only translate elements required for the selected UoPs and Integration Models:"
						button.layoutData = new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1)
					]
					tableViewer = CheckboxTableViewer.newCheckList(filteringGroup, SWT.BORDER) => [tableViewer |
						tableViewer.table.layoutData = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 2)
						tableViewer.contentProvider = ArrayContentProvider.instance
						tableViewer.labelProvider = new LabelProvider {
							override getText(Object element) {
								switch element {
									PlatformSpecificComponent: "Platform Specific Component " + element.name
									PortableComponent: "Portable Component " + element.name
									IntegrationModel: "Integration Model " + element.name
								}
							}
						}
						tableViewer.comparator = new ViewerComparator
						tableViewer.input = uopsAndIntegrationModels
					]
					selectAllButton = new Button(filteringGroup, SWT.PUSH) => [button |
						button.text = "Select All"
						button.layoutData = new GridData(SWT.FILL, SWT.TOP, false, false)
					]
					deselectAllButton = new Button(filteringGroup, SWT.PUSH) => [button |
						button.text = "Deselect All"
						button.layoutData = new GridData(SWT.FILL, SWT.TOP, false, false)
					]
				]
				new Group(innerComposite, SWT.SHADOW_NONE) => [otherGroup |
					otherGroup.text = "Other options"
					otherGroup.layout = new GridLayout()
					otherGroup.layoutData = new GridData(SWT.FILL, SWT.TOP, true, false)
					processIdlButton = new Button(otherGroup, SWT.CHECK) => [button |
						button.text = "Process IDL files discovered in the project"
						button.layoutData = new GridData(SWT.LEFT, SWT.CENTER, false, false)
					]
					createFlowsButton = new Button(otherGroup, SWT.CHECK) => [button |
						button.text = "Create flow sinks and sources for each UoP's inputs and outputs"
						button.layoutData = new GridData(SWT.LEFT, SWT.CENTER, false, false)
					]
				]
			]
		]
	}
	
	override protected okPressed() {
		platformOnly = platformOnlyButton.selection
		dialogSettings.put(PLATFORM_ONLY_SETTING, platformOnly)
		
		filter = filterButton.selection
		dialogSettings.put(FILTER_SETTING, filterButton.selection)
		
		if (filter) {
			selectedUoPs = tableViewer.checkedElements.filter(UnitOfPortability).toList
			selectedIntegrationModels = tableViewer.checkedElements.filter(IntegrationModel).toList
			dialogSettings.put(CHECKED_ELEMENTS_SETTING, tableViewer.checkedElements.map[(it as Element).name])
		}
		
		processIdl = processIdlButton.selection
		dialogSettings.put(PROCESS_IDL_SETTING, processIdl)
		
		createFlows = createFlowsButton.selection
		dialogSettings.put(CREATE_FLOWS_SETTING, createFlows)
		
		super.okPressed
	}
	
	def private void validate() {
		if (filterButton.selection && tableViewer.checkedElements.empty) {
			errorMessage = "Check at least one UoP or Integration Model"
			getButton(IDialogConstants.OK_ID).enabled = false
		} else {
			errorMessage = null
			getButton(IDialogConstants.OK_ID).enabled = true
		}
	}
	
	def private void addListeners() {
		filterButton.addSelectionListener(new SelectionAdapter {
			override widgetSelected(SelectionEvent e) {
				val enable = filterButton.selection
				tableViewer.table.enabled = enable
				selectAllButton.enabled = enable
				deselectAllButton.enabled = enable
				validate
			}
		})
		tableViewer.addCheckStateListener[validate]
		selectAllButton.addSelectionListener(new SelectionAdapter {
			override widgetSelected(SelectionEvent e) {
				tableViewer.allChecked = true
				validate
			}
		})
		deselectAllButton.addSelectionListener(new SelectionAdapter {
			override widgetSelected(SelectionEvent e) {
				tableViewer.allChecked = false
				validate
			}
		})
	}
	
	def private void loadFromSettings() {
		if (dialogSettings.getBoolean(PLATFORM_ONLY_SETTING)) {
			platformOnlyButton.selection = true
		} else {
			allLevelsButton.selection = true
		}
		
		val filter = dialogSettings.getBoolean(FILTER_SETTING)
		filterButton.selection = filter
		tableViewer.table.enabled = filter
		selectAllButton.enabled = filter
		deselectAllButton.enabled = filter
		
		val checkedNames = dialogSettings.getArray(CHECKED_ELEMENTS_SETTING)?.toSet ?: emptySet
		val toCheck = uopsAndIntegrationModels.filter[checkedNames.contains(it.name)]
		if (toCheck.empty) {
			tableViewer.allChecked = true
		} else {
			tableViewer.checkedElements = toCheck
		}
		
		validate
		
		if (dialogSettings.get(PROCESS_IDL_SETTING) === null) {
			processIdlButton.selection = false
		} else {
			processIdlButton.selection = dialogSettings.getBoolean(PROCESS_IDL_SETTING)
		}
		if (dialogSettings.get(CREATE_FLOWS_SETTING) === null) {
			createFlowsButton.selection = true
		} else {
			createFlowsButton.selection = dialogSettings.getBoolean(CREATE_FLOWS_SETTING)
		}
	}
}