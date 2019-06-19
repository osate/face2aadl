package org.osate.face2aadl

import org.eclipse.jface.dialogs.Dialog
import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Label
import org.eclipse.swt.widgets.Shell
import org.eclipse.xtend.lib.annotations.Accessors

import static extension org.eclipse.jface.dialogs.DialogSettings.getOrCreateSection

class ConfigDialog extends Dialog {
	val static PLATFORM_ONLY_SETTING = "PLATFORM_ONLY_SETTING"
	
	val dialogSettings = Activator.^default.dialogSettings.getOrCreateSection(class.name)
	Button platformOnlyButton
	
	@Accessors(PUBLIC_GETTER)
	boolean platformOnly
	
	new(Shell parentShell) {
		super(parentShell)
	}
	
	override protected configureShell(Shell newShell) {
		super.configureShell(newShell)
		newShell.text = "Translate to AADL"
	}
	
	override protected createDialogArea(Composite parent) {
		super.createDialogArea(parent) as Composite => [composite |
			new Label(composite, SWT.NONE) => [label |
				label.text = "Select data model levels to translate:"
			]
			val allLevelsButton = new Button(composite, SWT.RADIO) => [button |
				button.text = "Conceptual, logical, and platform"
			]
			platformOnlyButton = new Button(composite, SWT.RADIO) => [button |
				button.text = "Platform only"
			]
			if (dialogSettings.getBoolean(PLATFORM_ONLY_SETTING)) {
				platformOnlyButton.selection = true
			} else {
				allLevelsButton.selection = true
			}
		]
	}
	
	override protected okPressed() {
		platformOnly = platformOnlyButton.selection
		dialogSettings.put(PLATFORM_ONLY_SETTING, platformOnly)
		super.okPressed
	}
}