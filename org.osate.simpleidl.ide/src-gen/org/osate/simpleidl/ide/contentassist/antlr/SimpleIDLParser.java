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
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getSimpleTypeSpecAccess().getAlternatives(), "rule__SimpleTypeSpec__Alternatives");
			builder.put(grammarAccess.getDefinitionAccess().getGroup_0(), "rule__Definition__Group_0__0");
			builder.put(grammarAccess.getDefinitionAccess().getGroup_1(), "rule__Definition__Group_1__0");
			builder.put(grammarAccess.getDefinitionAccess().getGroup_2(), "rule__Definition__Group_2__0");
			builder.put(grammarAccess.getDefinitionAccess().getGroup_3(), "rule__Definition__Group_3__0");
			builder.put(grammarAccess.getDefinitionAccess().getGroup_4(), "rule__Definition__Group_4__0");
			builder.put(grammarAccess.getDefinitionAccess().getGroup_4_5(), "rule__Definition__Group_4_5__0");
			builder.put(grammarAccess.getDefinitionAccess().getGroup_5(), "rule__Definition__Group_5__0");
			builder.put(grammarAccess.getDefinitionAccess().getGroup_5_4(), "rule__Definition__Group_5_4__0");
			builder.put(grammarAccess.getMemberAccess().getGroup(), "rule__Member__Group__0");
			builder.put(grammarAccess.getMemberAccess().getGroup_2(), "rule__Member__Group_2__0");
			builder.put(grammarAccess.getCaseAccess().getGroup(), "rule__Case__Group__0");
			builder.put(grammarAccess.getCaseAccess().getGroup_0(), "rule__Case__Group_0__0");
			builder.put(grammarAccess.getAnyDeclaratorAccess().getGroup(), "rule__AnyDeclarator__Group__0");
			builder.put(grammarAccess.getFixedArraySizeAccess().getGroup(), "rule__FixedArraySize__Group__0");
			builder.put(grammarAccess.getTypeAccess().getGroup_1(), "rule__Type__Group_1__0");
			builder.put(grammarAccess.getTypeAccess().getGroup_2(), "rule__Type__Group_2__0");
			builder.put(grammarAccess.getTypeAccess().getGroup_3(), "rule__Type__Group_3__0");
			builder.put(grammarAccess.getTypeAccess().getGroup_4(), "rule__Type__Group_4__0");
			builder.put(grammarAccess.getTypeAccess().getGroup_5(), "rule__Type__Group_5__0");
			builder.put(grammarAccess.getTypeAccess().getGroup_6(), "rule__Type__Group_6__0");
			builder.put(grammarAccess.getTypeAccess().getGroup_7(), "rule__Type__Group_7__0");
			builder.put(grammarAccess.getSimpleTypeSpecAccess().getGroup_0(), "rule__SimpleTypeSpec__Group_0__0");
			builder.put(grammarAccess.getSimpleTypeSpecAccess().getGroup_1(), "rule__SimpleTypeSpec__Group_1__0");
			builder.put(grammarAccess.getSimpleTypeSpecAccess().getGroup_2(), "rule__SimpleTypeSpec__Group_2__0");
			builder.put(grammarAccess.getSimpleTypeSpecAccess().getGroup_3(), "rule__SimpleTypeSpec__Group_3__0");
			builder.put(grammarAccess.getSimpleTypeSpecAccess().getGroup_4(), "rule__SimpleTypeSpec__Group_4__0");
			builder.put(grammarAccess.getSimpleTypeSpecAccess().getGroup_5(), "rule__SimpleTypeSpec__Group_5__0");
			builder.put(grammarAccess.getSimpleTypeSpecAccess().getGroup_6(), "rule__SimpleTypeSpec__Group_6__0");
			builder.put(grammarAccess.getSimpleTypeSpecAccess().getGroup_7(), "rule__SimpleTypeSpec__Group_7__0");
			builder.put(grammarAccess.getSimpleTypeSpecAccess().getGroup_8(), "rule__SimpleTypeSpec__Group_8__0");
			builder.put(grammarAccess.getSimpleTypeSpecAccess().getGroup_9(), "rule__SimpleTypeSpec__Group_9__0");
			builder.put(grammarAccess.getSimpleTypeSpecAccess().getGroup_10(), "rule__SimpleTypeSpec__Group_10__0");
			builder.put(grammarAccess.getSimpleTypeSpecAccess().getGroup_11(), "rule__SimpleTypeSpec__Group_11__0");
			builder.put(grammarAccess.getSimpleTypeSpecAccess().getGroup_12(), "rule__SimpleTypeSpec__Group_12__0");
			builder.put(grammarAccess.getSimpleTypeSpecAccess().getGroup_13(), "rule__SimpleTypeSpec__Group_13__0");
			builder.put(grammarAccess.getScopedNameAccess().getGroup(), "rule__ScopedName__Group__0");
			builder.put(grammarAccess.getScopedNameAccess().getGroup_1(), "rule__ScopedName__Group_1__0");
			builder.put(grammarAccess.getSpecificationAccess().getDefinitionsAssignment(), "rule__Specification__DefinitionsAssignment");
			builder.put(grammarAccess.getDefinitionAccess().getNameAssignment_0_2(), "rule__Definition__NameAssignment_0_2");
			builder.put(grammarAccess.getDefinitionAccess().getDefinitionsAssignment_0_4(), "rule__Definition__DefinitionsAssignment_0_4");
			builder.put(grammarAccess.getDefinitionAccess().getNameAssignment_1_2(), "rule__Definition__NameAssignment_1_2");
			builder.put(grammarAccess.getDefinitionAccess().getMembersAssignment_1_4(), "rule__Definition__MembersAssignment_1_4");
			builder.put(grammarAccess.getDefinitionAccess().getStructAssignment_2_2(), "rule__Definition__StructAssignment_2_2");
			builder.put(grammarAccess.getDefinitionAccess().getNameAssignment_3_2(), "rule__Definition__NameAssignment_3_2");
			builder.put(grammarAccess.getDefinitionAccess().getCasesAssignment_3_10(), "rule__Definition__CasesAssignment_3_10");
			builder.put(grammarAccess.getDefinitionAccess().getNameAssignment_4_2(), "rule__Definition__NameAssignment_4_2");
			builder.put(grammarAccess.getDefinitionAccess().getLiteralsAssignment_4_4(), "rule__Definition__LiteralsAssignment_4_4");
			builder.put(grammarAccess.getDefinitionAccess().getLiteralsAssignment_4_5_1(), "rule__Definition__LiteralsAssignment_4_5_1");
			builder.put(grammarAccess.getDefinitionAccess().getTypeAssignment_5_2(), "rule__Definition__TypeAssignment_5_2");
			builder.put(grammarAccess.getDefinitionAccess().getNamesAssignment_5_3(), "rule__Definition__NamesAssignment_5_3");
			builder.put(grammarAccess.getDefinitionAccess().getNamesAssignment_5_4_1(), "rule__Definition__NamesAssignment_5_4_1");
			builder.put(grammarAccess.getMemberAccess().getTypeAssignment_0(), "rule__Member__TypeAssignment_0");
			builder.put(grammarAccess.getMemberAccess().getNamesAssignment_1(), "rule__Member__NamesAssignment_1");
			builder.put(grammarAccess.getMemberAccess().getNamesAssignment_2_1(), "rule__Member__NamesAssignment_2_1");
			builder.put(grammarAccess.getCaseAccess().getLabelsAssignment_0_1(), "rule__Case__LabelsAssignment_0_1");
			builder.put(grammarAccess.getCaseAccess().getTypeAssignment_1(), "rule__Case__TypeAssignment_1");
			builder.put(grammarAccess.getCaseAccess().getNameAssignment_2(), "rule__Case__NameAssignment_2");
			builder.put(grammarAccess.getAnyDeclaratorAccess().getNameAssignment_0(), "rule__AnyDeclarator__NameAssignment_0");
			builder.put(grammarAccess.getAnyDeclaratorAccess().getArraySizeAssignment_1(), "rule__AnyDeclarator__ArraySizeAssignment_1");
			builder.put(grammarAccess.getFixedArraySizeAccess().getSizeAssignment_1(), "rule__FixedArraySize__SizeAssignment_1");
			builder.put(grammarAccess.getTypeAccess().getTypeAssignment_1_3(), "rule__Type__TypeAssignment_1_3");
			builder.put(grammarAccess.getTypeAccess().getSizeAssignment_1_5(), "rule__Type__SizeAssignment_1_5");
			builder.put(grammarAccess.getTypeAccess().getTypeAssignment_2_3(), "rule__Type__TypeAssignment_2_3");
			builder.put(grammarAccess.getTypeAccess().getSizeAssignment_3_3(), "rule__Type__SizeAssignment_3_3");
			builder.put(grammarAccess.getTypeAccess().getSizeAssignment_5_3(), "rule__Type__SizeAssignment_5_3");
			builder.put(grammarAccess.getTypeAccess().getTotalDigitsAssignment_7_3(), "rule__Type__TotalDigitsAssignment_7_3");
			builder.put(grammarAccess.getTypeAccess().getFractionalDigitsAssignment_7_5(), "rule__Type__FractionalDigitsAssignment_7_5");
			builder.put(grammarAccess.getSimpleTypeSpecAccess().getTypeAssignment_13_1(), "rule__SimpleTypeSpec__TypeAssignment_13_1");
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
