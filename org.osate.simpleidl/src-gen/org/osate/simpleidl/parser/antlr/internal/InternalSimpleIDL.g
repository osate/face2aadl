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
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getDefinitionAccess().getModuleAction_0_0(),
						$current);
				}
			)
			otherlv_1='module'
			{
				newLeafNode(otherlv_1, grammarAccess.getDefinitionAccess().getModuleKeyword_0_1());
			}
			(
				(
					lv_name_2_0=RULE_ID
					{
						newLeafNode(lv_name_2_0, grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_0_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDefinitionRule());
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
				newLeafNode(otherlv_3, grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_0_3());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDefinitionAccess().getDefinitionsDefinitionParserRuleCall_0_4_0());
					}
					lv_definitions_4_0=ruleDefinition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDefinitionRule());
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
				newLeafNode(otherlv_5, grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_0_5());
			}
			otherlv_6=';'
			{
				newLeafNode(otherlv_6, grammarAccess.getDefinitionAccess().getSemicolonKeyword_0_6());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getDefinitionAccess().getStructAction_1_0(),
						$current);
				}
			)
			otherlv_8='struct'
			{
				newLeafNode(otherlv_8, grammarAccess.getDefinitionAccess().getStructKeyword_1_1());
			}
			(
				(
					lv_name_9_0=RULE_ID
					{
						newLeafNode(lv_name_9_0, grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDefinitionRule());
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
				newLeafNode(otherlv_10, grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_1_3());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDefinitionAccess().getMembersMemberParserRuleCall_1_4_0());
					}
					lv_members_11_0=ruleMember
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDefinitionRule());
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
				newLeafNode(otherlv_12, grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_1_5());
			}
			otherlv_13=';'
			{
				newLeafNode(otherlv_13, grammarAccess.getDefinitionAccess().getSemicolonKeyword_1_6());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getDefinitionAccess().getStructForwardAction_2_0(),
						$current);
				}
			)
			otherlv_15='struct'
			{
				newLeafNode(otherlv_15, grammarAccess.getDefinitionAccess().getStructKeyword_2_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDefinitionRule());
						}
					}
					otherlv_16=RULE_ID
					{
						newLeafNode(otherlv_16, grammarAccess.getDefinitionAccess().getStructStructCrossReference_2_2_0());
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getDefinitionAccess().getSemicolonKeyword_2_3());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getDefinitionAccess().getUnionAction_3_0(),
						$current);
				}
			)
			otherlv_19='union'
			{
				newLeafNode(otherlv_19, grammarAccess.getDefinitionAccess().getUnionKeyword_3_1());
			}
			(
				(
					lv_name_20_0=RULE_ID
					{
						newLeafNode(lv_name_20_0, grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_3_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_20_0,
							"org.osate.simpleidl.SimpleIDL.ID");
					}
				)
			)
			otherlv_21='{'
			{
				newLeafNode(otherlv_21, grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_3_3());
			}
			otherlv_22='switch'
			{
				newLeafNode(otherlv_22, grammarAccess.getDefinitionAccess().getSwitchKeyword_3_4());
			}
			otherlv_23='('
			{
				newLeafNode(otherlv_23, grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_3_5());
			}
			otherlv_24='unsigned'
			{
				newLeafNode(otherlv_24, grammarAccess.getDefinitionAccess().getUnsignedKeyword_3_6());
			}
			otherlv_25='short'
			{
				newLeafNode(otherlv_25, grammarAccess.getDefinitionAccess().getShortKeyword_3_7());
			}
			otherlv_26=')'
			{
				newLeafNode(otherlv_26, grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_3_8());
			}
			otherlv_27='{'
			{
				newLeafNode(otherlv_27, grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_3_9());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDefinitionAccess().getCasesCaseParserRuleCall_3_10_0());
					}
					lv_cases_28_0=ruleCase
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDefinitionRule());
						}
						add(
							$current,
							"cases",
							lv_cases_28_0,
							"org.osate.simpleidl.SimpleIDL.Case");
						afterParserOrEnumRuleCall();
					}
				)
			)+
			otherlv_29='}'
			{
				newLeafNode(otherlv_29, grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_3_11());
			}
			otherlv_30=';'
			{
				newLeafNode(otherlv_30, grammarAccess.getDefinitionAccess().getSemicolonKeyword_3_12());
			}
			otherlv_31='}'
			{
				newLeafNode(otherlv_31, grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_3_13());
			}
			otherlv_32=';'
			{
				newLeafNode(otherlv_32, grammarAccess.getDefinitionAccess().getSemicolonKeyword_3_14());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getDefinitionAccess().getEnumAction_4_0(),
						$current);
				}
			)
			otherlv_34='enum'
			{
				newLeafNode(otherlv_34, grammarAccess.getDefinitionAccess().getEnumKeyword_4_1());
			}
			(
				(
					lv_name_35_0=RULE_ID
					{
						newLeafNode(lv_name_35_0, grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_4_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_35_0,
							"org.osate.simpleidl.SimpleIDL.ID");
					}
				)
			)
			otherlv_36='{'
			{
				newLeafNode(otherlv_36, grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_4_3());
			}
			(
				(
					lv_literals_37_0=RULE_ID
					{
						newLeafNode(lv_literals_37_0, grammarAccess.getDefinitionAccess().getLiteralsIDTerminalRuleCall_4_4_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDefinitionRule());
						}
						addWithLastConsumed(
							$current,
							"literals",
							lv_literals_37_0,
							"org.osate.simpleidl.SimpleIDL.ID");
					}
				)
			)
			(
				otherlv_38=','
				{
					newLeafNode(otherlv_38, grammarAccess.getDefinitionAccess().getCommaKeyword_4_5_0());
				}
				(
					(
						lv_literals_39_0=RULE_ID
						{
							newLeafNode(lv_literals_39_0, grammarAccess.getDefinitionAccess().getLiteralsIDTerminalRuleCall_4_5_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getDefinitionRule());
							}
							addWithLastConsumed(
								$current,
								"literals",
								lv_literals_39_0,
								"org.osate.simpleidl.SimpleIDL.ID");
						}
					)
				)
			)*
			otherlv_40='}'
			{
				newLeafNode(otherlv_40, grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_4_6());
			}
			otherlv_41=';'
			{
				newLeafNode(otherlv_41, grammarAccess.getDefinitionAccess().getSemicolonKeyword_4_7());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getDefinitionAccess().getTypedefAction_5_0(),
						$current);
				}
			)
			otherlv_43='typedef'
			{
				newLeafNode(otherlv_43, grammarAccess.getDefinitionAccess().getTypedefKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDefinitionAccess().getTypeTypeParserRuleCall_5_2_0());
					}
					lv_type_44_0=ruleType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDefinitionRule());
						}
						set(
							$current,
							"type",
							lv_type_44_0,
							"org.osate.simpleidl.SimpleIDL.Type");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					lv_name_45_0=RULE_ID
					{
						newLeafNode(lv_name_45_0, grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_5_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_45_0,
							"org.osate.simpleidl.SimpleIDL.ID");
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getDefinitionAccess().getArraySizeFixedArraySizeParserRuleCall_5_4_0());
					}
					lv_arraySize_46_0=ruleFixedArraySize
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDefinitionRule());
						}
						set(
							$current,
							"arraySize",
							lv_arraySize_46_0,
							"org.osate.simpleidl.SimpleIDL.FixedArraySize");
						afterParserOrEnumRuleCall();
					}
				)
			)?
			otherlv_47=';'
			{
				newLeafNode(otherlv_47, grammarAccess.getDefinitionAccess().getSemicolonKeyword_5_5());
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
					newCompositeNode(grammarAccess.getMemberAccess().getTypeSimpleTypeSpecParserRuleCall_0_0());
				}
				lv_type_0_0=ruleSimpleTypeSpec
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMemberRule());
					}
					set(
						$current,
						"type",
						lv_type_0_0,
						"org.osate.simpleidl.SimpleIDL.SimpleTypeSpec");
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
					newCompositeNode(grammarAccess.getCaseAccess().getTypeSimpleTypeSpecParserRuleCall_1_0());
				}
				lv_type_3_0=ruleSimpleTypeSpec
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCaseRule());
					}
					set(
						$current,
						"type",
						lv_type_3_0,
						"org.osate.simpleidl.SimpleIDL.SimpleTypeSpec");
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

// Entry rule entryRuleFixedArraySize
entryRuleFixedArraySize returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFixedArraySizeRule()); }
	iv_ruleFixedArraySize=ruleFixedArraySize
	{ $current=$iv_ruleFixedArraySize.current; }
	EOF;

// Rule FixedArraySize
ruleFixedArraySize returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='['
		{
			newLeafNode(otherlv_0, grammarAccess.getFixedArraySizeAccess().getLeftSquareBracketKeyword_0());
		}
		(
			(
				lv_size_1_0=RULE_INT
				{
					newLeafNode(lv_size_1_0, grammarAccess.getFixedArraySizeAccess().getSizeINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFixedArraySizeRule());
					}
					setWithLastConsumed(
						$current,
						"size",
						lv_size_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_2=']'
		{
			newLeafNode(otherlv_2, grammarAccess.getFixedArraySizeAccess().getRightSquareBracketKeyword_2());
		}
	)
;

// Entry rule entryRuleType
entryRuleType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current; }
	EOF;

// Rule Type
ruleType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTypeAccess().getSimpleTypeSpecParserRuleCall_0());
		}
		this_SimpleTypeSpec_0=ruleSimpleTypeSpec
		{
			$current = $this_SimpleTypeSpec_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTypeAccess().getBoundedSequenceAction_1_0(),
						$current);
				}
			)
			otherlv_2='sequence'
			{
				newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getSequenceKeyword_1_1());
			}
			otherlv_3='<'
			{
				newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getLessThanSignKeyword_1_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTypeAccess().getTypeSimpleTypeSpecParserRuleCall_1_3_0());
					}
					lv_type_4_0=ruleSimpleTypeSpec
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTypeRule());
						}
						set(
							$current,
							"type",
							lv_type_4_0,
							"org.osate.simpleidl.SimpleIDL.SimpleTypeSpec");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getCommaKeyword_1_4());
			}
			(
				(
					lv_size_6_0=RULE_INT
					{
						newLeafNode(lv_size_6_0, grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_1_5_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTypeRule());
						}
						setWithLastConsumed(
							$current,
							"size",
							lv_size_6_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			otherlv_7='>'
			{
				newLeafNode(otherlv_7, grammarAccess.getTypeAccess().getGreaterThanSignKeyword_1_6());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTypeAccess().getUnboundedSequenceAction_2_0(),
						$current);
				}
			)
			otherlv_9='sequence'
			{
				newLeafNode(otherlv_9, grammarAccess.getTypeAccess().getSequenceKeyword_2_1());
			}
			otherlv_10='<'
			{
				newLeafNode(otherlv_10, grammarAccess.getTypeAccess().getLessThanSignKeyword_2_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTypeAccess().getTypeSimpleTypeSpecParserRuleCall_2_3_0());
					}
					lv_type_11_0=ruleSimpleTypeSpec
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTypeRule());
						}
						set(
							$current,
							"type",
							lv_type_11_0,
							"org.osate.simpleidl.SimpleIDL.SimpleTypeSpec");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_12='>'
			{
				newLeafNode(otherlv_12, grammarAccess.getTypeAccess().getGreaterThanSignKeyword_2_4());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTypeAccess().getBoundedStringAction_3_0(),
						$current);
				}
			)
			otherlv_14='string'
			{
				newLeafNode(otherlv_14, grammarAccess.getTypeAccess().getStringKeyword_3_1());
			}
			otherlv_15='<'
			{
				newLeafNode(otherlv_15, grammarAccess.getTypeAccess().getLessThanSignKeyword_3_2());
			}
			(
				(
					lv_size_16_0=RULE_INT
					{
						newLeafNode(lv_size_16_0, grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_3_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTypeRule());
						}
						setWithLastConsumed(
							$current,
							"size",
							lv_size_16_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			otherlv_17='>'
			{
				newLeafNode(otherlv_17, grammarAccess.getTypeAccess().getGreaterThanSignKeyword_3_4());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTypeAccess().getUnboundedStringAction_4_0(),
						$current);
				}
			)
			otherlv_19='string'
			{
				newLeafNode(otherlv_19, grammarAccess.getTypeAccess().getStringKeyword_4_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTypeAccess().getBoundedWideStringAction_5_0(),
						$current);
				}
			)
			otherlv_21='wstring'
			{
				newLeafNode(otherlv_21, grammarAccess.getTypeAccess().getWstringKeyword_5_1());
			}
			otherlv_22='<'
			{
				newLeafNode(otherlv_22, grammarAccess.getTypeAccess().getLessThanSignKeyword_5_2());
			}
			(
				(
					lv_size_23_0=RULE_INT
					{
						newLeafNode(lv_size_23_0, grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_5_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTypeRule());
						}
						setWithLastConsumed(
							$current,
							"size",
							lv_size_23_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			otherlv_24='>'
			{
				newLeafNode(otherlv_24, grammarAccess.getTypeAccess().getGreaterThanSignKeyword_5_4());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTypeAccess().getUnboundedWideStringAction_6_0(),
						$current);
				}
			)
			otherlv_26='wstring'
			{
				newLeafNode(otherlv_26, grammarAccess.getTypeAccess().getWstringKeyword_6_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTypeAccess().getFixedPtTypeAction_7_0(),
						$current);
				}
			)
			otherlv_28='fixed'
			{
				newLeafNode(otherlv_28, grammarAccess.getTypeAccess().getFixedKeyword_7_1());
			}
			otherlv_29='<'
			{
				newLeafNode(otherlv_29, grammarAccess.getTypeAccess().getLessThanSignKeyword_7_2());
			}
			(
				(
					lv_totalDigits_30_0=RULE_INT
					{
						newLeafNode(lv_totalDigits_30_0, grammarAccess.getTypeAccess().getTotalDigitsINTTerminalRuleCall_7_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTypeRule());
						}
						setWithLastConsumed(
							$current,
							"totalDigits",
							lv_totalDigits_30_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			otherlv_31=','
			{
				newLeafNode(otherlv_31, grammarAccess.getTypeAccess().getCommaKeyword_7_4());
			}
			(
				(
					lv_fractionalDigits_32_0=RULE_INT
					{
						newLeafNode(lv_fractionalDigits_32_0, grammarAccess.getTypeAccess().getFractionalDigitsINTTerminalRuleCall_7_5_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTypeRule());
						}
						setWithLastConsumed(
							$current,
							"fractionalDigits",
							lv_fractionalDigits_32_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			otherlv_33='>'
			{
				newLeafNode(otherlv_33, grammarAccess.getTypeAccess().getGreaterThanSignKeyword_7_6());
			}
		)
	)
;

// Entry rule entryRuleSimpleTypeSpec
entryRuleSimpleTypeSpec returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSimpleTypeSpecRule()); }
	iv_ruleSimpleTypeSpec=ruleSimpleTypeSpec
	{ $current=$iv_ruleSimpleTypeSpec.current; }
	EOF;

// Rule SimpleTypeSpec
ruleSimpleTypeSpec returns [EObject current=null]
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
						grammarAccess.getSimpleTypeSpecAccess().getSignedShortIntAction_0_0(),
						$current);
				}
			)
			otherlv_1='short'
			{
				newLeafNode(otherlv_1, grammarAccess.getSimpleTypeSpecAccess().getShortKeyword_0_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleTypeSpecAccess().getSignedLongIntAction_1_0(),
						$current);
				}
			)
			otherlv_3='long'
			{
				newLeafNode(otherlv_3, grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_1_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleTypeSpecAccess().getSignedLongLongIntAction_2_0(),
						$current);
				}
			)
			otherlv_5='long'
			{
				newLeafNode(otherlv_5, grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_2_1());
			}
			otherlv_6='long'
			{
				newLeafNode(otherlv_6, grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_2_2());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleTypeSpecAccess().getUnsignedShortIntAction_3_0(),
						$current);
				}
			)
			otherlv_8='unsigned'
			{
				newLeafNode(otherlv_8, grammarAccess.getSimpleTypeSpecAccess().getUnsignedKeyword_3_1());
			}
			otherlv_9='short'
			{
				newLeafNode(otherlv_9, grammarAccess.getSimpleTypeSpecAccess().getShortKeyword_3_2());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleTypeSpecAccess().getUnsignedLongIntAction_4_0(),
						$current);
				}
			)
			otherlv_11='unsigned'
			{
				newLeafNode(otherlv_11, grammarAccess.getSimpleTypeSpecAccess().getUnsignedKeyword_4_1());
			}
			otherlv_12='long'
			{
				newLeafNode(otherlv_12, grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_4_2());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleTypeSpecAccess().getUnsignedLongLongIntAction_5_0(),
						$current);
				}
			)
			otherlv_14='unsigned'
			{
				newLeafNode(otherlv_14, grammarAccess.getSimpleTypeSpecAccess().getUnsignedKeyword_5_1());
			}
			otherlv_15='long'
			{
				newLeafNode(otherlv_15, grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_5_2());
			}
			otherlv_16='long'
			{
				newLeafNode(otherlv_16, grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_5_3());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleTypeSpecAccess().getFloatTypeAction_6_0(),
						$current);
				}
			)
			otherlv_18='float'
			{
				newLeafNode(otherlv_18, grammarAccess.getSimpleTypeSpecAccess().getFloatKeyword_6_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleTypeSpecAccess().getDoubleTypeAction_7_0(),
						$current);
				}
			)
			otherlv_20='double'
			{
				newLeafNode(otherlv_20, grammarAccess.getSimpleTypeSpecAccess().getDoubleKeyword_7_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleTypeSpecAccess().getLongDoubleTypeAction_8_0(),
						$current);
				}
			)
			otherlv_22='long'
			{
				newLeafNode(otherlv_22, grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_8_1());
			}
			otherlv_23='double'
			{
				newLeafNode(otherlv_23, grammarAccess.getSimpleTypeSpecAccess().getDoubleKeyword_8_2());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleTypeSpecAccess().getCharTypeAction_9_0(),
						$current);
				}
			)
			otherlv_25='char'
			{
				newLeafNode(otherlv_25, grammarAccess.getSimpleTypeSpecAccess().getCharKeyword_9_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleTypeSpecAccess().getWideCharTypeAction_10_0(),
						$current);
				}
			)
			otherlv_27='wchar'
			{
				newLeafNode(otherlv_27, grammarAccess.getSimpleTypeSpecAccess().getWcharKeyword_10_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleTypeSpecAccess().getBooleanTypeAction_11_0(),
						$current);
				}
			)
			otherlv_29='boolean'
			{
				newLeafNode(otherlv_29, grammarAccess.getSimpleTypeSpecAccess().getBooleanKeyword_11_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleTypeSpecAccess().getOctetTypeAction_12_0(),
						$current);
				}
			)
			otherlv_31='octet'
			{
				newLeafNode(otherlv_31, grammarAccess.getSimpleTypeSpecAccess().getOctetKeyword_12_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleTypeSpecAccess().getReferencedTypeAction_13_0(),
						$current);
				}
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSimpleTypeSpecRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getSimpleTypeSpecAccess().getTypeDefinitionCrossReference_13_1_0());
					}
					ruleScopedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
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
