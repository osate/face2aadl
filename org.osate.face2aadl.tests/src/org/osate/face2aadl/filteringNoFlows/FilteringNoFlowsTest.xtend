package org.osate.face2aadl.filteringNoFlows

import org.osate.face2aadl.AbstractTranslatorTest

class FilteringNoFlowsTest extends AbstractTranslatorTest {
	new() {
		super("filteringNoFlows", false, #["SelectedPSSS1"], #["SelectedIntegrationModel"], false)
	}
}