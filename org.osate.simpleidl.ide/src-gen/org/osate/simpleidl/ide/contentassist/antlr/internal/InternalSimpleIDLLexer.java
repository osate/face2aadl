package org.osate.simpleidl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimpleIDLLexer extends Lexer {
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

    public InternalSimpleIDLLexer() {;} 
    public InternalSimpleIDLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSimpleIDLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSimpleIDL.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:11:7: ( 'struct' )
            // InternalSimpleIDL.g:11:9: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:12:7: ( ';' )
            // InternalSimpleIDL.g:12:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:13:7: ( 'module' )
            // InternalSimpleIDL.g:13:9: 'module'
            {
            match("module"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:14:7: ( '{' )
            // InternalSimpleIDL.g:14:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:15:7: ( '}' )
            // InternalSimpleIDL.g:15:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:16:7: ( 'union' )
            // InternalSimpleIDL.g:16:9: 'union'
            {
            match("union"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:17:7: ( 'switch' )
            // InternalSimpleIDL.g:17:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:18:7: ( '(' )
            // InternalSimpleIDL.g:18:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:19:7: ( 'unsigned' )
            // InternalSimpleIDL.g:19:9: 'unsigned'
            {
            match("unsigned"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:20:7: ( 'short' )
            // InternalSimpleIDL.g:20:9: 'short'
            {
            match("short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:21:7: ( ')' )
            // InternalSimpleIDL.g:21:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:22:7: ( 'enum' )
            // InternalSimpleIDL.g:22:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:23:7: ( ',' )
            // InternalSimpleIDL.g:23:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:24:7: ( 'typedef' )
            // InternalSimpleIDL.g:24:9: 'typedef'
            {
            match("typedef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:25:7: ( '[' )
            // InternalSimpleIDL.g:25:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:26:7: ( ']' )
            // InternalSimpleIDL.g:26:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:27:7: ( 'long' )
            // InternalSimpleIDL.g:27:9: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:28:7: ( 'float' )
            // InternalSimpleIDL.g:28:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:29:7: ( 'double' )
            // InternalSimpleIDL.g:29:9: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:30:7: ( 'char' )
            // InternalSimpleIDL.g:30:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:31:7: ( 'wchar' )
            // InternalSimpleIDL.g:31:9: 'wchar'
            {
            match("wchar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:32:7: ( 'boolean' )
            // InternalSimpleIDL.g:32:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:33:7: ( 'octet' )
            // InternalSimpleIDL.g:33:9: 'octet'
            {
            match("octet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:34:7: ( 'sequence' )
            // InternalSimpleIDL.g:34:9: 'sequence'
            {
            match("sequence"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:35:7: ( '<' )
            // InternalSimpleIDL.g:35:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:36:7: ( '>' )
            // InternalSimpleIDL.g:36:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:37:7: ( 'string' )
            // InternalSimpleIDL.g:37:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:38:7: ( 'wstring' )
            // InternalSimpleIDL.g:38:9: 'wstring'
            {
            match("wstring"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:39:7: ( 'fixed' )
            // InternalSimpleIDL.g:39:9: 'fixed'
            {
            match("fixed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:40:7: ( 'case' )
            // InternalSimpleIDL.g:40:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:41:7: ( ':' )
            // InternalSimpleIDL.g:41:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:42:7: ( '::' )
            // InternalSimpleIDL.g:42:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:6479:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSimpleIDL.g:6479:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSimpleIDL.g:6479:31: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSimpleIDL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_PREPROCESSOR"
    public final void mRULE_PREPROCESSOR() throws RecognitionException {
        try {
            int _type = RULE_PREPROCESSOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:6481:19: ( ( '#define' | '#endif' | '#ifndef' | '#include' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSimpleIDL.g:6481:21: ( '#define' | '#endif' | '#ifndef' | '#include' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            // InternalSimpleIDL.g:6481:21: ( '#define' | '#endif' | '#ifndef' | '#include' )
            int alt2=4;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='#') ) {
                switch ( input.LA(2) ) {
                case 'd':
                    {
                    alt2=1;
                    }
                    break;
                case 'e':
                    {
                    alt2=2;
                    }
                    break;
                case 'i':
                    {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4=='f') ) {
                        alt2=3;
                    }
                    else if ( (LA2_4=='n') ) {
                        alt2=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

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
                    // InternalSimpleIDL.g:6481:22: '#define'
                    {
                    match("#define"); 


                    }
                    break;
                case 2 :
                    // InternalSimpleIDL.g:6481:32: '#endif'
                    {
                    match("#endif"); 


                    }
                    break;
                case 3 :
                    // InternalSimpleIDL.g:6481:41: '#ifndef'
                    {
                    match("#ifndef"); 


                    }
                    break;
                case 4 :
                    // InternalSimpleIDL.g:6481:51: '#include'
                    {
                    match("#include"); 


                    }
                    break;

            }

            // InternalSimpleIDL.g:6481:63: (~ ( ( '\\n' | '\\r' ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSimpleIDL.g:6481:63: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalSimpleIDL.g:6481:79: ( ( '\\r' )? '\\n' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\n'||LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSimpleIDL.g:6481:80: ( '\\r' )? '\\n'
                    {
                    // InternalSimpleIDL.g:6481:80: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalSimpleIDL.g:6481:80: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PREPROCESSOR"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:6483:10: ( ( '0' .. '9' )+ )
            // InternalSimpleIDL.g:6483:12: ( '0' .. '9' )+
            {
            // InternalSimpleIDL.g:6483:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSimpleIDL.g:6483:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:6485:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSimpleIDL.g:6485:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSimpleIDL.g:6485:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSimpleIDL.g:6485:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSimpleIDL.g:6485:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalSimpleIDL.g:6485:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSimpleIDL.g:6485:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalSimpleIDL.g:6485:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSimpleIDL.g:6485:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSimpleIDL.g:6485:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSimpleIDL.g:6485:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:6487:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSimpleIDL.g:6487:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSimpleIDL.g:6487:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSimpleIDL.g:6487:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:6489:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSimpleIDL.g:6489:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSimpleIDL.g:6489:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSimpleIDL.g:6489:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalSimpleIDL.g:6489:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSimpleIDL.g:6489:41: ( '\\r' )? '\\n'
                    {
                    // InternalSimpleIDL.g:6489:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalSimpleIDL.g:6489:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:6491:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSimpleIDL.g:6491:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSimpleIDL.g:6491:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSimpleIDL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleIDL.g:6493:16: ( . )
            // InternalSimpleIDL.g:6493:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalSimpleIDL.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_ID | RULE_PREPROCESSOR | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=40;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalSimpleIDL.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalSimpleIDL.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalSimpleIDL.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalSimpleIDL.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalSimpleIDL.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalSimpleIDL.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalSimpleIDL.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalSimpleIDL.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalSimpleIDL.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalSimpleIDL.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalSimpleIDL.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalSimpleIDL.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalSimpleIDL.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalSimpleIDL.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalSimpleIDL.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalSimpleIDL.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalSimpleIDL.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalSimpleIDL.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalSimpleIDL.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalSimpleIDL.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalSimpleIDL.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalSimpleIDL.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalSimpleIDL.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalSimpleIDL.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalSimpleIDL.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalSimpleIDL.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalSimpleIDL.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalSimpleIDL.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalSimpleIDL.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalSimpleIDL.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalSimpleIDL.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalSimpleIDL.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalSimpleIDL.g:1:202: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 34 :
                // InternalSimpleIDL.g:1:210: RULE_PREPROCESSOR
                {
                mRULE_PREPROCESSOR(); 

                }
                break;
            case 35 :
                // InternalSimpleIDL.g:1:228: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 36 :
                // InternalSimpleIDL.g:1:237: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 37 :
                // InternalSimpleIDL.g:1:249: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 38 :
                // InternalSimpleIDL.g:1:265: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 39 :
                // InternalSimpleIDL.g:1:281: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 40 :
                // InternalSimpleIDL.g:1:289: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\44\1\uffff\1\44\2\uffff\1\44\2\uffff\1\44\1\uffff\1\44\2\uffff\7\44\2\uffff\1\76\1\uffff\1\37\1\uffff\3\37\2\uffff\4\44\2\uffff\1\44\2\uffff\1\44\2\uffff\1\44\1\uffff\1\44\2\uffff\12\44\12\uffff\33\44\1\164\1\44\1\166\3\44\1\172\1\173\7\44\1\u0083\2\44\1\u0086\1\44\1\uffff\1\44\1\uffff\1\u0089\1\u008a\1\44\2\uffff\1\u008c\2\44\1\u008f\1\u0090\1\u0091\1\u0092\1\uffff\1\44\1\u0094\1\uffff\2\44\2\uffff\1\u0097\1\uffff\2\44\4\uffff\1\44\1\uffff\1\44\1\u009c\1\uffff\1\u009d\1\u009e\1\u009f\1\u00a0\5\uffff";
    static final String DFA15_eofS =
        "\u00a1\uffff";
    static final String DFA15_minS =
        "\1\0\1\145\1\uffff\1\157\2\uffff\1\156\2\uffff\1\156\1\uffff\1\171\2\uffff\1\157\1\151\1\157\1\141\1\143\1\157\1\143\2\uffff\1\72\1\uffff\1\144\1\uffff\2\0\1\52\2\uffff\1\162\1\151\1\157\1\161\2\uffff\1\144\2\uffff\1\151\2\uffff\1\165\1\uffff\1\160\2\uffff\1\156\1\157\1\170\1\165\1\141\1\163\1\150\1\164\1\157\1\164\12\uffff\1\151\1\164\1\162\2\165\1\157\1\151\1\155\1\145\1\147\1\141\1\145\1\142\1\162\1\145\1\141\1\162\1\154\1\145\1\143\1\156\1\143\1\164\1\145\1\154\1\156\1\147\1\60\1\144\1\60\1\164\1\144\1\154\2\60\1\162\1\151\1\145\2\164\1\147\1\150\1\60\1\156\1\145\1\60\1\156\1\uffff\1\145\1\uffff\2\60\1\145\2\uffff\1\60\1\156\1\141\4\60\1\uffff\1\143\1\60\1\uffff\1\145\1\146\2\uffff\1\60\1\uffff\1\147\1\156\4\uffff\1\145\1\uffff\1\144\1\60\1\uffff\4\60\5\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\167\1\uffff\1\157\2\uffff\1\156\2\uffff\1\156\1\uffff\1\171\2\uffff\1\157\1\154\1\157\1\150\1\163\1\157\1\143\2\uffff\1\72\1\uffff\1\151\1\uffff\2\uffff\1\57\2\uffff\1\162\1\151\1\157\1\161\2\uffff\1\144\2\uffff\1\163\2\uffff\1\165\1\uffff\1\160\2\uffff\1\156\1\157\1\170\1\165\1\141\1\163\1\150\1\164\1\157\1\164\12\uffff\1\165\1\164\1\162\2\165\1\157\1\151\1\155\1\145\1\147\1\141\1\145\1\142\1\162\1\145\1\141\1\162\1\154\1\145\1\143\1\156\1\143\1\164\1\145\1\154\1\156\1\147\1\172\1\144\1\172\1\164\1\144\1\154\2\172\1\162\1\151\1\145\2\164\1\147\1\150\1\172\1\156\1\145\1\172\1\156\1\uffff\1\145\1\uffff\2\172\1\145\2\uffff\1\172\1\156\1\141\4\172\1\uffff\1\143\1\172\1\uffff\1\145\1\146\2\uffff\1\172\1\uffff\1\147\1\156\4\uffff\1\145\1\uffff\1\144\1\172\1\uffff\4\172\5\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\5\1\uffff\1\10\1\13\1\uffff\1\15\1\uffff\1\17\1\20\7\uffff\1\31\1\32\1\uffff\1\41\1\uffff\1\43\3\uffff\1\47\1\50\4\uffff\1\41\1\2\1\uffff\1\4\1\5\1\uffff\1\10\1\13\1\uffff\1\15\1\uffff\1\17\1\20\12\uffff\1\31\1\32\1\40\1\37\1\42\1\43\1\44\1\45\1\46\1\47\57\uffff\1\14\1\uffff\1\21\3\uffff\1\24\1\36\7\uffff\1\12\2\uffff\1\6\2\uffff\1\22\1\35\1\uffff\1\25\2\uffff\1\27\1\1\1\33\1\7\1\uffff\1\3\2\uffff\1\23\4\uffff\1\16\1\34\1\26\1\30\1\11";
    static final String DFA15_specialS =
        "\1\1\32\uffff\1\0\1\2\u0084\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\37\2\36\2\37\1\36\22\37\1\36\1\37\1\33\1\31\3\37\1\34\1\7\1\10\2\37\1\12\2\37\1\35\12\32\1\27\1\2\1\25\1\37\1\26\2\37\32\30\1\14\1\37\1\15\3\37\1\30\1\23\1\21\1\20\1\11\1\17\5\30\1\16\1\3\1\30\1\24\3\30\1\1\1\13\1\6\1\30\1\22\3\30\1\4\1\37\1\5\uff82\37",
            "\1\43\2\uffff\1\42\13\uffff\1\40\2\uffff\1\41",
            "",
            "\1\46",
            "",
            "",
            "\1\51",
            "",
            "",
            "\1\54",
            "",
            "\1\56",
            "",
            "",
            "\1\61",
            "\1\63\2\uffff\1\62",
            "\1\64",
            "\1\66\6\uffff\1\65",
            "\1\67\17\uffff\1\70",
            "\1\71",
            "\1\72",
            "",
            "",
            "\1\75",
            "",
            "\2\77\3\uffff\1\77",
            "",
            "\0\101",
            "\0\101",
            "\1\102\4\uffff\1\103",
            "",
            "",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "",
            "",
            "\1\111",
            "",
            "",
            "\1\112\11\uffff\1\113",
            "",
            "",
            "\1\114",
            "",
            "\1\115",
            "",
            "",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
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
            "\1\131\13\uffff\1\130",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\165",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\167",
            "\1\170",
            "\1\171",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0084",
            "\1\u0085",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0087",
            "",
            "\1\u0088",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u008b",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u008d",
            "\1\u008e",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u0093",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u0095",
            "\1\u0096",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u0098",
            "\1\u0099",
            "",
            "",
            "",
            "",
            "\1\u009a",
            "",
            "\1\u009b",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_ID | RULE_PREPROCESSOR | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_27 = input.LA(1);

                        s = -1;
                        if ( ((LA15_27>='\u0000' && LA15_27<='\uFFFF')) ) {s = 65;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='s') ) {s = 1;}

                        else if ( (LA15_0==';') ) {s = 2;}

                        else if ( (LA15_0=='m') ) {s = 3;}

                        else if ( (LA15_0=='{') ) {s = 4;}

                        else if ( (LA15_0=='}') ) {s = 5;}

                        else if ( (LA15_0=='u') ) {s = 6;}

                        else if ( (LA15_0=='(') ) {s = 7;}

                        else if ( (LA15_0==')') ) {s = 8;}

                        else if ( (LA15_0=='e') ) {s = 9;}

                        else if ( (LA15_0==',') ) {s = 10;}

                        else if ( (LA15_0=='t') ) {s = 11;}

                        else if ( (LA15_0=='[') ) {s = 12;}

                        else if ( (LA15_0==']') ) {s = 13;}

                        else if ( (LA15_0=='l') ) {s = 14;}

                        else if ( (LA15_0=='f') ) {s = 15;}

                        else if ( (LA15_0=='d') ) {s = 16;}

                        else if ( (LA15_0=='c') ) {s = 17;}

                        else if ( (LA15_0=='w') ) {s = 18;}

                        else if ( (LA15_0=='b') ) {s = 19;}

                        else if ( (LA15_0=='o') ) {s = 20;}

                        else if ( (LA15_0=='<') ) {s = 21;}

                        else if ( (LA15_0=='>') ) {s = 22;}

                        else if ( (LA15_0==':') ) {s = 23;}

                        else if ( ((LA15_0>='A' && LA15_0<='Z')||LA15_0=='a'||(LA15_0>='g' && LA15_0<='k')||LA15_0=='n'||(LA15_0>='p' && LA15_0<='r')||LA15_0=='v'||(LA15_0>='x' && LA15_0<='z')) ) {s = 24;}

                        else if ( (LA15_0=='#') ) {s = 25;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 26;}

                        else if ( (LA15_0=='\"') ) {s = 27;}

                        else if ( (LA15_0=='\'') ) {s = 28;}

                        else if ( (LA15_0=='/') ) {s = 29;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 30;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='$' && LA15_0<='&')||(LA15_0>='*' && LA15_0<='+')||(LA15_0>='-' && LA15_0<='.')||LA15_0=='='||(LA15_0>='?' && LA15_0<='@')||LA15_0=='\\'||(LA15_0>='^' && LA15_0<='`')||LA15_0=='|'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_28 = input.LA(1);

                        s = -1;
                        if ( ((LA15_28>='\u0000' && LA15_28<='\uFFFF')) ) {s = 65;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}