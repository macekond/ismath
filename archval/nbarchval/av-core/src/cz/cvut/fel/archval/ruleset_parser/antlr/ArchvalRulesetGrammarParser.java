// $ANTLR 3.1.3 July 11, 2010 13:49:50 ArchvalRulesetGrammar.g 2011-04-28 19:36:22

    package cz.cvut.fel.archval.ruleset_parser.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class ArchvalRulesetGrammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VALIDATION_UNIT", "ATOMIC_RULES", "COMPOUND_RULES", "VALIDATE_COMMANDS", "ANALYZE_COMMANDS", "RULE_EXPRESSION", "Name", "Number", "Label", "WS", "'atomic_rule'", "'('", "')'", "'{'", "'}'", "';'", "'compound_rule'", "'validate'", "'analyze'", "','", "'ALL'", "'EXISTS'", "'v'", "'IN'", "'V'", "'e'", "'E'", "':'", "'OR'", "'AND'", "'NOT'", "'true'", "'false'", "'INTERSECT'", "'UNION'", "'SETMINUS'"
    };
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
    public static final int WS=13;
    public static final int COMPOUND_RULES=6;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int Number=11;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int ANALYZE_COMMANDS=8;
    public static final int Name=10;
    public static final int Label=12;

    // delegates
    // delegators


        public ArchvalRulesetGrammarParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public ArchvalRulesetGrammarParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return ArchvalRulesetGrammarParser.tokenNames; }
    public String getGrammarFileName() { return "ArchvalRulesetGrammar.g"; }


    public static class validation_unit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "validation_unit"
    // ArchvalRulesetGrammar.g:27:1: validation_unit : ( atomic_rule )* ( compound_rule )* ( validate_command )* ( analyze_command )* EOF -> ^( VALIDATION_UNIT ^( ATOMIC_RULES ( atomic_rule )* ) ^( COMPOUND_RULES ( compound_rule )* ) ^( VALIDATE_COMMANDS ( validate_command )* ) ^( ANALYZE_COMMANDS ( analyze_command )* ) ) ;
    public final ArchvalRulesetGrammarParser.validation_unit_return validation_unit() throws RecognitionException {
        ArchvalRulesetGrammarParser.validation_unit_return retval = new ArchvalRulesetGrammarParser.validation_unit_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF5=null;
        ArchvalRulesetGrammarParser.atomic_rule_return atomic_rule1 = null;

        ArchvalRulesetGrammarParser.compound_rule_return compound_rule2 = null;

        ArchvalRulesetGrammarParser.validate_command_return validate_command3 = null;

        ArchvalRulesetGrammarParser.analyze_command_return analyze_command4 = null;


        Object EOF5_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_compound_rule=new RewriteRuleSubtreeStream(adaptor,"rule compound_rule");
        RewriteRuleSubtreeStream stream_validate_command=new RewriteRuleSubtreeStream(adaptor,"rule validate_command");
        RewriteRuleSubtreeStream stream_analyze_command=new RewriteRuleSubtreeStream(adaptor,"rule analyze_command");
        RewriteRuleSubtreeStream stream_atomic_rule=new RewriteRuleSubtreeStream(adaptor,"rule atomic_rule");
        try {
            // ArchvalRulesetGrammar.g:28:2: ( ( atomic_rule )* ( compound_rule )* ( validate_command )* ( analyze_command )* EOF -> ^( VALIDATION_UNIT ^( ATOMIC_RULES ( atomic_rule )* ) ^( COMPOUND_RULES ( compound_rule )* ) ^( VALIDATE_COMMANDS ( validate_command )* ) ^( ANALYZE_COMMANDS ( analyze_command )* ) ) )
            // ArchvalRulesetGrammar.g:29:2: ( atomic_rule )* ( compound_rule )* ( validate_command )* ( analyze_command )* EOF
            {
            // ArchvalRulesetGrammar.g:29:2: ( atomic_rule )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:29:2: atomic_rule
            	    {
            	    pushFollow(FOLLOW_atomic_rule_in_validation_unit94);
            	    atomic_rule1=atomic_rule();

            	    state._fsp--;

            	    stream_atomic_rule.add(atomic_rule1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ArchvalRulesetGrammar.g:30:2: ( compound_rule )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:30:2: compound_rule
            	    {
            	    pushFollow(FOLLOW_compound_rule_in_validation_unit98);
            	    compound_rule2=compound_rule();

            	    state._fsp--;

            	    stream_compound_rule.add(compound_rule2.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ArchvalRulesetGrammar.g:31:2: ( validate_command )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:31:2: validate_command
            	    {
            	    pushFollow(FOLLOW_validate_command_in_validation_unit102);
            	    validate_command3=validate_command();

            	    state._fsp--;

            	    stream_validate_command.add(validate_command3.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ArchvalRulesetGrammar.g:32:2: ( analyze_command )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:32:2: analyze_command
            	    {
            	    pushFollow(FOLLOW_analyze_command_in_validation_unit106);
            	    analyze_command4=analyze_command();

            	    state._fsp--;

            	    stream_analyze_command.add(analyze_command4.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            EOF5=(Token)match(input,EOF,FOLLOW_EOF_in_validation_unit110);  
            stream_EOF.add(EOF5);



            // AST REWRITE
            // elements: compound_rule, atomic_rule, analyze_command, validate_command
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 34:2: -> ^( VALIDATION_UNIT ^( ATOMIC_RULES ( atomic_rule )* ) ^( COMPOUND_RULES ( compound_rule )* ) ^( VALIDATE_COMMANDS ( validate_command )* ) ^( ANALYZE_COMMANDS ( analyze_command )* ) )
            {
                // ArchvalRulesetGrammar.g:35:2: ^( VALIDATION_UNIT ^( ATOMIC_RULES ( atomic_rule )* ) ^( COMPOUND_RULES ( compound_rule )* ) ^( VALIDATE_COMMANDS ( validate_command )* ) ^( ANALYZE_COMMANDS ( analyze_command )* ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VALIDATION_UNIT, "VALIDATION_UNIT"), root_1);

                // ArchvalRulesetGrammar.g:36:9: ^( ATOMIC_RULES ( atomic_rule )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATOMIC_RULES, "ATOMIC_RULES"), root_2);

                // ArchvalRulesetGrammar.g:36:24: ( atomic_rule )*
                while ( stream_atomic_rule.hasNext() ) {
                    adaptor.addChild(root_2, stream_atomic_rule.nextTree());

                }
                stream_atomic_rule.reset();

                adaptor.addChild(root_1, root_2);
                }
                // ArchvalRulesetGrammar.g:37:9: ^( COMPOUND_RULES ( compound_rule )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMPOUND_RULES, "COMPOUND_RULES"), root_2);

                // ArchvalRulesetGrammar.g:37:26: ( compound_rule )*
                while ( stream_compound_rule.hasNext() ) {
                    adaptor.addChild(root_2, stream_compound_rule.nextTree());

                }
                stream_compound_rule.reset();

                adaptor.addChild(root_1, root_2);
                }
                // ArchvalRulesetGrammar.g:38:9: ^( VALIDATE_COMMANDS ( validate_command )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(VALIDATE_COMMANDS, "VALIDATE_COMMANDS"), root_2);

                // ArchvalRulesetGrammar.g:38:29: ( validate_command )*
                while ( stream_validate_command.hasNext() ) {
                    adaptor.addChild(root_2, stream_validate_command.nextTree());

                }
                stream_validate_command.reset();

                adaptor.addChild(root_1, root_2);
                }
                // ArchvalRulesetGrammar.g:39:6: ^( ANALYZE_COMMANDS ( analyze_command )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ANALYZE_COMMANDS, "ANALYZE_COMMANDS"), root_2);

                // ArchvalRulesetGrammar.g:39:25: ( analyze_command )*
                while ( stream_analyze_command.hasNext() ) {
                    adaptor.addChild(root_2, stream_analyze_command.nextTree());

                }
                stream_analyze_command.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        finally {
        }
        return retval;
    }
    // $ANTLR end "validation_unit"

    public static class atomic_rule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atomic_rule"
    // ArchvalRulesetGrammar.g:42:1: atomic_rule : 'atomic_rule' rname= Name '(' grname= Name ')' '{' atomic_rule_spec '}' ';' -> ^( $rname $grname atomic_rule_spec ) ;
    public final ArchvalRulesetGrammarParser.atomic_rule_return atomic_rule() throws RecognitionException {
        ArchvalRulesetGrammarParser.atomic_rule_return retval = new ArchvalRulesetGrammarParser.atomic_rule_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token rname=null;
        Token grname=null;
        Token string_literal6=null;
        Token char_literal7=null;
        Token char_literal8=null;
        Token char_literal9=null;
        Token char_literal11=null;
        Token char_literal12=null;
        ArchvalRulesetGrammarParser.atomic_rule_spec_return atomic_rule_spec10 = null;


        Object rname_tree=null;
        Object grname_tree=null;
        Object string_literal6_tree=null;
        Object char_literal7_tree=null;
        Object char_literal8_tree=null;
        Object char_literal9_tree=null;
        Object char_literal11_tree=null;
        Object char_literal12_tree=null;
        RewriteRuleTokenStream stream_Name=new RewriteRuleTokenStream(adaptor,"token Name");
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleTokenStream stream_14=new RewriteRuleTokenStream(adaptor,"token 14");
        RewriteRuleSubtreeStream stream_atomic_rule_spec=new RewriteRuleSubtreeStream(adaptor,"rule atomic_rule_spec");
        try {
            // ArchvalRulesetGrammar.g:42:13: ( 'atomic_rule' rname= Name '(' grname= Name ')' '{' atomic_rule_spec '}' ';' -> ^( $rname $grname atomic_rule_spec ) )
            // ArchvalRulesetGrammar.g:43:2: 'atomic_rule' rname= Name '(' grname= Name ')' '{' atomic_rule_spec '}' ';'
            {
            string_literal6=(Token)match(input,14,FOLLOW_14_in_atomic_rule186);  
            stream_14.add(string_literal6);

            rname=(Token)match(input,Name,FOLLOW_Name_in_atomic_rule190);  
            stream_Name.add(rname);

            char_literal7=(Token)match(input,15,FOLLOW_15_in_atomic_rule192);  
            stream_15.add(char_literal7);

            grname=(Token)match(input,Name,FOLLOW_Name_in_atomic_rule196);  
            stream_Name.add(grname);

            char_literal8=(Token)match(input,16,FOLLOW_16_in_atomic_rule198);  
            stream_16.add(char_literal8);

            char_literal9=(Token)match(input,17,FOLLOW_17_in_atomic_rule200);  
            stream_17.add(char_literal9);

            pushFollow(FOLLOW_atomic_rule_spec_in_atomic_rule202);
            atomic_rule_spec10=atomic_rule_spec();

            state._fsp--;

            stream_atomic_rule_spec.add(atomic_rule_spec10.getTree());
            char_literal11=(Token)match(input,18,FOLLOW_18_in_atomic_rule204);  
            stream_18.add(char_literal11);

            char_literal12=(Token)match(input,19,FOLLOW_19_in_atomic_rule206);  
            stream_19.add(char_literal12);



            // AST REWRITE
            // elements: atomic_rule_spec, rname, grname
            // token labels: grname, rname
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_grname=new RewriteRuleTokenStream(adaptor,"token grname",grname);
            RewriteRuleTokenStream stream_rname=new RewriteRuleTokenStream(adaptor,"token rname",rname);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 44:2: -> ^( $rname $grname atomic_rule_spec )
            {
                // ArchvalRulesetGrammar.g:45:2: ^( $rname $grname atomic_rule_spec )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_rname.nextNode(), root_1);

                adaptor.addChild(root_1, stream_grname.nextNode());
                adaptor.addChild(root_1, stream_atomic_rule_spec.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        finally {
        }
        return retval;
    }
    // $ANTLR end "atomic_rule"

    public static class compound_rule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compound_rule"
    // ArchvalRulesetGrammar.g:48:1: compound_rule : 'compound_rule' Name '{' compound_rule_spec '}' ';' -> ^( Name compound_rule_spec ) ;
    public final ArchvalRulesetGrammarParser.compound_rule_return compound_rule() throws RecognitionException {
        ArchvalRulesetGrammarParser.compound_rule_return retval = new ArchvalRulesetGrammarParser.compound_rule_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal13=null;
        Token Name14=null;
        Token char_literal15=null;
        Token char_literal17=null;
        Token char_literal18=null;
        ArchvalRulesetGrammarParser.compound_rule_spec_return compound_rule_spec16 = null;


        Object string_literal13_tree=null;
        Object Name14_tree=null;
        Object char_literal15_tree=null;
        Object char_literal17_tree=null;
        Object char_literal18_tree=null;
        RewriteRuleTokenStream stream_Name=new RewriteRuleTokenStream(adaptor,"token Name");
        RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleSubtreeStream stream_compound_rule_spec=new RewriteRuleSubtreeStream(adaptor,"rule compound_rule_spec");
        try {
            // ArchvalRulesetGrammar.g:48:15: ( 'compound_rule' Name '{' compound_rule_spec '}' ';' -> ^( Name compound_rule_spec ) )
            // ArchvalRulesetGrammar.g:49:2: 'compound_rule' Name '{' compound_rule_spec '}' ';'
            {
            string_literal13=(Token)match(input,20,FOLLOW_20_in_compound_rule231);  
            stream_20.add(string_literal13);

            Name14=(Token)match(input,Name,FOLLOW_Name_in_compound_rule233);  
            stream_Name.add(Name14);

            char_literal15=(Token)match(input,17,FOLLOW_17_in_compound_rule235);  
            stream_17.add(char_literal15);

            pushFollow(FOLLOW_compound_rule_spec_in_compound_rule237);
            compound_rule_spec16=compound_rule_spec();

            state._fsp--;

            stream_compound_rule_spec.add(compound_rule_spec16.getTree());
            char_literal17=(Token)match(input,18,FOLLOW_18_in_compound_rule239);  
            stream_18.add(char_literal17);

            char_literal18=(Token)match(input,19,FOLLOW_19_in_compound_rule241);  
            stream_19.add(char_literal18);



            // AST REWRITE
            // elements: Name, compound_rule_spec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 50:2: -> ^( Name compound_rule_spec )
            {
                // ArchvalRulesetGrammar.g:51:2: ^( Name compound_rule_spec )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_Name.nextNode(), root_1);

                adaptor.addChild(root_1, stream_compound_rule_spec.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        finally {
        }
        return retval;
    }
    // $ANTLR end "compound_rule"

    public static class validate_command_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "validate_command"
    // ArchvalRulesetGrammar.g:54:1: validate_command : 'validate' '(' validate_command_params ')' ';' -> validate_command_params ;
    public final ArchvalRulesetGrammarParser.validate_command_return validate_command() throws RecognitionException {
        ArchvalRulesetGrammarParser.validate_command_return retval = new ArchvalRulesetGrammarParser.validate_command_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal19=null;
        Token char_literal20=null;
        Token char_literal22=null;
        Token char_literal23=null;
        ArchvalRulesetGrammarParser.validate_command_params_return validate_command_params21 = null;


        Object string_literal19_tree=null;
        Object char_literal20_tree=null;
        Object char_literal22_tree=null;
        Object char_literal23_tree=null;
        RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleSubtreeStream stream_validate_command_params=new RewriteRuleSubtreeStream(adaptor,"rule validate_command_params");
        try {
            // ArchvalRulesetGrammar.g:54:18: ( 'validate' '(' validate_command_params ')' ';' -> validate_command_params )
            // ArchvalRulesetGrammar.g:55:2: 'validate' '(' validate_command_params ')' ';'
            {
            string_literal19=(Token)match(input,21,FOLLOW_21_in_validate_command262);  
            stream_21.add(string_literal19);

            char_literal20=(Token)match(input,15,FOLLOW_15_in_validate_command264);  
            stream_15.add(char_literal20);

            pushFollow(FOLLOW_validate_command_params_in_validate_command266);
            validate_command_params21=validate_command_params();

            state._fsp--;

            stream_validate_command_params.add(validate_command_params21.getTree());
            char_literal22=(Token)match(input,16,FOLLOW_16_in_validate_command268);  
            stream_16.add(char_literal22);

            char_literal23=(Token)match(input,19,FOLLOW_19_in_validate_command270);  
            stream_19.add(char_literal23);



            // AST REWRITE
            // elements: validate_command_params
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 56:2: -> validate_command_params
            {
                adaptor.addChild(root_0, stream_validate_command_params.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        finally {
        }
        return retval;
    }
    // $ANTLR end "validate_command"

    public static class analyze_command_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "analyze_command"
    // ArchvalRulesetGrammar.g:60:1: analyze_command : 'analyze' '(' analyze_command_params ')' ';' -> analyze_command_params ;
    public final ArchvalRulesetGrammarParser.analyze_command_return analyze_command() throws RecognitionException {
        ArchvalRulesetGrammarParser.analyze_command_return retval = new ArchvalRulesetGrammarParser.analyze_command_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal24=null;
        Token char_literal25=null;
        Token char_literal27=null;
        Token char_literal28=null;
        ArchvalRulesetGrammarParser.analyze_command_params_return analyze_command_params26 = null;


        Object string_literal24_tree=null;
        Object char_literal25_tree=null;
        Object char_literal27_tree=null;
        Object char_literal28_tree=null;
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleSubtreeStream stream_analyze_command_params=new RewriteRuleSubtreeStream(adaptor,"rule analyze_command_params");
        try {
            // ArchvalRulesetGrammar.g:60:17: ( 'analyze' '(' analyze_command_params ')' ';' -> analyze_command_params )
            // ArchvalRulesetGrammar.g:61:2: 'analyze' '(' analyze_command_params ')' ';'
            {
            string_literal24=(Token)match(input,22,FOLLOW_22_in_analyze_command287);  
            stream_22.add(string_literal24);

            char_literal25=(Token)match(input,15,FOLLOW_15_in_analyze_command289);  
            stream_15.add(char_literal25);

            pushFollow(FOLLOW_analyze_command_params_in_analyze_command291);
            analyze_command_params26=analyze_command_params();

            state._fsp--;

            stream_analyze_command_params.add(analyze_command_params26.getTree());
            char_literal27=(Token)match(input,16,FOLLOW_16_in_analyze_command293);  
            stream_16.add(char_literal27);

            char_literal28=(Token)match(input,19,FOLLOW_19_in_analyze_command295);  
            stream_19.add(char_literal28);



            // AST REWRITE
            // elements: analyze_command_params
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 62:2: -> analyze_command_params
            {
                adaptor.addChild(root_0, stream_analyze_command_params.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        finally {
        }
        return retval;
    }
    // $ANTLR end "analyze_command"

    public static class validate_command_params_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "validate_command_params"
    // ArchvalRulesetGrammar.g:66:1: validate_command_params : Name ( ',' Name )* ;
    public final ArchvalRulesetGrammarParser.validate_command_params_return validate_command_params() throws RecognitionException {
        ArchvalRulesetGrammarParser.validate_command_params_return retval = new ArchvalRulesetGrammarParser.validate_command_params_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Name29=null;
        Token char_literal30=null;
        Token Name31=null;

        Object Name29_tree=null;
        Object char_literal30_tree=null;
        Object Name31_tree=null;

        try {
            // ArchvalRulesetGrammar.g:66:25: ( Name ( ',' Name )* )
            // ArchvalRulesetGrammar.g:67:2: Name ( ',' Name )*
            {
            root_0 = (Object)adaptor.nil();

            Name29=(Token)match(input,Name,FOLLOW_Name_in_validate_command_params312); 
            Name29_tree = (Object)adaptor.create(Name29);
            adaptor.addChild(root_0, Name29_tree);

            // ArchvalRulesetGrammar.g:67:7: ( ',' Name )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:67:8: ',' Name
            	    {
            	    char_literal30=(Token)match(input,23,FOLLOW_23_in_validate_command_params315); 
            	    Name31=(Token)match(input,Name,FOLLOW_Name_in_validate_command_params318); 
            	    Name31_tree = (Object)adaptor.create(Name31);
            	    adaptor.addChild(root_0, Name31_tree);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        finally {
        }
        return retval;
    }
    // $ANTLR end "validate_command_params"

    public static class analyze_command_params_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "analyze_command_params"
    // ArchvalRulesetGrammar.g:70:1: analyze_command_params : Name ( ',' Name )* ;
    public final ArchvalRulesetGrammarParser.analyze_command_params_return analyze_command_params() throws RecognitionException {
        ArchvalRulesetGrammarParser.analyze_command_params_return retval = new ArchvalRulesetGrammarParser.analyze_command_params_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Name32=null;
        Token char_literal33=null;
        Token Name34=null;

        Object Name32_tree=null;
        Object char_literal33_tree=null;
        Object Name34_tree=null;

        try {
            // ArchvalRulesetGrammar.g:70:24: ( Name ( ',' Name )* )
            // ArchvalRulesetGrammar.g:71:2: Name ( ',' Name )*
            {
            root_0 = (Object)adaptor.nil();

            Name32=(Token)match(input,Name,FOLLOW_Name_in_analyze_command_params331); 
            Name32_tree = (Object)adaptor.create(Name32);
            adaptor.addChild(root_0, Name32_tree);

            // ArchvalRulesetGrammar.g:71:7: ( ',' Name )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:71:8: ',' Name
            	    {
            	    char_literal33=(Token)match(input,23,FOLLOW_23_in_analyze_command_params334); 
            	    Name34=(Token)match(input,Name,FOLLOW_Name_in_analyze_command_params337); 
            	    Name34_tree = (Object)adaptor.create(Name34);
            	    adaptor.addChild(root_0, Name34_tree);


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        finally {
        }
        return retval;
    }
    // $ANTLR end "analyze_command_params"

    public static class atomic_rule_spec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atomic_rule_spec"
    // ArchvalRulesetGrammar.g:74:1: atomic_rule_spec : set_spec_clause '{' orexpression '}' -> set_spec_clause ^( RULE_EXPRESSION orexpression ) ;
    public final ArchvalRulesetGrammarParser.atomic_rule_spec_return atomic_rule_spec() throws RecognitionException {
        ArchvalRulesetGrammarParser.atomic_rule_spec_return retval = new ArchvalRulesetGrammarParser.atomic_rule_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal36=null;
        Token char_literal38=null;
        ArchvalRulesetGrammarParser.set_spec_clause_return set_spec_clause35 = null;

        ArchvalRulesetGrammarParser.orexpression_return orexpression37 = null;


        Object char_literal36_tree=null;
        Object char_literal38_tree=null;
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleSubtreeStream stream_set_spec_clause=new RewriteRuleSubtreeStream(adaptor,"rule set_spec_clause");
        RewriteRuleSubtreeStream stream_orexpression=new RewriteRuleSubtreeStream(adaptor,"rule orexpression");
        try {
            // ArchvalRulesetGrammar.g:74:18: ( set_spec_clause '{' orexpression '}' -> set_spec_clause ^( RULE_EXPRESSION orexpression ) )
            // ArchvalRulesetGrammar.g:75:2: set_spec_clause '{' orexpression '}'
            {
            pushFollow(FOLLOW_set_spec_clause_in_atomic_rule_spec350);
            set_spec_clause35=set_spec_clause();

            state._fsp--;

            stream_set_spec_clause.add(set_spec_clause35.getTree());
            char_literal36=(Token)match(input,17,FOLLOW_17_in_atomic_rule_spec352);  
            stream_17.add(char_literal36);

            pushFollow(FOLLOW_orexpression_in_atomic_rule_spec354);
            orexpression37=orexpression();

            state._fsp--;

            stream_orexpression.add(orexpression37.getTree());
            char_literal38=(Token)match(input,18,FOLLOW_18_in_atomic_rule_spec356);  
            stream_18.add(char_literal38);



            // AST REWRITE
            // elements: set_spec_clause, orexpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 76:2: -> set_spec_clause ^( RULE_EXPRESSION orexpression )
            {
                adaptor.addChild(root_0, stream_set_spec_clause.nextTree());
                // ArchvalRulesetGrammar.g:77:18: ^( RULE_EXPRESSION orexpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RULE_EXPRESSION, "RULE_EXPRESSION"), root_1);

                adaptor.addChild(root_1, stream_orexpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        finally {
        }
        return retval;
    }
    // $ANTLR end "atomic_rule_spec"

    public static class set_spec_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "set_spec_clause"
    // ArchvalRulesetGrammar.g:80:1: set_spec_clause : quantifier_clause quantification_variable ( quantification_predicate )? -> ^( quantifier_clause quantification_variable ) ( quantification_predicate )? ;
    public final ArchvalRulesetGrammarParser.set_spec_clause_return set_spec_clause() throws RecognitionException {
        ArchvalRulesetGrammarParser.set_spec_clause_return retval = new ArchvalRulesetGrammarParser.set_spec_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ArchvalRulesetGrammarParser.quantifier_clause_return quantifier_clause39 = null;

        ArchvalRulesetGrammarParser.quantification_variable_return quantification_variable40 = null;

        ArchvalRulesetGrammarParser.quantification_predicate_return quantification_predicate41 = null;


        RewriteRuleSubtreeStream stream_quantifier_clause=new RewriteRuleSubtreeStream(adaptor,"rule quantifier_clause");
        RewriteRuleSubtreeStream stream_quantification_variable=new RewriteRuleSubtreeStream(adaptor,"rule quantification_variable");
        RewriteRuleSubtreeStream stream_quantification_predicate=new RewriteRuleSubtreeStream(adaptor,"rule quantification_predicate");
        try {
            // ArchvalRulesetGrammar.g:81:2: ( quantifier_clause quantification_variable ( quantification_predicate )? -> ^( quantifier_clause quantification_variable ) ( quantification_predicate )? )
            // ArchvalRulesetGrammar.g:82:6: quantifier_clause quantification_variable ( quantification_predicate )?
            {
            pushFollow(FOLLOW_quantifier_clause_in_set_spec_clause384);
            quantifier_clause39=quantifier_clause();

            state._fsp--;

            stream_quantifier_clause.add(quantifier_clause39.getTree());
            pushFollow(FOLLOW_quantification_variable_in_set_spec_clause391);
            quantification_variable40=quantification_variable();

            state._fsp--;

            stream_quantification_variable.add(quantification_variable40.getTree());
            // ArchvalRulesetGrammar.g:84:6: ( quantification_predicate )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==31) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ArchvalRulesetGrammar.g:84:6: quantification_predicate
                    {
                    pushFollow(FOLLOW_quantification_predicate_in_set_spec_clause398);
                    quantification_predicate41=quantification_predicate();

                    state._fsp--;

                    stream_quantification_predicate.add(quantification_predicate41.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: quantification_variable, quantifier_clause, quantification_predicate
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 85:6: -> ^( quantifier_clause quantification_variable ) ( quantification_predicate )?
            {
                // ArchvalRulesetGrammar.g:86:6: ^( quantifier_clause quantification_variable )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_quantifier_clause.nextNode(), root_1);

                adaptor.addChild(root_1, stream_quantification_variable.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // ArchvalRulesetGrammar.g:88:9: ( quantification_predicate )?
                if ( stream_quantification_predicate.hasNext() ) {
                    adaptor.addChild(root_0, stream_quantification_predicate.nextTree());

                }
                stream_quantification_predicate.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        finally {
        }
        return retval;
    }
    // $ANTLR end "set_spec_clause"

    public static class quantifier_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "quantifier_clause"
    // ArchvalRulesetGrammar.g:91:1: quantifier_clause : ( 'ALL' | 'EXISTS' );
    public final ArchvalRulesetGrammarParser.quantifier_clause_return quantifier_clause() throws RecognitionException {
        ArchvalRulesetGrammarParser.quantifier_clause_return retval = new ArchvalRulesetGrammarParser.quantifier_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal42=null;
        Token string_literal43=null;

        Object string_literal42_tree=null;
        Object string_literal43_tree=null;

        try {
            // ArchvalRulesetGrammar.g:92:2: ( 'ALL' | 'EXISTS' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            else if ( (LA8_0==25) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ArchvalRulesetGrammar.g:93:2: 'ALL'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal42=(Token)match(input,24,FOLLOW_24_in_quantifier_clause449); 
                    string_literal42_tree = (Object)adaptor.create(string_literal42);
                    root_0 = (Object)adaptor.becomeRoot(string_literal42_tree, root_0);


                    }
                    break;
                case 2 :
                    // ArchvalRulesetGrammar.g:95:2: 'EXISTS'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal43=(Token)match(input,25,FOLLOW_25_in_quantifier_clause456); 
                    string_literal43_tree = (Object)adaptor.create(string_literal43);
                    root_0 = (Object)adaptor.becomeRoot(string_literal43_tree, root_0);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        finally {
        }
        return retval;
    }
    // $ANTLR end "quantifier_clause"

    public static class quantification_variable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "quantification_variable"
    // ArchvalRulesetGrammar.g:98:1: quantification_variable : ( 'v' 'IN' 'V' -> ^( 'v' ^( 'IN' 'V' ) ) | 'e' 'IN' 'E' -> ^( 'e' ^( 'IN' 'E' ) ) );
    public final ArchvalRulesetGrammarParser.quantification_variable_return quantification_variable() throws RecognitionException {
        ArchvalRulesetGrammarParser.quantification_variable_return retval = new ArchvalRulesetGrammarParser.quantification_variable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal44=null;
        Token string_literal45=null;
        Token char_literal46=null;
        Token char_literal47=null;
        Token string_literal48=null;
        Token char_literal49=null;

        Object char_literal44_tree=null;
        Object string_literal45_tree=null;
        Object char_literal46_tree=null;
        Object char_literal47_tree=null;
        Object string_literal48_tree=null;
        Object char_literal49_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");

        try {
            // ArchvalRulesetGrammar.g:99:2: ( 'v' 'IN' 'V' -> ^( 'v' ^( 'IN' 'V' ) ) | 'e' 'IN' 'E' -> ^( 'e' ^( 'IN' 'E' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            else if ( (LA9_0==29) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ArchvalRulesetGrammar.g:100:2: 'v' 'IN' 'V'
                    {
                    char_literal44=(Token)match(input,26,FOLLOW_26_in_quantification_variable469);  
                    stream_26.add(char_literal44);

                    string_literal45=(Token)match(input,27,FOLLOW_27_in_quantification_variable471);  
                    stream_27.add(string_literal45);

                    char_literal46=(Token)match(input,28,FOLLOW_28_in_quantification_variable473);  
                    stream_28.add(char_literal46);



                    // AST REWRITE
                    // elements: 27, 26, 28
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 100:15: -> ^( 'v' ^( 'IN' 'V' ) )
                    {
                        // ArchvalRulesetGrammar.g:100:18: ^( 'v' ^( 'IN' 'V' ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_26.nextNode(), root_1);

                        // ArchvalRulesetGrammar.g:100:24: ^( 'IN' 'V' )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_27.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_28.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // ArchvalRulesetGrammar.g:102:2: 'e' 'IN' 'E'
                    {
                    char_literal47=(Token)match(input,29,FOLLOW_29_in_quantification_variable491);  
                    stream_29.add(char_literal47);

                    string_literal48=(Token)match(input,27,FOLLOW_27_in_quantification_variable493);  
                    stream_27.add(string_literal48);

                    char_literal49=(Token)match(input,30,FOLLOW_30_in_quantification_variable495);  
                    stream_30.add(char_literal49);



                    // AST REWRITE
                    // elements: 30, 29, 27
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 102:15: -> ^( 'e' ^( 'IN' 'E' ) )
                    {
                        // ArchvalRulesetGrammar.g:102:18: ^( 'e' ^( 'IN' 'E' ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_29.nextNode(), root_1);

                        // ArchvalRulesetGrammar.g:102:24: ^( 'IN' 'E' )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_27.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_30.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        finally {
        }
        return retval;
    }
    // $ANTLR end "quantification_variable"

    public static class quantification_predicate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "quantification_predicate"
    // ArchvalRulesetGrammar.g:105:1: quantification_predicate : ( ':' Name '(' selector_params ')' ) -> ^( Name selector_params ) ;
    public final ArchvalRulesetGrammarParser.quantification_predicate_return quantification_predicate() throws RecognitionException {
        ArchvalRulesetGrammarParser.quantification_predicate_return retval = new ArchvalRulesetGrammarParser.quantification_predicate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal50=null;
        Token Name51=null;
        Token char_literal52=null;
        Token char_literal54=null;
        ArchvalRulesetGrammarParser.selector_params_return selector_params53 = null;


        Object char_literal50_tree=null;
        Object Name51_tree=null;
        Object char_literal52_tree=null;
        Object char_literal54_tree=null;
        RewriteRuleTokenStream stream_Name=new RewriteRuleTokenStream(adaptor,"token Name");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleSubtreeStream stream_selector_params=new RewriteRuleSubtreeStream(adaptor,"rule selector_params");
        try {
            // ArchvalRulesetGrammar.g:106:2: ( ( ':' Name '(' selector_params ')' ) -> ^( Name selector_params ) )
            // ArchvalRulesetGrammar.g:107:2: ( ':' Name '(' selector_params ')' )
            {
            // ArchvalRulesetGrammar.g:107:2: ( ':' Name '(' selector_params ')' )
            // ArchvalRulesetGrammar.g:107:3: ':' Name '(' selector_params ')'
            {
            char_literal50=(Token)match(input,31,FOLLOW_31_in_quantification_predicate520);  
            stream_31.add(char_literal50);

            Name51=(Token)match(input,Name,FOLLOW_Name_in_quantification_predicate522);  
            stream_Name.add(Name51);

            char_literal52=(Token)match(input,15,FOLLOW_15_in_quantification_predicate524);  
            stream_15.add(char_literal52);

            pushFollow(FOLLOW_selector_params_in_quantification_predicate526);
            selector_params53=selector_params();

            state._fsp--;

            stream_selector_params.add(selector_params53.getTree());
            char_literal54=(Token)match(input,16,FOLLOW_16_in_quantification_predicate528);  
            stream_16.add(char_literal54);


            }



            // AST REWRITE
            // elements: selector_params, Name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 108:2: -> ^( Name selector_params )
            {
                // ArchvalRulesetGrammar.g:109:2: ^( Name selector_params )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_Name.nextNode(), root_1);

                adaptor.addChild(root_1, stream_selector_params.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        finally {
        }
        return retval;
    }
    // $ANTLR end "quantification_predicate"

    public static class orexpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orexpression"
    // ArchvalRulesetGrammar.g:112:1: orexpression : andexpression ( 'OR' andexpression )* ;
    public final ArchvalRulesetGrammarParser.orexpression_return orexpression() throws RecognitionException {
        ArchvalRulesetGrammarParser.orexpression_return retval = new ArchvalRulesetGrammarParser.orexpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal56=null;
        ArchvalRulesetGrammarParser.andexpression_return andexpression55 = null;

        ArchvalRulesetGrammarParser.andexpression_return andexpression57 = null;


        Object string_literal56_tree=null;

        try {
            // ArchvalRulesetGrammar.g:113:2: ( andexpression ( 'OR' andexpression )* )
            // ArchvalRulesetGrammar.g:114:2: andexpression ( 'OR' andexpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_andexpression_in_orexpression551);
            andexpression55=andexpression();

            state._fsp--;

            adaptor.addChild(root_0, andexpression55.getTree());
            // ArchvalRulesetGrammar.g:114:16: ( 'OR' andexpression )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==32) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:114:17: 'OR' andexpression
            	    {
            	    string_literal56=(Token)match(input,32,FOLLOW_32_in_orexpression554); 
            	    string_literal56_tree = (Object)adaptor.create(string_literal56);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal56_tree, root_0);

            	    pushFollow(FOLLOW_andexpression_in_orexpression557);
            	    andexpression57=andexpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, andexpression57.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        finally {
        }
        return retval;
    }
    // $ANTLR end "orexpression"

    public static class andexpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "andexpression"
    // ArchvalRulesetGrammar.g:117:1: andexpression : notexpression ( 'AND' notexpression )* ;
    public final ArchvalRulesetGrammarParser.andexpression_return andexpression() throws RecognitionException {
        ArchvalRulesetGrammarParser.andexpression_return retval = new ArchvalRulesetGrammarParser.andexpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal59=null;
        ArchvalRulesetGrammarParser.notexpression_return notexpression58 = null;

        ArchvalRulesetGrammarParser.notexpression_return notexpression60 = null;


        Object string_literal59_tree=null;

        try {
            // ArchvalRulesetGrammar.g:118:2: ( notexpression ( 'AND' notexpression )* )
            // ArchvalRulesetGrammar.g:119:2: notexpression ( 'AND' notexpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_notexpression_in_andexpression571);
            notexpression58=notexpression();

            state._fsp--;

            adaptor.addChild(root_0, notexpression58.getTree());
            // ArchvalRulesetGrammar.g:119:16: ( 'AND' notexpression )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==33) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:119:17: 'AND' notexpression
            	    {
            	    string_literal59=(Token)match(input,33,FOLLOW_33_in_andexpression574); 
            	    string_literal59_tree = (Object)adaptor.create(string_literal59);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal59_tree, root_0);

            	    pushFollow(FOLLOW_notexpression_in_andexpression577);
            	    notexpression60=notexpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, notexpression60.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        finally {
        }
        return retval;
    }
    // $ANTLR end "andexpression"

    public static class notexpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "notexpression"
    // ArchvalRulesetGrammar.g:122:1: notexpression : ( 'NOT' )? atom ;
    public final ArchvalRulesetGrammarParser.notexpression_return notexpression() throws RecognitionException {
        ArchvalRulesetGrammarParser.notexpression_return retval = new ArchvalRulesetGrammarParser.notexpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal61=null;
        ArchvalRulesetGrammarParser.atom_return atom62 = null;


        Object string_literal61_tree=null;

        try {
            // ArchvalRulesetGrammar.g:123:2: ( ( 'NOT' )? atom )
            // ArchvalRulesetGrammar.g:124:6: ( 'NOT' )? atom
            {
            root_0 = (Object)adaptor.nil();

            // ArchvalRulesetGrammar.g:124:11: ( 'NOT' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==34) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ArchvalRulesetGrammar.g:124:11: 'NOT'
                    {
                    string_literal61=(Token)match(input,34,FOLLOW_34_in_notexpression595); 
                    string_literal61_tree = (Object)adaptor.create(string_literal61);
                    root_0 = (Object)adaptor.becomeRoot(string_literal61_tree, root_0);


                    }
                    break;

            }

            pushFollow(FOLLOW_atom_in_notexpression599);
            atom62=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom62.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        finally {
        }
        return retval;
    }
    // $ANTLR end "notexpression"

    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // ArchvalRulesetGrammar.g:127:1: atom : ( condition | '(' orexpression ')' -> orexpression );
    public final ArchvalRulesetGrammarParser.atom_return atom() throws RecognitionException {
        ArchvalRulesetGrammarParser.atom_return retval = new ArchvalRulesetGrammarParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal64=null;
        Token char_literal66=null;
        ArchvalRulesetGrammarParser.condition_return condition63 = null;

        ArchvalRulesetGrammarParser.orexpression_return orexpression65 = null;


        Object char_literal64_tree=null;
        Object char_literal66_tree=null;
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleSubtreeStream stream_orexpression=new RewriteRuleSubtreeStream(adaptor,"rule orexpression");
        try {
            // ArchvalRulesetGrammar.g:128:2: ( condition | '(' orexpression ')' -> orexpression )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Name||(LA13_0>=35 && LA13_0<=36)) ) {
                alt13=1;
            }
            else if ( (LA13_0==15) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ArchvalRulesetGrammar.g:129:2: condition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_condition_in_atom616);
                    condition63=condition();

                    state._fsp--;

                    adaptor.addChild(root_0, condition63.getTree());

                    }
                    break;
                case 2 :
                    // ArchvalRulesetGrammar.g:131:2: '(' orexpression ')'
                    {
                    char_literal64=(Token)match(input,15,FOLLOW_15_in_atom622);  
                    stream_15.add(char_literal64);

                    pushFollow(FOLLOW_orexpression_in_atom624);
                    orexpression65=orexpression();

                    state._fsp--;

                    stream_orexpression.add(orexpression65.getTree());
                    char_literal66=(Token)match(input,16,FOLLOW_16_in_atom626);  
                    stream_16.add(char_literal66);



                    // AST REWRITE
                    // elements: orexpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 132:2: -> orexpression
                    {
                        adaptor.addChild(root_0, stream_orexpression.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class condition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condition"
    // ArchvalRulesetGrammar.g:136:1: condition : ( 'true' | 'false' | Name '(' ( predicate_params )? ')' -> ^( Name ( predicate_params )? ) );
    public final ArchvalRulesetGrammarParser.condition_return condition() throws RecognitionException {
        ArchvalRulesetGrammarParser.condition_return retval = new ArchvalRulesetGrammarParser.condition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal67=null;
        Token string_literal68=null;
        Token Name69=null;
        Token char_literal70=null;
        Token char_literal72=null;
        ArchvalRulesetGrammarParser.predicate_params_return predicate_params71 = null;


        Object string_literal67_tree=null;
        Object string_literal68_tree=null;
        Object Name69_tree=null;
        Object char_literal70_tree=null;
        Object char_literal72_tree=null;
        RewriteRuleTokenStream stream_Name=new RewriteRuleTokenStream(adaptor,"token Name");
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleSubtreeStream stream_predicate_params=new RewriteRuleSubtreeStream(adaptor,"rule predicate_params");
        try {
            // ArchvalRulesetGrammar.g:137:2: ( 'true' | 'false' | Name '(' ( predicate_params )? ')' -> ^( Name ( predicate_params )? ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt15=1;
                }
                break;
            case 36:
                {
                alt15=2;
                }
                break;
            case Name:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ArchvalRulesetGrammar.g:138:2: 'true'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal67=(Token)match(input,35,FOLLOW_35_in_condition644); 
                    string_literal67_tree = (Object)adaptor.create(string_literal67);
                    adaptor.addChild(root_0, string_literal67_tree);


                    }
                    break;
                case 2 :
                    // ArchvalRulesetGrammar.g:140:2: 'false'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal68=(Token)match(input,36,FOLLOW_36_in_condition650); 
                    string_literal68_tree = (Object)adaptor.create(string_literal68);
                    adaptor.addChild(root_0, string_literal68_tree);


                    }
                    break;
                case 3 :
                    // ArchvalRulesetGrammar.g:142:2: Name '(' ( predicate_params )? ')'
                    {
                    Name69=(Token)match(input,Name,FOLLOW_Name_in_condition656);  
                    stream_Name.add(Name69);

                    char_literal70=(Token)match(input,15,FOLLOW_15_in_condition658);  
                    stream_15.add(char_literal70);

                    // ArchvalRulesetGrammar.g:142:11: ( predicate_params )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0>=Name && LA14_0<=Label)||LA14_0==15) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ArchvalRulesetGrammar.g:142:11: predicate_params
                            {
                            pushFollow(FOLLOW_predicate_params_in_condition660);
                            predicate_params71=predicate_params();

                            state._fsp--;

                            stream_predicate_params.add(predicate_params71.getTree());

                            }
                            break;

                    }

                    char_literal72=(Token)match(input,16,FOLLOW_16_in_condition663);  
                    stream_16.add(char_literal72);



                    // AST REWRITE
                    // elements: predicate_params, Name
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 143:2: -> ^( Name ( predicate_params )? )
                    {
                        // ArchvalRulesetGrammar.g:144:2: ^( Name ( predicate_params )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_Name.nextNode(), root_1);

                        // ArchvalRulesetGrammar.g:144:9: ( predicate_params )?
                        if ( stream_predicate_params.hasNext() ) {
                            adaptor.addChild(root_1, stream_predicate_params.nextTree());

                        }
                        stream_predicate_params.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        finally {
        }
        return retval;
    }
    // $ANTLR end "condition"

    public static class predicate_params_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "predicate_params"
    // ArchvalRulesetGrammar.g:147:1: predicate_params : predicate_param ( ',' predicate_param )* -> predicate_param ( predicate_param )* ;
    public final ArchvalRulesetGrammarParser.predicate_params_return predicate_params() throws RecognitionException {
        ArchvalRulesetGrammarParser.predicate_params_return retval = new ArchvalRulesetGrammarParser.predicate_params_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal74=null;
        ArchvalRulesetGrammarParser.predicate_param_return predicate_param73 = null;

        ArchvalRulesetGrammarParser.predicate_param_return predicate_param75 = null;


        Object char_literal74_tree=null;
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleSubtreeStream stream_predicate_param=new RewriteRuleSubtreeStream(adaptor,"rule predicate_param");
        try {
            // ArchvalRulesetGrammar.g:148:2: ( predicate_param ( ',' predicate_param )* -> predicate_param ( predicate_param )* )
            // ArchvalRulesetGrammar.g:149:2: predicate_param ( ',' predicate_param )*
            {
            pushFollow(FOLLOW_predicate_param_in_predicate_params686);
            predicate_param73=predicate_param();

            state._fsp--;

            stream_predicate_param.add(predicate_param73.getTree());
            // ArchvalRulesetGrammar.g:149:18: ( ',' predicate_param )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:149:19: ',' predicate_param
            	    {
            	    char_literal74=(Token)match(input,23,FOLLOW_23_in_predicate_params689);  
            	    stream_23.add(char_literal74);

            	    pushFollow(FOLLOW_predicate_param_in_predicate_params691);
            	    predicate_param75=predicate_param();

            	    state._fsp--;

            	    stream_predicate_param.add(predicate_param75.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);



            // AST REWRITE
            // elements: predicate_param, predicate_param
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 150:2: -> predicate_param ( predicate_param )*
            {
                adaptor.addChild(root_0, stream_predicate_param.nextTree());
                // ArchvalRulesetGrammar.g:151:18: ( predicate_param )*
                while ( stream_predicate_param.hasNext() ) {
                    adaptor.addChild(root_0, stream_predicate_param.nextTree());

                }
                stream_predicate_param.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        finally {
        }
        return retval;
    }
    // $ANTLR end "predicate_params"

    public static class predicate_param_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "predicate_param"
    // ArchvalRulesetGrammar.g:154:1: predicate_param : ( Number | Label | set_expression );
    public final ArchvalRulesetGrammarParser.predicate_param_return predicate_param() throws RecognitionException {
        ArchvalRulesetGrammarParser.predicate_param_return retval = new ArchvalRulesetGrammarParser.predicate_param_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Number76=null;
        Token Label77=null;
        ArchvalRulesetGrammarParser.set_expression_return set_expression78 = null;


        Object Number76_tree=null;
        Object Label77_tree=null;

        try {
            // ArchvalRulesetGrammar.g:155:2: ( Number | Label | set_expression )
            int alt17=3;
            switch ( input.LA(1) ) {
            case Number:
                {
                alt17=1;
                }
                break;
            case Label:
                {
                alt17=2;
                }
                break;
            case Name:
            case 15:
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
                    // ArchvalRulesetGrammar.g:156:2: Number
                    {
                    root_0 = (Object)adaptor.nil();

                    Number76=(Token)match(input,Number,FOLLOW_Number_in_predicate_param714); 
                    Number76_tree = (Object)adaptor.create(Number76);
                    adaptor.addChild(root_0, Number76_tree);


                    }
                    break;
                case 2 :
                    // ArchvalRulesetGrammar.g:158:2: Label
                    {
                    root_0 = (Object)adaptor.nil();

                    Label77=(Token)match(input,Label,FOLLOW_Label_in_predicate_param720); 
                    Label77_tree = (Object)adaptor.create(Label77);
                    adaptor.addChild(root_0, Label77_tree);


                    }
                    break;
                case 3 :
                    // ArchvalRulesetGrammar.g:160:2: set_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_set_expression_in_predicate_param726);
                    set_expression78=set_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, set_expression78.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        finally {
        }
        return retval;
    }
    // $ANTLR end "predicate_param"

    public static class set_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "set_expression"
    // ArchvalRulesetGrammar.g:163:1: set_expression : set_atom ( ( 'INTERSECT' | 'UNION' | 'SETMINUS' ) set_atom )* ;
    public final ArchvalRulesetGrammarParser.set_expression_return set_expression() throws RecognitionException {
        ArchvalRulesetGrammarParser.set_expression_return retval = new ArchvalRulesetGrammarParser.set_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal80=null;
        Token string_literal81=null;
        Token string_literal82=null;
        ArchvalRulesetGrammarParser.set_atom_return set_atom79 = null;

        ArchvalRulesetGrammarParser.set_atom_return set_atom83 = null;


        Object string_literal80_tree=null;
        Object string_literal81_tree=null;
        Object string_literal82_tree=null;

        try {
            // ArchvalRulesetGrammar.g:164:2: ( set_atom ( ( 'INTERSECT' | 'UNION' | 'SETMINUS' ) set_atom )* )
            // ArchvalRulesetGrammar.g:165:2: set_atom ( ( 'INTERSECT' | 'UNION' | 'SETMINUS' ) set_atom )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_set_atom_in_set_expression738);
            set_atom79=set_atom();

            state._fsp--;

            adaptor.addChild(root_0, set_atom79.getTree());
            // ArchvalRulesetGrammar.g:165:11: ( ( 'INTERSECT' | 'UNION' | 'SETMINUS' ) set_atom )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=37 && LA19_0<=39)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:165:12: ( 'INTERSECT' | 'UNION' | 'SETMINUS' ) set_atom
            	    {
            	    // ArchvalRulesetGrammar.g:165:12: ( 'INTERSECT' | 'UNION' | 'SETMINUS' )
            	    int alt18=3;
            	    switch ( input.LA(1) ) {
            	    case 37:
            	        {
            	        alt18=1;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt18=2;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt18=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt18) {
            	        case 1 :
            	            // ArchvalRulesetGrammar.g:165:13: 'INTERSECT'
            	            {
            	            string_literal80=(Token)match(input,37,FOLLOW_37_in_set_expression742); 
            	            string_literal80_tree = (Object)adaptor.create(string_literal80);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal80_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // ArchvalRulesetGrammar.g:165:28: 'UNION'
            	            {
            	            string_literal81=(Token)match(input,38,FOLLOW_38_in_set_expression747); 
            	            string_literal81_tree = (Object)adaptor.create(string_literal81);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal81_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // ArchvalRulesetGrammar.g:165:39: 'SETMINUS'
            	            {
            	            string_literal82=(Token)match(input,39,FOLLOW_39_in_set_expression752); 
            	            string_literal82_tree = (Object)adaptor.create(string_literal82);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal82_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_set_atom_in_set_expression756);
            	    set_atom83=set_atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, set_atom83.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        finally {
        }
        return retval;
    }
    // $ANTLR end "set_expression"

    public static class set_atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "set_atom"
    // ArchvalRulesetGrammar.g:168:1: set_atom : ( Name '(' ( selector_params )? ')' -> ^( Name ( selector_params )? ) | '(' set_expression ')' -> set_expression );
    public final ArchvalRulesetGrammarParser.set_atom_return set_atom() throws RecognitionException {
        ArchvalRulesetGrammarParser.set_atom_return retval = new ArchvalRulesetGrammarParser.set_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Name84=null;
        Token char_literal85=null;
        Token char_literal87=null;
        Token char_literal88=null;
        Token char_literal90=null;
        ArchvalRulesetGrammarParser.selector_params_return selector_params86 = null;

        ArchvalRulesetGrammarParser.set_expression_return set_expression89 = null;


        Object Name84_tree=null;
        Object char_literal85_tree=null;
        Object char_literal87_tree=null;
        Object char_literal88_tree=null;
        Object char_literal90_tree=null;
        RewriteRuleTokenStream stream_Name=new RewriteRuleTokenStream(adaptor,"token Name");
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleSubtreeStream stream_selector_params=new RewriteRuleSubtreeStream(adaptor,"rule selector_params");
        RewriteRuleSubtreeStream stream_set_expression=new RewriteRuleSubtreeStream(adaptor,"rule set_expression");
        try {
            // ArchvalRulesetGrammar.g:169:2: ( Name '(' ( selector_params )? ')' -> ^( Name ( selector_params )? ) | '(' set_expression ')' -> set_expression )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Name) ) {
                alt21=1;
            }
            else if ( (LA21_0==15) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ArchvalRulesetGrammar.g:170:8: Name '(' ( selector_params )? ')'
                    {
                    Name84=(Token)match(input,Name,FOLLOW_Name_in_set_atom776);  
                    stream_Name.add(Name84);

                    char_literal85=(Token)match(input,15,FOLLOW_15_in_set_atom778);  
                    stream_15.add(char_literal85);

                    // ArchvalRulesetGrammar.g:170:17: ( selector_params )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( ((LA20_0>=Number && LA20_0<=Label)||LA20_0==26||LA20_0==29) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ArchvalRulesetGrammar.g:170:17: selector_params
                            {
                            pushFollow(FOLLOW_selector_params_in_set_atom780);
                            selector_params86=selector_params();

                            state._fsp--;

                            stream_selector_params.add(selector_params86.getTree());

                            }
                            break;

                    }

                    char_literal87=(Token)match(input,16,FOLLOW_16_in_set_atom783);  
                    stream_16.add(char_literal87);



                    // AST REWRITE
                    // elements: selector_params, Name
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 171:8: -> ^( Name ( selector_params )? )
                    {
                        // ArchvalRulesetGrammar.g:172:8: ^( Name ( selector_params )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_Name.nextNode(), root_1);

                        // ArchvalRulesetGrammar.g:172:15: ( selector_params )?
                        if ( stream_selector_params.hasNext() ) {
                            adaptor.addChild(root_1, stream_selector_params.nextTree());

                        }
                        stream_selector_params.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // ArchvalRulesetGrammar.g:174:2: '(' set_expression ')'
                    {
                    char_literal88=(Token)match(input,15,FOLLOW_15_in_set_atom812);  
                    stream_15.add(char_literal88);

                    pushFollow(FOLLOW_set_expression_in_set_atom814);
                    set_expression89=set_expression();

                    state._fsp--;

                    stream_set_expression.add(set_expression89.getTree());
                    char_literal90=(Token)match(input,16,FOLLOW_16_in_set_atom816);  
                    stream_16.add(char_literal90);



                    // AST REWRITE
                    // elements: set_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 175:2: -> set_expression
                    {
                        adaptor.addChild(root_0, stream_set_expression.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        finally {
        }
        return retval;
    }
    // $ANTLR end "set_atom"

    public static class selector_params_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selector_params"
    // ArchvalRulesetGrammar.g:179:1: selector_params : selector_param ( ',' selector_param )* -> selector_param ( selector_param )* ;
    public final ArchvalRulesetGrammarParser.selector_params_return selector_params() throws RecognitionException {
        ArchvalRulesetGrammarParser.selector_params_return retval = new ArchvalRulesetGrammarParser.selector_params_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal92=null;
        ArchvalRulesetGrammarParser.selector_param_return selector_param91 = null;

        ArchvalRulesetGrammarParser.selector_param_return selector_param93 = null;


        Object char_literal92_tree=null;
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleSubtreeStream stream_selector_param=new RewriteRuleSubtreeStream(adaptor,"rule selector_param");
        try {
            // ArchvalRulesetGrammar.g:180:2: ( selector_param ( ',' selector_param )* -> selector_param ( selector_param )* )
            // ArchvalRulesetGrammar.g:181:2: selector_param ( ',' selector_param )*
            {
            pushFollow(FOLLOW_selector_param_in_selector_params834);
            selector_param91=selector_param();

            state._fsp--;

            stream_selector_param.add(selector_param91.getTree());
            // ArchvalRulesetGrammar.g:181:17: ( ',' selector_param )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==23) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:181:18: ',' selector_param
            	    {
            	    char_literal92=(Token)match(input,23,FOLLOW_23_in_selector_params837);  
            	    stream_23.add(char_literal92);

            	    pushFollow(FOLLOW_selector_param_in_selector_params839);
            	    selector_param93=selector_param();

            	    state._fsp--;

            	    stream_selector_param.add(selector_param93.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);



            // AST REWRITE
            // elements: selector_param, selector_param
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 182:2: -> selector_param ( selector_param )*
            {
                adaptor.addChild(root_0, stream_selector_param.nextTree());
                // ArchvalRulesetGrammar.g:183:17: ( selector_param )*
                while ( stream_selector_param.hasNext() ) {
                    adaptor.addChild(root_0, stream_selector_param.nextTree());

                }
                stream_selector_param.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        finally {
        }
        return retval;
    }
    // $ANTLR end "selector_params"

    public static class selector_param_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selector_param"
    // ArchvalRulesetGrammar.g:186:1: selector_param : ( 'v' | 'e' | Number | Label );
    public final ArchvalRulesetGrammarParser.selector_param_return selector_param() throws RecognitionException {
        ArchvalRulesetGrammarParser.selector_param_return retval = new ArchvalRulesetGrammarParser.selector_param_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set94=null;

        Object set94_tree=null;

        try {
            // ArchvalRulesetGrammar.g:187:2: ( 'v' | 'e' | Number | Label )
            // ArchvalRulesetGrammar.g:
            {
            root_0 = (Object)adaptor.nil();

            set94=(Token)input.LT(1);
            if ( (input.LA(1)>=Number && input.LA(1)<=Label)||input.LA(1)==26||input.LA(1)==29 ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set94));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        finally {
        }
        return retval;
    }
    // $ANTLR end "selector_param"

    public static class compound_rule_spec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compound_rule_spec"
    // ArchvalRulesetGrammar.g:197:1: compound_rule_spec : candexpression ( 'OR' candexpression )* ;
    public final ArchvalRulesetGrammarParser.compound_rule_spec_return compound_rule_spec() throws RecognitionException {
        ArchvalRulesetGrammarParser.compound_rule_spec_return retval = new ArchvalRulesetGrammarParser.compound_rule_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal96=null;
        ArchvalRulesetGrammarParser.candexpression_return candexpression95 = null;

        ArchvalRulesetGrammarParser.candexpression_return candexpression97 = null;


        Object string_literal96_tree=null;

        try {
            // ArchvalRulesetGrammar.g:198:2: ( candexpression ( 'OR' candexpression )* )
            // ArchvalRulesetGrammar.g:199:2: candexpression ( 'OR' candexpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_candexpression_in_compound_rule_spec892);
            candexpression95=candexpression();

            state._fsp--;

            adaptor.addChild(root_0, candexpression95.getTree());
            // ArchvalRulesetGrammar.g:199:17: ( 'OR' candexpression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==32) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:199:18: 'OR' candexpression
            	    {
            	    string_literal96=(Token)match(input,32,FOLLOW_32_in_compound_rule_spec895); 
            	    string_literal96_tree = (Object)adaptor.create(string_literal96);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal96_tree, root_0);

            	    pushFollow(FOLLOW_candexpression_in_compound_rule_spec898);
            	    candexpression97=candexpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, candexpression97.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        finally {
        }
        return retval;
    }
    // $ANTLR end "compound_rule_spec"

    public static class candexpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "candexpression"
    // ArchvalRulesetGrammar.g:202:1: candexpression : cnotexpression ( 'AND' cnotexpression )* ;
    public final ArchvalRulesetGrammarParser.candexpression_return candexpression() throws RecognitionException {
        ArchvalRulesetGrammarParser.candexpression_return retval = new ArchvalRulesetGrammarParser.candexpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal99=null;
        ArchvalRulesetGrammarParser.cnotexpression_return cnotexpression98 = null;

        ArchvalRulesetGrammarParser.cnotexpression_return cnotexpression100 = null;


        Object string_literal99_tree=null;

        try {
            // ArchvalRulesetGrammar.g:203:2: ( cnotexpression ( 'AND' cnotexpression )* )
            // ArchvalRulesetGrammar.g:204:2: cnotexpression ( 'AND' cnotexpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_cnotexpression_in_candexpression912);
            cnotexpression98=cnotexpression();

            state._fsp--;

            adaptor.addChild(root_0, cnotexpression98.getTree());
            // ArchvalRulesetGrammar.g:204:17: ( 'AND' cnotexpression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==33) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:204:18: 'AND' cnotexpression
            	    {
            	    string_literal99=(Token)match(input,33,FOLLOW_33_in_candexpression915); 
            	    string_literal99_tree = (Object)adaptor.create(string_literal99);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal99_tree, root_0);

            	    pushFollow(FOLLOW_cnotexpression_in_candexpression918);
            	    cnotexpression100=cnotexpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, cnotexpression100.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        finally {
        }
        return retval;
    }
    // $ANTLR end "candexpression"

    public static class cnotexpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cnotexpression"
    // ArchvalRulesetGrammar.g:207:1: cnotexpression : ( 'NOT' )? catom ;
    public final ArchvalRulesetGrammarParser.cnotexpression_return cnotexpression() throws RecognitionException {
        ArchvalRulesetGrammarParser.cnotexpression_return retval = new ArchvalRulesetGrammarParser.cnotexpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal101=null;
        ArchvalRulesetGrammarParser.catom_return catom102 = null;


        Object string_literal101_tree=null;

        try {
            // ArchvalRulesetGrammar.g:208:2: ( ( 'NOT' )? catom )
            // ArchvalRulesetGrammar.g:209:2: ( 'NOT' )? catom
            {
            root_0 = (Object)adaptor.nil();

            // ArchvalRulesetGrammar.g:209:7: ( 'NOT' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ArchvalRulesetGrammar.g:209:7: 'NOT'
                    {
                    string_literal101=(Token)match(input,34,FOLLOW_34_in_cnotexpression932); 
                    string_literal101_tree = (Object)adaptor.create(string_literal101);
                    root_0 = (Object)adaptor.becomeRoot(string_literal101_tree, root_0);


                    }
                    break;

            }

            pushFollow(FOLLOW_catom_in_cnotexpression936);
            catom102=catom();

            state._fsp--;

            adaptor.addChild(root_0, catom102.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        finally {
        }
        return retval;
    }
    // $ANTLR end "cnotexpression"

    public static class catom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catom"
    // ArchvalRulesetGrammar.g:212:1: catom : ( Name | '(' compound_rule_spec ')' -> compound_rule_spec );
    public final ArchvalRulesetGrammarParser.catom_return catom() throws RecognitionException {
        ArchvalRulesetGrammarParser.catom_return retval = new ArchvalRulesetGrammarParser.catom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Name103=null;
        Token char_literal104=null;
        Token char_literal106=null;
        ArchvalRulesetGrammarParser.compound_rule_spec_return compound_rule_spec105 = null;


        Object Name103_tree=null;
        Object char_literal104_tree=null;
        Object char_literal106_tree=null;
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleSubtreeStream stream_compound_rule_spec=new RewriteRuleSubtreeStream(adaptor,"rule compound_rule_spec");
        try {
            // ArchvalRulesetGrammar.g:213:2: ( Name | '(' compound_rule_spec ')' -> compound_rule_spec )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Name) ) {
                alt26=1;
            }
            else if ( (LA26_0==15) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ArchvalRulesetGrammar.g:214:2: Name
                    {
                    root_0 = (Object)adaptor.nil();

                    Name103=(Token)match(input,Name,FOLLOW_Name_in_catom948); 
                    Name103_tree = (Object)adaptor.create(Name103);
                    adaptor.addChild(root_0, Name103_tree);


                    }
                    break;
                case 2 :
                    // ArchvalRulesetGrammar.g:216:2: '(' compound_rule_spec ')'
                    {
                    char_literal104=(Token)match(input,15,FOLLOW_15_in_catom954);  
                    stream_15.add(char_literal104);

                    pushFollow(FOLLOW_compound_rule_spec_in_catom956);
                    compound_rule_spec105=compound_rule_spec();

                    state._fsp--;

                    stream_compound_rule_spec.add(compound_rule_spec105.getTree());
                    char_literal106=(Token)match(input,16,FOLLOW_16_in_catom958);  
                    stream_16.add(char_literal106);



                    // AST REWRITE
                    // elements: compound_rule_spec
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 217:2: -> compound_rule_spec
                    {
                        adaptor.addChild(root_0, stream_compound_rule_spec.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        finally {
        }
        return retval;
    }
    // $ANTLR end "catom"

    // Delegated rules


 

    public static final BitSet FOLLOW_atomic_rule_in_validation_unit94 = new BitSet(new long[]{0x0000000000704000L});
    public static final BitSet FOLLOW_compound_rule_in_validation_unit98 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_validate_command_in_validation_unit102 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_analyze_command_in_validation_unit106 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_EOF_in_validation_unit110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_atomic_rule186 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_Name_in_atomic_rule190 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_atomic_rule192 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_Name_in_atomic_rule196 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_atomic_rule198 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_atomic_rule200 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_atomic_rule_spec_in_atomic_rule202 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_atomic_rule204 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_atomic_rule206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_compound_rule231 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_Name_in_compound_rule233 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_compound_rule235 = new BitSet(new long[]{0x0000000400008400L});
    public static final BitSet FOLLOW_compound_rule_spec_in_compound_rule237 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_compound_rule239 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_compound_rule241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_validate_command262 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_validate_command264 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_validate_command_params_in_validate_command266 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_validate_command268 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_validate_command270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_analyze_command287 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_analyze_command289 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_analyze_command_params_in_analyze_command291 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_analyze_command293 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_analyze_command295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Name_in_validate_command_params312 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_validate_command_params315 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_Name_in_validate_command_params318 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_Name_in_analyze_command_params331 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_analyze_command_params334 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_Name_in_analyze_command_params337 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_set_spec_clause_in_atomic_rule_spec350 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_atomic_rule_spec352 = new BitSet(new long[]{0x0000001C00008400L});
    public static final BitSet FOLLOW_orexpression_in_atomic_rule_spec354 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_atomic_rule_spec356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quantifier_clause_in_set_spec_clause384 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_quantification_variable_in_set_spec_clause391 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_quantification_predicate_in_set_spec_clause398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_quantifier_clause449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_quantifier_clause456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_quantification_variable469 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_quantification_variable471 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_quantification_variable473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_quantification_variable491 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_quantification_variable493 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_quantification_variable495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_quantification_predicate520 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_Name_in_quantification_predicate522 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_quantification_predicate524 = new BitSet(new long[]{0x0000000024001800L});
    public static final BitSet FOLLOW_selector_params_in_quantification_predicate526 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_quantification_predicate528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andexpression_in_orexpression551 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_orexpression554 = new BitSet(new long[]{0x0000001C00008400L});
    public static final BitSet FOLLOW_andexpression_in_orexpression557 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_notexpression_in_andexpression571 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_andexpression574 = new BitSet(new long[]{0x0000001C00008400L});
    public static final BitSet FOLLOW_notexpression_in_andexpression577 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_34_in_notexpression595 = new BitSet(new long[]{0x0000001C00008400L});
    public static final BitSet FOLLOW_atom_in_notexpression599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_atom616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_atom622 = new BitSet(new long[]{0x0000001C00008400L});
    public static final BitSet FOLLOW_orexpression_in_atom624 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_atom626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_condition644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_condition650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Name_in_condition656 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_condition658 = new BitSet(new long[]{0x0000000000019C00L});
    public static final BitSet FOLLOW_predicate_params_in_condition660 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_condition663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_param_in_predicate_params686 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_predicate_params689 = new BitSet(new long[]{0x0000000000009C00L});
    public static final BitSet FOLLOW_predicate_param_in_predicate_params691 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_Number_in_predicate_param714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Label_in_predicate_param720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_expression_in_predicate_param726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_atom_in_set_expression738 = new BitSet(new long[]{0x000000E000000002L});
    public static final BitSet FOLLOW_37_in_set_expression742 = new BitSet(new long[]{0x0000000000009C00L});
    public static final BitSet FOLLOW_38_in_set_expression747 = new BitSet(new long[]{0x0000000000009C00L});
    public static final BitSet FOLLOW_39_in_set_expression752 = new BitSet(new long[]{0x0000000000009C00L});
    public static final BitSet FOLLOW_set_atom_in_set_expression756 = new BitSet(new long[]{0x000000E000000002L});
    public static final BitSet FOLLOW_Name_in_set_atom776 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_set_atom778 = new BitSet(new long[]{0x0000000024011800L});
    public static final BitSet FOLLOW_selector_params_in_set_atom780 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_set_atom783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_set_atom812 = new BitSet(new long[]{0x0000000000009C00L});
    public static final BitSet FOLLOW_set_expression_in_set_atom814 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_set_atom816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_param_in_selector_params834 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_selector_params837 = new BitSet(new long[]{0x0000000024001800L});
    public static final BitSet FOLLOW_selector_param_in_selector_params839 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_set_in_selector_param0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_candexpression_in_compound_rule_spec892 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_compound_rule_spec895 = new BitSet(new long[]{0x0000000400008400L});
    public static final BitSet FOLLOW_candexpression_in_compound_rule_spec898 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_cnotexpression_in_candexpression912 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_candexpression915 = new BitSet(new long[]{0x0000000400008400L});
    public static final BitSet FOLLOW_cnotexpression_in_candexpression918 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_34_in_cnotexpression932 = new BitSet(new long[]{0x0000000400008400L});
    public static final BitSet FOLLOW_catom_in_cnotexpression936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Name_in_catom948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_catom954 = new BitSet(new long[]{0x0000000400008400L});
    public static final BitSet FOLLOW_compound_rule_spec_in_catom956 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_catom958 = new BitSet(new long[]{0x0000000000000002L});

}