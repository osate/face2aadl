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
	|
	(
		{ before(grammarAccess.getDefinitionAccess().getGroup_6()); }
		(rule__Definition__Group_6__0)
		{ after(grammarAccess.getDefinitionAccess().getGroup_6()); }
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
		{ before(grammarAccess.getTypeAccess().getGroup_0()); }
		(rule__Type__Group_0__0)
		{ after(grammarAccess.getTypeAccess().getGroup_0()); }
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
	|
	(
		{ before(grammarAccess.getTypeAccess().getGroup_8()); }
		(rule__Type__Group_8__0)
		{ after(grammarAccess.getTypeAccess().getGroup_8()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getGroup_9()); }
		(rule__Type__Group_9__0)
		{ after(grammarAccess.getTypeAccess().getGroup_9()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getGroup_10()); }
		(rule__Type__Group_10__0)
		{ after(grammarAccess.getTypeAccess().getGroup_10()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getGroup_11()); }
		(rule__Type__Group_11__0)
		{ after(grammarAccess.getTypeAccess().getGroup_11()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getGroup_12()); }
		(rule__Type__Group_12__0)
		{ after(grammarAccess.getTypeAccess().getGroup_12()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getGroup_13()); }
		(rule__Type__Group_13__0)
		{ after(grammarAccess.getTypeAccess().getGroup_13()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getGroup_14()); }
		(rule__Type__Group_14__0)
		{ after(grammarAccess.getTypeAccess().getGroup_14()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getGroup_15()); }
		(rule__Type__Group_15__0)
		{ after(grammarAccess.getTypeAccess().getGroup_15()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getGroup_16()); }
		(rule__Type__Group_16__0)
		{ after(grammarAccess.getTypeAccess().getGroup_16()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getGroup_17()); }
		(rule__Type__Group_17__0)
		{ after(grammarAccess.getTypeAccess().getGroup_17()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getGroup_18()); }
		(rule__Type__Group_18__0)
		{ after(grammarAccess.getTypeAccess().getGroup_18()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getGroup_19()); }
		(rule__Type__Group_19__0)
		{ after(grammarAccess.getTypeAccess().getGroup_19()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getGroup_20()); }
		(rule__Type__Group_20__0)
		{ after(grammarAccess.getTypeAccess().getGroup_20()); }
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
	{ before(grammarAccess.getDefinitionAccess().getNameAssignment_5_3()); }
	(rule__Definition__NameAssignment_5_3)
	{ after(grammarAccess.getDefinitionAccess().getNameAssignment_5_3()); }
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
	{ before(grammarAccess.getDefinitionAccess().getSemicolonKeyword_5_4()); }
	';'
	{ after(grammarAccess.getDefinitionAccess().getSemicolonKeyword_5_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Definition__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_6__0__Impl
	rule__Definition__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getArrayTypeAction_6_0()); }
	()
	{ after(grammarAccess.getDefinitionAccess().getArrayTypeAction_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_6__1__Impl
	rule__Definition__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getTypedefKeyword_6_1()); }
	'typedef'
	{ after(grammarAccess.getDefinitionAccess().getTypedefKeyword_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_6__2__Impl
	rule__Definition__Group_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getTypeAssignment_6_2()); }
	(rule__Definition__TypeAssignment_6_2)
	{ after(grammarAccess.getDefinitionAccess().getTypeAssignment_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_6__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_6__3__Impl
	rule__Definition__Group_6__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_6__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getNameAssignment_6_3()); }
	(rule__Definition__NameAssignment_6_3)
	{ after(grammarAccess.getDefinitionAccess().getNameAssignment_6_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_6__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_6__4__Impl
	rule__Definition__Group_6__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_6__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getLeftSquareBracketKeyword_6_4()); }
	'['
	{ after(grammarAccess.getDefinitionAccess().getLeftSquareBracketKeyword_6_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_6__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_6__5__Impl
	rule__Definition__Group_6__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_6__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getSizeAssignment_6_5()); }
	(rule__Definition__SizeAssignment_6_5)
	{ after(grammarAccess.getDefinitionAccess().getSizeAssignment_6_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_6__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_6__6__Impl
	rule__Definition__Group_6__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_6__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getRightSquareBracketKeyword_6_6()); }
	']'
	{ after(grammarAccess.getDefinitionAccess().getRightSquareBracketKeyword_6_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_6__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group_6__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group_6__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getSemicolonKeyword_6_7()); }
	';'
	{ after(grammarAccess.getDefinitionAccess().getSemicolonKeyword_6_7()); }
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


rule__Type__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_0__0__Impl
	rule__Type__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getSignedShortIntAction_0_0()); }
	()
	{ after(grammarAccess.getTypeAccess().getSignedShortIntAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getShortKeyword_0_1()); }
	'short'
	{ after(grammarAccess.getTypeAccess().getShortKeyword_0_1()); }
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
	{ before(grammarAccess.getTypeAccess().getSignedLongIntAction_1_0()); }
	()
	{ after(grammarAccess.getTypeAccess().getSignedLongIntAction_1_0()); }
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
	{ before(grammarAccess.getTypeAccess().getLongKeyword_1_1()); }
	'long'
	{ after(grammarAccess.getTypeAccess().getLongKeyword_1_1()); }
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
	{ before(grammarAccess.getTypeAccess().getSignedLongLongIntAction_2_0()); }
	()
	{ after(grammarAccess.getTypeAccess().getSignedLongLongIntAction_2_0()); }
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
	{ before(grammarAccess.getTypeAccess().getLongKeyword_2_1()); }
	'long'
	{ after(grammarAccess.getTypeAccess().getLongKeyword_2_1()); }
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
	{ before(grammarAccess.getTypeAccess().getLongKeyword_2_2()); }
	'long'
	{ after(grammarAccess.getTypeAccess().getLongKeyword_2_2()); }
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
	{ before(grammarAccess.getTypeAccess().getUnsignedShortIntAction_3_0()); }
	()
	{ after(grammarAccess.getTypeAccess().getUnsignedShortIntAction_3_0()); }
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
	{ before(grammarAccess.getTypeAccess().getUnsignedKeyword_3_1()); }
	'unsigned'
	{ after(grammarAccess.getTypeAccess().getUnsignedKeyword_3_1()); }
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
	{ before(grammarAccess.getTypeAccess().getShortKeyword_3_2()); }
	'short'
	{ after(grammarAccess.getTypeAccess().getShortKeyword_3_2()); }
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
	{ before(grammarAccess.getTypeAccess().getUnsignedLongIntAction_4_0()); }
	()
	{ after(grammarAccess.getTypeAccess().getUnsignedLongIntAction_4_0()); }
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
	rule__Type__Group_4__2
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
	{ before(grammarAccess.getTypeAccess().getUnsignedKeyword_4_1()); }
	'unsigned'
	{ after(grammarAccess.getTypeAccess().getUnsignedKeyword_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getLongKeyword_4_2()); }
	'long'
	{ after(grammarAccess.getTypeAccess().getLongKeyword_4_2()); }
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
	{ before(grammarAccess.getTypeAccess().getUnsignedLongLongIntAction_5_0()); }
	()
	{ after(grammarAccess.getTypeAccess().getUnsignedLongLongIntAction_5_0()); }
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
	{ before(grammarAccess.getTypeAccess().getUnsignedKeyword_5_1()); }
	'unsigned'
	{ after(grammarAccess.getTypeAccess().getUnsignedKeyword_5_1()); }
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
	{ before(grammarAccess.getTypeAccess().getLongKeyword_5_2()); }
	'long'
	{ after(grammarAccess.getTypeAccess().getLongKeyword_5_2()); }
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
	{ before(grammarAccess.getTypeAccess().getLongKeyword_5_3()); }
	'long'
	{ after(grammarAccess.getTypeAccess().getLongKeyword_5_3()); }
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
	{ before(grammarAccess.getTypeAccess().getFloatTypeAction_6_0()); }
	()
	{ after(grammarAccess.getTypeAccess().getFloatTypeAction_6_0()); }
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
	{ before(grammarAccess.getTypeAccess().getFloatKeyword_6_1()); }
	'float'
	{ after(grammarAccess.getTypeAccess().getFloatKeyword_6_1()); }
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
	{ before(grammarAccess.getTypeAccess().getDoubleTypeAction_7_0()); }
	()
	{ after(grammarAccess.getTypeAccess().getDoubleTypeAction_7_0()); }
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
	{ before(grammarAccess.getTypeAccess().getDoubleKeyword_7_1()); }
	'double'
	{ after(grammarAccess.getTypeAccess().getDoubleKeyword_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group_8__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_8__0__Impl
	rule__Type__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_8__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getLongDoubleTypeAction_8_0()); }
	()
	{ after(grammarAccess.getTypeAccess().getLongDoubleTypeAction_8_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_8__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_8__1__Impl
	rule__Type__Group_8__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_8__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getLongKeyword_8_1()); }
	'long'
	{ after(grammarAccess.getTypeAccess().getLongKeyword_8_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_8__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_8__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_8__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getDoubleKeyword_8_2()); }
	'double'
	{ after(grammarAccess.getTypeAccess().getDoubleKeyword_8_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group_9__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_9__0__Impl
	rule__Type__Group_9__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_9__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getCharTypeAction_9_0()); }
	()
	{ after(grammarAccess.getTypeAccess().getCharTypeAction_9_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_9__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_9__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_9__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getCharKeyword_9_1()); }
	'char'
	{ after(grammarAccess.getTypeAccess().getCharKeyword_9_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_10__0__Impl
	rule__Type__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getWideCharTypeAction_10_0()); }
	()
	{ after(grammarAccess.getTypeAccess().getWideCharTypeAction_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_10__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getWcharKeyword_10_1()); }
	'wchar'
	{ after(grammarAccess.getTypeAccess().getWcharKeyword_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_11__0__Impl
	rule__Type__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getBooleanTypeAction_11_0()); }
	()
	{ after(grammarAccess.getTypeAccess().getBooleanTypeAction_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_11__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getBooleanKeyword_11_1()); }
	'boolean'
	{ after(grammarAccess.getTypeAccess().getBooleanKeyword_11_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group_12__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_12__0__Impl
	rule__Type__Group_12__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_12__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getOctetTypeAction_12_0()); }
	()
	{ after(grammarAccess.getTypeAccess().getOctetTypeAction_12_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_12__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_12__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_12__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getOctetKeyword_12_1()); }
	'octet'
	{ after(grammarAccess.getTypeAccess().getOctetKeyword_12_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group_13__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_13__0__Impl
	rule__Type__Group_13__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_13__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getReferencedTypeAction_13_0()); }
	()
	{ after(grammarAccess.getTypeAccess().getReferencedTypeAction_13_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_13__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_13__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_13__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getTypeAssignment_13_1()); }
	(rule__Type__TypeAssignment_13_1)
	{ after(grammarAccess.getTypeAccess().getTypeAssignment_13_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_14__0__Impl
	rule__Type__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getBoundedSequenceAction_14_0()); }
	()
	{ after(grammarAccess.getTypeAccess().getBoundedSequenceAction_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_14__1__Impl
	rule__Type__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getSequenceKeyword_14_1()); }
	'sequence'
	{ after(grammarAccess.getTypeAccess().getSequenceKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_14__2__Impl
	rule__Type__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getLessThanSignKeyword_14_2()); }
	'<'
	{ after(grammarAccess.getTypeAccess().getLessThanSignKeyword_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_14__3__Impl
	rule__Type__Group_14__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getTypeAssignment_14_3()); }
	(rule__Type__TypeAssignment_14_3)
	{ after(grammarAccess.getTypeAccess().getTypeAssignment_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_14__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_14__4__Impl
	rule__Type__Group_14__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_14__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getCommaKeyword_14_4()); }
	','
	{ after(grammarAccess.getTypeAccess().getCommaKeyword_14_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_14__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_14__5__Impl
	rule__Type__Group_14__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_14__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getSizeAssignment_14_5()); }
	(rule__Type__SizeAssignment_14_5)
	{ after(grammarAccess.getTypeAccess().getSizeAssignment_14_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_14__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_14__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_14__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_14_6()); }
	'>'
	{ after(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_14_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group_15__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_15__0__Impl
	rule__Type__Group_15__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_15__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getUnboundedSequenceAction_15_0()); }
	()
	{ after(grammarAccess.getTypeAccess().getUnboundedSequenceAction_15_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_15__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_15__1__Impl
	rule__Type__Group_15__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_15__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getSequenceKeyword_15_1()); }
	'sequence'
	{ after(grammarAccess.getTypeAccess().getSequenceKeyword_15_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_15__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_15__2__Impl
	rule__Type__Group_15__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_15__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getLessThanSignKeyword_15_2()); }
	'<'
	{ after(grammarAccess.getTypeAccess().getLessThanSignKeyword_15_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_15__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_15__3__Impl
	rule__Type__Group_15__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_15__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getTypeAssignment_15_3()); }
	(rule__Type__TypeAssignment_15_3)
	{ after(grammarAccess.getTypeAccess().getTypeAssignment_15_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_15__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_15__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_15__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_15_4()); }
	'>'
	{ after(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_15_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group_16__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_16__0__Impl
	rule__Type__Group_16__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_16__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getBoundedStringAction_16_0()); }
	()
	{ after(grammarAccess.getTypeAccess().getBoundedStringAction_16_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_16__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_16__1__Impl
	rule__Type__Group_16__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_16__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getStringKeyword_16_1()); }
	'string'
	{ after(grammarAccess.getTypeAccess().getStringKeyword_16_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_16__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_16__2__Impl
	rule__Type__Group_16__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_16__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getLessThanSignKeyword_16_2()); }
	'<'
	{ after(grammarAccess.getTypeAccess().getLessThanSignKeyword_16_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_16__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_16__3__Impl
	rule__Type__Group_16__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_16__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getSizeAssignment_16_3()); }
	(rule__Type__SizeAssignment_16_3)
	{ after(grammarAccess.getTypeAccess().getSizeAssignment_16_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_16__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_16__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_16__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_16_4()); }
	'>'
	{ after(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_16_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group_17__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_17__0__Impl
	rule__Type__Group_17__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_17__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getUnboundedStringAction_17_0()); }
	()
	{ after(grammarAccess.getTypeAccess().getUnboundedStringAction_17_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_17__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_17__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_17__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getStringKeyword_17_1()); }
	'string'
	{ after(grammarAccess.getTypeAccess().getStringKeyword_17_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group_18__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_18__0__Impl
	rule__Type__Group_18__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_18__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getBoundedWideStringAction_18_0()); }
	()
	{ after(grammarAccess.getTypeAccess().getBoundedWideStringAction_18_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_18__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_18__1__Impl
	rule__Type__Group_18__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_18__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getWstringKeyword_18_1()); }
	'wstring'
	{ after(grammarAccess.getTypeAccess().getWstringKeyword_18_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_18__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_18__2__Impl
	rule__Type__Group_18__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_18__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getLessThanSignKeyword_18_2()); }
	'<'
	{ after(grammarAccess.getTypeAccess().getLessThanSignKeyword_18_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_18__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_18__3__Impl
	rule__Type__Group_18__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_18__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getSizeAssignment_18_3()); }
	(rule__Type__SizeAssignment_18_3)
	{ after(grammarAccess.getTypeAccess().getSizeAssignment_18_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_18__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_18__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_18__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_18_4()); }
	'>'
	{ after(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_18_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group_19__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_19__0__Impl
	rule__Type__Group_19__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_19__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getUnboundedWideStringAction_19_0()); }
	()
	{ after(grammarAccess.getTypeAccess().getUnboundedWideStringAction_19_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_19__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_19__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_19__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getWstringKeyword_19_1()); }
	'wstring'
	{ after(grammarAccess.getTypeAccess().getWstringKeyword_19_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group_20__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_20__0__Impl
	rule__Type__Group_20__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_20__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getFixedPtTypeAction_20_0()); }
	()
	{ after(grammarAccess.getTypeAccess().getFixedPtTypeAction_20_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_20__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_20__1__Impl
	rule__Type__Group_20__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_20__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getFixedKeyword_20_1()); }
	'fixed'
	{ after(grammarAccess.getTypeAccess().getFixedKeyword_20_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_20__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_20__2__Impl
	rule__Type__Group_20__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_20__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getLessThanSignKeyword_20_2()); }
	'<'
	{ after(grammarAccess.getTypeAccess().getLessThanSignKeyword_20_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_20__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_20__3__Impl
	rule__Type__Group_20__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_20__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getTotalDigitsAssignment_20_3()); }
	(rule__Type__TotalDigitsAssignment_20_3)
	{ after(grammarAccess.getTypeAccess().getTotalDigitsAssignment_20_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_20__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_20__4__Impl
	rule__Type__Group_20__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_20__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getCommaKeyword_20_4()); }
	','
	{ after(grammarAccess.getTypeAccess().getCommaKeyword_20_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_20__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_20__5__Impl
	rule__Type__Group_20__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_20__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getFractionalDigitsAssignment_20_5()); }
	(rule__Type__FractionalDigitsAssignment_20_5)
	{ after(grammarAccess.getTypeAccess().getFractionalDigitsAssignment_20_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_20__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_20__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_20__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_20_6()); }
	'>'
	{ after(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_20_6()); }
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

rule__Definition__NameAssignment_5_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_5_3_0()); }
		RULE_ID
		{ after(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_5_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__TypeAssignment_6_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefinitionAccess().getTypeDefinitionCrossReference_6_2_0()); }
		(
			{ before(grammarAccess.getDefinitionAccess().getTypeDefinitionScopedNameParserRuleCall_6_2_0_1()); }
			ruleScopedName
			{ after(grammarAccess.getDefinitionAccess().getTypeDefinitionScopedNameParserRuleCall_6_2_0_1()); }
		)
		{ after(grammarAccess.getDefinitionAccess().getTypeDefinitionCrossReference_6_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__NameAssignment_6_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_6_3_0()); }
		RULE_ID
		{ after(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_6_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__SizeAssignment_6_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefinitionAccess().getSizeINTTerminalRuleCall_6_5_0()); }
		RULE_INT
		{ after(grammarAccess.getDefinitionAccess().getSizeINTTerminalRuleCall_6_5_0()); }
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
		{ before(grammarAccess.getMemberAccess().getTypeDefinitionCrossReference_0_0()); }
		(
			{ before(grammarAccess.getMemberAccess().getTypeDefinitionScopedNameParserRuleCall_0_0_1()); }
			ruleScopedName
			{ after(grammarAccess.getMemberAccess().getTypeDefinitionScopedNameParserRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getMemberAccess().getTypeDefinitionCrossReference_0_0()); }
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
		{ before(grammarAccess.getCaseAccess().getTypeDefinitionCrossReference_1_0()); }
		(
			{ before(grammarAccess.getCaseAccess().getTypeDefinitionScopedNameParserRuleCall_1_0_1()); }
			ruleScopedName
			{ after(grammarAccess.getCaseAccess().getTypeDefinitionScopedNameParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getCaseAccess().getTypeDefinitionCrossReference_1_0()); }
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

rule__Type__TypeAssignment_13_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getTypeDefinitionCrossReference_13_1_0()); }
		(
			{ before(grammarAccess.getTypeAccess().getTypeDefinitionScopedNameParserRuleCall_13_1_0_1()); }
			ruleScopedName
			{ after(grammarAccess.getTypeAccess().getTypeDefinitionScopedNameParserRuleCall_13_1_0_1()); }
		)
		{ after(grammarAccess.getTypeAccess().getTypeDefinitionCrossReference_13_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__TypeAssignment_14_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getTypeDefinitionCrossReference_14_3_0()); }
		(
			{ before(grammarAccess.getTypeAccess().getTypeDefinitionScopedNameParserRuleCall_14_3_0_1()); }
			ruleScopedName
			{ after(grammarAccess.getTypeAccess().getTypeDefinitionScopedNameParserRuleCall_14_3_0_1()); }
		)
		{ after(grammarAccess.getTypeAccess().getTypeDefinitionCrossReference_14_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__SizeAssignment_14_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_14_5_0()); }
		RULE_INT
		{ after(grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_14_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__TypeAssignment_15_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getTypeDefinitionCrossReference_15_3_0()); }
		(
			{ before(grammarAccess.getTypeAccess().getTypeDefinitionScopedNameParserRuleCall_15_3_0_1()); }
			ruleScopedName
			{ after(grammarAccess.getTypeAccess().getTypeDefinitionScopedNameParserRuleCall_15_3_0_1()); }
		)
		{ after(grammarAccess.getTypeAccess().getTypeDefinitionCrossReference_15_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__SizeAssignment_16_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_16_3_0()); }
		RULE_INT
		{ after(grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_16_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__SizeAssignment_18_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_18_3_0()); }
		RULE_INT
		{ after(grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_18_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__TotalDigitsAssignment_20_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getTotalDigitsINTTerminalRuleCall_20_3_0()); }
		RULE_INT
		{ after(grammarAccess.getTypeAccess().getTotalDigitsINTTerminalRuleCall_20_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__FractionalDigitsAssignment_20_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getFractionalDigitsINTTerminalRuleCall_20_5_0()); }
		RULE_INT
		{ after(grammarAccess.getTypeAccess().getFractionalDigitsINTTerminalRuleCall_20_5_0()); }
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
