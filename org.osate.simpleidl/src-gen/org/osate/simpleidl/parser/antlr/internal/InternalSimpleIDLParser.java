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
    // InternalSimpleIDL.g:123:1: ruleDefinition returns [EObject current=null] : ( ( () otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_definitions_4_0= ruleDefinition ) )+ otherlv_5= '}' otherlv_6= ';' ) | ( () otherlv_8= 'struct' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )+ otherlv_12= '}' otherlv_13= ';' ) | ( () otherlv_15= 'struct' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';' ) | ( () otherlv_19= 'union' ( (lv_name_20_0= RULE_ID ) ) otherlv_21= '{' otherlv_22= 'switch' otherlv_23= '(' otherlv_24= 'unsigned' otherlv_25= 'short' otherlv_26= ')' otherlv_27= '{' ( (lv_cases_28_0= ruleCase ) )+ otherlv_29= '}' otherlv_30= ';' otherlv_31= '}' otherlv_32= ';' ) | ( () otherlv_34= 'enum' ( (lv_name_35_0= RULE_ID ) ) otherlv_36= '{' ( (lv_literals_37_0= RULE_ID ) ) (otherlv_38= ',' ( (lv_literals_39_0= RULE_ID ) ) )* otherlv_40= '}' otherlv_41= ';' ) | ( () otherlv_43= 'typedef' ( (lv_type_44_0= ruleType ) ) ( (lv_name_45_0= RULE_ID ) ) otherlv_46= ';' ) | ( () otherlv_48= 'typedef' ( ( ruleScopedName ) ) ( (lv_name_50_0= RULE_ID ) ) otherlv_51= '[' ( (lv_size_52_0= RULE_INT ) ) otherlv_53= ']' otherlv_54= ';' ) ) ;
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
        Token lv_name_45_0=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        Token lv_name_50_0=null;
        Token otherlv_51=null;
        Token lv_size_52_0=null;
        Token otherlv_53=null;
        Token otherlv_54=null;
        EObject lv_definitions_4_0 = null;

        EObject lv_members_11_0 = null;

        EObject lv_cases_28_0 = null;

        EObject lv_type_44_0 = null;



        	enterRule();

        try {
            // InternalSimpleIDL.g:129:2: ( ( ( () otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_definitions_4_0= ruleDefinition ) )+ otherlv_5= '}' otherlv_6= ';' ) | ( () otherlv_8= 'struct' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )+ otherlv_12= '}' otherlv_13= ';' ) | ( () otherlv_15= 'struct' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';' ) | ( () otherlv_19= 'union' ( (lv_name_20_0= RULE_ID ) ) otherlv_21= '{' otherlv_22= 'switch' otherlv_23= '(' otherlv_24= 'unsigned' otherlv_25= 'short' otherlv_26= ')' otherlv_27= '{' ( (lv_cases_28_0= ruleCase ) )+ otherlv_29= '}' otherlv_30= ';' otherlv_31= '}' otherlv_32= ';' ) | ( () otherlv_34= 'enum' ( (lv_name_35_0= RULE_ID ) ) otherlv_36= '{' ( (lv_literals_37_0= RULE_ID ) ) (otherlv_38= ',' ( (lv_literals_39_0= RULE_ID ) ) )* otherlv_40= '}' otherlv_41= ';' ) | ( () otherlv_43= 'typedef' ( (lv_type_44_0= ruleType ) ) ( (lv_name_45_0= RULE_ID ) ) otherlv_46= ';' ) | ( () otherlv_48= 'typedef' ( ( ruleScopedName ) ) ( (lv_name_50_0= RULE_ID ) ) otherlv_51= '[' ( (lv_size_52_0= RULE_INT ) ) otherlv_53= ']' otherlv_54= ';' ) ) )
            // InternalSimpleIDL.g:130:2: ( ( () otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_definitions_4_0= ruleDefinition ) )+ otherlv_5= '}' otherlv_6= ';' ) | ( () otherlv_8= 'struct' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )+ otherlv_12= '}' otherlv_13= ';' ) | ( () otherlv_15= 'struct' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';' ) | ( () otherlv_19= 'union' ( (lv_name_20_0= RULE_ID ) ) otherlv_21= '{' otherlv_22= 'switch' otherlv_23= '(' otherlv_24= 'unsigned' otherlv_25= 'short' otherlv_26= ')' otherlv_27= '{' ( (lv_cases_28_0= ruleCase ) )+ otherlv_29= '}' otherlv_30= ';' otherlv_31= '}' otherlv_32= ';' ) | ( () otherlv_34= 'enum' ( (lv_name_35_0= RULE_ID ) ) otherlv_36= '{' ( (lv_literals_37_0= RULE_ID ) ) (otherlv_38= ',' ( (lv_literals_39_0= RULE_ID ) ) )* otherlv_40= '}' otherlv_41= ';' ) | ( () otherlv_43= 'typedef' ( (lv_type_44_0= ruleType ) ) ( (lv_name_45_0= RULE_ID ) ) otherlv_46= ';' ) | ( () otherlv_48= 'typedef' ( ( ruleScopedName ) ) ( (lv_name_50_0= RULE_ID ) ) otherlv_51= '[' ( (lv_size_52_0= RULE_INT ) ) otherlv_53= ']' otherlv_54= ';' ) )
            {
            // InternalSimpleIDL.g:130:2: ( ( () otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_definitions_4_0= ruleDefinition ) )+ otherlv_5= '}' otherlv_6= ';' ) | ( () otherlv_8= 'struct' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )+ otherlv_12= '}' otherlv_13= ';' ) | ( () otherlv_15= 'struct' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';' ) | ( () otherlv_19= 'union' ( (lv_name_20_0= RULE_ID ) ) otherlv_21= '{' otherlv_22= 'switch' otherlv_23= '(' otherlv_24= 'unsigned' otherlv_25= 'short' otherlv_26= ')' otherlv_27= '{' ( (lv_cases_28_0= ruleCase ) )+ otherlv_29= '}' otherlv_30= ';' otherlv_31= '}' otherlv_32= ';' ) | ( () otherlv_34= 'enum' ( (lv_name_35_0= RULE_ID ) ) otherlv_36= '{' ( (lv_literals_37_0= RULE_ID ) ) (otherlv_38= ',' ( (lv_literals_39_0= RULE_ID ) ) )* otherlv_40= '}' otherlv_41= ';' ) | ( () otherlv_43= 'typedef' ( (lv_type_44_0= ruleType ) ) ( (lv_name_45_0= RULE_ID ) ) otherlv_46= ';' ) | ( () otherlv_48= 'typedef' ( ( ruleScopedName ) ) ( (lv_name_50_0= RULE_ID ) ) otherlv_51= '[' ( (lv_size_52_0= RULE_INT ) ) otherlv_53= ']' otherlv_54= ';' ) )
            int alt6=7;
            alt6 = dfa6.predict(input);
            switch (alt6) {
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

                        if ( (LA3_0==RULE_ID||LA3_0==43) ) {
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

                        if ( (LA4_0==28) ) {
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
                    // InternalSimpleIDL.g:469:3: ( () otherlv_43= 'typedef' ( (lv_type_44_0= ruleType ) ) ( (lv_name_45_0= RULE_ID ) ) otherlv_46= ';' )
                    {
                    // InternalSimpleIDL.g:469:3: ( () otherlv_43= 'typedef' ( (lv_type_44_0= ruleType ) ) ( (lv_name_45_0= RULE_ID ) ) otherlv_46= ';' )
                    // InternalSimpleIDL.g:470:4: () otherlv_43= 'typedef' ( (lv_type_44_0= ruleType ) ) ( (lv_name_45_0= RULE_ID ) ) otherlv_46= ';'
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

                    // InternalSimpleIDL.g:500:4: ( (lv_name_45_0= RULE_ID ) )
                    // InternalSimpleIDL.g:501:5: (lv_name_45_0= RULE_ID )
                    {
                    // InternalSimpleIDL.g:501:5: (lv_name_45_0= RULE_ID )
                    // InternalSimpleIDL.g:502:6: lv_name_45_0= RULE_ID
                    {
                    lv_name_45_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_name_45_0, grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_5_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_45_0,
                    							"org.osate.simpleidl.SimpleIDL.ID");
                    					

                    }


                    }

                    otherlv_46=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_46, grammarAccess.getDefinitionAccess().getSemicolonKeyword_5_4());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSimpleIDL.g:524:3: ( () otherlv_48= 'typedef' ( ( ruleScopedName ) ) ( (lv_name_50_0= RULE_ID ) ) otherlv_51= '[' ( (lv_size_52_0= RULE_INT ) ) otherlv_53= ']' otherlv_54= ';' )
                    {
                    // InternalSimpleIDL.g:524:3: ( () otherlv_48= 'typedef' ( ( ruleScopedName ) ) ( (lv_name_50_0= RULE_ID ) ) otherlv_51= '[' ( (lv_size_52_0= RULE_INT ) ) otherlv_53= ']' otherlv_54= ';' )
                    // InternalSimpleIDL.g:525:4: () otherlv_48= 'typedef' ( ( ruleScopedName ) ) ( (lv_name_50_0= RULE_ID ) ) otherlv_51= '[' ( (lv_size_52_0= RULE_INT ) ) otherlv_53= ']' otherlv_54= ';'
                    {
                    // InternalSimpleIDL.g:525:4: ()
                    // InternalSimpleIDL.g:526:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDefinitionAccess().getArrayTypeAction_6_0(),
                    						current);
                    				

                    }

                    otherlv_48=(Token)match(input,25,FOLLOW_8); 

                    				newLeafNode(otherlv_48, grammarAccess.getDefinitionAccess().getTypedefKeyword_6_1());
                    			
                    // InternalSimpleIDL.g:536:4: ( ( ruleScopedName ) )
                    // InternalSimpleIDL.g:537:5: ( ruleScopedName )
                    {
                    // InternalSimpleIDL.g:537:5: ( ruleScopedName )
                    // InternalSimpleIDL.g:538:6: ruleScopedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDefinitionAccess().getTypeDefinitionCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_4);
                    ruleScopedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSimpleIDL.g:552:4: ( (lv_name_50_0= RULE_ID ) )
                    // InternalSimpleIDL.g:553:5: (lv_name_50_0= RULE_ID )
                    {
                    // InternalSimpleIDL.g:553:5: (lv_name_50_0= RULE_ID )
                    // InternalSimpleIDL.g:554:6: lv_name_50_0= RULE_ID
                    {
                    lv_name_50_0=(Token)match(input,RULE_ID,FOLLOW_20); 

                    						newLeafNode(lv_name_50_0, grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_6_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_50_0,
                    							"org.osate.simpleidl.SimpleIDL.ID");
                    					

                    }


                    }

                    otherlv_51=(Token)match(input,26,FOLLOW_21); 

                    				newLeafNode(otherlv_51, grammarAccess.getDefinitionAccess().getLeftSquareBracketKeyword_6_4());
                    			
                    // InternalSimpleIDL.g:574:4: ( (lv_size_52_0= RULE_INT ) )
                    // InternalSimpleIDL.g:575:5: (lv_size_52_0= RULE_INT )
                    {
                    // InternalSimpleIDL.g:575:5: (lv_size_52_0= RULE_INT )
                    // InternalSimpleIDL.g:576:6: lv_size_52_0= RULE_INT
                    {
                    lv_size_52_0=(Token)match(input,RULE_INT,FOLLOW_22); 

                    						newLeafNode(lv_size_52_0, grammarAccess.getDefinitionAccess().getSizeINTTerminalRuleCall_6_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"size",
                    							lv_size_52_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_53=(Token)match(input,27,FOLLOW_7); 

                    				newLeafNode(otherlv_53, grammarAccess.getDefinitionAccess().getRightSquareBracketKeyword_6_6());
                    			
                    otherlv_54=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_54, grammarAccess.getDefinitionAccess().getSemicolonKeyword_6_7());
                    			

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
    // InternalSimpleIDL.g:605:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalSimpleIDL.g:605:47: (iv_ruleMember= ruleMember EOF )
            // InternalSimpleIDL.g:606:2: iv_ruleMember= ruleMember EOF
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
    // InternalSimpleIDL.g:612:1: ruleMember returns [EObject current=null] : ( ( ( ruleScopedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSimpleIDL.g:618:2: ( ( ( ( ruleScopedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalSimpleIDL.g:619:2: ( ( ( ruleScopedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalSimpleIDL.g:619:2: ( ( ( ruleScopedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalSimpleIDL.g:620:3: ( ( ruleScopedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // InternalSimpleIDL.g:620:3: ( ( ruleScopedName ) )
            // InternalSimpleIDL.g:621:4: ( ruleScopedName )
            {
            // InternalSimpleIDL.g:621:4: ( ruleScopedName )
            // InternalSimpleIDL.g:622:5: ruleScopedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemberRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMemberAccess().getTypeDefinitionCrossReference_0_0());
            				
            pushFollow(FOLLOW_4);
            ruleScopedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimpleIDL.g:636:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSimpleIDL.g:637:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSimpleIDL.g:637:4: (lv_name_1_0= RULE_ID )
            // InternalSimpleIDL.g:638:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.osate.simpleidl.SimpleIDL.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getMemberAccess().getSemicolonKeyword_2());
            		

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
    // InternalSimpleIDL.g:662:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // InternalSimpleIDL.g:662:45: (iv_ruleCase= ruleCase EOF )
            // InternalSimpleIDL.g:663:2: iv_ruleCase= ruleCase EOF
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
    // InternalSimpleIDL.g:669:1: ruleCase returns [EObject current=null] : ( (otherlv_0= 'case' ( (lv_labels_1_0= RULE_INT ) ) otherlv_2= ':' )+ ( ( ruleScopedName ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_labels_1_0=null;
        Token otherlv_2=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSimpleIDL.g:675:2: ( ( (otherlv_0= 'case' ( (lv_labels_1_0= RULE_INT ) ) otherlv_2= ':' )+ ( ( ruleScopedName ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) )
            // InternalSimpleIDL.g:676:2: ( (otherlv_0= 'case' ( (lv_labels_1_0= RULE_INT ) ) otherlv_2= ':' )+ ( ( ruleScopedName ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' )
            {
            // InternalSimpleIDL.g:676:2: ( (otherlv_0= 'case' ( (lv_labels_1_0= RULE_INT ) ) otherlv_2= ':' )+ ( ( ruleScopedName ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' )
            // InternalSimpleIDL.g:677:3: (otherlv_0= 'case' ( (lv_labels_1_0= RULE_INT ) ) otherlv_2= ':' )+ ( ( ruleScopedName ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';'
            {
            // InternalSimpleIDL.g:677:3: (otherlv_0= 'case' ( (lv_labels_1_0= RULE_INT ) ) otherlv_2= ':' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==28) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSimpleIDL.g:678:4: otherlv_0= 'case' ( (lv_labels_1_0= RULE_INT ) ) otherlv_2= ':'
            	    {
            	    otherlv_0=(Token)match(input,28,FOLLOW_21); 

            	    				newLeafNode(otherlv_0, grammarAccess.getCaseAccess().getCaseKeyword_0_0());
            	    			
            	    // InternalSimpleIDL.g:682:4: ( (lv_labels_1_0= RULE_INT ) )
            	    // InternalSimpleIDL.g:683:5: (lv_labels_1_0= RULE_INT )
            	    {
            	    // InternalSimpleIDL.g:683:5: (lv_labels_1_0= RULE_INT )
            	    // InternalSimpleIDL.g:684:6: lv_labels_1_0= RULE_INT
            	    {
            	    lv_labels_1_0=(Token)match(input,RULE_INT,FOLLOW_23); 

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

            	    otherlv_2=(Token)match(input,29,FOLLOW_24); 

            	    				newLeafNode(otherlv_2, grammarAccess.getCaseAccess().getColonKeyword_0_2());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            // InternalSimpleIDL.g:705:3: ( ( ruleScopedName ) )
            // InternalSimpleIDL.g:706:4: ( ruleScopedName )
            {
            // InternalSimpleIDL.g:706:4: ( ruleScopedName )
            // InternalSimpleIDL.g:707:5: ruleScopedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCaseRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCaseAccess().getTypeDefinitionCrossReference_1_0());
            				
            pushFollow(FOLLOW_4);
            ruleScopedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimpleIDL.g:721:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalSimpleIDL.g:722:4: (lv_name_4_0= RULE_ID )
            {
            // InternalSimpleIDL.g:722:4: (lv_name_4_0= RULE_ID )
            // InternalSimpleIDL.g:723:5: lv_name_4_0= RULE_ID
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


    // $ANTLR start "entryRuleType"
    // InternalSimpleIDL.g:747:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSimpleIDL.g:747:45: (iv_ruleType= ruleType EOF )
            // InternalSimpleIDL.g:748:2: iv_ruleType= ruleType EOF
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
    // InternalSimpleIDL.g:754:1: ruleType returns [EObject current=null] : ( ( () otherlv_1= 'short' ) | ( () otherlv_3= 'long' ) | ( () otherlv_5= 'long' otherlv_6= 'long' ) | ( () otherlv_8= 'unsigned' otherlv_9= 'short' ) | ( () otherlv_11= 'unsigned' otherlv_12= 'long' ) | ( () otherlv_14= 'unsigned' otherlv_15= 'long' otherlv_16= 'long' ) | ( () otherlv_18= 'float' ) | ( () otherlv_20= 'double' ) | ( () otherlv_22= 'long' otherlv_23= 'double' ) | ( () otherlv_25= 'char' ) | ( () otherlv_27= 'wchar' ) | ( () otherlv_29= 'boolean' ) | ( () otherlv_31= 'octet' ) | ( () ( ( ruleScopedName ) ) ) | ( () otherlv_35= 'sequence' otherlv_36= '<' ( ( ruleScopedName ) ) otherlv_38= ',' ( (lv_size_39_0= RULE_INT ) ) otherlv_40= '>' ) | ( () otherlv_42= 'sequence' otherlv_43= '<' ( ( ruleScopedName ) ) otherlv_45= '>' ) | ( () otherlv_47= 'string' otherlv_48= '<' ( (lv_size_49_0= RULE_INT ) ) otherlv_50= '>' ) | ( () otherlv_52= 'string' ) | ( () otherlv_54= 'wstring' otherlv_55= '<' ( (lv_size_56_0= RULE_INT ) ) otherlv_57= '>' ) | ( () otherlv_59= 'wstring' ) | ( () otherlv_61= 'fixed' otherlv_62= '<' ( (lv_totalDigits_63_0= RULE_INT ) ) otherlv_64= ',' ( (lv_fractionalDigits_65_0= RULE_INT ) ) otherlv_66= '>' ) ) ;
    public final EObject ruleType() throws RecognitionException {
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
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token lv_size_39_0=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token lv_size_49_0=null;
        Token otherlv_50=null;
        Token otherlv_52=null;
        Token otherlv_54=null;
        Token otherlv_55=null;
        Token lv_size_56_0=null;
        Token otherlv_57=null;
        Token otherlv_59=null;
        Token otherlv_61=null;
        Token otherlv_62=null;
        Token lv_totalDigits_63_0=null;
        Token otherlv_64=null;
        Token lv_fractionalDigits_65_0=null;
        Token otherlv_66=null;


        	enterRule();

        try {
            // InternalSimpleIDL.g:760:2: ( ( ( () otherlv_1= 'short' ) | ( () otherlv_3= 'long' ) | ( () otherlv_5= 'long' otherlv_6= 'long' ) | ( () otherlv_8= 'unsigned' otherlv_9= 'short' ) | ( () otherlv_11= 'unsigned' otherlv_12= 'long' ) | ( () otherlv_14= 'unsigned' otherlv_15= 'long' otherlv_16= 'long' ) | ( () otherlv_18= 'float' ) | ( () otherlv_20= 'double' ) | ( () otherlv_22= 'long' otherlv_23= 'double' ) | ( () otherlv_25= 'char' ) | ( () otherlv_27= 'wchar' ) | ( () otherlv_29= 'boolean' ) | ( () otherlv_31= 'octet' ) | ( () ( ( ruleScopedName ) ) ) | ( () otherlv_35= 'sequence' otherlv_36= '<' ( ( ruleScopedName ) ) otherlv_38= ',' ( (lv_size_39_0= RULE_INT ) ) otherlv_40= '>' ) | ( () otherlv_42= 'sequence' otherlv_43= '<' ( ( ruleScopedName ) ) otherlv_45= '>' ) | ( () otherlv_47= 'string' otherlv_48= '<' ( (lv_size_49_0= RULE_INT ) ) otherlv_50= '>' ) | ( () otherlv_52= 'string' ) | ( () otherlv_54= 'wstring' otherlv_55= '<' ( (lv_size_56_0= RULE_INT ) ) otherlv_57= '>' ) | ( () otherlv_59= 'wstring' ) | ( () otherlv_61= 'fixed' otherlv_62= '<' ( (lv_totalDigits_63_0= RULE_INT ) ) otherlv_64= ',' ( (lv_fractionalDigits_65_0= RULE_INT ) ) otherlv_66= '>' ) ) )
            // InternalSimpleIDL.g:761:2: ( ( () otherlv_1= 'short' ) | ( () otherlv_3= 'long' ) | ( () otherlv_5= 'long' otherlv_6= 'long' ) | ( () otherlv_8= 'unsigned' otherlv_9= 'short' ) | ( () otherlv_11= 'unsigned' otherlv_12= 'long' ) | ( () otherlv_14= 'unsigned' otherlv_15= 'long' otherlv_16= 'long' ) | ( () otherlv_18= 'float' ) | ( () otherlv_20= 'double' ) | ( () otherlv_22= 'long' otherlv_23= 'double' ) | ( () otherlv_25= 'char' ) | ( () otherlv_27= 'wchar' ) | ( () otherlv_29= 'boolean' ) | ( () otherlv_31= 'octet' ) | ( () ( ( ruleScopedName ) ) ) | ( () otherlv_35= 'sequence' otherlv_36= '<' ( ( ruleScopedName ) ) otherlv_38= ',' ( (lv_size_39_0= RULE_INT ) ) otherlv_40= '>' ) | ( () otherlv_42= 'sequence' otherlv_43= '<' ( ( ruleScopedName ) ) otherlv_45= '>' ) | ( () otherlv_47= 'string' otherlv_48= '<' ( (lv_size_49_0= RULE_INT ) ) otherlv_50= '>' ) | ( () otherlv_52= 'string' ) | ( () otherlv_54= 'wstring' otherlv_55= '<' ( (lv_size_56_0= RULE_INT ) ) otherlv_57= '>' ) | ( () otherlv_59= 'wstring' ) | ( () otherlv_61= 'fixed' otherlv_62= '<' ( (lv_totalDigits_63_0= RULE_INT ) ) otherlv_64= ',' ( (lv_fractionalDigits_65_0= RULE_INT ) ) otherlv_66= '>' ) )
            {
            // InternalSimpleIDL.g:761:2: ( ( () otherlv_1= 'short' ) | ( () otherlv_3= 'long' ) | ( () otherlv_5= 'long' otherlv_6= 'long' ) | ( () otherlv_8= 'unsigned' otherlv_9= 'short' ) | ( () otherlv_11= 'unsigned' otherlv_12= 'long' ) | ( () otherlv_14= 'unsigned' otherlv_15= 'long' otherlv_16= 'long' ) | ( () otherlv_18= 'float' ) | ( () otherlv_20= 'double' ) | ( () otherlv_22= 'long' otherlv_23= 'double' ) | ( () otherlv_25= 'char' ) | ( () otherlv_27= 'wchar' ) | ( () otherlv_29= 'boolean' ) | ( () otherlv_31= 'octet' ) | ( () ( ( ruleScopedName ) ) ) | ( () otherlv_35= 'sequence' otherlv_36= '<' ( ( ruleScopedName ) ) otherlv_38= ',' ( (lv_size_39_0= RULE_INT ) ) otherlv_40= '>' ) | ( () otherlv_42= 'sequence' otherlv_43= '<' ( ( ruleScopedName ) ) otherlv_45= '>' ) | ( () otherlv_47= 'string' otherlv_48= '<' ( (lv_size_49_0= RULE_INT ) ) otherlv_50= '>' ) | ( () otherlv_52= 'string' ) | ( () otherlv_54= 'wstring' otherlv_55= '<' ( (lv_size_56_0= RULE_INT ) ) otherlv_57= '>' ) | ( () otherlv_59= 'wstring' ) | ( () otherlv_61= 'fixed' otherlv_62= '<' ( (lv_totalDigits_63_0= RULE_INT ) ) otherlv_64= ',' ( (lv_fractionalDigits_65_0= RULE_INT ) ) otherlv_66= '>' ) )
            int alt8=21;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalSimpleIDL.g:762:3: ( () otherlv_1= 'short' )
                    {
                    // InternalSimpleIDL.g:762:3: ( () otherlv_1= 'short' )
                    // InternalSimpleIDL.g:763:4: () otherlv_1= 'short'
                    {
                    // InternalSimpleIDL.g:763:4: ()
                    // InternalSimpleIDL.g:764:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getSignedShortIntAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getShortKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleIDL.g:776:3: ( () otherlv_3= 'long' )
                    {
                    // InternalSimpleIDL.g:776:3: ( () otherlv_3= 'long' )
                    // InternalSimpleIDL.g:777:4: () otherlv_3= 'long'
                    {
                    // InternalSimpleIDL.g:777:4: ()
                    // InternalSimpleIDL.g:778:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getSignedLongIntAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getLongKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleIDL.g:790:3: ( () otherlv_5= 'long' otherlv_6= 'long' )
                    {
                    // InternalSimpleIDL.g:790:3: ( () otherlv_5= 'long' otherlv_6= 'long' )
                    // InternalSimpleIDL.g:791:4: () otherlv_5= 'long' otherlv_6= 'long'
                    {
                    // InternalSimpleIDL.g:791:4: ()
                    // InternalSimpleIDL.g:792:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getSignedLongLongIntAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,30,FOLLOW_25); 

                    				newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getLongKeyword_2_1());
                    			
                    otherlv_6=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getTypeAccess().getLongKeyword_2_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSimpleIDL.g:808:3: ( () otherlv_8= 'unsigned' otherlv_9= 'short' )
                    {
                    // InternalSimpleIDL.g:808:3: ( () otherlv_8= 'unsigned' otherlv_9= 'short' )
                    // InternalSimpleIDL.g:809:4: () otherlv_8= 'unsigned' otherlv_9= 'short'
                    {
                    // InternalSimpleIDL.g:809:4: ()
                    // InternalSimpleIDL.g:810:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getUnsignedShortIntAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_8=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getTypeAccess().getUnsignedKeyword_3_1());
                    			
                    otherlv_9=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getTypeAccess().getShortKeyword_3_2());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSimpleIDL.g:826:3: ( () otherlv_11= 'unsigned' otherlv_12= 'long' )
                    {
                    // InternalSimpleIDL.g:826:3: ( () otherlv_11= 'unsigned' otherlv_12= 'long' )
                    // InternalSimpleIDL.g:827:4: () otherlv_11= 'unsigned' otherlv_12= 'long'
                    {
                    // InternalSimpleIDL.g:827:4: ()
                    // InternalSimpleIDL.g:828:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getUnsignedLongIntAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_11, grammarAccess.getTypeAccess().getUnsignedKeyword_4_1());
                    			
                    otherlv_12=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getTypeAccess().getLongKeyword_4_2());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSimpleIDL.g:844:3: ( () otherlv_14= 'unsigned' otherlv_15= 'long' otherlv_16= 'long' )
                    {
                    // InternalSimpleIDL.g:844:3: ( () otherlv_14= 'unsigned' otherlv_15= 'long' otherlv_16= 'long' )
                    // InternalSimpleIDL.g:845:4: () otherlv_14= 'unsigned' otherlv_15= 'long' otherlv_16= 'long'
                    {
                    // InternalSimpleIDL.g:845:4: ()
                    // InternalSimpleIDL.g:846:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getUnsignedLongLongIntAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_14=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_14, grammarAccess.getTypeAccess().getUnsignedKeyword_5_1());
                    			
                    otherlv_15=(Token)match(input,30,FOLLOW_25); 

                    				newLeafNode(otherlv_15, grammarAccess.getTypeAccess().getLongKeyword_5_2());
                    			
                    otherlv_16=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getTypeAccess().getLongKeyword_5_3());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSimpleIDL.g:866:3: ( () otherlv_18= 'float' )
                    {
                    // InternalSimpleIDL.g:866:3: ( () otherlv_18= 'float' )
                    // InternalSimpleIDL.g:867:4: () otherlv_18= 'float'
                    {
                    // InternalSimpleIDL.g:867:4: ()
                    // InternalSimpleIDL.g:868:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getFloatTypeAction_6_0(),
                    						current);
                    				

                    }

                    otherlv_18=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_18, grammarAccess.getTypeAccess().getFloatKeyword_6_1());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSimpleIDL.g:880:3: ( () otherlv_20= 'double' )
                    {
                    // InternalSimpleIDL.g:880:3: ( () otherlv_20= 'double' )
                    // InternalSimpleIDL.g:881:4: () otherlv_20= 'double'
                    {
                    // InternalSimpleIDL.g:881:4: ()
                    // InternalSimpleIDL.g:882:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getDoubleTypeAction_7_0(),
                    						current);
                    				

                    }

                    otherlv_20=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_20, grammarAccess.getTypeAccess().getDoubleKeyword_7_1());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalSimpleIDL.g:894:3: ( () otherlv_22= 'long' otherlv_23= 'double' )
                    {
                    // InternalSimpleIDL.g:894:3: ( () otherlv_22= 'long' otherlv_23= 'double' )
                    // InternalSimpleIDL.g:895:4: () otherlv_22= 'long' otherlv_23= 'double'
                    {
                    // InternalSimpleIDL.g:895:4: ()
                    // InternalSimpleIDL.g:896:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getLongDoubleTypeAction_8_0(),
                    						current);
                    				

                    }

                    otherlv_22=(Token)match(input,30,FOLLOW_26); 

                    				newLeafNode(otherlv_22, grammarAccess.getTypeAccess().getLongKeyword_8_1());
                    			
                    otherlv_23=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_23, grammarAccess.getTypeAccess().getDoubleKeyword_8_2());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalSimpleIDL.g:912:3: ( () otherlv_25= 'char' )
                    {
                    // InternalSimpleIDL.g:912:3: ( () otherlv_25= 'char' )
                    // InternalSimpleIDL.g:913:4: () otherlv_25= 'char'
                    {
                    // InternalSimpleIDL.g:913:4: ()
                    // InternalSimpleIDL.g:914:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getCharTypeAction_9_0(),
                    						current);
                    				

                    }

                    otherlv_25=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_25, grammarAccess.getTypeAccess().getCharKeyword_9_1());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalSimpleIDL.g:926:3: ( () otherlv_27= 'wchar' )
                    {
                    // InternalSimpleIDL.g:926:3: ( () otherlv_27= 'wchar' )
                    // InternalSimpleIDL.g:927:4: () otherlv_27= 'wchar'
                    {
                    // InternalSimpleIDL.g:927:4: ()
                    // InternalSimpleIDL.g:928:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getWideCharTypeAction_10_0(),
                    						current);
                    				

                    }

                    otherlv_27=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_27, grammarAccess.getTypeAccess().getWcharKeyword_10_1());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalSimpleIDL.g:940:3: ( () otherlv_29= 'boolean' )
                    {
                    // InternalSimpleIDL.g:940:3: ( () otherlv_29= 'boolean' )
                    // InternalSimpleIDL.g:941:4: () otherlv_29= 'boolean'
                    {
                    // InternalSimpleIDL.g:941:4: ()
                    // InternalSimpleIDL.g:942:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getBooleanTypeAction_11_0(),
                    						current);
                    				

                    }

                    otherlv_29=(Token)match(input,35,FOLLOW_2); 

                    				newLeafNode(otherlv_29, grammarAccess.getTypeAccess().getBooleanKeyword_11_1());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalSimpleIDL.g:954:3: ( () otherlv_31= 'octet' )
                    {
                    // InternalSimpleIDL.g:954:3: ( () otherlv_31= 'octet' )
                    // InternalSimpleIDL.g:955:4: () otherlv_31= 'octet'
                    {
                    // InternalSimpleIDL.g:955:4: ()
                    // InternalSimpleIDL.g:956:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getOctetTypeAction_12_0(),
                    						current);
                    				

                    }

                    otherlv_31=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_31, grammarAccess.getTypeAccess().getOctetKeyword_12_1());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalSimpleIDL.g:968:3: ( () ( ( ruleScopedName ) ) )
                    {
                    // InternalSimpleIDL.g:968:3: ( () ( ( ruleScopedName ) ) )
                    // InternalSimpleIDL.g:969:4: () ( ( ruleScopedName ) )
                    {
                    // InternalSimpleIDL.g:969:4: ()
                    // InternalSimpleIDL.g:970:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getReferencedTypeAction_13_0(),
                    						current);
                    				

                    }

                    // InternalSimpleIDL.g:976:4: ( ( ruleScopedName ) )
                    // InternalSimpleIDL.g:977:5: ( ruleScopedName )
                    {
                    // InternalSimpleIDL.g:977:5: ( ruleScopedName )
                    // InternalSimpleIDL.g:978:6: ruleScopedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTypeAccess().getTypeDefinitionCrossReference_13_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleScopedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 15 :
                    // InternalSimpleIDL.g:994:3: ( () otherlv_35= 'sequence' otherlv_36= '<' ( ( ruleScopedName ) ) otherlv_38= ',' ( (lv_size_39_0= RULE_INT ) ) otherlv_40= '>' )
                    {
                    // InternalSimpleIDL.g:994:3: ( () otherlv_35= 'sequence' otherlv_36= '<' ( ( ruleScopedName ) ) otherlv_38= ',' ( (lv_size_39_0= RULE_INT ) ) otherlv_40= '>' )
                    // InternalSimpleIDL.g:995:4: () otherlv_35= 'sequence' otherlv_36= '<' ( ( ruleScopedName ) ) otherlv_38= ',' ( (lv_size_39_0= RULE_INT ) ) otherlv_40= '>'
                    {
                    // InternalSimpleIDL.g:995:4: ()
                    // InternalSimpleIDL.g:996:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getBoundedSequenceAction_14_0(),
                    						current);
                    				

                    }

                    otherlv_35=(Token)match(input,37,FOLLOW_27); 

                    				newLeafNode(otherlv_35, grammarAccess.getTypeAccess().getSequenceKeyword_14_1());
                    			
                    otherlv_36=(Token)match(input,38,FOLLOW_8); 

                    				newLeafNode(otherlv_36, grammarAccess.getTypeAccess().getLessThanSignKeyword_14_2());
                    			
                    // InternalSimpleIDL.g:1010:4: ( ( ruleScopedName ) )
                    // InternalSimpleIDL.g:1011:5: ( ruleScopedName )
                    {
                    // InternalSimpleIDL.g:1011:5: ( ruleScopedName )
                    // InternalSimpleIDL.g:1012:6: ruleScopedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTypeAccess().getTypeDefinitionCrossReference_14_3_0());
                    					
                    pushFollow(FOLLOW_28);
                    ruleScopedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_38=(Token)match(input,24,FOLLOW_21); 

                    				newLeafNode(otherlv_38, grammarAccess.getTypeAccess().getCommaKeyword_14_4());
                    			
                    // InternalSimpleIDL.g:1030:4: ( (lv_size_39_0= RULE_INT ) )
                    // InternalSimpleIDL.g:1031:5: (lv_size_39_0= RULE_INT )
                    {
                    // InternalSimpleIDL.g:1031:5: (lv_size_39_0= RULE_INT )
                    // InternalSimpleIDL.g:1032:6: lv_size_39_0= RULE_INT
                    {
                    lv_size_39_0=(Token)match(input,RULE_INT,FOLLOW_29); 

                    						newLeafNode(lv_size_39_0, grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_14_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"size",
                    							lv_size_39_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_40=(Token)match(input,39,FOLLOW_2); 

                    				newLeafNode(otherlv_40, grammarAccess.getTypeAccess().getGreaterThanSignKeyword_14_6());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalSimpleIDL.g:1054:3: ( () otherlv_42= 'sequence' otherlv_43= '<' ( ( ruleScopedName ) ) otherlv_45= '>' )
                    {
                    // InternalSimpleIDL.g:1054:3: ( () otherlv_42= 'sequence' otherlv_43= '<' ( ( ruleScopedName ) ) otherlv_45= '>' )
                    // InternalSimpleIDL.g:1055:4: () otherlv_42= 'sequence' otherlv_43= '<' ( ( ruleScopedName ) ) otherlv_45= '>'
                    {
                    // InternalSimpleIDL.g:1055:4: ()
                    // InternalSimpleIDL.g:1056:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getUnboundedSequenceAction_15_0(),
                    						current);
                    				

                    }

                    otherlv_42=(Token)match(input,37,FOLLOW_27); 

                    				newLeafNode(otherlv_42, grammarAccess.getTypeAccess().getSequenceKeyword_15_1());
                    			
                    otherlv_43=(Token)match(input,38,FOLLOW_8); 

                    				newLeafNode(otherlv_43, grammarAccess.getTypeAccess().getLessThanSignKeyword_15_2());
                    			
                    // InternalSimpleIDL.g:1070:4: ( ( ruleScopedName ) )
                    // InternalSimpleIDL.g:1071:5: ( ruleScopedName )
                    {
                    // InternalSimpleIDL.g:1071:5: ( ruleScopedName )
                    // InternalSimpleIDL.g:1072:6: ruleScopedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTypeAccess().getTypeDefinitionCrossReference_15_3_0());
                    					
                    pushFollow(FOLLOW_29);
                    ruleScopedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_45=(Token)match(input,39,FOLLOW_2); 

                    				newLeafNode(otherlv_45, grammarAccess.getTypeAccess().getGreaterThanSignKeyword_15_4());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalSimpleIDL.g:1092:3: ( () otherlv_47= 'string' otherlv_48= '<' ( (lv_size_49_0= RULE_INT ) ) otherlv_50= '>' )
                    {
                    // InternalSimpleIDL.g:1092:3: ( () otherlv_47= 'string' otherlv_48= '<' ( (lv_size_49_0= RULE_INT ) ) otherlv_50= '>' )
                    // InternalSimpleIDL.g:1093:4: () otherlv_47= 'string' otherlv_48= '<' ( (lv_size_49_0= RULE_INT ) ) otherlv_50= '>'
                    {
                    // InternalSimpleIDL.g:1093:4: ()
                    // InternalSimpleIDL.g:1094:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getBoundedStringAction_16_0(),
                    						current);
                    				

                    }

                    otherlv_47=(Token)match(input,40,FOLLOW_27); 

                    				newLeafNode(otherlv_47, grammarAccess.getTypeAccess().getStringKeyword_16_1());
                    			
                    otherlv_48=(Token)match(input,38,FOLLOW_21); 

                    				newLeafNode(otherlv_48, grammarAccess.getTypeAccess().getLessThanSignKeyword_16_2());
                    			
                    // InternalSimpleIDL.g:1108:4: ( (lv_size_49_0= RULE_INT ) )
                    // InternalSimpleIDL.g:1109:5: (lv_size_49_0= RULE_INT )
                    {
                    // InternalSimpleIDL.g:1109:5: (lv_size_49_0= RULE_INT )
                    // InternalSimpleIDL.g:1110:6: lv_size_49_0= RULE_INT
                    {
                    lv_size_49_0=(Token)match(input,RULE_INT,FOLLOW_29); 

                    						newLeafNode(lv_size_49_0, grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_16_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"size",
                    							lv_size_49_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_50=(Token)match(input,39,FOLLOW_2); 

                    				newLeafNode(otherlv_50, grammarAccess.getTypeAccess().getGreaterThanSignKeyword_16_4());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalSimpleIDL.g:1132:3: ( () otherlv_52= 'string' )
                    {
                    // InternalSimpleIDL.g:1132:3: ( () otherlv_52= 'string' )
                    // InternalSimpleIDL.g:1133:4: () otherlv_52= 'string'
                    {
                    // InternalSimpleIDL.g:1133:4: ()
                    // InternalSimpleIDL.g:1134:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getUnboundedStringAction_17_0(),
                    						current);
                    				

                    }

                    otherlv_52=(Token)match(input,40,FOLLOW_2); 

                    				newLeafNode(otherlv_52, grammarAccess.getTypeAccess().getStringKeyword_17_1());
                    			

                    }


                    }
                    break;
                case 19 :
                    // InternalSimpleIDL.g:1146:3: ( () otherlv_54= 'wstring' otherlv_55= '<' ( (lv_size_56_0= RULE_INT ) ) otherlv_57= '>' )
                    {
                    // InternalSimpleIDL.g:1146:3: ( () otherlv_54= 'wstring' otherlv_55= '<' ( (lv_size_56_0= RULE_INT ) ) otherlv_57= '>' )
                    // InternalSimpleIDL.g:1147:4: () otherlv_54= 'wstring' otherlv_55= '<' ( (lv_size_56_0= RULE_INT ) ) otherlv_57= '>'
                    {
                    // InternalSimpleIDL.g:1147:4: ()
                    // InternalSimpleIDL.g:1148:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getBoundedWideStringAction_18_0(),
                    						current);
                    				

                    }

                    otherlv_54=(Token)match(input,41,FOLLOW_27); 

                    				newLeafNode(otherlv_54, grammarAccess.getTypeAccess().getWstringKeyword_18_1());
                    			
                    otherlv_55=(Token)match(input,38,FOLLOW_21); 

                    				newLeafNode(otherlv_55, grammarAccess.getTypeAccess().getLessThanSignKeyword_18_2());
                    			
                    // InternalSimpleIDL.g:1162:4: ( (lv_size_56_0= RULE_INT ) )
                    // InternalSimpleIDL.g:1163:5: (lv_size_56_0= RULE_INT )
                    {
                    // InternalSimpleIDL.g:1163:5: (lv_size_56_0= RULE_INT )
                    // InternalSimpleIDL.g:1164:6: lv_size_56_0= RULE_INT
                    {
                    lv_size_56_0=(Token)match(input,RULE_INT,FOLLOW_29); 

                    						newLeafNode(lv_size_56_0, grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_18_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"size",
                    							lv_size_56_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_57=(Token)match(input,39,FOLLOW_2); 

                    				newLeafNode(otherlv_57, grammarAccess.getTypeAccess().getGreaterThanSignKeyword_18_4());
                    			

                    }


                    }
                    break;
                case 20 :
                    // InternalSimpleIDL.g:1186:3: ( () otherlv_59= 'wstring' )
                    {
                    // InternalSimpleIDL.g:1186:3: ( () otherlv_59= 'wstring' )
                    // InternalSimpleIDL.g:1187:4: () otherlv_59= 'wstring'
                    {
                    // InternalSimpleIDL.g:1187:4: ()
                    // InternalSimpleIDL.g:1188:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getUnboundedWideStringAction_19_0(),
                    						current);
                    				

                    }

                    otherlv_59=(Token)match(input,41,FOLLOW_2); 

                    				newLeafNode(otherlv_59, grammarAccess.getTypeAccess().getWstringKeyword_19_1());
                    			

                    }


                    }
                    break;
                case 21 :
                    // InternalSimpleIDL.g:1200:3: ( () otherlv_61= 'fixed' otherlv_62= '<' ( (lv_totalDigits_63_0= RULE_INT ) ) otherlv_64= ',' ( (lv_fractionalDigits_65_0= RULE_INT ) ) otherlv_66= '>' )
                    {
                    // InternalSimpleIDL.g:1200:3: ( () otherlv_61= 'fixed' otherlv_62= '<' ( (lv_totalDigits_63_0= RULE_INT ) ) otherlv_64= ',' ( (lv_fractionalDigits_65_0= RULE_INT ) ) otherlv_66= '>' )
                    // InternalSimpleIDL.g:1201:4: () otherlv_61= 'fixed' otherlv_62= '<' ( (lv_totalDigits_63_0= RULE_INT ) ) otherlv_64= ',' ( (lv_fractionalDigits_65_0= RULE_INT ) ) otherlv_66= '>'
                    {
                    // InternalSimpleIDL.g:1201:4: ()
                    // InternalSimpleIDL.g:1202:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getFixedPtTypeAction_20_0(),
                    						current);
                    				

                    }

                    otherlv_61=(Token)match(input,42,FOLLOW_27); 

                    				newLeafNode(otherlv_61, grammarAccess.getTypeAccess().getFixedKeyword_20_1());
                    			
                    otherlv_62=(Token)match(input,38,FOLLOW_21); 

                    				newLeafNode(otherlv_62, grammarAccess.getTypeAccess().getLessThanSignKeyword_20_2());
                    			
                    // InternalSimpleIDL.g:1216:4: ( (lv_totalDigits_63_0= RULE_INT ) )
                    // InternalSimpleIDL.g:1217:5: (lv_totalDigits_63_0= RULE_INT )
                    {
                    // InternalSimpleIDL.g:1217:5: (lv_totalDigits_63_0= RULE_INT )
                    // InternalSimpleIDL.g:1218:6: lv_totalDigits_63_0= RULE_INT
                    {
                    lv_totalDigits_63_0=(Token)match(input,RULE_INT,FOLLOW_28); 

                    						newLeafNode(lv_totalDigits_63_0, grammarAccess.getTypeAccess().getTotalDigitsINTTerminalRuleCall_20_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"totalDigits",
                    							lv_totalDigits_63_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_64=(Token)match(input,24,FOLLOW_21); 

                    				newLeafNode(otherlv_64, grammarAccess.getTypeAccess().getCommaKeyword_20_4());
                    			
                    // InternalSimpleIDL.g:1238:4: ( (lv_fractionalDigits_65_0= RULE_INT ) )
                    // InternalSimpleIDL.g:1239:5: (lv_fractionalDigits_65_0= RULE_INT )
                    {
                    // InternalSimpleIDL.g:1239:5: (lv_fractionalDigits_65_0= RULE_INT )
                    // InternalSimpleIDL.g:1240:6: lv_fractionalDigits_65_0= RULE_INT
                    {
                    lv_fractionalDigits_65_0=(Token)match(input,RULE_INT,FOLLOW_29); 

                    						newLeafNode(lv_fractionalDigits_65_0, grammarAccess.getTypeAccess().getFractionalDigitsINTTerminalRuleCall_20_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"fractionalDigits",
                    							lv_fractionalDigits_65_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_66=(Token)match(input,39,FOLLOW_2); 

                    				newLeafNode(otherlv_66, grammarAccess.getTypeAccess().getGreaterThanSignKeyword_20_6());
                    			

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


    // $ANTLR start "entryRuleScopedName"
    // InternalSimpleIDL.g:1265:1: entryRuleScopedName returns [String current=null] : iv_ruleScopedName= ruleScopedName EOF ;
    public final String entryRuleScopedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleScopedName = null;


        try {
            // InternalSimpleIDL.g:1265:50: (iv_ruleScopedName= ruleScopedName EOF )
            // InternalSimpleIDL.g:1266:2: iv_ruleScopedName= ruleScopedName EOF
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
    // InternalSimpleIDL.g:1272:1: ruleScopedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '::' )? (this_ID_1= RULE_ID kw= '::' )* this_ID_3= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleScopedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_3=null;


        	enterRule();

        try {
            // InternalSimpleIDL.g:1278:2: ( ( (kw= '::' )? (this_ID_1= RULE_ID kw= '::' )* this_ID_3= RULE_ID ) )
            // InternalSimpleIDL.g:1279:2: ( (kw= '::' )? (this_ID_1= RULE_ID kw= '::' )* this_ID_3= RULE_ID )
            {
            // InternalSimpleIDL.g:1279:2: ( (kw= '::' )? (this_ID_1= RULE_ID kw= '::' )* this_ID_3= RULE_ID )
            // InternalSimpleIDL.g:1280:3: (kw= '::' )? (this_ID_1= RULE_ID kw= '::' )* this_ID_3= RULE_ID
            {
            // InternalSimpleIDL.g:1280:3: (kw= '::' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==43) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSimpleIDL.g:1281:4: kw= '::'
                    {
                    kw=(Token)match(input,43,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getScopedNameAccess().getColonColonKeyword_0());
                    			

                    }
                    break;

            }

            // InternalSimpleIDL.g:1287:3: (this_ID_1= RULE_ID kw= '::' )*
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
            	    // InternalSimpleIDL.g:1288:4: this_ID_1= RULE_ID kw= '::'
            	    {
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_30); 

            	    				current.merge(this_ID_1);
            	    			

            	    				newLeafNode(this_ID_1, grammarAccess.getScopedNameAccess().getIDTerminalRuleCall_1_0());
            	    			
            	    kw=(Token)match(input,43,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getScopedNameAccess().getColonColonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop10;
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


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\14\1\uffff\1\4\2\uffff\1\4\1\15\2\4\3\uffff\1\17\1\4\1\uffff";
    static final String dfa_3s = "\1\31\1\uffff\1\4\2\uffff\1\53\1\17\1\4\1\53\3\uffff\1\32\1\4\1\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\4\1\5\4\uffff\1\6\1\3\1\2\2\uffff\1\7";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\3\uffff\1\2\1\3\5\uffff\1\4\1\uffff\1\5",
            "",
            "\1\6",
            "",
            "",
            "\1\10\17\uffff\2\11\10\uffff\10\11\2\uffff\3\11\1\7",
            "\1\13\1\uffff\1\12",
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

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "130:2: ( ( () otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_definitions_4_0= ruleDefinition ) )+ otherlv_5= '}' otherlv_6= ';' ) | ( () otherlv_8= 'struct' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )+ otherlv_12= '}' otherlv_13= ';' ) | ( () otherlv_15= 'struct' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';' ) | ( () otherlv_19= 'union' ( (lv_name_20_0= RULE_ID ) ) otherlv_21= '{' otherlv_22= 'switch' otherlv_23= '(' otherlv_24= 'unsigned' otherlv_25= 'short' otherlv_26= ')' otherlv_27= '{' ( (lv_cases_28_0= ruleCase ) )+ otherlv_29= '}' otherlv_30= ';' otherlv_31= '}' otherlv_32= ';' ) | ( () otherlv_34= 'enum' ( (lv_name_35_0= RULE_ID ) ) otherlv_36= '{' ( (lv_literals_37_0= RULE_ID ) ) (otherlv_38= ',' ( (lv_literals_39_0= RULE_ID ) ) )* otherlv_40= '}' otherlv_41= ';' ) | ( () otherlv_43= 'typedef' ( (lv_type_44_0= ruleType ) ) ( (lv_name_45_0= RULE_ID ) ) otherlv_46= ';' ) | ( () otherlv_48= 'typedef' ( ( ruleScopedName ) ) ( (lv_name_50_0= RULE_ID ) ) otherlv_51= '[' ( (lv_size_52_0= RULE_INT ) ) otherlv_53= ']' otherlv_54= ';' ) )";
        }
    }
    static final String dfa_7s = "\40\uffff";
    static final String dfa_8s = "\2\uffff\1\17\11\uffff\1\25\1\27\4\uffff\1\32\15\uffff";
    static final String dfa_9s = "\1\4\1\uffff\1\4\1\25\7\uffff\1\46\2\4\4\uffff\1\4\1\uffff\1\4\6\uffff\1\4\1\30\1\4\2\uffff";
    static final String dfa_10s = "\1\53\1\uffff\1\40\1\36\7\uffff\3\46\4\uffff\1\36\1\uffff\1\53\6\uffff\1\4\1\53\1\4\2\uffff";
    static final String dfa_11s = "\1\uffff\1\1\2\uffff\1\7\1\10\1\12\1\13\1\14\1\15\1\16\3\uffff\1\25\1\2\1\11\1\3\1\uffff\1\4\1\uffff\1\22\1\21\1\24\1\23\1\6\1\5\3\uffff\1\17\1\20";
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
            "\1\25\41\uffff\1\26",
            "\1\27\41\uffff\1\30",
            "",
            "",
            "",
            "",
            "\1\32\31\uffff\1\31",
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

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "761:2: ( ( () otherlv_1= 'short' ) | ( () otherlv_3= 'long' ) | ( () otherlv_5= 'long' otherlv_6= 'long' ) | ( () otherlv_8= 'unsigned' otherlv_9= 'short' ) | ( () otherlv_11= 'unsigned' otherlv_12= 'long' ) | ( () otherlv_14= 'unsigned' otherlv_15= 'long' otherlv_16= 'long' ) | ( () otherlv_18= 'float' ) | ( () otherlv_20= 'double' ) | ( () otherlv_22= 'long' otherlv_23= 'double' ) | ( () otherlv_25= 'char' ) | ( () otherlv_27= 'wchar' ) | ( () otherlv_29= 'boolean' ) | ( () otherlv_31= 'octet' ) | ( () ( ( ruleScopedName ) ) ) | ( () otherlv_35= 'sequence' otherlv_36= '<' ( ( ruleScopedName ) ) otherlv_38= ',' ( (lv_size_39_0= RULE_INT ) ) otherlv_40= '>' ) | ( () otherlv_42= 'sequence' otherlv_43= '<' ( ( ruleScopedName ) ) otherlv_45= '>' ) | ( () otherlv_47= 'string' otherlv_48= '<' ( (lv_size_49_0= RULE_INT ) ) otherlv_50= '>' ) | ( () otherlv_52= 'string' ) | ( () otherlv_54= 'wstring' otherlv_55= '<' ( (lv_size_56_0= RULE_INT ) ) otherlv_57= '>' ) | ( () otherlv_59= 'wstring' ) | ( () otherlv_61= 'fixed' otherlv_62= '<' ( (lv_totalDigits_63_0= RULE_INT ) ) otherlv_64= ',' ( (lv_fractionalDigits_65_0= RULE_INT ) ) otherlv_66= '>' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002831002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002835000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000080000004010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000F3FC0300010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080010000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000000L});

}