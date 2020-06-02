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

// Entry rule entryRuleNamedDefinition
entryRuleNamedDefinition
:
{ before(grammarAccess.getNamedDefinitionRule()); }
	 ruleNamedDefinition
{ after(grammarAccess.getNamedDefinitionRule()); } 
	 EOF 
;

// Rule NamedDefinition
ruleNamedDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getAlternatives()); }
		(rule__NamedDefinition__Alternatives)
		{ after(grammarAccess.getNamedDefinitionAccess().getAlternatives()); }
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
		{ before(grammarAccess.getDefinitionAccess().getNamedDefinitionParserRuleCall_0()); }
		ruleNamedDefinition
		{ after(grammarAccess.getDefinitionAccess().getNamedDefinitionParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getDefinitionAccess().getGroup_1()); }
		(rule__Definition__Group_1__0)
		{ after(grammarAccess.getDefinitionAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getGroup_0()); }
		(rule__NamedDefinition__Group_0__0)
		{ after(grammarAccess.getNamedDefinitionAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getGroup_1()); }
		(rule__NamedDefinition__Group_1__0)
		{ after(grammarAccess.getNamedDefinitionAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getGroup_2()); }
		(rule__NamedDefinition__Group_2__0)
		{ after(grammarAccess.getNamedDefinitionAccess().getGroup_2()); }
	)
	|
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getGroup_3()); }
		(rule__NamedDefinition__Group_3__0)
		{ after(grammarAccess.getNamedDefinitionAccess().getGroup_3()); }
	)
	|
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getGroup_4()); }
		(rule__NamedDefinition__Group_4__0)
		{ after(grammarAccess.getNamedDefinitionAccess().getGroup_4()); }
	)
	|
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getGroup_5()); }
		(rule__NamedDefinition__Group_5__0)
		{ after(grammarAccess.getNamedDefinitionAccess().getGroup_5()); }
	)
	|
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getGroup_6()); }
		(rule__NamedDefinition__Group_6__0)
		{ after(grammarAccess.getNamedDefinitionAccess().getGroup_6()); }
	)
	|
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getGroup_7()); }
		(rule__NamedDefinition__Group_7__0)
		{ after(grammarAccess.getNamedDefinitionAccess().getGroup_7()); }
	)
	|
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getGroup_8()); }
		(rule__NamedDefinition__Group_8__0)
		{ after(grammarAccess.getNamedDefinitionAccess().getGroup_8()); }
	)
	|
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getGroup_9()); }
		(rule__NamedDefinition__Group_9__0)
		{ after(grammarAccess.getNamedDefinitionAccess().getGroup_9()); }
	)
	|
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getGroup_10()); }
		(rule__NamedDefinition__Group_10__0)
		{ after(grammarAccess.getNamedDefinitionAccess().getGroup_10()); }
	)
	|
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getGroup_11()); }
		(rule__NamedDefinition__Group_11__0)
		{ after(grammarAccess.getNamedDefinitionAccess().getGroup_11()); }
	)
	|
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getGroup_12()); }
		(rule__NamedDefinition__Group_12__0)
		{ after(grammarAccess.getNamedDefinitionAccess().getGroup_12()); }
	)
	|
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getGroup_13()); }
		(rule__NamedDefinition__Group_13__0)
		{ after(grammarAccess.getNamedDefinitionAccess().getGroup_13()); }
	)
	|
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getGroup_14()); }
		(rule__NamedDefinition__Group_14__0)
		{ after(grammarAccess.getNamedDefinitionAccess().getGroup_14()); }
	)
	|
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getGroup_15()); }
		(rule__NamedDefinition__Group_15__0)
		{ after(grammarAccess.getNamedDefinitionAccess().getGroup_15()); }
	)
	|
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getGroup_16()); }
		(rule__NamedDefinition__Group_16__0)
		{ after(grammarAccess.getNamedDefinitionAccess().getGroup_16()); }
	)
	|
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getGroup_17()); }
		(rule__NamedDefinition__Group_17__0)
		{ after(grammarAccess.getNamedDefinitionAccess().getGroup_17()); }
	)
	|
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getGroup_18()); }
		(rule__NamedDefinition__Group_18__0)
		{ after(grammarAccess.getNamedDefinitionAccess().getGroup_18()); }
	)
	|
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getGroup_19()); }
		(rule__NamedDefinition__Group_19__0)
		{ after(grammarAccess.getNamedDefinitionAccess().getGroup_19()); }
	)
	|
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getGroup_20()); }
		(rule__NamedDefinition__Group_20__0)
		{ after(grammarAccess.getNamedDefinitionAccess().getGroup_20()); }
	)
	|
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getGroup_21()); }
		(rule__NamedDefinition__Group_21__0)
		{ after(grammarAccess.getNamedDefinitionAccess().getGroup_21()); }
	)
	|
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getGroup_22()); }
		(rule__NamedDefinition__Group_22__0)
		{ after(grammarAccess.getNamedDefinitionAccess().getGroup_22()); }
	)
	|
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getGroup_23()); }
		(rule__NamedDefinition__Group_23__0)
		{ after(grammarAccess.getNamedDefinitionAccess().getGroup_23()); }
	)
	|
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getGroup_24()); }
		(rule__NamedDefinition__Group_24__0)
		{ after(grammarAccess.getNamedDefinitionAccess().getGroup_24()); }
	)
	|
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getGroup_25()); }
		(rule__NamedDefinition__Group_25__0)
		{ after(grammarAccess.getNamedDefinitionAccess().getGroup_25()); }
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
	{ before(grammarAccess.getDefinitionAccess().getStructForwardAction_1_0()); }
	()
	{ after(grammarAccess.getDefinitionAccess().getStructForwardAction_1_0()); }
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
	{ before(grammarAccess.getDefinitionAccess().getStructAssignment_1_2()); }
	(rule__Definition__StructAssignment_1_2)
	{ after(grammarAccess.getDefinitionAccess().getStructAssignment_1_2()); }
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
	{ before(grammarAccess.getDefinitionAccess().getSemicolonKeyword_1_3()); }
	';'
	{ after(grammarAccess.getDefinitionAccess().getSemicolonKeyword_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamedDefinition__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_0__0__Impl
	rule__NamedDefinition__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getModuleAction_0_0()); }
	()
	{ after(grammarAccess.getNamedDefinitionAccess().getModuleAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_0__1__Impl
	rule__NamedDefinition__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getModuleKeyword_0_1()); }
	'module'
	{ after(grammarAccess.getNamedDefinitionAccess().getModuleKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_0__2__Impl
	rule__NamedDefinition__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_0_2()); }
	(rule__NamedDefinition__NameAssignment_0_2)
	{ after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_0__3__Impl
	rule__NamedDefinition__Group_0__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getLeftCurlyBracketKeyword_0_3()); }
	'{'
	{ after(grammarAccess.getNamedDefinitionAccess().getLeftCurlyBracketKeyword_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_0__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_0__4__Impl
	rule__NamedDefinition__Group_0__5
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_0__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getDefinitionsAssignment_0_4()); }
		(rule__NamedDefinition__DefinitionsAssignment_0_4)
		{ after(grammarAccess.getNamedDefinitionAccess().getDefinitionsAssignment_0_4()); }
	)
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getDefinitionsAssignment_0_4()); }
		(rule__NamedDefinition__DefinitionsAssignment_0_4)*
		{ after(grammarAccess.getNamedDefinitionAccess().getDefinitionsAssignment_0_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_0__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_0__5__Impl
	rule__NamedDefinition__Group_0__6
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_0__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getRightCurlyBracketKeyword_0_5()); }
	'}'
	{ after(grammarAccess.getNamedDefinitionAccess().getRightCurlyBracketKeyword_0_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_0__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_0__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_0__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_0_6()); }
	';'
	{ after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_0_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamedDefinition__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_1__0__Impl
	rule__NamedDefinition__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getStructAction_1_0()); }
	()
	{ after(grammarAccess.getNamedDefinitionAccess().getStructAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_1__1__Impl
	rule__NamedDefinition__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getStructKeyword_1_1()); }
	'struct'
	{ after(grammarAccess.getNamedDefinitionAccess().getStructKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_1__2__Impl
	rule__NamedDefinition__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_1_2()); }
	(rule__NamedDefinition__NameAssignment_1_2)
	{ after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_1__3__Impl
	rule__NamedDefinition__Group_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getLeftCurlyBracketKeyword_1_3()); }
	'{'
	{ after(grammarAccess.getNamedDefinitionAccess().getLeftCurlyBracketKeyword_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_1__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_1__4__Impl
	rule__NamedDefinition__Group_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_1__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getMembersAssignment_1_4()); }
		(rule__NamedDefinition__MembersAssignment_1_4)
		{ after(grammarAccess.getNamedDefinitionAccess().getMembersAssignment_1_4()); }
	)
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getMembersAssignment_1_4()); }
		(rule__NamedDefinition__MembersAssignment_1_4)*
		{ after(grammarAccess.getNamedDefinitionAccess().getMembersAssignment_1_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_1__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_1__5__Impl
	rule__NamedDefinition__Group_1__6
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_1__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getRightCurlyBracketKeyword_1_5()); }
	'}'
	{ after(grammarAccess.getNamedDefinitionAccess().getRightCurlyBracketKeyword_1_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_1__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_1__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_1__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_1_6()); }
	';'
	{ after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_1_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamedDefinition__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_2__0__Impl
	rule__NamedDefinition__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getUnionAction_2_0()); }
	()
	{ after(grammarAccess.getNamedDefinitionAccess().getUnionAction_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_2__1__Impl
	rule__NamedDefinition__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getUnionKeyword_2_1()); }
	'union'
	{ after(grammarAccess.getNamedDefinitionAccess().getUnionKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_2__2__Impl
	rule__NamedDefinition__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_2_2()); }
	(rule__NamedDefinition__NameAssignment_2_2)
	{ after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_2__3__Impl
	rule__NamedDefinition__Group_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getLeftCurlyBracketKeyword_2_3()); }
	'{'
	{ after(grammarAccess.getNamedDefinitionAccess().getLeftCurlyBracketKeyword_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_2__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_2__4__Impl
	rule__NamedDefinition__Group_2__5
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_2__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSwitchKeyword_2_4()); }
	'switch'
	{ after(grammarAccess.getNamedDefinitionAccess().getSwitchKeyword_2_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_2__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_2__5__Impl
	rule__NamedDefinition__Group_2__6
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_2__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getLeftParenthesisKeyword_2_5()); }
	'('
	{ after(grammarAccess.getNamedDefinitionAccess().getLeftParenthesisKeyword_2_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_2__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_2__6__Impl
	rule__NamedDefinition__Group_2__7
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_2__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getUnsignedKeyword_2_6()); }
	'unsigned'
	{ after(grammarAccess.getNamedDefinitionAccess().getUnsignedKeyword_2_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_2__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_2__7__Impl
	rule__NamedDefinition__Group_2__8
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_2__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getShortKeyword_2_7()); }
	'short'
	{ after(grammarAccess.getNamedDefinitionAccess().getShortKeyword_2_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_2__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_2__8__Impl
	rule__NamedDefinition__Group_2__9
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_2__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getRightParenthesisKeyword_2_8()); }
	')'
	{ after(grammarAccess.getNamedDefinitionAccess().getRightParenthesisKeyword_2_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_2__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_2__9__Impl
	rule__NamedDefinition__Group_2__10
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_2__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getLeftCurlyBracketKeyword_2_9()); }
	'{'
	{ after(grammarAccess.getNamedDefinitionAccess().getLeftCurlyBracketKeyword_2_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_2__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_2__10__Impl
	rule__NamedDefinition__Group_2__11
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_2__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getCasesAssignment_2_10()); }
		(rule__NamedDefinition__CasesAssignment_2_10)
		{ after(grammarAccess.getNamedDefinitionAccess().getCasesAssignment_2_10()); }
	)
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getCasesAssignment_2_10()); }
		(rule__NamedDefinition__CasesAssignment_2_10)*
		{ after(grammarAccess.getNamedDefinitionAccess().getCasesAssignment_2_10()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_2__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_2__11__Impl
	rule__NamedDefinition__Group_2__12
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_2__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getRightCurlyBracketKeyword_2_11()); }
	'}'
	{ after(grammarAccess.getNamedDefinitionAccess().getRightCurlyBracketKeyword_2_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_2__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_2__12__Impl
	rule__NamedDefinition__Group_2__13
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_2__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_2_12()); }
	';'
	{ after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_2_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_2__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_2__13__Impl
	rule__NamedDefinition__Group_2__14
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_2__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getRightCurlyBracketKeyword_2_13()); }
	'}'
	{ after(grammarAccess.getNamedDefinitionAccess().getRightCurlyBracketKeyword_2_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_2__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_2__14__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_2__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_2_14()); }
	';'
	{ after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_2_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamedDefinition__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_3__0__Impl
	rule__NamedDefinition__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getEnumAction_3_0()); }
	()
	{ after(grammarAccess.getNamedDefinitionAccess().getEnumAction_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_3__1__Impl
	rule__NamedDefinition__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getEnumKeyword_3_1()); }
	'enum'
	{ after(grammarAccess.getNamedDefinitionAccess().getEnumKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_3__2__Impl
	rule__NamedDefinition__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_3_2()); }
	(rule__NamedDefinition__NameAssignment_3_2)
	{ after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_3__3__Impl
	rule__NamedDefinition__Group_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getLeftCurlyBracketKeyword_3_3()); }
	'{'
	{ after(grammarAccess.getNamedDefinitionAccess().getLeftCurlyBracketKeyword_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_3__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_3__4__Impl
	rule__NamedDefinition__Group_3__5
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_3__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getLiteralsAssignment_3_4()); }
	(rule__NamedDefinition__LiteralsAssignment_3_4)
	{ after(grammarAccess.getNamedDefinitionAccess().getLiteralsAssignment_3_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_3__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_3__5__Impl
	rule__NamedDefinition__Group_3__6
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_3__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getGroup_3_5()); }
	(rule__NamedDefinition__Group_3_5__0)*
	{ after(grammarAccess.getNamedDefinitionAccess().getGroup_3_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_3__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_3__6__Impl
	rule__NamedDefinition__Group_3__7
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_3__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getRightCurlyBracketKeyword_3_6()); }
	'}'
	{ after(grammarAccess.getNamedDefinitionAccess().getRightCurlyBracketKeyword_3_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_3__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_3__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_3__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_3_7()); }
	';'
	{ after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_3_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamedDefinition__Group_3_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_3_5__0__Impl
	rule__NamedDefinition__Group_3_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_3_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getCommaKeyword_3_5_0()); }
	','
	{ after(grammarAccess.getNamedDefinitionAccess().getCommaKeyword_3_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_3_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_3_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_3_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getLiteralsAssignment_3_5_1()); }
	(rule__NamedDefinition__LiteralsAssignment_3_5_1)
	{ after(grammarAccess.getNamedDefinitionAccess().getLiteralsAssignment_3_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamedDefinition__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_4__0__Impl
	rule__NamedDefinition__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getArrayTypeAction_4_0()); }
	()
	{ after(grammarAccess.getNamedDefinitionAccess().getArrayTypeAction_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_4__1__Impl
	rule__NamedDefinition__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_4_1()); }
	'typedef'
	{ after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_4__2__Impl
	rule__NamedDefinition__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getTypeAssignment_4_2()); }
	(rule__NamedDefinition__TypeAssignment_4_2)
	{ after(grammarAccess.getNamedDefinitionAccess().getTypeAssignment_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_4__3__Impl
	rule__NamedDefinition__Group_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_4_3()); }
	(rule__NamedDefinition__NameAssignment_4_3)
	{ after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_4__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_4__4__Impl
	rule__NamedDefinition__Group_4__5
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_4__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getLeftSquareBracketKeyword_4_4()); }
	'['
	{ after(grammarAccess.getNamedDefinitionAccess().getLeftSquareBracketKeyword_4_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_4__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_4__5__Impl
	rule__NamedDefinition__Group_4__6
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_4__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSizeAssignment_4_5()); }
	(rule__NamedDefinition__SizeAssignment_4_5)
	{ after(grammarAccess.getNamedDefinitionAccess().getSizeAssignment_4_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_4__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_4__6__Impl
	rule__NamedDefinition__Group_4__7
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_4__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getRightSquareBracketKeyword_4_6()); }
	']'
	{ after(grammarAccess.getNamedDefinitionAccess().getRightSquareBracketKeyword_4_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_4__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_4__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_4__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_4_7()); }
	';'
	{ after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_4_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamedDefinition__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_5__0__Impl
	rule__NamedDefinition__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSignedShortIntAction_5_0()); }
	()
	{ after(grammarAccess.getNamedDefinitionAccess().getSignedShortIntAction_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_5__1__Impl
	rule__NamedDefinition__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_5_1()); }
	'typedef'
	{ after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_5__2__Impl
	rule__NamedDefinition__Group_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getShortKeyword_5_2()); }
	'short'
	{ after(grammarAccess.getNamedDefinitionAccess().getShortKeyword_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_5__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_5__3__Impl
	rule__NamedDefinition__Group_5__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_5__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_5_3()); }
	(rule__NamedDefinition__NameAssignment_5_3)
	{ after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_5_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_5__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_5__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_5__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_5_4()); }
	';'
	{ after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_5_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamedDefinition__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_6__0__Impl
	rule__NamedDefinition__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSignedLongIntAction_6_0()); }
	()
	{ after(grammarAccess.getNamedDefinitionAccess().getSignedLongIntAction_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_6__1__Impl
	rule__NamedDefinition__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_6_1()); }
	'typedef'
	{ after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_6__2__Impl
	rule__NamedDefinition__Group_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getLongKeyword_6_2()); }
	'long'
	{ after(grammarAccess.getNamedDefinitionAccess().getLongKeyword_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_6__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_6__3__Impl
	rule__NamedDefinition__Group_6__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_6__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_6_3()); }
	(rule__NamedDefinition__NameAssignment_6_3)
	{ after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_6_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_6__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_6__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_6__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_6_4()); }
	';'
	{ after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_6_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamedDefinition__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_7__0__Impl
	rule__NamedDefinition__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSignedLongLongIntAction_7_0()); }
	()
	{ after(grammarAccess.getNamedDefinitionAccess().getSignedLongLongIntAction_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_7__1__Impl
	rule__NamedDefinition__Group_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_7_1()); }
	'typedef'
	{ after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_7__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_7__2__Impl
	rule__NamedDefinition__Group_7__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_7__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getLongKeyword_7_2()); }
	'long'
	{ after(grammarAccess.getNamedDefinitionAccess().getLongKeyword_7_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_7__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_7__3__Impl
	rule__NamedDefinition__Group_7__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_7__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getLongKeyword_7_3()); }
	'long'
	{ after(grammarAccess.getNamedDefinitionAccess().getLongKeyword_7_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_7__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_7__4__Impl
	rule__NamedDefinition__Group_7__5
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_7__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_7_4()); }
	(rule__NamedDefinition__NameAssignment_7_4)
	{ after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_7_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_7__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_7__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_7__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_7_5()); }
	';'
	{ after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_7_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamedDefinition__Group_8__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_8__0__Impl
	rule__NamedDefinition__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_8__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getUnsignedShortIntAction_8_0()); }
	()
	{ after(grammarAccess.getNamedDefinitionAccess().getUnsignedShortIntAction_8_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_8__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_8__1__Impl
	rule__NamedDefinition__Group_8__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_8__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_8_1()); }
	'typedef'
	{ after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_8_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_8__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_8__2__Impl
	rule__NamedDefinition__Group_8__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_8__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getUnsignedKeyword_8_2()); }
	'unsigned'
	{ after(grammarAccess.getNamedDefinitionAccess().getUnsignedKeyword_8_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_8__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_8__3__Impl
	rule__NamedDefinition__Group_8__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_8__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getShortKeyword_8_3()); }
	'short'
	{ after(grammarAccess.getNamedDefinitionAccess().getShortKeyword_8_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_8__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_8__4__Impl
	rule__NamedDefinition__Group_8__5
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_8__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_8_4()); }
	(rule__NamedDefinition__NameAssignment_8_4)
	{ after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_8_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_8__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_8__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_8__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_8_5()); }
	';'
	{ after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_8_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamedDefinition__Group_9__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_9__0__Impl
	rule__NamedDefinition__Group_9__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_9__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getUnsignedLongIntAction_9_0()); }
	()
	{ after(grammarAccess.getNamedDefinitionAccess().getUnsignedLongIntAction_9_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_9__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_9__1__Impl
	rule__NamedDefinition__Group_9__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_9__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_9_1()); }
	'typedef'
	{ after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_9_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_9__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_9__2__Impl
	rule__NamedDefinition__Group_9__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_9__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getUnsignedKeyword_9_2()); }
	'unsigned'
	{ after(grammarAccess.getNamedDefinitionAccess().getUnsignedKeyword_9_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_9__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_9__3__Impl
	rule__NamedDefinition__Group_9__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_9__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getLongKeyword_9_3()); }
	'long'
	{ after(grammarAccess.getNamedDefinitionAccess().getLongKeyword_9_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_9__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_9__4__Impl
	rule__NamedDefinition__Group_9__5
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_9__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_9_4()); }
	(rule__NamedDefinition__NameAssignment_9_4)
	{ after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_9_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_9__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_9__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_9__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_9_5()); }
	';'
	{ after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_9_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamedDefinition__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_10__0__Impl
	rule__NamedDefinition__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getUnsignedLongLongIntAction_10_0()); }
	()
	{ after(grammarAccess.getNamedDefinitionAccess().getUnsignedLongLongIntAction_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_10__1__Impl
	rule__NamedDefinition__Group_10__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_10_1()); }
	'typedef'
	{ after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_10__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_10__2__Impl
	rule__NamedDefinition__Group_10__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_10__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getUnsignedKeyword_10_2()); }
	'unsigned'
	{ after(grammarAccess.getNamedDefinitionAccess().getUnsignedKeyword_10_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_10__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_10__3__Impl
	rule__NamedDefinition__Group_10__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_10__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getLongKeyword_10_3()); }
	'long'
	{ after(grammarAccess.getNamedDefinitionAccess().getLongKeyword_10_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_10__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_10__4__Impl
	rule__NamedDefinition__Group_10__5
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_10__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getLongKeyword_10_4()); }
	'long'
	{ after(grammarAccess.getNamedDefinitionAccess().getLongKeyword_10_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_10__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_10__5__Impl
	rule__NamedDefinition__Group_10__6
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_10__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_10_5()); }
	(rule__NamedDefinition__NameAssignment_10_5)
	{ after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_10_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_10__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_10__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_10__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_10_6()); }
	';'
	{ after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_10_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamedDefinition__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_11__0__Impl
	rule__NamedDefinition__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getFloatTypeAction_11_0()); }
	()
	{ after(grammarAccess.getNamedDefinitionAccess().getFloatTypeAction_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_11__1__Impl
	rule__NamedDefinition__Group_11__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_11_1()); }
	'typedef'
	{ after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_11_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_11__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_11__2__Impl
	rule__NamedDefinition__Group_11__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_11__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getFloatKeyword_11_2()); }
	'float'
	{ after(grammarAccess.getNamedDefinitionAccess().getFloatKeyword_11_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_11__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_11__3__Impl
	rule__NamedDefinition__Group_11__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_11__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_11_3()); }
	(rule__NamedDefinition__NameAssignment_11_3)
	{ after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_11_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_11__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_11__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_11__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_11_4()); }
	';'
	{ after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_11_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamedDefinition__Group_12__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_12__0__Impl
	rule__NamedDefinition__Group_12__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_12__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getDoubleTypeAction_12_0()); }
	()
	{ after(grammarAccess.getNamedDefinitionAccess().getDoubleTypeAction_12_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_12__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_12__1__Impl
	rule__NamedDefinition__Group_12__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_12__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_12_1()); }
	'typedef'
	{ after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_12_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_12__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_12__2__Impl
	rule__NamedDefinition__Group_12__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_12__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getDoubleKeyword_12_2()); }
	'double'
	{ after(grammarAccess.getNamedDefinitionAccess().getDoubleKeyword_12_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_12__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_12__3__Impl
	rule__NamedDefinition__Group_12__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_12__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_12_3()); }
	(rule__NamedDefinition__NameAssignment_12_3)
	{ after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_12_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_12__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_12__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_12__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_12_4()); }
	';'
	{ after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_12_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamedDefinition__Group_13__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_13__0__Impl
	rule__NamedDefinition__Group_13__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_13__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getLongDoubleTypeAction_13_0()); }
	()
	{ after(grammarAccess.getNamedDefinitionAccess().getLongDoubleTypeAction_13_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_13__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_13__1__Impl
	rule__NamedDefinition__Group_13__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_13__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_13_1()); }
	'typedef'
	{ after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_13_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_13__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_13__2__Impl
	rule__NamedDefinition__Group_13__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_13__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getLongKeyword_13_2()); }
	'long'
	{ after(grammarAccess.getNamedDefinitionAccess().getLongKeyword_13_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_13__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_13__3__Impl
	rule__NamedDefinition__Group_13__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_13__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getDoubleKeyword_13_3()); }
	'double'
	{ after(grammarAccess.getNamedDefinitionAccess().getDoubleKeyword_13_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_13__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_13__4__Impl
	rule__NamedDefinition__Group_13__5
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_13__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_13_4()); }
	(rule__NamedDefinition__NameAssignment_13_4)
	{ after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_13_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_13__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_13__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_13__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_13_5()); }
	';'
	{ after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_13_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamedDefinition__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_14__0__Impl
	rule__NamedDefinition__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getCharTypeAction_14_0()); }
	()
	{ after(grammarAccess.getNamedDefinitionAccess().getCharTypeAction_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_14__1__Impl
	rule__NamedDefinition__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_14_1()); }
	'typedef'
	{ after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_14__2__Impl
	rule__NamedDefinition__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getCharKeyword_14_2()); }
	'char'
	{ after(grammarAccess.getNamedDefinitionAccess().getCharKeyword_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_14__3__Impl
	rule__NamedDefinition__Group_14__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_14_3()); }
	(rule__NamedDefinition__NameAssignment_14_3)
	{ after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_14__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_14__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_14__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_14_4()); }
	';'
	{ after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_14_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamedDefinition__Group_15__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_15__0__Impl
	rule__NamedDefinition__Group_15__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_15__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getWideCharTypeAction_15_0()); }
	()
	{ after(grammarAccess.getNamedDefinitionAccess().getWideCharTypeAction_15_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_15__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_15__1__Impl
	rule__NamedDefinition__Group_15__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_15__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_15_1()); }
	'typedef'
	{ after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_15_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_15__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_15__2__Impl
	rule__NamedDefinition__Group_15__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_15__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getWcharKeyword_15_2()); }
	'wchar'
	{ after(grammarAccess.getNamedDefinitionAccess().getWcharKeyword_15_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_15__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_15__3__Impl
	rule__NamedDefinition__Group_15__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_15__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_15_3()); }
	(rule__NamedDefinition__NameAssignment_15_3)
	{ after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_15_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_15__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_15__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_15__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_15_4()); }
	';'
	{ after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_15_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamedDefinition__Group_16__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_16__0__Impl
	rule__NamedDefinition__Group_16__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_16__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getBooleanTypeAction_16_0()); }
	()
	{ after(grammarAccess.getNamedDefinitionAccess().getBooleanTypeAction_16_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_16__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_16__1__Impl
	rule__NamedDefinition__Group_16__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_16__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_16_1()); }
	'typedef'
	{ after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_16_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_16__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_16__2__Impl
	rule__NamedDefinition__Group_16__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_16__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getBooleanKeyword_16_2()); }
	'boolean'
	{ after(grammarAccess.getNamedDefinitionAccess().getBooleanKeyword_16_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_16__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_16__3__Impl
	rule__NamedDefinition__Group_16__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_16__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_16_3()); }
	(rule__NamedDefinition__NameAssignment_16_3)
	{ after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_16_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_16__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_16__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_16__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_16_4()); }
	';'
	{ after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_16_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamedDefinition__Group_17__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_17__0__Impl
	rule__NamedDefinition__Group_17__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_17__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getOctetTypeAction_17_0()); }
	()
	{ after(grammarAccess.getNamedDefinitionAccess().getOctetTypeAction_17_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_17__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_17__1__Impl
	rule__NamedDefinition__Group_17__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_17__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_17_1()); }
	'typedef'
	{ after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_17_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_17__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_17__2__Impl
	rule__NamedDefinition__Group_17__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_17__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getOctetKeyword_17_2()); }
	'octet'
	{ after(grammarAccess.getNamedDefinitionAccess().getOctetKeyword_17_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_17__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_17__3__Impl
	rule__NamedDefinition__Group_17__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_17__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_17_3()); }
	(rule__NamedDefinition__NameAssignment_17_3)
	{ after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_17_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_17__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_17__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_17__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_17_4()); }
	';'
	{ after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_17_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamedDefinition__Group_18__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_18__0__Impl
	rule__NamedDefinition__Group_18__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_18__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getReferencedTypeAction_18_0()); }
	()
	{ after(grammarAccess.getNamedDefinitionAccess().getReferencedTypeAction_18_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_18__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_18__1__Impl
	rule__NamedDefinition__Group_18__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_18__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_18_1()); }
	'typedef'
	{ after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_18_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_18__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_18__2__Impl
	rule__NamedDefinition__Group_18__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_18__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getTypeAssignment_18_2()); }
	(rule__NamedDefinition__TypeAssignment_18_2)
	{ after(grammarAccess.getNamedDefinitionAccess().getTypeAssignment_18_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_18__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_18__3__Impl
	rule__NamedDefinition__Group_18__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_18__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_18_3()); }
	(rule__NamedDefinition__NameAssignment_18_3)
	{ after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_18_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_18__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_18__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_18__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_18_4()); }
	';'
	{ after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_18_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamedDefinition__Group_19__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_19__0__Impl
	rule__NamedDefinition__Group_19__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_19__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getBoundedSequenceAction_19_0()); }
	()
	{ after(grammarAccess.getNamedDefinitionAccess().getBoundedSequenceAction_19_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_19__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_19__1__Impl
	rule__NamedDefinition__Group_19__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_19__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_19_1()); }
	'typedef'
	{ after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_19_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_19__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_19__2__Impl
	rule__NamedDefinition__Group_19__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_19__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSequenceKeyword_19_2()); }
	'sequence'
	{ after(grammarAccess.getNamedDefinitionAccess().getSequenceKeyword_19_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_19__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_19__3__Impl
	rule__NamedDefinition__Group_19__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_19__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getLessThanSignKeyword_19_3()); }
	'<'
	{ after(grammarAccess.getNamedDefinitionAccess().getLessThanSignKeyword_19_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_19__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_19__4__Impl
	rule__NamedDefinition__Group_19__5
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_19__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getTypeAssignment_19_4()); }
	(rule__NamedDefinition__TypeAssignment_19_4)
	{ after(grammarAccess.getNamedDefinitionAccess().getTypeAssignment_19_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_19__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_19__5__Impl
	rule__NamedDefinition__Group_19__6
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_19__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getCommaKeyword_19_5()); }
	','
	{ after(grammarAccess.getNamedDefinitionAccess().getCommaKeyword_19_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_19__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_19__6__Impl
	rule__NamedDefinition__Group_19__7
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_19__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSizeAssignment_19_6()); }
	(rule__NamedDefinition__SizeAssignment_19_6)
	{ after(grammarAccess.getNamedDefinitionAccess().getSizeAssignment_19_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_19__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_19__7__Impl
	rule__NamedDefinition__Group_19__8
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_19__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getGreaterThanSignKeyword_19_7()); }
	'>'
	{ after(grammarAccess.getNamedDefinitionAccess().getGreaterThanSignKeyword_19_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_19__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_19__8__Impl
	rule__NamedDefinition__Group_19__9
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_19__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_19_8()); }
	(rule__NamedDefinition__NameAssignment_19_8)
	{ after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_19_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_19__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_19__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_19__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_19_9()); }
	';'
	{ after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_19_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamedDefinition__Group_20__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_20__0__Impl
	rule__NamedDefinition__Group_20__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_20__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getUnboundedSequenceAction_20_0()); }
	()
	{ after(grammarAccess.getNamedDefinitionAccess().getUnboundedSequenceAction_20_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_20__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_20__1__Impl
	rule__NamedDefinition__Group_20__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_20__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_20_1()); }
	'typedef'
	{ after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_20_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_20__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_20__2__Impl
	rule__NamedDefinition__Group_20__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_20__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSequenceKeyword_20_2()); }
	'sequence'
	{ after(grammarAccess.getNamedDefinitionAccess().getSequenceKeyword_20_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_20__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_20__3__Impl
	rule__NamedDefinition__Group_20__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_20__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getLessThanSignKeyword_20_3()); }
	'<'
	{ after(grammarAccess.getNamedDefinitionAccess().getLessThanSignKeyword_20_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_20__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_20__4__Impl
	rule__NamedDefinition__Group_20__5
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_20__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getTypeAssignment_20_4()); }
	(rule__NamedDefinition__TypeAssignment_20_4)
	{ after(grammarAccess.getNamedDefinitionAccess().getTypeAssignment_20_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_20__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_20__5__Impl
	rule__NamedDefinition__Group_20__6
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_20__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getGreaterThanSignKeyword_20_5()); }
	'>'
	{ after(grammarAccess.getNamedDefinitionAccess().getGreaterThanSignKeyword_20_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_20__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_20__6__Impl
	rule__NamedDefinition__Group_20__7
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_20__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_20_6()); }
	(rule__NamedDefinition__NameAssignment_20_6)
	{ after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_20_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_20__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_20__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_20__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_20_7()); }
	';'
	{ after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_20_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamedDefinition__Group_21__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_21__0__Impl
	rule__NamedDefinition__Group_21__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_21__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getBoundedStringAction_21_0()); }
	()
	{ after(grammarAccess.getNamedDefinitionAccess().getBoundedStringAction_21_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_21__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_21__1__Impl
	rule__NamedDefinition__Group_21__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_21__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_21_1()); }
	'typedef'
	{ after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_21_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_21__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_21__2__Impl
	rule__NamedDefinition__Group_21__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_21__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getStringKeyword_21_2()); }
	'string'
	{ after(grammarAccess.getNamedDefinitionAccess().getStringKeyword_21_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_21__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_21__3__Impl
	rule__NamedDefinition__Group_21__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_21__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getLessThanSignKeyword_21_3()); }
	'<'
	{ after(grammarAccess.getNamedDefinitionAccess().getLessThanSignKeyword_21_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_21__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_21__4__Impl
	rule__NamedDefinition__Group_21__5
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_21__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSizeAssignment_21_4()); }
	(rule__NamedDefinition__SizeAssignment_21_4)
	{ after(grammarAccess.getNamedDefinitionAccess().getSizeAssignment_21_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_21__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_21__5__Impl
	rule__NamedDefinition__Group_21__6
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_21__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getGreaterThanSignKeyword_21_5()); }
	'>'
	{ after(grammarAccess.getNamedDefinitionAccess().getGreaterThanSignKeyword_21_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_21__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_21__6__Impl
	rule__NamedDefinition__Group_21__7
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_21__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_21_6()); }
	(rule__NamedDefinition__NameAssignment_21_6)
	{ after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_21_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_21__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_21__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_21__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_21_7()); }
	';'
	{ after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_21_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamedDefinition__Group_22__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_22__0__Impl
	rule__NamedDefinition__Group_22__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_22__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getUnboundedStringAction_22_0()); }
	()
	{ after(grammarAccess.getNamedDefinitionAccess().getUnboundedStringAction_22_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_22__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_22__1__Impl
	rule__NamedDefinition__Group_22__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_22__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_22_1()); }
	'typedef'
	{ after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_22_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_22__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_22__2__Impl
	rule__NamedDefinition__Group_22__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_22__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getStringKeyword_22_2()); }
	'string'
	{ after(grammarAccess.getNamedDefinitionAccess().getStringKeyword_22_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_22__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_22__3__Impl
	rule__NamedDefinition__Group_22__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_22__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_22_3()); }
	(rule__NamedDefinition__NameAssignment_22_3)
	{ after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_22_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_22__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_22__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_22__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_22_4()); }
	';'
	{ after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_22_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamedDefinition__Group_23__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_23__0__Impl
	rule__NamedDefinition__Group_23__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_23__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getBoundedWideStringAction_23_0()); }
	()
	{ after(grammarAccess.getNamedDefinitionAccess().getBoundedWideStringAction_23_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_23__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_23__1__Impl
	rule__NamedDefinition__Group_23__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_23__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_23_1()); }
	'typedef'
	{ after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_23_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_23__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_23__2__Impl
	rule__NamedDefinition__Group_23__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_23__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getWstringKeyword_23_2()); }
	'wstring'
	{ after(grammarAccess.getNamedDefinitionAccess().getWstringKeyword_23_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_23__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_23__3__Impl
	rule__NamedDefinition__Group_23__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_23__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getLessThanSignKeyword_23_3()); }
	'<'
	{ after(grammarAccess.getNamedDefinitionAccess().getLessThanSignKeyword_23_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_23__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_23__4__Impl
	rule__NamedDefinition__Group_23__5
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_23__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSizeAssignment_23_4()); }
	(rule__NamedDefinition__SizeAssignment_23_4)
	{ after(grammarAccess.getNamedDefinitionAccess().getSizeAssignment_23_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_23__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_23__5__Impl
	rule__NamedDefinition__Group_23__6
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_23__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getGreaterThanSignKeyword_23_5()); }
	'>'
	{ after(grammarAccess.getNamedDefinitionAccess().getGreaterThanSignKeyword_23_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_23__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_23__6__Impl
	rule__NamedDefinition__Group_23__7
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_23__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_23_6()); }
	(rule__NamedDefinition__NameAssignment_23_6)
	{ after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_23_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_23__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_23__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_23__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_23_7()); }
	';'
	{ after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_23_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamedDefinition__Group_24__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_24__0__Impl
	rule__NamedDefinition__Group_24__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_24__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getUnboundedWideStringAction_24_0()); }
	()
	{ after(grammarAccess.getNamedDefinitionAccess().getUnboundedWideStringAction_24_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_24__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_24__1__Impl
	rule__NamedDefinition__Group_24__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_24__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_24_1()); }
	'typedef'
	{ after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_24_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_24__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_24__2__Impl
	rule__NamedDefinition__Group_24__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_24__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getWstringKeyword_24_2()); }
	'wstring'
	{ after(grammarAccess.getNamedDefinitionAccess().getWstringKeyword_24_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_24__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_24__3__Impl
	rule__NamedDefinition__Group_24__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_24__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_24_3()); }
	(rule__NamedDefinition__NameAssignment_24_3)
	{ after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_24_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_24__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_24__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_24__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_24_4()); }
	';'
	{ after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_24_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamedDefinition__Group_25__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_25__0__Impl
	rule__NamedDefinition__Group_25__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_25__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getFixedPtTypeAction_25_0()); }
	()
	{ after(grammarAccess.getNamedDefinitionAccess().getFixedPtTypeAction_25_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_25__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_25__1__Impl
	rule__NamedDefinition__Group_25__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_25__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_25_1()); }
	'typedef'
	{ after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_25_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_25__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_25__2__Impl
	rule__NamedDefinition__Group_25__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_25__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getFixedKeyword_25_2()); }
	'fixed'
	{ after(grammarAccess.getNamedDefinitionAccess().getFixedKeyword_25_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_25__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_25__3__Impl
	rule__NamedDefinition__Group_25__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_25__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getLessThanSignKeyword_25_3()); }
	'<'
	{ after(grammarAccess.getNamedDefinitionAccess().getLessThanSignKeyword_25_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_25__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_25__4__Impl
	rule__NamedDefinition__Group_25__5
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_25__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getTotalDigitsAssignment_25_4()); }
	(rule__NamedDefinition__TotalDigitsAssignment_25_4)
	{ after(grammarAccess.getNamedDefinitionAccess().getTotalDigitsAssignment_25_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_25__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_25__5__Impl
	rule__NamedDefinition__Group_25__6
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_25__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getCommaKeyword_25_5()); }
	','
	{ after(grammarAccess.getNamedDefinitionAccess().getCommaKeyword_25_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_25__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_25__6__Impl
	rule__NamedDefinition__Group_25__7
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_25__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getFractionalDigitsAssignment_25_6()); }
	(rule__NamedDefinition__FractionalDigitsAssignment_25_6)
	{ after(grammarAccess.getNamedDefinitionAccess().getFractionalDigitsAssignment_25_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_25__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_25__7__Impl
	rule__NamedDefinition__Group_25__8
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_25__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getGreaterThanSignKeyword_25_7()); }
	'>'
	{ after(grammarAccess.getNamedDefinitionAccess().getGreaterThanSignKeyword_25_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_25__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_25__8__Impl
	rule__NamedDefinition__Group_25__9
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_25__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_25_8()); }
	(rule__NamedDefinition__NameAssignment_25_8)
	{ after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_25_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_25__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedDefinition__Group_25__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__Group_25__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_25_9()); }
	';'
	{ after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_25_9()); }
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
	{ before(grammarAccess.getMemberAccess().getNameAssignment_1()); }
	(rule__Member__NameAssignment_1)
	{ after(grammarAccess.getMemberAccess().getNameAssignment_1()); }
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
	{ before(grammarAccess.getMemberAccess().getSemicolonKeyword_2()); }
	';'
	{ after(grammarAccess.getMemberAccess().getSemicolonKeyword_2()); }
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

rule__Definition__StructAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefinitionAccess().getStructStructCrossReference_1_2_0()); }
		(
			{ before(grammarAccess.getDefinitionAccess().getStructStructIDTerminalRuleCall_1_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getDefinitionAccess().getStructStructIDTerminalRuleCall_1_2_0_1()); }
		)
		{ after(grammarAccess.getDefinitionAccess().getStructStructCrossReference_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__NameAssignment_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_0_2_0()); }
		RULE_ID
		{ after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__DefinitionsAssignment_0_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getDefinitionsDefinitionParserRuleCall_0_4_0()); }
		ruleDefinition
		{ after(grammarAccess.getNamedDefinitionAccess().getDefinitionsDefinitionParserRuleCall_0_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__NameAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_1_2_0()); }
		RULE_ID
		{ after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__MembersAssignment_1_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getMembersMemberParserRuleCall_1_4_0()); }
		ruleMember
		{ after(grammarAccess.getNamedDefinitionAccess().getMembersMemberParserRuleCall_1_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__NameAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_2_2_0()); }
		RULE_ID
		{ after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__CasesAssignment_2_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getCasesCaseParserRuleCall_2_10_0()); }
		ruleCase
		{ after(grammarAccess.getNamedDefinitionAccess().getCasesCaseParserRuleCall_2_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__NameAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_3_2_0()); }
		RULE_ID
		{ after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__LiteralsAssignment_3_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getLiteralsIDTerminalRuleCall_3_4_0()); }
		RULE_ID
		{ after(grammarAccess.getNamedDefinitionAccess().getLiteralsIDTerminalRuleCall_3_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__LiteralsAssignment_3_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getLiteralsIDTerminalRuleCall_3_5_1_0()); }
		RULE_ID
		{ after(grammarAccess.getNamedDefinitionAccess().getLiteralsIDTerminalRuleCall_3_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__TypeAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionCrossReference_4_2_0()); }
		(
			{ before(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionScopedNameParserRuleCall_4_2_0_1()); }
			ruleScopedName
			{ after(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionScopedNameParserRuleCall_4_2_0_1()); }
		)
		{ after(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionCrossReference_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__NameAssignment_4_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_4_3_0()); }
		RULE_ID
		{ after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_4_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__SizeAssignment_4_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getSizeINTTerminalRuleCall_4_5_0()); }
		RULE_INT
		{ after(grammarAccess.getNamedDefinitionAccess().getSizeINTTerminalRuleCall_4_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__NameAssignment_5_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_5_3_0()); }
		RULE_ID
		{ after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_5_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__NameAssignment_6_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_6_3_0()); }
		RULE_ID
		{ after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_6_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__NameAssignment_7_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_7_4_0()); }
		RULE_ID
		{ after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_7_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__NameAssignment_8_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_8_4_0()); }
		RULE_ID
		{ after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_8_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__NameAssignment_9_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_9_4_0()); }
		RULE_ID
		{ after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_9_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__NameAssignment_10_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_10_5_0()); }
		RULE_ID
		{ after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_10_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__NameAssignment_11_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_11_3_0()); }
		RULE_ID
		{ after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_11_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__NameAssignment_12_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_12_3_0()); }
		RULE_ID
		{ after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_12_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__NameAssignment_13_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_13_4_0()); }
		RULE_ID
		{ after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_13_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__NameAssignment_14_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_14_3_0()); }
		RULE_ID
		{ after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_14_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__NameAssignment_15_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_15_3_0()); }
		RULE_ID
		{ after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_15_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__NameAssignment_16_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_16_3_0()); }
		RULE_ID
		{ after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_16_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__NameAssignment_17_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_17_3_0()); }
		RULE_ID
		{ after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_17_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__TypeAssignment_18_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionCrossReference_18_2_0()); }
		(
			{ before(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionScopedNameParserRuleCall_18_2_0_1()); }
			ruleScopedName
			{ after(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionScopedNameParserRuleCall_18_2_0_1()); }
		)
		{ after(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionCrossReference_18_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__NameAssignment_18_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_18_3_0()); }
		RULE_ID
		{ after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_18_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__TypeAssignment_19_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionCrossReference_19_4_0()); }
		(
			{ before(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionScopedNameParserRuleCall_19_4_0_1()); }
			ruleScopedName
			{ after(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionScopedNameParserRuleCall_19_4_0_1()); }
		)
		{ after(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionCrossReference_19_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__SizeAssignment_19_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getSizeINTTerminalRuleCall_19_6_0()); }
		RULE_INT
		{ after(grammarAccess.getNamedDefinitionAccess().getSizeINTTerminalRuleCall_19_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__NameAssignment_19_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_19_8_0()); }
		RULE_ID
		{ after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_19_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__TypeAssignment_20_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionCrossReference_20_4_0()); }
		(
			{ before(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionScopedNameParserRuleCall_20_4_0_1()); }
			ruleScopedName
			{ after(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionScopedNameParserRuleCall_20_4_0_1()); }
		)
		{ after(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionCrossReference_20_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__NameAssignment_20_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_20_6_0()); }
		RULE_ID
		{ after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_20_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__SizeAssignment_21_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getSizeINTTerminalRuleCall_21_4_0()); }
		RULE_INT
		{ after(grammarAccess.getNamedDefinitionAccess().getSizeINTTerminalRuleCall_21_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__NameAssignment_21_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_21_6_0()); }
		RULE_ID
		{ after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_21_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__NameAssignment_22_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_22_3_0()); }
		RULE_ID
		{ after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_22_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__SizeAssignment_23_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getSizeINTTerminalRuleCall_23_4_0()); }
		RULE_INT
		{ after(grammarAccess.getNamedDefinitionAccess().getSizeINTTerminalRuleCall_23_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__NameAssignment_23_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_23_6_0()); }
		RULE_ID
		{ after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_23_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__NameAssignment_24_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_24_3_0()); }
		RULE_ID
		{ after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_24_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__TotalDigitsAssignment_25_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getTotalDigitsINTTerminalRuleCall_25_4_0()); }
		RULE_INT
		{ after(grammarAccess.getNamedDefinitionAccess().getTotalDigitsINTTerminalRuleCall_25_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__FractionalDigitsAssignment_25_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getFractionalDigitsINTTerminalRuleCall_25_6_0()); }
		RULE_INT
		{ after(grammarAccess.getNamedDefinitionAccess().getFractionalDigitsINTTerminalRuleCall_25_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedDefinition__NameAssignment_25_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_25_8_0()); }
		RULE_ID
		{ after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_25_8_0()); }
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
		{ before(grammarAccess.getMemberAccess().getTypeNamedDefinitionCrossReference_0_0()); }
		(
			{ before(grammarAccess.getMemberAccess().getTypeNamedDefinitionScopedNameParserRuleCall_0_0_1()); }
			ruleScopedName
			{ after(grammarAccess.getMemberAccess().getTypeNamedDefinitionScopedNameParserRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getMemberAccess().getTypeNamedDefinitionCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Member__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_1_0()); }
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
		{ before(grammarAccess.getCaseAccess().getTypeNamedDefinitionCrossReference_1_0()); }
		(
			{ before(grammarAccess.getCaseAccess().getTypeNamedDefinitionScopedNameParserRuleCall_1_0_1()); }
			ruleScopedName
			{ after(grammarAccess.getCaseAccess().getTypeNamedDefinitionScopedNameParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getCaseAccess().getTypeNamedDefinitionCrossReference_1_0()); }
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

RULE_ID : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_PREPROCESSOR : ('#define'|'#endif'|'#ifndef'|'#include') ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
