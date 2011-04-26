// $ANTLR 3.1.3 July 11, 2010 13:49:50 ArchvalRulesetGrammar.g 2011-04-26 22:08:59

package cz.cvut.fel.archval.ruleset_parser.antlr;
import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ArchvalRulesetGrammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Name", "Number", "Label", "WS", "'atomic_rule'", "'('", "')'", "'{'", "'}'", "';'", "'compound_rule'", "'validate'", "'analyze'", "','", "'ALL'", "'EXISTS'", "'v'", "'IN'", "'V'", "':'", "'e'", "'E'", "'OR'", "'AND'", "'NOT'", "'true'", "'false'", "'INTERSECT'", "'UNION'", "'SETMINUS'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int WS=7;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int Number=5;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int Name=4;
    public static final int Label=6;

    // delegates
    // delegators


        public ArchvalRulesetGrammarParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public ArchvalRulesetGrammarParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return ArchvalRulesetGrammarParser.tokenNames; }
    public String getGrammarFileName() { return "ArchvalRulesetGrammar.g"; }



    // $ANTLR start "validation_unit"
    // ArchvalRulesetGrammar.g:12:1: validation_unit : ( atomic_rule )* ( compound_rule )* ( validate_command )* ( analyze_command )* EOF ;
    public final void validation_unit() throws RecognitionException {
        try {
            // ArchvalRulesetGrammar.g:12:16: ( ( atomic_rule )* ( compound_rule )* ( validate_command )* ( analyze_command )* EOF )
            // ArchvalRulesetGrammar.g:13:5: ( atomic_rule )* ( compound_rule )* ( validate_command )* ( analyze_command )* EOF
            {
            // ArchvalRulesetGrammar.g:13:5: ( atomic_rule )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==8) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:13:5: atomic_rule
            	    {
            	    pushFollow(FOLLOW_atomic_rule_in_validation_unit28);
            	    atomic_rule();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ArchvalRulesetGrammar.g:14:5: ( compound_rule )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:14:5: compound_rule
            	    {
            	    pushFollow(FOLLOW_compound_rule_in_validation_unit35);
            	    compound_rule();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ArchvalRulesetGrammar.g:15:5: ( validate_command )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:15:5: validate_command
            	    {
            	    pushFollow(FOLLOW_validate_command_in_validation_unit42);
            	    validate_command();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ArchvalRulesetGrammar.g:16:5: ( analyze_command )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:16:5: analyze_command
            	    {
            	    pushFollow(FOLLOW_analyze_command_in_validation_unit49);
            	    analyze_command();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_validation_unit56); 

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
    // $ANTLR end "validation_unit"


    // $ANTLR start "atomic_rule"
    // ArchvalRulesetGrammar.g:19:1: atomic_rule : 'atomic_rule' Name '(' Name ')' '{' atomic_rule_spec '}' ';' ;
    public final void atomic_rule() throws RecognitionException {
        try {
            // ArchvalRulesetGrammar.g:19:13: ( 'atomic_rule' Name '(' Name ')' '{' atomic_rule_spec '}' ';' )
            // ArchvalRulesetGrammar.g:20:5: 'atomic_rule' Name '(' Name ')' '{' atomic_rule_spec '}' ';'
            {
            match(input,8,FOLLOW_8_in_atomic_rule68); 
            match(input,Name,FOLLOW_Name_in_atomic_rule70); 
            match(input,9,FOLLOW_9_in_atomic_rule72); 
            match(input,Name,FOLLOW_Name_in_atomic_rule74); 
            match(input,10,FOLLOW_10_in_atomic_rule76); 
            match(input,11,FOLLOW_11_in_atomic_rule78); 
            pushFollow(FOLLOW_atomic_rule_spec_in_atomic_rule80);
            atomic_rule_spec();

            state._fsp--;

            match(input,12,FOLLOW_12_in_atomic_rule82); 
            match(input,13,FOLLOW_13_in_atomic_rule84); 

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
    // $ANTLR end "atomic_rule"


    // $ANTLR start "compound_rule"
    // ArchvalRulesetGrammar.g:22:1: compound_rule : 'compound_rule' Name '{' compound_rule_spec '}' ';' ;
    public final void compound_rule() throws RecognitionException {
        try {
            // ArchvalRulesetGrammar.g:22:15: ( 'compound_rule' Name '{' compound_rule_spec '}' ';' )
            // ArchvalRulesetGrammar.g:23:5: 'compound_rule' Name '{' compound_rule_spec '}' ';'
            {
            match(input,14,FOLLOW_14_in_compound_rule96); 
            match(input,Name,FOLLOW_Name_in_compound_rule98); 
            match(input,11,FOLLOW_11_in_compound_rule100); 
            pushFollow(FOLLOW_compound_rule_spec_in_compound_rule102);
            compound_rule_spec();

            state._fsp--;

            match(input,12,FOLLOW_12_in_compound_rule104); 
            match(input,13,FOLLOW_13_in_compound_rule106); 

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
    // $ANTLR end "compound_rule"


    // $ANTLR start "validate_command"
    // ArchvalRulesetGrammar.g:25:1: validate_command : 'validate' '(' validate_command_params ')' ';' ;
    public final void validate_command() throws RecognitionException {
        try {
            // ArchvalRulesetGrammar.g:25:18: ( 'validate' '(' validate_command_params ')' ';' )
            // ArchvalRulesetGrammar.g:26:5: 'validate' '(' validate_command_params ')' ';'
            {
            match(input,15,FOLLOW_15_in_validate_command118); 
            match(input,9,FOLLOW_9_in_validate_command120); 
            pushFollow(FOLLOW_validate_command_params_in_validate_command122);
            validate_command_params();

            state._fsp--;

            match(input,10,FOLLOW_10_in_validate_command124); 
            match(input,13,FOLLOW_13_in_validate_command126); 

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
    // $ANTLR end "validate_command"


    // $ANTLR start "analyze_command"
    // ArchvalRulesetGrammar.g:28:1: analyze_command : 'analyze' '(' analyze_command_params ')' ';' ;
    public final void analyze_command() throws RecognitionException {
        try {
            // ArchvalRulesetGrammar.g:28:17: ( 'analyze' '(' analyze_command_params ')' ';' )
            // ArchvalRulesetGrammar.g:29:5: 'analyze' '(' analyze_command_params ')' ';'
            {
            match(input,16,FOLLOW_16_in_analyze_command138); 
            match(input,9,FOLLOW_9_in_analyze_command140); 
            pushFollow(FOLLOW_analyze_command_params_in_analyze_command142);
            analyze_command_params();

            state._fsp--;

            match(input,10,FOLLOW_10_in_analyze_command144); 
            match(input,13,FOLLOW_13_in_analyze_command146); 

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
    // $ANTLR end "analyze_command"


    // $ANTLR start "validate_command_params"
    // ArchvalRulesetGrammar.g:31:1: validate_command_params : Name ( ',' Name )* ;
    public final void validate_command_params() throws RecognitionException {
        try {
            // ArchvalRulesetGrammar.g:31:25: ( Name ( ',' Name )* )
            // ArchvalRulesetGrammar.g:31:27: Name ( ',' Name )*
            {
            match(input,Name,FOLLOW_Name_in_validate_command_params154); 
            // ArchvalRulesetGrammar.g:31:32: ( ',' Name )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:31:33: ',' Name
            	    {
            	    match(input,17,FOLLOW_17_in_validate_command_params157); 
            	    match(input,Name,FOLLOW_Name_in_validate_command_params159); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


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
    // $ANTLR end "validate_command_params"


    // $ANTLR start "analyze_command_params"
    // ArchvalRulesetGrammar.g:33:1: analyze_command_params : Name ( ',' Name )* ;
    public final void analyze_command_params() throws RecognitionException {
        try {
            // ArchvalRulesetGrammar.g:33:24: ( Name ( ',' Name )* )
            // ArchvalRulesetGrammar.g:33:26: Name ( ',' Name )*
            {
            match(input,Name,FOLLOW_Name_in_analyze_command_params169); 
            // ArchvalRulesetGrammar.g:33:31: ( ',' Name )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:33:32: ',' Name
            	    {
            	    match(input,17,FOLLOW_17_in_analyze_command_params172); 
            	    match(input,Name,FOLLOW_Name_in_analyze_command_params174); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


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
    // $ANTLR end "analyze_command_params"


    // $ANTLR start "atomic_rule_spec"
    // ArchvalRulesetGrammar.g:35:1: atomic_rule_spec : set_spec_clause '{' orexpression '}' ;
    public final void atomic_rule_spec() throws RecognitionException {
        try {
            // ArchvalRulesetGrammar.g:35:18: ( set_spec_clause '{' orexpression '}' )
            // ArchvalRulesetGrammar.g:35:20: set_spec_clause '{' orexpression '}'
            {
            pushFollow(FOLLOW_set_spec_clause_in_atomic_rule_spec184);
            set_spec_clause();

            state._fsp--;

            match(input,11,FOLLOW_11_in_atomic_rule_spec186); 
            pushFollow(FOLLOW_orexpression_in_atomic_rule_spec188);
            orexpression();

            state._fsp--;

            match(input,12,FOLLOW_12_in_atomic_rule_spec190); 

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
    // $ANTLR end "atomic_rule_spec"


    // $ANTLR start "set_spec_clause"
    // ArchvalRulesetGrammar.g:37:1: set_spec_clause : ( ( ( 'ALL' ) | ( 'EXISTS' ) ) 'v' 'IN' 'V' ( ':' Name '(' selector_params ')' )? | ( ( 'ALL' ) | ( 'EXISTS' ) ) 'e' 'IN' 'E' ( ':' Name '(' selector_params ')' )? );
    public final void set_spec_clause() throws RecognitionException {
        try {
            // ArchvalRulesetGrammar.g:37:17: ( ( ( 'ALL' ) | ( 'EXISTS' ) ) 'v' 'IN' 'V' ( ':' Name '(' selector_params ')' )? | ( ( 'ALL' ) | ( 'EXISTS' ) ) 'e' 'IN' 'E' ( ':' Name '(' selector_params ')' )? )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==24) ) {
                    alt11=2;
                }
                else if ( (LA11_1==20) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA11_0==19) ) {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==20) ) {
                    alt11=1;
                }
                else if ( (LA11_2==24) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ArchvalRulesetGrammar.g:38:5: ( ( 'ALL' ) | ( 'EXISTS' ) ) 'v' 'IN' 'V' ( ':' Name '(' selector_params ')' )?
                    {
                    // ArchvalRulesetGrammar.g:38:5: ( ( 'ALL' ) | ( 'EXISTS' ) )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==18) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==19) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // ArchvalRulesetGrammar.g:38:7: ( 'ALL' )
                            {
                            // ArchvalRulesetGrammar.g:38:7: ( 'ALL' )
                            // ArchvalRulesetGrammar.g:38:8: 'ALL'
                            {
                            match(input,18,FOLLOW_18_in_set_spec_clause205); 

                            }


                            }
                            break;
                        case 2 :
                            // ArchvalRulesetGrammar.g:38:17: ( 'EXISTS' )
                            {
                            // ArchvalRulesetGrammar.g:38:17: ( 'EXISTS' )
                            // ArchvalRulesetGrammar.g:38:18: 'EXISTS'
                            {
                            match(input,19,FOLLOW_19_in_set_spec_clause211); 

                            }


                            }
                            break;

                    }

                    match(input,20,FOLLOW_20_in_set_spec_clause215); 
                    match(input,21,FOLLOW_21_in_set_spec_clause217); 
                    match(input,22,FOLLOW_22_in_set_spec_clause219); 
                    // ArchvalRulesetGrammar.g:38:42: ( ':' Name '(' selector_params ')' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==23) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ArchvalRulesetGrammar.g:38:43: ':' Name '(' selector_params ')'
                            {
                            match(input,23,FOLLOW_23_in_set_spec_clause222); 
                            match(input,Name,FOLLOW_Name_in_set_spec_clause224); 
                            match(input,9,FOLLOW_9_in_set_spec_clause226); 
                            pushFollow(FOLLOW_selector_params_in_set_spec_clause228);
                            selector_params();

                            state._fsp--;

                            match(input,10,FOLLOW_10_in_set_spec_clause230); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ArchvalRulesetGrammar.g:40:5: ( ( 'ALL' ) | ( 'EXISTS' ) ) 'e' 'IN' 'E' ( ':' Name '(' selector_params ')' )?
                    {
                    // ArchvalRulesetGrammar.g:40:5: ( ( 'ALL' ) | ( 'EXISTS' ) )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==18) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==19) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // ArchvalRulesetGrammar.g:40:7: ( 'ALL' )
                            {
                            // ArchvalRulesetGrammar.g:40:7: ( 'ALL' )
                            // ArchvalRulesetGrammar.g:40:8: 'ALL'
                            {
                            match(input,18,FOLLOW_18_in_set_spec_clause247); 

                            }


                            }
                            break;
                        case 2 :
                            // ArchvalRulesetGrammar.g:40:17: ( 'EXISTS' )
                            {
                            // ArchvalRulesetGrammar.g:40:17: ( 'EXISTS' )
                            // ArchvalRulesetGrammar.g:40:18: 'EXISTS'
                            {
                            match(input,19,FOLLOW_19_in_set_spec_clause253); 

                            }


                            }
                            break;

                    }

                    match(input,24,FOLLOW_24_in_set_spec_clause257); 
                    match(input,21,FOLLOW_21_in_set_spec_clause259); 
                    match(input,25,FOLLOW_25_in_set_spec_clause261); 
                    // ArchvalRulesetGrammar.g:40:42: ( ':' Name '(' selector_params ')' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==23) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ArchvalRulesetGrammar.g:40:43: ':' Name '(' selector_params ')'
                            {
                            match(input,23,FOLLOW_23_in_set_spec_clause264); 
                            match(input,Name,FOLLOW_Name_in_set_spec_clause266); 
                            match(input,9,FOLLOW_9_in_set_spec_clause268); 
                            pushFollow(FOLLOW_selector_params_in_set_spec_clause270);
                            selector_params();

                            state._fsp--;

                            match(input,10,FOLLOW_10_in_set_spec_clause272); 

                            }
                            break;

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
        }
        return ;
    }
    // $ANTLR end "set_spec_clause"


    // $ANTLR start "orexpression"
    // ArchvalRulesetGrammar.g:43:1: orexpression : andexpression ( ( 'OR' ) andexpression )* ;
    public final void orexpression() throws RecognitionException {
        try {
            // ArchvalRulesetGrammar.g:43:14: ( andexpression ( ( 'OR' ) andexpression )* )
            // ArchvalRulesetGrammar.g:43:16: andexpression ( ( 'OR' ) andexpression )*
            {
            pushFollow(FOLLOW_andexpression_in_orexpression287);
            andexpression();

            state._fsp--;

            // ArchvalRulesetGrammar.g:43:30: ( ( 'OR' ) andexpression )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:43:31: ( 'OR' ) andexpression
            	    {
            	    // ArchvalRulesetGrammar.g:43:31: ( 'OR' )
            	    // ArchvalRulesetGrammar.g:43:32: 'OR'
            	    {
            	    match(input,26,FOLLOW_26_in_orexpression291); 

            	    }

            	    pushFollow(FOLLOW_andexpression_in_orexpression294);
            	    andexpression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


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
    // $ANTLR end "orexpression"


    // $ANTLR start "andexpression"
    // ArchvalRulesetGrammar.g:45:1: andexpression : notexpression ( ( 'AND' ) notexpression )* ;
    public final void andexpression() throws RecognitionException {
        try {
            // ArchvalRulesetGrammar.g:45:15: ( notexpression ( ( 'AND' ) notexpression )* )
            // ArchvalRulesetGrammar.g:45:17: notexpression ( ( 'AND' ) notexpression )*
            {
            pushFollow(FOLLOW_notexpression_in_andexpression304);
            notexpression();

            state._fsp--;

            // ArchvalRulesetGrammar.g:45:31: ( ( 'AND' ) notexpression )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:45:32: ( 'AND' ) notexpression
            	    {
            	    // ArchvalRulesetGrammar.g:45:32: ( 'AND' )
            	    // ArchvalRulesetGrammar.g:45:33: 'AND'
            	    {
            	    match(input,27,FOLLOW_27_in_andexpression308); 

            	    }

            	    pushFollow(FOLLOW_notexpression_in_andexpression311);
            	    notexpression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


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
    // $ANTLR end "andexpression"


    // $ANTLR start "notexpression"
    // ArchvalRulesetGrammar.g:47:1: notexpression : ( 'NOT' )? atom ;
    public final void notexpression() throws RecognitionException {
        try {
            // ArchvalRulesetGrammar.g:47:15: ( ( 'NOT' )? atom )
            // ArchvalRulesetGrammar.g:47:17: ( 'NOT' )? atom
            {
            // ArchvalRulesetGrammar.g:47:17: ( 'NOT' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ArchvalRulesetGrammar.g:47:18: 'NOT'
                    {
                    match(input,28,FOLLOW_28_in_notexpression322); 

                    }
                    break;

            }

            pushFollow(FOLLOW_atom_in_notexpression326);
            atom();

            state._fsp--;


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
    // $ANTLR end "notexpression"


    // $ANTLR start "atom"
    // ArchvalRulesetGrammar.g:49:1: atom : ( condition | '(' orexpression ')' );
    public final void atom() throws RecognitionException {
        try {
            // ArchvalRulesetGrammar.g:49:6: ( condition | '(' orexpression ')' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Name||(LA15_0>=29 && LA15_0<=30)) ) {
                alt15=1;
            }
            else if ( (LA15_0==9) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ArchvalRulesetGrammar.g:49:8: condition
                    {
                    pushFollow(FOLLOW_condition_in_atom334);
                    condition();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // ArchvalRulesetGrammar.g:49:20: '(' orexpression ')'
                    {
                    match(input,9,FOLLOW_9_in_atom338); 
                    pushFollow(FOLLOW_orexpression_in_atom340);
                    orexpression();

                    state._fsp--;

                    match(input,10,FOLLOW_10_in_atom342); 

                    }
                    break;

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
    // $ANTLR end "atom"


    // $ANTLR start "condition"
    // ArchvalRulesetGrammar.g:51:1: condition : ( 'true' | 'false' | Name '(' ( predicate_params )? ')' );
    public final void condition() throws RecognitionException {
        try {
            // ArchvalRulesetGrammar.g:51:11: ( 'true' | 'false' | Name '(' ( predicate_params )? ')' )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt17=1;
                }
                break;
            case 30:
                {
                alt17=2;
                }
                break;
            case Name:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ArchvalRulesetGrammar.g:51:13: 'true'
                    {
                    match(input,29,FOLLOW_29_in_condition350); 

                    }
                    break;
                case 2 :
                    // ArchvalRulesetGrammar.g:51:22: 'false'
                    {
                    match(input,30,FOLLOW_30_in_condition354); 

                    }
                    break;
                case 3 :
                    // ArchvalRulesetGrammar.g:51:32: Name '(' ( predicate_params )? ')'
                    {
                    match(input,Name,FOLLOW_Name_in_condition358); 
                    match(input,9,FOLLOW_9_in_condition360); 
                    // ArchvalRulesetGrammar.g:51:41: ( predicate_params )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=Name && LA16_0<=Label)||LA16_0==9) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ArchvalRulesetGrammar.g:51:41: predicate_params
                            {
                            pushFollow(FOLLOW_predicate_params_in_condition362);
                            predicate_params();

                            state._fsp--;


                            }
                            break;

                    }

                    match(input,10,FOLLOW_10_in_condition365); 

                    }
                    break;

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
    // $ANTLR end "condition"


    // $ANTLR start "predicate_params"
    // ArchvalRulesetGrammar.g:53:1: predicate_params : predicate_param ( ',' predicate_param )* ;
    public final void predicate_params() throws RecognitionException {
        try {
            // ArchvalRulesetGrammar.g:53:18: ( predicate_param ( ',' predicate_param )* )
            // ArchvalRulesetGrammar.g:53:20: predicate_param ( ',' predicate_param )*
            {
            pushFollow(FOLLOW_predicate_param_in_predicate_params373);
            predicate_param();

            state._fsp--;

            // ArchvalRulesetGrammar.g:53:36: ( ',' predicate_param )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==17) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:53:37: ',' predicate_param
            	    {
            	    match(input,17,FOLLOW_17_in_predicate_params376); 
            	    pushFollow(FOLLOW_predicate_param_in_predicate_params378);
            	    predicate_param();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


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
    // $ANTLR end "predicate_params"


    // $ANTLR start "predicate_param"
    // ArchvalRulesetGrammar.g:55:1: predicate_param : ( Number | Label | set_expression );
    public final void predicate_param() throws RecognitionException {
        try {
            // ArchvalRulesetGrammar.g:55:17: ( Number | Label | set_expression )
            int alt19=3;
            switch ( input.LA(1) ) {
            case Number:
                {
                alt19=1;
                }
                break;
            case Label:
                {
                alt19=2;
                }
                break;
            case Name:
            case 9:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ArchvalRulesetGrammar.g:55:19: Number
                    {
                    match(input,Number,FOLLOW_Number_in_predicate_param388); 

                    }
                    break;
                case 2 :
                    // ArchvalRulesetGrammar.g:55:28: Label
                    {
                    match(input,Label,FOLLOW_Label_in_predicate_param392); 

                    }
                    break;
                case 3 :
                    // ArchvalRulesetGrammar.g:55:36: set_expression
                    {
                    pushFollow(FOLLOW_set_expression_in_predicate_param396);
                    set_expression();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "predicate_param"


    // $ANTLR start "set_expression"
    // ArchvalRulesetGrammar.g:57:1: set_expression : set_atom ( ( ( 'INTERSECT' ) | ( 'UNION' ) | ( 'SETMINUS' ) ) set_atom )* ;
    public final void set_expression() throws RecognitionException {
        try {
            // ArchvalRulesetGrammar.g:57:16: ( set_atom ( ( ( 'INTERSECT' ) | ( 'UNION' ) | ( 'SETMINUS' ) ) set_atom )* )
            // ArchvalRulesetGrammar.g:57:18: set_atom ( ( ( 'INTERSECT' ) | ( 'UNION' ) | ( 'SETMINUS' ) ) set_atom )*
            {
            pushFollow(FOLLOW_set_atom_in_set_expression404);
            set_atom();

            state._fsp--;

            // ArchvalRulesetGrammar.g:57:27: ( ( ( 'INTERSECT' ) | ( 'UNION' ) | ( 'SETMINUS' ) ) set_atom )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=31 && LA21_0<=33)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:57:28: ( ( 'INTERSECT' ) | ( 'UNION' ) | ( 'SETMINUS' ) ) set_atom
            	    {
            	    // ArchvalRulesetGrammar.g:57:28: ( ( 'INTERSECT' ) | ( 'UNION' ) | ( 'SETMINUS' ) )
            	    int alt20=3;
            	    switch ( input.LA(1) ) {
            	    case 31:
            	        {
            	        alt20=1;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt20=2;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt20=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt20) {
            	        case 1 :
            	            // ArchvalRulesetGrammar.g:57:29: ( 'INTERSECT' )
            	            {
            	            // ArchvalRulesetGrammar.g:57:29: ( 'INTERSECT' )
            	            // ArchvalRulesetGrammar.g:57:30: 'INTERSECT'
            	            {
            	            match(input,31,FOLLOW_31_in_set_expression409); 

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ArchvalRulesetGrammar.g:57:45: ( 'UNION' )
            	            {
            	            // ArchvalRulesetGrammar.g:57:45: ( 'UNION' )
            	            // ArchvalRulesetGrammar.g:57:46: 'UNION'
            	            {
            	            match(input,32,FOLLOW_32_in_set_expression415); 

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ArchvalRulesetGrammar.g:57:57: ( 'SETMINUS' )
            	            {
            	            // ArchvalRulesetGrammar.g:57:57: ( 'SETMINUS' )
            	            // ArchvalRulesetGrammar.g:57:58: 'SETMINUS'
            	            {
            	            match(input,33,FOLLOW_33_in_set_expression421); 

            	            }


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_set_atom_in_set_expression425);
            	    set_atom();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


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
    // $ANTLR end "set_expression"


    // $ANTLR start "set_atom"
    // ArchvalRulesetGrammar.g:59:1: set_atom : ( Name '(' ( selector_params )? ')' | '(' set_expression ')' );
    public final void set_atom() throws RecognitionException {
        try {
            // ArchvalRulesetGrammar.g:59:10: ( Name '(' ( selector_params )? ')' | '(' set_expression ')' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Name) ) {
                alt23=1;
            }
            else if ( (LA23_0==9) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ArchvalRulesetGrammar.g:60:5: Name '(' ( selector_params )? ')'
                    {
                    match(input,Name,FOLLOW_Name_in_set_atom439); 
                    match(input,9,FOLLOW_9_in_set_atom441); 
                    // ArchvalRulesetGrammar.g:60:14: ( selector_params )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=Number && LA22_0<=Label)||LA22_0==20||LA22_0==24) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ArchvalRulesetGrammar.g:60:14: selector_params
                            {
                            pushFollow(FOLLOW_selector_params_in_set_atom443);
                            selector_params();

                            state._fsp--;


                            }
                            break;

                    }

                    match(input,10,FOLLOW_10_in_set_atom446); 

                    }
                    break;
                case 2 :
                    // ArchvalRulesetGrammar.g:62:5: '(' set_expression ')'
                    {
                    match(input,9,FOLLOW_9_in_set_atom458); 
                    pushFollow(FOLLOW_set_expression_in_set_atom460);
                    set_expression();

                    state._fsp--;

                    match(input,10,FOLLOW_10_in_set_atom462); 

                    }
                    break;

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
    // $ANTLR end "set_atom"


    // $ANTLR start "selector_params"
    // ArchvalRulesetGrammar.g:65:1: selector_params : selector_param ( ',' selector_param )* ;
    public final void selector_params() throws RecognitionException {
        try {
            // ArchvalRulesetGrammar.g:65:17: ( selector_param ( ',' selector_param )* )
            // ArchvalRulesetGrammar.g:65:19: selector_param ( ',' selector_param )*
            {
            pushFollow(FOLLOW_selector_param_in_selector_params475);
            selector_param();

            state._fsp--;

            // ArchvalRulesetGrammar.g:65:34: ( ',' selector_param )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==17) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:65:35: ',' selector_param
            	    {
            	    match(input,17,FOLLOW_17_in_selector_params478); 
            	    pushFollow(FOLLOW_selector_param_in_selector_params480);
            	    selector_param();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


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
    // $ANTLR end "selector_params"


    // $ANTLR start "selector_param"
    // ArchvalRulesetGrammar.g:67:1: selector_param : ( 'v' | 'e' | Number | Label );
    public final void selector_param() throws RecognitionException {
        try {
            // ArchvalRulesetGrammar.g:67:16: ( 'v' | 'e' | Number | Label )
            // ArchvalRulesetGrammar.g:
            {
            if ( (input.LA(1)>=Number && input.LA(1)<=Label)||input.LA(1)==20||input.LA(1)==24 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "selector_param"


    // $ANTLR start "compound_rule_spec"
    // ArchvalRulesetGrammar.g:69:1: compound_rule_spec : candexpression ( 'OR' candexpression )* ;
    public final void compound_rule_spec() throws RecognitionException {
        try {
            // ArchvalRulesetGrammar.g:69:20: ( candexpression ( 'OR' candexpression )* )
            // ArchvalRulesetGrammar.g:69:22: candexpression ( 'OR' candexpression )*
            {
            pushFollow(FOLLOW_candexpression_in_compound_rule_spec510);
            candexpression();

            state._fsp--;

            // ArchvalRulesetGrammar.g:69:37: ( 'OR' candexpression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==26) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:69:38: 'OR' candexpression
            	    {
            	    match(input,26,FOLLOW_26_in_compound_rule_spec513); 
            	    pushFollow(FOLLOW_candexpression_in_compound_rule_spec515);
            	    candexpression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


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
    // $ANTLR end "compound_rule_spec"


    // $ANTLR start "candexpression"
    // ArchvalRulesetGrammar.g:71:1: candexpression : cnotexpression ( 'AND' cnotexpression )* ;
    public final void candexpression() throws RecognitionException {
        try {
            // ArchvalRulesetGrammar.g:71:16: ( cnotexpression ( 'AND' cnotexpression )* )
            // ArchvalRulesetGrammar.g:71:18: cnotexpression ( 'AND' cnotexpression )*
            {
            pushFollow(FOLLOW_cnotexpression_in_candexpression525);
            cnotexpression();

            state._fsp--;

            // ArchvalRulesetGrammar.g:71:33: ( 'AND' cnotexpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==27) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:71:34: 'AND' cnotexpression
            	    {
            	    match(input,27,FOLLOW_27_in_candexpression528); 
            	    pushFollow(FOLLOW_cnotexpression_in_candexpression530);
            	    cnotexpression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


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
    // $ANTLR end "candexpression"


    // $ANTLR start "cnotexpression"
    // ArchvalRulesetGrammar.g:73:1: cnotexpression : ( 'NOT' )? Name ;
    public final void cnotexpression() throws RecognitionException {
        try {
            // ArchvalRulesetGrammar.g:73:16: ( ( 'NOT' )? Name )
            // ArchvalRulesetGrammar.g:73:18: ( 'NOT' )? Name
            {
            // ArchvalRulesetGrammar.g:73:18: ( 'NOT' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ArchvalRulesetGrammar.g:73:19: 'NOT'
                    {
                    match(input,28,FOLLOW_28_in_cnotexpression541); 

                    }
                    break;

            }

            match(input,Name,FOLLOW_Name_in_cnotexpression545); 

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
    // $ANTLR end "cnotexpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_atomic_rule_in_validation_unit28 = new BitSet(new long[]{0x000000000001C100L});
    public static final BitSet FOLLOW_compound_rule_in_validation_unit35 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_validate_command_in_validation_unit42 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_analyze_command_in_validation_unit49 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_EOF_in_validation_unit56 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_atomic_rule68 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Name_in_atomic_rule70 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_atomic_rule72 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Name_in_atomic_rule74 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_atomic_rule76 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_atomic_rule78 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_atomic_rule_spec_in_atomic_rule80 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_atomic_rule82 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_atomic_rule84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_compound_rule96 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Name_in_compound_rule98 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_compound_rule100 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_compound_rule_spec_in_compound_rule102 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_compound_rule104 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_compound_rule106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_validate_command118 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_validate_command120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_validate_command_params_in_validate_command122 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_validate_command124 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_validate_command126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_analyze_command138 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_analyze_command140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_analyze_command_params_in_analyze_command142 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_analyze_command144 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_analyze_command146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Name_in_validate_command_params154 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_validate_command_params157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Name_in_validate_command_params159 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_Name_in_analyze_command_params169 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_analyze_command_params172 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Name_in_analyze_command_params174 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_set_spec_clause_in_atomic_rule_spec184 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_atomic_rule_spec186 = new BitSet(new long[]{0x0000000070000210L});
    public static final BitSet FOLLOW_orexpression_in_atomic_rule_spec188 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_atomic_rule_spec190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_set_spec_clause205 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19_in_set_spec_clause211 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_set_spec_clause215 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_set_spec_clause217 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_set_spec_clause219 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_set_spec_clause222 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Name_in_set_spec_clause224 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_set_spec_clause226 = new BitSet(new long[]{0x0000000001100060L});
    public static final BitSet FOLLOW_selector_params_in_set_spec_clause228 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_set_spec_clause230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_set_spec_clause247 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19_in_set_spec_clause253 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_set_spec_clause257 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_set_spec_clause259 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_set_spec_clause261 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_set_spec_clause264 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Name_in_set_spec_clause266 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_set_spec_clause268 = new BitSet(new long[]{0x0000000001100060L});
    public static final BitSet FOLLOW_selector_params_in_set_spec_clause270 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_set_spec_clause272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andexpression_in_orexpression287 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_orexpression291 = new BitSet(new long[]{0x0000000070000210L});
    public static final BitSet FOLLOW_andexpression_in_orexpression294 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_notexpression_in_andexpression304 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_andexpression308 = new BitSet(new long[]{0x0000000070000210L});
    public static final BitSet FOLLOW_notexpression_in_andexpression311 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_28_in_notexpression322 = new BitSet(new long[]{0x0000000070000210L});
    public static final BitSet FOLLOW_atom_in_notexpression326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_atom334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_atom338 = new BitSet(new long[]{0x0000000070000210L});
    public static final BitSet FOLLOW_orexpression_in_atom340 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_atom342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_condition350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_condition354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Name_in_condition358 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_condition360 = new BitSet(new long[]{0x0000000000000670L});
    public static final BitSet FOLLOW_predicate_params_in_condition362 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_condition365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_param_in_predicate_params373 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_predicate_params376 = new BitSet(new long[]{0x0000000000000270L});
    public static final BitSet FOLLOW_predicate_param_in_predicate_params378 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_Number_in_predicate_param388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Label_in_predicate_param392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_expression_in_predicate_param396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_atom_in_set_expression404 = new BitSet(new long[]{0x0000000380000002L});
    public static final BitSet FOLLOW_31_in_set_expression409 = new BitSet(new long[]{0x0000000000000270L});
    public static final BitSet FOLLOW_32_in_set_expression415 = new BitSet(new long[]{0x0000000000000270L});
    public static final BitSet FOLLOW_33_in_set_expression421 = new BitSet(new long[]{0x0000000000000270L});
    public static final BitSet FOLLOW_set_atom_in_set_expression425 = new BitSet(new long[]{0x0000000380000002L});
    public static final BitSet FOLLOW_Name_in_set_atom439 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_set_atom441 = new BitSet(new long[]{0x0000000001100460L});
    public static final BitSet FOLLOW_selector_params_in_set_atom443 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_set_atom446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_set_atom458 = new BitSet(new long[]{0x0000000000000270L});
    public static final BitSet FOLLOW_set_expression_in_set_atom460 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_set_atom462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_param_in_selector_params475 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_selector_params478 = new BitSet(new long[]{0x0000000001100060L});
    public static final BitSet FOLLOW_selector_param_in_selector_params480 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_set_in_selector_param0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_candexpression_in_compound_rule_spec510 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_compound_rule_spec513 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_candexpression_in_compound_rule_spec515 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_cnotexpression_in_candexpression525 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_candexpression528 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_cnotexpression_in_candexpression530 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_28_in_cnotexpression541 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Name_in_cnotexpression545 = new BitSet(new long[]{0x0000000000000002L});

}