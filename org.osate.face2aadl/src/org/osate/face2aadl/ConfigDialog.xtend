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
	
	val List<Element> uopsAndIntegrationModels
	
	val dialogSettings = Activator.^default.dialogSettings.getOrCreateSection(class.name)
	
	Button allLevelsButton
	Button platformOnlyButton
	Button filterButton
	CheckboxTableViewer tableViewer
	Button selectAllButton
	Button deselectAllButton
	
	@Accessors(PUBLIC_GETTER)
	boolean platformOnly
	@Accessors(PUBLIC_GETTER)
	boolean filter
	@Accessors(PUBLIC_GETTER)
	List<UnitOfPortability> selectedUoPs
	@Accessors(PUBLIC_GETTER)
	List<IntegrationModel> selectedIntegrationModels
	
	new(Shell parentShell, List<Element> uopsAndIntegrationModels) {
		super(parentShell)
		this.uopsAndIntegrationModels = uopsAndIntegrationModels
	}
	
	new (Shell parentShell, Iterable<UnitOfPortability> uops, Iterable<IntegrationModel> integrationModels) {
		super(parentShell)
		uopsAndIntegrationModels = (uops + integrationModels).toList
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
	}
}