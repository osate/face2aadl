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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_PREPROCESSOR", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'{'", "'}'", "';'", "'struct'", "'union'", "'switch'", "'('", "'unsigned'", "'short'", "')'", "'enum'", "','", "'typedef'", "'['", "']'", "'case'", "':'", "'long'", "'float'", "'double'", "'char'", "'wchar'", "'boolean'", "'octet'", "'sequence'", "'<'", "'>'", "'string'", "'wstring'", "'fixed'", "'::'"
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


    // $ANTLR start "entryRuleType"
    // InternalSimpleIDL.g:176:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalSimpleIDL.g:177:1: ( ruleType EOF )
            // InternalSimpleIDL.g:178:1: ruleType EOF
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
    // InternalSimpleIDL.g:185:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:189:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalSimpleIDL.g:190:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalSimpleIDL.g:190:2: ( ( rule__Type__Alternatives ) )
            // InternalSimpleIDL.g:191:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalSimpleIDL.g:192:3: ( rule__Type__Alternatives )
            // InternalSimpleIDL.g:192:4: rule__Type__Alternatives
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


    // $ANTLR start "entryRuleScopedName"
    // InternalSimpleIDL.g:201:1: entryRuleScopedName : ruleScopedName EOF ;
    public final void entryRuleScopedName() throws RecognitionException {
        try {
            // InternalSimpleIDL.g:202:1: ( ruleScopedName EOF )
            // InternalSimpleIDL.g:203:1: ruleScopedName EOF
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
    // InternalSimpleIDL.g:210:1: ruleScopedName : ( ( rule__ScopedName__Group__0 ) ) ;
    public final void ruleScopedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:214:2: ( ( ( rule__ScopedName__Group__0 ) ) )
            // InternalSimpleIDL.g:215:2: ( ( rule__ScopedName__Group__0 ) )
            {
            // InternalSimpleIDL.g:215:2: ( ( rule__ScopedName__Group__0 ) )
            // InternalSimpleIDL.g:216:3: ( rule__ScopedName__Group__0 )
            {
             before(grammarAccess.getScopedNameAccess().getGroup()); 
            // InternalSimpleIDL.g:217:3: ( rule__ScopedName__Group__0 )
            // InternalSimpleIDL.g:217:4: rule__ScopedName__Group__0
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
    // InternalSimpleIDL.g:225:1: rule__Definition__Alternatives : ( ( ( rule__Definition__Group_0__0 ) ) | ( ( rule__Definition__Group_1__0 ) ) | ( ( rule__Definition__Group_2__0 ) ) | ( ( rule__Definition__Group_3__0 ) ) | ( ( rule__Definition__Group_4__0 ) ) | ( ( rule__Definition__Group_5__0 ) ) | ( ( rule__Definition__Group_6__0 ) ) );
    public final void rule__Definition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:229:1: ( ( ( rule__Definition__Group_0__0 ) ) | ( ( rule__Definition__Group_1__0 ) ) | ( ( rule__Definition__Group_2__0 ) ) | ( ( rule__Definition__Group_3__0 ) ) | ( ( rule__Definition__Group_4__0 ) ) | ( ( rule__Definition__Group_5__0 ) ) | ( ( rule__Definition__Group_6__0 ) ) )
            int alt2=7;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalSimpleIDL.g:230:2: ( ( rule__Definition__Group_0__0 ) )
                    {
                    // InternalSimpleIDL.g:230:2: ( ( rule__Definition__Group_0__0 ) )
                    // InternalSimpleIDL.g:231:3: ( rule__Definition__Group_0__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_0()); 
                    // InternalSimpleIDL.g:232:3: ( rule__Definition__Group_0__0 )
                    // InternalSimpleIDL.g:232:4: rule__Definition__Group_0__0
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
                    // InternalSimpleIDL.g:236:2: ( ( rule__Definition__Group_1__0 ) )
                    {
                    // InternalSimpleIDL.g:236:2: ( ( rule__Definition__Group_1__0 ) )
                    // InternalSimpleIDL.g:237:3: ( rule__Definition__Group_1__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_1()); 
                    // InternalSimpleIDL.g:238:3: ( rule__Definition__Group_1__0 )
                    // InternalSimpleIDL.g:238:4: rule__Definition__Group_1__0
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
                    // InternalSimpleIDL.g:242:2: ( ( rule__Definition__Group_2__0 ) )
                    {
                    // InternalSimpleIDL.g:242:2: ( ( rule__Definition__Group_2__0 ) )
                    // InternalSimpleIDL.g:243:3: ( rule__Definition__Group_2__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_2()); 
                    // InternalSimpleIDL.g:244:3: ( rule__Definition__Group_2__0 )
                    // InternalSimpleIDL.g:244:4: rule__Definition__Group_2__0
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
                    // InternalSimpleIDL.g:248:2: ( ( rule__Definition__Group_3__0 ) )
                    {
                    // InternalSimpleIDL.g:248:2: ( ( rule__Definition__Group_3__0 ) )
                    // InternalSimpleIDL.g:249:3: ( rule__Definition__Group_3__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_3()); 
                    // InternalSimpleIDL.g:250:3: ( rule__Definition__Group_3__0 )
                    // InternalSimpleIDL.g:250:4: rule__Definition__Group_3__0
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
                    // InternalSimpleIDL.g:254:2: ( ( rule__Definition__Group_4__0 ) )
                    {
                    // InternalSimpleIDL.g:254:2: ( ( rule__Definition__Group_4__0 ) )
                    // InternalSimpleIDL.g:255:3: ( rule__Definition__Group_4__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_4()); 
                    // InternalSimpleIDL.g:256:3: ( rule__Definition__Group_4__0 )
                    // InternalSimpleIDL.g:256:4: rule__Definition__Group_4__0
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
                    // InternalSimpleIDL.g:260:2: ( ( rule__Definition__Group_5__0 ) )
                    {
                    // InternalSimpleIDL.g:260:2: ( ( rule__Definition__Group_5__0 ) )
                    // InternalSimpleIDL.g:261:3: ( rule__Definition__Group_5__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_5()); 
                    // InternalSimpleIDL.g:262:3: ( rule__Definition__Group_5__0 )
                    // InternalSimpleIDL.g:262:4: rule__Definition__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefinitionAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSimpleIDL.g:266:2: ( ( rule__Definition__Group_6__0 ) )
                    {
                    // InternalSimpleIDL.g:266:2: ( ( rule__Definition__Group_6__0 ) )
                    // InternalSimpleIDL.g:267:3: ( rule__Definition__Group_6__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_6()); 
                    // InternalSimpleIDL.g:268:3: ( rule__Definition__Group_6__0 )
                    // InternalSimpleIDL.g:268:4: rule__Definition__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefinitionAccess().getGroup_6()); 

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
    // InternalSimpleIDL.g:276:1: rule__Type__Alternatives : ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) | ( ( rule__Type__Group_3__0 ) ) | ( ( rule__Type__Group_4__0 ) ) | ( ( rule__Type__Group_5__0 ) ) | ( ( rule__Type__Group_6__0 ) ) | ( ( rule__Type__Group_7__0 ) ) | ( ( rule__Type__Group_8__0 ) ) | ( ( rule__Type__Group_9__0 ) ) | ( ( rule__Type__Group_10__0 ) ) | ( ( rule__Type__Group_11__0 ) ) | ( ( rule__Type__Group_12__0 ) ) | ( ( rule__Type__Group_13__0 ) ) | ( ( rule__Type__Group_14__0 ) ) | ( ( rule__Type__Group_15__0 ) ) | ( ( rule__Type__Group_16__0 ) ) | ( ( rule__Type__Group_17__0 ) ) | ( ( rule__Type__Group_18__0 ) ) | ( ( rule__Type__Group_19__0 ) ) | ( ( rule__Type__Group_20__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:280:1: ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) | ( ( rule__Type__Group_3__0 ) ) | ( ( rule__Type__Group_4__0 ) ) | ( ( rule__Type__Group_5__0 ) ) | ( ( rule__Type__Group_6__0 ) ) | ( ( rule__Type__Group_7__0 ) ) | ( ( rule__Type__Group_8__0 ) ) | ( ( rule__Type__Group_9__0 ) ) | ( ( rule__Type__Group_10__0 ) ) | ( ( rule__Type__Group_11__0 ) ) | ( ( rule__Type__Group_12__0 ) ) | ( ( rule__Type__Group_13__0 ) ) | ( ( rule__Type__Group_14__0 ) ) | ( ( rule__Type__Group_15__0 ) ) | ( ( rule__Type__Group_16__0 ) ) | ( ( rule__Type__Group_17__0 ) ) | ( ( rule__Type__Group_18__0 ) ) | ( ( rule__Type__Group_19__0 ) ) | ( ( rule__Type__Group_20__0 ) ) )
            int alt3=21;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalSimpleIDL.g:281:2: ( ( rule__Type__Group_0__0 ) )
                    {
                    // InternalSimpleIDL.g:281:2: ( ( rule__Type__Group_0__0 ) )
                    // InternalSimpleIDL.g:282:3: ( rule__Type__Group_0__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_0()); 
                    // InternalSimpleIDL.g:283:3: ( rule__Type__Group_0__0 )
                    // InternalSimpleIDL.g:283:4: rule__Type__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleIDL.g:287:2: ( ( rule__Type__Group_1__0 ) )
                    {
                    // InternalSimpleIDL.g:287:2: ( ( rule__Type__Group_1__0 ) )
                    // InternalSimpleIDL.g:288:3: ( rule__Type__Group_1__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_1()); 
                    // InternalSimpleIDL.g:289:3: ( rule__Type__Group_1__0 )
                    // InternalSimpleIDL.g:289:4: rule__Type__Group_1__0
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
                    // InternalSimpleIDL.g:293:2: ( ( rule__Type__Group_2__0 ) )
                    {
                    // InternalSimpleIDL.g:293:2: ( ( rule__Type__Group_2__0 ) )
                    // InternalSimpleIDL.g:294:3: ( rule__Type__Group_2__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_2()); 
                    // InternalSimpleIDL.g:295:3: ( rule__Type__Group_2__0 )
                    // InternalSimpleIDL.g:295:4: rule__Type__Group_2__0
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
                    // InternalSimpleIDL.g:299:2: ( ( rule__Type__Group_3__0 ) )
                    {
                    // InternalSimpleIDL.g:299:2: ( ( rule__Type__Group_3__0 ) )
                    // InternalSimpleIDL.g:300:3: ( rule__Type__Group_3__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_3()); 
                    // InternalSimpleIDL.g:301:3: ( rule__Type__Group_3__0 )
                    // InternalSimpleIDL.g:301:4: rule__Type__Group_3__0
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
                    // InternalSimpleIDL.g:305:2: ( ( rule__Type__Group_4__0 ) )
                    {
                    // InternalSimpleIDL.g:305:2: ( ( rule__Type__Group_4__0 ) )
                    // InternalSimpleIDL.g:306:3: ( rule__Type__Group_4__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_4()); 
                    // InternalSimpleIDL.g:307:3: ( rule__Type__Group_4__0 )
                    // InternalSimpleIDL.g:307:4: rule__Type__Group_4__0
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
                    // InternalSimpleIDL.g:311:2: ( ( rule__Type__Group_5__0 ) )
                    {
                    // InternalSimpleIDL.g:311:2: ( ( rule__Type__Group_5__0 ) )
                    // InternalSimpleIDL.g:312:3: ( rule__Type__Group_5__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_5()); 
                    // InternalSimpleIDL.g:313:3: ( rule__Type__Group_5__0 )
                    // InternalSimpleIDL.g:313:4: rule__Type__Group_5__0
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
                    // InternalSimpleIDL.g:317:2: ( ( rule__Type__Group_6__0 ) )
                    {
                    // InternalSimpleIDL.g:317:2: ( ( rule__Type__Group_6__0 ) )
                    // InternalSimpleIDL.g:318:3: ( rule__Type__Group_6__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_6()); 
                    // InternalSimpleIDL.g:319:3: ( rule__Type__Group_6__0 )
                    // InternalSimpleIDL.g:319:4: rule__Type__Group_6__0
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
                    // InternalSimpleIDL.g:323:2: ( ( rule__Type__Group_7__0 ) )
                    {
                    // InternalSimpleIDL.g:323:2: ( ( rule__Type__Group_7__0 ) )
                    // InternalSimpleIDL.g:324:3: ( rule__Type__Group_7__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_7()); 
                    // InternalSimpleIDL.g:325:3: ( rule__Type__Group_7__0 )
                    // InternalSimpleIDL.g:325:4: rule__Type__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSimpleIDL.g:329:2: ( ( rule__Type__Group_8__0 ) )
                    {
                    // InternalSimpleIDL.g:329:2: ( ( rule__Type__Group_8__0 ) )
                    // InternalSimpleIDL.g:330:3: ( rule__Type__Group_8__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_8()); 
                    // InternalSimpleIDL.g:331:3: ( rule__Type__Group_8__0 )
                    // InternalSimpleIDL.g:331:4: rule__Type__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSimpleIDL.g:335:2: ( ( rule__Type__Group_9__0 ) )
                    {
                    // InternalSimpleIDL.g:335:2: ( ( rule__Type__Group_9__0 ) )
                    // InternalSimpleIDL.g:336:3: ( rule__Type__Group_9__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_9()); 
                    // InternalSimpleIDL.g:337:3: ( rule__Type__Group_9__0 )
                    // InternalSimpleIDL.g:337:4: rule__Type__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_9__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalSimpleIDL.g:341:2: ( ( rule__Type__Group_10__0 ) )
                    {
                    // InternalSimpleIDL.g:341:2: ( ( rule__Type__Group_10__0 ) )
                    // InternalSimpleIDL.g:342:3: ( rule__Type__Group_10__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_10()); 
                    // InternalSimpleIDL.g:343:3: ( rule__Type__Group_10__0 )
                    // InternalSimpleIDL.g:343:4: rule__Type__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_10__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalSimpleIDL.g:347:2: ( ( rule__Type__Group_11__0 ) )
                    {
                    // InternalSimpleIDL.g:347:2: ( ( rule__Type__Group_11__0 ) )
                    // InternalSimpleIDL.g:348:3: ( rule__Type__Group_11__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_11()); 
                    // InternalSimpleIDL.g:349:3: ( rule__Type__Group_11__0 )
                    // InternalSimpleIDL.g:349:4: rule__Type__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_11__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalSimpleIDL.g:353:2: ( ( rule__Type__Group_12__0 ) )
                    {
                    // InternalSimpleIDL.g:353:2: ( ( rule__Type__Group_12__0 ) )
                    // InternalSimpleIDL.g:354:3: ( rule__Type__Group_12__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_12()); 
                    // InternalSimpleIDL.g:355:3: ( rule__Type__Group_12__0 )
                    // InternalSimpleIDL.g:355:4: rule__Type__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_12__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalSimpleIDL.g:359:2: ( ( rule__Type__Group_13__0 ) )
                    {
                    // InternalSimpleIDL.g:359:2: ( ( rule__Type__Group_13__0 ) )
                    // InternalSimpleIDL.g:360:3: ( rule__Type__Group_13__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_13()); 
                    // InternalSimpleIDL.g:361:3: ( rule__Type__Group_13__0 )
                    // InternalSimpleIDL.g:361:4: rule__Type__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_13__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalSimpleIDL.g:365:2: ( ( rule__Type__Group_14__0 ) )
                    {
                    // InternalSimpleIDL.g:365:2: ( ( rule__Type__Group_14__0 ) )
                    // InternalSimpleIDL.g:366:3: ( rule__Type__Group_14__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_14()); 
                    // InternalSimpleIDL.g:367:3: ( rule__Type__Group_14__0 )
                    // InternalSimpleIDL.g:367:4: rule__Type__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_14__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalSimpleIDL.g:371:2: ( ( rule__Type__Group_15__0 ) )
                    {
                    // InternalSimpleIDL.g:371:2: ( ( rule__Type__Group_15__0 ) )
                    // InternalSimpleIDL.g:372:3: ( rule__Type__Group_15__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_15()); 
                    // InternalSimpleIDL.g:373:3: ( rule__Type__Group_15__0 )
                    // InternalSimpleIDL.g:373:4: rule__Type__Group_15__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_15__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalSimpleIDL.g:377:2: ( ( rule__Type__Group_16__0 ) )
                    {
                    // InternalSimpleIDL.g:377:2: ( ( rule__Type__Group_16__0 ) )
                    // InternalSimpleIDL.g:378:3: ( rule__Type__Group_16__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_16()); 
                    // InternalSimpleIDL.g:379:3: ( rule__Type__Group_16__0 )
                    // InternalSimpleIDL.g:379:4: rule__Type__Group_16__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_16__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalSimpleIDL.g:383:2: ( ( rule__Type__Group_17__0 ) )
                    {
                    // InternalSimpleIDL.g:383:2: ( ( rule__Type__Group_17__0 ) )
                    // InternalSimpleIDL.g:384:3: ( rule__Type__Group_17__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_17()); 
                    // InternalSimpleIDL.g:385:3: ( rule__Type__Group_17__0 )
                    // InternalSimpleIDL.g:385:4: rule__Type__Group_17__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_17__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalSimpleIDL.g:389:2: ( ( rule__Type__Group_18__0 ) )
                    {
                    // InternalSimpleIDL.g:389:2: ( ( rule__Type__Group_18__0 ) )
                    // InternalSimpleIDL.g:390:3: ( rule__Type__Group_18__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_18()); 
                    // InternalSimpleIDL.g:391:3: ( rule__Type__Group_18__0 )
                    // InternalSimpleIDL.g:391:4: rule__Type__Group_18__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_18__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalSimpleIDL.g:395:2: ( ( rule__Type__Group_19__0 ) )
                    {
                    // InternalSimpleIDL.g:395:2: ( ( rule__Type__Group_19__0 ) )
                    // InternalSimpleIDL.g:396:3: ( rule__Type__Group_19__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_19()); 
                    // InternalSimpleIDL.g:397:3: ( rule__Type__Group_19__0 )
                    // InternalSimpleIDL.g:397:4: rule__Type__Group_19__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_19__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalSimpleIDL.g:401:2: ( ( rule__Type__Group_20__0 ) )
                    {
                    // InternalSimpleIDL.g:401:2: ( ( rule__Type__Group_20__0 ) )
                    // InternalSimpleIDL.g:402:3: ( rule__Type__Group_20__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_20()); 
                    // InternalSimpleIDL.g:403:3: ( rule__Type__Group_20__0 )
                    // InternalSimpleIDL.g:403:4: rule__Type__Group_20__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_20__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_20()); 

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


    // $ANTLR start "rule__Definition__Group_0__0"
    // InternalSimpleIDL.g:411:1: rule__Definition__Group_0__0 : rule__Definition__Group_0__0__Impl rule__Definition__Group_0__1 ;
    public final void rule__Definition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:415:1: ( rule__Definition__Group_0__0__Impl rule__Definition__Group_0__1 )
            // InternalSimpleIDL.g:416:2: rule__Definition__Group_0__0__Impl rule__Definition__Group_0__1
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
    // InternalSimpleIDL.g:423:1: rule__Definition__Group_0__0__Impl : ( () ) ;
    public final void rule__Definition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:427:1: ( ( () ) )
            // InternalSimpleIDL.g:428:1: ( () )
            {
            // InternalSimpleIDL.g:428:1: ( () )
            // InternalSimpleIDL.g:429:2: ()
            {
             before(grammarAccess.getDefinitionAccess().getModuleAction_0_0()); 
            // InternalSimpleIDL.g:430:2: ()
            // InternalSimpleIDL.g:430:3: 
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
    // InternalSimpleIDL.g:438:1: rule__Definition__Group_0__1 : rule__Definition__Group_0__1__Impl rule__Definition__Group_0__2 ;
    public final void rule__Definition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:442:1: ( rule__Definition__Group_0__1__Impl rule__Definition__Group_0__2 )
            // InternalSimpleIDL.g:443:2: rule__Definition__Group_0__1__Impl rule__Definition__Group_0__2
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
    // InternalSimpleIDL.g:450:1: rule__Definition__Group_0__1__Impl : ( 'module' ) ;
    public final void rule__Definition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:454:1: ( ( 'module' ) )
            // InternalSimpleIDL.g:455:1: ( 'module' )
            {
            // InternalSimpleIDL.g:455:1: ( 'module' )
            // InternalSimpleIDL.g:456:2: 'module'
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
    // InternalSimpleIDL.g:465:1: rule__Definition__Group_0__2 : rule__Definition__Group_0__2__Impl rule__Definition__Group_0__3 ;
    public final void rule__Definition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:469:1: ( rule__Definition__Group_0__2__Impl rule__Definition__Group_0__3 )
            // InternalSimpleIDL.g:470:2: rule__Definition__Group_0__2__Impl rule__Definition__Group_0__3
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
    // InternalSimpleIDL.g:477:1: rule__Definition__Group_0__2__Impl : ( ( rule__Definition__NameAssignment_0_2 ) ) ;
    public final void rule__Definition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:481:1: ( ( ( rule__Definition__NameAssignment_0_2 ) ) )
            // InternalSimpleIDL.g:482:1: ( ( rule__Definition__NameAssignment_0_2 ) )
            {
            // InternalSimpleIDL.g:482:1: ( ( rule__Definition__NameAssignment_0_2 ) )
            // InternalSimpleIDL.g:483:2: ( rule__Definition__NameAssignment_0_2 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_0_2()); 
            // InternalSimpleIDL.g:484:2: ( rule__Definition__NameAssignment_0_2 )
            // InternalSimpleIDL.g:484:3: rule__Definition__NameAssignment_0_2
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
    // InternalSimpleIDL.g:492:1: rule__Definition__Group_0__3 : rule__Definition__Group_0__3__Impl rule__Definition__Group_0__4 ;
    public final void rule__Definition__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:496:1: ( rule__Definition__Group_0__3__Impl rule__Definition__Group_0__4 )
            // InternalSimpleIDL.g:497:2: rule__Definition__Group_0__3__Impl rule__Definition__Group_0__4
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
    // InternalSimpleIDL.g:504:1: rule__Definition__Group_0__3__Impl : ( '{' ) ;
    public final void rule__Definition__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:508:1: ( ( '{' ) )
            // InternalSimpleIDL.g:509:1: ( '{' )
            {
            // InternalSimpleIDL.g:509:1: ( '{' )
            // InternalSimpleIDL.g:510:2: '{'
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
    // InternalSimpleIDL.g:519:1: rule__Definition__Group_0__4 : rule__Definition__Group_0__4__Impl rule__Definition__Group_0__5 ;
    public final void rule__Definition__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:523:1: ( rule__Definition__Group_0__4__Impl rule__Definition__Group_0__5 )
            // InternalSimpleIDL.g:524:2: rule__Definition__Group_0__4__Impl rule__Definition__Group_0__5
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
    // InternalSimpleIDL.g:531:1: rule__Definition__Group_0__4__Impl : ( ( ( rule__Definition__DefinitionsAssignment_0_4 ) ) ( ( rule__Definition__DefinitionsAssignment_0_4 )* ) ) ;
    public final void rule__Definition__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:535:1: ( ( ( ( rule__Definition__DefinitionsAssignment_0_4 ) ) ( ( rule__Definition__DefinitionsAssignment_0_4 )* ) ) )
            // InternalSimpleIDL.g:536:1: ( ( ( rule__Definition__DefinitionsAssignment_0_4 ) ) ( ( rule__Definition__DefinitionsAssignment_0_4 )* ) )
            {
            // InternalSimpleIDL.g:536:1: ( ( ( rule__Definition__DefinitionsAssignment_0_4 ) ) ( ( rule__Definition__DefinitionsAssignment_0_4 )* ) )
            // InternalSimpleIDL.g:537:2: ( ( rule__Definition__DefinitionsAssignment_0_4 ) ) ( ( rule__Definition__DefinitionsAssignment_0_4 )* )
            {
            // InternalSimpleIDL.g:537:2: ( ( rule__Definition__DefinitionsAssignment_0_4 ) )
            // InternalSimpleIDL.g:538:3: ( rule__Definition__DefinitionsAssignment_0_4 )
            {
             before(grammarAccess.getDefinitionAccess().getDefinitionsAssignment_0_4()); 
            // InternalSimpleIDL.g:539:3: ( rule__Definition__DefinitionsAssignment_0_4 )
            // InternalSimpleIDL.g:539:4: rule__Definition__DefinitionsAssignment_0_4
            {
            pushFollow(FOLLOW_3);
            rule__Definition__DefinitionsAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getDefinitionsAssignment_0_4()); 

            }

            // InternalSimpleIDL.g:542:2: ( ( rule__Definition__DefinitionsAssignment_0_4 )* )
            // InternalSimpleIDL.g:543:3: ( rule__Definition__DefinitionsAssignment_0_4 )*
            {
             before(grammarAccess.getDefinitionAccess().getDefinitionsAssignment_0_4()); 
            // InternalSimpleIDL.g:544:3: ( rule__Definition__DefinitionsAssignment_0_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12||(LA4_0>=16 && LA4_0<=17)||LA4_0==23||LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSimpleIDL.g:544:4: rule__Definition__DefinitionsAssignment_0_4
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Definition__DefinitionsAssignment_0_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalSimpleIDL.g:553:1: rule__Definition__Group_0__5 : rule__Definition__Group_0__5__Impl rule__Definition__Group_0__6 ;
    public final void rule__Definition__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:557:1: ( rule__Definition__Group_0__5__Impl rule__Definition__Group_0__6 )
            // InternalSimpleIDL.g:558:2: rule__Definition__Group_0__5__Impl rule__Definition__Group_0__6
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
    // InternalSimpleIDL.g:565:1: rule__Definition__Group_0__5__Impl : ( '}' ) ;
    public final void rule__Definition__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:569:1: ( ( '}' ) )
            // InternalSimpleIDL.g:570:1: ( '}' )
            {
            // InternalSimpleIDL.g:570:1: ( '}' )
            // InternalSimpleIDL.g:571:2: '}'
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
    // InternalSimpleIDL.g:580:1: rule__Definition__Group_0__6 : rule__Definition__Group_0__6__Impl ;
    public final void rule__Definition__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:584:1: ( rule__Definition__Group_0__6__Impl )
            // InternalSimpleIDL.g:585:2: rule__Definition__Group_0__6__Impl
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
    // InternalSimpleIDL.g:591:1: rule__Definition__Group_0__6__Impl : ( ';' ) ;
    public final void rule__Definition__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:595:1: ( ( ';' ) )
            // InternalSimpleIDL.g:596:1: ( ';' )
            {
            // InternalSimpleIDL.g:596:1: ( ';' )
            // InternalSimpleIDL.g:597:2: ';'
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
    // InternalSimpleIDL.g:607:1: rule__Definition__Group_1__0 : rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1 ;
    public final void rule__Definition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:611:1: ( rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1 )
            // InternalSimpleIDL.g:612:2: rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1
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
    // InternalSimpleIDL.g:619:1: rule__Definition__Group_1__0__Impl : ( () ) ;
    public final void rule__Definition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:623:1: ( ( () ) )
            // InternalSimpleIDL.g:624:1: ( () )
            {
            // InternalSimpleIDL.g:624:1: ( () )
            // InternalSimpleIDL.g:625:2: ()
            {
             before(grammarAccess.getDefinitionAccess().getStructAction_1_0()); 
            // InternalSimpleIDL.g:626:2: ()
            // InternalSimpleIDL.g:626:3: 
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
    // InternalSimpleIDL.g:634:1: rule__Definition__Group_1__1 : rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2 ;
    public final void rule__Definition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:638:1: ( rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2 )
            // InternalSimpleIDL.g:639:2: rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2
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
    // InternalSimpleIDL.g:646:1: rule__Definition__Group_1__1__Impl : ( 'struct' ) ;
    public final void rule__Definition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:650:1: ( ( 'struct' ) )
            // InternalSimpleIDL.g:651:1: ( 'struct' )
            {
            // InternalSimpleIDL.g:651:1: ( 'struct' )
            // InternalSimpleIDL.g:652:2: 'struct'
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
    // InternalSimpleIDL.g:661:1: rule__Definition__Group_1__2 : rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3 ;
    public final void rule__Definition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:665:1: ( rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3 )
            // InternalSimpleIDL.g:666:2: rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3
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
    // InternalSimpleIDL.g:673:1: rule__Definition__Group_1__2__Impl : ( ( rule__Definition__NameAssignment_1_2 ) ) ;
    public final void rule__Definition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:677:1: ( ( ( rule__Definition__NameAssignment_1_2 ) ) )
            // InternalSimpleIDL.g:678:1: ( ( rule__Definition__NameAssignment_1_2 ) )
            {
            // InternalSimpleIDL.g:678:1: ( ( rule__Definition__NameAssignment_1_2 ) )
            // InternalSimpleIDL.g:679:2: ( rule__Definition__NameAssignment_1_2 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_1_2()); 
            // InternalSimpleIDL.g:680:2: ( rule__Definition__NameAssignment_1_2 )
            // InternalSimpleIDL.g:680:3: rule__Definition__NameAssignment_1_2
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
    // InternalSimpleIDL.g:688:1: rule__Definition__Group_1__3 : rule__Definition__Group_1__3__Impl rule__Definition__Group_1__4 ;
    public final void rule__Definition__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:692:1: ( rule__Definition__Group_1__3__Impl rule__Definition__Group_1__4 )
            // InternalSimpleIDL.g:693:2: rule__Definition__Group_1__3__Impl rule__Definition__Group_1__4
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
    // InternalSimpleIDL.g:700:1: rule__Definition__Group_1__3__Impl : ( '{' ) ;
    public final void rule__Definition__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:704:1: ( ( '{' ) )
            // InternalSimpleIDL.g:705:1: ( '{' )
            {
            // InternalSimpleIDL.g:705:1: ( '{' )
            // InternalSimpleIDL.g:706:2: '{'
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
    // InternalSimpleIDL.g:715:1: rule__Definition__Group_1__4 : rule__Definition__Group_1__4__Impl rule__Definition__Group_1__5 ;
    public final void rule__Definition__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:719:1: ( rule__Definition__Group_1__4__Impl rule__Definition__Group_1__5 )
            // InternalSimpleIDL.g:720:2: rule__Definition__Group_1__4__Impl rule__Definition__Group_1__5
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
    // InternalSimpleIDL.g:727:1: rule__Definition__Group_1__4__Impl : ( ( ( rule__Definition__MembersAssignment_1_4 ) ) ( ( rule__Definition__MembersAssignment_1_4 )* ) ) ;
    public final void rule__Definition__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:731:1: ( ( ( ( rule__Definition__MembersAssignment_1_4 ) ) ( ( rule__Definition__MembersAssignment_1_4 )* ) ) )
            // InternalSimpleIDL.g:732:1: ( ( ( rule__Definition__MembersAssignment_1_4 ) ) ( ( rule__Definition__MembersAssignment_1_4 )* ) )
            {
            // InternalSimpleIDL.g:732:1: ( ( ( rule__Definition__MembersAssignment_1_4 ) ) ( ( rule__Definition__MembersAssignment_1_4 )* ) )
            // InternalSimpleIDL.g:733:2: ( ( rule__Definition__MembersAssignment_1_4 ) ) ( ( rule__Definition__MembersAssignment_1_4 )* )
            {
            // InternalSimpleIDL.g:733:2: ( ( rule__Definition__MembersAssignment_1_4 ) )
            // InternalSimpleIDL.g:734:3: ( rule__Definition__MembersAssignment_1_4 )
            {
             before(grammarAccess.getDefinitionAccess().getMembersAssignment_1_4()); 
            // InternalSimpleIDL.g:735:3: ( rule__Definition__MembersAssignment_1_4 )
            // InternalSimpleIDL.g:735:4: rule__Definition__MembersAssignment_1_4
            {
            pushFollow(FOLLOW_12);
            rule__Definition__MembersAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getMembersAssignment_1_4()); 

            }

            // InternalSimpleIDL.g:738:2: ( ( rule__Definition__MembersAssignment_1_4 )* )
            // InternalSimpleIDL.g:739:3: ( rule__Definition__MembersAssignment_1_4 )*
            {
             before(grammarAccess.getDefinitionAccess().getMembersAssignment_1_4()); 
            // InternalSimpleIDL.g:740:3: ( rule__Definition__MembersAssignment_1_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==43) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSimpleIDL.g:740:4: rule__Definition__MembersAssignment_1_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Definition__MembersAssignment_1_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalSimpleIDL.g:749:1: rule__Definition__Group_1__5 : rule__Definition__Group_1__5__Impl rule__Definition__Group_1__6 ;
    public final void rule__Definition__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:753:1: ( rule__Definition__Group_1__5__Impl rule__Definition__Group_1__6 )
            // InternalSimpleIDL.g:754:2: rule__Definition__Group_1__5__Impl rule__Definition__Group_1__6
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
    // InternalSimpleIDL.g:761:1: rule__Definition__Group_1__5__Impl : ( '}' ) ;
    public final void rule__Definition__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:765:1: ( ( '}' ) )
            // InternalSimpleIDL.g:766:1: ( '}' )
            {
            // InternalSimpleIDL.g:766:1: ( '}' )
            // InternalSimpleIDL.g:767:2: '}'
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
    // InternalSimpleIDL.g:776:1: rule__Definition__Group_1__6 : rule__Definition__Group_1__6__Impl ;
    public final void rule__Definition__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:780:1: ( rule__Definition__Group_1__6__Impl )
            // InternalSimpleIDL.g:781:2: rule__Definition__Group_1__6__Impl
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
    // InternalSimpleIDL.g:787:1: rule__Definition__Group_1__6__Impl : ( ';' ) ;
    public final void rule__Definition__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:791:1: ( ( ';' ) )
            // InternalSimpleIDL.g:792:1: ( ';' )
            {
            // InternalSimpleIDL.g:792:1: ( ';' )
            // InternalSimpleIDL.g:793:2: ';'
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
    // InternalSimpleIDL.g:803:1: rule__Definition__Group_2__0 : rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1 ;
    public final void rule__Definition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:807:1: ( rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1 )
            // InternalSimpleIDL.g:808:2: rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1
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
    // InternalSimpleIDL.g:815:1: rule__Definition__Group_2__0__Impl : ( () ) ;
    public final void rule__Definition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:819:1: ( ( () ) )
            // InternalSimpleIDL.g:820:1: ( () )
            {
            // InternalSimpleIDL.g:820:1: ( () )
            // InternalSimpleIDL.g:821:2: ()
            {
             before(grammarAccess.getDefinitionAccess().getStructForwardAction_2_0()); 
            // InternalSimpleIDL.g:822:2: ()
            // InternalSimpleIDL.g:822:3: 
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
    // InternalSimpleIDL.g:830:1: rule__Definition__Group_2__1 : rule__Definition__Group_2__1__Impl rule__Definition__Group_2__2 ;
    public final void rule__Definition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:834:1: ( rule__Definition__Group_2__1__Impl rule__Definition__Group_2__2 )
            // InternalSimpleIDL.g:835:2: rule__Definition__Group_2__1__Impl rule__Definition__Group_2__2
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
    // InternalSimpleIDL.g:842:1: rule__Definition__Group_2__1__Impl : ( 'struct' ) ;
    public final void rule__Definition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:846:1: ( ( 'struct' ) )
            // InternalSimpleIDL.g:847:1: ( 'struct' )
            {
            // InternalSimpleIDL.g:847:1: ( 'struct' )
            // InternalSimpleIDL.g:848:2: 'struct'
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
    // InternalSimpleIDL.g:857:1: rule__Definition__Group_2__2 : rule__Definition__Group_2__2__Impl rule__Definition__Group_2__3 ;
    public final void rule__Definition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:861:1: ( rule__Definition__Group_2__2__Impl rule__Definition__Group_2__3 )
            // InternalSimpleIDL.g:862:2: rule__Definition__Group_2__2__Impl rule__Definition__Group_2__3
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
    // InternalSimpleIDL.g:869:1: rule__Definition__Group_2__2__Impl : ( ( rule__Definition__StructAssignment_2_2 ) ) ;
    public final void rule__Definition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:873:1: ( ( ( rule__Definition__StructAssignment_2_2 ) ) )
            // InternalSimpleIDL.g:874:1: ( ( rule__Definition__StructAssignment_2_2 ) )
            {
            // InternalSimpleIDL.g:874:1: ( ( rule__Definition__StructAssignment_2_2 ) )
            // InternalSimpleIDL.g:875:2: ( rule__Definition__StructAssignment_2_2 )
            {
             before(grammarAccess.getDefinitionAccess().getStructAssignment_2_2()); 
            // InternalSimpleIDL.g:876:2: ( rule__Definition__StructAssignment_2_2 )
            // InternalSimpleIDL.g:876:3: rule__Definition__StructAssignment_2_2
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
    // InternalSimpleIDL.g:884:1: rule__Definition__Group_2__3 : rule__Definition__Group_2__3__Impl ;
    public final void rule__Definition__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:888:1: ( rule__Definition__Group_2__3__Impl )
            // InternalSimpleIDL.g:889:2: rule__Definition__Group_2__3__Impl
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
    // InternalSimpleIDL.g:895:1: rule__Definition__Group_2__3__Impl : ( ';' ) ;
    public final void rule__Definition__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:899:1: ( ( ';' ) )
            // InternalSimpleIDL.g:900:1: ( ';' )
            {
            // InternalSimpleIDL.g:900:1: ( ';' )
            // InternalSimpleIDL.g:901:2: ';'
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
    // InternalSimpleIDL.g:911:1: rule__Definition__Group_3__0 : rule__Definition__Group_3__0__Impl rule__Definition__Group_3__1 ;
    public final void rule__Definition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:915:1: ( rule__Definition__Group_3__0__Impl rule__Definition__Group_3__1 )
            // InternalSimpleIDL.g:916:2: rule__Definition__Group_3__0__Impl rule__Definition__Group_3__1
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
    // InternalSimpleIDL.g:923:1: rule__Definition__Group_3__0__Impl : ( () ) ;
    public final void rule__Definition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:927:1: ( ( () ) )
            // InternalSimpleIDL.g:928:1: ( () )
            {
            // InternalSimpleIDL.g:928:1: ( () )
            // InternalSimpleIDL.g:929:2: ()
            {
             before(grammarAccess.getDefinitionAccess().getUnionAction_3_0()); 
            // InternalSimpleIDL.g:930:2: ()
            // InternalSimpleIDL.g:930:3: 
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
    // InternalSimpleIDL.g:938:1: rule__Definition__Group_3__1 : rule__Definition__Group_3__1__Impl rule__Definition__Group_3__2 ;
    public final void rule__Definition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:942:1: ( rule__Definition__Group_3__1__Impl rule__Definition__Group_3__2 )
            // InternalSimpleIDL.g:943:2: rule__Definition__Group_3__1__Impl rule__Definition__Group_3__2
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
    // InternalSimpleIDL.g:950:1: rule__Definition__Group_3__1__Impl : ( 'union' ) ;
    public final void rule__Definition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:954:1: ( ( 'union' ) )
            // InternalSimpleIDL.g:955:1: ( 'union' )
            {
            // InternalSimpleIDL.g:955:1: ( 'union' )
            // InternalSimpleIDL.g:956:2: 'union'
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
    // InternalSimpleIDL.g:965:1: rule__Definition__Group_3__2 : rule__Definition__Group_3__2__Impl rule__Definition__Group_3__3 ;
    public final void rule__Definition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:969:1: ( rule__Definition__Group_3__2__Impl rule__Definition__Group_3__3 )
            // InternalSimpleIDL.g:970:2: rule__Definition__Group_3__2__Impl rule__Definition__Group_3__3
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
    // InternalSimpleIDL.g:977:1: rule__Definition__Group_3__2__Impl : ( ( rule__Definition__NameAssignment_3_2 ) ) ;
    public final void rule__Definition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:981:1: ( ( ( rule__Definition__NameAssignment_3_2 ) ) )
            // InternalSimpleIDL.g:982:1: ( ( rule__Definition__NameAssignment_3_2 ) )
            {
            // InternalSimpleIDL.g:982:1: ( ( rule__Definition__NameAssignment_3_2 ) )
            // InternalSimpleIDL.g:983:2: ( rule__Definition__NameAssignment_3_2 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_3_2()); 
            // InternalSimpleIDL.g:984:2: ( rule__Definition__NameAssignment_3_2 )
            // InternalSimpleIDL.g:984:3: rule__Definition__NameAssignment_3_2
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
    // InternalSimpleIDL.g:992:1: rule__Definition__Group_3__3 : rule__Definition__Group_3__3__Impl rule__Definition__Group_3__4 ;
    public final void rule__Definition__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:996:1: ( rule__Definition__Group_3__3__Impl rule__Definition__Group_3__4 )
            // InternalSimpleIDL.g:997:2: rule__Definition__Group_3__3__Impl rule__Definition__Group_3__4
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
    // InternalSimpleIDL.g:1004:1: rule__Definition__Group_3__3__Impl : ( '{' ) ;
    public final void rule__Definition__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1008:1: ( ( '{' ) )
            // InternalSimpleIDL.g:1009:1: ( '{' )
            {
            // InternalSimpleIDL.g:1009:1: ( '{' )
            // InternalSimpleIDL.g:1010:2: '{'
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
    // InternalSimpleIDL.g:1019:1: rule__Definition__Group_3__4 : rule__Definition__Group_3__4__Impl rule__Definition__Group_3__5 ;
    public final void rule__Definition__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1023:1: ( rule__Definition__Group_3__4__Impl rule__Definition__Group_3__5 )
            // InternalSimpleIDL.g:1024:2: rule__Definition__Group_3__4__Impl rule__Definition__Group_3__5
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
    // InternalSimpleIDL.g:1031:1: rule__Definition__Group_3__4__Impl : ( 'switch' ) ;
    public final void rule__Definition__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1035:1: ( ( 'switch' ) )
            // InternalSimpleIDL.g:1036:1: ( 'switch' )
            {
            // InternalSimpleIDL.g:1036:1: ( 'switch' )
            // InternalSimpleIDL.g:1037:2: 'switch'
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
    // InternalSimpleIDL.g:1046:1: rule__Definition__Group_3__5 : rule__Definition__Group_3__5__Impl rule__Definition__Group_3__6 ;
    public final void rule__Definition__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1050:1: ( rule__Definition__Group_3__5__Impl rule__Definition__Group_3__6 )
            // InternalSimpleIDL.g:1051:2: rule__Definition__Group_3__5__Impl rule__Definition__Group_3__6
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
    // InternalSimpleIDL.g:1058:1: rule__Definition__Group_3__5__Impl : ( '(' ) ;
    public final void rule__Definition__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1062:1: ( ( '(' ) )
            // InternalSimpleIDL.g:1063:1: ( '(' )
            {
            // InternalSimpleIDL.g:1063:1: ( '(' )
            // InternalSimpleIDL.g:1064:2: '('
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
    // InternalSimpleIDL.g:1073:1: rule__Definition__Group_3__6 : rule__Definition__Group_3__6__Impl rule__Definition__Group_3__7 ;
    public final void rule__Definition__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1077:1: ( rule__Definition__Group_3__6__Impl rule__Definition__Group_3__7 )
            // InternalSimpleIDL.g:1078:2: rule__Definition__Group_3__6__Impl rule__Definition__Group_3__7
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
    // InternalSimpleIDL.g:1085:1: rule__Definition__Group_3__6__Impl : ( 'unsigned' ) ;
    public final void rule__Definition__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1089:1: ( ( 'unsigned' ) )
            // InternalSimpleIDL.g:1090:1: ( 'unsigned' )
            {
            // InternalSimpleIDL.g:1090:1: ( 'unsigned' )
            // InternalSimpleIDL.g:1091:2: 'unsigned'
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
    // InternalSimpleIDL.g:1100:1: rule__Definition__Group_3__7 : rule__Definition__Group_3__7__Impl rule__Definition__Group_3__8 ;
    public final void rule__Definition__Group_3__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1104:1: ( rule__Definition__Group_3__7__Impl rule__Definition__Group_3__8 )
            // InternalSimpleIDL.g:1105:2: rule__Definition__Group_3__7__Impl rule__Definition__Group_3__8
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
    // InternalSimpleIDL.g:1112:1: rule__Definition__Group_3__7__Impl : ( 'short' ) ;
    public final void rule__Definition__Group_3__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1116:1: ( ( 'short' ) )
            // InternalSimpleIDL.g:1117:1: ( 'short' )
            {
            // InternalSimpleIDL.g:1117:1: ( 'short' )
            // InternalSimpleIDL.g:1118:2: 'short'
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
    // InternalSimpleIDL.g:1127:1: rule__Definition__Group_3__8 : rule__Definition__Group_3__8__Impl rule__Definition__Group_3__9 ;
    public final void rule__Definition__Group_3__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1131:1: ( rule__Definition__Group_3__8__Impl rule__Definition__Group_3__9 )
            // InternalSimpleIDL.g:1132:2: rule__Definition__Group_3__8__Impl rule__Definition__Group_3__9
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
    // InternalSimpleIDL.g:1139:1: rule__Definition__Group_3__8__Impl : ( ')' ) ;
    public final void rule__Definition__Group_3__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1143:1: ( ( ')' ) )
            // InternalSimpleIDL.g:1144:1: ( ')' )
            {
            // InternalSimpleIDL.g:1144:1: ( ')' )
            // InternalSimpleIDL.g:1145:2: ')'
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
    // InternalSimpleIDL.g:1154:1: rule__Definition__Group_3__9 : rule__Definition__Group_3__9__Impl rule__Definition__Group_3__10 ;
    public final void rule__Definition__Group_3__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1158:1: ( rule__Definition__Group_3__9__Impl rule__Definition__Group_3__10 )
            // InternalSimpleIDL.g:1159:2: rule__Definition__Group_3__9__Impl rule__Definition__Group_3__10
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
    // InternalSimpleIDL.g:1166:1: rule__Definition__Group_3__9__Impl : ( '{' ) ;
    public final void rule__Definition__Group_3__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1170:1: ( ( '{' ) )
            // InternalSimpleIDL.g:1171:1: ( '{' )
            {
            // InternalSimpleIDL.g:1171:1: ( '{' )
            // InternalSimpleIDL.g:1172:2: '{'
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
    // InternalSimpleIDL.g:1181:1: rule__Definition__Group_3__10 : rule__Definition__Group_3__10__Impl rule__Definition__Group_3__11 ;
    public final void rule__Definition__Group_3__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1185:1: ( rule__Definition__Group_3__10__Impl rule__Definition__Group_3__11 )
            // InternalSimpleIDL.g:1186:2: rule__Definition__Group_3__10__Impl rule__Definition__Group_3__11
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
    // InternalSimpleIDL.g:1193:1: rule__Definition__Group_3__10__Impl : ( ( ( rule__Definition__CasesAssignment_3_10 ) ) ( ( rule__Definition__CasesAssignment_3_10 )* ) ) ;
    public final void rule__Definition__Group_3__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1197:1: ( ( ( ( rule__Definition__CasesAssignment_3_10 ) ) ( ( rule__Definition__CasesAssignment_3_10 )* ) ) )
            // InternalSimpleIDL.g:1198:1: ( ( ( rule__Definition__CasesAssignment_3_10 ) ) ( ( rule__Definition__CasesAssignment_3_10 )* ) )
            {
            // InternalSimpleIDL.g:1198:1: ( ( ( rule__Definition__CasesAssignment_3_10 ) ) ( ( rule__Definition__CasesAssignment_3_10 )* ) )
            // InternalSimpleIDL.g:1199:2: ( ( rule__Definition__CasesAssignment_3_10 ) ) ( ( rule__Definition__CasesAssignment_3_10 )* )
            {
            // InternalSimpleIDL.g:1199:2: ( ( rule__Definition__CasesAssignment_3_10 ) )
            // InternalSimpleIDL.g:1200:3: ( rule__Definition__CasesAssignment_3_10 )
            {
             before(grammarAccess.getDefinitionAccess().getCasesAssignment_3_10()); 
            // InternalSimpleIDL.g:1201:3: ( rule__Definition__CasesAssignment_3_10 )
            // InternalSimpleIDL.g:1201:4: rule__Definition__CasesAssignment_3_10
            {
            pushFollow(FOLLOW_20);
            rule__Definition__CasesAssignment_3_10();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getCasesAssignment_3_10()); 

            }

            // InternalSimpleIDL.g:1204:2: ( ( rule__Definition__CasesAssignment_3_10 )* )
            // InternalSimpleIDL.g:1205:3: ( rule__Definition__CasesAssignment_3_10 )*
            {
             before(grammarAccess.getDefinitionAccess().getCasesAssignment_3_10()); 
            // InternalSimpleIDL.g:1206:3: ( rule__Definition__CasesAssignment_3_10 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSimpleIDL.g:1206:4: rule__Definition__CasesAssignment_3_10
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Definition__CasesAssignment_3_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalSimpleIDL.g:1215:1: rule__Definition__Group_3__11 : rule__Definition__Group_3__11__Impl rule__Definition__Group_3__12 ;
    public final void rule__Definition__Group_3__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1219:1: ( rule__Definition__Group_3__11__Impl rule__Definition__Group_3__12 )
            // InternalSimpleIDL.g:1220:2: rule__Definition__Group_3__11__Impl rule__Definition__Group_3__12
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
    // InternalSimpleIDL.g:1227:1: rule__Definition__Group_3__11__Impl : ( '}' ) ;
    public final void rule__Definition__Group_3__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1231:1: ( ( '}' ) )
            // InternalSimpleIDL.g:1232:1: ( '}' )
            {
            // InternalSimpleIDL.g:1232:1: ( '}' )
            // InternalSimpleIDL.g:1233:2: '}'
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
    // InternalSimpleIDL.g:1242:1: rule__Definition__Group_3__12 : rule__Definition__Group_3__12__Impl rule__Definition__Group_3__13 ;
    public final void rule__Definition__Group_3__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1246:1: ( rule__Definition__Group_3__12__Impl rule__Definition__Group_3__13 )
            // InternalSimpleIDL.g:1247:2: rule__Definition__Group_3__12__Impl rule__Definition__Group_3__13
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
    // InternalSimpleIDL.g:1254:1: rule__Definition__Group_3__12__Impl : ( ';' ) ;
    public final void rule__Definition__Group_3__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1258:1: ( ( ';' ) )
            // InternalSimpleIDL.g:1259:1: ( ';' )
            {
            // InternalSimpleIDL.g:1259:1: ( ';' )
            // InternalSimpleIDL.g:1260:2: ';'
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
    // InternalSimpleIDL.g:1269:1: rule__Definition__Group_3__13 : rule__Definition__Group_3__13__Impl rule__Definition__Group_3__14 ;
    public final void rule__Definition__Group_3__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1273:1: ( rule__Definition__Group_3__13__Impl rule__Definition__Group_3__14 )
            // InternalSimpleIDL.g:1274:2: rule__Definition__Group_3__13__Impl rule__Definition__Group_3__14
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
    // InternalSimpleIDL.g:1281:1: rule__Definition__Group_3__13__Impl : ( '}' ) ;
    public final void rule__Definition__Group_3__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1285:1: ( ( '}' ) )
            // InternalSimpleIDL.g:1286:1: ( '}' )
            {
            // InternalSimpleIDL.g:1286:1: ( '}' )
            // InternalSimpleIDL.g:1287:2: '}'
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
    // InternalSimpleIDL.g:1296:1: rule__Definition__Group_3__14 : rule__Definition__Group_3__14__Impl ;
    public final void rule__Definition__Group_3__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1300:1: ( rule__Definition__Group_3__14__Impl )
            // InternalSimpleIDL.g:1301:2: rule__Definition__Group_3__14__Impl
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
    // InternalSimpleIDL.g:1307:1: rule__Definition__Group_3__14__Impl : ( ';' ) ;
    public final void rule__Definition__Group_3__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1311:1: ( ( ';' ) )
            // InternalSimpleIDL.g:1312:1: ( ';' )
            {
            // InternalSimpleIDL.g:1312:1: ( ';' )
            // InternalSimpleIDL.g:1313:2: ';'
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
    // InternalSimpleIDL.g:1323:1: rule__Definition__Group_4__0 : rule__Definition__Group_4__0__Impl rule__Definition__Group_4__1 ;
    public final void rule__Definition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1327:1: ( rule__Definition__Group_4__0__Impl rule__Definition__Group_4__1 )
            // InternalSimpleIDL.g:1328:2: rule__Definition__Group_4__0__Impl rule__Definition__Group_4__1
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
    // InternalSimpleIDL.g:1335:1: rule__Definition__Group_4__0__Impl : ( () ) ;
    public final void rule__Definition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1339:1: ( ( () ) )
            // InternalSimpleIDL.g:1340:1: ( () )
            {
            // InternalSimpleIDL.g:1340:1: ( () )
            // InternalSimpleIDL.g:1341:2: ()
            {
             before(grammarAccess.getDefinitionAccess().getEnumAction_4_0()); 
            // InternalSimpleIDL.g:1342:2: ()
            // InternalSimpleIDL.g:1342:3: 
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
    // InternalSimpleIDL.g:1350:1: rule__Definition__Group_4__1 : rule__Definition__Group_4__1__Impl rule__Definition__Group_4__2 ;
    public final void rule__Definition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1354:1: ( rule__Definition__Group_4__1__Impl rule__Definition__Group_4__2 )
            // InternalSimpleIDL.g:1355:2: rule__Definition__Group_4__1__Impl rule__Definition__Group_4__2
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
    // InternalSimpleIDL.g:1362:1: rule__Definition__Group_4__1__Impl : ( 'enum' ) ;
    public final void rule__Definition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1366:1: ( ( 'enum' ) )
            // InternalSimpleIDL.g:1367:1: ( 'enum' )
            {
            // InternalSimpleIDL.g:1367:1: ( 'enum' )
            // InternalSimpleIDL.g:1368:2: 'enum'
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
    // InternalSimpleIDL.g:1377:1: rule__Definition__Group_4__2 : rule__Definition__Group_4__2__Impl rule__Definition__Group_4__3 ;
    public final void rule__Definition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1381:1: ( rule__Definition__Group_4__2__Impl rule__Definition__Group_4__3 )
            // InternalSimpleIDL.g:1382:2: rule__Definition__Group_4__2__Impl rule__Definition__Group_4__3
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
    // InternalSimpleIDL.g:1389:1: rule__Definition__Group_4__2__Impl : ( ( rule__Definition__NameAssignment_4_2 ) ) ;
    public final void rule__Definition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1393:1: ( ( ( rule__Definition__NameAssignment_4_2 ) ) )
            // InternalSimpleIDL.g:1394:1: ( ( rule__Definition__NameAssignment_4_2 ) )
            {
            // InternalSimpleIDL.g:1394:1: ( ( rule__Definition__NameAssignment_4_2 ) )
            // InternalSimpleIDL.g:1395:2: ( rule__Definition__NameAssignment_4_2 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_4_2()); 
            // InternalSimpleIDL.g:1396:2: ( rule__Definition__NameAssignment_4_2 )
            // InternalSimpleIDL.g:1396:3: rule__Definition__NameAssignment_4_2
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
    // InternalSimpleIDL.g:1404:1: rule__Definition__Group_4__3 : rule__Definition__Group_4__3__Impl rule__Definition__Group_4__4 ;
    public final void rule__Definition__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1408:1: ( rule__Definition__Group_4__3__Impl rule__Definition__Group_4__4 )
            // InternalSimpleIDL.g:1409:2: rule__Definition__Group_4__3__Impl rule__Definition__Group_4__4
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
    // InternalSimpleIDL.g:1416:1: rule__Definition__Group_4__3__Impl : ( '{' ) ;
    public final void rule__Definition__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1420:1: ( ( '{' ) )
            // InternalSimpleIDL.g:1421:1: ( '{' )
            {
            // InternalSimpleIDL.g:1421:1: ( '{' )
            // InternalSimpleIDL.g:1422:2: '{'
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
    // InternalSimpleIDL.g:1431:1: rule__Definition__Group_4__4 : rule__Definition__Group_4__4__Impl rule__Definition__Group_4__5 ;
    public final void rule__Definition__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1435:1: ( rule__Definition__Group_4__4__Impl rule__Definition__Group_4__5 )
            // InternalSimpleIDL.g:1436:2: rule__Definition__Group_4__4__Impl rule__Definition__Group_4__5
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
    // InternalSimpleIDL.g:1443:1: rule__Definition__Group_4__4__Impl : ( ( rule__Definition__LiteralsAssignment_4_4 ) ) ;
    public final void rule__Definition__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1447:1: ( ( ( rule__Definition__LiteralsAssignment_4_4 ) ) )
            // InternalSimpleIDL.g:1448:1: ( ( rule__Definition__LiteralsAssignment_4_4 ) )
            {
            // InternalSimpleIDL.g:1448:1: ( ( rule__Definition__LiteralsAssignment_4_4 ) )
            // InternalSimpleIDL.g:1449:2: ( rule__Definition__LiteralsAssignment_4_4 )
            {
             before(grammarAccess.getDefinitionAccess().getLiteralsAssignment_4_4()); 
            // InternalSimpleIDL.g:1450:2: ( rule__Definition__LiteralsAssignment_4_4 )
            // InternalSimpleIDL.g:1450:3: rule__Definition__LiteralsAssignment_4_4
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
    // InternalSimpleIDL.g:1458:1: rule__Definition__Group_4__5 : rule__Definition__Group_4__5__Impl rule__Definition__Group_4__6 ;
    public final void rule__Definition__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1462:1: ( rule__Definition__Group_4__5__Impl rule__Definition__Group_4__6 )
            // InternalSimpleIDL.g:1463:2: rule__Definition__Group_4__5__Impl rule__Definition__Group_4__6
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
    // InternalSimpleIDL.g:1470:1: rule__Definition__Group_4__5__Impl : ( ( rule__Definition__Group_4_5__0 )* ) ;
    public final void rule__Definition__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1474:1: ( ( ( rule__Definition__Group_4_5__0 )* ) )
            // InternalSimpleIDL.g:1475:1: ( ( rule__Definition__Group_4_5__0 )* )
            {
            // InternalSimpleIDL.g:1475:1: ( ( rule__Definition__Group_4_5__0 )* )
            // InternalSimpleIDL.g:1476:2: ( rule__Definition__Group_4_5__0 )*
            {
             before(grammarAccess.getDefinitionAccess().getGroup_4_5()); 
            // InternalSimpleIDL.g:1477:2: ( rule__Definition__Group_4_5__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSimpleIDL.g:1477:3: rule__Definition__Group_4_5__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Definition__Group_4_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalSimpleIDL.g:1485:1: rule__Definition__Group_4__6 : rule__Definition__Group_4__6__Impl rule__Definition__Group_4__7 ;
    public final void rule__Definition__Group_4__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1489:1: ( rule__Definition__Group_4__6__Impl rule__Definition__Group_4__7 )
            // InternalSimpleIDL.g:1490:2: rule__Definition__Group_4__6__Impl rule__Definition__Group_4__7
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
    // InternalSimpleIDL.g:1497:1: rule__Definition__Group_4__6__Impl : ( '}' ) ;
    public final void rule__Definition__Group_4__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1501:1: ( ( '}' ) )
            // InternalSimpleIDL.g:1502:1: ( '}' )
            {
            // InternalSimpleIDL.g:1502:1: ( '}' )
            // InternalSimpleIDL.g:1503:2: '}'
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
    // InternalSimpleIDL.g:1512:1: rule__Definition__Group_4__7 : rule__Definition__Group_4__7__Impl ;
    public final void rule__Definition__Group_4__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1516:1: ( rule__Definition__Group_4__7__Impl )
            // InternalSimpleIDL.g:1517:2: rule__Definition__Group_4__7__Impl
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
    // InternalSimpleIDL.g:1523:1: rule__Definition__Group_4__7__Impl : ( ';' ) ;
    public final void rule__Definition__Group_4__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1527:1: ( ( ';' ) )
            // InternalSimpleIDL.g:1528:1: ( ';' )
            {
            // InternalSimpleIDL.g:1528:1: ( ';' )
            // InternalSimpleIDL.g:1529:2: ';'
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
    // InternalSimpleIDL.g:1539:1: rule__Definition__Group_4_5__0 : rule__Definition__Group_4_5__0__Impl rule__Definition__Group_4_5__1 ;
    public final void rule__Definition__Group_4_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1543:1: ( rule__Definition__Group_4_5__0__Impl rule__Definition__Group_4_5__1 )
            // InternalSimpleIDL.g:1544:2: rule__Definition__Group_4_5__0__Impl rule__Definition__Group_4_5__1
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
    // InternalSimpleIDL.g:1551:1: rule__Definition__Group_4_5__0__Impl : ( ',' ) ;
    public final void rule__Definition__Group_4_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1555:1: ( ( ',' ) )
            // InternalSimpleIDL.g:1556:1: ( ',' )
            {
            // InternalSimpleIDL.g:1556:1: ( ',' )
            // InternalSimpleIDL.g:1557:2: ','
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
    // InternalSimpleIDL.g:1566:1: rule__Definition__Group_4_5__1 : rule__Definition__Group_4_5__1__Impl ;
    public final void rule__Definition__Group_4_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1570:1: ( rule__Definition__Group_4_5__1__Impl )
            // InternalSimpleIDL.g:1571:2: rule__Definition__Group_4_5__1__Impl
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
    // InternalSimpleIDL.g:1577:1: rule__Definition__Group_4_5__1__Impl : ( ( rule__Definition__LiteralsAssignment_4_5_1 ) ) ;
    public final void rule__Definition__Group_4_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1581:1: ( ( ( rule__Definition__LiteralsAssignment_4_5_1 ) ) )
            // InternalSimpleIDL.g:1582:1: ( ( rule__Definition__LiteralsAssignment_4_5_1 ) )
            {
            // InternalSimpleIDL.g:1582:1: ( ( rule__Definition__LiteralsAssignment_4_5_1 ) )
            // InternalSimpleIDL.g:1583:2: ( rule__Definition__LiteralsAssignment_4_5_1 )
            {
             before(grammarAccess.getDefinitionAccess().getLiteralsAssignment_4_5_1()); 
            // InternalSimpleIDL.g:1584:2: ( rule__Definition__LiteralsAssignment_4_5_1 )
            // InternalSimpleIDL.g:1584:3: rule__Definition__LiteralsAssignment_4_5_1
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
    // InternalSimpleIDL.g:1593:1: rule__Definition__Group_5__0 : rule__Definition__Group_5__0__Impl rule__Definition__Group_5__1 ;
    public final void rule__Definition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1597:1: ( rule__Definition__Group_5__0__Impl rule__Definition__Group_5__1 )
            // InternalSimpleIDL.g:1598:2: rule__Definition__Group_5__0__Impl rule__Definition__Group_5__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalSimpleIDL.g:1605:1: rule__Definition__Group_5__0__Impl : ( () ) ;
    public final void rule__Definition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1609:1: ( ( () ) )
            // InternalSimpleIDL.g:1610:1: ( () )
            {
            // InternalSimpleIDL.g:1610:1: ( () )
            // InternalSimpleIDL.g:1611:2: ()
            {
             before(grammarAccess.getDefinitionAccess().getTypedefAction_5_0()); 
            // InternalSimpleIDL.g:1612:2: ()
            // InternalSimpleIDL.g:1612:3: 
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
    // InternalSimpleIDL.g:1620:1: rule__Definition__Group_5__1 : rule__Definition__Group_5__1__Impl rule__Definition__Group_5__2 ;
    public final void rule__Definition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1624:1: ( rule__Definition__Group_5__1__Impl rule__Definition__Group_5__2 )
            // InternalSimpleIDL.g:1625:2: rule__Definition__Group_5__1__Impl rule__Definition__Group_5__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalSimpleIDL.g:1632:1: rule__Definition__Group_5__1__Impl : ( 'typedef' ) ;
    public final void rule__Definition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1636:1: ( ( 'typedef' ) )
            // InternalSimpleIDL.g:1637:1: ( 'typedef' )
            {
            // InternalSimpleIDL.g:1637:1: ( 'typedef' )
            // InternalSimpleIDL.g:1638:2: 'typedef'
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
    // InternalSimpleIDL.g:1647:1: rule__Definition__Group_5__2 : rule__Definition__Group_5__2__Impl rule__Definition__Group_5__3 ;
    public final void rule__Definition__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1651:1: ( rule__Definition__Group_5__2__Impl rule__Definition__Group_5__3 )
            // InternalSimpleIDL.g:1652:2: rule__Definition__Group_5__2__Impl rule__Definition__Group_5__3
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
    // InternalSimpleIDL.g:1659:1: rule__Definition__Group_5__2__Impl : ( ( rule__Definition__TypeAssignment_5_2 ) ) ;
    public final void rule__Definition__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1663:1: ( ( ( rule__Definition__TypeAssignment_5_2 ) ) )
            // InternalSimpleIDL.g:1664:1: ( ( rule__Definition__TypeAssignment_5_2 ) )
            {
            // InternalSimpleIDL.g:1664:1: ( ( rule__Definition__TypeAssignment_5_2 ) )
            // InternalSimpleIDL.g:1665:2: ( rule__Definition__TypeAssignment_5_2 )
            {
             before(grammarAccess.getDefinitionAccess().getTypeAssignment_5_2()); 
            // InternalSimpleIDL.g:1666:2: ( rule__Definition__TypeAssignment_5_2 )
            // InternalSimpleIDL.g:1666:3: rule__Definition__TypeAssignment_5_2
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
    // InternalSimpleIDL.g:1674:1: rule__Definition__Group_5__3 : rule__Definition__Group_5__3__Impl rule__Definition__Group_5__4 ;
    public final void rule__Definition__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1678:1: ( rule__Definition__Group_5__3__Impl rule__Definition__Group_5__4 )
            // InternalSimpleIDL.g:1679:2: rule__Definition__Group_5__3__Impl rule__Definition__Group_5__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalSimpleIDL.g:1686:1: rule__Definition__Group_5__3__Impl : ( ( rule__Definition__NameAssignment_5_3 ) ) ;
    public final void rule__Definition__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1690:1: ( ( ( rule__Definition__NameAssignment_5_3 ) ) )
            // InternalSimpleIDL.g:1691:1: ( ( rule__Definition__NameAssignment_5_3 ) )
            {
            // InternalSimpleIDL.g:1691:1: ( ( rule__Definition__NameAssignment_5_3 ) )
            // InternalSimpleIDL.g:1692:2: ( rule__Definition__NameAssignment_5_3 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_5_3()); 
            // InternalSimpleIDL.g:1693:2: ( rule__Definition__NameAssignment_5_3 )
            // InternalSimpleIDL.g:1693:3: rule__Definition__NameAssignment_5_3
            {
            pushFollow(FOLLOW_2);
            rule__Definition__NameAssignment_5_3();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getNameAssignment_5_3()); 

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
    // InternalSimpleIDL.g:1701:1: rule__Definition__Group_5__4 : rule__Definition__Group_5__4__Impl ;
    public final void rule__Definition__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1705:1: ( rule__Definition__Group_5__4__Impl )
            // InternalSimpleIDL.g:1706:2: rule__Definition__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_5__4__Impl();

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
    // InternalSimpleIDL.g:1712:1: rule__Definition__Group_5__4__Impl : ( ';' ) ;
    public final void rule__Definition__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1716:1: ( ( ';' ) )
            // InternalSimpleIDL.g:1717:1: ( ';' )
            {
            // InternalSimpleIDL.g:1717:1: ( ';' )
            // InternalSimpleIDL.g:1718:2: ';'
            {
             before(grammarAccess.getDefinitionAccess().getSemicolonKeyword_5_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getSemicolonKeyword_5_4()); 

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


    // $ANTLR start "rule__Definition__Group_6__0"
    // InternalSimpleIDL.g:1728:1: rule__Definition__Group_6__0 : rule__Definition__Group_6__0__Impl rule__Definition__Group_6__1 ;
    public final void rule__Definition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1732:1: ( rule__Definition__Group_6__0__Impl rule__Definition__Group_6__1 )
            // InternalSimpleIDL.g:1733:2: rule__Definition__Group_6__0__Impl rule__Definition__Group_6__1
            {
            pushFollow(FOLLOW_7);
            rule__Definition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_6__1();

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
    // $ANTLR end "rule__Definition__Group_6__0"


    // $ANTLR start "rule__Definition__Group_6__0__Impl"
    // InternalSimpleIDL.g:1740:1: rule__Definition__Group_6__0__Impl : ( () ) ;
    public final void rule__Definition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1744:1: ( ( () ) )
            // InternalSimpleIDL.g:1745:1: ( () )
            {
            // InternalSimpleIDL.g:1745:1: ( () )
            // InternalSimpleIDL.g:1746:2: ()
            {
             before(grammarAccess.getDefinitionAccess().getArrayTypeAction_6_0()); 
            // InternalSimpleIDL.g:1747:2: ()
            // InternalSimpleIDL.g:1747:3: 
            {
            }

             after(grammarAccess.getDefinitionAccess().getArrayTypeAction_6_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_6__0__Impl"


    // $ANTLR start "rule__Definition__Group_6__1"
    // InternalSimpleIDL.g:1755:1: rule__Definition__Group_6__1 : rule__Definition__Group_6__1__Impl rule__Definition__Group_6__2 ;
    public final void rule__Definition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1759:1: ( rule__Definition__Group_6__1__Impl rule__Definition__Group_6__2 )
            // InternalSimpleIDL.g:1760:2: rule__Definition__Group_6__1__Impl rule__Definition__Group_6__2
            {
            pushFollow(FOLLOW_11);
            rule__Definition__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_6__2();

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
    // $ANTLR end "rule__Definition__Group_6__1"


    // $ANTLR start "rule__Definition__Group_6__1__Impl"
    // InternalSimpleIDL.g:1767:1: rule__Definition__Group_6__1__Impl : ( 'typedef' ) ;
    public final void rule__Definition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1771:1: ( ( 'typedef' ) )
            // InternalSimpleIDL.g:1772:1: ( 'typedef' )
            {
            // InternalSimpleIDL.g:1772:1: ( 'typedef' )
            // InternalSimpleIDL.g:1773:2: 'typedef'
            {
             before(grammarAccess.getDefinitionAccess().getTypedefKeyword_6_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getTypedefKeyword_6_1()); 

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
    // $ANTLR end "rule__Definition__Group_6__1__Impl"


    // $ANTLR start "rule__Definition__Group_6__2"
    // InternalSimpleIDL.g:1782:1: rule__Definition__Group_6__2 : rule__Definition__Group_6__2__Impl rule__Definition__Group_6__3 ;
    public final void rule__Definition__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1786:1: ( rule__Definition__Group_6__2__Impl rule__Definition__Group_6__3 )
            // InternalSimpleIDL.g:1787:2: rule__Definition__Group_6__2__Impl rule__Definition__Group_6__3
            {
            pushFollow(FOLLOW_5);
            rule__Definition__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_6__3();

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
    // $ANTLR end "rule__Definition__Group_6__2"


    // $ANTLR start "rule__Definition__Group_6__2__Impl"
    // InternalSimpleIDL.g:1794:1: rule__Definition__Group_6__2__Impl : ( ( rule__Definition__TypeAssignment_6_2 ) ) ;
    public final void rule__Definition__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1798:1: ( ( ( rule__Definition__TypeAssignment_6_2 ) ) )
            // InternalSimpleIDL.g:1799:1: ( ( rule__Definition__TypeAssignment_6_2 ) )
            {
            // InternalSimpleIDL.g:1799:1: ( ( rule__Definition__TypeAssignment_6_2 ) )
            // InternalSimpleIDL.g:1800:2: ( rule__Definition__TypeAssignment_6_2 )
            {
             before(grammarAccess.getDefinitionAccess().getTypeAssignment_6_2()); 
            // InternalSimpleIDL.g:1801:2: ( rule__Definition__TypeAssignment_6_2 )
            // InternalSimpleIDL.g:1801:3: rule__Definition__TypeAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Definition__TypeAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getTypeAssignment_6_2()); 

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
    // $ANTLR end "rule__Definition__Group_6__2__Impl"


    // $ANTLR start "rule__Definition__Group_6__3"
    // InternalSimpleIDL.g:1809:1: rule__Definition__Group_6__3 : rule__Definition__Group_6__3__Impl rule__Definition__Group_6__4 ;
    public final void rule__Definition__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1813:1: ( rule__Definition__Group_6__3__Impl rule__Definition__Group_6__4 )
            // InternalSimpleIDL.g:1814:2: rule__Definition__Group_6__3__Impl rule__Definition__Group_6__4
            {
            pushFollow(FOLLOW_26);
            rule__Definition__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_6__4();

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
    // $ANTLR end "rule__Definition__Group_6__3"


    // $ANTLR start "rule__Definition__Group_6__3__Impl"
    // InternalSimpleIDL.g:1821:1: rule__Definition__Group_6__3__Impl : ( ( rule__Definition__NameAssignment_6_3 ) ) ;
    public final void rule__Definition__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1825:1: ( ( ( rule__Definition__NameAssignment_6_3 ) ) )
            // InternalSimpleIDL.g:1826:1: ( ( rule__Definition__NameAssignment_6_3 ) )
            {
            // InternalSimpleIDL.g:1826:1: ( ( rule__Definition__NameAssignment_6_3 ) )
            // InternalSimpleIDL.g:1827:2: ( rule__Definition__NameAssignment_6_3 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_6_3()); 
            // InternalSimpleIDL.g:1828:2: ( rule__Definition__NameAssignment_6_3 )
            // InternalSimpleIDL.g:1828:3: rule__Definition__NameAssignment_6_3
            {
            pushFollow(FOLLOW_2);
            rule__Definition__NameAssignment_6_3();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getNameAssignment_6_3()); 

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
    // $ANTLR end "rule__Definition__Group_6__3__Impl"


    // $ANTLR start "rule__Definition__Group_6__4"
    // InternalSimpleIDL.g:1836:1: rule__Definition__Group_6__4 : rule__Definition__Group_6__4__Impl rule__Definition__Group_6__5 ;
    public final void rule__Definition__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1840:1: ( rule__Definition__Group_6__4__Impl rule__Definition__Group_6__5 )
            // InternalSimpleIDL.g:1841:2: rule__Definition__Group_6__4__Impl rule__Definition__Group_6__5
            {
            pushFollow(FOLLOW_27);
            rule__Definition__Group_6__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_6__5();

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
    // $ANTLR end "rule__Definition__Group_6__4"


    // $ANTLR start "rule__Definition__Group_6__4__Impl"
    // InternalSimpleIDL.g:1848:1: rule__Definition__Group_6__4__Impl : ( '[' ) ;
    public final void rule__Definition__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1852:1: ( ( '[' ) )
            // InternalSimpleIDL.g:1853:1: ( '[' )
            {
            // InternalSimpleIDL.g:1853:1: ( '[' )
            // InternalSimpleIDL.g:1854:2: '['
            {
             before(grammarAccess.getDefinitionAccess().getLeftSquareBracketKeyword_6_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getLeftSquareBracketKeyword_6_4()); 

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
    // $ANTLR end "rule__Definition__Group_6__4__Impl"


    // $ANTLR start "rule__Definition__Group_6__5"
    // InternalSimpleIDL.g:1863:1: rule__Definition__Group_6__5 : rule__Definition__Group_6__5__Impl rule__Definition__Group_6__6 ;
    public final void rule__Definition__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1867:1: ( rule__Definition__Group_6__5__Impl rule__Definition__Group_6__6 )
            // InternalSimpleIDL.g:1868:2: rule__Definition__Group_6__5__Impl rule__Definition__Group_6__6
            {
            pushFollow(FOLLOW_28);
            rule__Definition__Group_6__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_6__6();

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
    // $ANTLR end "rule__Definition__Group_6__5"


    // $ANTLR start "rule__Definition__Group_6__5__Impl"
    // InternalSimpleIDL.g:1875:1: rule__Definition__Group_6__5__Impl : ( ( rule__Definition__SizeAssignment_6_5 ) ) ;
    public final void rule__Definition__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1879:1: ( ( ( rule__Definition__SizeAssignment_6_5 ) ) )
            // InternalSimpleIDL.g:1880:1: ( ( rule__Definition__SizeAssignment_6_5 ) )
            {
            // InternalSimpleIDL.g:1880:1: ( ( rule__Definition__SizeAssignment_6_5 ) )
            // InternalSimpleIDL.g:1881:2: ( rule__Definition__SizeAssignment_6_5 )
            {
             before(grammarAccess.getDefinitionAccess().getSizeAssignment_6_5()); 
            // InternalSimpleIDL.g:1882:2: ( rule__Definition__SizeAssignment_6_5 )
            // InternalSimpleIDL.g:1882:3: rule__Definition__SizeAssignment_6_5
            {
            pushFollow(FOLLOW_2);
            rule__Definition__SizeAssignment_6_5();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getSizeAssignment_6_5()); 

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
    // $ANTLR end "rule__Definition__Group_6__5__Impl"


    // $ANTLR start "rule__Definition__Group_6__6"
    // InternalSimpleIDL.g:1890:1: rule__Definition__Group_6__6 : rule__Definition__Group_6__6__Impl rule__Definition__Group_6__7 ;
    public final void rule__Definition__Group_6__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1894:1: ( rule__Definition__Group_6__6__Impl rule__Definition__Group_6__7 )
            // InternalSimpleIDL.g:1895:2: rule__Definition__Group_6__6__Impl rule__Definition__Group_6__7
            {
            pushFollow(FOLLOW_9);
            rule__Definition__Group_6__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_6__7();

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
    // $ANTLR end "rule__Definition__Group_6__6"


    // $ANTLR start "rule__Definition__Group_6__6__Impl"
    // InternalSimpleIDL.g:1902:1: rule__Definition__Group_6__6__Impl : ( ']' ) ;
    public final void rule__Definition__Group_6__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1906:1: ( ( ']' ) )
            // InternalSimpleIDL.g:1907:1: ( ']' )
            {
            // InternalSimpleIDL.g:1907:1: ( ']' )
            // InternalSimpleIDL.g:1908:2: ']'
            {
             before(grammarAccess.getDefinitionAccess().getRightSquareBracketKeyword_6_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getRightSquareBracketKeyword_6_6()); 

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
    // $ANTLR end "rule__Definition__Group_6__6__Impl"


    // $ANTLR start "rule__Definition__Group_6__7"
    // InternalSimpleIDL.g:1917:1: rule__Definition__Group_6__7 : rule__Definition__Group_6__7__Impl ;
    public final void rule__Definition__Group_6__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1921:1: ( rule__Definition__Group_6__7__Impl )
            // InternalSimpleIDL.g:1922:2: rule__Definition__Group_6__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_6__7__Impl();

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
    // $ANTLR end "rule__Definition__Group_6__7"


    // $ANTLR start "rule__Definition__Group_6__7__Impl"
    // InternalSimpleIDL.g:1928:1: rule__Definition__Group_6__7__Impl : ( ';' ) ;
    public final void rule__Definition__Group_6__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1932:1: ( ( ';' ) )
            // InternalSimpleIDL.g:1933:1: ( ';' )
            {
            // InternalSimpleIDL.g:1933:1: ( ';' )
            // InternalSimpleIDL.g:1934:2: ';'
            {
             before(grammarAccess.getDefinitionAccess().getSemicolonKeyword_6_7()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getSemicolonKeyword_6_7()); 

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
    // $ANTLR end "rule__Definition__Group_6__7__Impl"


    // $ANTLR start "rule__Member__Group__0"
    // InternalSimpleIDL.g:1944:1: rule__Member__Group__0 : rule__Member__Group__0__Impl rule__Member__Group__1 ;
    public final void rule__Member__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1948:1: ( rule__Member__Group__0__Impl rule__Member__Group__1 )
            // InternalSimpleIDL.g:1949:2: rule__Member__Group__0__Impl rule__Member__Group__1
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
    // InternalSimpleIDL.g:1956:1: rule__Member__Group__0__Impl : ( ( rule__Member__TypeAssignment_0 ) ) ;
    public final void rule__Member__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1960:1: ( ( ( rule__Member__TypeAssignment_0 ) ) )
            // InternalSimpleIDL.g:1961:1: ( ( rule__Member__TypeAssignment_0 ) )
            {
            // InternalSimpleIDL.g:1961:1: ( ( rule__Member__TypeAssignment_0 ) )
            // InternalSimpleIDL.g:1962:2: ( rule__Member__TypeAssignment_0 )
            {
             before(grammarAccess.getMemberAccess().getTypeAssignment_0()); 
            // InternalSimpleIDL.g:1963:2: ( rule__Member__TypeAssignment_0 )
            // InternalSimpleIDL.g:1963:3: rule__Member__TypeAssignment_0
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
    // InternalSimpleIDL.g:1971:1: rule__Member__Group__1 : rule__Member__Group__1__Impl rule__Member__Group__2 ;
    public final void rule__Member__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1975:1: ( rule__Member__Group__1__Impl rule__Member__Group__2 )
            // InternalSimpleIDL.g:1976:2: rule__Member__Group__1__Impl rule__Member__Group__2
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
    // InternalSimpleIDL.g:1983:1: rule__Member__Group__1__Impl : ( ( rule__Member__NameAssignment_1 ) ) ;
    public final void rule__Member__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1987:1: ( ( ( rule__Member__NameAssignment_1 ) ) )
            // InternalSimpleIDL.g:1988:1: ( ( rule__Member__NameAssignment_1 ) )
            {
            // InternalSimpleIDL.g:1988:1: ( ( rule__Member__NameAssignment_1 ) )
            // InternalSimpleIDL.g:1989:2: ( rule__Member__NameAssignment_1 )
            {
             before(grammarAccess.getMemberAccess().getNameAssignment_1()); 
            // InternalSimpleIDL.g:1990:2: ( rule__Member__NameAssignment_1 )
            // InternalSimpleIDL.g:1990:3: rule__Member__NameAssignment_1
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
    // InternalSimpleIDL.g:1998:1: rule__Member__Group__2 : rule__Member__Group__2__Impl ;
    public final void rule__Member__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2002:1: ( rule__Member__Group__2__Impl )
            // InternalSimpleIDL.g:2003:2: rule__Member__Group__2__Impl
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
    // InternalSimpleIDL.g:2009:1: rule__Member__Group__2__Impl : ( ';' ) ;
    public final void rule__Member__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2013:1: ( ( ';' ) )
            // InternalSimpleIDL.g:2014:1: ( ';' )
            {
            // InternalSimpleIDL.g:2014:1: ( ';' )
            // InternalSimpleIDL.g:2015:2: ';'
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
    // InternalSimpleIDL.g:2025:1: rule__Case__Group__0 : rule__Case__Group__0__Impl rule__Case__Group__1 ;
    public final void rule__Case__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2029:1: ( rule__Case__Group__0__Impl rule__Case__Group__1 )
            // InternalSimpleIDL.g:2030:2: rule__Case__Group__0__Impl rule__Case__Group__1
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
    // InternalSimpleIDL.g:2037:1: rule__Case__Group__0__Impl : ( ( ( rule__Case__Group_0__0 ) ) ( ( rule__Case__Group_0__0 )* ) ) ;
    public final void rule__Case__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2041:1: ( ( ( ( rule__Case__Group_0__0 ) ) ( ( rule__Case__Group_0__0 )* ) ) )
            // InternalSimpleIDL.g:2042:1: ( ( ( rule__Case__Group_0__0 ) ) ( ( rule__Case__Group_0__0 )* ) )
            {
            // InternalSimpleIDL.g:2042:1: ( ( ( rule__Case__Group_0__0 ) ) ( ( rule__Case__Group_0__0 )* ) )
            // InternalSimpleIDL.g:2043:2: ( ( rule__Case__Group_0__0 ) ) ( ( rule__Case__Group_0__0 )* )
            {
            // InternalSimpleIDL.g:2043:2: ( ( rule__Case__Group_0__0 ) )
            // InternalSimpleIDL.g:2044:3: ( rule__Case__Group_0__0 )
            {
             before(grammarAccess.getCaseAccess().getGroup_0()); 
            // InternalSimpleIDL.g:2045:3: ( rule__Case__Group_0__0 )
            // InternalSimpleIDL.g:2045:4: rule__Case__Group_0__0
            {
            pushFollow(FOLLOW_20);
            rule__Case__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getGroup_0()); 

            }

            // InternalSimpleIDL.g:2048:2: ( ( rule__Case__Group_0__0 )* )
            // InternalSimpleIDL.g:2049:3: ( rule__Case__Group_0__0 )*
            {
             before(grammarAccess.getCaseAccess().getGroup_0()); 
            // InternalSimpleIDL.g:2050:3: ( rule__Case__Group_0__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==28) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSimpleIDL.g:2050:4: rule__Case__Group_0__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Case__Group_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalSimpleIDL.g:2059:1: rule__Case__Group__1 : rule__Case__Group__1__Impl rule__Case__Group__2 ;
    public final void rule__Case__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2063:1: ( rule__Case__Group__1__Impl rule__Case__Group__2 )
            // InternalSimpleIDL.g:2064:2: rule__Case__Group__1__Impl rule__Case__Group__2
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
    // InternalSimpleIDL.g:2071:1: rule__Case__Group__1__Impl : ( ( rule__Case__TypeAssignment_1 ) ) ;
    public final void rule__Case__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2075:1: ( ( ( rule__Case__TypeAssignment_1 ) ) )
            // InternalSimpleIDL.g:2076:1: ( ( rule__Case__TypeAssignment_1 ) )
            {
            // InternalSimpleIDL.g:2076:1: ( ( rule__Case__TypeAssignment_1 ) )
            // InternalSimpleIDL.g:2077:2: ( rule__Case__TypeAssignment_1 )
            {
             before(grammarAccess.getCaseAccess().getTypeAssignment_1()); 
            // InternalSimpleIDL.g:2078:2: ( rule__Case__TypeAssignment_1 )
            // InternalSimpleIDL.g:2078:3: rule__Case__TypeAssignment_1
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
    // InternalSimpleIDL.g:2086:1: rule__Case__Group__2 : rule__Case__Group__2__Impl rule__Case__Group__3 ;
    public final void rule__Case__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2090:1: ( rule__Case__Group__2__Impl rule__Case__Group__3 )
            // InternalSimpleIDL.g:2091:2: rule__Case__Group__2__Impl rule__Case__Group__3
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
    // InternalSimpleIDL.g:2098:1: rule__Case__Group__2__Impl : ( ( rule__Case__NameAssignment_2 ) ) ;
    public final void rule__Case__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2102:1: ( ( ( rule__Case__NameAssignment_2 ) ) )
            // InternalSimpleIDL.g:2103:1: ( ( rule__Case__NameAssignment_2 ) )
            {
            // InternalSimpleIDL.g:2103:1: ( ( rule__Case__NameAssignment_2 ) )
            // InternalSimpleIDL.g:2104:2: ( rule__Case__NameAssignment_2 )
            {
             before(grammarAccess.getCaseAccess().getNameAssignment_2()); 
            // InternalSimpleIDL.g:2105:2: ( rule__Case__NameAssignment_2 )
            // InternalSimpleIDL.g:2105:3: rule__Case__NameAssignment_2
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
    // InternalSimpleIDL.g:2113:1: rule__Case__Group__3 : rule__Case__Group__3__Impl ;
    public final void rule__Case__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2117:1: ( rule__Case__Group__3__Impl )
            // InternalSimpleIDL.g:2118:2: rule__Case__Group__3__Impl
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
    // InternalSimpleIDL.g:2124:1: rule__Case__Group__3__Impl : ( ';' ) ;
    public final void rule__Case__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2128:1: ( ( ';' ) )
            // InternalSimpleIDL.g:2129:1: ( ';' )
            {
            // InternalSimpleIDL.g:2129:1: ( ';' )
            // InternalSimpleIDL.g:2130:2: ';'
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
    // InternalSimpleIDL.g:2140:1: rule__Case__Group_0__0 : rule__Case__Group_0__0__Impl rule__Case__Group_0__1 ;
    public final void rule__Case__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2144:1: ( rule__Case__Group_0__0__Impl rule__Case__Group_0__1 )
            // InternalSimpleIDL.g:2145:2: rule__Case__Group_0__0__Impl rule__Case__Group_0__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalSimpleIDL.g:2152:1: rule__Case__Group_0__0__Impl : ( 'case' ) ;
    public final void rule__Case__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2156:1: ( ( 'case' ) )
            // InternalSimpleIDL.g:2157:1: ( 'case' )
            {
            // InternalSimpleIDL.g:2157:1: ( 'case' )
            // InternalSimpleIDL.g:2158:2: 'case'
            {
             before(grammarAccess.getCaseAccess().getCaseKeyword_0_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSimpleIDL.g:2167:1: rule__Case__Group_0__1 : rule__Case__Group_0__1__Impl rule__Case__Group_0__2 ;
    public final void rule__Case__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2171:1: ( rule__Case__Group_0__1__Impl rule__Case__Group_0__2 )
            // InternalSimpleIDL.g:2172:2: rule__Case__Group_0__1__Impl rule__Case__Group_0__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalSimpleIDL.g:2179:1: rule__Case__Group_0__1__Impl : ( ( rule__Case__LabelsAssignment_0_1 ) ) ;
    public final void rule__Case__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2183:1: ( ( ( rule__Case__LabelsAssignment_0_1 ) ) )
            // InternalSimpleIDL.g:2184:1: ( ( rule__Case__LabelsAssignment_0_1 ) )
            {
            // InternalSimpleIDL.g:2184:1: ( ( rule__Case__LabelsAssignment_0_1 ) )
            // InternalSimpleIDL.g:2185:2: ( rule__Case__LabelsAssignment_0_1 )
            {
             before(grammarAccess.getCaseAccess().getLabelsAssignment_0_1()); 
            // InternalSimpleIDL.g:2186:2: ( rule__Case__LabelsAssignment_0_1 )
            // InternalSimpleIDL.g:2186:3: rule__Case__LabelsAssignment_0_1
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
    // InternalSimpleIDL.g:2194:1: rule__Case__Group_0__2 : rule__Case__Group_0__2__Impl ;
    public final void rule__Case__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2198:1: ( rule__Case__Group_0__2__Impl )
            // InternalSimpleIDL.g:2199:2: rule__Case__Group_0__2__Impl
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
    // InternalSimpleIDL.g:2205:1: rule__Case__Group_0__2__Impl : ( ':' ) ;
    public final void rule__Case__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2209:1: ( ( ':' ) )
            // InternalSimpleIDL.g:2210:1: ( ':' )
            {
            // InternalSimpleIDL.g:2210:1: ( ':' )
            // InternalSimpleIDL.g:2211:2: ':'
            {
             before(grammarAccess.getCaseAccess().getColonKeyword_0_2()); 
            match(input,29,FOLLOW_2); 
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


    // $ANTLR start "rule__Type__Group_0__0"
    // InternalSimpleIDL.g:2221:1: rule__Type__Group_0__0 : rule__Type__Group_0__0__Impl rule__Type__Group_0__1 ;
    public final void rule__Type__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2225:1: ( rule__Type__Group_0__0__Impl rule__Type__Group_0__1 )
            // InternalSimpleIDL.g:2226:2: rule__Type__Group_0__0__Impl rule__Type__Group_0__1
            {
            pushFollow(FOLLOW_17);
            rule__Type__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_0__1();

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
    // $ANTLR end "rule__Type__Group_0__0"


    // $ANTLR start "rule__Type__Group_0__0__Impl"
    // InternalSimpleIDL.g:2233:1: rule__Type__Group_0__0__Impl : ( () ) ;
    public final void rule__Type__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2237:1: ( ( () ) )
            // InternalSimpleIDL.g:2238:1: ( () )
            {
            // InternalSimpleIDL.g:2238:1: ( () )
            // InternalSimpleIDL.g:2239:2: ()
            {
             before(grammarAccess.getTypeAccess().getSignedShortIntAction_0_0()); 
            // InternalSimpleIDL.g:2240:2: ()
            // InternalSimpleIDL.g:2240:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getSignedShortIntAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__0__Impl"


    // $ANTLR start "rule__Type__Group_0__1"
    // InternalSimpleIDL.g:2248:1: rule__Type__Group_0__1 : rule__Type__Group_0__1__Impl ;
    public final void rule__Type__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2252:1: ( rule__Type__Group_0__1__Impl )
            // InternalSimpleIDL.g:2253:2: rule__Type__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_0__1__Impl();

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
    // $ANTLR end "rule__Type__Group_0__1"


    // $ANTLR start "rule__Type__Group_0__1__Impl"
    // InternalSimpleIDL.g:2259:1: rule__Type__Group_0__1__Impl : ( 'short' ) ;
    public final void rule__Type__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2263:1: ( ( 'short' ) )
            // InternalSimpleIDL.g:2264:1: ( 'short' )
            {
            // InternalSimpleIDL.g:2264:1: ( 'short' )
            // InternalSimpleIDL.g:2265:2: 'short'
            {
             before(grammarAccess.getTypeAccess().getShortKeyword_0_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getShortKeyword_0_1()); 

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
    // $ANTLR end "rule__Type__Group_0__1__Impl"


    // $ANTLR start "rule__Type__Group_1__0"
    // InternalSimpleIDL.g:2275:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2279:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // InternalSimpleIDL.g:2280:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
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
    // InternalSimpleIDL.g:2287:1: rule__Type__Group_1__0__Impl : ( () ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2291:1: ( ( () ) )
            // InternalSimpleIDL.g:2292:1: ( () )
            {
            // InternalSimpleIDL.g:2292:1: ( () )
            // InternalSimpleIDL.g:2293:2: ()
            {
             before(grammarAccess.getTypeAccess().getSignedLongIntAction_1_0()); 
            // InternalSimpleIDL.g:2294:2: ()
            // InternalSimpleIDL.g:2294:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getSignedLongIntAction_1_0()); 

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
    // InternalSimpleIDL.g:2302:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2306:1: ( rule__Type__Group_1__1__Impl )
            // InternalSimpleIDL.g:2307:2: rule__Type__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_1__1__Impl();

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
    // InternalSimpleIDL.g:2313:1: rule__Type__Group_1__1__Impl : ( 'long' ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2317:1: ( ( 'long' ) )
            // InternalSimpleIDL.g:2318:1: ( 'long' )
            {
            // InternalSimpleIDL.g:2318:1: ( 'long' )
            // InternalSimpleIDL.g:2319:2: 'long'
            {
             before(grammarAccess.getTypeAccess().getLongKeyword_1_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLongKeyword_1_1()); 

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


    // $ANTLR start "rule__Type__Group_2__0"
    // InternalSimpleIDL.g:2329:1: rule__Type__Group_2__0 : rule__Type__Group_2__0__Impl rule__Type__Group_2__1 ;
    public final void rule__Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2333:1: ( rule__Type__Group_2__0__Impl rule__Type__Group_2__1 )
            // InternalSimpleIDL.g:2334:2: rule__Type__Group_2__0__Impl rule__Type__Group_2__1
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
    // InternalSimpleIDL.g:2341:1: rule__Type__Group_2__0__Impl : ( () ) ;
    public final void rule__Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2345:1: ( ( () ) )
            // InternalSimpleIDL.g:2346:1: ( () )
            {
            // InternalSimpleIDL.g:2346:1: ( () )
            // InternalSimpleIDL.g:2347:2: ()
            {
             before(grammarAccess.getTypeAccess().getSignedLongLongIntAction_2_0()); 
            // InternalSimpleIDL.g:2348:2: ()
            // InternalSimpleIDL.g:2348:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getSignedLongLongIntAction_2_0()); 

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
    // InternalSimpleIDL.g:2356:1: rule__Type__Group_2__1 : rule__Type__Group_2__1__Impl rule__Type__Group_2__2 ;
    public final void rule__Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2360:1: ( rule__Type__Group_2__1__Impl rule__Type__Group_2__2 )
            // InternalSimpleIDL.g:2361:2: rule__Type__Group_2__1__Impl rule__Type__Group_2__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalSimpleIDL.g:2368:1: rule__Type__Group_2__1__Impl : ( 'long' ) ;
    public final void rule__Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2372:1: ( ( 'long' ) )
            // InternalSimpleIDL.g:2373:1: ( 'long' )
            {
            // InternalSimpleIDL.g:2373:1: ( 'long' )
            // InternalSimpleIDL.g:2374:2: 'long'
            {
             before(grammarAccess.getTypeAccess().getLongKeyword_2_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLongKeyword_2_1()); 

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
    // InternalSimpleIDL.g:2383:1: rule__Type__Group_2__2 : rule__Type__Group_2__2__Impl ;
    public final void rule__Type__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2387:1: ( rule__Type__Group_2__2__Impl )
            // InternalSimpleIDL.g:2388:2: rule__Type__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_2__2__Impl();

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
    // InternalSimpleIDL.g:2394:1: rule__Type__Group_2__2__Impl : ( 'long' ) ;
    public final void rule__Type__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2398:1: ( ( 'long' ) )
            // InternalSimpleIDL.g:2399:1: ( 'long' )
            {
            // InternalSimpleIDL.g:2399:1: ( 'long' )
            // InternalSimpleIDL.g:2400:2: 'long'
            {
             before(grammarAccess.getTypeAccess().getLongKeyword_2_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLongKeyword_2_2()); 

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


    // $ANTLR start "rule__Type__Group_3__0"
    // InternalSimpleIDL.g:2410:1: rule__Type__Group_3__0 : rule__Type__Group_3__0__Impl rule__Type__Group_3__1 ;
    public final void rule__Type__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2414:1: ( rule__Type__Group_3__0__Impl rule__Type__Group_3__1 )
            // InternalSimpleIDL.g:2415:2: rule__Type__Group_3__0__Impl rule__Type__Group_3__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSimpleIDL.g:2422:1: rule__Type__Group_3__0__Impl : ( () ) ;
    public final void rule__Type__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2426:1: ( ( () ) )
            // InternalSimpleIDL.g:2427:1: ( () )
            {
            // InternalSimpleIDL.g:2427:1: ( () )
            // InternalSimpleIDL.g:2428:2: ()
            {
             before(grammarAccess.getTypeAccess().getUnsignedShortIntAction_3_0()); 
            // InternalSimpleIDL.g:2429:2: ()
            // InternalSimpleIDL.g:2429:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getUnsignedShortIntAction_3_0()); 

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
    // InternalSimpleIDL.g:2437:1: rule__Type__Group_3__1 : rule__Type__Group_3__1__Impl rule__Type__Group_3__2 ;
    public final void rule__Type__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2441:1: ( rule__Type__Group_3__1__Impl rule__Type__Group_3__2 )
            // InternalSimpleIDL.g:2442:2: rule__Type__Group_3__1__Impl rule__Type__Group_3__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalSimpleIDL.g:2449:1: rule__Type__Group_3__1__Impl : ( 'unsigned' ) ;
    public final void rule__Type__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2453:1: ( ( 'unsigned' ) )
            // InternalSimpleIDL.g:2454:1: ( 'unsigned' )
            {
            // InternalSimpleIDL.g:2454:1: ( 'unsigned' )
            // InternalSimpleIDL.g:2455:2: 'unsigned'
            {
             before(grammarAccess.getTypeAccess().getUnsignedKeyword_3_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getUnsignedKeyword_3_1()); 

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
    // InternalSimpleIDL.g:2464:1: rule__Type__Group_3__2 : rule__Type__Group_3__2__Impl ;
    public final void rule__Type__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2468:1: ( rule__Type__Group_3__2__Impl )
            // InternalSimpleIDL.g:2469:2: rule__Type__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_3__2__Impl();

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
    // InternalSimpleIDL.g:2475:1: rule__Type__Group_3__2__Impl : ( 'short' ) ;
    public final void rule__Type__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2479:1: ( ( 'short' ) )
            // InternalSimpleIDL.g:2480:1: ( 'short' )
            {
            // InternalSimpleIDL.g:2480:1: ( 'short' )
            // InternalSimpleIDL.g:2481:2: 'short'
            {
             before(grammarAccess.getTypeAccess().getShortKeyword_3_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getShortKeyword_3_2()); 

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


    // $ANTLR start "rule__Type__Group_4__0"
    // InternalSimpleIDL.g:2491:1: rule__Type__Group_4__0 : rule__Type__Group_4__0__Impl rule__Type__Group_4__1 ;
    public final void rule__Type__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2495:1: ( rule__Type__Group_4__0__Impl rule__Type__Group_4__1 )
            // InternalSimpleIDL.g:2496:2: rule__Type__Group_4__0__Impl rule__Type__Group_4__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSimpleIDL.g:2503:1: rule__Type__Group_4__0__Impl : ( () ) ;
    public final void rule__Type__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2507:1: ( ( () ) )
            // InternalSimpleIDL.g:2508:1: ( () )
            {
            // InternalSimpleIDL.g:2508:1: ( () )
            // InternalSimpleIDL.g:2509:2: ()
            {
             before(grammarAccess.getTypeAccess().getUnsignedLongIntAction_4_0()); 
            // InternalSimpleIDL.g:2510:2: ()
            // InternalSimpleIDL.g:2510:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getUnsignedLongIntAction_4_0()); 

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
    // InternalSimpleIDL.g:2518:1: rule__Type__Group_4__1 : rule__Type__Group_4__1__Impl rule__Type__Group_4__2 ;
    public final void rule__Type__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2522:1: ( rule__Type__Group_4__1__Impl rule__Type__Group_4__2 )
            // InternalSimpleIDL.g:2523:2: rule__Type__Group_4__1__Impl rule__Type__Group_4__2
            {
            pushFollow(FOLLOW_30);
            rule__Type__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_4__2();

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
    // InternalSimpleIDL.g:2530:1: rule__Type__Group_4__1__Impl : ( 'unsigned' ) ;
    public final void rule__Type__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2534:1: ( ( 'unsigned' ) )
            // InternalSimpleIDL.g:2535:1: ( 'unsigned' )
            {
            // InternalSimpleIDL.g:2535:1: ( 'unsigned' )
            // InternalSimpleIDL.g:2536:2: 'unsigned'
            {
             before(grammarAccess.getTypeAccess().getUnsignedKeyword_4_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getUnsignedKeyword_4_1()); 

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


    // $ANTLR start "rule__Type__Group_4__2"
    // InternalSimpleIDL.g:2545:1: rule__Type__Group_4__2 : rule__Type__Group_4__2__Impl ;
    public final void rule__Type__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2549:1: ( rule__Type__Group_4__2__Impl )
            // InternalSimpleIDL.g:2550:2: rule__Type__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_4__2__Impl();

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
    // $ANTLR end "rule__Type__Group_4__2"


    // $ANTLR start "rule__Type__Group_4__2__Impl"
    // InternalSimpleIDL.g:2556:1: rule__Type__Group_4__2__Impl : ( 'long' ) ;
    public final void rule__Type__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2560:1: ( ( 'long' ) )
            // InternalSimpleIDL.g:2561:1: ( 'long' )
            {
            // InternalSimpleIDL.g:2561:1: ( 'long' )
            // InternalSimpleIDL.g:2562:2: 'long'
            {
             before(grammarAccess.getTypeAccess().getLongKeyword_4_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLongKeyword_4_2()); 

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
    // $ANTLR end "rule__Type__Group_4__2__Impl"


    // $ANTLR start "rule__Type__Group_5__0"
    // InternalSimpleIDL.g:2572:1: rule__Type__Group_5__0 : rule__Type__Group_5__0__Impl rule__Type__Group_5__1 ;
    public final void rule__Type__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2576:1: ( rule__Type__Group_5__0__Impl rule__Type__Group_5__1 )
            // InternalSimpleIDL.g:2577:2: rule__Type__Group_5__0__Impl rule__Type__Group_5__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSimpleIDL.g:2584:1: rule__Type__Group_5__0__Impl : ( () ) ;
    public final void rule__Type__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2588:1: ( ( () ) )
            // InternalSimpleIDL.g:2589:1: ( () )
            {
            // InternalSimpleIDL.g:2589:1: ( () )
            // InternalSimpleIDL.g:2590:2: ()
            {
             before(grammarAccess.getTypeAccess().getUnsignedLongLongIntAction_5_0()); 
            // InternalSimpleIDL.g:2591:2: ()
            // InternalSimpleIDL.g:2591:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getUnsignedLongLongIntAction_5_0()); 

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
    // InternalSimpleIDL.g:2599:1: rule__Type__Group_5__1 : rule__Type__Group_5__1__Impl rule__Type__Group_5__2 ;
    public final void rule__Type__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2603:1: ( rule__Type__Group_5__1__Impl rule__Type__Group_5__2 )
            // InternalSimpleIDL.g:2604:2: rule__Type__Group_5__1__Impl rule__Type__Group_5__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalSimpleIDL.g:2611:1: rule__Type__Group_5__1__Impl : ( 'unsigned' ) ;
    public final void rule__Type__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2615:1: ( ( 'unsigned' ) )
            // InternalSimpleIDL.g:2616:1: ( 'unsigned' )
            {
            // InternalSimpleIDL.g:2616:1: ( 'unsigned' )
            // InternalSimpleIDL.g:2617:2: 'unsigned'
            {
             before(grammarAccess.getTypeAccess().getUnsignedKeyword_5_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getUnsignedKeyword_5_1()); 

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
    // InternalSimpleIDL.g:2626:1: rule__Type__Group_5__2 : rule__Type__Group_5__2__Impl rule__Type__Group_5__3 ;
    public final void rule__Type__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2630:1: ( rule__Type__Group_5__2__Impl rule__Type__Group_5__3 )
            // InternalSimpleIDL.g:2631:2: rule__Type__Group_5__2__Impl rule__Type__Group_5__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalSimpleIDL.g:2638:1: rule__Type__Group_5__2__Impl : ( 'long' ) ;
    public final void rule__Type__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2642:1: ( ( 'long' ) )
            // InternalSimpleIDL.g:2643:1: ( 'long' )
            {
            // InternalSimpleIDL.g:2643:1: ( 'long' )
            // InternalSimpleIDL.g:2644:2: 'long'
            {
             before(grammarAccess.getTypeAccess().getLongKeyword_5_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLongKeyword_5_2()); 

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
    // InternalSimpleIDL.g:2653:1: rule__Type__Group_5__3 : rule__Type__Group_5__3__Impl ;
    public final void rule__Type__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2657:1: ( rule__Type__Group_5__3__Impl )
            // InternalSimpleIDL.g:2658:2: rule__Type__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_5__3__Impl();

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
    // InternalSimpleIDL.g:2664:1: rule__Type__Group_5__3__Impl : ( 'long' ) ;
    public final void rule__Type__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2668:1: ( ( 'long' ) )
            // InternalSimpleIDL.g:2669:1: ( 'long' )
            {
            // InternalSimpleIDL.g:2669:1: ( 'long' )
            // InternalSimpleIDL.g:2670:2: 'long'
            {
             before(grammarAccess.getTypeAccess().getLongKeyword_5_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLongKeyword_5_3()); 

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


    // $ANTLR start "rule__Type__Group_6__0"
    // InternalSimpleIDL.g:2680:1: rule__Type__Group_6__0 : rule__Type__Group_6__0__Impl rule__Type__Group_6__1 ;
    public final void rule__Type__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2684:1: ( rule__Type__Group_6__0__Impl rule__Type__Group_6__1 )
            // InternalSimpleIDL.g:2685:2: rule__Type__Group_6__0__Impl rule__Type__Group_6__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalSimpleIDL.g:2692:1: rule__Type__Group_6__0__Impl : ( () ) ;
    public final void rule__Type__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2696:1: ( ( () ) )
            // InternalSimpleIDL.g:2697:1: ( () )
            {
            // InternalSimpleIDL.g:2697:1: ( () )
            // InternalSimpleIDL.g:2698:2: ()
            {
             before(grammarAccess.getTypeAccess().getFloatTypeAction_6_0()); 
            // InternalSimpleIDL.g:2699:2: ()
            // InternalSimpleIDL.g:2699:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getFloatTypeAction_6_0()); 

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
    // InternalSimpleIDL.g:2707:1: rule__Type__Group_6__1 : rule__Type__Group_6__1__Impl ;
    public final void rule__Type__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2711:1: ( rule__Type__Group_6__1__Impl )
            // InternalSimpleIDL.g:2712:2: rule__Type__Group_6__1__Impl
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
    // InternalSimpleIDL.g:2718:1: rule__Type__Group_6__1__Impl : ( 'float' ) ;
    public final void rule__Type__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2722:1: ( ( 'float' ) )
            // InternalSimpleIDL.g:2723:1: ( 'float' )
            {
            // InternalSimpleIDL.g:2723:1: ( 'float' )
            // InternalSimpleIDL.g:2724:2: 'float'
            {
             before(grammarAccess.getTypeAccess().getFloatKeyword_6_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getFloatKeyword_6_1()); 

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
    // InternalSimpleIDL.g:2734:1: rule__Type__Group_7__0 : rule__Type__Group_7__0__Impl rule__Type__Group_7__1 ;
    public final void rule__Type__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2738:1: ( rule__Type__Group_7__0__Impl rule__Type__Group_7__1 )
            // InternalSimpleIDL.g:2739:2: rule__Type__Group_7__0__Impl rule__Type__Group_7__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalSimpleIDL.g:2746:1: rule__Type__Group_7__0__Impl : ( () ) ;
    public final void rule__Type__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2750:1: ( ( () ) )
            // InternalSimpleIDL.g:2751:1: ( () )
            {
            // InternalSimpleIDL.g:2751:1: ( () )
            // InternalSimpleIDL.g:2752:2: ()
            {
             before(grammarAccess.getTypeAccess().getDoubleTypeAction_7_0()); 
            // InternalSimpleIDL.g:2753:2: ()
            // InternalSimpleIDL.g:2753:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getDoubleTypeAction_7_0()); 

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
    // InternalSimpleIDL.g:2761:1: rule__Type__Group_7__1 : rule__Type__Group_7__1__Impl ;
    public final void rule__Type__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2765:1: ( rule__Type__Group_7__1__Impl )
            // InternalSimpleIDL.g:2766:2: rule__Type__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_7__1__Impl();

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
    // InternalSimpleIDL.g:2772:1: rule__Type__Group_7__1__Impl : ( 'double' ) ;
    public final void rule__Type__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2776:1: ( ( 'double' ) )
            // InternalSimpleIDL.g:2777:1: ( 'double' )
            {
            // InternalSimpleIDL.g:2777:1: ( 'double' )
            // InternalSimpleIDL.g:2778:2: 'double'
            {
             before(grammarAccess.getTypeAccess().getDoubleKeyword_7_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getDoubleKeyword_7_1()); 

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


    // $ANTLR start "rule__Type__Group_8__0"
    // InternalSimpleIDL.g:2788:1: rule__Type__Group_8__0 : rule__Type__Group_8__0__Impl rule__Type__Group_8__1 ;
    public final void rule__Type__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2792:1: ( rule__Type__Group_8__0__Impl rule__Type__Group_8__1 )
            // InternalSimpleIDL.g:2793:2: rule__Type__Group_8__0__Impl rule__Type__Group_8__1
            {
            pushFollow(FOLLOW_30);
            rule__Type__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_8__1();

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
    // $ANTLR end "rule__Type__Group_8__0"


    // $ANTLR start "rule__Type__Group_8__0__Impl"
    // InternalSimpleIDL.g:2800:1: rule__Type__Group_8__0__Impl : ( () ) ;
    public final void rule__Type__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2804:1: ( ( () ) )
            // InternalSimpleIDL.g:2805:1: ( () )
            {
            // InternalSimpleIDL.g:2805:1: ( () )
            // InternalSimpleIDL.g:2806:2: ()
            {
             before(grammarAccess.getTypeAccess().getLongDoubleTypeAction_8_0()); 
            // InternalSimpleIDL.g:2807:2: ()
            // InternalSimpleIDL.g:2807:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getLongDoubleTypeAction_8_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_8__0__Impl"


    // $ANTLR start "rule__Type__Group_8__1"
    // InternalSimpleIDL.g:2815:1: rule__Type__Group_8__1 : rule__Type__Group_8__1__Impl rule__Type__Group_8__2 ;
    public final void rule__Type__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2819:1: ( rule__Type__Group_8__1__Impl rule__Type__Group_8__2 )
            // InternalSimpleIDL.g:2820:2: rule__Type__Group_8__1__Impl rule__Type__Group_8__2
            {
            pushFollow(FOLLOW_32);
            rule__Type__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_8__2();

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
    // $ANTLR end "rule__Type__Group_8__1"


    // $ANTLR start "rule__Type__Group_8__1__Impl"
    // InternalSimpleIDL.g:2827:1: rule__Type__Group_8__1__Impl : ( 'long' ) ;
    public final void rule__Type__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2831:1: ( ( 'long' ) )
            // InternalSimpleIDL.g:2832:1: ( 'long' )
            {
            // InternalSimpleIDL.g:2832:1: ( 'long' )
            // InternalSimpleIDL.g:2833:2: 'long'
            {
             before(grammarAccess.getTypeAccess().getLongKeyword_8_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLongKeyword_8_1()); 

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
    // $ANTLR end "rule__Type__Group_8__1__Impl"


    // $ANTLR start "rule__Type__Group_8__2"
    // InternalSimpleIDL.g:2842:1: rule__Type__Group_8__2 : rule__Type__Group_8__2__Impl ;
    public final void rule__Type__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2846:1: ( rule__Type__Group_8__2__Impl )
            // InternalSimpleIDL.g:2847:2: rule__Type__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_8__2__Impl();

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
    // $ANTLR end "rule__Type__Group_8__2"


    // $ANTLR start "rule__Type__Group_8__2__Impl"
    // InternalSimpleIDL.g:2853:1: rule__Type__Group_8__2__Impl : ( 'double' ) ;
    public final void rule__Type__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2857:1: ( ( 'double' ) )
            // InternalSimpleIDL.g:2858:1: ( 'double' )
            {
            // InternalSimpleIDL.g:2858:1: ( 'double' )
            // InternalSimpleIDL.g:2859:2: 'double'
            {
             before(grammarAccess.getTypeAccess().getDoubleKeyword_8_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getDoubleKeyword_8_2()); 

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
    // $ANTLR end "rule__Type__Group_8__2__Impl"


    // $ANTLR start "rule__Type__Group_9__0"
    // InternalSimpleIDL.g:2869:1: rule__Type__Group_9__0 : rule__Type__Group_9__0__Impl rule__Type__Group_9__1 ;
    public final void rule__Type__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2873:1: ( rule__Type__Group_9__0__Impl rule__Type__Group_9__1 )
            // InternalSimpleIDL.g:2874:2: rule__Type__Group_9__0__Impl rule__Type__Group_9__1
            {
            pushFollow(FOLLOW_33);
            rule__Type__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_9__1();

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
    // $ANTLR end "rule__Type__Group_9__0"


    // $ANTLR start "rule__Type__Group_9__0__Impl"
    // InternalSimpleIDL.g:2881:1: rule__Type__Group_9__0__Impl : ( () ) ;
    public final void rule__Type__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2885:1: ( ( () ) )
            // InternalSimpleIDL.g:2886:1: ( () )
            {
            // InternalSimpleIDL.g:2886:1: ( () )
            // InternalSimpleIDL.g:2887:2: ()
            {
             before(grammarAccess.getTypeAccess().getCharTypeAction_9_0()); 
            // InternalSimpleIDL.g:2888:2: ()
            // InternalSimpleIDL.g:2888:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getCharTypeAction_9_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_9__0__Impl"


    // $ANTLR start "rule__Type__Group_9__1"
    // InternalSimpleIDL.g:2896:1: rule__Type__Group_9__1 : rule__Type__Group_9__1__Impl ;
    public final void rule__Type__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2900:1: ( rule__Type__Group_9__1__Impl )
            // InternalSimpleIDL.g:2901:2: rule__Type__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_9__1__Impl();

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
    // $ANTLR end "rule__Type__Group_9__1"


    // $ANTLR start "rule__Type__Group_9__1__Impl"
    // InternalSimpleIDL.g:2907:1: rule__Type__Group_9__1__Impl : ( 'char' ) ;
    public final void rule__Type__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2911:1: ( ( 'char' ) )
            // InternalSimpleIDL.g:2912:1: ( 'char' )
            {
            // InternalSimpleIDL.g:2912:1: ( 'char' )
            // InternalSimpleIDL.g:2913:2: 'char'
            {
             before(grammarAccess.getTypeAccess().getCharKeyword_9_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getCharKeyword_9_1()); 

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
    // $ANTLR end "rule__Type__Group_9__1__Impl"


    // $ANTLR start "rule__Type__Group_10__0"
    // InternalSimpleIDL.g:2923:1: rule__Type__Group_10__0 : rule__Type__Group_10__0__Impl rule__Type__Group_10__1 ;
    public final void rule__Type__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2927:1: ( rule__Type__Group_10__0__Impl rule__Type__Group_10__1 )
            // InternalSimpleIDL.g:2928:2: rule__Type__Group_10__0__Impl rule__Type__Group_10__1
            {
            pushFollow(FOLLOW_34);
            rule__Type__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_10__1();

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
    // $ANTLR end "rule__Type__Group_10__0"


    // $ANTLR start "rule__Type__Group_10__0__Impl"
    // InternalSimpleIDL.g:2935:1: rule__Type__Group_10__0__Impl : ( () ) ;
    public final void rule__Type__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2939:1: ( ( () ) )
            // InternalSimpleIDL.g:2940:1: ( () )
            {
            // InternalSimpleIDL.g:2940:1: ( () )
            // InternalSimpleIDL.g:2941:2: ()
            {
             before(grammarAccess.getTypeAccess().getWideCharTypeAction_10_0()); 
            // InternalSimpleIDL.g:2942:2: ()
            // InternalSimpleIDL.g:2942:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getWideCharTypeAction_10_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_10__0__Impl"


    // $ANTLR start "rule__Type__Group_10__1"
    // InternalSimpleIDL.g:2950:1: rule__Type__Group_10__1 : rule__Type__Group_10__1__Impl ;
    public final void rule__Type__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2954:1: ( rule__Type__Group_10__1__Impl )
            // InternalSimpleIDL.g:2955:2: rule__Type__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_10__1__Impl();

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
    // $ANTLR end "rule__Type__Group_10__1"


    // $ANTLR start "rule__Type__Group_10__1__Impl"
    // InternalSimpleIDL.g:2961:1: rule__Type__Group_10__1__Impl : ( 'wchar' ) ;
    public final void rule__Type__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2965:1: ( ( 'wchar' ) )
            // InternalSimpleIDL.g:2966:1: ( 'wchar' )
            {
            // InternalSimpleIDL.g:2966:1: ( 'wchar' )
            // InternalSimpleIDL.g:2967:2: 'wchar'
            {
             before(grammarAccess.getTypeAccess().getWcharKeyword_10_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getWcharKeyword_10_1()); 

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
    // $ANTLR end "rule__Type__Group_10__1__Impl"


    // $ANTLR start "rule__Type__Group_11__0"
    // InternalSimpleIDL.g:2977:1: rule__Type__Group_11__0 : rule__Type__Group_11__0__Impl rule__Type__Group_11__1 ;
    public final void rule__Type__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2981:1: ( rule__Type__Group_11__0__Impl rule__Type__Group_11__1 )
            // InternalSimpleIDL.g:2982:2: rule__Type__Group_11__0__Impl rule__Type__Group_11__1
            {
            pushFollow(FOLLOW_35);
            rule__Type__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_11__1();

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
    // $ANTLR end "rule__Type__Group_11__0"


    // $ANTLR start "rule__Type__Group_11__0__Impl"
    // InternalSimpleIDL.g:2989:1: rule__Type__Group_11__0__Impl : ( () ) ;
    public final void rule__Type__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2993:1: ( ( () ) )
            // InternalSimpleIDL.g:2994:1: ( () )
            {
            // InternalSimpleIDL.g:2994:1: ( () )
            // InternalSimpleIDL.g:2995:2: ()
            {
             before(grammarAccess.getTypeAccess().getBooleanTypeAction_11_0()); 
            // InternalSimpleIDL.g:2996:2: ()
            // InternalSimpleIDL.g:2996:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getBooleanTypeAction_11_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_11__0__Impl"


    // $ANTLR start "rule__Type__Group_11__1"
    // InternalSimpleIDL.g:3004:1: rule__Type__Group_11__1 : rule__Type__Group_11__1__Impl ;
    public final void rule__Type__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3008:1: ( rule__Type__Group_11__1__Impl )
            // InternalSimpleIDL.g:3009:2: rule__Type__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_11__1__Impl();

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
    // $ANTLR end "rule__Type__Group_11__1"


    // $ANTLR start "rule__Type__Group_11__1__Impl"
    // InternalSimpleIDL.g:3015:1: rule__Type__Group_11__1__Impl : ( 'boolean' ) ;
    public final void rule__Type__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3019:1: ( ( 'boolean' ) )
            // InternalSimpleIDL.g:3020:1: ( 'boolean' )
            {
            // InternalSimpleIDL.g:3020:1: ( 'boolean' )
            // InternalSimpleIDL.g:3021:2: 'boolean'
            {
             before(grammarAccess.getTypeAccess().getBooleanKeyword_11_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getBooleanKeyword_11_1()); 

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
    // $ANTLR end "rule__Type__Group_11__1__Impl"


    // $ANTLR start "rule__Type__Group_12__0"
    // InternalSimpleIDL.g:3031:1: rule__Type__Group_12__0 : rule__Type__Group_12__0__Impl rule__Type__Group_12__1 ;
    public final void rule__Type__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3035:1: ( rule__Type__Group_12__0__Impl rule__Type__Group_12__1 )
            // InternalSimpleIDL.g:3036:2: rule__Type__Group_12__0__Impl rule__Type__Group_12__1
            {
            pushFollow(FOLLOW_36);
            rule__Type__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_12__1();

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
    // $ANTLR end "rule__Type__Group_12__0"


    // $ANTLR start "rule__Type__Group_12__0__Impl"
    // InternalSimpleIDL.g:3043:1: rule__Type__Group_12__0__Impl : ( () ) ;
    public final void rule__Type__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3047:1: ( ( () ) )
            // InternalSimpleIDL.g:3048:1: ( () )
            {
            // InternalSimpleIDL.g:3048:1: ( () )
            // InternalSimpleIDL.g:3049:2: ()
            {
             before(grammarAccess.getTypeAccess().getOctetTypeAction_12_0()); 
            // InternalSimpleIDL.g:3050:2: ()
            // InternalSimpleIDL.g:3050:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getOctetTypeAction_12_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_12__0__Impl"


    // $ANTLR start "rule__Type__Group_12__1"
    // InternalSimpleIDL.g:3058:1: rule__Type__Group_12__1 : rule__Type__Group_12__1__Impl ;
    public final void rule__Type__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3062:1: ( rule__Type__Group_12__1__Impl )
            // InternalSimpleIDL.g:3063:2: rule__Type__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_12__1__Impl();

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
    // $ANTLR end "rule__Type__Group_12__1"


    // $ANTLR start "rule__Type__Group_12__1__Impl"
    // InternalSimpleIDL.g:3069:1: rule__Type__Group_12__1__Impl : ( 'octet' ) ;
    public final void rule__Type__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3073:1: ( ( 'octet' ) )
            // InternalSimpleIDL.g:3074:1: ( 'octet' )
            {
            // InternalSimpleIDL.g:3074:1: ( 'octet' )
            // InternalSimpleIDL.g:3075:2: 'octet'
            {
             before(grammarAccess.getTypeAccess().getOctetKeyword_12_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getOctetKeyword_12_1()); 

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
    // $ANTLR end "rule__Type__Group_12__1__Impl"


    // $ANTLR start "rule__Type__Group_13__0"
    // InternalSimpleIDL.g:3085:1: rule__Type__Group_13__0 : rule__Type__Group_13__0__Impl rule__Type__Group_13__1 ;
    public final void rule__Type__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3089:1: ( rule__Type__Group_13__0__Impl rule__Type__Group_13__1 )
            // InternalSimpleIDL.g:3090:2: rule__Type__Group_13__0__Impl rule__Type__Group_13__1
            {
            pushFollow(FOLLOW_11);
            rule__Type__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_13__1();

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
    // $ANTLR end "rule__Type__Group_13__0"


    // $ANTLR start "rule__Type__Group_13__0__Impl"
    // InternalSimpleIDL.g:3097:1: rule__Type__Group_13__0__Impl : ( () ) ;
    public final void rule__Type__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3101:1: ( ( () ) )
            // InternalSimpleIDL.g:3102:1: ( () )
            {
            // InternalSimpleIDL.g:3102:1: ( () )
            // InternalSimpleIDL.g:3103:2: ()
            {
             before(grammarAccess.getTypeAccess().getReferencedTypeAction_13_0()); 
            // InternalSimpleIDL.g:3104:2: ()
            // InternalSimpleIDL.g:3104:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getReferencedTypeAction_13_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_13__0__Impl"


    // $ANTLR start "rule__Type__Group_13__1"
    // InternalSimpleIDL.g:3112:1: rule__Type__Group_13__1 : rule__Type__Group_13__1__Impl ;
    public final void rule__Type__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3116:1: ( rule__Type__Group_13__1__Impl )
            // InternalSimpleIDL.g:3117:2: rule__Type__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_13__1__Impl();

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
    // $ANTLR end "rule__Type__Group_13__1"


    // $ANTLR start "rule__Type__Group_13__1__Impl"
    // InternalSimpleIDL.g:3123:1: rule__Type__Group_13__1__Impl : ( ( rule__Type__TypeAssignment_13_1 ) ) ;
    public final void rule__Type__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3127:1: ( ( ( rule__Type__TypeAssignment_13_1 ) ) )
            // InternalSimpleIDL.g:3128:1: ( ( rule__Type__TypeAssignment_13_1 ) )
            {
            // InternalSimpleIDL.g:3128:1: ( ( rule__Type__TypeAssignment_13_1 ) )
            // InternalSimpleIDL.g:3129:2: ( rule__Type__TypeAssignment_13_1 )
            {
             before(grammarAccess.getTypeAccess().getTypeAssignment_13_1()); 
            // InternalSimpleIDL.g:3130:2: ( rule__Type__TypeAssignment_13_1 )
            // InternalSimpleIDL.g:3130:3: rule__Type__TypeAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__TypeAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getTypeAssignment_13_1()); 

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
    // $ANTLR end "rule__Type__Group_13__1__Impl"


    // $ANTLR start "rule__Type__Group_14__0"
    // InternalSimpleIDL.g:3139:1: rule__Type__Group_14__0 : rule__Type__Group_14__0__Impl rule__Type__Group_14__1 ;
    public final void rule__Type__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3143:1: ( rule__Type__Group_14__0__Impl rule__Type__Group_14__1 )
            // InternalSimpleIDL.g:3144:2: rule__Type__Group_14__0__Impl rule__Type__Group_14__1
            {
            pushFollow(FOLLOW_37);
            rule__Type__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_14__1();

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
    // $ANTLR end "rule__Type__Group_14__0"


    // $ANTLR start "rule__Type__Group_14__0__Impl"
    // InternalSimpleIDL.g:3151:1: rule__Type__Group_14__0__Impl : ( () ) ;
    public final void rule__Type__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3155:1: ( ( () ) )
            // InternalSimpleIDL.g:3156:1: ( () )
            {
            // InternalSimpleIDL.g:3156:1: ( () )
            // InternalSimpleIDL.g:3157:2: ()
            {
             before(grammarAccess.getTypeAccess().getBoundedSequenceAction_14_0()); 
            // InternalSimpleIDL.g:3158:2: ()
            // InternalSimpleIDL.g:3158:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getBoundedSequenceAction_14_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_14__0__Impl"


    // $ANTLR start "rule__Type__Group_14__1"
    // InternalSimpleIDL.g:3166:1: rule__Type__Group_14__1 : rule__Type__Group_14__1__Impl rule__Type__Group_14__2 ;
    public final void rule__Type__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3170:1: ( rule__Type__Group_14__1__Impl rule__Type__Group_14__2 )
            // InternalSimpleIDL.g:3171:2: rule__Type__Group_14__1__Impl rule__Type__Group_14__2
            {
            pushFollow(FOLLOW_38);
            rule__Type__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_14__2();

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
    // $ANTLR end "rule__Type__Group_14__1"


    // $ANTLR start "rule__Type__Group_14__1__Impl"
    // InternalSimpleIDL.g:3178:1: rule__Type__Group_14__1__Impl : ( 'sequence' ) ;
    public final void rule__Type__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3182:1: ( ( 'sequence' ) )
            // InternalSimpleIDL.g:3183:1: ( 'sequence' )
            {
            // InternalSimpleIDL.g:3183:1: ( 'sequence' )
            // InternalSimpleIDL.g:3184:2: 'sequence'
            {
             before(grammarAccess.getTypeAccess().getSequenceKeyword_14_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getSequenceKeyword_14_1()); 

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
    // $ANTLR end "rule__Type__Group_14__1__Impl"


    // $ANTLR start "rule__Type__Group_14__2"
    // InternalSimpleIDL.g:3193:1: rule__Type__Group_14__2 : rule__Type__Group_14__2__Impl rule__Type__Group_14__3 ;
    public final void rule__Type__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3197:1: ( rule__Type__Group_14__2__Impl rule__Type__Group_14__3 )
            // InternalSimpleIDL.g:3198:2: rule__Type__Group_14__2__Impl rule__Type__Group_14__3
            {
            pushFollow(FOLLOW_11);
            rule__Type__Group_14__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_14__3();

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
    // $ANTLR end "rule__Type__Group_14__2"


    // $ANTLR start "rule__Type__Group_14__2__Impl"
    // InternalSimpleIDL.g:3205:1: rule__Type__Group_14__2__Impl : ( '<' ) ;
    public final void rule__Type__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3209:1: ( ( '<' ) )
            // InternalSimpleIDL.g:3210:1: ( '<' )
            {
            // InternalSimpleIDL.g:3210:1: ( '<' )
            // InternalSimpleIDL.g:3211:2: '<'
            {
             before(grammarAccess.getTypeAccess().getLessThanSignKeyword_14_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLessThanSignKeyword_14_2()); 

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
    // $ANTLR end "rule__Type__Group_14__2__Impl"


    // $ANTLR start "rule__Type__Group_14__3"
    // InternalSimpleIDL.g:3220:1: rule__Type__Group_14__3 : rule__Type__Group_14__3__Impl rule__Type__Group_14__4 ;
    public final void rule__Type__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3224:1: ( rule__Type__Group_14__3__Impl rule__Type__Group_14__4 )
            // InternalSimpleIDL.g:3225:2: rule__Type__Group_14__3__Impl rule__Type__Group_14__4
            {
            pushFollow(FOLLOW_39);
            rule__Type__Group_14__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_14__4();

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
    // $ANTLR end "rule__Type__Group_14__3"


    // $ANTLR start "rule__Type__Group_14__3__Impl"
    // InternalSimpleIDL.g:3232:1: rule__Type__Group_14__3__Impl : ( ( rule__Type__TypeAssignment_14_3 ) ) ;
    public final void rule__Type__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3236:1: ( ( ( rule__Type__TypeAssignment_14_3 ) ) )
            // InternalSimpleIDL.g:3237:1: ( ( rule__Type__TypeAssignment_14_3 ) )
            {
            // InternalSimpleIDL.g:3237:1: ( ( rule__Type__TypeAssignment_14_3 ) )
            // InternalSimpleIDL.g:3238:2: ( rule__Type__TypeAssignment_14_3 )
            {
             before(grammarAccess.getTypeAccess().getTypeAssignment_14_3()); 
            // InternalSimpleIDL.g:3239:2: ( rule__Type__TypeAssignment_14_3 )
            // InternalSimpleIDL.g:3239:3: rule__Type__TypeAssignment_14_3
            {
            pushFollow(FOLLOW_2);
            rule__Type__TypeAssignment_14_3();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getTypeAssignment_14_3()); 

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
    // $ANTLR end "rule__Type__Group_14__3__Impl"


    // $ANTLR start "rule__Type__Group_14__4"
    // InternalSimpleIDL.g:3247:1: rule__Type__Group_14__4 : rule__Type__Group_14__4__Impl rule__Type__Group_14__5 ;
    public final void rule__Type__Group_14__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3251:1: ( rule__Type__Group_14__4__Impl rule__Type__Group_14__5 )
            // InternalSimpleIDL.g:3252:2: rule__Type__Group_14__4__Impl rule__Type__Group_14__5
            {
            pushFollow(FOLLOW_27);
            rule__Type__Group_14__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_14__5();

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
    // $ANTLR end "rule__Type__Group_14__4"


    // $ANTLR start "rule__Type__Group_14__4__Impl"
    // InternalSimpleIDL.g:3259:1: rule__Type__Group_14__4__Impl : ( ',' ) ;
    public final void rule__Type__Group_14__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3263:1: ( ( ',' ) )
            // InternalSimpleIDL.g:3264:1: ( ',' )
            {
            // InternalSimpleIDL.g:3264:1: ( ',' )
            // InternalSimpleIDL.g:3265:2: ','
            {
             before(grammarAccess.getTypeAccess().getCommaKeyword_14_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getCommaKeyword_14_4()); 

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
    // $ANTLR end "rule__Type__Group_14__4__Impl"


    // $ANTLR start "rule__Type__Group_14__5"
    // InternalSimpleIDL.g:3274:1: rule__Type__Group_14__5 : rule__Type__Group_14__5__Impl rule__Type__Group_14__6 ;
    public final void rule__Type__Group_14__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3278:1: ( rule__Type__Group_14__5__Impl rule__Type__Group_14__6 )
            // InternalSimpleIDL.g:3279:2: rule__Type__Group_14__5__Impl rule__Type__Group_14__6
            {
            pushFollow(FOLLOW_40);
            rule__Type__Group_14__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_14__6();

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
    // $ANTLR end "rule__Type__Group_14__5"


    // $ANTLR start "rule__Type__Group_14__5__Impl"
    // InternalSimpleIDL.g:3286:1: rule__Type__Group_14__5__Impl : ( ( rule__Type__SizeAssignment_14_5 ) ) ;
    public final void rule__Type__Group_14__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3290:1: ( ( ( rule__Type__SizeAssignment_14_5 ) ) )
            // InternalSimpleIDL.g:3291:1: ( ( rule__Type__SizeAssignment_14_5 ) )
            {
            // InternalSimpleIDL.g:3291:1: ( ( rule__Type__SizeAssignment_14_5 ) )
            // InternalSimpleIDL.g:3292:2: ( rule__Type__SizeAssignment_14_5 )
            {
             before(grammarAccess.getTypeAccess().getSizeAssignment_14_5()); 
            // InternalSimpleIDL.g:3293:2: ( rule__Type__SizeAssignment_14_5 )
            // InternalSimpleIDL.g:3293:3: rule__Type__SizeAssignment_14_5
            {
            pushFollow(FOLLOW_2);
            rule__Type__SizeAssignment_14_5();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getSizeAssignment_14_5()); 

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
    // $ANTLR end "rule__Type__Group_14__5__Impl"


    // $ANTLR start "rule__Type__Group_14__6"
    // InternalSimpleIDL.g:3301:1: rule__Type__Group_14__6 : rule__Type__Group_14__6__Impl ;
    public final void rule__Type__Group_14__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3305:1: ( rule__Type__Group_14__6__Impl )
            // InternalSimpleIDL.g:3306:2: rule__Type__Group_14__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_14__6__Impl();

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
    // $ANTLR end "rule__Type__Group_14__6"


    // $ANTLR start "rule__Type__Group_14__6__Impl"
    // InternalSimpleIDL.g:3312:1: rule__Type__Group_14__6__Impl : ( '>' ) ;
    public final void rule__Type__Group_14__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3316:1: ( ( '>' ) )
            // InternalSimpleIDL.g:3317:1: ( '>' )
            {
            // InternalSimpleIDL.g:3317:1: ( '>' )
            // InternalSimpleIDL.g:3318:2: '>'
            {
             before(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_14_6()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_14_6()); 

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
    // $ANTLR end "rule__Type__Group_14__6__Impl"


    // $ANTLR start "rule__Type__Group_15__0"
    // InternalSimpleIDL.g:3328:1: rule__Type__Group_15__0 : rule__Type__Group_15__0__Impl rule__Type__Group_15__1 ;
    public final void rule__Type__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3332:1: ( rule__Type__Group_15__0__Impl rule__Type__Group_15__1 )
            // InternalSimpleIDL.g:3333:2: rule__Type__Group_15__0__Impl rule__Type__Group_15__1
            {
            pushFollow(FOLLOW_37);
            rule__Type__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_15__1();

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
    // $ANTLR end "rule__Type__Group_15__0"


    // $ANTLR start "rule__Type__Group_15__0__Impl"
    // InternalSimpleIDL.g:3340:1: rule__Type__Group_15__0__Impl : ( () ) ;
    public final void rule__Type__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3344:1: ( ( () ) )
            // InternalSimpleIDL.g:3345:1: ( () )
            {
            // InternalSimpleIDL.g:3345:1: ( () )
            // InternalSimpleIDL.g:3346:2: ()
            {
             before(grammarAccess.getTypeAccess().getUnboundedSequenceAction_15_0()); 
            // InternalSimpleIDL.g:3347:2: ()
            // InternalSimpleIDL.g:3347:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getUnboundedSequenceAction_15_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_15__0__Impl"


    // $ANTLR start "rule__Type__Group_15__1"
    // InternalSimpleIDL.g:3355:1: rule__Type__Group_15__1 : rule__Type__Group_15__1__Impl rule__Type__Group_15__2 ;
    public final void rule__Type__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3359:1: ( rule__Type__Group_15__1__Impl rule__Type__Group_15__2 )
            // InternalSimpleIDL.g:3360:2: rule__Type__Group_15__1__Impl rule__Type__Group_15__2
            {
            pushFollow(FOLLOW_38);
            rule__Type__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_15__2();

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
    // $ANTLR end "rule__Type__Group_15__1"


    // $ANTLR start "rule__Type__Group_15__1__Impl"
    // InternalSimpleIDL.g:3367:1: rule__Type__Group_15__1__Impl : ( 'sequence' ) ;
    public final void rule__Type__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3371:1: ( ( 'sequence' ) )
            // InternalSimpleIDL.g:3372:1: ( 'sequence' )
            {
            // InternalSimpleIDL.g:3372:1: ( 'sequence' )
            // InternalSimpleIDL.g:3373:2: 'sequence'
            {
             before(grammarAccess.getTypeAccess().getSequenceKeyword_15_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getSequenceKeyword_15_1()); 

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
    // $ANTLR end "rule__Type__Group_15__1__Impl"


    // $ANTLR start "rule__Type__Group_15__2"
    // InternalSimpleIDL.g:3382:1: rule__Type__Group_15__2 : rule__Type__Group_15__2__Impl rule__Type__Group_15__3 ;
    public final void rule__Type__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3386:1: ( rule__Type__Group_15__2__Impl rule__Type__Group_15__3 )
            // InternalSimpleIDL.g:3387:2: rule__Type__Group_15__2__Impl rule__Type__Group_15__3
            {
            pushFollow(FOLLOW_11);
            rule__Type__Group_15__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_15__3();

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
    // $ANTLR end "rule__Type__Group_15__2"


    // $ANTLR start "rule__Type__Group_15__2__Impl"
    // InternalSimpleIDL.g:3394:1: rule__Type__Group_15__2__Impl : ( '<' ) ;
    public final void rule__Type__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3398:1: ( ( '<' ) )
            // InternalSimpleIDL.g:3399:1: ( '<' )
            {
            // InternalSimpleIDL.g:3399:1: ( '<' )
            // InternalSimpleIDL.g:3400:2: '<'
            {
             before(grammarAccess.getTypeAccess().getLessThanSignKeyword_15_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLessThanSignKeyword_15_2()); 

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
    // $ANTLR end "rule__Type__Group_15__2__Impl"


    // $ANTLR start "rule__Type__Group_15__3"
    // InternalSimpleIDL.g:3409:1: rule__Type__Group_15__3 : rule__Type__Group_15__3__Impl rule__Type__Group_15__4 ;
    public final void rule__Type__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3413:1: ( rule__Type__Group_15__3__Impl rule__Type__Group_15__4 )
            // InternalSimpleIDL.g:3414:2: rule__Type__Group_15__3__Impl rule__Type__Group_15__4
            {
            pushFollow(FOLLOW_40);
            rule__Type__Group_15__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_15__4();

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
    // $ANTLR end "rule__Type__Group_15__3"


    // $ANTLR start "rule__Type__Group_15__3__Impl"
    // InternalSimpleIDL.g:3421:1: rule__Type__Group_15__3__Impl : ( ( rule__Type__TypeAssignment_15_3 ) ) ;
    public final void rule__Type__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3425:1: ( ( ( rule__Type__TypeAssignment_15_3 ) ) )
            // InternalSimpleIDL.g:3426:1: ( ( rule__Type__TypeAssignment_15_3 ) )
            {
            // InternalSimpleIDL.g:3426:1: ( ( rule__Type__TypeAssignment_15_3 ) )
            // InternalSimpleIDL.g:3427:2: ( rule__Type__TypeAssignment_15_3 )
            {
             before(grammarAccess.getTypeAccess().getTypeAssignment_15_3()); 
            // InternalSimpleIDL.g:3428:2: ( rule__Type__TypeAssignment_15_3 )
            // InternalSimpleIDL.g:3428:3: rule__Type__TypeAssignment_15_3
            {
            pushFollow(FOLLOW_2);
            rule__Type__TypeAssignment_15_3();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getTypeAssignment_15_3()); 

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
    // $ANTLR end "rule__Type__Group_15__3__Impl"


    // $ANTLR start "rule__Type__Group_15__4"
    // InternalSimpleIDL.g:3436:1: rule__Type__Group_15__4 : rule__Type__Group_15__4__Impl ;
    public final void rule__Type__Group_15__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3440:1: ( rule__Type__Group_15__4__Impl )
            // InternalSimpleIDL.g:3441:2: rule__Type__Group_15__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_15__4__Impl();

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
    // $ANTLR end "rule__Type__Group_15__4"


    // $ANTLR start "rule__Type__Group_15__4__Impl"
    // InternalSimpleIDL.g:3447:1: rule__Type__Group_15__4__Impl : ( '>' ) ;
    public final void rule__Type__Group_15__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3451:1: ( ( '>' ) )
            // InternalSimpleIDL.g:3452:1: ( '>' )
            {
            // InternalSimpleIDL.g:3452:1: ( '>' )
            // InternalSimpleIDL.g:3453:2: '>'
            {
             before(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_15_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_15_4()); 

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
    // $ANTLR end "rule__Type__Group_15__4__Impl"


    // $ANTLR start "rule__Type__Group_16__0"
    // InternalSimpleIDL.g:3463:1: rule__Type__Group_16__0 : rule__Type__Group_16__0__Impl rule__Type__Group_16__1 ;
    public final void rule__Type__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3467:1: ( rule__Type__Group_16__0__Impl rule__Type__Group_16__1 )
            // InternalSimpleIDL.g:3468:2: rule__Type__Group_16__0__Impl rule__Type__Group_16__1
            {
            pushFollow(FOLLOW_41);
            rule__Type__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_16__1();

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
    // $ANTLR end "rule__Type__Group_16__0"


    // $ANTLR start "rule__Type__Group_16__0__Impl"
    // InternalSimpleIDL.g:3475:1: rule__Type__Group_16__0__Impl : ( () ) ;
    public final void rule__Type__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3479:1: ( ( () ) )
            // InternalSimpleIDL.g:3480:1: ( () )
            {
            // InternalSimpleIDL.g:3480:1: ( () )
            // InternalSimpleIDL.g:3481:2: ()
            {
             before(grammarAccess.getTypeAccess().getBoundedStringAction_16_0()); 
            // InternalSimpleIDL.g:3482:2: ()
            // InternalSimpleIDL.g:3482:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getBoundedStringAction_16_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_16__0__Impl"


    // $ANTLR start "rule__Type__Group_16__1"
    // InternalSimpleIDL.g:3490:1: rule__Type__Group_16__1 : rule__Type__Group_16__1__Impl rule__Type__Group_16__2 ;
    public final void rule__Type__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3494:1: ( rule__Type__Group_16__1__Impl rule__Type__Group_16__2 )
            // InternalSimpleIDL.g:3495:2: rule__Type__Group_16__1__Impl rule__Type__Group_16__2
            {
            pushFollow(FOLLOW_38);
            rule__Type__Group_16__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_16__2();

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
    // $ANTLR end "rule__Type__Group_16__1"


    // $ANTLR start "rule__Type__Group_16__1__Impl"
    // InternalSimpleIDL.g:3502:1: rule__Type__Group_16__1__Impl : ( 'string' ) ;
    public final void rule__Type__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3506:1: ( ( 'string' ) )
            // InternalSimpleIDL.g:3507:1: ( 'string' )
            {
            // InternalSimpleIDL.g:3507:1: ( 'string' )
            // InternalSimpleIDL.g:3508:2: 'string'
            {
             before(grammarAccess.getTypeAccess().getStringKeyword_16_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getStringKeyword_16_1()); 

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
    // $ANTLR end "rule__Type__Group_16__1__Impl"


    // $ANTLR start "rule__Type__Group_16__2"
    // InternalSimpleIDL.g:3517:1: rule__Type__Group_16__2 : rule__Type__Group_16__2__Impl rule__Type__Group_16__3 ;
    public final void rule__Type__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3521:1: ( rule__Type__Group_16__2__Impl rule__Type__Group_16__3 )
            // InternalSimpleIDL.g:3522:2: rule__Type__Group_16__2__Impl rule__Type__Group_16__3
            {
            pushFollow(FOLLOW_27);
            rule__Type__Group_16__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_16__3();

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
    // $ANTLR end "rule__Type__Group_16__2"


    // $ANTLR start "rule__Type__Group_16__2__Impl"
    // InternalSimpleIDL.g:3529:1: rule__Type__Group_16__2__Impl : ( '<' ) ;
    public final void rule__Type__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3533:1: ( ( '<' ) )
            // InternalSimpleIDL.g:3534:1: ( '<' )
            {
            // InternalSimpleIDL.g:3534:1: ( '<' )
            // InternalSimpleIDL.g:3535:2: '<'
            {
             before(grammarAccess.getTypeAccess().getLessThanSignKeyword_16_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLessThanSignKeyword_16_2()); 

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
    // $ANTLR end "rule__Type__Group_16__2__Impl"


    // $ANTLR start "rule__Type__Group_16__3"
    // InternalSimpleIDL.g:3544:1: rule__Type__Group_16__3 : rule__Type__Group_16__3__Impl rule__Type__Group_16__4 ;
    public final void rule__Type__Group_16__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3548:1: ( rule__Type__Group_16__3__Impl rule__Type__Group_16__4 )
            // InternalSimpleIDL.g:3549:2: rule__Type__Group_16__3__Impl rule__Type__Group_16__4
            {
            pushFollow(FOLLOW_40);
            rule__Type__Group_16__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_16__4();

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
    // $ANTLR end "rule__Type__Group_16__3"


    // $ANTLR start "rule__Type__Group_16__3__Impl"
    // InternalSimpleIDL.g:3556:1: rule__Type__Group_16__3__Impl : ( ( rule__Type__SizeAssignment_16_3 ) ) ;
    public final void rule__Type__Group_16__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3560:1: ( ( ( rule__Type__SizeAssignment_16_3 ) ) )
            // InternalSimpleIDL.g:3561:1: ( ( rule__Type__SizeAssignment_16_3 ) )
            {
            // InternalSimpleIDL.g:3561:1: ( ( rule__Type__SizeAssignment_16_3 ) )
            // InternalSimpleIDL.g:3562:2: ( rule__Type__SizeAssignment_16_3 )
            {
             before(grammarAccess.getTypeAccess().getSizeAssignment_16_3()); 
            // InternalSimpleIDL.g:3563:2: ( rule__Type__SizeAssignment_16_3 )
            // InternalSimpleIDL.g:3563:3: rule__Type__SizeAssignment_16_3
            {
            pushFollow(FOLLOW_2);
            rule__Type__SizeAssignment_16_3();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getSizeAssignment_16_3()); 

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
    // $ANTLR end "rule__Type__Group_16__3__Impl"


    // $ANTLR start "rule__Type__Group_16__4"
    // InternalSimpleIDL.g:3571:1: rule__Type__Group_16__4 : rule__Type__Group_16__4__Impl ;
    public final void rule__Type__Group_16__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3575:1: ( rule__Type__Group_16__4__Impl )
            // InternalSimpleIDL.g:3576:2: rule__Type__Group_16__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_16__4__Impl();

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
    // $ANTLR end "rule__Type__Group_16__4"


    // $ANTLR start "rule__Type__Group_16__4__Impl"
    // InternalSimpleIDL.g:3582:1: rule__Type__Group_16__4__Impl : ( '>' ) ;
    public final void rule__Type__Group_16__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3586:1: ( ( '>' ) )
            // InternalSimpleIDL.g:3587:1: ( '>' )
            {
            // InternalSimpleIDL.g:3587:1: ( '>' )
            // InternalSimpleIDL.g:3588:2: '>'
            {
             before(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_16_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_16_4()); 

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
    // $ANTLR end "rule__Type__Group_16__4__Impl"


    // $ANTLR start "rule__Type__Group_17__0"
    // InternalSimpleIDL.g:3598:1: rule__Type__Group_17__0 : rule__Type__Group_17__0__Impl rule__Type__Group_17__1 ;
    public final void rule__Type__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3602:1: ( rule__Type__Group_17__0__Impl rule__Type__Group_17__1 )
            // InternalSimpleIDL.g:3603:2: rule__Type__Group_17__0__Impl rule__Type__Group_17__1
            {
            pushFollow(FOLLOW_41);
            rule__Type__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_17__1();

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
    // $ANTLR end "rule__Type__Group_17__0"


    // $ANTLR start "rule__Type__Group_17__0__Impl"
    // InternalSimpleIDL.g:3610:1: rule__Type__Group_17__0__Impl : ( () ) ;
    public final void rule__Type__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3614:1: ( ( () ) )
            // InternalSimpleIDL.g:3615:1: ( () )
            {
            // InternalSimpleIDL.g:3615:1: ( () )
            // InternalSimpleIDL.g:3616:2: ()
            {
             before(grammarAccess.getTypeAccess().getUnboundedStringAction_17_0()); 
            // InternalSimpleIDL.g:3617:2: ()
            // InternalSimpleIDL.g:3617:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getUnboundedStringAction_17_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_17__0__Impl"


    // $ANTLR start "rule__Type__Group_17__1"
    // InternalSimpleIDL.g:3625:1: rule__Type__Group_17__1 : rule__Type__Group_17__1__Impl ;
    public final void rule__Type__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3629:1: ( rule__Type__Group_17__1__Impl )
            // InternalSimpleIDL.g:3630:2: rule__Type__Group_17__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_17__1__Impl();

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
    // $ANTLR end "rule__Type__Group_17__1"


    // $ANTLR start "rule__Type__Group_17__1__Impl"
    // InternalSimpleIDL.g:3636:1: rule__Type__Group_17__1__Impl : ( 'string' ) ;
    public final void rule__Type__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3640:1: ( ( 'string' ) )
            // InternalSimpleIDL.g:3641:1: ( 'string' )
            {
            // InternalSimpleIDL.g:3641:1: ( 'string' )
            // InternalSimpleIDL.g:3642:2: 'string'
            {
             before(grammarAccess.getTypeAccess().getStringKeyword_17_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getStringKeyword_17_1()); 

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
    // $ANTLR end "rule__Type__Group_17__1__Impl"


    // $ANTLR start "rule__Type__Group_18__0"
    // InternalSimpleIDL.g:3652:1: rule__Type__Group_18__0 : rule__Type__Group_18__0__Impl rule__Type__Group_18__1 ;
    public final void rule__Type__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3656:1: ( rule__Type__Group_18__0__Impl rule__Type__Group_18__1 )
            // InternalSimpleIDL.g:3657:2: rule__Type__Group_18__0__Impl rule__Type__Group_18__1
            {
            pushFollow(FOLLOW_42);
            rule__Type__Group_18__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_18__1();

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
    // $ANTLR end "rule__Type__Group_18__0"


    // $ANTLR start "rule__Type__Group_18__0__Impl"
    // InternalSimpleIDL.g:3664:1: rule__Type__Group_18__0__Impl : ( () ) ;
    public final void rule__Type__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3668:1: ( ( () ) )
            // InternalSimpleIDL.g:3669:1: ( () )
            {
            // InternalSimpleIDL.g:3669:1: ( () )
            // InternalSimpleIDL.g:3670:2: ()
            {
             before(grammarAccess.getTypeAccess().getBoundedWideStringAction_18_0()); 
            // InternalSimpleIDL.g:3671:2: ()
            // InternalSimpleIDL.g:3671:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getBoundedWideStringAction_18_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_18__0__Impl"


    // $ANTLR start "rule__Type__Group_18__1"
    // InternalSimpleIDL.g:3679:1: rule__Type__Group_18__1 : rule__Type__Group_18__1__Impl rule__Type__Group_18__2 ;
    public final void rule__Type__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3683:1: ( rule__Type__Group_18__1__Impl rule__Type__Group_18__2 )
            // InternalSimpleIDL.g:3684:2: rule__Type__Group_18__1__Impl rule__Type__Group_18__2
            {
            pushFollow(FOLLOW_38);
            rule__Type__Group_18__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_18__2();

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
    // $ANTLR end "rule__Type__Group_18__1"


    // $ANTLR start "rule__Type__Group_18__1__Impl"
    // InternalSimpleIDL.g:3691:1: rule__Type__Group_18__1__Impl : ( 'wstring' ) ;
    public final void rule__Type__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3695:1: ( ( 'wstring' ) )
            // InternalSimpleIDL.g:3696:1: ( 'wstring' )
            {
            // InternalSimpleIDL.g:3696:1: ( 'wstring' )
            // InternalSimpleIDL.g:3697:2: 'wstring'
            {
             before(grammarAccess.getTypeAccess().getWstringKeyword_18_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getWstringKeyword_18_1()); 

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
    // $ANTLR end "rule__Type__Group_18__1__Impl"


    // $ANTLR start "rule__Type__Group_18__2"
    // InternalSimpleIDL.g:3706:1: rule__Type__Group_18__2 : rule__Type__Group_18__2__Impl rule__Type__Group_18__3 ;
    public final void rule__Type__Group_18__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3710:1: ( rule__Type__Group_18__2__Impl rule__Type__Group_18__3 )
            // InternalSimpleIDL.g:3711:2: rule__Type__Group_18__2__Impl rule__Type__Group_18__3
            {
            pushFollow(FOLLOW_27);
            rule__Type__Group_18__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_18__3();

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
    // $ANTLR end "rule__Type__Group_18__2"


    // $ANTLR start "rule__Type__Group_18__2__Impl"
    // InternalSimpleIDL.g:3718:1: rule__Type__Group_18__2__Impl : ( '<' ) ;
    public final void rule__Type__Group_18__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3722:1: ( ( '<' ) )
            // InternalSimpleIDL.g:3723:1: ( '<' )
            {
            // InternalSimpleIDL.g:3723:1: ( '<' )
            // InternalSimpleIDL.g:3724:2: '<'
            {
             before(grammarAccess.getTypeAccess().getLessThanSignKeyword_18_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLessThanSignKeyword_18_2()); 

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
    // $ANTLR end "rule__Type__Group_18__2__Impl"


    // $ANTLR start "rule__Type__Group_18__3"
    // InternalSimpleIDL.g:3733:1: rule__Type__Group_18__3 : rule__Type__Group_18__3__Impl rule__Type__Group_18__4 ;
    public final void rule__Type__Group_18__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3737:1: ( rule__Type__Group_18__3__Impl rule__Type__Group_18__4 )
            // InternalSimpleIDL.g:3738:2: rule__Type__Group_18__3__Impl rule__Type__Group_18__4
            {
            pushFollow(FOLLOW_40);
            rule__Type__Group_18__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_18__4();

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
    // $ANTLR end "rule__Type__Group_18__3"


    // $ANTLR start "rule__Type__Group_18__3__Impl"
    // InternalSimpleIDL.g:3745:1: rule__Type__Group_18__3__Impl : ( ( rule__Type__SizeAssignment_18_3 ) ) ;
    public final void rule__Type__Group_18__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3749:1: ( ( ( rule__Type__SizeAssignment_18_3 ) ) )
            // InternalSimpleIDL.g:3750:1: ( ( rule__Type__SizeAssignment_18_3 ) )
            {
            // InternalSimpleIDL.g:3750:1: ( ( rule__Type__SizeAssignment_18_3 ) )
            // InternalSimpleIDL.g:3751:2: ( rule__Type__SizeAssignment_18_3 )
            {
             before(grammarAccess.getTypeAccess().getSizeAssignment_18_3()); 
            // InternalSimpleIDL.g:3752:2: ( rule__Type__SizeAssignment_18_3 )
            // InternalSimpleIDL.g:3752:3: rule__Type__SizeAssignment_18_3
            {
            pushFollow(FOLLOW_2);
            rule__Type__SizeAssignment_18_3();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getSizeAssignment_18_3()); 

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
    // $ANTLR end "rule__Type__Group_18__3__Impl"


    // $ANTLR start "rule__Type__Group_18__4"
    // InternalSimpleIDL.g:3760:1: rule__Type__Group_18__4 : rule__Type__Group_18__4__Impl ;
    public final void rule__Type__Group_18__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3764:1: ( rule__Type__Group_18__4__Impl )
            // InternalSimpleIDL.g:3765:2: rule__Type__Group_18__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_18__4__Impl();

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
    // $ANTLR end "rule__Type__Group_18__4"


    // $ANTLR start "rule__Type__Group_18__4__Impl"
    // InternalSimpleIDL.g:3771:1: rule__Type__Group_18__4__Impl : ( '>' ) ;
    public final void rule__Type__Group_18__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3775:1: ( ( '>' ) )
            // InternalSimpleIDL.g:3776:1: ( '>' )
            {
            // InternalSimpleIDL.g:3776:1: ( '>' )
            // InternalSimpleIDL.g:3777:2: '>'
            {
             before(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_18_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_18_4()); 

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
    // $ANTLR end "rule__Type__Group_18__4__Impl"


    // $ANTLR start "rule__Type__Group_19__0"
    // InternalSimpleIDL.g:3787:1: rule__Type__Group_19__0 : rule__Type__Group_19__0__Impl rule__Type__Group_19__1 ;
    public final void rule__Type__Group_19__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3791:1: ( rule__Type__Group_19__0__Impl rule__Type__Group_19__1 )
            // InternalSimpleIDL.g:3792:2: rule__Type__Group_19__0__Impl rule__Type__Group_19__1
            {
            pushFollow(FOLLOW_42);
            rule__Type__Group_19__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_19__1();

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
    // $ANTLR end "rule__Type__Group_19__0"


    // $ANTLR start "rule__Type__Group_19__0__Impl"
    // InternalSimpleIDL.g:3799:1: rule__Type__Group_19__0__Impl : ( () ) ;
    public final void rule__Type__Group_19__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3803:1: ( ( () ) )
            // InternalSimpleIDL.g:3804:1: ( () )
            {
            // InternalSimpleIDL.g:3804:1: ( () )
            // InternalSimpleIDL.g:3805:2: ()
            {
             before(grammarAccess.getTypeAccess().getUnboundedWideStringAction_19_0()); 
            // InternalSimpleIDL.g:3806:2: ()
            // InternalSimpleIDL.g:3806:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getUnboundedWideStringAction_19_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_19__0__Impl"


    // $ANTLR start "rule__Type__Group_19__1"
    // InternalSimpleIDL.g:3814:1: rule__Type__Group_19__1 : rule__Type__Group_19__1__Impl ;
    public final void rule__Type__Group_19__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3818:1: ( rule__Type__Group_19__1__Impl )
            // InternalSimpleIDL.g:3819:2: rule__Type__Group_19__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_19__1__Impl();

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
    // $ANTLR end "rule__Type__Group_19__1"


    // $ANTLR start "rule__Type__Group_19__1__Impl"
    // InternalSimpleIDL.g:3825:1: rule__Type__Group_19__1__Impl : ( 'wstring' ) ;
    public final void rule__Type__Group_19__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3829:1: ( ( 'wstring' ) )
            // InternalSimpleIDL.g:3830:1: ( 'wstring' )
            {
            // InternalSimpleIDL.g:3830:1: ( 'wstring' )
            // InternalSimpleIDL.g:3831:2: 'wstring'
            {
             before(grammarAccess.getTypeAccess().getWstringKeyword_19_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getWstringKeyword_19_1()); 

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
    // $ANTLR end "rule__Type__Group_19__1__Impl"


    // $ANTLR start "rule__Type__Group_20__0"
    // InternalSimpleIDL.g:3841:1: rule__Type__Group_20__0 : rule__Type__Group_20__0__Impl rule__Type__Group_20__1 ;
    public final void rule__Type__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3845:1: ( rule__Type__Group_20__0__Impl rule__Type__Group_20__1 )
            // InternalSimpleIDL.g:3846:2: rule__Type__Group_20__0__Impl rule__Type__Group_20__1
            {
            pushFollow(FOLLOW_25);
            rule__Type__Group_20__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_20__1();

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
    // $ANTLR end "rule__Type__Group_20__0"


    // $ANTLR start "rule__Type__Group_20__0__Impl"
    // InternalSimpleIDL.g:3853:1: rule__Type__Group_20__0__Impl : ( () ) ;
    public final void rule__Type__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3857:1: ( ( () ) )
            // InternalSimpleIDL.g:3858:1: ( () )
            {
            // InternalSimpleIDL.g:3858:1: ( () )
            // InternalSimpleIDL.g:3859:2: ()
            {
             before(grammarAccess.getTypeAccess().getFixedPtTypeAction_20_0()); 
            // InternalSimpleIDL.g:3860:2: ()
            // InternalSimpleIDL.g:3860:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getFixedPtTypeAction_20_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_20__0__Impl"


    // $ANTLR start "rule__Type__Group_20__1"
    // InternalSimpleIDL.g:3868:1: rule__Type__Group_20__1 : rule__Type__Group_20__1__Impl rule__Type__Group_20__2 ;
    public final void rule__Type__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3872:1: ( rule__Type__Group_20__1__Impl rule__Type__Group_20__2 )
            // InternalSimpleIDL.g:3873:2: rule__Type__Group_20__1__Impl rule__Type__Group_20__2
            {
            pushFollow(FOLLOW_38);
            rule__Type__Group_20__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_20__2();

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
    // $ANTLR end "rule__Type__Group_20__1"


    // $ANTLR start "rule__Type__Group_20__1__Impl"
    // InternalSimpleIDL.g:3880:1: rule__Type__Group_20__1__Impl : ( 'fixed' ) ;
    public final void rule__Type__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3884:1: ( ( 'fixed' ) )
            // InternalSimpleIDL.g:3885:1: ( 'fixed' )
            {
            // InternalSimpleIDL.g:3885:1: ( 'fixed' )
            // InternalSimpleIDL.g:3886:2: 'fixed'
            {
             before(grammarAccess.getTypeAccess().getFixedKeyword_20_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getFixedKeyword_20_1()); 

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
    // $ANTLR end "rule__Type__Group_20__1__Impl"


    // $ANTLR start "rule__Type__Group_20__2"
    // InternalSimpleIDL.g:3895:1: rule__Type__Group_20__2 : rule__Type__Group_20__2__Impl rule__Type__Group_20__3 ;
    public final void rule__Type__Group_20__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3899:1: ( rule__Type__Group_20__2__Impl rule__Type__Group_20__3 )
            // InternalSimpleIDL.g:3900:2: rule__Type__Group_20__2__Impl rule__Type__Group_20__3
            {
            pushFollow(FOLLOW_27);
            rule__Type__Group_20__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_20__3();

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
    // $ANTLR end "rule__Type__Group_20__2"


    // $ANTLR start "rule__Type__Group_20__2__Impl"
    // InternalSimpleIDL.g:3907:1: rule__Type__Group_20__2__Impl : ( '<' ) ;
    public final void rule__Type__Group_20__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3911:1: ( ( '<' ) )
            // InternalSimpleIDL.g:3912:1: ( '<' )
            {
            // InternalSimpleIDL.g:3912:1: ( '<' )
            // InternalSimpleIDL.g:3913:2: '<'
            {
             before(grammarAccess.getTypeAccess().getLessThanSignKeyword_20_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLessThanSignKeyword_20_2()); 

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
    // $ANTLR end "rule__Type__Group_20__2__Impl"


    // $ANTLR start "rule__Type__Group_20__3"
    // InternalSimpleIDL.g:3922:1: rule__Type__Group_20__3 : rule__Type__Group_20__3__Impl rule__Type__Group_20__4 ;
    public final void rule__Type__Group_20__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3926:1: ( rule__Type__Group_20__3__Impl rule__Type__Group_20__4 )
            // InternalSimpleIDL.g:3927:2: rule__Type__Group_20__3__Impl rule__Type__Group_20__4
            {
            pushFollow(FOLLOW_39);
            rule__Type__Group_20__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_20__4();

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
    // $ANTLR end "rule__Type__Group_20__3"


    // $ANTLR start "rule__Type__Group_20__3__Impl"
    // InternalSimpleIDL.g:3934:1: rule__Type__Group_20__3__Impl : ( ( rule__Type__TotalDigitsAssignment_20_3 ) ) ;
    public final void rule__Type__Group_20__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3938:1: ( ( ( rule__Type__TotalDigitsAssignment_20_3 ) ) )
            // InternalSimpleIDL.g:3939:1: ( ( rule__Type__TotalDigitsAssignment_20_3 ) )
            {
            // InternalSimpleIDL.g:3939:1: ( ( rule__Type__TotalDigitsAssignment_20_3 ) )
            // InternalSimpleIDL.g:3940:2: ( rule__Type__TotalDigitsAssignment_20_3 )
            {
             before(grammarAccess.getTypeAccess().getTotalDigitsAssignment_20_3()); 
            // InternalSimpleIDL.g:3941:2: ( rule__Type__TotalDigitsAssignment_20_3 )
            // InternalSimpleIDL.g:3941:3: rule__Type__TotalDigitsAssignment_20_3
            {
            pushFollow(FOLLOW_2);
            rule__Type__TotalDigitsAssignment_20_3();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getTotalDigitsAssignment_20_3()); 

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
    // $ANTLR end "rule__Type__Group_20__3__Impl"


    // $ANTLR start "rule__Type__Group_20__4"
    // InternalSimpleIDL.g:3949:1: rule__Type__Group_20__4 : rule__Type__Group_20__4__Impl rule__Type__Group_20__5 ;
    public final void rule__Type__Group_20__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3953:1: ( rule__Type__Group_20__4__Impl rule__Type__Group_20__5 )
            // InternalSimpleIDL.g:3954:2: rule__Type__Group_20__4__Impl rule__Type__Group_20__5
            {
            pushFollow(FOLLOW_27);
            rule__Type__Group_20__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_20__5();

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
    // $ANTLR end "rule__Type__Group_20__4"


    // $ANTLR start "rule__Type__Group_20__4__Impl"
    // InternalSimpleIDL.g:3961:1: rule__Type__Group_20__4__Impl : ( ',' ) ;
    public final void rule__Type__Group_20__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3965:1: ( ( ',' ) )
            // InternalSimpleIDL.g:3966:1: ( ',' )
            {
            // InternalSimpleIDL.g:3966:1: ( ',' )
            // InternalSimpleIDL.g:3967:2: ','
            {
             before(grammarAccess.getTypeAccess().getCommaKeyword_20_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getCommaKeyword_20_4()); 

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
    // $ANTLR end "rule__Type__Group_20__4__Impl"


    // $ANTLR start "rule__Type__Group_20__5"
    // InternalSimpleIDL.g:3976:1: rule__Type__Group_20__5 : rule__Type__Group_20__5__Impl rule__Type__Group_20__6 ;
    public final void rule__Type__Group_20__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3980:1: ( rule__Type__Group_20__5__Impl rule__Type__Group_20__6 )
            // InternalSimpleIDL.g:3981:2: rule__Type__Group_20__5__Impl rule__Type__Group_20__6
            {
            pushFollow(FOLLOW_40);
            rule__Type__Group_20__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_20__6();

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
    // $ANTLR end "rule__Type__Group_20__5"


    // $ANTLR start "rule__Type__Group_20__5__Impl"
    // InternalSimpleIDL.g:3988:1: rule__Type__Group_20__5__Impl : ( ( rule__Type__FractionalDigitsAssignment_20_5 ) ) ;
    public final void rule__Type__Group_20__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3992:1: ( ( ( rule__Type__FractionalDigitsAssignment_20_5 ) ) )
            // InternalSimpleIDL.g:3993:1: ( ( rule__Type__FractionalDigitsAssignment_20_5 ) )
            {
            // InternalSimpleIDL.g:3993:1: ( ( rule__Type__FractionalDigitsAssignment_20_5 ) )
            // InternalSimpleIDL.g:3994:2: ( rule__Type__FractionalDigitsAssignment_20_5 )
            {
             before(grammarAccess.getTypeAccess().getFractionalDigitsAssignment_20_5()); 
            // InternalSimpleIDL.g:3995:2: ( rule__Type__FractionalDigitsAssignment_20_5 )
            // InternalSimpleIDL.g:3995:3: rule__Type__FractionalDigitsAssignment_20_5
            {
            pushFollow(FOLLOW_2);
            rule__Type__FractionalDigitsAssignment_20_5();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getFractionalDigitsAssignment_20_5()); 

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
    // $ANTLR end "rule__Type__Group_20__5__Impl"


    // $ANTLR start "rule__Type__Group_20__6"
    // InternalSimpleIDL.g:4003:1: rule__Type__Group_20__6 : rule__Type__Group_20__6__Impl ;
    public final void rule__Type__Group_20__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4007:1: ( rule__Type__Group_20__6__Impl )
            // InternalSimpleIDL.g:4008:2: rule__Type__Group_20__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_20__6__Impl();

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
    // $ANTLR end "rule__Type__Group_20__6"


    // $ANTLR start "rule__Type__Group_20__6__Impl"
    // InternalSimpleIDL.g:4014:1: rule__Type__Group_20__6__Impl : ( '>' ) ;
    public final void rule__Type__Group_20__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4018:1: ( ( '>' ) )
            // InternalSimpleIDL.g:4019:1: ( '>' )
            {
            // InternalSimpleIDL.g:4019:1: ( '>' )
            // InternalSimpleIDL.g:4020:2: '>'
            {
             before(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_20_6()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_20_6()); 

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
    // $ANTLR end "rule__Type__Group_20__6__Impl"


    // $ANTLR start "rule__ScopedName__Group__0"
    // InternalSimpleIDL.g:4030:1: rule__ScopedName__Group__0 : rule__ScopedName__Group__0__Impl rule__ScopedName__Group__1 ;
    public final void rule__ScopedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4034:1: ( rule__ScopedName__Group__0__Impl rule__ScopedName__Group__1 )
            // InternalSimpleIDL.g:4035:2: rule__ScopedName__Group__0__Impl rule__ScopedName__Group__1
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
    // InternalSimpleIDL.g:4042:1: rule__ScopedName__Group__0__Impl : ( ( '::' )? ) ;
    public final void rule__ScopedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4046:1: ( ( ( '::' )? ) )
            // InternalSimpleIDL.g:4047:1: ( ( '::' )? )
            {
            // InternalSimpleIDL.g:4047:1: ( ( '::' )? )
            // InternalSimpleIDL.g:4048:2: ( '::' )?
            {
             before(grammarAccess.getScopedNameAccess().getColonColonKeyword_0()); 
            // InternalSimpleIDL.g:4049:2: ( '::' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==43) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSimpleIDL.g:4049:3: '::'
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
    // InternalSimpleIDL.g:4057:1: rule__ScopedName__Group__1 : rule__ScopedName__Group__1__Impl rule__ScopedName__Group__2 ;
    public final void rule__ScopedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4061:1: ( rule__ScopedName__Group__1__Impl rule__ScopedName__Group__2 )
            // InternalSimpleIDL.g:4062:2: rule__ScopedName__Group__1__Impl rule__ScopedName__Group__2
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
    // InternalSimpleIDL.g:4069:1: rule__ScopedName__Group__1__Impl : ( ( rule__ScopedName__Group_1__0 )* ) ;
    public final void rule__ScopedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4073:1: ( ( ( rule__ScopedName__Group_1__0 )* ) )
            // InternalSimpleIDL.g:4074:1: ( ( rule__ScopedName__Group_1__0 )* )
            {
            // InternalSimpleIDL.g:4074:1: ( ( rule__ScopedName__Group_1__0 )* )
            // InternalSimpleIDL.g:4075:2: ( rule__ScopedName__Group_1__0 )*
            {
             before(grammarAccess.getScopedNameAccess().getGroup_1()); 
            // InternalSimpleIDL.g:4076:2: ( rule__ScopedName__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==43) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // InternalSimpleIDL.g:4076:3: rule__ScopedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__ScopedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalSimpleIDL.g:4084:1: rule__ScopedName__Group__2 : rule__ScopedName__Group__2__Impl ;
    public final void rule__ScopedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4088:1: ( rule__ScopedName__Group__2__Impl )
            // InternalSimpleIDL.g:4089:2: rule__ScopedName__Group__2__Impl
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
    // InternalSimpleIDL.g:4095:1: rule__ScopedName__Group__2__Impl : ( RULE_ID ) ;
    public final void rule__ScopedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4099:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4100:1: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4100:1: ( RULE_ID )
            // InternalSimpleIDL.g:4101:2: RULE_ID
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
    // InternalSimpleIDL.g:4111:1: rule__ScopedName__Group_1__0 : rule__ScopedName__Group_1__0__Impl rule__ScopedName__Group_1__1 ;
    public final void rule__ScopedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4115:1: ( rule__ScopedName__Group_1__0__Impl rule__ScopedName__Group_1__1 )
            // InternalSimpleIDL.g:4116:2: rule__ScopedName__Group_1__0__Impl rule__ScopedName__Group_1__1
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
    // InternalSimpleIDL.g:4123:1: rule__ScopedName__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__ScopedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4127:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4128:1: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4128:1: ( RULE_ID )
            // InternalSimpleIDL.g:4129:2: RULE_ID
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
    // InternalSimpleIDL.g:4138:1: rule__ScopedName__Group_1__1 : rule__ScopedName__Group_1__1__Impl ;
    public final void rule__ScopedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4142:1: ( rule__ScopedName__Group_1__1__Impl )
            // InternalSimpleIDL.g:4143:2: rule__ScopedName__Group_1__1__Impl
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
    // InternalSimpleIDL.g:4149:1: rule__ScopedName__Group_1__1__Impl : ( '::' ) ;
    public final void rule__ScopedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4153:1: ( ( '::' ) )
            // InternalSimpleIDL.g:4154:1: ( '::' )
            {
            // InternalSimpleIDL.g:4154:1: ( '::' )
            // InternalSimpleIDL.g:4155:2: '::'
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
    // InternalSimpleIDL.g:4165:1: rule__Specification__DefinitionsAssignment : ( ruleDefinition ) ;
    public final void rule__Specification__DefinitionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4169:1: ( ( ruleDefinition ) )
            // InternalSimpleIDL.g:4170:2: ( ruleDefinition )
            {
            // InternalSimpleIDL.g:4170:2: ( ruleDefinition )
            // InternalSimpleIDL.g:4171:3: ruleDefinition
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
    // InternalSimpleIDL.g:4180:1: rule__Definition__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4184:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4185:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4185:2: ( RULE_ID )
            // InternalSimpleIDL.g:4186:3: RULE_ID
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
    // InternalSimpleIDL.g:4195:1: rule__Definition__DefinitionsAssignment_0_4 : ( ruleDefinition ) ;
    public final void rule__Definition__DefinitionsAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4199:1: ( ( ruleDefinition ) )
            // InternalSimpleIDL.g:4200:2: ( ruleDefinition )
            {
            // InternalSimpleIDL.g:4200:2: ( ruleDefinition )
            // InternalSimpleIDL.g:4201:3: ruleDefinition
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
    // InternalSimpleIDL.g:4210:1: rule__Definition__NameAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4214:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4215:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4215:2: ( RULE_ID )
            // InternalSimpleIDL.g:4216:3: RULE_ID
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
    // InternalSimpleIDL.g:4225:1: rule__Definition__MembersAssignment_1_4 : ( ruleMember ) ;
    public final void rule__Definition__MembersAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4229:1: ( ( ruleMember ) )
            // InternalSimpleIDL.g:4230:2: ( ruleMember )
            {
            // InternalSimpleIDL.g:4230:2: ( ruleMember )
            // InternalSimpleIDL.g:4231:3: ruleMember
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
    // InternalSimpleIDL.g:4240:1: rule__Definition__StructAssignment_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__Definition__StructAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4244:1: ( ( ( RULE_ID ) ) )
            // InternalSimpleIDL.g:4245:2: ( ( RULE_ID ) )
            {
            // InternalSimpleIDL.g:4245:2: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4246:3: ( RULE_ID )
            {
             before(grammarAccess.getDefinitionAccess().getStructStructCrossReference_2_2_0()); 
            // InternalSimpleIDL.g:4247:3: ( RULE_ID )
            // InternalSimpleIDL.g:4248:4: RULE_ID
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
    // InternalSimpleIDL.g:4259:1: rule__Definition__NameAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4263:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4264:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4264:2: ( RULE_ID )
            // InternalSimpleIDL.g:4265:3: RULE_ID
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
    // InternalSimpleIDL.g:4274:1: rule__Definition__CasesAssignment_3_10 : ( ruleCase ) ;
    public final void rule__Definition__CasesAssignment_3_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4278:1: ( ( ruleCase ) )
            // InternalSimpleIDL.g:4279:2: ( ruleCase )
            {
            // InternalSimpleIDL.g:4279:2: ( ruleCase )
            // InternalSimpleIDL.g:4280:3: ruleCase
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
    // InternalSimpleIDL.g:4289:1: rule__Definition__NameAssignment_4_2 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4293:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4294:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4294:2: ( RULE_ID )
            // InternalSimpleIDL.g:4295:3: RULE_ID
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
    // InternalSimpleIDL.g:4304:1: rule__Definition__LiteralsAssignment_4_4 : ( RULE_ID ) ;
    public final void rule__Definition__LiteralsAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4308:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4309:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4309:2: ( RULE_ID )
            // InternalSimpleIDL.g:4310:3: RULE_ID
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
    // InternalSimpleIDL.g:4319:1: rule__Definition__LiteralsAssignment_4_5_1 : ( RULE_ID ) ;
    public final void rule__Definition__LiteralsAssignment_4_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4323:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4324:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4324:2: ( RULE_ID )
            // InternalSimpleIDL.g:4325:3: RULE_ID
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
    // InternalSimpleIDL.g:4334:1: rule__Definition__TypeAssignment_5_2 : ( ruleType ) ;
    public final void rule__Definition__TypeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4338:1: ( ( ruleType ) )
            // InternalSimpleIDL.g:4339:2: ( ruleType )
            {
            // InternalSimpleIDL.g:4339:2: ( ruleType )
            // InternalSimpleIDL.g:4340:3: ruleType
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


    // $ANTLR start "rule__Definition__NameAssignment_5_3"
    // InternalSimpleIDL.g:4349:1: rule__Definition__NameAssignment_5_3 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4353:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4354:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4354:2: ( RULE_ID )
            // InternalSimpleIDL.g:4355:3: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_5_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_5_3_0()); 

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
    // $ANTLR end "rule__Definition__NameAssignment_5_3"


    // $ANTLR start "rule__Definition__TypeAssignment_6_2"
    // InternalSimpleIDL.g:4364:1: rule__Definition__TypeAssignment_6_2 : ( ( ruleScopedName ) ) ;
    public final void rule__Definition__TypeAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4368:1: ( ( ( ruleScopedName ) ) )
            // InternalSimpleIDL.g:4369:2: ( ( ruleScopedName ) )
            {
            // InternalSimpleIDL.g:4369:2: ( ( ruleScopedName ) )
            // InternalSimpleIDL.g:4370:3: ( ruleScopedName )
            {
             before(grammarAccess.getDefinitionAccess().getTypeDefinitionCrossReference_6_2_0()); 
            // InternalSimpleIDL.g:4371:3: ( ruleScopedName )
            // InternalSimpleIDL.g:4372:4: ruleScopedName
            {
             before(grammarAccess.getDefinitionAccess().getTypeDefinitionScopedNameParserRuleCall_6_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleScopedName();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getTypeDefinitionScopedNameParserRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getDefinitionAccess().getTypeDefinitionCrossReference_6_2_0()); 

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
    // $ANTLR end "rule__Definition__TypeAssignment_6_2"


    // $ANTLR start "rule__Definition__NameAssignment_6_3"
    // InternalSimpleIDL.g:4383:1: rule__Definition__NameAssignment_6_3 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4387:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4388:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4388:2: ( RULE_ID )
            // InternalSimpleIDL.g:4389:3: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_6_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_6_3_0()); 

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
    // $ANTLR end "rule__Definition__NameAssignment_6_3"


    // $ANTLR start "rule__Definition__SizeAssignment_6_5"
    // InternalSimpleIDL.g:4398:1: rule__Definition__SizeAssignment_6_5 : ( RULE_INT ) ;
    public final void rule__Definition__SizeAssignment_6_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4402:1: ( ( RULE_INT ) )
            // InternalSimpleIDL.g:4403:2: ( RULE_INT )
            {
            // InternalSimpleIDL.g:4403:2: ( RULE_INT )
            // InternalSimpleIDL.g:4404:3: RULE_INT
            {
             before(grammarAccess.getDefinitionAccess().getSizeINTTerminalRuleCall_6_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getSizeINTTerminalRuleCall_6_5_0()); 

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
    // $ANTLR end "rule__Definition__SizeAssignment_6_5"


    // $ANTLR start "rule__Member__TypeAssignment_0"
    // InternalSimpleIDL.g:4413:1: rule__Member__TypeAssignment_0 : ( ( ruleScopedName ) ) ;
    public final void rule__Member__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4417:1: ( ( ( ruleScopedName ) ) )
            // InternalSimpleIDL.g:4418:2: ( ( ruleScopedName ) )
            {
            // InternalSimpleIDL.g:4418:2: ( ( ruleScopedName ) )
            // InternalSimpleIDL.g:4419:3: ( ruleScopedName )
            {
             before(grammarAccess.getMemberAccess().getTypeDefinitionCrossReference_0_0()); 
            // InternalSimpleIDL.g:4420:3: ( ruleScopedName )
            // InternalSimpleIDL.g:4421:4: ruleScopedName
            {
             before(grammarAccess.getMemberAccess().getTypeDefinitionScopedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleScopedName();

            state._fsp--;

             after(grammarAccess.getMemberAccess().getTypeDefinitionScopedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getMemberAccess().getTypeDefinitionCrossReference_0_0()); 

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
    // InternalSimpleIDL.g:4432:1: rule__Member__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Member__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4436:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4437:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4437:2: ( RULE_ID )
            // InternalSimpleIDL.g:4438:3: RULE_ID
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
    // InternalSimpleIDL.g:4447:1: rule__Case__LabelsAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Case__LabelsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4451:1: ( ( RULE_INT ) )
            // InternalSimpleIDL.g:4452:2: ( RULE_INT )
            {
            // InternalSimpleIDL.g:4452:2: ( RULE_INT )
            // InternalSimpleIDL.g:4453:3: RULE_INT
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
    // InternalSimpleIDL.g:4462:1: rule__Case__TypeAssignment_1 : ( ( ruleScopedName ) ) ;
    public final void rule__Case__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4466:1: ( ( ( ruleScopedName ) ) )
            // InternalSimpleIDL.g:4467:2: ( ( ruleScopedName ) )
            {
            // InternalSimpleIDL.g:4467:2: ( ( ruleScopedName ) )
            // InternalSimpleIDL.g:4468:3: ( ruleScopedName )
            {
             before(grammarAccess.getCaseAccess().getTypeDefinitionCrossReference_1_0()); 
            // InternalSimpleIDL.g:4469:3: ( ruleScopedName )
            // InternalSimpleIDL.g:4470:4: ruleScopedName
            {
             before(grammarAccess.getCaseAccess().getTypeDefinitionScopedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleScopedName();

            state._fsp--;

             after(grammarAccess.getCaseAccess().getTypeDefinitionScopedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCaseAccess().getTypeDefinitionCrossReference_1_0()); 

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
    // InternalSimpleIDL.g:4481:1: rule__Case__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Case__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4485:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4486:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4486:2: ( RULE_ID )
            // InternalSimpleIDL.g:4487:3: RULE_ID
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


    // $ANTLR start "rule__Type__TypeAssignment_13_1"
    // InternalSimpleIDL.g:4496:1: rule__Type__TypeAssignment_13_1 : ( ( ruleScopedName ) ) ;
    public final void rule__Type__TypeAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4500:1: ( ( ( ruleScopedName ) ) )
            // InternalSimpleIDL.g:4501:2: ( ( ruleScopedName ) )
            {
            // InternalSimpleIDL.g:4501:2: ( ( ruleScopedName ) )
            // InternalSimpleIDL.g:4502:3: ( ruleScopedName )
            {
             before(grammarAccess.getTypeAccess().getTypeDefinitionCrossReference_13_1_0()); 
            // InternalSimpleIDL.g:4503:3: ( ruleScopedName )
            // InternalSimpleIDL.g:4504:4: ruleScopedName
            {
             before(grammarAccess.getTypeAccess().getTypeDefinitionScopedNameParserRuleCall_13_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleScopedName();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getTypeDefinitionScopedNameParserRuleCall_13_1_0_1()); 

            }

             after(grammarAccess.getTypeAccess().getTypeDefinitionCrossReference_13_1_0()); 

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
    // $ANTLR end "rule__Type__TypeAssignment_13_1"


    // $ANTLR start "rule__Type__TypeAssignment_14_3"
    // InternalSimpleIDL.g:4515:1: rule__Type__TypeAssignment_14_3 : ( ( ruleScopedName ) ) ;
    public final void rule__Type__TypeAssignment_14_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4519:1: ( ( ( ruleScopedName ) ) )
            // InternalSimpleIDL.g:4520:2: ( ( ruleScopedName ) )
            {
            // InternalSimpleIDL.g:4520:2: ( ( ruleScopedName ) )
            // InternalSimpleIDL.g:4521:3: ( ruleScopedName )
            {
             before(grammarAccess.getTypeAccess().getTypeDefinitionCrossReference_14_3_0()); 
            // InternalSimpleIDL.g:4522:3: ( ruleScopedName )
            // InternalSimpleIDL.g:4523:4: ruleScopedName
            {
             before(grammarAccess.getTypeAccess().getTypeDefinitionScopedNameParserRuleCall_14_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleScopedName();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getTypeDefinitionScopedNameParserRuleCall_14_3_0_1()); 

            }

             after(grammarAccess.getTypeAccess().getTypeDefinitionCrossReference_14_3_0()); 

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
    // $ANTLR end "rule__Type__TypeAssignment_14_3"


    // $ANTLR start "rule__Type__SizeAssignment_14_5"
    // InternalSimpleIDL.g:4534:1: rule__Type__SizeAssignment_14_5 : ( RULE_INT ) ;
    public final void rule__Type__SizeAssignment_14_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4538:1: ( ( RULE_INT ) )
            // InternalSimpleIDL.g:4539:2: ( RULE_INT )
            {
            // InternalSimpleIDL.g:4539:2: ( RULE_INT )
            // InternalSimpleIDL.g:4540:3: RULE_INT
            {
             before(grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_14_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_14_5_0()); 

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
    // $ANTLR end "rule__Type__SizeAssignment_14_5"


    // $ANTLR start "rule__Type__TypeAssignment_15_3"
    // InternalSimpleIDL.g:4549:1: rule__Type__TypeAssignment_15_3 : ( ( ruleScopedName ) ) ;
    public final void rule__Type__TypeAssignment_15_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4553:1: ( ( ( ruleScopedName ) ) )
            // InternalSimpleIDL.g:4554:2: ( ( ruleScopedName ) )
            {
            // InternalSimpleIDL.g:4554:2: ( ( ruleScopedName ) )
            // InternalSimpleIDL.g:4555:3: ( ruleScopedName )
            {
             before(grammarAccess.getTypeAccess().getTypeDefinitionCrossReference_15_3_0()); 
            // InternalSimpleIDL.g:4556:3: ( ruleScopedName )
            // InternalSimpleIDL.g:4557:4: ruleScopedName
            {
             before(grammarAccess.getTypeAccess().getTypeDefinitionScopedNameParserRuleCall_15_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleScopedName();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getTypeDefinitionScopedNameParserRuleCall_15_3_0_1()); 

            }

             after(grammarAccess.getTypeAccess().getTypeDefinitionCrossReference_15_3_0()); 

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
    // $ANTLR end "rule__Type__TypeAssignment_15_3"


    // $ANTLR start "rule__Type__SizeAssignment_16_3"
    // InternalSimpleIDL.g:4568:1: rule__Type__SizeAssignment_16_3 : ( RULE_INT ) ;
    public final void rule__Type__SizeAssignment_16_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4572:1: ( ( RULE_INT ) )
            // InternalSimpleIDL.g:4573:2: ( RULE_INT )
            {
            // InternalSimpleIDL.g:4573:2: ( RULE_INT )
            // InternalSimpleIDL.g:4574:3: RULE_INT
            {
             before(grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_16_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_16_3_0()); 

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
    // $ANTLR end "rule__Type__SizeAssignment_16_3"


    // $ANTLR start "rule__Type__SizeAssignment_18_3"
    // InternalSimpleIDL.g:4583:1: rule__Type__SizeAssignment_18_3 : ( RULE_INT ) ;
    public final void rule__Type__SizeAssignment_18_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4587:1: ( ( RULE_INT ) )
            // InternalSimpleIDL.g:4588:2: ( RULE_INT )
            {
            // InternalSimpleIDL.g:4588:2: ( RULE_INT )
            // InternalSimpleIDL.g:4589:3: RULE_INT
            {
             before(grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_18_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_18_3_0()); 

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
    // $ANTLR end "rule__Type__SizeAssignment_18_3"


    // $ANTLR start "rule__Type__TotalDigitsAssignment_20_3"
    // InternalSimpleIDL.g:4598:1: rule__Type__TotalDigitsAssignment_20_3 : ( RULE_INT ) ;
    public final void rule__Type__TotalDigitsAssignment_20_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4602:1: ( ( RULE_INT ) )
            // InternalSimpleIDL.g:4603:2: ( RULE_INT )
            {
            // InternalSimpleIDL.g:4603:2: ( RULE_INT )
            // InternalSimpleIDL.g:4604:3: RULE_INT
            {
             before(grammarAccess.getTypeAccess().getTotalDigitsINTTerminalRuleCall_20_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTotalDigitsINTTerminalRuleCall_20_3_0()); 

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
    // $ANTLR end "rule__Type__TotalDigitsAssignment_20_3"


    // $ANTLR start "rule__Type__FractionalDigitsAssignment_20_5"
    // InternalSimpleIDL.g:4613:1: rule__Type__FractionalDigitsAssignment_20_5 : ( RULE_INT ) ;
    public final void rule__Type__FractionalDigitsAssignment_20_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4617:1: ( ( RULE_INT ) )
            // InternalSimpleIDL.g:4618:2: ( RULE_INT )
            {
            // InternalSimpleIDL.g:4618:2: ( RULE_INT )
            // InternalSimpleIDL.g:4619:3: RULE_INT
            {
             before(grammarAccess.getTypeAccess().getFractionalDigitsINTTerminalRuleCall_20_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getFractionalDigitsINTTerminalRuleCall_20_5_0()); 

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
    // $ANTLR end "rule__Type__FractionalDigitsAssignment_20_5"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\14\1\uffff\1\4\2\uffff\1\4\1\15\2\4\3\uffff\1\17\1\4\1\uffff";
    static final String dfa_3s = "\1\31\1\uffff\1\4\2\uffff\1\53\1\17\1\4\1\53\3\uffff\1\32\1\4\1\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\4\1\5\4\uffff\1\6\1\2\1\3\2\uffff\1\7";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\3\uffff\1\2\1\3\5\uffff\1\4\1\uffff\1\5",
            "",
            "\1\6",
            "",
            "",
            "\1\10\17\uffff\2\11\10\uffff\10\11\2\uffff\3\11\1\7",
            "\1\12\1\uffff\1\13",
            "\1\10",
            "\1\14\46\uffff\1\15",
            "",
            "",
            "",
            "\1\11\12\uffff\1\16",
            "\1\10",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "225:1: rule__Definition__Alternatives : ( ( ( rule__Definition__Group_0__0 ) ) | ( ( rule__Definition__Group_1__0 ) ) | ( ( rule__Definition__Group_2__0 ) ) | ( ( rule__Definition__Group_3__0 ) ) | ( ( rule__Definition__Group_4__0 ) ) | ( ( rule__Definition__Group_5__0 ) ) | ( ( rule__Definition__Group_6__0 ) ) );";
        }
    }
    static final String dfa_7s = "\40\uffff";
    static final String dfa_8s = "\2\uffff\1\17\11\uffff\1\26\1\30\4\uffff\1\31\15\uffff";
    static final String dfa_9s = "\1\4\1\uffff\1\4\1\25\7\uffff\1\46\2\4\4\uffff\1\4\1\uffff\1\4\6\uffff\1\4\1\30\1\4\2\uffff";
    static final String dfa_10s = "\1\53\1\uffff\1\40\1\36\7\uffff\3\46\4\uffff\1\36\1\uffff\1\53\6\uffff\1\4\1\53\1\4\2\uffff";
    static final String dfa_11s = "\1\uffff\1\1\2\uffff\1\7\1\10\1\12\1\13\1\14\1\15\1\16\3\uffff\1\25\1\2\1\11\1\3\1\uffff\1\4\1\uffff\1\21\1\22\1\23\1\24\1\5\1\6\3\uffff\1\17\1\20";
    static final String dfa_12s = "\40\uffff}>";
    static final String[] dfa_13s = {
            "\1\12\17\uffff\1\3\1\1\10\uffff\1\2\1\4\1\5\1\6\1\7\1\10\1\11\1\13\2\uffff\1\14\1\15\1\16\1\12",
            "",
            "\1\17\31\uffff\1\21\1\uffff\1\20",
            "\1\23\10\uffff\1\22",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\24",
            "\1\26\41\uffff\1\25",
            "\1\30\41\uffff\1\27",
            "",
            "",
            "",
            "",
            "\1\31\31\uffff\1\32",
            "",
            "\1\34\46\uffff\1\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\34",
            "\1\36\16\uffff\1\37\3\uffff\1\35",
            "\1\34",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "276:1: rule__Type__Alternatives : ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) | ( ( rule__Type__Group_3__0 ) ) | ( ( rule__Type__Group_4__0 ) ) | ( ( rule__Type__Group_5__0 ) ) | ( ( rule__Type__Group_6__0 ) ) | ( ( rule__Type__Group_7__0 ) ) | ( ( rule__Type__Group_8__0 ) ) | ( ( rule__Type__Group_9__0 ) ) | ( ( rule__Type__Group_10__0 ) ) | ( ( rule__Type__Group_11__0 ) ) | ( ( rule__Type__Group_12__0 ) ) | ( ( rule__Type__Group_13__0 ) ) | ( ( rule__Type__Group_14__0 ) ) | ( ( rule__Type__Group_15__0 ) ) | ( ( rule__Type__Group_16__0 ) ) | ( ( rule__Type__Group_17__0 ) ) | ( ( rule__Type__Group_18__0 ) ) | ( ( rule__Type__Group_19__0 ) ) | ( ( rule__Type__Group_20__0 ) ) );";
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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000080000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000F3FC0300010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000080000000000L});

}