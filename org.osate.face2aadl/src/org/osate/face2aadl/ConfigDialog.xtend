package org.osate.face2aadl

import face.Element
import face.integration.IntegrationModel
import face.uop.PlatformSpecificComponent
import face.uop.PortableComponent
import java.util.List
import org.eclipse.jface.dialogs.TitleAreaDialog
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.jface.viewers.CheckboxTableViewer
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.swt.SWT
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.graphics.Point
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Label
import org.eclipse.swt.widgets.Shell
import org.eclipse.xtend.lib.annotations.Accessors

import static extension org.eclipse.jface.dialogs.DialogSettings.getOrCreateSection

class ConfigDialog extends TitleAreaDialog {
	val static PLATFORM_ONLY_SETTING = "PLATFORM_ONLY_SETTING"
	
	val List<Element> uopsAndIntegrationModels
	
	val dialogSettings = Activator.^default.dialogSettings.getOrCreateSection(class.name)
	Button platformOnlyButton
	CheckboxTableViewer tableViewer
	Button selectAllButton
	Button deselectAllButton
	
	@Accessors(PUBLIC_GETTER)
	boolean platformOnly
	
	new(Shell parentShell, List<Element> uopsAndIntegrationModels) {
		super(parentShell)
		this.uopsAndIntegrationModels = uopsAndIntegrationModels
	}
	
	override protected isResizable() {
		true
	}
	
	override isHelpAvailable() {
		false
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
	}
	
	override protected createDialogArea(Composite parent) {
		super.createDialogArea(parent) as Composite => [composite |
			new Composite(composite, SWT.NONE) => [levelComposite |
				levelComposite.layout = new GridLayout => [
					it.marginBottom = convertVerticalDLUsToPixels(2)
				]
				levelComposite.layoutData = new GridData(SWT.LEFT, SWT.TOP, false, false)
				new Label(levelComposite, SWT.NONE) => [label |
					label.text = "Select data model levels to translate:"
					label.layoutData = new GridData(SWT.LEFT, SWT.CENTER, false, false)
				]
				val allLevelsButton = new Button(levelComposite, SWT.RADIO) => [button |
					button.text = "Conceptual, logical, and platform"
					button.layoutData = new GridData(SWT.LEFT, SWT.CENTER, false, false)
				]
				platformOnlyButton = new Button(levelComposite, SWT.RADIO) => [button |
					button.text = "Platform only"
					button.layoutData = new GridData(SWT.LEFT, SWT.CENTER, false, false)
				]
				
				if (dialogSettings.getBoolean(PLATFORM_ONLY_SETTING)) {
					platformOnlyButton.selection = true
				} else {
					allLevelsButton.selection = true
				}
			]
			new Label(composite, SWT.SEPARATOR.bitwiseOr(SWT.HORIZONTAL)) => [label |
				label.layoutData = new GridData(SWT.FILL, SWT.CENTER, true, false)
			]
			new Composite(composite, SWT.NONE) => [filteringComposite |
				filteringComposite.layout = new GridLayout(2, false) => [
					it.marginTop = convertVerticalDLUsToPixels(2)
				]
				filteringComposite.layoutData = new GridData(SWT.FILL, SWT.FILL, true, true)
				new Label(filteringComposite, SWT.NONE) => [label |
					label.text = "Element filtering:"
					label.layoutData = new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1)
				]
				new Button(filteringComposite, SWT.CHECK) => [button |
					button.text = "Only translate elements required for the selected UoPs and Integration Models:"
					button.layoutData = new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1)
					button.addSelectionListener(new SelectionAdapter {
						override widgetSelected(SelectionEvent e) {
							val enable = button.selection
							tableViewer.table.enabled = enable
							selectAllButton.enabled = enable
							deselectAllButton.enabled = enable
						}
					})
				]
				tableViewer = CheckboxTableViewer.newCheckList(filteringComposite, SWT.BORDER) => [tableViewer |
					tableViewer.table.layoutData = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 2)
					tableViewer.table.enabled = false
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
					tableViewer.input = uopsAndIntegrationModels
					tableViewer.allChecked = true
				]
				selectAllButton = new Button(filteringComposite, SWT.PUSH) => [button |
					button.text = "Select All"
					button.layoutData = new GridData(SWT.FILL, SWT.TOP, false, false)
					button.enabled = false
					button.addSelectionListener(new SelectionAdapter {
						override widgetSelected(SelectionEvent e) {
							tableViewer.allChecked = true
						}
					})
				]
				deselectAllButton = new Button(filteringComposite, SWT.PUSH) => [button |
					button.text = "Deselect All"
					button.layoutData = new GridData(SWT.FILL, SWT.TOP, false, false)
					button.enabled = false
					button.addSelectionListener(new SelectionAdapter {
						override widgetSelected(SelectionEvent e) {
							tableViewer.allChecked = false
						}
					})
				]
			]
		]
	}
	
	override protected okPressed() {
		platformOnly = platformOnlyButton.selection
		dialogSettings.put(PLATFORM_ONLY_SETTING, platformOnly)
		super.okPressed
	}
}