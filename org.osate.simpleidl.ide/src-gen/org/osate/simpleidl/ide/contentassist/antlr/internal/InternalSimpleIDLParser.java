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
@SuppressWarnings("all")
public class InternalSimpleIDLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_PREPROCESSOR", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'struct'", "';'", "'module'", "'{'", "'}'", "'union'", "'switch'", "'('", "'unsigned'", "'short'", "')'", "'enum'", "','", "'typedef'", "'['", "']'", "'long'", "'float'", "'double'", "'char'", "'wchar'", "'boolean'", "'octet'", "'sequence'", "'<'", "'>'", "'string'", "'wstring'", "'fixed'", "'case'", "':'", "'::'"
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

                if ( (LA1_0==12||LA1_0==14||LA1_0==17||LA1_0==23||LA1_0==25) ) {
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


    // $ANTLR start "entryRuleNamedDefinition"
    // InternalSimpleIDL.g:126:1: entryRuleNamedDefinition : ruleNamedDefinition EOF ;
    public final void entryRuleNamedDefinition() throws RecognitionException {
        try {
            // InternalSimpleIDL.g:127:1: ( ruleNamedDefinition EOF )
            // InternalSimpleIDL.g:128:1: ruleNamedDefinition EOF
            {
             before(grammarAccess.getNamedDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleNamedDefinition();

            state._fsp--;

             after(grammarAccess.getNamedDefinitionRule()); 
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
    // $ANTLR end "entryRuleNamedDefinition"


    // $ANTLR start "ruleNamedDefinition"
    // InternalSimpleIDL.g:135:1: ruleNamedDefinition : ( ( rule__NamedDefinition__Alternatives ) ) ;
    public final void ruleNamedDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:139:2: ( ( ( rule__NamedDefinition__Alternatives ) ) )
            // InternalSimpleIDL.g:140:2: ( ( rule__NamedDefinition__Alternatives ) )
            {
            // InternalSimpleIDL.g:140:2: ( ( rule__NamedDefinition__Alternatives ) )
            // InternalSimpleIDL.g:141:3: ( rule__NamedDefinition__Alternatives )
            {
             before(grammarAccess.getNamedDefinitionAccess().getAlternatives()); 
            // InternalSimpleIDL.g:142:3: ( rule__NamedDefinition__Alternatives )
            // InternalSimpleIDL.g:142:4: rule__NamedDefinition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamedDefinition"


    // $ANTLR start "entryRuleMember"
    // InternalSimpleIDL.g:151:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // InternalSimpleIDL.g:152:1: ( ruleMember EOF )
            // InternalSimpleIDL.g:153:1: ruleMember EOF
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
    // InternalSimpleIDL.g:160:1: ruleMember : ( ( rule__Member__Group__0 ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:164:2: ( ( ( rule__Member__Group__0 ) ) )
            // InternalSimpleIDL.g:165:2: ( ( rule__Member__Group__0 ) )
            {
            // InternalSimpleIDL.g:165:2: ( ( rule__Member__Group__0 ) )
            // InternalSimpleIDL.g:166:3: ( rule__Member__Group__0 )
            {
             before(grammarAccess.getMemberAccess().getGroup()); 
            // InternalSimpleIDL.g:167:3: ( rule__Member__Group__0 )
            // InternalSimpleIDL.g:167:4: rule__Member__Group__0
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
    // InternalSimpleIDL.g:176:1: entryRuleCase : ruleCase EOF ;
    public final void entryRuleCase() throws RecognitionException {
        try {
            // InternalSimpleIDL.g:177:1: ( ruleCase EOF )
            // InternalSimpleIDL.g:178:1: ruleCase EOF
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
    // InternalSimpleIDL.g:185:1: ruleCase : ( ( rule__Case__Group__0 ) ) ;
    public final void ruleCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:189:2: ( ( ( rule__Case__Group__0 ) ) )
            // InternalSimpleIDL.g:190:2: ( ( rule__Case__Group__0 ) )
            {
            // InternalSimpleIDL.g:190:2: ( ( rule__Case__Group__0 ) )
            // InternalSimpleIDL.g:191:3: ( rule__Case__Group__0 )
            {
             before(grammarAccess.getCaseAccess().getGroup()); 
            // InternalSimpleIDL.g:192:3: ( rule__Case__Group__0 )
            // InternalSimpleIDL.g:192:4: rule__Case__Group__0
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
    // InternalSimpleIDL.g:225:1: rule__Definition__Alternatives : ( ( ruleNamedDefinition ) | ( ( rule__Definition__Group_1__0 ) ) );
    public final void rule__Definition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:229:1: ( ( ruleNamedDefinition ) | ( ( rule__Definition__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14||LA2_0==17||LA2_0==23||LA2_0==25) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==RULE_ID) ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==15) ) {
                        alt2=1;
                    }
                    else if ( (LA2_3==13) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSimpleIDL.g:230:2: ( ruleNamedDefinition )
                    {
                    // InternalSimpleIDL.g:230:2: ( ruleNamedDefinition )
                    // InternalSimpleIDL.g:231:3: ruleNamedDefinition
                    {
                     before(grammarAccess.getDefinitionAccess().getNamedDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNamedDefinition();

                    state._fsp--;

                     after(grammarAccess.getDefinitionAccess().getNamedDefinitionParserRuleCall_0()); 

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

            }
        }
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


    // $ANTLR start "rule__NamedDefinition__Alternatives"
    // InternalSimpleIDL.g:246:1: rule__NamedDefinition__Alternatives : ( ( ( rule__NamedDefinition__Group_0__0 ) ) | ( ( rule__NamedDefinition__Group_1__0 ) ) | ( ( rule__NamedDefinition__Group_2__0 ) ) | ( ( rule__NamedDefinition__Group_3__0 ) ) | ( ( rule__NamedDefinition__Group_4__0 ) ) | ( ( rule__NamedDefinition__Group_5__0 ) ) | ( ( rule__NamedDefinition__Group_6__0 ) ) | ( ( rule__NamedDefinition__Group_7__0 ) ) | ( ( rule__NamedDefinition__Group_8__0 ) ) | ( ( rule__NamedDefinition__Group_9__0 ) ) | ( ( rule__NamedDefinition__Group_10__0 ) ) | ( ( rule__NamedDefinition__Group_11__0 ) ) | ( ( rule__NamedDefinition__Group_12__0 ) ) | ( ( rule__NamedDefinition__Group_13__0 ) ) | ( ( rule__NamedDefinition__Group_14__0 ) ) | ( ( rule__NamedDefinition__Group_15__0 ) ) | ( ( rule__NamedDefinition__Group_16__0 ) ) | ( ( rule__NamedDefinition__Group_17__0 ) ) | ( ( rule__NamedDefinition__Group_18__0 ) ) | ( ( rule__NamedDefinition__Group_19__0 ) ) | ( ( rule__NamedDefinition__Group_20__0 ) ) | ( ( rule__NamedDefinition__Group_21__0 ) ) | ( ( rule__NamedDefinition__Group_22__0 ) ) | ( ( rule__NamedDefinition__Group_23__0 ) ) | ( ( rule__NamedDefinition__Group_24__0 ) ) | ( ( rule__NamedDefinition__Group_25__0 ) ) );
    public final void rule__NamedDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:250:1: ( ( ( rule__NamedDefinition__Group_0__0 ) ) | ( ( rule__NamedDefinition__Group_1__0 ) ) | ( ( rule__NamedDefinition__Group_2__0 ) ) | ( ( rule__NamedDefinition__Group_3__0 ) ) | ( ( rule__NamedDefinition__Group_4__0 ) ) | ( ( rule__NamedDefinition__Group_5__0 ) ) | ( ( rule__NamedDefinition__Group_6__0 ) ) | ( ( rule__NamedDefinition__Group_7__0 ) ) | ( ( rule__NamedDefinition__Group_8__0 ) ) | ( ( rule__NamedDefinition__Group_9__0 ) ) | ( ( rule__NamedDefinition__Group_10__0 ) ) | ( ( rule__NamedDefinition__Group_11__0 ) ) | ( ( rule__NamedDefinition__Group_12__0 ) ) | ( ( rule__NamedDefinition__Group_13__0 ) ) | ( ( rule__NamedDefinition__Group_14__0 ) ) | ( ( rule__NamedDefinition__Group_15__0 ) ) | ( ( rule__NamedDefinition__Group_16__0 ) ) | ( ( rule__NamedDefinition__Group_17__0 ) ) | ( ( rule__NamedDefinition__Group_18__0 ) ) | ( ( rule__NamedDefinition__Group_19__0 ) ) | ( ( rule__NamedDefinition__Group_20__0 ) ) | ( ( rule__NamedDefinition__Group_21__0 ) ) | ( ( rule__NamedDefinition__Group_22__0 ) ) | ( ( rule__NamedDefinition__Group_23__0 ) ) | ( ( rule__NamedDefinition__Group_24__0 ) ) | ( ( rule__NamedDefinition__Group_25__0 ) ) )
            int alt3=26;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalSimpleIDL.g:251:2: ( ( rule__NamedDefinition__Group_0__0 ) )
                    {
                    // InternalSimpleIDL.g:251:2: ( ( rule__NamedDefinition__Group_0__0 ) )
                    // InternalSimpleIDL.g:252:3: ( rule__NamedDefinition__Group_0__0 )
                    {
                     before(grammarAccess.getNamedDefinitionAccess().getGroup_0()); 
                    // InternalSimpleIDL.g:253:3: ( rule__NamedDefinition__Group_0__0 )
                    // InternalSimpleIDL.g:253:4: rule__NamedDefinition__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedDefinition__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedDefinitionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleIDL.g:257:2: ( ( rule__NamedDefinition__Group_1__0 ) )
                    {
                    // InternalSimpleIDL.g:257:2: ( ( rule__NamedDefinition__Group_1__0 ) )
                    // InternalSimpleIDL.g:258:3: ( rule__NamedDefinition__Group_1__0 )
                    {
                     before(grammarAccess.getNamedDefinitionAccess().getGroup_1()); 
                    // InternalSimpleIDL.g:259:3: ( rule__NamedDefinition__Group_1__0 )
                    // InternalSimpleIDL.g:259:4: rule__NamedDefinition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedDefinition__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedDefinitionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleIDL.g:263:2: ( ( rule__NamedDefinition__Group_2__0 ) )
                    {
                    // InternalSimpleIDL.g:263:2: ( ( rule__NamedDefinition__Group_2__0 ) )
                    // InternalSimpleIDL.g:264:3: ( rule__NamedDefinition__Group_2__0 )
                    {
                     before(grammarAccess.getNamedDefinitionAccess().getGroup_2()); 
                    // InternalSimpleIDL.g:265:3: ( rule__NamedDefinition__Group_2__0 )
                    // InternalSimpleIDL.g:265:4: rule__NamedDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedDefinition__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedDefinitionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSimpleIDL.g:269:2: ( ( rule__NamedDefinition__Group_3__0 ) )
                    {
                    // InternalSimpleIDL.g:269:2: ( ( rule__NamedDefinition__Group_3__0 ) )
                    // InternalSimpleIDL.g:270:3: ( rule__NamedDefinition__Group_3__0 )
                    {
                     before(grammarAccess.getNamedDefinitionAccess().getGroup_3()); 
                    // InternalSimpleIDL.g:271:3: ( rule__NamedDefinition__Group_3__0 )
                    // InternalSimpleIDL.g:271:4: rule__NamedDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedDefinition__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedDefinitionAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSimpleIDL.g:275:2: ( ( rule__NamedDefinition__Group_4__0 ) )
                    {
                    // InternalSimpleIDL.g:275:2: ( ( rule__NamedDefinition__Group_4__0 ) )
                    // InternalSimpleIDL.g:276:3: ( rule__NamedDefinition__Group_4__0 )
                    {
                     before(grammarAccess.getNamedDefinitionAccess().getGroup_4()); 
                    // InternalSimpleIDL.g:277:3: ( rule__NamedDefinition__Group_4__0 )
                    // InternalSimpleIDL.g:277:4: rule__NamedDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedDefinition__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedDefinitionAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSimpleIDL.g:281:2: ( ( rule__NamedDefinition__Group_5__0 ) )
                    {
                    // InternalSimpleIDL.g:281:2: ( ( rule__NamedDefinition__Group_5__0 ) )
                    // InternalSimpleIDL.g:282:3: ( rule__NamedDefinition__Group_5__0 )
                    {
                     before(grammarAccess.getNamedDefinitionAccess().getGroup_5()); 
                    // InternalSimpleIDL.g:283:3: ( rule__NamedDefinition__Group_5__0 )
                    // InternalSimpleIDL.g:283:4: rule__NamedDefinition__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedDefinition__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedDefinitionAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSimpleIDL.g:287:2: ( ( rule__NamedDefinition__Group_6__0 ) )
                    {
                    // InternalSimpleIDL.g:287:2: ( ( rule__NamedDefinition__Group_6__0 ) )
                    // InternalSimpleIDL.g:288:3: ( rule__NamedDefinition__Group_6__0 )
                    {
                     before(grammarAccess.getNamedDefinitionAccess().getGroup_6()); 
                    // InternalSimpleIDL.g:289:3: ( rule__NamedDefinition__Group_6__0 )
                    // InternalSimpleIDL.g:289:4: rule__NamedDefinition__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedDefinition__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedDefinitionAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSimpleIDL.g:293:2: ( ( rule__NamedDefinition__Group_7__0 ) )
                    {
                    // InternalSimpleIDL.g:293:2: ( ( rule__NamedDefinition__Group_7__0 ) )
                    // InternalSimpleIDL.g:294:3: ( rule__NamedDefinition__Group_7__0 )
                    {
                     before(grammarAccess.getNamedDefinitionAccess().getGroup_7()); 
                    // InternalSimpleIDL.g:295:3: ( rule__NamedDefinition__Group_7__0 )
                    // InternalSimpleIDL.g:295:4: rule__NamedDefinition__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedDefinition__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedDefinitionAccess().getGroup_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSimpleIDL.g:299:2: ( ( rule__NamedDefinition__Group_8__0 ) )
                    {
                    // InternalSimpleIDL.g:299:2: ( ( rule__NamedDefinition__Group_8__0 ) )
                    // InternalSimpleIDL.g:300:3: ( rule__NamedDefinition__Group_8__0 )
                    {
                     before(grammarAccess.getNamedDefinitionAccess().getGroup_8()); 
                    // InternalSimpleIDL.g:301:3: ( rule__NamedDefinition__Group_8__0 )
                    // InternalSimpleIDL.g:301:4: rule__NamedDefinition__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedDefinition__Group_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedDefinitionAccess().getGroup_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSimpleIDL.g:305:2: ( ( rule__NamedDefinition__Group_9__0 ) )
                    {
                    // InternalSimpleIDL.g:305:2: ( ( rule__NamedDefinition__Group_9__0 ) )
                    // InternalSimpleIDL.g:306:3: ( rule__NamedDefinition__Group_9__0 )
                    {
                     before(grammarAccess.getNamedDefinitionAccess().getGroup_9()); 
                    // InternalSimpleIDL.g:307:3: ( rule__NamedDefinition__Group_9__0 )
                    // InternalSimpleIDL.g:307:4: rule__NamedDefinition__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedDefinition__Group_9__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedDefinitionAccess().getGroup_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalSimpleIDL.g:311:2: ( ( rule__NamedDefinition__Group_10__0 ) )
                    {
                    // InternalSimpleIDL.g:311:2: ( ( rule__NamedDefinition__Group_10__0 ) )
                    // InternalSimpleIDL.g:312:3: ( rule__NamedDefinition__Group_10__0 )
                    {
                     before(grammarAccess.getNamedDefinitionAccess().getGroup_10()); 
                    // InternalSimpleIDL.g:313:3: ( rule__NamedDefinition__Group_10__0 )
                    // InternalSimpleIDL.g:313:4: rule__NamedDefinition__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedDefinition__Group_10__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedDefinitionAccess().getGroup_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalSimpleIDL.g:317:2: ( ( rule__NamedDefinition__Group_11__0 ) )
                    {
                    // InternalSimpleIDL.g:317:2: ( ( rule__NamedDefinition__Group_11__0 ) )
                    // InternalSimpleIDL.g:318:3: ( rule__NamedDefinition__Group_11__0 )
                    {
                     before(grammarAccess.getNamedDefinitionAccess().getGroup_11()); 
                    // InternalSimpleIDL.g:319:3: ( rule__NamedDefinition__Group_11__0 )
                    // InternalSimpleIDL.g:319:4: rule__NamedDefinition__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedDefinition__Group_11__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedDefinitionAccess().getGroup_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalSimpleIDL.g:323:2: ( ( rule__NamedDefinition__Group_12__0 ) )
                    {
                    // InternalSimpleIDL.g:323:2: ( ( rule__NamedDefinition__Group_12__0 ) )
                    // InternalSimpleIDL.g:324:3: ( rule__NamedDefinition__Group_12__0 )
                    {
                     before(grammarAccess.getNamedDefinitionAccess().getGroup_12()); 
                    // InternalSimpleIDL.g:325:3: ( rule__NamedDefinition__Group_12__0 )
                    // InternalSimpleIDL.g:325:4: rule__NamedDefinition__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedDefinition__Group_12__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedDefinitionAccess().getGroup_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalSimpleIDL.g:329:2: ( ( rule__NamedDefinition__Group_13__0 ) )
                    {
                    // InternalSimpleIDL.g:329:2: ( ( rule__NamedDefinition__Group_13__0 ) )
                    // InternalSimpleIDL.g:330:3: ( rule__NamedDefinition__Group_13__0 )
                    {
                     before(grammarAccess.getNamedDefinitionAccess().getGroup_13()); 
                    // InternalSimpleIDL.g:331:3: ( rule__NamedDefinition__Group_13__0 )
                    // InternalSimpleIDL.g:331:4: rule__NamedDefinition__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedDefinition__Group_13__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedDefinitionAccess().getGroup_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalSimpleIDL.g:335:2: ( ( rule__NamedDefinition__Group_14__0 ) )
                    {
                    // InternalSimpleIDL.g:335:2: ( ( rule__NamedDefinition__Group_14__0 ) )
                    // InternalSimpleIDL.g:336:3: ( rule__NamedDefinition__Group_14__0 )
                    {
                     before(grammarAccess.getNamedDefinitionAccess().getGroup_14()); 
                    // InternalSimpleIDL.g:337:3: ( rule__NamedDefinition__Group_14__0 )
                    // InternalSimpleIDL.g:337:4: rule__NamedDefinition__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedDefinition__Group_14__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedDefinitionAccess().getGroup_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalSimpleIDL.g:341:2: ( ( rule__NamedDefinition__Group_15__0 ) )
                    {
                    // InternalSimpleIDL.g:341:2: ( ( rule__NamedDefinition__Group_15__0 ) )
                    // InternalSimpleIDL.g:342:3: ( rule__NamedDefinition__Group_15__0 )
                    {
                     before(grammarAccess.getNamedDefinitionAccess().getGroup_15()); 
                    // InternalSimpleIDL.g:343:3: ( rule__NamedDefinition__Group_15__0 )
                    // InternalSimpleIDL.g:343:4: rule__NamedDefinition__Group_15__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedDefinition__Group_15__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedDefinitionAccess().getGroup_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalSimpleIDL.g:347:2: ( ( rule__NamedDefinition__Group_16__0 ) )
                    {
                    // InternalSimpleIDL.g:347:2: ( ( rule__NamedDefinition__Group_16__0 ) )
                    // InternalSimpleIDL.g:348:3: ( rule__NamedDefinition__Group_16__0 )
                    {
                     before(grammarAccess.getNamedDefinitionAccess().getGroup_16()); 
                    // InternalSimpleIDL.g:349:3: ( rule__NamedDefinition__Group_16__0 )
                    // InternalSimpleIDL.g:349:4: rule__NamedDefinition__Group_16__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedDefinition__Group_16__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedDefinitionAccess().getGroup_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalSimpleIDL.g:353:2: ( ( rule__NamedDefinition__Group_17__0 ) )
                    {
                    // InternalSimpleIDL.g:353:2: ( ( rule__NamedDefinition__Group_17__0 ) )
                    // InternalSimpleIDL.g:354:3: ( rule__NamedDefinition__Group_17__0 )
                    {
                     before(grammarAccess.getNamedDefinitionAccess().getGroup_17()); 
                    // InternalSimpleIDL.g:355:3: ( rule__NamedDefinition__Group_17__0 )
                    // InternalSimpleIDL.g:355:4: rule__NamedDefinition__Group_17__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedDefinition__Group_17__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedDefinitionAccess().getGroup_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalSimpleIDL.g:359:2: ( ( rule__NamedDefinition__Group_18__0 ) )
                    {
                    // InternalSimpleIDL.g:359:2: ( ( rule__NamedDefinition__Group_18__0 ) )
                    // InternalSimpleIDL.g:360:3: ( rule__NamedDefinition__Group_18__0 )
                    {
                     before(grammarAccess.getNamedDefinitionAccess().getGroup_18()); 
                    // InternalSimpleIDL.g:361:3: ( rule__NamedDefinition__Group_18__0 )
                    // InternalSimpleIDL.g:361:4: rule__NamedDefinition__Group_18__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedDefinition__Group_18__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedDefinitionAccess().getGroup_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalSimpleIDL.g:365:2: ( ( rule__NamedDefinition__Group_19__0 ) )
                    {
                    // InternalSimpleIDL.g:365:2: ( ( rule__NamedDefinition__Group_19__0 ) )
                    // InternalSimpleIDL.g:366:3: ( rule__NamedDefinition__Group_19__0 )
                    {
                     before(grammarAccess.getNamedDefinitionAccess().getGroup_19()); 
                    // InternalSimpleIDL.g:367:3: ( rule__NamedDefinition__Group_19__0 )
                    // InternalSimpleIDL.g:367:4: rule__NamedDefinition__Group_19__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedDefinition__Group_19__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedDefinitionAccess().getGroup_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalSimpleIDL.g:371:2: ( ( rule__NamedDefinition__Group_20__0 ) )
                    {
                    // InternalSimpleIDL.g:371:2: ( ( rule__NamedDefinition__Group_20__0 ) )
                    // InternalSimpleIDL.g:372:3: ( rule__NamedDefinition__Group_20__0 )
                    {
                     before(grammarAccess.getNamedDefinitionAccess().getGroup_20()); 
                    // InternalSimpleIDL.g:373:3: ( rule__NamedDefinition__Group_20__0 )
                    // InternalSimpleIDL.g:373:4: rule__NamedDefinition__Group_20__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedDefinition__Group_20__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedDefinitionAccess().getGroup_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalSimpleIDL.g:377:2: ( ( rule__NamedDefinition__Group_21__0 ) )
                    {
                    // InternalSimpleIDL.g:377:2: ( ( rule__NamedDefinition__Group_21__0 ) )
                    // InternalSimpleIDL.g:378:3: ( rule__NamedDefinition__Group_21__0 )
                    {
                     before(grammarAccess.getNamedDefinitionAccess().getGroup_21()); 
                    // InternalSimpleIDL.g:379:3: ( rule__NamedDefinition__Group_21__0 )
                    // InternalSimpleIDL.g:379:4: rule__NamedDefinition__Group_21__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedDefinition__Group_21__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedDefinitionAccess().getGroup_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalSimpleIDL.g:383:2: ( ( rule__NamedDefinition__Group_22__0 ) )
                    {
                    // InternalSimpleIDL.g:383:2: ( ( rule__NamedDefinition__Group_22__0 ) )
                    // InternalSimpleIDL.g:384:3: ( rule__NamedDefinition__Group_22__0 )
                    {
                     before(grammarAccess.getNamedDefinitionAccess().getGroup_22()); 
                    // InternalSimpleIDL.g:385:3: ( rule__NamedDefinition__Group_22__0 )
                    // InternalSimpleIDL.g:385:4: rule__NamedDefinition__Group_22__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedDefinition__Group_22__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedDefinitionAccess().getGroup_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalSimpleIDL.g:389:2: ( ( rule__NamedDefinition__Group_23__0 ) )
                    {
                    // InternalSimpleIDL.g:389:2: ( ( rule__NamedDefinition__Group_23__0 ) )
                    // InternalSimpleIDL.g:390:3: ( rule__NamedDefinition__Group_23__0 )
                    {
                     before(grammarAccess.getNamedDefinitionAccess().getGroup_23()); 
                    // InternalSimpleIDL.g:391:3: ( rule__NamedDefinition__Group_23__0 )
                    // InternalSimpleIDL.g:391:4: rule__NamedDefinition__Group_23__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedDefinition__Group_23__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedDefinitionAccess().getGroup_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalSimpleIDL.g:395:2: ( ( rule__NamedDefinition__Group_24__0 ) )
                    {
                    // InternalSimpleIDL.g:395:2: ( ( rule__NamedDefinition__Group_24__0 ) )
                    // InternalSimpleIDL.g:396:3: ( rule__NamedDefinition__Group_24__0 )
                    {
                     before(grammarAccess.getNamedDefinitionAccess().getGroup_24()); 
                    // InternalSimpleIDL.g:397:3: ( rule__NamedDefinition__Group_24__0 )
                    // InternalSimpleIDL.g:397:4: rule__NamedDefinition__Group_24__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedDefinition__Group_24__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedDefinitionAccess().getGroup_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalSimpleIDL.g:401:2: ( ( rule__NamedDefinition__Group_25__0 ) )
                    {
                    // InternalSimpleIDL.g:401:2: ( ( rule__NamedDefinition__Group_25__0 ) )
                    // InternalSimpleIDL.g:402:3: ( rule__NamedDefinition__Group_25__0 )
                    {
                     before(grammarAccess.getNamedDefinitionAccess().getGroup_25()); 
                    // InternalSimpleIDL.g:403:3: ( rule__NamedDefinition__Group_25__0 )
                    // InternalSimpleIDL.g:403:4: rule__NamedDefinition__Group_25__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedDefinition__Group_25__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedDefinitionAccess().getGroup_25()); 

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
    // $ANTLR end "rule__NamedDefinition__Alternatives"


    // $ANTLR start "rule__Definition__Group_1__0"
    // InternalSimpleIDL.g:411:1: rule__Definition__Group_1__0 : rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1 ;
    public final void rule__Definition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:415:1: ( rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1 )
            // InternalSimpleIDL.g:416:2: rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSimpleIDL.g:423:1: rule__Definition__Group_1__0__Impl : ( () ) ;
    public final void rule__Definition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:427:1: ( ( () ) )
            // InternalSimpleIDL.g:428:1: ( () )
            {
            // InternalSimpleIDL.g:428:1: ( () )
            // InternalSimpleIDL.g:429:2: ()
            {
             before(grammarAccess.getDefinitionAccess().getStructForwardAction_1_0()); 
            // InternalSimpleIDL.g:430:2: ()
            // InternalSimpleIDL.g:430:3: 
            {
            }

             after(grammarAccess.getDefinitionAccess().getStructForwardAction_1_0()); 

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
    // InternalSimpleIDL.g:438:1: rule__Definition__Group_1__1 : rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2 ;
    public final void rule__Definition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:442:1: ( rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2 )
            // InternalSimpleIDL.g:443:2: rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2
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
    // InternalSimpleIDL.g:450:1: rule__Definition__Group_1__1__Impl : ( 'struct' ) ;
    public final void rule__Definition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:454:1: ( ( 'struct' ) )
            // InternalSimpleIDL.g:455:1: ( 'struct' )
            {
            // InternalSimpleIDL.g:455:1: ( 'struct' )
            // InternalSimpleIDL.g:456:2: 'struct'
            {
             before(grammarAccess.getDefinitionAccess().getStructKeyword_1_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalSimpleIDL.g:465:1: rule__Definition__Group_1__2 : rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3 ;
    public final void rule__Definition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:469:1: ( rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3 )
            // InternalSimpleIDL.g:470:2: rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3
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
    // InternalSimpleIDL.g:477:1: rule__Definition__Group_1__2__Impl : ( ( rule__Definition__StructAssignment_1_2 ) ) ;
    public final void rule__Definition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:481:1: ( ( ( rule__Definition__StructAssignment_1_2 ) ) )
            // InternalSimpleIDL.g:482:1: ( ( rule__Definition__StructAssignment_1_2 ) )
            {
            // InternalSimpleIDL.g:482:1: ( ( rule__Definition__StructAssignment_1_2 ) )
            // InternalSimpleIDL.g:483:2: ( rule__Definition__StructAssignment_1_2 )
            {
             before(grammarAccess.getDefinitionAccess().getStructAssignment_1_2()); 
            // InternalSimpleIDL.g:484:2: ( rule__Definition__StructAssignment_1_2 )
            // InternalSimpleIDL.g:484:3: rule__Definition__StructAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Definition__StructAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getStructAssignment_1_2()); 

            }


            }

        }
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
    // InternalSimpleIDL.g:492:1: rule__Definition__Group_1__3 : rule__Definition__Group_1__3__Impl ;
    public final void rule__Definition__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:496:1: ( rule__Definition__Group_1__3__Impl )
            // InternalSimpleIDL.g:497:2: rule__Definition__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalSimpleIDL.g:503:1: rule__Definition__Group_1__3__Impl : ( ';' ) ;
    public final void rule__Definition__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:507:1: ( ( ';' ) )
            // InternalSimpleIDL.g:508:1: ( ';' )
            {
            // InternalSimpleIDL.g:508:1: ( ';' )
            // InternalSimpleIDL.g:509:2: ';'
            {
             before(grammarAccess.getDefinitionAccess().getSemicolonKeyword_1_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getSemicolonKeyword_1_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__NamedDefinition__Group_0__0"
    // InternalSimpleIDL.g:519:1: rule__NamedDefinition__Group_0__0 : rule__NamedDefinition__Group_0__0__Impl rule__NamedDefinition__Group_0__1 ;
    public final void rule__NamedDefinition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:523:1: ( rule__NamedDefinition__Group_0__0__Impl rule__NamedDefinition__Group_0__1 )
            // InternalSimpleIDL.g:524:2: rule__NamedDefinition__Group_0__0__Impl rule__NamedDefinition__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__NamedDefinition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_0__0"


    // $ANTLR start "rule__NamedDefinition__Group_0__0__Impl"
    // InternalSimpleIDL.g:531:1: rule__NamedDefinition__Group_0__0__Impl : ( () ) ;
    public final void rule__NamedDefinition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:535:1: ( ( () ) )
            // InternalSimpleIDL.g:536:1: ( () )
            {
            // InternalSimpleIDL.g:536:1: ( () )
            // InternalSimpleIDL.g:537:2: ()
            {
             before(grammarAccess.getNamedDefinitionAccess().getModuleAction_0_0()); 
            // InternalSimpleIDL.g:538:2: ()
            // InternalSimpleIDL.g:538:3: 
            {
            }

             after(grammarAccess.getNamedDefinitionAccess().getModuleAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_0__0__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_0__1"
    // InternalSimpleIDL.g:546:1: rule__NamedDefinition__Group_0__1 : rule__NamedDefinition__Group_0__1__Impl rule__NamedDefinition__Group_0__2 ;
    public final void rule__NamedDefinition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:550:1: ( rule__NamedDefinition__Group_0__1__Impl rule__NamedDefinition__Group_0__2 )
            // InternalSimpleIDL.g:551:2: rule__NamedDefinition__Group_0__1__Impl rule__NamedDefinition__Group_0__2
            {
            pushFollow(FOLLOW_5);
            rule__NamedDefinition__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_0__1"


    // $ANTLR start "rule__NamedDefinition__Group_0__1__Impl"
    // InternalSimpleIDL.g:558:1: rule__NamedDefinition__Group_0__1__Impl : ( 'module' ) ;
    public final void rule__NamedDefinition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:562:1: ( ( 'module' ) )
            // InternalSimpleIDL.g:563:1: ( 'module' )
            {
            // InternalSimpleIDL.g:563:1: ( 'module' )
            // InternalSimpleIDL.g:564:2: 'module'
            {
             before(grammarAccess.getNamedDefinitionAccess().getModuleKeyword_0_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getModuleKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_0__1__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_0__2"
    // InternalSimpleIDL.g:573:1: rule__NamedDefinition__Group_0__2 : rule__NamedDefinition__Group_0__2__Impl rule__NamedDefinition__Group_0__3 ;
    public final void rule__NamedDefinition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:577:1: ( rule__NamedDefinition__Group_0__2__Impl rule__NamedDefinition__Group_0__3 )
            // InternalSimpleIDL.g:578:2: rule__NamedDefinition__Group_0__2__Impl rule__NamedDefinition__Group_0__3
            {
            pushFollow(FOLLOW_8);
            rule__NamedDefinition__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_0__2"


    // $ANTLR start "rule__NamedDefinition__Group_0__2__Impl"
    // InternalSimpleIDL.g:585:1: rule__NamedDefinition__Group_0__2__Impl : ( ( rule__NamedDefinition__NameAssignment_0_2 ) ) ;
    public final void rule__NamedDefinition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:589:1: ( ( ( rule__NamedDefinition__NameAssignment_0_2 ) ) )
            // InternalSimpleIDL.g:590:1: ( ( rule__NamedDefinition__NameAssignment_0_2 ) )
            {
            // InternalSimpleIDL.g:590:1: ( ( rule__NamedDefinition__NameAssignment_0_2 ) )
            // InternalSimpleIDL.g:591:2: ( rule__NamedDefinition__NameAssignment_0_2 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_0_2()); 
            // InternalSimpleIDL.g:592:2: ( rule__NamedDefinition__NameAssignment_0_2 )
            // InternalSimpleIDL.g:592:3: rule__NamedDefinition__NameAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__NameAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_0__2__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_0__3"
    // InternalSimpleIDL.g:600:1: rule__NamedDefinition__Group_0__3 : rule__NamedDefinition__Group_0__3__Impl rule__NamedDefinition__Group_0__4 ;
    public final void rule__NamedDefinition__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:604:1: ( rule__NamedDefinition__Group_0__3__Impl rule__NamedDefinition__Group_0__4 )
            // InternalSimpleIDL.g:605:2: rule__NamedDefinition__Group_0__3__Impl rule__NamedDefinition__Group_0__4
            {
            pushFollow(FOLLOW_4);
            rule__NamedDefinition__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_0__3"


    // $ANTLR start "rule__NamedDefinition__Group_0__3__Impl"
    // InternalSimpleIDL.g:612:1: rule__NamedDefinition__Group_0__3__Impl : ( '{' ) ;
    public final void rule__NamedDefinition__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:616:1: ( ( '{' ) )
            // InternalSimpleIDL.g:617:1: ( '{' )
            {
            // InternalSimpleIDL.g:617:1: ( '{' )
            // InternalSimpleIDL.g:618:2: '{'
            {
             before(grammarAccess.getNamedDefinitionAccess().getLeftCurlyBracketKeyword_0_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getLeftCurlyBracketKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_0__3__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_0__4"
    // InternalSimpleIDL.g:627:1: rule__NamedDefinition__Group_0__4 : rule__NamedDefinition__Group_0__4__Impl rule__NamedDefinition__Group_0__5 ;
    public final void rule__NamedDefinition__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:631:1: ( rule__NamedDefinition__Group_0__4__Impl rule__NamedDefinition__Group_0__5 )
            // InternalSimpleIDL.g:632:2: rule__NamedDefinition__Group_0__4__Impl rule__NamedDefinition__Group_0__5
            {
            pushFollow(FOLLOW_9);
            rule__NamedDefinition__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_0__4"


    // $ANTLR start "rule__NamedDefinition__Group_0__4__Impl"
    // InternalSimpleIDL.g:639:1: rule__NamedDefinition__Group_0__4__Impl : ( ( ( rule__NamedDefinition__DefinitionsAssignment_0_4 ) ) ( ( rule__NamedDefinition__DefinitionsAssignment_0_4 )* ) ) ;
    public final void rule__NamedDefinition__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:643:1: ( ( ( ( rule__NamedDefinition__DefinitionsAssignment_0_4 ) ) ( ( rule__NamedDefinition__DefinitionsAssignment_0_4 )* ) ) )
            // InternalSimpleIDL.g:644:1: ( ( ( rule__NamedDefinition__DefinitionsAssignment_0_4 ) ) ( ( rule__NamedDefinition__DefinitionsAssignment_0_4 )* ) )
            {
            // InternalSimpleIDL.g:644:1: ( ( ( rule__NamedDefinition__DefinitionsAssignment_0_4 ) ) ( ( rule__NamedDefinition__DefinitionsAssignment_0_4 )* ) )
            // InternalSimpleIDL.g:645:2: ( ( rule__NamedDefinition__DefinitionsAssignment_0_4 ) ) ( ( rule__NamedDefinition__DefinitionsAssignment_0_4 )* )
            {
            // InternalSimpleIDL.g:645:2: ( ( rule__NamedDefinition__DefinitionsAssignment_0_4 ) )
            // InternalSimpleIDL.g:646:3: ( rule__NamedDefinition__DefinitionsAssignment_0_4 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getDefinitionsAssignment_0_4()); 
            // InternalSimpleIDL.g:647:3: ( rule__NamedDefinition__DefinitionsAssignment_0_4 )
            // InternalSimpleIDL.g:647:4: rule__NamedDefinition__DefinitionsAssignment_0_4
            {
            pushFollow(FOLLOW_3);
            rule__NamedDefinition__DefinitionsAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getDefinitionsAssignment_0_4()); 

            }

            // InternalSimpleIDL.g:650:2: ( ( rule__NamedDefinition__DefinitionsAssignment_0_4 )* )
            // InternalSimpleIDL.g:651:3: ( rule__NamedDefinition__DefinitionsAssignment_0_4 )*
            {
             before(grammarAccess.getNamedDefinitionAccess().getDefinitionsAssignment_0_4()); 
            // InternalSimpleIDL.g:652:3: ( rule__NamedDefinition__DefinitionsAssignment_0_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12||LA4_0==14||LA4_0==17||LA4_0==23||LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSimpleIDL.g:652:4: rule__NamedDefinition__DefinitionsAssignment_0_4
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__NamedDefinition__DefinitionsAssignment_0_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getNamedDefinitionAccess().getDefinitionsAssignment_0_4()); 

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
    // $ANTLR end "rule__NamedDefinition__Group_0__4__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_0__5"
    // InternalSimpleIDL.g:661:1: rule__NamedDefinition__Group_0__5 : rule__NamedDefinition__Group_0__5__Impl rule__NamedDefinition__Group_0__6 ;
    public final void rule__NamedDefinition__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:665:1: ( rule__NamedDefinition__Group_0__5__Impl rule__NamedDefinition__Group_0__6 )
            // InternalSimpleIDL.g:666:2: rule__NamedDefinition__Group_0__5__Impl rule__NamedDefinition__Group_0__6
            {
            pushFollow(FOLLOW_6);
            rule__NamedDefinition__Group_0__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_0__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_0__5"


    // $ANTLR start "rule__NamedDefinition__Group_0__5__Impl"
    // InternalSimpleIDL.g:673:1: rule__NamedDefinition__Group_0__5__Impl : ( '}' ) ;
    public final void rule__NamedDefinition__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:677:1: ( ( '}' ) )
            // InternalSimpleIDL.g:678:1: ( '}' )
            {
            // InternalSimpleIDL.g:678:1: ( '}' )
            // InternalSimpleIDL.g:679:2: '}'
            {
             before(grammarAccess.getNamedDefinitionAccess().getRightCurlyBracketKeyword_0_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getRightCurlyBracketKeyword_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_0__5__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_0__6"
    // InternalSimpleIDL.g:688:1: rule__NamedDefinition__Group_0__6 : rule__NamedDefinition__Group_0__6__Impl ;
    public final void rule__NamedDefinition__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:692:1: ( rule__NamedDefinition__Group_0__6__Impl )
            // InternalSimpleIDL.g:693:2: rule__NamedDefinition__Group_0__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_0__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_0__6"


    // $ANTLR start "rule__NamedDefinition__Group_0__6__Impl"
    // InternalSimpleIDL.g:699:1: rule__NamedDefinition__Group_0__6__Impl : ( ';' ) ;
    public final void rule__NamedDefinition__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:703:1: ( ( ';' ) )
            // InternalSimpleIDL.g:704:1: ( ';' )
            {
            // InternalSimpleIDL.g:704:1: ( ';' )
            // InternalSimpleIDL.g:705:2: ';'
            {
             before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_0_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_0_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_0__6__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_1__0"
    // InternalSimpleIDL.g:715:1: rule__NamedDefinition__Group_1__0 : rule__NamedDefinition__Group_1__0__Impl rule__NamedDefinition__Group_1__1 ;
    public final void rule__NamedDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:719:1: ( rule__NamedDefinition__Group_1__0__Impl rule__NamedDefinition__Group_1__1 )
            // InternalSimpleIDL.g:720:2: rule__NamedDefinition__Group_1__0__Impl rule__NamedDefinition__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__NamedDefinition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_1__0"


    // $ANTLR start "rule__NamedDefinition__Group_1__0__Impl"
    // InternalSimpleIDL.g:727:1: rule__NamedDefinition__Group_1__0__Impl : ( () ) ;
    public final void rule__NamedDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:731:1: ( ( () ) )
            // InternalSimpleIDL.g:732:1: ( () )
            {
            // InternalSimpleIDL.g:732:1: ( () )
            // InternalSimpleIDL.g:733:2: ()
            {
             before(grammarAccess.getNamedDefinitionAccess().getStructAction_1_0()); 
            // InternalSimpleIDL.g:734:2: ()
            // InternalSimpleIDL.g:734:3: 
            {
            }

             after(grammarAccess.getNamedDefinitionAccess().getStructAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_1__0__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_1__1"
    // InternalSimpleIDL.g:742:1: rule__NamedDefinition__Group_1__1 : rule__NamedDefinition__Group_1__1__Impl rule__NamedDefinition__Group_1__2 ;
    public final void rule__NamedDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:746:1: ( rule__NamedDefinition__Group_1__1__Impl rule__NamedDefinition__Group_1__2 )
            // InternalSimpleIDL.g:747:2: rule__NamedDefinition__Group_1__1__Impl rule__NamedDefinition__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__NamedDefinition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_1__1"


    // $ANTLR start "rule__NamedDefinition__Group_1__1__Impl"
    // InternalSimpleIDL.g:754:1: rule__NamedDefinition__Group_1__1__Impl : ( 'struct' ) ;
    public final void rule__NamedDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:758:1: ( ( 'struct' ) )
            // InternalSimpleIDL.g:759:1: ( 'struct' )
            {
            // InternalSimpleIDL.g:759:1: ( 'struct' )
            // InternalSimpleIDL.g:760:2: 'struct'
            {
             before(grammarAccess.getNamedDefinitionAccess().getStructKeyword_1_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getStructKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_1__1__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_1__2"
    // InternalSimpleIDL.g:769:1: rule__NamedDefinition__Group_1__2 : rule__NamedDefinition__Group_1__2__Impl rule__NamedDefinition__Group_1__3 ;
    public final void rule__NamedDefinition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:773:1: ( rule__NamedDefinition__Group_1__2__Impl rule__NamedDefinition__Group_1__3 )
            // InternalSimpleIDL.g:774:2: rule__NamedDefinition__Group_1__2__Impl rule__NamedDefinition__Group_1__3
            {
            pushFollow(FOLLOW_8);
            rule__NamedDefinition__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_1__2"


    // $ANTLR start "rule__NamedDefinition__Group_1__2__Impl"
    // InternalSimpleIDL.g:781:1: rule__NamedDefinition__Group_1__2__Impl : ( ( rule__NamedDefinition__NameAssignment_1_2 ) ) ;
    public final void rule__NamedDefinition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:785:1: ( ( ( rule__NamedDefinition__NameAssignment_1_2 ) ) )
            // InternalSimpleIDL.g:786:1: ( ( rule__NamedDefinition__NameAssignment_1_2 ) )
            {
            // InternalSimpleIDL.g:786:1: ( ( rule__NamedDefinition__NameAssignment_1_2 ) )
            // InternalSimpleIDL.g:787:2: ( rule__NamedDefinition__NameAssignment_1_2 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_1_2()); 
            // InternalSimpleIDL.g:788:2: ( rule__NamedDefinition__NameAssignment_1_2 )
            // InternalSimpleIDL.g:788:3: rule__NamedDefinition__NameAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__NameAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_1__2__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_1__3"
    // InternalSimpleIDL.g:796:1: rule__NamedDefinition__Group_1__3 : rule__NamedDefinition__Group_1__3__Impl rule__NamedDefinition__Group_1__4 ;
    public final void rule__NamedDefinition__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:800:1: ( rule__NamedDefinition__Group_1__3__Impl rule__NamedDefinition__Group_1__4 )
            // InternalSimpleIDL.g:801:2: rule__NamedDefinition__Group_1__3__Impl rule__NamedDefinition__Group_1__4
            {
            pushFollow(FOLLOW_11);
            rule__NamedDefinition__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_1__3"


    // $ANTLR start "rule__NamedDefinition__Group_1__3__Impl"
    // InternalSimpleIDL.g:808:1: rule__NamedDefinition__Group_1__3__Impl : ( '{' ) ;
    public final void rule__NamedDefinition__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:812:1: ( ( '{' ) )
            // InternalSimpleIDL.g:813:1: ( '{' )
            {
            // InternalSimpleIDL.g:813:1: ( '{' )
            // InternalSimpleIDL.g:814:2: '{'
            {
             before(grammarAccess.getNamedDefinitionAccess().getLeftCurlyBracketKeyword_1_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getLeftCurlyBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_1__3__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_1__4"
    // InternalSimpleIDL.g:823:1: rule__NamedDefinition__Group_1__4 : rule__NamedDefinition__Group_1__4__Impl rule__NamedDefinition__Group_1__5 ;
    public final void rule__NamedDefinition__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:827:1: ( rule__NamedDefinition__Group_1__4__Impl rule__NamedDefinition__Group_1__5 )
            // InternalSimpleIDL.g:828:2: rule__NamedDefinition__Group_1__4__Impl rule__NamedDefinition__Group_1__5
            {
            pushFollow(FOLLOW_9);
            rule__NamedDefinition__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_1__4"


    // $ANTLR start "rule__NamedDefinition__Group_1__4__Impl"
    // InternalSimpleIDL.g:835:1: rule__NamedDefinition__Group_1__4__Impl : ( ( ( rule__NamedDefinition__MembersAssignment_1_4 ) ) ( ( rule__NamedDefinition__MembersAssignment_1_4 )* ) ) ;
    public final void rule__NamedDefinition__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:839:1: ( ( ( ( rule__NamedDefinition__MembersAssignment_1_4 ) ) ( ( rule__NamedDefinition__MembersAssignment_1_4 )* ) ) )
            // InternalSimpleIDL.g:840:1: ( ( ( rule__NamedDefinition__MembersAssignment_1_4 ) ) ( ( rule__NamedDefinition__MembersAssignment_1_4 )* ) )
            {
            // InternalSimpleIDL.g:840:1: ( ( ( rule__NamedDefinition__MembersAssignment_1_4 ) ) ( ( rule__NamedDefinition__MembersAssignment_1_4 )* ) )
            // InternalSimpleIDL.g:841:2: ( ( rule__NamedDefinition__MembersAssignment_1_4 ) ) ( ( rule__NamedDefinition__MembersAssignment_1_4 )* )
            {
            // InternalSimpleIDL.g:841:2: ( ( rule__NamedDefinition__MembersAssignment_1_4 ) )
            // InternalSimpleIDL.g:842:3: ( rule__NamedDefinition__MembersAssignment_1_4 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getMembersAssignment_1_4()); 
            // InternalSimpleIDL.g:843:3: ( rule__NamedDefinition__MembersAssignment_1_4 )
            // InternalSimpleIDL.g:843:4: rule__NamedDefinition__MembersAssignment_1_4
            {
            pushFollow(FOLLOW_12);
            rule__NamedDefinition__MembersAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getMembersAssignment_1_4()); 

            }

            // InternalSimpleIDL.g:846:2: ( ( rule__NamedDefinition__MembersAssignment_1_4 )* )
            // InternalSimpleIDL.g:847:3: ( rule__NamedDefinition__MembersAssignment_1_4 )*
            {
             before(grammarAccess.getNamedDefinitionAccess().getMembersAssignment_1_4()); 
            // InternalSimpleIDL.g:848:3: ( rule__NamedDefinition__MembersAssignment_1_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==43) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSimpleIDL.g:848:4: rule__NamedDefinition__MembersAssignment_1_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__NamedDefinition__MembersAssignment_1_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getNamedDefinitionAccess().getMembersAssignment_1_4()); 

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
    // $ANTLR end "rule__NamedDefinition__Group_1__4__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_1__5"
    // InternalSimpleIDL.g:857:1: rule__NamedDefinition__Group_1__5 : rule__NamedDefinition__Group_1__5__Impl rule__NamedDefinition__Group_1__6 ;
    public final void rule__NamedDefinition__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:861:1: ( rule__NamedDefinition__Group_1__5__Impl rule__NamedDefinition__Group_1__6 )
            // InternalSimpleIDL.g:862:2: rule__NamedDefinition__Group_1__5__Impl rule__NamedDefinition__Group_1__6
            {
            pushFollow(FOLLOW_6);
            rule__NamedDefinition__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_1__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_1__5"


    // $ANTLR start "rule__NamedDefinition__Group_1__5__Impl"
    // InternalSimpleIDL.g:869:1: rule__NamedDefinition__Group_1__5__Impl : ( '}' ) ;
    public final void rule__NamedDefinition__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:873:1: ( ( '}' ) )
            // InternalSimpleIDL.g:874:1: ( '}' )
            {
            // InternalSimpleIDL.g:874:1: ( '}' )
            // InternalSimpleIDL.g:875:2: '}'
            {
             before(grammarAccess.getNamedDefinitionAccess().getRightCurlyBracketKeyword_1_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getRightCurlyBracketKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_1__5__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_1__6"
    // InternalSimpleIDL.g:884:1: rule__NamedDefinition__Group_1__6 : rule__NamedDefinition__Group_1__6__Impl ;
    public final void rule__NamedDefinition__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:888:1: ( rule__NamedDefinition__Group_1__6__Impl )
            // InternalSimpleIDL.g:889:2: rule__NamedDefinition__Group_1__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_1__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_1__6"


    // $ANTLR start "rule__NamedDefinition__Group_1__6__Impl"
    // InternalSimpleIDL.g:895:1: rule__NamedDefinition__Group_1__6__Impl : ( ';' ) ;
    public final void rule__NamedDefinition__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:899:1: ( ( ';' ) )
            // InternalSimpleIDL.g:900:1: ( ';' )
            {
            // InternalSimpleIDL.g:900:1: ( ';' )
            // InternalSimpleIDL.g:901:2: ';'
            {
             before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_1_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_1__6__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_2__0"
    // InternalSimpleIDL.g:911:1: rule__NamedDefinition__Group_2__0 : rule__NamedDefinition__Group_2__0__Impl rule__NamedDefinition__Group_2__1 ;
    public final void rule__NamedDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:915:1: ( rule__NamedDefinition__Group_2__0__Impl rule__NamedDefinition__Group_2__1 )
            // InternalSimpleIDL.g:916:2: rule__NamedDefinition__Group_2__0__Impl rule__NamedDefinition__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__NamedDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_2__0"


    // $ANTLR start "rule__NamedDefinition__Group_2__0__Impl"
    // InternalSimpleIDL.g:923:1: rule__NamedDefinition__Group_2__0__Impl : ( () ) ;
    public final void rule__NamedDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:927:1: ( ( () ) )
            // InternalSimpleIDL.g:928:1: ( () )
            {
            // InternalSimpleIDL.g:928:1: ( () )
            // InternalSimpleIDL.g:929:2: ()
            {
             before(grammarAccess.getNamedDefinitionAccess().getUnionAction_2_0()); 
            // InternalSimpleIDL.g:930:2: ()
            // InternalSimpleIDL.g:930:3: 
            {
            }

             after(grammarAccess.getNamedDefinitionAccess().getUnionAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_2__0__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_2__1"
    // InternalSimpleIDL.g:938:1: rule__NamedDefinition__Group_2__1 : rule__NamedDefinition__Group_2__1__Impl rule__NamedDefinition__Group_2__2 ;
    public final void rule__NamedDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:942:1: ( rule__NamedDefinition__Group_2__1__Impl rule__NamedDefinition__Group_2__2 )
            // InternalSimpleIDL.g:943:2: rule__NamedDefinition__Group_2__1__Impl rule__NamedDefinition__Group_2__2
            {
            pushFollow(FOLLOW_5);
            rule__NamedDefinition__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_2__1"


    // $ANTLR start "rule__NamedDefinition__Group_2__1__Impl"
    // InternalSimpleIDL.g:950:1: rule__NamedDefinition__Group_2__1__Impl : ( 'union' ) ;
    public final void rule__NamedDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:954:1: ( ( 'union' ) )
            // InternalSimpleIDL.g:955:1: ( 'union' )
            {
            // InternalSimpleIDL.g:955:1: ( 'union' )
            // InternalSimpleIDL.g:956:2: 'union'
            {
             before(grammarAccess.getNamedDefinitionAccess().getUnionKeyword_2_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getUnionKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_2__1__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_2__2"
    // InternalSimpleIDL.g:965:1: rule__NamedDefinition__Group_2__2 : rule__NamedDefinition__Group_2__2__Impl rule__NamedDefinition__Group_2__3 ;
    public final void rule__NamedDefinition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:969:1: ( rule__NamedDefinition__Group_2__2__Impl rule__NamedDefinition__Group_2__3 )
            // InternalSimpleIDL.g:970:2: rule__NamedDefinition__Group_2__2__Impl rule__NamedDefinition__Group_2__3
            {
            pushFollow(FOLLOW_8);
            rule__NamedDefinition__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_2__2"


    // $ANTLR start "rule__NamedDefinition__Group_2__2__Impl"
    // InternalSimpleIDL.g:977:1: rule__NamedDefinition__Group_2__2__Impl : ( ( rule__NamedDefinition__NameAssignment_2_2 ) ) ;
    public final void rule__NamedDefinition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:981:1: ( ( ( rule__NamedDefinition__NameAssignment_2_2 ) ) )
            // InternalSimpleIDL.g:982:1: ( ( rule__NamedDefinition__NameAssignment_2_2 ) )
            {
            // InternalSimpleIDL.g:982:1: ( ( rule__NamedDefinition__NameAssignment_2_2 ) )
            // InternalSimpleIDL.g:983:2: ( rule__NamedDefinition__NameAssignment_2_2 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_2_2()); 
            // InternalSimpleIDL.g:984:2: ( rule__NamedDefinition__NameAssignment_2_2 )
            // InternalSimpleIDL.g:984:3: rule__NamedDefinition__NameAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__NameAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_2__2__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_2__3"
    // InternalSimpleIDL.g:992:1: rule__NamedDefinition__Group_2__3 : rule__NamedDefinition__Group_2__3__Impl rule__NamedDefinition__Group_2__4 ;
    public final void rule__NamedDefinition__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:996:1: ( rule__NamedDefinition__Group_2__3__Impl rule__NamedDefinition__Group_2__4 )
            // InternalSimpleIDL.g:997:2: rule__NamedDefinition__Group_2__3__Impl rule__NamedDefinition__Group_2__4
            {
            pushFollow(FOLLOW_14);
            rule__NamedDefinition__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_2__3"


    // $ANTLR start "rule__NamedDefinition__Group_2__3__Impl"
    // InternalSimpleIDL.g:1004:1: rule__NamedDefinition__Group_2__3__Impl : ( '{' ) ;
    public final void rule__NamedDefinition__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1008:1: ( ( '{' ) )
            // InternalSimpleIDL.g:1009:1: ( '{' )
            {
            // InternalSimpleIDL.g:1009:1: ( '{' )
            // InternalSimpleIDL.g:1010:2: '{'
            {
             before(grammarAccess.getNamedDefinitionAccess().getLeftCurlyBracketKeyword_2_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getLeftCurlyBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_2__3__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_2__4"
    // InternalSimpleIDL.g:1019:1: rule__NamedDefinition__Group_2__4 : rule__NamedDefinition__Group_2__4__Impl rule__NamedDefinition__Group_2__5 ;
    public final void rule__NamedDefinition__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1023:1: ( rule__NamedDefinition__Group_2__4__Impl rule__NamedDefinition__Group_2__5 )
            // InternalSimpleIDL.g:1024:2: rule__NamedDefinition__Group_2__4__Impl rule__NamedDefinition__Group_2__5
            {
            pushFollow(FOLLOW_15);
            rule__NamedDefinition__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_2__4"


    // $ANTLR start "rule__NamedDefinition__Group_2__4__Impl"
    // InternalSimpleIDL.g:1031:1: rule__NamedDefinition__Group_2__4__Impl : ( 'switch' ) ;
    public final void rule__NamedDefinition__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1035:1: ( ( 'switch' ) )
            // InternalSimpleIDL.g:1036:1: ( 'switch' )
            {
            // InternalSimpleIDL.g:1036:1: ( 'switch' )
            // InternalSimpleIDL.g:1037:2: 'switch'
            {
             before(grammarAccess.getNamedDefinitionAccess().getSwitchKeyword_2_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getSwitchKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_2__4__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_2__5"
    // InternalSimpleIDL.g:1046:1: rule__NamedDefinition__Group_2__5 : rule__NamedDefinition__Group_2__5__Impl rule__NamedDefinition__Group_2__6 ;
    public final void rule__NamedDefinition__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1050:1: ( rule__NamedDefinition__Group_2__5__Impl rule__NamedDefinition__Group_2__6 )
            // InternalSimpleIDL.g:1051:2: rule__NamedDefinition__Group_2__5__Impl rule__NamedDefinition__Group_2__6
            {
            pushFollow(FOLLOW_16);
            rule__NamedDefinition__Group_2__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_2__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_2__5"


    // $ANTLR start "rule__NamedDefinition__Group_2__5__Impl"
    // InternalSimpleIDL.g:1058:1: rule__NamedDefinition__Group_2__5__Impl : ( '(' ) ;
    public final void rule__NamedDefinition__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1062:1: ( ( '(' ) )
            // InternalSimpleIDL.g:1063:1: ( '(' )
            {
            // InternalSimpleIDL.g:1063:1: ( '(' )
            // InternalSimpleIDL.g:1064:2: '('
            {
             before(grammarAccess.getNamedDefinitionAccess().getLeftParenthesisKeyword_2_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getLeftParenthesisKeyword_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_2__5__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_2__6"
    // InternalSimpleIDL.g:1073:1: rule__NamedDefinition__Group_2__6 : rule__NamedDefinition__Group_2__6__Impl rule__NamedDefinition__Group_2__7 ;
    public final void rule__NamedDefinition__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1077:1: ( rule__NamedDefinition__Group_2__6__Impl rule__NamedDefinition__Group_2__7 )
            // InternalSimpleIDL.g:1078:2: rule__NamedDefinition__Group_2__6__Impl rule__NamedDefinition__Group_2__7
            {
            pushFollow(FOLLOW_17);
            rule__NamedDefinition__Group_2__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_2__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_2__6"


    // $ANTLR start "rule__NamedDefinition__Group_2__6__Impl"
    // InternalSimpleIDL.g:1085:1: rule__NamedDefinition__Group_2__6__Impl : ( 'unsigned' ) ;
    public final void rule__NamedDefinition__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1089:1: ( ( 'unsigned' ) )
            // InternalSimpleIDL.g:1090:1: ( 'unsigned' )
            {
            // InternalSimpleIDL.g:1090:1: ( 'unsigned' )
            // InternalSimpleIDL.g:1091:2: 'unsigned'
            {
             before(grammarAccess.getNamedDefinitionAccess().getUnsignedKeyword_2_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getUnsignedKeyword_2_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_2__6__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_2__7"
    // InternalSimpleIDL.g:1100:1: rule__NamedDefinition__Group_2__7 : rule__NamedDefinition__Group_2__7__Impl rule__NamedDefinition__Group_2__8 ;
    public final void rule__NamedDefinition__Group_2__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1104:1: ( rule__NamedDefinition__Group_2__7__Impl rule__NamedDefinition__Group_2__8 )
            // InternalSimpleIDL.g:1105:2: rule__NamedDefinition__Group_2__7__Impl rule__NamedDefinition__Group_2__8
            {
            pushFollow(FOLLOW_18);
            rule__NamedDefinition__Group_2__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_2__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_2__7"


    // $ANTLR start "rule__NamedDefinition__Group_2__7__Impl"
    // InternalSimpleIDL.g:1112:1: rule__NamedDefinition__Group_2__7__Impl : ( 'short' ) ;
    public final void rule__NamedDefinition__Group_2__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1116:1: ( ( 'short' ) )
            // InternalSimpleIDL.g:1117:1: ( 'short' )
            {
            // InternalSimpleIDL.g:1117:1: ( 'short' )
            // InternalSimpleIDL.g:1118:2: 'short'
            {
             before(grammarAccess.getNamedDefinitionAccess().getShortKeyword_2_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getShortKeyword_2_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_2__7__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_2__8"
    // InternalSimpleIDL.g:1127:1: rule__NamedDefinition__Group_2__8 : rule__NamedDefinition__Group_2__8__Impl rule__NamedDefinition__Group_2__9 ;
    public final void rule__NamedDefinition__Group_2__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1131:1: ( rule__NamedDefinition__Group_2__8__Impl rule__NamedDefinition__Group_2__9 )
            // InternalSimpleIDL.g:1132:2: rule__NamedDefinition__Group_2__8__Impl rule__NamedDefinition__Group_2__9
            {
            pushFollow(FOLLOW_8);
            rule__NamedDefinition__Group_2__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_2__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_2__8"


    // $ANTLR start "rule__NamedDefinition__Group_2__8__Impl"
    // InternalSimpleIDL.g:1139:1: rule__NamedDefinition__Group_2__8__Impl : ( ')' ) ;
    public final void rule__NamedDefinition__Group_2__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1143:1: ( ( ')' ) )
            // InternalSimpleIDL.g:1144:1: ( ')' )
            {
            // InternalSimpleIDL.g:1144:1: ( ')' )
            // InternalSimpleIDL.g:1145:2: ')'
            {
             before(grammarAccess.getNamedDefinitionAccess().getRightParenthesisKeyword_2_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getRightParenthesisKeyword_2_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_2__8__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_2__9"
    // InternalSimpleIDL.g:1154:1: rule__NamedDefinition__Group_2__9 : rule__NamedDefinition__Group_2__9__Impl rule__NamedDefinition__Group_2__10 ;
    public final void rule__NamedDefinition__Group_2__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1158:1: ( rule__NamedDefinition__Group_2__9__Impl rule__NamedDefinition__Group_2__10 )
            // InternalSimpleIDL.g:1159:2: rule__NamedDefinition__Group_2__9__Impl rule__NamedDefinition__Group_2__10
            {
            pushFollow(FOLLOW_19);
            rule__NamedDefinition__Group_2__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_2__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_2__9"


    // $ANTLR start "rule__NamedDefinition__Group_2__9__Impl"
    // InternalSimpleIDL.g:1166:1: rule__NamedDefinition__Group_2__9__Impl : ( '{' ) ;
    public final void rule__NamedDefinition__Group_2__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1170:1: ( ( '{' ) )
            // InternalSimpleIDL.g:1171:1: ( '{' )
            {
            // InternalSimpleIDL.g:1171:1: ( '{' )
            // InternalSimpleIDL.g:1172:2: '{'
            {
             before(grammarAccess.getNamedDefinitionAccess().getLeftCurlyBracketKeyword_2_9()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getLeftCurlyBracketKeyword_2_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_2__9__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_2__10"
    // InternalSimpleIDL.g:1181:1: rule__NamedDefinition__Group_2__10 : rule__NamedDefinition__Group_2__10__Impl rule__NamedDefinition__Group_2__11 ;
    public final void rule__NamedDefinition__Group_2__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1185:1: ( rule__NamedDefinition__Group_2__10__Impl rule__NamedDefinition__Group_2__11 )
            // InternalSimpleIDL.g:1186:2: rule__NamedDefinition__Group_2__10__Impl rule__NamedDefinition__Group_2__11
            {
            pushFollow(FOLLOW_9);
            rule__NamedDefinition__Group_2__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_2__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_2__10"


    // $ANTLR start "rule__NamedDefinition__Group_2__10__Impl"
    // InternalSimpleIDL.g:1193:1: rule__NamedDefinition__Group_2__10__Impl : ( ( ( rule__NamedDefinition__CasesAssignment_2_10 ) ) ( ( rule__NamedDefinition__CasesAssignment_2_10 )* ) ) ;
    public final void rule__NamedDefinition__Group_2__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1197:1: ( ( ( ( rule__NamedDefinition__CasesAssignment_2_10 ) ) ( ( rule__NamedDefinition__CasesAssignment_2_10 )* ) ) )
            // InternalSimpleIDL.g:1198:1: ( ( ( rule__NamedDefinition__CasesAssignment_2_10 ) ) ( ( rule__NamedDefinition__CasesAssignment_2_10 )* ) )
            {
            // InternalSimpleIDL.g:1198:1: ( ( ( rule__NamedDefinition__CasesAssignment_2_10 ) ) ( ( rule__NamedDefinition__CasesAssignment_2_10 )* ) )
            // InternalSimpleIDL.g:1199:2: ( ( rule__NamedDefinition__CasesAssignment_2_10 ) ) ( ( rule__NamedDefinition__CasesAssignment_2_10 )* )
            {
            // InternalSimpleIDL.g:1199:2: ( ( rule__NamedDefinition__CasesAssignment_2_10 ) )
            // InternalSimpleIDL.g:1200:3: ( rule__NamedDefinition__CasesAssignment_2_10 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getCasesAssignment_2_10()); 
            // InternalSimpleIDL.g:1201:3: ( rule__NamedDefinition__CasesAssignment_2_10 )
            // InternalSimpleIDL.g:1201:4: rule__NamedDefinition__CasesAssignment_2_10
            {
            pushFollow(FOLLOW_20);
            rule__NamedDefinition__CasesAssignment_2_10();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getCasesAssignment_2_10()); 

            }

            // InternalSimpleIDL.g:1204:2: ( ( rule__NamedDefinition__CasesAssignment_2_10 )* )
            // InternalSimpleIDL.g:1205:3: ( rule__NamedDefinition__CasesAssignment_2_10 )*
            {
             before(grammarAccess.getNamedDefinitionAccess().getCasesAssignment_2_10()); 
            // InternalSimpleIDL.g:1206:3: ( rule__NamedDefinition__CasesAssignment_2_10 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==41) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSimpleIDL.g:1206:4: rule__NamedDefinition__CasesAssignment_2_10
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__NamedDefinition__CasesAssignment_2_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getNamedDefinitionAccess().getCasesAssignment_2_10()); 

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
    // $ANTLR end "rule__NamedDefinition__Group_2__10__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_2__11"
    // InternalSimpleIDL.g:1215:1: rule__NamedDefinition__Group_2__11 : rule__NamedDefinition__Group_2__11__Impl rule__NamedDefinition__Group_2__12 ;
    public final void rule__NamedDefinition__Group_2__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1219:1: ( rule__NamedDefinition__Group_2__11__Impl rule__NamedDefinition__Group_2__12 )
            // InternalSimpleIDL.g:1220:2: rule__NamedDefinition__Group_2__11__Impl rule__NamedDefinition__Group_2__12
            {
            pushFollow(FOLLOW_6);
            rule__NamedDefinition__Group_2__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_2__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_2__11"


    // $ANTLR start "rule__NamedDefinition__Group_2__11__Impl"
    // InternalSimpleIDL.g:1227:1: rule__NamedDefinition__Group_2__11__Impl : ( '}' ) ;
    public final void rule__NamedDefinition__Group_2__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1231:1: ( ( '}' ) )
            // InternalSimpleIDL.g:1232:1: ( '}' )
            {
            // InternalSimpleIDL.g:1232:1: ( '}' )
            // InternalSimpleIDL.g:1233:2: '}'
            {
             before(grammarAccess.getNamedDefinitionAccess().getRightCurlyBracketKeyword_2_11()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getRightCurlyBracketKeyword_2_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_2__11__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_2__12"
    // InternalSimpleIDL.g:1242:1: rule__NamedDefinition__Group_2__12 : rule__NamedDefinition__Group_2__12__Impl rule__NamedDefinition__Group_2__13 ;
    public final void rule__NamedDefinition__Group_2__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1246:1: ( rule__NamedDefinition__Group_2__12__Impl rule__NamedDefinition__Group_2__13 )
            // InternalSimpleIDL.g:1247:2: rule__NamedDefinition__Group_2__12__Impl rule__NamedDefinition__Group_2__13
            {
            pushFollow(FOLLOW_9);
            rule__NamedDefinition__Group_2__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_2__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_2__12"


    // $ANTLR start "rule__NamedDefinition__Group_2__12__Impl"
    // InternalSimpleIDL.g:1254:1: rule__NamedDefinition__Group_2__12__Impl : ( ';' ) ;
    public final void rule__NamedDefinition__Group_2__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1258:1: ( ( ';' ) )
            // InternalSimpleIDL.g:1259:1: ( ';' )
            {
            // InternalSimpleIDL.g:1259:1: ( ';' )
            // InternalSimpleIDL.g:1260:2: ';'
            {
             before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_2_12()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_2_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_2__12__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_2__13"
    // InternalSimpleIDL.g:1269:1: rule__NamedDefinition__Group_2__13 : rule__NamedDefinition__Group_2__13__Impl rule__NamedDefinition__Group_2__14 ;
    public final void rule__NamedDefinition__Group_2__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1273:1: ( rule__NamedDefinition__Group_2__13__Impl rule__NamedDefinition__Group_2__14 )
            // InternalSimpleIDL.g:1274:2: rule__NamedDefinition__Group_2__13__Impl rule__NamedDefinition__Group_2__14
            {
            pushFollow(FOLLOW_6);
            rule__NamedDefinition__Group_2__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_2__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_2__13"


    // $ANTLR start "rule__NamedDefinition__Group_2__13__Impl"
    // InternalSimpleIDL.g:1281:1: rule__NamedDefinition__Group_2__13__Impl : ( '}' ) ;
    public final void rule__NamedDefinition__Group_2__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1285:1: ( ( '}' ) )
            // InternalSimpleIDL.g:1286:1: ( '}' )
            {
            // InternalSimpleIDL.g:1286:1: ( '}' )
            // InternalSimpleIDL.g:1287:2: '}'
            {
             before(grammarAccess.getNamedDefinitionAccess().getRightCurlyBracketKeyword_2_13()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getRightCurlyBracketKeyword_2_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_2__13__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_2__14"
    // InternalSimpleIDL.g:1296:1: rule__NamedDefinition__Group_2__14 : rule__NamedDefinition__Group_2__14__Impl ;
    public final void rule__NamedDefinition__Group_2__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1300:1: ( rule__NamedDefinition__Group_2__14__Impl )
            // InternalSimpleIDL.g:1301:2: rule__NamedDefinition__Group_2__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_2__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_2__14"


    // $ANTLR start "rule__NamedDefinition__Group_2__14__Impl"
    // InternalSimpleIDL.g:1307:1: rule__NamedDefinition__Group_2__14__Impl : ( ';' ) ;
    public final void rule__NamedDefinition__Group_2__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1311:1: ( ( ';' ) )
            // InternalSimpleIDL.g:1312:1: ( ';' )
            {
            // InternalSimpleIDL.g:1312:1: ( ';' )
            // InternalSimpleIDL.g:1313:2: ';'
            {
             before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_2_14()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_2_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_2__14__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_3__0"
    // InternalSimpleIDL.g:1323:1: rule__NamedDefinition__Group_3__0 : rule__NamedDefinition__Group_3__0__Impl rule__NamedDefinition__Group_3__1 ;
    public final void rule__NamedDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1327:1: ( rule__NamedDefinition__Group_3__0__Impl rule__NamedDefinition__Group_3__1 )
            // InternalSimpleIDL.g:1328:2: rule__NamedDefinition__Group_3__0__Impl rule__NamedDefinition__Group_3__1
            {
            pushFollow(FOLLOW_21);
            rule__NamedDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_3__0"


    // $ANTLR start "rule__NamedDefinition__Group_3__0__Impl"
    // InternalSimpleIDL.g:1335:1: rule__NamedDefinition__Group_3__0__Impl : ( () ) ;
    public final void rule__NamedDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1339:1: ( ( () ) )
            // InternalSimpleIDL.g:1340:1: ( () )
            {
            // InternalSimpleIDL.g:1340:1: ( () )
            // InternalSimpleIDL.g:1341:2: ()
            {
             before(grammarAccess.getNamedDefinitionAccess().getEnumAction_3_0()); 
            // InternalSimpleIDL.g:1342:2: ()
            // InternalSimpleIDL.g:1342:3: 
            {
            }

             after(grammarAccess.getNamedDefinitionAccess().getEnumAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_3__1"
    // InternalSimpleIDL.g:1350:1: rule__NamedDefinition__Group_3__1 : rule__NamedDefinition__Group_3__1__Impl rule__NamedDefinition__Group_3__2 ;
    public final void rule__NamedDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1354:1: ( rule__NamedDefinition__Group_3__1__Impl rule__NamedDefinition__Group_3__2 )
            // InternalSimpleIDL.g:1355:2: rule__NamedDefinition__Group_3__1__Impl rule__NamedDefinition__Group_3__2
            {
            pushFollow(FOLLOW_5);
            rule__NamedDefinition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_3__1"


    // $ANTLR start "rule__NamedDefinition__Group_3__1__Impl"
    // InternalSimpleIDL.g:1362:1: rule__NamedDefinition__Group_3__1__Impl : ( 'enum' ) ;
    public final void rule__NamedDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1366:1: ( ( 'enum' ) )
            // InternalSimpleIDL.g:1367:1: ( 'enum' )
            {
            // InternalSimpleIDL.g:1367:1: ( 'enum' )
            // InternalSimpleIDL.g:1368:2: 'enum'
            {
             before(grammarAccess.getNamedDefinitionAccess().getEnumKeyword_3_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getEnumKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_3__2"
    // InternalSimpleIDL.g:1377:1: rule__NamedDefinition__Group_3__2 : rule__NamedDefinition__Group_3__2__Impl rule__NamedDefinition__Group_3__3 ;
    public final void rule__NamedDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1381:1: ( rule__NamedDefinition__Group_3__2__Impl rule__NamedDefinition__Group_3__3 )
            // InternalSimpleIDL.g:1382:2: rule__NamedDefinition__Group_3__2__Impl rule__NamedDefinition__Group_3__3
            {
            pushFollow(FOLLOW_8);
            rule__NamedDefinition__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_3__2"


    // $ANTLR start "rule__NamedDefinition__Group_3__2__Impl"
    // InternalSimpleIDL.g:1389:1: rule__NamedDefinition__Group_3__2__Impl : ( ( rule__NamedDefinition__NameAssignment_3_2 ) ) ;
    public final void rule__NamedDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1393:1: ( ( ( rule__NamedDefinition__NameAssignment_3_2 ) ) )
            // InternalSimpleIDL.g:1394:1: ( ( rule__NamedDefinition__NameAssignment_3_2 ) )
            {
            // InternalSimpleIDL.g:1394:1: ( ( rule__NamedDefinition__NameAssignment_3_2 ) )
            // InternalSimpleIDL.g:1395:2: ( rule__NamedDefinition__NameAssignment_3_2 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_3_2()); 
            // InternalSimpleIDL.g:1396:2: ( rule__NamedDefinition__NameAssignment_3_2 )
            // InternalSimpleIDL.g:1396:3: rule__NamedDefinition__NameAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__NameAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_3__2__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_3__3"
    // InternalSimpleIDL.g:1404:1: rule__NamedDefinition__Group_3__3 : rule__NamedDefinition__Group_3__3__Impl rule__NamedDefinition__Group_3__4 ;
    public final void rule__NamedDefinition__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1408:1: ( rule__NamedDefinition__Group_3__3__Impl rule__NamedDefinition__Group_3__4 )
            // InternalSimpleIDL.g:1409:2: rule__NamedDefinition__Group_3__3__Impl rule__NamedDefinition__Group_3__4
            {
            pushFollow(FOLLOW_5);
            rule__NamedDefinition__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_3__3"


    // $ANTLR start "rule__NamedDefinition__Group_3__3__Impl"
    // InternalSimpleIDL.g:1416:1: rule__NamedDefinition__Group_3__3__Impl : ( '{' ) ;
    public final void rule__NamedDefinition__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1420:1: ( ( '{' ) )
            // InternalSimpleIDL.g:1421:1: ( '{' )
            {
            // InternalSimpleIDL.g:1421:1: ( '{' )
            // InternalSimpleIDL.g:1422:2: '{'
            {
             before(grammarAccess.getNamedDefinitionAccess().getLeftCurlyBracketKeyword_3_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getLeftCurlyBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_3__3__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_3__4"
    // InternalSimpleIDL.g:1431:1: rule__NamedDefinition__Group_3__4 : rule__NamedDefinition__Group_3__4__Impl rule__NamedDefinition__Group_3__5 ;
    public final void rule__NamedDefinition__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1435:1: ( rule__NamedDefinition__Group_3__4__Impl rule__NamedDefinition__Group_3__5 )
            // InternalSimpleIDL.g:1436:2: rule__NamedDefinition__Group_3__4__Impl rule__NamedDefinition__Group_3__5
            {
            pushFollow(FOLLOW_22);
            rule__NamedDefinition__Group_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_3__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_3__4"


    // $ANTLR start "rule__NamedDefinition__Group_3__4__Impl"
    // InternalSimpleIDL.g:1443:1: rule__NamedDefinition__Group_3__4__Impl : ( ( rule__NamedDefinition__LiteralsAssignment_3_4 ) ) ;
    public final void rule__NamedDefinition__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1447:1: ( ( ( rule__NamedDefinition__LiteralsAssignment_3_4 ) ) )
            // InternalSimpleIDL.g:1448:1: ( ( rule__NamedDefinition__LiteralsAssignment_3_4 ) )
            {
            // InternalSimpleIDL.g:1448:1: ( ( rule__NamedDefinition__LiteralsAssignment_3_4 ) )
            // InternalSimpleIDL.g:1449:2: ( rule__NamedDefinition__LiteralsAssignment_3_4 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getLiteralsAssignment_3_4()); 
            // InternalSimpleIDL.g:1450:2: ( rule__NamedDefinition__LiteralsAssignment_3_4 )
            // InternalSimpleIDL.g:1450:3: rule__NamedDefinition__LiteralsAssignment_3_4
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__LiteralsAssignment_3_4();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getLiteralsAssignment_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_3__4__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_3__5"
    // InternalSimpleIDL.g:1458:1: rule__NamedDefinition__Group_3__5 : rule__NamedDefinition__Group_3__5__Impl rule__NamedDefinition__Group_3__6 ;
    public final void rule__NamedDefinition__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1462:1: ( rule__NamedDefinition__Group_3__5__Impl rule__NamedDefinition__Group_3__6 )
            // InternalSimpleIDL.g:1463:2: rule__NamedDefinition__Group_3__5__Impl rule__NamedDefinition__Group_3__6
            {
            pushFollow(FOLLOW_22);
            rule__NamedDefinition__Group_3__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_3__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_3__5"


    // $ANTLR start "rule__NamedDefinition__Group_3__5__Impl"
    // InternalSimpleIDL.g:1470:1: rule__NamedDefinition__Group_3__5__Impl : ( ( rule__NamedDefinition__Group_3_5__0 )* ) ;
    public final void rule__NamedDefinition__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1474:1: ( ( ( rule__NamedDefinition__Group_3_5__0 )* ) )
            // InternalSimpleIDL.g:1475:1: ( ( rule__NamedDefinition__Group_3_5__0 )* )
            {
            // InternalSimpleIDL.g:1475:1: ( ( rule__NamedDefinition__Group_3_5__0 )* )
            // InternalSimpleIDL.g:1476:2: ( rule__NamedDefinition__Group_3_5__0 )*
            {
             before(grammarAccess.getNamedDefinitionAccess().getGroup_3_5()); 
            // InternalSimpleIDL.g:1477:2: ( rule__NamedDefinition__Group_3_5__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSimpleIDL.g:1477:3: rule__NamedDefinition__Group_3_5__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__NamedDefinition__Group_3_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getNamedDefinitionAccess().getGroup_3_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_3__5__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_3__6"
    // InternalSimpleIDL.g:1485:1: rule__NamedDefinition__Group_3__6 : rule__NamedDefinition__Group_3__6__Impl rule__NamedDefinition__Group_3__7 ;
    public final void rule__NamedDefinition__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1489:1: ( rule__NamedDefinition__Group_3__6__Impl rule__NamedDefinition__Group_3__7 )
            // InternalSimpleIDL.g:1490:2: rule__NamedDefinition__Group_3__6__Impl rule__NamedDefinition__Group_3__7
            {
            pushFollow(FOLLOW_6);
            rule__NamedDefinition__Group_3__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_3__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_3__6"


    // $ANTLR start "rule__NamedDefinition__Group_3__6__Impl"
    // InternalSimpleIDL.g:1497:1: rule__NamedDefinition__Group_3__6__Impl : ( '}' ) ;
    public final void rule__NamedDefinition__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1501:1: ( ( '}' ) )
            // InternalSimpleIDL.g:1502:1: ( '}' )
            {
            // InternalSimpleIDL.g:1502:1: ( '}' )
            // InternalSimpleIDL.g:1503:2: '}'
            {
             before(grammarAccess.getNamedDefinitionAccess().getRightCurlyBracketKeyword_3_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getRightCurlyBracketKeyword_3_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_3__6__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_3__7"
    // InternalSimpleIDL.g:1512:1: rule__NamedDefinition__Group_3__7 : rule__NamedDefinition__Group_3__7__Impl ;
    public final void rule__NamedDefinition__Group_3__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1516:1: ( rule__NamedDefinition__Group_3__7__Impl )
            // InternalSimpleIDL.g:1517:2: rule__NamedDefinition__Group_3__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_3__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_3__7"


    // $ANTLR start "rule__NamedDefinition__Group_3__7__Impl"
    // InternalSimpleIDL.g:1523:1: rule__NamedDefinition__Group_3__7__Impl : ( ';' ) ;
    public final void rule__NamedDefinition__Group_3__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1527:1: ( ( ';' ) )
            // InternalSimpleIDL.g:1528:1: ( ';' )
            {
            // InternalSimpleIDL.g:1528:1: ( ';' )
            // InternalSimpleIDL.g:1529:2: ';'
            {
             before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_3_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_3_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_3__7__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_3_5__0"
    // InternalSimpleIDL.g:1539:1: rule__NamedDefinition__Group_3_5__0 : rule__NamedDefinition__Group_3_5__0__Impl rule__NamedDefinition__Group_3_5__1 ;
    public final void rule__NamedDefinition__Group_3_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1543:1: ( rule__NamedDefinition__Group_3_5__0__Impl rule__NamedDefinition__Group_3_5__1 )
            // InternalSimpleIDL.g:1544:2: rule__NamedDefinition__Group_3_5__0__Impl rule__NamedDefinition__Group_3_5__1
            {
            pushFollow(FOLLOW_5);
            rule__NamedDefinition__Group_3_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_3_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_3_5__0"


    // $ANTLR start "rule__NamedDefinition__Group_3_5__0__Impl"
    // InternalSimpleIDL.g:1551:1: rule__NamedDefinition__Group_3_5__0__Impl : ( ',' ) ;
    public final void rule__NamedDefinition__Group_3_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1555:1: ( ( ',' ) )
            // InternalSimpleIDL.g:1556:1: ( ',' )
            {
            // InternalSimpleIDL.g:1556:1: ( ',' )
            // InternalSimpleIDL.g:1557:2: ','
            {
             before(grammarAccess.getNamedDefinitionAccess().getCommaKeyword_3_5_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getCommaKeyword_3_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_3_5__0__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_3_5__1"
    // InternalSimpleIDL.g:1566:1: rule__NamedDefinition__Group_3_5__1 : rule__NamedDefinition__Group_3_5__1__Impl ;
    public final void rule__NamedDefinition__Group_3_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1570:1: ( rule__NamedDefinition__Group_3_5__1__Impl )
            // InternalSimpleIDL.g:1571:2: rule__NamedDefinition__Group_3_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_3_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_3_5__1"


    // $ANTLR start "rule__NamedDefinition__Group_3_5__1__Impl"
    // InternalSimpleIDL.g:1577:1: rule__NamedDefinition__Group_3_5__1__Impl : ( ( rule__NamedDefinition__LiteralsAssignment_3_5_1 ) ) ;
    public final void rule__NamedDefinition__Group_3_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1581:1: ( ( ( rule__NamedDefinition__LiteralsAssignment_3_5_1 ) ) )
            // InternalSimpleIDL.g:1582:1: ( ( rule__NamedDefinition__LiteralsAssignment_3_5_1 ) )
            {
            // InternalSimpleIDL.g:1582:1: ( ( rule__NamedDefinition__LiteralsAssignment_3_5_1 ) )
            // InternalSimpleIDL.g:1583:2: ( rule__NamedDefinition__LiteralsAssignment_3_5_1 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getLiteralsAssignment_3_5_1()); 
            // InternalSimpleIDL.g:1584:2: ( rule__NamedDefinition__LiteralsAssignment_3_5_1 )
            // InternalSimpleIDL.g:1584:3: rule__NamedDefinition__LiteralsAssignment_3_5_1
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__LiteralsAssignment_3_5_1();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getLiteralsAssignment_3_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_3_5__1__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_4__0"
    // InternalSimpleIDL.g:1593:1: rule__NamedDefinition__Group_4__0 : rule__NamedDefinition__Group_4__0__Impl rule__NamedDefinition__Group_4__1 ;
    public final void rule__NamedDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1597:1: ( rule__NamedDefinition__Group_4__0__Impl rule__NamedDefinition__Group_4__1 )
            // InternalSimpleIDL.g:1598:2: rule__NamedDefinition__Group_4__0__Impl rule__NamedDefinition__Group_4__1
            {
            pushFollow(FOLLOW_24);
            rule__NamedDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_4__0"


    // $ANTLR start "rule__NamedDefinition__Group_4__0__Impl"
    // InternalSimpleIDL.g:1605:1: rule__NamedDefinition__Group_4__0__Impl : ( () ) ;
    public final void rule__NamedDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1609:1: ( ( () ) )
            // InternalSimpleIDL.g:1610:1: ( () )
            {
            // InternalSimpleIDL.g:1610:1: ( () )
            // InternalSimpleIDL.g:1611:2: ()
            {
             before(grammarAccess.getNamedDefinitionAccess().getArrayTypeAction_4_0()); 
            // InternalSimpleIDL.g:1612:2: ()
            // InternalSimpleIDL.g:1612:3: 
            {
            }

             after(grammarAccess.getNamedDefinitionAccess().getArrayTypeAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_4__1"
    // InternalSimpleIDL.g:1620:1: rule__NamedDefinition__Group_4__1 : rule__NamedDefinition__Group_4__1__Impl rule__NamedDefinition__Group_4__2 ;
    public final void rule__NamedDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1624:1: ( rule__NamedDefinition__Group_4__1__Impl rule__NamedDefinition__Group_4__2 )
            // InternalSimpleIDL.g:1625:2: rule__NamedDefinition__Group_4__1__Impl rule__NamedDefinition__Group_4__2
            {
            pushFollow(FOLLOW_11);
            rule__NamedDefinition__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_4__1"


    // $ANTLR start "rule__NamedDefinition__Group_4__1__Impl"
    // InternalSimpleIDL.g:1632:1: rule__NamedDefinition__Group_4__1__Impl : ( 'typedef' ) ;
    public final void rule__NamedDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1636:1: ( ( 'typedef' ) )
            // InternalSimpleIDL.g:1637:1: ( 'typedef' )
            {
            // InternalSimpleIDL.g:1637:1: ( 'typedef' )
            // InternalSimpleIDL.g:1638:2: 'typedef'
            {
             before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_4_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_4__2"
    // InternalSimpleIDL.g:1647:1: rule__NamedDefinition__Group_4__2 : rule__NamedDefinition__Group_4__2__Impl rule__NamedDefinition__Group_4__3 ;
    public final void rule__NamedDefinition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1651:1: ( rule__NamedDefinition__Group_4__2__Impl rule__NamedDefinition__Group_4__3 )
            // InternalSimpleIDL.g:1652:2: rule__NamedDefinition__Group_4__2__Impl rule__NamedDefinition__Group_4__3
            {
            pushFollow(FOLLOW_5);
            rule__NamedDefinition__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_4__2"


    // $ANTLR start "rule__NamedDefinition__Group_4__2__Impl"
    // InternalSimpleIDL.g:1659:1: rule__NamedDefinition__Group_4__2__Impl : ( ( rule__NamedDefinition__TypeAssignment_4_2 ) ) ;
    public final void rule__NamedDefinition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1663:1: ( ( ( rule__NamedDefinition__TypeAssignment_4_2 ) ) )
            // InternalSimpleIDL.g:1664:1: ( ( rule__NamedDefinition__TypeAssignment_4_2 ) )
            {
            // InternalSimpleIDL.g:1664:1: ( ( rule__NamedDefinition__TypeAssignment_4_2 ) )
            // InternalSimpleIDL.g:1665:2: ( rule__NamedDefinition__TypeAssignment_4_2 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getTypeAssignment_4_2()); 
            // InternalSimpleIDL.g:1666:2: ( rule__NamedDefinition__TypeAssignment_4_2 )
            // InternalSimpleIDL.g:1666:3: rule__NamedDefinition__TypeAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__TypeAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getTypeAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_4__2__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_4__3"
    // InternalSimpleIDL.g:1674:1: rule__NamedDefinition__Group_4__3 : rule__NamedDefinition__Group_4__3__Impl rule__NamedDefinition__Group_4__4 ;
    public final void rule__NamedDefinition__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1678:1: ( rule__NamedDefinition__Group_4__3__Impl rule__NamedDefinition__Group_4__4 )
            // InternalSimpleIDL.g:1679:2: rule__NamedDefinition__Group_4__3__Impl rule__NamedDefinition__Group_4__4
            {
            pushFollow(FOLLOW_25);
            rule__NamedDefinition__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_4__3"


    // $ANTLR start "rule__NamedDefinition__Group_4__3__Impl"
    // InternalSimpleIDL.g:1686:1: rule__NamedDefinition__Group_4__3__Impl : ( ( rule__NamedDefinition__NameAssignment_4_3 ) ) ;
    public final void rule__NamedDefinition__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1690:1: ( ( ( rule__NamedDefinition__NameAssignment_4_3 ) ) )
            // InternalSimpleIDL.g:1691:1: ( ( rule__NamedDefinition__NameAssignment_4_3 ) )
            {
            // InternalSimpleIDL.g:1691:1: ( ( rule__NamedDefinition__NameAssignment_4_3 ) )
            // InternalSimpleIDL.g:1692:2: ( rule__NamedDefinition__NameAssignment_4_3 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_4_3()); 
            // InternalSimpleIDL.g:1693:2: ( rule__NamedDefinition__NameAssignment_4_3 )
            // InternalSimpleIDL.g:1693:3: rule__NamedDefinition__NameAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__NameAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_4__3__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_4__4"
    // InternalSimpleIDL.g:1701:1: rule__NamedDefinition__Group_4__4 : rule__NamedDefinition__Group_4__4__Impl rule__NamedDefinition__Group_4__5 ;
    public final void rule__NamedDefinition__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1705:1: ( rule__NamedDefinition__Group_4__4__Impl rule__NamedDefinition__Group_4__5 )
            // InternalSimpleIDL.g:1706:2: rule__NamedDefinition__Group_4__4__Impl rule__NamedDefinition__Group_4__5
            {
            pushFollow(FOLLOW_26);
            rule__NamedDefinition__Group_4__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_4__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_4__4"


    // $ANTLR start "rule__NamedDefinition__Group_4__4__Impl"
    // InternalSimpleIDL.g:1713:1: rule__NamedDefinition__Group_4__4__Impl : ( '[' ) ;
    public final void rule__NamedDefinition__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1717:1: ( ( '[' ) )
            // InternalSimpleIDL.g:1718:1: ( '[' )
            {
            // InternalSimpleIDL.g:1718:1: ( '[' )
            // InternalSimpleIDL.g:1719:2: '['
            {
             before(grammarAccess.getNamedDefinitionAccess().getLeftSquareBracketKeyword_4_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getLeftSquareBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_4__4__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_4__5"
    // InternalSimpleIDL.g:1728:1: rule__NamedDefinition__Group_4__5 : rule__NamedDefinition__Group_4__5__Impl rule__NamedDefinition__Group_4__6 ;
    public final void rule__NamedDefinition__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1732:1: ( rule__NamedDefinition__Group_4__5__Impl rule__NamedDefinition__Group_4__6 )
            // InternalSimpleIDL.g:1733:2: rule__NamedDefinition__Group_4__5__Impl rule__NamedDefinition__Group_4__6
            {
            pushFollow(FOLLOW_27);
            rule__NamedDefinition__Group_4__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_4__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_4__5"


    // $ANTLR start "rule__NamedDefinition__Group_4__5__Impl"
    // InternalSimpleIDL.g:1740:1: rule__NamedDefinition__Group_4__5__Impl : ( ( rule__NamedDefinition__SizeAssignment_4_5 ) ) ;
    public final void rule__NamedDefinition__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1744:1: ( ( ( rule__NamedDefinition__SizeAssignment_4_5 ) ) )
            // InternalSimpleIDL.g:1745:1: ( ( rule__NamedDefinition__SizeAssignment_4_5 ) )
            {
            // InternalSimpleIDL.g:1745:1: ( ( rule__NamedDefinition__SizeAssignment_4_5 ) )
            // InternalSimpleIDL.g:1746:2: ( rule__NamedDefinition__SizeAssignment_4_5 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getSizeAssignment_4_5()); 
            // InternalSimpleIDL.g:1747:2: ( rule__NamedDefinition__SizeAssignment_4_5 )
            // InternalSimpleIDL.g:1747:3: rule__NamedDefinition__SizeAssignment_4_5
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__SizeAssignment_4_5();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getSizeAssignment_4_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_4__5__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_4__6"
    // InternalSimpleIDL.g:1755:1: rule__NamedDefinition__Group_4__6 : rule__NamedDefinition__Group_4__6__Impl rule__NamedDefinition__Group_4__7 ;
    public final void rule__NamedDefinition__Group_4__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1759:1: ( rule__NamedDefinition__Group_4__6__Impl rule__NamedDefinition__Group_4__7 )
            // InternalSimpleIDL.g:1760:2: rule__NamedDefinition__Group_4__6__Impl rule__NamedDefinition__Group_4__7
            {
            pushFollow(FOLLOW_6);
            rule__NamedDefinition__Group_4__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_4__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_4__6"


    // $ANTLR start "rule__NamedDefinition__Group_4__6__Impl"
    // InternalSimpleIDL.g:1767:1: rule__NamedDefinition__Group_4__6__Impl : ( ']' ) ;
    public final void rule__NamedDefinition__Group_4__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1771:1: ( ( ']' ) )
            // InternalSimpleIDL.g:1772:1: ( ']' )
            {
            // InternalSimpleIDL.g:1772:1: ( ']' )
            // InternalSimpleIDL.g:1773:2: ']'
            {
             before(grammarAccess.getNamedDefinitionAccess().getRightSquareBracketKeyword_4_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getRightSquareBracketKeyword_4_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_4__6__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_4__7"
    // InternalSimpleIDL.g:1782:1: rule__NamedDefinition__Group_4__7 : rule__NamedDefinition__Group_4__7__Impl ;
    public final void rule__NamedDefinition__Group_4__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1786:1: ( rule__NamedDefinition__Group_4__7__Impl )
            // InternalSimpleIDL.g:1787:2: rule__NamedDefinition__Group_4__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_4__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_4__7"


    // $ANTLR start "rule__NamedDefinition__Group_4__7__Impl"
    // InternalSimpleIDL.g:1793:1: rule__NamedDefinition__Group_4__7__Impl : ( ';' ) ;
    public final void rule__NamedDefinition__Group_4__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1797:1: ( ( ';' ) )
            // InternalSimpleIDL.g:1798:1: ( ';' )
            {
            // InternalSimpleIDL.g:1798:1: ( ';' )
            // InternalSimpleIDL.g:1799:2: ';'
            {
             before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_4_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_4_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_4__7__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_5__0"
    // InternalSimpleIDL.g:1809:1: rule__NamedDefinition__Group_5__0 : rule__NamedDefinition__Group_5__0__Impl rule__NamedDefinition__Group_5__1 ;
    public final void rule__NamedDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1813:1: ( rule__NamedDefinition__Group_5__0__Impl rule__NamedDefinition__Group_5__1 )
            // InternalSimpleIDL.g:1814:2: rule__NamedDefinition__Group_5__0__Impl rule__NamedDefinition__Group_5__1
            {
            pushFollow(FOLLOW_24);
            rule__NamedDefinition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_5__0"


    // $ANTLR start "rule__NamedDefinition__Group_5__0__Impl"
    // InternalSimpleIDL.g:1821:1: rule__NamedDefinition__Group_5__0__Impl : ( () ) ;
    public final void rule__NamedDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1825:1: ( ( () ) )
            // InternalSimpleIDL.g:1826:1: ( () )
            {
            // InternalSimpleIDL.g:1826:1: ( () )
            // InternalSimpleIDL.g:1827:2: ()
            {
             before(grammarAccess.getNamedDefinitionAccess().getSignedShortIntAction_5_0()); 
            // InternalSimpleIDL.g:1828:2: ()
            // InternalSimpleIDL.g:1828:3: 
            {
            }

             after(grammarAccess.getNamedDefinitionAccess().getSignedShortIntAction_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_5__0__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_5__1"
    // InternalSimpleIDL.g:1836:1: rule__NamedDefinition__Group_5__1 : rule__NamedDefinition__Group_5__1__Impl rule__NamedDefinition__Group_5__2 ;
    public final void rule__NamedDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1840:1: ( rule__NamedDefinition__Group_5__1__Impl rule__NamedDefinition__Group_5__2 )
            // InternalSimpleIDL.g:1841:2: rule__NamedDefinition__Group_5__1__Impl rule__NamedDefinition__Group_5__2
            {
            pushFollow(FOLLOW_17);
            rule__NamedDefinition__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_5__1"


    // $ANTLR start "rule__NamedDefinition__Group_5__1__Impl"
    // InternalSimpleIDL.g:1848:1: rule__NamedDefinition__Group_5__1__Impl : ( 'typedef' ) ;
    public final void rule__NamedDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1852:1: ( ( 'typedef' ) )
            // InternalSimpleIDL.g:1853:1: ( 'typedef' )
            {
            // InternalSimpleIDL.g:1853:1: ( 'typedef' )
            // InternalSimpleIDL.g:1854:2: 'typedef'
            {
             before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_5_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_5__1__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_5__2"
    // InternalSimpleIDL.g:1863:1: rule__NamedDefinition__Group_5__2 : rule__NamedDefinition__Group_5__2__Impl rule__NamedDefinition__Group_5__3 ;
    public final void rule__NamedDefinition__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1867:1: ( rule__NamedDefinition__Group_5__2__Impl rule__NamedDefinition__Group_5__3 )
            // InternalSimpleIDL.g:1868:2: rule__NamedDefinition__Group_5__2__Impl rule__NamedDefinition__Group_5__3
            {
            pushFollow(FOLLOW_5);
            rule__NamedDefinition__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_5__2"


    // $ANTLR start "rule__NamedDefinition__Group_5__2__Impl"
    // InternalSimpleIDL.g:1875:1: rule__NamedDefinition__Group_5__2__Impl : ( 'short' ) ;
    public final void rule__NamedDefinition__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1879:1: ( ( 'short' ) )
            // InternalSimpleIDL.g:1880:1: ( 'short' )
            {
            // InternalSimpleIDL.g:1880:1: ( 'short' )
            // InternalSimpleIDL.g:1881:2: 'short'
            {
             before(grammarAccess.getNamedDefinitionAccess().getShortKeyword_5_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getShortKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_5__2__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_5__3"
    // InternalSimpleIDL.g:1890:1: rule__NamedDefinition__Group_5__3 : rule__NamedDefinition__Group_5__3__Impl rule__NamedDefinition__Group_5__4 ;
    public final void rule__NamedDefinition__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1894:1: ( rule__NamedDefinition__Group_5__3__Impl rule__NamedDefinition__Group_5__4 )
            // InternalSimpleIDL.g:1895:2: rule__NamedDefinition__Group_5__3__Impl rule__NamedDefinition__Group_5__4
            {
            pushFollow(FOLLOW_6);
            rule__NamedDefinition__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_5__3"


    // $ANTLR start "rule__NamedDefinition__Group_5__3__Impl"
    // InternalSimpleIDL.g:1902:1: rule__NamedDefinition__Group_5__3__Impl : ( ( rule__NamedDefinition__NameAssignment_5_3 ) ) ;
    public final void rule__NamedDefinition__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1906:1: ( ( ( rule__NamedDefinition__NameAssignment_5_3 ) ) )
            // InternalSimpleIDL.g:1907:1: ( ( rule__NamedDefinition__NameAssignment_5_3 ) )
            {
            // InternalSimpleIDL.g:1907:1: ( ( rule__NamedDefinition__NameAssignment_5_3 ) )
            // InternalSimpleIDL.g:1908:2: ( rule__NamedDefinition__NameAssignment_5_3 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_5_3()); 
            // InternalSimpleIDL.g:1909:2: ( rule__NamedDefinition__NameAssignment_5_3 )
            // InternalSimpleIDL.g:1909:3: rule__NamedDefinition__NameAssignment_5_3
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__NameAssignment_5_3();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_5__3__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_5__4"
    // InternalSimpleIDL.g:1917:1: rule__NamedDefinition__Group_5__4 : rule__NamedDefinition__Group_5__4__Impl ;
    public final void rule__NamedDefinition__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1921:1: ( rule__NamedDefinition__Group_5__4__Impl )
            // InternalSimpleIDL.g:1922:2: rule__NamedDefinition__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_5__4"


    // $ANTLR start "rule__NamedDefinition__Group_5__4__Impl"
    // InternalSimpleIDL.g:1928:1: rule__NamedDefinition__Group_5__4__Impl : ( ';' ) ;
    public final void rule__NamedDefinition__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1932:1: ( ( ';' ) )
            // InternalSimpleIDL.g:1933:1: ( ';' )
            {
            // InternalSimpleIDL.g:1933:1: ( ';' )
            // InternalSimpleIDL.g:1934:2: ';'
            {
             before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_5_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_5__4__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_6__0"
    // InternalSimpleIDL.g:1944:1: rule__NamedDefinition__Group_6__0 : rule__NamedDefinition__Group_6__0__Impl rule__NamedDefinition__Group_6__1 ;
    public final void rule__NamedDefinition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1948:1: ( rule__NamedDefinition__Group_6__0__Impl rule__NamedDefinition__Group_6__1 )
            // InternalSimpleIDL.g:1949:2: rule__NamedDefinition__Group_6__0__Impl rule__NamedDefinition__Group_6__1
            {
            pushFollow(FOLLOW_24);
            rule__NamedDefinition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_6__0"


    // $ANTLR start "rule__NamedDefinition__Group_6__0__Impl"
    // InternalSimpleIDL.g:1956:1: rule__NamedDefinition__Group_6__0__Impl : ( () ) ;
    public final void rule__NamedDefinition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1960:1: ( ( () ) )
            // InternalSimpleIDL.g:1961:1: ( () )
            {
            // InternalSimpleIDL.g:1961:1: ( () )
            // InternalSimpleIDL.g:1962:2: ()
            {
             before(grammarAccess.getNamedDefinitionAccess().getSignedLongIntAction_6_0()); 
            // InternalSimpleIDL.g:1963:2: ()
            // InternalSimpleIDL.g:1963:3: 
            {
            }

             after(grammarAccess.getNamedDefinitionAccess().getSignedLongIntAction_6_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_6__0__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_6__1"
    // InternalSimpleIDL.g:1971:1: rule__NamedDefinition__Group_6__1 : rule__NamedDefinition__Group_6__1__Impl rule__NamedDefinition__Group_6__2 ;
    public final void rule__NamedDefinition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1975:1: ( rule__NamedDefinition__Group_6__1__Impl rule__NamedDefinition__Group_6__2 )
            // InternalSimpleIDL.g:1976:2: rule__NamedDefinition__Group_6__1__Impl rule__NamedDefinition__Group_6__2
            {
            pushFollow(FOLLOW_28);
            rule__NamedDefinition__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_6__1"


    // $ANTLR start "rule__NamedDefinition__Group_6__1__Impl"
    // InternalSimpleIDL.g:1983:1: rule__NamedDefinition__Group_6__1__Impl : ( 'typedef' ) ;
    public final void rule__NamedDefinition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1987:1: ( ( 'typedef' ) )
            // InternalSimpleIDL.g:1988:1: ( 'typedef' )
            {
            // InternalSimpleIDL.g:1988:1: ( 'typedef' )
            // InternalSimpleIDL.g:1989:2: 'typedef'
            {
             before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_6_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_6__1__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_6__2"
    // InternalSimpleIDL.g:1998:1: rule__NamedDefinition__Group_6__2 : rule__NamedDefinition__Group_6__2__Impl rule__NamedDefinition__Group_6__3 ;
    public final void rule__NamedDefinition__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2002:1: ( rule__NamedDefinition__Group_6__2__Impl rule__NamedDefinition__Group_6__3 )
            // InternalSimpleIDL.g:2003:2: rule__NamedDefinition__Group_6__2__Impl rule__NamedDefinition__Group_6__3
            {
            pushFollow(FOLLOW_5);
            rule__NamedDefinition__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_6__2"


    // $ANTLR start "rule__NamedDefinition__Group_6__2__Impl"
    // InternalSimpleIDL.g:2010:1: rule__NamedDefinition__Group_6__2__Impl : ( 'long' ) ;
    public final void rule__NamedDefinition__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2014:1: ( ( 'long' ) )
            // InternalSimpleIDL.g:2015:1: ( 'long' )
            {
            // InternalSimpleIDL.g:2015:1: ( 'long' )
            // InternalSimpleIDL.g:2016:2: 'long'
            {
             before(grammarAccess.getNamedDefinitionAccess().getLongKeyword_6_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getLongKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_6__2__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_6__3"
    // InternalSimpleIDL.g:2025:1: rule__NamedDefinition__Group_6__3 : rule__NamedDefinition__Group_6__3__Impl rule__NamedDefinition__Group_6__4 ;
    public final void rule__NamedDefinition__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2029:1: ( rule__NamedDefinition__Group_6__3__Impl rule__NamedDefinition__Group_6__4 )
            // InternalSimpleIDL.g:2030:2: rule__NamedDefinition__Group_6__3__Impl rule__NamedDefinition__Group_6__4
            {
            pushFollow(FOLLOW_6);
            rule__NamedDefinition__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_6__3"


    // $ANTLR start "rule__NamedDefinition__Group_6__3__Impl"
    // InternalSimpleIDL.g:2037:1: rule__NamedDefinition__Group_6__3__Impl : ( ( rule__NamedDefinition__NameAssignment_6_3 ) ) ;
    public final void rule__NamedDefinition__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2041:1: ( ( ( rule__NamedDefinition__NameAssignment_6_3 ) ) )
            // InternalSimpleIDL.g:2042:1: ( ( rule__NamedDefinition__NameAssignment_6_3 ) )
            {
            // InternalSimpleIDL.g:2042:1: ( ( rule__NamedDefinition__NameAssignment_6_3 ) )
            // InternalSimpleIDL.g:2043:2: ( rule__NamedDefinition__NameAssignment_6_3 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_6_3()); 
            // InternalSimpleIDL.g:2044:2: ( rule__NamedDefinition__NameAssignment_6_3 )
            // InternalSimpleIDL.g:2044:3: rule__NamedDefinition__NameAssignment_6_3
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__NameAssignment_6_3();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_6__3__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_6__4"
    // InternalSimpleIDL.g:2052:1: rule__NamedDefinition__Group_6__4 : rule__NamedDefinition__Group_6__4__Impl ;
    public final void rule__NamedDefinition__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2056:1: ( rule__NamedDefinition__Group_6__4__Impl )
            // InternalSimpleIDL.g:2057:2: rule__NamedDefinition__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_6__4"


    // $ANTLR start "rule__NamedDefinition__Group_6__4__Impl"
    // InternalSimpleIDL.g:2063:1: rule__NamedDefinition__Group_6__4__Impl : ( ';' ) ;
    public final void rule__NamedDefinition__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2067:1: ( ( ';' ) )
            // InternalSimpleIDL.g:2068:1: ( ';' )
            {
            // InternalSimpleIDL.g:2068:1: ( ';' )
            // InternalSimpleIDL.g:2069:2: ';'
            {
             before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_6_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_6__4__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_7__0"
    // InternalSimpleIDL.g:2079:1: rule__NamedDefinition__Group_7__0 : rule__NamedDefinition__Group_7__0__Impl rule__NamedDefinition__Group_7__1 ;
    public final void rule__NamedDefinition__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2083:1: ( rule__NamedDefinition__Group_7__0__Impl rule__NamedDefinition__Group_7__1 )
            // InternalSimpleIDL.g:2084:2: rule__NamedDefinition__Group_7__0__Impl rule__NamedDefinition__Group_7__1
            {
            pushFollow(FOLLOW_24);
            rule__NamedDefinition__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_7__0"


    // $ANTLR start "rule__NamedDefinition__Group_7__0__Impl"
    // InternalSimpleIDL.g:2091:1: rule__NamedDefinition__Group_7__0__Impl : ( () ) ;
    public final void rule__NamedDefinition__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2095:1: ( ( () ) )
            // InternalSimpleIDL.g:2096:1: ( () )
            {
            // InternalSimpleIDL.g:2096:1: ( () )
            // InternalSimpleIDL.g:2097:2: ()
            {
             before(grammarAccess.getNamedDefinitionAccess().getSignedLongLongIntAction_7_0()); 
            // InternalSimpleIDL.g:2098:2: ()
            // InternalSimpleIDL.g:2098:3: 
            {
            }

             after(grammarAccess.getNamedDefinitionAccess().getSignedLongLongIntAction_7_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_7__0__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_7__1"
    // InternalSimpleIDL.g:2106:1: rule__NamedDefinition__Group_7__1 : rule__NamedDefinition__Group_7__1__Impl rule__NamedDefinition__Group_7__2 ;
    public final void rule__NamedDefinition__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2110:1: ( rule__NamedDefinition__Group_7__1__Impl rule__NamedDefinition__Group_7__2 )
            // InternalSimpleIDL.g:2111:2: rule__NamedDefinition__Group_7__1__Impl rule__NamedDefinition__Group_7__2
            {
            pushFollow(FOLLOW_28);
            rule__NamedDefinition__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_7__1"


    // $ANTLR start "rule__NamedDefinition__Group_7__1__Impl"
    // InternalSimpleIDL.g:2118:1: rule__NamedDefinition__Group_7__1__Impl : ( 'typedef' ) ;
    public final void rule__NamedDefinition__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2122:1: ( ( 'typedef' ) )
            // InternalSimpleIDL.g:2123:1: ( 'typedef' )
            {
            // InternalSimpleIDL.g:2123:1: ( 'typedef' )
            // InternalSimpleIDL.g:2124:2: 'typedef'
            {
             before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_7_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_7__1__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_7__2"
    // InternalSimpleIDL.g:2133:1: rule__NamedDefinition__Group_7__2 : rule__NamedDefinition__Group_7__2__Impl rule__NamedDefinition__Group_7__3 ;
    public final void rule__NamedDefinition__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2137:1: ( rule__NamedDefinition__Group_7__2__Impl rule__NamedDefinition__Group_7__3 )
            // InternalSimpleIDL.g:2138:2: rule__NamedDefinition__Group_7__2__Impl rule__NamedDefinition__Group_7__3
            {
            pushFollow(FOLLOW_28);
            rule__NamedDefinition__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_7__2"


    // $ANTLR start "rule__NamedDefinition__Group_7__2__Impl"
    // InternalSimpleIDL.g:2145:1: rule__NamedDefinition__Group_7__2__Impl : ( 'long' ) ;
    public final void rule__NamedDefinition__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2149:1: ( ( 'long' ) )
            // InternalSimpleIDL.g:2150:1: ( 'long' )
            {
            // InternalSimpleIDL.g:2150:1: ( 'long' )
            // InternalSimpleIDL.g:2151:2: 'long'
            {
             before(grammarAccess.getNamedDefinitionAccess().getLongKeyword_7_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getLongKeyword_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_7__2__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_7__3"
    // InternalSimpleIDL.g:2160:1: rule__NamedDefinition__Group_7__3 : rule__NamedDefinition__Group_7__3__Impl rule__NamedDefinition__Group_7__4 ;
    public final void rule__NamedDefinition__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2164:1: ( rule__NamedDefinition__Group_7__3__Impl rule__NamedDefinition__Group_7__4 )
            // InternalSimpleIDL.g:2165:2: rule__NamedDefinition__Group_7__3__Impl rule__NamedDefinition__Group_7__4
            {
            pushFollow(FOLLOW_5);
            rule__NamedDefinition__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_7__3"


    // $ANTLR start "rule__NamedDefinition__Group_7__3__Impl"
    // InternalSimpleIDL.g:2172:1: rule__NamedDefinition__Group_7__3__Impl : ( 'long' ) ;
    public final void rule__NamedDefinition__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2176:1: ( ( 'long' ) )
            // InternalSimpleIDL.g:2177:1: ( 'long' )
            {
            // InternalSimpleIDL.g:2177:1: ( 'long' )
            // InternalSimpleIDL.g:2178:2: 'long'
            {
             before(grammarAccess.getNamedDefinitionAccess().getLongKeyword_7_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getLongKeyword_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_7__3__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_7__4"
    // InternalSimpleIDL.g:2187:1: rule__NamedDefinition__Group_7__4 : rule__NamedDefinition__Group_7__4__Impl rule__NamedDefinition__Group_7__5 ;
    public final void rule__NamedDefinition__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2191:1: ( rule__NamedDefinition__Group_7__4__Impl rule__NamedDefinition__Group_7__5 )
            // InternalSimpleIDL.g:2192:2: rule__NamedDefinition__Group_7__4__Impl rule__NamedDefinition__Group_7__5
            {
            pushFollow(FOLLOW_6);
            rule__NamedDefinition__Group_7__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_7__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_7__4"


    // $ANTLR start "rule__NamedDefinition__Group_7__4__Impl"
    // InternalSimpleIDL.g:2199:1: rule__NamedDefinition__Group_7__4__Impl : ( ( rule__NamedDefinition__NameAssignment_7_4 ) ) ;
    public final void rule__NamedDefinition__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2203:1: ( ( ( rule__NamedDefinition__NameAssignment_7_4 ) ) )
            // InternalSimpleIDL.g:2204:1: ( ( rule__NamedDefinition__NameAssignment_7_4 ) )
            {
            // InternalSimpleIDL.g:2204:1: ( ( rule__NamedDefinition__NameAssignment_7_4 ) )
            // InternalSimpleIDL.g:2205:2: ( rule__NamedDefinition__NameAssignment_7_4 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_7_4()); 
            // InternalSimpleIDL.g:2206:2: ( rule__NamedDefinition__NameAssignment_7_4 )
            // InternalSimpleIDL.g:2206:3: rule__NamedDefinition__NameAssignment_7_4
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__NameAssignment_7_4();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_7__4__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_7__5"
    // InternalSimpleIDL.g:2214:1: rule__NamedDefinition__Group_7__5 : rule__NamedDefinition__Group_7__5__Impl ;
    public final void rule__NamedDefinition__Group_7__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2218:1: ( rule__NamedDefinition__Group_7__5__Impl )
            // InternalSimpleIDL.g:2219:2: rule__NamedDefinition__Group_7__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_7__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_7__5"


    // $ANTLR start "rule__NamedDefinition__Group_7__5__Impl"
    // InternalSimpleIDL.g:2225:1: rule__NamedDefinition__Group_7__5__Impl : ( ';' ) ;
    public final void rule__NamedDefinition__Group_7__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2229:1: ( ( ';' ) )
            // InternalSimpleIDL.g:2230:1: ( ';' )
            {
            // InternalSimpleIDL.g:2230:1: ( ';' )
            // InternalSimpleIDL.g:2231:2: ';'
            {
             before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_7_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_7_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_7__5__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_8__0"
    // InternalSimpleIDL.g:2241:1: rule__NamedDefinition__Group_8__0 : rule__NamedDefinition__Group_8__0__Impl rule__NamedDefinition__Group_8__1 ;
    public final void rule__NamedDefinition__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2245:1: ( rule__NamedDefinition__Group_8__0__Impl rule__NamedDefinition__Group_8__1 )
            // InternalSimpleIDL.g:2246:2: rule__NamedDefinition__Group_8__0__Impl rule__NamedDefinition__Group_8__1
            {
            pushFollow(FOLLOW_24);
            rule__NamedDefinition__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_8__0"


    // $ANTLR start "rule__NamedDefinition__Group_8__0__Impl"
    // InternalSimpleIDL.g:2253:1: rule__NamedDefinition__Group_8__0__Impl : ( () ) ;
    public final void rule__NamedDefinition__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2257:1: ( ( () ) )
            // InternalSimpleIDL.g:2258:1: ( () )
            {
            // InternalSimpleIDL.g:2258:1: ( () )
            // InternalSimpleIDL.g:2259:2: ()
            {
             before(grammarAccess.getNamedDefinitionAccess().getUnsignedShortIntAction_8_0()); 
            // InternalSimpleIDL.g:2260:2: ()
            // InternalSimpleIDL.g:2260:3: 
            {
            }

             after(grammarAccess.getNamedDefinitionAccess().getUnsignedShortIntAction_8_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_8__0__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_8__1"
    // InternalSimpleIDL.g:2268:1: rule__NamedDefinition__Group_8__1 : rule__NamedDefinition__Group_8__1__Impl rule__NamedDefinition__Group_8__2 ;
    public final void rule__NamedDefinition__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2272:1: ( rule__NamedDefinition__Group_8__1__Impl rule__NamedDefinition__Group_8__2 )
            // InternalSimpleIDL.g:2273:2: rule__NamedDefinition__Group_8__1__Impl rule__NamedDefinition__Group_8__2
            {
            pushFollow(FOLLOW_16);
            rule__NamedDefinition__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_8__1"


    // $ANTLR start "rule__NamedDefinition__Group_8__1__Impl"
    // InternalSimpleIDL.g:2280:1: rule__NamedDefinition__Group_8__1__Impl : ( 'typedef' ) ;
    public final void rule__NamedDefinition__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2284:1: ( ( 'typedef' ) )
            // InternalSimpleIDL.g:2285:1: ( 'typedef' )
            {
            // InternalSimpleIDL.g:2285:1: ( 'typedef' )
            // InternalSimpleIDL.g:2286:2: 'typedef'
            {
             before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_8_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_8__1__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_8__2"
    // InternalSimpleIDL.g:2295:1: rule__NamedDefinition__Group_8__2 : rule__NamedDefinition__Group_8__2__Impl rule__NamedDefinition__Group_8__3 ;
    public final void rule__NamedDefinition__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2299:1: ( rule__NamedDefinition__Group_8__2__Impl rule__NamedDefinition__Group_8__3 )
            // InternalSimpleIDL.g:2300:2: rule__NamedDefinition__Group_8__2__Impl rule__NamedDefinition__Group_8__3
            {
            pushFollow(FOLLOW_17);
            rule__NamedDefinition__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_8__2"


    // $ANTLR start "rule__NamedDefinition__Group_8__2__Impl"
    // InternalSimpleIDL.g:2307:1: rule__NamedDefinition__Group_8__2__Impl : ( 'unsigned' ) ;
    public final void rule__NamedDefinition__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2311:1: ( ( 'unsigned' ) )
            // InternalSimpleIDL.g:2312:1: ( 'unsigned' )
            {
            // InternalSimpleIDL.g:2312:1: ( 'unsigned' )
            // InternalSimpleIDL.g:2313:2: 'unsigned'
            {
             before(grammarAccess.getNamedDefinitionAccess().getUnsignedKeyword_8_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getUnsignedKeyword_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_8__2__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_8__3"
    // InternalSimpleIDL.g:2322:1: rule__NamedDefinition__Group_8__3 : rule__NamedDefinition__Group_8__3__Impl rule__NamedDefinition__Group_8__4 ;
    public final void rule__NamedDefinition__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2326:1: ( rule__NamedDefinition__Group_8__3__Impl rule__NamedDefinition__Group_8__4 )
            // InternalSimpleIDL.g:2327:2: rule__NamedDefinition__Group_8__3__Impl rule__NamedDefinition__Group_8__4
            {
            pushFollow(FOLLOW_5);
            rule__NamedDefinition__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_8__3"


    // $ANTLR start "rule__NamedDefinition__Group_8__3__Impl"
    // InternalSimpleIDL.g:2334:1: rule__NamedDefinition__Group_8__3__Impl : ( 'short' ) ;
    public final void rule__NamedDefinition__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2338:1: ( ( 'short' ) )
            // InternalSimpleIDL.g:2339:1: ( 'short' )
            {
            // InternalSimpleIDL.g:2339:1: ( 'short' )
            // InternalSimpleIDL.g:2340:2: 'short'
            {
             before(grammarAccess.getNamedDefinitionAccess().getShortKeyword_8_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getShortKeyword_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_8__3__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_8__4"
    // InternalSimpleIDL.g:2349:1: rule__NamedDefinition__Group_8__4 : rule__NamedDefinition__Group_8__4__Impl rule__NamedDefinition__Group_8__5 ;
    public final void rule__NamedDefinition__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2353:1: ( rule__NamedDefinition__Group_8__4__Impl rule__NamedDefinition__Group_8__5 )
            // InternalSimpleIDL.g:2354:2: rule__NamedDefinition__Group_8__4__Impl rule__NamedDefinition__Group_8__5
            {
            pushFollow(FOLLOW_6);
            rule__NamedDefinition__Group_8__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_8__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_8__4"


    // $ANTLR start "rule__NamedDefinition__Group_8__4__Impl"
    // InternalSimpleIDL.g:2361:1: rule__NamedDefinition__Group_8__4__Impl : ( ( rule__NamedDefinition__NameAssignment_8_4 ) ) ;
    public final void rule__NamedDefinition__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2365:1: ( ( ( rule__NamedDefinition__NameAssignment_8_4 ) ) )
            // InternalSimpleIDL.g:2366:1: ( ( rule__NamedDefinition__NameAssignment_8_4 ) )
            {
            // InternalSimpleIDL.g:2366:1: ( ( rule__NamedDefinition__NameAssignment_8_4 ) )
            // InternalSimpleIDL.g:2367:2: ( rule__NamedDefinition__NameAssignment_8_4 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_8_4()); 
            // InternalSimpleIDL.g:2368:2: ( rule__NamedDefinition__NameAssignment_8_4 )
            // InternalSimpleIDL.g:2368:3: rule__NamedDefinition__NameAssignment_8_4
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__NameAssignment_8_4();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_8__4__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_8__5"
    // InternalSimpleIDL.g:2376:1: rule__NamedDefinition__Group_8__5 : rule__NamedDefinition__Group_8__5__Impl ;
    public final void rule__NamedDefinition__Group_8__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2380:1: ( rule__NamedDefinition__Group_8__5__Impl )
            // InternalSimpleIDL.g:2381:2: rule__NamedDefinition__Group_8__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_8__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_8__5"


    // $ANTLR start "rule__NamedDefinition__Group_8__5__Impl"
    // InternalSimpleIDL.g:2387:1: rule__NamedDefinition__Group_8__5__Impl : ( ';' ) ;
    public final void rule__NamedDefinition__Group_8__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2391:1: ( ( ';' ) )
            // InternalSimpleIDL.g:2392:1: ( ';' )
            {
            // InternalSimpleIDL.g:2392:1: ( ';' )
            // InternalSimpleIDL.g:2393:2: ';'
            {
             before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_8_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_8_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_8__5__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_9__0"
    // InternalSimpleIDL.g:2403:1: rule__NamedDefinition__Group_9__0 : rule__NamedDefinition__Group_9__0__Impl rule__NamedDefinition__Group_9__1 ;
    public final void rule__NamedDefinition__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2407:1: ( rule__NamedDefinition__Group_9__0__Impl rule__NamedDefinition__Group_9__1 )
            // InternalSimpleIDL.g:2408:2: rule__NamedDefinition__Group_9__0__Impl rule__NamedDefinition__Group_9__1
            {
            pushFollow(FOLLOW_24);
            rule__NamedDefinition__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_9__0"


    // $ANTLR start "rule__NamedDefinition__Group_9__0__Impl"
    // InternalSimpleIDL.g:2415:1: rule__NamedDefinition__Group_9__0__Impl : ( () ) ;
    public final void rule__NamedDefinition__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2419:1: ( ( () ) )
            // InternalSimpleIDL.g:2420:1: ( () )
            {
            // InternalSimpleIDL.g:2420:1: ( () )
            // InternalSimpleIDL.g:2421:2: ()
            {
             before(grammarAccess.getNamedDefinitionAccess().getUnsignedLongIntAction_9_0()); 
            // InternalSimpleIDL.g:2422:2: ()
            // InternalSimpleIDL.g:2422:3: 
            {
            }

             after(grammarAccess.getNamedDefinitionAccess().getUnsignedLongIntAction_9_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_9__0__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_9__1"
    // InternalSimpleIDL.g:2430:1: rule__NamedDefinition__Group_9__1 : rule__NamedDefinition__Group_9__1__Impl rule__NamedDefinition__Group_9__2 ;
    public final void rule__NamedDefinition__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2434:1: ( rule__NamedDefinition__Group_9__1__Impl rule__NamedDefinition__Group_9__2 )
            // InternalSimpleIDL.g:2435:2: rule__NamedDefinition__Group_9__1__Impl rule__NamedDefinition__Group_9__2
            {
            pushFollow(FOLLOW_16);
            rule__NamedDefinition__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_9__1"


    // $ANTLR start "rule__NamedDefinition__Group_9__1__Impl"
    // InternalSimpleIDL.g:2442:1: rule__NamedDefinition__Group_9__1__Impl : ( 'typedef' ) ;
    public final void rule__NamedDefinition__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2446:1: ( ( 'typedef' ) )
            // InternalSimpleIDL.g:2447:1: ( 'typedef' )
            {
            // InternalSimpleIDL.g:2447:1: ( 'typedef' )
            // InternalSimpleIDL.g:2448:2: 'typedef'
            {
             before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_9_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_9__1__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_9__2"
    // InternalSimpleIDL.g:2457:1: rule__NamedDefinition__Group_9__2 : rule__NamedDefinition__Group_9__2__Impl rule__NamedDefinition__Group_9__3 ;
    public final void rule__NamedDefinition__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2461:1: ( rule__NamedDefinition__Group_9__2__Impl rule__NamedDefinition__Group_9__3 )
            // InternalSimpleIDL.g:2462:2: rule__NamedDefinition__Group_9__2__Impl rule__NamedDefinition__Group_9__3
            {
            pushFollow(FOLLOW_28);
            rule__NamedDefinition__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_9__2"


    // $ANTLR start "rule__NamedDefinition__Group_9__2__Impl"
    // InternalSimpleIDL.g:2469:1: rule__NamedDefinition__Group_9__2__Impl : ( 'unsigned' ) ;
    public final void rule__NamedDefinition__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2473:1: ( ( 'unsigned' ) )
            // InternalSimpleIDL.g:2474:1: ( 'unsigned' )
            {
            // InternalSimpleIDL.g:2474:1: ( 'unsigned' )
            // InternalSimpleIDL.g:2475:2: 'unsigned'
            {
             before(grammarAccess.getNamedDefinitionAccess().getUnsignedKeyword_9_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getUnsignedKeyword_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_9__2__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_9__3"
    // InternalSimpleIDL.g:2484:1: rule__NamedDefinition__Group_9__3 : rule__NamedDefinition__Group_9__3__Impl rule__NamedDefinition__Group_9__4 ;
    public final void rule__NamedDefinition__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2488:1: ( rule__NamedDefinition__Group_9__3__Impl rule__NamedDefinition__Group_9__4 )
            // InternalSimpleIDL.g:2489:2: rule__NamedDefinition__Group_9__3__Impl rule__NamedDefinition__Group_9__4
            {
            pushFollow(FOLLOW_5);
            rule__NamedDefinition__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_9__3"


    // $ANTLR start "rule__NamedDefinition__Group_9__3__Impl"
    // InternalSimpleIDL.g:2496:1: rule__NamedDefinition__Group_9__3__Impl : ( 'long' ) ;
    public final void rule__NamedDefinition__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2500:1: ( ( 'long' ) )
            // InternalSimpleIDL.g:2501:1: ( 'long' )
            {
            // InternalSimpleIDL.g:2501:1: ( 'long' )
            // InternalSimpleIDL.g:2502:2: 'long'
            {
             before(grammarAccess.getNamedDefinitionAccess().getLongKeyword_9_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getLongKeyword_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_9__3__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_9__4"
    // InternalSimpleIDL.g:2511:1: rule__NamedDefinition__Group_9__4 : rule__NamedDefinition__Group_9__4__Impl rule__NamedDefinition__Group_9__5 ;
    public final void rule__NamedDefinition__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2515:1: ( rule__NamedDefinition__Group_9__4__Impl rule__NamedDefinition__Group_9__5 )
            // InternalSimpleIDL.g:2516:2: rule__NamedDefinition__Group_9__4__Impl rule__NamedDefinition__Group_9__5
            {
            pushFollow(FOLLOW_6);
            rule__NamedDefinition__Group_9__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_9__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_9__4"


    // $ANTLR start "rule__NamedDefinition__Group_9__4__Impl"
    // InternalSimpleIDL.g:2523:1: rule__NamedDefinition__Group_9__4__Impl : ( ( rule__NamedDefinition__NameAssignment_9_4 ) ) ;
    public final void rule__NamedDefinition__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2527:1: ( ( ( rule__NamedDefinition__NameAssignment_9_4 ) ) )
            // InternalSimpleIDL.g:2528:1: ( ( rule__NamedDefinition__NameAssignment_9_4 ) )
            {
            // InternalSimpleIDL.g:2528:1: ( ( rule__NamedDefinition__NameAssignment_9_4 ) )
            // InternalSimpleIDL.g:2529:2: ( rule__NamedDefinition__NameAssignment_9_4 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_9_4()); 
            // InternalSimpleIDL.g:2530:2: ( rule__NamedDefinition__NameAssignment_9_4 )
            // InternalSimpleIDL.g:2530:3: rule__NamedDefinition__NameAssignment_9_4
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__NameAssignment_9_4();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_9__4__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_9__5"
    // InternalSimpleIDL.g:2538:1: rule__NamedDefinition__Group_9__5 : rule__NamedDefinition__Group_9__5__Impl ;
    public final void rule__NamedDefinition__Group_9__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2542:1: ( rule__NamedDefinition__Group_9__5__Impl )
            // InternalSimpleIDL.g:2543:2: rule__NamedDefinition__Group_9__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_9__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_9__5"


    // $ANTLR start "rule__NamedDefinition__Group_9__5__Impl"
    // InternalSimpleIDL.g:2549:1: rule__NamedDefinition__Group_9__5__Impl : ( ';' ) ;
    public final void rule__NamedDefinition__Group_9__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2553:1: ( ( ';' ) )
            // InternalSimpleIDL.g:2554:1: ( ';' )
            {
            // InternalSimpleIDL.g:2554:1: ( ';' )
            // InternalSimpleIDL.g:2555:2: ';'
            {
             before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_9_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_9_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_9__5__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_10__0"
    // InternalSimpleIDL.g:2565:1: rule__NamedDefinition__Group_10__0 : rule__NamedDefinition__Group_10__0__Impl rule__NamedDefinition__Group_10__1 ;
    public final void rule__NamedDefinition__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2569:1: ( rule__NamedDefinition__Group_10__0__Impl rule__NamedDefinition__Group_10__1 )
            // InternalSimpleIDL.g:2570:2: rule__NamedDefinition__Group_10__0__Impl rule__NamedDefinition__Group_10__1
            {
            pushFollow(FOLLOW_24);
            rule__NamedDefinition__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_10__0"


    // $ANTLR start "rule__NamedDefinition__Group_10__0__Impl"
    // InternalSimpleIDL.g:2577:1: rule__NamedDefinition__Group_10__0__Impl : ( () ) ;
    public final void rule__NamedDefinition__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2581:1: ( ( () ) )
            // InternalSimpleIDL.g:2582:1: ( () )
            {
            // InternalSimpleIDL.g:2582:1: ( () )
            // InternalSimpleIDL.g:2583:2: ()
            {
             before(grammarAccess.getNamedDefinitionAccess().getUnsignedLongLongIntAction_10_0()); 
            // InternalSimpleIDL.g:2584:2: ()
            // InternalSimpleIDL.g:2584:3: 
            {
            }

             after(grammarAccess.getNamedDefinitionAccess().getUnsignedLongLongIntAction_10_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_10__0__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_10__1"
    // InternalSimpleIDL.g:2592:1: rule__NamedDefinition__Group_10__1 : rule__NamedDefinition__Group_10__1__Impl rule__NamedDefinition__Group_10__2 ;
    public final void rule__NamedDefinition__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2596:1: ( rule__NamedDefinition__Group_10__1__Impl rule__NamedDefinition__Group_10__2 )
            // InternalSimpleIDL.g:2597:2: rule__NamedDefinition__Group_10__1__Impl rule__NamedDefinition__Group_10__2
            {
            pushFollow(FOLLOW_16);
            rule__NamedDefinition__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_10__1"


    // $ANTLR start "rule__NamedDefinition__Group_10__1__Impl"
    // InternalSimpleIDL.g:2604:1: rule__NamedDefinition__Group_10__1__Impl : ( 'typedef' ) ;
    public final void rule__NamedDefinition__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2608:1: ( ( 'typedef' ) )
            // InternalSimpleIDL.g:2609:1: ( 'typedef' )
            {
            // InternalSimpleIDL.g:2609:1: ( 'typedef' )
            // InternalSimpleIDL.g:2610:2: 'typedef'
            {
             before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_10_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_10__1__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_10__2"
    // InternalSimpleIDL.g:2619:1: rule__NamedDefinition__Group_10__2 : rule__NamedDefinition__Group_10__2__Impl rule__NamedDefinition__Group_10__3 ;
    public final void rule__NamedDefinition__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2623:1: ( rule__NamedDefinition__Group_10__2__Impl rule__NamedDefinition__Group_10__3 )
            // InternalSimpleIDL.g:2624:2: rule__NamedDefinition__Group_10__2__Impl rule__NamedDefinition__Group_10__3
            {
            pushFollow(FOLLOW_28);
            rule__NamedDefinition__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_10__2"


    // $ANTLR start "rule__NamedDefinition__Group_10__2__Impl"
    // InternalSimpleIDL.g:2631:1: rule__NamedDefinition__Group_10__2__Impl : ( 'unsigned' ) ;
    public final void rule__NamedDefinition__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2635:1: ( ( 'unsigned' ) )
            // InternalSimpleIDL.g:2636:1: ( 'unsigned' )
            {
            // InternalSimpleIDL.g:2636:1: ( 'unsigned' )
            // InternalSimpleIDL.g:2637:2: 'unsigned'
            {
             before(grammarAccess.getNamedDefinitionAccess().getUnsignedKeyword_10_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getUnsignedKeyword_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_10__2__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_10__3"
    // InternalSimpleIDL.g:2646:1: rule__NamedDefinition__Group_10__3 : rule__NamedDefinition__Group_10__3__Impl rule__NamedDefinition__Group_10__4 ;
    public final void rule__NamedDefinition__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2650:1: ( rule__NamedDefinition__Group_10__3__Impl rule__NamedDefinition__Group_10__4 )
            // InternalSimpleIDL.g:2651:2: rule__NamedDefinition__Group_10__3__Impl rule__NamedDefinition__Group_10__4
            {
            pushFollow(FOLLOW_28);
            rule__NamedDefinition__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_10__3"


    // $ANTLR start "rule__NamedDefinition__Group_10__3__Impl"
    // InternalSimpleIDL.g:2658:1: rule__NamedDefinition__Group_10__3__Impl : ( 'long' ) ;
    public final void rule__NamedDefinition__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2662:1: ( ( 'long' ) )
            // InternalSimpleIDL.g:2663:1: ( 'long' )
            {
            // InternalSimpleIDL.g:2663:1: ( 'long' )
            // InternalSimpleIDL.g:2664:2: 'long'
            {
             before(grammarAccess.getNamedDefinitionAccess().getLongKeyword_10_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getLongKeyword_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_10__3__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_10__4"
    // InternalSimpleIDL.g:2673:1: rule__NamedDefinition__Group_10__4 : rule__NamedDefinition__Group_10__4__Impl rule__NamedDefinition__Group_10__5 ;
    public final void rule__NamedDefinition__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2677:1: ( rule__NamedDefinition__Group_10__4__Impl rule__NamedDefinition__Group_10__5 )
            // InternalSimpleIDL.g:2678:2: rule__NamedDefinition__Group_10__4__Impl rule__NamedDefinition__Group_10__5
            {
            pushFollow(FOLLOW_5);
            rule__NamedDefinition__Group_10__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_10__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_10__4"


    // $ANTLR start "rule__NamedDefinition__Group_10__4__Impl"
    // InternalSimpleIDL.g:2685:1: rule__NamedDefinition__Group_10__4__Impl : ( 'long' ) ;
    public final void rule__NamedDefinition__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2689:1: ( ( 'long' ) )
            // InternalSimpleIDL.g:2690:1: ( 'long' )
            {
            // InternalSimpleIDL.g:2690:1: ( 'long' )
            // InternalSimpleIDL.g:2691:2: 'long'
            {
             before(grammarAccess.getNamedDefinitionAccess().getLongKeyword_10_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getLongKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_10__4__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_10__5"
    // InternalSimpleIDL.g:2700:1: rule__NamedDefinition__Group_10__5 : rule__NamedDefinition__Group_10__5__Impl rule__NamedDefinition__Group_10__6 ;
    public final void rule__NamedDefinition__Group_10__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2704:1: ( rule__NamedDefinition__Group_10__5__Impl rule__NamedDefinition__Group_10__6 )
            // InternalSimpleIDL.g:2705:2: rule__NamedDefinition__Group_10__5__Impl rule__NamedDefinition__Group_10__6
            {
            pushFollow(FOLLOW_6);
            rule__NamedDefinition__Group_10__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_10__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_10__5"


    // $ANTLR start "rule__NamedDefinition__Group_10__5__Impl"
    // InternalSimpleIDL.g:2712:1: rule__NamedDefinition__Group_10__5__Impl : ( ( rule__NamedDefinition__NameAssignment_10_5 ) ) ;
    public final void rule__NamedDefinition__Group_10__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2716:1: ( ( ( rule__NamedDefinition__NameAssignment_10_5 ) ) )
            // InternalSimpleIDL.g:2717:1: ( ( rule__NamedDefinition__NameAssignment_10_5 ) )
            {
            // InternalSimpleIDL.g:2717:1: ( ( rule__NamedDefinition__NameAssignment_10_5 ) )
            // InternalSimpleIDL.g:2718:2: ( rule__NamedDefinition__NameAssignment_10_5 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_10_5()); 
            // InternalSimpleIDL.g:2719:2: ( rule__NamedDefinition__NameAssignment_10_5 )
            // InternalSimpleIDL.g:2719:3: rule__NamedDefinition__NameAssignment_10_5
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__NameAssignment_10_5();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_10_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_10__5__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_10__6"
    // InternalSimpleIDL.g:2727:1: rule__NamedDefinition__Group_10__6 : rule__NamedDefinition__Group_10__6__Impl ;
    public final void rule__NamedDefinition__Group_10__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2731:1: ( rule__NamedDefinition__Group_10__6__Impl )
            // InternalSimpleIDL.g:2732:2: rule__NamedDefinition__Group_10__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_10__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_10__6"


    // $ANTLR start "rule__NamedDefinition__Group_10__6__Impl"
    // InternalSimpleIDL.g:2738:1: rule__NamedDefinition__Group_10__6__Impl : ( ';' ) ;
    public final void rule__NamedDefinition__Group_10__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2742:1: ( ( ';' ) )
            // InternalSimpleIDL.g:2743:1: ( ';' )
            {
            // InternalSimpleIDL.g:2743:1: ( ';' )
            // InternalSimpleIDL.g:2744:2: ';'
            {
             before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_10_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_10_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_10__6__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_11__0"
    // InternalSimpleIDL.g:2754:1: rule__NamedDefinition__Group_11__0 : rule__NamedDefinition__Group_11__0__Impl rule__NamedDefinition__Group_11__1 ;
    public final void rule__NamedDefinition__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2758:1: ( rule__NamedDefinition__Group_11__0__Impl rule__NamedDefinition__Group_11__1 )
            // InternalSimpleIDL.g:2759:2: rule__NamedDefinition__Group_11__0__Impl rule__NamedDefinition__Group_11__1
            {
            pushFollow(FOLLOW_24);
            rule__NamedDefinition__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_11__0"


    // $ANTLR start "rule__NamedDefinition__Group_11__0__Impl"
    // InternalSimpleIDL.g:2766:1: rule__NamedDefinition__Group_11__0__Impl : ( () ) ;
    public final void rule__NamedDefinition__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2770:1: ( ( () ) )
            // InternalSimpleIDL.g:2771:1: ( () )
            {
            // InternalSimpleIDL.g:2771:1: ( () )
            // InternalSimpleIDL.g:2772:2: ()
            {
             before(grammarAccess.getNamedDefinitionAccess().getFloatTypeAction_11_0()); 
            // InternalSimpleIDL.g:2773:2: ()
            // InternalSimpleIDL.g:2773:3: 
            {
            }

             after(grammarAccess.getNamedDefinitionAccess().getFloatTypeAction_11_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_11__0__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_11__1"
    // InternalSimpleIDL.g:2781:1: rule__NamedDefinition__Group_11__1 : rule__NamedDefinition__Group_11__1__Impl rule__NamedDefinition__Group_11__2 ;
    public final void rule__NamedDefinition__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2785:1: ( rule__NamedDefinition__Group_11__1__Impl rule__NamedDefinition__Group_11__2 )
            // InternalSimpleIDL.g:2786:2: rule__NamedDefinition__Group_11__1__Impl rule__NamedDefinition__Group_11__2
            {
            pushFollow(FOLLOW_29);
            rule__NamedDefinition__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_11__1"


    // $ANTLR start "rule__NamedDefinition__Group_11__1__Impl"
    // InternalSimpleIDL.g:2793:1: rule__NamedDefinition__Group_11__1__Impl : ( 'typedef' ) ;
    public final void rule__NamedDefinition__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2797:1: ( ( 'typedef' ) )
            // InternalSimpleIDL.g:2798:1: ( 'typedef' )
            {
            // InternalSimpleIDL.g:2798:1: ( 'typedef' )
            // InternalSimpleIDL.g:2799:2: 'typedef'
            {
             before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_11_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_11__1__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_11__2"
    // InternalSimpleIDL.g:2808:1: rule__NamedDefinition__Group_11__2 : rule__NamedDefinition__Group_11__2__Impl rule__NamedDefinition__Group_11__3 ;
    public final void rule__NamedDefinition__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2812:1: ( rule__NamedDefinition__Group_11__2__Impl rule__NamedDefinition__Group_11__3 )
            // InternalSimpleIDL.g:2813:2: rule__NamedDefinition__Group_11__2__Impl rule__NamedDefinition__Group_11__3
            {
            pushFollow(FOLLOW_5);
            rule__NamedDefinition__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_11__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_11__2"


    // $ANTLR start "rule__NamedDefinition__Group_11__2__Impl"
    // InternalSimpleIDL.g:2820:1: rule__NamedDefinition__Group_11__2__Impl : ( 'float' ) ;
    public final void rule__NamedDefinition__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2824:1: ( ( 'float' ) )
            // InternalSimpleIDL.g:2825:1: ( 'float' )
            {
            // InternalSimpleIDL.g:2825:1: ( 'float' )
            // InternalSimpleIDL.g:2826:2: 'float'
            {
             before(grammarAccess.getNamedDefinitionAccess().getFloatKeyword_11_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getFloatKeyword_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_11__2__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_11__3"
    // InternalSimpleIDL.g:2835:1: rule__NamedDefinition__Group_11__3 : rule__NamedDefinition__Group_11__3__Impl rule__NamedDefinition__Group_11__4 ;
    public final void rule__NamedDefinition__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2839:1: ( rule__NamedDefinition__Group_11__3__Impl rule__NamedDefinition__Group_11__4 )
            // InternalSimpleIDL.g:2840:2: rule__NamedDefinition__Group_11__3__Impl rule__NamedDefinition__Group_11__4
            {
            pushFollow(FOLLOW_6);
            rule__NamedDefinition__Group_11__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_11__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_11__3"


    // $ANTLR start "rule__NamedDefinition__Group_11__3__Impl"
    // InternalSimpleIDL.g:2847:1: rule__NamedDefinition__Group_11__3__Impl : ( ( rule__NamedDefinition__NameAssignment_11_3 ) ) ;
    public final void rule__NamedDefinition__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2851:1: ( ( ( rule__NamedDefinition__NameAssignment_11_3 ) ) )
            // InternalSimpleIDL.g:2852:1: ( ( rule__NamedDefinition__NameAssignment_11_3 ) )
            {
            // InternalSimpleIDL.g:2852:1: ( ( rule__NamedDefinition__NameAssignment_11_3 ) )
            // InternalSimpleIDL.g:2853:2: ( rule__NamedDefinition__NameAssignment_11_3 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_11_3()); 
            // InternalSimpleIDL.g:2854:2: ( rule__NamedDefinition__NameAssignment_11_3 )
            // InternalSimpleIDL.g:2854:3: rule__NamedDefinition__NameAssignment_11_3
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__NameAssignment_11_3();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_11__3__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_11__4"
    // InternalSimpleIDL.g:2862:1: rule__NamedDefinition__Group_11__4 : rule__NamedDefinition__Group_11__4__Impl ;
    public final void rule__NamedDefinition__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2866:1: ( rule__NamedDefinition__Group_11__4__Impl )
            // InternalSimpleIDL.g:2867:2: rule__NamedDefinition__Group_11__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_11__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_11__4"


    // $ANTLR start "rule__NamedDefinition__Group_11__4__Impl"
    // InternalSimpleIDL.g:2873:1: rule__NamedDefinition__Group_11__4__Impl : ( ';' ) ;
    public final void rule__NamedDefinition__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2877:1: ( ( ';' ) )
            // InternalSimpleIDL.g:2878:1: ( ';' )
            {
            // InternalSimpleIDL.g:2878:1: ( ';' )
            // InternalSimpleIDL.g:2879:2: ';'
            {
             before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_11_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_11_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_11__4__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_12__0"
    // InternalSimpleIDL.g:2889:1: rule__NamedDefinition__Group_12__0 : rule__NamedDefinition__Group_12__0__Impl rule__NamedDefinition__Group_12__1 ;
    public final void rule__NamedDefinition__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2893:1: ( rule__NamedDefinition__Group_12__0__Impl rule__NamedDefinition__Group_12__1 )
            // InternalSimpleIDL.g:2894:2: rule__NamedDefinition__Group_12__0__Impl rule__NamedDefinition__Group_12__1
            {
            pushFollow(FOLLOW_24);
            rule__NamedDefinition__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_12__0"


    // $ANTLR start "rule__NamedDefinition__Group_12__0__Impl"
    // InternalSimpleIDL.g:2901:1: rule__NamedDefinition__Group_12__0__Impl : ( () ) ;
    public final void rule__NamedDefinition__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2905:1: ( ( () ) )
            // InternalSimpleIDL.g:2906:1: ( () )
            {
            // InternalSimpleIDL.g:2906:1: ( () )
            // InternalSimpleIDL.g:2907:2: ()
            {
             before(grammarAccess.getNamedDefinitionAccess().getDoubleTypeAction_12_0()); 
            // InternalSimpleIDL.g:2908:2: ()
            // InternalSimpleIDL.g:2908:3: 
            {
            }

             after(grammarAccess.getNamedDefinitionAccess().getDoubleTypeAction_12_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_12__0__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_12__1"
    // InternalSimpleIDL.g:2916:1: rule__NamedDefinition__Group_12__1 : rule__NamedDefinition__Group_12__1__Impl rule__NamedDefinition__Group_12__2 ;
    public final void rule__NamedDefinition__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2920:1: ( rule__NamedDefinition__Group_12__1__Impl rule__NamedDefinition__Group_12__2 )
            // InternalSimpleIDL.g:2921:2: rule__NamedDefinition__Group_12__1__Impl rule__NamedDefinition__Group_12__2
            {
            pushFollow(FOLLOW_30);
            rule__NamedDefinition__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_12__1"


    // $ANTLR start "rule__NamedDefinition__Group_12__1__Impl"
    // InternalSimpleIDL.g:2928:1: rule__NamedDefinition__Group_12__1__Impl : ( 'typedef' ) ;
    public final void rule__NamedDefinition__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2932:1: ( ( 'typedef' ) )
            // InternalSimpleIDL.g:2933:1: ( 'typedef' )
            {
            // InternalSimpleIDL.g:2933:1: ( 'typedef' )
            // InternalSimpleIDL.g:2934:2: 'typedef'
            {
             before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_12_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_12__1__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_12__2"
    // InternalSimpleIDL.g:2943:1: rule__NamedDefinition__Group_12__2 : rule__NamedDefinition__Group_12__2__Impl rule__NamedDefinition__Group_12__3 ;
    public final void rule__NamedDefinition__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2947:1: ( rule__NamedDefinition__Group_12__2__Impl rule__NamedDefinition__Group_12__3 )
            // InternalSimpleIDL.g:2948:2: rule__NamedDefinition__Group_12__2__Impl rule__NamedDefinition__Group_12__3
            {
            pushFollow(FOLLOW_5);
            rule__NamedDefinition__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_12__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_12__2"


    // $ANTLR start "rule__NamedDefinition__Group_12__2__Impl"
    // InternalSimpleIDL.g:2955:1: rule__NamedDefinition__Group_12__2__Impl : ( 'double' ) ;
    public final void rule__NamedDefinition__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2959:1: ( ( 'double' ) )
            // InternalSimpleIDL.g:2960:1: ( 'double' )
            {
            // InternalSimpleIDL.g:2960:1: ( 'double' )
            // InternalSimpleIDL.g:2961:2: 'double'
            {
             before(grammarAccess.getNamedDefinitionAccess().getDoubleKeyword_12_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getDoubleKeyword_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_12__2__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_12__3"
    // InternalSimpleIDL.g:2970:1: rule__NamedDefinition__Group_12__3 : rule__NamedDefinition__Group_12__3__Impl rule__NamedDefinition__Group_12__4 ;
    public final void rule__NamedDefinition__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2974:1: ( rule__NamedDefinition__Group_12__3__Impl rule__NamedDefinition__Group_12__4 )
            // InternalSimpleIDL.g:2975:2: rule__NamedDefinition__Group_12__3__Impl rule__NamedDefinition__Group_12__4
            {
            pushFollow(FOLLOW_6);
            rule__NamedDefinition__Group_12__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_12__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_12__3"


    // $ANTLR start "rule__NamedDefinition__Group_12__3__Impl"
    // InternalSimpleIDL.g:2982:1: rule__NamedDefinition__Group_12__3__Impl : ( ( rule__NamedDefinition__NameAssignment_12_3 ) ) ;
    public final void rule__NamedDefinition__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2986:1: ( ( ( rule__NamedDefinition__NameAssignment_12_3 ) ) )
            // InternalSimpleIDL.g:2987:1: ( ( rule__NamedDefinition__NameAssignment_12_3 ) )
            {
            // InternalSimpleIDL.g:2987:1: ( ( rule__NamedDefinition__NameAssignment_12_3 ) )
            // InternalSimpleIDL.g:2988:2: ( rule__NamedDefinition__NameAssignment_12_3 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_12_3()); 
            // InternalSimpleIDL.g:2989:2: ( rule__NamedDefinition__NameAssignment_12_3 )
            // InternalSimpleIDL.g:2989:3: rule__NamedDefinition__NameAssignment_12_3
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__NameAssignment_12_3();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_12_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_12__3__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_12__4"
    // InternalSimpleIDL.g:2997:1: rule__NamedDefinition__Group_12__4 : rule__NamedDefinition__Group_12__4__Impl ;
    public final void rule__NamedDefinition__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3001:1: ( rule__NamedDefinition__Group_12__4__Impl )
            // InternalSimpleIDL.g:3002:2: rule__NamedDefinition__Group_12__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_12__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_12__4"


    // $ANTLR start "rule__NamedDefinition__Group_12__4__Impl"
    // InternalSimpleIDL.g:3008:1: rule__NamedDefinition__Group_12__4__Impl : ( ';' ) ;
    public final void rule__NamedDefinition__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3012:1: ( ( ';' ) )
            // InternalSimpleIDL.g:3013:1: ( ';' )
            {
            // InternalSimpleIDL.g:3013:1: ( ';' )
            // InternalSimpleIDL.g:3014:2: ';'
            {
             before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_12_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_12_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_12__4__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_13__0"
    // InternalSimpleIDL.g:3024:1: rule__NamedDefinition__Group_13__0 : rule__NamedDefinition__Group_13__0__Impl rule__NamedDefinition__Group_13__1 ;
    public final void rule__NamedDefinition__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3028:1: ( rule__NamedDefinition__Group_13__0__Impl rule__NamedDefinition__Group_13__1 )
            // InternalSimpleIDL.g:3029:2: rule__NamedDefinition__Group_13__0__Impl rule__NamedDefinition__Group_13__1
            {
            pushFollow(FOLLOW_24);
            rule__NamedDefinition__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_13__0"


    // $ANTLR start "rule__NamedDefinition__Group_13__0__Impl"
    // InternalSimpleIDL.g:3036:1: rule__NamedDefinition__Group_13__0__Impl : ( () ) ;
    public final void rule__NamedDefinition__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3040:1: ( ( () ) )
            // InternalSimpleIDL.g:3041:1: ( () )
            {
            // InternalSimpleIDL.g:3041:1: ( () )
            // InternalSimpleIDL.g:3042:2: ()
            {
             before(grammarAccess.getNamedDefinitionAccess().getLongDoubleTypeAction_13_0()); 
            // InternalSimpleIDL.g:3043:2: ()
            // InternalSimpleIDL.g:3043:3: 
            {
            }

             after(grammarAccess.getNamedDefinitionAccess().getLongDoubleTypeAction_13_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_13__0__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_13__1"
    // InternalSimpleIDL.g:3051:1: rule__NamedDefinition__Group_13__1 : rule__NamedDefinition__Group_13__1__Impl rule__NamedDefinition__Group_13__2 ;
    public final void rule__NamedDefinition__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3055:1: ( rule__NamedDefinition__Group_13__1__Impl rule__NamedDefinition__Group_13__2 )
            // InternalSimpleIDL.g:3056:2: rule__NamedDefinition__Group_13__1__Impl rule__NamedDefinition__Group_13__2
            {
            pushFollow(FOLLOW_28);
            rule__NamedDefinition__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_13__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_13__1"


    // $ANTLR start "rule__NamedDefinition__Group_13__1__Impl"
    // InternalSimpleIDL.g:3063:1: rule__NamedDefinition__Group_13__1__Impl : ( 'typedef' ) ;
    public final void rule__NamedDefinition__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3067:1: ( ( 'typedef' ) )
            // InternalSimpleIDL.g:3068:1: ( 'typedef' )
            {
            // InternalSimpleIDL.g:3068:1: ( 'typedef' )
            // InternalSimpleIDL.g:3069:2: 'typedef'
            {
             before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_13_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_13__1__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_13__2"
    // InternalSimpleIDL.g:3078:1: rule__NamedDefinition__Group_13__2 : rule__NamedDefinition__Group_13__2__Impl rule__NamedDefinition__Group_13__3 ;
    public final void rule__NamedDefinition__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3082:1: ( rule__NamedDefinition__Group_13__2__Impl rule__NamedDefinition__Group_13__3 )
            // InternalSimpleIDL.g:3083:2: rule__NamedDefinition__Group_13__2__Impl rule__NamedDefinition__Group_13__3
            {
            pushFollow(FOLLOW_30);
            rule__NamedDefinition__Group_13__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_13__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_13__2"


    // $ANTLR start "rule__NamedDefinition__Group_13__2__Impl"
    // InternalSimpleIDL.g:3090:1: rule__NamedDefinition__Group_13__2__Impl : ( 'long' ) ;
    public final void rule__NamedDefinition__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3094:1: ( ( 'long' ) )
            // InternalSimpleIDL.g:3095:1: ( 'long' )
            {
            // InternalSimpleIDL.g:3095:1: ( 'long' )
            // InternalSimpleIDL.g:3096:2: 'long'
            {
             before(grammarAccess.getNamedDefinitionAccess().getLongKeyword_13_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getLongKeyword_13_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_13__2__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_13__3"
    // InternalSimpleIDL.g:3105:1: rule__NamedDefinition__Group_13__3 : rule__NamedDefinition__Group_13__3__Impl rule__NamedDefinition__Group_13__4 ;
    public final void rule__NamedDefinition__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3109:1: ( rule__NamedDefinition__Group_13__3__Impl rule__NamedDefinition__Group_13__4 )
            // InternalSimpleIDL.g:3110:2: rule__NamedDefinition__Group_13__3__Impl rule__NamedDefinition__Group_13__4
            {
            pushFollow(FOLLOW_5);
            rule__NamedDefinition__Group_13__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_13__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_13__3"


    // $ANTLR start "rule__NamedDefinition__Group_13__3__Impl"
    // InternalSimpleIDL.g:3117:1: rule__NamedDefinition__Group_13__3__Impl : ( 'double' ) ;
    public final void rule__NamedDefinition__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3121:1: ( ( 'double' ) )
            // InternalSimpleIDL.g:3122:1: ( 'double' )
            {
            // InternalSimpleIDL.g:3122:1: ( 'double' )
            // InternalSimpleIDL.g:3123:2: 'double'
            {
             before(grammarAccess.getNamedDefinitionAccess().getDoubleKeyword_13_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getDoubleKeyword_13_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_13__3__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_13__4"
    // InternalSimpleIDL.g:3132:1: rule__NamedDefinition__Group_13__4 : rule__NamedDefinition__Group_13__4__Impl rule__NamedDefinition__Group_13__5 ;
    public final void rule__NamedDefinition__Group_13__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3136:1: ( rule__NamedDefinition__Group_13__4__Impl rule__NamedDefinition__Group_13__5 )
            // InternalSimpleIDL.g:3137:2: rule__NamedDefinition__Group_13__4__Impl rule__NamedDefinition__Group_13__5
            {
            pushFollow(FOLLOW_6);
            rule__NamedDefinition__Group_13__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_13__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_13__4"


    // $ANTLR start "rule__NamedDefinition__Group_13__4__Impl"
    // InternalSimpleIDL.g:3144:1: rule__NamedDefinition__Group_13__4__Impl : ( ( rule__NamedDefinition__NameAssignment_13_4 ) ) ;
    public final void rule__NamedDefinition__Group_13__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3148:1: ( ( ( rule__NamedDefinition__NameAssignment_13_4 ) ) )
            // InternalSimpleIDL.g:3149:1: ( ( rule__NamedDefinition__NameAssignment_13_4 ) )
            {
            // InternalSimpleIDL.g:3149:1: ( ( rule__NamedDefinition__NameAssignment_13_4 ) )
            // InternalSimpleIDL.g:3150:2: ( rule__NamedDefinition__NameAssignment_13_4 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_13_4()); 
            // InternalSimpleIDL.g:3151:2: ( rule__NamedDefinition__NameAssignment_13_4 )
            // InternalSimpleIDL.g:3151:3: rule__NamedDefinition__NameAssignment_13_4
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__NameAssignment_13_4();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_13_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_13__4__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_13__5"
    // InternalSimpleIDL.g:3159:1: rule__NamedDefinition__Group_13__5 : rule__NamedDefinition__Group_13__5__Impl ;
    public final void rule__NamedDefinition__Group_13__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3163:1: ( rule__NamedDefinition__Group_13__5__Impl )
            // InternalSimpleIDL.g:3164:2: rule__NamedDefinition__Group_13__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_13__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_13__5"


    // $ANTLR start "rule__NamedDefinition__Group_13__5__Impl"
    // InternalSimpleIDL.g:3170:1: rule__NamedDefinition__Group_13__5__Impl : ( ';' ) ;
    public final void rule__NamedDefinition__Group_13__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3174:1: ( ( ';' ) )
            // InternalSimpleIDL.g:3175:1: ( ';' )
            {
            // InternalSimpleIDL.g:3175:1: ( ';' )
            // InternalSimpleIDL.g:3176:2: ';'
            {
             before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_13_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_13_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_13__5__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_14__0"
    // InternalSimpleIDL.g:3186:1: rule__NamedDefinition__Group_14__0 : rule__NamedDefinition__Group_14__0__Impl rule__NamedDefinition__Group_14__1 ;
    public final void rule__NamedDefinition__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3190:1: ( rule__NamedDefinition__Group_14__0__Impl rule__NamedDefinition__Group_14__1 )
            // InternalSimpleIDL.g:3191:2: rule__NamedDefinition__Group_14__0__Impl rule__NamedDefinition__Group_14__1
            {
            pushFollow(FOLLOW_24);
            rule__NamedDefinition__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_14__0"


    // $ANTLR start "rule__NamedDefinition__Group_14__0__Impl"
    // InternalSimpleIDL.g:3198:1: rule__NamedDefinition__Group_14__0__Impl : ( () ) ;
    public final void rule__NamedDefinition__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3202:1: ( ( () ) )
            // InternalSimpleIDL.g:3203:1: ( () )
            {
            // InternalSimpleIDL.g:3203:1: ( () )
            // InternalSimpleIDL.g:3204:2: ()
            {
             before(grammarAccess.getNamedDefinitionAccess().getCharTypeAction_14_0()); 
            // InternalSimpleIDL.g:3205:2: ()
            // InternalSimpleIDL.g:3205:3: 
            {
            }

             after(grammarAccess.getNamedDefinitionAccess().getCharTypeAction_14_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_14__0__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_14__1"
    // InternalSimpleIDL.g:3213:1: rule__NamedDefinition__Group_14__1 : rule__NamedDefinition__Group_14__1__Impl rule__NamedDefinition__Group_14__2 ;
    public final void rule__NamedDefinition__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3217:1: ( rule__NamedDefinition__Group_14__1__Impl rule__NamedDefinition__Group_14__2 )
            // InternalSimpleIDL.g:3218:2: rule__NamedDefinition__Group_14__1__Impl rule__NamedDefinition__Group_14__2
            {
            pushFollow(FOLLOW_31);
            rule__NamedDefinition__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_14__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_14__1"


    // $ANTLR start "rule__NamedDefinition__Group_14__1__Impl"
    // InternalSimpleIDL.g:3225:1: rule__NamedDefinition__Group_14__1__Impl : ( 'typedef' ) ;
    public final void rule__NamedDefinition__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3229:1: ( ( 'typedef' ) )
            // InternalSimpleIDL.g:3230:1: ( 'typedef' )
            {
            // InternalSimpleIDL.g:3230:1: ( 'typedef' )
            // InternalSimpleIDL.g:3231:2: 'typedef'
            {
             before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_14_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_14__1__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_14__2"
    // InternalSimpleIDL.g:3240:1: rule__NamedDefinition__Group_14__2 : rule__NamedDefinition__Group_14__2__Impl rule__NamedDefinition__Group_14__3 ;
    public final void rule__NamedDefinition__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3244:1: ( rule__NamedDefinition__Group_14__2__Impl rule__NamedDefinition__Group_14__3 )
            // InternalSimpleIDL.g:3245:2: rule__NamedDefinition__Group_14__2__Impl rule__NamedDefinition__Group_14__3
            {
            pushFollow(FOLLOW_5);
            rule__NamedDefinition__Group_14__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_14__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_14__2"


    // $ANTLR start "rule__NamedDefinition__Group_14__2__Impl"
    // InternalSimpleIDL.g:3252:1: rule__NamedDefinition__Group_14__2__Impl : ( 'char' ) ;
    public final void rule__NamedDefinition__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3256:1: ( ( 'char' ) )
            // InternalSimpleIDL.g:3257:1: ( 'char' )
            {
            // InternalSimpleIDL.g:3257:1: ( 'char' )
            // InternalSimpleIDL.g:3258:2: 'char'
            {
             before(grammarAccess.getNamedDefinitionAccess().getCharKeyword_14_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getCharKeyword_14_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_14__2__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_14__3"
    // InternalSimpleIDL.g:3267:1: rule__NamedDefinition__Group_14__3 : rule__NamedDefinition__Group_14__3__Impl rule__NamedDefinition__Group_14__4 ;
    public final void rule__NamedDefinition__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3271:1: ( rule__NamedDefinition__Group_14__3__Impl rule__NamedDefinition__Group_14__4 )
            // InternalSimpleIDL.g:3272:2: rule__NamedDefinition__Group_14__3__Impl rule__NamedDefinition__Group_14__4
            {
            pushFollow(FOLLOW_6);
            rule__NamedDefinition__Group_14__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_14__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_14__3"


    // $ANTLR start "rule__NamedDefinition__Group_14__3__Impl"
    // InternalSimpleIDL.g:3279:1: rule__NamedDefinition__Group_14__3__Impl : ( ( rule__NamedDefinition__NameAssignment_14_3 ) ) ;
    public final void rule__NamedDefinition__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3283:1: ( ( ( rule__NamedDefinition__NameAssignment_14_3 ) ) )
            // InternalSimpleIDL.g:3284:1: ( ( rule__NamedDefinition__NameAssignment_14_3 ) )
            {
            // InternalSimpleIDL.g:3284:1: ( ( rule__NamedDefinition__NameAssignment_14_3 ) )
            // InternalSimpleIDL.g:3285:2: ( rule__NamedDefinition__NameAssignment_14_3 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_14_3()); 
            // InternalSimpleIDL.g:3286:2: ( rule__NamedDefinition__NameAssignment_14_3 )
            // InternalSimpleIDL.g:3286:3: rule__NamedDefinition__NameAssignment_14_3
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__NameAssignment_14_3();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_14_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_14__3__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_14__4"
    // InternalSimpleIDL.g:3294:1: rule__NamedDefinition__Group_14__4 : rule__NamedDefinition__Group_14__4__Impl ;
    public final void rule__NamedDefinition__Group_14__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3298:1: ( rule__NamedDefinition__Group_14__4__Impl )
            // InternalSimpleIDL.g:3299:2: rule__NamedDefinition__Group_14__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_14__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_14__4"


    // $ANTLR start "rule__NamedDefinition__Group_14__4__Impl"
    // InternalSimpleIDL.g:3305:1: rule__NamedDefinition__Group_14__4__Impl : ( ';' ) ;
    public final void rule__NamedDefinition__Group_14__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3309:1: ( ( ';' ) )
            // InternalSimpleIDL.g:3310:1: ( ';' )
            {
            // InternalSimpleIDL.g:3310:1: ( ';' )
            // InternalSimpleIDL.g:3311:2: ';'
            {
             before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_14_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_14_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_14__4__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_15__0"
    // InternalSimpleIDL.g:3321:1: rule__NamedDefinition__Group_15__0 : rule__NamedDefinition__Group_15__0__Impl rule__NamedDefinition__Group_15__1 ;
    public final void rule__NamedDefinition__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3325:1: ( rule__NamedDefinition__Group_15__0__Impl rule__NamedDefinition__Group_15__1 )
            // InternalSimpleIDL.g:3326:2: rule__NamedDefinition__Group_15__0__Impl rule__NamedDefinition__Group_15__1
            {
            pushFollow(FOLLOW_24);
            rule__NamedDefinition__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_15__0"


    // $ANTLR start "rule__NamedDefinition__Group_15__0__Impl"
    // InternalSimpleIDL.g:3333:1: rule__NamedDefinition__Group_15__0__Impl : ( () ) ;
    public final void rule__NamedDefinition__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3337:1: ( ( () ) )
            // InternalSimpleIDL.g:3338:1: ( () )
            {
            // InternalSimpleIDL.g:3338:1: ( () )
            // InternalSimpleIDL.g:3339:2: ()
            {
             before(grammarAccess.getNamedDefinitionAccess().getWideCharTypeAction_15_0()); 
            // InternalSimpleIDL.g:3340:2: ()
            // InternalSimpleIDL.g:3340:3: 
            {
            }

             after(grammarAccess.getNamedDefinitionAccess().getWideCharTypeAction_15_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_15__0__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_15__1"
    // InternalSimpleIDL.g:3348:1: rule__NamedDefinition__Group_15__1 : rule__NamedDefinition__Group_15__1__Impl rule__NamedDefinition__Group_15__2 ;
    public final void rule__NamedDefinition__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3352:1: ( rule__NamedDefinition__Group_15__1__Impl rule__NamedDefinition__Group_15__2 )
            // InternalSimpleIDL.g:3353:2: rule__NamedDefinition__Group_15__1__Impl rule__NamedDefinition__Group_15__2
            {
            pushFollow(FOLLOW_32);
            rule__NamedDefinition__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_15__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_15__1"


    // $ANTLR start "rule__NamedDefinition__Group_15__1__Impl"
    // InternalSimpleIDL.g:3360:1: rule__NamedDefinition__Group_15__1__Impl : ( 'typedef' ) ;
    public final void rule__NamedDefinition__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3364:1: ( ( 'typedef' ) )
            // InternalSimpleIDL.g:3365:1: ( 'typedef' )
            {
            // InternalSimpleIDL.g:3365:1: ( 'typedef' )
            // InternalSimpleIDL.g:3366:2: 'typedef'
            {
             before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_15_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_15__1__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_15__2"
    // InternalSimpleIDL.g:3375:1: rule__NamedDefinition__Group_15__2 : rule__NamedDefinition__Group_15__2__Impl rule__NamedDefinition__Group_15__3 ;
    public final void rule__NamedDefinition__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3379:1: ( rule__NamedDefinition__Group_15__2__Impl rule__NamedDefinition__Group_15__3 )
            // InternalSimpleIDL.g:3380:2: rule__NamedDefinition__Group_15__2__Impl rule__NamedDefinition__Group_15__3
            {
            pushFollow(FOLLOW_5);
            rule__NamedDefinition__Group_15__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_15__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_15__2"


    // $ANTLR start "rule__NamedDefinition__Group_15__2__Impl"
    // InternalSimpleIDL.g:3387:1: rule__NamedDefinition__Group_15__2__Impl : ( 'wchar' ) ;
    public final void rule__NamedDefinition__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3391:1: ( ( 'wchar' ) )
            // InternalSimpleIDL.g:3392:1: ( 'wchar' )
            {
            // InternalSimpleIDL.g:3392:1: ( 'wchar' )
            // InternalSimpleIDL.g:3393:2: 'wchar'
            {
             before(grammarAccess.getNamedDefinitionAccess().getWcharKeyword_15_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getWcharKeyword_15_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_15__2__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_15__3"
    // InternalSimpleIDL.g:3402:1: rule__NamedDefinition__Group_15__3 : rule__NamedDefinition__Group_15__3__Impl rule__NamedDefinition__Group_15__4 ;
    public final void rule__NamedDefinition__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3406:1: ( rule__NamedDefinition__Group_15__3__Impl rule__NamedDefinition__Group_15__4 )
            // InternalSimpleIDL.g:3407:2: rule__NamedDefinition__Group_15__3__Impl rule__NamedDefinition__Group_15__4
            {
            pushFollow(FOLLOW_6);
            rule__NamedDefinition__Group_15__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_15__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_15__3"


    // $ANTLR start "rule__NamedDefinition__Group_15__3__Impl"
    // InternalSimpleIDL.g:3414:1: rule__NamedDefinition__Group_15__3__Impl : ( ( rule__NamedDefinition__NameAssignment_15_3 ) ) ;
    public final void rule__NamedDefinition__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3418:1: ( ( ( rule__NamedDefinition__NameAssignment_15_3 ) ) )
            // InternalSimpleIDL.g:3419:1: ( ( rule__NamedDefinition__NameAssignment_15_3 ) )
            {
            // InternalSimpleIDL.g:3419:1: ( ( rule__NamedDefinition__NameAssignment_15_3 ) )
            // InternalSimpleIDL.g:3420:2: ( rule__NamedDefinition__NameAssignment_15_3 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_15_3()); 
            // InternalSimpleIDL.g:3421:2: ( rule__NamedDefinition__NameAssignment_15_3 )
            // InternalSimpleIDL.g:3421:3: rule__NamedDefinition__NameAssignment_15_3
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__NameAssignment_15_3();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_15_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_15__3__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_15__4"
    // InternalSimpleIDL.g:3429:1: rule__NamedDefinition__Group_15__4 : rule__NamedDefinition__Group_15__4__Impl ;
    public final void rule__NamedDefinition__Group_15__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3433:1: ( rule__NamedDefinition__Group_15__4__Impl )
            // InternalSimpleIDL.g:3434:2: rule__NamedDefinition__Group_15__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_15__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_15__4"


    // $ANTLR start "rule__NamedDefinition__Group_15__4__Impl"
    // InternalSimpleIDL.g:3440:1: rule__NamedDefinition__Group_15__4__Impl : ( ';' ) ;
    public final void rule__NamedDefinition__Group_15__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3444:1: ( ( ';' ) )
            // InternalSimpleIDL.g:3445:1: ( ';' )
            {
            // InternalSimpleIDL.g:3445:1: ( ';' )
            // InternalSimpleIDL.g:3446:2: ';'
            {
             before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_15_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_15_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_15__4__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_16__0"
    // InternalSimpleIDL.g:3456:1: rule__NamedDefinition__Group_16__0 : rule__NamedDefinition__Group_16__0__Impl rule__NamedDefinition__Group_16__1 ;
    public final void rule__NamedDefinition__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3460:1: ( rule__NamedDefinition__Group_16__0__Impl rule__NamedDefinition__Group_16__1 )
            // InternalSimpleIDL.g:3461:2: rule__NamedDefinition__Group_16__0__Impl rule__NamedDefinition__Group_16__1
            {
            pushFollow(FOLLOW_24);
            rule__NamedDefinition__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_16__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_16__0"


    // $ANTLR start "rule__NamedDefinition__Group_16__0__Impl"
    // InternalSimpleIDL.g:3468:1: rule__NamedDefinition__Group_16__0__Impl : ( () ) ;
    public final void rule__NamedDefinition__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3472:1: ( ( () ) )
            // InternalSimpleIDL.g:3473:1: ( () )
            {
            // InternalSimpleIDL.g:3473:1: ( () )
            // InternalSimpleIDL.g:3474:2: ()
            {
             before(grammarAccess.getNamedDefinitionAccess().getBooleanTypeAction_16_0()); 
            // InternalSimpleIDL.g:3475:2: ()
            // InternalSimpleIDL.g:3475:3: 
            {
            }

             after(grammarAccess.getNamedDefinitionAccess().getBooleanTypeAction_16_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_16__0__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_16__1"
    // InternalSimpleIDL.g:3483:1: rule__NamedDefinition__Group_16__1 : rule__NamedDefinition__Group_16__1__Impl rule__NamedDefinition__Group_16__2 ;
    public final void rule__NamedDefinition__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3487:1: ( rule__NamedDefinition__Group_16__1__Impl rule__NamedDefinition__Group_16__2 )
            // InternalSimpleIDL.g:3488:2: rule__NamedDefinition__Group_16__1__Impl rule__NamedDefinition__Group_16__2
            {
            pushFollow(FOLLOW_33);
            rule__NamedDefinition__Group_16__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_16__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_16__1"


    // $ANTLR start "rule__NamedDefinition__Group_16__1__Impl"
    // InternalSimpleIDL.g:3495:1: rule__NamedDefinition__Group_16__1__Impl : ( 'typedef' ) ;
    public final void rule__NamedDefinition__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3499:1: ( ( 'typedef' ) )
            // InternalSimpleIDL.g:3500:1: ( 'typedef' )
            {
            // InternalSimpleIDL.g:3500:1: ( 'typedef' )
            // InternalSimpleIDL.g:3501:2: 'typedef'
            {
             before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_16_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_16__1__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_16__2"
    // InternalSimpleIDL.g:3510:1: rule__NamedDefinition__Group_16__2 : rule__NamedDefinition__Group_16__2__Impl rule__NamedDefinition__Group_16__3 ;
    public final void rule__NamedDefinition__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3514:1: ( rule__NamedDefinition__Group_16__2__Impl rule__NamedDefinition__Group_16__3 )
            // InternalSimpleIDL.g:3515:2: rule__NamedDefinition__Group_16__2__Impl rule__NamedDefinition__Group_16__3
            {
            pushFollow(FOLLOW_5);
            rule__NamedDefinition__Group_16__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_16__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_16__2"


    // $ANTLR start "rule__NamedDefinition__Group_16__2__Impl"
    // InternalSimpleIDL.g:3522:1: rule__NamedDefinition__Group_16__2__Impl : ( 'boolean' ) ;
    public final void rule__NamedDefinition__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3526:1: ( ( 'boolean' ) )
            // InternalSimpleIDL.g:3527:1: ( 'boolean' )
            {
            // InternalSimpleIDL.g:3527:1: ( 'boolean' )
            // InternalSimpleIDL.g:3528:2: 'boolean'
            {
             before(grammarAccess.getNamedDefinitionAccess().getBooleanKeyword_16_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getBooleanKeyword_16_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_16__2__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_16__3"
    // InternalSimpleIDL.g:3537:1: rule__NamedDefinition__Group_16__3 : rule__NamedDefinition__Group_16__3__Impl rule__NamedDefinition__Group_16__4 ;
    public final void rule__NamedDefinition__Group_16__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3541:1: ( rule__NamedDefinition__Group_16__3__Impl rule__NamedDefinition__Group_16__4 )
            // InternalSimpleIDL.g:3542:2: rule__NamedDefinition__Group_16__3__Impl rule__NamedDefinition__Group_16__4
            {
            pushFollow(FOLLOW_6);
            rule__NamedDefinition__Group_16__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_16__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_16__3"


    // $ANTLR start "rule__NamedDefinition__Group_16__3__Impl"
    // InternalSimpleIDL.g:3549:1: rule__NamedDefinition__Group_16__3__Impl : ( ( rule__NamedDefinition__NameAssignment_16_3 ) ) ;
    public final void rule__NamedDefinition__Group_16__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3553:1: ( ( ( rule__NamedDefinition__NameAssignment_16_3 ) ) )
            // InternalSimpleIDL.g:3554:1: ( ( rule__NamedDefinition__NameAssignment_16_3 ) )
            {
            // InternalSimpleIDL.g:3554:1: ( ( rule__NamedDefinition__NameAssignment_16_3 ) )
            // InternalSimpleIDL.g:3555:2: ( rule__NamedDefinition__NameAssignment_16_3 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_16_3()); 
            // InternalSimpleIDL.g:3556:2: ( rule__NamedDefinition__NameAssignment_16_3 )
            // InternalSimpleIDL.g:3556:3: rule__NamedDefinition__NameAssignment_16_3
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__NameAssignment_16_3();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_16_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_16__3__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_16__4"
    // InternalSimpleIDL.g:3564:1: rule__NamedDefinition__Group_16__4 : rule__NamedDefinition__Group_16__4__Impl ;
    public final void rule__NamedDefinition__Group_16__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3568:1: ( rule__NamedDefinition__Group_16__4__Impl )
            // InternalSimpleIDL.g:3569:2: rule__NamedDefinition__Group_16__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_16__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_16__4"


    // $ANTLR start "rule__NamedDefinition__Group_16__4__Impl"
    // InternalSimpleIDL.g:3575:1: rule__NamedDefinition__Group_16__4__Impl : ( ';' ) ;
    public final void rule__NamedDefinition__Group_16__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3579:1: ( ( ';' ) )
            // InternalSimpleIDL.g:3580:1: ( ';' )
            {
            // InternalSimpleIDL.g:3580:1: ( ';' )
            // InternalSimpleIDL.g:3581:2: ';'
            {
             before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_16_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_16_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_16__4__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_17__0"
    // InternalSimpleIDL.g:3591:1: rule__NamedDefinition__Group_17__0 : rule__NamedDefinition__Group_17__0__Impl rule__NamedDefinition__Group_17__1 ;
    public final void rule__NamedDefinition__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3595:1: ( rule__NamedDefinition__Group_17__0__Impl rule__NamedDefinition__Group_17__1 )
            // InternalSimpleIDL.g:3596:2: rule__NamedDefinition__Group_17__0__Impl rule__NamedDefinition__Group_17__1
            {
            pushFollow(FOLLOW_24);
            rule__NamedDefinition__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_17__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_17__0"


    // $ANTLR start "rule__NamedDefinition__Group_17__0__Impl"
    // InternalSimpleIDL.g:3603:1: rule__NamedDefinition__Group_17__0__Impl : ( () ) ;
    public final void rule__NamedDefinition__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3607:1: ( ( () ) )
            // InternalSimpleIDL.g:3608:1: ( () )
            {
            // InternalSimpleIDL.g:3608:1: ( () )
            // InternalSimpleIDL.g:3609:2: ()
            {
             before(grammarAccess.getNamedDefinitionAccess().getOctetTypeAction_17_0()); 
            // InternalSimpleIDL.g:3610:2: ()
            // InternalSimpleIDL.g:3610:3: 
            {
            }

             after(grammarAccess.getNamedDefinitionAccess().getOctetTypeAction_17_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_17__0__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_17__1"
    // InternalSimpleIDL.g:3618:1: rule__NamedDefinition__Group_17__1 : rule__NamedDefinition__Group_17__1__Impl rule__NamedDefinition__Group_17__2 ;
    public final void rule__NamedDefinition__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3622:1: ( rule__NamedDefinition__Group_17__1__Impl rule__NamedDefinition__Group_17__2 )
            // InternalSimpleIDL.g:3623:2: rule__NamedDefinition__Group_17__1__Impl rule__NamedDefinition__Group_17__2
            {
            pushFollow(FOLLOW_34);
            rule__NamedDefinition__Group_17__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_17__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_17__1"


    // $ANTLR start "rule__NamedDefinition__Group_17__1__Impl"
    // InternalSimpleIDL.g:3630:1: rule__NamedDefinition__Group_17__1__Impl : ( 'typedef' ) ;
    public final void rule__NamedDefinition__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3634:1: ( ( 'typedef' ) )
            // InternalSimpleIDL.g:3635:1: ( 'typedef' )
            {
            // InternalSimpleIDL.g:3635:1: ( 'typedef' )
            // InternalSimpleIDL.g:3636:2: 'typedef'
            {
             before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_17_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_17_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_17__1__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_17__2"
    // InternalSimpleIDL.g:3645:1: rule__NamedDefinition__Group_17__2 : rule__NamedDefinition__Group_17__2__Impl rule__NamedDefinition__Group_17__3 ;
    public final void rule__NamedDefinition__Group_17__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3649:1: ( rule__NamedDefinition__Group_17__2__Impl rule__NamedDefinition__Group_17__3 )
            // InternalSimpleIDL.g:3650:2: rule__NamedDefinition__Group_17__2__Impl rule__NamedDefinition__Group_17__3
            {
            pushFollow(FOLLOW_5);
            rule__NamedDefinition__Group_17__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_17__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_17__2"


    // $ANTLR start "rule__NamedDefinition__Group_17__2__Impl"
    // InternalSimpleIDL.g:3657:1: rule__NamedDefinition__Group_17__2__Impl : ( 'octet' ) ;
    public final void rule__NamedDefinition__Group_17__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3661:1: ( ( 'octet' ) )
            // InternalSimpleIDL.g:3662:1: ( 'octet' )
            {
            // InternalSimpleIDL.g:3662:1: ( 'octet' )
            // InternalSimpleIDL.g:3663:2: 'octet'
            {
             before(grammarAccess.getNamedDefinitionAccess().getOctetKeyword_17_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getOctetKeyword_17_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_17__2__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_17__3"
    // InternalSimpleIDL.g:3672:1: rule__NamedDefinition__Group_17__3 : rule__NamedDefinition__Group_17__3__Impl rule__NamedDefinition__Group_17__4 ;
    public final void rule__NamedDefinition__Group_17__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3676:1: ( rule__NamedDefinition__Group_17__3__Impl rule__NamedDefinition__Group_17__4 )
            // InternalSimpleIDL.g:3677:2: rule__NamedDefinition__Group_17__3__Impl rule__NamedDefinition__Group_17__4
            {
            pushFollow(FOLLOW_6);
            rule__NamedDefinition__Group_17__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_17__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_17__3"


    // $ANTLR start "rule__NamedDefinition__Group_17__3__Impl"
    // InternalSimpleIDL.g:3684:1: rule__NamedDefinition__Group_17__3__Impl : ( ( rule__NamedDefinition__NameAssignment_17_3 ) ) ;
    public final void rule__NamedDefinition__Group_17__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3688:1: ( ( ( rule__NamedDefinition__NameAssignment_17_3 ) ) )
            // InternalSimpleIDL.g:3689:1: ( ( rule__NamedDefinition__NameAssignment_17_3 ) )
            {
            // InternalSimpleIDL.g:3689:1: ( ( rule__NamedDefinition__NameAssignment_17_3 ) )
            // InternalSimpleIDL.g:3690:2: ( rule__NamedDefinition__NameAssignment_17_3 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_17_3()); 
            // InternalSimpleIDL.g:3691:2: ( rule__NamedDefinition__NameAssignment_17_3 )
            // InternalSimpleIDL.g:3691:3: rule__NamedDefinition__NameAssignment_17_3
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__NameAssignment_17_3();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_17_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_17__3__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_17__4"
    // InternalSimpleIDL.g:3699:1: rule__NamedDefinition__Group_17__4 : rule__NamedDefinition__Group_17__4__Impl ;
    public final void rule__NamedDefinition__Group_17__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3703:1: ( rule__NamedDefinition__Group_17__4__Impl )
            // InternalSimpleIDL.g:3704:2: rule__NamedDefinition__Group_17__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_17__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_17__4"


    // $ANTLR start "rule__NamedDefinition__Group_17__4__Impl"
    // InternalSimpleIDL.g:3710:1: rule__NamedDefinition__Group_17__4__Impl : ( ';' ) ;
    public final void rule__NamedDefinition__Group_17__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3714:1: ( ( ';' ) )
            // InternalSimpleIDL.g:3715:1: ( ';' )
            {
            // InternalSimpleIDL.g:3715:1: ( ';' )
            // InternalSimpleIDL.g:3716:2: ';'
            {
             before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_17_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_17_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_17__4__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_18__0"
    // InternalSimpleIDL.g:3726:1: rule__NamedDefinition__Group_18__0 : rule__NamedDefinition__Group_18__0__Impl rule__NamedDefinition__Group_18__1 ;
    public final void rule__NamedDefinition__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3730:1: ( rule__NamedDefinition__Group_18__0__Impl rule__NamedDefinition__Group_18__1 )
            // InternalSimpleIDL.g:3731:2: rule__NamedDefinition__Group_18__0__Impl rule__NamedDefinition__Group_18__1
            {
            pushFollow(FOLLOW_24);
            rule__NamedDefinition__Group_18__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_18__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_18__0"


    // $ANTLR start "rule__NamedDefinition__Group_18__0__Impl"
    // InternalSimpleIDL.g:3738:1: rule__NamedDefinition__Group_18__0__Impl : ( () ) ;
    public final void rule__NamedDefinition__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3742:1: ( ( () ) )
            // InternalSimpleIDL.g:3743:1: ( () )
            {
            // InternalSimpleIDL.g:3743:1: ( () )
            // InternalSimpleIDL.g:3744:2: ()
            {
             before(grammarAccess.getNamedDefinitionAccess().getReferencedTypeAction_18_0()); 
            // InternalSimpleIDL.g:3745:2: ()
            // InternalSimpleIDL.g:3745:3: 
            {
            }

             after(grammarAccess.getNamedDefinitionAccess().getReferencedTypeAction_18_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_18__0__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_18__1"
    // InternalSimpleIDL.g:3753:1: rule__NamedDefinition__Group_18__1 : rule__NamedDefinition__Group_18__1__Impl rule__NamedDefinition__Group_18__2 ;
    public final void rule__NamedDefinition__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3757:1: ( rule__NamedDefinition__Group_18__1__Impl rule__NamedDefinition__Group_18__2 )
            // InternalSimpleIDL.g:3758:2: rule__NamedDefinition__Group_18__1__Impl rule__NamedDefinition__Group_18__2
            {
            pushFollow(FOLLOW_11);
            rule__NamedDefinition__Group_18__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_18__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_18__1"


    // $ANTLR start "rule__NamedDefinition__Group_18__1__Impl"
    // InternalSimpleIDL.g:3765:1: rule__NamedDefinition__Group_18__1__Impl : ( 'typedef' ) ;
    public final void rule__NamedDefinition__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3769:1: ( ( 'typedef' ) )
            // InternalSimpleIDL.g:3770:1: ( 'typedef' )
            {
            // InternalSimpleIDL.g:3770:1: ( 'typedef' )
            // InternalSimpleIDL.g:3771:2: 'typedef'
            {
             before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_18_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_18_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_18__1__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_18__2"
    // InternalSimpleIDL.g:3780:1: rule__NamedDefinition__Group_18__2 : rule__NamedDefinition__Group_18__2__Impl rule__NamedDefinition__Group_18__3 ;
    public final void rule__NamedDefinition__Group_18__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3784:1: ( rule__NamedDefinition__Group_18__2__Impl rule__NamedDefinition__Group_18__3 )
            // InternalSimpleIDL.g:3785:2: rule__NamedDefinition__Group_18__2__Impl rule__NamedDefinition__Group_18__3
            {
            pushFollow(FOLLOW_5);
            rule__NamedDefinition__Group_18__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_18__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_18__2"


    // $ANTLR start "rule__NamedDefinition__Group_18__2__Impl"
    // InternalSimpleIDL.g:3792:1: rule__NamedDefinition__Group_18__2__Impl : ( ( rule__NamedDefinition__TypeAssignment_18_2 ) ) ;
    public final void rule__NamedDefinition__Group_18__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3796:1: ( ( ( rule__NamedDefinition__TypeAssignment_18_2 ) ) )
            // InternalSimpleIDL.g:3797:1: ( ( rule__NamedDefinition__TypeAssignment_18_2 ) )
            {
            // InternalSimpleIDL.g:3797:1: ( ( rule__NamedDefinition__TypeAssignment_18_2 ) )
            // InternalSimpleIDL.g:3798:2: ( rule__NamedDefinition__TypeAssignment_18_2 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getTypeAssignment_18_2()); 
            // InternalSimpleIDL.g:3799:2: ( rule__NamedDefinition__TypeAssignment_18_2 )
            // InternalSimpleIDL.g:3799:3: rule__NamedDefinition__TypeAssignment_18_2
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__TypeAssignment_18_2();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getTypeAssignment_18_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_18__2__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_18__3"
    // InternalSimpleIDL.g:3807:1: rule__NamedDefinition__Group_18__3 : rule__NamedDefinition__Group_18__3__Impl rule__NamedDefinition__Group_18__4 ;
    public final void rule__NamedDefinition__Group_18__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3811:1: ( rule__NamedDefinition__Group_18__3__Impl rule__NamedDefinition__Group_18__4 )
            // InternalSimpleIDL.g:3812:2: rule__NamedDefinition__Group_18__3__Impl rule__NamedDefinition__Group_18__4
            {
            pushFollow(FOLLOW_6);
            rule__NamedDefinition__Group_18__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_18__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_18__3"


    // $ANTLR start "rule__NamedDefinition__Group_18__3__Impl"
    // InternalSimpleIDL.g:3819:1: rule__NamedDefinition__Group_18__3__Impl : ( ( rule__NamedDefinition__NameAssignment_18_3 ) ) ;
    public final void rule__NamedDefinition__Group_18__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3823:1: ( ( ( rule__NamedDefinition__NameAssignment_18_3 ) ) )
            // InternalSimpleIDL.g:3824:1: ( ( rule__NamedDefinition__NameAssignment_18_3 ) )
            {
            // InternalSimpleIDL.g:3824:1: ( ( rule__NamedDefinition__NameAssignment_18_3 ) )
            // InternalSimpleIDL.g:3825:2: ( rule__NamedDefinition__NameAssignment_18_3 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_18_3()); 
            // InternalSimpleIDL.g:3826:2: ( rule__NamedDefinition__NameAssignment_18_3 )
            // InternalSimpleIDL.g:3826:3: rule__NamedDefinition__NameAssignment_18_3
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__NameAssignment_18_3();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_18_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_18__3__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_18__4"
    // InternalSimpleIDL.g:3834:1: rule__NamedDefinition__Group_18__4 : rule__NamedDefinition__Group_18__4__Impl ;
    public final void rule__NamedDefinition__Group_18__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3838:1: ( rule__NamedDefinition__Group_18__4__Impl )
            // InternalSimpleIDL.g:3839:2: rule__NamedDefinition__Group_18__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_18__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_18__4"


    // $ANTLR start "rule__NamedDefinition__Group_18__4__Impl"
    // InternalSimpleIDL.g:3845:1: rule__NamedDefinition__Group_18__4__Impl : ( ';' ) ;
    public final void rule__NamedDefinition__Group_18__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3849:1: ( ( ';' ) )
            // InternalSimpleIDL.g:3850:1: ( ';' )
            {
            // InternalSimpleIDL.g:3850:1: ( ';' )
            // InternalSimpleIDL.g:3851:2: ';'
            {
             before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_18_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_18_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_18__4__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_19__0"
    // InternalSimpleIDL.g:3861:1: rule__NamedDefinition__Group_19__0 : rule__NamedDefinition__Group_19__0__Impl rule__NamedDefinition__Group_19__1 ;
    public final void rule__NamedDefinition__Group_19__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3865:1: ( rule__NamedDefinition__Group_19__0__Impl rule__NamedDefinition__Group_19__1 )
            // InternalSimpleIDL.g:3866:2: rule__NamedDefinition__Group_19__0__Impl rule__NamedDefinition__Group_19__1
            {
            pushFollow(FOLLOW_24);
            rule__NamedDefinition__Group_19__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_19__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_19__0"


    // $ANTLR start "rule__NamedDefinition__Group_19__0__Impl"
    // InternalSimpleIDL.g:3873:1: rule__NamedDefinition__Group_19__0__Impl : ( () ) ;
    public final void rule__NamedDefinition__Group_19__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3877:1: ( ( () ) )
            // InternalSimpleIDL.g:3878:1: ( () )
            {
            // InternalSimpleIDL.g:3878:1: ( () )
            // InternalSimpleIDL.g:3879:2: ()
            {
             before(grammarAccess.getNamedDefinitionAccess().getBoundedSequenceAction_19_0()); 
            // InternalSimpleIDL.g:3880:2: ()
            // InternalSimpleIDL.g:3880:3: 
            {
            }

             after(grammarAccess.getNamedDefinitionAccess().getBoundedSequenceAction_19_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_19__0__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_19__1"
    // InternalSimpleIDL.g:3888:1: rule__NamedDefinition__Group_19__1 : rule__NamedDefinition__Group_19__1__Impl rule__NamedDefinition__Group_19__2 ;
    public final void rule__NamedDefinition__Group_19__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3892:1: ( rule__NamedDefinition__Group_19__1__Impl rule__NamedDefinition__Group_19__2 )
            // InternalSimpleIDL.g:3893:2: rule__NamedDefinition__Group_19__1__Impl rule__NamedDefinition__Group_19__2
            {
            pushFollow(FOLLOW_35);
            rule__NamedDefinition__Group_19__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_19__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_19__1"


    // $ANTLR start "rule__NamedDefinition__Group_19__1__Impl"
    // InternalSimpleIDL.g:3900:1: rule__NamedDefinition__Group_19__1__Impl : ( 'typedef' ) ;
    public final void rule__NamedDefinition__Group_19__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3904:1: ( ( 'typedef' ) )
            // InternalSimpleIDL.g:3905:1: ( 'typedef' )
            {
            // InternalSimpleIDL.g:3905:1: ( 'typedef' )
            // InternalSimpleIDL.g:3906:2: 'typedef'
            {
             before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_19_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_19_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_19__1__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_19__2"
    // InternalSimpleIDL.g:3915:1: rule__NamedDefinition__Group_19__2 : rule__NamedDefinition__Group_19__2__Impl rule__NamedDefinition__Group_19__3 ;
    public final void rule__NamedDefinition__Group_19__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3919:1: ( rule__NamedDefinition__Group_19__2__Impl rule__NamedDefinition__Group_19__3 )
            // InternalSimpleIDL.g:3920:2: rule__NamedDefinition__Group_19__2__Impl rule__NamedDefinition__Group_19__3
            {
            pushFollow(FOLLOW_36);
            rule__NamedDefinition__Group_19__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_19__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_19__2"


    // $ANTLR start "rule__NamedDefinition__Group_19__2__Impl"
    // InternalSimpleIDL.g:3927:1: rule__NamedDefinition__Group_19__2__Impl : ( 'sequence' ) ;
    public final void rule__NamedDefinition__Group_19__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3931:1: ( ( 'sequence' ) )
            // InternalSimpleIDL.g:3932:1: ( 'sequence' )
            {
            // InternalSimpleIDL.g:3932:1: ( 'sequence' )
            // InternalSimpleIDL.g:3933:2: 'sequence'
            {
             before(grammarAccess.getNamedDefinitionAccess().getSequenceKeyword_19_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getSequenceKeyword_19_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_19__2__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_19__3"
    // InternalSimpleIDL.g:3942:1: rule__NamedDefinition__Group_19__3 : rule__NamedDefinition__Group_19__3__Impl rule__NamedDefinition__Group_19__4 ;
    public final void rule__NamedDefinition__Group_19__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3946:1: ( rule__NamedDefinition__Group_19__3__Impl rule__NamedDefinition__Group_19__4 )
            // InternalSimpleIDL.g:3947:2: rule__NamedDefinition__Group_19__3__Impl rule__NamedDefinition__Group_19__4
            {
            pushFollow(FOLLOW_11);
            rule__NamedDefinition__Group_19__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_19__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_19__3"


    // $ANTLR start "rule__NamedDefinition__Group_19__3__Impl"
    // InternalSimpleIDL.g:3954:1: rule__NamedDefinition__Group_19__3__Impl : ( '<' ) ;
    public final void rule__NamedDefinition__Group_19__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3958:1: ( ( '<' ) )
            // InternalSimpleIDL.g:3959:1: ( '<' )
            {
            // InternalSimpleIDL.g:3959:1: ( '<' )
            // InternalSimpleIDL.g:3960:2: '<'
            {
             before(grammarAccess.getNamedDefinitionAccess().getLessThanSignKeyword_19_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getLessThanSignKeyword_19_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_19__3__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_19__4"
    // InternalSimpleIDL.g:3969:1: rule__NamedDefinition__Group_19__4 : rule__NamedDefinition__Group_19__4__Impl rule__NamedDefinition__Group_19__5 ;
    public final void rule__NamedDefinition__Group_19__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3973:1: ( rule__NamedDefinition__Group_19__4__Impl rule__NamedDefinition__Group_19__5 )
            // InternalSimpleIDL.g:3974:2: rule__NamedDefinition__Group_19__4__Impl rule__NamedDefinition__Group_19__5
            {
            pushFollow(FOLLOW_37);
            rule__NamedDefinition__Group_19__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_19__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_19__4"


    // $ANTLR start "rule__NamedDefinition__Group_19__4__Impl"
    // InternalSimpleIDL.g:3981:1: rule__NamedDefinition__Group_19__4__Impl : ( ( rule__NamedDefinition__TypeAssignment_19_4 ) ) ;
    public final void rule__NamedDefinition__Group_19__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3985:1: ( ( ( rule__NamedDefinition__TypeAssignment_19_4 ) ) )
            // InternalSimpleIDL.g:3986:1: ( ( rule__NamedDefinition__TypeAssignment_19_4 ) )
            {
            // InternalSimpleIDL.g:3986:1: ( ( rule__NamedDefinition__TypeAssignment_19_4 ) )
            // InternalSimpleIDL.g:3987:2: ( rule__NamedDefinition__TypeAssignment_19_4 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getTypeAssignment_19_4()); 
            // InternalSimpleIDL.g:3988:2: ( rule__NamedDefinition__TypeAssignment_19_4 )
            // InternalSimpleIDL.g:3988:3: rule__NamedDefinition__TypeAssignment_19_4
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__TypeAssignment_19_4();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getTypeAssignment_19_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_19__4__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_19__5"
    // InternalSimpleIDL.g:3996:1: rule__NamedDefinition__Group_19__5 : rule__NamedDefinition__Group_19__5__Impl rule__NamedDefinition__Group_19__6 ;
    public final void rule__NamedDefinition__Group_19__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4000:1: ( rule__NamedDefinition__Group_19__5__Impl rule__NamedDefinition__Group_19__6 )
            // InternalSimpleIDL.g:4001:2: rule__NamedDefinition__Group_19__5__Impl rule__NamedDefinition__Group_19__6
            {
            pushFollow(FOLLOW_26);
            rule__NamedDefinition__Group_19__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_19__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_19__5"


    // $ANTLR start "rule__NamedDefinition__Group_19__5__Impl"
    // InternalSimpleIDL.g:4008:1: rule__NamedDefinition__Group_19__5__Impl : ( ',' ) ;
    public final void rule__NamedDefinition__Group_19__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4012:1: ( ( ',' ) )
            // InternalSimpleIDL.g:4013:1: ( ',' )
            {
            // InternalSimpleIDL.g:4013:1: ( ',' )
            // InternalSimpleIDL.g:4014:2: ','
            {
             before(grammarAccess.getNamedDefinitionAccess().getCommaKeyword_19_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getCommaKeyword_19_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_19__5__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_19__6"
    // InternalSimpleIDL.g:4023:1: rule__NamedDefinition__Group_19__6 : rule__NamedDefinition__Group_19__6__Impl rule__NamedDefinition__Group_19__7 ;
    public final void rule__NamedDefinition__Group_19__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4027:1: ( rule__NamedDefinition__Group_19__6__Impl rule__NamedDefinition__Group_19__7 )
            // InternalSimpleIDL.g:4028:2: rule__NamedDefinition__Group_19__6__Impl rule__NamedDefinition__Group_19__7
            {
            pushFollow(FOLLOW_38);
            rule__NamedDefinition__Group_19__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_19__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_19__6"


    // $ANTLR start "rule__NamedDefinition__Group_19__6__Impl"
    // InternalSimpleIDL.g:4035:1: rule__NamedDefinition__Group_19__6__Impl : ( ( rule__NamedDefinition__SizeAssignment_19_6 ) ) ;
    public final void rule__NamedDefinition__Group_19__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4039:1: ( ( ( rule__NamedDefinition__SizeAssignment_19_6 ) ) )
            // InternalSimpleIDL.g:4040:1: ( ( rule__NamedDefinition__SizeAssignment_19_6 ) )
            {
            // InternalSimpleIDL.g:4040:1: ( ( rule__NamedDefinition__SizeAssignment_19_6 ) )
            // InternalSimpleIDL.g:4041:2: ( rule__NamedDefinition__SizeAssignment_19_6 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getSizeAssignment_19_6()); 
            // InternalSimpleIDL.g:4042:2: ( rule__NamedDefinition__SizeAssignment_19_6 )
            // InternalSimpleIDL.g:4042:3: rule__NamedDefinition__SizeAssignment_19_6
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__SizeAssignment_19_6();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getSizeAssignment_19_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_19__6__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_19__7"
    // InternalSimpleIDL.g:4050:1: rule__NamedDefinition__Group_19__7 : rule__NamedDefinition__Group_19__7__Impl rule__NamedDefinition__Group_19__8 ;
    public final void rule__NamedDefinition__Group_19__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4054:1: ( rule__NamedDefinition__Group_19__7__Impl rule__NamedDefinition__Group_19__8 )
            // InternalSimpleIDL.g:4055:2: rule__NamedDefinition__Group_19__7__Impl rule__NamedDefinition__Group_19__8
            {
            pushFollow(FOLLOW_5);
            rule__NamedDefinition__Group_19__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_19__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_19__7"


    // $ANTLR start "rule__NamedDefinition__Group_19__7__Impl"
    // InternalSimpleIDL.g:4062:1: rule__NamedDefinition__Group_19__7__Impl : ( '>' ) ;
    public final void rule__NamedDefinition__Group_19__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4066:1: ( ( '>' ) )
            // InternalSimpleIDL.g:4067:1: ( '>' )
            {
            // InternalSimpleIDL.g:4067:1: ( '>' )
            // InternalSimpleIDL.g:4068:2: '>'
            {
             before(grammarAccess.getNamedDefinitionAccess().getGreaterThanSignKeyword_19_7()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getGreaterThanSignKeyword_19_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_19__7__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_19__8"
    // InternalSimpleIDL.g:4077:1: rule__NamedDefinition__Group_19__8 : rule__NamedDefinition__Group_19__8__Impl rule__NamedDefinition__Group_19__9 ;
    public final void rule__NamedDefinition__Group_19__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4081:1: ( rule__NamedDefinition__Group_19__8__Impl rule__NamedDefinition__Group_19__9 )
            // InternalSimpleIDL.g:4082:2: rule__NamedDefinition__Group_19__8__Impl rule__NamedDefinition__Group_19__9
            {
            pushFollow(FOLLOW_6);
            rule__NamedDefinition__Group_19__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_19__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_19__8"


    // $ANTLR start "rule__NamedDefinition__Group_19__8__Impl"
    // InternalSimpleIDL.g:4089:1: rule__NamedDefinition__Group_19__8__Impl : ( ( rule__NamedDefinition__NameAssignment_19_8 ) ) ;
    public final void rule__NamedDefinition__Group_19__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4093:1: ( ( ( rule__NamedDefinition__NameAssignment_19_8 ) ) )
            // InternalSimpleIDL.g:4094:1: ( ( rule__NamedDefinition__NameAssignment_19_8 ) )
            {
            // InternalSimpleIDL.g:4094:1: ( ( rule__NamedDefinition__NameAssignment_19_8 ) )
            // InternalSimpleIDL.g:4095:2: ( rule__NamedDefinition__NameAssignment_19_8 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_19_8()); 
            // InternalSimpleIDL.g:4096:2: ( rule__NamedDefinition__NameAssignment_19_8 )
            // InternalSimpleIDL.g:4096:3: rule__NamedDefinition__NameAssignment_19_8
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__NameAssignment_19_8();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_19_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_19__8__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_19__9"
    // InternalSimpleIDL.g:4104:1: rule__NamedDefinition__Group_19__9 : rule__NamedDefinition__Group_19__9__Impl ;
    public final void rule__NamedDefinition__Group_19__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4108:1: ( rule__NamedDefinition__Group_19__9__Impl )
            // InternalSimpleIDL.g:4109:2: rule__NamedDefinition__Group_19__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_19__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_19__9"


    // $ANTLR start "rule__NamedDefinition__Group_19__9__Impl"
    // InternalSimpleIDL.g:4115:1: rule__NamedDefinition__Group_19__9__Impl : ( ';' ) ;
    public final void rule__NamedDefinition__Group_19__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4119:1: ( ( ';' ) )
            // InternalSimpleIDL.g:4120:1: ( ';' )
            {
            // InternalSimpleIDL.g:4120:1: ( ';' )
            // InternalSimpleIDL.g:4121:2: ';'
            {
             before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_19_9()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_19_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_19__9__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_20__0"
    // InternalSimpleIDL.g:4131:1: rule__NamedDefinition__Group_20__0 : rule__NamedDefinition__Group_20__0__Impl rule__NamedDefinition__Group_20__1 ;
    public final void rule__NamedDefinition__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4135:1: ( rule__NamedDefinition__Group_20__0__Impl rule__NamedDefinition__Group_20__1 )
            // InternalSimpleIDL.g:4136:2: rule__NamedDefinition__Group_20__0__Impl rule__NamedDefinition__Group_20__1
            {
            pushFollow(FOLLOW_24);
            rule__NamedDefinition__Group_20__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_20__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_20__0"


    // $ANTLR start "rule__NamedDefinition__Group_20__0__Impl"
    // InternalSimpleIDL.g:4143:1: rule__NamedDefinition__Group_20__0__Impl : ( () ) ;
    public final void rule__NamedDefinition__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4147:1: ( ( () ) )
            // InternalSimpleIDL.g:4148:1: ( () )
            {
            // InternalSimpleIDL.g:4148:1: ( () )
            // InternalSimpleIDL.g:4149:2: ()
            {
             before(grammarAccess.getNamedDefinitionAccess().getUnboundedSequenceAction_20_0()); 
            // InternalSimpleIDL.g:4150:2: ()
            // InternalSimpleIDL.g:4150:3: 
            {
            }

             after(grammarAccess.getNamedDefinitionAccess().getUnboundedSequenceAction_20_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_20__0__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_20__1"
    // InternalSimpleIDL.g:4158:1: rule__NamedDefinition__Group_20__1 : rule__NamedDefinition__Group_20__1__Impl rule__NamedDefinition__Group_20__2 ;
    public final void rule__NamedDefinition__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4162:1: ( rule__NamedDefinition__Group_20__1__Impl rule__NamedDefinition__Group_20__2 )
            // InternalSimpleIDL.g:4163:2: rule__NamedDefinition__Group_20__1__Impl rule__NamedDefinition__Group_20__2
            {
            pushFollow(FOLLOW_35);
            rule__NamedDefinition__Group_20__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_20__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_20__1"


    // $ANTLR start "rule__NamedDefinition__Group_20__1__Impl"
    // InternalSimpleIDL.g:4170:1: rule__NamedDefinition__Group_20__1__Impl : ( 'typedef' ) ;
    public final void rule__NamedDefinition__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4174:1: ( ( 'typedef' ) )
            // InternalSimpleIDL.g:4175:1: ( 'typedef' )
            {
            // InternalSimpleIDL.g:4175:1: ( 'typedef' )
            // InternalSimpleIDL.g:4176:2: 'typedef'
            {
             before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_20_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_20_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_20__1__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_20__2"
    // InternalSimpleIDL.g:4185:1: rule__NamedDefinition__Group_20__2 : rule__NamedDefinition__Group_20__2__Impl rule__NamedDefinition__Group_20__3 ;
    public final void rule__NamedDefinition__Group_20__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4189:1: ( rule__NamedDefinition__Group_20__2__Impl rule__NamedDefinition__Group_20__3 )
            // InternalSimpleIDL.g:4190:2: rule__NamedDefinition__Group_20__2__Impl rule__NamedDefinition__Group_20__3
            {
            pushFollow(FOLLOW_36);
            rule__NamedDefinition__Group_20__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_20__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_20__2"


    // $ANTLR start "rule__NamedDefinition__Group_20__2__Impl"
    // InternalSimpleIDL.g:4197:1: rule__NamedDefinition__Group_20__2__Impl : ( 'sequence' ) ;
    public final void rule__NamedDefinition__Group_20__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4201:1: ( ( 'sequence' ) )
            // InternalSimpleIDL.g:4202:1: ( 'sequence' )
            {
            // InternalSimpleIDL.g:4202:1: ( 'sequence' )
            // InternalSimpleIDL.g:4203:2: 'sequence'
            {
             before(grammarAccess.getNamedDefinitionAccess().getSequenceKeyword_20_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getSequenceKeyword_20_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_20__2__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_20__3"
    // InternalSimpleIDL.g:4212:1: rule__NamedDefinition__Group_20__3 : rule__NamedDefinition__Group_20__3__Impl rule__NamedDefinition__Group_20__4 ;
    public final void rule__NamedDefinition__Group_20__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4216:1: ( rule__NamedDefinition__Group_20__3__Impl rule__NamedDefinition__Group_20__4 )
            // InternalSimpleIDL.g:4217:2: rule__NamedDefinition__Group_20__3__Impl rule__NamedDefinition__Group_20__4
            {
            pushFollow(FOLLOW_11);
            rule__NamedDefinition__Group_20__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_20__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_20__3"


    // $ANTLR start "rule__NamedDefinition__Group_20__3__Impl"
    // InternalSimpleIDL.g:4224:1: rule__NamedDefinition__Group_20__3__Impl : ( '<' ) ;
    public final void rule__NamedDefinition__Group_20__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4228:1: ( ( '<' ) )
            // InternalSimpleIDL.g:4229:1: ( '<' )
            {
            // InternalSimpleIDL.g:4229:1: ( '<' )
            // InternalSimpleIDL.g:4230:2: '<'
            {
             before(grammarAccess.getNamedDefinitionAccess().getLessThanSignKeyword_20_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getLessThanSignKeyword_20_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_20__3__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_20__4"
    // InternalSimpleIDL.g:4239:1: rule__NamedDefinition__Group_20__4 : rule__NamedDefinition__Group_20__4__Impl rule__NamedDefinition__Group_20__5 ;
    public final void rule__NamedDefinition__Group_20__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4243:1: ( rule__NamedDefinition__Group_20__4__Impl rule__NamedDefinition__Group_20__5 )
            // InternalSimpleIDL.g:4244:2: rule__NamedDefinition__Group_20__4__Impl rule__NamedDefinition__Group_20__5
            {
            pushFollow(FOLLOW_38);
            rule__NamedDefinition__Group_20__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_20__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_20__4"


    // $ANTLR start "rule__NamedDefinition__Group_20__4__Impl"
    // InternalSimpleIDL.g:4251:1: rule__NamedDefinition__Group_20__4__Impl : ( ( rule__NamedDefinition__TypeAssignment_20_4 ) ) ;
    public final void rule__NamedDefinition__Group_20__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4255:1: ( ( ( rule__NamedDefinition__TypeAssignment_20_4 ) ) )
            // InternalSimpleIDL.g:4256:1: ( ( rule__NamedDefinition__TypeAssignment_20_4 ) )
            {
            // InternalSimpleIDL.g:4256:1: ( ( rule__NamedDefinition__TypeAssignment_20_4 ) )
            // InternalSimpleIDL.g:4257:2: ( rule__NamedDefinition__TypeAssignment_20_4 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getTypeAssignment_20_4()); 
            // InternalSimpleIDL.g:4258:2: ( rule__NamedDefinition__TypeAssignment_20_4 )
            // InternalSimpleIDL.g:4258:3: rule__NamedDefinition__TypeAssignment_20_4
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__TypeAssignment_20_4();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getTypeAssignment_20_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_20__4__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_20__5"
    // InternalSimpleIDL.g:4266:1: rule__NamedDefinition__Group_20__5 : rule__NamedDefinition__Group_20__5__Impl rule__NamedDefinition__Group_20__6 ;
    public final void rule__NamedDefinition__Group_20__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4270:1: ( rule__NamedDefinition__Group_20__5__Impl rule__NamedDefinition__Group_20__6 )
            // InternalSimpleIDL.g:4271:2: rule__NamedDefinition__Group_20__5__Impl rule__NamedDefinition__Group_20__6
            {
            pushFollow(FOLLOW_5);
            rule__NamedDefinition__Group_20__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_20__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_20__5"


    // $ANTLR start "rule__NamedDefinition__Group_20__5__Impl"
    // InternalSimpleIDL.g:4278:1: rule__NamedDefinition__Group_20__5__Impl : ( '>' ) ;
    public final void rule__NamedDefinition__Group_20__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4282:1: ( ( '>' ) )
            // InternalSimpleIDL.g:4283:1: ( '>' )
            {
            // InternalSimpleIDL.g:4283:1: ( '>' )
            // InternalSimpleIDL.g:4284:2: '>'
            {
             before(grammarAccess.getNamedDefinitionAccess().getGreaterThanSignKeyword_20_5()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getGreaterThanSignKeyword_20_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_20__5__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_20__6"
    // InternalSimpleIDL.g:4293:1: rule__NamedDefinition__Group_20__6 : rule__NamedDefinition__Group_20__6__Impl rule__NamedDefinition__Group_20__7 ;
    public final void rule__NamedDefinition__Group_20__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4297:1: ( rule__NamedDefinition__Group_20__6__Impl rule__NamedDefinition__Group_20__7 )
            // InternalSimpleIDL.g:4298:2: rule__NamedDefinition__Group_20__6__Impl rule__NamedDefinition__Group_20__7
            {
            pushFollow(FOLLOW_6);
            rule__NamedDefinition__Group_20__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_20__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_20__6"


    // $ANTLR start "rule__NamedDefinition__Group_20__6__Impl"
    // InternalSimpleIDL.g:4305:1: rule__NamedDefinition__Group_20__6__Impl : ( ( rule__NamedDefinition__NameAssignment_20_6 ) ) ;
    public final void rule__NamedDefinition__Group_20__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4309:1: ( ( ( rule__NamedDefinition__NameAssignment_20_6 ) ) )
            // InternalSimpleIDL.g:4310:1: ( ( rule__NamedDefinition__NameAssignment_20_6 ) )
            {
            // InternalSimpleIDL.g:4310:1: ( ( rule__NamedDefinition__NameAssignment_20_6 ) )
            // InternalSimpleIDL.g:4311:2: ( rule__NamedDefinition__NameAssignment_20_6 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_20_6()); 
            // InternalSimpleIDL.g:4312:2: ( rule__NamedDefinition__NameAssignment_20_6 )
            // InternalSimpleIDL.g:4312:3: rule__NamedDefinition__NameAssignment_20_6
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__NameAssignment_20_6();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_20_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_20__6__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_20__7"
    // InternalSimpleIDL.g:4320:1: rule__NamedDefinition__Group_20__7 : rule__NamedDefinition__Group_20__7__Impl ;
    public final void rule__NamedDefinition__Group_20__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4324:1: ( rule__NamedDefinition__Group_20__7__Impl )
            // InternalSimpleIDL.g:4325:2: rule__NamedDefinition__Group_20__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_20__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_20__7"


    // $ANTLR start "rule__NamedDefinition__Group_20__7__Impl"
    // InternalSimpleIDL.g:4331:1: rule__NamedDefinition__Group_20__7__Impl : ( ';' ) ;
    public final void rule__NamedDefinition__Group_20__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4335:1: ( ( ';' ) )
            // InternalSimpleIDL.g:4336:1: ( ';' )
            {
            // InternalSimpleIDL.g:4336:1: ( ';' )
            // InternalSimpleIDL.g:4337:2: ';'
            {
             before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_20_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_20_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_20__7__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_21__0"
    // InternalSimpleIDL.g:4347:1: rule__NamedDefinition__Group_21__0 : rule__NamedDefinition__Group_21__0__Impl rule__NamedDefinition__Group_21__1 ;
    public final void rule__NamedDefinition__Group_21__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4351:1: ( rule__NamedDefinition__Group_21__0__Impl rule__NamedDefinition__Group_21__1 )
            // InternalSimpleIDL.g:4352:2: rule__NamedDefinition__Group_21__0__Impl rule__NamedDefinition__Group_21__1
            {
            pushFollow(FOLLOW_24);
            rule__NamedDefinition__Group_21__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_21__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_21__0"


    // $ANTLR start "rule__NamedDefinition__Group_21__0__Impl"
    // InternalSimpleIDL.g:4359:1: rule__NamedDefinition__Group_21__0__Impl : ( () ) ;
    public final void rule__NamedDefinition__Group_21__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4363:1: ( ( () ) )
            // InternalSimpleIDL.g:4364:1: ( () )
            {
            // InternalSimpleIDL.g:4364:1: ( () )
            // InternalSimpleIDL.g:4365:2: ()
            {
             before(grammarAccess.getNamedDefinitionAccess().getBoundedStringAction_21_0()); 
            // InternalSimpleIDL.g:4366:2: ()
            // InternalSimpleIDL.g:4366:3: 
            {
            }

             after(grammarAccess.getNamedDefinitionAccess().getBoundedStringAction_21_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_21__0__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_21__1"
    // InternalSimpleIDL.g:4374:1: rule__NamedDefinition__Group_21__1 : rule__NamedDefinition__Group_21__1__Impl rule__NamedDefinition__Group_21__2 ;
    public final void rule__NamedDefinition__Group_21__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4378:1: ( rule__NamedDefinition__Group_21__1__Impl rule__NamedDefinition__Group_21__2 )
            // InternalSimpleIDL.g:4379:2: rule__NamedDefinition__Group_21__1__Impl rule__NamedDefinition__Group_21__2
            {
            pushFollow(FOLLOW_39);
            rule__NamedDefinition__Group_21__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_21__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_21__1"


    // $ANTLR start "rule__NamedDefinition__Group_21__1__Impl"
    // InternalSimpleIDL.g:4386:1: rule__NamedDefinition__Group_21__1__Impl : ( 'typedef' ) ;
    public final void rule__NamedDefinition__Group_21__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4390:1: ( ( 'typedef' ) )
            // InternalSimpleIDL.g:4391:1: ( 'typedef' )
            {
            // InternalSimpleIDL.g:4391:1: ( 'typedef' )
            // InternalSimpleIDL.g:4392:2: 'typedef'
            {
             before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_21_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_21_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_21__1__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_21__2"
    // InternalSimpleIDL.g:4401:1: rule__NamedDefinition__Group_21__2 : rule__NamedDefinition__Group_21__2__Impl rule__NamedDefinition__Group_21__3 ;
    public final void rule__NamedDefinition__Group_21__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4405:1: ( rule__NamedDefinition__Group_21__2__Impl rule__NamedDefinition__Group_21__3 )
            // InternalSimpleIDL.g:4406:2: rule__NamedDefinition__Group_21__2__Impl rule__NamedDefinition__Group_21__3
            {
            pushFollow(FOLLOW_36);
            rule__NamedDefinition__Group_21__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_21__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_21__2"


    // $ANTLR start "rule__NamedDefinition__Group_21__2__Impl"
    // InternalSimpleIDL.g:4413:1: rule__NamedDefinition__Group_21__2__Impl : ( 'string' ) ;
    public final void rule__NamedDefinition__Group_21__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4417:1: ( ( 'string' ) )
            // InternalSimpleIDL.g:4418:1: ( 'string' )
            {
            // InternalSimpleIDL.g:4418:1: ( 'string' )
            // InternalSimpleIDL.g:4419:2: 'string'
            {
             before(grammarAccess.getNamedDefinitionAccess().getStringKeyword_21_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getStringKeyword_21_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_21__2__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_21__3"
    // InternalSimpleIDL.g:4428:1: rule__NamedDefinition__Group_21__3 : rule__NamedDefinition__Group_21__3__Impl rule__NamedDefinition__Group_21__4 ;
    public final void rule__NamedDefinition__Group_21__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4432:1: ( rule__NamedDefinition__Group_21__3__Impl rule__NamedDefinition__Group_21__4 )
            // InternalSimpleIDL.g:4433:2: rule__NamedDefinition__Group_21__3__Impl rule__NamedDefinition__Group_21__4
            {
            pushFollow(FOLLOW_26);
            rule__NamedDefinition__Group_21__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_21__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_21__3"


    // $ANTLR start "rule__NamedDefinition__Group_21__3__Impl"
    // InternalSimpleIDL.g:4440:1: rule__NamedDefinition__Group_21__3__Impl : ( '<' ) ;
    public final void rule__NamedDefinition__Group_21__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4444:1: ( ( '<' ) )
            // InternalSimpleIDL.g:4445:1: ( '<' )
            {
            // InternalSimpleIDL.g:4445:1: ( '<' )
            // InternalSimpleIDL.g:4446:2: '<'
            {
             before(grammarAccess.getNamedDefinitionAccess().getLessThanSignKeyword_21_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getLessThanSignKeyword_21_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_21__3__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_21__4"
    // InternalSimpleIDL.g:4455:1: rule__NamedDefinition__Group_21__4 : rule__NamedDefinition__Group_21__4__Impl rule__NamedDefinition__Group_21__5 ;
    public final void rule__NamedDefinition__Group_21__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4459:1: ( rule__NamedDefinition__Group_21__4__Impl rule__NamedDefinition__Group_21__5 )
            // InternalSimpleIDL.g:4460:2: rule__NamedDefinition__Group_21__4__Impl rule__NamedDefinition__Group_21__5
            {
            pushFollow(FOLLOW_38);
            rule__NamedDefinition__Group_21__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_21__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_21__4"


    // $ANTLR start "rule__NamedDefinition__Group_21__4__Impl"
    // InternalSimpleIDL.g:4467:1: rule__NamedDefinition__Group_21__4__Impl : ( ( rule__NamedDefinition__SizeAssignment_21_4 ) ) ;
    public final void rule__NamedDefinition__Group_21__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4471:1: ( ( ( rule__NamedDefinition__SizeAssignment_21_4 ) ) )
            // InternalSimpleIDL.g:4472:1: ( ( rule__NamedDefinition__SizeAssignment_21_4 ) )
            {
            // InternalSimpleIDL.g:4472:1: ( ( rule__NamedDefinition__SizeAssignment_21_4 ) )
            // InternalSimpleIDL.g:4473:2: ( rule__NamedDefinition__SizeAssignment_21_4 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getSizeAssignment_21_4()); 
            // InternalSimpleIDL.g:4474:2: ( rule__NamedDefinition__SizeAssignment_21_4 )
            // InternalSimpleIDL.g:4474:3: rule__NamedDefinition__SizeAssignment_21_4
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__SizeAssignment_21_4();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getSizeAssignment_21_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_21__4__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_21__5"
    // InternalSimpleIDL.g:4482:1: rule__NamedDefinition__Group_21__5 : rule__NamedDefinition__Group_21__5__Impl rule__NamedDefinition__Group_21__6 ;
    public final void rule__NamedDefinition__Group_21__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4486:1: ( rule__NamedDefinition__Group_21__5__Impl rule__NamedDefinition__Group_21__6 )
            // InternalSimpleIDL.g:4487:2: rule__NamedDefinition__Group_21__5__Impl rule__NamedDefinition__Group_21__6
            {
            pushFollow(FOLLOW_5);
            rule__NamedDefinition__Group_21__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_21__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_21__5"


    // $ANTLR start "rule__NamedDefinition__Group_21__5__Impl"
    // InternalSimpleIDL.g:4494:1: rule__NamedDefinition__Group_21__5__Impl : ( '>' ) ;
    public final void rule__NamedDefinition__Group_21__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4498:1: ( ( '>' ) )
            // InternalSimpleIDL.g:4499:1: ( '>' )
            {
            // InternalSimpleIDL.g:4499:1: ( '>' )
            // InternalSimpleIDL.g:4500:2: '>'
            {
             before(grammarAccess.getNamedDefinitionAccess().getGreaterThanSignKeyword_21_5()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getGreaterThanSignKeyword_21_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_21__5__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_21__6"
    // InternalSimpleIDL.g:4509:1: rule__NamedDefinition__Group_21__6 : rule__NamedDefinition__Group_21__6__Impl rule__NamedDefinition__Group_21__7 ;
    public final void rule__NamedDefinition__Group_21__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4513:1: ( rule__NamedDefinition__Group_21__6__Impl rule__NamedDefinition__Group_21__7 )
            // InternalSimpleIDL.g:4514:2: rule__NamedDefinition__Group_21__6__Impl rule__NamedDefinition__Group_21__7
            {
            pushFollow(FOLLOW_6);
            rule__NamedDefinition__Group_21__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_21__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_21__6"


    // $ANTLR start "rule__NamedDefinition__Group_21__6__Impl"
    // InternalSimpleIDL.g:4521:1: rule__NamedDefinition__Group_21__6__Impl : ( ( rule__NamedDefinition__NameAssignment_21_6 ) ) ;
    public final void rule__NamedDefinition__Group_21__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4525:1: ( ( ( rule__NamedDefinition__NameAssignment_21_6 ) ) )
            // InternalSimpleIDL.g:4526:1: ( ( rule__NamedDefinition__NameAssignment_21_6 ) )
            {
            // InternalSimpleIDL.g:4526:1: ( ( rule__NamedDefinition__NameAssignment_21_6 ) )
            // InternalSimpleIDL.g:4527:2: ( rule__NamedDefinition__NameAssignment_21_6 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_21_6()); 
            // InternalSimpleIDL.g:4528:2: ( rule__NamedDefinition__NameAssignment_21_6 )
            // InternalSimpleIDL.g:4528:3: rule__NamedDefinition__NameAssignment_21_6
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__NameAssignment_21_6();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_21_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_21__6__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_21__7"
    // InternalSimpleIDL.g:4536:1: rule__NamedDefinition__Group_21__7 : rule__NamedDefinition__Group_21__7__Impl ;
    public final void rule__NamedDefinition__Group_21__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4540:1: ( rule__NamedDefinition__Group_21__7__Impl )
            // InternalSimpleIDL.g:4541:2: rule__NamedDefinition__Group_21__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_21__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_21__7"


    // $ANTLR start "rule__NamedDefinition__Group_21__7__Impl"
    // InternalSimpleIDL.g:4547:1: rule__NamedDefinition__Group_21__7__Impl : ( ';' ) ;
    public final void rule__NamedDefinition__Group_21__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4551:1: ( ( ';' ) )
            // InternalSimpleIDL.g:4552:1: ( ';' )
            {
            // InternalSimpleIDL.g:4552:1: ( ';' )
            // InternalSimpleIDL.g:4553:2: ';'
            {
             before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_21_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_21_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_21__7__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_22__0"
    // InternalSimpleIDL.g:4563:1: rule__NamedDefinition__Group_22__0 : rule__NamedDefinition__Group_22__0__Impl rule__NamedDefinition__Group_22__1 ;
    public final void rule__NamedDefinition__Group_22__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4567:1: ( rule__NamedDefinition__Group_22__0__Impl rule__NamedDefinition__Group_22__1 )
            // InternalSimpleIDL.g:4568:2: rule__NamedDefinition__Group_22__0__Impl rule__NamedDefinition__Group_22__1
            {
            pushFollow(FOLLOW_24);
            rule__NamedDefinition__Group_22__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_22__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_22__0"


    // $ANTLR start "rule__NamedDefinition__Group_22__0__Impl"
    // InternalSimpleIDL.g:4575:1: rule__NamedDefinition__Group_22__0__Impl : ( () ) ;
    public final void rule__NamedDefinition__Group_22__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4579:1: ( ( () ) )
            // InternalSimpleIDL.g:4580:1: ( () )
            {
            // InternalSimpleIDL.g:4580:1: ( () )
            // InternalSimpleIDL.g:4581:2: ()
            {
             before(grammarAccess.getNamedDefinitionAccess().getUnboundedStringAction_22_0()); 
            // InternalSimpleIDL.g:4582:2: ()
            // InternalSimpleIDL.g:4582:3: 
            {
            }

             after(grammarAccess.getNamedDefinitionAccess().getUnboundedStringAction_22_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_22__0__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_22__1"
    // InternalSimpleIDL.g:4590:1: rule__NamedDefinition__Group_22__1 : rule__NamedDefinition__Group_22__1__Impl rule__NamedDefinition__Group_22__2 ;
    public final void rule__NamedDefinition__Group_22__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4594:1: ( rule__NamedDefinition__Group_22__1__Impl rule__NamedDefinition__Group_22__2 )
            // InternalSimpleIDL.g:4595:2: rule__NamedDefinition__Group_22__1__Impl rule__NamedDefinition__Group_22__2
            {
            pushFollow(FOLLOW_39);
            rule__NamedDefinition__Group_22__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_22__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_22__1"


    // $ANTLR start "rule__NamedDefinition__Group_22__1__Impl"
    // InternalSimpleIDL.g:4602:1: rule__NamedDefinition__Group_22__1__Impl : ( 'typedef' ) ;
    public final void rule__NamedDefinition__Group_22__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4606:1: ( ( 'typedef' ) )
            // InternalSimpleIDL.g:4607:1: ( 'typedef' )
            {
            // InternalSimpleIDL.g:4607:1: ( 'typedef' )
            // InternalSimpleIDL.g:4608:2: 'typedef'
            {
             before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_22_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_22_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_22__1__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_22__2"
    // InternalSimpleIDL.g:4617:1: rule__NamedDefinition__Group_22__2 : rule__NamedDefinition__Group_22__2__Impl rule__NamedDefinition__Group_22__3 ;
    public final void rule__NamedDefinition__Group_22__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4621:1: ( rule__NamedDefinition__Group_22__2__Impl rule__NamedDefinition__Group_22__3 )
            // InternalSimpleIDL.g:4622:2: rule__NamedDefinition__Group_22__2__Impl rule__NamedDefinition__Group_22__3
            {
            pushFollow(FOLLOW_5);
            rule__NamedDefinition__Group_22__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_22__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_22__2"


    // $ANTLR start "rule__NamedDefinition__Group_22__2__Impl"
    // InternalSimpleIDL.g:4629:1: rule__NamedDefinition__Group_22__2__Impl : ( 'string' ) ;
    public final void rule__NamedDefinition__Group_22__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4633:1: ( ( 'string' ) )
            // InternalSimpleIDL.g:4634:1: ( 'string' )
            {
            // InternalSimpleIDL.g:4634:1: ( 'string' )
            // InternalSimpleIDL.g:4635:2: 'string'
            {
             before(grammarAccess.getNamedDefinitionAccess().getStringKeyword_22_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getStringKeyword_22_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_22__2__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_22__3"
    // InternalSimpleIDL.g:4644:1: rule__NamedDefinition__Group_22__3 : rule__NamedDefinition__Group_22__3__Impl rule__NamedDefinition__Group_22__4 ;
    public final void rule__NamedDefinition__Group_22__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4648:1: ( rule__NamedDefinition__Group_22__3__Impl rule__NamedDefinition__Group_22__4 )
            // InternalSimpleIDL.g:4649:2: rule__NamedDefinition__Group_22__3__Impl rule__NamedDefinition__Group_22__4
            {
            pushFollow(FOLLOW_6);
            rule__NamedDefinition__Group_22__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_22__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_22__3"


    // $ANTLR start "rule__NamedDefinition__Group_22__3__Impl"
    // InternalSimpleIDL.g:4656:1: rule__NamedDefinition__Group_22__3__Impl : ( ( rule__NamedDefinition__NameAssignment_22_3 ) ) ;
    public final void rule__NamedDefinition__Group_22__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4660:1: ( ( ( rule__NamedDefinition__NameAssignment_22_3 ) ) )
            // InternalSimpleIDL.g:4661:1: ( ( rule__NamedDefinition__NameAssignment_22_3 ) )
            {
            // InternalSimpleIDL.g:4661:1: ( ( rule__NamedDefinition__NameAssignment_22_3 ) )
            // InternalSimpleIDL.g:4662:2: ( rule__NamedDefinition__NameAssignment_22_3 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_22_3()); 
            // InternalSimpleIDL.g:4663:2: ( rule__NamedDefinition__NameAssignment_22_3 )
            // InternalSimpleIDL.g:4663:3: rule__NamedDefinition__NameAssignment_22_3
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__NameAssignment_22_3();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_22_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_22__3__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_22__4"
    // InternalSimpleIDL.g:4671:1: rule__NamedDefinition__Group_22__4 : rule__NamedDefinition__Group_22__4__Impl ;
    public final void rule__NamedDefinition__Group_22__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4675:1: ( rule__NamedDefinition__Group_22__4__Impl )
            // InternalSimpleIDL.g:4676:2: rule__NamedDefinition__Group_22__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_22__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_22__4"


    // $ANTLR start "rule__NamedDefinition__Group_22__4__Impl"
    // InternalSimpleIDL.g:4682:1: rule__NamedDefinition__Group_22__4__Impl : ( ';' ) ;
    public final void rule__NamedDefinition__Group_22__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4686:1: ( ( ';' ) )
            // InternalSimpleIDL.g:4687:1: ( ';' )
            {
            // InternalSimpleIDL.g:4687:1: ( ';' )
            // InternalSimpleIDL.g:4688:2: ';'
            {
             before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_22_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_22_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_22__4__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_23__0"
    // InternalSimpleIDL.g:4698:1: rule__NamedDefinition__Group_23__0 : rule__NamedDefinition__Group_23__0__Impl rule__NamedDefinition__Group_23__1 ;
    public final void rule__NamedDefinition__Group_23__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4702:1: ( rule__NamedDefinition__Group_23__0__Impl rule__NamedDefinition__Group_23__1 )
            // InternalSimpleIDL.g:4703:2: rule__NamedDefinition__Group_23__0__Impl rule__NamedDefinition__Group_23__1
            {
            pushFollow(FOLLOW_24);
            rule__NamedDefinition__Group_23__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_23__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_23__0"


    // $ANTLR start "rule__NamedDefinition__Group_23__0__Impl"
    // InternalSimpleIDL.g:4710:1: rule__NamedDefinition__Group_23__0__Impl : ( () ) ;
    public final void rule__NamedDefinition__Group_23__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4714:1: ( ( () ) )
            // InternalSimpleIDL.g:4715:1: ( () )
            {
            // InternalSimpleIDL.g:4715:1: ( () )
            // InternalSimpleIDL.g:4716:2: ()
            {
             before(grammarAccess.getNamedDefinitionAccess().getBoundedWideStringAction_23_0()); 
            // InternalSimpleIDL.g:4717:2: ()
            // InternalSimpleIDL.g:4717:3: 
            {
            }

             after(grammarAccess.getNamedDefinitionAccess().getBoundedWideStringAction_23_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_23__0__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_23__1"
    // InternalSimpleIDL.g:4725:1: rule__NamedDefinition__Group_23__1 : rule__NamedDefinition__Group_23__1__Impl rule__NamedDefinition__Group_23__2 ;
    public final void rule__NamedDefinition__Group_23__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4729:1: ( rule__NamedDefinition__Group_23__1__Impl rule__NamedDefinition__Group_23__2 )
            // InternalSimpleIDL.g:4730:2: rule__NamedDefinition__Group_23__1__Impl rule__NamedDefinition__Group_23__2
            {
            pushFollow(FOLLOW_40);
            rule__NamedDefinition__Group_23__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_23__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_23__1"


    // $ANTLR start "rule__NamedDefinition__Group_23__1__Impl"
    // InternalSimpleIDL.g:4737:1: rule__NamedDefinition__Group_23__1__Impl : ( 'typedef' ) ;
    public final void rule__NamedDefinition__Group_23__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4741:1: ( ( 'typedef' ) )
            // InternalSimpleIDL.g:4742:1: ( 'typedef' )
            {
            // InternalSimpleIDL.g:4742:1: ( 'typedef' )
            // InternalSimpleIDL.g:4743:2: 'typedef'
            {
             before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_23_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_23_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_23__1__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_23__2"
    // InternalSimpleIDL.g:4752:1: rule__NamedDefinition__Group_23__2 : rule__NamedDefinition__Group_23__2__Impl rule__NamedDefinition__Group_23__3 ;
    public final void rule__NamedDefinition__Group_23__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4756:1: ( rule__NamedDefinition__Group_23__2__Impl rule__NamedDefinition__Group_23__3 )
            // InternalSimpleIDL.g:4757:2: rule__NamedDefinition__Group_23__2__Impl rule__NamedDefinition__Group_23__3
            {
            pushFollow(FOLLOW_36);
            rule__NamedDefinition__Group_23__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_23__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_23__2"


    // $ANTLR start "rule__NamedDefinition__Group_23__2__Impl"
    // InternalSimpleIDL.g:4764:1: rule__NamedDefinition__Group_23__2__Impl : ( 'wstring' ) ;
    public final void rule__NamedDefinition__Group_23__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4768:1: ( ( 'wstring' ) )
            // InternalSimpleIDL.g:4769:1: ( 'wstring' )
            {
            // InternalSimpleIDL.g:4769:1: ( 'wstring' )
            // InternalSimpleIDL.g:4770:2: 'wstring'
            {
             before(grammarAccess.getNamedDefinitionAccess().getWstringKeyword_23_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getWstringKeyword_23_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_23__2__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_23__3"
    // InternalSimpleIDL.g:4779:1: rule__NamedDefinition__Group_23__3 : rule__NamedDefinition__Group_23__3__Impl rule__NamedDefinition__Group_23__4 ;
    public final void rule__NamedDefinition__Group_23__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4783:1: ( rule__NamedDefinition__Group_23__3__Impl rule__NamedDefinition__Group_23__4 )
            // InternalSimpleIDL.g:4784:2: rule__NamedDefinition__Group_23__3__Impl rule__NamedDefinition__Group_23__4
            {
            pushFollow(FOLLOW_26);
            rule__NamedDefinition__Group_23__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_23__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_23__3"


    // $ANTLR start "rule__NamedDefinition__Group_23__3__Impl"
    // InternalSimpleIDL.g:4791:1: rule__NamedDefinition__Group_23__3__Impl : ( '<' ) ;
    public final void rule__NamedDefinition__Group_23__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4795:1: ( ( '<' ) )
            // InternalSimpleIDL.g:4796:1: ( '<' )
            {
            // InternalSimpleIDL.g:4796:1: ( '<' )
            // InternalSimpleIDL.g:4797:2: '<'
            {
             before(grammarAccess.getNamedDefinitionAccess().getLessThanSignKeyword_23_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getLessThanSignKeyword_23_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_23__3__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_23__4"
    // InternalSimpleIDL.g:4806:1: rule__NamedDefinition__Group_23__4 : rule__NamedDefinition__Group_23__4__Impl rule__NamedDefinition__Group_23__5 ;
    public final void rule__NamedDefinition__Group_23__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4810:1: ( rule__NamedDefinition__Group_23__4__Impl rule__NamedDefinition__Group_23__5 )
            // InternalSimpleIDL.g:4811:2: rule__NamedDefinition__Group_23__4__Impl rule__NamedDefinition__Group_23__5
            {
            pushFollow(FOLLOW_38);
            rule__NamedDefinition__Group_23__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_23__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_23__4"


    // $ANTLR start "rule__NamedDefinition__Group_23__4__Impl"
    // InternalSimpleIDL.g:4818:1: rule__NamedDefinition__Group_23__4__Impl : ( ( rule__NamedDefinition__SizeAssignment_23_4 ) ) ;
    public final void rule__NamedDefinition__Group_23__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4822:1: ( ( ( rule__NamedDefinition__SizeAssignment_23_4 ) ) )
            // InternalSimpleIDL.g:4823:1: ( ( rule__NamedDefinition__SizeAssignment_23_4 ) )
            {
            // InternalSimpleIDL.g:4823:1: ( ( rule__NamedDefinition__SizeAssignment_23_4 ) )
            // InternalSimpleIDL.g:4824:2: ( rule__NamedDefinition__SizeAssignment_23_4 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getSizeAssignment_23_4()); 
            // InternalSimpleIDL.g:4825:2: ( rule__NamedDefinition__SizeAssignment_23_4 )
            // InternalSimpleIDL.g:4825:3: rule__NamedDefinition__SizeAssignment_23_4
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__SizeAssignment_23_4();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getSizeAssignment_23_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_23__4__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_23__5"
    // InternalSimpleIDL.g:4833:1: rule__NamedDefinition__Group_23__5 : rule__NamedDefinition__Group_23__5__Impl rule__NamedDefinition__Group_23__6 ;
    public final void rule__NamedDefinition__Group_23__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4837:1: ( rule__NamedDefinition__Group_23__5__Impl rule__NamedDefinition__Group_23__6 )
            // InternalSimpleIDL.g:4838:2: rule__NamedDefinition__Group_23__5__Impl rule__NamedDefinition__Group_23__6
            {
            pushFollow(FOLLOW_5);
            rule__NamedDefinition__Group_23__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_23__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_23__5"


    // $ANTLR start "rule__NamedDefinition__Group_23__5__Impl"
    // InternalSimpleIDL.g:4845:1: rule__NamedDefinition__Group_23__5__Impl : ( '>' ) ;
    public final void rule__NamedDefinition__Group_23__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4849:1: ( ( '>' ) )
            // InternalSimpleIDL.g:4850:1: ( '>' )
            {
            // InternalSimpleIDL.g:4850:1: ( '>' )
            // InternalSimpleIDL.g:4851:2: '>'
            {
             before(grammarAccess.getNamedDefinitionAccess().getGreaterThanSignKeyword_23_5()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getGreaterThanSignKeyword_23_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_23__5__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_23__6"
    // InternalSimpleIDL.g:4860:1: rule__NamedDefinition__Group_23__6 : rule__NamedDefinition__Group_23__6__Impl rule__NamedDefinition__Group_23__7 ;
    public final void rule__NamedDefinition__Group_23__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4864:1: ( rule__NamedDefinition__Group_23__6__Impl rule__NamedDefinition__Group_23__7 )
            // InternalSimpleIDL.g:4865:2: rule__NamedDefinition__Group_23__6__Impl rule__NamedDefinition__Group_23__7
            {
            pushFollow(FOLLOW_6);
            rule__NamedDefinition__Group_23__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_23__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_23__6"


    // $ANTLR start "rule__NamedDefinition__Group_23__6__Impl"
    // InternalSimpleIDL.g:4872:1: rule__NamedDefinition__Group_23__6__Impl : ( ( rule__NamedDefinition__NameAssignment_23_6 ) ) ;
    public final void rule__NamedDefinition__Group_23__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4876:1: ( ( ( rule__NamedDefinition__NameAssignment_23_6 ) ) )
            // InternalSimpleIDL.g:4877:1: ( ( rule__NamedDefinition__NameAssignment_23_6 ) )
            {
            // InternalSimpleIDL.g:4877:1: ( ( rule__NamedDefinition__NameAssignment_23_6 ) )
            // InternalSimpleIDL.g:4878:2: ( rule__NamedDefinition__NameAssignment_23_6 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_23_6()); 
            // InternalSimpleIDL.g:4879:2: ( rule__NamedDefinition__NameAssignment_23_6 )
            // InternalSimpleIDL.g:4879:3: rule__NamedDefinition__NameAssignment_23_6
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__NameAssignment_23_6();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_23_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_23__6__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_23__7"
    // InternalSimpleIDL.g:4887:1: rule__NamedDefinition__Group_23__7 : rule__NamedDefinition__Group_23__7__Impl ;
    public final void rule__NamedDefinition__Group_23__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4891:1: ( rule__NamedDefinition__Group_23__7__Impl )
            // InternalSimpleIDL.g:4892:2: rule__NamedDefinition__Group_23__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_23__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_23__7"


    // $ANTLR start "rule__NamedDefinition__Group_23__7__Impl"
    // InternalSimpleIDL.g:4898:1: rule__NamedDefinition__Group_23__7__Impl : ( ';' ) ;
    public final void rule__NamedDefinition__Group_23__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4902:1: ( ( ';' ) )
            // InternalSimpleIDL.g:4903:1: ( ';' )
            {
            // InternalSimpleIDL.g:4903:1: ( ';' )
            // InternalSimpleIDL.g:4904:2: ';'
            {
             before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_23_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_23_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_23__7__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_24__0"
    // InternalSimpleIDL.g:4914:1: rule__NamedDefinition__Group_24__0 : rule__NamedDefinition__Group_24__0__Impl rule__NamedDefinition__Group_24__1 ;
    public final void rule__NamedDefinition__Group_24__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4918:1: ( rule__NamedDefinition__Group_24__0__Impl rule__NamedDefinition__Group_24__1 )
            // InternalSimpleIDL.g:4919:2: rule__NamedDefinition__Group_24__0__Impl rule__NamedDefinition__Group_24__1
            {
            pushFollow(FOLLOW_24);
            rule__NamedDefinition__Group_24__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_24__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_24__0"


    // $ANTLR start "rule__NamedDefinition__Group_24__0__Impl"
    // InternalSimpleIDL.g:4926:1: rule__NamedDefinition__Group_24__0__Impl : ( () ) ;
    public final void rule__NamedDefinition__Group_24__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4930:1: ( ( () ) )
            // InternalSimpleIDL.g:4931:1: ( () )
            {
            // InternalSimpleIDL.g:4931:1: ( () )
            // InternalSimpleIDL.g:4932:2: ()
            {
             before(grammarAccess.getNamedDefinitionAccess().getUnboundedWideStringAction_24_0()); 
            // InternalSimpleIDL.g:4933:2: ()
            // InternalSimpleIDL.g:4933:3: 
            {
            }

             after(grammarAccess.getNamedDefinitionAccess().getUnboundedWideStringAction_24_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_24__0__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_24__1"
    // InternalSimpleIDL.g:4941:1: rule__NamedDefinition__Group_24__1 : rule__NamedDefinition__Group_24__1__Impl rule__NamedDefinition__Group_24__2 ;
    public final void rule__NamedDefinition__Group_24__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4945:1: ( rule__NamedDefinition__Group_24__1__Impl rule__NamedDefinition__Group_24__2 )
            // InternalSimpleIDL.g:4946:2: rule__NamedDefinition__Group_24__1__Impl rule__NamedDefinition__Group_24__2
            {
            pushFollow(FOLLOW_40);
            rule__NamedDefinition__Group_24__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_24__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_24__1"


    // $ANTLR start "rule__NamedDefinition__Group_24__1__Impl"
    // InternalSimpleIDL.g:4953:1: rule__NamedDefinition__Group_24__1__Impl : ( 'typedef' ) ;
    public final void rule__NamedDefinition__Group_24__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4957:1: ( ( 'typedef' ) )
            // InternalSimpleIDL.g:4958:1: ( 'typedef' )
            {
            // InternalSimpleIDL.g:4958:1: ( 'typedef' )
            // InternalSimpleIDL.g:4959:2: 'typedef'
            {
             before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_24_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_24_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_24__1__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_24__2"
    // InternalSimpleIDL.g:4968:1: rule__NamedDefinition__Group_24__2 : rule__NamedDefinition__Group_24__2__Impl rule__NamedDefinition__Group_24__3 ;
    public final void rule__NamedDefinition__Group_24__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4972:1: ( rule__NamedDefinition__Group_24__2__Impl rule__NamedDefinition__Group_24__3 )
            // InternalSimpleIDL.g:4973:2: rule__NamedDefinition__Group_24__2__Impl rule__NamedDefinition__Group_24__3
            {
            pushFollow(FOLLOW_5);
            rule__NamedDefinition__Group_24__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_24__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_24__2"


    // $ANTLR start "rule__NamedDefinition__Group_24__2__Impl"
    // InternalSimpleIDL.g:4980:1: rule__NamedDefinition__Group_24__2__Impl : ( 'wstring' ) ;
    public final void rule__NamedDefinition__Group_24__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4984:1: ( ( 'wstring' ) )
            // InternalSimpleIDL.g:4985:1: ( 'wstring' )
            {
            // InternalSimpleIDL.g:4985:1: ( 'wstring' )
            // InternalSimpleIDL.g:4986:2: 'wstring'
            {
             before(grammarAccess.getNamedDefinitionAccess().getWstringKeyword_24_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getWstringKeyword_24_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_24__2__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_24__3"
    // InternalSimpleIDL.g:4995:1: rule__NamedDefinition__Group_24__3 : rule__NamedDefinition__Group_24__3__Impl rule__NamedDefinition__Group_24__4 ;
    public final void rule__NamedDefinition__Group_24__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4999:1: ( rule__NamedDefinition__Group_24__3__Impl rule__NamedDefinition__Group_24__4 )
            // InternalSimpleIDL.g:5000:2: rule__NamedDefinition__Group_24__3__Impl rule__NamedDefinition__Group_24__4
            {
            pushFollow(FOLLOW_6);
            rule__NamedDefinition__Group_24__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_24__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_24__3"


    // $ANTLR start "rule__NamedDefinition__Group_24__3__Impl"
    // InternalSimpleIDL.g:5007:1: rule__NamedDefinition__Group_24__3__Impl : ( ( rule__NamedDefinition__NameAssignment_24_3 ) ) ;
    public final void rule__NamedDefinition__Group_24__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5011:1: ( ( ( rule__NamedDefinition__NameAssignment_24_3 ) ) )
            // InternalSimpleIDL.g:5012:1: ( ( rule__NamedDefinition__NameAssignment_24_3 ) )
            {
            // InternalSimpleIDL.g:5012:1: ( ( rule__NamedDefinition__NameAssignment_24_3 ) )
            // InternalSimpleIDL.g:5013:2: ( rule__NamedDefinition__NameAssignment_24_3 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_24_3()); 
            // InternalSimpleIDL.g:5014:2: ( rule__NamedDefinition__NameAssignment_24_3 )
            // InternalSimpleIDL.g:5014:3: rule__NamedDefinition__NameAssignment_24_3
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__NameAssignment_24_3();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_24_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_24__3__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_24__4"
    // InternalSimpleIDL.g:5022:1: rule__NamedDefinition__Group_24__4 : rule__NamedDefinition__Group_24__4__Impl ;
    public final void rule__NamedDefinition__Group_24__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5026:1: ( rule__NamedDefinition__Group_24__4__Impl )
            // InternalSimpleIDL.g:5027:2: rule__NamedDefinition__Group_24__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_24__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_24__4"


    // $ANTLR start "rule__NamedDefinition__Group_24__4__Impl"
    // InternalSimpleIDL.g:5033:1: rule__NamedDefinition__Group_24__4__Impl : ( ';' ) ;
    public final void rule__NamedDefinition__Group_24__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5037:1: ( ( ';' ) )
            // InternalSimpleIDL.g:5038:1: ( ';' )
            {
            // InternalSimpleIDL.g:5038:1: ( ';' )
            // InternalSimpleIDL.g:5039:2: ';'
            {
             before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_24_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_24_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_24__4__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_25__0"
    // InternalSimpleIDL.g:5049:1: rule__NamedDefinition__Group_25__0 : rule__NamedDefinition__Group_25__0__Impl rule__NamedDefinition__Group_25__1 ;
    public final void rule__NamedDefinition__Group_25__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5053:1: ( rule__NamedDefinition__Group_25__0__Impl rule__NamedDefinition__Group_25__1 )
            // InternalSimpleIDL.g:5054:2: rule__NamedDefinition__Group_25__0__Impl rule__NamedDefinition__Group_25__1
            {
            pushFollow(FOLLOW_4);
            rule__NamedDefinition__Group_25__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_25__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_25__0"


    // $ANTLR start "rule__NamedDefinition__Group_25__0__Impl"
    // InternalSimpleIDL.g:5061:1: rule__NamedDefinition__Group_25__0__Impl : ( () ) ;
    public final void rule__NamedDefinition__Group_25__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5065:1: ( ( () ) )
            // InternalSimpleIDL.g:5066:1: ( () )
            {
            // InternalSimpleIDL.g:5066:1: ( () )
            // InternalSimpleIDL.g:5067:2: ()
            {
             before(grammarAccess.getNamedDefinitionAccess().getFixedPtTypeAction_25_0()); 
            // InternalSimpleIDL.g:5068:2: ()
            // InternalSimpleIDL.g:5068:3: 
            {
            }

             after(grammarAccess.getNamedDefinitionAccess().getFixedPtTypeAction_25_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_25__0__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_25__1"
    // InternalSimpleIDL.g:5076:1: rule__NamedDefinition__Group_25__1 : rule__NamedDefinition__Group_25__1__Impl rule__NamedDefinition__Group_25__2 ;
    public final void rule__NamedDefinition__Group_25__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5080:1: ( rule__NamedDefinition__Group_25__1__Impl rule__NamedDefinition__Group_25__2 )
            // InternalSimpleIDL.g:5081:2: rule__NamedDefinition__Group_25__1__Impl rule__NamedDefinition__Group_25__2
            {
            pushFollow(FOLLOW_41);
            rule__NamedDefinition__Group_25__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_25__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_25__1"


    // $ANTLR start "rule__NamedDefinition__Group_25__1__Impl"
    // InternalSimpleIDL.g:5088:1: rule__NamedDefinition__Group_25__1__Impl : ( 'typedef' ) ;
    public final void rule__NamedDefinition__Group_25__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5092:1: ( ( 'typedef' ) )
            // InternalSimpleIDL.g:5093:1: ( 'typedef' )
            {
            // InternalSimpleIDL.g:5093:1: ( 'typedef' )
            // InternalSimpleIDL.g:5094:2: 'typedef'
            {
             before(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_25_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_25_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_25__1__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_25__2"
    // InternalSimpleIDL.g:5103:1: rule__NamedDefinition__Group_25__2 : rule__NamedDefinition__Group_25__2__Impl rule__NamedDefinition__Group_25__3 ;
    public final void rule__NamedDefinition__Group_25__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5107:1: ( rule__NamedDefinition__Group_25__2__Impl rule__NamedDefinition__Group_25__3 )
            // InternalSimpleIDL.g:5108:2: rule__NamedDefinition__Group_25__2__Impl rule__NamedDefinition__Group_25__3
            {
            pushFollow(FOLLOW_36);
            rule__NamedDefinition__Group_25__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_25__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_25__2"


    // $ANTLR start "rule__NamedDefinition__Group_25__2__Impl"
    // InternalSimpleIDL.g:5115:1: rule__NamedDefinition__Group_25__2__Impl : ( 'fixed' ) ;
    public final void rule__NamedDefinition__Group_25__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5119:1: ( ( 'fixed' ) )
            // InternalSimpleIDL.g:5120:1: ( 'fixed' )
            {
            // InternalSimpleIDL.g:5120:1: ( 'fixed' )
            // InternalSimpleIDL.g:5121:2: 'fixed'
            {
             before(grammarAccess.getNamedDefinitionAccess().getFixedKeyword_25_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getFixedKeyword_25_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_25__2__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_25__3"
    // InternalSimpleIDL.g:5130:1: rule__NamedDefinition__Group_25__3 : rule__NamedDefinition__Group_25__3__Impl rule__NamedDefinition__Group_25__4 ;
    public final void rule__NamedDefinition__Group_25__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5134:1: ( rule__NamedDefinition__Group_25__3__Impl rule__NamedDefinition__Group_25__4 )
            // InternalSimpleIDL.g:5135:2: rule__NamedDefinition__Group_25__3__Impl rule__NamedDefinition__Group_25__4
            {
            pushFollow(FOLLOW_26);
            rule__NamedDefinition__Group_25__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_25__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_25__3"


    // $ANTLR start "rule__NamedDefinition__Group_25__3__Impl"
    // InternalSimpleIDL.g:5142:1: rule__NamedDefinition__Group_25__3__Impl : ( '<' ) ;
    public final void rule__NamedDefinition__Group_25__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5146:1: ( ( '<' ) )
            // InternalSimpleIDL.g:5147:1: ( '<' )
            {
            // InternalSimpleIDL.g:5147:1: ( '<' )
            // InternalSimpleIDL.g:5148:2: '<'
            {
             before(grammarAccess.getNamedDefinitionAccess().getLessThanSignKeyword_25_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getLessThanSignKeyword_25_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_25__3__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_25__4"
    // InternalSimpleIDL.g:5157:1: rule__NamedDefinition__Group_25__4 : rule__NamedDefinition__Group_25__4__Impl rule__NamedDefinition__Group_25__5 ;
    public final void rule__NamedDefinition__Group_25__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5161:1: ( rule__NamedDefinition__Group_25__4__Impl rule__NamedDefinition__Group_25__5 )
            // InternalSimpleIDL.g:5162:2: rule__NamedDefinition__Group_25__4__Impl rule__NamedDefinition__Group_25__5
            {
            pushFollow(FOLLOW_37);
            rule__NamedDefinition__Group_25__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_25__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_25__4"


    // $ANTLR start "rule__NamedDefinition__Group_25__4__Impl"
    // InternalSimpleIDL.g:5169:1: rule__NamedDefinition__Group_25__4__Impl : ( ( rule__NamedDefinition__TotalDigitsAssignment_25_4 ) ) ;
    public final void rule__NamedDefinition__Group_25__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5173:1: ( ( ( rule__NamedDefinition__TotalDigitsAssignment_25_4 ) ) )
            // InternalSimpleIDL.g:5174:1: ( ( rule__NamedDefinition__TotalDigitsAssignment_25_4 ) )
            {
            // InternalSimpleIDL.g:5174:1: ( ( rule__NamedDefinition__TotalDigitsAssignment_25_4 ) )
            // InternalSimpleIDL.g:5175:2: ( rule__NamedDefinition__TotalDigitsAssignment_25_4 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getTotalDigitsAssignment_25_4()); 
            // InternalSimpleIDL.g:5176:2: ( rule__NamedDefinition__TotalDigitsAssignment_25_4 )
            // InternalSimpleIDL.g:5176:3: rule__NamedDefinition__TotalDigitsAssignment_25_4
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__TotalDigitsAssignment_25_4();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getTotalDigitsAssignment_25_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_25__4__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_25__5"
    // InternalSimpleIDL.g:5184:1: rule__NamedDefinition__Group_25__5 : rule__NamedDefinition__Group_25__5__Impl rule__NamedDefinition__Group_25__6 ;
    public final void rule__NamedDefinition__Group_25__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5188:1: ( rule__NamedDefinition__Group_25__5__Impl rule__NamedDefinition__Group_25__6 )
            // InternalSimpleIDL.g:5189:2: rule__NamedDefinition__Group_25__5__Impl rule__NamedDefinition__Group_25__6
            {
            pushFollow(FOLLOW_26);
            rule__NamedDefinition__Group_25__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_25__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_25__5"


    // $ANTLR start "rule__NamedDefinition__Group_25__5__Impl"
    // InternalSimpleIDL.g:5196:1: rule__NamedDefinition__Group_25__5__Impl : ( ',' ) ;
    public final void rule__NamedDefinition__Group_25__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5200:1: ( ( ',' ) )
            // InternalSimpleIDL.g:5201:1: ( ',' )
            {
            // InternalSimpleIDL.g:5201:1: ( ',' )
            // InternalSimpleIDL.g:5202:2: ','
            {
             before(grammarAccess.getNamedDefinitionAccess().getCommaKeyword_25_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getCommaKeyword_25_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_25__5__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_25__6"
    // InternalSimpleIDL.g:5211:1: rule__NamedDefinition__Group_25__6 : rule__NamedDefinition__Group_25__6__Impl rule__NamedDefinition__Group_25__7 ;
    public final void rule__NamedDefinition__Group_25__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5215:1: ( rule__NamedDefinition__Group_25__6__Impl rule__NamedDefinition__Group_25__7 )
            // InternalSimpleIDL.g:5216:2: rule__NamedDefinition__Group_25__6__Impl rule__NamedDefinition__Group_25__7
            {
            pushFollow(FOLLOW_38);
            rule__NamedDefinition__Group_25__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_25__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_25__6"


    // $ANTLR start "rule__NamedDefinition__Group_25__6__Impl"
    // InternalSimpleIDL.g:5223:1: rule__NamedDefinition__Group_25__6__Impl : ( ( rule__NamedDefinition__FractionalDigitsAssignment_25_6 ) ) ;
    public final void rule__NamedDefinition__Group_25__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5227:1: ( ( ( rule__NamedDefinition__FractionalDigitsAssignment_25_6 ) ) )
            // InternalSimpleIDL.g:5228:1: ( ( rule__NamedDefinition__FractionalDigitsAssignment_25_6 ) )
            {
            // InternalSimpleIDL.g:5228:1: ( ( rule__NamedDefinition__FractionalDigitsAssignment_25_6 ) )
            // InternalSimpleIDL.g:5229:2: ( rule__NamedDefinition__FractionalDigitsAssignment_25_6 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getFractionalDigitsAssignment_25_6()); 
            // InternalSimpleIDL.g:5230:2: ( rule__NamedDefinition__FractionalDigitsAssignment_25_6 )
            // InternalSimpleIDL.g:5230:3: rule__NamedDefinition__FractionalDigitsAssignment_25_6
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__FractionalDigitsAssignment_25_6();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getFractionalDigitsAssignment_25_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_25__6__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_25__7"
    // InternalSimpleIDL.g:5238:1: rule__NamedDefinition__Group_25__7 : rule__NamedDefinition__Group_25__7__Impl rule__NamedDefinition__Group_25__8 ;
    public final void rule__NamedDefinition__Group_25__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5242:1: ( rule__NamedDefinition__Group_25__7__Impl rule__NamedDefinition__Group_25__8 )
            // InternalSimpleIDL.g:5243:2: rule__NamedDefinition__Group_25__7__Impl rule__NamedDefinition__Group_25__8
            {
            pushFollow(FOLLOW_5);
            rule__NamedDefinition__Group_25__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_25__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_25__7"


    // $ANTLR start "rule__NamedDefinition__Group_25__7__Impl"
    // InternalSimpleIDL.g:5250:1: rule__NamedDefinition__Group_25__7__Impl : ( '>' ) ;
    public final void rule__NamedDefinition__Group_25__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5254:1: ( ( '>' ) )
            // InternalSimpleIDL.g:5255:1: ( '>' )
            {
            // InternalSimpleIDL.g:5255:1: ( '>' )
            // InternalSimpleIDL.g:5256:2: '>'
            {
             before(grammarAccess.getNamedDefinitionAccess().getGreaterThanSignKeyword_25_7()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getGreaterThanSignKeyword_25_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_25__7__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_25__8"
    // InternalSimpleIDL.g:5265:1: rule__NamedDefinition__Group_25__8 : rule__NamedDefinition__Group_25__8__Impl rule__NamedDefinition__Group_25__9 ;
    public final void rule__NamedDefinition__Group_25__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5269:1: ( rule__NamedDefinition__Group_25__8__Impl rule__NamedDefinition__Group_25__9 )
            // InternalSimpleIDL.g:5270:2: rule__NamedDefinition__Group_25__8__Impl rule__NamedDefinition__Group_25__9
            {
            pushFollow(FOLLOW_6);
            rule__NamedDefinition__Group_25__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_25__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_25__8"


    // $ANTLR start "rule__NamedDefinition__Group_25__8__Impl"
    // InternalSimpleIDL.g:5277:1: rule__NamedDefinition__Group_25__8__Impl : ( ( rule__NamedDefinition__NameAssignment_25_8 ) ) ;
    public final void rule__NamedDefinition__Group_25__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5281:1: ( ( ( rule__NamedDefinition__NameAssignment_25_8 ) ) )
            // InternalSimpleIDL.g:5282:1: ( ( rule__NamedDefinition__NameAssignment_25_8 ) )
            {
            // InternalSimpleIDL.g:5282:1: ( ( rule__NamedDefinition__NameAssignment_25_8 ) )
            // InternalSimpleIDL.g:5283:2: ( rule__NamedDefinition__NameAssignment_25_8 )
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameAssignment_25_8()); 
            // InternalSimpleIDL.g:5284:2: ( rule__NamedDefinition__NameAssignment_25_8 )
            // InternalSimpleIDL.g:5284:3: rule__NamedDefinition__NameAssignment_25_8
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__NameAssignment_25_8();

            state._fsp--;


            }

             after(grammarAccess.getNamedDefinitionAccess().getNameAssignment_25_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_25__8__Impl"


    // $ANTLR start "rule__NamedDefinition__Group_25__9"
    // InternalSimpleIDL.g:5292:1: rule__NamedDefinition__Group_25__9 : rule__NamedDefinition__Group_25__9__Impl ;
    public final void rule__NamedDefinition__Group_25__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5296:1: ( rule__NamedDefinition__Group_25__9__Impl )
            // InternalSimpleIDL.g:5297:2: rule__NamedDefinition__Group_25__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedDefinition__Group_25__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_25__9"


    // $ANTLR start "rule__NamedDefinition__Group_25__9__Impl"
    // InternalSimpleIDL.g:5303:1: rule__NamedDefinition__Group_25__9__Impl : ( ';' ) ;
    public final void rule__NamedDefinition__Group_25__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5307:1: ( ( ';' ) )
            // InternalSimpleIDL.g:5308:1: ( ';' )
            {
            // InternalSimpleIDL.g:5308:1: ( ';' )
            // InternalSimpleIDL.g:5309:2: ';'
            {
             before(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_25_9()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_25_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__Group_25__9__Impl"


    // $ANTLR start "rule__Member__Group__0"
    // InternalSimpleIDL.g:5319:1: rule__Member__Group__0 : rule__Member__Group__0__Impl rule__Member__Group__1 ;
    public final void rule__Member__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5323:1: ( rule__Member__Group__0__Impl rule__Member__Group__1 )
            // InternalSimpleIDL.g:5324:2: rule__Member__Group__0__Impl rule__Member__Group__1
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
    // InternalSimpleIDL.g:5331:1: rule__Member__Group__0__Impl : ( ( rule__Member__TypeAssignment_0 ) ) ;
    public final void rule__Member__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5335:1: ( ( ( rule__Member__TypeAssignment_0 ) ) )
            // InternalSimpleIDL.g:5336:1: ( ( rule__Member__TypeAssignment_0 ) )
            {
            // InternalSimpleIDL.g:5336:1: ( ( rule__Member__TypeAssignment_0 ) )
            // InternalSimpleIDL.g:5337:2: ( rule__Member__TypeAssignment_0 )
            {
             before(grammarAccess.getMemberAccess().getTypeAssignment_0()); 
            // InternalSimpleIDL.g:5338:2: ( rule__Member__TypeAssignment_0 )
            // InternalSimpleIDL.g:5338:3: rule__Member__TypeAssignment_0
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
    // InternalSimpleIDL.g:5346:1: rule__Member__Group__1 : rule__Member__Group__1__Impl rule__Member__Group__2 ;
    public final void rule__Member__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5350:1: ( rule__Member__Group__1__Impl rule__Member__Group__2 )
            // InternalSimpleIDL.g:5351:2: rule__Member__Group__1__Impl rule__Member__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalSimpleIDL.g:5358:1: rule__Member__Group__1__Impl : ( ( rule__Member__NameAssignment_1 ) ) ;
    public final void rule__Member__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5362:1: ( ( ( rule__Member__NameAssignment_1 ) ) )
            // InternalSimpleIDL.g:5363:1: ( ( rule__Member__NameAssignment_1 ) )
            {
            // InternalSimpleIDL.g:5363:1: ( ( rule__Member__NameAssignment_1 ) )
            // InternalSimpleIDL.g:5364:2: ( rule__Member__NameAssignment_1 )
            {
             before(grammarAccess.getMemberAccess().getNameAssignment_1()); 
            // InternalSimpleIDL.g:5365:2: ( rule__Member__NameAssignment_1 )
            // InternalSimpleIDL.g:5365:3: rule__Member__NameAssignment_1
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
    // InternalSimpleIDL.g:5373:1: rule__Member__Group__2 : rule__Member__Group__2__Impl ;
    public final void rule__Member__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5377:1: ( rule__Member__Group__2__Impl )
            // InternalSimpleIDL.g:5378:2: rule__Member__Group__2__Impl
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
    // InternalSimpleIDL.g:5384:1: rule__Member__Group__2__Impl : ( ';' ) ;
    public final void rule__Member__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5388:1: ( ( ';' ) )
            // InternalSimpleIDL.g:5389:1: ( ';' )
            {
            // InternalSimpleIDL.g:5389:1: ( ';' )
            // InternalSimpleIDL.g:5390:2: ';'
            {
             before(grammarAccess.getMemberAccess().getSemicolonKeyword_2()); 
            match(input,13,FOLLOW_2); 
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
    // InternalSimpleIDL.g:5400:1: rule__Case__Group__0 : rule__Case__Group__0__Impl rule__Case__Group__1 ;
    public final void rule__Case__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5404:1: ( rule__Case__Group__0__Impl rule__Case__Group__1 )
            // InternalSimpleIDL.g:5405:2: rule__Case__Group__0__Impl rule__Case__Group__1
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
    // InternalSimpleIDL.g:5412:1: rule__Case__Group__0__Impl : ( ( ( rule__Case__Group_0__0 ) ) ( ( rule__Case__Group_0__0 )* ) ) ;
    public final void rule__Case__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5416:1: ( ( ( ( rule__Case__Group_0__0 ) ) ( ( rule__Case__Group_0__0 )* ) ) )
            // InternalSimpleIDL.g:5417:1: ( ( ( rule__Case__Group_0__0 ) ) ( ( rule__Case__Group_0__0 )* ) )
            {
            // InternalSimpleIDL.g:5417:1: ( ( ( rule__Case__Group_0__0 ) ) ( ( rule__Case__Group_0__0 )* ) )
            // InternalSimpleIDL.g:5418:2: ( ( rule__Case__Group_0__0 ) ) ( ( rule__Case__Group_0__0 )* )
            {
            // InternalSimpleIDL.g:5418:2: ( ( rule__Case__Group_0__0 ) )
            // InternalSimpleIDL.g:5419:3: ( rule__Case__Group_0__0 )
            {
             before(grammarAccess.getCaseAccess().getGroup_0()); 
            // InternalSimpleIDL.g:5420:3: ( rule__Case__Group_0__0 )
            // InternalSimpleIDL.g:5420:4: rule__Case__Group_0__0
            {
            pushFollow(FOLLOW_20);
            rule__Case__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getGroup_0()); 

            }

            // InternalSimpleIDL.g:5423:2: ( ( rule__Case__Group_0__0 )* )
            // InternalSimpleIDL.g:5424:3: ( rule__Case__Group_0__0 )*
            {
             before(grammarAccess.getCaseAccess().getGroup_0()); 
            // InternalSimpleIDL.g:5425:3: ( rule__Case__Group_0__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==41) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSimpleIDL.g:5425:4: rule__Case__Group_0__0
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
    // InternalSimpleIDL.g:5434:1: rule__Case__Group__1 : rule__Case__Group__1__Impl rule__Case__Group__2 ;
    public final void rule__Case__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5438:1: ( rule__Case__Group__1__Impl rule__Case__Group__2 )
            // InternalSimpleIDL.g:5439:2: rule__Case__Group__1__Impl rule__Case__Group__2
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
    // InternalSimpleIDL.g:5446:1: rule__Case__Group__1__Impl : ( ( rule__Case__TypeAssignment_1 ) ) ;
    public final void rule__Case__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5450:1: ( ( ( rule__Case__TypeAssignment_1 ) ) )
            // InternalSimpleIDL.g:5451:1: ( ( rule__Case__TypeAssignment_1 ) )
            {
            // InternalSimpleIDL.g:5451:1: ( ( rule__Case__TypeAssignment_1 ) )
            // InternalSimpleIDL.g:5452:2: ( rule__Case__TypeAssignment_1 )
            {
             before(grammarAccess.getCaseAccess().getTypeAssignment_1()); 
            // InternalSimpleIDL.g:5453:2: ( rule__Case__TypeAssignment_1 )
            // InternalSimpleIDL.g:5453:3: rule__Case__TypeAssignment_1
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
    // InternalSimpleIDL.g:5461:1: rule__Case__Group__2 : rule__Case__Group__2__Impl rule__Case__Group__3 ;
    public final void rule__Case__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5465:1: ( rule__Case__Group__2__Impl rule__Case__Group__3 )
            // InternalSimpleIDL.g:5466:2: rule__Case__Group__2__Impl rule__Case__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSimpleIDL.g:5473:1: rule__Case__Group__2__Impl : ( ( rule__Case__NameAssignment_2 ) ) ;
    public final void rule__Case__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5477:1: ( ( ( rule__Case__NameAssignment_2 ) ) )
            // InternalSimpleIDL.g:5478:1: ( ( rule__Case__NameAssignment_2 ) )
            {
            // InternalSimpleIDL.g:5478:1: ( ( rule__Case__NameAssignment_2 ) )
            // InternalSimpleIDL.g:5479:2: ( rule__Case__NameAssignment_2 )
            {
             before(grammarAccess.getCaseAccess().getNameAssignment_2()); 
            // InternalSimpleIDL.g:5480:2: ( rule__Case__NameAssignment_2 )
            // InternalSimpleIDL.g:5480:3: rule__Case__NameAssignment_2
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
    // InternalSimpleIDL.g:5488:1: rule__Case__Group__3 : rule__Case__Group__3__Impl ;
    public final void rule__Case__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5492:1: ( rule__Case__Group__3__Impl )
            // InternalSimpleIDL.g:5493:2: rule__Case__Group__3__Impl
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
    // InternalSimpleIDL.g:5499:1: rule__Case__Group__3__Impl : ( ';' ) ;
    public final void rule__Case__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5503:1: ( ( ';' ) )
            // InternalSimpleIDL.g:5504:1: ( ';' )
            {
            // InternalSimpleIDL.g:5504:1: ( ';' )
            // InternalSimpleIDL.g:5505:2: ';'
            {
             before(grammarAccess.getCaseAccess().getSemicolonKeyword_3()); 
            match(input,13,FOLLOW_2); 
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
    // InternalSimpleIDL.g:5515:1: rule__Case__Group_0__0 : rule__Case__Group_0__0__Impl rule__Case__Group_0__1 ;
    public final void rule__Case__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5519:1: ( rule__Case__Group_0__0__Impl rule__Case__Group_0__1 )
            // InternalSimpleIDL.g:5520:2: rule__Case__Group_0__0__Impl rule__Case__Group_0__1
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
    // InternalSimpleIDL.g:5527:1: rule__Case__Group_0__0__Impl : ( 'case' ) ;
    public final void rule__Case__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5531:1: ( ( 'case' ) )
            // InternalSimpleIDL.g:5532:1: ( 'case' )
            {
            // InternalSimpleIDL.g:5532:1: ( 'case' )
            // InternalSimpleIDL.g:5533:2: 'case'
            {
             before(grammarAccess.getCaseAccess().getCaseKeyword_0_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSimpleIDL.g:5542:1: rule__Case__Group_0__1 : rule__Case__Group_0__1__Impl rule__Case__Group_0__2 ;
    public final void rule__Case__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5546:1: ( rule__Case__Group_0__1__Impl rule__Case__Group_0__2 )
            // InternalSimpleIDL.g:5547:2: rule__Case__Group_0__1__Impl rule__Case__Group_0__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalSimpleIDL.g:5554:1: rule__Case__Group_0__1__Impl : ( ( rule__Case__LabelsAssignment_0_1 ) ) ;
    public final void rule__Case__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5558:1: ( ( ( rule__Case__LabelsAssignment_0_1 ) ) )
            // InternalSimpleIDL.g:5559:1: ( ( rule__Case__LabelsAssignment_0_1 ) )
            {
            // InternalSimpleIDL.g:5559:1: ( ( rule__Case__LabelsAssignment_0_1 ) )
            // InternalSimpleIDL.g:5560:2: ( rule__Case__LabelsAssignment_0_1 )
            {
             before(grammarAccess.getCaseAccess().getLabelsAssignment_0_1()); 
            // InternalSimpleIDL.g:5561:2: ( rule__Case__LabelsAssignment_0_1 )
            // InternalSimpleIDL.g:5561:3: rule__Case__LabelsAssignment_0_1
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
    // InternalSimpleIDL.g:5569:1: rule__Case__Group_0__2 : rule__Case__Group_0__2__Impl ;
    public final void rule__Case__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5573:1: ( rule__Case__Group_0__2__Impl )
            // InternalSimpleIDL.g:5574:2: rule__Case__Group_0__2__Impl
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
    // InternalSimpleIDL.g:5580:1: rule__Case__Group_0__2__Impl : ( ':' ) ;
    public final void rule__Case__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5584:1: ( ( ':' ) )
            // InternalSimpleIDL.g:5585:1: ( ':' )
            {
            // InternalSimpleIDL.g:5585:1: ( ':' )
            // InternalSimpleIDL.g:5586:2: ':'
            {
             before(grammarAccess.getCaseAccess().getColonKeyword_0_2()); 
            match(input,42,FOLLOW_2); 
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


    // $ANTLR start "rule__ScopedName__Group__0"
    // InternalSimpleIDL.g:5596:1: rule__ScopedName__Group__0 : rule__ScopedName__Group__0__Impl rule__ScopedName__Group__1 ;
    public final void rule__ScopedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5600:1: ( rule__ScopedName__Group__0__Impl rule__ScopedName__Group__1 )
            // InternalSimpleIDL.g:5601:2: rule__ScopedName__Group__0__Impl rule__ScopedName__Group__1
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
    // InternalSimpleIDL.g:5608:1: rule__ScopedName__Group__0__Impl : ( ( '::' )? ) ;
    public final void rule__ScopedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5612:1: ( ( ( '::' )? ) )
            // InternalSimpleIDL.g:5613:1: ( ( '::' )? )
            {
            // InternalSimpleIDL.g:5613:1: ( ( '::' )? )
            // InternalSimpleIDL.g:5614:2: ( '::' )?
            {
             before(grammarAccess.getScopedNameAccess().getColonColonKeyword_0()); 
            // InternalSimpleIDL.g:5615:2: ( '::' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==43) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSimpleIDL.g:5615:3: '::'
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
    // InternalSimpleIDL.g:5623:1: rule__ScopedName__Group__1 : rule__ScopedName__Group__1__Impl rule__ScopedName__Group__2 ;
    public final void rule__ScopedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5627:1: ( rule__ScopedName__Group__1__Impl rule__ScopedName__Group__2 )
            // InternalSimpleIDL.g:5628:2: rule__ScopedName__Group__1__Impl rule__ScopedName__Group__2
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
    // InternalSimpleIDL.g:5635:1: rule__ScopedName__Group__1__Impl : ( ( rule__ScopedName__Group_1__0 )* ) ;
    public final void rule__ScopedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5639:1: ( ( ( rule__ScopedName__Group_1__0 )* ) )
            // InternalSimpleIDL.g:5640:1: ( ( rule__ScopedName__Group_1__0 )* )
            {
            // InternalSimpleIDL.g:5640:1: ( ( rule__ScopedName__Group_1__0 )* )
            // InternalSimpleIDL.g:5641:2: ( rule__ScopedName__Group_1__0 )*
            {
             before(grammarAccess.getScopedNameAccess().getGroup_1()); 
            // InternalSimpleIDL.g:5642:2: ( rule__ScopedName__Group_1__0 )*
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
            	    // InternalSimpleIDL.g:5642:3: rule__ScopedName__Group_1__0
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
    // InternalSimpleIDL.g:5650:1: rule__ScopedName__Group__2 : rule__ScopedName__Group__2__Impl ;
    public final void rule__ScopedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5654:1: ( rule__ScopedName__Group__2__Impl )
            // InternalSimpleIDL.g:5655:2: rule__ScopedName__Group__2__Impl
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
    // InternalSimpleIDL.g:5661:1: rule__ScopedName__Group__2__Impl : ( RULE_ID ) ;
    public final void rule__ScopedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5665:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:5666:1: ( RULE_ID )
            {
            // InternalSimpleIDL.g:5666:1: ( RULE_ID )
            // InternalSimpleIDL.g:5667:2: RULE_ID
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
    // InternalSimpleIDL.g:5677:1: rule__ScopedName__Group_1__0 : rule__ScopedName__Group_1__0__Impl rule__ScopedName__Group_1__1 ;
    public final void rule__ScopedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5681:1: ( rule__ScopedName__Group_1__0__Impl rule__ScopedName__Group_1__1 )
            // InternalSimpleIDL.g:5682:2: rule__ScopedName__Group_1__0__Impl rule__ScopedName__Group_1__1
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
    // InternalSimpleIDL.g:5689:1: rule__ScopedName__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__ScopedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5693:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:5694:1: ( RULE_ID )
            {
            // InternalSimpleIDL.g:5694:1: ( RULE_ID )
            // InternalSimpleIDL.g:5695:2: RULE_ID
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
    // InternalSimpleIDL.g:5704:1: rule__ScopedName__Group_1__1 : rule__ScopedName__Group_1__1__Impl ;
    public final void rule__ScopedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5708:1: ( rule__ScopedName__Group_1__1__Impl )
            // InternalSimpleIDL.g:5709:2: rule__ScopedName__Group_1__1__Impl
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
    // InternalSimpleIDL.g:5715:1: rule__ScopedName__Group_1__1__Impl : ( '::' ) ;
    public final void rule__ScopedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5719:1: ( ( '::' ) )
            // InternalSimpleIDL.g:5720:1: ( '::' )
            {
            // InternalSimpleIDL.g:5720:1: ( '::' )
            // InternalSimpleIDL.g:5721:2: '::'
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
    // InternalSimpleIDL.g:5731:1: rule__Specification__DefinitionsAssignment : ( ruleDefinition ) ;
    public final void rule__Specification__DefinitionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5735:1: ( ( ruleDefinition ) )
            // InternalSimpleIDL.g:5736:2: ( ruleDefinition )
            {
            // InternalSimpleIDL.g:5736:2: ( ruleDefinition )
            // InternalSimpleIDL.g:5737:3: ruleDefinition
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


    // $ANTLR start "rule__Definition__StructAssignment_1_2"
    // InternalSimpleIDL.g:5746:1: rule__Definition__StructAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Definition__StructAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5750:1: ( ( ( RULE_ID ) ) )
            // InternalSimpleIDL.g:5751:2: ( ( RULE_ID ) )
            {
            // InternalSimpleIDL.g:5751:2: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:5752:3: ( RULE_ID )
            {
             before(grammarAccess.getDefinitionAccess().getStructStructCrossReference_1_2_0()); 
            // InternalSimpleIDL.g:5753:3: ( RULE_ID )
            // InternalSimpleIDL.g:5754:4: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getStructStructIDTerminalRuleCall_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getStructStructIDTerminalRuleCall_1_2_0_1()); 

            }

             after(grammarAccess.getDefinitionAccess().getStructStructCrossReference_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__StructAssignment_1_2"


    // $ANTLR start "rule__NamedDefinition__NameAssignment_0_2"
    // InternalSimpleIDL.g:5765:1: rule__NamedDefinition__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__NamedDefinition__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5769:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:5770:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:5770:2: ( RULE_ID )
            // InternalSimpleIDL.g:5771:3: RULE_ID
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__NameAssignment_0_2"


    // $ANTLR start "rule__NamedDefinition__DefinitionsAssignment_0_4"
    // InternalSimpleIDL.g:5780:1: rule__NamedDefinition__DefinitionsAssignment_0_4 : ( ruleDefinition ) ;
    public final void rule__NamedDefinition__DefinitionsAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5784:1: ( ( ruleDefinition ) )
            // InternalSimpleIDL.g:5785:2: ( ruleDefinition )
            {
            // InternalSimpleIDL.g:5785:2: ( ruleDefinition )
            // InternalSimpleIDL.g:5786:3: ruleDefinition
            {
             before(grammarAccess.getNamedDefinitionAccess().getDefinitionsDefinitionParserRuleCall_0_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getNamedDefinitionAccess().getDefinitionsDefinitionParserRuleCall_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__DefinitionsAssignment_0_4"


    // $ANTLR start "rule__NamedDefinition__NameAssignment_1_2"
    // InternalSimpleIDL.g:5795:1: rule__NamedDefinition__NameAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__NamedDefinition__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5799:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:5800:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:5800:2: ( RULE_ID )
            // InternalSimpleIDL.g:5801:3: RULE_ID
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__NameAssignment_1_2"


    // $ANTLR start "rule__NamedDefinition__MembersAssignment_1_4"
    // InternalSimpleIDL.g:5810:1: rule__NamedDefinition__MembersAssignment_1_4 : ( ruleMember ) ;
    public final void rule__NamedDefinition__MembersAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5814:1: ( ( ruleMember ) )
            // InternalSimpleIDL.g:5815:2: ( ruleMember )
            {
            // InternalSimpleIDL.g:5815:2: ( ruleMember )
            // InternalSimpleIDL.g:5816:3: ruleMember
            {
             before(grammarAccess.getNamedDefinitionAccess().getMembersMemberParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getNamedDefinitionAccess().getMembersMemberParserRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__MembersAssignment_1_4"


    // $ANTLR start "rule__NamedDefinition__NameAssignment_2_2"
    // InternalSimpleIDL.g:5825:1: rule__NamedDefinition__NameAssignment_2_2 : ( RULE_ID ) ;
    public final void rule__NamedDefinition__NameAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5829:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:5830:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:5830:2: ( RULE_ID )
            // InternalSimpleIDL.g:5831:3: RULE_ID
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_2_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__NameAssignment_2_2"


    // $ANTLR start "rule__NamedDefinition__CasesAssignment_2_10"
    // InternalSimpleIDL.g:5840:1: rule__NamedDefinition__CasesAssignment_2_10 : ( ruleCase ) ;
    public final void rule__NamedDefinition__CasesAssignment_2_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5844:1: ( ( ruleCase ) )
            // InternalSimpleIDL.g:5845:2: ( ruleCase )
            {
            // InternalSimpleIDL.g:5845:2: ( ruleCase )
            // InternalSimpleIDL.g:5846:3: ruleCase
            {
             before(grammarAccess.getNamedDefinitionAccess().getCasesCaseParserRuleCall_2_10_0()); 
            pushFollow(FOLLOW_2);
            ruleCase();

            state._fsp--;

             after(grammarAccess.getNamedDefinitionAccess().getCasesCaseParserRuleCall_2_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__CasesAssignment_2_10"


    // $ANTLR start "rule__NamedDefinition__NameAssignment_3_2"
    // InternalSimpleIDL.g:5855:1: rule__NamedDefinition__NameAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__NamedDefinition__NameAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5859:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:5860:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:5860:2: ( RULE_ID )
            // InternalSimpleIDL.g:5861:3: RULE_ID
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_3_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__NameAssignment_3_2"


    // $ANTLR start "rule__NamedDefinition__LiteralsAssignment_3_4"
    // InternalSimpleIDL.g:5870:1: rule__NamedDefinition__LiteralsAssignment_3_4 : ( RULE_ID ) ;
    public final void rule__NamedDefinition__LiteralsAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5874:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:5875:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:5875:2: ( RULE_ID )
            // InternalSimpleIDL.g:5876:3: RULE_ID
            {
             before(grammarAccess.getNamedDefinitionAccess().getLiteralsIDTerminalRuleCall_3_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getLiteralsIDTerminalRuleCall_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__LiteralsAssignment_3_4"


    // $ANTLR start "rule__NamedDefinition__LiteralsAssignment_3_5_1"
    // InternalSimpleIDL.g:5885:1: rule__NamedDefinition__LiteralsAssignment_3_5_1 : ( RULE_ID ) ;
    public final void rule__NamedDefinition__LiteralsAssignment_3_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5889:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:5890:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:5890:2: ( RULE_ID )
            // InternalSimpleIDL.g:5891:3: RULE_ID
            {
             before(grammarAccess.getNamedDefinitionAccess().getLiteralsIDTerminalRuleCall_3_5_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getLiteralsIDTerminalRuleCall_3_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__LiteralsAssignment_3_5_1"


    // $ANTLR start "rule__NamedDefinition__TypeAssignment_4_2"
    // InternalSimpleIDL.g:5900:1: rule__NamedDefinition__TypeAssignment_4_2 : ( ( ruleScopedName ) ) ;
    public final void rule__NamedDefinition__TypeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5904:1: ( ( ( ruleScopedName ) ) )
            // InternalSimpleIDL.g:5905:2: ( ( ruleScopedName ) )
            {
            // InternalSimpleIDL.g:5905:2: ( ( ruleScopedName ) )
            // InternalSimpleIDL.g:5906:3: ( ruleScopedName )
            {
             before(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionCrossReference_4_2_0()); 
            // InternalSimpleIDL.g:5907:3: ( ruleScopedName )
            // InternalSimpleIDL.g:5908:4: ruleScopedName
            {
             before(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionScopedNameParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleScopedName();

            state._fsp--;

             after(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionScopedNameParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__TypeAssignment_4_2"


    // $ANTLR start "rule__NamedDefinition__NameAssignment_4_3"
    // InternalSimpleIDL.g:5919:1: rule__NamedDefinition__NameAssignment_4_3 : ( RULE_ID ) ;
    public final void rule__NamedDefinition__NameAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5923:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:5924:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:5924:2: ( RULE_ID )
            // InternalSimpleIDL.g:5925:3: RULE_ID
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_4_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__NameAssignment_4_3"


    // $ANTLR start "rule__NamedDefinition__SizeAssignment_4_5"
    // InternalSimpleIDL.g:5934:1: rule__NamedDefinition__SizeAssignment_4_5 : ( RULE_INT ) ;
    public final void rule__NamedDefinition__SizeAssignment_4_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5938:1: ( ( RULE_INT ) )
            // InternalSimpleIDL.g:5939:2: ( RULE_INT )
            {
            // InternalSimpleIDL.g:5939:2: ( RULE_INT )
            // InternalSimpleIDL.g:5940:3: RULE_INT
            {
             before(grammarAccess.getNamedDefinitionAccess().getSizeINTTerminalRuleCall_4_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getSizeINTTerminalRuleCall_4_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__SizeAssignment_4_5"


    // $ANTLR start "rule__NamedDefinition__NameAssignment_5_3"
    // InternalSimpleIDL.g:5949:1: rule__NamedDefinition__NameAssignment_5_3 : ( RULE_ID ) ;
    public final void rule__NamedDefinition__NameAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5953:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:5954:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:5954:2: ( RULE_ID )
            // InternalSimpleIDL.g:5955:3: RULE_ID
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_5_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__NameAssignment_5_3"


    // $ANTLR start "rule__NamedDefinition__NameAssignment_6_3"
    // InternalSimpleIDL.g:5964:1: rule__NamedDefinition__NameAssignment_6_3 : ( RULE_ID ) ;
    public final void rule__NamedDefinition__NameAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5968:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:5969:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:5969:2: ( RULE_ID )
            // InternalSimpleIDL.g:5970:3: RULE_ID
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_6_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__NameAssignment_6_3"


    // $ANTLR start "rule__NamedDefinition__NameAssignment_7_4"
    // InternalSimpleIDL.g:5979:1: rule__NamedDefinition__NameAssignment_7_4 : ( RULE_ID ) ;
    public final void rule__NamedDefinition__NameAssignment_7_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5983:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:5984:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:5984:2: ( RULE_ID )
            // InternalSimpleIDL.g:5985:3: RULE_ID
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_7_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_7_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__NameAssignment_7_4"


    // $ANTLR start "rule__NamedDefinition__NameAssignment_8_4"
    // InternalSimpleIDL.g:5994:1: rule__NamedDefinition__NameAssignment_8_4 : ( RULE_ID ) ;
    public final void rule__NamedDefinition__NameAssignment_8_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:5998:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:5999:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:5999:2: ( RULE_ID )
            // InternalSimpleIDL.g:6000:3: RULE_ID
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_8_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_8_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__NameAssignment_8_4"


    // $ANTLR start "rule__NamedDefinition__NameAssignment_9_4"
    // InternalSimpleIDL.g:6009:1: rule__NamedDefinition__NameAssignment_9_4 : ( RULE_ID ) ;
    public final void rule__NamedDefinition__NameAssignment_9_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:6013:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:6014:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:6014:2: ( RULE_ID )
            // InternalSimpleIDL.g:6015:3: RULE_ID
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_9_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_9_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__NameAssignment_9_4"


    // $ANTLR start "rule__NamedDefinition__NameAssignment_10_5"
    // InternalSimpleIDL.g:6024:1: rule__NamedDefinition__NameAssignment_10_5 : ( RULE_ID ) ;
    public final void rule__NamedDefinition__NameAssignment_10_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:6028:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:6029:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:6029:2: ( RULE_ID )
            // InternalSimpleIDL.g:6030:3: RULE_ID
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_10_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_10_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__NameAssignment_10_5"


    // $ANTLR start "rule__NamedDefinition__NameAssignment_11_3"
    // InternalSimpleIDL.g:6039:1: rule__NamedDefinition__NameAssignment_11_3 : ( RULE_ID ) ;
    public final void rule__NamedDefinition__NameAssignment_11_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:6043:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:6044:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:6044:2: ( RULE_ID )
            // InternalSimpleIDL.g:6045:3: RULE_ID
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_11_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_11_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__NameAssignment_11_3"


    // $ANTLR start "rule__NamedDefinition__NameAssignment_12_3"
    // InternalSimpleIDL.g:6054:1: rule__NamedDefinition__NameAssignment_12_3 : ( RULE_ID ) ;
    public final void rule__NamedDefinition__NameAssignment_12_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:6058:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:6059:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:6059:2: ( RULE_ID )
            // InternalSimpleIDL.g:6060:3: RULE_ID
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_12_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_12_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__NameAssignment_12_3"


    // $ANTLR start "rule__NamedDefinition__NameAssignment_13_4"
    // InternalSimpleIDL.g:6069:1: rule__NamedDefinition__NameAssignment_13_4 : ( RULE_ID ) ;
    public final void rule__NamedDefinition__NameAssignment_13_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:6073:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:6074:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:6074:2: ( RULE_ID )
            // InternalSimpleIDL.g:6075:3: RULE_ID
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_13_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_13_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__NameAssignment_13_4"


    // $ANTLR start "rule__NamedDefinition__NameAssignment_14_3"
    // InternalSimpleIDL.g:6084:1: rule__NamedDefinition__NameAssignment_14_3 : ( RULE_ID ) ;
    public final void rule__NamedDefinition__NameAssignment_14_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:6088:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:6089:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:6089:2: ( RULE_ID )
            // InternalSimpleIDL.g:6090:3: RULE_ID
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_14_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_14_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__NameAssignment_14_3"


    // $ANTLR start "rule__NamedDefinition__NameAssignment_15_3"
    // InternalSimpleIDL.g:6099:1: rule__NamedDefinition__NameAssignment_15_3 : ( RULE_ID ) ;
    public final void rule__NamedDefinition__NameAssignment_15_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:6103:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:6104:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:6104:2: ( RULE_ID )
            // InternalSimpleIDL.g:6105:3: RULE_ID
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_15_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_15_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__NameAssignment_15_3"


    // $ANTLR start "rule__NamedDefinition__NameAssignment_16_3"
    // InternalSimpleIDL.g:6114:1: rule__NamedDefinition__NameAssignment_16_3 : ( RULE_ID ) ;
    public final void rule__NamedDefinition__NameAssignment_16_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:6118:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:6119:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:6119:2: ( RULE_ID )
            // InternalSimpleIDL.g:6120:3: RULE_ID
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_16_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_16_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__NameAssignment_16_3"


    // $ANTLR start "rule__NamedDefinition__NameAssignment_17_3"
    // InternalSimpleIDL.g:6129:1: rule__NamedDefinition__NameAssignment_17_3 : ( RULE_ID ) ;
    public final void rule__NamedDefinition__NameAssignment_17_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:6133:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:6134:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:6134:2: ( RULE_ID )
            // InternalSimpleIDL.g:6135:3: RULE_ID
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_17_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_17_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__NameAssignment_17_3"


    // $ANTLR start "rule__NamedDefinition__TypeAssignment_18_2"
    // InternalSimpleIDL.g:6144:1: rule__NamedDefinition__TypeAssignment_18_2 : ( ( ruleScopedName ) ) ;
    public final void rule__NamedDefinition__TypeAssignment_18_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:6148:1: ( ( ( ruleScopedName ) ) )
            // InternalSimpleIDL.g:6149:2: ( ( ruleScopedName ) )
            {
            // InternalSimpleIDL.g:6149:2: ( ( ruleScopedName ) )
            // InternalSimpleIDL.g:6150:3: ( ruleScopedName )
            {
             before(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionCrossReference_18_2_0()); 
            // InternalSimpleIDL.g:6151:3: ( ruleScopedName )
            // InternalSimpleIDL.g:6152:4: ruleScopedName
            {
             before(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionScopedNameParserRuleCall_18_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleScopedName();

            state._fsp--;

             after(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionScopedNameParserRuleCall_18_2_0_1()); 

            }

             after(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionCrossReference_18_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__TypeAssignment_18_2"


    // $ANTLR start "rule__NamedDefinition__NameAssignment_18_3"
    // InternalSimpleIDL.g:6163:1: rule__NamedDefinition__NameAssignment_18_3 : ( RULE_ID ) ;
    public final void rule__NamedDefinition__NameAssignment_18_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:6167:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:6168:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:6168:2: ( RULE_ID )
            // InternalSimpleIDL.g:6169:3: RULE_ID
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_18_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_18_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__NameAssignment_18_3"


    // $ANTLR start "rule__NamedDefinition__TypeAssignment_19_4"
    // InternalSimpleIDL.g:6178:1: rule__NamedDefinition__TypeAssignment_19_4 : ( ( ruleScopedName ) ) ;
    public final void rule__NamedDefinition__TypeAssignment_19_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:6182:1: ( ( ( ruleScopedName ) ) )
            // InternalSimpleIDL.g:6183:2: ( ( ruleScopedName ) )
            {
            // InternalSimpleIDL.g:6183:2: ( ( ruleScopedName ) )
            // InternalSimpleIDL.g:6184:3: ( ruleScopedName )
            {
             before(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionCrossReference_19_4_0()); 
            // InternalSimpleIDL.g:6185:3: ( ruleScopedName )
            // InternalSimpleIDL.g:6186:4: ruleScopedName
            {
             before(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionScopedNameParserRuleCall_19_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleScopedName();

            state._fsp--;

             after(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionScopedNameParserRuleCall_19_4_0_1()); 

            }

             after(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionCrossReference_19_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__TypeAssignment_19_4"


    // $ANTLR start "rule__NamedDefinition__SizeAssignment_19_6"
    // InternalSimpleIDL.g:6197:1: rule__NamedDefinition__SizeAssignment_19_6 : ( RULE_INT ) ;
    public final void rule__NamedDefinition__SizeAssignment_19_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:6201:1: ( ( RULE_INT ) )
            // InternalSimpleIDL.g:6202:2: ( RULE_INT )
            {
            // InternalSimpleIDL.g:6202:2: ( RULE_INT )
            // InternalSimpleIDL.g:6203:3: RULE_INT
            {
             before(grammarAccess.getNamedDefinitionAccess().getSizeINTTerminalRuleCall_19_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getSizeINTTerminalRuleCall_19_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__SizeAssignment_19_6"


    // $ANTLR start "rule__NamedDefinition__NameAssignment_19_8"
    // InternalSimpleIDL.g:6212:1: rule__NamedDefinition__NameAssignment_19_8 : ( RULE_ID ) ;
    public final void rule__NamedDefinition__NameAssignment_19_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:6216:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:6217:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:6217:2: ( RULE_ID )
            // InternalSimpleIDL.g:6218:3: RULE_ID
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_19_8_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_19_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__NameAssignment_19_8"


    // $ANTLR start "rule__NamedDefinition__TypeAssignment_20_4"
    // InternalSimpleIDL.g:6227:1: rule__NamedDefinition__TypeAssignment_20_4 : ( ( ruleScopedName ) ) ;
    public final void rule__NamedDefinition__TypeAssignment_20_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:6231:1: ( ( ( ruleScopedName ) ) )
            // InternalSimpleIDL.g:6232:2: ( ( ruleScopedName ) )
            {
            // InternalSimpleIDL.g:6232:2: ( ( ruleScopedName ) )
            // InternalSimpleIDL.g:6233:3: ( ruleScopedName )
            {
             before(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionCrossReference_20_4_0()); 
            // InternalSimpleIDL.g:6234:3: ( ruleScopedName )
            // InternalSimpleIDL.g:6235:4: ruleScopedName
            {
             before(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionScopedNameParserRuleCall_20_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleScopedName();

            state._fsp--;

             after(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionScopedNameParserRuleCall_20_4_0_1()); 

            }

             after(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionCrossReference_20_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__TypeAssignment_20_4"


    // $ANTLR start "rule__NamedDefinition__NameAssignment_20_6"
    // InternalSimpleIDL.g:6246:1: rule__NamedDefinition__NameAssignment_20_6 : ( RULE_ID ) ;
    public final void rule__NamedDefinition__NameAssignment_20_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:6250:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:6251:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:6251:2: ( RULE_ID )
            // InternalSimpleIDL.g:6252:3: RULE_ID
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_20_6_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_20_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__NameAssignment_20_6"


    // $ANTLR start "rule__NamedDefinition__SizeAssignment_21_4"
    // InternalSimpleIDL.g:6261:1: rule__NamedDefinition__SizeAssignment_21_4 : ( RULE_INT ) ;
    public final void rule__NamedDefinition__SizeAssignment_21_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:6265:1: ( ( RULE_INT ) )
            // InternalSimpleIDL.g:6266:2: ( RULE_INT )
            {
            // InternalSimpleIDL.g:6266:2: ( RULE_INT )
            // InternalSimpleIDL.g:6267:3: RULE_INT
            {
             before(grammarAccess.getNamedDefinitionAccess().getSizeINTTerminalRuleCall_21_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getSizeINTTerminalRuleCall_21_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__SizeAssignment_21_4"


    // $ANTLR start "rule__NamedDefinition__NameAssignment_21_6"
    // InternalSimpleIDL.g:6276:1: rule__NamedDefinition__NameAssignment_21_6 : ( RULE_ID ) ;
    public final void rule__NamedDefinition__NameAssignment_21_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:6280:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:6281:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:6281:2: ( RULE_ID )
            // InternalSimpleIDL.g:6282:3: RULE_ID
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_21_6_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_21_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__NameAssignment_21_6"


    // $ANTLR start "rule__NamedDefinition__NameAssignment_22_3"
    // InternalSimpleIDL.g:6291:1: rule__NamedDefinition__NameAssignment_22_3 : ( RULE_ID ) ;
    public final void rule__NamedDefinition__NameAssignment_22_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:6295:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:6296:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:6296:2: ( RULE_ID )
            // InternalSimpleIDL.g:6297:3: RULE_ID
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_22_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_22_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__NameAssignment_22_3"


    // $ANTLR start "rule__NamedDefinition__SizeAssignment_23_4"
    // InternalSimpleIDL.g:6306:1: rule__NamedDefinition__SizeAssignment_23_4 : ( RULE_INT ) ;
    public final void rule__NamedDefinition__SizeAssignment_23_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:6310:1: ( ( RULE_INT ) )
            // InternalSimpleIDL.g:6311:2: ( RULE_INT )
            {
            // InternalSimpleIDL.g:6311:2: ( RULE_INT )
            // InternalSimpleIDL.g:6312:3: RULE_INT
            {
             before(grammarAccess.getNamedDefinitionAccess().getSizeINTTerminalRuleCall_23_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getSizeINTTerminalRuleCall_23_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__SizeAssignment_23_4"


    // $ANTLR start "rule__NamedDefinition__NameAssignment_23_6"
    // InternalSimpleIDL.g:6321:1: rule__NamedDefinition__NameAssignment_23_6 : ( RULE_ID ) ;
    public final void rule__NamedDefinition__NameAssignment_23_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:6325:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:6326:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:6326:2: ( RULE_ID )
            // InternalSimpleIDL.g:6327:3: RULE_ID
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_23_6_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_23_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__NameAssignment_23_6"


    // $ANTLR start "rule__NamedDefinition__NameAssignment_24_3"
    // InternalSimpleIDL.g:6336:1: rule__NamedDefinition__NameAssignment_24_3 : ( RULE_ID ) ;
    public final void rule__NamedDefinition__NameAssignment_24_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:6340:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:6341:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:6341:2: ( RULE_ID )
            // InternalSimpleIDL.g:6342:3: RULE_ID
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_24_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_24_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__NameAssignment_24_3"


    // $ANTLR start "rule__NamedDefinition__TotalDigitsAssignment_25_4"
    // InternalSimpleIDL.g:6351:1: rule__NamedDefinition__TotalDigitsAssignment_25_4 : ( RULE_INT ) ;
    public final void rule__NamedDefinition__TotalDigitsAssignment_25_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:6355:1: ( ( RULE_INT ) )
            // InternalSimpleIDL.g:6356:2: ( RULE_INT )
            {
            // InternalSimpleIDL.g:6356:2: ( RULE_INT )
            // InternalSimpleIDL.g:6357:3: RULE_INT
            {
             before(grammarAccess.getNamedDefinitionAccess().getTotalDigitsINTTerminalRuleCall_25_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getTotalDigitsINTTerminalRuleCall_25_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__TotalDigitsAssignment_25_4"


    // $ANTLR start "rule__NamedDefinition__FractionalDigitsAssignment_25_6"
    // InternalSimpleIDL.g:6366:1: rule__NamedDefinition__FractionalDigitsAssignment_25_6 : ( RULE_INT ) ;
    public final void rule__NamedDefinition__FractionalDigitsAssignment_25_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:6370:1: ( ( RULE_INT ) )
            // InternalSimpleIDL.g:6371:2: ( RULE_INT )
            {
            // InternalSimpleIDL.g:6371:2: ( RULE_INT )
            // InternalSimpleIDL.g:6372:3: RULE_INT
            {
             before(grammarAccess.getNamedDefinitionAccess().getFractionalDigitsINTTerminalRuleCall_25_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getFractionalDigitsINTTerminalRuleCall_25_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__FractionalDigitsAssignment_25_6"


    // $ANTLR start "rule__NamedDefinition__NameAssignment_25_8"
    // InternalSimpleIDL.g:6381:1: rule__NamedDefinition__NameAssignment_25_8 : ( RULE_ID ) ;
    public final void rule__NamedDefinition__NameAssignment_25_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:6385:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:6386:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:6386:2: ( RULE_ID )
            // InternalSimpleIDL.g:6387:3: RULE_ID
            {
             before(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_25_8_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_25_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedDefinition__NameAssignment_25_8"


    // $ANTLR start "rule__Member__TypeAssignment_0"
    // InternalSimpleIDL.g:6396:1: rule__Member__TypeAssignment_0 : ( ( ruleScopedName ) ) ;
    public final void rule__Member__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:6400:1: ( ( ( ruleScopedName ) ) )
            // InternalSimpleIDL.g:6401:2: ( ( ruleScopedName ) )
            {
            // InternalSimpleIDL.g:6401:2: ( ( ruleScopedName ) )
            // InternalSimpleIDL.g:6402:3: ( ruleScopedName )
            {
             before(grammarAccess.getMemberAccess().getTypeNamedDefinitionCrossReference_0_0()); 
            // InternalSimpleIDL.g:6403:3: ( ruleScopedName )
            // InternalSimpleIDL.g:6404:4: ruleScopedName
            {
             before(grammarAccess.getMemberAccess().getTypeNamedDefinitionScopedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleScopedName();

            state._fsp--;

             after(grammarAccess.getMemberAccess().getTypeNamedDefinitionScopedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getMemberAccess().getTypeNamedDefinitionCrossReference_0_0()); 

            }


            }

        }
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
    // InternalSimpleIDL.g:6415:1: rule__Member__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Member__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:6419:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:6420:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:6420:2: ( RULE_ID )
            // InternalSimpleIDL.g:6421:3: RULE_ID
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
    // InternalSimpleIDL.g:6430:1: rule__Case__LabelsAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Case__LabelsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:6434:1: ( ( RULE_INT ) )
            // InternalSimpleIDL.g:6435:2: ( RULE_INT )
            {
            // InternalSimpleIDL.g:6435:2: ( RULE_INT )
            // InternalSimpleIDL.g:6436:3: RULE_INT
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
    // InternalSimpleIDL.g:6445:1: rule__Case__TypeAssignment_1 : ( ( ruleScopedName ) ) ;
    public final void rule__Case__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:6449:1: ( ( ( ruleScopedName ) ) )
            // InternalSimpleIDL.g:6450:2: ( ( ruleScopedName ) )
            {
            // InternalSimpleIDL.g:6450:2: ( ( ruleScopedName ) )
            // InternalSimpleIDL.g:6451:3: ( ruleScopedName )
            {
             before(grammarAccess.getCaseAccess().getTypeNamedDefinitionCrossReference_1_0()); 
            // InternalSimpleIDL.g:6452:3: ( ruleScopedName )
            // InternalSimpleIDL.g:6453:4: ruleScopedName
            {
             before(grammarAccess.getCaseAccess().getTypeNamedDefinitionScopedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleScopedName();

            state._fsp--;

             after(grammarAccess.getCaseAccess().getTypeNamedDefinitionScopedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCaseAccess().getTypeNamedDefinitionCrossReference_1_0()); 

            }


            }

        }
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
    // InternalSimpleIDL.g:6464:1: rule__Case__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Case__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:6468:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:6469:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:6469:2: ( RULE_ID )
            // InternalSimpleIDL.g:6470:3: RULE_ID
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

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\52\uffff";
    static final String dfa_2s = "\1\14\4\uffff\1\4\2\uffff\3\4\1\uffff\1\25\1\4\2\uffff\1\44\2\uffff\1\4\4\uffff\1\15\1\4\1\uffff\1\4\2\uffff\1\4\6\uffff\1\4\1\30\2\uffff\1\4";
    static final String dfa_3s = "\1\31\4\uffff\1\53\2\uffff\1\36\1\4\1\53\1\uffff\1\34\1\44\2\uffff\1\44\2\uffff\1\44\4\uffff\1\32\1\4\1\uffff\1\34\2\uffff\1\53\6\uffff\1\4\1\53\2\uffff\1\4";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\17\1\15\3\uffff\1\22\2\uffff\1\6\1\20\1\uffff\1\14\1\21\1\uffff\1\32\1\10\1\16\1\7\2\uffff\1\11\1\uffff\1\31\1\30\1\uffff\1\27\1\26\1\23\1\5\1\13\1\12\2\uffff\1\25\1\24\1\uffff";
    static final String dfa_5s = "\52\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\uffff\1\1\2\uffff\1\3\5\uffff\1\4\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "\1\12\17\uffff\1\14\1\16\6\uffff\1\10\1\21\1\7\1\6\1\17\1\22\1\13\1\20\2\uffff\1\23\1\15\1\24\2\uffff\1\11",
            "",
            "",
            "\1\27\27\uffff\1\25\1\uffff\1\26",
            "\1\12",
            "\1\30\46\uffff\1\31",
            "",
            "\1\32\6\uffff\1\33",
            "\1\34\37\uffff\1\35",
            "",
            "",
            "\1\36",
            "",
            "",
            "\1\37\37\uffff\1\40",
            "",
            "",
            "",
            "",
            "\1\41\14\uffff\1\42",
            "\1\12",
            "",
            "\1\44\27\uffff\1\43",
            "",
            "",
            "\1\46\46\uffff\1\45",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\46",
            "\1\50\14\uffff\1\47\5\uffff\1\51",
            "",
            "",
            "\1\46"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "246:1: rule__NamedDefinition__Alternatives : ( ( ( rule__NamedDefinition__Group_0__0 ) ) | ( ( rule__NamedDefinition__Group_1__0 ) ) | ( ( rule__NamedDefinition__Group_2__0 ) ) | ( ( rule__NamedDefinition__Group_3__0 ) ) | ( ( rule__NamedDefinition__Group_4__0 ) ) | ( ( rule__NamedDefinition__Group_5__0 ) ) | ( ( rule__NamedDefinition__Group_6__0 ) ) | ( ( rule__NamedDefinition__Group_7__0 ) ) | ( ( rule__NamedDefinition__Group_8__0 ) ) | ( ( rule__NamedDefinition__Group_9__0 ) ) | ( ( rule__NamedDefinition__Group_10__0 ) ) | ( ( rule__NamedDefinition__Group_11__0 ) ) | ( ( rule__NamedDefinition__Group_12__0 ) ) | ( ( rule__NamedDefinition__Group_13__0 ) ) | ( ( rule__NamedDefinition__Group_14__0 ) ) | ( ( rule__NamedDefinition__Group_15__0 ) ) | ( ( rule__NamedDefinition__Group_16__0 ) ) | ( ( rule__NamedDefinition__Group_17__0 ) ) | ( ( rule__NamedDefinition__Group_18__0 ) ) | ( ( rule__NamedDefinition__Group_19__0 ) ) | ( ( rule__NamedDefinition__Group_20__0 ) ) | ( ( rule__NamedDefinition__Group_21__0 ) ) | ( ( rule__NamedDefinition__Group_22__0 ) ) | ( ( rule__NamedDefinition__Group_23__0 ) ) | ( ( rule__NamedDefinition__Group_24__0 ) ) | ( ( rule__NamedDefinition__Group_25__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002825002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002825000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000080000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000080000000000L});

}