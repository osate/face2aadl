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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

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
@SuppressWarnings("all")
public class InternalSimpleIDLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_PREPROCESSOR", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'{'", "'}'", "';'", "'struct'", "'union'", "'switch'", "'('", "'unsigned'", "'short'", "')'", "'enum'", "','", "'typedef'", "'case'", "':'", "'['", "']'", "'sequence'", "'<'", "'>'", "'string'", "'wstring'", "'fixed'", "'long'", "'float'", "'double'", "'char'", "'wchar'", "'boolean'", "'octet'", "'::'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_PREPROCESSOR=6;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSimpleIDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSimpleIDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSimpleIDLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSimpleIDL.g"; }


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



    // $ANTLR start "entryRuleSpecification"
    // InternalSimpleIDL.g:69:1: entryRuleSpecification : ruleSpecification EOF ;
    public final void entryRuleSpecification() throws RecognitionException {
        try {
            // InternalSimpleIDL.g:70:1: ( ruleSpecification EOF )
            // InternalSimpleIDL.g:71:1: ruleSpecification EOF
            {
             before(grammarAccess.getSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleSpecification();

            state._fsp--;

             after(grammarAccess.getSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpecification"


    // $ANTLR start "ruleSpecification"
    // InternalSimpleIDL.g:78:1: ruleSpecification : ( ( ( rule__Specification__DefinitionsAssignment ) ) ( ( rule__Specification__DefinitionsAssignment )* ) ) ;
    public final void ruleSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:82:2: ( ( ( ( rule__Specification__DefinitionsAssignment ) ) ( ( rule__Specification__DefinitionsAssignment )* ) ) )
            // InternalSimpleIDL.g:83:2: ( ( ( rule__Specification__DefinitionsAssignment ) ) ( ( rule__Specification__DefinitionsAssignment )* ) )
            {
            // InternalSimpleIDL.g:83:2: ( ( ( rule__Specification__DefinitionsAssignment ) ) ( ( rule__Specification__DefinitionsAssignment )* ) )
            // InternalSimpleIDL.g:84:3: ( ( rule__Specification__DefinitionsAssignment ) ) ( ( rule__Specification__DefinitionsAssignment )* )
            {
            // InternalSimpleIDL.g:84:3: ( ( rule__Specification__DefinitionsAssignment ) )
            // InternalSimpleIDL.g:85:4: ( rule__Specification__DefinitionsAssignment )
            {
             before(grammarAccess.getSpecificationAccess().getDefinitionsAssignment()); 
            // InternalSimpleIDL.g:86:4: ( rule__Specification__DefinitionsAssignment )
            // InternalSimpleIDL.g:86:5: rule__Specification__DefinitionsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Specification__DefinitionsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationAccess().getDefinitionsAssignment()); 

            }

            // InternalSimpleIDL.g:89:3: ( ( rule__Specification__DefinitionsAssignment )* )
            // InternalSimpleIDL.g:90:4: ( rule__Specification__DefinitionsAssignment )*
            {
             before(grammarAccess.getSpecificationAccess().getDefinitionsAssignment()); 
            // InternalSimpleIDL.g:91:4: ( rule__Specification__DefinitionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||(LA1_0>=16 && LA1_0<=17)||LA1_0==23||LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSimpleIDL.g:91:5: rule__Specification__DefinitionsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Specification__DefinitionsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSpecificationAccess().getDefinitionsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRuleDefinition"
    // InternalSimpleIDL.g:101:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // InternalSimpleIDL.g:102:1: ( ruleDefinition EOF )
            // InternalSimpleIDL.g:103:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalSimpleIDL.g:110:1: ruleDefinition : ( ( rule__Definition__Alternatives ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:114:2: ( ( ( rule__Definition__Alternatives ) ) )
            // InternalSimpleIDL.g:115:2: ( ( rule__Definition__Alternatives ) )
            {
            // InternalSimpleIDL.g:115:2: ( ( rule__Definition__Alternatives ) )
            // InternalSimpleIDL.g:116:3: ( rule__Definition__Alternatives )
            {
             before(grammarAccess.getDefinitionAccess().getAlternatives()); 
            // InternalSimpleIDL.g:117:3: ( rule__Definition__Alternatives )
            // InternalSimpleIDL.g:117:4: rule__Definition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleMember"
    // InternalSimpleIDL.g:126:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // InternalSimpleIDL.g:127:1: ( ruleMember EOF )
            // InternalSimpleIDL.g:128:1: ruleMember EOF
            {
             before(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getMemberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalSimpleIDL.g:135:1: ruleMember : ( ( rule__Member__Group__0 ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:139:2: ( ( ( rule__Member__Group__0 ) ) )
            // InternalSimpleIDL.g:140:2: ( ( rule__Member__Group__0 ) )
            {
            // InternalSimpleIDL.g:140:2: ( ( rule__Member__Group__0 ) )
            // InternalSimpleIDL.g:141:3: ( rule__Member__Group__0 )
            {
             before(grammarAccess.getMemberAccess().getGroup()); 
            // InternalSimpleIDL.g:142:3: ( rule__Member__Group__0 )
            // InternalSimpleIDL.g:142:4: rule__Member__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Member__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleCase"
    // InternalSimpleIDL.g:151:1: entryRuleCase : ruleCase EOF ;
    public final void entryRuleCase() throws RecognitionException {
        try {
            // InternalSimpleIDL.g:152:1: ( ruleCase EOF )
            // InternalSimpleIDL.g:153:1: ruleCase EOF
            {
             before(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_1);
            ruleCase();

            state._fsp--;

             after(grammarAccess.getCaseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // InternalSimpleIDL.g:160:1: ruleCase : ( ( rule__Case__Group__0 ) ) ;
    public final void ruleCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:164:2: ( ( ( rule__Case__Group__0 ) ) )
            // InternalSimpleIDL.g:165:2: ( ( rule__Case__Group__0 ) )
            {
            // InternalSimpleIDL.g:165:2: ( ( rule__Case__Group__0 ) )
            // InternalSimpleIDL.g:166:3: ( rule__Case__Group__0 )
            {
             before(grammarAccess.getCaseAccess().getGroup()); 
            // InternalSimpleIDL.g:167:3: ( rule__Case__Group__0 )
            // InternalSimpleIDL.g:167:4: rule__Case__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Case__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleAnyDeclarator"
    // InternalSimpleIDL.g:176:1: entryRuleAnyDeclarator : ruleAnyDeclarator EOF ;
    public final void entryRuleAnyDeclarator() throws RecognitionException {
        try {
            // InternalSimpleIDL.g:177:1: ( ruleAnyDeclarator EOF )
            // InternalSimpleIDL.g:178:1: ruleAnyDeclarator EOF
            {
             before(grammarAccess.getAnyDeclaratorRule()); 
            pushFollow(FOLLOW_1);
            ruleAnyDeclarator();

            state._fsp--;

             after(grammarAccess.getAnyDeclaratorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnyDeclarator"


    // $ANTLR start "ruleAnyDeclarator"
    // InternalSimpleIDL.g:185:1: ruleAnyDeclarator : ( ( rule__AnyDeclarator__Group__0 ) ) ;
    public final void ruleAnyDeclarator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:189:2: ( ( ( rule__AnyDeclarator__Group__0 ) ) )
            // InternalSimpleIDL.g:190:2: ( ( rule__AnyDeclarator__Group__0 ) )
            {
            // InternalSimpleIDL.g:190:2: ( ( rule__AnyDeclarator__Group__0 ) )
            // InternalSimpleIDL.g:191:3: ( rule__AnyDeclarator__Group__0 )
            {
             before(grammarAccess.getAnyDeclaratorAccess().getGroup()); 
            // InternalSimpleIDL.g:192:3: ( rule__AnyDeclarator__Group__0 )
            // InternalSimpleIDL.g:192:4: rule__AnyDeclarator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AnyDeclarator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnyDeclaratorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnyDeclarator"


    // $ANTLR start "entryRuleFixedArraySize"
    // InternalSimpleIDL.g:201:1: entryRuleFixedArraySize : ruleFixedArraySize EOF ;
    public final void entryRuleFixedArraySize() throws RecognitionException {
        try {
            // InternalSimpleIDL.g:202:1: ( ruleFixedArraySize EOF )
            // InternalSimpleIDL.g:203:1: ruleFixedArraySize EOF
            {
             before(grammarAccess.getFixedArraySizeRule()); 
            pushFollow(FOLLOW_1);
            ruleFixedArraySize();

            state._fsp--;

             after(grammarAccess.getFixedArraySizeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFixedArraySize"


    // $ANTLR start "ruleFixedArraySize"
    // InternalSimpleIDL.g:210:1: ruleFixedArraySize : ( ( rule__FixedArraySize__Group__0 ) ) ;
    public final void ruleFixedArraySize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:214:2: ( ( ( rule__FixedArraySize__Group__0 ) ) )
            // InternalSimpleIDL.g:215:2: ( ( rule__FixedArraySize__Group__0 ) )
            {
            // InternalSimpleIDL.g:215:2: ( ( rule__FixedArraySize__Group__0 ) )
            // InternalSimpleIDL.g:216:3: ( rule__FixedArraySize__Group__0 )
            {
             before(grammarAccess.getFixedArraySizeAccess().getGroup()); 
            // InternalSimpleIDL.g:217:3: ( rule__FixedArraySize__Group__0 )
            // InternalSimpleIDL.g:217:4: rule__FixedArraySize__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FixedArraySize__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFixedArraySizeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFixedArraySize"


    // $ANTLR start "entryRuleType"
    // InternalSimpleIDL.g:226:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalSimpleIDL.g:227:1: ( ruleType EOF )
            // InternalSimpleIDL.g:228:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSimpleIDL.g:235:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:239:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalSimpleIDL.g:240:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalSimpleIDL.g:240:2: ( ( rule__Type__Alternatives ) )
            // InternalSimpleIDL.g:241:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalSimpleIDL.g:242:3: ( rule__Type__Alternatives )
            // InternalSimpleIDL.g:242:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleSimpleTypeSpec"
    // InternalSimpleIDL.g:251:1: entryRuleSimpleTypeSpec : ruleSimpleTypeSpec EOF ;
    public final void entryRuleSimpleTypeSpec() throws RecognitionException {
        try {
            // InternalSimpleIDL.g:252:1: ( ruleSimpleTypeSpec EOF )
            // InternalSimpleIDL.g:253:1: ruleSimpleTypeSpec EOF
            {
             before(grammarAccess.getSimpleTypeSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleTypeSpec();

            state._fsp--;

             after(grammarAccess.getSimpleTypeSpecRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleTypeSpec"


    // $ANTLR start "ruleSimpleTypeSpec"
    // InternalSimpleIDL.g:260:1: ruleSimpleTypeSpec : ( ( rule__SimpleTypeSpec__Alternatives ) ) ;
    public final void ruleSimpleTypeSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:264:2: ( ( ( rule__SimpleTypeSpec__Alternatives ) ) )
            // InternalSimpleIDL.g:265:2: ( ( rule__SimpleTypeSpec__Alternatives ) )
            {
            // InternalSimpleIDL.g:265:2: ( ( rule__SimpleTypeSpec__Alternatives ) )
            // InternalSimpleIDL.g:266:3: ( rule__SimpleTypeSpec__Alternatives )
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getAlternatives()); 
            // InternalSimpleIDL.g:267:3: ( rule__SimpleTypeSpec__Alternatives )
            // InternalSimpleIDL.g:267:4: rule__SimpleTypeSpec__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypeSpecAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleTypeSpec"


    // $ANTLR start "entryRuleScopedName"
    // InternalSimpleIDL.g:276:1: entryRuleScopedName : ruleScopedName EOF ;
    public final void entryRuleScopedName() throws RecognitionException {
        try {
            // InternalSimpleIDL.g:277:1: ( ruleScopedName EOF )
            // InternalSimpleIDL.g:278:1: ruleScopedName EOF
            {
             before(grammarAccess.getScopedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleScopedName();

            state._fsp--;

             after(grammarAccess.getScopedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScopedName"


    // $ANTLR start "ruleScopedName"
    // InternalSimpleIDL.g:285:1: ruleScopedName : ( ( rule__ScopedName__Group__0 ) ) ;
    public final void ruleScopedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:289:2: ( ( ( rule__ScopedName__Group__0 ) ) )
            // InternalSimpleIDL.g:290:2: ( ( rule__ScopedName__Group__0 ) )
            {
            // InternalSimpleIDL.g:290:2: ( ( rule__ScopedName__Group__0 ) )
            // InternalSimpleIDL.g:291:3: ( rule__ScopedName__Group__0 )
            {
             before(grammarAccess.getScopedNameAccess().getGroup()); 
            // InternalSimpleIDL.g:292:3: ( rule__ScopedName__Group__0 )
            // InternalSimpleIDL.g:292:4: rule__ScopedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ScopedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScopedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScopedName"


    // $ANTLR start "rule__Definition__Alternatives"
    // InternalSimpleIDL.g:300:1: rule__Definition__Alternatives : ( ( ( rule__Definition__Group_0__0 ) ) | ( ( rule__Definition__Group_1__0 ) ) | ( ( rule__Definition__Group_2__0 ) ) | ( ( rule__Definition__Group_3__0 ) ) | ( ( rule__Definition__Group_4__0 ) ) | ( ( rule__Definition__Group_5__0 ) ) );
    public final void rule__Definition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:304:1: ( ( ( rule__Definition__Group_0__0 ) ) | ( ( rule__Definition__Group_1__0 ) ) | ( ( rule__Definition__Group_2__0 ) ) | ( ( rule__Definition__Group_3__0 ) ) | ( ( rule__Definition__Group_4__0 ) ) | ( ( rule__Definition__Group_5__0 ) ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==RULE_ID) ) {
                    int LA2_6 = input.LA(3);

                    if ( (LA2_6==15) ) {
                        alt2=3;
                    }
                    else if ( (LA2_6==13) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                alt2=4;
                }
                break;
            case 23:
                {
                alt2=5;
                }
                break;
            case 25:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSimpleIDL.g:305:2: ( ( rule__Definition__Group_0__0 ) )
                    {
                    // InternalSimpleIDL.g:305:2: ( ( rule__Definition__Group_0__0 ) )
                    // InternalSimpleIDL.g:306:3: ( rule__Definition__Group_0__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_0()); 
                    // InternalSimpleIDL.g:307:3: ( rule__Definition__Group_0__0 )
                    // InternalSimpleIDL.g:307:4: rule__Definition__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefinitionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleIDL.g:311:2: ( ( rule__Definition__Group_1__0 ) )
                    {
                    // InternalSimpleIDL.g:311:2: ( ( rule__Definition__Group_1__0 ) )
                    // InternalSimpleIDL.g:312:3: ( rule__Definition__Group_1__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_1()); 
                    // InternalSimpleIDL.g:313:3: ( rule__Definition__Group_1__0 )
                    // InternalSimpleIDL.g:313:4: rule__Definition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefinitionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleIDL.g:317:2: ( ( rule__Definition__Group_2__0 ) )
                    {
                    // InternalSimpleIDL.g:317:2: ( ( rule__Definition__Group_2__0 ) )
                    // InternalSimpleIDL.g:318:3: ( rule__Definition__Group_2__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_2()); 
                    // InternalSimpleIDL.g:319:3: ( rule__Definition__Group_2__0 )
                    // InternalSimpleIDL.g:319:4: rule__Definition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefinitionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSimpleIDL.g:323:2: ( ( rule__Definition__Group_3__0 ) )
                    {
                    // InternalSimpleIDL.g:323:2: ( ( rule__Definition__Group_3__0 ) )
                    // InternalSimpleIDL.g:324:3: ( rule__Definition__Group_3__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_3()); 
                    // InternalSimpleIDL.g:325:3: ( rule__Definition__Group_3__0 )
                    // InternalSimpleIDL.g:325:4: rule__Definition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefinitionAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSimpleIDL.g:329:2: ( ( rule__Definition__Group_4__0 ) )
                    {
                    // InternalSimpleIDL.g:329:2: ( ( rule__Definition__Group_4__0 ) )
                    // InternalSimpleIDL.g:330:3: ( rule__Definition__Group_4__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_4()); 
                    // InternalSimpleIDL.g:331:3: ( rule__Definition__Group_4__0 )
                    // InternalSimpleIDL.g:331:4: rule__Definition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefinitionAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSimpleIDL.g:335:2: ( ( rule__Definition__Group_5__0 ) )
                    {
                    // InternalSimpleIDL.g:335:2: ( ( rule__Definition__Group_5__0 ) )
                    // InternalSimpleIDL.g:336:3: ( rule__Definition__Group_5__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_5()); 
                    // InternalSimpleIDL.g:337:3: ( rule__Definition__Group_5__0 )
                    // InternalSimpleIDL.g:337:4: rule__Definition__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefinitionAccess().getGroup_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalSimpleIDL.g:345:1: rule__Type__Alternatives : ( ( ruleSimpleTypeSpec ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) | ( ( rule__Type__Group_3__0 ) ) | ( ( rule__Type__Group_4__0 ) ) | ( ( rule__Type__Group_5__0 ) ) | ( ( rule__Type__Group_6__0 ) ) | ( ( rule__Type__Group_7__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:349:1: ( ( ruleSimpleTypeSpec ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) | ( ( rule__Type__Group_3__0 ) ) | ( ( rule__Type__Group_4__0 ) ) | ( ( rule__Type__Group_5__0 ) ) | ( ( rule__Type__Group_6__0 ) ) | ( ( rule__Type__Group_7__0 ) ) )
            int alt3=8;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalSimpleIDL.g:350:2: ( ruleSimpleTypeSpec )
                    {
                    // InternalSimpleIDL.g:350:2: ( ruleSimpleTypeSpec )
                    // InternalSimpleIDL.g:351:3: ruleSimpleTypeSpec
                    {
                     before(grammarAccess.getTypeAccess().getSimpleTypeSpecParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleTypeSpec();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getSimpleTypeSpecParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleIDL.g:356:2: ( ( rule__Type__Group_1__0 ) )
                    {
                    // InternalSimpleIDL.g:356:2: ( ( rule__Type__Group_1__0 ) )
                    // InternalSimpleIDL.g:357:3: ( rule__Type__Group_1__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_1()); 
                    // InternalSimpleIDL.g:358:3: ( rule__Type__Group_1__0 )
                    // InternalSimpleIDL.g:358:4: rule__Type__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleIDL.g:362:2: ( ( rule__Type__Group_2__0 ) )
                    {
                    // InternalSimpleIDL.g:362:2: ( ( rule__Type__Group_2__0 ) )
                    // InternalSimpleIDL.g:363:3: ( rule__Type__Group_2__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_2()); 
                    // InternalSimpleIDL.g:364:3: ( rule__Type__Group_2__0 )
                    // InternalSimpleIDL.g:364:4: rule__Type__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSimpleIDL.g:368:2: ( ( rule__Type__Group_3__0 ) )
                    {
                    // InternalSimpleIDL.g:368:2: ( ( rule__Type__Group_3__0 ) )
                    // InternalSimpleIDL.g:369:3: ( rule__Type__Group_3__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_3()); 
                    // InternalSimpleIDL.g:370:3: ( rule__Type__Group_3__0 )
                    // InternalSimpleIDL.g:370:4: rule__Type__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSimpleIDL.g:374:2: ( ( rule__Type__Group_4__0 ) )
                    {
                    // InternalSimpleIDL.g:374:2: ( ( rule__Type__Group_4__0 ) )
                    // InternalSimpleIDL.g:375:3: ( rule__Type__Group_4__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_4()); 
                    // InternalSimpleIDL.g:376:3: ( rule__Type__Group_4__0 )
                    // InternalSimpleIDL.g:376:4: rule__Type__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSimpleIDL.g:380:2: ( ( rule__Type__Group_5__0 ) )
                    {
                    // InternalSimpleIDL.g:380:2: ( ( rule__Type__Group_5__0 ) )
                    // InternalSimpleIDL.g:381:3: ( rule__Type__Group_5__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_5()); 
                    // InternalSimpleIDL.g:382:3: ( rule__Type__Group_5__0 )
                    // InternalSimpleIDL.g:382:4: rule__Type__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSimpleIDL.g:386:2: ( ( rule__Type__Group_6__0 ) )
                    {
                    // InternalSimpleIDL.g:386:2: ( ( rule__Type__Group_6__0 ) )
                    // InternalSimpleIDL.g:387:3: ( rule__Type__Group_6__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_6()); 
                    // InternalSimpleIDL.g:388:3: ( rule__Type__Group_6__0 )
                    // InternalSimpleIDL.g:388:4: rule__Type__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSimpleIDL.g:392:2: ( ( rule__Type__Group_7__0 ) )
                    {
                    // InternalSimpleIDL.g:392:2: ( ( rule__Type__Group_7__0 ) )
                    // InternalSimpleIDL.g:393:3: ( rule__Type__Group_7__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_7()); 
                    // InternalSimpleIDL.g:394:3: ( rule__Type__Group_7__0 )
                    // InternalSimpleIDL.g:394:4: rule__Type__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__SimpleTypeSpec__Alternatives"
    // InternalSimpleIDL.g:402:1: rule__SimpleTypeSpec__Alternatives : ( ( ( rule__SimpleTypeSpec__Group_0__0 ) ) | ( ( rule__SimpleTypeSpec__Group_1__0 ) ) | ( ( rule__SimpleTypeSpec__Group_2__0 ) ) | ( ( rule__SimpleTypeSpec__Group_3__0 ) ) | ( ( rule__SimpleTypeSpec__Group_4__0 ) ) | ( ( rule__SimpleTypeSpec__Group_5__0 ) ) | ( ( rule__SimpleTypeSpec__Group_6__0 ) ) | ( ( rule__SimpleTypeSpec__Group_7__0 ) ) | ( ( rule__SimpleTypeSpec__Group_8__0 ) ) | ( ( rule__SimpleTypeSpec__Group_9__0 ) ) | ( ( rule__SimpleTypeSpec__Group_10__0 ) ) | ( ( rule__SimpleTypeSpec__Group_11__0 ) ) | ( ( rule__SimpleTypeSpec__Group_12__0 ) ) | ( ( rule__SimpleTypeSpec__Group_13__0 ) ) );
    public final void rule__SimpleTypeSpec__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:406:1: ( ( ( rule__SimpleTypeSpec__Group_0__0 ) ) | ( ( rule__SimpleTypeSpec__Group_1__0 ) ) | ( ( rule__SimpleTypeSpec__Group_2__0 ) ) | ( ( rule__SimpleTypeSpec__Group_3__0 ) ) | ( ( rule__SimpleTypeSpec__Group_4__0 ) ) | ( ( rule__SimpleTypeSpec__Group_5__0 ) ) | ( ( rule__SimpleTypeSpec__Group_6__0 ) ) | ( ( rule__SimpleTypeSpec__Group_7__0 ) ) | ( ( rule__SimpleTypeSpec__Group_8__0 ) ) | ( ( rule__SimpleTypeSpec__Group_9__0 ) ) | ( ( rule__SimpleTypeSpec__Group_10__0 ) ) | ( ( rule__SimpleTypeSpec__Group_11__0 ) ) | ( ( rule__SimpleTypeSpec__Group_12__0 ) ) | ( ( rule__SimpleTypeSpec__Group_13__0 ) ) )
            int alt4=14;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalSimpleIDL.g:407:2: ( ( rule__SimpleTypeSpec__Group_0__0 ) )
                    {
                    // InternalSimpleIDL.g:407:2: ( ( rule__SimpleTypeSpec__Group_0__0 ) )
                    // InternalSimpleIDL.g:408:3: ( rule__SimpleTypeSpec__Group_0__0 )
                    {
                     before(grammarAccess.getSimpleTypeSpecAccess().getGroup_0()); 
                    // InternalSimpleIDL.g:409:3: ( rule__SimpleTypeSpec__Group_0__0 )
                    // InternalSimpleIDL.g:409:4: rule__SimpleTypeSpec__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleTypeSpec__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleTypeSpecAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleIDL.g:413:2: ( ( rule__SimpleTypeSpec__Group_1__0 ) )
                    {
                    // InternalSimpleIDL.g:413:2: ( ( rule__SimpleTypeSpec__Group_1__0 ) )
                    // InternalSimpleIDL.g:414:3: ( rule__SimpleTypeSpec__Group_1__0 )
                    {
                     before(grammarAccess.getSimpleTypeSpecAccess().getGroup_1()); 
                    // InternalSimpleIDL.g:415:3: ( rule__SimpleTypeSpec__Group_1__0 )
                    // InternalSimpleIDL.g:415:4: rule__SimpleTypeSpec__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleTypeSpec__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleTypeSpecAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleIDL.g:419:2: ( ( rule__SimpleTypeSpec__Group_2__0 ) )
                    {
                    // InternalSimpleIDL.g:419:2: ( ( rule__SimpleTypeSpec__Group_2__0 ) )
                    // InternalSimpleIDL.g:420:3: ( rule__SimpleTypeSpec__Group_2__0 )
                    {
                     before(grammarAccess.getSimpleTypeSpecAccess().getGroup_2()); 
                    // InternalSimpleIDL.g:421:3: ( rule__SimpleTypeSpec__Group_2__0 )
                    // InternalSimpleIDL.g:421:4: rule__SimpleTypeSpec__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleTypeSpec__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleTypeSpecAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSimpleIDL.g:425:2: ( ( rule__SimpleTypeSpec__Group_3__0 ) )
                    {
                    // InternalSimpleIDL.g:425:2: ( ( rule__SimpleTypeSpec__Group_3__0 ) )
                    // InternalSimpleIDL.g:426:3: ( rule__SimpleTypeSpec__Group_3__0 )
                    {
                     before(grammarAccess.getSimpleTypeSpecAccess().getGroup_3()); 
                    // InternalSimpleIDL.g:427:3: ( rule__SimpleTypeSpec__Group_3__0 )
                    // InternalSimpleIDL.g:427:4: rule__SimpleTypeSpec__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleTypeSpec__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleTypeSpecAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSimpleIDL.g:431:2: ( ( rule__SimpleTypeSpec__Group_4__0 ) )
                    {
                    // InternalSimpleIDL.g:431:2: ( ( rule__SimpleTypeSpec__Group_4__0 ) )
                    // InternalSimpleIDL.g:432:3: ( rule__SimpleTypeSpec__Group_4__0 )
                    {
                     before(grammarAccess.getSimpleTypeSpecAccess().getGroup_4()); 
                    // InternalSimpleIDL.g:433:3: ( rule__SimpleTypeSpec__Group_4__0 )
                    // InternalSimpleIDL.g:433:4: rule__SimpleTypeSpec__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleTypeSpec__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleTypeSpecAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSimpleIDL.g:437:2: ( ( rule__SimpleTypeSpec__Group_5__0 ) )
                    {
                    // InternalSimpleIDL.g:437:2: ( ( rule__SimpleTypeSpec__Group_5__0 ) )
                    // InternalSimpleIDL.g:438:3: ( rule__SimpleTypeSpec__Group_5__0 )
                    {
                     before(grammarAccess.getSimpleTypeSpecAccess().getGroup_5()); 
                    // InternalSimpleIDL.g:439:3: ( rule__SimpleTypeSpec__Group_5__0 )
                    // InternalSimpleIDL.g:439:4: rule__SimpleTypeSpec__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleTypeSpec__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleTypeSpecAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSimpleIDL.g:443:2: ( ( rule__SimpleTypeSpec__Group_6__0 ) )
                    {
                    // InternalSimpleIDL.g:443:2: ( ( rule__SimpleTypeSpec__Group_6__0 ) )
                    // InternalSimpleIDL.g:444:3: ( rule__SimpleTypeSpec__Group_6__0 )
                    {
                     before(grammarAccess.getSimpleTypeSpecAccess().getGroup_6()); 
                    // InternalSimpleIDL.g:445:3: ( rule__SimpleTypeSpec__Group_6__0 )
                    // InternalSimpleIDL.g:445:4: rule__SimpleTypeSpec__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleTypeSpec__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleTypeSpecAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSimpleIDL.g:449:2: ( ( rule__SimpleTypeSpec__Group_7__0 ) )
                    {
                    // InternalSimpleIDL.g:449:2: ( ( rule__SimpleTypeSpec__Group_7__0 ) )
                    // InternalSimpleIDL.g:450:3: ( rule__SimpleTypeSpec__Group_7__0 )
                    {
                     before(grammarAccess.getSimpleTypeSpecAccess().getGroup_7()); 
                    // InternalSimpleIDL.g:451:3: ( rule__SimpleTypeSpec__Group_7__0 )
                    // InternalSimpleIDL.g:451:4: rule__SimpleTypeSpec__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleTypeSpec__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleTypeSpecAccess().getGroup_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSimpleIDL.g:455:2: ( ( rule__SimpleTypeSpec__Group_8__0 ) )
                    {
                    // InternalSimpleIDL.g:455:2: ( ( rule__SimpleTypeSpec__Group_8__0 ) )
                    // InternalSimpleIDL.g:456:3: ( rule__SimpleTypeSpec__Group_8__0 )
                    {
                     before(grammarAccess.getSimpleTypeSpecAccess().getGroup_8()); 
                    // InternalSimpleIDL.g:457:3: ( rule__SimpleTypeSpec__Group_8__0 )
                    // InternalSimpleIDL.g:457:4: rule__SimpleTypeSpec__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleTypeSpec__Group_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleTypeSpecAccess().getGroup_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSimpleIDL.g:461:2: ( ( rule__SimpleTypeSpec__Group_9__0 ) )
                    {
                    // InternalSimpleIDL.g:461:2: ( ( rule__SimpleTypeSpec__Group_9__0 ) )
                    // InternalSimpleIDL.g:462:3: ( rule__SimpleTypeSpec__Group_9__0 )
                    {
                     before(grammarAccess.getSimpleTypeSpecAccess().getGroup_9()); 
                    // InternalSimpleIDL.g:463:3: ( rule__SimpleTypeSpec__Group_9__0 )
                    // InternalSimpleIDL.g:463:4: rule__SimpleTypeSpec__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleTypeSpec__Group_9__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleTypeSpecAccess().getGroup_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalSimpleIDL.g:467:2: ( ( rule__SimpleTypeSpec__Group_10__0 ) )
                    {
                    // InternalSimpleIDL.g:467:2: ( ( rule__SimpleTypeSpec__Group_10__0 ) )
                    // InternalSimpleIDL.g:468:3: ( rule__SimpleTypeSpec__Group_10__0 )
                    {
                     before(grammarAccess.getSimpleTypeSpecAccess().getGroup_10()); 
                    // InternalSimpleIDL.g:469:3: ( rule__SimpleTypeSpec__Group_10__0 )
                    // InternalSimpleIDL.g:469:4: rule__SimpleTypeSpec__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleTypeSpec__Group_10__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleTypeSpecAccess().getGroup_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalSimpleIDL.g:473:2: ( ( rule__SimpleTypeSpec__Group_11__0 ) )
                    {
                    // InternalSimpleIDL.g:473:2: ( ( rule__SimpleTypeSpec__Group_11__0 ) )
                    // InternalSimpleIDL.g:474:3: ( rule__SimpleTypeSpec__Group_11__0 )
                    {
                     before(grammarAccess.getSimpleTypeSpecAccess().getGroup_11()); 
                    // InternalSimpleIDL.g:475:3: ( rule__SimpleTypeSpec__Group_11__0 )
                    // InternalSimpleIDL.g:475:4: rule__SimpleTypeSpec__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleTypeSpec__Group_11__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleTypeSpecAccess().getGroup_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalSimpleIDL.g:479:2: ( ( rule__SimpleTypeSpec__Group_12__0 ) )
                    {
                    // InternalSimpleIDL.g:479:2: ( ( rule__SimpleTypeSpec__Group_12__0 ) )
                    // InternalSimpleIDL.g:480:3: ( rule__SimpleTypeSpec__Group_12__0 )
                    {
                     before(grammarAccess.getSimpleTypeSpecAccess().getGroup_12()); 
                    // InternalSimpleIDL.g:481:3: ( rule__SimpleTypeSpec__Group_12__0 )
                    // InternalSimpleIDL.g:481:4: rule__SimpleTypeSpec__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleTypeSpec__Group_12__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleTypeSpecAccess().getGroup_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalSimpleIDL.g:485:2: ( ( rule__SimpleTypeSpec__Group_13__0 ) )
                    {
                    // InternalSimpleIDL.g:485:2: ( ( rule__SimpleTypeSpec__Group_13__0 ) )
                    // InternalSimpleIDL.g:486:3: ( rule__SimpleTypeSpec__Group_13__0 )
                    {
                     before(grammarAccess.getSimpleTypeSpecAccess().getGroup_13()); 
                    // InternalSimpleIDL.g:487:3: ( rule__SimpleTypeSpec__Group_13__0 )
                    // InternalSimpleIDL.g:487:4: rule__SimpleTypeSpec__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleTypeSpec__Group_13__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleTypeSpecAccess().getGroup_13()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Alternatives"


    // $ANTLR start "rule__Definition__Group_0__0"
    // InternalSimpleIDL.g:495:1: rule__Definition__Group_0__0 : rule__Definition__Group_0__0__Impl rule__Definition__Group_0__1 ;
    public final void rule__Definition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:499:1: ( rule__Definition__Group_0__0__Impl rule__Definition__Group_0__1 )
            // InternalSimpleIDL.g:500:2: rule__Definition__Group_0__0__Impl rule__Definition__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Definition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__0"


    // $ANTLR start "rule__Definition__Group_0__0__Impl"
    // InternalSimpleIDL.g:507:1: rule__Definition__Group_0__0__Impl : ( () ) ;
    public final void rule__Definition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:511:1: ( ( () ) )
            // InternalSimpleIDL.g:512:1: ( () )
            {
            // InternalSimpleIDL.g:512:1: ( () )
            // InternalSimpleIDL.g:513:2: ()
            {
             before(grammarAccess.getDefinitionAccess().getModuleAction_0_0()); 
            // InternalSimpleIDL.g:514:2: ()
            // InternalSimpleIDL.g:514:3: 
            {
            }

             after(grammarAccess.getDefinitionAccess().getModuleAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__0__Impl"


    // $ANTLR start "rule__Definition__Group_0__1"
    // InternalSimpleIDL.g:522:1: rule__Definition__Group_0__1 : rule__Definition__Group_0__1__Impl rule__Definition__Group_0__2 ;
    public final void rule__Definition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:526:1: ( rule__Definition__Group_0__1__Impl rule__Definition__Group_0__2 )
            // InternalSimpleIDL.g:527:2: rule__Definition__Group_0__1__Impl rule__Definition__Group_0__2
            {
            pushFollow(FOLLOW_5);
            rule__Definition__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__1"


    // $ANTLR start "rule__Definition__Group_0__1__Impl"
    // InternalSimpleIDL.g:534:1: rule__Definition__Group_0__1__Impl : ( 'module' ) ;
    public final void rule__Definition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:538:1: ( ( 'module' ) )
            // InternalSimpleIDL.g:539:1: ( 'module' )
            {
            // InternalSimpleIDL.g:539:1: ( 'module' )
            // InternalSimpleIDL.g:540:2: 'module'
            {
             before(grammarAccess.getDefinitionAccess().getModuleKeyword_0_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getModuleKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__1__Impl"


    // $ANTLR start "rule__Definition__Group_0__2"
    // InternalSimpleIDL.g:549:1: rule__Definition__Group_0__2 : rule__Definition__Group_0__2__Impl rule__Definition__Group_0__3 ;
    public final void rule__Definition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:553:1: ( rule__Definition__Group_0__2__Impl rule__Definition__Group_0__3 )
            // InternalSimpleIDL.g:554:2: rule__Definition__Group_0__2__Impl rule__Definition__Group_0__3
            {
            pushFollow(FOLLOW_6);
            rule__Definition__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__2"


    // $ANTLR start "rule__Definition__Group_0__2__Impl"
    // InternalSimpleIDL.g:561:1: rule__Definition__Group_0__2__Impl : ( ( rule__Definition__NameAssignment_0_2 ) ) ;
    public final void rule__Definition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:565:1: ( ( ( rule__Definition__NameAssignment_0_2 ) ) )
            // InternalSimpleIDL.g:566:1: ( ( rule__Definition__NameAssignment_0_2 ) )
            {
            // InternalSimpleIDL.g:566:1: ( ( rule__Definition__NameAssignment_0_2 ) )
            // InternalSimpleIDL.g:567:2: ( rule__Definition__NameAssignment_0_2 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_0_2()); 
            // InternalSimpleIDL.g:568:2: ( rule__Definition__NameAssignment_0_2 )
            // InternalSimpleIDL.g:568:3: rule__Definition__NameAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Definition__NameAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getNameAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__2__Impl"


    // $ANTLR start "rule__Definition__Group_0__3"
    // InternalSimpleIDL.g:576:1: rule__Definition__Group_0__3 : rule__Definition__Group_0__3__Impl rule__Definition__Group_0__4 ;
    public final void rule__Definition__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:580:1: ( rule__Definition__Group_0__3__Impl rule__Definition__Group_0__4 )
            // InternalSimpleIDL.g:581:2: rule__Definition__Group_0__3__Impl rule__Definition__Group_0__4
            {
            pushFollow(FOLLOW_7);
            rule__Definition__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__3"


    // $ANTLR start "rule__Definition__Group_0__3__Impl"
    // InternalSimpleIDL.g:588:1: rule__Definition__Group_0__3__Impl : ( '{' ) ;
    public final void rule__Definition__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:592:1: ( ( '{' ) )
            // InternalSimpleIDL.g:593:1: ( '{' )
            {
            // InternalSimpleIDL.g:593:1: ( '{' )
            // InternalSimpleIDL.g:594:2: '{'
            {
             before(grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_0_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__3__Impl"


    // $ANTLR start "rule__Definition__Group_0__4"
    // InternalSimpleIDL.g:603:1: rule__Definition__Group_0__4 : rule__Definition__Group_0__4__Impl rule__Definition__Group_0__5 ;
    public final void rule__Definition__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:607:1: ( rule__Definition__Group_0__4__Impl rule__Definition__Group_0__5 )
            // InternalSimpleIDL.g:608:2: rule__Definition__Group_0__4__Impl rule__Definition__Group_0__5
            {
            pushFollow(FOLLOW_8);
            rule__Definition__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__4"


    // $ANTLR start "rule__Definition__Group_0__4__Impl"
    // InternalSimpleIDL.g:615:1: rule__Definition__Group_0__4__Impl : ( ( ( rule__Definition__DefinitionsAssignment_0_4 ) ) ( ( rule__Definition__DefinitionsAssignment_0_4 )* ) ) ;
    public final void rule__Definition__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:619:1: ( ( ( ( rule__Definition__DefinitionsAssignment_0_4 ) ) ( ( rule__Definition__DefinitionsAssignment_0_4 )* ) ) )
            // InternalSimpleIDL.g:620:1: ( ( ( rule__Definition__DefinitionsAssignment_0_4 ) ) ( ( rule__Definition__DefinitionsAssignment_0_4 )* ) )
            {
            // InternalSimpleIDL.g:620:1: ( ( ( rule__Definition__DefinitionsAssignment_0_4 ) ) ( ( rule__Definition__DefinitionsAssignment_0_4 )* ) )
            // InternalSimpleIDL.g:621:2: ( ( rule__Definition__DefinitionsAssignment_0_4 ) ) ( ( rule__Definition__DefinitionsAssignment_0_4 )* )
            {
            // InternalSimpleIDL.g:621:2: ( ( rule__Definition__DefinitionsAssignment_0_4 ) )
            // InternalSimpleIDL.g:622:3: ( rule__Definition__DefinitionsAssignment_0_4 )
            {
             before(grammarAccess.getDefinitionAccess().getDefinitionsAssignment_0_4()); 
            // InternalSimpleIDL.g:623:3: ( rule__Definition__DefinitionsAssignment_0_4 )
            // InternalSimpleIDL.g:623:4: rule__Definition__DefinitionsAssignment_0_4
            {
            pushFollow(FOLLOW_3);
            rule__Definition__DefinitionsAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getDefinitionsAssignment_0_4()); 

            }

            // InternalSimpleIDL.g:626:2: ( ( rule__Definition__DefinitionsAssignment_0_4 )* )
            // InternalSimpleIDL.g:627:3: ( rule__Definition__DefinitionsAssignment_0_4 )*
            {
             before(grammarAccess.getDefinitionAccess().getDefinitionsAssignment_0_4()); 
            // InternalSimpleIDL.g:628:3: ( rule__Definition__DefinitionsAssignment_0_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==12||(LA5_0>=16 && LA5_0<=17)||LA5_0==23||LA5_0==25) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSimpleIDL.g:628:4: rule__Definition__DefinitionsAssignment_0_4
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Definition__DefinitionsAssignment_0_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getDefinitionAccess().getDefinitionsAssignment_0_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__4__Impl"


    // $ANTLR start "rule__Definition__Group_0__5"
    // InternalSimpleIDL.g:637:1: rule__Definition__Group_0__5 : rule__Definition__Group_0__5__Impl rule__Definition__Group_0__6 ;
    public final void rule__Definition__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:641:1: ( rule__Definition__Group_0__5__Impl rule__Definition__Group_0__6 )
            // InternalSimpleIDL.g:642:2: rule__Definition__Group_0__5__Impl rule__Definition__Group_0__6
            {
            pushFollow(FOLLOW_9);
            rule__Definition__Group_0__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_0__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__5"


    // $ANTLR start "rule__Definition__Group_0__5__Impl"
    // InternalSimpleIDL.g:649:1: rule__Definition__Group_0__5__Impl : ( '}' ) ;
    public final void rule__Definition__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:653:1: ( ( '}' ) )
            // InternalSimpleIDL.g:654:1: ( '}' )
            {
            // InternalSimpleIDL.g:654:1: ( '}' )
            // InternalSimpleIDL.g:655:2: '}'
            {
             before(grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_0_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__5__Impl"


    // $ANTLR start "rule__Definition__Group_0__6"
    // InternalSimpleIDL.g:664:1: rule__Definition__Group_0__6 : rule__Definition__Group_0__6__Impl ;
    public final void rule__Definition__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:668:1: ( rule__Definition__Group_0__6__Impl )
            // InternalSimpleIDL.g:669:2: rule__Definition__Group_0__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_0__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__6"


    // $ANTLR start "rule__Definition__Group_0__6__Impl"
    // InternalSimpleIDL.g:675:1: rule__Definition__Group_0__6__Impl : ( ';' ) ;
    public final void rule__Definition__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:679:1: ( ( ';' ) )
            // InternalSimpleIDL.g:680:1: ( ';' )
            {
            // InternalSimpleIDL.g:680:1: ( ';' )
            // InternalSimpleIDL.g:681:2: ';'
            {
             before(grammarAccess.getDefinitionAccess().getSemicolonKeyword_0_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getSemicolonKeyword_0_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__6__Impl"


    // $ANTLR start "rule__Definition__Group_1__0"
    // InternalSimpleIDL.g:691:1: rule__Definition__Group_1__0 : rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1 ;
    public final void rule__Definition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:695:1: ( rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1 )
            // InternalSimpleIDL.g:696:2: rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Definition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__0"


    // $ANTLR start "rule__Definition__Group_1__0__Impl"
    // InternalSimpleIDL.g:703:1: rule__Definition__Group_1__0__Impl : ( () ) ;
    public final void rule__Definition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:707:1: ( ( () ) )
            // InternalSimpleIDL.g:708:1: ( () )
            {
            // InternalSimpleIDL.g:708:1: ( () )
            // InternalSimpleIDL.g:709:2: ()
            {
             before(grammarAccess.getDefinitionAccess().getStructAction_1_0()); 
            // InternalSimpleIDL.g:710:2: ()
            // InternalSimpleIDL.g:710:3: 
            {
            }

             after(grammarAccess.getDefinitionAccess().getStructAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__0__Impl"


    // $ANTLR start "rule__Definition__Group_1__1"
    // InternalSimpleIDL.g:718:1: rule__Definition__Group_1__1 : rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2 ;
    public final void rule__Definition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:722:1: ( rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2 )
            // InternalSimpleIDL.g:723:2: rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__Definition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__1"


    // $ANTLR start "rule__Definition__Group_1__1__Impl"
    // InternalSimpleIDL.g:730:1: rule__Definition__Group_1__1__Impl : ( 'struct' ) ;
    public final void rule__Definition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:734:1: ( ( 'struct' ) )
            // InternalSimpleIDL.g:735:1: ( 'struct' )
            {
            // InternalSimpleIDL.g:735:1: ( 'struct' )
            // InternalSimpleIDL.g:736:2: 'struct'
            {
             before(grammarAccess.getDefinitionAccess().getStructKeyword_1_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getStructKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__1__Impl"


    // $ANTLR start "rule__Definition__Group_1__2"
    // InternalSimpleIDL.g:745:1: rule__Definition__Group_1__2 : rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3 ;
    public final void rule__Definition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:749:1: ( rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3 )
            // InternalSimpleIDL.g:750:2: rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3
            {
            pushFollow(FOLLOW_6);
            rule__Definition__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__2"


    // $ANTLR start "rule__Definition__Group_1__2__Impl"
    // InternalSimpleIDL.g:757:1: rule__Definition__Group_1__2__Impl : ( ( rule__Definition__NameAssignment_1_2 ) ) ;
    public final void rule__Definition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:761:1: ( ( ( rule__Definition__NameAssignment_1_2 ) ) )
            // InternalSimpleIDL.g:762:1: ( ( rule__Definition__NameAssignment_1_2 ) )
            {
            // InternalSimpleIDL.g:762:1: ( ( rule__Definition__NameAssignment_1_2 ) )
            // InternalSimpleIDL.g:763:2: ( rule__Definition__NameAssignment_1_2 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_1_2()); 
            // InternalSimpleIDL.g:764:2: ( rule__Definition__NameAssignment_1_2 )
            // InternalSimpleIDL.g:764:3: rule__Definition__NameAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Definition__NameAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getNameAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__2__Impl"


    // $ANTLR start "rule__Definition__Group_1__3"
    // InternalSimpleIDL.g:772:1: rule__Definition__Group_1__3 : rule__Definition__Group_1__3__Impl rule__Definition__Group_1__4 ;
    public final void rule__Definition__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:776:1: ( rule__Definition__Group_1__3__Impl rule__Definition__Group_1__4 )
            // InternalSimpleIDL.g:777:2: rule__Definition__Group_1__3__Impl rule__Definition__Group_1__4
            {
            pushFollow(FOLLOW_11);
            rule__Definition__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__3"


    // $ANTLR start "rule__Definition__Group_1__3__Impl"
    // InternalSimpleIDL.g:784:1: rule__Definition__Group_1__3__Impl : ( '{' ) ;
    public final void rule__Definition__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:788:1: ( ( '{' ) )
            // InternalSimpleIDL.g:789:1: ( '{' )
            {
            // InternalSimpleIDL.g:789:1: ( '{' )
            // InternalSimpleIDL.g:790:2: '{'
            {
             before(grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_1_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__3__Impl"


    // $ANTLR start "rule__Definition__Group_1__4"
    // InternalSimpleIDL.g:799:1: rule__Definition__Group_1__4 : rule__Definition__Group_1__4__Impl rule__Definition__Group_1__5 ;
    public final void rule__Definition__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:803:1: ( rule__Definition__Group_1__4__Impl rule__Definition__Group_1__5 )
            // InternalSimpleIDL.g:804:2: rule__Definition__Group_1__4__Impl rule__Definition__Group_1__5
            {
            pushFollow(FOLLOW_8);
            rule__Definition__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__4"


    // $ANTLR start "rule__Definition__Group_1__4__Impl"
    // InternalSimpleIDL.g:811:1: rule__Definition__Group_1__4__Impl : ( ( ( rule__Definition__MembersAssignment_1_4 ) ) ( ( rule__Definition__MembersAssignment_1_4 )* ) ) ;
    public final void rule__Definition__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:815:1: ( ( ( ( rule__Definition__MembersAssignment_1_4 ) ) ( ( rule__Definition__MembersAssignment_1_4 )* ) ) )
            // InternalSimpleIDL.g:816:1: ( ( ( rule__Definition__MembersAssignment_1_4 ) ) ( ( rule__Definition__MembersAssignment_1_4 )* ) )
            {
            // InternalSimpleIDL.g:816:1: ( ( ( rule__Definition__MembersAssignment_1_4 ) ) ( ( rule__Definition__MembersAssignment_1_4 )* ) )
            // InternalSimpleIDL.g:817:2: ( ( rule__Definition__MembersAssignment_1_4 ) ) ( ( rule__Definition__MembersAssignment_1_4 )* )
            {
            // InternalSimpleIDL.g:817:2: ( ( rule__Definition__MembersAssignment_1_4 ) )
            // InternalSimpleIDL.g:818:3: ( rule__Definition__MembersAssignment_1_4 )
            {
             before(grammarAccess.getDefinitionAccess().getMembersAssignment_1_4()); 
            // InternalSimpleIDL.g:819:3: ( rule__Definition__MembersAssignment_1_4 )
            // InternalSimpleIDL.g:819:4: rule__Definition__MembersAssignment_1_4
            {
            pushFollow(FOLLOW_12);
            rule__Definition__MembersAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getMembersAssignment_1_4()); 

            }

            // InternalSimpleIDL.g:822:2: ( ( rule__Definition__MembersAssignment_1_4 )* )
            // InternalSimpleIDL.g:823:3: ( rule__Definition__MembersAssignment_1_4 )*
            {
             before(grammarAccess.getDefinitionAccess().getMembersAssignment_1_4()); 
            // InternalSimpleIDL.g:824:3: ( rule__Definition__MembersAssignment_1_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=20 && LA6_0<=21)||(LA6_0>=36 && LA6_0<=43)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSimpleIDL.g:824:4: rule__Definition__MembersAssignment_1_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Definition__MembersAssignment_1_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getDefinitionAccess().getMembersAssignment_1_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__4__Impl"


    // $ANTLR start "rule__Definition__Group_1__5"
    // InternalSimpleIDL.g:833:1: rule__Definition__Group_1__5 : rule__Definition__Group_1__5__Impl rule__Definition__Group_1__6 ;
    public final void rule__Definition__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:837:1: ( rule__Definition__Group_1__5__Impl rule__Definition__Group_1__6 )
            // InternalSimpleIDL.g:838:2: rule__Definition__Group_1__5__Impl rule__Definition__Group_1__6
            {
            pushFollow(FOLLOW_9);
            rule__Definition__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__5"


    // $ANTLR start "rule__Definition__Group_1__5__Impl"
    // InternalSimpleIDL.g:845:1: rule__Definition__Group_1__5__Impl : ( '}' ) ;
    public final void rule__Definition__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:849:1: ( ( '}' ) )
            // InternalSimpleIDL.g:850:1: ( '}' )
            {
            // InternalSimpleIDL.g:850:1: ( '}' )
            // InternalSimpleIDL.g:851:2: '}'
            {
             before(grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_1_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__5__Impl"


    // $ANTLR start "rule__Definition__Group_1__6"
    // InternalSimpleIDL.g:860:1: rule__Definition__Group_1__6 : rule__Definition__Group_1__6__Impl ;
    public final void rule__Definition__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:864:1: ( rule__Definition__Group_1__6__Impl )
            // InternalSimpleIDL.g:865:2: rule__Definition__Group_1__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__6"


    // $ANTLR start "rule__Definition__Group_1__6__Impl"
    // InternalSimpleIDL.g:871:1: rule__Definition__Group_1__6__Impl : ( ';' ) ;
    public final void rule__Definition__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:875:1: ( ( ';' ) )
            // InternalSimpleIDL.g:876:1: ( ';' )
            {
            // InternalSimpleIDL.g:876:1: ( ';' )
            // InternalSimpleIDL.g:877:2: ';'
            {
             before(grammarAccess.getDefinitionAccess().getSemicolonKeyword_1_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getSemicolonKeyword_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__6__Impl"


    // $ANTLR start "rule__Definition__Group_2__0"
    // InternalSimpleIDL.g:887:1: rule__Definition__Group_2__0 : rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1 ;
    public final void rule__Definition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:891:1: ( rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1 )
            // InternalSimpleIDL.g:892:2: rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__Definition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__0"


    // $ANTLR start "rule__Definition__Group_2__0__Impl"
    // InternalSimpleIDL.g:899:1: rule__Definition__Group_2__0__Impl : ( () ) ;
    public final void rule__Definition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:903:1: ( ( () ) )
            // InternalSimpleIDL.g:904:1: ( () )
            {
            // InternalSimpleIDL.g:904:1: ( () )
            // InternalSimpleIDL.g:905:2: ()
            {
             before(grammarAccess.getDefinitionAccess().getStructForwardAction_2_0()); 
            // InternalSimpleIDL.g:906:2: ()
            // InternalSimpleIDL.g:906:3: 
            {
            }

             after(grammarAccess.getDefinitionAccess().getStructForwardAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__0__Impl"


    // $ANTLR start "rule__Definition__Group_2__1"
    // InternalSimpleIDL.g:914:1: rule__Definition__Group_2__1 : rule__Definition__Group_2__1__Impl rule__Definition__Group_2__2 ;
    public final void rule__Definition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:918:1: ( rule__Definition__Group_2__1__Impl rule__Definition__Group_2__2 )
            // InternalSimpleIDL.g:919:2: rule__Definition__Group_2__1__Impl rule__Definition__Group_2__2
            {
            pushFollow(FOLLOW_5);
            rule__Definition__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__1"


    // $ANTLR start "rule__Definition__Group_2__1__Impl"
    // InternalSimpleIDL.g:926:1: rule__Definition__Group_2__1__Impl : ( 'struct' ) ;
    public final void rule__Definition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:930:1: ( ( 'struct' ) )
            // InternalSimpleIDL.g:931:1: ( 'struct' )
            {
            // InternalSimpleIDL.g:931:1: ( 'struct' )
            // InternalSimpleIDL.g:932:2: 'struct'
            {
             before(grammarAccess.getDefinitionAccess().getStructKeyword_2_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getStructKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__1__Impl"


    // $ANTLR start "rule__Definition__Group_2__2"
    // InternalSimpleIDL.g:941:1: rule__Definition__Group_2__2 : rule__Definition__Group_2__2__Impl rule__Definition__Group_2__3 ;
    public final void rule__Definition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:945:1: ( rule__Definition__Group_2__2__Impl rule__Definition__Group_2__3 )
            // InternalSimpleIDL.g:946:2: rule__Definition__Group_2__2__Impl rule__Definition__Group_2__3
            {
            pushFollow(FOLLOW_9);
            rule__Definition__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__2"


    // $ANTLR start "rule__Definition__Group_2__2__Impl"
    // InternalSimpleIDL.g:953:1: rule__Definition__Group_2__2__Impl : ( ( rule__Definition__StructAssignment_2_2 ) ) ;
    public final void rule__Definition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:957:1: ( ( ( rule__Definition__StructAssignment_2_2 ) ) )
            // InternalSimpleIDL.g:958:1: ( ( rule__Definition__StructAssignment_2_2 ) )
            {
            // InternalSimpleIDL.g:958:1: ( ( rule__Definition__StructAssignment_2_2 ) )
            // InternalSimpleIDL.g:959:2: ( rule__Definition__StructAssignment_2_2 )
            {
             before(grammarAccess.getDefinitionAccess().getStructAssignment_2_2()); 
            // InternalSimpleIDL.g:960:2: ( rule__Definition__StructAssignment_2_2 )
            // InternalSimpleIDL.g:960:3: rule__Definition__StructAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Definition__StructAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getStructAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__2__Impl"


    // $ANTLR start "rule__Definition__Group_2__3"
    // InternalSimpleIDL.g:968:1: rule__Definition__Group_2__3 : rule__Definition__Group_2__3__Impl ;
    public final void rule__Definition__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:972:1: ( rule__Definition__Group_2__3__Impl )
            // InternalSimpleIDL.g:973:2: rule__Definition__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__3"


    // $ANTLR start "rule__Definition__Group_2__3__Impl"
    // InternalSimpleIDL.g:979:1: rule__Definition__Group_2__3__Impl : ( ';' ) ;
    public final void rule__Definition__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:983:1: ( ( ';' ) )
            // InternalSimpleIDL.g:984:1: ( ';' )
            {
            // InternalSimpleIDL.g:984:1: ( ';' )
            // InternalSimpleIDL.g:985:2: ';'
            {
             before(grammarAccess.getDefinitionAccess().getSemicolonKeyword_2_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getSemicolonKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__3__Impl"


    // $ANTLR start "rule__Definition__Group_3__0"
    // InternalSimpleIDL.g:995:1: rule__Definition__Group_3__0 : rule__Definition__Group_3__0__Impl rule__Definition__Group_3__1 ;
    public final void rule__Definition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:999:1: ( rule__Definition__Group_3__0__Impl rule__Definition__Group_3__1 )
            // InternalSimpleIDL.g:1000:2: rule__Definition__Group_3__0__Impl rule__Definition__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Definition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__0"


    // $ANTLR start "rule__Definition__Group_3__0__Impl"
    // InternalSimpleIDL.g:1007:1: rule__Definition__Group_3__0__Impl : ( () ) ;
    public final void rule__Definition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1011:1: ( ( () ) )
            // InternalSimpleIDL.g:1012:1: ( () )
            {
            // InternalSimpleIDL.g:1012:1: ( () )
            // InternalSimpleIDL.g:1013:2: ()
            {
             before(grammarAccess.getDefinitionAccess().getUnionAction_3_0()); 
            // InternalSimpleIDL.g:1014:2: ()
            // InternalSimpleIDL.g:1014:3: 
            {
            }

             after(grammarAccess.getDefinitionAccess().getUnionAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__0__Impl"


    // $ANTLR start "rule__Definition__Group_3__1"
    // InternalSimpleIDL.g:1022:1: rule__Definition__Group_3__1 : rule__Definition__Group_3__1__Impl rule__Definition__Group_3__2 ;
    public final void rule__Definition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1026:1: ( rule__Definition__Group_3__1__Impl rule__Definition__Group_3__2 )
            // InternalSimpleIDL.g:1027:2: rule__Definition__Group_3__1__Impl rule__Definition__Group_3__2
            {
            pushFollow(FOLLOW_5);
            rule__Definition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__1"


    // $ANTLR start "rule__Definition__Group_3__1__Impl"
    // InternalSimpleIDL.g:1034:1: rule__Definition__Group_3__1__Impl : ( 'union' ) ;
    public final void rule__Definition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1038:1: ( ( 'union' ) )
            // InternalSimpleIDL.g:1039:1: ( 'union' )
            {
            // InternalSimpleIDL.g:1039:1: ( 'union' )
            // InternalSimpleIDL.g:1040:2: 'union'
            {
             before(grammarAccess.getDefinitionAccess().getUnionKeyword_3_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getUnionKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__1__Impl"


    // $ANTLR start "rule__Definition__Group_3__2"
    // InternalSimpleIDL.g:1049:1: rule__Definition__Group_3__2 : rule__Definition__Group_3__2__Impl rule__Definition__Group_3__3 ;
    public final void rule__Definition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1053:1: ( rule__Definition__Group_3__2__Impl rule__Definition__Group_3__3 )
            // InternalSimpleIDL.g:1054:2: rule__Definition__Group_3__2__Impl rule__Definition__Group_3__3
            {
            pushFollow(FOLLOW_6);
            rule__Definition__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__2"


    // $ANTLR start "rule__Definition__Group_3__2__Impl"
    // InternalSimpleIDL.g:1061:1: rule__Definition__Group_3__2__Impl : ( ( rule__Definition__NameAssignment_3_2 ) ) ;
    public final void rule__Definition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1065:1: ( ( ( rule__Definition__NameAssignment_3_2 ) ) )
            // InternalSimpleIDL.g:1066:1: ( ( rule__Definition__NameAssignment_3_2 ) )
            {
            // InternalSimpleIDL.g:1066:1: ( ( rule__Definition__NameAssignment_3_2 ) )
            // InternalSimpleIDL.g:1067:2: ( rule__Definition__NameAssignment_3_2 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_3_2()); 
            // InternalSimpleIDL.g:1068:2: ( rule__Definition__NameAssignment_3_2 )
            // InternalSimpleIDL.g:1068:3: rule__Definition__NameAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Definition__NameAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getNameAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__2__Impl"


    // $ANTLR start "rule__Definition__Group_3__3"
    // InternalSimpleIDL.g:1076:1: rule__Definition__Group_3__3 : rule__Definition__Group_3__3__Impl rule__Definition__Group_3__4 ;
    public final void rule__Definition__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1080:1: ( rule__Definition__Group_3__3__Impl rule__Definition__Group_3__4 )
            // InternalSimpleIDL.g:1081:2: rule__Definition__Group_3__3__Impl rule__Definition__Group_3__4
            {
            pushFollow(FOLLOW_14);
            rule__Definition__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__3"


    // $ANTLR start "rule__Definition__Group_3__3__Impl"
    // InternalSimpleIDL.g:1088:1: rule__Definition__Group_3__3__Impl : ( '{' ) ;
    public final void rule__Definition__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1092:1: ( ( '{' ) )
            // InternalSimpleIDL.g:1093:1: ( '{' )
            {
            // InternalSimpleIDL.g:1093:1: ( '{' )
            // InternalSimpleIDL.g:1094:2: '{'
            {
             before(grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_3_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__3__Impl"


    // $ANTLR start "rule__Definition__Group_3__4"
    // InternalSimpleIDL.g:1103:1: rule__Definition__Group_3__4 : rule__Definition__Group_3__4__Impl rule__Definition__Group_3__5 ;
    public final void rule__Definition__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1107:1: ( rule__Definition__Group_3__4__Impl rule__Definition__Group_3__5 )
            // InternalSimpleIDL.g:1108:2: rule__Definition__Group_3__4__Impl rule__Definition__Group_3__5
            {
            pushFollow(FOLLOW_15);
            rule__Definition__Group_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_3__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__4"


    // $ANTLR start "rule__Definition__Group_3__4__Impl"
    // InternalSimpleIDL.g:1115:1: rule__Definition__Group_3__4__Impl : ( 'switch' ) ;
    public final void rule__Definition__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1119:1: ( ( 'switch' ) )
            // InternalSimpleIDL.g:1120:1: ( 'switch' )
            {
            // InternalSimpleIDL.g:1120:1: ( 'switch' )
            // InternalSimpleIDL.g:1121:2: 'switch'
            {
             before(grammarAccess.getDefinitionAccess().getSwitchKeyword_3_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getSwitchKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__4__Impl"


    // $ANTLR start "rule__Definition__Group_3__5"
    // InternalSimpleIDL.g:1130:1: rule__Definition__Group_3__5 : rule__Definition__Group_3__5__Impl rule__Definition__Group_3__6 ;
    public final void rule__Definition__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1134:1: ( rule__Definition__Group_3__5__Impl rule__Definition__Group_3__6 )
            // InternalSimpleIDL.g:1135:2: rule__Definition__Group_3__5__Impl rule__Definition__Group_3__6
            {
            pushFollow(FOLLOW_16);
            rule__Definition__Group_3__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_3__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__5"


    // $ANTLR start "rule__Definition__Group_3__5__Impl"
    // InternalSimpleIDL.g:1142:1: rule__Definition__Group_3__5__Impl : ( '(' ) ;
    public final void rule__Definition__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1146:1: ( ( '(' ) )
            // InternalSimpleIDL.g:1147:1: ( '(' )
            {
            // InternalSimpleIDL.g:1147:1: ( '(' )
            // InternalSimpleIDL.g:1148:2: '('
            {
             before(grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_3_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_3_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__5__Impl"


    // $ANTLR start "rule__Definition__Group_3__6"
    // InternalSimpleIDL.g:1157:1: rule__Definition__Group_3__6 : rule__Definition__Group_3__6__Impl rule__Definition__Group_3__7 ;
    public final void rule__Definition__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1161:1: ( rule__Definition__Group_3__6__Impl rule__Definition__Group_3__7 )
            // InternalSimpleIDL.g:1162:2: rule__Definition__Group_3__6__Impl rule__Definition__Group_3__7
            {
            pushFollow(FOLLOW_17);
            rule__Definition__Group_3__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_3__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__6"


    // $ANTLR start "rule__Definition__Group_3__6__Impl"
    // InternalSimpleIDL.g:1169:1: rule__Definition__Group_3__6__Impl : ( 'unsigned' ) ;
    public final void rule__Definition__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1173:1: ( ( 'unsigned' ) )
            // InternalSimpleIDL.g:1174:1: ( 'unsigned' )
            {
            // InternalSimpleIDL.g:1174:1: ( 'unsigned' )
            // InternalSimpleIDL.g:1175:2: 'unsigned'
            {
             before(grammarAccess.getDefinitionAccess().getUnsignedKeyword_3_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getUnsignedKeyword_3_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__6__Impl"


    // $ANTLR start "rule__Definition__Group_3__7"
    // InternalSimpleIDL.g:1184:1: rule__Definition__Group_3__7 : rule__Definition__Group_3__7__Impl rule__Definition__Group_3__8 ;
    public final void rule__Definition__Group_3__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1188:1: ( rule__Definition__Group_3__7__Impl rule__Definition__Group_3__8 )
            // InternalSimpleIDL.g:1189:2: rule__Definition__Group_3__7__Impl rule__Definition__Group_3__8
            {
            pushFollow(FOLLOW_18);
            rule__Definition__Group_3__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_3__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__7"


    // $ANTLR start "rule__Definition__Group_3__7__Impl"
    // InternalSimpleIDL.g:1196:1: rule__Definition__Group_3__7__Impl : ( 'short' ) ;
    public final void rule__Definition__Group_3__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1200:1: ( ( 'short' ) )
            // InternalSimpleIDL.g:1201:1: ( 'short' )
            {
            // InternalSimpleIDL.g:1201:1: ( 'short' )
            // InternalSimpleIDL.g:1202:2: 'short'
            {
             before(grammarAccess.getDefinitionAccess().getShortKeyword_3_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getShortKeyword_3_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__7__Impl"


    // $ANTLR start "rule__Definition__Group_3__8"
    // InternalSimpleIDL.g:1211:1: rule__Definition__Group_3__8 : rule__Definition__Group_3__8__Impl rule__Definition__Group_3__9 ;
    public final void rule__Definition__Group_3__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1215:1: ( rule__Definition__Group_3__8__Impl rule__Definition__Group_3__9 )
            // InternalSimpleIDL.g:1216:2: rule__Definition__Group_3__8__Impl rule__Definition__Group_3__9
            {
            pushFollow(FOLLOW_6);
            rule__Definition__Group_3__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_3__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__8"


    // $ANTLR start "rule__Definition__Group_3__8__Impl"
    // InternalSimpleIDL.g:1223:1: rule__Definition__Group_3__8__Impl : ( ')' ) ;
    public final void rule__Definition__Group_3__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1227:1: ( ( ')' ) )
            // InternalSimpleIDL.g:1228:1: ( ')' )
            {
            // InternalSimpleIDL.g:1228:1: ( ')' )
            // InternalSimpleIDL.g:1229:2: ')'
            {
             before(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_3_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_3_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__8__Impl"


    // $ANTLR start "rule__Definition__Group_3__9"
    // InternalSimpleIDL.g:1238:1: rule__Definition__Group_3__9 : rule__Definition__Group_3__9__Impl rule__Definition__Group_3__10 ;
    public final void rule__Definition__Group_3__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1242:1: ( rule__Definition__Group_3__9__Impl rule__Definition__Group_3__10 )
            // InternalSimpleIDL.g:1243:2: rule__Definition__Group_3__9__Impl rule__Definition__Group_3__10
            {
            pushFollow(FOLLOW_19);
            rule__Definition__Group_3__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_3__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__9"


    // $ANTLR start "rule__Definition__Group_3__9__Impl"
    // InternalSimpleIDL.g:1250:1: rule__Definition__Group_3__9__Impl : ( '{' ) ;
    public final void rule__Definition__Group_3__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1254:1: ( ( '{' ) )
            // InternalSimpleIDL.g:1255:1: ( '{' )
            {
            // InternalSimpleIDL.g:1255:1: ( '{' )
            // InternalSimpleIDL.g:1256:2: '{'
            {
             before(grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_3_9()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_3_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__9__Impl"


    // $ANTLR start "rule__Definition__Group_3__10"
    // InternalSimpleIDL.g:1265:1: rule__Definition__Group_3__10 : rule__Definition__Group_3__10__Impl rule__Definition__Group_3__11 ;
    public final void rule__Definition__Group_3__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1269:1: ( rule__Definition__Group_3__10__Impl rule__Definition__Group_3__11 )
            // InternalSimpleIDL.g:1270:2: rule__Definition__Group_3__10__Impl rule__Definition__Group_3__11
            {
            pushFollow(FOLLOW_8);
            rule__Definition__Group_3__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_3__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__10"


    // $ANTLR start "rule__Definition__Group_3__10__Impl"
    // InternalSimpleIDL.g:1277:1: rule__Definition__Group_3__10__Impl : ( ( ( rule__Definition__CasesAssignment_3_10 ) ) ( ( rule__Definition__CasesAssignment_3_10 )* ) ) ;
    public final void rule__Definition__Group_3__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1281:1: ( ( ( ( rule__Definition__CasesAssignment_3_10 ) ) ( ( rule__Definition__CasesAssignment_3_10 )* ) ) )
            // InternalSimpleIDL.g:1282:1: ( ( ( rule__Definition__CasesAssignment_3_10 ) ) ( ( rule__Definition__CasesAssignment_3_10 )* ) )
            {
            // InternalSimpleIDL.g:1282:1: ( ( ( rule__Definition__CasesAssignment_3_10 ) ) ( ( rule__Definition__CasesAssignment_3_10 )* ) )
            // InternalSimpleIDL.g:1283:2: ( ( rule__Definition__CasesAssignment_3_10 ) ) ( ( rule__Definition__CasesAssignment_3_10 )* )
            {
            // InternalSimpleIDL.g:1283:2: ( ( rule__Definition__CasesAssignment_3_10 ) )
            // InternalSimpleIDL.g:1284:3: ( rule__Definition__CasesAssignment_3_10 )
            {
             before(grammarAccess.getDefinitionAccess().getCasesAssignment_3_10()); 
            // InternalSimpleIDL.g:1285:3: ( rule__Definition__CasesAssignment_3_10 )
            // InternalSimpleIDL.g:1285:4: rule__Definition__CasesAssignment_3_10
            {
            pushFollow(FOLLOW_20);
            rule__Definition__CasesAssignment_3_10();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getCasesAssignment_3_10()); 

            }

            // InternalSimpleIDL.g:1288:2: ( ( rule__Definition__CasesAssignment_3_10 )* )
            // InternalSimpleIDL.g:1289:3: ( rule__Definition__CasesAssignment_3_10 )*
            {
             before(grammarAccess.getDefinitionAccess().getCasesAssignment_3_10()); 
            // InternalSimpleIDL.g:1290:3: ( rule__Definition__CasesAssignment_3_10 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSimpleIDL.g:1290:4: rule__Definition__CasesAssignment_3_10
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Definition__CasesAssignment_3_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getDefinitionAccess().getCasesAssignment_3_10()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__10__Impl"


    // $ANTLR start "rule__Definition__Group_3__11"
    // InternalSimpleIDL.g:1299:1: rule__Definition__Group_3__11 : rule__Definition__Group_3__11__Impl rule__Definition__Group_3__12 ;
    public final void rule__Definition__Group_3__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1303:1: ( rule__Definition__Group_3__11__Impl rule__Definition__Group_3__12 )
            // InternalSimpleIDL.g:1304:2: rule__Definition__Group_3__11__Impl rule__Definition__Group_3__12
            {
            pushFollow(FOLLOW_9);
            rule__Definition__Group_3__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_3__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__11"


    // $ANTLR start "rule__Definition__Group_3__11__Impl"
    // InternalSimpleIDL.g:1311:1: rule__Definition__Group_3__11__Impl : ( '}' ) ;
    public final void rule__Definition__Group_3__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1315:1: ( ( '}' ) )
            // InternalSimpleIDL.g:1316:1: ( '}' )
            {
            // InternalSimpleIDL.g:1316:1: ( '}' )
            // InternalSimpleIDL.g:1317:2: '}'
            {
             before(grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_3_11()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_3_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__11__Impl"


    // $ANTLR start "rule__Definition__Group_3__12"
    // InternalSimpleIDL.g:1326:1: rule__Definition__Group_3__12 : rule__Definition__Group_3__12__Impl rule__Definition__Group_3__13 ;
    public final void rule__Definition__Group_3__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1330:1: ( rule__Definition__Group_3__12__Impl rule__Definition__Group_3__13 )
            // InternalSimpleIDL.g:1331:2: rule__Definition__Group_3__12__Impl rule__Definition__Group_3__13
            {
            pushFollow(FOLLOW_8);
            rule__Definition__Group_3__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_3__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__12"


    // $ANTLR start "rule__Definition__Group_3__12__Impl"
    // InternalSimpleIDL.g:1338:1: rule__Definition__Group_3__12__Impl : ( ';' ) ;
    public final void rule__Definition__Group_3__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1342:1: ( ( ';' ) )
            // InternalSimpleIDL.g:1343:1: ( ';' )
            {
            // InternalSimpleIDL.g:1343:1: ( ';' )
            // InternalSimpleIDL.g:1344:2: ';'
            {
             before(grammarAccess.getDefinitionAccess().getSemicolonKeyword_3_12()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getSemicolonKeyword_3_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__12__Impl"


    // $ANTLR start "rule__Definition__Group_3__13"
    // InternalSimpleIDL.g:1353:1: rule__Definition__Group_3__13 : rule__Definition__Group_3__13__Impl rule__Definition__Group_3__14 ;
    public final void rule__Definition__Group_3__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1357:1: ( rule__Definition__Group_3__13__Impl rule__Definition__Group_3__14 )
            // InternalSimpleIDL.g:1358:2: rule__Definition__Group_3__13__Impl rule__Definition__Group_3__14
            {
            pushFollow(FOLLOW_9);
            rule__Definition__Group_3__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_3__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__13"


    // $ANTLR start "rule__Definition__Group_3__13__Impl"
    // InternalSimpleIDL.g:1365:1: rule__Definition__Group_3__13__Impl : ( '}' ) ;
    public final void rule__Definition__Group_3__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1369:1: ( ( '}' ) )
            // InternalSimpleIDL.g:1370:1: ( '}' )
            {
            // InternalSimpleIDL.g:1370:1: ( '}' )
            // InternalSimpleIDL.g:1371:2: '}'
            {
             before(grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_3_13()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_3_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__13__Impl"


    // $ANTLR start "rule__Definition__Group_3__14"
    // InternalSimpleIDL.g:1380:1: rule__Definition__Group_3__14 : rule__Definition__Group_3__14__Impl ;
    public final void rule__Definition__Group_3__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1384:1: ( rule__Definition__Group_3__14__Impl )
            // InternalSimpleIDL.g:1385:2: rule__Definition__Group_3__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_3__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__14"


    // $ANTLR start "rule__Definition__Group_3__14__Impl"
    // InternalSimpleIDL.g:1391:1: rule__Definition__Group_3__14__Impl : ( ';' ) ;
    public final void rule__Definition__Group_3__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1395:1: ( ( ';' ) )
            // InternalSimpleIDL.g:1396:1: ( ';' )
            {
            // InternalSimpleIDL.g:1396:1: ( ';' )
            // InternalSimpleIDL.g:1397:2: ';'
            {
             before(grammarAccess.getDefinitionAccess().getSemicolonKeyword_3_14()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getSemicolonKeyword_3_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__14__Impl"


    // $ANTLR start "rule__Definition__Group_4__0"
    // InternalSimpleIDL.g:1407:1: rule__Definition__Group_4__0 : rule__Definition__Group_4__0__Impl rule__Definition__Group_4__1 ;
    public final void rule__Definition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1411:1: ( rule__Definition__Group_4__0__Impl rule__Definition__Group_4__1 )
            // InternalSimpleIDL.g:1412:2: rule__Definition__Group_4__0__Impl rule__Definition__Group_4__1
            {
            pushFollow(FOLLOW_21);
            rule__Definition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_4__0"


    // $ANTLR start "rule__Definition__Group_4__0__Impl"
    // InternalSimpleIDL.g:1419:1: rule__Definition__Group_4__0__Impl : ( () ) ;
    public final void rule__Definition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1423:1: ( ( () ) )
            // InternalSimpleIDL.g:1424:1: ( () )
            {
            // InternalSimpleIDL.g:1424:1: ( () )
            // InternalSimpleIDL.g:1425:2: ()
            {
             before(grammarAccess.getDefinitionAccess().getEnumAction_4_0()); 
            // InternalSimpleIDL.g:1426:2: ()
            // InternalSimpleIDL.g:1426:3: 
            {
            }

             after(grammarAccess.getDefinitionAccess().getEnumAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_4__0__Impl"


    // $ANTLR start "rule__Definition__Group_4__1"
    // InternalSimpleIDL.g:1434:1: rule__Definition__Group_4__1 : rule__Definition__Group_4__1__Impl rule__Definition__Group_4__2 ;
    public final void rule__Definition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1438:1: ( rule__Definition__Group_4__1__Impl rule__Definition__Group_4__2 )
            // InternalSimpleIDL.g:1439:2: rule__Definition__Group_4__1__Impl rule__Definition__Group_4__2
            {
            pushFollow(FOLLOW_5);
            rule__Definition__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_4__1"


    // $ANTLR start "rule__Definition__Group_4__1__Impl"
    // InternalSimpleIDL.g:1446:1: rule__Definition__Group_4__1__Impl : ( 'enum' ) ;
    public final void rule__Definition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1450:1: ( ( 'enum' ) )
            // InternalSimpleIDL.g:1451:1: ( 'enum' )
            {
            // InternalSimpleIDL.g:1451:1: ( 'enum' )
            // InternalSimpleIDL.g:1452:2: 'enum'
            {
             before(grammarAccess.getDefinitionAccess().getEnumKeyword_4_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getEnumKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_4__1__Impl"


    // $ANTLR start "rule__Definition__Group_4__2"
    // InternalSimpleIDL.g:1461:1: rule__Definition__Group_4__2 : rule__Definition__Group_4__2__Impl rule__Definition__Group_4__3 ;
    public final void rule__Definition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1465:1: ( rule__Definition__Group_4__2__Impl rule__Definition__Group_4__3 )
            // InternalSimpleIDL.g:1466:2: rule__Definition__Group_4__2__Impl rule__Definition__Group_4__3
            {
            pushFollow(FOLLOW_6);
            rule__Definition__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_4__2"


    // $ANTLR start "rule__Definition__Group_4__2__Impl"
    // InternalSimpleIDL.g:1473:1: rule__Definition__Group_4__2__Impl : ( ( rule__Definition__NameAssignment_4_2 ) ) ;
    public final void rule__Definition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1477:1: ( ( ( rule__Definition__NameAssignment_4_2 ) ) )
            // InternalSimpleIDL.g:1478:1: ( ( rule__Definition__NameAssignment_4_2 ) )
            {
            // InternalSimpleIDL.g:1478:1: ( ( rule__Definition__NameAssignment_4_2 ) )
            // InternalSimpleIDL.g:1479:2: ( rule__Definition__NameAssignment_4_2 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_4_2()); 
            // InternalSimpleIDL.g:1480:2: ( rule__Definition__NameAssignment_4_2 )
            // InternalSimpleIDL.g:1480:3: rule__Definition__NameAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Definition__NameAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getNameAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_4__2__Impl"


    // $ANTLR start "rule__Definition__Group_4__3"
    // InternalSimpleIDL.g:1488:1: rule__Definition__Group_4__3 : rule__Definition__Group_4__3__Impl rule__Definition__Group_4__4 ;
    public final void rule__Definition__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1492:1: ( rule__Definition__Group_4__3__Impl rule__Definition__Group_4__4 )
            // InternalSimpleIDL.g:1493:2: rule__Definition__Group_4__3__Impl rule__Definition__Group_4__4
            {
            pushFollow(FOLLOW_5);
            rule__Definition__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_4__3"


    // $ANTLR start "rule__Definition__Group_4__3__Impl"
    // InternalSimpleIDL.g:1500:1: rule__Definition__Group_4__3__Impl : ( '{' ) ;
    public final void rule__Definition__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1504:1: ( ( '{' ) )
            // InternalSimpleIDL.g:1505:1: ( '{' )
            {
            // InternalSimpleIDL.g:1505:1: ( '{' )
            // InternalSimpleIDL.g:1506:2: '{'
            {
             before(grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_4_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_4__3__Impl"


    // $ANTLR start "rule__Definition__Group_4__4"
    // InternalSimpleIDL.g:1515:1: rule__Definition__Group_4__4 : rule__Definition__Group_4__4__Impl rule__Definition__Group_4__5 ;
    public final void rule__Definition__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1519:1: ( rule__Definition__Group_4__4__Impl rule__Definition__Group_4__5 )
            // InternalSimpleIDL.g:1520:2: rule__Definition__Group_4__4__Impl rule__Definition__Group_4__5
            {
            pushFollow(FOLLOW_22);
            rule__Definition__Group_4__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_4__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_4__4"


    // $ANTLR start "rule__Definition__Group_4__4__Impl"
    // InternalSimpleIDL.g:1527:1: rule__Definition__Group_4__4__Impl : ( ( rule__Definition__LiteralsAssignment_4_4 ) ) ;
    public final void rule__Definition__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1531:1: ( ( ( rule__Definition__LiteralsAssignment_4_4 ) ) )
            // InternalSimpleIDL.g:1532:1: ( ( rule__Definition__LiteralsAssignment_4_4 ) )
            {
            // InternalSimpleIDL.g:1532:1: ( ( rule__Definition__LiteralsAssignment_4_4 ) )
            // InternalSimpleIDL.g:1533:2: ( rule__Definition__LiteralsAssignment_4_4 )
            {
             before(grammarAccess.getDefinitionAccess().getLiteralsAssignment_4_4()); 
            // InternalSimpleIDL.g:1534:2: ( rule__Definition__LiteralsAssignment_4_4 )
            // InternalSimpleIDL.g:1534:3: rule__Definition__LiteralsAssignment_4_4
            {
            pushFollow(FOLLOW_2);
            rule__Definition__LiteralsAssignment_4_4();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getLiteralsAssignment_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_4__4__Impl"


    // $ANTLR start "rule__Definition__Group_4__5"
    // InternalSimpleIDL.g:1542:1: rule__Definition__Group_4__5 : rule__Definition__Group_4__5__Impl rule__Definition__Group_4__6 ;
    public final void rule__Definition__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1546:1: ( rule__Definition__Group_4__5__Impl rule__Definition__Group_4__6 )
            // InternalSimpleIDL.g:1547:2: rule__Definition__Group_4__5__Impl rule__Definition__Group_4__6
            {
            pushFollow(FOLLOW_22);
            rule__Definition__Group_4__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_4__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_4__5"


    // $ANTLR start "rule__Definition__Group_4__5__Impl"
    // InternalSimpleIDL.g:1554:1: rule__Definition__Group_4__5__Impl : ( ( rule__Definition__Group_4_5__0 )* ) ;
    public final void rule__Definition__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1558:1: ( ( ( rule__Definition__Group_4_5__0 )* ) )
            // InternalSimpleIDL.g:1559:1: ( ( rule__Definition__Group_4_5__0 )* )
            {
            // InternalSimpleIDL.g:1559:1: ( ( rule__Definition__Group_4_5__0 )* )
            // InternalSimpleIDL.g:1560:2: ( rule__Definition__Group_4_5__0 )*
            {
             before(grammarAccess.getDefinitionAccess().getGroup_4_5()); 
            // InternalSimpleIDL.g:1561:2: ( rule__Definition__Group_4_5__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSimpleIDL.g:1561:3: rule__Definition__Group_4_5__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Definition__Group_4_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getDefinitionAccess().getGroup_4_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_4__5__Impl"


    // $ANTLR start "rule__Definition__Group_4__6"
    // InternalSimpleIDL.g:1569:1: rule__Definition__Group_4__6 : rule__Definition__Group_4__6__Impl rule__Definition__Group_4__7 ;
    public final void rule__Definition__Group_4__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1573:1: ( rule__Definition__Group_4__6__Impl rule__Definition__Group_4__7 )
            // InternalSimpleIDL.g:1574:2: rule__Definition__Group_4__6__Impl rule__Definition__Group_4__7
            {
            pushFollow(FOLLOW_9);
            rule__Definition__Group_4__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_4__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_4__6"


    // $ANTLR start "rule__Definition__Group_4__6__Impl"
    // InternalSimpleIDL.g:1581:1: rule__Definition__Group_4__6__Impl : ( '}' ) ;
    public final void rule__Definition__Group_4__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1585:1: ( ( '}' ) )
            // InternalSimpleIDL.g:1586:1: ( '}' )
            {
            // InternalSimpleIDL.g:1586:1: ( '}' )
            // InternalSimpleIDL.g:1587:2: '}'
            {
             before(grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_4_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_4_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_4__6__Impl"


    // $ANTLR start "rule__Definition__Group_4__7"
    // InternalSimpleIDL.g:1596:1: rule__Definition__Group_4__7 : rule__Definition__Group_4__7__Impl ;
    public final void rule__Definition__Group_4__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1600:1: ( rule__Definition__Group_4__7__Impl )
            // InternalSimpleIDL.g:1601:2: rule__Definition__Group_4__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_4__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_4__7"


    // $ANTLR start "rule__Definition__Group_4__7__Impl"
    // InternalSimpleIDL.g:1607:1: rule__Definition__Group_4__7__Impl : ( ';' ) ;
    public final void rule__Definition__Group_4__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1611:1: ( ( ';' ) )
            // InternalSimpleIDL.g:1612:1: ( ';' )
            {
            // InternalSimpleIDL.g:1612:1: ( ';' )
            // InternalSimpleIDL.g:1613:2: ';'
            {
             before(grammarAccess.getDefinitionAccess().getSemicolonKeyword_4_7()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getSemicolonKeyword_4_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_4__7__Impl"


    // $ANTLR start "rule__Definition__Group_4_5__0"
    // InternalSimpleIDL.g:1623:1: rule__Definition__Group_4_5__0 : rule__Definition__Group_4_5__0__Impl rule__Definition__Group_4_5__1 ;
    public final void rule__Definition__Group_4_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1627:1: ( rule__Definition__Group_4_5__0__Impl rule__Definition__Group_4_5__1 )
            // InternalSimpleIDL.g:1628:2: rule__Definition__Group_4_5__0__Impl rule__Definition__Group_4_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Definition__Group_4_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_4_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_4_5__0"


    // $ANTLR start "rule__Definition__Group_4_5__0__Impl"
    // InternalSimpleIDL.g:1635:1: rule__Definition__Group_4_5__0__Impl : ( ',' ) ;
    public final void rule__Definition__Group_4_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1639:1: ( ( ',' ) )
            // InternalSimpleIDL.g:1640:1: ( ',' )
            {
            // InternalSimpleIDL.g:1640:1: ( ',' )
            // InternalSimpleIDL.g:1641:2: ','
            {
             before(grammarAccess.getDefinitionAccess().getCommaKeyword_4_5_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getCommaKeyword_4_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_4_5__0__Impl"


    // $ANTLR start "rule__Definition__Group_4_5__1"
    // InternalSimpleIDL.g:1650:1: rule__Definition__Group_4_5__1 : rule__Definition__Group_4_5__1__Impl ;
    public final void rule__Definition__Group_4_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1654:1: ( rule__Definition__Group_4_5__1__Impl )
            // InternalSimpleIDL.g:1655:2: rule__Definition__Group_4_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_4_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_4_5__1"


    // $ANTLR start "rule__Definition__Group_4_5__1__Impl"
    // InternalSimpleIDL.g:1661:1: rule__Definition__Group_4_5__1__Impl : ( ( rule__Definition__LiteralsAssignment_4_5_1 ) ) ;
    public final void rule__Definition__Group_4_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1665:1: ( ( ( rule__Definition__LiteralsAssignment_4_5_1 ) ) )
            // InternalSimpleIDL.g:1666:1: ( ( rule__Definition__LiteralsAssignment_4_5_1 ) )
            {
            // InternalSimpleIDL.g:1666:1: ( ( rule__Definition__LiteralsAssignment_4_5_1 ) )
            // InternalSimpleIDL.g:1667:2: ( rule__Definition__LiteralsAssignment_4_5_1 )
            {
             before(grammarAccess.getDefinitionAccess().getLiteralsAssignment_4_5_1()); 
            // InternalSimpleIDL.g:1668:2: ( rule__Definition__LiteralsAssignment_4_5_1 )
            // InternalSimpleIDL.g:1668:3: rule__Definition__LiteralsAssignment_4_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Definition__LiteralsAssignment_4_5_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getLiteralsAssignment_4_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_4_5__1__Impl"


    // $ANTLR start "rule__Definition__Group_5__0"
    // InternalSimpleIDL.g:1677:1: rule__Definition__Group_5__0 : rule__Definition__Group_5__0__Impl rule__Definition__Group_5__1 ;
    public final void rule__Definition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1681:1: ( rule__Definition__Group_5__0__Impl rule__Definition__Group_5__1 )
            // InternalSimpleIDL.g:1682:2: rule__Definition__Group_5__0__Impl rule__Definition__Group_5__1
            {
            pushFollow(FOLLOW_7);
            rule__Definition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_5__0"


    // $ANTLR start "rule__Definition__Group_5__0__Impl"
    // InternalSimpleIDL.g:1689:1: rule__Definition__Group_5__0__Impl : ( () ) ;
    public final void rule__Definition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1693:1: ( ( () ) )
            // InternalSimpleIDL.g:1694:1: ( () )
            {
            // InternalSimpleIDL.g:1694:1: ( () )
            // InternalSimpleIDL.g:1695:2: ()
            {
             before(grammarAccess.getDefinitionAccess().getTypedefAction_5_0()); 
            // InternalSimpleIDL.g:1696:2: ()
            // InternalSimpleIDL.g:1696:3: 
            {
            }

             after(grammarAccess.getDefinitionAccess().getTypedefAction_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_5__0__Impl"


    // $ANTLR start "rule__Definition__Group_5__1"
    // InternalSimpleIDL.g:1704:1: rule__Definition__Group_5__1 : rule__Definition__Group_5__1__Impl rule__Definition__Group_5__2 ;
    public final void rule__Definition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1708:1: ( rule__Definition__Group_5__1__Impl rule__Definition__Group_5__2 )
            // InternalSimpleIDL.g:1709:2: rule__Definition__Group_5__1__Impl rule__Definition__Group_5__2
            {
            pushFollow(FOLLOW_24);
            rule__Definition__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_5__1"


    // $ANTLR start "rule__Definition__Group_5__1__Impl"
    // InternalSimpleIDL.g:1716:1: rule__Definition__Group_5__1__Impl : ( 'typedef' ) ;
    public final void rule__Definition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1720:1: ( ( 'typedef' ) )
            // InternalSimpleIDL.g:1721:1: ( 'typedef' )
            {
            // InternalSimpleIDL.g:1721:1: ( 'typedef' )
            // InternalSimpleIDL.g:1722:2: 'typedef'
            {
             before(grammarAccess.getDefinitionAccess().getTypedefKeyword_5_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getTypedefKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_5__1__Impl"


    // $ANTLR start "rule__Definition__Group_5__2"
    // InternalSimpleIDL.g:1731:1: rule__Definition__Group_5__2 : rule__Definition__Group_5__2__Impl rule__Definition__Group_5__3 ;
    public final void rule__Definition__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1735:1: ( rule__Definition__Group_5__2__Impl rule__Definition__Group_5__3 )
            // InternalSimpleIDL.g:1736:2: rule__Definition__Group_5__2__Impl rule__Definition__Group_5__3
            {
            pushFollow(FOLLOW_5);
            rule__Definition__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_5__2"


    // $ANTLR start "rule__Definition__Group_5__2__Impl"
    // InternalSimpleIDL.g:1743:1: rule__Definition__Group_5__2__Impl : ( ( rule__Definition__TypeAssignment_5_2 ) ) ;
    public final void rule__Definition__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1747:1: ( ( ( rule__Definition__TypeAssignment_5_2 ) ) )
            // InternalSimpleIDL.g:1748:1: ( ( rule__Definition__TypeAssignment_5_2 ) )
            {
            // InternalSimpleIDL.g:1748:1: ( ( rule__Definition__TypeAssignment_5_2 ) )
            // InternalSimpleIDL.g:1749:2: ( rule__Definition__TypeAssignment_5_2 )
            {
             before(grammarAccess.getDefinitionAccess().getTypeAssignment_5_2()); 
            // InternalSimpleIDL.g:1750:2: ( rule__Definition__TypeAssignment_5_2 )
            // InternalSimpleIDL.g:1750:3: rule__Definition__TypeAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Definition__TypeAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getTypeAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_5__2__Impl"


    // $ANTLR start "rule__Definition__Group_5__3"
    // InternalSimpleIDL.g:1758:1: rule__Definition__Group_5__3 : rule__Definition__Group_5__3__Impl rule__Definition__Group_5__4 ;
    public final void rule__Definition__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1762:1: ( rule__Definition__Group_5__3__Impl rule__Definition__Group_5__4 )
            // InternalSimpleIDL.g:1763:2: rule__Definition__Group_5__3__Impl rule__Definition__Group_5__4
            {
            pushFollow(FOLLOW_25);
            rule__Definition__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_5__3"


    // $ANTLR start "rule__Definition__Group_5__3__Impl"
    // InternalSimpleIDL.g:1770:1: rule__Definition__Group_5__3__Impl : ( ( rule__Definition__NamesAssignment_5_3 ) ) ;
    public final void rule__Definition__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1774:1: ( ( ( rule__Definition__NamesAssignment_5_3 ) ) )
            // InternalSimpleIDL.g:1775:1: ( ( rule__Definition__NamesAssignment_5_3 ) )
            {
            // InternalSimpleIDL.g:1775:1: ( ( rule__Definition__NamesAssignment_5_3 ) )
            // InternalSimpleIDL.g:1776:2: ( rule__Definition__NamesAssignment_5_3 )
            {
             before(grammarAccess.getDefinitionAccess().getNamesAssignment_5_3()); 
            // InternalSimpleIDL.g:1777:2: ( rule__Definition__NamesAssignment_5_3 )
            // InternalSimpleIDL.g:1777:3: rule__Definition__NamesAssignment_5_3
            {
            pushFollow(FOLLOW_2);
            rule__Definition__NamesAssignment_5_3();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getNamesAssignment_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_5__3__Impl"


    // $ANTLR start "rule__Definition__Group_5__4"
    // InternalSimpleIDL.g:1785:1: rule__Definition__Group_5__4 : rule__Definition__Group_5__4__Impl rule__Definition__Group_5__5 ;
    public final void rule__Definition__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1789:1: ( rule__Definition__Group_5__4__Impl rule__Definition__Group_5__5 )
            // InternalSimpleIDL.g:1790:2: rule__Definition__Group_5__4__Impl rule__Definition__Group_5__5
            {
            pushFollow(FOLLOW_25);
            rule__Definition__Group_5__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_5__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_5__4"


    // $ANTLR start "rule__Definition__Group_5__4__Impl"
    // InternalSimpleIDL.g:1797:1: rule__Definition__Group_5__4__Impl : ( ( rule__Definition__Group_5_4__0 )* ) ;
    public final void rule__Definition__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1801:1: ( ( ( rule__Definition__Group_5_4__0 )* ) )
            // InternalSimpleIDL.g:1802:1: ( ( rule__Definition__Group_5_4__0 )* )
            {
            // InternalSimpleIDL.g:1802:1: ( ( rule__Definition__Group_5_4__0 )* )
            // InternalSimpleIDL.g:1803:2: ( rule__Definition__Group_5_4__0 )*
            {
             before(grammarAccess.getDefinitionAccess().getGroup_5_4()); 
            // InternalSimpleIDL.g:1804:2: ( rule__Definition__Group_5_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSimpleIDL.g:1804:3: rule__Definition__Group_5_4__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Definition__Group_5_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getDefinitionAccess().getGroup_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_5__4__Impl"


    // $ANTLR start "rule__Definition__Group_5__5"
    // InternalSimpleIDL.g:1812:1: rule__Definition__Group_5__5 : rule__Definition__Group_5__5__Impl ;
    public final void rule__Definition__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1816:1: ( rule__Definition__Group_5__5__Impl )
            // InternalSimpleIDL.g:1817:2: rule__Definition__Group_5__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_5__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_5__5"


    // $ANTLR start "rule__Definition__Group_5__5__Impl"
    // InternalSimpleIDL.g:1823:1: rule__Definition__Group_5__5__Impl : ( ';' ) ;
    public final void rule__Definition__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1827:1: ( ( ';' ) )
            // InternalSimpleIDL.g:1828:1: ( ';' )
            {
            // InternalSimpleIDL.g:1828:1: ( ';' )
            // InternalSimpleIDL.g:1829:2: ';'
            {
             before(grammarAccess.getDefinitionAccess().getSemicolonKeyword_5_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getSemicolonKeyword_5_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_5__5__Impl"


    // $ANTLR start "rule__Definition__Group_5_4__0"
    // InternalSimpleIDL.g:1839:1: rule__Definition__Group_5_4__0 : rule__Definition__Group_5_4__0__Impl rule__Definition__Group_5_4__1 ;
    public final void rule__Definition__Group_5_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1843:1: ( rule__Definition__Group_5_4__0__Impl rule__Definition__Group_5_4__1 )
            // InternalSimpleIDL.g:1844:2: rule__Definition__Group_5_4__0__Impl rule__Definition__Group_5_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Definition__Group_5_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_5_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_5_4__0"


    // $ANTLR start "rule__Definition__Group_5_4__0__Impl"
    // InternalSimpleIDL.g:1851:1: rule__Definition__Group_5_4__0__Impl : ( ',' ) ;
    public final void rule__Definition__Group_5_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1855:1: ( ( ',' ) )
            // InternalSimpleIDL.g:1856:1: ( ',' )
            {
            // InternalSimpleIDL.g:1856:1: ( ',' )
            // InternalSimpleIDL.g:1857:2: ','
            {
             before(grammarAccess.getDefinitionAccess().getCommaKeyword_5_4_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getCommaKeyword_5_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_5_4__0__Impl"


    // $ANTLR start "rule__Definition__Group_5_4__1"
    // InternalSimpleIDL.g:1866:1: rule__Definition__Group_5_4__1 : rule__Definition__Group_5_4__1__Impl ;
    public final void rule__Definition__Group_5_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1870:1: ( rule__Definition__Group_5_4__1__Impl )
            // InternalSimpleIDL.g:1871:2: rule__Definition__Group_5_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_5_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_5_4__1"


    // $ANTLR start "rule__Definition__Group_5_4__1__Impl"
    // InternalSimpleIDL.g:1877:1: rule__Definition__Group_5_4__1__Impl : ( ( rule__Definition__NamesAssignment_5_4_1 ) ) ;
    public final void rule__Definition__Group_5_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1881:1: ( ( ( rule__Definition__NamesAssignment_5_4_1 ) ) )
            // InternalSimpleIDL.g:1882:1: ( ( rule__Definition__NamesAssignment_5_4_1 ) )
            {
            // InternalSimpleIDL.g:1882:1: ( ( rule__Definition__NamesAssignment_5_4_1 ) )
            // InternalSimpleIDL.g:1883:2: ( rule__Definition__NamesAssignment_5_4_1 )
            {
             before(grammarAccess.getDefinitionAccess().getNamesAssignment_5_4_1()); 
            // InternalSimpleIDL.g:1884:2: ( rule__Definition__NamesAssignment_5_4_1 )
            // InternalSimpleIDL.g:1884:3: rule__Definition__NamesAssignment_5_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Definition__NamesAssignment_5_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getNamesAssignment_5_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_5_4__1__Impl"


    // $ANTLR start "rule__Member__Group__0"
    // InternalSimpleIDL.g:1893:1: rule__Member__Group__0 : rule__Member__Group__0__Impl rule__Member__Group__1 ;
    public final void rule__Member__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1897:1: ( rule__Member__Group__0__Impl rule__Member__Group__1 )
            // InternalSimpleIDL.g:1898:2: rule__Member__Group__0__Impl rule__Member__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Member__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__0"


    // $ANTLR start "rule__Member__Group__0__Impl"
    // InternalSimpleIDL.g:1905:1: rule__Member__Group__0__Impl : ( ( rule__Member__TypeAssignment_0 ) ) ;
    public final void rule__Member__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1909:1: ( ( ( rule__Member__TypeAssignment_0 ) ) )
            // InternalSimpleIDL.g:1910:1: ( ( rule__Member__TypeAssignment_0 ) )
            {
            // InternalSimpleIDL.g:1910:1: ( ( rule__Member__TypeAssignment_0 ) )
            // InternalSimpleIDL.g:1911:2: ( rule__Member__TypeAssignment_0 )
            {
             before(grammarAccess.getMemberAccess().getTypeAssignment_0()); 
            // InternalSimpleIDL.g:1912:2: ( rule__Member__TypeAssignment_0 )
            // InternalSimpleIDL.g:1912:3: rule__Member__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Member__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__0__Impl"


    // $ANTLR start "rule__Member__Group__1"
    // InternalSimpleIDL.g:1920:1: rule__Member__Group__1 : rule__Member__Group__1__Impl rule__Member__Group__2 ;
    public final void rule__Member__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1924:1: ( rule__Member__Group__1__Impl rule__Member__Group__2 )
            // InternalSimpleIDL.g:1925:2: rule__Member__Group__1__Impl rule__Member__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Member__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__1"


    // $ANTLR start "rule__Member__Group__1__Impl"
    // InternalSimpleIDL.g:1932:1: rule__Member__Group__1__Impl : ( ( rule__Member__NameAssignment_1 ) ) ;
    public final void rule__Member__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1936:1: ( ( ( rule__Member__NameAssignment_1 ) ) )
            // InternalSimpleIDL.g:1937:1: ( ( rule__Member__NameAssignment_1 ) )
            {
            // InternalSimpleIDL.g:1937:1: ( ( rule__Member__NameAssignment_1 ) )
            // InternalSimpleIDL.g:1938:2: ( rule__Member__NameAssignment_1 )
            {
             before(grammarAccess.getMemberAccess().getNameAssignment_1()); 
            // InternalSimpleIDL.g:1939:2: ( rule__Member__NameAssignment_1 )
            // InternalSimpleIDL.g:1939:3: rule__Member__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Member__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__1__Impl"


    // $ANTLR start "rule__Member__Group__2"
    // InternalSimpleIDL.g:1947:1: rule__Member__Group__2 : rule__Member__Group__2__Impl ;
    public final void rule__Member__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1951:1: ( rule__Member__Group__2__Impl )
            // InternalSimpleIDL.g:1952:2: rule__Member__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Member__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__2"


    // $ANTLR start "rule__Member__Group__2__Impl"
    // InternalSimpleIDL.g:1958:1: rule__Member__Group__2__Impl : ( ';' ) ;
    public final void rule__Member__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1962:1: ( ( ';' ) )
            // InternalSimpleIDL.g:1963:1: ( ';' )
            {
            // InternalSimpleIDL.g:1963:1: ( ';' )
            // InternalSimpleIDL.g:1964:2: ';'
            {
             before(grammarAccess.getMemberAccess().getSemicolonKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__2__Impl"


    // $ANTLR start "rule__Case__Group__0"
    // InternalSimpleIDL.g:1974:1: rule__Case__Group__0 : rule__Case__Group__0__Impl rule__Case__Group__1 ;
    public final void rule__Case__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1978:1: ( rule__Case__Group__0__Impl rule__Case__Group__1 )
            // InternalSimpleIDL.g:1979:2: rule__Case__Group__0__Impl rule__Case__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Case__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Case__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__0"


    // $ANTLR start "rule__Case__Group__0__Impl"
    // InternalSimpleIDL.g:1986:1: rule__Case__Group__0__Impl : ( ( ( rule__Case__Group_0__0 ) ) ( ( rule__Case__Group_0__0 )* ) ) ;
    public final void rule__Case__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1990:1: ( ( ( ( rule__Case__Group_0__0 ) ) ( ( rule__Case__Group_0__0 )* ) ) )
            // InternalSimpleIDL.g:1991:1: ( ( ( rule__Case__Group_0__0 ) ) ( ( rule__Case__Group_0__0 )* ) )
            {
            // InternalSimpleIDL.g:1991:1: ( ( ( rule__Case__Group_0__0 ) ) ( ( rule__Case__Group_0__0 )* ) )
            // InternalSimpleIDL.g:1992:2: ( ( rule__Case__Group_0__0 ) ) ( ( rule__Case__Group_0__0 )* )
            {
            // InternalSimpleIDL.g:1992:2: ( ( rule__Case__Group_0__0 ) )
            // InternalSimpleIDL.g:1993:3: ( rule__Case__Group_0__0 )
            {
             before(grammarAccess.getCaseAccess().getGroup_0()); 
            // InternalSimpleIDL.g:1994:3: ( rule__Case__Group_0__0 )
            // InternalSimpleIDL.g:1994:4: rule__Case__Group_0__0
            {
            pushFollow(FOLLOW_20);
            rule__Case__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getGroup_0()); 

            }

            // InternalSimpleIDL.g:1997:2: ( ( rule__Case__Group_0__0 )* )
            // InternalSimpleIDL.g:1998:3: ( rule__Case__Group_0__0 )*
            {
             before(grammarAccess.getCaseAccess().getGroup_0()); 
            // InternalSimpleIDL.g:1999:3: ( rule__Case__Group_0__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSimpleIDL.g:1999:4: rule__Case__Group_0__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Case__Group_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getCaseAccess().getGroup_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__0__Impl"


    // $ANTLR start "rule__Case__Group__1"
    // InternalSimpleIDL.g:2008:1: rule__Case__Group__1 : rule__Case__Group__1__Impl rule__Case__Group__2 ;
    public final void rule__Case__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2012:1: ( rule__Case__Group__1__Impl rule__Case__Group__2 )
            // InternalSimpleIDL.g:2013:2: rule__Case__Group__1__Impl rule__Case__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Case__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Case__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__1"


    // $ANTLR start "rule__Case__Group__1__Impl"
    // InternalSimpleIDL.g:2020:1: rule__Case__Group__1__Impl : ( ( rule__Case__TypeAssignment_1 ) ) ;
    public final void rule__Case__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2024:1: ( ( ( rule__Case__TypeAssignment_1 ) ) )
            // InternalSimpleIDL.g:2025:1: ( ( rule__Case__TypeAssignment_1 ) )
            {
            // InternalSimpleIDL.g:2025:1: ( ( rule__Case__TypeAssignment_1 ) )
            // InternalSimpleIDL.g:2026:2: ( rule__Case__TypeAssignment_1 )
            {
             before(grammarAccess.getCaseAccess().getTypeAssignment_1()); 
            // InternalSimpleIDL.g:2027:2: ( rule__Case__TypeAssignment_1 )
            // InternalSimpleIDL.g:2027:3: rule__Case__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Case__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__1__Impl"


    // $ANTLR start "rule__Case__Group__2"
    // InternalSimpleIDL.g:2035:1: rule__Case__Group__2 : rule__Case__Group__2__Impl rule__Case__Group__3 ;
    public final void rule__Case__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2039:1: ( rule__Case__Group__2__Impl rule__Case__Group__3 )
            // InternalSimpleIDL.g:2040:2: rule__Case__Group__2__Impl rule__Case__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Case__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Case__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__2"


    // $ANTLR start "rule__Case__Group__2__Impl"
    // InternalSimpleIDL.g:2047:1: rule__Case__Group__2__Impl : ( ( rule__Case__NameAssignment_2 ) ) ;
    public final void rule__Case__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2051:1: ( ( ( rule__Case__NameAssignment_2 ) ) )
            // InternalSimpleIDL.g:2052:1: ( ( rule__Case__NameAssignment_2 ) )
            {
            // InternalSimpleIDL.g:2052:1: ( ( rule__Case__NameAssignment_2 ) )
            // InternalSimpleIDL.g:2053:2: ( rule__Case__NameAssignment_2 )
            {
             before(grammarAccess.getCaseAccess().getNameAssignment_2()); 
            // InternalSimpleIDL.g:2054:2: ( rule__Case__NameAssignment_2 )
            // InternalSimpleIDL.g:2054:3: rule__Case__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Case__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__2__Impl"


    // $ANTLR start "rule__Case__Group__3"
    // InternalSimpleIDL.g:2062:1: rule__Case__Group__3 : rule__Case__Group__3__Impl ;
    public final void rule__Case__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2066:1: ( rule__Case__Group__3__Impl )
            // InternalSimpleIDL.g:2067:2: rule__Case__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Case__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__3"


    // $ANTLR start "rule__Case__Group__3__Impl"
    // InternalSimpleIDL.g:2073:1: rule__Case__Group__3__Impl : ( ';' ) ;
    public final void rule__Case__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2077:1: ( ( ';' ) )
            // InternalSimpleIDL.g:2078:1: ( ';' )
            {
            // InternalSimpleIDL.g:2078:1: ( ';' )
            // InternalSimpleIDL.g:2079:2: ';'
            {
             before(grammarAccess.getCaseAccess().getSemicolonKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCaseAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__3__Impl"


    // $ANTLR start "rule__Case__Group_0__0"
    // InternalSimpleIDL.g:2089:1: rule__Case__Group_0__0 : rule__Case__Group_0__0__Impl rule__Case__Group_0__1 ;
    public final void rule__Case__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2093:1: ( rule__Case__Group_0__0__Impl rule__Case__Group_0__1 )
            // InternalSimpleIDL.g:2094:2: rule__Case__Group_0__0__Impl rule__Case__Group_0__1
            {
            pushFollow(FOLLOW_26);
            rule__Case__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Case__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group_0__0"


    // $ANTLR start "rule__Case__Group_0__0__Impl"
    // InternalSimpleIDL.g:2101:1: rule__Case__Group_0__0__Impl : ( 'case' ) ;
    public final void rule__Case__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2105:1: ( ( 'case' ) )
            // InternalSimpleIDL.g:2106:1: ( 'case' )
            {
            // InternalSimpleIDL.g:2106:1: ( 'case' )
            // InternalSimpleIDL.g:2107:2: 'case'
            {
             before(grammarAccess.getCaseAccess().getCaseKeyword_0_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCaseAccess().getCaseKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group_0__0__Impl"


    // $ANTLR start "rule__Case__Group_0__1"
    // InternalSimpleIDL.g:2116:1: rule__Case__Group_0__1 : rule__Case__Group_0__1__Impl rule__Case__Group_0__2 ;
    public final void rule__Case__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2120:1: ( rule__Case__Group_0__1__Impl rule__Case__Group_0__2 )
            // InternalSimpleIDL.g:2121:2: rule__Case__Group_0__1__Impl rule__Case__Group_0__2
            {
            pushFollow(FOLLOW_27);
            rule__Case__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Case__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group_0__1"


    // $ANTLR start "rule__Case__Group_0__1__Impl"
    // InternalSimpleIDL.g:2128:1: rule__Case__Group_0__1__Impl : ( ( rule__Case__LabelsAssignment_0_1 ) ) ;
    public final void rule__Case__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2132:1: ( ( ( rule__Case__LabelsAssignment_0_1 ) ) )
            // InternalSimpleIDL.g:2133:1: ( ( rule__Case__LabelsAssignment_0_1 ) )
            {
            // InternalSimpleIDL.g:2133:1: ( ( rule__Case__LabelsAssignment_0_1 ) )
            // InternalSimpleIDL.g:2134:2: ( rule__Case__LabelsAssignment_0_1 )
            {
             before(grammarAccess.getCaseAccess().getLabelsAssignment_0_1()); 
            // InternalSimpleIDL.g:2135:2: ( rule__Case__LabelsAssignment_0_1 )
            // InternalSimpleIDL.g:2135:3: rule__Case__LabelsAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Case__LabelsAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getLabelsAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group_0__1__Impl"


    // $ANTLR start "rule__Case__Group_0__2"
    // InternalSimpleIDL.g:2143:1: rule__Case__Group_0__2 : rule__Case__Group_0__2__Impl ;
    public final void rule__Case__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2147:1: ( rule__Case__Group_0__2__Impl )
            // InternalSimpleIDL.g:2148:2: rule__Case__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Case__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group_0__2"


    // $ANTLR start "rule__Case__Group_0__2__Impl"
    // InternalSimpleIDL.g:2154:1: rule__Case__Group_0__2__Impl : ( ':' ) ;
    public final void rule__Case__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2158:1: ( ( ':' ) )
            // InternalSimpleIDL.g:2159:1: ( ':' )
            {
            // InternalSimpleIDL.g:2159:1: ( ':' )
            // InternalSimpleIDL.g:2160:2: ':'
            {
             before(grammarAccess.getCaseAccess().getColonKeyword_0_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCaseAccess().getColonKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group_0__2__Impl"


    // $ANTLR start "rule__AnyDeclarator__Group__0"
    // InternalSimpleIDL.g:2170:1: rule__AnyDeclarator__Group__0 : rule__AnyDeclarator__Group__0__Impl rule__AnyDeclarator__Group__1 ;
    public final void rule__AnyDeclarator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2174:1: ( rule__AnyDeclarator__Group__0__Impl rule__AnyDeclarator__Group__1 )
            // InternalSimpleIDL.g:2175:2: rule__AnyDeclarator__Group__0__Impl rule__AnyDeclarator__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__AnyDeclarator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnyDeclarator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyDeclarator__Group__0"


    // $ANTLR start "rule__AnyDeclarator__Group__0__Impl"
    // InternalSimpleIDL.g:2182:1: rule__AnyDeclarator__Group__0__Impl : ( ( rule__AnyDeclarator__NameAssignment_0 ) ) ;
    public final void rule__AnyDeclarator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2186:1: ( ( ( rule__AnyDeclarator__NameAssignment_0 ) ) )
            // InternalSimpleIDL.g:2187:1: ( ( rule__AnyDeclarator__NameAssignment_0 ) )
            {
            // InternalSimpleIDL.g:2187:1: ( ( rule__AnyDeclarator__NameAssignment_0 ) )
            // InternalSimpleIDL.g:2188:2: ( rule__AnyDeclarator__NameAssignment_0 )
            {
             before(grammarAccess.getAnyDeclaratorAccess().getNameAssignment_0()); 
            // InternalSimpleIDL.g:2189:2: ( rule__AnyDeclarator__NameAssignment_0 )
            // InternalSimpleIDL.g:2189:3: rule__AnyDeclarator__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AnyDeclarator__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAnyDeclaratorAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyDeclarator__Group__0__Impl"


    // $ANTLR start "rule__AnyDeclarator__Group__1"
    // InternalSimpleIDL.g:2197:1: rule__AnyDeclarator__Group__1 : rule__AnyDeclarator__Group__1__Impl ;
    public final void rule__AnyDeclarator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2201:1: ( rule__AnyDeclarator__Group__1__Impl )
            // InternalSimpleIDL.g:2202:2: rule__AnyDeclarator__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnyDeclarator__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyDeclarator__Group__1"


    // $ANTLR start "rule__AnyDeclarator__Group__1__Impl"
    // InternalSimpleIDL.g:2208:1: rule__AnyDeclarator__Group__1__Impl : ( ( rule__AnyDeclarator__ArraySizeAssignment_1 )? ) ;
    public final void rule__AnyDeclarator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2212:1: ( ( ( rule__AnyDeclarator__ArraySizeAssignment_1 )? ) )
            // InternalSimpleIDL.g:2213:1: ( ( rule__AnyDeclarator__ArraySizeAssignment_1 )? )
            {
            // InternalSimpleIDL.g:2213:1: ( ( rule__AnyDeclarator__ArraySizeAssignment_1 )? )
            // InternalSimpleIDL.g:2214:2: ( rule__AnyDeclarator__ArraySizeAssignment_1 )?
            {
             before(grammarAccess.getAnyDeclaratorAccess().getArraySizeAssignment_1()); 
            // InternalSimpleIDL.g:2215:2: ( rule__AnyDeclarator__ArraySizeAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSimpleIDL.g:2215:3: rule__AnyDeclarator__ArraySizeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AnyDeclarator__ArraySizeAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnyDeclaratorAccess().getArraySizeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyDeclarator__Group__1__Impl"


    // $ANTLR start "rule__FixedArraySize__Group__0"
    // InternalSimpleIDL.g:2224:1: rule__FixedArraySize__Group__0 : rule__FixedArraySize__Group__0__Impl rule__FixedArraySize__Group__1 ;
    public final void rule__FixedArraySize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2228:1: ( rule__FixedArraySize__Group__0__Impl rule__FixedArraySize__Group__1 )
            // InternalSimpleIDL.g:2229:2: rule__FixedArraySize__Group__0__Impl rule__FixedArraySize__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__FixedArraySize__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FixedArraySize__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedArraySize__Group__0"


    // $ANTLR start "rule__FixedArraySize__Group__0__Impl"
    // InternalSimpleIDL.g:2236:1: rule__FixedArraySize__Group__0__Impl : ( '[' ) ;
    public final void rule__FixedArraySize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2240:1: ( ( '[' ) )
            // InternalSimpleIDL.g:2241:1: ( '[' )
            {
            // InternalSimpleIDL.g:2241:1: ( '[' )
            // InternalSimpleIDL.g:2242:2: '['
            {
             before(grammarAccess.getFixedArraySizeAccess().getLeftSquareBracketKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFixedArraySizeAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedArraySize__Group__0__Impl"


    // $ANTLR start "rule__FixedArraySize__Group__1"
    // InternalSimpleIDL.g:2251:1: rule__FixedArraySize__Group__1 : rule__FixedArraySize__Group__1__Impl rule__FixedArraySize__Group__2 ;
    public final void rule__FixedArraySize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2255:1: ( rule__FixedArraySize__Group__1__Impl rule__FixedArraySize__Group__2 )
            // InternalSimpleIDL.g:2256:2: rule__FixedArraySize__Group__1__Impl rule__FixedArraySize__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__FixedArraySize__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FixedArraySize__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedArraySize__Group__1"


    // $ANTLR start "rule__FixedArraySize__Group__1__Impl"
    // InternalSimpleIDL.g:2263:1: rule__FixedArraySize__Group__1__Impl : ( ( rule__FixedArraySize__SizeAssignment_1 ) ) ;
    public final void rule__FixedArraySize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2267:1: ( ( ( rule__FixedArraySize__SizeAssignment_1 ) ) )
            // InternalSimpleIDL.g:2268:1: ( ( rule__FixedArraySize__SizeAssignment_1 ) )
            {
            // InternalSimpleIDL.g:2268:1: ( ( rule__FixedArraySize__SizeAssignment_1 ) )
            // InternalSimpleIDL.g:2269:2: ( rule__FixedArraySize__SizeAssignment_1 )
            {
             before(grammarAccess.getFixedArraySizeAccess().getSizeAssignment_1()); 
            // InternalSimpleIDL.g:2270:2: ( rule__FixedArraySize__SizeAssignment_1 )
            // InternalSimpleIDL.g:2270:3: rule__FixedArraySize__SizeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FixedArraySize__SizeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFixedArraySizeAccess().getSizeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedArraySize__Group__1__Impl"


    // $ANTLR start "rule__FixedArraySize__Group__2"
    // InternalSimpleIDL.g:2278:1: rule__FixedArraySize__Group__2 : rule__FixedArraySize__Group__2__Impl ;
    public final void rule__FixedArraySize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2282:1: ( rule__FixedArraySize__Group__2__Impl )
            // InternalSimpleIDL.g:2283:2: rule__FixedArraySize__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FixedArraySize__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedArraySize__Group__2"


    // $ANTLR start "rule__FixedArraySize__Group__2__Impl"
    // InternalSimpleIDL.g:2289:1: rule__FixedArraySize__Group__2__Impl : ( ']' ) ;
    public final void rule__FixedArraySize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2293:1: ( ( ']' ) )
            // InternalSimpleIDL.g:2294:1: ( ']' )
            {
            // InternalSimpleIDL.g:2294:1: ( ']' )
            // InternalSimpleIDL.g:2295:2: ']'
            {
             before(grammarAccess.getFixedArraySizeAccess().getRightSquareBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFixedArraySizeAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedArraySize__Group__2__Impl"


    // $ANTLR start "rule__Type__Group_1__0"
    // InternalSimpleIDL.g:2305:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2309:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // InternalSimpleIDL.g:2310:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__Type__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0"


    // $ANTLR start "rule__Type__Group_1__0__Impl"
    // InternalSimpleIDL.g:2317:1: rule__Type__Group_1__0__Impl : ( () ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2321:1: ( ( () ) )
            // InternalSimpleIDL.g:2322:1: ( () )
            {
            // InternalSimpleIDL.g:2322:1: ( () )
            // InternalSimpleIDL.g:2323:2: ()
            {
             before(grammarAccess.getTypeAccess().getBoundedSequenceAction_1_0()); 
            // InternalSimpleIDL.g:2324:2: ()
            // InternalSimpleIDL.g:2324:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getBoundedSequenceAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0__Impl"


    // $ANTLR start "rule__Type__Group_1__1"
    // InternalSimpleIDL.g:2332:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl rule__Type__Group_1__2 ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2336:1: ( rule__Type__Group_1__1__Impl rule__Type__Group_1__2 )
            // InternalSimpleIDL.g:2337:2: rule__Type__Group_1__1__Impl rule__Type__Group_1__2
            {
            pushFollow(FOLLOW_31);
            rule__Type__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1"


    // $ANTLR start "rule__Type__Group_1__1__Impl"
    // InternalSimpleIDL.g:2344:1: rule__Type__Group_1__1__Impl : ( 'sequence' ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2348:1: ( ( 'sequence' ) )
            // InternalSimpleIDL.g:2349:1: ( 'sequence' )
            {
            // InternalSimpleIDL.g:2349:1: ( 'sequence' )
            // InternalSimpleIDL.g:2350:2: 'sequence'
            {
             before(grammarAccess.getTypeAccess().getSequenceKeyword_1_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getSequenceKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1__Impl"


    // $ANTLR start "rule__Type__Group_1__2"
    // InternalSimpleIDL.g:2359:1: rule__Type__Group_1__2 : rule__Type__Group_1__2__Impl rule__Type__Group_1__3 ;
    public final void rule__Type__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2363:1: ( rule__Type__Group_1__2__Impl rule__Type__Group_1__3 )
            // InternalSimpleIDL.g:2364:2: rule__Type__Group_1__2__Impl rule__Type__Group_1__3
            {
            pushFollow(FOLLOW_11);
            rule__Type__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__2"


    // $ANTLR start "rule__Type__Group_1__2__Impl"
    // InternalSimpleIDL.g:2371:1: rule__Type__Group_1__2__Impl : ( '<' ) ;
    public final void rule__Type__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2375:1: ( ( '<' ) )
            // InternalSimpleIDL.g:2376:1: ( '<' )
            {
            // InternalSimpleIDL.g:2376:1: ( '<' )
            // InternalSimpleIDL.g:2377:2: '<'
            {
             before(grammarAccess.getTypeAccess().getLessThanSignKeyword_1_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLessThanSignKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__2__Impl"


    // $ANTLR start "rule__Type__Group_1__3"
    // InternalSimpleIDL.g:2386:1: rule__Type__Group_1__3 : rule__Type__Group_1__3__Impl rule__Type__Group_1__4 ;
    public final void rule__Type__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2390:1: ( rule__Type__Group_1__3__Impl rule__Type__Group_1__4 )
            // InternalSimpleIDL.g:2391:2: rule__Type__Group_1__3__Impl rule__Type__Group_1__4
            {
            pushFollow(FOLLOW_32);
            rule__Type__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__3"


    // $ANTLR start "rule__Type__Group_1__3__Impl"
    // InternalSimpleIDL.g:2398:1: rule__Type__Group_1__3__Impl : ( ( rule__Type__TypeAssignment_1_3 ) ) ;
    public final void rule__Type__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2402:1: ( ( ( rule__Type__TypeAssignment_1_3 ) ) )
            // InternalSimpleIDL.g:2403:1: ( ( rule__Type__TypeAssignment_1_3 ) )
            {
            // InternalSimpleIDL.g:2403:1: ( ( rule__Type__TypeAssignment_1_3 ) )
            // InternalSimpleIDL.g:2404:2: ( rule__Type__TypeAssignment_1_3 )
            {
             before(grammarAccess.getTypeAccess().getTypeAssignment_1_3()); 
            // InternalSimpleIDL.g:2405:2: ( rule__Type__TypeAssignment_1_3 )
            // InternalSimpleIDL.g:2405:3: rule__Type__TypeAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Type__TypeAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getTypeAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__3__Impl"


    // $ANTLR start "rule__Type__Group_1__4"
    // InternalSimpleIDL.g:2413:1: rule__Type__Group_1__4 : rule__Type__Group_1__4__Impl rule__Type__Group_1__5 ;
    public final void rule__Type__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2417:1: ( rule__Type__Group_1__4__Impl rule__Type__Group_1__5 )
            // InternalSimpleIDL.g:2418:2: rule__Type__Group_1__4__Impl rule__Type__Group_1__5
            {
            pushFollow(FOLLOW_26);
            rule__Type__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__4"


    // $ANTLR start "rule__Type__Group_1__4__Impl"
    // InternalSimpleIDL.g:2425:1: rule__Type__Group_1__4__Impl : ( ',' ) ;
    public final void rule__Type__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2429:1: ( ( ',' ) )
            // InternalSimpleIDL.g:2430:1: ( ',' )
            {
            // InternalSimpleIDL.g:2430:1: ( ',' )
            // InternalSimpleIDL.g:2431:2: ','
            {
             before(grammarAccess.getTypeAccess().getCommaKeyword_1_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getCommaKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__4__Impl"


    // $ANTLR start "rule__Type__Group_1__5"
    // InternalSimpleIDL.g:2440:1: rule__Type__Group_1__5 : rule__Type__Group_1__5__Impl rule__Type__Group_1__6 ;
    public final void rule__Type__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2444:1: ( rule__Type__Group_1__5__Impl rule__Type__Group_1__6 )
            // InternalSimpleIDL.g:2445:2: rule__Type__Group_1__5__Impl rule__Type__Group_1__6
            {
            pushFollow(FOLLOW_33);
            rule__Type__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_1__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__5"


    // $ANTLR start "rule__Type__Group_1__5__Impl"
    // InternalSimpleIDL.g:2452:1: rule__Type__Group_1__5__Impl : ( ( rule__Type__SizeAssignment_1_5 ) ) ;
    public final void rule__Type__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2456:1: ( ( ( rule__Type__SizeAssignment_1_5 ) ) )
            // InternalSimpleIDL.g:2457:1: ( ( rule__Type__SizeAssignment_1_5 ) )
            {
            // InternalSimpleIDL.g:2457:1: ( ( rule__Type__SizeAssignment_1_5 ) )
            // InternalSimpleIDL.g:2458:2: ( rule__Type__SizeAssignment_1_5 )
            {
             before(grammarAccess.getTypeAccess().getSizeAssignment_1_5()); 
            // InternalSimpleIDL.g:2459:2: ( rule__Type__SizeAssignment_1_5 )
            // InternalSimpleIDL.g:2459:3: rule__Type__SizeAssignment_1_5
            {
            pushFollow(FOLLOW_2);
            rule__Type__SizeAssignment_1_5();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getSizeAssignment_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__5__Impl"


    // $ANTLR start "rule__Type__Group_1__6"
    // InternalSimpleIDL.g:2467:1: rule__Type__Group_1__6 : rule__Type__Group_1__6__Impl ;
    public final void rule__Type__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2471:1: ( rule__Type__Group_1__6__Impl )
            // InternalSimpleIDL.g:2472:2: rule__Type__Group_1__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_1__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__6"


    // $ANTLR start "rule__Type__Group_1__6__Impl"
    // InternalSimpleIDL.g:2478:1: rule__Type__Group_1__6__Impl : ( '>' ) ;
    public final void rule__Type__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2482:1: ( ( '>' ) )
            // InternalSimpleIDL.g:2483:1: ( '>' )
            {
            // InternalSimpleIDL.g:2483:1: ( '>' )
            // InternalSimpleIDL.g:2484:2: '>'
            {
             before(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_1_6()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__6__Impl"


    // $ANTLR start "rule__Type__Group_2__0"
    // InternalSimpleIDL.g:2494:1: rule__Type__Group_2__0 : rule__Type__Group_2__0__Impl rule__Type__Group_2__1 ;
    public final void rule__Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2498:1: ( rule__Type__Group_2__0__Impl rule__Type__Group_2__1 )
            // InternalSimpleIDL.g:2499:2: rule__Type__Group_2__0__Impl rule__Type__Group_2__1
            {
            pushFollow(FOLLOW_30);
            rule__Type__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__0"


    // $ANTLR start "rule__Type__Group_2__0__Impl"
    // InternalSimpleIDL.g:2506:1: rule__Type__Group_2__0__Impl : ( () ) ;
    public final void rule__Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2510:1: ( ( () ) )
            // InternalSimpleIDL.g:2511:1: ( () )
            {
            // InternalSimpleIDL.g:2511:1: ( () )
            // InternalSimpleIDL.g:2512:2: ()
            {
             before(grammarAccess.getTypeAccess().getUnboundedSequenceAction_2_0()); 
            // InternalSimpleIDL.g:2513:2: ()
            // InternalSimpleIDL.g:2513:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getUnboundedSequenceAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__0__Impl"


    // $ANTLR start "rule__Type__Group_2__1"
    // InternalSimpleIDL.g:2521:1: rule__Type__Group_2__1 : rule__Type__Group_2__1__Impl rule__Type__Group_2__2 ;
    public final void rule__Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2525:1: ( rule__Type__Group_2__1__Impl rule__Type__Group_2__2 )
            // InternalSimpleIDL.g:2526:2: rule__Type__Group_2__1__Impl rule__Type__Group_2__2
            {
            pushFollow(FOLLOW_31);
            rule__Type__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__1"


    // $ANTLR start "rule__Type__Group_2__1__Impl"
    // InternalSimpleIDL.g:2533:1: rule__Type__Group_2__1__Impl : ( 'sequence' ) ;
    public final void rule__Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2537:1: ( ( 'sequence' ) )
            // InternalSimpleIDL.g:2538:1: ( 'sequence' )
            {
            // InternalSimpleIDL.g:2538:1: ( 'sequence' )
            // InternalSimpleIDL.g:2539:2: 'sequence'
            {
             before(grammarAccess.getTypeAccess().getSequenceKeyword_2_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getSequenceKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__1__Impl"


    // $ANTLR start "rule__Type__Group_2__2"
    // InternalSimpleIDL.g:2548:1: rule__Type__Group_2__2 : rule__Type__Group_2__2__Impl rule__Type__Group_2__3 ;
    public final void rule__Type__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2552:1: ( rule__Type__Group_2__2__Impl rule__Type__Group_2__3 )
            // InternalSimpleIDL.g:2553:2: rule__Type__Group_2__2__Impl rule__Type__Group_2__3
            {
            pushFollow(FOLLOW_11);
            rule__Type__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__2"


    // $ANTLR start "rule__Type__Group_2__2__Impl"
    // InternalSimpleIDL.g:2560:1: rule__Type__Group_2__2__Impl : ( '<' ) ;
    public final void rule__Type__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2564:1: ( ( '<' ) )
            // InternalSimpleIDL.g:2565:1: ( '<' )
            {
            // InternalSimpleIDL.g:2565:1: ( '<' )
            // InternalSimpleIDL.g:2566:2: '<'
            {
             before(grammarAccess.getTypeAccess().getLessThanSignKeyword_2_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLessThanSignKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__2__Impl"


    // $ANTLR start "rule__Type__Group_2__3"
    // InternalSimpleIDL.g:2575:1: rule__Type__Group_2__3 : rule__Type__Group_2__3__Impl rule__Type__Group_2__4 ;
    public final void rule__Type__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2579:1: ( rule__Type__Group_2__3__Impl rule__Type__Group_2__4 )
            // InternalSimpleIDL.g:2580:2: rule__Type__Group_2__3__Impl rule__Type__Group_2__4
            {
            pushFollow(FOLLOW_33);
            rule__Type__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__3"


    // $ANTLR start "rule__Type__Group_2__3__Impl"
    // InternalSimpleIDL.g:2587:1: rule__Type__Group_2__3__Impl : ( ( rule__Type__TypeAssignment_2_3 ) ) ;
    public final void rule__Type__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2591:1: ( ( ( rule__Type__TypeAssignment_2_3 ) ) )
            // InternalSimpleIDL.g:2592:1: ( ( rule__Type__TypeAssignment_2_3 ) )
            {
            // InternalSimpleIDL.g:2592:1: ( ( rule__Type__TypeAssignment_2_3 ) )
            // InternalSimpleIDL.g:2593:2: ( rule__Type__TypeAssignment_2_3 )
            {
             before(grammarAccess.getTypeAccess().getTypeAssignment_2_3()); 
            // InternalSimpleIDL.g:2594:2: ( rule__Type__TypeAssignment_2_3 )
            // InternalSimpleIDL.g:2594:3: rule__Type__TypeAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__Type__TypeAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getTypeAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__3__Impl"


    // $ANTLR start "rule__Type__Group_2__4"
    // InternalSimpleIDL.g:2602:1: rule__Type__Group_2__4 : rule__Type__Group_2__4__Impl ;
    public final void rule__Type__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2606:1: ( rule__Type__Group_2__4__Impl )
            // InternalSimpleIDL.g:2607:2: rule__Type__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__4"


    // $ANTLR start "rule__Type__Group_2__4__Impl"
    // InternalSimpleIDL.g:2613:1: rule__Type__Group_2__4__Impl : ( '>' ) ;
    public final void rule__Type__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2617:1: ( ( '>' ) )
            // InternalSimpleIDL.g:2618:1: ( '>' )
            {
            // InternalSimpleIDL.g:2618:1: ( '>' )
            // InternalSimpleIDL.g:2619:2: '>'
            {
             before(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_2_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__4__Impl"


    // $ANTLR start "rule__Type__Group_3__0"
    // InternalSimpleIDL.g:2629:1: rule__Type__Group_3__0 : rule__Type__Group_3__0__Impl rule__Type__Group_3__1 ;
    public final void rule__Type__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2633:1: ( rule__Type__Group_3__0__Impl rule__Type__Group_3__1 )
            // InternalSimpleIDL.g:2634:2: rule__Type__Group_3__0__Impl rule__Type__Group_3__1
            {
            pushFollow(FOLLOW_34);
            rule__Type__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__0"


    // $ANTLR start "rule__Type__Group_3__0__Impl"
    // InternalSimpleIDL.g:2641:1: rule__Type__Group_3__0__Impl : ( () ) ;
    public final void rule__Type__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2645:1: ( ( () ) )
            // InternalSimpleIDL.g:2646:1: ( () )
            {
            // InternalSimpleIDL.g:2646:1: ( () )
            // InternalSimpleIDL.g:2647:2: ()
            {
             before(grammarAccess.getTypeAccess().getBoundedStringAction_3_0()); 
            // InternalSimpleIDL.g:2648:2: ()
            // InternalSimpleIDL.g:2648:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getBoundedStringAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__0__Impl"


    // $ANTLR start "rule__Type__Group_3__1"
    // InternalSimpleIDL.g:2656:1: rule__Type__Group_3__1 : rule__Type__Group_3__1__Impl rule__Type__Group_3__2 ;
    public final void rule__Type__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2660:1: ( rule__Type__Group_3__1__Impl rule__Type__Group_3__2 )
            // InternalSimpleIDL.g:2661:2: rule__Type__Group_3__1__Impl rule__Type__Group_3__2
            {
            pushFollow(FOLLOW_31);
            rule__Type__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__1"


    // $ANTLR start "rule__Type__Group_3__1__Impl"
    // InternalSimpleIDL.g:2668:1: rule__Type__Group_3__1__Impl : ( 'string' ) ;
    public final void rule__Type__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2672:1: ( ( 'string' ) )
            // InternalSimpleIDL.g:2673:1: ( 'string' )
            {
            // InternalSimpleIDL.g:2673:1: ( 'string' )
            // InternalSimpleIDL.g:2674:2: 'string'
            {
             before(grammarAccess.getTypeAccess().getStringKeyword_3_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getStringKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__1__Impl"


    // $ANTLR start "rule__Type__Group_3__2"
    // InternalSimpleIDL.g:2683:1: rule__Type__Group_3__2 : rule__Type__Group_3__2__Impl rule__Type__Group_3__3 ;
    public final void rule__Type__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2687:1: ( rule__Type__Group_3__2__Impl rule__Type__Group_3__3 )
            // InternalSimpleIDL.g:2688:2: rule__Type__Group_3__2__Impl rule__Type__Group_3__3
            {
            pushFollow(FOLLOW_26);
            rule__Type__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__2"


    // $ANTLR start "rule__Type__Group_3__2__Impl"
    // InternalSimpleIDL.g:2695:1: rule__Type__Group_3__2__Impl : ( '<' ) ;
    public final void rule__Type__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2699:1: ( ( '<' ) )
            // InternalSimpleIDL.g:2700:1: ( '<' )
            {
            // InternalSimpleIDL.g:2700:1: ( '<' )
            // InternalSimpleIDL.g:2701:2: '<'
            {
             before(grammarAccess.getTypeAccess().getLessThanSignKeyword_3_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLessThanSignKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__2__Impl"


    // $ANTLR start "rule__Type__Group_3__3"
    // InternalSimpleIDL.g:2710:1: rule__Type__Group_3__3 : rule__Type__Group_3__3__Impl rule__Type__Group_3__4 ;
    public final void rule__Type__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2714:1: ( rule__Type__Group_3__3__Impl rule__Type__Group_3__4 )
            // InternalSimpleIDL.g:2715:2: rule__Type__Group_3__3__Impl rule__Type__Group_3__4
            {
            pushFollow(FOLLOW_33);
            rule__Type__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__3"


    // $ANTLR start "rule__Type__Group_3__3__Impl"
    // InternalSimpleIDL.g:2722:1: rule__Type__Group_3__3__Impl : ( ( rule__Type__SizeAssignment_3_3 ) ) ;
    public final void rule__Type__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2726:1: ( ( ( rule__Type__SizeAssignment_3_3 ) ) )
            // InternalSimpleIDL.g:2727:1: ( ( rule__Type__SizeAssignment_3_3 ) )
            {
            // InternalSimpleIDL.g:2727:1: ( ( rule__Type__SizeAssignment_3_3 ) )
            // InternalSimpleIDL.g:2728:2: ( rule__Type__SizeAssignment_3_3 )
            {
             before(grammarAccess.getTypeAccess().getSizeAssignment_3_3()); 
            // InternalSimpleIDL.g:2729:2: ( rule__Type__SizeAssignment_3_3 )
            // InternalSimpleIDL.g:2729:3: rule__Type__SizeAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__Type__SizeAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getSizeAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__3__Impl"


    // $ANTLR start "rule__Type__Group_3__4"
    // InternalSimpleIDL.g:2737:1: rule__Type__Group_3__4 : rule__Type__Group_3__4__Impl ;
    public final void rule__Type__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2741:1: ( rule__Type__Group_3__4__Impl )
            // InternalSimpleIDL.g:2742:2: rule__Type__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__4"


    // $ANTLR start "rule__Type__Group_3__4__Impl"
    // InternalSimpleIDL.g:2748:1: rule__Type__Group_3__4__Impl : ( '>' ) ;
    public final void rule__Type__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2752:1: ( ( '>' ) )
            // InternalSimpleIDL.g:2753:1: ( '>' )
            {
            // InternalSimpleIDL.g:2753:1: ( '>' )
            // InternalSimpleIDL.g:2754:2: '>'
            {
             before(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_3_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__4__Impl"


    // $ANTLR start "rule__Type__Group_4__0"
    // InternalSimpleIDL.g:2764:1: rule__Type__Group_4__0 : rule__Type__Group_4__0__Impl rule__Type__Group_4__1 ;
    public final void rule__Type__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2768:1: ( rule__Type__Group_4__0__Impl rule__Type__Group_4__1 )
            // InternalSimpleIDL.g:2769:2: rule__Type__Group_4__0__Impl rule__Type__Group_4__1
            {
            pushFollow(FOLLOW_34);
            rule__Type__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_4__0"


    // $ANTLR start "rule__Type__Group_4__0__Impl"
    // InternalSimpleIDL.g:2776:1: rule__Type__Group_4__0__Impl : ( () ) ;
    public final void rule__Type__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2780:1: ( ( () ) )
            // InternalSimpleIDL.g:2781:1: ( () )
            {
            // InternalSimpleIDL.g:2781:1: ( () )
            // InternalSimpleIDL.g:2782:2: ()
            {
             before(grammarAccess.getTypeAccess().getUnboundedStringAction_4_0()); 
            // InternalSimpleIDL.g:2783:2: ()
            // InternalSimpleIDL.g:2783:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getUnboundedStringAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_4__0__Impl"


    // $ANTLR start "rule__Type__Group_4__1"
    // InternalSimpleIDL.g:2791:1: rule__Type__Group_4__1 : rule__Type__Group_4__1__Impl ;
    public final void rule__Type__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2795:1: ( rule__Type__Group_4__1__Impl )
            // InternalSimpleIDL.g:2796:2: rule__Type__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_4__1"


    // $ANTLR start "rule__Type__Group_4__1__Impl"
    // InternalSimpleIDL.g:2802:1: rule__Type__Group_4__1__Impl : ( 'string' ) ;
    public final void rule__Type__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2806:1: ( ( 'string' ) )
            // InternalSimpleIDL.g:2807:1: ( 'string' )
            {
            // InternalSimpleIDL.g:2807:1: ( 'string' )
            // InternalSimpleIDL.g:2808:2: 'string'
            {
             before(grammarAccess.getTypeAccess().getStringKeyword_4_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getStringKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_4__1__Impl"


    // $ANTLR start "rule__Type__Group_5__0"
    // InternalSimpleIDL.g:2818:1: rule__Type__Group_5__0 : rule__Type__Group_5__0__Impl rule__Type__Group_5__1 ;
    public final void rule__Type__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2822:1: ( rule__Type__Group_5__0__Impl rule__Type__Group_5__1 )
            // InternalSimpleIDL.g:2823:2: rule__Type__Group_5__0__Impl rule__Type__Group_5__1
            {
            pushFollow(FOLLOW_35);
            rule__Type__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__0"


    // $ANTLR start "rule__Type__Group_5__0__Impl"
    // InternalSimpleIDL.g:2830:1: rule__Type__Group_5__0__Impl : ( () ) ;
    public final void rule__Type__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2834:1: ( ( () ) )
            // InternalSimpleIDL.g:2835:1: ( () )
            {
            // InternalSimpleIDL.g:2835:1: ( () )
            // InternalSimpleIDL.g:2836:2: ()
            {
             before(grammarAccess.getTypeAccess().getBoundedWideStringAction_5_0()); 
            // InternalSimpleIDL.g:2837:2: ()
            // InternalSimpleIDL.g:2837:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getBoundedWideStringAction_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__0__Impl"


    // $ANTLR start "rule__Type__Group_5__1"
    // InternalSimpleIDL.g:2845:1: rule__Type__Group_5__1 : rule__Type__Group_5__1__Impl rule__Type__Group_5__2 ;
    public final void rule__Type__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2849:1: ( rule__Type__Group_5__1__Impl rule__Type__Group_5__2 )
            // InternalSimpleIDL.g:2850:2: rule__Type__Group_5__1__Impl rule__Type__Group_5__2
            {
            pushFollow(FOLLOW_31);
            rule__Type__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__1"


    // $ANTLR start "rule__Type__Group_5__1__Impl"
    // InternalSimpleIDL.g:2857:1: rule__Type__Group_5__1__Impl : ( 'wstring' ) ;
    public final void rule__Type__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2861:1: ( ( 'wstring' ) )
            // InternalSimpleIDL.g:2862:1: ( 'wstring' )
            {
            // InternalSimpleIDL.g:2862:1: ( 'wstring' )
            // InternalSimpleIDL.g:2863:2: 'wstring'
            {
             before(grammarAccess.getTypeAccess().getWstringKeyword_5_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getWstringKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__1__Impl"


    // $ANTLR start "rule__Type__Group_5__2"
    // InternalSimpleIDL.g:2872:1: rule__Type__Group_5__2 : rule__Type__Group_5__2__Impl rule__Type__Group_5__3 ;
    public final void rule__Type__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2876:1: ( rule__Type__Group_5__2__Impl rule__Type__Group_5__3 )
            // InternalSimpleIDL.g:2877:2: rule__Type__Group_5__2__Impl rule__Type__Group_5__3
            {
            pushFollow(FOLLOW_26);
            rule__Type__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__2"


    // $ANTLR start "rule__Type__Group_5__2__Impl"
    // InternalSimpleIDL.g:2884:1: rule__Type__Group_5__2__Impl : ( '<' ) ;
    public final void rule__Type__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2888:1: ( ( '<' ) )
            // InternalSimpleIDL.g:2889:1: ( '<' )
            {
            // InternalSimpleIDL.g:2889:1: ( '<' )
            // InternalSimpleIDL.g:2890:2: '<'
            {
             before(grammarAccess.getTypeAccess().getLessThanSignKeyword_5_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLessThanSignKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__2__Impl"


    // $ANTLR start "rule__Type__Group_5__3"
    // InternalSimpleIDL.g:2899:1: rule__Type__Group_5__3 : rule__Type__Group_5__3__Impl rule__Type__Group_5__4 ;
    public final void rule__Type__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2903:1: ( rule__Type__Group_5__3__Impl rule__Type__Group_5__4 )
            // InternalSimpleIDL.g:2904:2: rule__Type__Group_5__3__Impl rule__Type__Group_5__4
            {
            pushFollow(FOLLOW_33);
            rule__Type__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__3"


    // $ANTLR start "rule__Type__Group_5__3__Impl"
    // InternalSimpleIDL.g:2911:1: rule__Type__Group_5__3__Impl : ( ( rule__Type__SizeAssignment_5_3 ) ) ;
    public final void rule__Type__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2915:1: ( ( ( rule__Type__SizeAssignment_5_3 ) ) )
            // InternalSimpleIDL.g:2916:1: ( ( rule__Type__SizeAssignment_5_3 ) )
            {
            // InternalSimpleIDL.g:2916:1: ( ( rule__Type__SizeAssignment_5_3 ) )
            // InternalSimpleIDL.g:2917:2: ( rule__Type__SizeAssignment_5_3 )
            {
             before(grammarAccess.getTypeAccess().getSizeAssignment_5_3()); 
            // InternalSimpleIDL.g:2918:2: ( rule__Type__SizeAssignment_5_3 )
            // InternalSimpleIDL.g:2918:3: rule__Type__SizeAssignment_5_3
            {
            pushFollow(FOLLOW_2);
            rule__Type__SizeAssignment_5_3();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getSizeAssignment_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__3__Impl"


    // $ANTLR start "rule__Type__Group_5__4"
    // InternalSimpleIDL.g:2926:1: rule__Type__Group_5__4 : rule__Type__Group_5__4__Impl ;
    public final void rule__Type__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2930:1: ( rule__Type__Group_5__4__Impl )
            // InternalSimpleIDL.g:2931:2: rule__Type__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__4"


    // $ANTLR start "rule__Type__Group_5__4__Impl"
    // InternalSimpleIDL.g:2937:1: rule__Type__Group_5__4__Impl : ( '>' ) ;
    public final void rule__Type__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2941:1: ( ( '>' ) )
            // InternalSimpleIDL.g:2942:1: ( '>' )
            {
            // InternalSimpleIDL.g:2942:1: ( '>' )
            // InternalSimpleIDL.g:2943:2: '>'
            {
             before(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_5_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__4__Impl"


    // $ANTLR start "rule__Type__Group_6__0"
    // InternalSimpleIDL.g:2953:1: rule__Type__Group_6__0 : rule__Type__Group_6__0__Impl rule__Type__Group_6__1 ;
    public final void rule__Type__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2957:1: ( rule__Type__Group_6__0__Impl rule__Type__Group_6__1 )
            // InternalSimpleIDL.g:2958:2: rule__Type__Group_6__0__Impl rule__Type__Group_6__1
            {
            pushFollow(FOLLOW_35);
            rule__Type__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_6__0"


    // $ANTLR start "rule__Type__Group_6__0__Impl"
    // InternalSimpleIDL.g:2965:1: rule__Type__Group_6__0__Impl : ( () ) ;
    public final void rule__Type__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2969:1: ( ( () ) )
            // InternalSimpleIDL.g:2970:1: ( () )
            {
            // InternalSimpleIDL.g:2970:1: ( () )
            // InternalSimpleIDL.g:2971:2: ()
            {
             before(grammarAccess.getTypeAccess().getUnboundedWideStringAction_6_0()); 
            // InternalSimpleIDL.g:2972:2: ()
            // InternalSimpleIDL.g:2972:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getUnboundedWideStringAction_6_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_6__0__Impl"


    // $ANTLR start "rule__Type__Group_6__1"
    // InternalSimpleIDL.g:2980:1: rule__Type__Group_6__1 : rule__Type__Group_6__1__Impl ;
    public final void rule__Type__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2984:1: ( rule__Type__Group_6__1__Impl )
            // InternalSimpleIDL.g:2985:2: rule__Type__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_6__1"


    // $ANTLR start "rule__Type__Group_6__1__Impl"
    // InternalSimpleIDL.g:2991:1: rule__Type__Group_6__1__Impl : ( 'wstring' ) ;
    public final void rule__Type__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2995:1: ( ( 'wstring' ) )
            // InternalSimpleIDL.g:2996:1: ( 'wstring' )
            {
            // InternalSimpleIDL.g:2996:1: ( 'wstring' )
            // InternalSimpleIDL.g:2997:2: 'wstring'
            {
             before(grammarAccess.getTypeAccess().getWstringKeyword_6_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getWstringKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_6__1__Impl"


    // $ANTLR start "rule__Type__Group_7__0"
    // InternalSimpleIDL.g:3007:1: rule__Type__Group_7__0 : rule__Type__Group_7__0__Impl rule__Type__Group_7__1 ;
    public final void rule__Type__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3011:1: ( rule__Type__Group_7__0__Impl rule__Type__Group_7__1 )
            // InternalSimpleIDL.g:3012:2: rule__Type__Group_7__0__Impl rule__Type__Group_7__1
            {
            pushFollow(FOLLOW_24);
            rule__Type__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_7__0"


    // $ANTLR start "rule__Type__Group_7__0__Impl"
    // InternalSimpleIDL.g:3019:1: rule__Type__Group_7__0__Impl : ( () ) ;
    public final void rule__Type__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3023:1: ( ( () ) )
            // InternalSimpleIDL.g:3024:1: ( () )
            {
            // InternalSimpleIDL.g:3024:1: ( () )
            // InternalSimpleIDL.g:3025:2: ()
            {
             before(grammarAccess.getTypeAccess().getFixedPtTypeAction_7_0()); 
            // InternalSimpleIDL.g:3026:2: ()
            // InternalSimpleIDL.g:3026:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getFixedPtTypeAction_7_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_7__0__Impl"


    // $ANTLR start "rule__Type__Group_7__1"
    // InternalSimpleIDL.g:3034:1: rule__Type__Group_7__1 : rule__Type__Group_7__1__Impl rule__Type__Group_7__2 ;
    public final void rule__Type__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3038:1: ( rule__Type__Group_7__1__Impl rule__Type__Group_7__2 )
            // InternalSimpleIDL.g:3039:2: rule__Type__Group_7__1__Impl rule__Type__Group_7__2
            {
            pushFollow(FOLLOW_31);
            rule__Type__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_7__1"


    // $ANTLR start "rule__Type__Group_7__1__Impl"
    // InternalSimpleIDL.g:3046:1: rule__Type__Group_7__1__Impl : ( 'fixed' ) ;
    public final void rule__Type__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3050:1: ( ( 'fixed' ) )
            // InternalSimpleIDL.g:3051:1: ( 'fixed' )
            {
            // InternalSimpleIDL.g:3051:1: ( 'fixed' )
            // InternalSimpleIDL.g:3052:2: 'fixed'
            {
             before(grammarAccess.getTypeAccess().getFixedKeyword_7_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getFixedKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_7__1__Impl"


    // $ANTLR start "rule__Type__Group_7__2"
    // InternalSimpleIDL.g:3061:1: rule__Type__Group_7__2 : rule__Type__Group_7__2__Impl rule__Type__Group_7__3 ;
    public final void rule__Type__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3065:1: ( rule__Type__Group_7__2__Impl rule__Type__Group_7__3 )
            // InternalSimpleIDL.g:3066:2: rule__Type__Group_7__2__Impl rule__Type__Group_7__3
            {
            pushFollow(FOLLOW_26);
            rule__Type__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_7__2"


    // $ANTLR start "rule__Type__Group_7__2__Impl"
    // InternalSimpleIDL.g:3073:1: rule__Type__Group_7__2__Impl : ( '<' ) ;
    public final void rule__Type__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3077:1: ( ( '<' ) )
            // InternalSimpleIDL.g:3078:1: ( '<' )
            {
            // InternalSimpleIDL.g:3078:1: ( '<' )
            // InternalSimpleIDL.g:3079:2: '<'
            {
             before(grammarAccess.getTypeAccess().getLessThanSignKeyword_7_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLessThanSignKeyword_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_7__2__Impl"


    // $ANTLR start "rule__Type__Group_7__3"
    // InternalSimpleIDL.g:3088:1: rule__Type__Group_7__3 : rule__Type__Group_7__3__Impl rule__Type__Group_7__4 ;
    public final void rule__Type__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3092:1: ( rule__Type__Group_7__3__Impl rule__Type__Group_7__4 )
            // InternalSimpleIDL.g:3093:2: rule__Type__Group_7__3__Impl rule__Type__Group_7__4
            {
            pushFollow(FOLLOW_32);
            rule__Type__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_7__3"


    // $ANTLR start "rule__Type__Group_7__3__Impl"
    // InternalSimpleIDL.g:3100:1: rule__Type__Group_7__3__Impl : ( ( rule__Type__TotalDigitsAssignment_7_3 ) ) ;
    public final void rule__Type__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3104:1: ( ( ( rule__Type__TotalDigitsAssignment_7_3 ) ) )
            // InternalSimpleIDL.g:3105:1: ( ( rule__Type__TotalDigitsAssignment_7_3 ) )
            {
            // InternalSimpleIDL.g:3105:1: ( ( rule__Type__TotalDigitsAssignment_7_3 ) )
            // InternalSimpleIDL.g:3106:2: ( rule__Type__TotalDigitsAssignment_7_3 )
            {
             before(grammarAccess.getTypeAccess().getTotalDigitsAssignment_7_3()); 
            // InternalSimpleIDL.g:3107:2: ( rule__Type__TotalDigitsAssignment_7_3 )
            // InternalSimpleIDL.g:3107:3: rule__Type__TotalDigitsAssignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__Type__TotalDigitsAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getTotalDigitsAssignment_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_7__3__Impl"


    // $ANTLR start "rule__Type__Group_7__4"
    // InternalSimpleIDL.g:3115:1: rule__Type__Group_7__4 : rule__Type__Group_7__4__Impl rule__Type__Group_7__5 ;
    public final void rule__Type__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3119:1: ( rule__Type__Group_7__4__Impl rule__Type__Group_7__5 )
            // InternalSimpleIDL.g:3120:2: rule__Type__Group_7__4__Impl rule__Type__Group_7__5
            {
            pushFollow(FOLLOW_26);
            rule__Type__Group_7__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_7__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_7__4"


    // $ANTLR start "rule__Type__Group_7__4__Impl"
    // InternalSimpleIDL.g:3127:1: rule__Type__Group_7__4__Impl : ( ',' ) ;
    public final void rule__Type__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3131:1: ( ( ',' ) )
            // InternalSimpleIDL.g:3132:1: ( ',' )
            {
            // InternalSimpleIDL.g:3132:1: ( ',' )
            // InternalSimpleIDL.g:3133:2: ','
            {
             before(grammarAccess.getTypeAccess().getCommaKeyword_7_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getCommaKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_7__4__Impl"


    // $ANTLR start "rule__Type__Group_7__5"
    // InternalSimpleIDL.g:3142:1: rule__Type__Group_7__5 : rule__Type__Group_7__5__Impl rule__Type__Group_7__6 ;
    public final void rule__Type__Group_7__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3146:1: ( rule__Type__Group_7__5__Impl rule__Type__Group_7__6 )
            // InternalSimpleIDL.g:3147:2: rule__Type__Group_7__5__Impl rule__Type__Group_7__6
            {
            pushFollow(FOLLOW_33);
            rule__Type__Group_7__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_7__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_7__5"


    // $ANTLR start "rule__Type__Group_7__5__Impl"
    // InternalSimpleIDL.g:3154:1: rule__Type__Group_7__5__Impl : ( ( rule__Type__FractionalDigitsAssignment_7_5 ) ) ;
    public final void rule__Type__Group_7__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3158:1: ( ( ( rule__Type__FractionalDigitsAssignment_7_5 ) ) )
            // InternalSimpleIDL.g:3159:1: ( ( rule__Type__FractionalDigitsAssignment_7_5 ) )
            {
            // InternalSimpleIDL.g:3159:1: ( ( rule__Type__FractionalDigitsAssignment_7_5 ) )
            // InternalSimpleIDL.g:3160:2: ( rule__Type__FractionalDigitsAssignment_7_5 )
            {
             before(grammarAccess.getTypeAccess().getFractionalDigitsAssignment_7_5()); 
            // InternalSimpleIDL.g:3161:2: ( rule__Type__FractionalDigitsAssignment_7_5 )
            // InternalSimpleIDL.g:3161:3: rule__Type__FractionalDigitsAssignment_7_5
            {
            pushFollow(FOLLOW_2);
            rule__Type__FractionalDigitsAssignment_7_5();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getFractionalDigitsAssignment_7_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_7__5__Impl"


    // $ANTLR start "rule__Type__Group_7__6"
    // InternalSimpleIDL.g:3169:1: rule__Type__Group_7__6 : rule__Type__Group_7__6__Impl ;
    public final void rule__Type__Group_7__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3173:1: ( rule__Type__Group_7__6__Impl )
            // InternalSimpleIDL.g:3174:2: rule__Type__Group_7__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_7__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_7__6"


    // $ANTLR start "rule__Type__Group_7__6__Impl"
    // InternalSimpleIDL.g:3180:1: rule__Type__Group_7__6__Impl : ( '>' ) ;
    public final void rule__Type__Group_7__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3184:1: ( ( '>' ) )
            // InternalSimpleIDL.g:3185:1: ( '>' )
            {
            // InternalSimpleIDL.g:3185:1: ( '>' )
            // InternalSimpleIDL.g:3186:2: '>'
            {
             before(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_7_6()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_7_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_7__6__Impl"


    // $ANTLR start "rule__SimpleTypeSpec__Group_0__0"
    // InternalSimpleIDL.g:3196:1: rule__SimpleTypeSpec__Group_0__0 : rule__SimpleTypeSpec__Group_0__0__Impl rule__SimpleTypeSpec__Group_0__1 ;
    public final void rule__SimpleTypeSpec__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3200:1: ( rule__SimpleTypeSpec__Group_0__0__Impl rule__SimpleTypeSpec__Group_0__1 )
            // InternalSimpleIDL.g:3201:2: rule__SimpleTypeSpec__Group_0__0__Impl rule__SimpleTypeSpec__Group_0__1
            {
            pushFollow(FOLLOW_17);
            rule__SimpleTypeSpec__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_0__0"


    // $ANTLR start "rule__SimpleTypeSpec__Group_0__0__Impl"
    // InternalSimpleIDL.g:3208:1: rule__SimpleTypeSpec__Group_0__0__Impl : ( () ) ;
    public final void rule__SimpleTypeSpec__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3212:1: ( ( () ) )
            // InternalSimpleIDL.g:3213:1: ( () )
            {
            // InternalSimpleIDL.g:3213:1: ( () )
            // InternalSimpleIDL.g:3214:2: ()
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getSignedShortIntAction_0_0()); 
            // InternalSimpleIDL.g:3215:2: ()
            // InternalSimpleIDL.g:3215:3: 
            {
            }

             after(grammarAccess.getSimpleTypeSpecAccess().getSignedShortIntAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_0__0__Impl"


    // $ANTLR start "rule__SimpleTypeSpec__Group_0__1"
    // InternalSimpleIDL.g:3223:1: rule__SimpleTypeSpec__Group_0__1 : rule__SimpleTypeSpec__Group_0__1__Impl ;
    public final void rule__SimpleTypeSpec__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3227:1: ( rule__SimpleTypeSpec__Group_0__1__Impl )
            // InternalSimpleIDL.g:3228:2: rule__SimpleTypeSpec__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_0__1"


    // $ANTLR start "rule__SimpleTypeSpec__Group_0__1__Impl"
    // InternalSimpleIDL.g:3234:1: rule__SimpleTypeSpec__Group_0__1__Impl : ( 'short' ) ;
    public final void rule__SimpleTypeSpec__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3238:1: ( ( 'short' ) )
            // InternalSimpleIDL.g:3239:1: ( 'short' )
            {
            // InternalSimpleIDL.g:3239:1: ( 'short' )
            // InternalSimpleIDL.g:3240:2: 'short'
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getShortKeyword_0_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSimpleTypeSpecAccess().getShortKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_0__1__Impl"


    // $ANTLR start "rule__SimpleTypeSpec__Group_1__0"
    // InternalSimpleIDL.g:3250:1: rule__SimpleTypeSpec__Group_1__0 : rule__SimpleTypeSpec__Group_1__0__Impl rule__SimpleTypeSpec__Group_1__1 ;
    public final void rule__SimpleTypeSpec__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3254:1: ( rule__SimpleTypeSpec__Group_1__0__Impl rule__SimpleTypeSpec__Group_1__1 )
            // InternalSimpleIDL.g:3255:2: rule__SimpleTypeSpec__Group_1__0__Impl rule__SimpleTypeSpec__Group_1__1
            {
            pushFollow(FOLLOW_36);
            rule__SimpleTypeSpec__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_1__0"


    // $ANTLR start "rule__SimpleTypeSpec__Group_1__0__Impl"
    // InternalSimpleIDL.g:3262:1: rule__SimpleTypeSpec__Group_1__0__Impl : ( () ) ;
    public final void rule__SimpleTypeSpec__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3266:1: ( ( () ) )
            // InternalSimpleIDL.g:3267:1: ( () )
            {
            // InternalSimpleIDL.g:3267:1: ( () )
            // InternalSimpleIDL.g:3268:2: ()
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getSignedLongIntAction_1_0()); 
            // InternalSimpleIDL.g:3269:2: ()
            // InternalSimpleIDL.g:3269:3: 
            {
            }

             after(grammarAccess.getSimpleTypeSpecAccess().getSignedLongIntAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_1__0__Impl"


    // $ANTLR start "rule__SimpleTypeSpec__Group_1__1"
    // InternalSimpleIDL.g:3277:1: rule__SimpleTypeSpec__Group_1__1 : rule__SimpleTypeSpec__Group_1__1__Impl ;
    public final void rule__SimpleTypeSpec__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3281:1: ( rule__SimpleTypeSpec__Group_1__1__Impl )
            // InternalSimpleIDL.g:3282:2: rule__SimpleTypeSpec__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_1__1"


    // $ANTLR start "rule__SimpleTypeSpec__Group_1__1__Impl"
    // InternalSimpleIDL.g:3288:1: rule__SimpleTypeSpec__Group_1__1__Impl : ( 'long' ) ;
    public final void rule__SimpleTypeSpec__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3292:1: ( ( 'long' ) )
            // InternalSimpleIDL.g:3293:1: ( 'long' )
            {
            // InternalSimpleIDL.g:3293:1: ( 'long' )
            // InternalSimpleIDL.g:3294:2: 'long'
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_1_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_1__1__Impl"


    // $ANTLR start "rule__SimpleTypeSpec__Group_2__0"
    // InternalSimpleIDL.g:3304:1: rule__SimpleTypeSpec__Group_2__0 : rule__SimpleTypeSpec__Group_2__0__Impl rule__SimpleTypeSpec__Group_2__1 ;
    public final void rule__SimpleTypeSpec__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3308:1: ( rule__SimpleTypeSpec__Group_2__0__Impl rule__SimpleTypeSpec__Group_2__1 )
            // InternalSimpleIDL.g:3309:2: rule__SimpleTypeSpec__Group_2__0__Impl rule__SimpleTypeSpec__Group_2__1
            {
            pushFollow(FOLLOW_36);
            rule__SimpleTypeSpec__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_2__0"


    // $ANTLR start "rule__SimpleTypeSpec__Group_2__0__Impl"
    // InternalSimpleIDL.g:3316:1: rule__SimpleTypeSpec__Group_2__0__Impl : ( () ) ;
    public final void rule__SimpleTypeSpec__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3320:1: ( ( () ) )
            // InternalSimpleIDL.g:3321:1: ( () )
            {
            // InternalSimpleIDL.g:3321:1: ( () )
            // InternalSimpleIDL.g:3322:2: ()
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getSignedLongLongIntAction_2_0()); 
            // InternalSimpleIDL.g:3323:2: ()
            // InternalSimpleIDL.g:3323:3: 
            {
            }

             after(grammarAccess.getSimpleTypeSpecAccess().getSignedLongLongIntAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_2__0__Impl"


    // $ANTLR start "rule__SimpleTypeSpec__Group_2__1"
    // InternalSimpleIDL.g:3331:1: rule__SimpleTypeSpec__Group_2__1 : rule__SimpleTypeSpec__Group_2__1__Impl rule__SimpleTypeSpec__Group_2__2 ;
    public final void rule__SimpleTypeSpec__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3335:1: ( rule__SimpleTypeSpec__Group_2__1__Impl rule__SimpleTypeSpec__Group_2__2 )
            // InternalSimpleIDL.g:3336:2: rule__SimpleTypeSpec__Group_2__1__Impl rule__SimpleTypeSpec__Group_2__2
            {
            pushFollow(FOLLOW_36);
            rule__SimpleTypeSpec__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_2__1"


    // $ANTLR start "rule__SimpleTypeSpec__Group_2__1__Impl"
    // InternalSimpleIDL.g:3343:1: rule__SimpleTypeSpec__Group_2__1__Impl : ( 'long' ) ;
    public final void rule__SimpleTypeSpec__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3347:1: ( ( 'long' ) )
            // InternalSimpleIDL.g:3348:1: ( 'long' )
            {
            // InternalSimpleIDL.g:3348:1: ( 'long' )
            // InternalSimpleIDL.g:3349:2: 'long'
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_2_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_2__1__Impl"


    // $ANTLR start "rule__SimpleTypeSpec__Group_2__2"
    // InternalSimpleIDL.g:3358:1: rule__SimpleTypeSpec__Group_2__2 : rule__SimpleTypeSpec__Group_2__2__Impl ;
    public final void rule__SimpleTypeSpec__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3362:1: ( rule__SimpleTypeSpec__Group_2__2__Impl )
            // InternalSimpleIDL.g:3363:2: rule__SimpleTypeSpec__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_2__2"


    // $ANTLR start "rule__SimpleTypeSpec__Group_2__2__Impl"
    // InternalSimpleIDL.g:3369:1: rule__SimpleTypeSpec__Group_2__2__Impl : ( 'long' ) ;
    public final void rule__SimpleTypeSpec__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3373:1: ( ( 'long' ) )
            // InternalSimpleIDL.g:3374:1: ( 'long' )
            {
            // InternalSimpleIDL.g:3374:1: ( 'long' )
            // InternalSimpleIDL.g:3375:2: 'long'
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_2_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_2__2__Impl"


    // $ANTLR start "rule__SimpleTypeSpec__Group_3__0"
    // InternalSimpleIDL.g:3385:1: rule__SimpleTypeSpec__Group_3__0 : rule__SimpleTypeSpec__Group_3__0__Impl rule__SimpleTypeSpec__Group_3__1 ;
    public final void rule__SimpleTypeSpec__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3389:1: ( rule__SimpleTypeSpec__Group_3__0__Impl rule__SimpleTypeSpec__Group_3__1 )
            // InternalSimpleIDL.g:3390:2: rule__SimpleTypeSpec__Group_3__0__Impl rule__SimpleTypeSpec__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__SimpleTypeSpec__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_3__0"


    // $ANTLR start "rule__SimpleTypeSpec__Group_3__0__Impl"
    // InternalSimpleIDL.g:3397:1: rule__SimpleTypeSpec__Group_3__0__Impl : ( () ) ;
    public final void rule__SimpleTypeSpec__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3401:1: ( ( () ) )
            // InternalSimpleIDL.g:3402:1: ( () )
            {
            // InternalSimpleIDL.g:3402:1: ( () )
            // InternalSimpleIDL.g:3403:2: ()
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getUnsignedShortIntAction_3_0()); 
            // InternalSimpleIDL.g:3404:2: ()
            // InternalSimpleIDL.g:3404:3: 
            {
            }

             after(grammarAccess.getSimpleTypeSpecAccess().getUnsignedShortIntAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_3__0__Impl"


    // $ANTLR start "rule__SimpleTypeSpec__Group_3__1"
    // InternalSimpleIDL.g:3412:1: rule__SimpleTypeSpec__Group_3__1 : rule__SimpleTypeSpec__Group_3__1__Impl rule__SimpleTypeSpec__Group_3__2 ;
    public final void rule__SimpleTypeSpec__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3416:1: ( rule__SimpleTypeSpec__Group_3__1__Impl rule__SimpleTypeSpec__Group_3__2 )
            // InternalSimpleIDL.g:3417:2: rule__SimpleTypeSpec__Group_3__1__Impl rule__SimpleTypeSpec__Group_3__2
            {
            pushFollow(FOLLOW_17);
            rule__SimpleTypeSpec__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_3__1"


    // $ANTLR start "rule__SimpleTypeSpec__Group_3__1__Impl"
    // InternalSimpleIDL.g:3424:1: rule__SimpleTypeSpec__Group_3__1__Impl : ( 'unsigned' ) ;
    public final void rule__SimpleTypeSpec__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3428:1: ( ( 'unsigned' ) )
            // InternalSimpleIDL.g:3429:1: ( 'unsigned' )
            {
            // InternalSimpleIDL.g:3429:1: ( 'unsigned' )
            // InternalSimpleIDL.g:3430:2: 'unsigned'
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getUnsignedKeyword_3_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSimpleTypeSpecAccess().getUnsignedKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_3__1__Impl"


    // $ANTLR start "rule__SimpleTypeSpec__Group_3__2"
    // InternalSimpleIDL.g:3439:1: rule__SimpleTypeSpec__Group_3__2 : rule__SimpleTypeSpec__Group_3__2__Impl ;
    public final void rule__SimpleTypeSpec__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3443:1: ( rule__SimpleTypeSpec__Group_3__2__Impl )
            // InternalSimpleIDL.g:3444:2: rule__SimpleTypeSpec__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_3__2"


    // $ANTLR start "rule__SimpleTypeSpec__Group_3__2__Impl"
    // InternalSimpleIDL.g:3450:1: rule__SimpleTypeSpec__Group_3__2__Impl : ( 'short' ) ;
    public final void rule__SimpleTypeSpec__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3454:1: ( ( 'short' ) )
            // InternalSimpleIDL.g:3455:1: ( 'short' )
            {
            // InternalSimpleIDL.g:3455:1: ( 'short' )
            // InternalSimpleIDL.g:3456:2: 'short'
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getShortKeyword_3_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSimpleTypeSpecAccess().getShortKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_3__2__Impl"


    // $ANTLR start "rule__SimpleTypeSpec__Group_4__0"
    // InternalSimpleIDL.g:3466:1: rule__SimpleTypeSpec__Group_4__0 : rule__SimpleTypeSpec__Group_4__0__Impl rule__SimpleTypeSpec__Group_4__1 ;
    public final void rule__SimpleTypeSpec__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3470:1: ( rule__SimpleTypeSpec__Group_4__0__Impl rule__SimpleTypeSpec__Group_4__1 )
            // InternalSimpleIDL.g:3471:2: rule__SimpleTypeSpec__Group_4__0__Impl rule__SimpleTypeSpec__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__SimpleTypeSpec__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_4__0"


    // $ANTLR start "rule__SimpleTypeSpec__Group_4__0__Impl"
    // InternalSimpleIDL.g:3478:1: rule__SimpleTypeSpec__Group_4__0__Impl : ( () ) ;
    public final void rule__SimpleTypeSpec__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3482:1: ( ( () ) )
            // InternalSimpleIDL.g:3483:1: ( () )
            {
            // InternalSimpleIDL.g:3483:1: ( () )
            // InternalSimpleIDL.g:3484:2: ()
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getUnsignedLongIntAction_4_0()); 
            // InternalSimpleIDL.g:3485:2: ()
            // InternalSimpleIDL.g:3485:3: 
            {
            }

             after(grammarAccess.getSimpleTypeSpecAccess().getUnsignedLongIntAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_4__0__Impl"


    // $ANTLR start "rule__SimpleTypeSpec__Group_4__1"
    // InternalSimpleIDL.g:3493:1: rule__SimpleTypeSpec__Group_4__1 : rule__SimpleTypeSpec__Group_4__1__Impl rule__SimpleTypeSpec__Group_4__2 ;
    public final void rule__SimpleTypeSpec__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3497:1: ( rule__SimpleTypeSpec__Group_4__1__Impl rule__SimpleTypeSpec__Group_4__2 )
            // InternalSimpleIDL.g:3498:2: rule__SimpleTypeSpec__Group_4__1__Impl rule__SimpleTypeSpec__Group_4__2
            {
            pushFollow(FOLLOW_36);
            rule__SimpleTypeSpec__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_4__1"


    // $ANTLR start "rule__SimpleTypeSpec__Group_4__1__Impl"
    // InternalSimpleIDL.g:3505:1: rule__SimpleTypeSpec__Group_4__1__Impl : ( 'unsigned' ) ;
    public final void rule__SimpleTypeSpec__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3509:1: ( ( 'unsigned' ) )
            // InternalSimpleIDL.g:3510:1: ( 'unsigned' )
            {
            // InternalSimpleIDL.g:3510:1: ( 'unsigned' )
            // InternalSimpleIDL.g:3511:2: 'unsigned'
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getUnsignedKeyword_4_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSimpleTypeSpecAccess().getUnsignedKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_4__1__Impl"


    // $ANTLR start "rule__SimpleTypeSpec__Group_4__2"
    // InternalSimpleIDL.g:3520:1: rule__SimpleTypeSpec__Group_4__2 : rule__SimpleTypeSpec__Group_4__2__Impl ;
    public final void rule__SimpleTypeSpec__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3524:1: ( rule__SimpleTypeSpec__Group_4__2__Impl )
            // InternalSimpleIDL.g:3525:2: rule__SimpleTypeSpec__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_4__2"


    // $ANTLR start "rule__SimpleTypeSpec__Group_4__2__Impl"
    // InternalSimpleIDL.g:3531:1: rule__SimpleTypeSpec__Group_4__2__Impl : ( 'long' ) ;
    public final void rule__SimpleTypeSpec__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3535:1: ( ( 'long' ) )
            // InternalSimpleIDL.g:3536:1: ( 'long' )
            {
            // InternalSimpleIDL.g:3536:1: ( 'long' )
            // InternalSimpleIDL.g:3537:2: 'long'
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_4_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_4__2__Impl"


    // $ANTLR start "rule__SimpleTypeSpec__Group_5__0"
    // InternalSimpleIDL.g:3547:1: rule__SimpleTypeSpec__Group_5__0 : rule__SimpleTypeSpec__Group_5__0__Impl rule__SimpleTypeSpec__Group_5__1 ;
    public final void rule__SimpleTypeSpec__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3551:1: ( rule__SimpleTypeSpec__Group_5__0__Impl rule__SimpleTypeSpec__Group_5__1 )
            // InternalSimpleIDL.g:3552:2: rule__SimpleTypeSpec__Group_5__0__Impl rule__SimpleTypeSpec__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__SimpleTypeSpec__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_5__0"


    // $ANTLR start "rule__SimpleTypeSpec__Group_5__0__Impl"
    // InternalSimpleIDL.g:3559:1: rule__SimpleTypeSpec__Group_5__0__Impl : ( () ) ;
    public final void rule__SimpleTypeSpec__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3563:1: ( ( () ) )
            // InternalSimpleIDL.g:3564:1: ( () )
            {
            // InternalSimpleIDL.g:3564:1: ( () )
            // InternalSimpleIDL.g:3565:2: ()
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getUnsignedLongLongIntAction_5_0()); 
            // InternalSimpleIDL.g:3566:2: ()
            // InternalSimpleIDL.g:3566:3: 
            {
            }

             after(grammarAccess.getSimpleTypeSpecAccess().getUnsignedLongLongIntAction_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_5__0__Impl"


    // $ANTLR start "rule__SimpleTypeSpec__Group_5__1"
    // InternalSimpleIDL.g:3574:1: rule__SimpleTypeSpec__Group_5__1 : rule__SimpleTypeSpec__Group_5__1__Impl rule__SimpleTypeSpec__Group_5__2 ;
    public final void rule__SimpleTypeSpec__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3578:1: ( rule__SimpleTypeSpec__Group_5__1__Impl rule__SimpleTypeSpec__Group_5__2 )
            // InternalSimpleIDL.g:3579:2: rule__SimpleTypeSpec__Group_5__1__Impl rule__SimpleTypeSpec__Group_5__2
            {
            pushFollow(FOLLOW_36);
            rule__SimpleTypeSpec__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_5__1"


    // $ANTLR start "rule__SimpleTypeSpec__Group_5__1__Impl"
    // InternalSimpleIDL.g:3586:1: rule__SimpleTypeSpec__Group_5__1__Impl : ( 'unsigned' ) ;
    public final void rule__SimpleTypeSpec__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3590:1: ( ( 'unsigned' ) )
            // InternalSimpleIDL.g:3591:1: ( 'unsigned' )
            {
            // InternalSimpleIDL.g:3591:1: ( 'unsigned' )
            // InternalSimpleIDL.g:3592:2: 'unsigned'
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getUnsignedKeyword_5_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSimpleTypeSpecAccess().getUnsignedKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_5__1__Impl"


    // $ANTLR start "rule__SimpleTypeSpec__Group_5__2"
    // InternalSimpleIDL.g:3601:1: rule__SimpleTypeSpec__Group_5__2 : rule__SimpleTypeSpec__Group_5__2__Impl rule__SimpleTypeSpec__Group_5__3 ;
    public final void rule__SimpleTypeSpec__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3605:1: ( rule__SimpleTypeSpec__Group_5__2__Impl rule__SimpleTypeSpec__Group_5__3 )
            // InternalSimpleIDL.g:3606:2: rule__SimpleTypeSpec__Group_5__2__Impl rule__SimpleTypeSpec__Group_5__3
            {
            pushFollow(FOLLOW_36);
            rule__SimpleTypeSpec__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_5__2"


    // $ANTLR start "rule__SimpleTypeSpec__Group_5__2__Impl"
    // InternalSimpleIDL.g:3613:1: rule__SimpleTypeSpec__Group_5__2__Impl : ( 'long' ) ;
    public final void rule__SimpleTypeSpec__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3617:1: ( ( 'long' ) )
            // InternalSimpleIDL.g:3618:1: ( 'long' )
            {
            // InternalSimpleIDL.g:3618:1: ( 'long' )
            // InternalSimpleIDL.g:3619:2: 'long'
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_5_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_5__2__Impl"


    // $ANTLR start "rule__SimpleTypeSpec__Group_5__3"
    // InternalSimpleIDL.g:3628:1: rule__SimpleTypeSpec__Group_5__3 : rule__SimpleTypeSpec__Group_5__3__Impl ;
    public final void rule__SimpleTypeSpec__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3632:1: ( rule__SimpleTypeSpec__Group_5__3__Impl )
            // InternalSimpleIDL.g:3633:2: rule__SimpleTypeSpec__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_5__3"


    // $ANTLR start "rule__SimpleTypeSpec__Group_5__3__Impl"
    // InternalSimpleIDL.g:3639:1: rule__SimpleTypeSpec__Group_5__3__Impl : ( 'long' ) ;
    public final void rule__SimpleTypeSpec__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3643:1: ( ( 'long' ) )
            // InternalSimpleIDL.g:3644:1: ( 'long' )
            {
            // InternalSimpleIDL.g:3644:1: ( 'long' )
            // InternalSimpleIDL.g:3645:2: 'long'
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_5_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_5__3__Impl"


    // $ANTLR start "rule__SimpleTypeSpec__Group_6__0"
    // InternalSimpleIDL.g:3655:1: rule__SimpleTypeSpec__Group_6__0 : rule__SimpleTypeSpec__Group_6__0__Impl rule__SimpleTypeSpec__Group_6__1 ;
    public final void rule__SimpleTypeSpec__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3659:1: ( rule__SimpleTypeSpec__Group_6__0__Impl rule__SimpleTypeSpec__Group_6__1 )
            // InternalSimpleIDL.g:3660:2: rule__SimpleTypeSpec__Group_6__0__Impl rule__SimpleTypeSpec__Group_6__1
            {
            pushFollow(FOLLOW_37);
            rule__SimpleTypeSpec__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_6__0"


    // $ANTLR start "rule__SimpleTypeSpec__Group_6__0__Impl"
    // InternalSimpleIDL.g:3667:1: rule__SimpleTypeSpec__Group_6__0__Impl : ( () ) ;
    public final void rule__SimpleTypeSpec__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3671:1: ( ( () ) )
            // InternalSimpleIDL.g:3672:1: ( () )
            {
            // InternalSimpleIDL.g:3672:1: ( () )
            // InternalSimpleIDL.g:3673:2: ()
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getFloatTypeAction_6_0()); 
            // InternalSimpleIDL.g:3674:2: ()
            // InternalSimpleIDL.g:3674:3: 
            {
            }

             after(grammarAccess.getSimpleTypeSpecAccess().getFloatTypeAction_6_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_6__0__Impl"


    // $ANTLR start "rule__SimpleTypeSpec__Group_6__1"
    // InternalSimpleIDL.g:3682:1: rule__SimpleTypeSpec__Group_6__1 : rule__SimpleTypeSpec__Group_6__1__Impl ;
    public final void rule__SimpleTypeSpec__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3686:1: ( rule__SimpleTypeSpec__Group_6__1__Impl )
            // InternalSimpleIDL.g:3687:2: rule__SimpleTypeSpec__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_6__1"


    // $ANTLR start "rule__SimpleTypeSpec__Group_6__1__Impl"
    // InternalSimpleIDL.g:3693:1: rule__SimpleTypeSpec__Group_6__1__Impl : ( 'float' ) ;
    public final void rule__SimpleTypeSpec__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3697:1: ( ( 'float' ) )
            // InternalSimpleIDL.g:3698:1: ( 'float' )
            {
            // InternalSimpleIDL.g:3698:1: ( 'float' )
            // InternalSimpleIDL.g:3699:2: 'float'
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getFloatKeyword_6_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSimpleTypeSpecAccess().getFloatKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_6__1__Impl"


    // $ANTLR start "rule__SimpleTypeSpec__Group_7__0"
    // InternalSimpleIDL.g:3709:1: rule__SimpleTypeSpec__Group_7__0 : rule__SimpleTypeSpec__Group_7__0__Impl rule__SimpleTypeSpec__Group_7__1 ;
    public final void rule__SimpleTypeSpec__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3713:1: ( rule__SimpleTypeSpec__Group_7__0__Impl rule__SimpleTypeSpec__Group_7__1 )
            // InternalSimpleIDL.g:3714:2: rule__SimpleTypeSpec__Group_7__0__Impl rule__SimpleTypeSpec__Group_7__1
            {
            pushFollow(FOLLOW_38);
            rule__SimpleTypeSpec__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_7__0"


    // $ANTLR start "rule__SimpleTypeSpec__Group_7__0__Impl"
    // InternalSimpleIDL.g:3721:1: rule__SimpleTypeSpec__Group_7__0__Impl : ( () ) ;
    public final void rule__SimpleTypeSpec__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3725:1: ( ( () ) )
            // InternalSimpleIDL.g:3726:1: ( () )
            {
            // InternalSimpleIDL.g:3726:1: ( () )
            // InternalSimpleIDL.g:3727:2: ()
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getDoubleTypeAction_7_0()); 
            // InternalSimpleIDL.g:3728:2: ()
            // InternalSimpleIDL.g:3728:3: 
            {
            }

             after(grammarAccess.getSimpleTypeSpecAccess().getDoubleTypeAction_7_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_7__0__Impl"


    // $ANTLR start "rule__SimpleTypeSpec__Group_7__1"
    // InternalSimpleIDL.g:3736:1: rule__SimpleTypeSpec__Group_7__1 : rule__SimpleTypeSpec__Group_7__1__Impl ;
    public final void rule__SimpleTypeSpec__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3740:1: ( rule__SimpleTypeSpec__Group_7__1__Impl )
            // InternalSimpleIDL.g:3741:2: rule__SimpleTypeSpec__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_7__1"


    // $ANTLR start "rule__SimpleTypeSpec__Group_7__1__Impl"
    // InternalSimpleIDL.g:3747:1: rule__SimpleTypeSpec__Group_7__1__Impl : ( 'double' ) ;
    public final void rule__SimpleTypeSpec__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3751:1: ( ( 'double' ) )
            // InternalSimpleIDL.g:3752:1: ( 'double' )
            {
            // InternalSimpleIDL.g:3752:1: ( 'double' )
            // InternalSimpleIDL.g:3753:2: 'double'
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getDoubleKeyword_7_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSimpleTypeSpecAccess().getDoubleKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_7__1__Impl"


    // $ANTLR start "rule__SimpleTypeSpec__Group_8__0"
    // InternalSimpleIDL.g:3763:1: rule__SimpleTypeSpec__Group_8__0 : rule__SimpleTypeSpec__Group_8__0__Impl rule__SimpleTypeSpec__Group_8__1 ;
    public final void rule__SimpleTypeSpec__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3767:1: ( rule__SimpleTypeSpec__Group_8__0__Impl rule__SimpleTypeSpec__Group_8__1 )
            // InternalSimpleIDL.g:3768:2: rule__SimpleTypeSpec__Group_8__0__Impl rule__SimpleTypeSpec__Group_8__1
            {
            pushFollow(FOLLOW_36);
            rule__SimpleTypeSpec__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_8__0"


    // $ANTLR start "rule__SimpleTypeSpec__Group_8__0__Impl"
    // InternalSimpleIDL.g:3775:1: rule__SimpleTypeSpec__Group_8__0__Impl : ( () ) ;
    public final void rule__SimpleTypeSpec__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3779:1: ( ( () ) )
            // InternalSimpleIDL.g:3780:1: ( () )
            {
            // InternalSimpleIDL.g:3780:1: ( () )
            // InternalSimpleIDL.g:3781:2: ()
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getLongDoubleTypeAction_8_0()); 
            // InternalSimpleIDL.g:3782:2: ()
            // InternalSimpleIDL.g:3782:3: 
            {
            }

             after(grammarAccess.getSimpleTypeSpecAccess().getLongDoubleTypeAction_8_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_8__0__Impl"


    // $ANTLR start "rule__SimpleTypeSpec__Group_8__1"
    // InternalSimpleIDL.g:3790:1: rule__SimpleTypeSpec__Group_8__1 : rule__SimpleTypeSpec__Group_8__1__Impl rule__SimpleTypeSpec__Group_8__2 ;
    public final void rule__SimpleTypeSpec__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3794:1: ( rule__SimpleTypeSpec__Group_8__1__Impl rule__SimpleTypeSpec__Group_8__2 )
            // InternalSimpleIDL.g:3795:2: rule__SimpleTypeSpec__Group_8__1__Impl rule__SimpleTypeSpec__Group_8__2
            {
            pushFollow(FOLLOW_38);
            rule__SimpleTypeSpec__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_8__1"


    // $ANTLR start "rule__SimpleTypeSpec__Group_8__1__Impl"
    // InternalSimpleIDL.g:3802:1: rule__SimpleTypeSpec__Group_8__1__Impl : ( 'long' ) ;
    public final void rule__SimpleTypeSpec__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3806:1: ( ( 'long' ) )
            // InternalSimpleIDL.g:3807:1: ( 'long' )
            {
            // InternalSimpleIDL.g:3807:1: ( 'long' )
            // InternalSimpleIDL.g:3808:2: 'long'
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_8_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_8__1__Impl"


    // $ANTLR start "rule__SimpleTypeSpec__Group_8__2"
    // InternalSimpleIDL.g:3817:1: rule__SimpleTypeSpec__Group_8__2 : rule__SimpleTypeSpec__Group_8__2__Impl ;
    public final void rule__SimpleTypeSpec__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3821:1: ( rule__SimpleTypeSpec__Group_8__2__Impl )
            // InternalSimpleIDL.g:3822:2: rule__SimpleTypeSpec__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Group_8__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_8__2"


    // $ANTLR start "rule__SimpleTypeSpec__Group_8__2__Impl"
    // InternalSimpleIDL.g:3828:1: rule__SimpleTypeSpec__Group_8__2__Impl : ( 'double' ) ;
    public final void rule__SimpleTypeSpec__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3832:1: ( ( 'double' ) )
            // InternalSimpleIDL.g:3833:1: ( 'double' )
            {
            // InternalSimpleIDL.g:3833:1: ( 'double' )
            // InternalSimpleIDL.g:3834:2: 'double'
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getDoubleKeyword_8_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSimpleTypeSpecAccess().getDoubleKeyword_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_8__2__Impl"


    // $ANTLR start "rule__SimpleTypeSpec__Group_9__0"
    // InternalSimpleIDL.g:3844:1: rule__SimpleTypeSpec__Group_9__0 : rule__SimpleTypeSpec__Group_9__0__Impl rule__SimpleTypeSpec__Group_9__1 ;
    public final void rule__SimpleTypeSpec__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3848:1: ( rule__SimpleTypeSpec__Group_9__0__Impl rule__SimpleTypeSpec__Group_9__1 )
            // InternalSimpleIDL.g:3849:2: rule__SimpleTypeSpec__Group_9__0__Impl rule__SimpleTypeSpec__Group_9__1
            {
            pushFollow(FOLLOW_39);
            rule__SimpleTypeSpec__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_9__0"


    // $ANTLR start "rule__SimpleTypeSpec__Group_9__0__Impl"
    // InternalSimpleIDL.g:3856:1: rule__SimpleTypeSpec__Group_9__0__Impl : ( () ) ;
    public final void rule__SimpleTypeSpec__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3860:1: ( ( () ) )
            // InternalSimpleIDL.g:3861:1: ( () )
            {
            // InternalSimpleIDL.g:3861:1: ( () )
            // InternalSimpleIDL.g:3862:2: ()
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getCharTypeAction_9_0()); 
            // InternalSimpleIDL.g:3863:2: ()
            // InternalSimpleIDL.g:3863:3: 
            {
            }

             after(grammarAccess.getSimpleTypeSpecAccess().getCharTypeAction_9_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_9__0__Impl"


    // $ANTLR start "rule__SimpleTypeSpec__Group_9__1"
    // InternalSimpleIDL.g:3871:1: rule__SimpleTypeSpec__Group_9__1 : rule__SimpleTypeSpec__Group_9__1__Impl ;
    public final void rule__SimpleTypeSpec__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3875:1: ( rule__SimpleTypeSpec__Group_9__1__Impl )
            // InternalSimpleIDL.g:3876:2: rule__SimpleTypeSpec__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_9__1"


    // $ANTLR start "rule__SimpleTypeSpec__Group_9__1__Impl"
    // InternalSimpleIDL.g:3882:1: rule__SimpleTypeSpec__Group_9__1__Impl : ( 'char' ) ;
    public final void rule__SimpleTypeSpec__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3886:1: ( ( 'char' ) )
            // InternalSimpleIDL.g:3887:1: ( 'char' )
            {
            // InternalSimpleIDL.g:3887:1: ( 'char' )
            // InternalSimpleIDL.g:3888:2: 'char'
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getCharKeyword_9_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSimpleTypeSpecAccess().getCharKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_9__1__Impl"


    // $ANTLR start "rule__SimpleTypeSpec__Group_10__0"
    // InternalSimpleIDL.g:3898:1: rule__SimpleTypeSpec__Group_10__0 : rule__SimpleTypeSpec__Group_10__0__Impl rule__SimpleTypeSpec__Group_10__1 ;
    public final void rule__SimpleTypeSpec__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3902:1: ( rule__SimpleTypeSpec__Group_10__0__Impl rule__SimpleTypeSpec__Group_10__1 )
            // InternalSimpleIDL.g:3903:2: rule__SimpleTypeSpec__Group_10__0__Impl rule__SimpleTypeSpec__Group_10__1
            {
            pushFollow(FOLLOW_40);
            rule__SimpleTypeSpec__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_10__0"


    // $ANTLR start "rule__SimpleTypeSpec__Group_10__0__Impl"
    // InternalSimpleIDL.g:3910:1: rule__SimpleTypeSpec__Group_10__0__Impl : ( () ) ;
    public final void rule__SimpleTypeSpec__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3914:1: ( ( () ) )
            // InternalSimpleIDL.g:3915:1: ( () )
            {
            // InternalSimpleIDL.g:3915:1: ( () )
            // InternalSimpleIDL.g:3916:2: ()
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getWideCharTypeAction_10_0()); 
            // InternalSimpleIDL.g:3917:2: ()
            // InternalSimpleIDL.g:3917:3: 
            {
            }

             after(grammarAccess.getSimpleTypeSpecAccess().getWideCharTypeAction_10_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_10__0__Impl"


    // $ANTLR start "rule__SimpleTypeSpec__Group_10__1"
    // InternalSimpleIDL.g:3925:1: rule__SimpleTypeSpec__Group_10__1 : rule__SimpleTypeSpec__Group_10__1__Impl ;
    public final void rule__SimpleTypeSpec__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3929:1: ( rule__SimpleTypeSpec__Group_10__1__Impl )
            // InternalSimpleIDL.g:3930:2: rule__SimpleTypeSpec__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_10__1"


    // $ANTLR start "rule__SimpleTypeSpec__Group_10__1__Impl"
    // InternalSimpleIDL.g:3936:1: rule__SimpleTypeSpec__Group_10__1__Impl : ( 'wchar' ) ;
    public final void rule__SimpleTypeSpec__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3940:1: ( ( 'wchar' ) )
            // InternalSimpleIDL.g:3941:1: ( 'wchar' )
            {
            // InternalSimpleIDL.g:3941:1: ( 'wchar' )
            // InternalSimpleIDL.g:3942:2: 'wchar'
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getWcharKeyword_10_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSimpleTypeSpecAccess().getWcharKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_10__1__Impl"


    // $ANTLR start "rule__SimpleTypeSpec__Group_11__0"
    // InternalSimpleIDL.g:3952:1: rule__SimpleTypeSpec__Group_11__0 : rule__SimpleTypeSpec__Group_11__0__Impl rule__SimpleTypeSpec__Group_11__1 ;
    public final void rule__SimpleTypeSpec__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3956:1: ( rule__SimpleTypeSpec__Group_11__0__Impl rule__SimpleTypeSpec__Group_11__1 )
            // InternalSimpleIDL.g:3957:2: rule__SimpleTypeSpec__Group_11__0__Impl rule__SimpleTypeSpec__Group_11__1
            {
            pushFollow(FOLLOW_41);
            rule__SimpleTypeSpec__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_11__0"


    // $ANTLR start "rule__SimpleTypeSpec__Group_11__0__Impl"
    // InternalSimpleIDL.g:3964:1: rule__SimpleTypeSpec__Group_11__0__Impl : ( () ) ;
    public final void rule__SimpleTypeSpec__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3968:1: ( ( () ) )
            // InternalSimpleIDL.g:3969:1: ( () )
            {
            // InternalSimpleIDL.g:3969:1: ( () )
            // InternalSimpleIDL.g:3970:2: ()
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getBooleanTypeAction_11_0()); 
            // InternalSimpleIDL.g:3971:2: ()
            // InternalSimpleIDL.g:3971:3: 
            {
            }

             after(grammarAccess.getSimpleTypeSpecAccess().getBooleanTypeAction_11_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_11__0__Impl"


    // $ANTLR start "rule__SimpleTypeSpec__Group_11__1"
    // InternalSimpleIDL.g:3979:1: rule__SimpleTypeSpec__Group_11__1 : rule__SimpleTypeSpec__Group_11__1__Impl ;
    public final void rule__SimpleTypeSpec__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3983:1: ( rule__SimpleTypeSpec__Group_11__1__Impl )
            // InternalSimpleIDL.g:3984:2: rule__SimpleTypeSpec__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_11__1"


    // $ANTLR start "rule__SimpleTypeSpec__Group_11__1__Impl"
    // InternalSimpleIDL.g:3990:1: rule__SimpleTypeSpec__Group_11__1__Impl : ( 'boolean' ) ;
    public final void rule__SimpleTypeSpec__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3994:1: ( ( 'boolean' ) )
            // InternalSimpleIDL.g:3995:1: ( 'boolean' )
            {
            // InternalSimpleIDL.g:3995:1: ( 'boolean' )
            // InternalSimpleIDL.g:3996:2: 'boolean'
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getBooleanKeyword_11_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSimpleTypeSpecAccess().getBooleanKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_11__1__Impl"


    // $ANTLR start "rule__SimpleTypeSpec__Group_12__0"
    // InternalSimpleIDL.g:4006:1: rule__SimpleTypeSpec__Group_12__0 : rule__SimpleTypeSpec__Group_12__0__Impl rule__SimpleTypeSpec__Group_12__1 ;
    public final void rule__SimpleTypeSpec__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4010:1: ( rule__SimpleTypeSpec__Group_12__0__Impl rule__SimpleTypeSpec__Group_12__1 )
            // InternalSimpleIDL.g:4011:2: rule__SimpleTypeSpec__Group_12__0__Impl rule__SimpleTypeSpec__Group_12__1
            {
            pushFollow(FOLLOW_42);
            rule__SimpleTypeSpec__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_12__0"


    // $ANTLR start "rule__SimpleTypeSpec__Group_12__0__Impl"
    // InternalSimpleIDL.g:4018:1: rule__SimpleTypeSpec__Group_12__0__Impl : ( () ) ;
    public final void rule__SimpleTypeSpec__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4022:1: ( ( () ) )
            // InternalSimpleIDL.g:4023:1: ( () )
            {
            // InternalSimpleIDL.g:4023:1: ( () )
            // InternalSimpleIDL.g:4024:2: ()
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getOctetTypeAction_12_0()); 
            // InternalSimpleIDL.g:4025:2: ()
            // InternalSimpleIDL.g:4025:3: 
            {
            }

             after(grammarAccess.getSimpleTypeSpecAccess().getOctetTypeAction_12_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_12__0__Impl"


    // $ANTLR start "rule__SimpleTypeSpec__Group_12__1"
    // InternalSimpleIDL.g:4033:1: rule__SimpleTypeSpec__Group_12__1 : rule__SimpleTypeSpec__Group_12__1__Impl ;
    public final void rule__SimpleTypeSpec__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4037:1: ( rule__SimpleTypeSpec__Group_12__1__Impl )
            // InternalSimpleIDL.g:4038:2: rule__SimpleTypeSpec__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_12__1"


    // $ANTLR start "rule__SimpleTypeSpec__Group_12__1__Impl"
    // InternalSimpleIDL.g:4044:1: rule__SimpleTypeSpec__Group_12__1__Impl : ( 'octet' ) ;
    public final void rule__SimpleTypeSpec__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4048:1: ( ( 'octet' ) )
            // InternalSimpleIDL.g:4049:1: ( 'octet' )
            {
            // InternalSimpleIDL.g:4049:1: ( 'octet' )
            // InternalSimpleIDL.g:4050:2: 'octet'
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getOctetKeyword_12_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSimpleTypeSpecAccess().getOctetKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_12__1__Impl"


    // $ANTLR start "rule__SimpleTypeSpec__Group_13__0"
    // InternalSimpleIDL.g:4060:1: rule__SimpleTypeSpec__Group_13__0 : rule__SimpleTypeSpec__Group_13__0__Impl rule__SimpleTypeSpec__Group_13__1 ;
    public final void rule__SimpleTypeSpec__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4064:1: ( rule__SimpleTypeSpec__Group_13__0__Impl rule__SimpleTypeSpec__Group_13__1 )
            // InternalSimpleIDL.g:4065:2: rule__SimpleTypeSpec__Group_13__0__Impl rule__SimpleTypeSpec__Group_13__1
            {
            pushFollow(FOLLOW_11);
            rule__SimpleTypeSpec__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_13__0"


    // $ANTLR start "rule__SimpleTypeSpec__Group_13__0__Impl"
    // InternalSimpleIDL.g:4072:1: rule__SimpleTypeSpec__Group_13__0__Impl : ( () ) ;
    public final void rule__SimpleTypeSpec__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4076:1: ( ( () ) )
            // InternalSimpleIDL.g:4077:1: ( () )
            {
            // InternalSimpleIDL.g:4077:1: ( () )
            // InternalSimpleIDL.g:4078:2: ()
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getReferencedTypeAction_13_0()); 
            // InternalSimpleIDL.g:4079:2: ()
            // InternalSimpleIDL.g:4079:3: 
            {
            }

             after(grammarAccess.getSimpleTypeSpecAccess().getReferencedTypeAction_13_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_13__0__Impl"


    // $ANTLR start "rule__SimpleTypeSpec__Group_13__1"
    // InternalSimpleIDL.g:4087:1: rule__SimpleTypeSpec__Group_13__1 : rule__SimpleTypeSpec__Group_13__1__Impl ;
    public final void rule__SimpleTypeSpec__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4091:1: ( rule__SimpleTypeSpec__Group_13__1__Impl )
            // InternalSimpleIDL.g:4092:2: rule__SimpleTypeSpec__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_13__1"


    // $ANTLR start "rule__SimpleTypeSpec__Group_13__1__Impl"
    // InternalSimpleIDL.g:4098:1: rule__SimpleTypeSpec__Group_13__1__Impl : ( ( rule__SimpleTypeSpec__TypeAssignment_13_1 ) ) ;
    public final void rule__SimpleTypeSpec__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4102:1: ( ( ( rule__SimpleTypeSpec__TypeAssignment_13_1 ) ) )
            // InternalSimpleIDL.g:4103:1: ( ( rule__SimpleTypeSpec__TypeAssignment_13_1 ) )
            {
            // InternalSimpleIDL.g:4103:1: ( ( rule__SimpleTypeSpec__TypeAssignment_13_1 ) )
            // InternalSimpleIDL.g:4104:2: ( rule__SimpleTypeSpec__TypeAssignment_13_1 )
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getTypeAssignment_13_1()); 
            // InternalSimpleIDL.g:4105:2: ( rule__SimpleTypeSpec__TypeAssignment_13_1 )
            // InternalSimpleIDL.g:4105:3: rule__SimpleTypeSpec__TypeAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleTypeSpec__TypeAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypeSpecAccess().getTypeAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__Group_13__1__Impl"


    // $ANTLR start "rule__ScopedName__Group__0"
    // InternalSimpleIDL.g:4114:1: rule__ScopedName__Group__0 : rule__ScopedName__Group__0__Impl rule__ScopedName__Group__1 ;
    public final void rule__ScopedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4118:1: ( rule__ScopedName__Group__0__Impl rule__ScopedName__Group__1 )
            // InternalSimpleIDL.g:4119:2: rule__ScopedName__Group__0__Impl rule__ScopedName__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ScopedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScopedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopedName__Group__0"


    // $ANTLR start "rule__ScopedName__Group__0__Impl"
    // InternalSimpleIDL.g:4126:1: rule__ScopedName__Group__0__Impl : ( ( '::' )? ) ;
    public final void rule__ScopedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4130:1: ( ( ( '::' )? ) )
            // InternalSimpleIDL.g:4131:1: ( ( '::' )? )
            {
            // InternalSimpleIDL.g:4131:1: ( ( '::' )? )
            // InternalSimpleIDL.g:4132:2: ( '::' )?
            {
             before(grammarAccess.getScopedNameAccess().getColonColonKeyword_0()); 
            // InternalSimpleIDL.g:4133:2: ( '::' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==43) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSimpleIDL.g:4133:3: '::'
                    {
                    match(input,43,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getScopedNameAccess().getColonColonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopedName__Group__0__Impl"


    // $ANTLR start "rule__ScopedName__Group__1"
    // InternalSimpleIDL.g:4141:1: rule__ScopedName__Group__1 : rule__ScopedName__Group__1__Impl rule__ScopedName__Group__2 ;
    public final void rule__ScopedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4145:1: ( rule__ScopedName__Group__1__Impl rule__ScopedName__Group__2 )
            // InternalSimpleIDL.g:4146:2: rule__ScopedName__Group__1__Impl rule__ScopedName__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ScopedName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScopedName__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopedName__Group__1"


    // $ANTLR start "rule__ScopedName__Group__1__Impl"
    // InternalSimpleIDL.g:4153:1: rule__ScopedName__Group__1__Impl : ( ( rule__ScopedName__Group_1__0 )* ) ;
    public final void rule__ScopedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4157:1: ( ( ( rule__ScopedName__Group_1__0 )* ) )
            // InternalSimpleIDL.g:4158:1: ( ( rule__ScopedName__Group_1__0 )* )
            {
            // InternalSimpleIDL.g:4158:1: ( ( rule__ScopedName__Group_1__0 )* )
            // InternalSimpleIDL.g:4159:2: ( rule__ScopedName__Group_1__0 )*
            {
             before(grammarAccess.getScopedNameAccess().getGroup_1()); 
            // InternalSimpleIDL.g:4160:2: ( rule__ScopedName__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==43) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalSimpleIDL.g:4160:3: rule__ScopedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__ScopedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getScopedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopedName__Group__1__Impl"


    // $ANTLR start "rule__ScopedName__Group__2"
    // InternalSimpleIDL.g:4168:1: rule__ScopedName__Group__2 : rule__ScopedName__Group__2__Impl ;
    public final void rule__ScopedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4172:1: ( rule__ScopedName__Group__2__Impl )
            // InternalSimpleIDL.g:4173:2: rule__ScopedName__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScopedName__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopedName__Group__2"


    // $ANTLR start "rule__ScopedName__Group__2__Impl"
    // InternalSimpleIDL.g:4179:1: rule__ScopedName__Group__2__Impl : ( RULE_ID ) ;
    public final void rule__ScopedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4183:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4184:1: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4184:1: ( RULE_ID )
            // InternalSimpleIDL.g:4185:2: RULE_ID
            {
             before(grammarAccess.getScopedNameAccess().getIDTerminalRuleCall_2()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getScopedNameAccess().getIDTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopedName__Group__2__Impl"


    // $ANTLR start "rule__ScopedName__Group_1__0"
    // InternalSimpleIDL.g:4195:1: rule__ScopedName__Group_1__0 : rule__ScopedName__Group_1__0__Impl rule__ScopedName__Group_1__1 ;
    public final void rule__ScopedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4199:1: ( rule__ScopedName__Group_1__0__Impl rule__ScopedName__Group_1__1 )
            // InternalSimpleIDL.g:4200:2: rule__ScopedName__Group_1__0__Impl rule__ScopedName__Group_1__1
            {
            pushFollow(FOLLOW_44);
            rule__ScopedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScopedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopedName__Group_1__0"


    // $ANTLR start "rule__ScopedName__Group_1__0__Impl"
    // InternalSimpleIDL.g:4207:1: rule__ScopedName__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__ScopedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4211:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4212:1: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4212:1: ( RULE_ID )
            // InternalSimpleIDL.g:4213:2: RULE_ID
            {
             before(grammarAccess.getScopedNameAccess().getIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getScopedNameAccess().getIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopedName__Group_1__0__Impl"


    // $ANTLR start "rule__ScopedName__Group_1__1"
    // InternalSimpleIDL.g:4222:1: rule__ScopedName__Group_1__1 : rule__ScopedName__Group_1__1__Impl ;
    public final void rule__ScopedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4226:1: ( rule__ScopedName__Group_1__1__Impl )
            // InternalSimpleIDL.g:4227:2: rule__ScopedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScopedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopedName__Group_1__1"


    // $ANTLR start "rule__ScopedName__Group_1__1__Impl"
    // InternalSimpleIDL.g:4233:1: rule__ScopedName__Group_1__1__Impl : ( '::' ) ;
    public final void rule__ScopedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4237:1: ( ( '::' ) )
            // InternalSimpleIDL.g:4238:1: ( '::' )
            {
            // InternalSimpleIDL.g:4238:1: ( '::' )
            // InternalSimpleIDL.g:4239:2: '::'
            {
             before(grammarAccess.getScopedNameAccess().getColonColonKeyword_1_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getScopedNameAccess().getColonColonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopedName__Group_1__1__Impl"


    // $ANTLR start "rule__Specification__DefinitionsAssignment"
    // InternalSimpleIDL.g:4249:1: rule__Specification__DefinitionsAssignment : ( ruleDefinition ) ;
    public final void rule__Specification__DefinitionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4253:1: ( ( ruleDefinition ) )
            // InternalSimpleIDL.g:4254:2: ( ruleDefinition )
            {
            // InternalSimpleIDL.g:4254:2: ( ruleDefinition )
            // InternalSimpleIDL.g:4255:3: ruleDefinition
            {
             before(grammarAccess.getSpecificationAccess().getDefinitionsDefinitionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getSpecificationAccess().getDefinitionsDefinitionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__DefinitionsAssignment"


    // $ANTLR start "rule__Definition__NameAssignment_0_2"
    // InternalSimpleIDL.g:4264:1: rule__Definition__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4268:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4269:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4269:2: ( RULE_ID )
            // InternalSimpleIDL.g:4270:3: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__NameAssignment_0_2"


    // $ANTLR start "rule__Definition__DefinitionsAssignment_0_4"
    // InternalSimpleIDL.g:4279:1: rule__Definition__DefinitionsAssignment_0_4 : ( ruleDefinition ) ;
    public final void rule__Definition__DefinitionsAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4283:1: ( ( ruleDefinition ) )
            // InternalSimpleIDL.g:4284:2: ( ruleDefinition )
            {
            // InternalSimpleIDL.g:4284:2: ( ruleDefinition )
            // InternalSimpleIDL.g:4285:3: ruleDefinition
            {
             before(grammarAccess.getDefinitionAccess().getDefinitionsDefinitionParserRuleCall_0_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getDefinitionsDefinitionParserRuleCall_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__DefinitionsAssignment_0_4"


    // $ANTLR start "rule__Definition__NameAssignment_1_2"
    // InternalSimpleIDL.g:4294:1: rule__Definition__NameAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4298:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4299:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4299:2: ( RULE_ID )
            // InternalSimpleIDL.g:4300:3: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__NameAssignment_1_2"


    // $ANTLR start "rule__Definition__MembersAssignment_1_4"
    // InternalSimpleIDL.g:4309:1: rule__Definition__MembersAssignment_1_4 : ( ruleMember ) ;
    public final void rule__Definition__MembersAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4313:1: ( ( ruleMember ) )
            // InternalSimpleIDL.g:4314:2: ( ruleMember )
            {
            // InternalSimpleIDL.g:4314:2: ( ruleMember )
            // InternalSimpleIDL.g:4315:3: ruleMember
            {
             before(grammarAccess.getDefinitionAccess().getMembersMemberParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getMembersMemberParserRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__MembersAssignment_1_4"


    // $ANTLR start "rule__Definition__StructAssignment_2_2"
    // InternalSimpleIDL.g:4324:1: rule__Definition__StructAssignment_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__Definition__StructAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4328:1: ( ( ( RULE_ID ) ) )
            // InternalSimpleIDL.g:4329:2: ( ( RULE_ID ) )
            {
            // InternalSimpleIDL.g:4329:2: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4330:3: ( RULE_ID )
            {
             before(grammarAccess.getDefinitionAccess().getStructStructCrossReference_2_2_0()); 
            // InternalSimpleIDL.g:4331:3: ( RULE_ID )
            // InternalSimpleIDL.g:4332:4: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getStructStructIDTerminalRuleCall_2_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getStructStructIDTerminalRuleCall_2_2_0_1()); 

            }

             after(grammarAccess.getDefinitionAccess().getStructStructCrossReference_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__StructAssignment_2_2"


    // $ANTLR start "rule__Definition__NameAssignment_3_2"
    // InternalSimpleIDL.g:4343:1: rule__Definition__NameAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4347:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4348:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4348:2: ( RULE_ID )
            // InternalSimpleIDL.g:4349:3: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_3_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__NameAssignment_3_2"


    // $ANTLR start "rule__Definition__CasesAssignment_3_10"
    // InternalSimpleIDL.g:4358:1: rule__Definition__CasesAssignment_3_10 : ( ruleCase ) ;
    public final void rule__Definition__CasesAssignment_3_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4362:1: ( ( ruleCase ) )
            // InternalSimpleIDL.g:4363:2: ( ruleCase )
            {
            // InternalSimpleIDL.g:4363:2: ( ruleCase )
            // InternalSimpleIDL.g:4364:3: ruleCase
            {
             before(grammarAccess.getDefinitionAccess().getCasesCaseParserRuleCall_3_10_0()); 
            pushFollow(FOLLOW_2);
            ruleCase();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getCasesCaseParserRuleCall_3_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__CasesAssignment_3_10"


    // $ANTLR start "rule__Definition__NameAssignment_4_2"
    // InternalSimpleIDL.g:4373:1: rule__Definition__NameAssignment_4_2 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4377:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4378:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4378:2: ( RULE_ID )
            // InternalSimpleIDL.g:4379:3: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_4_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__NameAssignment_4_2"


    // $ANTLR start "rule__Definition__LiteralsAssignment_4_4"
    // InternalSimpleIDL.g:4388:1: rule__Definition__LiteralsAssignment_4_4 : ( RULE_ID ) ;
    public final void rule__Definition__LiteralsAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4392:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4393:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4393:2: ( RULE_ID )
            // InternalSimpleIDL.g:4394:3: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getLiteralsIDTerminalRuleCall_4_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getLiteralsIDTerminalRuleCall_4_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__LiteralsAssignment_4_4"


    // $ANTLR start "rule__Definition__LiteralsAssignment_4_5_1"
    // InternalSimpleIDL.g:4403:1: rule__Definition__LiteralsAssignment_4_5_1 : ( RULE_ID ) ;
    public final void rule__Definition__LiteralsAssignment_4_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4407:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4408:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4408:2: ( RULE_ID )
            // InternalSimpleIDL.g:4409:3: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getLiteralsIDTerminalRuleCall_4_5_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getLiteralsIDTerminalRuleCall_4_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__LiteralsAssignment_4_5_1"


    // $ANTLR start "rule__Definition__TypeAssignment_5_2"
    // InternalSimpleIDL.g:4418:1: rule__Definition__TypeAssignment_5_2 : ( ruleType ) ;
    public final void rule__Definition__TypeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4422:1: ( ( ruleType ) )
            // InternalSimpleIDL.g:4423:2: ( ruleType )
            {
            // InternalSimpleIDL.g:4423:2: ( ruleType )
            // InternalSimpleIDL.g:4424:3: ruleType
            {
             before(grammarAccess.getDefinitionAccess().getTypeTypeParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getTypeTypeParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__TypeAssignment_5_2"


    // $ANTLR start "rule__Definition__NamesAssignment_5_3"
    // InternalSimpleIDL.g:4433:1: rule__Definition__NamesAssignment_5_3 : ( ruleAnyDeclarator ) ;
    public final void rule__Definition__NamesAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4437:1: ( ( ruleAnyDeclarator ) )
            // InternalSimpleIDL.g:4438:2: ( ruleAnyDeclarator )
            {
            // InternalSimpleIDL.g:4438:2: ( ruleAnyDeclarator )
            // InternalSimpleIDL.g:4439:3: ruleAnyDeclarator
            {
             before(grammarAccess.getDefinitionAccess().getNamesAnyDeclaratorParserRuleCall_5_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAnyDeclarator();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getNamesAnyDeclaratorParserRuleCall_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__NamesAssignment_5_3"


    // $ANTLR start "rule__Definition__NamesAssignment_5_4_1"
    // InternalSimpleIDL.g:4448:1: rule__Definition__NamesAssignment_5_4_1 : ( ruleAnyDeclarator ) ;
    public final void rule__Definition__NamesAssignment_5_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4452:1: ( ( ruleAnyDeclarator ) )
            // InternalSimpleIDL.g:4453:2: ( ruleAnyDeclarator )
            {
            // InternalSimpleIDL.g:4453:2: ( ruleAnyDeclarator )
            // InternalSimpleIDL.g:4454:3: ruleAnyDeclarator
            {
             before(grammarAccess.getDefinitionAccess().getNamesAnyDeclaratorParserRuleCall_5_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnyDeclarator();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getNamesAnyDeclaratorParserRuleCall_5_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__NamesAssignment_5_4_1"


    // $ANTLR start "rule__Member__TypeAssignment_0"
    // InternalSimpleIDL.g:4463:1: rule__Member__TypeAssignment_0 : ( ruleSimpleTypeSpec ) ;
    public final void rule__Member__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4467:1: ( ( ruleSimpleTypeSpec ) )
            // InternalSimpleIDL.g:4468:2: ( ruleSimpleTypeSpec )
            {
            // InternalSimpleIDL.g:4468:2: ( ruleSimpleTypeSpec )
            // InternalSimpleIDL.g:4469:3: ruleSimpleTypeSpec
            {
             before(grammarAccess.getMemberAccess().getTypeSimpleTypeSpecParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleTypeSpec();

            state._fsp--;

             after(grammarAccess.getMemberAccess().getTypeSimpleTypeSpecParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__TypeAssignment_0"


    // $ANTLR start "rule__Member__NameAssignment_1"
    // InternalSimpleIDL.g:4478:1: rule__Member__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Member__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4482:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4483:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4483:2: ( RULE_ID )
            // InternalSimpleIDL.g:4484:3: RULE_ID
            {
             before(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__NameAssignment_1"


    // $ANTLR start "rule__Case__LabelsAssignment_0_1"
    // InternalSimpleIDL.g:4493:1: rule__Case__LabelsAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Case__LabelsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4497:1: ( ( RULE_INT ) )
            // InternalSimpleIDL.g:4498:2: ( RULE_INT )
            {
            // InternalSimpleIDL.g:4498:2: ( RULE_INT )
            // InternalSimpleIDL.g:4499:3: RULE_INT
            {
             before(grammarAccess.getCaseAccess().getLabelsINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCaseAccess().getLabelsINTTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__LabelsAssignment_0_1"


    // $ANTLR start "rule__Case__TypeAssignment_1"
    // InternalSimpleIDL.g:4508:1: rule__Case__TypeAssignment_1 : ( ruleSimpleTypeSpec ) ;
    public final void rule__Case__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4512:1: ( ( ruleSimpleTypeSpec ) )
            // InternalSimpleIDL.g:4513:2: ( ruleSimpleTypeSpec )
            {
            // InternalSimpleIDL.g:4513:2: ( ruleSimpleTypeSpec )
            // InternalSimpleIDL.g:4514:3: ruleSimpleTypeSpec
            {
             before(grammarAccess.getCaseAccess().getTypeSimpleTypeSpecParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleTypeSpec();

            state._fsp--;

             after(grammarAccess.getCaseAccess().getTypeSimpleTypeSpecParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__TypeAssignment_1"


    // $ANTLR start "rule__Case__NameAssignment_2"
    // InternalSimpleIDL.g:4523:1: rule__Case__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Case__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4527:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4528:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4528:2: ( RULE_ID )
            // InternalSimpleIDL.g:4529:3: RULE_ID
            {
             before(grammarAccess.getCaseAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCaseAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__NameAssignment_2"


    // $ANTLR start "rule__AnyDeclarator__NameAssignment_0"
    // InternalSimpleIDL.g:4538:1: rule__AnyDeclarator__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__AnyDeclarator__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4542:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4543:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4543:2: ( RULE_ID )
            // InternalSimpleIDL.g:4544:3: RULE_ID
            {
             before(grammarAccess.getAnyDeclaratorAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAnyDeclaratorAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyDeclarator__NameAssignment_0"


    // $ANTLR start "rule__AnyDeclarator__ArraySizeAssignment_1"
    // InternalSimpleIDL.g:4553:1: rule__AnyDeclarator__ArraySizeAssignment_1 : ( ruleFixedArraySize ) ;
    public final void rule__AnyDeclarator__ArraySizeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4557:1: ( ( ruleFixedArraySize ) )
            // InternalSimpleIDL.g:4558:2: ( ruleFixedArraySize )
            {
            // InternalSimpleIDL.g:4558:2: ( ruleFixedArraySize )
            // InternalSimpleIDL.g:4559:3: ruleFixedArraySize
            {
             before(grammarAccess.getAnyDeclaratorAccess().getArraySizeFixedArraySizeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFixedArraySize();

            state._fsp--;

             after(grammarAccess.getAnyDeclaratorAccess().getArraySizeFixedArraySizeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyDeclarator__ArraySizeAssignment_1"


    // $ANTLR start "rule__FixedArraySize__SizeAssignment_1"
    // InternalSimpleIDL.g:4568:1: rule__FixedArraySize__SizeAssignment_1 : ( RULE_INT ) ;
    public final void rule__FixedArraySize__SizeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4572:1: ( ( RULE_INT ) )
            // InternalSimpleIDL.g:4573:2: ( RULE_INT )
            {
            // InternalSimpleIDL.g:4573:2: ( RULE_INT )
            // InternalSimpleIDL.g:4574:3: RULE_INT
            {
             before(grammarAccess.getFixedArraySizeAccess().getSizeINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFixedArraySizeAccess().getSizeINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedArraySize__SizeAssignment_1"


    // $ANTLR start "rule__Type__TypeAssignment_1_3"
    // InternalSimpleIDL.g:4583:1: rule__Type__TypeAssignment_1_3 : ( ruleSimpleTypeSpec ) ;
    public final void rule__Type__TypeAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4587:1: ( ( ruleSimpleTypeSpec ) )
            // InternalSimpleIDL.g:4588:2: ( ruleSimpleTypeSpec )
            {
            // InternalSimpleIDL.g:4588:2: ( ruleSimpleTypeSpec )
            // InternalSimpleIDL.g:4589:3: ruleSimpleTypeSpec
            {
             before(grammarAccess.getTypeAccess().getTypeSimpleTypeSpecParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleTypeSpec();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getTypeSimpleTypeSpecParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TypeAssignment_1_3"


    // $ANTLR start "rule__Type__SizeAssignment_1_5"
    // InternalSimpleIDL.g:4598:1: rule__Type__SizeAssignment_1_5 : ( RULE_INT ) ;
    public final void rule__Type__SizeAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4602:1: ( ( RULE_INT ) )
            // InternalSimpleIDL.g:4603:2: ( RULE_INT )
            {
            // InternalSimpleIDL.g:4603:2: ( RULE_INT )
            // InternalSimpleIDL.g:4604:3: RULE_INT
            {
             before(grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_1_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_1_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__SizeAssignment_1_5"


    // $ANTLR start "rule__Type__TypeAssignment_2_3"
    // InternalSimpleIDL.g:4613:1: rule__Type__TypeAssignment_2_3 : ( ruleSimpleTypeSpec ) ;
    public final void rule__Type__TypeAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4617:1: ( ( ruleSimpleTypeSpec ) )
            // InternalSimpleIDL.g:4618:2: ( ruleSimpleTypeSpec )
            {
            // InternalSimpleIDL.g:4618:2: ( ruleSimpleTypeSpec )
            // InternalSimpleIDL.g:4619:3: ruleSimpleTypeSpec
            {
             before(grammarAccess.getTypeAccess().getTypeSimpleTypeSpecParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleTypeSpec();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getTypeSimpleTypeSpecParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TypeAssignment_2_3"


    // $ANTLR start "rule__Type__SizeAssignment_3_3"
    // InternalSimpleIDL.g:4628:1: rule__Type__SizeAssignment_3_3 : ( RULE_INT ) ;
    public final void rule__Type__SizeAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4632:1: ( ( RULE_INT ) )
            // InternalSimpleIDL.g:4633:2: ( RULE_INT )
            {
            // InternalSimpleIDL.g:4633:2: ( RULE_INT )
            // InternalSimpleIDL.g:4634:3: RULE_INT
            {
             before(grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_3_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__SizeAssignment_3_3"


    // $ANTLR start "rule__Type__SizeAssignment_5_3"
    // InternalSimpleIDL.g:4643:1: rule__Type__SizeAssignment_5_3 : ( RULE_INT ) ;
    public final void rule__Type__SizeAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4647:1: ( ( RULE_INT ) )
            // InternalSimpleIDL.g:4648:2: ( RULE_INT )
            {
            // InternalSimpleIDL.g:4648:2: ( RULE_INT )
            // InternalSimpleIDL.g:4649:3: RULE_INT
            {
             before(grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_5_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__SizeAssignment_5_3"


    // $ANTLR start "rule__Type__TotalDigitsAssignment_7_3"
    // InternalSimpleIDL.g:4658:1: rule__Type__TotalDigitsAssignment_7_3 : ( RULE_INT ) ;
    public final void rule__Type__TotalDigitsAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4662:1: ( ( RULE_INT ) )
            // InternalSimpleIDL.g:4663:2: ( RULE_INT )
            {
            // InternalSimpleIDL.g:4663:2: ( RULE_INT )
            // InternalSimpleIDL.g:4664:3: RULE_INT
            {
             before(grammarAccess.getTypeAccess().getTotalDigitsINTTerminalRuleCall_7_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTotalDigitsINTTerminalRuleCall_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TotalDigitsAssignment_7_3"


    // $ANTLR start "rule__Type__FractionalDigitsAssignment_7_5"
    // InternalSimpleIDL.g:4673:1: rule__Type__FractionalDigitsAssignment_7_5 : ( RULE_INT ) ;
    public final void rule__Type__FractionalDigitsAssignment_7_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4677:1: ( ( RULE_INT ) )
            // InternalSimpleIDL.g:4678:2: ( RULE_INT )
            {
            // InternalSimpleIDL.g:4678:2: ( RULE_INT )
            // InternalSimpleIDL.g:4679:3: RULE_INT
            {
             before(grammarAccess.getTypeAccess().getFractionalDigitsINTTerminalRuleCall_7_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getFractionalDigitsINTTerminalRuleCall_7_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__FractionalDigitsAssignment_7_5"


    // $ANTLR start "rule__SimpleTypeSpec__TypeAssignment_13_1"
    // InternalSimpleIDL.g:4688:1: rule__SimpleTypeSpec__TypeAssignment_13_1 : ( ( ruleScopedName ) ) ;
    public final void rule__SimpleTypeSpec__TypeAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4692:1: ( ( ( ruleScopedName ) ) )
            // InternalSimpleIDL.g:4693:2: ( ( ruleScopedName ) )
            {
            // InternalSimpleIDL.g:4693:2: ( ( ruleScopedName ) )
            // InternalSimpleIDL.g:4694:3: ( ruleScopedName )
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getTypeDefinitionCrossReference_13_1_0()); 
            // InternalSimpleIDL.g:4695:3: ( ruleScopedName )
            // InternalSimpleIDL.g:4696:4: ruleScopedName
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getTypeDefinitionScopedNameParserRuleCall_13_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleScopedName();

            state._fsp--;

             after(grammarAccess.getSimpleTypeSpecAccess().getTypeDefinitionScopedNameParserRuleCall_13_1_0_1()); 

            }

             after(grammarAccess.getSimpleTypeSpecAccess().getTypeDefinitionCrossReference_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeSpec__TypeAssignment_13_1"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\36\uffff";
    static final String dfa_2s = "\3\uffff\1\7\1\11\31\uffff";
    static final String dfa_3s = "\1\4\1\uffff\1\37\2\4\1\uffff\1\4\4\uffff\2\30\1\25\6\30\1\4\1\30\2\uffff\4\30\1\4\1\30";
    static final String dfa_4s = "\1\53\1\uffff\3\37\1\uffff\1\53\4\uffff\1\40\1\46\1\44\6\40\1\4\1\53\2\uffff\3\40\1\44\1\4\1\40";
    static final String dfa_5s = "\1\uffff\1\1\3\uffff\1\10\1\uffff\1\5\1\4\1\7\1\6\13\uffff\1\2\1\3\6\uffff";
    static final String dfa_6s = "\36\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\17\uffff\2\1\10\uffff\1\2\2\uffff\1\3\1\4\1\5\10\1",
            "",
            "\1\6",
            "\1\7\32\uffff\1\10",
            "\1\11\32\uffff\1\12",
            "",
            "\1\25\17\uffff\1\15\1\13\16\uffff\1\14\1\16\1\17\1\20\1\21\1\22\1\23\1\24",
            "",
            "",
            "",
            "",
            "\1\26\7\uffff\1\27",
            "\1\26\7\uffff\1\27\3\uffff\1\31\1\uffff\1\30",
            "\1\32\16\uffff\1\33",
            "\1\26\7\uffff\1\27",
            "\1\26\7\uffff\1\27",
            "\1\26\7\uffff\1\27",
            "\1\26\7\uffff\1\27",
            "\1\26\7\uffff\1\27",
            "\1\26\7\uffff\1\27",
            "\1\25",
            "\1\26\7\uffff\1\27\12\uffff\1\34",
            "",
            "",
            "\1\26\7\uffff\1\27",
            "\1\26\7\uffff\1\27",
            "\1\26\7\uffff\1\27",
            "\1\26\7\uffff\1\27\3\uffff\1\35",
            "\1\25",
            "\1\26\7\uffff\1\27"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "345:1: rule__Type__Alternatives : ( ( ruleSimpleTypeSpec ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) | ( ( rule__Type__Group_3__0 ) ) | ( ( rule__Type__Group_4__0 ) ) | ( ( rule__Type__Group_5__0 ) ) | ( ( rule__Type__Group_6__0 ) ) | ( ( rule__Type__Group_7__0 ) ) );";
        }
    }
    static final String dfa_8s = "\22\uffff";
    static final String dfa_9s = "\2\uffff\1\15\14\uffff\1\20\2\uffff";
    static final String dfa_10s = "\1\4\1\uffff\1\4\1\25\13\uffff\1\4\2\uffff";
    static final String dfa_11s = "\1\53\1\uffff\1\46\1\44\13\uffff\1\44\2\uffff";
    static final String dfa_12s = "\1\uffff\1\1\2\uffff\1\7\1\10\1\12\1\13\1\14\1\15\1\16\1\11\1\3\1\2\1\4\1\uffff\1\5\1\6";
    static final String dfa_13s = "\22\uffff}>";
    static final String[] dfa_14s = {
            "\1\12\17\uffff\1\3\1\1\16\uffff\1\2\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "",
            "\1\15\23\uffff\1\15\7\uffff\1\15\3\uffff\1\14\1\uffff\1\13",
            "\1\16\16\uffff\1\17",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\20\23\uffff\1\20\7\uffff\1\20\3\uffff\1\21",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "402:1: rule__SimpleTypeSpec__Alternatives : ( ( ( rule__SimpleTypeSpec__Group_0__0 ) ) | ( ( rule__SimpleTypeSpec__Group_1__0 ) ) | ( ( rule__SimpleTypeSpec__Group_2__0 ) ) | ( ( rule__SimpleTypeSpec__Group_3__0 ) ) | ( ( rule__SimpleTypeSpec__Group_4__0 ) ) | ( ( rule__SimpleTypeSpec__Group_5__0 ) ) | ( ( rule__SimpleTypeSpec__Group_6__0 ) ) | ( ( rule__SimpleTypeSpec__Group_7__0 ) ) | ( ( rule__SimpleTypeSpec__Group_8__0 ) ) | ( ( rule__SimpleTypeSpec__Group_9__0 ) ) | ( ( rule__SimpleTypeSpec__Group_10__0 ) ) | ( ( rule__SimpleTypeSpec__Group_11__0 ) ) | ( ( rule__SimpleTypeSpec__Group_12__0 ) ) | ( ( rule__SimpleTypeSpec__Group_13__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002831002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002831000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000FF000300010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000FF000300012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000FFE40300010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000080000000000L});

}