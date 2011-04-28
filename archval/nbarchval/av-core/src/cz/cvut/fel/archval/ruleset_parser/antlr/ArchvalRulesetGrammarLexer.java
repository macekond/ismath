// $ANTLR 3.1.3 July 11, 2010 13:49:50 ArchvalRulesetGrammar.g 2011-04-28 19:36:22

    package cz.cvut.fel.archval.ruleset_parser.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ArchvalRulesetGrammarLexer extends Lexer {
    public static final int VALIDATION_UNIT=4;
    public static final int VALIDATE_COMMANDS=7;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int ATOMIC_RULES=5;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_EXPRESSION=9;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__16=16;
    public static final int T__33=33;
    public static final int COMPOUND_RULES=6;
    public static final int WS=13;
    public static final int T__15=15;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__35=35;
    public static final int Number=11;
    public static final int T__17=17;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__14=14;
    public static final int T__39=39;
    public static final int ANALYZE_COMMANDS=8;
    public static final int Name=10;
    public static final int Label=12;

    // delegates
    // delegators

    public ArchvalRulesetGrammarLexer() {;} 
    public ArchvalRulesetGrammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ArchvalRulesetGrammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "ArchvalRulesetGrammar.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ArchvalRulesetGrammar.g:7:7: ( 'atomic_rule' )
            // ArchvalRulesetGrammar.g:7:9: 'atomic_rule'
            {
            match("atomic_rule"); 


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
            // ArchvalRulesetGrammar.g:8:7: ( '(' )
            // ArchvalRulesetGrammar.g:8:9: '('
            {
            match('('); 

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
            // ArchvalRulesetGrammar.g:9:7: ( ')' )
            // ArchvalRulesetGrammar.g:9:9: ')'
            {
            match(')'); 

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
            // ArchvalRulesetGrammar.g:10:7: ( '{' )
            // ArchvalRulesetGrammar.g:10:9: '{'
            {
            match('{'); 

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
            // ArchvalRulesetGrammar.g:11:7: ( '}' )
            // ArchvalRulesetGrammar.g:11:9: '}'
            {
            match('}'); 

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
            // ArchvalRulesetGrammar.g:12:7: ( ';' )
            // ArchvalRulesetGrammar.g:12:9: ';'
            {
            match(';'); 

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
            // ArchvalRulesetGrammar.g:13:7: ( 'compound_rule' )
            // ArchvalRulesetGrammar.g:13:9: 'compound_rule'
            {
            match("compound_rule"); 


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
            // ArchvalRulesetGrammar.g:14:7: ( 'validate' )
            // ArchvalRulesetGrammar.g:14:9: 'validate'
            {
            match("validate"); 


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
            // ArchvalRulesetGrammar.g:15:7: ( 'analyze' )
            // ArchvalRulesetGrammar.g:15:9: 'analyze'
            {
            match("analyze"); 


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
            // ArchvalRulesetGrammar.g:16:7: ( ',' )
            // ArchvalRulesetGrammar.g:16:9: ','
            {
            match(','); 

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
            // ArchvalRulesetGrammar.g:17:7: ( 'ALL' )
            // ArchvalRulesetGrammar.g:17:9: 'ALL'
            {
            match("ALL"); 


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
            // ArchvalRulesetGrammar.g:18:7: ( 'EXISTS' )
            // ArchvalRulesetGrammar.g:18:9: 'EXISTS'
            {
            match("EXISTS"); 


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
            // ArchvalRulesetGrammar.g:19:7: ( 'v' )
            // ArchvalRulesetGrammar.g:19:9: 'v'
            {
            match('v'); 

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
            // ArchvalRulesetGrammar.g:20:7: ( 'IN' )
            // ArchvalRulesetGrammar.g:20:9: 'IN'
            {
            match("IN"); 


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
            // ArchvalRulesetGrammar.g:21:7: ( 'V' )
            // ArchvalRulesetGrammar.g:21:9: 'V'
            {
            match('V'); 

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
            // ArchvalRulesetGrammar.g:22:7: ( 'e' )
            // ArchvalRulesetGrammar.g:22:9: 'e'
            {
            match('e'); 

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
            // ArchvalRulesetGrammar.g:23:7: ( 'E' )
            // ArchvalRulesetGrammar.g:23:9: 'E'
            {
            match('E'); 

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
            // ArchvalRulesetGrammar.g:24:7: ( ':' )
            // ArchvalRulesetGrammar.g:24:9: ':'
            {
            match(':'); 

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
            // ArchvalRulesetGrammar.g:25:7: ( 'OR' )
            // ArchvalRulesetGrammar.g:25:9: 'OR'
            {
            match("OR"); 


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
            // ArchvalRulesetGrammar.g:26:7: ( 'AND' )
            // ArchvalRulesetGrammar.g:26:9: 'AND'
            {
            match("AND"); 


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
            // ArchvalRulesetGrammar.g:27:7: ( 'NOT' )
            // ArchvalRulesetGrammar.g:27:9: 'NOT'
            {
            match("NOT"); 


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
            // ArchvalRulesetGrammar.g:28:7: ( 'true' )
            // ArchvalRulesetGrammar.g:28:9: 'true'
            {
            match("true"); 


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
            // ArchvalRulesetGrammar.g:29:7: ( 'false' )
            // ArchvalRulesetGrammar.g:29:9: 'false'
            {
            match("false"); 


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
            // ArchvalRulesetGrammar.g:30:7: ( 'INTERSECT' )
            // ArchvalRulesetGrammar.g:30:9: 'INTERSECT'
            {
            match("INTERSECT"); 


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
            // ArchvalRulesetGrammar.g:31:7: ( 'UNION' )
            // ArchvalRulesetGrammar.g:31:9: 'UNION'
            {
            match("UNION"); 


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
            // ArchvalRulesetGrammar.g:32:7: ( 'SETMINUS' )
            // ArchvalRulesetGrammar.g:32:9: 'SETMINUS'
            {
            match("SETMINUS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "Name"
    public final void mName() throws RecognitionException {
        try {
            int _type = Name;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ArchvalRulesetGrammar.g:221:6: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // ArchvalRulesetGrammar.g:221:8: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ArchvalRulesetGrammar.g:221:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:
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
    // $ANTLR end "Name"

    // $ANTLR start "Number"
    public final void mNumber() throws RecognitionException {
        try {
            int _type = Number;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ArchvalRulesetGrammar.g:223:8: ( ( '0' .. '9' )+ )
            // ArchvalRulesetGrammar.g:223:10: ( '0' .. '9' )+
            {
            // ArchvalRulesetGrammar.g:223:10: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:223:11: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Number"

    // $ANTLR start "Label"
    public final void mLabel() throws RecognitionException {
        try {
            int _type = Label;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ArchvalRulesetGrammar.g:225:7: ( '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* '\"' )
            // ArchvalRulesetGrammar.g:225:9: '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* '\"'
            {
            match('\"'); 
            // ArchvalRulesetGrammar.g:225:13: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Label"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ArchvalRulesetGrammar.g:227:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // ArchvalRulesetGrammar.g:227:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // ArchvalRulesetGrammar.g:227:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\t' && LA4_0<='\n')||LA4_0=='\r'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // ArchvalRulesetGrammar.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | Name | Number | Label | WS )
        int alt5=30;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // ArchvalRulesetGrammar.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // ArchvalRulesetGrammar.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // ArchvalRulesetGrammar.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // ArchvalRulesetGrammar.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // ArchvalRulesetGrammar.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // ArchvalRulesetGrammar.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // ArchvalRulesetGrammar.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // ArchvalRulesetGrammar.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // ArchvalRulesetGrammar.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // ArchvalRulesetGrammar.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // ArchvalRulesetGrammar.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // ArchvalRulesetGrammar.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // ArchvalRulesetGrammar.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // ArchvalRulesetGrammar.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // ArchvalRulesetGrammar.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // ArchvalRulesetGrammar.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // ArchvalRulesetGrammar.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // ArchvalRulesetGrammar.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // ArchvalRulesetGrammar.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // ArchvalRulesetGrammar.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // ArchvalRulesetGrammar.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // ArchvalRulesetGrammar.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // ArchvalRulesetGrammar.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // ArchvalRulesetGrammar.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // ArchvalRulesetGrammar.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // ArchvalRulesetGrammar.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // ArchvalRulesetGrammar.g:1:166: Name
                {
                mName(); 

                }
                break;
            case 28 :
                // ArchvalRulesetGrammar.g:1:171: Number
                {
                mNumber(); 

                }
                break;
            case 29 :
                // ArchvalRulesetGrammar.g:1:178: Label
                {
                mLabel(); 

                }
                break;
            case 30 :
                // ArchvalRulesetGrammar.g:1:184: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\1\uffff\1\26\5\uffff\1\26\1\36\1\uffff\1\26\1\42\1\26\1\44\1\45"+
        "\1\uffff\6\26\4\uffff\4\26\1\uffff\3\26\1\uffff\1\64\2\uffff\1\65"+
        "\11\26\1\77\1\100\2\26\2\uffff\1\103\10\26\2\uffff\2\26\1\uffff"+
        "\1\116\11\26\1\uffff\1\130\1\131\5\26\1\137\1\26\2\uffff\2\26\1"+
        "\143\2\26\1\uffff\3\26\1\uffff\1\26\1\152\1\26\1\154\2\26\1\uffff"+
        "\1\157\1\uffff\2\26\1\uffff\1\162\1\26\1\uffff\1\26\1\165\1\uffff";
    static final String DFA5_eofS =
        "\166\uffff";
    static final String DFA5_minS =
        "\1\11\1\156\5\uffff\1\157\1\60\1\uffff\1\114\1\60\1\116\2\60\1\uffff"+
        "\1\122\1\117\1\162\1\141\1\116\1\105\4\uffff\1\157\1\141\1\155\1"+
        "\154\1\uffff\1\114\1\104\1\111\1\uffff\1\60\2\uffff\1\60\1\124\1"+
        "\165\1\154\1\111\1\124\1\155\1\154\1\160\1\151\2\60\1\123\1\105"+
        "\2\uffff\1\60\1\145\1\163\1\117\1\115\1\151\1\171\1\157\1\144\2"+
        "\uffff\1\124\1\122\1\uffff\1\60\1\145\1\116\1\111\1\143\1\172\1"+
        "\165\1\141\2\123\1\uffff\2\60\1\116\1\137\1\145\1\156\1\164\1\60"+
        "\1\105\2\uffff\1\125\1\162\1\60\1\144\1\145\1\uffff\1\103\1\123"+
        "\1\165\1\uffff\1\137\1\60\1\124\1\60\1\154\1\162\1\uffff\1\60\1"+
        "\uffff\1\145\1\165\1\uffff\1\60\1\154\1\uffff\1\145\1\60\1\uffff";
    static final String DFA5_maxS =
        "\1\175\1\164\5\uffff\1\157\1\172\1\uffff\1\116\1\172\1\116\2\172"+
        "\1\uffff\1\122\1\117\1\162\1\141\1\116\1\105\4\uffff\1\157\1\141"+
        "\1\155\1\154\1\uffff\1\114\1\104\1\111\1\uffff\1\172\2\uffff\1\172"+
        "\1\124\1\165\1\154\1\111\1\124\1\155\1\154\1\160\1\151\2\172\1\123"+
        "\1\105\2\uffff\1\172\1\145\1\163\1\117\1\115\1\151\1\171\1\157\1"+
        "\144\2\uffff\1\124\1\122\1\uffff\1\172\1\145\1\116\1\111\1\143\1"+
        "\172\1\165\1\141\2\123\1\uffff\2\172\1\116\1\137\1\145\1\156\1\164"+
        "\1\172\1\105\2\uffff\1\125\1\162\1\172\1\144\1\145\1\uffff\1\103"+
        "\1\123\1\165\1\uffff\1\137\1\172\1\124\1\172\1\154\1\162\1\uffff"+
        "\1\172\1\uffff\1\145\1\165\1\uffff\1\172\1\154\1\uffff\1\145\1\172"+
        "\1\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\2\uffff\1\12\5\uffff\1\22\6\uffff\1"+
        "\33\1\34\1\35\1\36\4\uffff\1\15\3\uffff\1\21\1\uffff\1\17\1\20\16"+
        "\uffff\1\16\1\23\11\uffff\1\13\1\24\2\uffff\1\25\12\uffff\1\26\11"+
        "\uffff\1\27\1\31\5\uffff\1\14\3\uffff\1\11\6\uffff\1\10\1\uffff"+
        "\1\32\2\uffff\1\30\2\uffff\1\1\2\uffff\1\7";
    static final String DFA5_specialS =
        "\166\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\31\2\uffff\1\31\22\uffff\1\31\1\uffff\1\30\5\uffff\1\2\1"+
            "\3\2\uffff\1\11\3\uffff\12\27\1\17\1\6\5\uffff\1\12\3\26\1\13"+
            "\3\26\1\14\4\26\1\21\1\20\3\26\1\25\1\26\1\24\1\15\4\26\6\uffff"+
            "\1\1\1\26\1\7\1\26\1\16\1\23\15\26\1\22\1\26\1\10\4\26\1\4\1"+
            "\uffff\1\5",
            "\1\33\5\uffff\1\32",
            "",
            "",
            "",
            "",
            "",
            "\1\34",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\1\35\31\26",
            "",
            "\1\37\1\uffff\1\40",
            "\12\26\7\uffff\27\26\1\41\2\26\4\uffff\1\26\1\uffff\32\26",
            "\1\43",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "",
            "",
            "",
            "",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "",
            "\12\26\7\uffff\23\26\1\63\6\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\101",
            "\1\102",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "",
            "",
            "\1\114",
            "\1\115",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
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
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\140",
            "",
            "",
            "\1\141",
            "\1\142",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\144",
            "\1\145",
            "",
            "\1\146",
            "\1\147",
            "\1\150",
            "",
            "\1\151",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\153",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\155",
            "\1\156",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\160",
            "\1\161",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\163",
            "",
            "\1\164",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | Name | Number | Label | WS );";
        }
    }
 

}