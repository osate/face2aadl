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
public class InternalSimpleIDLParser extends AbstractInternalAntlrParser {
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




    // $ANTLR start "entryRuleSpecification"
    // InternalSimpleIDL.g:80:1: entryRuleSpecification returns [EObject current=null] : iv_ruleSpecification= ruleSpecification EOF ;
    public final EObject entryRuleSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecification = null;


        try {
            // InternalSimpleIDL.g:80:54: (iv_ruleSpecification= ruleSpecification EOF )
            // InternalSimpleIDL.g:81:2: iv_ruleSpecification= ruleSpecification EOF
            {
             newCompositeNode(grammarAccess.getSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecification=ruleSpecification();

            state._fsp--;

             current =iv_ruleSpecification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecification"


    // $ANTLR start "ruleSpecification"
    // InternalSimpleIDL.g:87:1: ruleSpecification returns [EObject current=null] : ( (lv_definitions_0_0= ruleDefinition ) )+ ;
    public final EObject ruleSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_definitions_0_0 = null;



        	enterRule();

        try {
            // InternalSimpleIDL.g:93:2: ( ( (lv_definitions_0_0= ruleDefinition ) )+ )
            // InternalSimpleIDL.g:94:2: ( (lv_definitions_0_0= ruleDefinition ) )+
            {
            // InternalSimpleIDL.g:94:2: ( (lv_definitions_0_0= ruleDefinition ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||(LA1_0>=16 && LA1_0<=17)||LA1_0==23||LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSimpleIDL.g:95:3: (lv_definitions_0_0= ruleDefinition )
            	    {
            	    // InternalSimpleIDL.g:95:3: (lv_definitions_0_0= ruleDefinition )
            	    // InternalSimpleIDL.g:96:4: lv_definitions_0_0= ruleDefinition
            	    {

            	    				newCompositeNode(grammarAccess.getSpecificationAccess().getDefinitionsDefinitionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_definitions_0_0=ruleDefinition();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getSpecificationRule());
            	    				}
            	    				add(
            	    					current,
            	    					"definitions",
            	    					lv_definitions_0_0,
            	    					"org.osate.simpleidl.SimpleIDL.Definition");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRuleDefinition"
    // InternalSimpleIDL.g:116:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalSimpleIDL.g:116:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalSimpleIDL.g:117:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalSimpleIDL.g:123:1: ruleDefinition returns [EObject current=null] : ( ( () otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_definitions_4_0= ruleDefinition ) )+ otherlv_5= '}' otherlv_6= ';' ) | ( () otherlv_8= 'struct' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )+ otherlv_12= '}' otherlv_13= ';' ) | ( () otherlv_15= 'struct' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';' ) | ( () otherlv_19= 'union' ( (lv_name_20_0= RULE_ID ) ) otherlv_21= '{' otherlv_22= 'switch' otherlv_23= '(' otherlv_24= 'unsigned' otherlv_25= 'short' otherlv_26= ')' otherlv_27= '{' ( (lv_cases_28_0= ruleCase ) )+ otherlv_29= '}' otherlv_30= ';' otherlv_31= '}' otherlv_32= ';' ) | ( () otherlv_34= 'enum' ( (lv_name_35_0= RULE_ID ) ) otherlv_36= '{' ( (lv_literals_37_0= RULE_ID ) ) (otherlv_38= ',' ( (lv_literals_39_0= RULE_ID ) ) )* otherlv_40= '}' otherlv_41= ';' ) | ( () otherlv_43= 'typedef' ( (lv_type_44_0= ruleType ) ) ( (lv_names_45_0= ruleAnyDeclarator ) ) (otherlv_46= ',' ( (lv_names_47_0= ruleAnyDeclarator ) ) )* otherlv_48= ';' ) ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token lv_name_20_0=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token lv_name_35_0=null;
        Token otherlv_36=null;
        Token lv_literals_37_0=null;
        Token otherlv_38=null;
        Token lv_literals_39_0=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        EObject lv_definitions_4_0 = null;

        EObject lv_members_11_0 = null;

        EObject lv_cases_28_0 = null;

        EObject lv_type_44_0 = null;

        EObject lv_names_45_0 = null;

        EObject lv_names_47_0 = null;



        	enterRule();

        try {
            // InternalSimpleIDL.g:129:2: ( ( ( () otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_definitions_4_0= ruleDefinition ) )+ otherlv_5= '}' otherlv_6= ';' ) | ( () otherlv_8= 'struct' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )+ otherlv_12= '}' otherlv_13= ';' ) | ( () otherlv_15= 'struct' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';' ) | ( () otherlv_19= 'union' ( (lv_name_20_0= RULE_ID ) ) otherlv_21= '{' otherlv_22= 'switch' otherlv_23= '(' otherlv_24= 'unsigned' otherlv_25= 'short' otherlv_26= ')' otherlv_27= '{' ( (lv_cases_28_0= ruleCase ) )+ otherlv_29= '}' otherlv_30= ';' otherlv_31= '}' otherlv_32= ';' ) | ( () otherlv_34= 'enum' ( (lv_name_35_0= RULE_ID ) ) otherlv_36= '{' ( (lv_literals_37_0= RULE_ID ) ) (otherlv_38= ',' ( (lv_literals_39_0= RULE_ID ) ) )* otherlv_40= '}' otherlv_41= ';' ) | ( () otherlv_43= 'typedef' ( (lv_type_44_0= ruleType ) ) ( (lv_names_45_0= ruleAnyDeclarator ) ) (otherlv_46= ',' ( (lv_names_47_0= ruleAnyDeclarator ) ) )* otherlv_48= ';' ) ) )
            // InternalSimpleIDL.g:130:2: ( ( () otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_definitions_4_0= ruleDefinition ) )+ otherlv_5= '}' otherlv_6= ';' ) | ( () otherlv_8= 'struct' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )+ otherlv_12= '}' otherlv_13= ';' ) | ( () otherlv_15= 'struct' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';' ) | ( () otherlv_19= 'union' ( (lv_name_20_0= RULE_ID ) ) otherlv_21= '{' otherlv_22= 'switch' otherlv_23= '(' otherlv_24= 'unsigned' otherlv_25= 'short' otherlv_26= ')' otherlv_27= '{' ( (lv_cases_28_0= ruleCase ) )+ otherlv_29= '}' otherlv_30= ';' otherlv_31= '}' otherlv_32= ';' ) | ( () otherlv_34= 'enum' ( (lv_name_35_0= RULE_ID ) ) otherlv_36= '{' ( (lv_literals_37_0= RULE_ID ) ) (otherlv_38= ',' ( (lv_literals_39_0= RULE_ID ) ) )* otherlv_40= '}' otherlv_41= ';' ) | ( () otherlv_43= 'typedef' ( (lv_type_44_0= ruleType ) ) ( (lv_names_45_0= ruleAnyDeclarator ) ) (otherlv_46= ',' ( (lv_names_47_0= ruleAnyDeclarator ) ) )* otherlv_48= ';' ) )
            {
            // InternalSimpleIDL.g:130:2: ( ( () otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_definitions_4_0= ruleDefinition ) )+ otherlv_5= '}' otherlv_6= ';' ) | ( () otherlv_8= 'struct' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )+ otherlv_12= '}' otherlv_13= ';' ) | ( () otherlv_15= 'struct' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';' ) | ( () otherlv_19= 'union' ( (lv_name_20_0= RULE_ID ) ) otherlv_21= '{' otherlv_22= 'switch' otherlv_23= '(' otherlv_24= 'unsigned' otherlv_25= 'short' otherlv_26= ')' otherlv_27= '{' ( (lv_cases_28_0= ruleCase ) )+ otherlv_29= '}' otherlv_30= ';' otherlv_31= '}' otherlv_32= ';' ) | ( () otherlv_34= 'enum' ( (lv_name_35_0= RULE_ID ) ) otherlv_36= '{' ( (lv_literals_37_0= RULE_ID ) ) (otherlv_38= ',' ( (lv_literals_39_0= RULE_ID ) ) )* otherlv_40= '}' otherlv_41= ';' ) | ( () otherlv_43= 'typedef' ( (lv_type_44_0= ruleType ) ) ( (lv_names_45_0= ruleAnyDeclarator ) ) (otherlv_46= ',' ( (lv_names_47_0= ruleAnyDeclarator ) ) )* otherlv_48= ';' ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt7=1;
                }
                break;
            case 16:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==RULE_ID) ) {
                    int LA7_6 = input.LA(3);

                    if ( (LA7_6==15) ) {
                        alt7=3;
                    }
                    else if ( (LA7_6==13) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                alt7=4;
                }
                break;
            case 23:
                {
                alt7=5;
                }
                break;
            case 25:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSimpleIDL.g:131:3: ( () otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_definitions_4_0= ruleDefinition ) )+ otherlv_5= '}' otherlv_6= ';' )
                    {
                    // InternalSimpleIDL.g:131:3: ( () otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_definitions_4_0= ruleDefinition ) )+ otherlv_5= '}' otherlv_6= ';' )
                    // InternalSimpleIDL.g:132:4: () otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_definitions_4_0= ruleDefinition ) )+ otherlv_5= '}' otherlv_6= ';'
                    {
                    // InternalSimpleIDL.g:132:4: ()
                    // InternalSimpleIDL.g:133:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDefinitionAccess().getModuleAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getDefinitionAccess().getModuleKeyword_0_1());
                    			
                    // InternalSimpleIDL.g:143:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalSimpleIDL.g:144:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalSimpleIDL.g:144:5: (lv_name_2_0= RULE_ID )
                    // InternalSimpleIDL.g:145:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.osate.simpleidl.SimpleIDL.ID");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_0_3());
                    			
                    // InternalSimpleIDL.g:165:4: ( (lv_definitions_4_0= ruleDefinition ) )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==12||(LA2_0>=16 && LA2_0<=17)||LA2_0==23||LA2_0==25) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalSimpleIDL.g:166:5: (lv_definitions_4_0= ruleDefinition )
                    	    {
                    	    // InternalSimpleIDL.g:166:5: (lv_definitions_4_0= ruleDefinition )
                    	    // InternalSimpleIDL.g:167:6: lv_definitions_4_0= ruleDefinition
                    	    {

                    	    						newCompositeNode(grammarAccess.getDefinitionAccess().getDefinitionsDefinitionParserRuleCall_0_4_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_definitions_4_0=ruleDefinition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"definitions",
                    	    							lv_definitions_4_0,
                    	    							"org.osate.simpleidl.SimpleIDL.Definition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);

                    otherlv_5=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_0_5());
                    			
                    otherlv_6=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getDefinitionAccess().getSemicolonKeyword_0_6());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleIDL.g:194:3: ( () otherlv_8= 'struct' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )+ otherlv_12= '}' otherlv_13= ';' )
                    {
                    // InternalSimpleIDL.g:194:3: ( () otherlv_8= 'struct' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )+ otherlv_12= '}' otherlv_13= ';' )
                    // InternalSimpleIDL.g:195:4: () otherlv_8= 'struct' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )+ otherlv_12= '}' otherlv_13= ';'
                    {
                    // InternalSimpleIDL.g:195:4: ()
                    // InternalSimpleIDL.g:196:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDefinitionAccess().getStructAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_8=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getDefinitionAccess().getStructKeyword_1_1());
                    			
                    // InternalSimpleIDL.g:206:4: ( (lv_name_9_0= RULE_ID ) )
                    // InternalSimpleIDL.g:207:5: (lv_name_9_0= RULE_ID )
                    {
                    // InternalSimpleIDL.g:207:5: (lv_name_9_0= RULE_ID )
                    // InternalSimpleIDL.g:208:6: lv_name_9_0= RULE_ID
                    {
                    lv_name_9_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_9_0, grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_9_0,
                    							"org.osate.simpleidl.SimpleIDL.ID");
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_1_3());
                    			
                    // InternalSimpleIDL.g:228:4: ( (lv_members_11_0= ruleMember ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID||(LA3_0>=20 && LA3_0<=21)||(LA3_0>=36 && LA3_0<=43)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalSimpleIDL.g:229:5: (lv_members_11_0= ruleMember )
                    	    {
                    	    // InternalSimpleIDL.g:229:5: (lv_members_11_0= ruleMember )
                    	    // InternalSimpleIDL.g:230:6: lv_members_11_0= ruleMember
                    	    {

                    	    						newCompositeNode(grammarAccess.getDefinitionAccess().getMembersMemberParserRuleCall_1_4_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_members_11_0=ruleMember();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"members",
                    	    							lv_members_11_0,
                    	    							"org.osate.simpleidl.SimpleIDL.Member");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    otherlv_12=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_1_5());
                    			
                    otherlv_13=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getDefinitionAccess().getSemicolonKeyword_1_6());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleIDL.g:257:3: ( () otherlv_15= 'struct' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';' )
                    {
                    // InternalSimpleIDL.g:257:3: ( () otherlv_15= 'struct' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';' )
                    // InternalSimpleIDL.g:258:4: () otherlv_15= 'struct' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';'
                    {
                    // InternalSimpleIDL.g:258:4: ()
                    // InternalSimpleIDL.g:259:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDefinitionAccess().getStructForwardAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_15=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_15, grammarAccess.getDefinitionAccess().getStructKeyword_2_1());
                    			
                    // InternalSimpleIDL.g:269:4: ( (otherlv_16= RULE_ID ) )
                    // InternalSimpleIDL.g:270:5: (otherlv_16= RULE_ID )
                    {
                    // InternalSimpleIDL.g:270:5: (otherlv_16= RULE_ID )
                    // InternalSimpleIDL.g:271:6: otherlv_16= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefinitionRule());
                    						}
                    					
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_16, grammarAccess.getDefinitionAccess().getStructStructCrossReference_2_2_0());
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getDefinitionAccess().getSemicolonKeyword_2_3());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSimpleIDL.g:288:3: ( () otherlv_19= 'union' ( (lv_name_20_0= RULE_ID ) ) otherlv_21= '{' otherlv_22= 'switch' otherlv_23= '(' otherlv_24= 'unsigned' otherlv_25= 'short' otherlv_26= ')' otherlv_27= '{' ( (lv_cases_28_0= ruleCase ) )+ otherlv_29= '}' otherlv_30= ';' otherlv_31= '}' otherlv_32= ';' )
                    {
                    // InternalSimpleIDL.g:288:3: ( () otherlv_19= 'union' ( (lv_name_20_0= RULE_ID ) ) otherlv_21= '{' otherlv_22= 'switch' otherlv_23= '(' otherlv_24= 'unsigned' otherlv_25= 'short' otherlv_26= ')' otherlv_27= '{' ( (lv_cases_28_0= ruleCase ) )+ otherlv_29= '}' otherlv_30= ';' otherlv_31= '}' otherlv_32= ';' )
                    // InternalSimpleIDL.g:289:4: () otherlv_19= 'union' ( (lv_name_20_0= RULE_ID ) ) otherlv_21= '{' otherlv_22= 'switch' otherlv_23= '(' otherlv_24= 'unsigned' otherlv_25= 'short' otherlv_26= ')' otherlv_27= '{' ( (lv_cases_28_0= ruleCase ) )+ otherlv_29= '}' otherlv_30= ';' otherlv_31= '}' otherlv_32= ';'
                    {
                    // InternalSimpleIDL.g:289:4: ()
                    // InternalSimpleIDL.g:290:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDefinitionAccess().getUnionAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_19=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_19, grammarAccess.getDefinitionAccess().getUnionKeyword_3_1());
                    			
                    // InternalSimpleIDL.g:300:4: ( (lv_name_20_0= RULE_ID ) )
                    // InternalSimpleIDL.g:301:5: (lv_name_20_0= RULE_ID )
                    {
                    // InternalSimpleIDL.g:301:5: (lv_name_20_0= RULE_ID )
                    // InternalSimpleIDL.g:302:6: lv_name_20_0= RULE_ID
                    {
                    lv_name_20_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_20_0, grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_20_0,
                    							"org.osate.simpleidl.SimpleIDL.ID");
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,13,FOLLOW_10); 

                    				newLeafNode(otherlv_21, grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_3_3());
                    			
                    otherlv_22=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_22, grammarAccess.getDefinitionAccess().getSwitchKeyword_3_4());
                    			
                    otherlv_23=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_23, grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_3_5());
                    			
                    otherlv_24=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_24, grammarAccess.getDefinitionAccess().getUnsignedKeyword_3_6());
                    			
                    otherlv_25=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_25, grammarAccess.getDefinitionAccess().getShortKeyword_3_7());
                    			
                    otherlv_26=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_26, grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_3_8());
                    			
                    otherlv_27=(Token)match(input,13,FOLLOW_15); 

                    				newLeafNode(otherlv_27, grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_3_9());
                    			
                    // InternalSimpleIDL.g:346:4: ( (lv_cases_28_0= ruleCase ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==26) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSimpleIDL.g:347:5: (lv_cases_28_0= ruleCase )
                    	    {
                    	    // InternalSimpleIDL.g:347:5: (lv_cases_28_0= ruleCase )
                    	    // InternalSimpleIDL.g:348:6: lv_cases_28_0= ruleCase
                    	    {

                    	    						newCompositeNode(grammarAccess.getDefinitionAccess().getCasesCaseParserRuleCall_3_10_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
                    	    lv_cases_28_0=ruleCase();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"cases",
                    	    							lv_cases_28_0,
                    	    							"org.osate.simpleidl.SimpleIDL.Case");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    otherlv_29=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_29, grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_3_11());
                    			
                    otherlv_30=(Token)match(input,15,FOLLOW_17); 

                    				newLeafNode(otherlv_30, grammarAccess.getDefinitionAccess().getSemicolonKeyword_3_12());
                    			
                    otherlv_31=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_31, grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_3_13());
                    			
                    otherlv_32=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_32, grammarAccess.getDefinitionAccess().getSemicolonKeyword_3_14());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSimpleIDL.g:383:3: ( () otherlv_34= 'enum' ( (lv_name_35_0= RULE_ID ) ) otherlv_36= '{' ( (lv_literals_37_0= RULE_ID ) ) (otherlv_38= ',' ( (lv_literals_39_0= RULE_ID ) ) )* otherlv_40= '}' otherlv_41= ';' )
                    {
                    // InternalSimpleIDL.g:383:3: ( () otherlv_34= 'enum' ( (lv_name_35_0= RULE_ID ) ) otherlv_36= '{' ( (lv_literals_37_0= RULE_ID ) ) (otherlv_38= ',' ( (lv_literals_39_0= RULE_ID ) ) )* otherlv_40= '}' otherlv_41= ';' )
                    // InternalSimpleIDL.g:384:4: () otherlv_34= 'enum' ( (lv_name_35_0= RULE_ID ) ) otherlv_36= '{' ( (lv_literals_37_0= RULE_ID ) ) (otherlv_38= ',' ( (lv_literals_39_0= RULE_ID ) ) )* otherlv_40= '}' otherlv_41= ';'
                    {
                    // InternalSimpleIDL.g:384:4: ()
                    // InternalSimpleIDL.g:385:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDefinitionAccess().getEnumAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_34=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_34, grammarAccess.getDefinitionAccess().getEnumKeyword_4_1());
                    			
                    // InternalSimpleIDL.g:395:4: ( (lv_name_35_0= RULE_ID ) )
                    // InternalSimpleIDL.g:396:5: (lv_name_35_0= RULE_ID )
                    {
                    // InternalSimpleIDL.g:396:5: (lv_name_35_0= RULE_ID )
                    // InternalSimpleIDL.g:397:6: lv_name_35_0= RULE_ID
                    {
                    lv_name_35_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_35_0, grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_35_0,
                    							"org.osate.simpleidl.SimpleIDL.ID");
                    					

                    }


                    }

                    otherlv_36=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_36, grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_4_3());
                    			
                    // InternalSimpleIDL.g:417:4: ( (lv_literals_37_0= RULE_ID ) )
                    // InternalSimpleIDL.g:418:5: (lv_literals_37_0= RULE_ID )
                    {
                    // InternalSimpleIDL.g:418:5: (lv_literals_37_0= RULE_ID )
                    // InternalSimpleIDL.g:419:6: lv_literals_37_0= RULE_ID
                    {
                    lv_literals_37_0=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(lv_literals_37_0, grammarAccess.getDefinitionAccess().getLiteralsIDTerminalRuleCall_4_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefinitionRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"literals",
                    							lv_literals_37_0,
                    							"org.osate.simpleidl.SimpleIDL.ID");
                    					

                    }


                    }

                    // InternalSimpleIDL.g:435:4: (otherlv_38= ',' ( (lv_literals_39_0= RULE_ID ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==24) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalSimpleIDL.g:436:5: otherlv_38= ',' ( (lv_literals_39_0= RULE_ID ) )
                    	    {
                    	    otherlv_38=(Token)match(input,24,FOLLOW_4); 

                    	    					newLeafNode(otherlv_38, grammarAccess.getDefinitionAccess().getCommaKeyword_4_5_0());
                    	    				
                    	    // InternalSimpleIDL.g:440:5: ( (lv_literals_39_0= RULE_ID ) )
                    	    // InternalSimpleIDL.g:441:6: (lv_literals_39_0= RULE_ID )
                    	    {
                    	    // InternalSimpleIDL.g:441:6: (lv_literals_39_0= RULE_ID )
                    	    // InternalSimpleIDL.g:442:7: lv_literals_39_0= RULE_ID
                    	    {
                    	    lv_literals_39_0=(Token)match(input,RULE_ID,FOLLOW_18); 

                    	    							newLeafNode(lv_literals_39_0, grammarAccess.getDefinitionAccess().getLiteralsIDTerminalRuleCall_4_5_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDefinitionRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"literals",
                    	    								lv_literals_39_0,
                    	    								"org.osate.simpleidl.SimpleIDL.ID");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_40=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_40, grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_4_6());
                    			
                    otherlv_41=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_41, grammarAccess.getDefinitionAccess().getSemicolonKeyword_4_7());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSimpleIDL.g:469:3: ( () otherlv_43= 'typedef' ( (lv_type_44_0= ruleType ) ) ( (lv_names_45_0= ruleAnyDeclarator ) ) (otherlv_46= ',' ( (lv_names_47_0= ruleAnyDeclarator ) ) )* otherlv_48= ';' )
                    {
                    // InternalSimpleIDL.g:469:3: ( () otherlv_43= 'typedef' ( (lv_type_44_0= ruleType ) ) ( (lv_names_45_0= ruleAnyDeclarator ) ) (otherlv_46= ',' ( (lv_names_47_0= ruleAnyDeclarator ) ) )* otherlv_48= ';' )
                    // InternalSimpleIDL.g:470:4: () otherlv_43= 'typedef' ( (lv_type_44_0= ruleType ) ) ( (lv_names_45_0= ruleAnyDeclarator ) ) (otherlv_46= ',' ( (lv_names_47_0= ruleAnyDeclarator ) ) )* otherlv_48= ';'
                    {
                    // InternalSimpleIDL.g:470:4: ()
                    // InternalSimpleIDL.g:471:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDefinitionAccess().getTypedefAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_43=(Token)match(input,25,FOLLOW_19); 

                    				newLeafNode(otherlv_43, grammarAccess.getDefinitionAccess().getTypedefKeyword_5_1());
                    			
                    // InternalSimpleIDL.g:481:4: ( (lv_type_44_0= ruleType ) )
                    // InternalSimpleIDL.g:482:5: (lv_type_44_0= ruleType )
                    {
                    // InternalSimpleIDL.g:482:5: (lv_type_44_0= ruleType )
                    // InternalSimpleIDL.g:483:6: lv_type_44_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getDefinitionAccess().getTypeTypeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_type_44_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_44_0,
                    							"org.osate.simpleidl.SimpleIDL.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSimpleIDL.g:500:4: ( (lv_names_45_0= ruleAnyDeclarator ) )
                    // InternalSimpleIDL.g:501:5: (lv_names_45_0= ruleAnyDeclarator )
                    {
                    // InternalSimpleIDL.g:501:5: (lv_names_45_0= ruleAnyDeclarator )
                    // InternalSimpleIDL.g:502:6: lv_names_45_0= ruleAnyDeclarator
                    {

                    						newCompositeNode(grammarAccess.getDefinitionAccess().getNamesAnyDeclaratorParserRuleCall_5_3_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_names_45_0=ruleAnyDeclarator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"names",
                    							lv_names_45_0,
                    							"org.osate.simpleidl.SimpleIDL.AnyDeclarator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSimpleIDL.g:519:4: (otherlv_46= ',' ( (lv_names_47_0= ruleAnyDeclarator ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==24) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSimpleIDL.g:520:5: otherlv_46= ',' ( (lv_names_47_0= ruleAnyDeclarator ) )
                    	    {
                    	    otherlv_46=(Token)match(input,24,FOLLOW_4); 

                    	    					newLeafNode(otherlv_46, grammarAccess.getDefinitionAccess().getCommaKeyword_5_4_0());
                    	    				
                    	    // InternalSimpleIDL.g:524:5: ( (lv_names_47_0= ruleAnyDeclarator ) )
                    	    // InternalSimpleIDL.g:525:6: (lv_names_47_0= ruleAnyDeclarator )
                    	    {
                    	    // InternalSimpleIDL.g:525:6: (lv_names_47_0= ruleAnyDeclarator )
                    	    // InternalSimpleIDL.g:526:7: lv_names_47_0= ruleAnyDeclarator
                    	    {

                    	    							newCompositeNode(grammarAccess.getDefinitionAccess().getNamesAnyDeclaratorParserRuleCall_5_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_names_47_0=ruleAnyDeclarator();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"names",
                    	    								lv_names_47_0,
                    	    								"org.osate.simpleidl.SimpleIDL.AnyDeclarator");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_48=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_48, grammarAccess.getDefinitionAccess().getSemicolonKeyword_5_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleMember"
    // InternalSimpleIDL.g:553:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalSimpleIDL.g:553:47: (iv_ruleMember= ruleMember EOF )
            // InternalSimpleIDL.g:554:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalSimpleIDL.g:560:1: ruleMember returns [EObject current=null] : ( ( (lv_type_0_0= ruleSimpleTypeSpec ) ) ( (lv_names_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_ID ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        Token lv_names_1_0=null;
        Token otherlv_2=null;
        Token lv_names_3_0=null;
        Token otherlv_4=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalSimpleIDL.g:566:2: ( ( ( (lv_type_0_0= ruleSimpleTypeSpec ) ) ( (lv_names_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_ID ) ) )* otherlv_4= ';' ) )
            // InternalSimpleIDL.g:567:2: ( ( (lv_type_0_0= ruleSimpleTypeSpec ) ) ( (lv_names_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_ID ) ) )* otherlv_4= ';' )
            {
            // InternalSimpleIDL.g:567:2: ( ( (lv_type_0_0= ruleSimpleTypeSpec ) ) ( (lv_names_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_ID ) ) )* otherlv_4= ';' )
            // InternalSimpleIDL.g:568:3: ( (lv_type_0_0= ruleSimpleTypeSpec ) ) ( (lv_names_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_ID ) ) )* otherlv_4= ';'
            {
            // InternalSimpleIDL.g:568:3: ( (lv_type_0_0= ruleSimpleTypeSpec ) )
            // InternalSimpleIDL.g:569:4: (lv_type_0_0= ruleSimpleTypeSpec )
            {
            // InternalSimpleIDL.g:569:4: (lv_type_0_0= ruleSimpleTypeSpec )
            // InternalSimpleIDL.g:570:5: lv_type_0_0= ruleSimpleTypeSpec
            {

            					newCompositeNode(grammarAccess.getMemberAccess().getTypeSimpleTypeSpecParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_0_0=ruleSimpleTypeSpec();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMemberRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.osate.simpleidl.SimpleIDL.SimpleTypeSpec");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimpleIDL.g:587:3: ( (lv_names_1_0= RULE_ID ) )
            // InternalSimpleIDL.g:588:4: (lv_names_1_0= RULE_ID )
            {
            // InternalSimpleIDL.g:588:4: (lv_names_1_0= RULE_ID )
            // InternalSimpleIDL.g:589:5: lv_names_1_0= RULE_ID
            {
            lv_names_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_names_1_0, grammarAccess.getMemberAccess().getNamesIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemberRule());
            					}
            					addWithLastConsumed(
            						current,
            						"names",
            						lv_names_1_0,
            						"org.osate.simpleidl.SimpleIDL.ID");
            				

            }


            }

            // InternalSimpleIDL.g:605:3: (otherlv_2= ',' ( (lv_names_3_0= RULE_ID ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSimpleIDL.g:606:4: otherlv_2= ',' ( (lv_names_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMemberAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalSimpleIDL.g:610:4: ( (lv_names_3_0= RULE_ID ) )
            	    // InternalSimpleIDL.g:611:5: (lv_names_3_0= RULE_ID )
            	    {
            	    // InternalSimpleIDL.g:611:5: (lv_names_3_0= RULE_ID )
            	    // InternalSimpleIDL.g:612:6: lv_names_3_0= RULE_ID
            	    {
            	    lv_names_3_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            	    						newLeafNode(lv_names_3_0, grammarAccess.getMemberAccess().getNamesIDTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMemberRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"names",
            	    							lv_names_3_0,
            	    							"org.osate.simpleidl.SimpleIDL.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMemberAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleCase"
    // InternalSimpleIDL.g:637:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // InternalSimpleIDL.g:637:45: (iv_ruleCase= ruleCase EOF )
            // InternalSimpleIDL.g:638:2: iv_ruleCase= ruleCase EOF
            {
             newCompositeNode(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCase=ruleCase();

            state._fsp--;

             current =iv_ruleCase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // InternalSimpleIDL.g:644:1: ruleCase returns [EObject current=null] : ( (otherlv_0= 'case' ( (lv_labels_1_0= RULE_INT ) ) otherlv_2= ':' )+ ( (lv_type_3_0= ruleSimpleTypeSpec ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_labels_1_0=null;
        Token otherlv_2=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalSimpleIDL.g:650:2: ( ( (otherlv_0= 'case' ( (lv_labels_1_0= RULE_INT ) ) otherlv_2= ':' )+ ( (lv_type_3_0= ruleSimpleTypeSpec ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) )
            // InternalSimpleIDL.g:651:2: ( (otherlv_0= 'case' ( (lv_labels_1_0= RULE_INT ) ) otherlv_2= ':' )+ ( (lv_type_3_0= ruleSimpleTypeSpec ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' )
            {
            // InternalSimpleIDL.g:651:2: ( (otherlv_0= 'case' ( (lv_labels_1_0= RULE_INT ) ) otherlv_2= ':' )+ ( (lv_type_3_0= ruleSimpleTypeSpec ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' )
            // InternalSimpleIDL.g:652:3: (otherlv_0= 'case' ( (lv_labels_1_0= RULE_INT ) ) otherlv_2= ':' )+ ( (lv_type_3_0= ruleSimpleTypeSpec ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';'
            {
            // InternalSimpleIDL.g:652:3: (otherlv_0= 'case' ( (lv_labels_1_0= RULE_INT ) ) otherlv_2= ':' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSimpleIDL.g:653:4: otherlv_0= 'case' ( (lv_labels_1_0= RULE_INT ) ) otherlv_2= ':'
            	    {
            	    otherlv_0=(Token)match(input,26,FOLLOW_21); 

            	    				newLeafNode(otherlv_0, grammarAccess.getCaseAccess().getCaseKeyword_0_0());
            	    			
            	    // InternalSimpleIDL.g:657:4: ( (lv_labels_1_0= RULE_INT ) )
            	    // InternalSimpleIDL.g:658:5: (lv_labels_1_0= RULE_INT )
            	    {
            	    // InternalSimpleIDL.g:658:5: (lv_labels_1_0= RULE_INT )
            	    // InternalSimpleIDL.g:659:6: lv_labels_1_0= RULE_INT
            	    {
            	    lv_labels_1_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            	    						newLeafNode(lv_labels_1_0, grammarAccess.getCaseAccess().getLabelsINTTerminalRuleCall_0_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCaseRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"labels",
            	    							lv_labels_1_0,
            	    							"org.eclipse.xtext.common.Terminals.INT");
            	    					

            	    }


            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_23); 

            	    				newLeafNode(otherlv_2, grammarAccess.getCaseAccess().getColonKeyword_0_2());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            // InternalSimpleIDL.g:680:3: ( (lv_type_3_0= ruleSimpleTypeSpec ) )
            // InternalSimpleIDL.g:681:4: (lv_type_3_0= ruleSimpleTypeSpec )
            {
            // InternalSimpleIDL.g:681:4: (lv_type_3_0= ruleSimpleTypeSpec )
            // InternalSimpleIDL.g:682:5: lv_type_3_0= ruleSimpleTypeSpec
            {

            					newCompositeNode(grammarAccess.getCaseAccess().getTypeSimpleTypeSpecParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_3_0=ruleSimpleTypeSpec();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCaseRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.osate.simpleidl.SimpleIDL.SimpleTypeSpec");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimpleIDL.g:699:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalSimpleIDL.g:700:4: (lv_name_4_0= RULE_ID )
            {
            // InternalSimpleIDL.g:700:4: (lv_name_4_0= RULE_ID )
            // InternalSimpleIDL.g:701:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_4_0, grammarAccess.getCaseAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.osate.simpleidl.SimpleIDL.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCaseAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleAnyDeclarator"
    // InternalSimpleIDL.g:725:1: entryRuleAnyDeclarator returns [EObject current=null] : iv_ruleAnyDeclarator= ruleAnyDeclarator EOF ;
    public final EObject entryRuleAnyDeclarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyDeclarator = null;


        try {
            // InternalSimpleIDL.g:725:54: (iv_ruleAnyDeclarator= ruleAnyDeclarator EOF )
            // InternalSimpleIDL.g:726:2: iv_ruleAnyDeclarator= ruleAnyDeclarator EOF
            {
             newCompositeNode(grammarAccess.getAnyDeclaratorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnyDeclarator=ruleAnyDeclarator();

            state._fsp--;

             current =iv_ruleAnyDeclarator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnyDeclarator"


    // $ANTLR start "ruleAnyDeclarator"
    // InternalSimpleIDL.g:732:1: ruleAnyDeclarator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_arraySizes_2_0= RULE_INT ) ) otherlv_3= ']' )* ) ;
    public final EObject ruleAnyDeclarator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_arraySizes_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSimpleIDL.g:738:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_arraySizes_2_0= RULE_INT ) ) otherlv_3= ']' )* ) )
            // InternalSimpleIDL.g:739:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_arraySizes_2_0= RULE_INT ) ) otherlv_3= ']' )* )
            {
            // InternalSimpleIDL.g:739:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_arraySizes_2_0= RULE_INT ) ) otherlv_3= ']' )* )
            // InternalSimpleIDL.g:740:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_arraySizes_2_0= RULE_INT ) ) otherlv_3= ']' )*
            {
            // InternalSimpleIDL.g:740:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSimpleIDL.g:741:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSimpleIDL.g:741:4: (lv_name_0_0= RULE_ID )
            // InternalSimpleIDL.g:742:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAnyDeclaratorAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnyDeclaratorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.osate.simpleidl.SimpleIDL.ID");
            				

            }


            }

            // InternalSimpleIDL.g:758:3: (otherlv_1= '[' ( (lv_arraySizes_2_0= RULE_INT ) ) otherlv_3= ']' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSimpleIDL.g:759:4: otherlv_1= '[' ( (lv_arraySizes_2_0= RULE_INT ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,28,FOLLOW_21); 

            	    				newLeafNode(otherlv_1, grammarAccess.getAnyDeclaratorAccess().getLeftSquareBracketKeyword_1_0());
            	    			
            	    // InternalSimpleIDL.g:763:4: ( (lv_arraySizes_2_0= RULE_INT ) )
            	    // InternalSimpleIDL.g:764:5: (lv_arraySizes_2_0= RULE_INT )
            	    {
            	    // InternalSimpleIDL.g:764:5: (lv_arraySizes_2_0= RULE_INT )
            	    // InternalSimpleIDL.g:765:6: lv_arraySizes_2_0= RULE_INT
            	    {
            	    lv_arraySizes_2_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            	    						newLeafNode(lv_arraySizes_2_0, grammarAccess.getAnyDeclaratorAccess().getArraySizesINTTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAnyDeclaratorRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"arraySizes",
            	    							lv_arraySizes_2_0,
            	    							"org.eclipse.xtext.common.Terminals.INT");
            	    					

            	    }


            	    }

            	    otherlv_3=(Token)match(input,29,FOLLOW_24); 

            	    				newLeafNode(otherlv_3, grammarAccess.getAnyDeclaratorAccess().getRightSquareBracketKeyword_1_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnyDeclarator"


    // $ANTLR start "entryRuleType"
    // InternalSimpleIDL.g:790:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSimpleIDL.g:790:45: (iv_ruleType= ruleType EOF )
            // InternalSimpleIDL.g:791:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSimpleIDL.g:797:1: ruleType returns [EObject current=null] : (this_SimpleTypeSpec_0= ruleSimpleTypeSpec | ( () otherlv_2= 'sequence' otherlv_3= '<' ( (lv_type_4_0= ruleSimpleTypeSpec ) ) otherlv_5= ',' ( (lv_size_6_0= RULE_INT ) ) otherlv_7= '>' ) | ( () otherlv_9= 'sequence' otherlv_10= '<' ( (lv_type_11_0= ruleSimpleTypeSpec ) ) otherlv_12= '>' ) | ( () otherlv_14= 'string' otherlv_15= '<' ( (lv_size_16_0= RULE_INT ) ) otherlv_17= '>' ) | ( () otherlv_19= 'string' ) | ( () otherlv_21= 'wstring' otherlv_22= '<' ( (lv_size_23_0= RULE_INT ) ) otherlv_24= '>' ) | ( () otherlv_26= 'wstring' ) | ( () otherlv_28= 'fixed' otherlv_29= '<' ( (lv_totalDigits_30_0= RULE_INT ) ) otherlv_31= ',' ( (lv_fractionalDigits_32_0= RULE_INT ) ) otherlv_33= '>' ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_size_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_size_16_0=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token lv_size_23_0=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token lv_totalDigits_30_0=null;
        Token otherlv_31=null;
        Token lv_fractionalDigits_32_0=null;
        Token otherlv_33=null;
        EObject this_SimpleTypeSpec_0 = null;

        EObject lv_type_4_0 = null;

        EObject lv_type_11_0 = null;



        	enterRule();

        try {
            // InternalSimpleIDL.g:803:2: ( (this_SimpleTypeSpec_0= ruleSimpleTypeSpec | ( () otherlv_2= 'sequence' otherlv_3= '<' ( (lv_type_4_0= ruleSimpleTypeSpec ) ) otherlv_5= ',' ( (lv_size_6_0= RULE_INT ) ) otherlv_7= '>' ) | ( () otherlv_9= 'sequence' otherlv_10= '<' ( (lv_type_11_0= ruleSimpleTypeSpec ) ) otherlv_12= '>' ) | ( () otherlv_14= 'string' otherlv_15= '<' ( (lv_size_16_0= RULE_INT ) ) otherlv_17= '>' ) | ( () otherlv_19= 'string' ) | ( () otherlv_21= 'wstring' otherlv_22= '<' ( (lv_size_23_0= RULE_INT ) ) otherlv_24= '>' ) | ( () otherlv_26= 'wstring' ) | ( () otherlv_28= 'fixed' otherlv_29= '<' ( (lv_totalDigits_30_0= RULE_INT ) ) otherlv_31= ',' ( (lv_fractionalDigits_32_0= RULE_INT ) ) otherlv_33= '>' ) ) )
            // InternalSimpleIDL.g:804:2: (this_SimpleTypeSpec_0= ruleSimpleTypeSpec | ( () otherlv_2= 'sequence' otherlv_3= '<' ( (lv_type_4_0= ruleSimpleTypeSpec ) ) otherlv_5= ',' ( (lv_size_6_0= RULE_INT ) ) otherlv_7= '>' ) | ( () otherlv_9= 'sequence' otherlv_10= '<' ( (lv_type_11_0= ruleSimpleTypeSpec ) ) otherlv_12= '>' ) | ( () otherlv_14= 'string' otherlv_15= '<' ( (lv_size_16_0= RULE_INT ) ) otherlv_17= '>' ) | ( () otherlv_19= 'string' ) | ( () otherlv_21= 'wstring' otherlv_22= '<' ( (lv_size_23_0= RULE_INT ) ) otherlv_24= '>' ) | ( () otherlv_26= 'wstring' ) | ( () otherlv_28= 'fixed' otherlv_29= '<' ( (lv_totalDigits_30_0= RULE_INT ) ) otherlv_31= ',' ( (lv_fractionalDigits_32_0= RULE_INT ) ) otherlv_33= '>' ) )
            {
            // InternalSimpleIDL.g:804:2: (this_SimpleTypeSpec_0= ruleSimpleTypeSpec | ( () otherlv_2= 'sequence' otherlv_3= '<' ( (lv_type_4_0= ruleSimpleTypeSpec ) ) otherlv_5= ',' ( (lv_size_6_0= RULE_INT ) ) otherlv_7= '>' ) | ( () otherlv_9= 'sequence' otherlv_10= '<' ( (lv_type_11_0= ruleSimpleTypeSpec ) ) otherlv_12= '>' ) | ( () otherlv_14= 'string' otherlv_15= '<' ( (lv_size_16_0= RULE_INT ) ) otherlv_17= '>' ) | ( () otherlv_19= 'string' ) | ( () otherlv_21= 'wstring' otherlv_22= '<' ( (lv_size_23_0= RULE_INT ) ) otherlv_24= '>' ) | ( () otherlv_26= 'wstring' ) | ( () otherlv_28= 'fixed' otherlv_29= '<' ( (lv_totalDigits_30_0= RULE_INT ) ) otherlv_31= ',' ( (lv_fractionalDigits_32_0= RULE_INT ) ) otherlv_33= '>' ) )
            int alt11=8;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalSimpleIDL.g:805:3: this_SimpleTypeSpec_0= ruleSimpleTypeSpec
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getSimpleTypeSpecParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleTypeSpec_0=ruleSimpleTypeSpec();

                    state._fsp--;


                    			current = this_SimpleTypeSpec_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSimpleIDL.g:814:3: ( () otherlv_2= 'sequence' otherlv_3= '<' ( (lv_type_4_0= ruleSimpleTypeSpec ) ) otherlv_5= ',' ( (lv_size_6_0= RULE_INT ) ) otherlv_7= '>' )
                    {
                    // InternalSimpleIDL.g:814:3: ( () otherlv_2= 'sequence' otherlv_3= '<' ( (lv_type_4_0= ruleSimpleTypeSpec ) ) otherlv_5= ',' ( (lv_size_6_0= RULE_INT ) ) otherlv_7= '>' )
                    // InternalSimpleIDL.g:815:4: () otherlv_2= 'sequence' otherlv_3= '<' ( (lv_type_4_0= ruleSimpleTypeSpec ) ) otherlv_5= ',' ( (lv_size_6_0= RULE_INT ) ) otherlv_7= '>'
                    {
                    // InternalSimpleIDL.g:815:4: ()
                    // InternalSimpleIDL.g:816:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getBoundedSequenceAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,30,FOLLOW_26); 

                    				newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getSequenceKeyword_1_1());
                    			
                    otherlv_3=(Token)match(input,31,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getLessThanSignKeyword_1_2());
                    			
                    // InternalSimpleIDL.g:830:4: ( (lv_type_4_0= ruleSimpleTypeSpec ) )
                    // InternalSimpleIDL.g:831:5: (lv_type_4_0= ruleSimpleTypeSpec )
                    {
                    // InternalSimpleIDL.g:831:5: (lv_type_4_0= ruleSimpleTypeSpec )
                    // InternalSimpleIDL.g:832:6: lv_type_4_0= ruleSimpleTypeSpec
                    {

                    						newCompositeNode(grammarAccess.getTypeAccess().getTypeSimpleTypeSpecParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_type_4_0=ruleSimpleTypeSpec();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypeRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"org.osate.simpleidl.SimpleIDL.SimpleTypeSpec");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,24,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getCommaKeyword_1_4());
                    			
                    // InternalSimpleIDL.g:853:4: ( (lv_size_6_0= RULE_INT ) )
                    // InternalSimpleIDL.g:854:5: (lv_size_6_0= RULE_INT )
                    {
                    // InternalSimpleIDL.g:854:5: (lv_size_6_0= RULE_INT )
                    // InternalSimpleIDL.g:855:6: lv_size_6_0= RULE_INT
                    {
                    lv_size_6_0=(Token)match(input,RULE_INT,FOLLOW_28); 

                    						newLeafNode(lv_size_6_0, grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_1_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"size",
                    							lv_size_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getTypeAccess().getGreaterThanSignKeyword_1_6());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleIDL.g:877:3: ( () otherlv_9= 'sequence' otherlv_10= '<' ( (lv_type_11_0= ruleSimpleTypeSpec ) ) otherlv_12= '>' )
                    {
                    // InternalSimpleIDL.g:877:3: ( () otherlv_9= 'sequence' otherlv_10= '<' ( (lv_type_11_0= ruleSimpleTypeSpec ) ) otherlv_12= '>' )
                    // InternalSimpleIDL.g:878:4: () otherlv_9= 'sequence' otherlv_10= '<' ( (lv_type_11_0= ruleSimpleTypeSpec ) ) otherlv_12= '>'
                    {
                    // InternalSimpleIDL.g:878:4: ()
                    // InternalSimpleIDL.g:879:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getUnboundedSequenceAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,30,FOLLOW_26); 

                    				newLeafNode(otherlv_9, grammarAccess.getTypeAccess().getSequenceKeyword_2_1());
                    			
                    otherlv_10=(Token)match(input,31,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getTypeAccess().getLessThanSignKeyword_2_2());
                    			
                    // InternalSimpleIDL.g:893:4: ( (lv_type_11_0= ruleSimpleTypeSpec ) )
                    // InternalSimpleIDL.g:894:5: (lv_type_11_0= ruleSimpleTypeSpec )
                    {
                    // InternalSimpleIDL.g:894:5: (lv_type_11_0= ruleSimpleTypeSpec )
                    // InternalSimpleIDL.g:895:6: lv_type_11_0= ruleSimpleTypeSpec
                    {

                    						newCompositeNode(grammarAccess.getTypeAccess().getTypeSimpleTypeSpecParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_type_11_0=ruleSimpleTypeSpec();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypeRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_11_0,
                    							"org.osate.simpleidl.SimpleIDL.SimpleTypeSpec");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getTypeAccess().getGreaterThanSignKeyword_2_4());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSimpleIDL.g:918:3: ( () otherlv_14= 'string' otherlv_15= '<' ( (lv_size_16_0= RULE_INT ) ) otherlv_17= '>' )
                    {
                    // InternalSimpleIDL.g:918:3: ( () otherlv_14= 'string' otherlv_15= '<' ( (lv_size_16_0= RULE_INT ) ) otherlv_17= '>' )
                    // InternalSimpleIDL.g:919:4: () otherlv_14= 'string' otherlv_15= '<' ( (lv_size_16_0= RULE_INT ) ) otherlv_17= '>'
                    {
                    // InternalSimpleIDL.g:919:4: ()
                    // InternalSimpleIDL.g:920:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getBoundedStringAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_14=(Token)match(input,33,FOLLOW_26); 

                    				newLeafNode(otherlv_14, grammarAccess.getTypeAccess().getStringKeyword_3_1());
                    			
                    otherlv_15=(Token)match(input,31,FOLLOW_21); 

                    				newLeafNode(otherlv_15, grammarAccess.getTypeAccess().getLessThanSignKeyword_3_2());
                    			
                    // InternalSimpleIDL.g:934:4: ( (lv_size_16_0= RULE_INT ) )
                    // InternalSimpleIDL.g:935:5: (lv_size_16_0= RULE_INT )
                    {
                    // InternalSimpleIDL.g:935:5: (lv_size_16_0= RULE_INT )
                    // InternalSimpleIDL.g:936:6: lv_size_16_0= RULE_INT
                    {
                    lv_size_16_0=(Token)match(input,RULE_INT,FOLLOW_28); 

                    						newLeafNode(lv_size_16_0, grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_3_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"size",
                    							lv_size_16_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getTypeAccess().getGreaterThanSignKeyword_3_4());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSimpleIDL.g:958:3: ( () otherlv_19= 'string' )
                    {
                    // InternalSimpleIDL.g:958:3: ( () otherlv_19= 'string' )
                    // InternalSimpleIDL.g:959:4: () otherlv_19= 'string'
                    {
                    // InternalSimpleIDL.g:959:4: ()
                    // InternalSimpleIDL.g:960:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getUnboundedStringAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_19=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_19, grammarAccess.getTypeAccess().getStringKeyword_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSimpleIDL.g:972:3: ( () otherlv_21= 'wstring' otherlv_22= '<' ( (lv_size_23_0= RULE_INT ) ) otherlv_24= '>' )
                    {
                    // InternalSimpleIDL.g:972:3: ( () otherlv_21= 'wstring' otherlv_22= '<' ( (lv_size_23_0= RULE_INT ) ) otherlv_24= '>' )
                    // InternalSimpleIDL.g:973:4: () otherlv_21= 'wstring' otherlv_22= '<' ( (lv_size_23_0= RULE_INT ) ) otherlv_24= '>'
                    {
                    // InternalSimpleIDL.g:973:4: ()
                    // InternalSimpleIDL.g:974:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getBoundedWideStringAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_21=(Token)match(input,34,FOLLOW_26); 

                    				newLeafNode(otherlv_21, grammarAccess.getTypeAccess().getWstringKeyword_5_1());
                    			
                    otherlv_22=(Token)match(input,31,FOLLOW_21); 

                    				newLeafNode(otherlv_22, grammarAccess.getTypeAccess().getLessThanSignKeyword_5_2());
                    			
                    // InternalSimpleIDL.g:988:4: ( (lv_size_23_0= RULE_INT ) )
                    // InternalSimpleIDL.g:989:5: (lv_size_23_0= RULE_INT )
                    {
                    // InternalSimpleIDL.g:989:5: (lv_size_23_0= RULE_INT )
                    // InternalSimpleIDL.g:990:6: lv_size_23_0= RULE_INT
                    {
                    lv_size_23_0=(Token)match(input,RULE_INT,FOLLOW_28); 

                    						newLeafNode(lv_size_23_0, grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_5_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"size",
                    							lv_size_23_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_24=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_24, grammarAccess.getTypeAccess().getGreaterThanSignKeyword_5_4());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSimpleIDL.g:1012:3: ( () otherlv_26= 'wstring' )
                    {
                    // InternalSimpleIDL.g:1012:3: ( () otherlv_26= 'wstring' )
                    // InternalSimpleIDL.g:1013:4: () otherlv_26= 'wstring'
                    {
                    // InternalSimpleIDL.g:1013:4: ()
                    // InternalSimpleIDL.g:1014:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getUnboundedWideStringAction_6_0(),
                    						current);
                    				

                    }

                    otherlv_26=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_26, grammarAccess.getTypeAccess().getWstringKeyword_6_1());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSimpleIDL.g:1026:3: ( () otherlv_28= 'fixed' otherlv_29= '<' ( (lv_totalDigits_30_0= RULE_INT ) ) otherlv_31= ',' ( (lv_fractionalDigits_32_0= RULE_INT ) ) otherlv_33= '>' )
                    {
                    // InternalSimpleIDL.g:1026:3: ( () otherlv_28= 'fixed' otherlv_29= '<' ( (lv_totalDigits_30_0= RULE_INT ) ) otherlv_31= ',' ( (lv_fractionalDigits_32_0= RULE_INT ) ) otherlv_33= '>' )
                    // InternalSimpleIDL.g:1027:4: () otherlv_28= 'fixed' otherlv_29= '<' ( (lv_totalDigits_30_0= RULE_INT ) ) otherlv_31= ',' ( (lv_fractionalDigits_32_0= RULE_INT ) ) otherlv_33= '>'
                    {
                    // InternalSimpleIDL.g:1027:4: ()
                    // InternalSimpleIDL.g:1028:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getFixedPtTypeAction_7_0(),
                    						current);
                    				

                    }

                    otherlv_28=(Token)match(input,35,FOLLOW_26); 

                    				newLeafNode(otherlv_28, grammarAccess.getTypeAccess().getFixedKeyword_7_1());
                    			
                    otherlv_29=(Token)match(input,31,FOLLOW_21); 

                    				newLeafNode(otherlv_29, grammarAccess.getTypeAccess().getLessThanSignKeyword_7_2());
                    			
                    // InternalSimpleIDL.g:1042:4: ( (lv_totalDigits_30_0= RULE_INT ) )
                    // InternalSimpleIDL.g:1043:5: (lv_totalDigits_30_0= RULE_INT )
                    {
                    // InternalSimpleIDL.g:1043:5: (lv_totalDigits_30_0= RULE_INT )
                    // InternalSimpleIDL.g:1044:6: lv_totalDigits_30_0= RULE_INT
                    {
                    lv_totalDigits_30_0=(Token)match(input,RULE_INT,FOLLOW_27); 

                    						newLeafNode(lv_totalDigits_30_0, grammarAccess.getTypeAccess().getTotalDigitsINTTerminalRuleCall_7_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"totalDigits",
                    							lv_totalDigits_30_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_31=(Token)match(input,24,FOLLOW_21); 

                    				newLeafNode(otherlv_31, grammarAccess.getTypeAccess().getCommaKeyword_7_4());
                    			
                    // InternalSimpleIDL.g:1064:4: ( (lv_fractionalDigits_32_0= RULE_INT ) )
                    // InternalSimpleIDL.g:1065:5: (lv_fractionalDigits_32_0= RULE_INT )
                    {
                    // InternalSimpleIDL.g:1065:5: (lv_fractionalDigits_32_0= RULE_INT )
                    // InternalSimpleIDL.g:1066:6: lv_fractionalDigits_32_0= RULE_INT
                    {
                    lv_fractionalDigits_32_0=(Token)match(input,RULE_INT,FOLLOW_28); 

                    						newLeafNode(lv_fractionalDigits_32_0, grammarAccess.getTypeAccess().getFractionalDigitsINTTerminalRuleCall_7_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"fractionalDigits",
                    							lv_fractionalDigits_32_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_33=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_33, grammarAccess.getTypeAccess().getGreaterThanSignKeyword_7_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleSimpleTypeSpec"
    // InternalSimpleIDL.g:1091:1: entryRuleSimpleTypeSpec returns [EObject current=null] : iv_ruleSimpleTypeSpec= ruleSimpleTypeSpec EOF ;
    public final EObject entryRuleSimpleTypeSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleTypeSpec = null;


        try {
            // InternalSimpleIDL.g:1091:55: (iv_ruleSimpleTypeSpec= ruleSimpleTypeSpec EOF )
            // InternalSimpleIDL.g:1092:2: iv_ruleSimpleTypeSpec= ruleSimpleTypeSpec EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypeSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleTypeSpec=ruleSimpleTypeSpec();

            state._fsp--;

             current =iv_ruleSimpleTypeSpec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleTypeSpec"


    // $ANTLR start "ruleSimpleTypeSpec"
    // InternalSimpleIDL.g:1098:1: ruleSimpleTypeSpec returns [EObject current=null] : ( ( () otherlv_1= 'short' ) | ( () otherlv_3= 'long' ) | ( () otherlv_5= 'long' otherlv_6= 'long' ) | ( () otherlv_8= 'unsigned' otherlv_9= 'short' ) | ( () otherlv_11= 'unsigned' otherlv_12= 'long' ) | ( () otherlv_14= 'unsigned' otherlv_15= 'long' otherlv_16= 'long' ) | ( () otherlv_18= 'float' ) | ( () otherlv_20= 'double' ) | ( () otherlv_22= 'long' otherlv_23= 'double' ) | ( () otherlv_25= 'char' ) | ( () otherlv_27= 'wchar' ) | ( () otherlv_29= 'boolean' ) | ( () otherlv_31= 'octet' ) | ( () ( ( ruleScopedName ) ) ) ) ;
    public final EObject ruleSimpleTypeSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;


        	enterRule();

        try {
            // InternalSimpleIDL.g:1104:2: ( ( ( () otherlv_1= 'short' ) | ( () otherlv_3= 'long' ) | ( () otherlv_5= 'long' otherlv_6= 'long' ) | ( () otherlv_8= 'unsigned' otherlv_9= 'short' ) | ( () otherlv_11= 'unsigned' otherlv_12= 'long' ) | ( () otherlv_14= 'unsigned' otherlv_15= 'long' otherlv_16= 'long' ) | ( () otherlv_18= 'float' ) | ( () otherlv_20= 'double' ) | ( () otherlv_22= 'long' otherlv_23= 'double' ) | ( () otherlv_25= 'char' ) | ( () otherlv_27= 'wchar' ) | ( () otherlv_29= 'boolean' ) | ( () otherlv_31= 'octet' ) | ( () ( ( ruleScopedName ) ) ) ) )
            // InternalSimpleIDL.g:1105:2: ( ( () otherlv_1= 'short' ) | ( () otherlv_3= 'long' ) | ( () otherlv_5= 'long' otherlv_6= 'long' ) | ( () otherlv_8= 'unsigned' otherlv_9= 'short' ) | ( () otherlv_11= 'unsigned' otherlv_12= 'long' ) | ( () otherlv_14= 'unsigned' otherlv_15= 'long' otherlv_16= 'long' ) | ( () otherlv_18= 'float' ) | ( () otherlv_20= 'double' ) | ( () otherlv_22= 'long' otherlv_23= 'double' ) | ( () otherlv_25= 'char' ) | ( () otherlv_27= 'wchar' ) | ( () otherlv_29= 'boolean' ) | ( () otherlv_31= 'octet' ) | ( () ( ( ruleScopedName ) ) ) )
            {
            // InternalSimpleIDL.g:1105:2: ( ( () otherlv_1= 'short' ) | ( () otherlv_3= 'long' ) | ( () otherlv_5= 'long' otherlv_6= 'long' ) | ( () otherlv_8= 'unsigned' otherlv_9= 'short' ) | ( () otherlv_11= 'unsigned' otherlv_12= 'long' ) | ( () otherlv_14= 'unsigned' otherlv_15= 'long' otherlv_16= 'long' ) | ( () otherlv_18= 'float' ) | ( () otherlv_20= 'double' ) | ( () otherlv_22= 'long' otherlv_23= 'double' ) | ( () otherlv_25= 'char' ) | ( () otherlv_27= 'wchar' ) | ( () otherlv_29= 'boolean' ) | ( () otherlv_31= 'octet' ) | ( () ( ( ruleScopedName ) ) ) )
            int alt12=14;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalSimpleIDL.g:1106:3: ( () otherlv_1= 'short' )
                    {
                    // InternalSimpleIDL.g:1106:3: ( () otherlv_1= 'short' )
                    // InternalSimpleIDL.g:1107:4: () otherlv_1= 'short'
                    {
                    // InternalSimpleIDL.g:1107:4: ()
                    // InternalSimpleIDL.g:1108:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleTypeSpecAccess().getSignedShortIntAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getSimpleTypeSpecAccess().getShortKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleIDL.g:1120:3: ( () otherlv_3= 'long' )
                    {
                    // InternalSimpleIDL.g:1120:3: ( () otherlv_3= 'long' )
                    // InternalSimpleIDL.g:1121:4: () otherlv_3= 'long'
                    {
                    // InternalSimpleIDL.g:1121:4: ()
                    // InternalSimpleIDL.g:1122:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleTypeSpecAccess().getSignedLongIntAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleIDL.g:1134:3: ( () otherlv_5= 'long' otherlv_6= 'long' )
                    {
                    // InternalSimpleIDL.g:1134:3: ( () otherlv_5= 'long' otherlv_6= 'long' )
                    // InternalSimpleIDL.g:1135:4: () otherlv_5= 'long' otherlv_6= 'long'
                    {
                    // InternalSimpleIDL.g:1135:4: ()
                    // InternalSimpleIDL.g:1136:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleTypeSpecAccess().getSignedLongLongIntAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,36,FOLLOW_29); 

                    				newLeafNode(otherlv_5, grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_2_1());
                    			
                    otherlv_6=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_2_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSimpleIDL.g:1152:3: ( () otherlv_8= 'unsigned' otherlv_9= 'short' )
                    {
                    // InternalSimpleIDL.g:1152:3: ( () otherlv_8= 'unsigned' otherlv_9= 'short' )
                    // InternalSimpleIDL.g:1153:4: () otherlv_8= 'unsigned' otherlv_9= 'short'
                    {
                    // InternalSimpleIDL.g:1153:4: ()
                    // InternalSimpleIDL.g:1154:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleTypeSpecAccess().getUnsignedShortIntAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_8=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getSimpleTypeSpecAccess().getUnsignedKeyword_3_1());
                    			
                    otherlv_9=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getSimpleTypeSpecAccess().getShortKeyword_3_2());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSimpleIDL.g:1170:3: ( () otherlv_11= 'unsigned' otherlv_12= 'long' )
                    {
                    // InternalSimpleIDL.g:1170:3: ( () otherlv_11= 'unsigned' otherlv_12= 'long' )
                    // InternalSimpleIDL.g:1171:4: () otherlv_11= 'unsigned' otherlv_12= 'long'
                    {
                    // InternalSimpleIDL.g:1171:4: ()
                    // InternalSimpleIDL.g:1172:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleTypeSpecAccess().getUnsignedLongIntAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,20,FOLLOW_29); 

                    				newLeafNode(otherlv_11, grammarAccess.getSimpleTypeSpecAccess().getUnsignedKeyword_4_1());
                    			
                    otherlv_12=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_4_2());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSimpleIDL.g:1188:3: ( () otherlv_14= 'unsigned' otherlv_15= 'long' otherlv_16= 'long' )
                    {
                    // InternalSimpleIDL.g:1188:3: ( () otherlv_14= 'unsigned' otherlv_15= 'long' otherlv_16= 'long' )
                    // InternalSimpleIDL.g:1189:4: () otherlv_14= 'unsigned' otherlv_15= 'long' otherlv_16= 'long'
                    {
                    // InternalSimpleIDL.g:1189:4: ()
                    // InternalSimpleIDL.g:1190:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleTypeSpecAccess().getUnsignedLongLongIntAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_14=(Token)match(input,20,FOLLOW_29); 

                    				newLeafNode(otherlv_14, grammarAccess.getSimpleTypeSpecAccess().getUnsignedKeyword_5_1());
                    			
                    otherlv_15=(Token)match(input,36,FOLLOW_29); 

                    				newLeafNode(otherlv_15, grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_5_2());
                    			
                    otherlv_16=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_5_3());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSimpleIDL.g:1210:3: ( () otherlv_18= 'float' )
                    {
                    // InternalSimpleIDL.g:1210:3: ( () otherlv_18= 'float' )
                    // InternalSimpleIDL.g:1211:4: () otherlv_18= 'float'
                    {
                    // InternalSimpleIDL.g:1211:4: ()
                    // InternalSimpleIDL.g:1212:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleTypeSpecAccess().getFloatTypeAction_6_0(),
                    						current);
                    				

                    }

                    otherlv_18=(Token)match(input,37,FOLLOW_2); 

                    				newLeafNode(otherlv_18, grammarAccess.getSimpleTypeSpecAccess().getFloatKeyword_6_1());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSimpleIDL.g:1224:3: ( () otherlv_20= 'double' )
                    {
                    // InternalSimpleIDL.g:1224:3: ( () otherlv_20= 'double' )
                    // InternalSimpleIDL.g:1225:4: () otherlv_20= 'double'
                    {
                    // InternalSimpleIDL.g:1225:4: ()
                    // InternalSimpleIDL.g:1226:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleTypeSpecAccess().getDoubleTypeAction_7_0(),
                    						current);
                    				

                    }

                    otherlv_20=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_20, grammarAccess.getSimpleTypeSpecAccess().getDoubleKeyword_7_1());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalSimpleIDL.g:1238:3: ( () otherlv_22= 'long' otherlv_23= 'double' )
                    {
                    // InternalSimpleIDL.g:1238:3: ( () otherlv_22= 'long' otherlv_23= 'double' )
                    // InternalSimpleIDL.g:1239:4: () otherlv_22= 'long' otherlv_23= 'double'
                    {
                    // InternalSimpleIDL.g:1239:4: ()
                    // InternalSimpleIDL.g:1240:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleTypeSpecAccess().getLongDoubleTypeAction_8_0(),
                    						current);
                    				

                    }

                    otherlv_22=(Token)match(input,36,FOLLOW_30); 

                    				newLeafNode(otherlv_22, grammarAccess.getSimpleTypeSpecAccess().getLongKeyword_8_1());
                    			
                    otherlv_23=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_23, grammarAccess.getSimpleTypeSpecAccess().getDoubleKeyword_8_2());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalSimpleIDL.g:1256:3: ( () otherlv_25= 'char' )
                    {
                    // InternalSimpleIDL.g:1256:3: ( () otherlv_25= 'char' )
                    // InternalSimpleIDL.g:1257:4: () otherlv_25= 'char'
                    {
                    // InternalSimpleIDL.g:1257:4: ()
                    // InternalSimpleIDL.g:1258:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleTypeSpecAccess().getCharTypeAction_9_0(),
                    						current);
                    				

                    }

                    otherlv_25=(Token)match(input,39,FOLLOW_2); 

                    				newLeafNode(otherlv_25, grammarAccess.getSimpleTypeSpecAccess().getCharKeyword_9_1());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalSimpleIDL.g:1270:3: ( () otherlv_27= 'wchar' )
                    {
                    // InternalSimpleIDL.g:1270:3: ( () otherlv_27= 'wchar' )
                    // InternalSimpleIDL.g:1271:4: () otherlv_27= 'wchar'
                    {
                    // InternalSimpleIDL.g:1271:4: ()
                    // InternalSimpleIDL.g:1272:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleTypeSpecAccess().getWideCharTypeAction_10_0(),
                    						current);
                    				

                    }

                    otherlv_27=(Token)match(input,40,FOLLOW_2); 

                    				newLeafNode(otherlv_27, grammarAccess.getSimpleTypeSpecAccess().getWcharKeyword_10_1());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalSimpleIDL.g:1284:3: ( () otherlv_29= 'boolean' )
                    {
                    // InternalSimpleIDL.g:1284:3: ( () otherlv_29= 'boolean' )
                    // InternalSimpleIDL.g:1285:4: () otherlv_29= 'boolean'
                    {
                    // InternalSimpleIDL.g:1285:4: ()
                    // InternalSimpleIDL.g:1286:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleTypeSpecAccess().getBooleanTypeAction_11_0(),
                    						current);
                    				

                    }

                    otherlv_29=(Token)match(input,41,FOLLOW_2); 

                    				newLeafNode(otherlv_29, grammarAccess.getSimpleTypeSpecAccess().getBooleanKeyword_11_1());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalSimpleIDL.g:1298:3: ( () otherlv_31= 'octet' )
                    {
                    // InternalSimpleIDL.g:1298:3: ( () otherlv_31= 'octet' )
                    // InternalSimpleIDL.g:1299:4: () otherlv_31= 'octet'
                    {
                    // InternalSimpleIDL.g:1299:4: ()
                    // InternalSimpleIDL.g:1300:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleTypeSpecAccess().getOctetTypeAction_12_0(),
                    						current);
                    				

                    }

                    otherlv_31=(Token)match(input,42,FOLLOW_2); 

                    				newLeafNode(otherlv_31, grammarAccess.getSimpleTypeSpecAccess().getOctetKeyword_12_1());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalSimpleIDL.g:1312:3: ( () ( ( ruleScopedName ) ) )
                    {
                    // InternalSimpleIDL.g:1312:3: ( () ( ( ruleScopedName ) ) )
                    // InternalSimpleIDL.g:1313:4: () ( ( ruleScopedName ) )
                    {
                    // InternalSimpleIDL.g:1313:4: ()
                    // InternalSimpleIDL.g:1314:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleTypeSpecAccess().getReferencedTypeAction_13_0(),
                    						current);
                    				

                    }

                    // InternalSimpleIDL.g:1320:4: ( ( ruleScopedName ) )
                    // InternalSimpleIDL.g:1321:5: ( ruleScopedName )
                    {
                    // InternalSimpleIDL.g:1321:5: ( ruleScopedName )
                    // InternalSimpleIDL.g:1322:6: ruleScopedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleTypeSpecRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSimpleTypeSpecAccess().getTypeDefinitionCrossReference_13_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleScopedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleTypeSpec"


    // $ANTLR start "entryRuleScopedName"
    // InternalSimpleIDL.g:1341:1: entryRuleScopedName returns [String current=null] : iv_ruleScopedName= ruleScopedName EOF ;
    public final String entryRuleScopedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleScopedName = null;


        try {
            // InternalSimpleIDL.g:1341:50: (iv_ruleScopedName= ruleScopedName EOF )
            // InternalSimpleIDL.g:1342:2: iv_ruleScopedName= ruleScopedName EOF
            {
             newCompositeNode(grammarAccess.getScopedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScopedName=ruleScopedName();

            state._fsp--;

             current =iv_ruleScopedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScopedName"


    // $ANTLR start "ruleScopedName"
    // InternalSimpleIDL.g:1348:1: ruleScopedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '::' )? (this_ID_1= RULE_ID kw= '::' )* this_ID_3= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleScopedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_3=null;


        	enterRule();

        try {
            // InternalSimpleIDL.g:1354:2: ( ( (kw= '::' )? (this_ID_1= RULE_ID kw= '::' )* this_ID_3= RULE_ID ) )
            // InternalSimpleIDL.g:1355:2: ( (kw= '::' )? (this_ID_1= RULE_ID kw= '::' )* this_ID_3= RULE_ID )
            {
            // InternalSimpleIDL.g:1355:2: ( (kw= '::' )? (this_ID_1= RULE_ID kw= '::' )* this_ID_3= RULE_ID )
            // InternalSimpleIDL.g:1356:3: (kw= '::' )? (this_ID_1= RULE_ID kw= '::' )* this_ID_3= RULE_ID
            {
            // InternalSimpleIDL.g:1356:3: (kw= '::' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==43) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSimpleIDL.g:1357:4: kw= '::'
                    {
                    kw=(Token)match(input,43,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getScopedNameAccess().getColonColonKeyword_0());
                    			

                    }
                    break;

            }

            // InternalSimpleIDL.g:1363:3: (this_ID_1= RULE_ID kw= '::' )*
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
            	    // InternalSimpleIDL.g:1364:4: this_ID_1= RULE_ID kw= '::'
            	    {
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_31); 

            	    				current.merge(this_ID_1);
            	    			

            	    				newLeafNode(this_ID_1, grammarAccess.getScopedNameAccess().getIDTerminalRuleCall_1_0());
            	    			
            	    kw=(Token)match(input,43,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getScopedNameAccess().getColonColonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            this_ID_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            			current.merge(this_ID_3);
            		

            			newLeafNode(this_ID_3, grammarAccess.getScopedNameAccess().getIDTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScopedName"

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String dfa_1s = "\36\uffff";
    static final String dfa_2s = "\3\uffff\1\10\1\12\31\uffff";
    static final String dfa_3s = "\1\4\1\uffff\1\37\2\4\1\uffff\1\4\4\uffff\2\30\1\25\6\30\1\4\1\30\2\uffff\4\30\1\4\1\30";
    static final String dfa_4s = "\1\53\1\uffff\3\37\1\uffff\1\53\4\uffff\1\40\1\46\1\44\6\40\1\4\1\53\2\uffff\3\40\1\44\1\4\1\40";
    static final String dfa_5s = "\1\uffff\1\1\3\uffff\1\10\1\uffff\1\4\1\5\1\6\1\7\13\uffff\1\3\1\2\6\uffff";
    static final String dfa_6s = "\36\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\17\uffff\2\1\10\uffff\1\2\2\uffff\1\3\1\4\1\5\10\1",
            "",
            "\1\6",
            "\1\10\32\uffff\1\7",
            "\1\12\32\uffff\1\11",
            "",
            "\1\25\17\uffff\1\15\1\13\16\uffff\1\14\1\16\1\17\1\20\1\21\1\22\1\23\1\24",
            "",
            "",
            "",
            "",
            "\1\27\7\uffff\1\26",
            "\1\27\7\uffff\1\26\3\uffff\1\31\1\uffff\1\30",
            "\1\32\16\uffff\1\33",
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
            "\1\27\7\uffff\1\26",
            "\1\27\7\uffff\1\26\3\uffff\1\35",
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

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "804:2: (this_SimpleTypeSpec_0= ruleSimpleTypeSpec | ( () otherlv_2= 'sequence' otherlv_3= '<' ( (lv_type_4_0= ruleSimpleTypeSpec ) ) otherlv_5= ',' ( (lv_size_6_0= RULE_INT ) ) otherlv_7= '>' ) | ( () otherlv_9= 'sequence' otherlv_10= '<' ( (lv_type_11_0= ruleSimpleTypeSpec ) ) otherlv_12= '>' ) | ( () otherlv_14= 'string' otherlv_15= '<' ( (lv_size_16_0= RULE_INT ) ) otherlv_17= '>' ) | ( () otherlv_19= 'string' ) | ( () otherlv_21= 'wstring' otherlv_22= '<' ( (lv_size_23_0= RULE_INT ) ) otherlv_24= '>' ) | ( () otherlv_26= 'wstring' ) | ( () otherlv_28= 'fixed' otherlv_29= '<' ( (lv_totalDigits_30_0= RULE_INT ) ) otherlv_31= ',' ( (lv_fractionalDigits_32_0= RULE_INT ) ) otherlv_33= '>' ) )";
        }
    }
    static final String dfa_8s = "\22\uffff";
    static final String dfa_9s = "\2\uffff\1\15\13\uffff\1\21\3\uffff";
    static final String dfa_10s = "\1\4\1\uffff\1\4\1\25\12\uffff\1\4\3\uffff";
    static final String dfa_11s = "\1\53\1\uffff\1\46\1\44\12\uffff\1\44\3\uffff";
    static final String dfa_12s = "\1\uffff\1\1\2\uffff\1\7\1\10\1\12\1\13\1\14\1\15\1\16\1\11\1\3\1\2\1\uffff\1\4\1\6\1\5";
    static final String dfa_13s = "\22\uffff}>";
    static final String[] dfa_14s = {
            "\1\12\17\uffff\1\3\1\1\16\uffff\1\2\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "",
            "\1\15\23\uffff\1\15\7\uffff\1\15\3\uffff\1\14\1\uffff\1\13",
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

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "1105:2: ( ( () otherlv_1= 'short' ) | ( () otherlv_3= 'long' ) | ( () otherlv_5= 'long' otherlv_6= 'long' ) | ( () otherlv_8= 'unsigned' otherlv_9= 'short' ) | ( () otherlv_11= 'unsigned' otherlv_12= 'long' ) | ( () otherlv_14= 'unsigned' otherlv_15= 'long' otherlv_16= 'long' ) | ( () otherlv_18= 'float' ) | ( () otherlv_20= 'double' ) | ( () otherlv_22= 'long' otherlv_23= 'double' ) | ( () otherlv_25= 'char' ) | ( () otherlv_27= 'wchar' ) | ( () otherlv_29= 'boolean' ) | ( () otherlv_31= 'octet' ) | ( () ( ( ruleScopedName ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002831002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002835000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000FF000300010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000FF000304010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000FFE40300010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000FF004300010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000000L});

}