/*******************************************************************************
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
 *******************************************************************************/
package org.osate.simpleidl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.osate.simpleidl.ide.contentassist.antlr.internal.InternalSimpleIDLParser;
import org.osate.simpleidl.services.SimpleIDLGrammarAccess;

public class SimpleIDLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(SimpleIDLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, SimpleIDLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getDefinitionAccess().getAlternatives(), "rule__Definition__Alternatives");
			builder.put(grammarAccess.getNamedDefinitionAccess().getAlternatives(), "rule__NamedDefinition__Alternatives");
			builder.put(grammarAccess.getDefinitionAccess().getGroup_1(), "rule__Definition__Group_1__0");
			builder.put(grammarAccess.getNamedDefinitionAccess().getGroup_0(), "rule__NamedDefinition__Group_0__0");
			builder.put(grammarAccess.getNamedDefinitionAccess().getGroup_1(), "rule__NamedDefinition__Group_1__0");
			builder.put(grammarAccess.getNamedDefinitionAccess().getGroup_2(), "rule__NamedDefinition__Group_2__0");
			builder.put(grammarAccess.getNamedDefinitionAccess().getGroup_3(), "rule__NamedDefinition__Group_3__0");
			builder.put(grammarAccess.getNamedDefinitionAccess().getGroup_3_5(), "rule__NamedDefinition__Group_3_5__0");
			builder.put(grammarAccess.getNamedDefinitionAccess().getGroup_4(), "rule__NamedDefinition__Group_4__0");
			builder.put(grammarAccess.getNamedDefinitionAccess().getGroup_5(), "rule__NamedDefinition__Group_5__0");
			builder.put(grammarAccess.getNamedDefinitionAccess().getGroup_6(), "rule__NamedDefinition__Group_6__0");
			builder.put(grammarAccess.getNamedDefinitionAccess().getGroup_7(), "rule__NamedDefinition__Group_7__0");
			builder.put(grammarAccess.getNamedDefinitionAccess().getGroup_8(), "rule__NamedDefinition__Group_8__0");
			builder.put(grammarAccess.getNamedDefinitionAccess().getGroup_9(), "rule__NamedDefinition__Group_9__0");
			builder.put(grammarAccess.getNamedDefinitionAccess().getGroup_10(), "rule__NamedDefinition__Group_10__0");
			builder.put(grammarAccess.getNamedDefinitionAccess().getGroup_11(), "rule__NamedDefinition__Group_11__0");
			builder.put(grammarAccess.getNamedDefinitionAccess().getGroup_12(), "rule__NamedDefinition__Group_12__0");
			builder.put(grammarAccess.getNamedDefinitionAccess().getGroup_13(), "rule__NamedDefinition__Group_13__0");
			builder.put(grammarAccess.getNamedDefinitionAccess().getGroup_14(), "rule__NamedDefinition__Group_14__0");
			builder.put(grammarAccess.getNamedDefinitionAccess().getGroup_15(), "rule__NamedDefinition__Group_15__0");
			builder.put(grammarAccess.getNamedDefinitionAccess().getGroup_16(), "rule__NamedDefinition__Group_16__0");
			builder.put(grammarAccess.getNamedDefinitionAccess().getGroup_17(), "rule__NamedDefinition__Group_17__0");
			builder.put(grammarAccess.getNamedDefinitionAccess().getGroup_18(), "rule__NamedDefinition__Group_18__0");
			builder.put(grammarAccess.getNamedDefinitionAccess().getGroup_19(), "rule__NamedDefinition__Group_19__0");
			builder.put(grammarAccess.getNamedDefinitionAccess().getGroup_20(), "rule__NamedDefinition__Group_20__0");
			builder.put(grammarAccess.getNamedDefinitionAccess().getGroup_21(), "rule__NamedDefinition__Group_21__0");
			builder.put(grammarAccess.getNamedDefinitionAccess().getGroup_22(), "rule__NamedDefinition__Group_22__0");
			builder.put(grammarAccess.getNamedDefinitionAccess().getGroup_23(), "rule__NamedDefinition__Group_23__0");
			builder.put(grammarAccess.getNamedDefinitionAccess().getGroup_24(), "rule__NamedDefinition__Group_24__0");
			builder.put(grammarAccess.getNamedDefinitionAccess().getGroup_25(), "rule__NamedDefinition__Group_25__0");
			builder.put(grammarAccess.getMemberAccess().getGroup(), "rule__Member__Group__0");
			builder.put(grammarAccess.getCaseAccess().getGroup(), "rule__Case__Group__0");
			builder.put(grammarAccess.getCaseAccess().getGroup_0(), "rule__Case__Group_0__0");
			builder.put(grammarAccess.getScopedNameAccess().getGroup(), "rule__ScopedName__Group__0");
			builder.put(grammarAccess.getScopedNameAccess().getGroup_1(), "rule__ScopedName__Group_1__0");
			builder.put(grammarAccess.getSpecificationAccess().getDefinitionsAssignment(), "rule__Specification__DefinitionsAssignment");
			builder.put(grammarAccess.getDefinitionAccess().getStructAssignment_1_2(), "rule__Definition__StructAssignment_1_2");
			builder.put(grammarAccess.getNamedDefinitionAccess().getNameAssignment_0_2(), "rule__NamedDefinition__NameAssignment_0_2");
			builder.put(grammarAccess.getNamedDefinitionAccess().getDefinitionsAssignment_0_4(), "rule__NamedDefinition__DefinitionsAssignment_0_4");
			builder.put(grammarAccess.getNamedDefinitionAccess().getNameAssignment_1_2(), "rule__NamedDefinition__NameAssignment_1_2");
			builder.put(grammarAccess.getNamedDefinitionAccess().getMembersAssignment_1_4(), "rule__NamedDefinition__MembersAssignment_1_4");
			builder.put(grammarAccess.getNamedDefinitionAccess().getNameAssignment_2_2(), "rule__NamedDefinition__NameAssignment_2_2");
			builder.put(grammarAccess.getNamedDefinitionAccess().getCasesAssignment_2_10(), "rule__NamedDefinition__CasesAssignment_2_10");
			builder.put(grammarAccess.getNamedDefinitionAccess().getNameAssignment_3_2(), "rule__NamedDefinition__NameAssignment_3_2");
			builder.put(grammarAccess.getNamedDefinitionAccess().getLiteralsAssignment_3_4(), "rule__NamedDefinition__LiteralsAssignment_3_4");
			builder.put(grammarAccess.getNamedDefinitionAccess().getLiteralsAssignment_3_5_1(), "rule__NamedDefinition__LiteralsAssignment_3_5_1");
			builder.put(grammarAccess.getNamedDefinitionAccess().getTypeAssignment_4_2(), "rule__NamedDefinition__TypeAssignment_4_2");
			builder.put(grammarAccess.getNamedDefinitionAccess().getNameAssignment_4_3(), "rule__NamedDefinition__NameAssignment_4_3");
			builder.put(grammarAccess.getNamedDefinitionAccess().getSizeAssignment_4_5(), "rule__NamedDefinition__SizeAssignment_4_5");
			builder.put(grammarAccess.getNamedDefinitionAccess().getNameAssignment_5_3(), "rule__NamedDefinition__NameAssignment_5_3");
			builder.put(grammarAccess.getNamedDefinitionAccess().getNameAssignment_6_3(), "rule__NamedDefinition__NameAssignment_6_3");
			builder.put(grammarAccess.getNamedDefinitionAccess().getNameAssignment_7_4(), "rule__NamedDefinition__NameAssignment_7_4");
			builder.put(grammarAccess.getNamedDefinitionAccess().getNameAssignment_8_4(), "rule__NamedDefinition__NameAssignment_8_4");
			builder.put(grammarAccess.getNamedDefinitionAccess().getNameAssignment_9_4(), "rule__NamedDefinition__NameAssignment_9_4");
			builder.put(grammarAccess.getNamedDefinitionAccess().getNameAssignment_10_5(), "rule__NamedDefinition__NameAssignment_10_5");
			builder.put(grammarAccess.getNamedDefinitionAccess().getNameAssignment_11_3(), "rule__NamedDefinition__NameAssignment_11_3");
			builder.put(grammarAccess.getNamedDefinitionAccess().getNameAssignment_12_3(), "rule__NamedDefinition__NameAssignment_12_3");
			builder.put(grammarAccess.getNamedDefinitionAccess().getNameAssignment_13_4(), "rule__NamedDefinition__NameAssignment_13_4");
			builder.put(grammarAccess.getNamedDefinitionAccess().getNameAssignment_14_3(), "rule__NamedDefinition__NameAssignment_14_3");
			builder.put(grammarAccess.getNamedDefinitionAccess().getNameAssignment_15_3(), "rule__NamedDefinition__NameAssignment_15_3");
			builder.put(grammarAccess.getNamedDefinitionAccess().getNameAssignment_16_3(), "rule__NamedDefinition__NameAssignment_16_3");
			builder.put(grammarAccess.getNamedDefinitionAccess().getNameAssignment_17_3(), "rule__NamedDefinition__NameAssignment_17_3");
			builder.put(grammarAccess.getNamedDefinitionAccess().getTypeAssignment_18_2(), "rule__NamedDefinition__TypeAssignment_18_2");
			builder.put(grammarAccess.getNamedDefinitionAccess().getNameAssignment_18_3(), "rule__NamedDefinition__NameAssignment_18_3");
			builder.put(grammarAccess.getNamedDefinitionAccess().getTypeAssignment_19_4(), "rule__NamedDefinition__TypeAssignment_19_4");
			builder.put(grammarAccess.getNamedDefinitionAccess().getSizeAssignment_19_6(), "rule__NamedDefinition__SizeAssignment_19_6");
			builder.put(grammarAccess.getNamedDefinitionAccess().getNameAssignment_19_8(), "rule__NamedDefinition__NameAssignment_19_8");
			builder.put(grammarAccess.getNamedDefinitionAccess().getTypeAssignment_20_4(), "rule__NamedDefinition__TypeAssignment_20_4");
			builder.put(grammarAccess.getNamedDefinitionAccess().getNameAssignment_20_6(), "rule__NamedDefinition__NameAssignment_20_6");
			builder.put(grammarAccess.getNamedDefinitionAccess().getSizeAssignment_21_4(), "rule__NamedDefinition__SizeAssignment_21_4");
			builder.put(grammarAccess.getNamedDefinitionAccess().getNameAssignment_21_6(), "rule__NamedDefinition__NameAssignment_21_6");
			builder.put(grammarAccess.getNamedDefinitionAccess().getNameAssignment_22_3(), "rule__NamedDefinition__NameAssignment_22_3");
			builder.put(grammarAccess.getNamedDefinitionAccess().getSizeAssignment_23_4(), "rule__NamedDefinition__SizeAssignment_23_4");
			builder.put(grammarAccess.getNamedDefinitionAccess().getNameAssignment_23_6(), "rule__NamedDefinition__NameAssignment_23_6");
			builder.put(grammarAccess.getNamedDefinitionAccess().getNameAssignment_24_3(), "rule__NamedDefinition__NameAssignment_24_3");
			builder.put(grammarAccess.getNamedDefinitionAccess().getTotalDigitsAssignment_25_4(), "rule__NamedDefinition__TotalDigitsAssignment_25_4");
			builder.put(grammarAccess.getNamedDefinitionAccess().getFractionalDigitsAssignment_25_6(), "rule__NamedDefinition__FractionalDigitsAssignment_25_6");
			builder.put(grammarAccess.getNamedDefinitionAccess().getNameAssignment_25_8(), "rule__NamedDefinition__NameAssignment_25_8");
			builder.put(grammarAccess.getMemberAccess().getTypeAssignment_0(), "rule__Member__TypeAssignment_0");
			builder.put(grammarAccess.getMemberAccess().getNameAssignment_1(), "rule__Member__NameAssignment_1");
			builder.put(grammarAccess.getCaseAccess().getLabelsAssignment_0_1(), "rule__Case__LabelsAssignment_0_1");
			builder.put(grammarAccess.getCaseAccess().getTypeAssignment_1(), "rule__Case__TypeAssignment_1");
			builder.put(grammarAccess.getCaseAccess().getNameAssignment_2(), "rule__Case__NameAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private SimpleIDLGrammarAccess grammarAccess;

	@Override
	protected InternalSimpleIDLParser createParser() {
		InternalSimpleIDLParser result = new InternalSimpleIDLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_PREPROCESSOR" };
	}

	public SimpleIDLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SimpleIDLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
