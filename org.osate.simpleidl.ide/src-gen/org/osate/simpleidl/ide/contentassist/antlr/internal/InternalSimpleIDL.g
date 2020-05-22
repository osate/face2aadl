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
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.osate.simpleidl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.osate.simpleidl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.osate.simpleidl.services.SimpleIDLGrammarAccess;

}
@parser::members {
	private SimpleIDLGrammarAccess grammarAccess;

	public void setGrammarAccess(SimpleIDLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleSpecification
entryRuleSpecification
:
{ before(grammarAccess.getSpecificationRule()); }
	 ruleSpecification
{ after(grammarAccess.getSpecificationRule()); } 
	 EOF 
;

// Rule Specification
ruleSpecification 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		(
			{ before(grammarAccess.getSpecificationAccess().getDefinitionsAssignment()); }
			(rule__Specification__DefinitionsAssignment)
			{ after(grammarAccess.getSpecificationAccess().getDefinitionsAssignment()); }
		)
		(
			{ before(grammarAccess.getSpecificationAccess().getDefinitionsAssignment()); }
			(rule__Specification__DefinitionsAssignment)*
			{ after(grammarAccess.getSpecificationAccess().getDefinitionsAssignment()); }
		)
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDefinition
entryRuleDefinition
:
{ before(grammarAccess.getDefinitionRule()); }
	 ruleDefinition
{ after(grammarAccess.getDefinitionRule()); } 
	 EOF 
;

// Rule Definition
ruleDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDefinitionAccess().getAlternatives()); }
		(rule__Definition__Alternatives)
		{ after(grammarAccess.getDefinitionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMember
entryRuleMember
:
{ before(grammarAccess.getMemberRule()); }
	 ruleMember
{ after(grammarAccess.getMemberRule()); } 
	 EOF 
;

// Rule Member
ruleMember 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMemberAccess().getGroup()); }
		(rule__Member__Group__0)
		{ after(grammarAccess.getMemberAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCase
entryRuleCase
:
{ before(grammarAccess.getCaseRule()); }
	 ruleCase
{ after(grammarAccess.getCaseRule()); } 
	 EOF 
;

// Rule Case
ruleCase 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCaseAccess().getGroup()); }
		(rule__Case__Group__0)
		{ after(grammarAccess.getCaseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAnyDeclarator
entryRuleAnyDeclarator
:
{ before(grammarAccess.getAnyDeclaratorRule()); }
	 ruleAnyDeclarator
{ after(grammarAccess.getAnyDeclaratorRule()); } 
	 EOF 
;

// Rule AnyDeclarator
ruleAnyDeclarator 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAnyDeclaratorAccess().getGroup()); }
		(rule__AnyDeclarator__Group__0)
		{ after(grammarAccess.getAnyDeclaratorAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFixedArraySize
entryRuleFixedArraySize
:
{ before(grammarAccess.getFixedArraySizeRule()); }
	 ruleFixedArraySize
{ after(grammarAccess.getFixedArraySizeRule()); } 
	 EOF 
;

// Rule FixedArraySize
ruleFixedArraySize 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFixedArraySizeAccess().getGroup()); }
		(rule__FixedArraySize__Group__0)
		{ after(grammarAccess.getFixedArraySizeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleType
entryRuleType
:
{ before(grammarAccess.getTypeRule()); }
	 ruleType
{ after(grammarAccess.getTypeRule()); } 
	 EOF 
;

// Rule Type
ruleType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeAccess().getAlternatives()); }
		(rule__Type__Alternatives)
		{ after(grammarAccess.getTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSimpleTypeSpec
entryRuleSimpleTypeSpec
:
{ before(grammarAccess.getSimpleTypeSpecRule()); }
	 ruleSimpleTypeSpec
{ after(grammarAccess.getSimpleTypeSpecRule()); } 
	 EOF 
;

// Rule SimpleTypeSpec
ruleSimpleTypeSpec 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSimpleTypeSpecAccess().getAlternatives()); }
		(rule__SimpleTypeSpec__Alternatives)
		{ after(grammarAccess.getSimpleTypeSpecAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleScopedName
entryRuleScopedName
:
{ before(grammarAccess.getScopedNameRule()); }
	 ruleScopedName
{ after(grammarAccess.getScopedNameRule()); } 
	 EOF 
;

// Rule ScopedName
ruleScopedName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getScopedNameAccess().getGroup()); }
		(rule__ScopedName__Group__0)
		{ after(grammarAccess.getScopedNameAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefinitionAccess().getGroup_0()); }
		(rule__Definition__Group_0__0)
		{ after(grammarAccess.getDefinitionAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getDefinitionAccess().getGroup_1()); }
		(rule__Definition__Group_1__0)
		{ after(grammarAccess.getDefinitionAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getDefinitionAccess().getGroup_2()); }
		(rule__Definition__Group_2__0)
		{ after(grammarAccess.getDefinitionAccess().getGroup_2()); }
	)
	|
	(
		{ before(grammarAccess.getDefinitionAccess().getGroup_3()); }
		(rule__Definition__Group_3__0)
		{ after(grammarAccess.getDefinitionAccess().getGroup_3()); }
	)
	|
	(
		{ before(grammarAccess.getDefinitionAccess().getGroup_4()); }
		(rule__Definition__Group_4__0)
		{ after(grammarAccess.getDefinitionAccess().getGroup_4()); }
	)
	|
	(
		{ before(grammarAccess.getDefinitionAccess().getGroup_5()); }
		(rule__Definition__Group_5__0)
		{ after(grammarAccess.getDefinitionAccess().getGroup_5()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getSimpleTypeSpecParserRuleCall_0()); }
		ruleSimpleTypeSpec
		{ after(grammarAccess.getTypeAccess().getSimpleTypeSpecParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getGroup_1()); }
		(rule__Type__Group_1__0)
		{ after(grammarAccess.getTypeAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getGroup_2()); }
		(rule__Type__Group_2__0)
		{ after(grammarAccess.getTypeAccess().getGroup_2()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getGroup_3()); }
		(rule__Type__Group_3__0)
		{ after(grammarAccess.getTypeAccess().getGroup_3()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getGroup_4()); }
		(rule__Type__Group_4__0)
		{ after(grammarAccess.getTypeAccess().getGroup_4()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getGroup_5()); }
		(rule__Type__Group_5__0)
		{ after(grammarAccess.getTypeAccess().getGroup_5()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getGroup_6()); }
		(rule__Type__Group_6__0)
		{ after(grammarAccess.getTypeAccess().getGroup_6()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getGroup_7()); }
		(rule__Type__Group_7__0)
		{ after(grammarAccess.getTypeAccess().getGroup_7()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSimpleTypeSpecAccess().getGroup_0()); }
		(rule__SimpleTypeSpec__Group_0__0)
		{ after(grammarAccess.getSimpleTypeSpecAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleTypeSpecAccess().getGroup_1()); }
		(rule__SimpleTypeSpec__Group_1__0)
		{ after(grammarAccess.getSimpleTypeSpecAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleTypeSpecAccess().getGroup_2()); }
		(rule__SimpleTypeSpec__Group_2__0)
		{ after(grammarAccess.getSimpleTypeSpecAccess().getGroup_2()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleTypeSpecAccess().getGroup_3()); }
		(rule__SimpleTypeSpec__Group_3__0)
		{ after(grammarAccess.getSimpleTypeSpecAccess().getGroup_3()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleTypeSpecAccess().getGroup_4()); }
		(rule__SimpleTypeSpec__Group_4__0)
		{ after(grammarAccess.getSimpleTypeSpecAccess().getGroup_4()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleTypeSpecAccess().getGroup_5()); }
		(rule__SimpleTypeSpec__Group_5__0)
		{ after(grammarAccess.getSimpleTypeSpecAccess().getGroup_5()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleTypeSpecAccess().getGroup_6()); }
		(rule__SimpleTypeSpec__Group_6__0)
		{ after(grammarAccess.getSimpleTypeSpecAccess().getGroup_6()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleTypeSpecAccess().getGroup_7()); }
		(rule__SimpleTypeSpec__Group_7__0)
		{ after(grammarAccess.getSimpleTypeSpecAccess().getGroup_7()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleTypeSpecAccess().getGroup_8()); }
		(rule__SimpleTypeSpec__Group_8__0)
		{ after(grammarAccess.getSimpleTypeSpecAccess().getGroup_8()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleTypeSpecAccess().getGroup_9()); }
		(rule__SimpleTypeSpec__Group_9__0)
		{ after(grammarAccess.getSimpleTypeSpecAccess().getGroup_9()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleTypeSpecAccess().getGroup_10()); }
		(rule__SimpleTypeSpec__Group_10__0)
		{ after(grammarAccess.getSimpleTypeSpecAccess().getGroup_10()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleTypeSpecAccess().getGroup_11()); }
		(rule__SimpleTypeSpec__Group_11__0)
		{ after(grammarAccess.getSimpleTypeSpecAccess().getGroup_11()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleTypeSpecAccess().getGroup_12()); }
		(rule__SimpleTypeSpec__Group_12__0)
		{ after(grammarAccess.getSimpleTypeSpecAccess().getGroup_12()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleTypeSpecAccess().getGroup_13()); }
		(rule__SimpleTypeSpec__Group_13__0)
		{ after(grammarAccess.getSimpleTypeSpecAccess().getGroup_13()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_0__0__Impl
	rule__Definition__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getModuleAction_0_0()); }
	()
	{ after(grammarAccess.getDefinitionAccess().getModuleAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_0__1__Impl
	rule__Definition__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getModuleKeyword_0_1()); }
	'module'
	{ after(grammarAccess.getDefinitionAccess().getModuleKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_0__2__Impl
	rule__Definition__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getNameAssignment_0_2()); }
	(rule__Definition__NameAssignment_0_2)
	{ after(grammarAccess.getDefinitionAccess().getNameAssignment_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_0__3__Impl
	rule__Definition__Group_0__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_0_3()); }
	'{'
	{ after(grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_0__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_0__4__Impl
	rule__Definition__Group_0__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_0__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getDefinitionAccess().getDefinitionsAssignment_0_4()); }
		(rule__Definition__DefinitionsAssignment_0_4)
		{ after(grammarAccess.getDefinitionAccess().getDefinitionsAssignment_0_4()); }
	)
	(
		{ before(grammarAccess.getDefinitionAccess().getDefinitionsAssignment_0_4()); }
		(rule__Definition__DefinitionsAssignment_0_4)*
		{ after(grammarAccess.getDefinitionAccess().getDefinitionsAssignment_0_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_0__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_0__5__Impl
	rule__Definition__Group_0__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_0__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_0_5()); }
	'}'
	{ after(grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_0_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_0__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_0__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_0__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getSemicolonKeyword_0_6()); }
	';'
	{ after(grammarAccess.getDefinitionAccess().getSemicolonKeyword_0_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Definition__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_1__0__Impl
	rule__Definition__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getStructAction_1_0()); }
	()
	{ after(grammarAccess.getDefinitionAccess().getStructAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_1__1__Impl
	rule__Definition__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getStructKeyword_1_1()); }
	'struct'
	{ after(grammarAccess.getDefinitionAccess().getStructKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_1__2__Impl
	rule__Definition__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getNameAssignment_1_2()); }
	(rule__Definition__NameAssignment_1_2)
	{ after(grammarAccess.getDefinitionAccess().getNameAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_1__3__Impl
	rule__Definition__Group_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_1_3()); }
	'{'
	{ after(grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_1__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_1__4__Impl
	rule__Definition__Group_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_1__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getDefinitionAccess().getMembersAssignment_1_4()); }
		(rule__Definition__MembersAssignment_1_4)
		{ after(grammarAccess.getDefinitionAccess().getMembersAssignment_1_4()); }
	)
	(
		{ before(grammarAccess.getDefinitionAccess().getMembersAssignment_1_4()); }
		(rule__Definition__MembersAssignment_1_4)*
		{ after(grammarAccess.getDefinitionAccess().getMembersAssignment_1_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_1__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_1__5__Impl
	rule__Definition__Group_1__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_1__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_1_5()); }
	'}'
	{ after(grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_1_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_1__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_1__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_1__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getSemicolonKeyword_1_6()); }
	';'
	{ after(grammarAccess.getDefinitionAccess().getSemicolonKeyword_1_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Definition__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_2__0__Impl
	rule__Definition__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getStructForwardAction_2_0()); }
	()
	{ after(grammarAccess.getDefinitionAccess().getStructForwardAction_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_2__1__Impl
	rule__Definition__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getStructKeyword_2_1()); }
	'struct'
	{ after(grammarAccess.getDefinitionAccess().getStructKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_2__2__Impl
	rule__Definition__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getStructAssignment_2_2()); }
	(rule__Definition__StructAssignment_2_2)
	{ after(grammarAccess.getDefinitionAccess().getStructAssignment_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getSemicolonKeyword_2_3()); }
	';'
	{ after(grammarAccess.getDefinitionAccess().getSemicolonKeyword_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Definition__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_3__0__Impl
	rule__Definition__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getUnionAction_3_0()); }
	()
	{ after(grammarAccess.getDefinitionAccess().getUnionAction_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_3__1__Impl
	rule__Definition__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getUnionKeyword_3_1()); }
	'union'
	{ after(grammarAccess.getDefinitionAccess().getUnionKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_3__2__Impl
	rule__Definition__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getNameAssignment_3_2()); }
	(rule__Definition__NameAssignment_3_2)
	{ after(grammarAccess.getDefinitionAccess().getNameAssignment_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_3__3__Impl
	rule__Definition__Group_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_3_3()); }
	'{'
	{ after(grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_3__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_3__4__Impl
	rule__Definition__Group_3__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_3__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getSwitchKeyword_3_4()); }
	'switch'
	{ after(grammarAccess.getDefinitionAccess().getSwitchKeyword_3_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_3__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_3__5__Impl
	rule__Definition__Group_3__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_3__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_3_5()); }
	'('
	{ after(grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_3_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_3__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_3__6__Impl
	rule__Definition__Group_3__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_3__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getUnsignedKeyword_3_6()); }
	'unsigned'
	{ after(grammarAccess.getDefinitionAccess().getUnsignedKeyword_3_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_3__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_3__7__Impl
	rule__Definition__Group_3__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_3__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getShortKeyword_3_7()); }
	'short'
	{ after(grammarAccess.getDefinitionAccess().getShortKeyword_3_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_3__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_3__8__Impl
	rule__Definition__Group_3__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_3__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_3_8()); }
	')'
	{ after(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_3_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_3__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_3__9__Impl
	rule__Definition__Group_3__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_3__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_3_9()); }
	'{'
	{ after(grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_3_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_3__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_3__10__Impl
	rule__Definition__Group_3__11
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_3__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getDefinitionAccess().getCasesAssignment_3_10()); }
		(rule__Definition__CasesAssignment_3_10)
		{ after(grammarAccess.getDefinitionAccess().getCasesAssignment_3_10()); }
	)
	(
		{ before(grammarAccess.getDefinitionAccess().getCasesAssignment_3_10()); }
		(rule__Definition__CasesAssignment_3_10)*
		{ after(grammarAccess.getDefinitionAccess().getCasesAssignment_3_10()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_3__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_3__11__Impl
	rule__Definition__Group_3__12
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_3__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_3_11()); }
	'}'
	{ after(grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_3_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_3__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_3__12__Impl
	rule__Definition__Group_3__13
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_3__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getSemicolonKeyword_3_12()); }
	';'
	{ after(grammarAccess.getDefinitionAccess().getSemicolonKeyword_3_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_3__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_3__13__Impl
	rule__Definition__Group_3__14
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_3__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_3_13()); }
	'}'
	{ after(grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_3_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_3__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_3__14__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_3__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getSemicolonKeyword_3_14()); }
	';'
	{ after(grammarAccess.getDefinitionAccess().getSemicolonKeyword_3_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Definition__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_4__0__Impl
	rule__Definition__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getEnumAction_4_0()); }
	()
	{ after(grammarAccess.getDefinitionAccess().getEnumAction_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_4__1__Impl
	rule__Definition__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getEnumKeyword_4_1()); }
	'enum'
	{ after(grammarAccess.getDefinitionAccess().getEnumKeyword_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_4__2__Impl
	rule__Definition__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getNameAssignment_4_2()); }
	(rule__Definition__NameAssignment_4_2)
	{ after(grammarAccess.getDefinitionAccess().getNameAssignment_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_4__3__Impl
	rule__Definition__Group_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_4_3()); }
	'{'
	{ after(grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_4__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_4__4__Impl
	rule__Definition__Group_4__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_4__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getLiteralsAssignment_4_4()); }
	(rule__Definition__LiteralsAssignment_4_4)
	{ after(grammarAccess.getDefinitionAccess().getLiteralsAssignment_4_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_4__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_4__5__Impl
	rule__Definition__Group_4__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_4__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getGroup_4_5()); }
	(rule__Definition__Group_4_5__0)*
	{ after(grammarAccess.getDefinitionAccess().getGroup_4_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_4__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_4__6__Impl
	rule__Definition__Group_4__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_4__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_4_6()); }
	'}'
	{ after(grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_4_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_4__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_4__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_4__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getSemicolonKeyword_4_7()); }
	';'
	{ after(grammarAccess.getDefinitionAccess().getSemicolonKeyword_4_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Definition__Group_4_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_4_5__0__Impl
	rule__Definition__Group_4_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_4_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getCommaKeyword_4_5_0()); }
	','
	{ after(grammarAccess.getDefinitionAccess().getCommaKeyword_4_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_4_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_4_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_4_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getLiteralsAssignment_4_5_1()); }
	(rule__Definition__LiteralsAssignment_4_5_1)
	{ after(grammarAccess.getDefinitionAccess().getLiteralsAssignment_4_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Definition__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_5__0__Impl
	rule__Definition__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getTypedefAction_5_0()); }
	()
	{ after(grammarAccess.getDefinitionAccess().getTypedefAction_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_5__1__Impl
	rule__Definition__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getTypedefKeyword_5_1()); }
	'typedef'
	{ after(grammarAccess.getDefinitionAccess().getTypedefKeyword_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_5__2__Impl
	rule__Definition__Group_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getTypeAssignment_5_2()); }
	(rule__Definition__TypeAssignment_5_2)
	{ after(grammarAccess.getDefinitionAccess().getTypeAssignment_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_5__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_5__3__Impl
	rule__Definition__Group_5__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_5__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getNamesAssignment_5_3()); }
	(rule__Definition__NamesAssignment_5_3)
	{ after(grammarAccess.getDefinitionAccess().getNamesAssignment_5_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_5__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_5__4__Impl
	rule__Definition__Group_5__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_5__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getGroup_5_4()); }
	(rule__Definition__Group_5_4__0)*
	{ after(grammarAccess.getDefinitionAccess().getGroup_5_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_5__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_5__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_5__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getSemicolonKeyword_5_5()); }
	';'
	{ after(grammarAccess.getDefinitionAccess().getSemicolonKeyword_5_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Definition__Group_5_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_5_4__0__Impl
	rule__Definition__Group_5_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_5_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getCommaKeyword_5_4_0()); }
	','
	{ after(grammarAccess.getDefinitionAccess().getCommaKeyword_5_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_5_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_5_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_5_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getNamesAssignment_5_4_1()); }
	(rule__Definition__NamesAssignment_5_4_1)
	{ after(grammarAccess.getDefinitionAccess().getNamesAssignment_5_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Member__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Member__Group__0__Impl
	rule__Member__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Member__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMemberAccess().getTypeAssignment_0()); }
	(rule__Member__TypeAssignment_0)
	{ after(grammarAccess.getMemberAccess().getTypeAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Member__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Member__Group__1__Impl
	rule__Member__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Member__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMemberAccess().getNamesAssignment_1()); }
	(rule__Member__NamesAssignment_1)
	{ after(grammarAccess.getMemberAccess().getNamesAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Member__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Member__Group__2__Impl
	rule__Member__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Member__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMemberAccess().getGroup_2()); }
	(rule__Member__Group_2__0)*
	{ after(grammarAccess.getMemberAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Member__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Member__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Member__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMemberAccess().getSemicolonKeyword_3()); }
	';'
	{ after(grammarAccess.getMemberAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Member__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Member__Group_2__0__Impl
	rule__Member__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Member__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMemberAccess().getCommaKeyword_2_0()); }
	','
	{ after(grammarAccess.getMemberAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Member__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Member__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Member__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMemberAccess().getNamesAssignment_2_1()); }
	(rule__Member__NamesAssignment_2_1)
	{ after(grammarAccess.getMemberAccess().getNamesAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Case__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Case__Group__0__Impl
	rule__Case__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Case__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getCaseAccess().getGroup_0()); }
		(rule__Case__Group_0__0)
		{ after(grammarAccess.getCaseAccess().getGroup_0()); }
	)
	(
		{ before(grammarAccess.getCaseAccess().getGroup_0()); }
		(rule__Case__Group_0__0)*
		{ after(grammarAccess.getCaseAccess().getGroup_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Case__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Case__Group__1__Impl
	rule__Case__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Case__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCaseAccess().getTypeAssignment_1()); }
	(rule__Case__TypeAssignment_1)
	{ after(grammarAccess.getCaseAccess().getTypeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Case__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Case__Group__2__Impl
	rule__Case__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Case__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCaseAccess().getNameAssignment_2()); }
	(rule__Case__NameAssignment_2)
	{ after(grammarAccess.getCaseAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Case__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Case__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Case__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCaseAccess().getSemicolonKeyword_3()); }
	';'
	{ after(grammarAccess.getCaseAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Case__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Case__Group_0__0__Impl
	rule__Case__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Case__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCaseAccess().getCaseKeyword_0_0()); }
	'case'
	{ after(grammarAccess.getCaseAccess().getCaseKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Case__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Case__Group_0__1__Impl
	rule__Case__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Case__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCaseAccess().getLabelsAssignment_0_1()); }
	(rule__Case__LabelsAssignment_0_1)
	{ after(grammarAccess.getCaseAccess().getLabelsAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Case__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Case__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Case__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCaseAccess().getColonKeyword_0_2()); }
	':'
	{ after(grammarAccess.getCaseAccess().getColonKeyword_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AnyDeclarator__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnyDeclarator__Group__0__Impl
	rule__AnyDeclarator__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AnyDeclarator__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnyDeclaratorAccess().getNameAssignment_0()); }
	(rule__AnyDeclarator__NameAssignment_0)
	{ after(grammarAccess.getAnyDeclaratorAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnyDeclarator__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnyDeclarator__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AnyDeclarator__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnyDeclaratorAccess().getArraySizeAssignment_1()); }
	(rule__AnyDeclarator__ArraySizeAssignment_1)?
	{ after(grammarAccess.getAnyDeclaratorAccess().getArraySizeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FixedArraySize__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FixedArraySize__Group__0__Impl
	rule__FixedArraySize__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FixedArraySize__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFixedArraySizeAccess().getLeftSquareBracketKeyword_0()); }
	'['
	{ after(grammarAccess.getFixedArraySizeAccess().getLeftSquareBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FixedArraySize__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FixedArraySize__Group__1__Impl
	rule__FixedArraySize__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FixedArraySize__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFixedArraySizeAccess().getSizeAssignment_1()); }
	(rule__FixedArraySize__SizeAssignment_1)
	{ after(grammarAccess.getFixedArraySizeAccess().getSizeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FixedArraySize__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FixedArraySize__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FixedArraySize__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFixedArraySizeAccess().getRightSquareBracketKeyword_2()); }
	']'
	{ after(grammarAccess.getFixedArraySizeAccess().getRightSquareBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_1__0__Impl
	rule__Type__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getBoundedSequenceAction_1_0()); }
	()
	{ after(grammarAccess.getTypeAccess().getBoundedSequenceAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_1__1__Impl
	rule__Type__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getSequenceKeyword_1_1()); }
	'sequence'
	{ after(grammarAccess.getTypeAccess().getSequenceKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_1__2__Impl
	rule__Type__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getLessThanSignKeyword_1_2()); }
	'<'
	{ after(grammarAccess.getTypeAccess().getLessThanSignKeyword_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_1__3__Impl
	rule__Type__Group_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getTypeAssignment_1_3()); }
	(rule__Type__TypeAssignment_1_3)
	{ after(grammarAccess.getTypeAccess().getTypeAssignment_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_1__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_1__4__Impl
	rule__Type__Group_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_1__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getCommaKeyword_1_4()); }
	','
	{ after(grammarAccess.getTypeAccess().getCommaKeyword_1_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_1__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_1__5__Impl
	rule__Type__Group_1__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_1__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getSizeAssignment_1_5()); }
	(rule__Type__SizeAssignment_1_5)
	{ after(grammarAccess.getTypeAccess().getSizeAssignment_1_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_1__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_1__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_1__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_1_6()); }
	'>'
	{ after(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_1_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_2__0__Impl
	rule__Type__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getUnboundedSequenceAction_2_0()); }
	()
	{ after(grammarAccess.getTypeAccess().getUnboundedSequenceAction_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_2__1__Impl
	rule__Type__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getSequenceKeyword_2_1()); }
	'sequence'
	{ after(grammarAccess.getTypeAccess().getSequenceKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_2__2__Impl
	rule__Type__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getLessThanSignKeyword_2_2()); }
	'<'
	{ after(grammarAccess.getTypeAccess().getLessThanSignKeyword_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_2__3__Impl
	rule__Type__Group_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getTypeAssignment_2_3()); }
	(rule__Type__TypeAssignment_2_3)
	{ after(grammarAccess.getTypeAccess().getTypeAssignment_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_2__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_2__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_2__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_2_4()); }
	'>'
	{ after(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_2_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_3__0__Impl
	rule__Type__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getBoundedStringAction_3_0()); }
	()
	{ after(grammarAccess.getTypeAccess().getBoundedStringAction_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_3__1__Impl
	rule__Type__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getStringKeyword_3_1()); }
	'string'
	{ after(grammarAccess.getTypeAccess().getStringKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_3__2__Impl
	rule__Type__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getLessThanSignKeyword_3_2()); }
	'<'
	{ after(grammarAccess.getTypeAccess().getLessThanSignKeyword_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_3__3__Impl
	rule__Type__Group_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getSizeAssignment_3_3()); }
	(rule__Type__SizeAssignment_3_3)
	{ after(grammarAccess.getTypeAccess().getSizeAssignment_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_3__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_3__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_3__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_3_4()); }
	'>'
	{ after(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_3_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_4__0__Impl
	rule__Type__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getUnboundedStringAction_4_0()); }
	()
	{ after(grammarAccess.getTypeAccess().getUnboundedStringAction_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getStringKeyword_4_1()); }
	'string'
	{ after(grammarAccess.getTypeAccess().getStringKeyword_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_5__0__Impl
	rule__Type__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getBoundedWideStringAction_5_0()); }
	()
	{ after(grammarAccess.getTypeAccess().getBoundedWideStringAction_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_5__1__Impl
	rule__Type__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getWstringKeyword_5_1()); }
	'wstring'
	{ after(grammarAccess.getTypeAccess().getWstringKeyword_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_5__2__Impl
	rule__Type__Group_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getLessThanSignKeyword_5_2()); }
	'<'
	{ after(grammarAccess.getTypeAccess().getLessThanSignKeyword_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_5__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_5__3__Impl
	rule__Type__Group_5__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_5__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getSizeAssignment_5_3()); }
	(rule__Type__SizeAssignment_5_3)
	{ after(grammarAccess.getTypeAccess().getSizeAssignment_5_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_5__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_5__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_5__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_5_4()); }
	'>'
	{ after(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_5_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_6__0__Impl
	rule__Type__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getUnboundedWideStringAction_6_0()); }
	()
	{ after(grammarAccess.getTypeAccess().getUnboundedWideStringAction_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getWstringKeyword_6_1()); }
	'wstring'
	{ after(grammarAccess.getTypeAccess().getWstringKeyword_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_7__0__Impl
	rule__Type__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getFixedPtTypeAction_7_0()); }
	()
	{ after(grammarAccess.getTypeAccess().getFixedPtTypeAction_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_7__1__Impl
	rule__Type__Group_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getFixedKeyword_7_1()); }
	'fixed'
	{ after(grammarAccess.getTypeAccess().getFixedKeyword_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_7__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_7__2__Impl
	rule__Type__Group_7__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_7__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getLessThanSignKeyword_7_2()); }
	'<'
	{ after(grammarAccess.getTypeAccess().getLessThanSignKeyword_7_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_7__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_7__3__Impl
	rule__Type__Group_7__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_7__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getTotalDigitsAssignment_7_3()); }
	(rule__Type__TotalDigitsAssignment_7_3)
	{ after(grammarAccess.getTypeAccess().getTotalDigitsAssignment_7_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_7__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_7__4__Impl
	rule__Type__Group_7__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_7__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getCommaKeyword_7_4()); }
	','
	{ after(grammarAccess.getTypeAccess().getCommaKeyword_7_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_7__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_7__5__Impl
	rule__Type__Group_7__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_7__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getFractionalDigitsAssignment_7_5()); }
	(rule__Type__FractionalDigitsAssignment_7_5)
	{ after(grammarAccess.getTypeAccess().getFractionalDigitsAssignment_7_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_7__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_7__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_7__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_7_6()); }
	'>'
	{ after(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_7_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SimpleTypeSpec__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeSpec__Group_0__0__Impl
	rule__SimpleTypeSpec__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeSpecAccess().getSignedShortIntAction_0_0()); }
	()
	{ after(grammarAccess.getSimpleTypeSpecAccess().getSignedShortIntAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeSpec__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeSpecAccess().getShortKeyword_0_1()); }
	'short'
	{ after(grammarAccess.getSimpleTypeSpecAccess().getShortKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SimpleTypeSpec__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeSpec__Group_1__0__Impl
	rule__SimpleTypeSpec__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeSpecAccess().getSignedLongIntAction_1_0()); }
	()
	{ after(grammarAccess.getSimpleTypeSpecAccess().getSignedLongIntAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeSpec__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_1_1()); }
	'long'
	{ after(grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SimpleTypeSpec__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeSpec__Group_2__0__Impl
	rule__SimpleTypeSpec__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeSpecAccess().getSignedLongLongIntAction_2_0()); }
	()
	{ after(grammarAccess.getSimpleTypeSpecAccess().getSignedLongLongIntAction_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeSpec__Group_2__1__Impl
	rule__SimpleTypeSpec__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_2_1()); }
	'long'
	{ after(grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeSpec__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_2_2()); }
	'long'
	{ after(grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SimpleTypeSpec__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeSpec__Group_3__0__Impl
	rule__SimpleTypeSpec__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeSpecAccess().getUnsignedShortIntAction_3_0()); }
	()
	{ after(grammarAccess.getSimpleTypeSpecAccess().getUnsignedShortIntAction_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeSpec__Group_3__1__Impl
	rule__SimpleTypeSpec__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeSpecAccess().getUnsignedKeyword_3_1()); }
	'unsigned'
	{ after(grammarAccess.getSimpleTypeSpecAccess().getUnsignedKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeSpec__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeSpecAccess().getShortKeyword_3_2()); }
	'short'
	{ after(grammarAccess.getSimpleTypeSpecAccess().getShortKeyword_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SimpleTypeSpec__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeSpec__Group_4__0__Impl
	rule__SimpleTypeSpec__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeSpecAccess().getUnsignedLongIntAction_4_0()); }
	()
	{ after(grammarAccess.getSimpleTypeSpecAccess().getUnsignedLongIntAction_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeSpec__Group_4__1__Impl
	rule__SimpleTypeSpec__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeSpecAccess().getUnsignedKeyword_4_1()); }
	'unsigned'
	{ after(grammarAccess.getSimpleTypeSpecAccess().getUnsignedKeyword_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeSpec__Group_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_4_2()); }
	'long'
	{ after(grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SimpleTypeSpec__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeSpec__Group_5__0__Impl
	rule__SimpleTypeSpec__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeSpecAccess().getUnsignedLongLongIntAction_5_0()); }
	()
	{ after(grammarAccess.getSimpleTypeSpecAccess().getUnsignedLongLongIntAction_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeSpec__Group_5__1__Impl
	rule__SimpleTypeSpec__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeSpecAccess().getUnsignedKeyword_5_1()); }
	'unsigned'
	{ after(grammarAccess.getSimpleTypeSpecAccess().getUnsignedKeyword_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeSpec__Group_5__2__Impl
	rule__SimpleTypeSpec__Group_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_5_2()); }
	'long'
	{ after(grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_5__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeSpec__Group_5__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_5__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_5_3()); }
	'long'
	{ after(grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_5_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SimpleTypeSpec__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeSpec__Group_6__0__Impl
	rule__SimpleTypeSpec__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeSpecAccess().getFloatTypeAction_6_0()); }
	()
	{ after(grammarAccess.getSimpleTypeSpecAccess().getFloatTypeAction_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeSpec__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeSpecAccess().getFloatKeyword_6_1()); }
	'float'
	{ after(grammarAccess.getSimpleTypeSpecAccess().getFloatKeyword_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SimpleTypeSpec__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeSpec__Group_7__0__Impl
	rule__SimpleTypeSpec__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeSpecAccess().getDoubleTypeAction_7_0()); }
	()
	{ after(grammarAccess.getSimpleTypeSpecAccess().getDoubleTypeAction_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeSpec__Group_7__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeSpecAccess().getDoubleKeyword_7_1()); }
	'double'
	{ after(grammarAccess.getSimpleTypeSpecAccess().getDoubleKeyword_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SimpleTypeSpec__Group_8__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeSpec__Group_8__0__Impl
	rule__SimpleTypeSpec__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_8__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeSpecAccess().getLongDoubleTypeAction_8_0()); }
	()
	{ after(grammarAccess.getSimpleTypeSpecAccess().getLongDoubleTypeAction_8_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_8__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeSpec__Group_8__1__Impl
	rule__SimpleTypeSpec__Group_8__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_8__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_8_1()); }
	'long'
	{ after(grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_8_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_8__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeSpec__Group_8__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_8__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeSpecAccess().getDoubleKeyword_8_2()); }
	'double'
	{ after(grammarAccess.getSimpleTypeSpecAccess().getDoubleKeyword_8_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SimpleTypeSpec__Group_9__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeSpec__Group_9__0__Impl
	rule__SimpleTypeSpec__Group_9__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_9__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeSpecAccess().getCharTypeAction_9_0()); }
	()
	{ after(grammarAccess.getSimpleTypeSpecAccess().getCharTypeAction_9_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_9__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeSpec__Group_9__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_9__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeSpecAccess().getCharKeyword_9_1()); }
	'char'
	{ after(grammarAccess.getSimpleTypeSpecAccess().getCharKeyword_9_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SimpleTypeSpec__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeSpec__Group_10__0__Impl
	rule__SimpleTypeSpec__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeSpecAccess().getWideCharTypeAction_10_0()); }
	()
	{ after(grammarAccess.getSimpleTypeSpecAccess().getWideCharTypeAction_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeSpec__Group_10__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeSpecAccess().getWcharKeyword_10_1()); }
	'wchar'
	{ after(grammarAccess.getSimpleTypeSpecAccess().getWcharKeyword_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SimpleTypeSpec__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeSpec__Group_11__0__Impl
	rule__SimpleTypeSpec__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeSpecAccess().getBooleanTypeAction_11_0()); }
	()
	{ after(grammarAccess.getSimpleTypeSpecAccess().getBooleanTypeAction_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeSpec__Group_11__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeSpecAccess().getBooleanKeyword_11_1()); }
	'boolean'
	{ after(grammarAccess.getSimpleTypeSpecAccess().getBooleanKeyword_11_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SimpleTypeSpec__Group_12__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeSpec__Group_12__0__Impl
	rule__SimpleTypeSpec__Group_12__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_12__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeSpecAccess().getOctetTypeAction_12_0()); }
	()
	{ after(grammarAccess.getSimpleTypeSpecAccess().getOctetTypeAction_12_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_12__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeSpec__Group_12__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_12__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeSpecAccess().getOctetKeyword_12_1()); }
	'octet'
	{ after(grammarAccess.getSimpleTypeSpecAccess().getOctetKeyword_12_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SimpleTypeSpec__Group_13__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeSpec__Group_13__0__Impl
	rule__SimpleTypeSpec__Group_13__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_13__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeSpecAccess().getReferencedTypeAction_13_0()); }
	()
	{ after(grammarAccess.getSimpleTypeSpecAccess().getReferencedTypeAction_13_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_13__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeSpec__Group_13__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__Group_13__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeSpecAccess().getTypeAssignment_13_1()); }
	(rule__SimpleTypeSpec__TypeAssignment_13_1)
	{ after(grammarAccess.getSimpleTypeSpecAccess().getTypeAssignment_13_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ScopedName__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScopedName__Group__0__Impl
	rule__ScopedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ScopedName__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScopedNameAccess().getColonColonKeyword_0()); }
	('::')?
	{ after(grammarAccess.getScopedNameAccess().getColonColonKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScopedName__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScopedName__Group__1__Impl
	rule__ScopedName__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ScopedName__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScopedNameAccess().getGroup_1()); }
	(rule__ScopedName__Group_1__0)*
	{ after(grammarAccess.getScopedNameAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScopedName__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScopedName__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ScopedName__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScopedNameAccess().getIDTerminalRuleCall_2()); }
	RULE_ID
	{ after(grammarAccess.getScopedNameAccess().getIDTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ScopedName__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScopedName__Group_1__0__Impl
	rule__ScopedName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ScopedName__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScopedNameAccess().getIDTerminalRuleCall_1_0()); }
	RULE_ID
	{ after(grammarAccess.getScopedNameAccess().getIDTerminalRuleCall_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScopedName__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScopedName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ScopedName__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScopedNameAccess().getColonColonKeyword_1_1()); }
	'::'
	{ after(grammarAccess.getScopedNameAccess().getColonColonKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Specification__DefinitionsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpecificationAccess().getDefinitionsDefinitionParserRuleCall_0()); }
		ruleDefinition
		{ after(grammarAccess.getSpecificationAccess().getDefinitionsDefinitionParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__NameAssignment_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_0_2_0()); }
		RULE_ID
		{ after(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__DefinitionsAssignment_0_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefinitionAccess().getDefinitionsDefinitionParserRuleCall_0_4_0()); }
		ruleDefinition
		{ after(grammarAccess.getDefinitionAccess().getDefinitionsDefinitionParserRuleCall_0_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__NameAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_2_0()); }
		RULE_ID
		{ after(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__MembersAssignment_1_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefinitionAccess().getMembersMemberParserRuleCall_1_4_0()); }
		ruleMember
		{ after(grammarAccess.getDefinitionAccess().getMembersMemberParserRuleCall_1_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__StructAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefinitionAccess().getStructStructCrossReference_2_2_0()); }
		(
			{ before(grammarAccess.getDefinitionAccess().getStructStructIDTerminalRuleCall_2_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getDefinitionAccess().getStructStructIDTerminalRuleCall_2_2_0_1()); }
		)
		{ after(grammarAccess.getDefinitionAccess().getStructStructCrossReference_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__NameAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_3_2_0()); }
		RULE_ID
		{ after(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__CasesAssignment_3_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefinitionAccess().getCasesCaseParserRuleCall_3_10_0()); }
		ruleCase
		{ after(grammarAccess.getDefinitionAccess().getCasesCaseParserRuleCall_3_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__NameAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_4_2_0()); }
		RULE_ID
		{ after(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__LiteralsAssignment_4_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefinitionAccess().getLiteralsIDTerminalRuleCall_4_4_0()); }
		RULE_ID
		{ after(grammarAccess.getDefinitionAccess().getLiteralsIDTerminalRuleCall_4_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__LiteralsAssignment_4_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefinitionAccess().getLiteralsIDTerminalRuleCall_4_5_1_0()); }
		RULE_ID
		{ after(grammarAccess.getDefinitionAccess().getLiteralsIDTerminalRuleCall_4_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__TypeAssignment_5_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefinitionAccess().getTypeTypeParserRuleCall_5_2_0()); }
		ruleType
		{ after(grammarAccess.getDefinitionAccess().getTypeTypeParserRuleCall_5_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__NamesAssignment_5_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefinitionAccess().getNamesAnyDeclaratorParserRuleCall_5_3_0()); }
		ruleAnyDeclarator
		{ after(grammarAccess.getDefinitionAccess().getNamesAnyDeclaratorParserRuleCall_5_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__NamesAssignment_5_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefinitionAccess().getNamesAnyDeclaratorParserRuleCall_5_4_1_0()); }
		ruleAnyDeclarator
		{ after(grammarAccess.getDefinitionAccess().getNamesAnyDeclaratorParserRuleCall_5_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Member__TypeAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMemberAccess().getTypeSimpleTypeSpecParserRuleCall_0_0()); }
		ruleSimpleTypeSpec
		{ after(grammarAccess.getMemberAccess().getTypeSimpleTypeSpecParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Member__NamesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMemberAccess().getNamesIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getMemberAccess().getNamesIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Member__NamesAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMemberAccess().getNamesIDTerminalRuleCall_2_1_0()); }
		RULE_ID
		{ after(grammarAccess.getMemberAccess().getNamesIDTerminalRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Case__LabelsAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCaseAccess().getLabelsINTTerminalRuleCall_0_1_0()); }
		RULE_INT
		{ after(grammarAccess.getCaseAccess().getLabelsINTTerminalRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Case__TypeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCaseAccess().getTypeSimpleTypeSpecParserRuleCall_1_0()); }
		ruleSimpleTypeSpec
		{ after(grammarAccess.getCaseAccess().getTypeSimpleTypeSpecParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Case__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCaseAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getCaseAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnyDeclarator__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnyDeclaratorAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getAnyDeclaratorAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnyDeclarator__ArraySizeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnyDeclaratorAccess().getArraySizeFixedArraySizeParserRuleCall_1_0()); }
		ruleFixedArraySize
		{ after(grammarAccess.getAnyDeclaratorAccess().getArraySizeFixedArraySizeParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FixedArraySize__SizeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFixedArraySizeAccess().getSizeINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getFixedArraySizeAccess().getSizeINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__TypeAssignment_1_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getTypeSimpleTypeSpecParserRuleCall_1_3_0()); }
		ruleSimpleTypeSpec
		{ after(grammarAccess.getTypeAccess().getTypeSimpleTypeSpecParserRuleCall_1_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__SizeAssignment_1_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_1_5_0()); }
		RULE_INT
		{ after(grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_1_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__TypeAssignment_2_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getTypeSimpleTypeSpecParserRuleCall_2_3_0()); }
		ruleSimpleTypeSpec
		{ after(grammarAccess.getTypeAccess().getTypeSimpleTypeSpecParserRuleCall_2_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__SizeAssignment_3_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_3_3_0()); }
		RULE_INT
		{ after(grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_3_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__SizeAssignment_5_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_5_3_0()); }
		RULE_INT
		{ after(grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_5_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__TotalDigitsAssignment_7_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getTotalDigitsINTTerminalRuleCall_7_3_0()); }
		RULE_INT
		{ after(grammarAccess.getTypeAccess().getTotalDigitsINTTerminalRuleCall_7_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__FractionalDigitsAssignment_7_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getFractionalDigitsINTTerminalRuleCall_7_5_0()); }
		RULE_INT
		{ after(grammarAccess.getTypeAccess().getFractionalDigitsINTTerminalRuleCall_7_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeSpec__TypeAssignment_13_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSimpleTypeSpecAccess().getTypeDefinitionCrossReference_13_1_0()); }
		(
			{ before(grammarAccess.getSimpleTypeSpecAccess().getTypeDefinitionScopedNameParserRuleCall_13_1_0_1()); }
			ruleScopedName
			{ after(grammarAccess.getSimpleTypeSpecAccess().getTypeDefinitionScopedNameParserRuleCall_13_1_0_1()); }
		)
		{ after(grammarAccess.getSimpleTypeSpecAccess().getTypeDefinitionCrossReference_13_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_PREPROCESSOR : ('#define'|'#endif'|'#ifndef'|'#include') ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
