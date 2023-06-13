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
grammar InternalSimpleIDL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.osate.simpleidl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.osate.simpleidl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.osate.simpleidl.services.SimpleIDLGrammarAccess;

}

@parser::members {

 	private SimpleIDLGrammarAccess grammarAccess;

    public InternalSimpleIDLParser(TokenStream input, SimpleIDLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Specification";
   	}

   	@Override
   	protected SimpleIDLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleSpecification
entryRuleSpecification returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSpecificationRule()); }
	iv_ruleSpecification=ruleSpecification
	{ $current=$iv_ruleSpecification.current; }
	EOF;

// Rule Specification
ruleSpecification returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getSpecificationAccess().getDefinitionsDefinitionParserRuleCall_0());
			}
			lv_definitions_0_0=ruleDefinition
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getSpecificationRule());
				}
				add(
					$current,
					"definitions",
					lv_definitions_0_0,
					"org.osate.simpleidl.SimpleIDL.Definition");
				afterParserOrEnumRuleCall();
			}
		)
	)+
;

// Entry rule entryRuleDefinition
entryRuleDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefinitionRule()); }
	iv_ruleDefinition=ruleDefinition
	{ $current=$iv_ruleDefinition.current; }
	EOF;

// Rule Definition
ruleDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getDefinitionAccess().getNamedDefinitionParserRuleCall_0());
		}
		this_NamedDefinition_0=ruleNamedDefinition
		{
			$current = $this_NamedDefinition_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getDefinitionAccess().getStructForwardAction_1_0(),
						$current);
				}
			)
			otherlv_2='struct'
			{
				newLeafNode(otherlv_2, grammarAccess.getDefinitionAccess().getStructKeyword_1_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDefinitionRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getDefinitionAccess().getStructStructCrossReference_1_2_0());
					}
				)
			)
			otherlv_4=';'
			{
				newLeafNode(otherlv_4, grammarAccess.getDefinitionAccess().getSemicolonKeyword_1_3());
			}
		)
	)
;

// Entry rule entryRuleNamedDefinition
entryRuleNamedDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNamedDefinitionRule()); }
	iv_ruleNamedDefinition=ruleNamedDefinition
	{ $current=$iv_ruleNamedDefinition.current; }
	EOF;

// Rule NamedDefinition
ruleNamedDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNamedDefinitionAccess().getModuleAction_0_0(),
						$current);
				}
			)
			otherlv_1='module'
			{
				newLeafNode(otherlv_1, grammarAccess.getNamedDefinitionAccess().getModuleKeyword_0_1());
			}
			(
				(
					lv_name_2_0=RULE_ID
					{
						newLeafNode(lv_name_2_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_0_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_2_0,
							"org.osate.simpleidl.SimpleIDL.ID");
					}
				)
			)
			otherlv_3='{'
			{
				newLeafNode(otherlv_3, grammarAccess.getNamedDefinitionAccess().getLeftCurlyBracketKeyword_0_3());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNamedDefinitionAccess().getDefinitionsDefinitionParserRuleCall_0_4_0());
					}
					lv_definitions_4_0=ruleDefinition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNamedDefinitionRule());
						}
						add(
							$current,
							"definitions",
							lv_definitions_4_0,
							"org.osate.simpleidl.SimpleIDL.Definition");
						afterParserOrEnumRuleCall();
					}
				)
			)+
			otherlv_5='}'
			{
				newLeafNode(otherlv_5, grammarAccess.getNamedDefinitionAccess().getRightCurlyBracketKeyword_0_5());
			}
			otherlv_6=';'
			{
				newLeafNode(otherlv_6, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_0_6());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNamedDefinitionAccess().getStructAction_1_0(),
						$current);
				}
			)
			otherlv_8='struct'
			{
				newLeafNode(otherlv_8, grammarAccess.getNamedDefinitionAccess().getStructKeyword_1_1());
			}
			(
				(
					lv_name_9_0=RULE_ID
					{
						newLeafNode(lv_name_9_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_1_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_9_0,
							"org.osate.simpleidl.SimpleIDL.ID");
					}
				)
			)
			otherlv_10='{'
			{
				newLeafNode(otherlv_10, grammarAccess.getNamedDefinitionAccess().getLeftCurlyBracketKeyword_1_3());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNamedDefinitionAccess().getMembersMemberParserRuleCall_1_4_0());
					}
					lv_members_11_0=ruleMember
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNamedDefinitionRule());
						}
						add(
							$current,
							"members",
							lv_members_11_0,
							"org.osate.simpleidl.SimpleIDL.Member");
						afterParserOrEnumRuleCall();
					}
				)
			)+
			otherlv_12='}'
			{
				newLeafNode(otherlv_12, grammarAccess.getNamedDefinitionAccess().getRightCurlyBracketKeyword_1_5());
			}
			otherlv_13=';'
			{
				newLeafNode(otherlv_13, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_1_6());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNamedDefinitionAccess().getUnionAction_2_0(),
						$current);
				}
			)
			otherlv_15='union'
			{
				newLeafNode(otherlv_15, grammarAccess.getNamedDefinitionAccess().getUnionKeyword_2_1());
			}
			(
				(
					lv_name_16_0=RULE_ID
					{
						newLeafNode(lv_name_16_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_2_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_16_0,
							"org.osate.simpleidl.SimpleIDL.ID");
					}
				)
			)
			otherlv_17='{'
			{
				newLeafNode(otherlv_17, grammarAccess.getNamedDefinitionAccess().getLeftCurlyBracketKeyword_2_3());
			}
			otherlv_18='switch'
			{
				newLeafNode(otherlv_18, grammarAccess.getNamedDefinitionAccess().getSwitchKeyword_2_4());
			}
			otherlv_19='('
			{
				newLeafNode(otherlv_19, grammarAccess.getNamedDefinitionAccess().getLeftParenthesisKeyword_2_5());
			}
			otherlv_20='unsigned'
			{
				newLeafNode(otherlv_20, grammarAccess.getNamedDefinitionAccess().getUnsignedKeyword_2_6());
			}
			otherlv_21='short'
			{
				newLeafNode(otherlv_21, grammarAccess.getNamedDefinitionAccess().getShortKeyword_2_7());
			}
			otherlv_22=')'
			{
				newLeafNode(otherlv_22, grammarAccess.getNamedDefinitionAccess().getRightParenthesisKeyword_2_8());
			}
			otherlv_23='{'
			{
				newLeafNode(otherlv_23, grammarAccess.getNamedDefinitionAccess().getLeftCurlyBracketKeyword_2_9());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNamedDefinitionAccess().getCasesCaseParserRuleCall_2_10_0());
					}
					lv_cases_24_0=ruleCase
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNamedDefinitionRule());
						}
						add(
							$current,
							"cases",
							lv_cases_24_0,
							"org.osate.simpleidl.SimpleIDL.Case");
						afterParserOrEnumRuleCall();
					}
				)
			)+
			otherlv_25='}'
			{
				newLeafNode(otherlv_25, grammarAccess.getNamedDefinitionAccess().getRightCurlyBracketKeyword_2_11());
			}
			otherlv_26=';'
			{
				newLeafNode(otherlv_26, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_2_12());
			}
			otherlv_27='}'
			{
				newLeafNode(otherlv_27, grammarAccess.getNamedDefinitionAccess().getRightCurlyBracketKeyword_2_13());
			}
			otherlv_28=';'
			{
				newLeafNode(otherlv_28, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_2_14());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNamedDefinitionAccess().getEnumAction_3_0(),
						$current);
				}
			)
			otherlv_30='enum'
			{
				newLeafNode(otherlv_30, grammarAccess.getNamedDefinitionAccess().getEnumKeyword_3_1());
			}
			(
				(
					lv_name_31_0=RULE_ID
					{
						newLeafNode(lv_name_31_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_3_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_31_0,
							"org.osate.simpleidl.SimpleIDL.ID");
					}
				)
			)
			otherlv_32='{'
			{
				newLeafNode(otherlv_32, grammarAccess.getNamedDefinitionAccess().getLeftCurlyBracketKeyword_3_3());
			}
			(
				(
					lv_literals_33_0=RULE_ID
					{
						newLeafNode(lv_literals_33_0, grammarAccess.getNamedDefinitionAccess().getLiteralsIDTerminalRuleCall_3_4_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
						addWithLastConsumed(
							$current,
							"literals",
							lv_literals_33_0,
							"org.osate.simpleidl.SimpleIDL.ID");
					}
				)
			)
			(
				otherlv_34=','
				{
					newLeafNode(otherlv_34, grammarAccess.getNamedDefinitionAccess().getCommaKeyword_3_5_0());
				}
				(
					(
						lv_literals_35_0=RULE_ID
						{
							newLeafNode(lv_literals_35_0, grammarAccess.getNamedDefinitionAccess().getLiteralsIDTerminalRuleCall_3_5_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getNamedDefinitionRule());
							}
							addWithLastConsumed(
								$current,
								"literals",
								lv_literals_35_0,
								"org.osate.simpleidl.SimpleIDL.ID");
						}
					)
				)
			)*
			otherlv_36='}'
			{
				newLeafNode(otherlv_36, grammarAccess.getNamedDefinitionAccess().getRightCurlyBracketKeyword_3_6());
			}
			otherlv_37=';'
			{
				newLeafNode(otherlv_37, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_3_7());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNamedDefinitionAccess().getArrayTypeAction_4_0(),
						$current);
				}
			)
			otherlv_39='typedef'
			{
				newLeafNode(otherlv_39, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_4_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionCrossReference_4_2_0());
					}
					ruleScopedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					lv_name_41_0=RULE_ID
					{
						newLeafNode(lv_name_41_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_4_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_41_0,
							"org.osate.simpleidl.SimpleIDL.ID");
					}
				)
			)
			otherlv_42='['
			{
				newLeafNode(otherlv_42, grammarAccess.getNamedDefinitionAccess().getLeftSquareBracketKeyword_4_4());
			}
			(
				(
					lv_size_43_0=RULE_INT
					{
						newLeafNode(lv_size_43_0, grammarAccess.getNamedDefinitionAccess().getSizeINTTerminalRuleCall_4_5_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"size",
							lv_size_43_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			otherlv_44=']'
			{
				newLeafNode(otherlv_44, grammarAccess.getNamedDefinitionAccess().getRightSquareBracketKeyword_4_6());
			}
			otherlv_45=';'
			{
				newLeafNode(otherlv_45, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_4_7());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNamedDefinitionAccess().getSignedShortIntAction_5_0(),
						$current);
				}
			)
			otherlv_47='typedef'
			{
				newLeafNode(otherlv_47, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_5_1());
			}
			otherlv_48='short'
			{
				newLeafNode(otherlv_48, grammarAccess.getNamedDefinitionAccess().getShortKeyword_5_2());
			}
			(
				(
					lv_name_49_0=RULE_ID
					{
						newLeafNode(lv_name_49_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_5_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_49_0,
							"org.osate.simpleidl.SimpleIDL.ID");
					}
				)
			)
			otherlv_50=';'
			{
				newLeafNode(otherlv_50, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_5_4());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNamedDefinitionAccess().getSignedLongIntAction_6_0(),
						$current);
				}
			)
			otherlv_52='typedef'
			{
				newLeafNode(otherlv_52, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_6_1());
			}
			otherlv_53='long'
			{
				newLeafNode(otherlv_53, grammarAccess.getNamedDefinitionAccess().getLongKeyword_6_2());
			}
			(
				(
					lv_name_54_0=RULE_ID
					{
						newLeafNode(lv_name_54_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_6_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_54_0,
							"org.osate.simpleidl.SimpleIDL.ID");
					}
				)
			)
			otherlv_55=';'
			{
				newLeafNode(otherlv_55, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_6_4());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNamedDefinitionAccess().getSignedLongLongIntAction_7_0(),
						$current);
				}
			)
			otherlv_57='typedef'
			{
				newLeafNode(otherlv_57, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_7_1());
			}
			otherlv_58='long'
			{
				newLeafNode(otherlv_58, grammarAccess.getNamedDefinitionAccess().getLongKeyword_7_2());
			}
			otherlv_59='long'
			{
				newLeafNode(otherlv_59, grammarAccess.getNamedDefinitionAccess().getLongKeyword_7_3());
			}
			(
				(
					lv_name_60_0=RULE_ID
					{
						newLeafNode(lv_name_60_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_7_4_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_60_0,
							"org.osate.simpleidl.SimpleIDL.ID");
					}
				)
			)
			otherlv_61=';'
			{
				newLeafNode(otherlv_61, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_7_5());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNamedDefinitionAccess().getUnsignedShortIntAction_8_0(),
						$current);
				}
			)
			otherlv_63='typedef'
			{
				newLeafNode(otherlv_63, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_8_1());
			}
			otherlv_64='unsigned'
			{
				newLeafNode(otherlv_64, grammarAccess.getNamedDefinitionAccess().getUnsignedKeyword_8_2());
			}
			otherlv_65='short'
			{
				newLeafNode(otherlv_65, grammarAccess.getNamedDefinitionAccess().getShortKeyword_8_3());
			}
			(
				(
					lv_name_66_0=RULE_ID
					{
						newLeafNode(lv_name_66_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_8_4_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_66_0,
							"org.osate.simpleidl.SimpleIDL.ID");
					}
				)
			)
			otherlv_67=';'
			{
				newLeafNode(otherlv_67, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_8_5());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNamedDefinitionAccess().getUnsignedLongIntAction_9_0(),
						$current);
				}
			)
			otherlv_69='typedef'
			{
				newLeafNode(otherlv_69, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_9_1());
			}
			otherlv_70='unsigned'
			{
				newLeafNode(otherlv_70, grammarAccess.getNamedDefinitionAccess().getUnsignedKeyword_9_2());
			}
			otherlv_71='long'
			{
				newLeafNode(otherlv_71, grammarAccess.getNamedDefinitionAccess().getLongKeyword_9_3());
			}
			(
				(
					lv_name_72_0=RULE_ID
					{
						newLeafNode(lv_name_72_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_9_4_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_72_0,
							"org.osate.simpleidl.SimpleIDL.ID");
					}
				)
			)
			otherlv_73=';'
			{
				newLeafNode(otherlv_73, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_9_5());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNamedDefinitionAccess().getUnsignedLongLongIntAction_10_0(),
						$current);
				}
			)
			otherlv_75='typedef'
			{
				newLeafNode(otherlv_75, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_10_1());
			}
			otherlv_76='unsigned'
			{
				newLeafNode(otherlv_76, grammarAccess.getNamedDefinitionAccess().getUnsignedKeyword_10_2());
			}
			otherlv_77='long'
			{
				newLeafNode(otherlv_77, grammarAccess.getNamedDefinitionAccess().getLongKeyword_10_3());
			}
			otherlv_78='long'
			{
				newLeafNode(otherlv_78, grammarAccess.getNamedDefinitionAccess().getLongKeyword_10_4());
			}
			(
				(
					lv_name_79_0=RULE_ID
					{
						newLeafNode(lv_name_79_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_10_5_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_79_0,
							"org.osate.simpleidl.SimpleIDL.ID");
					}
				)
			)
			otherlv_80=';'
			{
				newLeafNode(otherlv_80, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_10_6());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNamedDefinitionAccess().getFloatTypeAction_11_0(),
						$current);
				}
			)
			otherlv_82='typedef'
			{
				newLeafNode(otherlv_82, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_11_1());
			}
			otherlv_83='float'
			{
				newLeafNode(otherlv_83, grammarAccess.getNamedDefinitionAccess().getFloatKeyword_11_2());
			}
			(
				(
					lv_name_84_0=RULE_ID
					{
						newLeafNode(lv_name_84_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_11_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_84_0,
							"org.osate.simpleidl.SimpleIDL.ID");
					}
				)
			)
			otherlv_85=';'
			{
				newLeafNode(otherlv_85, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_11_4());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNamedDefinitionAccess().getDoubleTypeAction_12_0(),
						$current);
				}
			)
			otherlv_87='typedef'
			{
				newLeafNode(otherlv_87, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_12_1());
			}
			otherlv_88='double'
			{
				newLeafNode(otherlv_88, grammarAccess.getNamedDefinitionAccess().getDoubleKeyword_12_2());
			}
			(
				(
					lv_name_89_0=RULE_ID
					{
						newLeafNode(lv_name_89_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_12_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_89_0,
							"org.osate.simpleidl.SimpleIDL.ID");
					}
				)
			)
			otherlv_90=';'
			{
				newLeafNode(otherlv_90, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_12_4());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNamedDefinitionAccess().getLongDoubleTypeAction_13_0(),
						$current);
				}
			)
			otherlv_92='typedef'
			{
				newLeafNode(otherlv_92, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_13_1());
			}
			otherlv_93='long'
			{
				newLeafNode(otherlv_93, grammarAccess.getNamedDefinitionAccess().getLongKeyword_13_2());
			}
			otherlv_94='double'
			{
				newLeafNode(otherlv_94, grammarAccess.getNamedDefinitionAccess().getDoubleKeyword_13_3());
			}
			(
				(
					lv_name_95_0=RULE_ID
					{
						newLeafNode(lv_name_95_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_13_4_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_95_0,
							"org.osate.simpleidl.SimpleIDL.ID");
					}
				)
			)
			otherlv_96=';'
			{
				newLeafNode(otherlv_96, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_13_5());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNamedDefinitionAccess().getCharTypeAction_14_0(),
						$current);
				}
			)
			otherlv_98='typedef'
			{
				newLeafNode(otherlv_98, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_14_1());
			}
			otherlv_99='char'
			{
				newLeafNode(otherlv_99, grammarAccess.getNamedDefinitionAccess().getCharKeyword_14_2());
			}
			(
				(
					lv_name_100_0=RULE_ID
					{
						newLeafNode(lv_name_100_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_14_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_100_0,
							"org.osate.simpleidl.SimpleIDL.ID");
					}
				)
			)
			otherlv_101=';'
			{
				newLeafNode(otherlv_101, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_14_4());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNamedDefinitionAccess().getWideCharTypeAction_15_0(),
						$current);
				}
			)
			otherlv_103='typedef'
			{
				newLeafNode(otherlv_103, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_15_1());
			}
			otherlv_104='wchar'
			{
				newLeafNode(otherlv_104, grammarAccess.getNamedDefinitionAccess().getWcharKeyword_15_2());
			}
			(
				(
					lv_name_105_0=RULE_ID
					{
						newLeafNode(lv_name_105_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_15_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_105_0,
							"org.osate.simpleidl.SimpleIDL.ID");
					}
				)
			)
			otherlv_106=';'
			{
				newLeafNode(otherlv_106, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_15_4());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNamedDefinitionAccess().getBooleanTypeAction_16_0(),
						$current);
				}
			)
			otherlv_108='typedef'
			{
				newLeafNode(otherlv_108, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_16_1());
			}
			otherlv_109='boolean'
			{
				newLeafNode(otherlv_109, grammarAccess.getNamedDefinitionAccess().getBooleanKeyword_16_2());
			}
			(
				(
					lv_name_110_0=RULE_ID
					{
						newLeafNode(lv_name_110_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_16_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_110_0,
							"org.osate.simpleidl.SimpleIDL.ID");
					}
				)
			)
			otherlv_111=';'
			{
				newLeafNode(otherlv_111, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_16_4());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNamedDefinitionAccess().getOctetTypeAction_17_0(),
						$current);
				}
			)
			otherlv_113='typedef'
			{
				newLeafNode(otherlv_113, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_17_1());
			}
			otherlv_114='octet'
			{
				newLeafNode(otherlv_114, grammarAccess.getNamedDefinitionAccess().getOctetKeyword_17_2());
			}
			(
				(
					lv_name_115_0=RULE_ID
					{
						newLeafNode(lv_name_115_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_17_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_115_0,
							"org.osate.simpleidl.SimpleIDL.ID");
					}
				)
			)
			otherlv_116=';'
			{
				newLeafNode(otherlv_116, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_17_4());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNamedDefinitionAccess().getReferencedTypeAction_18_0(),
						$current);
				}
			)
			otherlv_118='typedef'
			{
				newLeafNode(otherlv_118, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_18_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionCrossReference_18_2_0());
					}
					ruleScopedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					lv_name_120_0=RULE_ID
					{
						newLeafNode(lv_name_120_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_18_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_120_0,
							"org.osate.simpleidl.SimpleIDL.ID");
					}
				)
			)
			otherlv_121=';'
			{
				newLeafNode(otherlv_121, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_18_4());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNamedDefinitionAccess().getBoundedSequenceAction_19_0(),
						$current);
				}
			)
			otherlv_123='typedef'
			{
				newLeafNode(otherlv_123, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_19_1());
			}
			otherlv_124='sequence'
			{
				newLeafNode(otherlv_124, grammarAccess.getNamedDefinitionAccess().getSequenceKeyword_19_2());
			}
			otherlv_125='<'
			{
				newLeafNode(otherlv_125, grammarAccess.getNamedDefinitionAccess().getLessThanSignKeyword_19_3());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionCrossReference_19_4_0());
					}
					ruleScopedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_127=','
			{
				newLeafNode(otherlv_127, grammarAccess.getNamedDefinitionAccess().getCommaKeyword_19_5());
			}
			(
				(
					lv_size_128_0=RULE_INT
					{
						newLeafNode(lv_size_128_0, grammarAccess.getNamedDefinitionAccess().getSizeINTTerminalRuleCall_19_6_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"size",
							lv_size_128_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			otherlv_129='>'
			{
				newLeafNode(otherlv_129, grammarAccess.getNamedDefinitionAccess().getGreaterThanSignKeyword_19_7());
			}
			(
				(
					lv_name_130_0=RULE_ID
					{
						newLeafNode(lv_name_130_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_19_8_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_130_0,
							"org.osate.simpleidl.SimpleIDL.ID");
					}
				)
			)
			otherlv_131=';'
			{
				newLeafNode(otherlv_131, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_19_9());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNamedDefinitionAccess().getUnboundedSequenceAction_20_0(),
						$current);
				}
			)
			otherlv_133='typedef'
			{
				newLeafNode(otherlv_133, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_20_1());
			}
			otherlv_134='sequence'
			{
				newLeafNode(otherlv_134, grammarAccess.getNamedDefinitionAccess().getSequenceKeyword_20_2());
			}
			otherlv_135='<'
			{
				newLeafNode(otherlv_135, grammarAccess.getNamedDefinitionAccess().getLessThanSignKeyword_20_3());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionCrossReference_20_4_0());
					}
					ruleScopedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_137='>'
			{
				newLeafNode(otherlv_137, grammarAccess.getNamedDefinitionAccess().getGreaterThanSignKeyword_20_5());
			}
			(
				(
					lv_name_138_0=RULE_ID
					{
						newLeafNode(lv_name_138_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_20_6_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_138_0,
							"org.osate.simpleidl.SimpleIDL.ID");
					}
				)
			)
			otherlv_139=';'
			{
				newLeafNode(otherlv_139, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_20_7());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNamedDefinitionAccess().getBoundedStringAction_21_0(),
						$current);
				}
			)
			otherlv_141='typedef'
			{
				newLeafNode(otherlv_141, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_21_1());
			}
			otherlv_142='string'
			{
				newLeafNode(otherlv_142, grammarAccess.getNamedDefinitionAccess().getStringKeyword_21_2());
			}
			otherlv_143='<'
			{
				newLeafNode(otherlv_143, grammarAccess.getNamedDefinitionAccess().getLessThanSignKeyword_21_3());
			}
			(
				(
					lv_size_144_0=RULE_INT
					{
						newLeafNode(lv_size_144_0, grammarAccess.getNamedDefinitionAccess().getSizeINTTerminalRuleCall_21_4_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"size",
							lv_size_144_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			otherlv_145='>'
			{
				newLeafNode(otherlv_145, grammarAccess.getNamedDefinitionAccess().getGreaterThanSignKeyword_21_5());
			}
			(
				(
					lv_name_146_0=RULE_ID
					{
						newLeafNode(lv_name_146_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_21_6_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_146_0,
							"org.osate.simpleidl.SimpleIDL.ID");
					}
				)
			)
			otherlv_147=';'
			{
				newLeafNode(otherlv_147, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_21_7());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNamedDefinitionAccess().getUnboundedStringAction_22_0(),
						$current);
				}
			)
			otherlv_149='typedef'
			{
				newLeafNode(otherlv_149, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_22_1());
			}
			otherlv_150='string'
			{
				newLeafNode(otherlv_150, grammarAccess.getNamedDefinitionAccess().getStringKeyword_22_2());
			}
			(
				(
					lv_name_151_0=RULE_ID
					{
						newLeafNode(lv_name_151_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_22_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_151_0,
							"org.osate.simpleidl.SimpleIDL.ID");
					}
				)
			)
			otherlv_152=';'
			{
				newLeafNode(otherlv_152, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_22_4());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNamedDefinitionAccess().getBoundedWideStringAction_23_0(),
						$current);
				}
			)
			otherlv_154='typedef'
			{
				newLeafNode(otherlv_154, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_23_1());
			}
			otherlv_155='wstring'
			{
				newLeafNode(otherlv_155, grammarAccess.getNamedDefinitionAccess().getWstringKeyword_23_2());
			}
			otherlv_156='<'
			{
				newLeafNode(otherlv_156, grammarAccess.getNamedDefinitionAccess().getLessThanSignKeyword_23_3());
			}
			(
				(
					lv_size_157_0=RULE_INT
					{
						newLeafNode(lv_size_157_0, grammarAccess.getNamedDefinitionAccess().getSizeINTTerminalRuleCall_23_4_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"size",
							lv_size_157_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			otherlv_158='>'
			{
				newLeafNode(otherlv_158, grammarAccess.getNamedDefinitionAccess().getGreaterThanSignKeyword_23_5());
			}
			(
				(
					lv_name_159_0=RULE_ID
					{
						newLeafNode(lv_name_159_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_23_6_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_159_0,
							"org.osate.simpleidl.SimpleIDL.ID");
					}
				)
			)
			otherlv_160=';'
			{
				newLeafNode(otherlv_160, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_23_7());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNamedDefinitionAccess().getUnboundedWideStringAction_24_0(),
						$current);
				}
			)
			otherlv_162='typedef'
			{
				newLeafNode(otherlv_162, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_24_1());
			}
			otherlv_163='wstring'
			{
				newLeafNode(otherlv_163, grammarAccess.getNamedDefinitionAccess().getWstringKeyword_24_2());
			}
			(
				(
					lv_name_164_0=RULE_ID
					{
						newLeafNode(lv_name_164_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_24_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_164_0,
							"org.osate.simpleidl.SimpleIDL.ID");
					}
				)
			)
			otherlv_165=';'
			{
				newLeafNode(otherlv_165, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_24_4());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNamedDefinitionAccess().getFixedPtTypeAction_25_0(),
						$current);
				}
			)
			otherlv_167='typedef'
			{
				newLeafNode(otherlv_167, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_25_1());
			}
			otherlv_168='fixed'
			{
				newLeafNode(otherlv_168, grammarAccess.getNamedDefinitionAccess().getFixedKeyword_25_2());
			}
			otherlv_169='<'
			{
				newLeafNode(otherlv_169, grammarAccess.getNamedDefinitionAccess().getLessThanSignKeyword_25_3());
			}
			(
				(
					lv_totalDigits_170_0=RULE_INT
					{
						newLeafNode(lv_totalDigits_170_0, grammarAccess.getNamedDefinitionAccess().getTotalDigitsINTTerminalRuleCall_25_4_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"totalDigits",
							lv_totalDigits_170_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			otherlv_171=','
			{
				newLeafNode(otherlv_171, grammarAccess.getNamedDefinitionAccess().getCommaKeyword_25_5());
			}
			(
				(
					lv_fractionalDigits_172_0=RULE_INT
					{
						newLeafNode(lv_fractionalDigits_172_0, grammarAccess.getNamedDefinitionAccess().getFractionalDigitsINTTerminalRuleCall_25_6_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"fractionalDigits",
							lv_fractionalDigits_172_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			otherlv_173='>'
			{
				newLeafNode(otherlv_173, grammarAccess.getNamedDefinitionAccess().getGreaterThanSignKeyword_25_7());
			}
			(
				(
					lv_name_174_0=RULE_ID
					{
						newLeafNode(lv_name_174_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_25_8_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNamedDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_174_0,
							"org.osate.simpleidl.SimpleIDL.ID");
					}
				)
			)
			otherlv_175=';'
			{
				newLeafNode(otherlv_175, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_25_9());
			}
		)
	)
;

// Entry rule entryRuleMember
entryRuleMember returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMemberRule()); }
	iv_ruleMember=ruleMember
	{ $current=$iv_ruleMember.current; }
	EOF;

// Rule Member
ruleMember returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMemberRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getMemberAccess().getTypeNamedDefinitionCrossReference_0_0());
				}
				ruleScopedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMemberRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.osate.simpleidl.SimpleIDL.ID");
				}
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getMemberAccess().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRuleCase
entryRuleCase returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCaseRule()); }
	iv_ruleCase=ruleCase
	{ $current=$iv_ruleCase.current; }
	EOF;

// Rule Case
ruleCase returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='case'
			{
				newLeafNode(otherlv_0, grammarAccess.getCaseAccess().getCaseKeyword_0_0());
			}
			(
				(
					lv_labels_1_0=RULE_INT
					{
						newLeafNode(lv_labels_1_0, grammarAccess.getCaseAccess().getLabelsINTTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCaseRule());
						}
						addWithLastConsumed(
							$current,
							"labels",
							lv_labels_1_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			otherlv_2=':'
			{
				newLeafNode(otherlv_2, grammarAccess.getCaseAccess().getColonKeyword_0_2());
			}
		)+
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCaseRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getCaseAccess().getTypeNamedDefinitionCrossReference_1_0());
				}
				ruleScopedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_4_0=RULE_ID
				{
					newLeafNode(lv_name_4_0, grammarAccess.getCaseAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCaseRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_4_0,
						"org.osate.simpleidl.SimpleIDL.ID");
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getCaseAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleScopedName
entryRuleScopedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getScopedNameRule()); }
	iv_ruleScopedName=ruleScopedName
	{ $current=$iv_ruleScopedName.current.getText(); }
	EOF;

// Rule ScopedName
ruleScopedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='::'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getScopedNameAccess().getColonColonKeyword_0());
			}
		)?
		(
			this_ID_1=RULE_ID
			{
				$current.merge(this_ID_1);
			}
			{
				newLeafNode(this_ID_1, grammarAccess.getScopedNameAccess().getIDTerminalRuleCall_1_0());
			}
			kw='::'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getScopedNameAccess().getColonColonKeyword_1_1());
			}
		)*
		this_ID_3=RULE_ID
		{
			$current.merge(this_ID_3);
		}
		{
			newLeafNode(this_ID_3, grammarAccess.getScopedNameAccess().getIDTerminalRuleCall_2());
		}
	)
;

RULE_ID : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_PREPROCESSOR : ('#define'|'#endif'|'#ifndef'|'#include') ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
