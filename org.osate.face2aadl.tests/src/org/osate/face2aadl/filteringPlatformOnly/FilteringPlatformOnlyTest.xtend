package org.osate.face2aadl.filteringPlatformOnly

import org.osate.face2aadl.AbstractTranslatorTest

class FilteringPlatformOnlyTest extends AbstractTranslatorTest {
	new() {
		super("filteringPlatformOnly", true, #["SelectedPSSS1"], #["SelectedIntegrationModel"])
	}
}