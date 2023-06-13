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
public class InternalSimpleIDLParser extends AbstractInternalAntlrParser {
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

                if ( (LA1_0==12||LA1_0==14||LA1_0==17||LA1_0==23||LA1_0==25) ) {
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
    // InternalSimpleIDL.g:123:1: ruleDefinition returns [EObject current=null] : (this_NamedDefinition_0= ruleNamedDefinition | ( () otherlv_2= 'struct' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject this_NamedDefinition_0 = null;



        	enterRule();

        try {
            // InternalSimpleIDL.g:129:2: ( (this_NamedDefinition_0= ruleNamedDefinition | ( () otherlv_2= 'struct' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ) )
            // InternalSimpleIDL.g:130:2: (this_NamedDefinition_0= ruleNamedDefinition | ( () otherlv_2= 'struct' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            {
            // InternalSimpleIDL.g:130:2: (this_NamedDefinition_0= ruleNamedDefinition | ( () otherlv_2= 'struct' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
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
                    // InternalSimpleIDL.g:131:3: this_NamedDefinition_0= ruleNamedDefinition
                    {

                    			newCompositeNode(grammarAccess.getDefinitionAccess().getNamedDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NamedDefinition_0=ruleNamedDefinition();

                    state._fsp--;


                    			current = this_NamedDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSimpleIDL.g:140:3: ( () otherlv_2= 'struct' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    {
                    // InternalSimpleIDL.g:140:3: ( () otherlv_2= 'struct' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    // InternalSimpleIDL.g:141:4: () otherlv_2= 'struct' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
                    {
                    // InternalSimpleIDL.g:141:4: ()
                    // InternalSimpleIDL.g:142:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDefinitionAccess().getStructForwardAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getDefinitionAccess().getStructKeyword_1_1());
                    			
                    // InternalSimpleIDL.g:152:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSimpleIDL.g:153:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSimpleIDL.g:153:5: (otherlv_3= RULE_ID )
                    // InternalSimpleIDL.g:154:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefinitionRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(otherlv_3, grammarAccess.getDefinitionAccess().getStructStructCrossReference_1_2_0());
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getDefinitionAccess().getSemicolonKeyword_1_3());
                    			

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


    // $ANTLR start "entryRuleNamedDefinition"
    // InternalSimpleIDL.g:174:1: entryRuleNamedDefinition returns [EObject current=null] : iv_ruleNamedDefinition= ruleNamedDefinition EOF ;
    public final EObject entryRuleNamedDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedDefinition = null;


        try {
            // InternalSimpleIDL.g:174:56: (iv_ruleNamedDefinition= ruleNamedDefinition EOF )
            // InternalSimpleIDL.g:175:2: iv_ruleNamedDefinition= ruleNamedDefinition EOF
            {
             newCompositeNode(grammarAccess.getNamedDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedDefinition=ruleNamedDefinition();

            state._fsp--;

             current =iv_ruleNamedDefinition; 
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
    // $ANTLR end "entryRuleNamedDefinition"


    // $ANTLR start "ruleNamedDefinition"
    // InternalSimpleIDL.g:181:1: ruleNamedDefinition returns [EObject current=null] : ( ( () otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_definitions_4_0= ruleDefinition ) )+ otherlv_5= '}' otherlv_6= ';' ) | ( () otherlv_8= 'struct' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )+ otherlv_12= '}' otherlv_13= ';' ) | ( () otherlv_15= 'union' ( (lv_name_16_0= RULE_ID ) ) otherlv_17= '{' otherlv_18= 'switch' otherlv_19= '(' otherlv_20= 'unsigned' otherlv_21= 'short' otherlv_22= ')' otherlv_23= '{' ( (lv_cases_24_0= ruleCase ) )+ otherlv_25= '}' otherlv_26= ';' otherlv_27= '}' otherlv_28= ';' ) | ( () otherlv_30= 'enum' ( (lv_name_31_0= RULE_ID ) ) otherlv_32= '{' ( (lv_literals_33_0= RULE_ID ) ) (otherlv_34= ',' ( (lv_literals_35_0= RULE_ID ) ) )* otherlv_36= '}' otherlv_37= ';' ) | ( () otherlv_39= 'typedef' ( ( ruleScopedName ) ) ( (lv_name_41_0= RULE_ID ) ) otherlv_42= '[' ( (lv_size_43_0= RULE_INT ) ) otherlv_44= ']' otherlv_45= ';' ) | ( () otherlv_47= 'typedef' otherlv_48= 'short' ( (lv_name_49_0= RULE_ID ) ) otherlv_50= ';' ) | ( () otherlv_52= 'typedef' otherlv_53= 'long' ( (lv_name_54_0= RULE_ID ) ) otherlv_55= ';' ) | ( () otherlv_57= 'typedef' otherlv_58= 'long' otherlv_59= 'long' ( (lv_name_60_0= RULE_ID ) ) otherlv_61= ';' ) | ( () otherlv_63= 'typedef' otherlv_64= 'unsigned' otherlv_65= 'short' ( (lv_name_66_0= RULE_ID ) ) otherlv_67= ';' ) | ( () otherlv_69= 'typedef' otherlv_70= 'unsigned' otherlv_71= 'long' ( (lv_name_72_0= RULE_ID ) ) otherlv_73= ';' ) | ( () otherlv_75= 'typedef' otherlv_76= 'unsigned' otherlv_77= 'long' otherlv_78= 'long' ( (lv_name_79_0= RULE_ID ) ) otherlv_80= ';' ) | ( () otherlv_82= 'typedef' otherlv_83= 'float' ( (lv_name_84_0= RULE_ID ) ) otherlv_85= ';' ) | ( () otherlv_87= 'typedef' otherlv_88= 'double' ( (lv_name_89_0= RULE_ID ) ) otherlv_90= ';' ) | ( () otherlv_92= 'typedef' otherlv_93= 'long' otherlv_94= 'double' ( (lv_name_95_0= RULE_ID ) ) otherlv_96= ';' ) | ( () otherlv_98= 'typedef' otherlv_99= 'char' ( (lv_name_100_0= RULE_ID ) ) otherlv_101= ';' ) | ( () otherlv_103= 'typedef' otherlv_104= 'wchar' ( (lv_name_105_0= RULE_ID ) ) otherlv_106= ';' ) | ( () otherlv_108= 'typedef' otherlv_109= 'boolean' ( (lv_name_110_0= RULE_ID ) ) otherlv_111= ';' ) | ( () otherlv_113= 'typedef' otherlv_114= 'octet' ( (lv_name_115_0= RULE_ID ) ) otherlv_116= ';' ) | ( () otherlv_118= 'typedef' ( ( ruleScopedName ) ) ( (lv_name_120_0= RULE_ID ) ) otherlv_121= ';' ) | ( () otherlv_123= 'typedef' otherlv_124= 'sequence' otherlv_125= '<' ( ( ruleScopedName ) ) otherlv_127= ',' ( (lv_size_128_0= RULE_INT ) ) otherlv_129= '>' ( (lv_name_130_0= RULE_ID ) ) otherlv_131= ';' ) | ( () otherlv_133= 'typedef' otherlv_134= 'sequence' otherlv_135= '<' ( ( ruleScopedName ) ) otherlv_137= '>' ( (lv_name_138_0= RULE_ID ) ) otherlv_139= ';' ) | ( () otherlv_141= 'typedef' otherlv_142= 'string' otherlv_143= '<' ( (lv_size_144_0= RULE_INT ) ) otherlv_145= '>' ( (lv_name_146_0= RULE_ID ) ) otherlv_147= ';' ) | ( () otherlv_149= 'typedef' otherlv_150= 'string' ( (lv_name_151_0= RULE_ID ) ) otherlv_152= ';' ) | ( () otherlv_154= 'typedef' otherlv_155= 'wstring' otherlv_156= '<' ( (lv_size_157_0= RULE_INT ) ) otherlv_158= '>' ( (lv_name_159_0= RULE_ID ) ) otherlv_160= ';' ) | ( () otherlv_162= 'typedef' otherlv_163= 'wstring' ( (lv_name_164_0= RULE_ID ) ) otherlv_165= ';' ) | ( () otherlv_167= 'typedef' otherlv_168= 'fixed' otherlv_169= '<' ( (lv_totalDigits_170_0= RULE_INT ) ) otherlv_171= ',' ( (lv_fractionalDigits_172_0= RULE_INT ) ) otherlv_173= '>' ( (lv_name_174_0= RULE_ID ) ) otherlv_175= ';' ) ) ;
    public final EObject ruleNamedDefinition() throws RecognitionException {
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
        Token lv_name_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token lv_name_31_0=null;
        Token otherlv_32=null;
        Token lv_literals_33_0=null;
        Token otherlv_34=null;
        Token lv_literals_35_0=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token lv_name_41_0=null;
        Token otherlv_42=null;
        Token lv_size_43_0=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token lv_name_49_0=null;
        Token otherlv_50=null;
        Token otherlv_52=null;
        Token otherlv_53=null;
        Token lv_name_54_0=null;
        Token otherlv_55=null;
        Token otherlv_57=null;
        Token otherlv_58=null;
        Token otherlv_59=null;
        Token lv_name_60_0=null;
        Token otherlv_61=null;
        Token otherlv_63=null;
        Token otherlv_64=null;
        Token otherlv_65=null;
        Token lv_name_66_0=null;
        Token otherlv_67=null;
        Token otherlv_69=null;
        Token otherlv_70=null;
        Token otherlv_71=null;
        Token lv_name_72_0=null;
        Token otherlv_73=null;
        Token otherlv_75=null;
        Token otherlv_76=null;
        Token otherlv_77=null;
        Token otherlv_78=null;
        Token lv_name_79_0=null;
        Token otherlv_80=null;
        Token otherlv_82=null;
        Token otherlv_83=null;
        Token lv_name_84_0=null;
        Token otherlv_85=null;
        Token otherlv_87=null;
        Token otherlv_88=null;
        Token lv_name_89_0=null;
        Token otherlv_90=null;
        Token otherlv_92=null;
        Token otherlv_93=null;
        Token otherlv_94=null;
        Token lv_name_95_0=null;
        Token otherlv_96=null;
        Token otherlv_98=null;
        Token otherlv_99=null;
        Token lv_name_100_0=null;
        Token otherlv_101=null;
        Token otherlv_103=null;
        Token otherlv_104=null;
        Token lv_name_105_0=null;
        Token otherlv_106=null;
        Token otherlv_108=null;
        Token otherlv_109=null;
        Token lv_name_110_0=null;
        Token otherlv_111=null;
        Token otherlv_113=null;
        Token otherlv_114=null;
        Token lv_name_115_0=null;
        Token otherlv_116=null;
        Token otherlv_118=null;
        Token lv_name_120_0=null;
        Token otherlv_121=null;
        Token otherlv_123=null;
        Token otherlv_124=null;
        Token otherlv_125=null;
        Token otherlv_127=null;
        Token lv_size_128_0=null;
        Token otherlv_129=null;
        Token lv_name_130_0=null;
        Token otherlv_131=null;
        Token otherlv_133=null;
        Token otherlv_134=null;
        Token otherlv_135=null;
        Token otherlv_137=null;
        Token lv_name_138_0=null;
        Token otherlv_139=null;
        Token otherlv_141=null;
        Token otherlv_142=null;
        Token otherlv_143=null;
        Token lv_size_144_0=null;
        Token otherlv_145=null;
        Token lv_name_146_0=null;
        Token otherlv_147=null;
        Token otherlv_149=null;
        Token otherlv_150=null;
        Token lv_name_151_0=null;
        Token otherlv_152=null;
        Token otherlv_154=null;
        Token otherlv_155=null;
        Token otherlv_156=null;
        Token lv_size_157_0=null;
        Token otherlv_158=null;
        Token lv_name_159_0=null;
        Token otherlv_160=null;
        Token otherlv_162=null;
        Token otherlv_163=null;
        Token lv_name_164_0=null;
        Token otherlv_165=null;
        Token otherlv_167=null;
        Token otherlv_168=null;
        Token otherlv_169=null;
        Token lv_totalDigits_170_0=null;
        Token otherlv_171=null;
        Token lv_fractionalDigits_172_0=null;
        Token otherlv_173=null;
        Token lv_name_174_0=null;
        Token otherlv_175=null;
        EObject lv_definitions_4_0 = null;

        EObject lv_members_11_0 = null;

        EObject lv_cases_24_0 = null;



        	enterRule();

        try {
            // InternalSimpleIDL.g:187:2: ( ( ( () otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_definitions_4_0= ruleDefinition ) )+ otherlv_5= '}' otherlv_6= ';' ) | ( () otherlv_8= 'struct' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )+ otherlv_12= '}' otherlv_13= ';' ) | ( () otherlv_15= 'union' ( (lv_name_16_0= RULE_ID ) ) otherlv_17= '{' otherlv_18= 'switch' otherlv_19= '(' otherlv_20= 'unsigned' otherlv_21= 'short' otherlv_22= ')' otherlv_23= '{' ( (lv_cases_24_0= ruleCase ) )+ otherlv_25= '}' otherlv_26= ';' otherlv_27= '}' otherlv_28= ';' ) | ( () otherlv_30= 'enum' ( (lv_name_31_0= RULE_ID ) ) otherlv_32= '{' ( (lv_literals_33_0= RULE_ID ) ) (otherlv_34= ',' ( (lv_literals_35_0= RULE_ID ) ) )* otherlv_36= '}' otherlv_37= ';' ) | ( () otherlv_39= 'typedef' ( ( ruleScopedName ) ) ( (lv_name_41_0= RULE_ID ) ) otherlv_42= '[' ( (lv_size_43_0= RULE_INT ) ) otherlv_44= ']' otherlv_45= ';' ) | ( () otherlv_47= 'typedef' otherlv_48= 'short' ( (lv_name_49_0= RULE_ID ) ) otherlv_50= ';' ) | ( () otherlv_52= 'typedef' otherlv_53= 'long' ( (lv_name_54_0= RULE_ID ) ) otherlv_55= ';' ) | ( () otherlv_57= 'typedef' otherlv_58= 'long' otherlv_59= 'long' ( (lv_name_60_0= RULE_ID ) ) otherlv_61= ';' ) | ( () otherlv_63= 'typedef' otherlv_64= 'unsigned' otherlv_65= 'short' ( (lv_name_66_0= RULE_ID ) ) otherlv_67= ';' ) | ( () otherlv_69= 'typedef' otherlv_70= 'unsigned' otherlv_71= 'long' ( (lv_name_72_0= RULE_ID ) ) otherlv_73= ';' ) | ( () otherlv_75= 'typedef' otherlv_76= 'unsigned' otherlv_77= 'long' otherlv_78= 'long' ( (lv_name_79_0= RULE_ID ) ) otherlv_80= ';' ) | ( () otherlv_82= 'typedef' otherlv_83= 'float' ( (lv_name_84_0= RULE_ID ) ) otherlv_85= ';' ) | ( () otherlv_87= 'typedef' otherlv_88= 'double' ( (lv_name_89_0= RULE_ID ) ) otherlv_90= ';' ) | ( () otherlv_92= 'typedef' otherlv_93= 'long' otherlv_94= 'double' ( (lv_name_95_0= RULE_ID ) ) otherlv_96= ';' ) | ( () otherlv_98= 'typedef' otherlv_99= 'char' ( (lv_name_100_0= RULE_ID ) ) otherlv_101= ';' ) | ( () otherlv_103= 'typedef' otherlv_104= 'wchar' ( (lv_name_105_0= RULE_ID ) ) otherlv_106= ';' ) | ( () otherlv_108= 'typedef' otherlv_109= 'boolean' ( (lv_name_110_0= RULE_ID ) ) otherlv_111= ';' ) | ( () otherlv_113= 'typedef' otherlv_114= 'octet' ( (lv_name_115_0= RULE_ID ) ) otherlv_116= ';' ) | ( () otherlv_118= 'typedef' ( ( ruleScopedName ) ) ( (lv_name_120_0= RULE_ID ) ) otherlv_121= ';' ) | ( () otherlv_123= 'typedef' otherlv_124= 'sequence' otherlv_125= '<' ( ( ruleScopedName ) ) otherlv_127= ',' ( (lv_size_128_0= RULE_INT ) ) otherlv_129= '>' ( (lv_name_130_0= RULE_ID ) ) otherlv_131= ';' ) | ( () otherlv_133= 'typedef' otherlv_134= 'sequence' otherlv_135= '<' ( ( ruleScopedName ) ) otherlv_137= '>' ( (lv_name_138_0= RULE_ID ) ) otherlv_139= ';' ) | ( () otherlv_141= 'typedef' otherlv_142= 'string' otherlv_143= '<' ( (lv_size_144_0= RULE_INT ) ) otherlv_145= '>' ( (lv_name_146_0= RULE_ID ) ) otherlv_147= ';' ) | ( () otherlv_149= 'typedef' otherlv_150= 'string' ( (lv_name_151_0= RULE_ID ) ) otherlv_152= ';' ) | ( () otherlv_154= 'typedef' otherlv_155= 'wstring' otherlv_156= '<' ( (lv_size_157_0= RULE_INT ) ) otherlv_158= '>' ( (lv_name_159_0= RULE_ID ) ) otherlv_160= ';' ) | ( () otherlv_162= 'typedef' otherlv_163= 'wstring' ( (lv_name_164_0= RULE_ID ) ) otherlv_165= ';' ) | ( () otherlv_167= 'typedef' otherlv_168= 'fixed' otherlv_169= '<' ( (lv_totalDigits_170_0= RULE_INT ) ) otherlv_171= ',' ( (lv_fractionalDigits_172_0= RULE_INT ) ) otherlv_173= '>' ( (lv_name_174_0= RULE_ID ) ) otherlv_175= ';' ) ) )
            // InternalSimpleIDL.g:188:2: ( ( () otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_definitions_4_0= ruleDefinition ) )+ otherlv_5= '}' otherlv_6= ';' ) | ( () otherlv_8= 'struct' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )+ otherlv_12= '}' otherlv_13= ';' ) | ( () otherlv_15= 'union' ( (lv_name_16_0= RULE_ID ) ) otherlv_17= '{' otherlv_18= 'switch' otherlv_19= '(' otherlv_20= 'unsigned' otherlv_21= 'short' otherlv_22= ')' otherlv_23= '{' ( (lv_cases_24_0= ruleCase ) )+ otherlv_25= '}' otherlv_26= ';' otherlv_27= '}' otherlv_28= ';' ) | ( () otherlv_30= 'enum' ( (lv_name_31_0= RULE_ID ) ) otherlv_32= '{' ( (lv_literals_33_0= RULE_ID ) ) (otherlv_34= ',' ( (lv_literals_35_0= RULE_ID ) ) )* otherlv_36= '}' otherlv_37= ';' ) | ( () otherlv_39= 'typedef' ( ( ruleScopedName ) ) ( (lv_name_41_0= RULE_ID ) ) otherlv_42= '[' ( (lv_size_43_0= RULE_INT ) ) otherlv_44= ']' otherlv_45= ';' ) | ( () otherlv_47= 'typedef' otherlv_48= 'short' ( (lv_name_49_0= RULE_ID ) ) otherlv_50= ';' ) | ( () otherlv_52= 'typedef' otherlv_53= 'long' ( (lv_name_54_0= RULE_ID ) ) otherlv_55= ';' ) | ( () otherlv_57= 'typedef' otherlv_58= 'long' otherlv_59= 'long' ( (lv_name_60_0= RULE_ID ) ) otherlv_61= ';' ) | ( () otherlv_63= 'typedef' otherlv_64= 'unsigned' otherlv_65= 'short' ( (lv_name_66_0= RULE_ID ) ) otherlv_67= ';' ) | ( () otherlv_69= 'typedef' otherlv_70= 'unsigned' otherlv_71= 'long' ( (lv_name_72_0= RULE_ID ) ) otherlv_73= ';' ) | ( () otherlv_75= 'typedef' otherlv_76= 'unsigned' otherlv_77= 'long' otherlv_78= 'long' ( (lv_name_79_0= RULE_ID ) ) otherlv_80= ';' ) | ( () otherlv_82= 'typedef' otherlv_83= 'float' ( (lv_name_84_0= RULE_ID ) ) otherlv_85= ';' ) | ( () otherlv_87= 'typedef' otherlv_88= 'double' ( (lv_name_89_0= RULE_ID ) ) otherlv_90= ';' ) | ( () otherlv_92= 'typedef' otherlv_93= 'long' otherlv_94= 'double' ( (lv_name_95_0= RULE_ID ) ) otherlv_96= ';' ) | ( () otherlv_98= 'typedef' otherlv_99= 'char' ( (lv_name_100_0= RULE_ID ) ) otherlv_101= ';' ) | ( () otherlv_103= 'typedef' otherlv_104= 'wchar' ( (lv_name_105_0= RULE_ID ) ) otherlv_106= ';' ) | ( () otherlv_108= 'typedef' otherlv_109= 'boolean' ( (lv_name_110_0= RULE_ID ) ) otherlv_111= ';' ) | ( () otherlv_113= 'typedef' otherlv_114= 'octet' ( (lv_name_115_0= RULE_ID ) ) otherlv_116= ';' ) | ( () otherlv_118= 'typedef' ( ( ruleScopedName ) ) ( (lv_name_120_0= RULE_ID ) ) otherlv_121= ';' ) | ( () otherlv_123= 'typedef' otherlv_124= 'sequence' otherlv_125= '<' ( ( ruleScopedName ) ) otherlv_127= ',' ( (lv_size_128_0= RULE_INT ) ) otherlv_129= '>' ( (lv_name_130_0= RULE_ID ) ) otherlv_131= ';' ) | ( () otherlv_133= 'typedef' otherlv_134= 'sequence' otherlv_135= '<' ( ( ruleScopedName ) ) otherlv_137= '>' ( (lv_name_138_0= RULE_ID ) ) otherlv_139= ';' ) | ( () otherlv_141= 'typedef' otherlv_142= 'string' otherlv_143= '<' ( (lv_size_144_0= RULE_INT ) ) otherlv_145= '>' ( (lv_name_146_0= RULE_ID ) ) otherlv_147= ';' ) | ( () otherlv_149= 'typedef' otherlv_150= 'string' ( (lv_name_151_0= RULE_ID ) ) otherlv_152= ';' ) | ( () otherlv_154= 'typedef' otherlv_155= 'wstring' otherlv_156= '<' ( (lv_size_157_0= RULE_INT ) ) otherlv_158= '>' ( (lv_name_159_0= RULE_ID ) ) otherlv_160= ';' ) | ( () otherlv_162= 'typedef' otherlv_163= 'wstring' ( (lv_name_164_0= RULE_ID ) ) otherlv_165= ';' ) | ( () otherlv_167= 'typedef' otherlv_168= 'fixed' otherlv_169= '<' ( (lv_totalDigits_170_0= RULE_INT ) ) otherlv_171= ',' ( (lv_fractionalDigits_172_0= RULE_INT ) ) otherlv_173= '>' ( (lv_name_174_0= RULE_ID ) ) otherlv_175= ';' ) )
            {
            // InternalSimpleIDL.g:188:2: ( ( () otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_definitions_4_0= ruleDefinition ) )+ otherlv_5= '}' otherlv_6= ';' ) | ( () otherlv_8= 'struct' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )+ otherlv_12= '}' otherlv_13= ';' ) | ( () otherlv_15= 'union' ( (lv_name_16_0= RULE_ID ) ) otherlv_17= '{' otherlv_18= 'switch' otherlv_19= '(' otherlv_20= 'unsigned' otherlv_21= 'short' otherlv_22= ')' otherlv_23= '{' ( (lv_cases_24_0= ruleCase ) )+ otherlv_25= '}' otherlv_26= ';' otherlv_27= '}' otherlv_28= ';' ) | ( () otherlv_30= 'enum' ( (lv_name_31_0= RULE_ID ) ) otherlv_32= '{' ( (lv_literals_33_0= RULE_ID ) ) (otherlv_34= ',' ( (lv_literals_35_0= RULE_ID ) ) )* otherlv_36= '}' otherlv_37= ';' ) | ( () otherlv_39= 'typedef' ( ( ruleScopedName ) ) ( (lv_name_41_0= RULE_ID ) ) otherlv_42= '[' ( (lv_size_43_0= RULE_INT ) ) otherlv_44= ']' otherlv_45= ';' ) | ( () otherlv_47= 'typedef' otherlv_48= 'short' ( (lv_name_49_0= RULE_ID ) ) otherlv_50= ';' ) | ( () otherlv_52= 'typedef' otherlv_53= 'long' ( (lv_name_54_0= RULE_ID ) ) otherlv_55= ';' ) | ( () otherlv_57= 'typedef' otherlv_58= 'long' otherlv_59= 'long' ( (lv_name_60_0= RULE_ID ) ) otherlv_61= ';' ) | ( () otherlv_63= 'typedef' otherlv_64= 'unsigned' otherlv_65= 'short' ( (lv_name_66_0= RULE_ID ) ) otherlv_67= ';' ) | ( () otherlv_69= 'typedef' otherlv_70= 'unsigned' otherlv_71= 'long' ( (lv_name_72_0= RULE_ID ) ) otherlv_73= ';' ) | ( () otherlv_75= 'typedef' otherlv_76= 'unsigned' otherlv_77= 'long' otherlv_78= 'long' ( (lv_name_79_0= RULE_ID ) ) otherlv_80= ';' ) | ( () otherlv_82= 'typedef' otherlv_83= 'float' ( (lv_name_84_0= RULE_ID ) ) otherlv_85= ';' ) | ( () otherlv_87= 'typedef' otherlv_88= 'double' ( (lv_name_89_0= RULE_ID ) ) otherlv_90= ';' ) | ( () otherlv_92= 'typedef' otherlv_93= 'long' otherlv_94= 'double' ( (lv_name_95_0= RULE_ID ) ) otherlv_96= ';' ) | ( () otherlv_98= 'typedef' otherlv_99= 'char' ( (lv_name_100_0= RULE_ID ) ) otherlv_101= ';' ) | ( () otherlv_103= 'typedef' otherlv_104= 'wchar' ( (lv_name_105_0= RULE_ID ) ) otherlv_106= ';' ) | ( () otherlv_108= 'typedef' otherlv_109= 'boolean' ( (lv_name_110_0= RULE_ID ) ) otherlv_111= ';' ) | ( () otherlv_113= 'typedef' otherlv_114= 'octet' ( (lv_name_115_0= RULE_ID ) ) otherlv_116= ';' ) | ( () otherlv_118= 'typedef' ( ( ruleScopedName ) ) ( (lv_name_120_0= RULE_ID ) ) otherlv_121= ';' ) | ( () otherlv_123= 'typedef' otherlv_124= 'sequence' otherlv_125= '<' ( ( ruleScopedName ) ) otherlv_127= ',' ( (lv_size_128_0= RULE_INT ) ) otherlv_129= '>' ( (lv_name_130_0= RULE_ID ) ) otherlv_131= ';' ) | ( () otherlv_133= 'typedef' otherlv_134= 'sequence' otherlv_135= '<' ( ( ruleScopedName ) ) otherlv_137= '>' ( (lv_name_138_0= RULE_ID ) ) otherlv_139= ';' ) | ( () otherlv_141= 'typedef' otherlv_142= 'string' otherlv_143= '<' ( (lv_size_144_0= RULE_INT ) ) otherlv_145= '>' ( (lv_name_146_0= RULE_ID ) ) otherlv_147= ';' ) | ( () otherlv_149= 'typedef' otherlv_150= 'string' ( (lv_name_151_0= RULE_ID ) ) otherlv_152= ';' ) | ( () otherlv_154= 'typedef' otherlv_155= 'wstring' otherlv_156= '<' ( (lv_size_157_0= RULE_INT ) ) otherlv_158= '>' ( (lv_name_159_0= RULE_ID ) ) otherlv_160= ';' ) | ( () otherlv_162= 'typedef' otherlv_163= 'wstring' ( (lv_name_164_0= RULE_ID ) ) otherlv_165= ';' ) | ( () otherlv_167= 'typedef' otherlv_168= 'fixed' otherlv_169= '<' ( (lv_totalDigits_170_0= RULE_INT ) ) otherlv_171= ',' ( (lv_fractionalDigits_172_0= RULE_INT ) ) otherlv_173= '>' ( (lv_name_174_0= RULE_ID ) ) otherlv_175= ';' ) )
            int alt7=26;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalSimpleIDL.g:189:3: ( () otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_definitions_4_0= ruleDefinition ) )+ otherlv_5= '}' otherlv_6= ';' )
                    {
                    // InternalSimpleIDL.g:189:3: ( () otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_definitions_4_0= ruleDefinition ) )+ otherlv_5= '}' otherlv_6= ';' )
                    // InternalSimpleIDL.g:190:4: () otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_definitions_4_0= ruleDefinition ) )+ otherlv_5= '}' otherlv_6= ';'
                    {
                    // InternalSimpleIDL.g:190:4: ()
                    // InternalSimpleIDL.g:191:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNamedDefinitionAccess().getModuleAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getNamedDefinitionAccess().getModuleKeyword_0_1());
                    			
                    // InternalSimpleIDL.g:201:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalSimpleIDL.g:202:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalSimpleIDL.g:202:5: (lv_name_2_0= RULE_ID )
                    // InternalSimpleIDL.g:203:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.osate.simpleidl.SimpleIDL.ID");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getNamedDefinitionAccess().getLeftCurlyBracketKeyword_0_3());
                    			
                    // InternalSimpleIDL.g:223:4: ( (lv_definitions_4_0= ruleDefinition ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==12||LA3_0==14||LA3_0==17||LA3_0==23||LA3_0==25) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalSimpleIDL.g:224:5: (lv_definitions_4_0= ruleDefinition )
                    	    {
                    	    // InternalSimpleIDL.g:224:5: (lv_definitions_4_0= ruleDefinition )
                    	    // InternalSimpleIDL.g:225:6: lv_definitions_4_0= ruleDefinition
                    	    {

                    	    						newCompositeNode(grammarAccess.getNamedDefinitionAccess().getDefinitionsDefinitionParserRuleCall_0_4_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_definitions_4_0=ruleDefinition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getNamedDefinitionRule());
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
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    otherlv_5=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getNamedDefinitionAccess().getRightCurlyBracketKeyword_0_5());
                    			
                    otherlv_6=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_0_6());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleIDL.g:252:3: ( () otherlv_8= 'struct' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )+ otherlv_12= '}' otherlv_13= ';' )
                    {
                    // InternalSimpleIDL.g:252:3: ( () otherlv_8= 'struct' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )+ otherlv_12= '}' otherlv_13= ';' )
                    // InternalSimpleIDL.g:253:4: () otherlv_8= 'struct' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )+ otherlv_12= '}' otherlv_13= ';'
                    {
                    // InternalSimpleIDL.g:253:4: ()
                    // InternalSimpleIDL.g:254:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNamedDefinitionAccess().getStructAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_8=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getNamedDefinitionAccess().getStructKeyword_1_1());
                    			
                    // InternalSimpleIDL.g:264:4: ( (lv_name_9_0= RULE_ID ) )
                    // InternalSimpleIDL.g:265:5: (lv_name_9_0= RULE_ID )
                    {
                    // InternalSimpleIDL.g:265:5: (lv_name_9_0= RULE_ID )
                    // InternalSimpleIDL.g:266:6: lv_name_9_0= RULE_ID
                    {
                    lv_name_9_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(lv_name_9_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_9_0,
                    							"org.osate.simpleidl.SimpleIDL.ID");
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getNamedDefinitionAccess().getLeftCurlyBracketKeyword_1_3());
                    			
                    // InternalSimpleIDL.g:286:4: ( (lv_members_11_0= ruleMember ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID||LA4_0==43) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSimpleIDL.g:287:5: (lv_members_11_0= ruleMember )
                    	    {
                    	    // InternalSimpleIDL.g:287:5: (lv_members_11_0= ruleMember )
                    	    // InternalSimpleIDL.g:288:6: lv_members_11_0= ruleMember
                    	    {

                    	    						newCompositeNode(grammarAccess.getNamedDefinitionAccess().getMembersMemberParserRuleCall_1_4_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_members_11_0=ruleMember();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getNamedDefinitionRule());
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
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    otherlv_12=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getNamedDefinitionAccess().getRightCurlyBracketKeyword_1_5());
                    			
                    otherlv_13=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_1_6());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleIDL.g:315:3: ( () otherlv_15= 'union' ( (lv_name_16_0= RULE_ID ) ) otherlv_17= '{' otherlv_18= 'switch' otherlv_19= '(' otherlv_20= 'unsigned' otherlv_21= 'short' otherlv_22= ')' otherlv_23= '{' ( (lv_cases_24_0= ruleCase ) )+ otherlv_25= '}' otherlv_26= ';' otherlv_27= '}' otherlv_28= ';' )
                    {
                    // InternalSimpleIDL.g:315:3: ( () otherlv_15= 'union' ( (lv_name_16_0= RULE_ID ) ) otherlv_17= '{' otherlv_18= 'switch' otherlv_19= '(' otherlv_20= 'unsigned' otherlv_21= 'short' otherlv_22= ')' otherlv_23= '{' ( (lv_cases_24_0= ruleCase ) )+ otherlv_25= '}' otherlv_26= ';' otherlv_27= '}' otherlv_28= ';' )
                    // InternalSimpleIDL.g:316:4: () otherlv_15= 'union' ( (lv_name_16_0= RULE_ID ) ) otherlv_17= '{' otherlv_18= 'switch' otherlv_19= '(' otherlv_20= 'unsigned' otherlv_21= 'short' otherlv_22= ')' otherlv_23= '{' ( (lv_cases_24_0= ruleCase ) )+ otherlv_25= '}' otherlv_26= ';' otherlv_27= '}' otherlv_28= ';'
                    {
                    // InternalSimpleIDL.g:316:4: ()
                    // InternalSimpleIDL.g:317:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNamedDefinitionAccess().getUnionAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_15=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_15, grammarAccess.getNamedDefinitionAccess().getUnionKeyword_2_1());
                    			
                    // InternalSimpleIDL.g:327:4: ( (lv_name_16_0= RULE_ID ) )
                    // InternalSimpleIDL.g:328:5: (lv_name_16_0= RULE_ID )
                    {
                    // InternalSimpleIDL.g:328:5: (lv_name_16_0= RULE_ID )
                    // InternalSimpleIDL.g:329:6: lv_name_16_0= RULE_ID
                    {
                    lv_name_16_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(lv_name_16_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_16_0,
                    							"org.osate.simpleidl.SimpleIDL.ID");
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_17, grammarAccess.getNamedDefinitionAccess().getLeftCurlyBracketKeyword_2_3());
                    			
                    otherlv_18=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_18, grammarAccess.getNamedDefinitionAccess().getSwitchKeyword_2_4());
                    			
                    otherlv_19=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_19, grammarAccess.getNamedDefinitionAccess().getLeftParenthesisKeyword_2_5());
                    			
                    otherlv_20=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_20, grammarAccess.getNamedDefinitionAccess().getUnsignedKeyword_2_6());
                    			
                    otherlv_21=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_21, grammarAccess.getNamedDefinitionAccess().getShortKeyword_2_7());
                    			
                    otherlv_22=(Token)match(input,22,FOLLOW_6); 

                    				newLeafNode(otherlv_22, grammarAccess.getNamedDefinitionAccess().getRightParenthesisKeyword_2_8());
                    			
                    otherlv_23=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_23, grammarAccess.getNamedDefinitionAccess().getLeftCurlyBracketKeyword_2_9());
                    			
                    // InternalSimpleIDL.g:373:4: ( (lv_cases_24_0= ruleCase ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==41) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalSimpleIDL.g:374:5: (lv_cases_24_0= ruleCase )
                    	    {
                    	    // InternalSimpleIDL.g:374:5: (lv_cases_24_0= ruleCase )
                    	    // InternalSimpleIDL.g:375:6: lv_cases_24_0= ruleCase
                    	    {

                    	    						newCompositeNode(grammarAccess.getNamedDefinitionAccess().getCasesCaseParserRuleCall_2_10_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
                    	    lv_cases_24_0=ruleCase();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getNamedDefinitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"cases",
                    	    							lv_cases_24_0,
                    	    							"org.osate.simpleidl.SimpleIDL.Case");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    otherlv_25=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_25, grammarAccess.getNamedDefinitionAccess().getRightCurlyBracketKeyword_2_11());
                    			
                    otherlv_26=(Token)match(input,13,FOLLOW_17); 

                    				newLeafNode(otherlv_26, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_2_12());
                    			
                    otherlv_27=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_27, grammarAccess.getNamedDefinitionAccess().getRightCurlyBracketKeyword_2_13());
                    			
                    otherlv_28=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_28, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_2_14());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSimpleIDL.g:410:3: ( () otherlv_30= 'enum' ( (lv_name_31_0= RULE_ID ) ) otherlv_32= '{' ( (lv_literals_33_0= RULE_ID ) ) (otherlv_34= ',' ( (lv_literals_35_0= RULE_ID ) ) )* otherlv_36= '}' otherlv_37= ';' )
                    {
                    // InternalSimpleIDL.g:410:3: ( () otherlv_30= 'enum' ( (lv_name_31_0= RULE_ID ) ) otherlv_32= '{' ( (lv_literals_33_0= RULE_ID ) ) (otherlv_34= ',' ( (lv_literals_35_0= RULE_ID ) ) )* otherlv_36= '}' otherlv_37= ';' )
                    // InternalSimpleIDL.g:411:4: () otherlv_30= 'enum' ( (lv_name_31_0= RULE_ID ) ) otherlv_32= '{' ( (lv_literals_33_0= RULE_ID ) ) (otherlv_34= ',' ( (lv_literals_35_0= RULE_ID ) ) )* otherlv_36= '}' otherlv_37= ';'
                    {
                    // InternalSimpleIDL.g:411:4: ()
                    // InternalSimpleIDL.g:412:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNamedDefinitionAccess().getEnumAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_30=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_30, grammarAccess.getNamedDefinitionAccess().getEnumKeyword_3_1());
                    			
                    // InternalSimpleIDL.g:422:4: ( (lv_name_31_0= RULE_ID ) )
                    // InternalSimpleIDL.g:423:5: (lv_name_31_0= RULE_ID )
                    {
                    // InternalSimpleIDL.g:423:5: (lv_name_31_0= RULE_ID )
                    // InternalSimpleIDL.g:424:6: lv_name_31_0= RULE_ID
                    {
                    lv_name_31_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(lv_name_31_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_31_0,
                    							"org.osate.simpleidl.SimpleIDL.ID");
                    					

                    }


                    }

                    otherlv_32=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_32, grammarAccess.getNamedDefinitionAccess().getLeftCurlyBracketKeyword_3_3());
                    			
                    // InternalSimpleIDL.g:444:4: ( (lv_literals_33_0= RULE_ID ) )
                    // InternalSimpleIDL.g:445:5: (lv_literals_33_0= RULE_ID )
                    {
                    // InternalSimpleIDL.g:445:5: (lv_literals_33_0= RULE_ID )
                    // InternalSimpleIDL.g:446:6: lv_literals_33_0= RULE_ID
                    {
                    lv_literals_33_0=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(lv_literals_33_0, grammarAccess.getNamedDefinitionAccess().getLiteralsIDTerminalRuleCall_3_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"literals",
                    							lv_literals_33_0,
                    							"org.osate.simpleidl.SimpleIDL.ID");
                    					

                    }


                    }

                    // InternalSimpleIDL.g:462:4: (otherlv_34= ',' ( (lv_literals_35_0= RULE_ID ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==24) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSimpleIDL.g:463:5: otherlv_34= ',' ( (lv_literals_35_0= RULE_ID ) )
                    	    {
                    	    otherlv_34=(Token)match(input,24,FOLLOW_4); 

                    	    					newLeafNode(otherlv_34, grammarAccess.getNamedDefinitionAccess().getCommaKeyword_3_5_0());
                    	    				
                    	    // InternalSimpleIDL.g:467:5: ( (lv_literals_35_0= RULE_ID ) )
                    	    // InternalSimpleIDL.g:468:6: (lv_literals_35_0= RULE_ID )
                    	    {
                    	    // InternalSimpleIDL.g:468:6: (lv_literals_35_0= RULE_ID )
                    	    // InternalSimpleIDL.g:469:7: lv_literals_35_0= RULE_ID
                    	    {
                    	    lv_literals_35_0=(Token)match(input,RULE_ID,FOLLOW_18); 

                    	    							newLeafNode(lv_literals_35_0, grammarAccess.getNamedDefinitionAccess().getLiteralsIDTerminalRuleCall_3_5_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"literals",
                    	    								lv_literals_35_0,
                    	    								"org.osate.simpleidl.SimpleIDL.ID");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_36=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_36, grammarAccess.getNamedDefinitionAccess().getRightCurlyBracketKeyword_3_6());
                    			
                    otherlv_37=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_37, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_3_7());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSimpleIDL.g:496:3: ( () otherlv_39= 'typedef' ( ( ruleScopedName ) ) ( (lv_name_41_0= RULE_ID ) ) otherlv_42= '[' ( (lv_size_43_0= RULE_INT ) ) otherlv_44= ']' otherlv_45= ';' )
                    {
                    // InternalSimpleIDL.g:496:3: ( () otherlv_39= 'typedef' ( ( ruleScopedName ) ) ( (lv_name_41_0= RULE_ID ) ) otherlv_42= '[' ( (lv_size_43_0= RULE_INT ) ) otherlv_44= ']' otherlv_45= ';' )
                    // InternalSimpleIDL.g:497:4: () otherlv_39= 'typedef' ( ( ruleScopedName ) ) ( (lv_name_41_0= RULE_ID ) ) otherlv_42= '[' ( (lv_size_43_0= RULE_INT ) ) otherlv_44= ']' otherlv_45= ';'
                    {
                    // InternalSimpleIDL.g:497:4: ()
                    // InternalSimpleIDL.g:498:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNamedDefinitionAccess().getArrayTypeAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_39=(Token)match(input,25,FOLLOW_8); 

                    				newLeafNode(otherlv_39, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_4_1());
                    			
                    // InternalSimpleIDL.g:508:4: ( ( ruleScopedName ) )
                    // InternalSimpleIDL.g:509:5: ( ruleScopedName )
                    {
                    // InternalSimpleIDL.g:509:5: ( ruleScopedName )
                    // InternalSimpleIDL.g:510:6: ruleScopedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_4);
                    ruleScopedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSimpleIDL.g:524:4: ( (lv_name_41_0= RULE_ID ) )
                    // InternalSimpleIDL.g:525:5: (lv_name_41_0= RULE_ID )
                    {
                    // InternalSimpleIDL.g:525:5: (lv_name_41_0= RULE_ID )
                    // InternalSimpleIDL.g:526:6: lv_name_41_0= RULE_ID
                    {
                    lv_name_41_0=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(lv_name_41_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_4_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_41_0,
                    							"org.osate.simpleidl.SimpleIDL.ID");
                    					

                    }


                    }

                    otherlv_42=(Token)match(input,26,FOLLOW_20); 

                    				newLeafNode(otherlv_42, grammarAccess.getNamedDefinitionAccess().getLeftSquareBracketKeyword_4_4());
                    			
                    // InternalSimpleIDL.g:546:4: ( (lv_size_43_0= RULE_INT ) )
                    // InternalSimpleIDL.g:547:5: (lv_size_43_0= RULE_INT )
                    {
                    // InternalSimpleIDL.g:547:5: (lv_size_43_0= RULE_INT )
                    // InternalSimpleIDL.g:548:6: lv_size_43_0= RULE_INT
                    {
                    lv_size_43_0=(Token)match(input,RULE_INT,FOLLOW_21); 

                    						newLeafNode(lv_size_43_0, grammarAccess.getNamedDefinitionAccess().getSizeINTTerminalRuleCall_4_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"size",
                    							lv_size_43_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_44=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_44, grammarAccess.getNamedDefinitionAccess().getRightSquareBracketKeyword_4_6());
                    			
                    otherlv_45=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_45, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_4_7());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSimpleIDL.g:574:3: ( () otherlv_47= 'typedef' otherlv_48= 'short' ( (lv_name_49_0= RULE_ID ) ) otherlv_50= ';' )
                    {
                    // InternalSimpleIDL.g:574:3: ( () otherlv_47= 'typedef' otherlv_48= 'short' ( (lv_name_49_0= RULE_ID ) ) otherlv_50= ';' )
                    // InternalSimpleIDL.g:575:4: () otherlv_47= 'typedef' otherlv_48= 'short' ( (lv_name_49_0= RULE_ID ) ) otherlv_50= ';'
                    {
                    // InternalSimpleIDL.g:575:4: ()
                    // InternalSimpleIDL.g:576:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNamedDefinitionAccess().getSignedShortIntAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_47=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_47, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_5_1());
                    			
                    otherlv_48=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_48, grammarAccess.getNamedDefinitionAccess().getShortKeyword_5_2());
                    			
                    // InternalSimpleIDL.g:590:4: ( (lv_name_49_0= RULE_ID ) )
                    // InternalSimpleIDL.g:591:5: (lv_name_49_0= RULE_ID )
                    {
                    // InternalSimpleIDL.g:591:5: (lv_name_49_0= RULE_ID )
                    // InternalSimpleIDL.g:592:6: lv_name_49_0= RULE_ID
                    {
                    lv_name_49_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_49_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_5_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_49_0,
                    							"org.osate.simpleidl.SimpleIDL.ID");
                    					

                    }


                    }

                    otherlv_50=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_50, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_5_4());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSimpleIDL.g:614:3: ( () otherlv_52= 'typedef' otherlv_53= 'long' ( (lv_name_54_0= RULE_ID ) ) otherlv_55= ';' )
                    {
                    // InternalSimpleIDL.g:614:3: ( () otherlv_52= 'typedef' otherlv_53= 'long' ( (lv_name_54_0= RULE_ID ) ) otherlv_55= ';' )
                    // InternalSimpleIDL.g:615:4: () otherlv_52= 'typedef' otherlv_53= 'long' ( (lv_name_54_0= RULE_ID ) ) otherlv_55= ';'
                    {
                    // InternalSimpleIDL.g:615:4: ()
                    // InternalSimpleIDL.g:616:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNamedDefinitionAccess().getSignedLongIntAction_6_0(),
                    						current);
                    				

                    }

                    otherlv_52=(Token)match(input,25,FOLLOW_22); 

                    				newLeafNode(otherlv_52, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_6_1());
                    			
                    otherlv_53=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_53, grammarAccess.getNamedDefinitionAccess().getLongKeyword_6_2());
                    			
                    // InternalSimpleIDL.g:630:4: ( (lv_name_54_0= RULE_ID ) )
                    // InternalSimpleIDL.g:631:5: (lv_name_54_0= RULE_ID )
                    {
                    // InternalSimpleIDL.g:631:5: (lv_name_54_0= RULE_ID )
                    // InternalSimpleIDL.g:632:6: lv_name_54_0= RULE_ID
                    {
                    lv_name_54_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_54_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_6_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_54_0,
                    							"org.osate.simpleidl.SimpleIDL.ID");
                    					

                    }


                    }

                    otherlv_55=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_55, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_6_4());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSimpleIDL.g:654:3: ( () otherlv_57= 'typedef' otherlv_58= 'long' otherlv_59= 'long' ( (lv_name_60_0= RULE_ID ) ) otherlv_61= ';' )
                    {
                    // InternalSimpleIDL.g:654:3: ( () otherlv_57= 'typedef' otherlv_58= 'long' otherlv_59= 'long' ( (lv_name_60_0= RULE_ID ) ) otherlv_61= ';' )
                    // InternalSimpleIDL.g:655:4: () otherlv_57= 'typedef' otherlv_58= 'long' otherlv_59= 'long' ( (lv_name_60_0= RULE_ID ) ) otherlv_61= ';'
                    {
                    // InternalSimpleIDL.g:655:4: ()
                    // InternalSimpleIDL.g:656:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNamedDefinitionAccess().getSignedLongLongIntAction_7_0(),
                    						current);
                    				

                    }

                    otherlv_57=(Token)match(input,25,FOLLOW_22); 

                    				newLeafNode(otherlv_57, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_7_1());
                    			
                    otherlv_58=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_58, grammarAccess.getNamedDefinitionAccess().getLongKeyword_7_2());
                    			
                    otherlv_59=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_59, grammarAccess.getNamedDefinitionAccess().getLongKeyword_7_3());
                    			
                    // InternalSimpleIDL.g:674:4: ( (lv_name_60_0= RULE_ID ) )
                    // InternalSimpleIDL.g:675:5: (lv_name_60_0= RULE_ID )
                    {
                    // InternalSimpleIDL.g:675:5: (lv_name_60_0= RULE_ID )
                    // InternalSimpleIDL.g:676:6: lv_name_60_0= RULE_ID
                    {
                    lv_name_60_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_60_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_7_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_60_0,
                    							"org.osate.simpleidl.SimpleIDL.ID");
                    					

                    }


                    }

                    otherlv_61=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_61, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_7_5());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalSimpleIDL.g:698:3: ( () otherlv_63= 'typedef' otherlv_64= 'unsigned' otherlv_65= 'short' ( (lv_name_66_0= RULE_ID ) ) otherlv_67= ';' )
                    {
                    // InternalSimpleIDL.g:698:3: ( () otherlv_63= 'typedef' otherlv_64= 'unsigned' otherlv_65= 'short' ( (lv_name_66_0= RULE_ID ) ) otherlv_67= ';' )
                    // InternalSimpleIDL.g:699:4: () otherlv_63= 'typedef' otherlv_64= 'unsigned' otherlv_65= 'short' ( (lv_name_66_0= RULE_ID ) ) otherlv_67= ';'
                    {
                    // InternalSimpleIDL.g:699:4: ()
                    // InternalSimpleIDL.g:700:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNamedDefinitionAccess().getUnsignedShortIntAction_8_0(),
                    						current);
                    				

                    }

                    otherlv_63=(Token)match(input,25,FOLLOW_12); 

                    				newLeafNode(otherlv_63, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_8_1());
                    			
                    otherlv_64=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_64, grammarAccess.getNamedDefinitionAccess().getUnsignedKeyword_8_2());
                    			
                    otherlv_65=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_65, grammarAccess.getNamedDefinitionAccess().getShortKeyword_8_3());
                    			
                    // InternalSimpleIDL.g:718:4: ( (lv_name_66_0= RULE_ID ) )
                    // InternalSimpleIDL.g:719:5: (lv_name_66_0= RULE_ID )
                    {
                    // InternalSimpleIDL.g:719:5: (lv_name_66_0= RULE_ID )
                    // InternalSimpleIDL.g:720:6: lv_name_66_0= RULE_ID
                    {
                    lv_name_66_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_66_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_8_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_66_0,
                    							"org.osate.simpleidl.SimpleIDL.ID");
                    					

                    }


                    }

                    otherlv_67=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_67, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_8_5());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalSimpleIDL.g:742:3: ( () otherlv_69= 'typedef' otherlv_70= 'unsigned' otherlv_71= 'long' ( (lv_name_72_0= RULE_ID ) ) otherlv_73= ';' )
                    {
                    // InternalSimpleIDL.g:742:3: ( () otherlv_69= 'typedef' otherlv_70= 'unsigned' otherlv_71= 'long' ( (lv_name_72_0= RULE_ID ) ) otherlv_73= ';' )
                    // InternalSimpleIDL.g:743:4: () otherlv_69= 'typedef' otherlv_70= 'unsigned' otherlv_71= 'long' ( (lv_name_72_0= RULE_ID ) ) otherlv_73= ';'
                    {
                    // InternalSimpleIDL.g:743:4: ()
                    // InternalSimpleIDL.g:744:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNamedDefinitionAccess().getUnsignedLongIntAction_9_0(),
                    						current);
                    				

                    }

                    otherlv_69=(Token)match(input,25,FOLLOW_12); 

                    				newLeafNode(otherlv_69, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_9_1());
                    			
                    otherlv_70=(Token)match(input,20,FOLLOW_22); 

                    				newLeafNode(otherlv_70, grammarAccess.getNamedDefinitionAccess().getUnsignedKeyword_9_2());
                    			
                    otherlv_71=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_71, grammarAccess.getNamedDefinitionAccess().getLongKeyword_9_3());
                    			
                    // InternalSimpleIDL.g:762:4: ( (lv_name_72_0= RULE_ID ) )
                    // InternalSimpleIDL.g:763:5: (lv_name_72_0= RULE_ID )
                    {
                    // InternalSimpleIDL.g:763:5: (lv_name_72_0= RULE_ID )
                    // InternalSimpleIDL.g:764:6: lv_name_72_0= RULE_ID
                    {
                    lv_name_72_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_72_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_9_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_72_0,
                    							"org.osate.simpleidl.SimpleIDL.ID");
                    					

                    }


                    }

                    otherlv_73=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_73, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_9_5());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalSimpleIDL.g:786:3: ( () otherlv_75= 'typedef' otherlv_76= 'unsigned' otherlv_77= 'long' otherlv_78= 'long' ( (lv_name_79_0= RULE_ID ) ) otherlv_80= ';' )
                    {
                    // InternalSimpleIDL.g:786:3: ( () otherlv_75= 'typedef' otherlv_76= 'unsigned' otherlv_77= 'long' otherlv_78= 'long' ( (lv_name_79_0= RULE_ID ) ) otherlv_80= ';' )
                    // InternalSimpleIDL.g:787:4: () otherlv_75= 'typedef' otherlv_76= 'unsigned' otherlv_77= 'long' otherlv_78= 'long' ( (lv_name_79_0= RULE_ID ) ) otherlv_80= ';'
                    {
                    // InternalSimpleIDL.g:787:4: ()
                    // InternalSimpleIDL.g:788:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNamedDefinitionAccess().getUnsignedLongLongIntAction_10_0(),
                    						current);
                    				

                    }

                    otherlv_75=(Token)match(input,25,FOLLOW_12); 

                    				newLeafNode(otherlv_75, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_10_1());
                    			
                    otherlv_76=(Token)match(input,20,FOLLOW_22); 

                    				newLeafNode(otherlv_76, grammarAccess.getNamedDefinitionAccess().getUnsignedKeyword_10_2());
                    			
                    otherlv_77=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_77, grammarAccess.getNamedDefinitionAccess().getLongKeyword_10_3());
                    			
                    otherlv_78=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_78, grammarAccess.getNamedDefinitionAccess().getLongKeyword_10_4());
                    			
                    // InternalSimpleIDL.g:810:4: ( (lv_name_79_0= RULE_ID ) )
                    // InternalSimpleIDL.g:811:5: (lv_name_79_0= RULE_ID )
                    {
                    // InternalSimpleIDL.g:811:5: (lv_name_79_0= RULE_ID )
                    // InternalSimpleIDL.g:812:6: lv_name_79_0= RULE_ID
                    {
                    lv_name_79_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_79_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_10_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_79_0,
                    							"org.osate.simpleidl.SimpleIDL.ID");
                    					

                    }


                    }

                    otherlv_80=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_80, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_10_6());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalSimpleIDL.g:834:3: ( () otherlv_82= 'typedef' otherlv_83= 'float' ( (lv_name_84_0= RULE_ID ) ) otherlv_85= ';' )
                    {
                    // InternalSimpleIDL.g:834:3: ( () otherlv_82= 'typedef' otherlv_83= 'float' ( (lv_name_84_0= RULE_ID ) ) otherlv_85= ';' )
                    // InternalSimpleIDL.g:835:4: () otherlv_82= 'typedef' otherlv_83= 'float' ( (lv_name_84_0= RULE_ID ) ) otherlv_85= ';'
                    {
                    // InternalSimpleIDL.g:835:4: ()
                    // InternalSimpleIDL.g:836:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNamedDefinitionAccess().getFloatTypeAction_11_0(),
                    						current);
                    				

                    }

                    otherlv_82=(Token)match(input,25,FOLLOW_23); 

                    				newLeafNode(otherlv_82, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_11_1());
                    			
                    otherlv_83=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_83, grammarAccess.getNamedDefinitionAccess().getFloatKeyword_11_2());
                    			
                    // InternalSimpleIDL.g:850:4: ( (lv_name_84_0= RULE_ID ) )
                    // InternalSimpleIDL.g:851:5: (lv_name_84_0= RULE_ID )
                    {
                    // InternalSimpleIDL.g:851:5: (lv_name_84_0= RULE_ID )
                    // InternalSimpleIDL.g:852:6: lv_name_84_0= RULE_ID
                    {
                    lv_name_84_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_84_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_11_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_84_0,
                    							"org.osate.simpleidl.SimpleIDL.ID");
                    					

                    }


                    }

                    otherlv_85=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_85, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_11_4());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalSimpleIDL.g:874:3: ( () otherlv_87= 'typedef' otherlv_88= 'double' ( (lv_name_89_0= RULE_ID ) ) otherlv_90= ';' )
                    {
                    // InternalSimpleIDL.g:874:3: ( () otherlv_87= 'typedef' otherlv_88= 'double' ( (lv_name_89_0= RULE_ID ) ) otherlv_90= ';' )
                    // InternalSimpleIDL.g:875:4: () otherlv_87= 'typedef' otherlv_88= 'double' ( (lv_name_89_0= RULE_ID ) ) otherlv_90= ';'
                    {
                    // InternalSimpleIDL.g:875:4: ()
                    // InternalSimpleIDL.g:876:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNamedDefinitionAccess().getDoubleTypeAction_12_0(),
                    						current);
                    				

                    }

                    otherlv_87=(Token)match(input,25,FOLLOW_24); 

                    				newLeafNode(otherlv_87, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_12_1());
                    			
                    otherlv_88=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_88, grammarAccess.getNamedDefinitionAccess().getDoubleKeyword_12_2());
                    			
                    // InternalSimpleIDL.g:890:4: ( (lv_name_89_0= RULE_ID ) )
                    // InternalSimpleIDL.g:891:5: (lv_name_89_0= RULE_ID )
                    {
                    // InternalSimpleIDL.g:891:5: (lv_name_89_0= RULE_ID )
                    // InternalSimpleIDL.g:892:6: lv_name_89_0= RULE_ID
                    {
                    lv_name_89_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_89_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_12_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_89_0,
                    							"org.osate.simpleidl.SimpleIDL.ID");
                    					

                    }


                    }

                    otherlv_90=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_90, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_12_4());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalSimpleIDL.g:914:3: ( () otherlv_92= 'typedef' otherlv_93= 'long' otherlv_94= 'double' ( (lv_name_95_0= RULE_ID ) ) otherlv_96= ';' )
                    {
                    // InternalSimpleIDL.g:914:3: ( () otherlv_92= 'typedef' otherlv_93= 'long' otherlv_94= 'double' ( (lv_name_95_0= RULE_ID ) ) otherlv_96= ';' )
                    // InternalSimpleIDL.g:915:4: () otherlv_92= 'typedef' otherlv_93= 'long' otherlv_94= 'double' ( (lv_name_95_0= RULE_ID ) ) otherlv_96= ';'
                    {
                    // InternalSimpleIDL.g:915:4: ()
                    // InternalSimpleIDL.g:916:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNamedDefinitionAccess().getLongDoubleTypeAction_13_0(),
                    						current);
                    				

                    }

                    otherlv_92=(Token)match(input,25,FOLLOW_22); 

                    				newLeafNode(otherlv_92, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_13_1());
                    			
                    otherlv_93=(Token)match(input,28,FOLLOW_24); 

                    				newLeafNode(otherlv_93, grammarAccess.getNamedDefinitionAccess().getLongKeyword_13_2());
                    			
                    otherlv_94=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_94, grammarAccess.getNamedDefinitionAccess().getDoubleKeyword_13_3());
                    			
                    // InternalSimpleIDL.g:934:4: ( (lv_name_95_0= RULE_ID ) )
                    // InternalSimpleIDL.g:935:5: (lv_name_95_0= RULE_ID )
                    {
                    // InternalSimpleIDL.g:935:5: (lv_name_95_0= RULE_ID )
                    // InternalSimpleIDL.g:936:6: lv_name_95_0= RULE_ID
                    {
                    lv_name_95_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_95_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_13_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_95_0,
                    							"org.osate.simpleidl.SimpleIDL.ID");
                    					

                    }


                    }

                    otherlv_96=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_96, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_13_5());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalSimpleIDL.g:958:3: ( () otherlv_98= 'typedef' otherlv_99= 'char' ( (lv_name_100_0= RULE_ID ) ) otherlv_101= ';' )
                    {
                    // InternalSimpleIDL.g:958:3: ( () otherlv_98= 'typedef' otherlv_99= 'char' ( (lv_name_100_0= RULE_ID ) ) otherlv_101= ';' )
                    // InternalSimpleIDL.g:959:4: () otherlv_98= 'typedef' otherlv_99= 'char' ( (lv_name_100_0= RULE_ID ) ) otherlv_101= ';'
                    {
                    // InternalSimpleIDL.g:959:4: ()
                    // InternalSimpleIDL.g:960:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNamedDefinitionAccess().getCharTypeAction_14_0(),
                    						current);
                    				

                    }

                    otherlv_98=(Token)match(input,25,FOLLOW_25); 

                    				newLeafNode(otherlv_98, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_14_1());
                    			
                    otherlv_99=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_99, grammarAccess.getNamedDefinitionAccess().getCharKeyword_14_2());
                    			
                    // InternalSimpleIDL.g:974:4: ( (lv_name_100_0= RULE_ID ) )
                    // InternalSimpleIDL.g:975:5: (lv_name_100_0= RULE_ID )
                    {
                    // InternalSimpleIDL.g:975:5: (lv_name_100_0= RULE_ID )
                    // InternalSimpleIDL.g:976:6: lv_name_100_0= RULE_ID
                    {
                    lv_name_100_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_100_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_14_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_100_0,
                    							"org.osate.simpleidl.SimpleIDL.ID");
                    					

                    }


                    }

                    otherlv_101=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_101, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_14_4());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalSimpleIDL.g:998:3: ( () otherlv_103= 'typedef' otherlv_104= 'wchar' ( (lv_name_105_0= RULE_ID ) ) otherlv_106= ';' )
                    {
                    // InternalSimpleIDL.g:998:3: ( () otherlv_103= 'typedef' otherlv_104= 'wchar' ( (lv_name_105_0= RULE_ID ) ) otherlv_106= ';' )
                    // InternalSimpleIDL.g:999:4: () otherlv_103= 'typedef' otherlv_104= 'wchar' ( (lv_name_105_0= RULE_ID ) ) otherlv_106= ';'
                    {
                    // InternalSimpleIDL.g:999:4: ()
                    // InternalSimpleIDL.g:1000:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNamedDefinitionAccess().getWideCharTypeAction_15_0(),
                    						current);
                    				

                    }

                    otherlv_103=(Token)match(input,25,FOLLOW_26); 

                    				newLeafNode(otherlv_103, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_15_1());
                    			
                    otherlv_104=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_104, grammarAccess.getNamedDefinitionAccess().getWcharKeyword_15_2());
                    			
                    // InternalSimpleIDL.g:1014:4: ( (lv_name_105_0= RULE_ID ) )
                    // InternalSimpleIDL.g:1015:5: (lv_name_105_0= RULE_ID )
                    {
                    // InternalSimpleIDL.g:1015:5: (lv_name_105_0= RULE_ID )
                    // InternalSimpleIDL.g:1016:6: lv_name_105_0= RULE_ID
                    {
                    lv_name_105_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_105_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_15_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_105_0,
                    							"org.osate.simpleidl.SimpleIDL.ID");
                    					

                    }


                    }

                    otherlv_106=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_106, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_15_4());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalSimpleIDL.g:1038:3: ( () otherlv_108= 'typedef' otherlv_109= 'boolean' ( (lv_name_110_0= RULE_ID ) ) otherlv_111= ';' )
                    {
                    // InternalSimpleIDL.g:1038:3: ( () otherlv_108= 'typedef' otherlv_109= 'boolean' ( (lv_name_110_0= RULE_ID ) ) otherlv_111= ';' )
                    // InternalSimpleIDL.g:1039:4: () otherlv_108= 'typedef' otherlv_109= 'boolean' ( (lv_name_110_0= RULE_ID ) ) otherlv_111= ';'
                    {
                    // InternalSimpleIDL.g:1039:4: ()
                    // InternalSimpleIDL.g:1040:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNamedDefinitionAccess().getBooleanTypeAction_16_0(),
                    						current);
                    				

                    }

                    otherlv_108=(Token)match(input,25,FOLLOW_27); 

                    				newLeafNode(otherlv_108, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_16_1());
                    			
                    otherlv_109=(Token)match(input,33,FOLLOW_4); 

                    				newLeafNode(otherlv_109, grammarAccess.getNamedDefinitionAccess().getBooleanKeyword_16_2());
                    			
                    // InternalSimpleIDL.g:1054:4: ( (lv_name_110_0= RULE_ID ) )
                    // InternalSimpleIDL.g:1055:5: (lv_name_110_0= RULE_ID )
                    {
                    // InternalSimpleIDL.g:1055:5: (lv_name_110_0= RULE_ID )
                    // InternalSimpleIDL.g:1056:6: lv_name_110_0= RULE_ID
                    {
                    lv_name_110_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_110_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_16_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_110_0,
                    							"org.osate.simpleidl.SimpleIDL.ID");
                    					

                    }


                    }

                    otherlv_111=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_111, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_16_4());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalSimpleIDL.g:1078:3: ( () otherlv_113= 'typedef' otherlv_114= 'octet' ( (lv_name_115_0= RULE_ID ) ) otherlv_116= ';' )
                    {
                    // InternalSimpleIDL.g:1078:3: ( () otherlv_113= 'typedef' otherlv_114= 'octet' ( (lv_name_115_0= RULE_ID ) ) otherlv_116= ';' )
                    // InternalSimpleIDL.g:1079:4: () otherlv_113= 'typedef' otherlv_114= 'octet' ( (lv_name_115_0= RULE_ID ) ) otherlv_116= ';'
                    {
                    // InternalSimpleIDL.g:1079:4: ()
                    // InternalSimpleIDL.g:1080:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNamedDefinitionAccess().getOctetTypeAction_17_0(),
                    						current);
                    				

                    }

                    otherlv_113=(Token)match(input,25,FOLLOW_28); 

                    				newLeafNode(otherlv_113, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_17_1());
                    			
                    otherlv_114=(Token)match(input,34,FOLLOW_4); 

                    				newLeafNode(otherlv_114, grammarAccess.getNamedDefinitionAccess().getOctetKeyword_17_2());
                    			
                    // InternalSimpleIDL.g:1094:4: ( (lv_name_115_0= RULE_ID ) )
                    // InternalSimpleIDL.g:1095:5: (lv_name_115_0= RULE_ID )
                    {
                    // InternalSimpleIDL.g:1095:5: (lv_name_115_0= RULE_ID )
                    // InternalSimpleIDL.g:1096:6: lv_name_115_0= RULE_ID
                    {
                    lv_name_115_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_115_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_17_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_115_0,
                    							"org.osate.simpleidl.SimpleIDL.ID");
                    					

                    }


                    }

                    otherlv_116=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_116, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_17_4());
                    			

                    }


                    }
                    break;
                case 19 :
                    // InternalSimpleIDL.g:1118:3: ( () otherlv_118= 'typedef' ( ( ruleScopedName ) ) ( (lv_name_120_0= RULE_ID ) ) otherlv_121= ';' )
                    {
                    // InternalSimpleIDL.g:1118:3: ( () otherlv_118= 'typedef' ( ( ruleScopedName ) ) ( (lv_name_120_0= RULE_ID ) ) otherlv_121= ';' )
                    // InternalSimpleIDL.g:1119:4: () otherlv_118= 'typedef' ( ( ruleScopedName ) ) ( (lv_name_120_0= RULE_ID ) ) otherlv_121= ';'
                    {
                    // InternalSimpleIDL.g:1119:4: ()
                    // InternalSimpleIDL.g:1120:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNamedDefinitionAccess().getReferencedTypeAction_18_0(),
                    						current);
                    				

                    }

                    otherlv_118=(Token)match(input,25,FOLLOW_8); 

                    				newLeafNode(otherlv_118, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_18_1());
                    			
                    // InternalSimpleIDL.g:1130:4: ( ( ruleScopedName ) )
                    // InternalSimpleIDL.g:1131:5: ( ruleScopedName )
                    {
                    // InternalSimpleIDL.g:1131:5: ( ruleScopedName )
                    // InternalSimpleIDL.g:1132:6: ruleScopedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionCrossReference_18_2_0());
                    					
                    pushFollow(FOLLOW_4);
                    ruleScopedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSimpleIDL.g:1146:4: ( (lv_name_120_0= RULE_ID ) )
                    // InternalSimpleIDL.g:1147:5: (lv_name_120_0= RULE_ID )
                    {
                    // InternalSimpleIDL.g:1147:5: (lv_name_120_0= RULE_ID )
                    // InternalSimpleIDL.g:1148:6: lv_name_120_0= RULE_ID
                    {
                    lv_name_120_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_120_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_18_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_120_0,
                    							"org.osate.simpleidl.SimpleIDL.ID");
                    					

                    }


                    }

                    otherlv_121=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_121, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_18_4());
                    			

                    }


                    }
                    break;
                case 20 :
                    // InternalSimpleIDL.g:1170:3: ( () otherlv_123= 'typedef' otherlv_124= 'sequence' otherlv_125= '<' ( ( ruleScopedName ) ) otherlv_127= ',' ( (lv_size_128_0= RULE_INT ) ) otherlv_129= '>' ( (lv_name_130_0= RULE_ID ) ) otherlv_131= ';' )
                    {
                    // InternalSimpleIDL.g:1170:3: ( () otherlv_123= 'typedef' otherlv_124= 'sequence' otherlv_125= '<' ( ( ruleScopedName ) ) otherlv_127= ',' ( (lv_size_128_0= RULE_INT ) ) otherlv_129= '>' ( (lv_name_130_0= RULE_ID ) ) otherlv_131= ';' )
                    // InternalSimpleIDL.g:1171:4: () otherlv_123= 'typedef' otherlv_124= 'sequence' otherlv_125= '<' ( ( ruleScopedName ) ) otherlv_127= ',' ( (lv_size_128_0= RULE_INT ) ) otherlv_129= '>' ( (lv_name_130_0= RULE_ID ) ) otherlv_131= ';'
                    {
                    // InternalSimpleIDL.g:1171:4: ()
                    // InternalSimpleIDL.g:1172:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNamedDefinitionAccess().getBoundedSequenceAction_19_0(),
                    						current);
                    				

                    }

                    otherlv_123=(Token)match(input,25,FOLLOW_29); 

                    				newLeafNode(otherlv_123, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_19_1());
                    			
                    otherlv_124=(Token)match(input,35,FOLLOW_30); 

                    				newLeafNode(otherlv_124, grammarAccess.getNamedDefinitionAccess().getSequenceKeyword_19_2());
                    			
                    otherlv_125=(Token)match(input,36,FOLLOW_8); 

                    				newLeafNode(otherlv_125, grammarAccess.getNamedDefinitionAccess().getLessThanSignKeyword_19_3());
                    			
                    // InternalSimpleIDL.g:1190:4: ( ( ruleScopedName ) )
                    // InternalSimpleIDL.g:1191:5: ( ruleScopedName )
                    {
                    // InternalSimpleIDL.g:1191:5: ( ruleScopedName )
                    // InternalSimpleIDL.g:1192:6: ruleScopedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionCrossReference_19_4_0());
                    					
                    pushFollow(FOLLOW_31);
                    ruleScopedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_127=(Token)match(input,24,FOLLOW_20); 

                    				newLeafNode(otherlv_127, grammarAccess.getNamedDefinitionAccess().getCommaKeyword_19_5());
                    			
                    // InternalSimpleIDL.g:1210:4: ( (lv_size_128_0= RULE_INT ) )
                    // InternalSimpleIDL.g:1211:5: (lv_size_128_0= RULE_INT )
                    {
                    // InternalSimpleIDL.g:1211:5: (lv_size_128_0= RULE_INT )
                    // InternalSimpleIDL.g:1212:6: lv_size_128_0= RULE_INT
                    {
                    lv_size_128_0=(Token)match(input,RULE_INT,FOLLOW_32); 

                    						newLeafNode(lv_size_128_0, grammarAccess.getNamedDefinitionAccess().getSizeINTTerminalRuleCall_19_6_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"size",
                    							lv_size_128_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_129=(Token)match(input,37,FOLLOW_4); 

                    				newLeafNode(otherlv_129, grammarAccess.getNamedDefinitionAccess().getGreaterThanSignKeyword_19_7());
                    			
                    // InternalSimpleIDL.g:1232:4: ( (lv_name_130_0= RULE_ID ) )
                    // InternalSimpleIDL.g:1233:5: (lv_name_130_0= RULE_ID )
                    {
                    // InternalSimpleIDL.g:1233:5: (lv_name_130_0= RULE_ID )
                    // InternalSimpleIDL.g:1234:6: lv_name_130_0= RULE_ID
                    {
                    lv_name_130_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_130_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_19_8_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_130_0,
                    							"org.osate.simpleidl.SimpleIDL.ID");
                    					

                    }


                    }

                    otherlv_131=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_131, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_19_9());
                    			

                    }


                    }
                    break;
                case 21 :
                    // InternalSimpleIDL.g:1256:3: ( () otherlv_133= 'typedef' otherlv_134= 'sequence' otherlv_135= '<' ( ( ruleScopedName ) ) otherlv_137= '>' ( (lv_name_138_0= RULE_ID ) ) otherlv_139= ';' )
                    {
                    // InternalSimpleIDL.g:1256:3: ( () otherlv_133= 'typedef' otherlv_134= 'sequence' otherlv_135= '<' ( ( ruleScopedName ) ) otherlv_137= '>' ( (lv_name_138_0= RULE_ID ) ) otherlv_139= ';' )
                    // InternalSimpleIDL.g:1257:4: () otherlv_133= 'typedef' otherlv_134= 'sequence' otherlv_135= '<' ( ( ruleScopedName ) ) otherlv_137= '>' ( (lv_name_138_0= RULE_ID ) ) otherlv_139= ';'
                    {
                    // InternalSimpleIDL.g:1257:4: ()
                    // InternalSimpleIDL.g:1258:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNamedDefinitionAccess().getUnboundedSequenceAction_20_0(),
                    						current);
                    				

                    }

                    otherlv_133=(Token)match(input,25,FOLLOW_29); 

                    				newLeafNode(otherlv_133, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_20_1());
                    			
                    otherlv_134=(Token)match(input,35,FOLLOW_30); 

                    				newLeafNode(otherlv_134, grammarAccess.getNamedDefinitionAccess().getSequenceKeyword_20_2());
                    			
                    otherlv_135=(Token)match(input,36,FOLLOW_8); 

                    				newLeafNode(otherlv_135, grammarAccess.getNamedDefinitionAccess().getLessThanSignKeyword_20_3());
                    			
                    // InternalSimpleIDL.g:1276:4: ( ( ruleScopedName ) )
                    // InternalSimpleIDL.g:1277:5: ( ruleScopedName )
                    {
                    // InternalSimpleIDL.g:1277:5: ( ruleScopedName )
                    // InternalSimpleIDL.g:1278:6: ruleScopedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionCrossReference_20_4_0());
                    					
                    pushFollow(FOLLOW_32);
                    ruleScopedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_137=(Token)match(input,37,FOLLOW_4); 

                    				newLeafNode(otherlv_137, grammarAccess.getNamedDefinitionAccess().getGreaterThanSignKeyword_20_5());
                    			
                    // InternalSimpleIDL.g:1296:4: ( (lv_name_138_0= RULE_ID ) )
                    // InternalSimpleIDL.g:1297:5: (lv_name_138_0= RULE_ID )
                    {
                    // InternalSimpleIDL.g:1297:5: (lv_name_138_0= RULE_ID )
                    // InternalSimpleIDL.g:1298:6: lv_name_138_0= RULE_ID
                    {
                    lv_name_138_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_138_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_20_6_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_138_0,
                    							"org.osate.simpleidl.SimpleIDL.ID");
                    					

                    }


                    }

                    otherlv_139=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_139, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_20_7());
                    			

                    }


                    }
                    break;
                case 22 :
                    // InternalSimpleIDL.g:1320:3: ( () otherlv_141= 'typedef' otherlv_142= 'string' otherlv_143= '<' ( (lv_size_144_0= RULE_INT ) ) otherlv_145= '>' ( (lv_name_146_0= RULE_ID ) ) otherlv_147= ';' )
                    {
                    // InternalSimpleIDL.g:1320:3: ( () otherlv_141= 'typedef' otherlv_142= 'string' otherlv_143= '<' ( (lv_size_144_0= RULE_INT ) ) otherlv_145= '>' ( (lv_name_146_0= RULE_ID ) ) otherlv_147= ';' )
                    // InternalSimpleIDL.g:1321:4: () otherlv_141= 'typedef' otherlv_142= 'string' otherlv_143= '<' ( (lv_size_144_0= RULE_INT ) ) otherlv_145= '>' ( (lv_name_146_0= RULE_ID ) ) otherlv_147= ';'
                    {
                    // InternalSimpleIDL.g:1321:4: ()
                    // InternalSimpleIDL.g:1322:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNamedDefinitionAccess().getBoundedStringAction_21_0(),
                    						current);
                    				

                    }

                    otherlv_141=(Token)match(input,25,FOLLOW_33); 

                    				newLeafNode(otherlv_141, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_21_1());
                    			
                    otherlv_142=(Token)match(input,38,FOLLOW_30); 

                    				newLeafNode(otherlv_142, grammarAccess.getNamedDefinitionAccess().getStringKeyword_21_2());
                    			
                    otherlv_143=(Token)match(input,36,FOLLOW_20); 

                    				newLeafNode(otherlv_143, grammarAccess.getNamedDefinitionAccess().getLessThanSignKeyword_21_3());
                    			
                    // InternalSimpleIDL.g:1340:4: ( (lv_size_144_0= RULE_INT ) )
                    // InternalSimpleIDL.g:1341:5: (lv_size_144_0= RULE_INT )
                    {
                    // InternalSimpleIDL.g:1341:5: (lv_size_144_0= RULE_INT )
                    // InternalSimpleIDL.g:1342:6: lv_size_144_0= RULE_INT
                    {
                    lv_size_144_0=(Token)match(input,RULE_INT,FOLLOW_32); 

                    						newLeafNode(lv_size_144_0, grammarAccess.getNamedDefinitionAccess().getSizeINTTerminalRuleCall_21_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"size",
                    							lv_size_144_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_145=(Token)match(input,37,FOLLOW_4); 

                    				newLeafNode(otherlv_145, grammarAccess.getNamedDefinitionAccess().getGreaterThanSignKeyword_21_5());
                    			
                    // InternalSimpleIDL.g:1362:4: ( (lv_name_146_0= RULE_ID ) )
                    // InternalSimpleIDL.g:1363:5: (lv_name_146_0= RULE_ID )
                    {
                    // InternalSimpleIDL.g:1363:5: (lv_name_146_0= RULE_ID )
                    // InternalSimpleIDL.g:1364:6: lv_name_146_0= RULE_ID
                    {
                    lv_name_146_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_146_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_21_6_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_146_0,
                    							"org.osate.simpleidl.SimpleIDL.ID");
                    					

                    }


                    }

                    otherlv_147=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_147, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_21_7());
                    			

                    }


                    }
                    break;
                case 23 :
                    // InternalSimpleIDL.g:1386:3: ( () otherlv_149= 'typedef' otherlv_150= 'string' ( (lv_name_151_0= RULE_ID ) ) otherlv_152= ';' )
                    {
                    // InternalSimpleIDL.g:1386:3: ( () otherlv_149= 'typedef' otherlv_150= 'string' ( (lv_name_151_0= RULE_ID ) ) otherlv_152= ';' )
                    // InternalSimpleIDL.g:1387:4: () otherlv_149= 'typedef' otherlv_150= 'string' ( (lv_name_151_0= RULE_ID ) ) otherlv_152= ';'
                    {
                    // InternalSimpleIDL.g:1387:4: ()
                    // InternalSimpleIDL.g:1388:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNamedDefinitionAccess().getUnboundedStringAction_22_0(),
                    						current);
                    				

                    }

                    otherlv_149=(Token)match(input,25,FOLLOW_33); 

                    				newLeafNode(otherlv_149, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_22_1());
                    			
                    otherlv_150=(Token)match(input,38,FOLLOW_4); 

                    				newLeafNode(otherlv_150, grammarAccess.getNamedDefinitionAccess().getStringKeyword_22_2());
                    			
                    // InternalSimpleIDL.g:1402:4: ( (lv_name_151_0= RULE_ID ) )
                    // InternalSimpleIDL.g:1403:5: (lv_name_151_0= RULE_ID )
                    {
                    // InternalSimpleIDL.g:1403:5: (lv_name_151_0= RULE_ID )
                    // InternalSimpleIDL.g:1404:6: lv_name_151_0= RULE_ID
                    {
                    lv_name_151_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_151_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_22_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_151_0,
                    							"org.osate.simpleidl.SimpleIDL.ID");
                    					

                    }


                    }

                    otherlv_152=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_152, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_22_4());
                    			

                    }


                    }
                    break;
                case 24 :
                    // InternalSimpleIDL.g:1426:3: ( () otherlv_154= 'typedef' otherlv_155= 'wstring' otherlv_156= '<' ( (lv_size_157_0= RULE_INT ) ) otherlv_158= '>' ( (lv_name_159_0= RULE_ID ) ) otherlv_160= ';' )
                    {
                    // InternalSimpleIDL.g:1426:3: ( () otherlv_154= 'typedef' otherlv_155= 'wstring' otherlv_156= '<' ( (lv_size_157_0= RULE_INT ) ) otherlv_158= '>' ( (lv_name_159_0= RULE_ID ) ) otherlv_160= ';' )
                    // InternalSimpleIDL.g:1427:4: () otherlv_154= 'typedef' otherlv_155= 'wstring' otherlv_156= '<' ( (lv_size_157_0= RULE_INT ) ) otherlv_158= '>' ( (lv_name_159_0= RULE_ID ) ) otherlv_160= ';'
                    {
                    // InternalSimpleIDL.g:1427:4: ()
                    // InternalSimpleIDL.g:1428:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNamedDefinitionAccess().getBoundedWideStringAction_23_0(),
                    						current);
                    				

                    }

                    otherlv_154=(Token)match(input,25,FOLLOW_34); 

                    				newLeafNode(otherlv_154, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_23_1());
                    			
                    otherlv_155=(Token)match(input,39,FOLLOW_30); 

                    				newLeafNode(otherlv_155, grammarAccess.getNamedDefinitionAccess().getWstringKeyword_23_2());
                    			
                    otherlv_156=(Token)match(input,36,FOLLOW_20); 

                    				newLeafNode(otherlv_156, grammarAccess.getNamedDefinitionAccess().getLessThanSignKeyword_23_3());
                    			
                    // InternalSimpleIDL.g:1446:4: ( (lv_size_157_0= RULE_INT ) )
                    // InternalSimpleIDL.g:1447:5: (lv_size_157_0= RULE_INT )
                    {
                    // InternalSimpleIDL.g:1447:5: (lv_size_157_0= RULE_INT )
                    // InternalSimpleIDL.g:1448:6: lv_size_157_0= RULE_INT
                    {
                    lv_size_157_0=(Token)match(input,RULE_INT,FOLLOW_32); 

                    						newLeafNode(lv_size_157_0, grammarAccess.getNamedDefinitionAccess().getSizeINTTerminalRuleCall_23_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"size",
                    							lv_size_157_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_158=(Token)match(input,37,FOLLOW_4); 

                    				newLeafNode(otherlv_158, grammarAccess.getNamedDefinitionAccess().getGreaterThanSignKeyword_23_5());
                    			
                    // InternalSimpleIDL.g:1468:4: ( (lv_name_159_0= RULE_ID ) )
                    // InternalSimpleIDL.g:1469:5: (lv_name_159_0= RULE_ID )
                    {
                    // InternalSimpleIDL.g:1469:5: (lv_name_159_0= RULE_ID )
                    // InternalSimpleIDL.g:1470:6: lv_name_159_0= RULE_ID
                    {
                    lv_name_159_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_159_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_23_6_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_159_0,
                    							"org.osate.simpleidl.SimpleIDL.ID");
                    					

                    }


                    }

                    otherlv_160=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_160, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_23_7());
                    			

                    }


                    }
                    break;
                case 25 :
                    // InternalSimpleIDL.g:1492:3: ( () otherlv_162= 'typedef' otherlv_163= 'wstring' ( (lv_name_164_0= RULE_ID ) ) otherlv_165= ';' )
                    {
                    // InternalSimpleIDL.g:1492:3: ( () otherlv_162= 'typedef' otherlv_163= 'wstring' ( (lv_name_164_0= RULE_ID ) ) otherlv_165= ';' )
                    // InternalSimpleIDL.g:1493:4: () otherlv_162= 'typedef' otherlv_163= 'wstring' ( (lv_name_164_0= RULE_ID ) ) otherlv_165= ';'
                    {
                    // InternalSimpleIDL.g:1493:4: ()
                    // InternalSimpleIDL.g:1494:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNamedDefinitionAccess().getUnboundedWideStringAction_24_0(),
                    						current);
                    				

                    }

                    otherlv_162=(Token)match(input,25,FOLLOW_34); 

                    				newLeafNode(otherlv_162, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_24_1());
                    			
                    otherlv_163=(Token)match(input,39,FOLLOW_4); 

                    				newLeafNode(otherlv_163, grammarAccess.getNamedDefinitionAccess().getWstringKeyword_24_2());
                    			
                    // InternalSimpleIDL.g:1508:4: ( (lv_name_164_0= RULE_ID ) )
                    // InternalSimpleIDL.g:1509:5: (lv_name_164_0= RULE_ID )
                    {
                    // InternalSimpleIDL.g:1509:5: (lv_name_164_0= RULE_ID )
                    // InternalSimpleIDL.g:1510:6: lv_name_164_0= RULE_ID
                    {
                    lv_name_164_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_164_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_24_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_164_0,
                    							"org.osate.simpleidl.SimpleIDL.ID");
                    					

                    }


                    }

                    otherlv_165=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_165, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_24_4());
                    			

                    }


                    }
                    break;
                case 26 :
                    // InternalSimpleIDL.g:1532:3: ( () otherlv_167= 'typedef' otherlv_168= 'fixed' otherlv_169= '<' ( (lv_totalDigits_170_0= RULE_INT ) ) otherlv_171= ',' ( (lv_fractionalDigits_172_0= RULE_INT ) ) otherlv_173= '>' ( (lv_name_174_0= RULE_ID ) ) otherlv_175= ';' )
                    {
                    // InternalSimpleIDL.g:1532:3: ( () otherlv_167= 'typedef' otherlv_168= 'fixed' otherlv_169= '<' ( (lv_totalDigits_170_0= RULE_INT ) ) otherlv_171= ',' ( (lv_fractionalDigits_172_0= RULE_INT ) ) otherlv_173= '>' ( (lv_name_174_0= RULE_ID ) ) otherlv_175= ';' )
                    // InternalSimpleIDL.g:1533:4: () otherlv_167= 'typedef' otherlv_168= 'fixed' otherlv_169= '<' ( (lv_totalDigits_170_0= RULE_INT ) ) otherlv_171= ',' ( (lv_fractionalDigits_172_0= RULE_INT ) ) otherlv_173= '>' ( (lv_name_174_0= RULE_ID ) ) otherlv_175= ';'
                    {
                    // InternalSimpleIDL.g:1533:4: ()
                    // InternalSimpleIDL.g:1534:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNamedDefinitionAccess().getFixedPtTypeAction_25_0(),
                    						current);
                    				

                    }

                    otherlv_167=(Token)match(input,25,FOLLOW_35); 

                    				newLeafNode(otherlv_167, grammarAccess.getNamedDefinitionAccess().getTypedefKeyword_25_1());
                    			
                    otherlv_168=(Token)match(input,40,FOLLOW_30); 

                    				newLeafNode(otherlv_168, grammarAccess.getNamedDefinitionAccess().getFixedKeyword_25_2());
                    			
                    otherlv_169=(Token)match(input,36,FOLLOW_20); 

                    				newLeafNode(otherlv_169, grammarAccess.getNamedDefinitionAccess().getLessThanSignKeyword_25_3());
                    			
                    // InternalSimpleIDL.g:1552:4: ( (lv_totalDigits_170_0= RULE_INT ) )
                    // InternalSimpleIDL.g:1553:5: (lv_totalDigits_170_0= RULE_INT )
                    {
                    // InternalSimpleIDL.g:1553:5: (lv_totalDigits_170_0= RULE_INT )
                    // InternalSimpleIDL.g:1554:6: lv_totalDigits_170_0= RULE_INT
                    {
                    lv_totalDigits_170_0=(Token)match(input,RULE_INT,FOLLOW_31); 

                    						newLeafNode(lv_totalDigits_170_0, grammarAccess.getNamedDefinitionAccess().getTotalDigitsINTTerminalRuleCall_25_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"totalDigits",
                    							lv_totalDigits_170_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_171=(Token)match(input,24,FOLLOW_20); 

                    				newLeafNode(otherlv_171, grammarAccess.getNamedDefinitionAccess().getCommaKeyword_25_5());
                    			
                    // InternalSimpleIDL.g:1574:4: ( (lv_fractionalDigits_172_0= RULE_INT ) )
                    // InternalSimpleIDL.g:1575:5: (lv_fractionalDigits_172_0= RULE_INT )
                    {
                    // InternalSimpleIDL.g:1575:5: (lv_fractionalDigits_172_0= RULE_INT )
                    // InternalSimpleIDL.g:1576:6: lv_fractionalDigits_172_0= RULE_INT
                    {
                    lv_fractionalDigits_172_0=(Token)match(input,RULE_INT,FOLLOW_32); 

                    						newLeafNode(lv_fractionalDigits_172_0, grammarAccess.getNamedDefinitionAccess().getFractionalDigitsINTTerminalRuleCall_25_6_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"fractionalDigits",
                    							lv_fractionalDigits_172_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_173=(Token)match(input,37,FOLLOW_4); 

                    				newLeafNode(otherlv_173, grammarAccess.getNamedDefinitionAccess().getGreaterThanSignKeyword_25_7());
                    			
                    // InternalSimpleIDL.g:1596:4: ( (lv_name_174_0= RULE_ID ) )
                    // InternalSimpleIDL.g:1597:5: (lv_name_174_0= RULE_ID )
                    {
                    // InternalSimpleIDL.g:1597:5: (lv_name_174_0= RULE_ID )
                    // InternalSimpleIDL.g:1598:6: lv_name_174_0= RULE_ID
                    {
                    lv_name_174_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_174_0, grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_25_8_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_174_0,
                    							"org.osate.simpleidl.SimpleIDL.ID");
                    					

                    }


                    }

                    otherlv_175=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_175, grammarAccess.getNamedDefinitionAccess().getSemicolonKeyword_25_9());
                    			

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
    // $ANTLR end "ruleNamedDefinition"


    // $ANTLR start "entryRuleMember"
    // InternalSimpleIDL.g:1623:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalSimpleIDL.g:1623:47: (iv_ruleMember= ruleMember EOF )
            // InternalSimpleIDL.g:1624:2: iv_ruleMember= ruleMember EOF
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
    // InternalSimpleIDL.g:1630:1: ruleMember returns [EObject current=null] : ( ( ( ruleScopedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSimpleIDL.g:1636:2: ( ( ( ( ruleScopedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalSimpleIDL.g:1637:2: ( ( ( ruleScopedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalSimpleIDL.g:1637:2: ( ( ( ruleScopedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalSimpleIDL.g:1638:3: ( ( ruleScopedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // InternalSimpleIDL.g:1638:3: ( ( ruleScopedName ) )
            // InternalSimpleIDL.g:1639:4: ( ruleScopedName )
            {
            // InternalSimpleIDL.g:1639:4: ( ruleScopedName )
            // InternalSimpleIDL.g:1640:5: ruleScopedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemberRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMemberAccess().getTypeNamedDefinitionCrossReference_0_0());
            				
            pushFollow(FOLLOW_4);
            ruleScopedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimpleIDL.g:1654:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSimpleIDL.g:1655:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSimpleIDL.g:1655:4: (lv_name_1_0= RULE_ID )
            // InternalSimpleIDL.g:1656:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

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
    // InternalSimpleIDL.g:1680:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // InternalSimpleIDL.g:1680:45: (iv_ruleCase= ruleCase EOF )
            // InternalSimpleIDL.g:1681:2: iv_ruleCase= ruleCase EOF
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
    // InternalSimpleIDL.g:1687:1: ruleCase returns [EObject current=null] : ( (otherlv_0= 'case' ( (lv_labels_1_0= RULE_INT ) ) otherlv_2= ':' )+ ( ( ruleScopedName ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_labels_1_0=null;
        Token otherlv_2=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSimpleIDL.g:1693:2: ( ( (otherlv_0= 'case' ( (lv_labels_1_0= RULE_INT ) ) otherlv_2= ':' )+ ( ( ruleScopedName ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) )
            // InternalSimpleIDL.g:1694:2: ( (otherlv_0= 'case' ( (lv_labels_1_0= RULE_INT ) ) otherlv_2= ':' )+ ( ( ruleScopedName ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' )
            {
            // InternalSimpleIDL.g:1694:2: ( (otherlv_0= 'case' ( (lv_labels_1_0= RULE_INT ) ) otherlv_2= ':' )+ ( ( ruleScopedName ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' )
            // InternalSimpleIDL.g:1695:3: (otherlv_0= 'case' ( (lv_labels_1_0= RULE_INT ) ) otherlv_2= ':' )+ ( ( ruleScopedName ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';'
            {
            // InternalSimpleIDL.g:1695:3: (otherlv_0= 'case' ( (lv_labels_1_0= RULE_INT ) ) otherlv_2= ':' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==41) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSimpleIDL.g:1696:4: otherlv_0= 'case' ( (lv_labels_1_0= RULE_INT ) ) otherlv_2= ':'
            	    {
            	    otherlv_0=(Token)match(input,41,FOLLOW_20); 

            	    				newLeafNode(otherlv_0, grammarAccess.getCaseAccess().getCaseKeyword_0_0());
            	    			
            	    // InternalSimpleIDL.g:1700:4: ( (lv_labels_1_0= RULE_INT ) )
            	    // InternalSimpleIDL.g:1701:5: (lv_labels_1_0= RULE_INT )
            	    {
            	    // InternalSimpleIDL.g:1701:5: (lv_labels_1_0= RULE_INT )
            	    // InternalSimpleIDL.g:1702:6: lv_labels_1_0= RULE_INT
            	    {
            	    lv_labels_1_0=(Token)match(input,RULE_INT,FOLLOW_36); 

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

            	    otherlv_2=(Token)match(input,42,FOLLOW_37); 

            	    				newLeafNode(otherlv_2, grammarAccess.getCaseAccess().getColonKeyword_0_2());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // InternalSimpleIDL.g:1723:3: ( ( ruleScopedName ) )
            // InternalSimpleIDL.g:1724:4: ( ruleScopedName )
            {
            // InternalSimpleIDL.g:1724:4: ( ruleScopedName )
            // InternalSimpleIDL.g:1725:5: ruleScopedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCaseRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCaseAccess().getTypeNamedDefinitionCrossReference_1_0());
            				
            pushFollow(FOLLOW_4);
            ruleScopedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimpleIDL.g:1739:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalSimpleIDL.g:1740:4: (lv_name_4_0= RULE_ID )
            {
            // InternalSimpleIDL.g:1740:4: (lv_name_4_0= RULE_ID )
            // InternalSimpleIDL.g:1741:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

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


    // $ANTLR start "entryRuleScopedName"
    // InternalSimpleIDL.g:1765:1: entryRuleScopedName returns [String current=null] : iv_ruleScopedName= ruleScopedName EOF ;
    public final String entryRuleScopedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleScopedName = null;


        try {
            // InternalSimpleIDL.g:1765:50: (iv_ruleScopedName= ruleScopedName EOF )
            // InternalSimpleIDL.g:1766:2: iv_ruleScopedName= ruleScopedName EOF
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
    // InternalSimpleIDL.g:1772:1: ruleScopedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '::' )? (this_ID_1= RULE_ID kw= '::' )* this_ID_3= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleScopedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_3=null;


        	enterRule();

        try {
            // InternalSimpleIDL.g:1778:2: ( ( (kw= '::' )? (this_ID_1= RULE_ID kw= '::' )* this_ID_3= RULE_ID ) )
            // InternalSimpleIDL.g:1779:2: ( (kw= '::' )? (this_ID_1= RULE_ID kw= '::' )* this_ID_3= RULE_ID )
            {
            // InternalSimpleIDL.g:1779:2: ( (kw= '::' )? (this_ID_1= RULE_ID kw= '::' )* this_ID_3= RULE_ID )
            // InternalSimpleIDL.g:1780:3: (kw= '::' )? (this_ID_1= RULE_ID kw= '::' )* this_ID_3= RULE_ID
            {
            // InternalSimpleIDL.g:1780:3: (kw= '::' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==43) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSimpleIDL.g:1781:4: kw= '::'
                    {
                    kw=(Token)match(input,43,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getScopedNameAccess().getColonColonKeyword_0());
                    			

                    }
                    break;

            }

            // InternalSimpleIDL.g:1787:3: (this_ID_1= RULE_ID kw= '::' )*
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
            	    // InternalSimpleIDL.g:1788:4: this_ID_1= RULE_ID kw= '::'
            	    {
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_38); 

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


    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\52\uffff";
    static final String dfa_2s = "\1\14\4\uffff\1\4\1\uffff\1\4\2\uffff\1\25\1\uffff\1\4\1\uffff\3\4\1\uffff\1\44\5\uffff\1\4\2\uffff\1\15\1\4\3\uffff\1\4\4\uffff\1\4\1\30\1\uffff\1\4\1\uffff";
    static final String dfa_3s = "\1\31\4\uffff\1\53\1\uffff\1\44\2\uffff\1\34\1\uffff\1\44\1\uffff\1\4\1\53\1\36\1\uffff\1\44\5\uffff\1\34\2\uffff\1\32\1\4\3\uffff\1\53\4\uffff\1\4\1\53\1\uffff\1\4\1\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\15\1\uffff\1\22\1\32\1\uffff\1\14\1\uffff\1\21\3\uffff\1\20\1\uffff\1\17\1\6\1\30\1\31\1\11\1\uffff\1\26\1\27\2\uffff\1\10\1\7\1\16\1\uffff\1\12\1\13\1\23\1\5\2\uffff\1\24\1\uffff\1\25";
    static final String dfa_5s = "\52\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\uffff\1\1\2\uffff\1\3\5\uffff\1\4\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "\1\17\17\uffff\1\12\1\24\6\uffff\1\20\1\13\1\6\1\23\1\21\1\15\1\10\1\22\2\uffff\1\14\1\7\1\11\2\uffff\1\16",
            "",
            "\1\26\37\uffff\1\25",
            "",
            "",
            "\1\27\6\uffff\1\30",
            "",
            "\1\32\37\uffff\1\31",
            "",
            "\1\17",
            "\1\33\46\uffff\1\34",
            "\1\36\27\uffff\1\35\1\uffff\1\37",
            "",
            "\1\40",
            "",
            "",
            "",
            "",
            "",
            "\1\41\27\uffff\1\42",
            "",
            "",
            "\1\43\14\uffff\1\44",
            "\1\17",
            "",
            "",
            "",
            "\1\46\46\uffff\1\45",
            "",
            "",
            "",
            "",
            "\1\46",
            "\1\47\14\uffff\1\51\5\uffff\1\50",
            "",
            "\1\46",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "188:2: ( ( () otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_definitions_4_0= ruleDefinition ) )+ otherlv_5= '}' otherlv_6= ';' ) | ( () otherlv_8= 'struct' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )+ otherlv_12= '}' otherlv_13= ';' ) | ( () otherlv_15= 'union' ( (lv_name_16_0= RULE_ID ) ) otherlv_17= '{' otherlv_18= 'switch' otherlv_19= '(' otherlv_20= 'unsigned' otherlv_21= 'short' otherlv_22= ')' otherlv_23= '{' ( (lv_cases_24_0= ruleCase ) )+ otherlv_25= '}' otherlv_26= ';' otherlv_27= '}' otherlv_28= ';' ) | ( () otherlv_30= 'enum' ( (lv_name_31_0= RULE_ID ) ) otherlv_32= '{' ( (lv_literals_33_0= RULE_ID ) ) (otherlv_34= ',' ( (lv_literals_35_0= RULE_ID ) ) )* otherlv_36= '}' otherlv_37= ';' ) | ( () otherlv_39= 'typedef' ( ( ruleScopedName ) ) ( (lv_name_41_0= RULE_ID ) ) otherlv_42= '[' ( (lv_size_43_0= RULE_INT ) ) otherlv_44= ']' otherlv_45= ';' ) | ( () otherlv_47= 'typedef' otherlv_48= 'short' ( (lv_name_49_0= RULE_ID ) ) otherlv_50= ';' ) | ( () otherlv_52= 'typedef' otherlv_53= 'long' ( (lv_name_54_0= RULE_ID ) ) otherlv_55= ';' ) | ( () otherlv_57= 'typedef' otherlv_58= 'long' otherlv_59= 'long' ( (lv_name_60_0= RULE_ID ) ) otherlv_61= ';' ) | ( () otherlv_63= 'typedef' otherlv_64= 'unsigned' otherlv_65= 'short' ( (lv_name_66_0= RULE_ID ) ) otherlv_67= ';' ) | ( () otherlv_69= 'typedef' otherlv_70= 'unsigned' otherlv_71= 'long' ( (lv_name_72_0= RULE_ID ) ) otherlv_73= ';' ) | ( () otherlv_75= 'typedef' otherlv_76= 'unsigned' otherlv_77= 'long' otherlv_78= 'long' ( (lv_name_79_0= RULE_ID ) ) otherlv_80= ';' ) | ( () otherlv_82= 'typedef' otherlv_83= 'float' ( (lv_name_84_0= RULE_ID ) ) otherlv_85= ';' ) | ( () otherlv_87= 'typedef' otherlv_88= 'double' ( (lv_name_89_0= RULE_ID ) ) otherlv_90= ';' ) | ( () otherlv_92= 'typedef' otherlv_93= 'long' otherlv_94= 'double' ( (lv_name_95_0= RULE_ID ) ) otherlv_96= ';' ) | ( () otherlv_98= 'typedef' otherlv_99= 'char' ( (lv_name_100_0= RULE_ID ) ) otherlv_101= ';' ) | ( () otherlv_103= 'typedef' otherlv_104= 'wchar' ( (lv_name_105_0= RULE_ID ) ) otherlv_106= ';' ) | ( () otherlv_108= 'typedef' otherlv_109= 'boolean' ( (lv_name_110_0= RULE_ID ) ) otherlv_111= ';' ) | ( () otherlv_113= 'typedef' otherlv_114= 'octet' ( (lv_name_115_0= RULE_ID ) ) otherlv_116= ';' ) | ( () otherlv_118= 'typedef' ( ( ruleScopedName ) ) ( (lv_name_120_0= RULE_ID ) ) otherlv_121= ';' ) | ( () otherlv_123= 'typedef' otherlv_124= 'sequence' otherlv_125= '<' ( ( ruleScopedName ) ) otherlv_127= ',' ( (lv_size_128_0= RULE_INT ) ) otherlv_129= '>' ( (lv_name_130_0= RULE_ID ) ) otherlv_131= ';' ) | ( () otherlv_133= 'typedef' otherlv_134= 'sequence' otherlv_135= '<' ( ( ruleScopedName ) ) otherlv_137= '>' ( (lv_name_138_0= RULE_ID ) ) otherlv_139= ';' ) | ( () otherlv_141= 'typedef' otherlv_142= 'string' otherlv_143= '<' ( (lv_size_144_0= RULE_INT ) ) otherlv_145= '>' ( (lv_name_146_0= RULE_ID ) ) otherlv_147= ';' ) | ( () otherlv_149= 'typedef' otherlv_150= 'string' ( (lv_name_151_0= RULE_ID ) ) otherlv_152= ';' ) | ( () otherlv_154= 'typedef' otherlv_155= 'wstring' otherlv_156= '<' ( (lv_size_157_0= RULE_INT ) ) otherlv_158= '>' ( (lv_name_159_0= RULE_ID ) ) otherlv_160= ';' ) | ( () otherlv_162= 'typedef' otherlv_163= 'wstring' ( (lv_name_164_0= RULE_ID ) ) otherlv_165= ';' ) | ( () otherlv_167= 'typedef' otherlv_168= 'fixed' otherlv_169= '<' ( (lv_totalDigits_170_0= RULE_INT ) ) otherlv_171= ',' ( (lv_fractionalDigits_172_0= RULE_INT ) ) otherlv_173= '>' ( (lv_name_174_0= RULE_ID ) ) otherlv_175= ';' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002825002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002835000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000080000010010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000A0000000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000000L});

}