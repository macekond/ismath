// $ANTLR 3.1.3 July 11, 2010 13:49:50 ArchvalRulesetGrammar.g 2011-05-07 21:58:56

    package cz.cvut.fel.archval.core.avd.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ArchvalRulesetGrammarLexer extends Lexer {
    public static final int COMPOUND_RULE_KW=17;
    public static final int VALIDATION_UNIT=4;
    public static final int VALIDATE_COMMANDS=7;
    public static final int VertexSet=25;
    public static final int RBRACE=15;
    public static final int ATOMIC_RULES=5;
    public static final int RULE_EXPRESSION=9;
    public static final int False=33;
    public static final int LBRACE=14;
    public static final int ANALYZE_KW=19;
    public static final int SEMICOLON=16;
    public static final int ATOMIC_RULE_KW=10;
    public static final int NOT=31;
    public static final int AND=30;
    public static final int EOF=-1;
    public static final int UNION=37;
    public static final int LPAREN=12;
    public static final int COLON=28;
    public static final int RPAREN=13;
    public static final int INTERSECT=36;
    public static final int COMPOUND_RULES=6;
    public static final int WS=39;
    public static final int IN=24;
    public static final int Number=34;
    public static final int EdgeSet=27;
    public static final int COMMA=20;
    public static final int Edge=26;
    public static final int Vertex=23;
    public static final int ALL=21;
    public static final int VALIDATE_KW=18;
    public static final int ANALYZE_COMMANDS=8;
    public static final int OR=29;
    public static final int Name=11;
    public static final int EXISTS=22;
    public static final int True=32;
    public static final int SETMINUS=38;
    public static final int Label=35;

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

    // $ANTLR start "EXISTS"
    public final void mEXISTS() throws RecognitionException {
        try {
            int _type = EXISTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ArchvalRulesetGrammar.g:230:8: ( 'EXISTS' )
            // ArchvalRulesetGrammar.g:230:10: 'EXISTS'
            {
            match("EXISTS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXISTS"

    // $ANTLR start "ALL"
    public final void mALL() throws RecognitionException {
        try {
            int _type = ALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ArchvalRulesetGrammar.g:231:5: ( 'ALL' )
            // ArchvalRulesetGrammar.g:231:7: 'ALL'
            {
            match("ALL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ALL"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ArchvalRulesetGrammar.g:232:4: ( 'IN' )
            // ArchvalRulesetGrammar.g:232:6: 'IN'
            {
            match("IN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "INTERSECT"
    public final void mINTERSECT() throws RecognitionException {
        try {
            int _type = INTERSECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ArchvalRulesetGrammar.g:235:2: ( 'INTERSECT' )
            // ArchvalRulesetGrammar.g:235:4: 'INTERSECT'
            {
            match("INTERSECT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTERSECT"

    // $ANTLR start "UNION"
    public final void mUNION() throws RecognitionException {
        try {
            int _type = UNION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ArchvalRulesetGrammar.g:236:7: ( 'UNION' )
            // ArchvalRulesetGrammar.g:236:9: 'UNION'
            {
            match("UNION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNION"

    // $ANTLR start "SETMINUS"
    public final void mSETMINUS() throws RecognitionException {
        try {
            int _type = SETMINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ArchvalRulesetGrammar.g:237:9: ( 'SETMINUS' )
            // ArchvalRulesetGrammar.g:237:11: 'SETMINUS'
            {
            match("SETMINUS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SETMINUS"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ArchvalRulesetGrammar.g:239:6: ( 'NOT' )
            // ArchvalRulesetGrammar.g:239:8: 'NOT'
            {
            match("NOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ArchvalRulesetGrammar.g:240:5: ( 'AND' )
            // ArchvalRulesetGrammar.g:240:7: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ArchvalRulesetGrammar.g:241:4: ( 'OR' )
            // ArchvalRulesetGrammar.g:241:6: 'OR'
            {
            match("OR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "ATOMIC_RULE_KW"
    public final void mATOMIC_RULE_KW() throws RecognitionException {
        try {
            int _type = ATOMIC_RULE_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ArchvalRulesetGrammar.g:245:2: ( 'atomic_rule' )
            // ArchvalRulesetGrammar.g:245:4: 'atomic_rule'
            {
            match("atomic_rule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ATOMIC_RULE_KW"

    // $ANTLR start "COMPOUND_RULE_KW"
    public final void mCOMPOUND_RULE_KW() throws RecognitionException {
        try {
            int _type = COMPOUND_RULE_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ArchvalRulesetGrammar.g:247:2: ( 'compound_rule' )
            // ArchvalRulesetGrammar.g:247:4: 'compound_rule'
            {
            match("compound_rule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMPOUND_RULE_KW"

    // $ANTLR start "VALIDATE_KW"
    public final void mVALIDATE_KW() throws RecognitionException {
        try {
            int _type = VALIDATE_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ArchvalRulesetGrammar.g:249:2: ( 'validate' )
            // ArchvalRulesetGrammar.g:249:4: 'validate'
            {
            match("validate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VALIDATE_KW"

    // $ANTLR start "ANALYZE_KW"
    public final void mANALYZE_KW() throws RecognitionException {
        try {
            int _type = ANALYZE_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ArchvalRulesetGrammar.g:251:2: ( 'analyze' )
            // ArchvalRulesetGrammar.g:251:4: 'analyze'
            {
            match("analyze"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ANALYZE_KW"

    // $ANTLR start "LBRACE"
    public final void mLBRACE() throws RecognitionException {
        try {
            int _type = LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ArchvalRulesetGrammar.g:254:9: ( '{' )
            // ArchvalRulesetGrammar.g:254:11: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACE"

    // $ANTLR start "RBRACE"
    public final void mRBRACE() throws RecognitionException {
        try {
            int _type = RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ArchvalRulesetGrammar.g:255:8: ( '}' )
            // ArchvalRulesetGrammar.g:255:10: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACE"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ArchvalRulesetGrammar.g:256:8: ( '(' )
            // ArchvalRulesetGrammar.g:256:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ArchvalRulesetGrammar.g:257:8: ( ')' )
            // ArchvalRulesetGrammar.g:257:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ArchvalRulesetGrammar.g:258:7: ( ',' )
            // ArchvalRulesetGrammar.g:258:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ArchvalRulesetGrammar.g:260:2: ( ';' )
            // ArchvalRulesetGrammar.g:260:4: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ArchvalRulesetGrammar.g:261:7: ( ':' )
            // ArchvalRulesetGrammar.g:261:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ArchvalRulesetGrammar.g:264:6: ( 'true' )
            // ArchvalRulesetGrammar.g:264:8: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "True"

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ArchvalRulesetGrammar.g:265:7: ( 'false' )
            // ArchvalRulesetGrammar.g:265:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "False"

    // $ANTLR start "Vertex"
    public final void mVertex() throws RecognitionException {
        try {
            int _type = Vertex;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ArchvalRulesetGrammar.g:266:8: ( 'v' )
            // ArchvalRulesetGrammar.g:266:10: 'v'
            {
            match('v'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Vertex"

    // $ANTLR start "Edge"
    public final void mEdge() throws RecognitionException {
        try {
            int _type = Edge;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ArchvalRulesetGrammar.g:267:6: ( 'e' )
            // ArchvalRulesetGrammar.g:267:8: 'e'
            {
            match('e'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Edge"

    // $ANTLR start "VertexSet"
    public final void mVertexSet() throws RecognitionException {
        try {
            int _type = VertexSet;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ArchvalRulesetGrammar.g:269:2: ( 'V' )
            // ArchvalRulesetGrammar.g:269:4: 'V'
            {
            match('V'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VertexSet"

    // $ANTLR start "EdgeSet"
    public final void mEdgeSet() throws RecognitionException {
        try {
            int _type = EdgeSet;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ArchvalRulesetGrammar.g:270:9: ( 'E' )
            // ArchvalRulesetGrammar.g:270:11: 'E'
            {
            match('E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EdgeSet"

    // $ANTLR start "Name"
    public final void mName() throws RecognitionException {
        try {
            int _type = Name;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ArchvalRulesetGrammar.g:271:6: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // ArchvalRulesetGrammar.g:271:8: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ArchvalRulesetGrammar.g:272:3: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
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
            // ArchvalRulesetGrammar.g:273:8: ( ( '0' .. '9' )+ )
            // ArchvalRulesetGrammar.g:273:10: ( '0' .. '9' )+
            {
            // ArchvalRulesetGrammar.g:273:10: ( '0' .. '9' )+
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
            	    // ArchvalRulesetGrammar.g:273:11: '0' .. '9'
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
            // ArchvalRulesetGrammar.g:274:8: ( '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )* '\"' )
            // ArchvalRulesetGrammar.g:274:10: '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )* '\"'
            {
            match('\"'); 
            // ArchvalRulesetGrammar.g:274:14: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='-'||(LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
            // ArchvalRulesetGrammar.g:278:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // ArchvalRulesetGrammar.g:278:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // ArchvalRulesetGrammar.g:278:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
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
        // ArchvalRulesetGrammar.g:1:8: ( EXISTS | ALL | IN | INTERSECT | UNION | SETMINUS | NOT | AND | OR | ATOMIC_RULE_KW | COMPOUND_RULE_KW | VALIDATE_KW | ANALYZE_KW | LBRACE | RBRACE | LPAREN | RPAREN | COMMA | SEMICOLON | COLON | True | False | Vertex | Edge | VertexSet | EdgeSet | Name | Number | Label | WS )
        int alt5=30;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // ArchvalRulesetGrammar.g:1:10: EXISTS
                {
                mEXISTS(); 

                }
                break;
            case 2 :
                // ArchvalRulesetGrammar.g:1:17: ALL
                {
                mALL(); 

                }
                break;
            case 3 :
                // ArchvalRulesetGrammar.g:1:21: IN
                {
                mIN(); 

                }
                break;
            case 4 :
                // ArchvalRulesetGrammar.g:1:24: INTERSECT
                {
                mINTERSECT(); 

                }
                break;
            case 5 :
                // ArchvalRulesetGrammar.g:1:34: UNION
                {
                mUNION(); 

                }
                break;
            case 6 :
                // ArchvalRulesetGrammar.g:1:40: SETMINUS
                {
                mSETMINUS(); 

                }
                break;
            case 7 :
                // ArchvalRulesetGrammar.g:1:49: NOT
                {
                mNOT(); 

                }
                break;
            case 8 :
                // ArchvalRulesetGrammar.g:1:53: AND
                {
                mAND(); 

                }
                break;
            case 9 :
                // ArchvalRulesetGrammar.g:1:57: OR
                {
                mOR(); 

                }
                break;
            case 10 :
                // ArchvalRulesetGrammar.g:1:60: ATOMIC_RULE_KW
                {
                mATOMIC_RULE_KW(); 

                }
                break;
            case 11 :
                // ArchvalRulesetGrammar.g:1:75: COMPOUND_RULE_KW
                {
                mCOMPOUND_RULE_KW(); 

                }
                break;
            case 12 :
                // ArchvalRulesetGrammar.g:1:92: VALIDATE_KW
                {
                mVALIDATE_KW(); 

                }
                break;
            case 13 :
                // ArchvalRulesetGrammar.g:1:104: ANALYZE_KW
                {
                mANALYZE_KW(); 

                }
                break;
            case 14 :
                // ArchvalRulesetGrammar.g:1:115: LBRACE
                {
                mLBRACE(); 

                }
                break;
            case 15 :
                // ArchvalRulesetGrammar.g:1:122: RBRACE
                {
                mRBRACE(); 

                }
                break;
            case 16 :
                // ArchvalRulesetGrammar.g:1:129: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 17 :
                // ArchvalRulesetGrammar.g:1:136: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 18 :
                // ArchvalRulesetGrammar.g:1:143: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 19 :
                // ArchvalRulesetGrammar.g:1:149: SEMICOLON
                {
                mSEMICOLON(); 

                }
                break;
            case 20 :
                // ArchvalRulesetGrammar.g:1:159: COLON
                {
                mCOLON(); 

                }
                break;
            case 21 :
                // ArchvalRulesetGrammar.g:1:165: True
                {
                mTrue(); 

                }
                break;
            case 22 :
                // ArchvalRulesetGrammar.g:1:170: False
                {
                mFalse(); 

                }
                break;
            case 23 :
                // ArchvalRulesetGrammar.g:1:176: Vertex
                {
                mVertex(); 

                }
                break;
            case 24 :
                // ArchvalRulesetGrammar.g:1:183: Edge
                {
                mEdge(); 

                }
                break;
            case 25 :
                // ArchvalRulesetGrammar.g:1:188: VertexSet
                {
                mVertexSet(); 

                }
                break;
            case 26 :
                // ArchvalRulesetGrammar.g:1:198: EdgeSet
                {
                mEdgeSet(); 

                }
                break;
            case 27 :
                // ArchvalRulesetGrammar.g:1:206: Name
                {
                mName(); 

                }
                break;
            case 28 :
                // ArchvalRulesetGrammar.g:1:211: Number
                {
                mNumber(); 

                }
                break;
            case 29 :
                // ArchvalRulesetGrammar.g:1:218: Label
                {
                mLabel(); 

                }
                break;
            case 30 :
                // ArchvalRulesetGrammar.g:1:224: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\1\uffff\1\33\10\26\1\47\7\uffff\2\26\1\52\1\53\4\uffff\1\26\1\uffff"+
        "\2\26\1\60\3\26\1\64\4\26\1\uffff\2\26\2\uffff\1\26\1\74\1\75\1"+
        "\26\1\uffff\2\26\1\101\1\uffff\7\26\2\uffff\3\26\1\uffff\4\26\1"+
        "\120\3\26\1\124\5\26\1\uffff\1\132\1\133\1\26\1\uffff\5\26\2\uffff"+
        "\3\26\1\145\3\26\1\151\1\26\1\uffff\1\26\1\154\1\155\1\uffff\2\26"+
        "\2\uffff\2\26\1\162\1\26\1\uffff\1\26\1\165\1\uffff";
    static final String DFA5_eofS =
        "\166\uffff";
    static final String DFA5_minS =
        "\1\11\1\60\1\114\2\116\1\105\1\117\1\122\1\156\1\157\1\60\7\uffff"+
        "\1\162\1\141\2\60\4\uffff\1\111\1\uffff\1\114\1\104\1\60\1\111\2"+
        "\124\1\60\1\157\1\141\1\155\1\154\1\uffff\1\165\1\154\2\uffff\1"+
        "\123\2\60\1\105\1\uffff\1\117\1\115\1\60\1\uffff\1\155\1\154\1\160"+
        "\1\151\1\145\1\163\1\124\2\uffff\1\122\1\116\1\111\1\uffff\1\151"+
        "\1\171\1\157\1\144\1\60\1\145\2\123\1\60\1\116\1\143\1\172\1\165"+
        "\1\141\1\uffff\2\60\1\105\1\uffff\1\125\1\137\1\145\1\156\1\164"+
        "\2\uffff\1\103\1\123\1\162\1\60\1\144\1\145\1\124\1\60\1\165\1\uffff"+
        "\1\137\2\60\1\uffff\1\154\1\162\2\uffff\1\145\1\165\1\60\1\154\1"+
        "\uffff\1\145\1\60\1\uffff";
    static final String DFA5_maxS =
        "\1\175\1\172\3\116\1\105\1\117\1\122\1\164\1\157\1\172\7\uffff\1"+
        "\162\1\141\2\172\4\uffff\1\111\1\uffff\1\114\1\104\1\172\1\111\2"+
        "\124\1\172\1\157\1\141\1\155\1\154\1\uffff\1\165\1\154\2\uffff\1"+
        "\123\2\172\1\105\1\uffff\1\117\1\115\1\172\1\uffff\1\155\1\154\1"+
        "\160\1\151\1\145\1\163\1\124\2\uffff\1\122\1\116\1\111\1\uffff\1"+
        "\151\1\171\1\157\1\144\1\172\1\145\2\123\1\172\1\116\1\143\1\172"+
        "\1\165\1\141\1\uffff\2\172\1\105\1\uffff\1\125\1\137\1\145\1\156"+
        "\1\164\2\uffff\1\103\1\123\1\162\1\172\1\144\1\145\1\124\1\172\1"+
        "\165\1\uffff\1\137\2\172\1\uffff\1\154\1\162\2\uffff\1\145\1\165"+
        "\1\172\1\154\1\uffff\1\145\1\172\1\uffff";
    static final String DFA5_acceptS =
        "\13\uffff\1\16\1\17\1\20\1\21\1\22\1\23\1\24\4\uffff\1\33\1\34\1"+
        "\35\1\36\1\uffff\1\32\13\uffff\1\27\2\uffff\1\30\1\31\4\uffff\1"+
        "\3\3\uffff\1\11\7\uffff\1\2\1\10\3\uffff\1\7\16\uffff\1\25\3\uffff"+
        "\1\5\5\uffff\1\26\1\1\11\uffff\1\15\3\uffff\1\6\2\uffff\1\14\1\4"+
        "\4\uffff\1\12\2\uffff\1\13";
    static final String DFA5_specialS =
        "\166\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\31\2\uffff\1\31\22\uffff\1\31\1\uffff\1\30\5\uffff\1\15\1"+
            "\16\2\uffff\1\17\3\uffff\12\27\1\21\1\20\5\uffff\1\2\3\26\1"+
            "\1\3\26\1\3\4\26\1\6\1\7\3\26\1\5\1\26\1\4\1\25\4\26\6\uffff"+
            "\1\10\1\26\1\11\1\26\1\24\1\23\15\26\1\22\1\26\1\12\4\26\1\13"+
            "\1\uffff\1\14",
            "\12\26\7\uffff\27\26\1\32\2\26\4\uffff\1\26\1\uffff\32\26",
            "\1\34\1\uffff\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\44\5\uffff\1\43",
            "\1\45",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\1\46\31\26",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50",
            "\1\51",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "",
            "",
            "\1\54",
            "",
            "\1\55",
            "\1\56",
            "\12\26\7\uffff\23\26\1\57\6\26\4\uffff\1\26\1\uffff\32\26",
            "\1\61",
            "\1\62",
            "\1\63",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "",
            "\1\71",
            "\1\72",
            "",
            "",
            "\1\73",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\76",
            "",
            "\1\77",
            "\1\100",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\121",
            "\1\122",
            "\1\123",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\134",
            "",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "",
            "\1\142",
            "\1\143",
            "\1\144",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\146",
            "\1\147",
            "\1\150",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\152",
            "",
            "\1\153",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\156",
            "\1\157",
            "",
            "",
            "\1\160",
            "\1\161",
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
            return "1:1: Tokens : ( EXISTS | ALL | IN | INTERSECT | UNION | SETMINUS | NOT | AND | OR | ATOMIC_RULE_KW | COMPOUND_RULE_KW | VALIDATE_KW | ANALYZE_KW | LBRACE | RBRACE | LPAREN | RPAREN | COMMA | SEMICOLON | COLON | True | False | Vertex | Edge | VertexSet | EdgeSet | Name | Number | Label | WS );";
        }
    }
 

}