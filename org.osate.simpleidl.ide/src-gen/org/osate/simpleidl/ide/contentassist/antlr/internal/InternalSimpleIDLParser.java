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


    // $ANTLR start "entryRuleType"
    // InternalSimpleIDL.g:201:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalSimpleIDL.g:202:1: ( ruleType EOF )
            // InternalSimpleIDL.g:203:1: ruleType EOF
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
    // InternalSimpleIDL.g:210:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:214:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalSimpleIDL.g:215:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalSimpleIDL.g:215:2: ( ( rule__Type__Alternatives ) )
            // InternalSimpleIDL.g:216:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalSimpleIDL.g:217:3: ( rule__Type__Alternatives )
            // InternalSimpleIDL.g:217:4: rule__Type__Alternatives
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
    // InternalSimpleIDL.g:226:1: entryRuleSimpleTypeSpec : ruleSimpleTypeSpec EOF ;
    public final void entryRuleSimpleTypeSpec() throws RecognitionException {
        try {
            // InternalSimpleIDL.g:227:1: ( ruleSimpleTypeSpec EOF )
            // InternalSimpleIDL.g:228:1: ruleSimpleTypeSpec EOF
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
    // InternalSimpleIDL.g:235:1: ruleSimpleTypeSpec : ( ( rule__SimpleTypeSpec__Alternatives ) ) ;
    public final void ruleSimpleTypeSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:239:2: ( ( ( rule__SimpleTypeSpec__Alternatives ) ) )
            // InternalSimpleIDL.g:240:2: ( ( rule__SimpleTypeSpec__Alternatives ) )
            {
            // InternalSimpleIDL.g:240:2: ( ( rule__SimpleTypeSpec__Alternatives ) )
            // InternalSimpleIDL.g:241:3: ( rule__SimpleTypeSpec__Alternatives )
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getAlternatives()); 
            // InternalSimpleIDL.g:242:3: ( rule__SimpleTypeSpec__Alternatives )
            // InternalSimpleIDL.g:242:4: rule__SimpleTypeSpec__Alternatives
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
    // InternalSimpleIDL.g:251:1: entryRuleScopedName : ruleScopedName EOF ;
    public final void entryRuleScopedName() throws RecognitionException {
        try {
            // InternalSimpleIDL.g:252:1: ( ruleScopedName EOF )
            // InternalSimpleIDL.g:253:1: ruleScopedName EOF
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
    // InternalSimpleIDL.g:260:1: ruleScopedName : ( ( rule__ScopedName__Group__0 ) ) ;
    public final void ruleScopedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:264:2: ( ( ( rule__ScopedName__Group__0 ) ) )
            // InternalSimpleIDL.g:265:2: ( ( rule__ScopedName__Group__0 ) )
            {
            // InternalSimpleIDL.g:265:2: ( ( rule__ScopedName__Group__0 ) )
            // InternalSimpleIDL.g:266:3: ( rule__ScopedName__Group__0 )
            {
             before(grammarAccess.getScopedNameAccess().getGroup()); 
            // InternalSimpleIDL.g:267:3: ( rule__ScopedName__Group__0 )
            // InternalSimpleIDL.g:267:4: rule__ScopedName__Group__0
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
    // InternalSimpleIDL.g:275:1: rule__Definition__Alternatives : ( ( ( rule__Definition__Group_0__0 ) ) | ( ( rule__Definition__Group_1__0 ) ) | ( ( rule__Definition__Group_2__0 ) ) | ( ( rule__Definition__Group_3__0 ) ) | ( ( rule__Definition__Group_4__0 ) ) | ( ( rule__Definition__Group_5__0 ) ) );
    public final void rule__Definition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:279:1: ( ( ( rule__Definition__Group_0__0 ) ) | ( ( rule__Definition__Group_1__0 ) ) | ( ( rule__Definition__Group_2__0 ) ) | ( ( rule__Definition__Group_3__0 ) ) | ( ( rule__Definition__Group_4__0 ) ) | ( ( rule__Definition__Group_5__0 ) ) )
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

                    if ( (LA2_6==13) ) {
                        alt2=2;
                    }
                    else if ( (LA2_6==15) ) {
                        alt2=3;
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
                    // InternalSimpleIDL.g:280:2: ( ( rule__Definition__Group_0__0 ) )
                    {
                    // InternalSimpleIDL.g:280:2: ( ( rule__Definition__Group_0__0 ) )
                    // InternalSimpleIDL.g:281:3: ( rule__Definition__Group_0__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_0()); 
                    // InternalSimpleIDL.g:282:3: ( rule__Definition__Group_0__0 )
                    // InternalSimpleIDL.g:282:4: rule__Definition__Group_0__0
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
                    // InternalSimpleIDL.g:286:2: ( ( rule__Definition__Group_1__0 ) )
                    {
                    // InternalSimpleIDL.g:286:2: ( ( rule__Definition__Group_1__0 ) )
                    // InternalSimpleIDL.g:287:3: ( rule__Definition__Group_1__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_1()); 
                    // InternalSimpleIDL.g:288:3: ( rule__Definition__Group_1__0 )
                    // InternalSimpleIDL.g:288:4: rule__Definition__Group_1__0
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
                    // InternalSimpleIDL.g:292:2: ( ( rule__Definition__Group_2__0 ) )
                    {
                    // InternalSimpleIDL.g:292:2: ( ( rule__Definition__Group_2__0 ) )
                    // InternalSimpleIDL.g:293:3: ( rule__Definition__Group_2__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_2()); 
                    // InternalSimpleIDL.g:294:3: ( rule__Definition__Group_2__0 )
                    // InternalSimpleIDL.g:294:4: rule__Definition__Group_2__0
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
                    // InternalSimpleIDL.g:298:2: ( ( rule__Definition__Group_3__0 ) )
                    {
                    // InternalSimpleIDL.g:298:2: ( ( rule__Definition__Group_3__0 ) )
                    // InternalSimpleIDL.g:299:3: ( rule__Definition__Group_3__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_3()); 
                    // InternalSimpleIDL.g:300:3: ( rule__Definition__Group_3__0 )
                    // InternalSimpleIDL.g:300:4: rule__Definition__Group_3__0
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
                    // InternalSimpleIDL.g:304:2: ( ( rule__Definition__Group_4__0 ) )
                    {
                    // InternalSimpleIDL.g:304:2: ( ( rule__Definition__Group_4__0 ) )
                    // InternalSimpleIDL.g:305:3: ( rule__Definition__Group_4__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_4()); 
                    // InternalSimpleIDL.g:306:3: ( rule__Definition__Group_4__0 )
                    // InternalSimpleIDL.g:306:4: rule__Definition__Group_4__0
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
                    // InternalSimpleIDL.g:310:2: ( ( rule__Definition__Group_5__0 ) )
                    {
                    // InternalSimpleIDL.g:310:2: ( ( rule__Definition__Group_5__0 ) )
                    // InternalSimpleIDL.g:311:3: ( rule__Definition__Group_5__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_5()); 
                    // InternalSimpleIDL.g:312:3: ( rule__Definition__Group_5__0 )
                    // InternalSimpleIDL.g:312:4: rule__Definition__Group_5__0
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
    // InternalSimpleIDL.g:320:1: rule__Type__Alternatives : ( ( ruleSimpleTypeSpec ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) | ( ( rule__Type__Group_3__0 ) ) | ( ( rule__Type__Group_4__0 ) ) | ( ( rule__Type__Group_5__0 ) ) | ( ( rule__Type__Group_6__0 ) ) | ( ( rule__Type__Group_7__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:324:1: ( ( ruleSimpleTypeSpec ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) | ( ( rule__Type__Group_3__0 ) ) | ( ( rule__Type__Group_4__0 ) ) | ( ( rule__Type__Group_5__0 ) ) | ( ( rule__Type__Group_6__0 ) ) | ( ( rule__Type__Group_7__0 ) ) )
            int alt3=8;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalSimpleIDL.g:325:2: ( ruleSimpleTypeSpec )
                    {
                    // InternalSimpleIDL.g:325:2: ( ruleSimpleTypeSpec )
                    // InternalSimpleIDL.g:326:3: ruleSimpleTypeSpec
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
                    // InternalSimpleIDL.g:331:2: ( ( rule__Type__Group_1__0 ) )
                    {
                    // InternalSimpleIDL.g:331:2: ( ( rule__Type__Group_1__0 ) )
                    // InternalSimpleIDL.g:332:3: ( rule__Type__Group_1__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_1()); 
                    // InternalSimpleIDL.g:333:3: ( rule__Type__Group_1__0 )
                    // InternalSimpleIDL.g:333:4: rule__Type__Group_1__0
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
                    // InternalSimpleIDL.g:337:2: ( ( rule__Type__Group_2__0 ) )
                    {
                    // InternalSimpleIDL.g:337:2: ( ( rule__Type__Group_2__0 ) )
                    // InternalSimpleIDL.g:338:3: ( rule__Type__Group_2__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_2()); 
                    // InternalSimpleIDL.g:339:3: ( rule__Type__Group_2__0 )
                    // InternalSimpleIDL.g:339:4: rule__Type__Group_2__0
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
                    // InternalSimpleIDL.g:343:2: ( ( rule__Type__Group_3__0 ) )
                    {
                    // InternalSimpleIDL.g:343:2: ( ( rule__Type__Group_3__0 ) )
                    // InternalSimpleIDL.g:344:3: ( rule__Type__Group_3__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_3()); 
                    // InternalSimpleIDL.g:345:3: ( rule__Type__Group_3__0 )
                    // InternalSimpleIDL.g:345:4: rule__Type__Group_3__0
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
                    // InternalSimpleIDL.g:349:2: ( ( rule__Type__Group_4__0 ) )
                    {
                    // InternalSimpleIDL.g:349:2: ( ( rule__Type__Group_4__0 ) )
                    // InternalSimpleIDL.g:350:3: ( rule__Type__Group_4__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_4()); 
                    // InternalSimpleIDL.g:351:3: ( rule__Type__Group_4__0 )
                    // InternalSimpleIDL.g:351:4: rule__Type__Group_4__0
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
                    // InternalSimpleIDL.g:355:2: ( ( rule__Type__Group_5__0 ) )
                    {
                    // InternalSimpleIDL.g:355:2: ( ( rule__Type__Group_5__0 ) )
                    // InternalSimpleIDL.g:356:3: ( rule__Type__Group_5__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_5()); 
                    // InternalSimpleIDL.g:357:3: ( rule__Type__Group_5__0 )
                    // InternalSimpleIDL.g:357:4: rule__Type__Group_5__0
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
                    // InternalSimpleIDL.g:361:2: ( ( rule__Type__Group_6__0 ) )
                    {
                    // InternalSimpleIDL.g:361:2: ( ( rule__Type__Group_6__0 ) )
                    // InternalSimpleIDL.g:362:3: ( rule__Type__Group_6__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_6()); 
                    // InternalSimpleIDL.g:363:3: ( rule__Type__Group_6__0 )
                    // InternalSimpleIDL.g:363:4: rule__Type__Group_6__0
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
                    // InternalSimpleIDL.g:367:2: ( ( rule__Type__Group_7__0 ) )
                    {
                    // InternalSimpleIDL.g:367:2: ( ( rule__Type__Group_7__0 ) )
                    // InternalSimpleIDL.g:368:3: ( rule__Type__Group_7__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_7()); 
                    // InternalSimpleIDL.g:369:3: ( rule__Type__Group_7__0 )
                    // InternalSimpleIDL.g:369:4: rule__Type__Group_7__0
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
    // InternalSimpleIDL.g:377:1: rule__SimpleTypeSpec__Alternatives : ( ( ( rule__SimpleTypeSpec__Group_0__0 ) ) | ( ( rule__SimpleTypeSpec__Group_1__0 ) ) | ( ( rule__SimpleTypeSpec__Group_2__0 ) ) | ( ( rule__SimpleTypeSpec__Group_3__0 ) ) | ( ( rule__SimpleTypeSpec__Group_4__0 ) ) | ( ( rule__SimpleTypeSpec__Group_5__0 ) ) | ( ( rule__SimpleTypeSpec__Group_6__0 ) ) | ( ( rule__SimpleTypeSpec__Group_7__0 ) ) | ( ( rule__SimpleTypeSpec__Group_8__0 ) ) | ( ( rule__SimpleTypeSpec__Group_9__0 ) ) | ( ( rule__SimpleTypeSpec__Group_10__0 ) ) | ( ( rule__SimpleTypeSpec__Group_11__0 ) ) | ( ( rule__SimpleTypeSpec__Group_12__0 ) ) | ( ( rule__SimpleTypeSpec__Group_13__0 ) ) );
    public final void rule__SimpleTypeSpec__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:381:1: ( ( ( rule__SimpleTypeSpec__Group_0__0 ) ) | ( ( rule__SimpleTypeSpec__Group_1__0 ) ) | ( ( rule__SimpleTypeSpec__Group_2__0 ) ) | ( ( rule__SimpleTypeSpec__Group_3__0 ) ) | ( ( rule__SimpleTypeSpec__Group_4__0 ) ) | ( ( rule__SimpleTypeSpec__Group_5__0 ) ) | ( ( rule__SimpleTypeSpec__Group_6__0 ) ) | ( ( rule__SimpleTypeSpec__Group_7__0 ) ) | ( ( rule__SimpleTypeSpec__Group_8__0 ) ) | ( ( rule__SimpleTypeSpec__Group_9__0 ) ) | ( ( rule__SimpleTypeSpec__Group_10__0 ) ) | ( ( rule__SimpleTypeSpec__Group_11__0 ) ) | ( ( rule__SimpleTypeSpec__Group_12__0 ) ) | ( ( rule__SimpleTypeSpec__Group_13__0 ) ) )
            int alt4=14;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalSimpleIDL.g:382:2: ( ( rule__SimpleTypeSpec__Group_0__0 ) )
                    {
                    // InternalSimpleIDL.g:382:2: ( ( rule__SimpleTypeSpec__Group_0__0 ) )
                    // InternalSimpleIDL.g:383:3: ( rule__SimpleTypeSpec__Group_0__0 )
                    {
                     before(grammarAccess.getSimpleTypeSpecAccess().getGroup_0()); 
                    // InternalSimpleIDL.g:384:3: ( rule__SimpleTypeSpec__Group_0__0 )
                    // InternalSimpleIDL.g:384:4: rule__SimpleTypeSpec__Group_0__0
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
                    // InternalSimpleIDL.g:388:2: ( ( rule__SimpleTypeSpec__Group_1__0 ) )
                    {
                    // InternalSimpleIDL.g:388:2: ( ( rule__SimpleTypeSpec__Group_1__0 ) )
                    // InternalSimpleIDL.g:389:3: ( rule__SimpleTypeSpec__Group_1__0 )
                    {
                     before(grammarAccess.getSimpleTypeSpecAccess().getGroup_1()); 
                    // InternalSimpleIDL.g:390:3: ( rule__SimpleTypeSpec__Group_1__0 )
                    // InternalSimpleIDL.g:390:4: rule__SimpleTypeSpec__Group_1__0
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
                    // InternalSimpleIDL.g:394:2: ( ( rule__SimpleTypeSpec__Group_2__0 ) )
                    {
                    // InternalSimpleIDL.g:394:2: ( ( rule__SimpleTypeSpec__Group_2__0 ) )
                    // InternalSimpleIDL.g:395:3: ( rule__SimpleTypeSpec__Group_2__0 )
                    {
                     before(grammarAccess.getSimpleTypeSpecAccess().getGroup_2()); 
                    // InternalSimpleIDL.g:396:3: ( rule__SimpleTypeSpec__Group_2__0 )
                    // InternalSimpleIDL.g:396:4: rule__SimpleTypeSpec__Group_2__0
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
                    // InternalSimpleIDL.g:400:2: ( ( rule__SimpleTypeSpec__Group_3__0 ) )
                    {
                    // InternalSimpleIDL.g:400:2: ( ( rule__SimpleTypeSpec__Group_3__0 ) )
                    // InternalSimpleIDL.g:401:3: ( rule__SimpleTypeSpec__Group_3__0 )
                    {
                     before(grammarAccess.getSimpleTypeSpecAccess().getGroup_3()); 
                    // InternalSimpleIDL.g:402:3: ( rule__SimpleTypeSpec__Group_3__0 )
                    // InternalSimpleIDL.g:402:4: rule__SimpleTypeSpec__Group_3__0
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
                    // InternalSimpleIDL.g:406:2: ( ( rule__SimpleTypeSpec__Group_4__0 ) )
                    {
                    // InternalSimpleIDL.g:406:2: ( ( rule__SimpleTypeSpec__Group_4__0 ) )
                    // InternalSimpleIDL.g:407:3: ( rule__SimpleTypeSpec__Group_4__0 )
                    {
                     before(grammarAccess.getSimpleTypeSpecAccess().getGroup_4()); 
                    // InternalSimpleIDL.g:408:3: ( rule__SimpleTypeSpec__Group_4__0 )
                    // InternalSimpleIDL.g:408:4: rule__SimpleTypeSpec__Group_4__0
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
                    // InternalSimpleIDL.g:412:2: ( ( rule__SimpleTypeSpec__Group_5__0 ) )
                    {
                    // InternalSimpleIDL.g:412:2: ( ( rule__SimpleTypeSpec__Group_5__0 ) )
                    // InternalSimpleIDL.g:413:3: ( rule__SimpleTypeSpec__Group_5__0 )
                    {
                     before(grammarAccess.getSimpleTypeSpecAccess().getGroup_5()); 
                    // InternalSimpleIDL.g:414:3: ( rule__SimpleTypeSpec__Group_5__0 )
                    // InternalSimpleIDL.g:414:4: rule__SimpleTypeSpec__Group_5__0
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
                    // InternalSimpleIDL.g:418:2: ( ( rule__SimpleTypeSpec__Group_6__0 ) )
                    {
                    // InternalSimpleIDL.g:418:2: ( ( rule__SimpleTypeSpec__Group_6__0 ) )
                    // InternalSimpleIDL.g:419:3: ( rule__SimpleTypeSpec__Group_6__0 )
                    {
                     before(grammarAccess.getSimpleTypeSpecAccess().getGroup_6()); 
                    // InternalSimpleIDL.g:420:3: ( rule__SimpleTypeSpec__Group_6__0 )
                    // InternalSimpleIDL.g:420:4: rule__SimpleTypeSpec__Group_6__0
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
                    // InternalSimpleIDL.g:424:2: ( ( rule__SimpleTypeSpec__Group_7__0 ) )
                    {
                    // InternalSimpleIDL.g:424:2: ( ( rule__SimpleTypeSpec__Group_7__0 ) )
                    // InternalSimpleIDL.g:425:3: ( rule__SimpleTypeSpec__Group_7__0 )
                    {
                     before(grammarAccess.getSimpleTypeSpecAccess().getGroup_7()); 
                    // InternalSimpleIDL.g:426:3: ( rule__SimpleTypeSpec__Group_7__0 )
                    // InternalSimpleIDL.g:426:4: rule__SimpleTypeSpec__Group_7__0
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
                    // InternalSimpleIDL.g:430:2: ( ( rule__SimpleTypeSpec__Group_8__0 ) )
                    {
                    // InternalSimpleIDL.g:430:2: ( ( rule__SimpleTypeSpec__Group_8__0 ) )
                    // InternalSimpleIDL.g:431:3: ( rule__SimpleTypeSpec__Group_8__0 )
                    {
                     before(grammarAccess.getSimpleTypeSpecAccess().getGroup_8()); 
                    // InternalSimpleIDL.g:432:3: ( rule__SimpleTypeSpec__Group_8__0 )
                    // InternalSimpleIDL.g:432:4: rule__SimpleTypeSpec__Group_8__0
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
                    // InternalSimpleIDL.g:436:2: ( ( rule__SimpleTypeSpec__Group_9__0 ) )
                    {
                    // InternalSimpleIDL.g:436:2: ( ( rule__SimpleTypeSpec__Group_9__0 ) )
                    // InternalSimpleIDL.g:437:3: ( rule__SimpleTypeSpec__Group_9__0 )
                    {
                     before(grammarAccess.getSimpleTypeSpecAccess().getGroup_9()); 
                    // InternalSimpleIDL.g:438:3: ( rule__SimpleTypeSpec__Group_9__0 )
                    // InternalSimpleIDL.g:438:4: rule__SimpleTypeSpec__Group_9__0
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
                    // InternalSimpleIDL.g:442:2: ( ( rule__SimpleTypeSpec__Group_10__0 ) )
                    {
                    // InternalSimpleIDL.g:442:2: ( ( rule__SimpleTypeSpec__Group_10__0 ) )
                    // InternalSimpleIDL.g:443:3: ( rule__SimpleTypeSpec__Group_10__0 )
                    {
                     before(grammarAccess.getSimpleTypeSpecAccess().getGroup_10()); 
                    // InternalSimpleIDL.g:444:3: ( rule__SimpleTypeSpec__Group_10__0 )
                    // InternalSimpleIDL.g:444:4: rule__SimpleTypeSpec__Group_10__0
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
                    // InternalSimpleIDL.g:448:2: ( ( rule__SimpleTypeSpec__Group_11__0 ) )
                    {
                    // InternalSimpleIDL.g:448:2: ( ( rule__SimpleTypeSpec__Group_11__0 ) )
                    // InternalSimpleIDL.g:449:3: ( rule__SimpleTypeSpec__Group_11__0 )
                    {
                     before(grammarAccess.getSimpleTypeSpecAccess().getGroup_11()); 
                    // InternalSimpleIDL.g:450:3: ( rule__SimpleTypeSpec__Group_11__0 )
                    // InternalSimpleIDL.g:450:4: rule__SimpleTypeSpec__Group_11__0
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
                    // InternalSimpleIDL.g:454:2: ( ( rule__SimpleTypeSpec__Group_12__0 ) )
                    {
                    // InternalSimpleIDL.g:454:2: ( ( rule__SimpleTypeSpec__Group_12__0 ) )
                    // InternalSimpleIDL.g:455:3: ( rule__SimpleTypeSpec__Group_12__0 )
                    {
                     before(grammarAccess.getSimpleTypeSpecAccess().getGroup_12()); 
                    // InternalSimpleIDL.g:456:3: ( rule__SimpleTypeSpec__Group_12__0 )
                    // InternalSimpleIDL.g:456:4: rule__SimpleTypeSpec__Group_12__0
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
                    // InternalSimpleIDL.g:460:2: ( ( rule__SimpleTypeSpec__Group_13__0 ) )
                    {
                    // InternalSimpleIDL.g:460:2: ( ( rule__SimpleTypeSpec__Group_13__0 ) )
                    // InternalSimpleIDL.g:461:3: ( rule__SimpleTypeSpec__Group_13__0 )
                    {
                     before(grammarAccess.getSimpleTypeSpecAccess().getGroup_13()); 
                    // InternalSimpleIDL.g:462:3: ( rule__SimpleTypeSpec__Group_13__0 )
                    // InternalSimpleIDL.g:462:4: rule__SimpleTypeSpec__Group_13__0
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
    // InternalSimpleIDL.g:470:1: rule__Definition__Group_0__0 : rule__Definition__Group_0__0__Impl rule__Definition__Group_0__1 ;
    public final void rule__Definition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:474:1: ( rule__Definition__Group_0__0__Impl rule__Definition__Group_0__1 )
            // InternalSimpleIDL.g:475:2: rule__Definition__Group_0__0__Impl rule__Definition__Group_0__1
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
    // InternalSimpleIDL.g:482:1: rule__Definition__Group_0__0__Impl : ( () ) ;
    public final void rule__Definition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:486:1: ( ( () ) )
            // InternalSimpleIDL.g:487:1: ( () )
            {
            // InternalSimpleIDL.g:487:1: ( () )
            // InternalSimpleIDL.g:488:2: ()
            {
             before(grammarAccess.getDefinitionAccess().getModuleAction_0_0()); 
            // InternalSimpleIDL.g:489:2: ()
            // InternalSimpleIDL.g:489:3: 
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
    // InternalSimpleIDL.g:497:1: rule__Definition__Group_0__1 : rule__Definition__Group_0__1__Impl rule__Definition__Group_0__2 ;
    public final void rule__Definition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:501:1: ( rule__Definition__Group_0__1__Impl rule__Definition__Group_0__2 )
            // InternalSimpleIDL.g:502:2: rule__Definition__Group_0__1__Impl rule__Definition__Group_0__2
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
    // InternalSimpleIDL.g:509:1: rule__Definition__Group_0__1__Impl : ( 'module' ) ;
    public final void rule__Definition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:513:1: ( ( 'module' ) )
            // InternalSimpleIDL.g:514:1: ( 'module' )
            {
            // InternalSimpleIDL.g:514:1: ( 'module' )
            // InternalSimpleIDL.g:515:2: 'module'
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
    // InternalSimpleIDL.g:524:1: rule__Definition__Group_0__2 : rule__Definition__Group_0__2__Impl rule__Definition__Group_0__3 ;
    public final void rule__Definition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:528:1: ( rule__Definition__Group_0__2__Impl rule__Definition__Group_0__3 )
            // InternalSimpleIDL.g:529:2: rule__Definition__Group_0__2__Impl rule__Definition__Group_0__3
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
    // InternalSimpleIDL.g:536:1: rule__Definition__Group_0__2__Impl : ( ( rule__Definition__NameAssignment_0_2 ) ) ;
    public final void rule__Definition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:540:1: ( ( ( rule__Definition__NameAssignment_0_2 ) ) )
            // InternalSimpleIDL.g:541:1: ( ( rule__Definition__NameAssignment_0_2 ) )
            {
            // InternalSimpleIDL.g:541:1: ( ( rule__Definition__NameAssignment_0_2 ) )
            // InternalSimpleIDL.g:542:2: ( rule__Definition__NameAssignment_0_2 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_0_2()); 
            // InternalSimpleIDL.g:543:2: ( rule__Definition__NameAssignment_0_2 )
            // InternalSimpleIDL.g:543:3: rule__Definition__NameAssignment_0_2
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
    // InternalSimpleIDL.g:551:1: rule__Definition__Group_0__3 : rule__Definition__Group_0__3__Impl rule__Definition__Group_0__4 ;
    public final void rule__Definition__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:555:1: ( rule__Definition__Group_0__3__Impl rule__Definition__Group_0__4 )
            // InternalSimpleIDL.g:556:2: rule__Definition__Group_0__3__Impl rule__Definition__Group_0__4
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
    // InternalSimpleIDL.g:563:1: rule__Definition__Group_0__3__Impl : ( '{' ) ;
    public final void rule__Definition__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:567:1: ( ( '{' ) )
            // InternalSimpleIDL.g:568:1: ( '{' )
            {
            // InternalSimpleIDL.g:568:1: ( '{' )
            // InternalSimpleIDL.g:569:2: '{'
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
    // InternalSimpleIDL.g:578:1: rule__Definition__Group_0__4 : rule__Definition__Group_0__4__Impl rule__Definition__Group_0__5 ;
    public final void rule__Definition__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:582:1: ( rule__Definition__Group_0__4__Impl rule__Definition__Group_0__5 )
            // InternalSimpleIDL.g:583:2: rule__Definition__Group_0__4__Impl rule__Definition__Group_0__5
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
    // InternalSimpleIDL.g:590:1: rule__Definition__Group_0__4__Impl : ( ( ( rule__Definition__DefinitionsAssignment_0_4 ) ) ( ( rule__Definition__DefinitionsAssignment_0_4 )* ) ) ;
    public final void rule__Definition__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:594:1: ( ( ( ( rule__Definition__DefinitionsAssignment_0_4 ) ) ( ( rule__Definition__DefinitionsAssignment_0_4 )* ) ) )
            // InternalSimpleIDL.g:595:1: ( ( ( rule__Definition__DefinitionsAssignment_0_4 ) ) ( ( rule__Definition__DefinitionsAssignment_0_4 )* ) )
            {
            // InternalSimpleIDL.g:595:1: ( ( ( rule__Definition__DefinitionsAssignment_0_4 ) ) ( ( rule__Definition__DefinitionsAssignment_0_4 )* ) )
            // InternalSimpleIDL.g:596:2: ( ( rule__Definition__DefinitionsAssignment_0_4 ) ) ( ( rule__Definition__DefinitionsAssignment_0_4 )* )
            {
            // InternalSimpleIDL.g:596:2: ( ( rule__Definition__DefinitionsAssignment_0_4 ) )
            // InternalSimpleIDL.g:597:3: ( rule__Definition__DefinitionsAssignment_0_4 )
            {
             before(grammarAccess.getDefinitionAccess().getDefinitionsAssignment_0_4()); 
            // InternalSimpleIDL.g:598:3: ( rule__Definition__DefinitionsAssignment_0_4 )
            // InternalSimpleIDL.g:598:4: rule__Definition__DefinitionsAssignment_0_4
            {
            pushFollow(FOLLOW_3);
            rule__Definition__DefinitionsAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getDefinitionsAssignment_0_4()); 

            }

            // InternalSimpleIDL.g:601:2: ( ( rule__Definition__DefinitionsAssignment_0_4 )* )
            // InternalSimpleIDL.g:602:3: ( rule__Definition__DefinitionsAssignment_0_4 )*
            {
             before(grammarAccess.getDefinitionAccess().getDefinitionsAssignment_0_4()); 
            // InternalSimpleIDL.g:603:3: ( rule__Definition__DefinitionsAssignment_0_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==12||(LA5_0>=16 && LA5_0<=17)||LA5_0==23||LA5_0==25) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSimpleIDL.g:603:4: rule__Definition__DefinitionsAssignment_0_4
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
    // InternalSimpleIDL.g:612:1: rule__Definition__Group_0__5 : rule__Definition__Group_0__5__Impl rule__Definition__Group_0__6 ;
    public final void rule__Definition__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:616:1: ( rule__Definition__Group_0__5__Impl rule__Definition__Group_0__6 )
            // InternalSimpleIDL.g:617:2: rule__Definition__Group_0__5__Impl rule__Definition__Group_0__6
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
    // InternalSimpleIDL.g:624:1: rule__Definition__Group_0__5__Impl : ( '}' ) ;
    public final void rule__Definition__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:628:1: ( ( '}' ) )
            // InternalSimpleIDL.g:629:1: ( '}' )
            {
            // InternalSimpleIDL.g:629:1: ( '}' )
            // InternalSimpleIDL.g:630:2: '}'
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
    // InternalSimpleIDL.g:639:1: rule__Definition__Group_0__6 : rule__Definition__Group_0__6__Impl ;
    public final void rule__Definition__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:643:1: ( rule__Definition__Group_0__6__Impl )
            // InternalSimpleIDL.g:644:2: rule__Definition__Group_0__6__Impl
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
    // InternalSimpleIDL.g:650:1: rule__Definition__Group_0__6__Impl : ( ';' ) ;
    public final void rule__Definition__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:654:1: ( ( ';' ) )
            // InternalSimpleIDL.g:655:1: ( ';' )
            {
            // InternalSimpleIDL.g:655:1: ( ';' )
            // InternalSimpleIDL.g:656:2: ';'
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
    // InternalSimpleIDL.g:666:1: rule__Definition__Group_1__0 : rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1 ;
    public final void rule__Definition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:670:1: ( rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1 )
            // InternalSimpleIDL.g:671:2: rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1
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
    // InternalSimpleIDL.g:678:1: rule__Definition__Group_1__0__Impl : ( () ) ;
    public final void rule__Definition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:682:1: ( ( () ) )
            // InternalSimpleIDL.g:683:1: ( () )
            {
            // InternalSimpleIDL.g:683:1: ( () )
            // InternalSimpleIDL.g:684:2: ()
            {
             before(grammarAccess.getDefinitionAccess().getStructAction_1_0()); 
            // InternalSimpleIDL.g:685:2: ()
            // InternalSimpleIDL.g:685:3: 
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
    // InternalSimpleIDL.g:693:1: rule__Definition__Group_1__1 : rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2 ;
    public final void rule__Definition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:697:1: ( rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2 )
            // InternalSimpleIDL.g:698:2: rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2
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
    // InternalSimpleIDL.g:705:1: rule__Definition__Group_1__1__Impl : ( 'struct' ) ;
    public final void rule__Definition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:709:1: ( ( 'struct' ) )
            // InternalSimpleIDL.g:710:1: ( 'struct' )
            {
            // InternalSimpleIDL.g:710:1: ( 'struct' )
            // InternalSimpleIDL.g:711:2: 'struct'
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
    // InternalSimpleIDL.g:720:1: rule__Definition__Group_1__2 : rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3 ;
    public final void rule__Definition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:724:1: ( rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3 )
            // InternalSimpleIDL.g:725:2: rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3
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
    // InternalSimpleIDL.g:732:1: rule__Definition__Group_1__2__Impl : ( ( rule__Definition__NameAssignment_1_2 ) ) ;
    public final void rule__Definition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:736:1: ( ( ( rule__Definition__NameAssignment_1_2 ) ) )
            // InternalSimpleIDL.g:737:1: ( ( rule__Definition__NameAssignment_1_2 ) )
            {
            // InternalSimpleIDL.g:737:1: ( ( rule__Definition__NameAssignment_1_2 ) )
            // InternalSimpleIDL.g:738:2: ( rule__Definition__NameAssignment_1_2 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_1_2()); 
            // InternalSimpleIDL.g:739:2: ( rule__Definition__NameAssignment_1_2 )
            // InternalSimpleIDL.g:739:3: rule__Definition__NameAssignment_1_2
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
    // InternalSimpleIDL.g:747:1: rule__Definition__Group_1__3 : rule__Definition__Group_1__3__Impl rule__Definition__Group_1__4 ;
    public final void rule__Definition__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:751:1: ( rule__Definition__Group_1__3__Impl rule__Definition__Group_1__4 )
            // InternalSimpleIDL.g:752:2: rule__Definition__Group_1__3__Impl rule__Definition__Group_1__4
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
    // InternalSimpleIDL.g:759:1: rule__Definition__Group_1__3__Impl : ( '{' ) ;
    public final void rule__Definition__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:763:1: ( ( '{' ) )
            // InternalSimpleIDL.g:764:1: ( '{' )
            {
            // InternalSimpleIDL.g:764:1: ( '{' )
            // InternalSimpleIDL.g:765:2: '{'
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
    // InternalSimpleIDL.g:774:1: rule__Definition__Group_1__4 : rule__Definition__Group_1__4__Impl rule__Definition__Group_1__5 ;
    public final void rule__Definition__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:778:1: ( rule__Definition__Group_1__4__Impl rule__Definition__Group_1__5 )
            // InternalSimpleIDL.g:779:2: rule__Definition__Group_1__4__Impl rule__Definition__Group_1__5
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
    // InternalSimpleIDL.g:786:1: rule__Definition__Group_1__4__Impl : ( ( ( rule__Definition__MembersAssignment_1_4 ) ) ( ( rule__Definition__MembersAssignment_1_4 )* ) ) ;
    public final void rule__Definition__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:790:1: ( ( ( ( rule__Definition__MembersAssignment_1_4 ) ) ( ( rule__Definition__MembersAssignment_1_4 )* ) ) )
            // InternalSimpleIDL.g:791:1: ( ( ( rule__Definition__MembersAssignment_1_4 ) ) ( ( rule__Definition__MembersAssignment_1_4 )* ) )
            {
            // InternalSimpleIDL.g:791:1: ( ( ( rule__Definition__MembersAssignment_1_4 ) ) ( ( rule__Definition__MembersAssignment_1_4 )* ) )
            // InternalSimpleIDL.g:792:2: ( ( rule__Definition__MembersAssignment_1_4 ) ) ( ( rule__Definition__MembersAssignment_1_4 )* )
            {
            // InternalSimpleIDL.g:792:2: ( ( rule__Definition__MembersAssignment_1_4 ) )
            // InternalSimpleIDL.g:793:3: ( rule__Definition__MembersAssignment_1_4 )
            {
             before(grammarAccess.getDefinitionAccess().getMembersAssignment_1_4()); 
            // InternalSimpleIDL.g:794:3: ( rule__Definition__MembersAssignment_1_4 )
            // InternalSimpleIDL.g:794:4: rule__Definition__MembersAssignment_1_4
            {
            pushFollow(FOLLOW_12);
            rule__Definition__MembersAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getMembersAssignment_1_4()); 

            }

            // InternalSimpleIDL.g:797:2: ( ( rule__Definition__MembersAssignment_1_4 )* )
            // InternalSimpleIDL.g:798:3: ( rule__Definition__MembersAssignment_1_4 )*
            {
             before(grammarAccess.getDefinitionAccess().getMembersAssignment_1_4()); 
            // InternalSimpleIDL.g:799:3: ( rule__Definition__MembersAssignment_1_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=20 && LA6_0<=21)||(LA6_0>=36 && LA6_0<=43)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSimpleIDL.g:799:4: rule__Definition__MembersAssignment_1_4
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
    // InternalSimpleIDL.g:808:1: rule__Definition__Group_1__5 : rule__Definition__Group_1__5__Impl rule__Definition__Group_1__6 ;
    public final void rule__Definition__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:812:1: ( rule__Definition__Group_1__5__Impl rule__Definition__Group_1__6 )
            // InternalSimpleIDL.g:813:2: rule__Definition__Group_1__5__Impl rule__Definition__Group_1__6
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
    // InternalSimpleIDL.g:820:1: rule__Definition__Group_1__5__Impl : ( '}' ) ;
    public final void rule__Definition__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:824:1: ( ( '}' ) )
            // InternalSimpleIDL.g:825:1: ( '}' )
            {
            // InternalSimpleIDL.g:825:1: ( '}' )
            // InternalSimpleIDL.g:826:2: '}'
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
    // InternalSimpleIDL.g:835:1: rule__Definition__Group_1__6 : rule__Definition__Group_1__6__Impl ;
    public final void rule__Definition__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:839:1: ( rule__Definition__Group_1__6__Impl )
            // InternalSimpleIDL.g:840:2: rule__Definition__Group_1__6__Impl
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
    // InternalSimpleIDL.g:846:1: rule__Definition__Group_1__6__Impl : ( ';' ) ;
    public final void rule__Definition__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:850:1: ( ( ';' ) )
            // InternalSimpleIDL.g:851:1: ( ';' )
            {
            // InternalSimpleIDL.g:851:1: ( ';' )
            // InternalSimpleIDL.g:852:2: ';'
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
    // InternalSimpleIDL.g:862:1: rule__Definition__Group_2__0 : rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1 ;
    public final void rule__Definition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:866:1: ( rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1 )
            // InternalSimpleIDL.g:867:2: rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1
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
    // InternalSimpleIDL.g:874:1: rule__Definition__Group_2__0__Impl : ( () ) ;
    public final void rule__Definition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:878:1: ( ( () ) )
            // InternalSimpleIDL.g:879:1: ( () )
            {
            // InternalSimpleIDL.g:879:1: ( () )
            // InternalSimpleIDL.g:880:2: ()
            {
             before(grammarAccess.getDefinitionAccess().getStructForwardAction_2_0()); 
            // InternalSimpleIDL.g:881:2: ()
            // InternalSimpleIDL.g:881:3: 
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
    // InternalSimpleIDL.g:889:1: rule__Definition__Group_2__1 : rule__Definition__Group_2__1__Impl rule__Definition__Group_2__2 ;
    public final void rule__Definition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:893:1: ( rule__Definition__Group_2__1__Impl rule__Definition__Group_2__2 )
            // InternalSimpleIDL.g:894:2: rule__Definition__Group_2__1__Impl rule__Definition__Group_2__2
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
    // InternalSimpleIDL.g:901:1: rule__Definition__Group_2__1__Impl : ( 'struct' ) ;
    public final void rule__Definition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:905:1: ( ( 'struct' ) )
            // InternalSimpleIDL.g:906:1: ( 'struct' )
            {
            // InternalSimpleIDL.g:906:1: ( 'struct' )
            // InternalSimpleIDL.g:907:2: 'struct'
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
    // InternalSimpleIDL.g:916:1: rule__Definition__Group_2__2 : rule__Definition__Group_2__2__Impl rule__Definition__Group_2__3 ;
    public final void rule__Definition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:920:1: ( rule__Definition__Group_2__2__Impl rule__Definition__Group_2__3 )
            // InternalSimpleIDL.g:921:2: rule__Definition__Group_2__2__Impl rule__Definition__Group_2__3
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
    // InternalSimpleIDL.g:928:1: rule__Definition__Group_2__2__Impl : ( ( rule__Definition__StructAssignment_2_2 ) ) ;
    public final void rule__Definition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:932:1: ( ( ( rule__Definition__StructAssignment_2_2 ) ) )
            // InternalSimpleIDL.g:933:1: ( ( rule__Definition__StructAssignment_2_2 ) )
            {
            // InternalSimpleIDL.g:933:1: ( ( rule__Definition__StructAssignment_2_2 ) )
            // InternalSimpleIDL.g:934:2: ( rule__Definition__StructAssignment_2_2 )
            {
             before(grammarAccess.getDefinitionAccess().getStructAssignment_2_2()); 
            // InternalSimpleIDL.g:935:2: ( rule__Definition__StructAssignment_2_2 )
            // InternalSimpleIDL.g:935:3: rule__Definition__StructAssignment_2_2
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
    // InternalSimpleIDL.g:943:1: rule__Definition__Group_2__3 : rule__Definition__Group_2__3__Impl ;
    public final void rule__Definition__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:947:1: ( rule__Definition__Group_2__3__Impl )
            // InternalSimpleIDL.g:948:2: rule__Definition__Group_2__3__Impl
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
    // InternalSimpleIDL.g:954:1: rule__Definition__Group_2__3__Impl : ( ';' ) ;
    public final void rule__Definition__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:958:1: ( ( ';' ) )
            // InternalSimpleIDL.g:959:1: ( ';' )
            {
            // InternalSimpleIDL.g:959:1: ( ';' )
            // InternalSimpleIDL.g:960:2: ';'
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
    // InternalSimpleIDL.g:970:1: rule__Definition__Group_3__0 : rule__Definition__Group_3__0__Impl rule__Definition__Group_3__1 ;
    public final void rule__Definition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:974:1: ( rule__Definition__Group_3__0__Impl rule__Definition__Group_3__1 )
            // InternalSimpleIDL.g:975:2: rule__Definition__Group_3__0__Impl rule__Definition__Group_3__1
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
    // InternalSimpleIDL.g:982:1: rule__Definition__Group_3__0__Impl : ( () ) ;
    public final void rule__Definition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:986:1: ( ( () ) )
            // InternalSimpleIDL.g:987:1: ( () )
            {
            // InternalSimpleIDL.g:987:1: ( () )
            // InternalSimpleIDL.g:988:2: ()
            {
             before(grammarAccess.getDefinitionAccess().getUnionAction_3_0()); 
            // InternalSimpleIDL.g:989:2: ()
            // InternalSimpleIDL.g:989:3: 
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
    // InternalSimpleIDL.g:997:1: rule__Definition__Group_3__1 : rule__Definition__Group_3__1__Impl rule__Definition__Group_3__2 ;
    public final void rule__Definition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1001:1: ( rule__Definition__Group_3__1__Impl rule__Definition__Group_3__2 )
            // InternalSimpleIDL.g:1002:2: rule__Definition__Group_3__1__Impl rule__Definition__Group_3__2
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
    // InternalSimpleIDL.g:1009:1: rule__Definition__Group_3__1__Impl : ( 'union' ) ;
    public final void rule__Definition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1013:1: ( ( 'union' ) )
            // InternalSimpleIDL.g:1014:1: ( 'union' )
            {
            // InternalSimpleIDL.g:1014:1: ( 'union' )
            // InternalSimpleIDL.g:1015:2: 'union'
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
    // InternalSimpleIDL.g:1024:1: rule__Definition__Group_3__2 : rule__Definition__Group_3__2__Impl rule__Definition__Group_3__3 ;
    public final void rule__Definition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1028:1: ( rule__Definition__Group_3__2__Impl rule__Definition__Group_3__3 )
            // InternalSimpleIDL.g:1029:2: rule__Definition__Group_3__2__Impl rule__Definition__Group_3__3
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
    // InternalSimpleIDL.g:1036:1: rule__Definition__Group_3__2__Impl : ( ( rule__Definition__NameAssignment_3_2 ) ) ;
    public final void rule__Definition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1040:1: ( ( ( rule__Definition__NameAssignment_3_2 ) ) )
            // InternalSimpleIDL.g:1041:1: ( ( rule__Definition__NameAssignment_3_2 ) )
            {
            // InternalSimpleIDL.g:1041:1: ( ( rule__Definition__NameAssignment_3_2 ) )
            // InternalSimpleIDL.g:1042:2: ( rule__Definition__NameAssignment_3_2 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_3_2()); 
            // InternalSimpleIDL.g:1043:2: ( rule__Definition__NameAssignment_3_2 )
            // InternalSimpleIDL.g:1043:3: rule__Definition__NameAssignment_3_2
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
    // InternalSimpleIDL.g:1051:1: rule__Definition__Group_3__3 : rule__Definition__Group_3__3__Impl rule__Definition__Group_3__4 ;
    public final void rule__Definition__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1055:1: ( rule__Definition__Group_3__3__Impl rule__Definition__Group_3__4 )
            // InternalSimpleIDL.g:1056:2: rule__Definition__Group_3__3__Impl rule__Definition__Group_3__4
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
    // InternalSimpleIDL.g:1063:1: rule__Definition__Group_3__3__Impl : ( '{' ) ;
    public final void rule__Definition__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1067:1: ( ( '{' ) )
            // InternalSimpleIDL.g:1068:1: ( '{' )
            {
            // InternalSimpleIDL.g:1068:1: ( '{' )
            // InternalSimpleIDL.g:1069:2: '{'
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
    // InternalSimpleIDL.g:1078:1: rule__Definition__Group_3__4 : rule__Definition__Group_3__4__Impl rule__Definition__Group_3__5 ;
    public final void rule__Definition__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1082:1: ( rule__Definition__Group_3__4__Impl rule__Definition__Group_3__5 )
            // InternalSimpleIDL.g:1083:2: rule__Definition__Group_3__4__Impl rule__Definition__Group_3__5
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
    // InternalSimpleIDL.g:1090:1: rule__Definition__Group_3__4__Impl : ( 'switch' ) ;
    public final void rule__Definition__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1094:1: ( ( 'switch' ) )
            // InternalSimpleIDL.g:1095:1: ( 'switch' )
            {
            // InternalSimpleIDL.g:1095:1: ( 'switch' )
            // InternalSimpleIDL.g:1096:2: 'switch'
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
    // InternalSimpleIDL.g:1105:1: rule__Definition__Group_3__5 : rule__Definition__Group_3__5__Impl rule__Definition__Group_3__6 ;
    public final void rule__Definition__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1109:1: ( rule__Definition__Group_3__5__Impl rule__Definition__Group_3__6 )
            // InternalSimpleIDL.g:1110:2: rule__Definition__Group_3__5__Impl rule__Definition__Group_3__6
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
    // InternalSimpleIDL.g:1117:1: rule__Definition__Group_3__5__Impl : ( '(' ) ;
    public final void rule__Definition__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1121:1: ( ( '(' ) )
            // InternalSimpleIDL.g:1122:1: ( '(' )
            {
            // InternalSimpleIDL.g:1122:1: ( '(' )
            // InternalSimpleIDL.g:1123:2: '('
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
    // InternalSimpleIDL.g:1132:1: rule__Definition__Group_3__6 : rule__Definition__Group_3__6__Impl rule__Definition__Group_3__7 ;
    public final void rule__Definition__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1136:1: ( rule__Definition__Group_3__6__Impl rule__Definition__Group_3__7 )
            // InternalSimpleIDL.g:1137:2: rule__Definition__Group_3__6__Impl rule__Definition__Group_3__7
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
    // InternalSimpleIDL.g:1144:1: rule__Definition__Group_3__6__Impl : ( 'unsigned' ) ;
    public final void rule__Definition__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1148:1: ( ( 'unsigned' ) )
            // InternalSimpleIDL.g:1149:1: ( 'unsigned' )
            {
            // InternalSimpleIDL.g:1149:1: ( 'unsigned' )
            // InternalSimpleIDL.g:1150:2: 'unsigned'
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
    // InternalSimpleIDL.g:1159:1: rule__Definition__Group_3__7 : rule__Definition__Group_3__7__Impl rule__Definition__Group_3__8 ;
    public final void rule__Definition__Group_3__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1163:1: ( rule__Definition__Group_3__7__Impl rule__Definition__Group_3__8 )
            // InternalSimpleIDL.g:1164:2: rule__Definition__Group_3__7__Impl rule__Definition__Group_3__8
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
    // InternalSimpleIDL.g:1171:1: rule__Definition__Group_3__7__Impl : ( 'short' ) ;
    public final void rule__Definition__Group_3__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1175:1: ( ( 'short' ) )
            // InternalSimpleIDL.g:1176:1: ( 'short' )
            {
            // InternalSimpleIDL.g:1176:1: ( 'short' )
            // InternalSimpleIDL.g:1177:2: 'short'
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
    // InternalSimpleIDL.g:1186:1: rule__Definition__Group_3__8 : rule__Definition__Group_3__8__Impl rule__Definition__Group_3__9 ;
    public final void rule__Definition__Group_3__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1190:1: ( rule__Definition__Group_3__8__Impl rule__Definition__Group_3__9 )
            // InternalSimpleIDL.g:1191:2: rule__Definition__Group_3__8__Impl rule__Definition__Group_3__9
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
    // InternalSimpleIDL.g:1198:1: rule__Definition__Group_3__8__Impl : ( ')' ) ;
    public final void rule__Definition__Group_3__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1202:1: ( ( ')' ) )
            // InternalSimpleIDL.g:1203:1: ( ')' )
            {
            // InternalSimpleIDL.g:1203:1: ( ')' )
            // InternalSimpleIDL.g:1204:2: ')'
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
    // InternalSimpleIDL.g:1213:1: rule__Definition__Group_3__9 : rule__Definition__Group_3__9__Impl rule__Definition__Group_3__10 ;
    public final void rule__Definition__Group_3__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1217:1: ( rule__Definition__Group_3__9__Impl rule__Definition__Group_3__10 )
            // InternalSimpleIDL.g:1218:2: rule__Definition__Group_3__9__Impl rule__Definition__Group_3__10
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
    // InternalSimpleIDL.g:1225:1: rule__Definition__Group_3__9__Impl : ( '{' ) ;
    public final void rule__Definition__Group_3__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1229:1: ( ( '{' ) )
            // InternalSimpleIDL.g:1230:1: ( '{' )
            {
            // InternalSimpleIDL.g:1230:1: ( '{' )
            // InternalSimpleIDL.g:1231:2: '{'
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
    // InternalSimpleIDL.g:1240:1: rule__Definition__Group_3__10 : rule__Definition__Group_3__10__Impl rule__Definition__Group_3__11 ;
    public final void rule__Definition__Group_3__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1244:1: ( rule__Definition__Group_3__10__Impl rule__Definition__Group_3__11 )
            // InternalSimpleIDL.g:1245:2: rule__Definition__Group_3__10__Impl rule__Definition__Group_3__11
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
    // InternalSimpleIDL.g:1252:1: rule__Definition__Group_3__10__Impl : ( ( ( rule__Definition__CasesAssignment_3_10 ) ) ( ( rule__Definition__CasesAssignment_3_10 )* ) ) ;
    public final void rule__Definition__Group_3__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1256:1: ( ( ( ( rule__Definition__CasesAssignment_3_10 ) ) ( ( rule__Definition__CasesAssignment_3_10 )* ) ) )
            // InternalSimpleIDL.g:1257:1: ( ( ( rule__Definition__CasesAssignment_3_10 ) ) ( ( rule__Definition__CasesAssignment_3_10 )* ) )
            {
            // InternalSimpleIDL.g:1257:1: ( ( ( rule__Definition__CasesAssignment_3_10 ) ) ( ( rule__Definition__CasesAssignment_3_10 )* ) )
            // InternalSimpleIDL.g:1258:2: ( ( rule__Definition__CasesAssignment_3_10 ) ) ( ( rule__Definition__CasesAssignment_3_10 )* )
            {
            // InternalSimpleIDL.g:1258:2: ( ( rule__Definition__CasesAssignment_3_10 ) )
            // InternalSimpleIDL.g:1259:3: ( rule__Definition__CasesAssignment_3_10 )
            {
             before(grammarAccess.getDefinitionAccess().getCasesAssignment_3_10()); 
            // InternalSimpleIDL.g:1260:3: ( rule__Definition__CasesAssignment_3_10 )
            // InternalSimpleIDL.g:1260:4: rule__Definition__CasesAssignment_3_10
            {
            pushFollow(FOLLOW_20);
            rule__Definition__CasesAssignment_3_10();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getCasesAssignment_3_10()); 

            }

            // InternalSimpleIDL.g:1263:2: ( ( rule__Definition__CasesAssignment_3_10 )* )
            // InternalSimpleIDL.g:1264:3: ( rule__Definition__CasesAssignment_3_10 )*
            {
             before(grammarAccess.getDefinitionAccess().getCasesAssignment_3_10()); 
            // InternalSimpleIDL.g:1265:3: ( rule__Definition__CasesAssignment_3_10 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSimpleIDL.g:1265:4: rule__Definition__CasesAssignment_3_10
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
    // InternalSimpleIDL.g:1274:1: rule__Definition__Group_3__11 : rule__Definition__Group_3__11__Impl rule__Definition__Group_3__12 ;
    public final void rule__Definition__Group_3__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1278:1: ( rule__Definition__Group_3__11__Impl rule__Definition__Group_3__12 )
            // InternalSimpleIDL.g:1279:2: rule__Definition__Group_3__11__Impl rule__Definition__Group_3__12
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
    // InternalSimpleIDL.g:1286:1: rule__Definition__Group_3__11__Impl : ( '}' ) ;
    public final void rule__Definition__Group_3__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1290:1: ( ( '}' ) )
            // InternalSimpleIDL.g:1291:1: ( '}' )
            {
            // InternalSimpleIDL.g:1291:1: ( '}' )
            // InternalSimpleIDL.g:1292:2: '}'
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
    // InternalSimpleIDL.g:1301:1: rule__Definition__Group_3__12 : rule__Definition__Group_3__12__Impl rule__Definition__Group_3__13 ;
    public final void rule__Definition__Group_3__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1305:1: ( rule__Definition__Group_3__12__Impl rule__Definition__Group_3__13 )
            // InternalSimpleIDL.g:1306:2: rule__Definition__Group_3__12__Impl rule__Definition__Group_3__13
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
    // InternalSimpleIDL.g:1313:1: rule__Definition__Group_3__12__Impl : ( ';' ) ;
    public final void rule__Definition__Group_3__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1317:1: ( ( ';' ) )
            // InternalSimpleIDL.g:1318:1: ( ';' )
            {
            // InternalSimpleIDL.g:1318:1: ( ';' )
            // InternalSimpleIDL.g:1319:2: ';'
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
    // InternalSimpleIDL.g:1328:1: rule__Definition__Group_3__13 : rule__Definition__Group_3__13__Impl rule__Definition__Group_3__14 ;
    public final void rule__Definition__Group_3__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1332:1: ( rule__Definition__Group_3__13__Impl rule__Definition__Group_3__14 )
            // InternalSimpleIDL.g:1333:2: rule__Definition__Group_3__13__Impl rule__Definition__Group_3__14
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
    // InternalSimpleIDL.g:1340:1: rule__Definition__Group_3__13__Impl : ( '}' ) ;
    public final void rule__Definition__Group_3__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1344:1: ( ( '}' ) )
            // InternalSimpleIDL.g:1345:1: ( '}' )
            {
            // InternalSimpleIDL.g:1345:1: ( '}' )
            // InternalSimpleIDL.g:1346:2: '}'
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
    // InternalSimpleIDL.g:1355:1: rule__Definition__Group_3__14 : rule__Definition__Group_3__14__Impl ;
    public final void rule__Definition__Group_3__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1359:1: ( rule__Definition__Group_3__14__Impl )
            // InternalSimpleIDL.g:1360:2: rule__Definition__Group_3__14__Impl
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
    // InternalSimpleIDL.g:1366:1: rule__Definition__Group_3__14__Impl : ( ';' ) ;
    public final void rule__Definition__Group_3__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1370:1: ( ( ';' ) )
            // InternalSimpleIDL.g:1371:1: ( ';' )
            {
            // InternalSimpleIDL.g:1371:1: ( ';' )
            // InternalSimpleIDL.g:1372:2: ';'
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
    // InternalSimpleIDL.g:1382:1: rule__Definition__Group_4__0 : rule__Definition__Group_4__0__Impl rule__Definition__Group_4__1 ;
    public final void rule__Definition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1386:1: ( rule__Definition__Group_4__0__Impl rule__Definition__Group_4__1 )
            // InternalSimpleIDL.g:1387:2: rule__Definition__Group_4__0__Impl rule__Definition__Group_4__1
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
    // InternalSimpleIDL.g:1394:1: rule__Definition__Group_4__0__Impl : ( () ) ;
    public final void rule__Definition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1398:1: ( ( () ) )
            // InternalSimpleIDL.g:1399:1: ( () )
            {
            // InternalSimpleIDL.g:1399:1: ( () )
            // InternalSimpleIDL.g:1400:2: ()
            {
             before(grammarAccess.getDefinitionAccess().getEnumAction_4_0()); 
            // InternalSimpleIDL.g:1401:2: ()
            // InternalSimpleIDL.g:1401:3: 
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
    // InternalSimpleIDL.g:1409:1: rule__Definition__Group_4__1 : rule__Definition__Group_4__1__Impl rule__Definition__Group_4__2 ;
    public final void rule__Definition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1413:1: ( rule__Definition__Group_4__1__Impl rule__Definition__Group_4__2 )
            // InternalSimpleIDL.g:1414:2: rule__Definition__Group_4__1__Impl rule__Definition__Group_4__2
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
    // InternalSimpleIDL.g:1421:1: rule__Definition__Group_4__1__Impl : ( 'enum' ) ;
    public final void rule__Definition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1425:1: ( ( 'enum' ) )
            // InternalSimpleIDL.g:1426:1: ( 'enum' )
            {
            // InternalSimpleIDL.g:1426:1: ( 'enum' )
            // InternalSimpleIDL.g:1427:2: 'enum'
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
    // InternalSimpleIDL.g:1436:1: rule__Definition__Group_4__2 : rule__Definition__Group_4__2__Impl rule__Definition__Group_4__3 ;
    public final void rule__Definition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1440:1: ( rule__Definition__Group_4__2__Impl rule__Definition__Group_4__3 )
            // InternalSimpleIDL.g:1441:2: rule__Definition__Group_4__2__Impl rule__Definition__Group_4__3
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
    // InternalSimpleIDL.g:1448:1: rule__Definition__Group_4__2__Impl : ( ( rule__Definition__NameAssignment_4_2 ) ) ;
    public final void rule__Definition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1452:1: ( ( ( rule__Definition__NameAssignment_4_2 ) ) )
            // InternalSimpleIDL.g:1453:1: ( ( rule__Definition__NameAssignment_4_2 ) )
            {
            // InternalSimpleIDL.g:1453:1: ( ( rule__Definition__NameAssignment_4_2 ) )
            // InternalSimpleIDL.g:1454:2: ( rule__Definition__NameAssignment_4_2 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_4_2()); 
            // InternalSimpleIDL.g:1455:2: ( rule__Definition__NameAssignment_4_2 )
            // InternalSimpleIDL.g:1455:3: rule__Definition__NameAssignment_4_2
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
    // InternalSimpleIDL.g:1463:1: rule__Definition__Group_4__3 : rule__Definition__Group_4__3__Impl rule__Definition__Group_4__4 ;
    public final void rule__Definition__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1467:1: ( rule__Definition__Group_4__3__Impl rule__Definition__Group_4__4 )
            // InternalSimpleIDL.g:1468:2: rule__Definition__Group_4__3__Impl rule__Definition__Group_4__4
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
    // InternalSimpleIDL.g:1475:1: rule__Definition__Group_4__3__Impl : ( '{' ) ;
    public final void rule__Definition__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1479:1: ( ( '{' ) )
            // InternalSimpleIDL.g:1480:1: ( '{' )
            {
            // InternalSimpleIDL.g:1480:1: ( '{' )
            // InternalSimpleIDL.g:1481:2: '{'
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
    // InternalSimpleIDL.g:1490:1: rule__Definition__Group_4__4 : rule__Definition__Group_4__4__Impl rule__Definition__Group_4__5 ;
    public final void rule__Definition__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1494:1: ( rule__Definition__Group_4__4__Impl rule__Definition__Group_4__5 )
            // InternalSimpleIDL.g:1495:2: rule__Definition__Group_4__4__Impl rule__Definition__Group_4__5
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
    // InternalSimpleIDL.g:1502:1: rule__Definition__Group_4__4__Impl : ( ( rule__Definition__LiteralsAssignment_4_4 ) ) ;
    public final void rule__Definition__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1506:1: ( ( ( rule__Definition__LiteralsAssignment_4_4 ) ) )
            // InternalSimpleIDL.g:1507:1: ( ( rule__Definition__LiteralsAssignment_4_4 ) )
            {
            // InternalSimpleIDL.g:1507:1: ( ( rule__Definition__LiteralsAssignment_4_4 ) )
            // InternalSimpleIDL.g:1508:2: ( rule__Definition__LiteralsAssignment_4_4 )
            {
             before(grammarAccess.getDefinitionAccess().getLiteralsAssignment_4_4()); 
            // InternalSimpleIDL.g:1509:2: ( rule__Definition__LiteralsAssignment_4_4 )
            // InternalSimpleIDL.g:1509:3: rule__Definition__LiteralsAssignment_4_4
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
    // InternalSimpleIDL.g:1517:1: rule__Definition__Group_4__5 : rule__Definition__Group_4__5__Impl rule__Definition__Group_4__6 ;
    public final void rule__Definition__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1521:1: ( rule__Definition__Group_4__5__Impl rule__Definition__Group_4__6 )
            // InternalSimpleIDL.g:1522:2: rule__Definition__Group_4__5__Impl rule__Definition__Group_4__6
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
    // InternalSimpleIDL.g:1529:1: rule__Definition__Group_4__5__Impl : ( ( rule__Definition__Group_4_5__0 )* ) ;
    public final void rule__Definition__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1533:1: ( ( ( rule__Definition__Group_4_5__0 )* ) )
            // InternalSimpleIDL.g:1534:1: ( ( rule__Definition__Group_4_5__0 )* )
            {
            // InternalSimpleIDL.g:1534:1: ( ( rule__Definition__Group_4_5__0 )* )
            // InternalSimpleIDL.g:1535:2: ( rule__Definition__Group_4_5__0 )*
            {
             before(grammarAccess.getDefinitionAccess().getGroup_4_5()); 
            // InternalSimpleIDL.g:1536:2: ( rule__Definition__Group_4_5__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSimpleIDL.g:1536:3: rule__Definition__Group_4_5__0
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
    // InternalSimpleIDL.g:1544:1: rule__Definition__Group_4__6 : rule__Definition__Group_4__6__Impl rule__Definition__Group_4__7 ;
    public final void rule__Definition__Group_4__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1548:1: ( rule__Definition__Group_4__6__Impl rule__Definition__Group_4__7 )
            // InternalSimpleIDL.g:1549:2: rule__Definition__Group_4__6__Impl rule__Definition__Group_4__7
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
    // InternalSimpleIDL.g:1556:1: rule__Definition__Group_4__6__Impl : ( '}' ) ;
    public final void rule__Definition__Group_4__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1560:1: ( ( '}' ) )
            // InternalSimpleIDL.g:1561:1: ( '}' )
            {
            // InternalSimpleIDL.g:1561:1: ( '}' )
            // InternalSimpleIDL.g:1562:2: '}'
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
    // InternalSimpleIDL.g:1571:1: rule__Definition__Group_4__7 : rule__Definition__Group_4__7__Impl ;
    public final void rule__Definition__Group_4__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1575:1: ( rule__Definition__Group_4__7__Impl )
            // InternalSimpleIDL.g:1576:2: rule__Definition__Group_4__7__Impl
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
    // InternalSimpleIDL.g:1582:1: rule__Definition__Group_4__7__Impl : ( ';' ) ;
    public final void rule__Definition__Group_4__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1586:1: ( ( ';' ) )
            // InternalSimpleIDL.g:1587:1: ( ';' )
            {
            // InternalSimpleIDL.g:1587:1: ( ';' )
            // InternalSimpleIDL.g:1588:2: ';'
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
    // InternalSimpleIDL.g:1598:1: rule__Definition__Group_4_5__0 : rule__Definition__Group_4_5__0__Impl rule__Definition__Group_4_5__1 ;
    public final void rule__Definition__Group_4_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1602:1: ( rule__Definition__Group_4_5__0__Impl rule__Definition__Group_4_5__1 )
            // InternalSimpleIDL.g:1603:2: rule__Definition__Group_4_5__0__Impl rule__Definition__Group_4_5__1
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
    // InternalSimpleIDL.g:1610:1: rule__Definition__Group_4_5__0__Impl : ( ',' ) ;
    public final void rule__Definition__Group_4_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1614:1: ( ( ',' ) )
            // InternalSimpleIDL.g:1615:1: ( ',' )
            {
            // InternalSimpleIDL.g:1615:1: ( ',' )
            // InternalSimpleIDL.g:1616:2: ','
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
    // InternalSimpleIDL.g:1625:1: rule__Definition__Group_4_5__1 : rule__Definition__Group_4_5__1__Impl ;
    public final void rule__Definition__Group_4_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1629:1: ( rule__Definition__Group_4_5__1__Impl )
            // InternalSimpleIDL.g:1630:2: rule__Definition__Group_4_5__1__Impl
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
    // InternalSimpleIDL.g:1636:1: rule__Definition__Group_4_5__1__Impl : ( ( rule__Definition__LiteralsAssignment_4_5_1 ) ) ;
    public final void rule__Definition__Group_4_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1640:1: ( ( ( rule__Definition__LiteralsAssignment_4_5_1 ) ) )
            // InternalSimpleIDL.g:1641:1: ( ( rule__Definition__LiteralsAssignment_4_5_1 ) )
            {
            // InternalSimpleIDL.g:1641:1: ( ( rule__Definition__LiteralsAssignment_4_5_1 ) )
            // InternalSimpleIDL.g:1642:2: ( rule__Definition__LiteralsAssignment_4_5_1 )
            {
             before(grammarAccess.getDefinitionAccess().getLiteralsAssignment_4_5_1()); 
            // InternalSimpleIDL.g:1643:2: ( rule__Definition__LiteralsAssignment_4_5_1 )
            // InternalSimpleIDL.g:1643:3: rule__Definition__LiteralsAssignment_4_5_1
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
    // InternalSimpleIDL.g:1652:1: rule__Definition__Group_5__0 : rule__Definition__Group_5__0__Impl rule__Definition__Group_5__1 ;
    public final void rule__Definition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1656:1: ( rule__Definition__Group_5__0__Impl rule__Definition__Group_5__1 )
            // InternalSimpleIDL.g:1657:2: rule__Definition__Group_5__0__Impl rule__Definition__Group_5__1
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
    // InternalSimpleIDL.g:1664:1: rule__Definition__Group_5__0__Impl : ( () ) ;
    public final void rule__Definition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1668:1: ( ( () ) )
            // InternalSimpleIDL.g:1669:1: ( () )
            {
            // InternalSimpleIDL.g:1669:1: ( () )
            // InternalSimpleIDL.g:1670:2: ()
            {
             before(grammarAccess.getDefinitionAccess().getTypedefAction_5_0()); 
            // InternalSimpleIDL.g:1671:2: ()
            // InternalSimpleIDL.g:1671:3: 
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
    // InternalSimpleIDL.g:1679:1: rule__Definition__Group_5__1 : rule__Definition__Group_5__1__Impl rule__Definition__Group_5__2 ;
    public final void rule__Definition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1683:1: ( rule__Definition__Group_5__1__Impl rule__Definition__Group_5__2 )
            // InternalSimpleIDL.g:1684:2: rule__Definition__Group_5__1__Impl rule__Definition__Group_5__2
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
    // InternalSimpleIDL.g:1691:1: rule__Definition__Group_5__1__Impl : ( 'typedef' ) ;
    public final void rule__Definition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1695:1: ( ( 'typedef' ) )
            // InternalSimpleIDL.g:1696:1: ( 'typedef' )
            {
            // InternalSimpleIDL.g:1696:1: ( 'typedef' )
            // InternalSimpleIDL.g:1697:2: 'typedef'
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
    // InternalSimpleIDL.g:1706:1: rule__Definition__Group_5__2 : rule__Definition__Group_5__2__Impl rule__Definition__Group_5__3 ;
    public final void rule__Definition__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1710:1: ( rule__Definition__Group_5__2__Impl rule__Definition__Group_5__3 )
            // InternalSimpleIDL.g:1711:2: rule__Definition__Group_5__2__Impl rule__Definition__Group_5__3
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
    // InternalSimpleIDL.g:1718:1: rule__Definition__Group_5__2__Impl : ( ( rule__Definition__TypeAssignment_5_2 ) ) ;
    public final void rule__Definition__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1722:1: ( ( ( rule__Definition__TypeAssignment_5_2 ) ) )
            // InternalSimpleIDL.g:1723:1: ( ( rule__Definition__TypeAssignment_5_2 ) )
            {
            // InternalSimpleIDL.g:1723:1: ( ( rule__Definition__TypeAssignment_5_2 ) )
            // InternalSimpleIDL.g:1724:2: ( rule__Definition__TypeAssignment_5_2 )
            {
             before(grammarAccess.getDefinitionAccess().getTypeAssignment_5_2()); 
            // InternalSimpleIDL.g:1725:2: ( rule__Definition__TypeAssignment_5_2 )
            // InternalSimpleIDL.g:1725:3: rule__Definition__TypeAssignment_5_2
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
    // InternalSimpleIDL.g:1733:1: rule__Definition__Group_5__3 : rule__Definition__Group_5__3__Impl rule__Definition__Group_5__4 ;
    public final void rule__Definition__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1737:1: ( rule__Definition__Group_5__3__Impl rule__Definition__Group_5__4 )
            // InternalSimpleIDL.g:1738:2: rule__Definition__Group_5__3__Impl rule__Definition__Group_5__4
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
    // InternalSimpleIDL.g:1745:1: rule__Definition__Group_5__3__Impl : ( ( rule__Definition__NamesAssignment_5_3 ) ) ;
    public final void rule__Definition__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1749:1: ( ( ( rule__Definition__NamesAssignment_5_3 ) ) )
            // InternalSimpleIDL.g:1750:1: ( ( rule__Definition__NamesAssignment_5_3 ) )
            {
            // InternalSimpleIDL.g:1750:1: ( ( rule__Definition__NamesAssignment_5_3 ) )
            // InternalSimpleIDL.g:1751:2: ( rule__Definition__NamesAssignment_5_3 )
            {
             before(grammarAccess.getDefinitionAccess().getNamesAssignment_5_3()); 
            // InternalSimpleIDL.g:1752:2: ( rule__Definition__NamesAssignment_5_3 )
            // InternalSimpleIDL.g:1752:3: rule__Definition__NamesAssignment_5_3
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
    // InternalSimpleIDL.g:1760:1: rule__Definition__Group_5__4 : rule__Definition__Group_5__4__Impl rule__Definition__Group_5__5 ;
    public final void rule__Definition__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1764:1: ( rule__Definition__Group_5__4__Impl rule__Definition__Group_5__5 )
            // InternalSimpleIDL.g:1765:2: rule__Definition__Group_5__4__Impl rule__Definition__Group_5__5
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
    // InternalSimpleIDL.g:1772:1: rule__Definition__Group_5__4__Impl : ( ( rule__Definition__Group_5_4__0 )* ) ;
    public final void rule__Definition__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1776:1: ( ( ( rule__Definition__Group_5_4__0 )* ) )
            // InternalSimpleIDL.g:1777:1: ( ( rule__Definition__Group_5_4__0 )* )
            {
            // InternalSimpleIDL.g:1777:1: ( ( rule__Definition__Group_5_4__0 )* )
            // InternalSimpleIDL.g:1778:2: ( rule__Definition__Group_5_4__0 )*
            {
             before(grammarAccess.getDefinitionAccess().getGroup_5_4()); 
            // InternalSimpleIDL.g:1779:2: ( rule__Definition__Group_5_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSimpleIDL.g:1779:3: rule__Definition__Group_5_4__0
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
    // InternalSimpleIDL.g:1787:1: rule__Definition__Group_5__5 : rule__Definition__Group_5__5__Impl ;
    public final void rule__Definition__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1791:1: ( rule__Definition__Group_5__5__Impl )
            // InternalSimpleIDL.g:1792:2: rule__Definition__Group_5__5__Impl
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
    // InternalSimpleIDL.g:1798:1: rule__Definition__Group_5__5__Impl : ( ';' ) ;
    public final void rule__Definition__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1802:1: ( ( ';' ) )
            // InternalSimpleIDL.g:1803:1: ( ';' )
            {
            // InternalSimpleIDL.g:1803:1: ( ';' )
            // InternalSimpleIDL.g:1804:2: ';'
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
    // InternalSimpleIDL.g:1814:1: rule__Definition__Group_5_4__0 : rule__Definition__Group_5_4__0__Impl rule__Definition__Group_5_4__1 ;
    public final void rule__Definition__Group_5_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1818:1: ( rule__Definition__Group_5_4__0__Impl rule__Definition__Group_5_4__1 )
            // InternalSimpleIDL.g:1819:2: rule__Definition__Group_5_4__0__Impl rule__Definition__Group_5_4__1
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
    // InternalSimpleIDL.g:1826:1: rule__Definition__Group_5_4__0__Impl : ( ',' ) ;
    public final void rule__Definition__Group_5_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1830:1: ( ( ',' ) )
            // InternalSimpleIDL.g:1831:1: ( ',' )
            {
            // InternalSimpleIDL.g:1831:1: ( ',' )
            // InternalSimpleIDL.g:1832:2: ','
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
    // InternalSimpleIDL.g:1841:1: rule__Definition__Group_5_4__1 : rule__Definition__Group_5_4__1__Impl ;
    public final void rule__Definition__Group_5_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1845:1: ( rule__Definition__Group_5_4__1__Impl )
            // InternalSimpleIDL.g:1846:2: rule__Definition__Group_5_4__1__Impl
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
    // InternalSimpleIDL.g:1852:1: rule__Definition__Group_5_4__1__Impl : ( ( rule__Definition__NamesAssignment_5_4_1 ) ) ;
    public final void rule__Definition__Group_5_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1856:1: ( ( ( rule__Definition__NamesAssignment_5_4_1 ) ) )
            // InternalSimpleIDL.g:1857:1: ( ( rule__Definition__NamesAssignment_5_4_1 ) )
            {
            // InternalSimpleIDL.g:1857:1: ( ( rule__Definition__NamesAssignment_5_4_1 ) )
            // InternalSimpleIDL.g:1858:2: ( rule__Definition__NamesAssignment_5_4_1 )
            {
             before(grammarAccess.getDefinitionAccess().getNamesAssignment_5_4_1()); 
            // InternalSimpleIDL.g:1859:2: ( rule__Definition__NamesAssignment_5_4_1 )
            // InternalSimpleIDL.g:1859:3: rule__Definition__NamesAssignment_5_4_1
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
    // InternalSimpleIDL.g:1868:1: rule__Member__Group__0 : rule__Member__Group__0__Impl rule__Member__Group__1 ;
    public final void rule__Member__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1872:1: ( rule__Member__Group__0__Impl rule__Member__Group__1 )
            // InternalSimpleIDL.g:1873:2: rule__Member__Group__0__Impl rule__Member__Group__1
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
    // InternalSimpleIDL.g:1880:1: rule__Member__Group__0__Impl : ( ( rule__Member__TypeAssignment_0 ) ) ;
    public final void rule__Member__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1884:1: ( ( ( rule__Member__TypeAssignment_0 ) ) )
            // InternalSimpleIDL.g:1885:1: ( ( rule__Member__TypeAssignment_0 ) )
            {
            // InternalSimpleIDL.g:1885:1: ( ( rule__Member__TypeAssignment_0 ) )
            // InternalSimpleIDL.g:1886:2: ( rule__Member__TypeAssignment_0 )
            {
             before(grammarAccess.getMemberAccess().getTypeAssignment_0()); 
            // InternalSimpleIDL.g:1887:2: ( rule__Member__TypeAssignment_0 )
            // InternalSimpleIDL.g:1887:3: rule__Member__TypeAssignment_0
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
    // InternalSimpleIDL.g:1895:1: rule__Member__Group__1 : rule__Member__Group__1__Impl rule__Member__Group__2 ;
    public final void rule__Member__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1899:1: ( rule__Member__Group__1__Impl rule__Member__Group__2 )
            // InternalSimpleIDL.g:1900:2: rule__Member__Group__1__Impl rule__Member__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalSimpleIDL.g:1907:1: rule__Member__Group__1__Impl : ( ( rule__Member__NamesAssignment_1 ) ) ;
    public final void rule__Member__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1911:1: ( ( ( rule__Member__NamesAssignment_1 ) ) )
            // InternalSimpleIDL.g:1912:1: ( ( rule__Member__NamesAssignment_1 ) )
            {
            // InternalSimpleIDL.g:1912:1: ( ( rule__Member__NamesAssignment_1 ) )
            // InternalSimpleIDL.g:1913:2: ( rule__Member__NamesAssignment_1 )
            {
             before(grammarAccess.getMemberAccess().getNamesAssignment_1()); 
            // InternalSimpleIDL.g:1914:2: ( rule__Member__NamesAssignment_1 )
            // InternalSimpleIDL.g:1914:3: rule__Member__NamesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Member__NamesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getNamesAssignment_1()); 

            }


            }

        }
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
    // InternalSimpleIDL.g:1922:1: rule__Member__Group__2 : rule__Member__Group__2__Impl rule__Member__Group__3 ;
    public final void rule__Member__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1926:1: ( rule__Member__Group__2__Impl rule__Member__Group__3 )
            // InternalSimpleIDL.g:1927:2: rule__Member__Group__2__Impl rule__Member__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Member__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group__3();

            state._fsp--;


            }

        }
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
    // InternalSimpleIDL.g:1934:1: rule__Member__Group__2__Impl : ( ( rule__Member__Group_2__0 )* ) ;
    public final void rule__Member__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1938:1: ( ( ( rule__Member__Group_2__0 )* ) )
            // InternalSimpleIDL.g:1939:1: ( ( rule__Member__Group_2__0 )* )
            {
            // InternalSimpleIDL.g:1939:1: ( ( rule__Member__Group_2__0 )* )
            // InternalSimpleIDL.g:1940:2: ( rule__Member__Group_2__0 )*
            {
             before(grammarAccess.getMemberAccess().getGroup_2()); 
            // InternalSimpleIDL.g:1941:2: ( rule__Member__Group_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSimpleIDL.g:1941:3: rule__Member__Group_2__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Member__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMemberAccess().getGroup_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Member__Group__3"
    // InternalSimpleIDL.g:1949:1: rule__Member__Group__3 : rule__Member__Group__3__Impl ;
    public final void rule__Member__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1953:1: ( rule__Member__Group__3__Impl )
            // InternalSimpleIDL.g:1954:2: rule__Member__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Member__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__3"


    // $ANTLR start "rule__Member__Group__3__Impl"
    // InternalSimpleIDL.g:1960:1: rule__Member__Group__3__Impl : ( ';' ) ;
    public final void rule__Member__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1964:1: ( ( ';' ) )
            // InternalSimpleIDL.g:1965:1: ( ';' )
            {
            // InternalSimpleIDL.g:1965:1: ( ';' )
            // InternalSimpleIDL.g:1966:2: ';'
            {
             before(grammarAccess.getMemberAccess().getSemicolonKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__3__Impl"


    // $ANTLR start "rule__Member__Group_2__0"
    // InternalSimpleIDL.g:1976:1: rule__Member__Group_2__0 : rule__Member__Group_2__0__Impl rule__Member__Group_2__1 ;
    public final void rule__Member__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1980:1: ( rule__Member__Group_2__0__Impl rule__Member__Group_2__1 )
            // InternalSimpleIDL.g:1981:2: rule__Member__Group_2__0__Impl rule__Member__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Member__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group_2__0"


    // $ANTLR start "rule__Member__Group_2__0__Impl"
    // InternalSimpleIDL.g:1988:1: rule__Member__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Member__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:1992:1: ( ( ',' ) )
            // InternalSimpleIDL.g:1993:1: ( ',' )
            {
            // InternalSimpleIDL.g:1993:1: ( ',' )
            // InternalSimpleIDL.g:1994:2: ','
            {
             before(grammarAccess.getMemberAccess().getCommaKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group_2__0__Impl"


    // $ANTLR start "rule__Member__Group_2__1"
    // InternalSimpleIDL.g:2003:1: rule__Member__Group_2__1 : rule__Member__Group_2__1__Impl ;
    public final void rule__Member__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2007:1: ( rule__Member__Group_2__1__Impl )
            // InternalSimpleIDL.g:2008:2: rule__Member__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Member__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group_2__1"


    // $ANTLR start "rule__Member__Group_2__1__Impl"
    // InternalSimpleIDL.g:2014:1: rule__Member__Group_2__1__Impl : ( ( rule__Member__NamesAssignment_2_1 ) ) ;
    public final void rule__Member__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2018:1: ( ( ( rule__Member__NamesAssignment_2_1 ) ) )
            // InternalSimpleIDL.g:2019:1: ( ( rule__Member__NamesAssignment_2_1 ) )
            {
            // InternalSimpleIDL.g:2019:1: ( ( rule__Member__NamesAssignment_2_1 ) )
            // InternalSimpleIDL.g:2020:2: ( rule__Member__NamesAssignment_2_1 )
            {
             before(grammarAccess.getMemberAccess().getNamesAssignment_2_1()); 
            // InternalSimpleIDL.g:2021:2: ( rule__Member__NamesAssignment_2_1 )
            // InternalSimpleIDL.g:2021:3: rule__Member__NamesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Member__NamesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getNamesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group_2__1__Impl"


    // $ANTLR start "rule__Case__Group__0"
    // InternalSimpleIDL.g:2030:1: rule__Case__Group__0 : rule__Case__Group__0__Impl rule__Case__Group__1 ;
    public final void rule__Case__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2034:1: ( rule__Case__Group__0__Impl rule__Case__Group__1 )
            // InternalSimpleIDL.g:2035:2: rule__Case__Group__0__Impl rule__Case__Group__1
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
    // InternalSimpleIDL.g:2042:1: rule__Case__Group__0__Impl : ( ( ( rule__Case__Group_0__0 ) ) ( ( rule__Case__Group_0__0 )* ) ) ;
    public final void rule__Case__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2046:1: ( ( ( ( rule__Case__Group_0__0 ) ) ( ( rule__Case__Group_0__0 )* ) ) )
            // InternalSimpleIDL.g:2047:1: ( ( ( rule__Case__Group_0__0 ) ) ( ( rule__Case__Group_0__0 )* ) )
            {
            // InternalSimpleIDL.g:2047:1: ( ( ( rule__Case__Group_0__0 ) ) ( ( rule__Case__Group_0__0 )* ) )
            // InternalSimpleIDL.g:2048:2: ( ( rule__Case__Group_0__0 ) ) ( ( rule__Case__Group_0__0 )* )
            {
            // InternalSimpleIDL.g:2048:2: ( ( rule__Case__Group_0__0 ) )
            // InternalSimpleIDL.g:2049:3: ( rule__Case__Group_0__0 )
            {
             before(grammarAccess.getCaseAccess().getGroup_0()); 
            // InternalSimpleIDL.g:2050:3: ( rule__Case__Group_0__0 )
            // InternalSimpleIDL.g:2050:4: rule__Case__Group_0__0
            {
            pushFollow(FOLLOW_20);
            rule__Case__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getGroup_0()); 

            }

            // InternalSimpleIDL.g:2053:2: ( ( rule__Case__Group_0__0 )* )
            // InternalSimpleIDL.g:2054:3: ( rule__Case__Group_0__0 )*
            {
             before(grammarAccess.getCaseAccess().getGroup_0()); 
            // InternalSimpleIDL.g:2055:3: ( rule__Case__Group_0__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSimpleIDL.g:2055:4: rule__Case__Group_0__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Case__Group_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalSimpleIDL.g:2064:1: rule__Case__Group__1 : rule__Case__Group__1__Impl rule__Case__Group__2 ;
    public final void rule__Case__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2068:1: ( rule__Case__Group__1__Impl rule__Case__Group__2 )
            // InternalSimpleIDL.g:2069:2: rule__Case__Group__1__Impl rule__Case__Group__2
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
    // InternalSimpleIDL.g:2076:1: rule__Case__Group__1__Impl : ( ( rule__Case__TypeAssignment_1 ) ) ;
    public final void rule__Case__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2080:1: ( ( ( rule__Case__TypeAssignment_1 ) ) )
            // InternalSimpleIDL.g:2081:1: ( ( rule__Case__TypeAssignment_1 ) )
            {
            // InternalSimpleIDL.g:2081:1: ( ( rule__Case__TypeAssignment_1 ) )
            // InternalSimpleIDL.g:2082:2: ( rule__Case__TypeAssignment_1 )
            {
             before(grammarAccess.getCaseAccess().getTypeAssignment_1()); 
            // InternalSimpleIDL.g:2083:2: ( rule__Case__TypeAssignment_1 )
            // InternalSimpleIDL.g:2083:3: rule__Case__TypeAssignment_1
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
    // InternalSimpleIDL.g:2091:1: rule__Case__Group__2 : rule__Case__Group__2__Impl rule__Case__Group__3 ;
    public final void rule__Case__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2095:1: ( rule__Case__Group__2__Impl rule__Case__Group__3 )
            // InternalSimpleIDL.g:2096:2: rule__Case__Group__2__Impl rule__Case__Group__3
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
    // InternalSimpleIDL.g:2103:1: rule__Case__Group__2__Impl : ( ( rule__Case__NameAssignment_2 ) ) ;
    public final void rule__Case__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2107:1: ( ( ( rule__Case__NameAssignment_2 ) ) )
            // InternalSimpleIDL.g:2108:1: ( ( rule__Case__NameAssignment_2 ) )
            {
            // InternalSimpleIDL.g:2108:1: ( ( rule__Case__NameAssignment_2 ) )
            // InternalSimpleIDL.g:2109:2: ( rule__Case__NameAssignment_2 )
            {
             before(grammarAccess.getCaseAccess().getNameAssignment_2()); 
            // InternalSimpleIDL.g:2110:2: ( rule__Case__NameAssignment_2 )
            // InternalSimpleIDL.g:2110:3: rule__Case__NameAssignment_2
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
    // InternalSimpleIDL.g:2118:1: rule__Case__Group__3 : rule__Case__Group__3__Impl ;
    public final void rule__Case__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2122:1: ( rule__Case__Group__3__Impl )
            // InternalSimpleIDL.g:2123:2: rule__Case__Group__3__Impl
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
    // InternalSimpleIDL.g:2129:1: rule__Case__Group__3__Impl : ( ';' ) ;
    public final void rule__Case__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2133:1: ( ( ';' ) )
            // InternalSimpleIDL.g:2134:1: ( ';' )
            {
            // InternalSimpleIDL.g:2134:1: ( ';' )
            // InternalSimpleIDL.g:2135:2: ';'
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
    // InternalSimpleIDL.g:2145:1: rule__Case__Group_0__0 : rule__Case__Group_0__0__Impl rule__Case__Group_0__1 ;
    public final void rule__Case__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2149:1: ( rule__Case__Group_0__0__Impl rule__Case__Group_0__1 )
            // InternalSimpleIDL.g:2150:2: rule__Case__Group_0__0__Impl rule__Case__Group_0__1
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
    // InternalSimpleIDL.g:2157:1: rule__Case__Group_0__0__Impl : ( 'case' ) ;
    public final void rule__Case__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2161:1: ( ( 'case' ) )
            // InternalSimpleIDL.g:2162:1: ( 'case' )
            {
            // InternalSimpleIDL.g:2162:1: ( 'case' )
            // InternalSimpleIDL.g:2163:2: 'case'
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
    // InternalSimpleIDL.g:2172:1: rule__Case__Group_0__1 : rule__Case__Group_0__1__Impl rule__Case__Group_0__2 ;
    public final void rule__Case__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2176:1: ( rule__Case__Group_0__1__Impl rule__Case__Group_0__2 )
            // InternalSimpleIDL.g:2177:2: rule__Case__Group_0__1__Impl rule__Case__Group_0__2
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
    // InternalSimpleIDL.g:2184:1: rule__Case__Group_0__1__Impl : ( ( rule__Case__LabelsAssignment_0_1 ) ) ;
    public final void rule__Case__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2188:1: ( ( ( rule__Case__LabelsAssignment_0_1 ) ) )
            // InternalSimpleIDL.g:2189:1: ( ( rule__Case__LabelsAssignment_0_1 ) )
            {
            // InternalSimpleIDL.g:2189:1: ( ( rule__Case__LabelsAssignment_0_1 ) )
            // InternalSimpleIDL.g:2190:2: ( rule__Case__LabelsAssignment_0_1 )
            {
             before(grammarAccess.getCaseAccess().getLabelsAssignment_0_1()); 
            // InternalSimpleIDL.g:2191:2: ( rule__Case__LabelsAssignment_0_1 )
            // InternalSimpleIDL.g:2191:3: rule__Case__LabelsAssignment_0_1
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
    // InternalSimpleIDL.g:2199:1: rule__Case__Group_0__2 : rule__Case__Group_0__2__Impl ;
    public final void rule__Case__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2203:1: ( rule__Case__Group_0__2__Impl )
            // InternalSimpleIDL.g:2204:2: rule__Case__Group_0__2__Impl
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
    // InternalSimpleIDL.g:2210:1: rule__Case__Group_0__2__Impl : ( ':' ) ;
    public final void rule__Case__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2214:1: ( ( ':' ) )
            // InternalSimpleIDL.g:2215:1: ( ':' )
            {
            // InternalSimpleIDL.g:2215:1: ( ':' )
            // InternalSimpleIDL.g:2216:2: ':'
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
    // InternalSimpleIDL.g:2226:1: rule__AnyDeclarator__Group__0 : rule__AnyDeclarator__Group__0__Impl rule__AnyDeclarator__Group__1 ;
    public final void rule__AnyDeclarator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2230:1: ( rule__AnyDeclarator__Group__0__Impl rule__AnyDeclarator__Group__1 )
            // InternalSimpleIDL.g:2231:2: rule__AnyDeclarator__Group__0__Impl rule__AnyDeclarator__Group__1
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
    // InternalSimpleIDL.g:2238:1: rule__AnyDeclarator__Group__0__Impl : ( ( rule__AnyDeclarator__NameAssignment_0 ) ) ;
    public final void rule__AnyDeclarator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2242:1: ( ( ( rule__AnyDeclarator__NameAssignment_0 ) ) )
            // InternalSimpleIDL.g:2243:1: ( ( rule__AnyDeclarator__NameAssignment_0 ) )
            {
            // InternalSimpleIDL.g:2243:1: ( ( rule__AnyDeclarator__NameAssignment_0 ) )
            // InternalSimpleIDL.g:2244:2: ( rule__AnyDeclarator__NameAssignment_0 )
            {
             before(grammarAccess.getAnyDeclaratorAccess().getNameAssignment_0()); 
            // InternalSimpleIDL.g:2245:2: ( rule__AnyDeclarator__NameAssignment_0 )
            // InternalSimpleIDL.g:2245:3: rule__AnyDeclarator__NameAssignment_0
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
    // InternalSimpleIDL.g:2253:1: rule__AnyDeclarator__Group__1 : rule__AnyDeclarator__Group__1__Impl ;
    public final void rule__AnyDeclarator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2257:1: ( rule__AnyDeclarator__Group__1__Impl )
            // InternalSimpleIDL.g:2258:2: rule__AnyDeclarator__Group__1__Impl
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
    // InternalSimpleIDL.g:2264:1: rule__AnyDeclarator__Group__1__Impl : ( ( rule__AnyDeclarator__Group_1__0 )* ) ;
    public final void rule__AnyDeclarator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2268:1: ( ( ( rule__AnyDeclarator__Group_1__0 )* ) )
            // InternalSimpleIDL.g:2269:1: ( ( rule__AnyDeclarator__Group_1__0 )* )
            {
            // InternalSimpleIDL.g:2269:1: ( ( rule__AnyDeclarator__Group_1__0 )* )
            // InternalSimpleIDL.g:2270:2: ( rule__AnyDeclarator__Group_1__0 )*
            {
             before(grammarAccess.getAnyDeclaratorAccess().getGroup_1()); 
            // InternalSimpleIDL.g:2271:2: ( rule__AnyDeclarator__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSimpleIDL.g:2271:3: rule__AnyDeclarator__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__AnyDeclarator__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getAnyDeclaratorAccess().getGroup_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__AnyDeclarator__Group_1__0"
    // InternalSimpleIDL.g:2280:1: rule__AnyDeclarator__Group_1__0 : rule__AnyDeclarator__Group_1__0__Impl rule__AnyDeclarator__Group_1__1 ;
    public final void rule__AnyDeclarator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2284:1: ( rule__AnyDeclarator__Group_1__0__Impl rule__AnyDeclarator__Group_1__1 )
            // InternalSimpleIDL.g:2285:2: rule__AnyDeclarator__Group_1__0__Impl rule__AnyDeclarator__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__AnyDeclarator__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnyDeclarator__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyDeclarator__Group_1__0"


    // $ANTLR start "rule__AnyDeclarator__Group_1__0__Impl"
    // InternalSimpleIDL.g:2292:1: rule__AnyDeclarator__Group_1__0__Impl : ( '[' ) ;
    public final void rule__AnyDeclarator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2296:1: ( ( '[' ) )
            // InternalSimpleIDL.g:2297:1: ( '[' )
            {
            // InternalSimpleIDL.g:2297:1: ( '[' )
            // InternalSimpleIDL.g:2298:2: '['
            {
             before(grammarAccess.getAnyDeclaratorAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAnyDeclaratorAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyDeclarator__Group_1__0__Impl"


    // $ANTLR start "rule__AnyDeclarator__Group_1__1"
    // InternalSimpleIDL.g:2307:1: rule__AnyDeclarator__Group_1__1 : rule__AnyDeclarator__Group_1__1__Impl rule__AnyDeclarator__Group_1__2 ;
    public final void rule__AnyDeclarator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2311:1: ( rule__AnyDeclarator__Group_1__1__Impl rule__AnyDeclarator__Group_1__2 )
            // InternalSimpleIDL.g:2312:2: rule__AnyDeclarator__Group_1__1__Impl rule__AnyDeclarator__Group_1__2
            {
            pushFollow(FOLLOW_30);
            rule__AnyDeclarator__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnyDeclarator__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyDeclarator__Group_1__1"


    // $ANTLR start "rule__AnyDeclarator__Group_1__1__Impl"
    // InternalSimpleIDL.g:2319:1: rule__AnyDeclarator__Group_1__1__Impl : ( ( rule__AnyDeclarator__ArraySizesAssignment_1_1 ) ) ;
    public final void rule__AnyDeclarator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2323:1: ( ( ( rule__AnyDeclarator__ArraySizesAssignment_1_1 ) ) )
            // InternalSimpleIDL.g:2324:1: ( ( rule__AnyDeclarator__ArraySizesAssignment_1_1 ) )
            {
            // InternalSimpleIDL.g:2324:1: ( ( rule__AnyDeclarator__ArraySizesAssignment_1_1 ) )
            // InternalSimpleIDL.g:2325:2: ( rule__AnyDeclarator__ArraySizesAssignment_1_1 )
            {
             before(grammarAccess.getAnyDeclaratorAccess().getArraySizesAssignment_1_1()); 
            // InternalSimpleIDL.g:2326:2: ( rule__AnyDeclarator__ArraySizesAssignment_1_1 )
            // InternalSimpleIDL.g:2326:3: rule__AnyDeclarator__ArraySizesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AnyDeclarator__ArraySizesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAnyDeclaratorAccess().getArraySizesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyDeclarator__Group_1__1__Impl"


    // $ANTLR start "rule__AnyDeclarator__Group_1__2"
    // InternalSimpleIDL.g:2334:1: rule__AnyDeclarator__Group_1__2 : rule__AnyDeclarator__Group_1__2__Impl ;
    public final void rule__AnyDeclarator__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2338:1: ( rule__AnyDeclarator__Group_1__2__Impl )
            // InternalSimpleIDL.g:2339:2: rule__AnyDeclarator__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnyDeclarator__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyDeclarator__Group_1__2"


    // $ANTLR start "rule__AnyDeclarator__Group_1__2__Impl"
    // InternalSimpleIDL.g:2345:1: rule__AnyDeclarator__Group_1__2__Impl : ( ']' ) ;
    public final void rule__AnyDeclarator__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2349:1: ( ( ']' ) )
            // InternalSimpleIDL.g:2350:1: ( ']' )
            {
            // InternalSimpleIDL.g:2350:1: ( ']' )
            // InternalSimpleIDL.g:2351:2: ']'
            {
             before(grammarAccess.getAnyDeclaratorAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAnyDeclaratorAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyDeclarator__Group_1__2__Impl"


    // $ANTLR start "rule__Type__Group_1__0"
    // InternalSimpleIDL.g:2361:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2365:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // InternalSimpleIDL.g:2366:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalSimpleIDL.g:2373:1: rule__Type__Group_1__0__Impl : ( () ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2377:1: ( ( () ) )
            // InternalSimpleIDL.g:2378:1: ( () )
            {
            // InternalSimpleIDL.g:2378:1: ( () )
            // InternalSimpleIDL.g:2379:2: ()
            {
             before(grammarAccess.getTypeAccess().getBoundedSequenceAction_1_0()); 
            // InternalSimpleIDL.g:2380:2: ()
            // InternalSimpleIDL.g:2380:3: 
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
    // InternalSimpleIDL.g:2388:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl rule__Type__Group_1__2 ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2392:1: ( rule__Type__Group_1__1__Impl rule__Type__Group_1__2 )
            // InternalSimpleIDL.g:2393:2: rule__Type__Group_1__1__Impl rule__Type__Group_1__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalSimpleIDL.g:2400:1: rule__Type__Group_1__1__Impl : ( 'sequence' ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2404:1: ( ( 'sequence' ) )
            // InternalSimpleIDL.g:2405:1: ( 'sequence' )
            {
            // InternalSimpleIDL.g:2405:1: ( 'sequence' )
            // InternalSimpleIDL.g:2406:2: 'sequence'
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
    // InternalSimpleIDL.g:2415:1: rule__Type__Group_1__2 : rule__Type__Group_1__2__Impl rule__Type__Group_1__3 ;
    public final void rule__Type__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2419:1: ( rule__Type__Group_1__2__Impl rule__Type__Group_1__3 )
            // InternalSimpleIDL.g:2420:2: rule__Type__Group_1__2__Impl rule__Type__Group_1__3
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
    // InternalSimpleIDL.g:2427:1: rule__Type__Group_1__2__Impl : ( '<' ) ;
    public final void rule__Type__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2431:1: ( ( '<' ) )
            // InternalSimpleIDL.g:2432:1: ( '<' )
            {
            // InternalSimpleIDL.g:2432:1: ( '<' )
            // InternalSimpleIDL.g:2433:2: '<'
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
    // InternalSimpleIDL.g:2442:1: rule__Type__Group_1__3 : rule__Type__Group_1__3__Impl rule__Type__Group_1__4 ;
    public final void rule__Type__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2446:1: ( rule__Type__Group_1__3__Impl rule__Type__Group_1__4 )
            // InternalSimpleIDL.g:2447:2: rule__Type__Group_1__3__Impl rule__Type__Group_1__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalSimpleIDL.g:2454:1: rule__Type__Group_1__3__Impl : ( ( rule__Type__TypeAssignment_1_3 ) ) ;
    public final void rule__Type__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2458:1: ( ( ( rule__Type__TypeAssignment_1_3 ) ) )
            // InternalSimpleIDL.g:2459:1: ( ( rule__Type__TypeAssignment_1_3 ) )
            {
            // InternalSimpleIDL.g:2459:1: ( ( rule__Type__TypeAssignment_1_3 ) )
            // InternalSimpleIDL.g:2460:2: ( rule__Type__TypeAssignment_1_3 )
            {
             before(grammarAccess.getTypeAccess().getTypeAssignment_1_3()); 
            // InternalSimpleIDL.g:2461:2: ( rule__Type__TypeAssignment_1_3 )
            // InternalSimpleIDL.g:2461:3: rule__Type__TypeAssignment_1_3
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
    // InternalSimpleIDL.g:2469:1: rule__Type__Group_1__4 : rule__Type__Group_1__4__Impl rule__Type__Group_1__5 ;
    public final void rule__Type__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2473:1: ( rule__Type__Group_1__4__Impl rule__Type__Group_1__5 )
            // InternalSimpleIDL.g:2474:2: rule__Type__Group_1__4__Impl rule__Type__Group_1__5
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
    // InternalSimpleIDL.g:2481:1: rule__Type__Group_1__4__Impl : ( ',' ) ;
    public final void rule__Type__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2485:1: ( ( ',' ) )
            // InternalSimpleIDL.g:2486:1: ( ',' )
            {
            // InternalSimpleIDL.g:2486:1: ( ',' )
            // InternalSimpleIDL.g:2487:2: ','
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
    // InternalSimpleIDL.g:2496:1: rule__Type__Group_1__5 : rule__Type__Group_1__5__Impl rule__Type__Group_1__6 ;
    public final void rule__Type__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2500:1: ( rule__Type__Group_1__5__Impl rule__Type__Group_1__6 )
            // InternalSimpleIDL.g:2501:2: rule__Type__Group_1__5__Impl rule__Type__Group_1__6
            {
            pushFollow(FOLLOW_34);
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
    // InternalSimpleIDL.g:2508:1: rule__Type__Group_1__5__Impl : ( ( rule__Type__SizeAssignment_1_5 ) ) ;
    public final void rule__Type__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2512:1: ( ( ( rule__Type__SizeAssignment_1_5 ) ) )
            // InternalSimpleIDL.g:2513:1: ( ( rule__Type__SizeAssignment_1_5 ) )
            {
            // InternalSimpleIDL.g:2513:1: ( ( rule__Type__SizeAssignment_1_5 ) )
            // InternalSimpleIDL.g:2514:2: ( rule__Type__SizeAssignment_1_5 )
            {
             before(grammarAccess.getTypeAccess().getSizeAssignment_1_5()); 
            // InternalSimpleIDL.g:2515:2: ( rule__Type__SizeAssignment_1_5 )
            // InternalSimpleIDL.g:2515:3: rule__Type__SizeAssignment_1_5
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
    // InternalSimpleIDL.g:2523:1: rule__Type__Group_1__6 : rule__Type__Group_1__6__Impl ;
    public final void rule__Type__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2527:1: ( rule__Type__Group_1__6__Impl )
            // InternalSimpleIDL.g:2528:2: rule__Type__Group_1__6__Impl
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
    // InternalSimpleIDL.g:2534:1: rule__Type__Group_1__6__Impl : ( '>' ) ;
    public final void rule__Type__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2538:1: ( ( '>' ) )
            // InternalSimpleIDL.g:2539:1: ( '>' )
            {
            // InternalSimpleIDL.g:2539:1: ( '>' )
            // InternalSimpleIDL.g:2540:2: '>'
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
    // InternalSimpleIDL.g:2550:1: rule__Type__Group_2__0 : rule__Type__Group_2__0__Impl rule__Type__Group_2__1 ;
    public final void rule__Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2554:1: ( rule__Type__Group_2__0__Impl rule__Type__Group_2__1 )
            // InternalSimpleIDL.g:2555:2: rule__Type__Group_2__0__Impl rule__Type__Group_2__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalSimpleIDL.g:2562:1: rule__Type__Group_2__0__Impl : ( () ) ;
    public final void rule__Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2566:1: ( ( () ) )
            // InternalSimpleIDL.g:2567:1: ( () )
            {
            // InternalSimpleIDL.g:2567:1: ( () )
            // InternalSimpleIDL.g:2568:2: ()
            {
             before(grammarAccess.getTypeAccess().getUnboundedSequenceAction_2_0()); 
            // InternalSimpleIDL.g:2569:2: ()
            // InternalSimpleIDL.g:2569:3: 
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
    // InternalSimpleIDL.g:2577:1: rule__Type__Group_2__1 : rule__Type__Group_2__1__Impl rule__Type__Group_2__2 ;
    public final void rule__Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2581:1: ( rule__Type__Group_2__1__Impl rule__Type__Group_2__2 )
            // InternalSimpleIDL.g:2582:2: rule__Type__Group_2__1__Impl rule__Type__Group_2__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalSimpleIDL.g:2589:1: rule__Type__Group_2__1__Impl : ( 'sequence' ) ;
    public final void rule__Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2593:1: ( ( 'sequence' ) )
            // InternalSimpleIDL.g:2594:1: ( 'sequence' )
            {
            // InternalSimpleIDL.g:2594:1: ( 'sequence' )
            // InternalSimpleIDL.g:2595:2: 'sequence'
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
    // InternalSimpleIDL.g:2604:1: rule__Type__Group_2__2 : rule__Type__Group_2__2__Impl rule__Type__Group_2__3 ;
    public final void rule__Type__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2608:1: ( rule__Type__Group_2__2__Impl rule__Type__Group_2__3 )
            // InternalSimpleIDL.g:2609:2: rule__Type__Group_2__2__Impl rule__Type__Group_2__3
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
    // InternalSimpleIDL.g:2616:1: rule__Type__Group_2__2__Impl : ( '<' ) ;
    public final void rule__Type__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2620:1: ( ( '<' ) )
            // InternalSimpleIDL.g:2621:1: ( '<' )
            {
            // InternalSimpleIDL.g:2621:1: ( '<' )
            // InternalSimpleIDL.g:2622:2: '<'
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
    // InternalSimpleIDL.g:2631:1: rule__Type__Group_2__3 : rule__Type__Group_2__3__Impl rule__Type__Group_2__4 ;
    public final void rule__Type__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2635:1: ( rule__Type__Group_2__3__Impl rule__Type__Group_2__4 )
            // InternalSimpleIDL.g:2636:2: rule__Type__Group_2__3__Impl rule__Type__Group_2__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalSimpleIDL.g:2643:1: rule__Type__Group_2__3__Impl : ( ( rule__Type__TypeAssignment_2_3 ) ) ;
    public final void rule__Type__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2647:1: ( ( ( rule__Type__TypeAssignment_2_3 ) ) )
            // InternalSimpleIDL.g:2648:1: ( ( rule__Type__TypeAssignment_2_3 ) )
            {
            // InternalSimpleIDL.g:2648:1: ( ( rule__Type__TypeAssignment_2_3 ) )
            // InternalSimpleIDL.g:2649:2: ( rule__Type__TypeAssignment_2_3 )
            {
             before(grammarAccess.getTypeAccess().getTypeAssignment_2_3()); 
            // InternalSimpleIDL.g:2650:2: ( rule__Type__TypeAssignment_2_3 )
            // InternalSimpleIDL.g:2650:3: rule__Type__TypeAssignment_2_3
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
    // InternalSimpleIDL.g:2658:1: rule__Type__Group_2__4 : rule__Type__Group_2__4__Impl ;
    public final void rule__Type__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2662:1: ( rule__Type__Group_2__4__Impl )
            // InternalSimpleIDL.g:2663:2: rule__Type__Group_2__4__Impl
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
    // InternalSimpleIDL.g:2669:1: rule__Type__Group_2__4__Impl : ( '>' ) ;
    public final void rule__Type__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2673:1: ( ( '>' ) )
            // InternalSimpleIDL.g:2674:1: ( '>' )
            {
            // InternalSimpleIDL.g:2674:1: ( '>' )
            // InternalSimpleIDL.g:2675:2: '>'
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
    // InternalSimpleIDL.g:2685:1: rule__Type__Group_3__0 : rule__Type__Group_3__0__Impl rule__Type__Group_3__1 ;
    public final void rule__Type__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2689:1: ( rule__Type__Group_3__0__Impl rule__Type__Group_3__1 )
            // InternalSimpleIDL.g:2690:2: rule__Type__Group_3__0__Impl rule__Type__Group_3__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalSimpleIDL.g:2697:1: rule__Type__Group_3__0__Impl : ( () ) ;
    public final void rule__Type__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2701:1: ( ( () ) )
            // InternalSimpleIDL.g:2702:1: ( () )
            {
            // InternalSimpleIDL.g:2702:1: ( () )
            // InternalSimpleIDL.g:2703:2: ()
            {
             before(grammarAccess.getTypeAccess().getBoundedStringAction_3_0()); 
            // InternalSimpleIDL.g:2704:2: ()
            // InternalSimpleIDL.g:2704:3: 
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
    // InternalSimpleIDL.g:2712:1: rule__Type__Group_3__1 : rule__Type__Group_3__1__Impl rule__Type__Group_3__2 ;
    public final void rule__Type__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2716:1: ( rule__Type__Group_3__1__Impl rule__Type__Group_3__2 )
            // InternalSimpleIDL.g:2717:2: rule__Type__Group_3__1__Impl rule__Type__Group_3__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalSimpleIDL.g:2724:1: rule__Type__Group_3__1__Impl : ( 'string' ) ;
    public final void rule__Type__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2728:1: ( ( 'string' ) )
            // InternalSimpleIDL.g:2729:1: ( 'string' )
            {
            // InternalSimpleIDL.g:2729:1: ( 'string' )
            // InternalSimpleIDL.g:2730:2: 'string'
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
    // InternalSimpleIDL.g:2739:1: rule__Type__Group_3__2 : rule__Type__Group_3__2__Impl rule__Type__Group_3__3 ;
    public final void rule__Type__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2743:1: ( rule__Type__Group_3__2__Impl rule__Type__Group_3__3 )
            // InternalSimpleIDL.g:2744:2: rule__Type__Group_3__2__Impl rule__Type__Group_3__3
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
    // InternalSimpleIDL.g:2751:1: rule__Type__Group_3__2__Impl : ( '<' ) ;
    public final void rule__Type__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2755:1: ( ( '<' ) )
            // InternalSimpleIDL.g:2756:1: ( '<' )
            {
            // InternalSimpleIDL.g:2756:1: ( '<' )
            // InternalSimpleIDL.g:2757:2: '<'
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
    // InternalSimpleIDL.g:2766:1: rule__Type__Group_3__3 : rule__Type__Group_3__3__Impl rule__Type__Group_3__4 ;
    public final void rule__Type__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2770:1: ( rule__Type__Group_3__3__Impl rule__Type__Group_3__4 )
            // InternalSimpleIDL.g:2771:2: rule__Type__Group_3__3__Impl rule__Type__Group_3__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalSimpleIDL.g:2778:1: rule__Type__Group_3__3__Impl : ( ( rule__Type__SizeAssignment_3_3 ) ) ;
    public final void rule__Type__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2782:1: ( ( ( rule__Type__SizeAssignment_3_3 ) ) )
            // InternalSimpleIDL.g:2783:1: ( ( rule__Type__SizeAssignment_3_3 ) )
            {
            // InternalSimpleIDL.g:2783:1: ( ( rule__Type__SizeAssignment_3_3 ) )
            // InternalSimpleIDL.g:2784:2: ( rule__Type__SizeAssignment_3_3 )
            {
             before(grammarAccess.getTypeAccess().getSizeAssignment_3_3()); 
            // InternalSimpleIDL.g:2785:2: ( rule__Type__SizeAssignment_3_3 )
            // InternalSimpleIDL.g:2785:3: rule__Type__SizeAssignment_3_3
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
    // InternalSimpleIDL.g:2793:1: rule__Type__Group_3__4 : rule__Type__Group_3__4__Impl ;
    public final void rule__Type__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2797:1: ( rule__Type__Group_3__4__Impl )
            // InternalSimpleIDL.g:2798:2: rule__Type__Group_3__4__Impl
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
    // InternalSimpleIDL.g:2804:1: rule__Type__Group_3__4__Impl : ( '>' ) ;
    public final void rule__Type__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2808:1: ( ( '>' ) )
            // InternalSimpleIDL.g:2809:1: ( '>' )
            {
            // InternalSimpleIDL.g:2809:1: ( '>' )
            // InternalSimpleIDL.g:2810:2: '>'
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
    // InternalSimpleIDL.g:2820:1: rule__Type__Group_4__0 : rule__Type__Group_4__0__Impl rule__Type__Group_4__1 ;
    public final void rule__Type__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2824:1: ( rule__Type__Group_4__0__Impl rule__Type__Group_4__1 )
            // InternalSimpleIDL.g:2825:2: rule__Type__Group_4__0__Impl rule__Type__Group_4__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalSimpleIDL.g:2832:1: rule__Type__Group_4__0__Impl : ( () ) ;
    public final void rule__Type__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2836:1: ( ( () ) )
            // InternalSimpleIDL.g:2837:1: ( () )
            {
            // InternalSimpleIDL.g:2837:1: ( () )
            // InternalSimpleIDL.g:2838:2: ()
            {
             before(grammarAccess.getTypeAccess().getUnboundedStringAction_4_0()); 
            // InternalSimpleIDL.g:2839:2: ()
            // InternalSimpleIDL.g:2839:3: 
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
    // InternalSimpleIDL.g:2847:1: rule__Type__Group_4__1 : rule__Type__Group_4__1__Impl ;
    public final void rule__Type__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2851:1: ( rule__Type__Group_4__1__Impl )
            // InternalSimpleIDL.g:2852:2: rule__Type__Group_4__1__Impl
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
    // InternalSimpleIDL.g:2858:1: rule__Type__Group_4__1__Impl : ( 'string' ) ;
    public final void rule__Type__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2862:1: ( ( 'string' ) )
            // InternalSimpleIDL.g:2863:1: ( 'string' )
            {
            // InternalSimpleIDL.g:2863:1: ( 'string' )
            // InternalSimpleIDL.g:2864:2: 'string'
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
    // InternalSimpleIDL.g:2874:1: rule__Type__Group_5__0 : rule__Type__Group_5__0__Impl rule__Type__Group_5__1 ;
    public final void rule__Type__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2878:1: ( rule__Type__Group_5__0__Impl rule__Type__Group_5__1 )
            // InternalSimpleIDL.g:2879:2: rule__Type__Group_5__0__Impl rule__Type__Group_5__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalSimpleIDL.g:2886:1: rule__Type__Group_5__0__Impl : ( () ) ;
    public final void rule__Type__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2890:1: ( ( () ) )
            // InternalSimpleIDL.g:2891:1: ( () )
            {
            // InternalSimpleIDL.g:2891:1: ( () )
            // InternalSimpleIDL.g:2892:2: ()
            {
             before(grammarAccess.getTypeAccess().getBoundedWideStringAction_5_0()); 
            // InternalSimpleIDL.g:2893:2: ()
            // InternalSimpleIDL.g:2893:3: 
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
    // InternalSimpleIDL.g:2901:1: rule__Type__Group_5__1 : rule__Type__Group_5__1__Impl rule__Type__Group_5__2 ;
    public final void rule__Type__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2905:1: ( rule__Type__Group_5__1__Impl rule__Type__Group_5__2 )
            // InternalSimpleIDL.g:2906:2: rule__Type__Group_5__1__Impl rule__Type__Group_5__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalSimpleIDL.g:2913:1: rule__Type__Group_5__1__Impl : ( 'wstring' ) ;
    public final void rule__Type__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2917:1: ( ( 'wstring' ) )
            // InternalSimpleIDL.g:2918:1: ( 'wstring' )
            {
            // InternalSimpleIDL.g:2918:1: ( 'wstring' )
            // InternalSimpleIDL.g:2919:2: 'wstring'
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
    // InternalSimpleIDL.g:2928:1: rule__Type__Group_5__2 : rule__Type__Group_5__2__Impl rule__Type__Group_5__3 ;
    public final void rule__Type__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2932:1: ( rule__Type__Group_5__2__Impl rule__Type__Group_5__3 )
            // InternalSimpleIDL.g:2933:2: rule__Type__Group_5__2__Impl rule__Type__Group_5__3
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
    // InternalSimpleIDL.g:2940:1: rule__Type__Group_5__2__Impl : ( '<' ) ;
    public final void rule__Type__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2944:1: ( ( '<' ) )
            // InternalSimpleIDL.g:2945:1: ( '<' )
            {
            // InternalSimpleIDL.g:2945:1: ( '<' )
            // InternalSimpleIDL.g:2946:2: '<'
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
    // InternalSimpleIDL.g:2955:1: rule__Type__Group_5__3 : rule__Type__Group_5__3__Impl rule__Type__Group_5__4 ;
    public final void rule__Type__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2959:1: ( rule__Type__Group_5__3__Impl rule__Type__Group_5__4 )
            // InternalSimpleIDL.g:2960:2: rule__Type__Group_5__3__Impl rule__Type__Group_5__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalSimpleIDL.g:2967:1: rule__Type__Group_5__3__Impl : ( ( rule__Type__SizeAssignment_5_3 ) ) ;
    public final void rule__Type__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2971:1: ( ( ( rule__Type__SizeAssignment_5_3 ) ) )
            // InternalSimpleIDL.g:2972:1: ( ( rule__Type__SizeAssignment_5_3 ) )
            {
            // InternalSimpleIDL.g:2972:1: ( ( rule__Type__SizeAssignment_5_3 ) )
            // InternalSimpleIDL.g:2973:2: ( rule__Type__SizeAssignment_5_3 )
            {
             before(grammarAccess.getTypeAccess().getSizeAssignment_5_3()); 
            // InternalSimpleIDL.g:2974:2: ( rule__Type__SizeAssignment_5_3 )
            // InternalSimpleIDL.g:2974:3: rule__Type__SizeAssignment_5_3
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
    // InternalSimpleIDL.g:2982:1: rule__Type__Group_5__4 : rule__Type__Group_5__4__Impl ;
    public final void rule__Type__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2986:1: ( rule__Type__Group_5__4__Impl )
            // InternalSimpleIDL.g:2987:2: rule__Type__Group_5__4__Impl
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
    // InternalSimpleIDL.g:2993:1: rule__Type__Group_5__4__Impl : ( '>' ) ;
    public final void rule__Type__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:2997:1: ( ( '>' ) )
            // InternalSimpleIDL.g:2998:1: ( '>' )
            {
            // InternalSimpleIDL.g:2998:1: ( '>' )
            // InternalSimpleIDL.g:2999:2: '>'
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
    // InternalSimpleIDL.g:3009:1: rule__Type__Group_6__0 : rule__Type__Group_6__0__Impl rule__Type__Group_6__1 ;
    public final void rule__Type__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3013:1: ( rule__Type__Group_6__0__Impl rule__Type__Group_6__1 )
            // InternalSimpleIDL.g:3014:2: rule__Type__Group_6__0__Impl rule__Type__Group_6__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalSimpleIDL.g:3021:1: rule__Type__Group_6__0__Impl : ( () ) ;
    public final void rule__Type__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3025:1: ( ( () ) )
            // InternalSimpleIDL.g:3026:1: ( () )
            {
            // InternalSimpleIDL.g:3026:1: ( () )
            // InternalSimpleIDL.g:3027:2: ()
            {
             before(grammarAccess.getTypeAccess().getUnboundedWideStringAction_6_0()); 
            // InternalSimpleIDL.g:3028:2: ()
            // InternalSimpleIDL.g:3028:3: 
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
    // InternalSimpleIDL.g:3036:1: rule__Type__Group_6__1 : rule__Type__Group_6__1__Impl ;
    public final void rule__Type__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3040:1: ( rule__Type__Group_6__1__Impl )
            // InternalSimpleIDL.g:3041:2: rule__Type__Group_6__1__Impl
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
    // InternalSimpleIDL.g:3047:1: rule__Type__Group_6__1__Impl : ( 'wstring' ) ;
    public final void rule__Type__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3051:1: ( ( 'wstring' ) )
            // InternalSimpleIDL.g:3052:1: ( 'wstring' )
            {
            // InternalSimpleIDL.g:3052:1: ( 'wstring' )
            // InternalSimpleIDL.g:3053:2: 'wstring'
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
    // InternalSimpleIDL.g:3063:1: rule__Type__Group_7__0 : rule__Type__Group_7__0__Impl rule__Type__Group_7__1 ;
    public final void rule__Type__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3067:1: ( rule__Type__Group_7__0__Impl rule__Type__Group_7__1 )
            // InternalSimpleIDL.g:3068:2: rule__Type__Group_7__0__Impl rule__Type__Group_7__1
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
    // InternalSimpleIDL.g:3075:1: rule__Type__Group_7__0__Impl : ( () ) ;
    public final void rule__Type__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3079:1: ( ( () ) )
            // InternalSimpleIDL.g:3080:1: ( () )
            {
            // InternalSimpleIDL.g:3080:1: ( () )
            // InternalSimpleIDL.g:3081:2: ()
            {
             before(grammarAccess.getTypeAccess().getFixedPtTypeAction_7_0()); 
            // InternalSimpleIDL.g:3082:2: ()
            // InternalSimpleIDL.g:3082:3: 
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
    // InternalSimpleIDL.g:3090:1: rule__Type__Group_7__1 : rule__Type__Group_7__1__Impl rule__Type__Group_7__2 ;
    public final void rule__Type__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3094:1: ( rule__Type__Group_7__1__Impl rule__Type__Group_7__2 )
            // InternalSimpleIDL.g:3095:2: rule__Type__Group_7__1__Impl rule__Type__Group_7__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalSimpleIDL.g:3102:1: rule__Type__Group_7__1__Impl : ( 'fixed' ) ;
    public final void rule__Type__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3106:1: ( ( 'fixed' ) )
            // InternalSimpleIDL.g:3107:1: ( 'fixed' )
            {
            // InternalSimpleIDL.g:3107:1: ( 'fixed' )
            // InternalSimpleIDL.g:3108:2: 'fixed'
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
    // InternalSimpleIDL.g:3117:1: rule__Type__Group_7__2 : rule__Type__Group_7__2__Impl rule__Type__Group_7__3 ;
    public final void rule__Type__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3121:1: ( rule__Type__Group_7__2__Impl rule__Type__Group_7__3 )
            // InternalSimpleIDL.g:3122:2: rule__Type__Group_7__2__Impl rule__Type__Group_7__3
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
    // InternalSimpleIDL.g:3129:1: rule__Type__Group_7__2__Impl : ( '<' ) ;
    public final void rule__Type__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3133:1: ( ( '<' ) )
            // InternalSimpleIDL.g:3134:1: ( '<' )
            {
            // InternalSimpleIDL.g:3134:1: ( '<' )
            // InternalSimpleIDL.g:3135:2: '<'
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
    // InternalSimpleIDL.g:3144:1: rule__Type__Group_7__3 : rule__Type__Group_7__3__Impl rule__Type__Group_7__4 ;
    public final void rule__Type__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3148:1: ( rule__Type__Group_7__3__Impl rule__Type__Group_7__4 )
            // InternalSimpleIDL.g:3149:2: rule__Type__Group_7__3__Impl rule__Type__Group_7__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalSimpleIDL.g:3156:1: rule__Type__Group_7__3__Impl : ( ( rule__Type__TotalDigitsAssignment_7_3 ) ) ;
    public final void rule__Type__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3160:1: ( ( ( rule__Type__TotalDigitsAssignment_7_3 ) ) )
            // InternalSimpleIDL.g:3161:1: ( ( rule__Type__TotalDigitsAssignment_7_3 ) )
            {
            // InternalSimpleIDL.g:3161:1: ( ( rule__Type__TotalDigitsAssignment_7_3 ) )
            // InternalSimpleIDL.g:3162:2: ( rule__Type__TotalDigitsAssignment_7_3 )
            {
             before(grammarAccess.getTypeAccess().getTotalDigitsAssignment_7_3()); 
            // InternalSimpleIDL.g:3163:2: ( rule__Type__TotalDigitsAssignment_7_3 )
            // InternalSimpleIDL.g:3163:3: rule__Type__TotalDigitsAssignment_7_3
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
    // InternalSimpleIDL.g:3171:1: rule__Type__Group_7__4 : rule__Type__Group_7__4__Impl rule__Type__Group_7__5 ;
    public final void rule__Type__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3175:1: ( rule__Type__Group_7__4__Impl rule__Type__Group_7__5 )
            // InternalSimpleIDL.g:3176:2: rule__Type__Group_7__4__Impl rule__Type__Group_7__5
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
    // InternalSimpleIDL.g:3183:1: rule__Type__Group_7__4__Impl : ( ',' ) ;
    public final void rule__Type__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3187:1: ( ( ',' ) )
            // InternalSimpleIDL.g:3188:1: ( ',' )
            {
            // InternalSimpleIDL.g:3188:1: ( ',' )
            // InternalSimpleIDL.g:3189:2: ','
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
    // InternalSimpleIDL.g:3198:1: rule__Type__Group_7__5 : rule__Type__Group_7__5__Impl rule__Type__Group_7__6 ;
    public final void rule__Type__Group_7__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3202:1: ( rule__Type__Group_7__5__Impl rule__Type__Group_7__6 )
            // InternalSimpleIDL.g:3203:2: rule__Type__Group_7__5__Impl rule__Type__Group_7__6
            {
            pushFollow(FOLLOW_34);
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
    // InternalSimpleIDL.g:3210:1: rule__Type__Group_7__5__Impl : ( ( rule__Type__FractionalDigitsAssignment_7_5 ) ) ;
    public final void rule__Type__Group_7__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3214:1: ( ( ( rule__Type__FractionalDigitsAssignment_7_5 ) ) )
            // InternalSimpleIDL.g:3215:1: ( ( rule__Type__FractionalDigitsAssignment_7_5 ) )
            {
            // InternalSimpleIDL.g:3215:1: ( ( rule__Type__FractionalDigitsAssignment_7_5 ) )
            // InternalSimpleIDL.g:3216:2: ( rule__Type__FractionalDigitsAssignment_7_5 )
            {
             before(grammarAccess.getTypeAccess().getFractionalDigitsAssignment_7_5()); 
            // InternalSimpleIDL.g:3217:2: ( rule__Type__FractionalDigitsAssignment_7_5 )
            // InternalSimpleIDL.g:3217:3: rule__Type__FractionalDigitsAssignment_7_5
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
    // InternalSimpleIDL.g:3225:1: rule__Type__Group_7__6 : rule__Type__Group_7__6__Impl ;
    public final void rule__Type__Group_7__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3229:1: ( rule__Type__Group_7__6__Impl )
            // InternalSimpleIDL.g:3230:2: rule__Type__Group_7__6__Impl
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
    // InternalSimpleIDL.g:3236:1: rule__Type__Group_7__6__Impl : ( '>' ) ;
    public final void rule__Type__Group_7__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3240:1: ( ( '>' ) )
            // InternalSimpleIDL.g:3241:1: ( '>' )
            {
            // InternalSimpleIDL.g:3241:1: ( '>' )
            // InternalSimpleIDL.g:3242:2: '>'
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
    // InternalSimpleIDL.g:3252:1: rule__SimpleTypeSpec__Group_0__0 : rule__SimpleTypeSpec__Group_0__0__Impl rule__SimpleTypeSpec__Group_0__1 ;
    public final void rule__SimpleTypeSpec__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3256:1: ( rule__SimpleTypeSpec__Group_0__0__Impl rule__SimpleTypeSpec__Group_0__1 )
            // InternalSimpleIDL.g:3257:2: rule__SimpleTypeSpec__Group_0__0__Impl rule__SimpleTypeSpec__Group_0__1
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
    // InternalSimpleIDL.g:3264:1: rule__SimpleTypeSpec__Group_0__0__Impl : ( () ) ;
    public final void rule__SimpleTypeSpec__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3268:1: ( ( () ) )
            // InternalSimpleIDL.g:3269:1: ( () )
            {
            // InternalSimpleIDL.g:3269:1: ( () )
            // InternalSimpleIDL.g:3270:2: ()
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getSignedShortIntAction_0_0()); 
            // InternalSimpleIDL.g:3271:2: ()
            // InternalSimpleIDL.g:3271:3: 
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
    // InternalSimpleIDL.g:3279:1: rule__SimpleTypeSpec__Group_0__1 : rule__SimpleTypeSpec__Group_0__1__Impl ;
    public final void rule__SimpleTypeSpec__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3283:1: ( rule__SimpleTypeSpec__Group_0__1__Impl )
            // InternalSimpleIDL.g:3284:2: rule__SimpleTypeSpec__Group_0__1__Impl
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
    // InternalSimpleIDL.g:3290:1: rule__SimpleTypeSpec__Group_0__1__Impl : ( 'short' ) ;
    public final void rule__SimpleTypeSpec__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3294:1: ( ( 'short' ) )
            // InternalSimpleIDL.g:3295:1: ( 'short' )
            {
            // InternalSimpleIDL.g:3295:1: ( 'short' )
            // InternalSimpleIDL.g:3296:2: 'short'
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
    // InternalSimpleIDL.g:3306:1: rule__SimpleTypeSpec__Group_1__0 : rule__SimpleTypeSpec__Group_1__0__Impl rule__SimpleTypeSpec__Group_1__1 ;
    public final void rule__SimpleTypeSpec__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3310:1: ( rule__SimpleTypeSpec__Group_1__0__Impl rule__SimpleTypeSpec__Group_1__1 )
            // InternalSimpleIDL.g:3311:2: rule__SimpleTypeSpec__Group_1__0__Impl rule__SimpleTypeSpec__Group_1__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalSimpleIDL.g:3318:1: rule__SimpleTypeSpec__Group_1__0__Impl : ( () ) ;
    public final void rule__SimpleTypeSpec__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3322:1: ( ( () ) )
            // InternalSimpleIDL.g:3323:1: ( () )
            {
            // InternalSimpleIDL.g:3323:1: ( () )
            // InternalSimpleIDL.g:3324:2: ()
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getSignedLongIntAction_1_0()); 
            // InternalSimpleIDL.g:3325:2: ()
            // InternalSimpleIDL.g:3325:3: 
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
    // InternalSimpleIDL.g:3333:1: rule__SimpleTypeSpec__Group_1__1 : rule__SimpleTypeSpec__Group_1__1__Impl ;
    public final void rule__SimpleTypeSpec__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3337:1: ( rule__SimpleTypeSpec__Group_1__1__Impl )
            // InternalSimpleIDL.g:3338:2: rule__SimpleTypeSpec__Group_1__1__Impl
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
    // InternalSimpleIDL.g:3344:1: rule__SimpleTypeSpec__Group_1__1__Impl : ( 'long' ) ;
    public final void rule__SimpleTypeSpec__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3348:1: ( ( 'long' ) )
            // InternalSimpleIDL.g:3349:1: ( 'long' )
            {
            // InternalSimpleIDL.g:3349:1: ( 'long' )
            // InternalSimpleIDL.g:3350:2: 'long'
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
    // InternalSimpleIDL.g:3360:1: rule__SimpleTypeSpec__Group_2__0 : rule__SimpleTypeSpec__Group_2__0__Impl rule__SimpleTypeSpec__Group_2__1 ;
    public final void rule__SimpleTypeSpec__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3364:1: ( rule__SimpleTypeSpec__Group_2__0__Impl rule__SimpleTypeSpec__Group_2__1 )
            // InternalSimpleIDL.g:3365:2: rule__SimpleTypeSpec__Group_2__0__Impl rule__SimpleTypeSpec__Group_2__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalSimpleIDL.g:3372:1: rule__SimpleTypeSpec__Group_2__0__Impl : ( () ) ;
    public final void rule__SimpleTypeSpec__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3376:1: ( ( () ) )
            // InternalSimpleIDL.g:3377:1: ( () )
            {
            // InternalSimpleIDL.g:3377:1: ( () )
            // InternalSimpleIDL.g:3378:2: ()
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getSignedLongLongIntAction_2_0()); 
            // InternalSimpleIDL.g:3379:2: ()
            // InternalSimpleIDL.g:3379:3: 
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
    // InternalSimpleIDL.g:3387:1: rule__SimpleTypeSpec__Group_2__1 : rule__SimpleTypeSpec__Group_2__1__Impl rule__SimpleTypeSpec__Group_2__2 ;
    public final void rule__SimpleTypeSpec__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3391:1: ( rule__SimpleTypeSpec__Group_2__1__Impl rule__SimpleTypeSpec__Group_2__2 )
            // InternalSimpleIDL.g:3392:2: rule__SimpleTypeSpec__Group_2__1__Impl rule__SimpleTypeSpec__Group_2__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalSimpleIDL.g:3399:1: rule__SimpleTypeSpec__Group_2__1__Impl : ( 'long' ) ;
    public final void rule__SimpleTypeSpec__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3403:1: ( ( 'long' ) )
            // InternalSimpleIDL.g:3404:1: ( 'long' )
            {
            // InternalSimpleIDL.g:3404:1: ( 'long' )
            // InternalSimpleIDL.g:3405:2: 'long'
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
    // InternalSimpleIDL.g:3414:1: rule__SimpleTypeSpec__Group_2__2 : rule__SimpleTypeSpec__Group_2__2__Impl ;
    public final void rule__SimpleTypeSpec__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3418:1: ( rule__SimpleTypeSpec__Group_2__2__Impl )
            // InternalSimpleIDL.g:3419:2: rule__SimpleTypeSpec__Group_2__2__Impl
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
    // InternalSimpleIDL.g:3425:1: rule__SimpleTypeSpec__Group_2__2__Impl : ( 'long' ) ;
    public final void rule__SimpleTypeSpec__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3429:1: ( ( 'long' ) )
            // InternalSimpleIDL.g:3430:1: ( 'long' )
            {
            // InternalSimpleIDL.g:3430:1: ( 'long' )
            // InternalSimpleIDL.g:3431:2: 'long'
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
    // InternalSimpleIDL.g:3441:1: rule__SimpleTypeSpec__Group_3__0 : rule__SimpleTypeSpec__Group_3__0__Impl rule__SimpleTypeSpec__Group_3__1 ;
    public final void rule__SimpleTypeSpec__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3445:1: ( rule__SimpleTypeSpec__Group_3__0__Impl rule__SimpleTypeSpec__Group_3__1 )
            // InternalSimpleIDL.g:3446:2: rule__SimpleTypeSpec__Group_3__0__Impl rule__SimpleTypeSpec__Group_3__1
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
    // InternalSimpleIDL.g:3453:1: rule__SimpleTypeSpec__Group_3__0__Impl : ( () ) ;
    public final void rule__SimpleTypeSpec__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3457:1: ( ( () ) )
            // InternalSimpleIDL.g:3458:1: ( () )
            {
            // InternalSimpleIDL.g:3458:1: ( () )
            // InternalSimpleIDL.g:3459:2: ()
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getUnsignedShortIntAction_3_0()); 
            // InternalSimpleIDL.g:3460:2: ()
            // InternalSimpleIDL.g:3460:3: 
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
    // InternalSimpleIDL.g:3468:1: rule__SimpleTypeSpec__Group_3__1 : rule__SimpleTypeSpec__Group_3__1__Impl rule__SimpleTypeSpec__Group_3__2 ;
    public final void rule__SimpleTypeSpec__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3472:1: ( rule__SimpleTypeSpec__Group_3__1__Impl rule__SimpleTypeSpec__Group_3__2 )
            // InternalSimpleIDL.g:3473:2: rule__SimpleTypeSpec__Group_3__1__Impl rule__SimpleTypeSpec__Group_3__2
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
    // InternalSimpleIDL.g:3480:1: rule__SimpleTypeSpec__Group_3__1__Impl : ( 'unsigned' ) ;
    public final void rule__SimpleTypeSpec__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3484:1: ( ( 'unsigned' ) )
            // InternalSimpleIDL.g:3485:1: ( 'unsigned' )
            {
            // InternalSimpleIDL.g:3485:1: ( 'unsigned' )
            // InternalSimpleIDL.g:3486:2: 'unsigned'
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
    // InternalSimpleIDL.g:3495:1: rule__SimpleTypeSpec__Group_3__2 : rule__SimpleTypeSpec__Group_3__2__Impl ;
    public final void rule__SimpleTypeSpec__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3499:1: ( rule__SimpleTypeSpec__Group_3__2__Impl )
            // InternalSimpleIDL.g:3500:2: rule__SimpleTypeSpec__Group_3__2__Impl
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
    // InternalSimpleIDL.g:3506:1: rule__SimpleTypeSpec__Group_3__2__Impl : ( 'short' ) ;
    public final void rule__SimpleTypeSpec__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3510:1: ( ( 'short' ) )
            // InternalSimpleIDL.g:3511:1: ( 'short' )
            {
            // InternalSimpleIDL.g:3511:1: ( 'short' )
            // InternalSimpleIDL.g:3512:2: 'short'
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
    // InternalSimpleIDL.g:3522:1: rule__SimpleTypeSpec__Group_4__0 : rule__SimpleTypeSpec__Group_4__0__Impl rule__SimpleTypeSpec__Group_4__1 ;
    public final void rule__SimpleTypeSpec__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3526:1: ( rule__SimpleTypeSpec__Group_4__0__Impl rule__SimpleTypeSpec__Group_4__1 )
            // InternalSimpleIDL.g:3527:2: rule__SimpleTypeSpec__Group_4__0__Impl rule__SimpleTypeSpec__Group_4__1
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
    // InternalSimpleIDL.g:3534:1: rule__SimpleTypeSpec__Group_4__0__Impl : ( () ) ;
    public final void rule__SimpleTypeSpec__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3538:1: ( ( () ) )
            // InternalSimpleIDL.g:3539:1: ( () )
            {
            // InternalSimpleIDL.g:3539:1: ( () )
            // InternalSimpleIDL.g:3540:2: ()
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getUnsignedLongIntAction_4_0()); 
            // InternalSimpleIDL.g:3541:2: ()
            // InternalSimpleIDL.g:3541:3: 
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
    // InternalSimpleIDL.g:3549:1: rule__SimpleTypeSpec__Group_4__1 : rule__SimpleTypeSpec__Group_4__1__Impl rule__SimpleTypeSpec__Group_4__2 ;
    public final void rule__SimpleTypeSpec__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3553:1: ( rule__SimpleTypeSpec__Group_4__1__Impl rule__SimpleTypeSpec__Group_4__2 )
            // InternalSimpleIDL.g:3554:2: rule__SimpleTypeSpec__Group_4__1__Impl rule__SimpleTypeSpec__Group_4__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalSimpleIDL.g:3561:1: rule__SimpleTypeSpec__Group_4__1__Impl : ( 'unsigned' ) ;
    public final void rule__SimpleTypeSpec__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3565:1: ( ( 'unsigned' ) )
            // InternalSimpleIDL.g:3566:1: ( 'unsigned' )
            {
            // InternalSimpleIDL.g:3566:1: ( 'unsigned' )
            // InternalSimpleIDL.g:3567:2: 'unsigned'
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
    // InternalSimpleIDL.g:3576:1: rule__SimpleTypeSpec__Group_4__2 : rule__SimpleTypeSpec__Group_4__2__Impl ;
    public final void rule__SimpleTypeSpec__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3580:1: ( rule__SimpleTypeSpec__Group_4__2__Impl )
            // InternalSimpleIDL.g:3581:2: rule__SimpleTypeSpec__Group_4__2__Impl
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
    // InternalSimpleIDL.g:3587:1: rule__SimpleTypeSpec__Group_4__2__Impl : ( 'long' ) ;
    public final void rule__SimpleTypeSpec__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3591:1: ( ( 'long' ) )
            // InternalSimpleIDL.g:3592:1: ( 'long' )
            {
            // InternalSimpleIDL.g:3592:1: ( 'long' )
            // InternalSimpleIDL.g:3593:2: 'long'
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
    // InternalSimpleIDL.g:3603:1: rule__SimpleTypeSpec__Group_5__0 : rule__SimpleTypeSpec__Group_5__0__Impl rule__SimpleTypeSpec__Group_5__1 ;
    public final void rule__SimpleTypeSpec__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3607:1: ( rule__SimpleTypeSpec__Group_5__0__Impl rule__SimpleTypeSpec__Group_5__1 )
            // InternalSimpleIDL.g:3608:2: rule__SimpleTypeSpec__Group_5__0__Impl rule__SimpleTypeSpec__Group_5__1
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
    // InternalSimpleIDL.g:3615:1: rule__SimpleTypeSpec__Group_5__0__Impl : ( () ) ;
    public final void rule__SimpleTypeSpec__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3619:1: ( ( () ) )
            // InternalSimpleIDL.g:3620:1: ( () )
            {
            // InternalSimpleIDL.g:3620:1: ( () )
            // InternalSimpleIDL.g:3621:2: ()
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getUnsignedLongLongIntAction_5_0()); 
            // InternalSimpleIDL.g:3622:2: ()
            // InternalSimpleIDL.g:3622:3: 
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
    // InternalSimpleIDL.g:3630:1: rule__SimpleTypeSpec__Group_5__1 : rule__SimpleTypeSpec__Group_5__1__Impl rule__SimpleTypeSpec__Group_5__2 ;
    public final void rule__SimpleTypeSpec__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3634:1: ( rule__SimpleTypeSpec__Group_5__1__Impl rule__SimpleTypeSpec__Group_5__2 )
            // InternalSimpleIDL.g:3635:2: rule__SimpleTypeSpec__Group_5__1__Impl rule__SimpleTypeSpec__Group_5__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalSimpleIDL.g:3642:1: rule__SimpleTypeSpec__Group_5__1__Impl : ( 'unsigned' ) ;
    public final void rule__SimpleTypeSpec__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3646:1: ( ( 'unsigned' ) )
            // InternalSimpleIDL.g:3647:1: ( 'unsigned' )
            {
            // InternalSimpleIDL.g:3647:1: ( 'unsigned' )
            // InternalSimpleIDL.g:3648:2: 'unsigned'
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
    // InternalSimpleIDL.g:3657:1: rule__SimpleTypeSpec__Group_5__2 : rule__SimpleTypeSpec__Group_5__2__Impl rule__SimpleTypeSpec__Group_5__3 ;
    public final void rule__SimpleTypeSpec__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3661:1: ( rule__SimpleTypeSpec__Group_5__2__Impl rule__SimpleTypeSpec__Group_5__3 )
            // InternalSimpleIDL.g:3662:2: rule__SimpleTypeSpec__Group_5__2__Impl rule__SimpleTypeSpec__Group_5__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalSimpleIDL.g:3669:1: rule__SimpleTypeSpec__Group_5__2__Impl : ( 'long' ) ;
    public final void rule__SimpleTypeSpec__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3673:1: ( ( 'long' ) )
            // InternalSimpleIDL.g:3674:1: ( 'long' )
            {
            // InternalSimpleIDL.g:3674:1: ( 'long' )
            // InternalSimpleIDL.g:3675:2: 'long'
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
    // InternalSimpleIDL.g:3684:1: rule__SimpleTypeSpec__Group_5__3 : rule__SimpleTypeSpec__Group_5__3__Impl ;
    public final void rule__SimpleTypeSpec__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3688:1: ( rule__SimpleTypeSpec__Group_5__3__Impl )
            // InternalSimpleIDL.g:3689:2: rule__SimpleTypeSpec__Group_5__3__Impl
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
    // InternalSimpleIDL.g:3695:1: rule__SimpleTypeSpec__Group_5__3__Impl : ( 'long' ) ;
    public final void rule__SimpleTypeSpec__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3699:1: ( ( 'long' ) )
            // InternalSimpleIDL.g:3700:1: ( 'long' )
            {
            // InternalSimpleIDL.g:3700:1: ( 'long' )
            // InternalSimpleIDL.g:3701:2: 'long'
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
    // InternalSimpleIDL.g:3711:1: rule__SimpleTypeSpec__Group_6__0 : rule__SimpleTypeSpec__Group_6__0__Impl rule__SimpleTypeSpec__Group_6__1 ;
    public final void rule__SimpleTypeSpec__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3715:1: ( rule__SimpleTypeSpec__Group_6__0__Impl rule__SimpleTypeSpec__Group_6__1 )
            // InternalSimpleIDL.g:3716:2: rule__SimpleTypeSpec__Group_6__0__Impl rule__SimpleTypeSpec__Group_6__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalSimpleIDL.g:3723:1: rule__SimpleTypeSpec__Group_6__0__Impl : ( () ) ;
    public final void rule__SimpleTypeSpec__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3727:1: ( ( () ) )
            // InternalSimpleIDL.g:3728:1: ( () )
            {
            // InternalSimpleIDL.g:3728:1: ( () )
            // InternalSimpleIDL.g:3729:2: ()
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getFloatTypeAction_6_0()); 
            // InternalSimpleIDL.g:3730:2: ()
            // InternalSimpleIDL.g:3730:3: 
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
    // InternalSimpleIDL.g:3738:1: rule__SimpleTypeSpec__Group_6__1 : rule__SimpleTypeSpec__Group_6__1__Impl ;
    public final void rule__SimpleTypeSpec__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3742:1: ( rule__SimpleTypeSpec__Group_6__1__Impl )
            // InternalSimpleIDL.g:3743:2: rule__SimpleTypeSpec__Group_6__1__Impl
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
    // InternalSimpleIDL.g:3749:1: rule__SimpleTypeSpec__Group_6__1__Impl : ( 'float' ) ;
    public final void rule__SimpleTypeSpec__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3753:1: ( ( 'float' ) )
            // InternalSimpleIDL.g:3754:1: ( 'float' )
            {
            // InternalSimpleIDL.g:3754:1: ( 'float' )
            // InternalSimpleIDL.g:3755:2: 'float'
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
    // InternalSimpleIDL.g:3765:1: rule__SimpleTypeSpec__Group_7__0 : rule__SimpleTypeSpec__Group_7__0__Impl rule__SimpleTypeSpec__Group_7__1 ;
    public final void rule__SimpleTypeSpec__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3769:1: ( rule__SimpleTypeSpec__Group_7__0__Impl rule__SimpleTypeSpec__Group_7__1 )
            // InternalSimpleIDL.g:3770:2: rule__SimpleTypeSpec__Group_7__0__Impl rule__SimpleTypeSpec__Group_7__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalSimpleIDL.g:3777:1: rule__SimpleTypeSpec__Group_7__0__Impl : ( () ) ;
    public final void rule__SimpleTypeSpec__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3781:1: ( ( () ) )
            // InternalSimpleIDL.g:3782:1: ( () )
            {
            // InternalSimpleIDL.g:3782:1: ( () )
            // InternalSimpleIDL.g:3783:2: ()
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getDoubleTypeAction_7_0()); 
            // InternalSimpleIDL.g:3784:2: ()
            // InternalSimpleIDL.g:3784:3: 
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
    // InternalSimpleIDL.g:3792:1: rule__SimpleTypeSpec__Group_7__1 : rule__SimpleTypeSpec__Group_7__1__Impl ;
    public final void rule__SimpleTypeSpec__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3796:1: ( rule__SimpleTypeSpec__Group_7__1__Impl )
            // InternalSimpleIDL.g:3797:2: rule__SimpleTypeSpec__Group_7__1__Impl
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
    // InternalSimpleIDL.g:3803:1: rule__SimpleTypeSpec__Group_7__1__Impl : ( 'double' ) ;
    public final void rule__SimpleTypeSpec__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3807:1: ( ( 'double' ) )
            // InternalSimpleIDL.g:3808:1: ( 'double' )
            {
            // InternalSimpleIDL.g:3808:1: ( 'double' )
            // InternalSimpleIDL.g:3809:2: 'double'
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
    // InternalSimpleIDL.g:3819:1: rule__SimpleTypeSpec__Group_8__0 : rule__SimpleTypeSpec__Group_8__0__Impl rule__SimpleTypeSpec__Group_8__1 ;
    public final void rule__SimpleTypeSpec__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3823:1: ( rule__SimpleTypeSpec__Group_8__0__Impl rule__SimpleTypeSpec__Group_8__1 )
            // InternalSimpleIDL.g:3824:2: rule__SimpleTypeSpec__Group_8__0__Impl rule__SimpleTypeSpec__Group_8__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalSimpleIDL.g:3831:1: rule__SimpleTypeSpec__Group_8__0__Impl : ( () ) ;
    public final void rule__SimpleTypeSpec__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3835:1: ( ( () ) )
            // InternalSimpleIDL.g:3836:1: ( () )
            {
            // InternalSimpleIDL.g:3836:1: ( () )
            // InternalSimpleIDL.g:3837:2: ()
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getLongDoubleTypeAction_8_0()); 
            // InternalSimpleIDL.g:3838:2: ()
            // InternalSimpleIDL.g:3838:3: 
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
    // InternalSimpleIDL.g:3846:1: rule__SimpleTypeSpec__Group_8__1 : rule__SimpleTypeSpec__Group_8__1__Impl rule__SimpleTypeSpec__Group_8__2 ;
    public final void rule__SimpleTypeSpec__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3850:1: ( rule__SimpleTypeSpec__Group_8__1__Impl rule__SimpleTypeSpec__Group_8__2 )
            // InternalSimpleIDL.g:3851:2: rule__SimpleTypeSpec__Group_8__1__Impl rule__SimpleTypeSpec__Group_8__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalSimpleIDL.g:3858:1: rule__SimpleTypeSpec__Group_8__1__Impl : ( 'long' ) ;
    public final void rule__SimpleTypeSpec__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3862:1: ( ( 'long' ) )
            // InternalSimpleIDL.g:3863:1: ( 'long' )
            {
            // InternalSimpleIDL.g:3863:1: ( 'long' )
            // InternalSimpleIDL.g:3864:2: 'long'
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
    // InternalSimpleIDL.g:3873:1: rule__SimpleTypeSpec__Group_8__2 : rule__SimpleTypeSpec__Group_8__2__Impl ;
    public final void rule__SimpleTypeSpec__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3877:1: ( rule__SimpleTypeSpec__Group_8__2__Impl )
            // InternalSimpleIDL.g:3878:2: rule__SimpleTypeSpec__Group_8__2__Impl
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
    // InternalSimpleIDL.g:3884:1: rule__SimpleTypeSpec__Group_8__2__Impl : ( 'double' ) ;
    public final void rule__SimpleTypeSpec__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3888:1: ( ( 'double' ) )
            // InternalSimpleIDL.g:3889:1: ( 'double' )
            {
            // InternalSimpleIDL.g:3889:1: ( 'double' )
            // InternalSimpleIDL.g:3890:2: 'double'
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
    // InternalSimpleIDL.g:3900:1: rule__SimpleTypeSpec__Group_9__0 : rule__SimpleTypeSpec__Group_9__0__Impl rule__SimpleTypeSpec__Group_9__1 ;
    public final void rule__SimpleTypeSpec__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3904:1: ( rule__SimpleTypeSpec__Group_9__0__Impl rule__SimpleTypeSpec__Group_9__1 )
            // InternalSimpleIDL.g:3905:2: rule__SimpleTypeSpec__Group_9__0__Impl rule__SimpleTypeSpec__Group_9__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalSimpleIDL.g:3912:1: rule__SimpleTypeSpec__Group_9__0__Impl : ( () ) ;
    public final void rule__SimpleTypeSpec__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3916:1: ( ( () ) )
            // InternalSimpleIDL.g:3917:1: ( () )
            {
            // InternalSimpleIDL.g:3917:1: ( () )
            // InternalSimpleIDL.g:3918:2: ()
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getCharTypeAction_9_0()); 
            // InternalSimpleIDL.g:3919:2: ()
            // InternalSimpleIDL.g:3919:3: 
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
    // InternalSimpleIDL.g:3927:1: rule__SimpleTypeSpec__Group_9__1 : rule__SimpleTypeSpec__Group_9__1__Impl ;
    public final void rule__SimpleTypeSpec__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3931:1: ( rule__SimpleTypeSpec__Group_9__1__Impl )
            // InternalSimpleIDL.g:3932:2: rule__SimpleTypeSpec__Group_9__1__Impl
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
    // InternalSimpleIDL.g:3938:1: rule__SimpleTypeSpec__Group_9__1__Impl : ( 'char' ) ;
    public final void rule__SimpleTypeSpec__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3942:1: ( ( 'char' ) )
            // InternalSimpleIDL.g:3943:1: ( 'char' )
            {
            // InternalSimpleIDL.g:3943:1: ( 'char' )
            // InternalSimpleIDL.g:3944:2: 'char'
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
    // InternalSimpleIDL.g:3954:1: rule__SimpleTypeSpec__Group_10__0 : rule__SimpleTypeSpec__Group_10__0__Impl rule__SimpleTypeSpec__Group_10__1 ;
    public final void rule__SimpleTypeSpec__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3958:1: ( rule__SimpleTypeSpec__Group_10__0__Impl rule__SimpleTypeSpec__Group_10__1 )
            // InternalSimpleIDL.g:3959:2: rule__SimpleTypeSpec__Group_10__0__Impl rule__SimpleTypeSpec__Group_10__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalSimpleIDL.g:3966:1: rule__SimpleTypeSpec__Group_10__0__Impl : ( () ) ;
    public final void rule__SimpleTypeSpec__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3970:1: ( ( () ) )
            // InternalSimpleIDL.g:3971:1: ( () )
            {
            // InternalSimpleIDL.g:3971:1: ( () )
            // InternalSimpleIDL.g:3972:2: ()
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getWideCharTypeAction_10_0()); 
            // InternalSimpleIDL.g:3973:2: ()
            // InternalSimpleIDL.g:3973:3: 
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
    // InternalSimpleIDL.g:3981:1: rule__SimpleTypeSpec__Group_10__1 : rule__SimpleTypeSpec__Group_10__1__Impl ;
    public final void rule__SimpleTypeSpec__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3985:1: ( rule__SimpleTypeSpec__Group_10__1__Impl )
            // InternalSimpleIDL.g:3986:2: rule__SimpleTypeSpec__Group_10__1__Impl
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
    // InternalSimpleIDL.g:3992:1: rule__SimpleTypeSpec__Group_10__1__Impl : ( 'wchar' ) ;
    public final void rule__SimpleTypeSpec__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:3996:1: ( ( 'wchar' ) )
            // InternalSimpleIDL.g:3997:1: ( 'wchar' )
            {
            // InternalSimpleIDL.g:3997:1: ( 'wchar' )
            // InternalSimpleIDL.g:3998:2: 'wchar'
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
    // InternalSimpleIDL.g:4008:1: rule__SimpleTypeSpec__Group_11__0 : rule__SimpleTypeSpec__Group_11__0__Impl rule__SimpleTypeSpec__Group_11__1 ;
    public final void rule__SimpleTypeSpec__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4012:1: ( rule__SimpleTypeSpec__Group_11__0__Impl rule__SimpleTypeSpec__Group_11__1 )
            // InternalSimpleIDL.g:4013:2: rule__SimpleTypeSpec__Group_11__0__Impl rule__SimpleTypeSpec__Group_11__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalSimpleIDL.g:4020:1: rule__SimpleTypeSpec__Group_11__0__Impl : ( () ) ;
    public final void rule__SimpleTypeSpec__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4024:1: ( ( () ) )
            // InternalSimpleIDL.g:4025:1: ( () )
            {
            // InternalSimpleIDL.g:4025:1: ( () )
            // InternalSimpleIDL.g:4026:2: ()
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getBooleanTypeAction_11_0()); 
            // InternalSimpleIDL.g:4027:2: ()
            // InternalSimpleIDL.g:4027:3: 
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
    // InternalSimpleIDL.g:4035:1: rule__SimpleTypeSpec__Group_11__1 : rule__SimpleTypeSpec__Group_11__1__Impl ;
    public final void rule__SimpleTypeSpec__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4039:1: ( rule__SimpleTypeSpec__Group_11__1__Impl )
            // InternalSimpleIDL.g:4040:2: rule__SimpleTypeSpec__Group_11__1__Impl
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
    // InternalSimpleIDL.g:4046:1: rule__SimpleTypeSpec__Group_11__1__Impl : ( 'boolean' ) ;
    public final void rule__SimpleTypeSpec__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4050:1: ( ( 'boolean' ) )
            // InternalSimpleIDL.g:4051:1: ( 'boolean' )
            {
            // InternalSimpleIDL.g:4051:1: ( 'boolean' )
            // InternalSimpleIDL.g:4052:2: 'boolean'
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
    // InternalSimpleIDL.g:4062:1: rule__SimpleTypeSpec__Group_12__0 : rule__SimpleTypeSpec__Group_12__0__Impl rule__SimpleTypeSpec__Group_12__1 ;
    public final void rule__SimpleTypeSpec__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4066:1: ( rule__SimpleTypeSpec__Group_12__0__Impl rule__SimpleTypeSpec__Group_12__1 )
            // InternalSimpleIDL.g:4067:2: rule__SimpleTypeSpec__Group_12__0__Impl rule__SimpleTypeSpec__Group_12__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalSimpleIDL.g:4074:1: rule__SimpleTypeSpec__Group_12__0__Impl : ( () ) ;
    public final void rule__SimpleTypeSpec__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4078:1: ( ( () ) )
            // InternalSimpleIDL.g:4079:1: ( () )
            {
            // InternalSimpleIDL.g:4079:1: ( () )
            // InternalSimpleIDL.g:4080:2: ()
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getOctetTypeAction_12_0()); 
            // InternalSimpleIDL.g:4081:2: ()
            // InternalSimpleIDL.g:4081:3: 
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
    // InternalSimpleIDL.g:4089:1: rule__SimpleTypeSpec__Group_12__1 : rule__SimpleTypeSpec__Group_12__1__Impl ;
    public final void rule__SimpleTypeSpec__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4093:1: ( rule__SimpleTypeSpec__Group_12__1__Impl )
            // InternalSimpleIDL.g:4094:2: rule__SimpleTypeSpec__Group_12__1__Impl
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
    // InternalSimpleIDL.g:4100:1: rule__SimpleTypeSpec__Group_12__1__Impl : ( 'octet' ) ;
    public final void rule__SimpleTypeSpec__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4104:1: ( ( 'octet' ) )
            // InternalSimpleIDL.g:4105:1: ( 'octet' )
            {
            // InternalSimpleIDL.g:4105:1: ( 'octet' )
            // InternalSimpleIDL.g:4106:2: 'octet'
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
    // InternalSimpleIDL.g:4116:1: rule__SimpleTypeSpec__Group_13__0 : rule__SimpleTypeSpec__Group_13__0__Impl rule__SimpleTypeSpec__Group_13__1 ;
    public final void rule__SimpleTypeSpec__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4120:1: ( rule__SimpleTypeSpec__Group_13__0__Impl rule__SimpleTypeSpec__Group_13__1 )
            // InternalSimpleIDL.g:4121:2: rule__SimpleTypeSpec__Group_13__0__Impl rule__SimpleTypeSpec__Group_13__1
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
    // InternalSimpleIDL.g:4128:1: rule__SimpleTypeSpec__Group_13__0__Impl : ( () ) ;
    public final void rule__SimpleTypeSpec__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4132:1: ( ( () ) )
            // InternalSimpleIDL.g:4133:1: ( () )
            {
            // InternalSimpleIDL.g:4133:1: ( () )
            // InternalSimpleIDL.g:4134:2: ()
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getReferencedTypeAction_13_0()); 
            // InternalSimpleIDL.g:4135:2: ()
            // InternalSimpleIDL.g:4135:3: 
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
    // InternalSimpleIDL.g:4143:1: rule__SimpleTypeSpec__Group_13__1 : rule__SimpleTypeSpec__Group_13__1__Impl ;
    public final void rule__SimpleTypeSpec__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4147:1: ( rule__SimpleTypeSpec__Group_13__1__Impl )
            // InternalSimpleIDL.g:4148:2: rule__SimpleTypeSpec__Group_13__1__Impl
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
    // InternalSimpleIDL.g:4154:1: rule__SimpleTypeSpec__Group_13__1__Impl : ( ( rule__SimpleTypeSpec__TypeAssignment_13_1 ) ) ;
    public final void rule__SimpleTypeSpec__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4158:1: ( ( ( rule__SimpleTypeSpec__TypeAssignment_13_1 ) ) )
            // InternalSimpleIDL.g:4159:1: ( ( rule__SimpleTypeSpec__TypeAssignment_13_1 ) )
            {
            // InternalSimpleIDL.g:4159:1: ( ( rule__SimpleTypeSpec__TypeAssignment_13_1 ) )
            // InternalSimpleIDL.g:4160:2: ( rule__SimpleTypeSpec__TypeAssignment_13_1 )
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getTypeAssignment_13_1()); 
            // InternalSimpleIDL.g:4161:2: ( rule__SimpleTypeSpec__TypeAssignment_13_1 )
            // InternalSimpleIDL.g:4161:3: rule__SimpleTypeSpec__TypeAssignment_13_1
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
    // InternalSimpleIDL.g:4170:1: rule__ScopedName__Group__0 : rule__ScopedName__Group__0__Impl rule__ScopedName__Group__1 ;
    public final void rule__ScopedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4174:1: ( rule__ScopedName__Group__0__Impl rule__ScopedName__Group__1 )
            // InternalSimpleIDL.g:4175:2: rule__ScopedName__Group__0__Impl rule__ScopedName__Group__1
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
    // InternalSimpleIDL.g:4182:1: rule__ScopedName__Group__0__Impl : ( ( '::' )? ) ;
    public final void rule__ScopedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4186:1: ( ( ( '::' )? ) )
            // InternalSimpleIDL.g:4187:1: ( ( '::' )? )
            {
            // InternalSimpleIDL.g:4187:1: ( ( '::' )? )
            // InternalSimpleIDL.g:4188:2: ( '::' )?
            {
             before(grammarAccess.getScopedNameAccess().getColonColonKeyword_0()); 
            // InternalSimpleIDL.g:4189:2: ( '::' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==43) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSimpleIDL.g:4189:3: '::'
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
    // InternalSimpleIDL.g:4197:1: rule__ScopedName__Group__1 : rule__ScopedName__Group__1__Impl rule__ScopedName__Group__2 ;
    public final void rule__ScopedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4201:1: ( rule__ScopedName__Group__1__Impl rule__ScopedName__Group__2 )
            // InternalSimpleIDL.g:4202:2: rule__ScopedName__Group__1__Impl rule__ScopedName__Group__2
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
    // InternalSimpleIDL.g:4209:1: rule__ScopedName__Group__1__Impl : ( ( rule__ScopedName__Group_1__0 )* ) ;
    public final void rule__ScopedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4213:1: ( ( ( rule__ScopedName__Group_1__0 )* ) )
            // InternalSimpleIDL.g:4214:1: ( ( rule__ScopedName__Group_1__0 )* )
            {
            // InternalSimpleIDL.g:4214:1: ( ( rule__ScopedName__Group_1__0 )* )
            // InternalSimpleIDL.g:4215:2: ( rule__ScopedName__Group_1__0 )*
            {
             before(grammarAccess.getScopedNameAccess().getGroup_1()); 
            // InternalSimpleIDL.g:4216:2: ( rule__ScopedName__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==43) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // InternalSimpleIDL.g:4216:3: rule__ScopedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__ScopedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalSimpleIDL.g:4224:1: rule__ScopedName__Group__2 : rule__ScopedName__Group__2__Impl ;
    public final void rule__ScopedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4228:1: ( rule__ScopedName__Group__2__Impl )
            // InternalSimpleIDL.g:4229:2: rule__ScopedName__Group__2__Impl
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
    // InternalSimpleIDL.g:4235:1: rule__ScopedName__Group__2__Impl : ( RULE_ID ) ;
    public final void rule__ScopedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4239:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4240:1: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4240:1: ( RULE_ID )
            // InternalSimpleIDL.g:4241:2: RULE_ID
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
    // InternalSimpleIDL.g:4251:1: rule__ScopedName__Group_1__0 : rule__ScopedName__Group_1__0__Impl rule__ScopedName__Group_1__1 ;
    public final void rule__ScopedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4255:1: ( rule__ScopedName__Group_1__0__Impl rule__ScopedName__Group_1__1 )
            // InternalSimpleIDL.g:4256:2: rule__ScopedName__Group_1__0__Impl rule__ScopedName__Group_1__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalSimpleIDL.g:4263:1: rule__ScopedName__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__ScopedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4267:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4268:1: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4268:1: ( RULE_ID )
            // InternalSimpleIDL.g:4269:2: RULE_ID
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
    // InternalSimpleIDL.g:4278:1: rule__ScopedName__Group_1__1 : rule__ScopedName__Group_1__1__Impl ;
    public final void rule__ScopedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4282:1: ( rule__ScopedName__Group_1__1__Impl )
            // InternalSimpleIDL.g:4283:2: rule__ScopedName__Group_1__1__Impl
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
    // InternalSimpleIDL.g:4289:1: rule__ScopedName__Group_1__1__Impl : ( '::' ) ;
    public final void rule__ScopedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4293:1: ( ( '::' ) )
            // InternalSimpleIDL.g:4294:1: ( '::' )
            {
            // InternalSimpleIDL.g:4294:1: ( '::' )
            // InternalSimpleIDL.g:4295:2: '::'
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
    // InternalSimpleIDL.g:4305:1: rule__Specification__DefinitionsAssignment : ( ruleDefinition ) ;
    public final void rule__Specification__DefinitionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4309:1: ( ( ruleDefinition ) )
            // InternalSimpleIDL.g:4310:2: ( ruleDefinition )
            {
            // InternalSimpleIDL.g:4310:2: ( ruleDefinition )
            // InternalSimpleIDL.g:4311:3: ruleDefinition
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
    // InternalSimpleIDL.g:4320:1: rule__Definition__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4324:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4325:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4325:2: ( RULE_ID )
            // InternalSimpleIDL.g:4326:3: RULE_ID
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
    // InternalSimpleIDL.g:4335:1: rule__Definition__DefinitionsAssignment_0_4 : ( ruleDefinition ) ;
    public final void rule__Definition__DefinitionsAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4339:1: ( ( ruleDefinition ) )
            // InternalSimpleIDL.g:4340:2: ( ruleDefinition )
            {
            // InternalSimpleIDL.g:4340:2: ( ruleDefinition )
            // InternalSimpleIDL.g:4341:3: ruleDefinition
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
    // InternalSimpleIDL.g:4350:1: rule__Definition__NameAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4354:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4355:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4355:2: ( RULE_ID )
            // InternalSimpleIDL.g:4356:3: RULE_ID
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
    // InternalSimpleIDL.g:4365:1: rule__Definition__MembersAssignment_1_4 : ( ruleMember ) ;
    public final void rule__Definition__MembersAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4369:1: ( ( ruleMember ) )
            // InternalSimpleIDL.g:4370:2: ( ruleMember )
            {
            // InternalSimpleIDL.g:4370:2: ( ruleMember )
            // InternalSimpleIDL.g:4371:3: ruleMember
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
    // InternalSimpleIDL.g:4380:1: rule__Definition__StructAssignment_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__Definition__StructAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4384:1: ( ( ( RULE_ID ) ) )
            // InternalSimpleIDL.g:4385:2: ( ( RULE_ID ) )
            {
            // InternalSimpleIDL.g:4385:2: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4386:3: ( RULE_ID )
            {
             before(grammarAccess.getDefinitionAccess().getStructStructCrossReference_2_2_0()); 
            // InternalSimpleIDL.g:4387:3: ( RULE_ID )
            // InternalSimpleIDL.g:4388:4: RULE_ID
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
    // InternalSimpleIDL.g:4399:1: rule__Definition__NameAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4403:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4404:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4404:2: ( RULE_ID )
            // InternalSimpleIDL.g:4405:3: RULE_ID
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
    // InternalSimpleIDL.g:4414:1: rule__Definition__CasesAssignment_3_10 : ( ruleCase ) ;
    public final void rule__Definition__CasesAssignment_3_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4418:1: ( ( ruleCase ) )
            // InternalSimpleIDL.g:4419:2: ( ruleCase )
            {
            // InternalSimpleIDL.g:4419:2: ( ruleCase )
            // InternalSimpleIDL.g:4420:3: ruleCase
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
    // InternalSimpleIDL.g:4429:1: rule__Definition__NameAssignment_4_2 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4433:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4434:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4434:2: ( RULE_ID )
            // InternalSimpleIDL.g:4435:3: RULE_ID
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
    // InternalSimpleIDL.g:4444:1: rule__Definition__LiteralsAssignment_4_4 : ( RULE_ID ) ;
    public final void rule__Definition__LiteralsAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4448:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4449:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4449:2: ( RULE_ID )
            // InternalSimpleIDL.g:4450:3: RULE_ID
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
    // InternalSimpleIDL.g:4459:1: rule__Definition__LiteralsAssignment_4_5_1 : ( RULE_ID ) ;
    public final void rule__Definition__LiteralsAssignment_4_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4463:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4464:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4464:2: ( RULE_ID )
            // InternalSimpleIDL.g:4465:3: RULE_ID
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
    // InternalSimpleIDL.g:4474:1: rule__Definition__TypeAssignment_5_2 : ( ruleType ) ;
    public final void rule__Definition__TypeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4478:1: ( ( ruleType ) )
            // InternalSimpleIDL.g:4479:2: ( ruleType )
            {
            // InternalSimpleIDL.g:4479:2: ( ruleType )
            // InternalSimpleIDL.g:4480:3: ruleType
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
    // InternalSimpleIDL.g:4489:1: rule__Definition__NamesAssignment_5_3 : ( ruleAnyDeclarator ) ;
    public final void rule__Definition__NamesAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4493:1: ( ( ruleAnyDeclarator ) )
            // InternalSimpleIDL.g:4494:2: ( ruleAnyDeclarator )
            {
            // InternalSimpleIDL.g:4494:2: ( ruleAnyDeclarator )
            // InternalSimpleIDL.g:4495:3: ruleAnyDeclarator
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
    // InternalSimpleIDL.g:4504:1: rule__Definition__NamesAssignment_5_4_1 : ( ruleAnyDeclarator ) ;
    public final void rule__Definition__NamesAssignment_5_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4508:1: ( ( ruleAnyDeclarator ) )
            // InternalSimpleIDL.g:4509:2: ( ruleAnyDeclarator )
            {
            // InternalSimpleIDL.g:4509:2: ( ruleAnyDeclarator )
            // InternalSimpleIDL.g:4510:3: ruleAnyDeclarator
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
    // InternalSimpleIDL.g:4519:1: rule__Member__TypeAssignment_0 : ( ruleSimpleTypeSpec ) ;
    public final void rule__Member__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4523:1: ( ( ruleSimpleTypeSpec ) )
            // InternalSimpleIDL.g:4524:2: ( ruleSimpleTypeSpec )
            {
            // InternalSimpleIDL.g:4524:2: ( ruleSimpleTypeSpec )
            // InternalSimpleIDL.g:4525:3: ruleSimpleTypeSpec
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


    // $ANTLR start "rule__Member__NamesAssignment_1"
    // InternalSimpleIDL.g:4534:1: rule__Member__NamesAssignment_1 : ( RULE_ID ) ;
    public final void rule__Member__NamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4538:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4539:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4539:2: ( RULE_ID )
            // InternalSimpleIDL.g:4540:3: RULE_ID
            {
             before(grammarAccess.getMemberAccess().getNamesIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getNamesIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__NamesAssignment_1"


    // $ANTLR start "rule__Member__NamesAssignment_2_1"
    // InternalSimpleIDL.g:4549:1: rule__Member__NamesAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Member__NamesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4553:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4554:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4554:2: ( RULE_ID )
            // InternalSimpleIDL.g:4555:3: RULE_ID
            {
             before(grammarAccess.getMemberAccess().getNamesIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getNamesIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__NamesAssignment_2_1"


    // $ANTLR start "rule__Case__LabelsAssignment_0_1"
    // InternalSimpleIDL.g:4564:1: rule__Case__LabelsAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Case__LabelsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4568:1: ( ( RULE_INT ) )
            // InternalSimpleIDL.g:4569:2: ( RULE_INT )
            {
            // InternalSimpleIDL.g:4569:2: ( RULE_INT )
            // InternalSimpleIDL.g:4570:3: RULE_INT
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
    // InternalSimpleIDL.g:4579:1: rule__Case__TypeAssignment_1 : ( ruleSimpleTypeSpec ) ;
    public final void rule__Case__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4583:1: ( ( ruleSimpleTypeSpec ) )
            // InternalSimpleIDL.g:4584:2: ( ruleSimpleTypeSpec )
            {
            // InternalSimpleIDL.g:4584:2: ( ruleSimpleTypeSpec )
            // InternalSimpleIDL.g:4585:3: ruleSimpleTypeSpec
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
    // InternalSimpleIDL.g:4594:1: rule__Case__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Case__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4598:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4599:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4599:2: ( RULE_ID )
            // InternalSimpleIDL.g:4600:3: RULE_ID
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
    // InternalSimpleIDL.g:4609:1: rule__AnyDeclarator__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__AnyDeclarator__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4613:1: ( ( RULE_ID ) )
            // InternalSimpleIDL.g:4614:2: ( RULE_ID )
            {
            // InternalSimpleIDL.g:4614:2: ( RULE_ID )
            // InternalSimpleIDL.g:4615:3: RULE_ID
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


    // $ANTLR start "rule__AnyDeclarator__ArraySizesAssignment_1_1"
    // InternalSimpleIDL.g:4624:1: rule__AnyDeclarator__ArraySizesAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__AnyDeclarator__ArraySizesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4628:1: ( ( RULE_INT ) )
            // InternalSimpleIDL.g:4629:2: ( RULE_INT )
            {
            // InternalSimpleIDL.g:4629:2: ( RULE_INT )
            // InternalSimpleIDL.g:4630:3: RULE_INT
            {
             before(grammarAccess.getAnyDeclaratorAccess().getArraySizesINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAnyDeclaratorAccess().getArraySizesINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyDeclarator__ArraySizesAssignment_1_1"


    // $ANTLR start "rule__Type__TypeAssignment_1_3"
    // InternalSimpleIDL.g:4639:1: rule__Type__TypeAssignment_1_3 : ( ruleSimpleTypeSpec ) ;
    public final void rule__Type__TypeAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4643:1: ( ( ruleSimpleTypeSpec ) )
            // InternalSimpleIDL.g:4644:2: ( ruleSimpleTypeSpec )
            {
            // InternalSimpleIDL.g:4644:2: ( ruleSimpleTypeSpec )
            // InternalSimpleIDL.g:4645:3: ruleSimpleTypeSpec
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
    // InternalSimpleIDL.g:4654:1: rule__Type__SizeAssignment_1_5 : ( RULE_INT ) ;
    public final void rule__Type__SizeAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4658:1: ( ( RULE_INT ) )
            // InternalSimpleIDL.g:4659:2: ( RULE_INT )
            {
            // InternalSimpleIDL.g:4659:2: ( RULE_INT )
            // InternalSimpleIDL.g:4660:3: RULE_INT
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
    // InternalSimpleIDL.g:4669:1: rule__Type__TypeAssignment_2_3 : ( ruleSimpleTypeSpec ) ;
    public final void rule__Type__TypeAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4673:1: ( ( ruleSimpleTypeSpec ) )
            // InternalSimpleIDL.g:4674:2: ( ruleSimpleTypeSpec )
            {
            // InternalSimpleIDL.g:4674:2: ( ruleSimpleTypeSpec )
            // InternalSimpleIDL.g:4675:3: ruleSimpleTypeSpec
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
    // InternalSimpleIDL.g:4684:1: rule__Type__SizeAssignment_3_3 : ( RULE_INT ) ;
    public final void rule__Type__SizeAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4688:1: ( ( RULE_INT ) )
            // InternalSimpleIDL.g:4689:2: ( RULE_INT )
            {
            // InternalSimpleIDL.g:4689:2: ( RULE_INT )
            // InternalSimpleIDL.g:4690:3: RULE_INT
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
    // InternalSimpleIDL.g:4699:1: rule__Type__SizeAssignment_5_3 : ( RULE_INT ) ;
    public final void rule__Type__SizeAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4703:1: ( ( RULE_INT ) )
            // InternalSimpleIDL.g:4704:2: ( RULE_INT )
            {
            // InternalSimpleIDL.g:4704:2: ( RULE_INT )
            // InternalSimpleIDL.g:4705:3: RULE_INT
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
    // InternalSimpleIDL.g:4714:1: rule__Type__TotalDigitsAssignment_7_3 : ( RULE_INT ) ;
    public final void rule__Type__TotalDigitsAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4718:1: ( ( RULE_INT ) )
            // InternalSimpleIDL.g:4719:2: ( RULE_INT )
            {
            // InternalSimpleIDL.g:4719:2: ( RULE_INT )
            // InternalSimpleIDL.g:4720:3: RULE_INT
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
    // InternalSimpleIDL.g:4729:1: rule__Type__FractionalDigitsAssignment_7_5 : ( RULE_INT ) ;
    public final void rule__Type__FractionalDigitsAssignment_7_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4733:1: ( ( RULE_INT ) )
            // InternalSimpleIDL.g:4734:2: ( RULE_INT )
            {
            // InternalSimpleIDL.g:4734:2: ( RULE_INT )
            // InternalSimpleIDL.g:4735:3: RULE_INT
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
    // InternalSimpleIDL.g:4744:1: rule__SimpleTypeSpec__TypeAssignment_13_1 : ( ( ruleScopedName ) ) ;
    public final void rule__SimpleTypeSpec__TypeAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleIDL.g:4748:1: ( ( ( ruleScopedName ) ) )
            // InternalSimpleIDL.g:4749:2: ( ( ruleScopedName ) )
            {
            // InternalSimpleIDL.g:4749:2: ( ( ruleScopedName ) )
            // InternalSimpleIDL.g:4750:3: ( ruleScopedName )
            {
             before(grammarAccess.getSimpleTypeSpecAccess().getTypeDefinitionCrossReference_13_1_0()); 
            // InternalSimpleIDL.g:4751:3: ( ruleScopedName )
            // InternalSimpleIDL.g:4752:4: ruleScopedName
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
    static final String dfa_4s = "\1\53\1\uffff\3\37\1\uffff\1\53\4\uffff\1\40\1\46\1\44\6\40\1\4\1\53\2\uffff\2\40\1\44\1\40\1\4\1\40";
    static final String dfa_5s = "\1\uffff\1\1\3\uffff\1\10\1\uffff\1\5\1\4\1\7\1\6\13\uffff\1\3\1\2\6\uffff";
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
            "\1\27\7\uffff\1\26",
            "\1\27\7\uffff\1\26\3\uffff\1\30\1\uffff\1\31",
            "\1\33\16\uffff\1\32",
            "\1\27\7\uffff\1\26",
            "\1\27\7\uffff\1\26",
            "\1\27\7\uffff\1\26",
            "\1\27\7\uffff\1\26",
            "\1\27\7\uffff\1\26",
            "\1\27\7\uffff\1\26",
            "\1\25",
            "\1\27\7\uffff\1\26\12\uffff\1\34",
            "",
            "",
            "\1\27\7\uffff\1\26",
            "\1\27\7\uffff\1\26",
            "\1\27\7\uffff\1\26\3\uffff\1\35",
            "\1\27\7\uffff\1\26",
            "\1\25",
            "\1\27\7\uffff\1\26"
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
            return "320:1: rule__Type__Alternatives : ( ( ruleSimpleTypeSpec ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) | ( ( rule__Type__Group_3__0 ) ) | ( ( rule__Type__Group_4__0 ) ) | ( ( rule__Type__Group_5__0 ) ) | ( ( rule__Type__Group_6__0 ) ) | ( ( rule__Type__Group_7__0 ) ) );";
        }
    }
    static final String dfa_8s = "\22\uffff";
    static final String dfa_9s = "\2\uffff\1\13\13\uffff\1\21\3\uffff";
    static final String dfa_10s = "\1\4\1\uffff\1\4\1\25\12\uffff\1\4\3\uffff";
    static final String dfa_11s = "\1\53\1\uffff\1\46\1\44\12\uffff\1\44\3\uffff";
    static final String dfa_12s = "\1\uffff\1\1\2\uffff\1\7\1\10\1\12\1\13\1\14\1\15\1\16\1\2\1\11\1\3\1\uffff\1\4\1\6\1\5";
    static final String dfa_13s = "\22\uffff}>";
    static final String[] dfa_14s = {
            "\1\12\17\uffff\1\3\1\1\16\uffff\1\2\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "",
            "\1\13\23\uffff\1\13\7\uffff\1\13\3\uffff\1\15\1\uffff\1\14",
            "\1\17\16\uffff\1\16",
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
            "\1\21\23\uffff\1\21\7\uffff\1\21\3\uffff\1\20",
            "",
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
            return "377:1: rule__SimpleTypeSpec__Alternatives : ( ( ( rule__SimpleTypeSpec__Group_0__0 ) ) | ( ( rule__SimpleTypeSpec__Group_1__0 ) ) | ( ( rule__SimpleTypeSpec__Group_2__0 ) ) | ( ( rule__SimpleTypeSpec__Group_3__0 ) ) | ( ( rule__SimpleTypeSpec__Group_4__0 ) ) | ( ( rule__SimpleTypeSpec__Group_5__0 ) ) | ( ( rule__SimpleTypeSpec__Group_6__0 ) ) | ( ( rule__SimpleTypeSpec__Group_7__0 ) ) | ( ( rule__SimpleTypeSpec__Group_8__0 ) ) | ( ( rule__SimpleTypeSpec__Group_9__0 ) ) | ( ( rule__SimpleTypeSpec__Group_10__0 ) ) | ( ( rule__SimpleTypeSpec__Group_11__0 ) ) | ( ( rule__SimpleTypeSpec__Group_12__0 ) ) | ( ( rule__SimpleTypeSpec__Group_13__0 ) ) );";
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
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000080000000000L});

}