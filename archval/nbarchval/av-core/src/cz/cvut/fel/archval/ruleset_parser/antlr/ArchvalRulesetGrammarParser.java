// $ANTLR 3.1.3 July 11, 2010 13:49:50 ArchvalRulesetGrammar.g 2011-05-01 20:14:00

    package cz.cvut.fel.archval.ruleset_parser.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class ArchvalRulesetGrammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VALIDATION_UNIT", "ATOMIC_RULES", "COMPOUND_RULES", "VALIDATE_COMMANDS", "ANALYZE_COMMANDS", "RULE_EXPRESSION", "ATOMIC_RULE_KW", "Name", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMICOLON", "COMPOUND_RULE_KW", "VALIDATE_KW", "ANALYZE_KW", "COMMA", "ALL", "EXISTS", "Vertex", "IN", "VertexSet", "Edge", "EdgeSet", "COLON", "OR", "AND", "NOT", "True", "False", "Number", "Label", "INTERSECT", "UNION", "SETMINUS", "WS"
    };
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
    public static final int INTERSECT=36;
    public static final int RPAREN=13;
    public static final int WS=39;
    public static final int COMPOUND_RULES=6;
    public static final int IN=24;
    public static final int Number=34;
    public static final int EdgeSet=27;
    public static final int COMMA=20;
    public static final int Edge=26;
    public static final int Vertex=23;
    public static final int ALL=21;
    public static final int OR=29;
    public static final int ANALYZE_COMMANDS=8;
    public static final int VALIDATE_KW=18;
    public static final int Name=11;
    public static final int EXISTS=22;
    public static final int True=32;
    public static final int SETMINUS=38;
    public static final int Label=35;

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

                if ( (LA1_0==ATOMIC_RULE_KW) ) {
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

                if ( (LA2_0==COMPOUND_RULE_KW) ) {
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

                if ( (LA3_0==VALIDATE_KW) ) {
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

                if ( (LA4_0==ANALYZE_KW) ) {
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
            // elements: analyze_command, compound_rule, atomic_rule, validate_command
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
    // ArchvalRulesetGrammar.g:42:1: atomic_rule : ATOMIC_RULE_KW rname= Name LPAREN grname= Name RPAREN LBRACE atomic_rule_spec RBRACE SEMICOLON -> ^( $rname $grname atomic_rule_spec ) ;
    public final ArchvalRulesetGrammarParser.atomic_rule_return atomic_rule() throws RecognitionException {
        ArchvalRulesetGrammarParser.atomic_rule_return retval = new ArchvalRulesetGrammarParser.atomic_rule_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token rname=null;
        Token grname=null;
        Token ATOMIC_RULE_KW6=null;
        Token LPAREN7=null;
        Token RPAREN8=null;
        Token LBRACE9=null;
        Token RBRACE11=null;
        Token SEMICOLON12=null;
        ArchvalRulesetGrammarParser.atomic_rule_spec_return atomic_rule_spec10 = null;


        Object rname_tree=null;
        Object grname_tree=null;
        Object ATOMIC_RULE_KW6_tree=null;
        Object LPAREN7_tree=null;
        Object RPAREN8_tree=null;
        Object LBRACE9_tree=null;
        Object RBRACE11_tree=null;
        Object SEMICOLON12_tree=null;
        RewriteRuleTokenStream stream_Name=new RewriteRuleTokenStream(adaptor,"token Name");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_ATOMIC_RULE_KW=new RewriteRuleTokenStream(adaptor,"token ATOMIC_RULE_KW");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_atomic_rule_spec=new RewriteRuleSubtreeStream(adaptor,"rule atomic_rule_spec");
        try {
            // ArchvalRulesetGrammar.g:42:13: ( ATOMIC_RULE_KW rname= Name LPAREN grname= Name RPAREN LBRACE atomic_rule_spec RBRACE SEMICOLON -> ^( $rname $grname atomic_rule_spec ) )
            // ArchvalRulesetGrammar.g:43:2: ATOMIC_RULE_KW rname= Name LPAREN grname= Name RPAREN LBRACE atomic_rule_spec RBRACE SEMICOLON
            {
            ATOMIC_RULE_KW6=(Token)match(input,ATOMIC_RULE_KW,FOLLOW_ATOMIC_RULE_KW_in_atomic_rule186);  
            stream_ATOMIC_RULE_KW.add(ATOMIC_RULE_KW6);

            rname=(Token)match(input,Name,FOLLOW_Name_in_atomic_rule190);  
            stream_Name.add(rname);

            LPAREN7=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atomic_rule192);  
            stream_LPAREN.add(LPAREN7);

            grname=(Token)match(input,Name,FOLLOW_Name_in_atomic_rule196);  
            stream_Name.add(grname);

            RPAREN8=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atomic_rule198);  
            stream_RPAREN.add(RPAREN8);

            LBRACE9=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_atomic_rule201);  
            stream_LBRACE.add(LBRACE9);

            pushFollow(FOLLOW_atomic_rule_spec_in_atomic_rule203);
            atomic_rule_spec10=atomic_rule_spec();

            state._fsp--;

            stream_atomic_rule_spec.add(atomic_rule_spec10.getTree());
            RBRACE11=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_atomic_rule205);  
            stream_RBRACE.add(RBRACE11);

            SEMICOLON12=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_atomic_rule207);  
            stream_SEMICOLON.add(SEMICOLON12);



            // AST REWRITE
            // elements: rname, grname, atomic_rule_spec
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
            // 45:2: -> ^( $rname $grname atomic_rule_spec )
            {
                // ArchvalRulesetGrammar.g:46:2: ^( $rname $grname atomic_rule_spec )
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
    // ArchvalRulesetGrammar.g:49:1: compound_rule : COMPOUND_RULE_KW Name LBRACE compound_rule_spec RBRACE SEMICOLON -> ^( Name compound_rule_spec ) ;
    public final ArchvalRulesetGrammarParser.compound_rule_return compound_rule() throws RecognitionException {
        ArchvalRulesetGrammarParser.compound_rule_return retval = new ArchvalRulesetGrammarParser.compound_rule_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMPOUND_RULE_KW13=null;
        Token Name14=null;
        Token LBRACE15=null;
        Token RBRACE17=null;
        Token SEMICOLON18=null;
        ArchvalRulesetGrammarParser.compound_rule_spec_return compound_rule_spec16 = null;


        Object COMPOUND_RULE_KW13_tree=null;
        Object Name14_tree=null;
        Object LBRACE15_tree=null;
        Object RBRACE17_tree=null;
        Object SEMICOLON18_tree=null;
        RewriteRuleTokenStream stream_COMPOUND_RULE_KW=new RewriteRuleTokenStream(adaptor,"token COMPOUND_RULE_KW");
        RewriteRuleTokenStream stream_Name=new RewriteRuleTokenStream(adaptor,"token Name");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_compound_rule_spec=new RewriteRuleSubtreeStream(adaptor,"rule compound_rule_spec");
        try {
            // ArchvalRulesetGrammar.g:49:15: ( COMPOUND_RULE_KW Name LBRACE compound_rule_spec RBRACE SEMICOLON -> ^( Name compound_rule_spec ) )
            // ArchvalRulesetGrammar.g:50:2: COMPOUND_RULE_KW Name LBRACE compound_rule_spec RBRACE SEMICOLON
            {
            COMPOUND_RULE_KW13=(Token)match(input,COMPOUND_RULE_KW,FOLLOW_COMPOUND_RULE_KW_in_compound_rule232);  
            stream_COMPOUND_RULE_KW.add(COMPOUND_RULE_KW13);

            Name14=(Token)match(input,Name,FOLLOW_Name_in_compound_rule234);  
            stream_Name.add(Name14);

            LBRACE15=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_compound_rule237);  
            stream_LBRACE.add(LBRACE15);

            pushFollow(FOLLOW_compound_rule_spec_in_compound_rule239);
            compound_rule_spec16=compound_rule_spec();

            state._fsp--;

            stream_compound_rule_spec.add(compound_rule_spec16.getTree());
            RBRACE17=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_compound_rule241);  
            stream_RBRACE.add(RBRACE17);

            SEMICOLON18=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_compound_rule243);  
            stream_SEMICOLON.add(SEMICOLON18);



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
            // 52:2: -> ^( Name compound_rule_spec )
            {
                // ArchvalRulesetGrammar.g:53:2: ^( Name compound_rule_spec )
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
    // ArchvalRulesetGrammar.g:56:1: validate_command : VALIDATE_KW LPAREN validate_command_params RPAREN SEMICOLON -> validate_command_params ;
    public final ArchvalRulesetGrammarParser.validate_command_return validate_command() throws RecognitionException {
        ArchvalRulesetGrammarParser.validate_command_return retval = new ArchvalRulesetGrammarParser.validate_command_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VALIDATE_KW19=null;
        Token LPAREN20=null;
        Token RPAREN22=null;
        Token SEMICOLON23=null;
        ArchvalRulesetGrammarParser.validate_command_params_return validate_command_params21 = null;


        Object VALIDATE_KW19_tree=null;
        Object LPAREN20_tree=null;
        Object RPAREN22_tree=null;
        Object SEMICOLON23_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_VALIDATE_KW=new RewriteRuleTokenStream(adaptor,"token VALIDATE_KW");
        RewriteRuleSubtreeStream stream_validate_command_params=new RewriteRuleSubtreeStream(adaptor,"rule validate_command_params");
        try {
            // ArchvalRulesetGrammar.g:56:18: ( VALIDATE_KW LPAREN validate_command_params RPAREN SEMICOLON -> validate_command_params )
            // ArchvalRulesetGrammar.g:57:2: VALIDATE_KW LPAREN validate_command_params RPAREN SEMICOLON
            {
            VALIDATE_KW19=(Token)match(input,VALIDATE_KW,FOLLOW_VALIDATE_KW_in_validate_command264);  
            stream_VALIDATE_KW.add(VALIDATE_KW19);

            LPAREN20=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_validate_command266);  
            stream_LPAREN.add(LPAREN20);

            pushFollow(FOLLOW_validate_command_params_in_validate_command268);
            validate_command_params21=validate_command_params();

            state._fsp--;

            stream_validate_command_params.add(validate_command_params21.getTree());
            RPAREN22=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_validate_command271);  
            stream_RPAREN.add(RPAREN22);

            SEMICOLON23=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_validate_command273);  
            stream_SEMICOLON.add(SEMICOLON23);



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
            // 59:2: -> validate_command_params
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
    // ArchvalRulesetGrammar.g:63:1: analyze_command : ANALYZE_KW LPAREN analyze_command_params RPAREN SEMICOLON -> analyze_command_params ;
    public final ArchvalRulesetGrammarParser.analyze_command_return analyze_command() throws RecognitionException {
        ArchvalRulesetGrammarParser.analyze_command_return retval = new ArchvalRulesetGrammarParser.analyze_command_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ANALYZE_KW24=null;
        Token LPAREN25=null;
        Token RPAREN27=null;
        Token SEMICOLON28=null;
        ArchvalRulesetGrammarParser.analyze_command_params_return analyze_command_params26 = null;


        Object ANALYZE_KW24_tree=null;
        Object LPAREN25_tree=null;
        Object RPAREN27_tree=null;
        Object SEMICOLON28_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_ANALYZE_KW=new RewriteRuleTokenStream(adaptor,"token ANALYZE_KW");
        RewriteRuleSubtreeStream stream_analyze_command_params=new RewriteRuleSubtreeStream(adaptor,"rule analyze_command_params");
        try {
            // ArchvalRulesetGrammar.g:63:17: ( ANALYZE_KW LPAREN analyze_command_params RPAREN SEMICOLON -> analyze_command_params )
            // ArchvalRulesetGrammar.g:64:2: ANALYZE_KW LPAREN analyze_command_params RPAREN SEMICOLON
            {
            ANALYZE_KW24=(Token)match(input,ANALYZE_KW,FOLLOW_ANALYZE_KW_in_analyze_command290);  
            stream_ANALYZE_KW.add(ANALYZE_KW24);

            LPAREN25=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_analyze_command292);  
            stream_LPAREN.add(LPAREN25);

            pushFollow(FOLLOW_analyze_command_params_in_analyze_command294);
            analyze_command_params26=analyze_command_params();

            state._fsp--;

            stream_analyze_command_params.add(analyze_command_params26.getTree());
            RPAREN27=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_analyze_command297);  
            stream_RPAREN.add(RPAREN27);

            SEMICOLON28=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_analyze_command299);  
            stream_SEMICOLON.add(SEMICOLON28);



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
            // 66:2: -> analyze_command_params
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
    // ArchvalRulesetGrammar.g:70:1: validate_command_params : Name ( COMMA Name )* ;
    public final ArchvalRulesetGrammarParser.validate_command_params_return validate_command_params() throws RecognitionException {
        ArchvalRulesetGrammarParser.validate_command_params_return retval = new ArchvalRulesetGrammarParser.validate_command_params_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Name29=null;
        Token COMMA30=null;
        Token Name31=null;

        Object Name29_tree=null;
        Object COMMA30_tree=null;
        Object Name31_tree=null;

        try {
            // ArchvalRulesetGrammar.g:70:25: ( Name ( COMMA Name )* )
            // ArchvalRulesetGrammar.g:71:2: Name ( COMMA Name )*
            {
            root_0 = (Object)adaptor.nil();

            Name29=(Token)match(input,Name,FOLLOW_Name_in_validate_command_params316); 
            Name29_tree = (Object)adaptor.create(Name29);
            adaptor.addChild(root_0, Name29_tree);

            // ArchvalRulesetGrammar.g:71:7: ( COMMA Name )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:71:8: COMMA Name
            	    {
            	    COMMA30=(Token)match(input,COMMA,FOLLOW_COMMA_in_validate_command_params319); 
            	    Name31=(Token)match(input,Name,FOLLOW_Name_in_validate_command_params322); 
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
    // ArchvalRulesetGrammar.g:74:1: analyze_command_params : Name ( COMMA Name )* ;
    public final ArchvalRulesetGrammarParser.analyze_command_params_return analyze_command_params() throws RecognitionException {
        ArchvalRulesetGrammarParser.analyze_command_params_return retval = new ArchvalRulesetGrammarParser.analyze_command_params_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Name32=null;
        Token COMMA33=null;
        Token Name34=null;

        Object Name32_tree=null;
        Object COMMA33_tree=null;
        Object Name34_tree=null;

        try {
            // ArchvalRulesetGrammar.g:74:24: ( Name ( COMMA Name )* )
            // ArchvalRulesetGrammar.g:75:2: Name ( COMMA Name )*
            {
            root_0 = (Object)adaptor.nil();

            Name32=(Token)match(input,Name,FOLLOW_Name_in_analyze_command_params335); 
            Name32_tree = (Object)adaptor.create(Name32);
            adaptor.addChild(root_0, Name32_tree);

            // ArchvalRulesetGrammar.g:75:7: ( COMMA Name )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:75:8: COMMA Name
            	    {
            	    COMMA33=(Token)match(input,COMMA,FOLLOW_COMMA_in_analyze_command_params338); 
            	    Name34=(Token)match(input,Name,FOLLOW_Name_in_analyze_command_params341); 
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
    // ArchvalRulesetGrammar.g:78:1: atomic_rule_spec : set_spec_clause LBRACE orexpression RBRACE -> set_spec_clause ^( RULE_EXPRESSION orexpression ) ;
    public final ArchvalRulesetGrammarParser.atomic_rule_spec_return atomic_rule_spec() throws RecognitionException {
        ArchvalRulesetGrammarParser.atomic_rule_spec_return retval = new ArchvalRulesetGrammarParser.atomic_rule_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LBRACE36=null;
        Token RBRACE38=null;
        ArchvalRulesetGrammarParser.set_spec_clause_return set_spec_clause35 = null;

        ArchvalRulesetGrammarParser.orexpression_return orexpression37 = null;


        Object LBRACE36_tree=null;
        Object RBRACE38_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_set_spec_clause=new RewriteRuleSubtreeStream(adaptor,"rule set_spec_clause");
        RewriteRuleSubtreeStream stream_orexpression=new RewriteRuleSubtreeStream(adaptor,"rule orexpression");
        try {
            // ArchvalRulesetGrammar.g:78:18: ( set_spec_clause LBRACE orexpression RBRACE -> set_spec_clause ^( RULE_EXPRESSION orexpression ) )
            // ArchvalRulesetGrammar.g:79:2: set_spec_clause LBRACE orexpression RBRACE
            {
            pushFollow(FOLLOW_set_spec_clause_in_atomic_rule_spec354);
            set_spec_clause35=set_spec_clause();

            state._fsp--;

            stream_set_spec_clause.add(set_spec_clause35.getTree());
            LBRACE36=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_atomic_rule_spec356);  
            stream_LBRACE.add(LBRACE36);

            pushFollow(FOLLOW_orexpression_in_atomic_rule_spec358);
            orexpression37=orexpression();

            state._fsp--;

            stream_orexpression.add(orexpression37.getTree());
            RBRACE38=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_atomic_rule_spec360);  
            stream_RBRACE.add(RBRACE38);



            // AST REWRITE
            // elements: orexpression, set_spec_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 80:2: -> set_spec_clause ^( RULE_EXPRESSION orexpression )
            {
                adaptor.addChild(root_0, stream_set_spec_clause.nextTree());
                // ArchvalRulesetGrammar.g:81:18: ^( RULE_EXPRESSION orexpression )
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
    // ArchvalRulesetGrammar.g:84:1: set_spec_clause : quantifier_clause quantification_variable ( quantification_predicate )? -> ^( quantifier_clause quantification_variable ) ( quantification_predicate )? ;
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
            // ArchvalRulesetGrammar.g:85:2: ( quantifier_clause quantification_variable ( quantification_predicate )? -> ^( quantifier_clause quantification_variable ) ( quantification_predicate )? )
            // ArchvalRulesetGrammar.g:86:6: quantifier_clause quantification_variable ( quantification_predicate )?
            {
            pushFollow(FOLLOW_quantifier_clause_in_set_spec_clause388);
            quantifier_clause39=quantifier_clause();

            state._fsp--;

            stream_quantifier_clause.add(quantifier_clause39.getTree());
            pushFollow(FOLLOW_quantification_variable_in_set_spec_clause395);
            quantification_variable40=quantification_variable();

            state._fsp--;

            stream_quantification_variable.add(quantification_variable40.getTree());
            // ArchvalRulesetGrammar.g:88:6: ( quantification_predicate )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==COLON) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ArchvalRulesetGrammar.g:88:6: quantification_predicate
                    {
                    pushFollow(FOLLOW_quantification_predicate_in_set_spec_clause402);
                    quantification_predicate41=quantification_predicate();

                    state._fsp--;

                    stream_quantification_predicate.add(quantification_predicate41.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: quantifier_clause, quantification_predicate, quantification_variable
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 89:6: -> ^( quantifier_clause quantification_variable ) ( quantification_predicate )?
            {
                // ArchvalRulesetGrammar.g:90:6: ^( quantifier_clause quantification_variable )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_quantifier_clause.nextNode(), root_1);

                adaptor.addChild(root_1, stream_quantification_variable.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // ArchvalRulesetGrammar.g:92:9: ( quantification_predicate )?
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
    // ArchvalRulesetGrammar.g:95:1: quantifier_clause : ( ALL | EXISTS );
    public final ArchvalRulesetGrammarParser.quantifier_clause_return quantifier_clause() throws RecognitionException {
        ArchvalRulesetGrammarParser.quantifier_clause_return retval = new ArchvalRulesetGrammarParser.quantifier_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ALL42=null;
        Token EXISTS43=null;

        Object ALL42_tree=null;
        Object EXISTS43_tree=null;

        try {
            // ArchvalRulesetGrammar.g:96:2: ( ALL | EXISTS )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ALL) ) {
                alt8=1;
            }
            else if ( (LA8_0==EXISTS) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ArchvalRulesetGrammar.g:97:2: ALL
                    {
                    root_0 = (Object)adaptor.nil();

                    ALL42=(Token)match(input,ALL,FOLLOW_ALL_in_quantifier_clause453); 
                    ALL42_tree = (Object)adaptor.create(ALL42);
                    root_0 = (Object)adaptor.becomeRoot(ALL42_tree, root_0);


                    }
                    break;
                case 2 :
                    // ArchvalRulesetGrammar.g:99:2: EXISTS
                    {
                    root_0 = (Object)adaptor.nil();

                    EXISTS43=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_quantifier_clause460); 
                    EXISTS43_tree = (Object)adaptor.create(EXISTS43);
                    root_0 = (Object)adaptor.becomeRoot(EXISTS43_tree, root_0);


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
    // ArchvalRulesetGrammar.g:102:1: quantification_variable : ( Vertex IN VertexSet -> ^( Vertex ^( IN VertexSet ) ) | Edge IN EdgeSet -> ^( Edge ^( IN EdgeSet ) ) );
    public final ArchvalRulesetGrammarParser.quantification_variable_return quantification_variable() throws RecognitionException {
        ArchvalRulesetGrammarParser.quantification_variable_return retval = new ArchvalRulesetGrammarParser.quantification_variable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Vertex44=null;
        Token IN45=null;
        Token VertexSet46=null;
        Token Edge47=null;
        Token IN48=null;
        Token EdgeSet49=null;

        Object Vertex44_tree=null;
        Object IN45_tree=null;
        Object VertexSet46_tree=null;
        Object Edge47_tree=null;
        Object IN48_tree=null;
        Object EdgeSet49_tree=null;
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_VertexSet=new RewriteRuleTokenStream(adaptor,"token VertexSet");
        RewriteRuleTokenStream stream_EdgeSet=new RewriteRuleTokenStream(adaptor,"token EdgeSet");
        RewriteRuleTokenStream stream_Edge=new RewriteRuleTokenStream(adaptor,"token Edge");
        RewriteRuleTokenStream stream_Vertex=new RewriteRuleTokenStream(adaptor,"token Vertex");

        try {
            // ArchvalRulesetGrammar.g:103:2: ( Vertex IN VertexSet -> ^( Vertex ^( IN VertexSet ) ) | Edge IN EdgeSet -> ^( Edge ^( IN EdgeSet ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Vertex) ) {
                alt9=1;
            }
            else if ( (LA9_0==Edge) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ArchvalRulesetGrammar.g:104:2: Vertex IN VertexSet
                    {
                    Vertex44=(Token)match(input,Vertex,FOLLOW_Vertex_in_quantification_variable473);  
                    stream_Vertex.add(Vertex44);

                    IN45=(Token)match(input,IN,FOLLOW_IN_in_quantification_variable475);  
                    stream_IN.add(IN45);

                    VertexSet46=(Token)match(input,VertexSet,FOLLOW_VertexSet_in_quantification_variable477);  
                    stream_VertexSet.add(VertexSet46);



                    // AST REWRITE
                    // elements: Vertex, IN, VertexSet
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 104:22: -> ^( Vertex ^( IN VertexSet ) )
                    {
                        // ArchvalRulesetGrammar.g:104:25: ^( Vertex ^( IN VertexSet ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_Vertex.nextNode(), root_1);

                        // ArchvalRulesetGrammar.g:104:34: ^( IN VertexSet )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_IN.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_VertexSet.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // ArchvalRulesetGrammar.g:106:2: Edge IN EdgeSet
                    {
                    Edge47=(Token)match(input,Edge,FOLLOW_Edge_in_quantification_variable495);  
                    stream_Edge.add(Edge47);

                    IN48=(Token)match(input,IN,FOLLOW_IN_in_quantification_variable497);  
                    stream_IN.add(IN48);

                    EdgeSet49=(Token)match(input,EdgeSet,FOLLOW_EdgeSet_in_quantification_variable499);  
                    stream_EdgeSet.add(EdgeSet49);



                    // AST REWRITE
                    // elements: Edge, IN, EdgeSet
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 106:18: -> ^( Edge ^( IN EdgeSet ) )
                    {
                        // ArchvalRulesetGrammar.g:106:21: ^( Edge ^( IN EdgeSet ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_Edge.nextNode(), root_1);

                        // ArchvalRulesetGrammar.g:106:28: ^( IN EdgeSet )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_IN.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_EdgeSet.nextNode());

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
    // ArchvalRulesetGrammar.g:109:1: quantification_predicate : ( COLON Name LPAREN selector_params RPAREN ) -> ^( Name selector_params ) ;
    public final ArchvalRulesetGrammarParser.quantification_predicate_return quantification_predicate() throws RecognitionException {
        ArchvalRulesetGrammarParser.quantification_predicate_return retval = new ArchvalRulesetGrammarParser.quantification_predicate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON50=null;
        Token Name51=null;
        Token LPAREN52=null;
        Token RPAREN54=null;
        ArchvalRulesetGrammarParser.selector_params_return selector_params53 = null;


        Object COLON50_tree=null;
        Object Name51_tree=null;
        Object LPAREN52_tree=null;
        Object RPAREN54_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_Name=new RewriteRuleTokenStream(adaptor,"token Name");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_selector_params=new RewriteRuleSubtreeStream(adaptor,"rule selector_params");
        try {
            // ArchvalRulesetGrammar.g:110:2: ( ( COLON Name LPAREN selector_params RPAREN ) -> ^( Name selector_params ) )
            // ArchvalRulesetGrammar.g:111:2: ( COLON Name LPAREN selector_params RPAREN )
            {
            // ArchvalRulesetGrammar.g:111:2: ( COLON Name LPAREN selector_params RPAREN )
            // ArchvalRulesetGrammar.g:111:3: COLON Name LPAREN selector_params RPAREN
            {
            COLON50=(Token)match(input,COLON,FOLLOW_COLON_in_quantification_predicate524);  
            stream_COLON.add(COLON50);

            Name51=(Token)match(input,Name,FOLLOW_Name_in_quantification_predicate526);  
            stream_Name.add(Name51);

            LPAREN52=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_quantification_predicate528);  
            stream_LPAREN.add(LPAREN52);

            pushFollow(FOLLOW_selector_params_in_quantification_predicate530);
            selector_params53=selector_params();

            state._fsp--;

            stream_selector_params.add(selector_params53.getTree());
            RPAREN54=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_quantification_predicate532);  
            stream_RPAREN.add(RPAREN54);


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
            // 112:2: -> ^( Name selector_params )
            {
                // ArchvalRulesetGrammar.g:113:2: ^( Name selector_params )
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
    // ArchvalRulesetGrammar.g:116:1: orexpression : andexpression ( OR andexpression )* ;
    public final ArchvalRulesetGrammarParser.orexpression_return orexpression() throws RecognitionException {
        ArchvalRulesetGrammarParser.orexpression_return retval = new ArchvalRulesetGrammarParser.orexpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR56=null;
        ArchvalRulesetGrammarParser.andexpression_return andexpression55 = null;

        ArchvalRulesetGrammarParser.andexpression_return andexpression57 = null;


        Object OR56_tree=null;

        try {
            // ArchvalRulesetGrammar.g:117:2: ( andexpression ( OR andexpression )* )
            // ArchvalRulesetGrammar.g:118:2: andexpression ( OR andexpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_andexpression_in_orexpression555);
            andexpression55=andexpression();

            state._fsp--;

            adaptor.addChild(root_0, andexpression55.getTree());
            // ArchvalRulesetGrammar.g:118:16: ( OR andexpression )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==OR) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:118:17: OR andexpression
            	    {
            	    OR56=(Token)match(input,OR,FOLLOW_OR_in_orexpression558); 
            	    OR56_tree = (Object)adaptor.create(OR56);
            	    root_0 = (Object)adaptor.becomeRoot(OR56_tree, root_0);

            	    pushFollow(FOLLOW_andexpression_in_orexpression561);
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
    // ArchvalRulesetGrammar.g:121:1: andexpression : notexpression ( AND notexpression )* ;
    public final ArchvalRulesetGrammarParser.andexpression_return andexpression() throws RecognitionException {
        ArchvalRulesetGrammarParser.andexpression_return retval = new ArchvalRulesetGrammarParser.andexpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND59=null;
        ArchvalRulesetGrammarParser.notexpression_return notexpression58 = null;

        ArchvalRulesetGrammarParser.notexpression_return notexpression60 = null;


        Object AND59_tree=null;

        try {
            // ArchvalRulesetGrammar.g:122:2: ( notexpression ( AND notexpression )* )
            // ArchvalRulesetGrammar.g:123:2: notexpression ( AND notexpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_notexpression_in_andexpression575);
            notexpression58=notexpression();

            state._fsp--;

            adaptor.addChild(root_0, notexpression58.getTree());
            // ArchvalRulesetGrammar.g:123:16: ( AND notexpression )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==AND) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:123:17: AND notexpression
            	    {
            	    AND59=(Token)match(input,AND,FOLLOW_AND_in_andexpression578); 
            	    AND59_tree = (Object)adaptor.create(AND59);
            	    root_0 = (Object)adaptor.becomeRoot(AND59_tree, root_0);

            	    pushFollow(FOLLOW_notexpression_in_andexpression581);
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
    // ArchvalRulesetGrammar.g:126:1: notexpression : ( NOT )? atom ;
    public final ArchvalRulesetGrammarParser.notexpression_return notexpression() throws RecognitionException {
        ArchvalRulesetGrammarParser.notexpression_return retval = new ArchvalRulesetGrammarParser.notexpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT61=null;
        ArchvalRulesetGrammarParser.atom_return atom62 = null;


        Object NOT61_tree=null;

        try {
            // ArchvalRulesetGrammar.g:127:2: ( ( NOT )? atom )
            // ArchvalRulesetGrammar.g:128:6: ( NOT )? atom
            {
            root_0 = (Object)adaptor.nil();

            // ArchvalRulesetGrammar.g:128:9: ( NOT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==NOT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ArchvalRulesetGrammar.g:128:9: NOT
                    {
                    NOT61=(Token)match(input,NOT,FOLLOW_NOT_in_notexpression599); 
                    NOT61_tree = (Object)adaptor.create(NOT61);
                    root_0 = (Object)adaptor.becomeRoot(NOT61_tree, root_0);


                    }
                    break;

            }

            pushFollow(FOLLOW_atom_in_notexpression603);
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
    // ArchvalRulesetGrammar.g:131:1: atom : ( condition | LPAREN orexpression RPAREN -> orexpression );
    public final ArchvalRulesetGrammarParser.atom_return atom() throws RecognitionException {
        ArchvalRulesetGrammarParser.atom_return retval = new ArchvalRulesetGrammarParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN64=null;
        Token RPAREN66=null;
        ArchvalRulesetGrammarParser.condition_return condition63 = null;

        ArchvalRulesetGrammarParser.orexpression_return orexpression65 = null;


        Object LPAREN64_tree=null;
        Object RPAREN66_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_orexpression=new RewriteRuleSubtreeStream(adaptor,"rule orexpression");
        try {
            // ArchvalRulesetGrammar.g:132:2: ( condition | LPAREN orexpression RPAREN -> orexpression )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Name||(LA13_0>=True && LA13_0<=False)) ) {
                alt13=1;
            }
            else if ( (LA13_0==LPAREN) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ArchvalRulesetGrammar.g:133:2: condition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_condition_in_atom620);
                    condition63=condition();

                    state._fsp--;

                    adaptor.addChild(root_0, condition63.getTree());

                    }
                    break;
                case 2 :
                    // ArchvalRulesetGrammar.g:135:2: LPAREN orexpression RPAREN
                    {
                    LPAREN64=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom626);  
                    stream_LPAREN.add(LPAREN64);

                    pushFollow(FOLLOW_orexpression_in_atom628);
                    orexpression65=orexpression();

                    state._fsp--;

                    stream_orexpression.add(orexpression65.getTree());
                    RPAREN66=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom630);  
                    stream_RPAREN.add(RPAREN66);



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
                    // 136:2: -> orexpression
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
    // ArchvalRulesetGrammar.g:140:1: condition : ( True | False | Name LPAREN ( predicate_params )? RPAREN -> ^( Name ( predicate_params )? ) );
    public final ArchvalRulesetGrammarParser.condition_return condition() throws RecognitionException {
        ArchvalRulesetGrammarParser.condition_return retval = new ArchvalRulesetGrammarParser.condition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token True67=null;
        Token False68=null;
        Token Name69=null;
        Token LPAREN70=null;
        Token RPAREN72=null;
        ArchvalRulesetGrammarParser.predicate_params_return predicate_params71 = null;


        Object True67_tree=null;
        Object False68_tree=null;
        Object Name69_tree=null;
        Object LPAREN70_tree=null;
        Object RPAREN72_tree=null;
        RewriteRuleTokenStream stream_Name=new RewriteRuleTokenStream(adaptor,"token Name");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_predicate_params=new RewriteRuleSubtreeStream(adaptor,"rule predicate_params");
        try {
            // ArchvalRulesetGrammar.g:141:2: ( True | False | Name LPAREN ( predicate_params )? RPAREN -> ^( Name ( predicate_params )? ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case True:
                {
                alt15=1;
                }
                break;
            case False:
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
                    // ArchvalRulesetGrammar.g:142:2: True
                    {
                    root_0 = (Object)adaptor.nil();

                    True67=(Token)match(input,True,FOLLOW_True_in_condition648); 
                    True67_tree = (Object)adaptor.create(True67);
                    adaptor.addChild(root_0, True67_tree);


                    }
                    break;
                case 2 :
                    // ArchvalRulesetGrammar.g:144:2: False
                    {
                    root_0 = (Object)adaptor.nil();

                    False68=(Token)match(input,False,FOLLOW_False_in_condition654); 
                    False68_tree = (Object)adaptor.create(False68);
                    adaptor.addChild(root_0, False68_tree);


                    }
                    break;
                case 3 :
                    // ArchvalRulesetGrammar.g:146:2: Name LPAREN ( predicate_params )? RPAREN
                    {
                    Name69=(Token)match(input,Name,FOLLOW_Name_in_condition660);  
                    stream_Name.add(Name69);

                    LPAREN70=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_condition662);  
                    stream_LPAREN.add(LPAREN70);

                    // ArchvalRulesetGrammar.g:146:14: ( predicate_params )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0>=Name && LA14_0<=LPAREN)||(LA14_0>=Number && LA14_0<=Label)) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ArchvalRulesetGrammar.g:146:14: predicate_params
                            {
                            pushFollow(FOLLOW_predicate_params_in_condition664);
                            predicate_params71=predicate_params();

                            state._fsp--;

                            stream_predicate_params.add(predicate_params71.getTree());

                            }
                            break;

                    }

                    RPAREN72=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_condition667);  
                    stream_RPAREN.add(RPAREN72);



                    // AST REWRITE
                    // elements: Name, predicate_params
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 147:2: -> ^( Name ( predicate_params )? )
                    {
                        // ArchvalRulesetGrammar.g:148:2: ^( Name ( predicate_params )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_Name.nextNode(), root_1);

                        // ArchvalRulesetGrammar.g:148:9: ( predicate_params )?
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
    // ArchvalRulesetGrammar.g:151:1: predicate_params : predicate_param ( COMMA predicate_param )* -> predicate_param ( predicate_param )* ;
    public final ArchvalRulesetGrammarParser.predicate_params_return predicate_params() throws RecognitionException {
        ArchvalRulesetGrammarParser.predicate_params_return retval = new ArchvalRulesetGrammarParser.predicate_params_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA74=null;
        ArchvalRulesetGrammarParser.predicate_param_return predicate_param73 = null;

        ArchvalRulesetGrammarParser.predicate_param_return predicate_param75 = null;


        Object COMMA74_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_predicate_param=new RewriteRuleSubtreeStream(adaptor,"rule predicate_param");
        try {
            // ArchvalRulesetGrammar.g:152:2: ( predicate_param ( COMMA predicate_param )* -> predicate_param ( predicate_param )* )
            // ArchvalRulesetGrammar.g:153:2: predicate_param ( COMMA predicate_param )*
            {
            pushFollow(FOLLOW_predicate_param_in_predicate_params690);
            predicate_param73=predicate_param();

            state._fsp--;

            stream_predicate_param.add(predicate_param73.getTree());
            // ArchvalRulesetGrammar.g:153:18: ( COMMA predicate_param )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==COMMA) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:153:19: COMMA predicate_param
            	    {
            	    COMMA74=(Token)match(input,COMMA,FOLLOW_COMMA_in_predicate_params693);  
            	    stream_COMMA.add(COMMA74);

            	    pushFollow(FOLLOW_predicate_param_in_predicate_params695);
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
            // 154:2: -> predicate_param ( predicate_param )*
            {
                adaptor.addChild(root_0, stream_predicate_param.nextTree());
                // ArchvalRulesetGrammar.g:155:18: ( predicate_param )*
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
    // ArchvalRulesetGrammar.g:158:1: predicate_param : ( Number | Label | set_expression );
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
            // ArchvalRulesetGrammar.g:159:2: ( Number | Label | set_expression )
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
            case LPAREN:
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
                    // ArchvalRulesetGrammar.g:160:2: Number
                    {
                    root_0 = (Object)adaptor.nil();

                    Number76=(Token)match(input,Number,FOLLOW_Number_in_predicate_param718); 
                    Number76_tree = (Object)adaptor.create(Number76);
                    adaptor.addChild(root_0, Number76_tree);


                    }
                    break;
                case 2 :
                    // ArchvalRulesetGrammar.g:162:2: Label
                    {
                    root_0 = (Object)adaptor.nil();

                    Label77=(Token)match(input,Label,FOLLOW_Label_in_predicate_param724); 
                    Label77_tree = (Object)adaptor.create(Label77);
                    adaptor.addChild(root_0, Label77_tree);


                    }
                    break;
                case 3 :
                    // ArchvalRulesetGrammar.g:164:2: set_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_set_expression_in_predicate_param730);
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
    // ArchvalRulesetGrammar.g:167:1: set_expression : set_atom ( ( INTERSECT | UNION | SETMINUS ) set_atom )* ;
    public final ArchvalRulesetGrammarParser.set_expression_return set_expression() throws RecognitionException {
        ArchvalRulesetGrammarParser.set_expression_return retval = new ArchvalRulesetGrammarParser.set_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INTERSECT80=null;
        Token UNION81=null;
        Token SETMINUS82=null;
        ArchvalRulesetGrammarParser.set_atom_return set_atom79 = null;

        ArchvalRulesetGrammarParser.set_atom_return set_atom83 = null;


        Object INTERSECT80_tree=null;
        Object UNION81_tree=null;
        Object SETMINUS82_tree=null;

        try {
            // ArchvalRulesetGrammar.g:168:2: ( set_atom ( ( INTERSECT | UNION | SETMINUS ) set_atom )* )
            // ArchvalRulesetGrammar.g:169:2: set_atom ( ( INTERSECT | UNION | SETMINUS ) set_atom )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_set_atom_in_set_expression742);
            set_atom79=set_atom();

            state._fsp--;

            adaptor.addChild(root_0, set_atom79.getTree());
            // ArchvalRulesetGrammar.g:169:11: ( ( INTERSECT | UNION | SETMINUS ) set_atom )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=INTERSECT && LA19_0<=SETMINUS)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:169:12: ( INTERSECT | UNION | SETMINUS ) set_atom
            	    {
            	    // ArchvalRulesetGrammar.g:169:12: ( INTERSECT | UNION | SETMINUS )
            	    int alt18=3;
            	    switch ( input.LA(1) ) {
            	    case INTERSECT:
            	        {
            	        alt18=1;
            	        }
            	        break;
            	    case UNION:
            	        {
            	        alt18=2;
            	        }
            	        break;
            	    case SETMINUS:
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
            	            // ArchvalRulesetGrammar.g:169:13: INTERSECT
            	            {
            	            INTERSECT80=(Token)match(input,INTERSECT,FOLLOW_INTERSECT_in_set_expression746); 
            	            INTERSECT80_tree = (Object)adaptor.create(INTERSECT80);
            	            root_0 = (Object)adaptor.becomeRoot(INTERSECT80_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // ArchvalRulesetGrammar.g:169:26: UNION
            	            {
            	            UNION81=(Token)match(input,UNION,FOLLOW_UNION_in_set_expression751); 
            	            UNION81_tree = (Object)adaptor.create(UNION81);
            	            root_0 = (Object)adaptor.becomeRoot(UNION81_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // ArchvalRulesetGrammar.g:169:35: SETMINUS
            	            {
            	            SETMINUS82=(Token)match(input,SETMINUS,FOLLOW_SETMINUS_in_set_expression756); 
            	            SETMINUS82_tree = (Object)adaptor.create(SETMINUS82);
            	            root_0 = (Object)adaptor.becomeRoot(SETMINUS82_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_set_atom_in_set_expression760);
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
    // ArchvalRulesetGrammar.g:172:1: set_atom : ( Name LPAREN ( selector_params )? RPAREN -> ^( Name ( selector_params )? ) | LPAREN set_expression RPAREN -> set_expression );
    public final ArchvalRulesetGrammarParser.set_atom_return set_atom() throws RecognitionException {
        ArchvalRulesetGrammarParser.set_atom_return retval = new ArchvalRulesetGrammarParser.set_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Name84=null;
        Token LPAREN85=null;
        Token RPAREN87=null;
        Token LPAREN88=null;
        Token RPAREN90=null;
        ArchvalRulesetGrammarParser.selector_params_return selector_params86 = null;

        ArchvalRulesetGrammarParser.set_expression_return set_expression89 = null;


        Object Name84_tree=null;
        Object LPAREN85_tree=null;
        Object RPAREN87_tree=null;
        Object LPAREN88_tree=null;
        Object RPAREN90_tree=null;
        RewriteRuleTokenStream stream_Name=new RewriteRuleTokenStream(adaptor,"token Name");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_selector_params=new RewriteRuleSubtreeStream(adaptor,"rule selector_params");
        RewriteRuleSubtreeStream stream_set_expression=new RewriteRuleSubtreeStream(adaptor,"rule set_expression");
        try {
            // ArchvalRulesetGrammar.g:173:2: ( Name LPAREN ( selector_params )? RPAREN -> ^( Name ( selector_params )? ) | LPAREN set_expression RPAREN -> set_expression )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Name) ) {
                alt21=1;
            }
            else if ( (LA21_0==LPAREN) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ArchvalRulesetGrammar.g:174:8: Name LPAREN ( selector_params )? RPAREN
                    {
                    Name84=(Token)match(input,Name,FOLLOW_Name_in_set_atom780);  
                    stream_Name.add(Name84);

                    LPAREN85=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_set_atom782);  
                    stream_LPAREN.add(LPAREN85);

                    // ArchvalRulesetGrammar.g:174:20: ( selector_params )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==Vertex||LA20_0==Edge||(LA20_0>=Number && LA20_0<=Label)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ArchvalRulesetGrammar.g:174:20: selector_params
                            {
                            pushFollow(FOLLOW_selector_params_in_set_atom784);
                            selector_params86=selector_params();

                            state._fsp--;

                            stream_selector_params.add(selector_params86.getTree());

                            }
                            break;

                    }

                    RPAREN87=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_set_atom787);  
                    stream_RPAREN.add(RPAREN87);



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
                    // 175:8: -> ^( Name ( selector_params )? )
                    {
                        // ArchvalRulesetGrammar.g:176:8: ^( Name ( selector_params )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_Name.nextNode(), root_1);

                        // ArchvalRulesetGrammar.g:176:15: ( selector_params )?
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
                    // ArchvalRulesetGrammar.g:178:2: LPAREN set_expression RPAREN
                    {
                    LPAREN88=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_set_atom816);  
                    stream_LPAREN.add(LPAREN88);

                    pushFollow(FOLLOW_set_expression_in_set_atom818);
                    set_expression89=set_expression();

                    state._fsp--;

                    stream_set_expression.add(set_expression89.getTree());
                    RPAREN90=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_set_atom820);  
                    stream_RPAREN.add(RPAREN90);



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
                    // 179:2: -> set_expression
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
    // ArchvalRulesetGrammar.g:183:1: selector_params : selector_param ( COMMA selector_param )* -> selector_param ( selector_param )* ;
    public final ArchvalRulesetGrammarParser.selector_params_return selector_params() throws RecognitionException {
        ArchvalRulesetGrammarParser.selector_params_return retval = new ArchvalRulesetGrammarParser.selector_params_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA92=null;
        ArchvalRulesetGrammarParser.selector_param_return selector_param91 = null;

        ArchvalRulesetGrammarParser.selector_param_return selector_param93 = null;


        Object COMMA92_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_selector_param=new RewriteRuleSubtreeStream(adaptor,"rule selector_param");
        try {
            // ArchvalRulesetGrammar.g:184:2: ( selector_param ( COMMA selector_param )* -> selector_param ( selector_param )* )
            // ArchvalRulesetGrammar.g:185:2: selector_param ( COMMA selector_param )*
            {
            pushFollow(FOLLOW_selector_param_in_selector_params838);
            selector_param91=selector_param();

            state._fsp--;

            stream_selector_param.add(selector_param91.getTree());
            // ArchvalRulesetGrammar.g:185:17: ( COMMA selector_param )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==COMMA) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:185:18: COMMA selector_param
            	    {
            	    COMMA92=(Token)match(input,COMMA,FOLLOW_COMMA_in_selector_params841);  
            	    stream_COMMA.add(COMMA92);

            	    pushFollow(FOLLOW_selector_param_in_selector_params843);
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
            // 186:2: -> selector_param ( selector_param )*
            {
                adaptor.addChild(root_0, stream_selector_param.nextTree());
                // ArchvalRulesetGrammar.g:187:17: ( selector_param )*
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
    // ArchvalRulesetGrammar.g:190:1: selector_param : ( Vertex | Edge | Number | Label );
    public final ArchvalRulesetGrammarParser.selector_param_return selector_param() throws RecognitionException {
        ArchvalRulesetGrammarParser.selector_param_return retval = new ArchvalRulesetGrammarParser.selector_param_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set94=null;

        Object set94_tree=null;

        try {
            // ArchvalRulesetGrammar.g:191:2: ( Vertex | Edge | Number | Label )
            // ArchvalRulesetGrammar.g:
            {
            root_0 = (Object)adaptor.nil();

            set94=(Token)input.LT(1);
            if ( input.LA(1)==Vertex||input.LA(1)==Edge||(input.LA(1)>=Number && input.LA(1)<=Label) ) {
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
    // ArchvalRulesetGrammar.g:201:1: compound_rule_spec : candexpression ( OR candexpression )* ;
    public final ArchvalRulesetGrammarParser.compound_rule_spec_return compound_rule_spec() throws RecognitionException {
        ArchvalRulesetGrammarParser.compound_rule_spec_return retval = new ArchvalRulesetGrammarParser.compound_rule_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR96=null;
        ArchvalRulesetGrammarParser.candexpression_return candexpression95 = null;

        ArchvalRulesetGrammarParser.candexpression_return candexpression97 = null;


        Object OR96_tree=null;

        try {
            // ArchvalRulesetGrammar.g:202:2: ( candexpression ( OR candexpression )* )
            // ArchvalRulesetGrammar.g:203:2: candexpression ( OR candexpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_candexpression_in_compound_rule_spec896);
            candexpression95=candexpression();

            state._fsp--;

            adaptor.addChild(root_0, candexpression95.getTree());
            // ArchvalRulesetGrammar.g:203:17: ( OR candexpression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==OR) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:203:18: OR candexpression
            	    {
            	    OR96=(Token)match(input,OR,FOLLOW_OR_in_compound_rule_spec899); 
            	    OR96_tree = (Object)adaptor.create(OR96);
            	    root_0 = (Object)adaptor.becomeRoot(OR96_tree, root_0);

            	    pushFollow(FOLLOW_candexpression_in_compound_rule_spec902);
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
    // ArchvalRulesetGrammar.g:206:1: candexpression : cnotexpression ( AND cnotexpression )* ;
    public final ArchvalRulesetGrammarParser.candexpression_return candexpression() throws RecognitionException {
        ArchvalRulesetGrammarParser.candexpression_return retval = new ArchvalRulesetGrammarParser.candexpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND99=null;
        ArchvalRulesetGrammarParser.cnotexpression_return cnotexpression98 = null;

        ArchvalRulesetGrammarParser.cnotexpression_return cnotexpression100 = null;


        Object AND99_tree=null;

        try {
            // ArchvalRulesetGrammar.g:207:2: ( cnotexpression ( AND cnotexpression )* )
            // ArchvalRulesetGrammar.g:208:2: cnotexpression ( AND cnotexpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_cnotexpression_in_candexpression916);
            cnotexpression98=cnotexpression();

            state._fsp--;

            adaptor.addChild(root_0, cnotexpression98.getTree());
            // ArchvalRulesetGrammar.g:208:17: ( AND cnotexpression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==AND) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:208:18: AND cnotexpression
            	    {
            	    AND99=(Token)match(input,AND,FOLLOW_AND_in_candexpression919); 
            	    AND99_tree = (Object)adaptor.create(AND99);
            	    root_0 = (Object)adaptor.becomeRoot(AND99_tree, root_0);

            	    pushFollow(FOLLOW_cnotexpression_in_candexpression922);
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
    // ArchvalRulesetGrammar.g:211:1: cnotexpression : ( NOT )? catom ;
    public final ArchvalRulesetGrammarParser.cnotexpression_return cnotexpression() throws RecognitionException {
        ArchvalRulesetGrammarParser.cnotexpression_return retval = new ArchvalRulesetGrammarParser.cnotexpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT101=null;
        ArchvalRulesetGrammarParser.catom_return catom102 = null;


        Object NOT101_tree=null;

        try {
            // ArchvalRulesetGrammar.g:212:2: ( ( NOT )? catom )
            // ArchvalRulesetGrammar.g:213:2: ( NOT )? catom
            {
            root_0 = (Object)adaptor.nil();

            // ArchvalRulesetGrammar.g:213:5: ( NOT )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==NOT) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ArchvalRulesetGrammar.g:213:5: NOT
                    {
                    NOT101=(Token)match(input,NOT,FOLLOW_NOT_in_cnotexpression936); 
                    NOT101_tree = (Object)adaptor.create(NOT101);
                    root_0 = (Object)adaptor.becomeRoot(NOT101_tree, root_0);


                    }
                    break;

            }

            pushFollow(FOLLOW_catom_in_cnotexpression940);
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
    // ArchvalRulesetGrammar.g:216:1: catom : ( Name | LPAREN compound_rule_spec RPAREN -> compound_rule_spec );
    public final ArchvalRulesetGrammarParser.catom_return catom() throws RecognitionException {
        ArchvalRulesetGrammarParser.catom_return retval = new ArchvalRulesetGrammarParser.catom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Name103=null;
        Token LPAREN104=null;
        Token RPAREN106=null;
        ArchvalRulesetGrammarParser.compound_rule_spec_return compound_rule_spec105 = null;


        Object Name103_tree=null;
        Object LPAREN104_tree=null;
        Object RPAREN106_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_compound_rule_spec=new RewriteRuleSubtreeStream(adaptor,"rule compound_rule_spec");
        try {
            // ArchvalRulesetGrammar.g:217:2: ( Name | LPAREN compound_rule_spec RPAREN -> compound_rule_spec )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Name) ) {
                alt26=1;
            }
            else if ( (LA26_0==LPAREN) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ArchvalRulesetGrammar.g:218:2: Name
                    {
                    root_0 = (Object)adaptor.nil();

                    Name103=(Token)match(input,Name,FOLLOW_Name_in_catom952); 
                    Name103_tree = (Object)adaptor.create(Name103);
                    adaptor.addChild(root_0, Name103_tree);


                    }
                    break;
                case 2 :
                    // ArchvalRulesetGrammar.g:220:2: LPAREN compound_rule_spec RPAREN
                    {
                    LPAREN104=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catom958);  
                    stream_LPAREN.add(LPAREN104);

                    pushFollow(FOLLOW_compound_rule_spec_in_catom960);
                    compound_rule_spec105=compound_rule_spec();

                    state._fsp--;

                    stream_compound_rule_spec.add(compound_rule_spec105.getTree());
                    RPAREN106=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catom962);  
                    stream_RPAREN.add(RPAREN106);



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
                    // 221:2: -> compound_rule_spec
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


 

    public static final BitSet FOLLOW_atomic_rule_in_validation_unit94 = new BitSet(new long[]{0x00000000000E0400L});
    public static final BitSet FOLLOW_compound_rule_in_validation_unit98 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_validate_command_in_validation_unit102 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_analyze_command_in_validation_unit106 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_EOF_in_validation_unit110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATOMIC_RULE_KW_in_atomic_rule186 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_Name_in_atomic_rule190 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LPAREN_in_atomic_rule192 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_Name_in_atomic_rule196 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_atomic_rule198 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LBRACE_in_atomic_rule201 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_atomic_rule_spec_in_atomic_rule203 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RBRACE_in_atomic_rule205 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMICOLON_in_atomic_rule207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPOUND_RULE_KW_in_compound_rule232 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_Name_in_compound_rule234 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LBRACE_in_compound_rule237 = new BitSet(new long[]{0x0000000080001800L});
    public static final BitSet FOLLOW_compound_rule_spec_in_compound_rule239 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RBRACE_in_compound_rule241 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMICOLON_in_compound_rule243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALIDATE_KW_in_validate_command264 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LPAREN_in_validate_command266 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_validate_command_params_in_validate_command268 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_validate_command271 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMICOLON_in_validate_command273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANALYZE_KW_in_analyze_command290 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LPAREN_in_analyze_command292 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_analyze_command_params_in_analyze_command294 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_analyze_command297 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMICOLON_in_analyze_command299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Name_in_validate_command_params316 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_COMMA_in_validate_command_params319 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_Name_in_validate_command_params322 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_Name_in_analyze_command_params335 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_COMMA_in_analyze_command_params338 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_Name_in_analyze_command_params341 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_set_spec_clause_in_atomic_rule_spec354 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LBRACE_in_atomic_rule_spec356 = new BitSet(new long[]{0x0000000380001800L});
    public static final BitSet FOLLOW_orexpression_in_atomic_rule_spec358 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RBRACE_in_atomic_rule_spec360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quantifier_clause_in_set_spec_clause388 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_quantification_variable_in_set_spec_clause395 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_quantification_predicate_in_set_spec_clause402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALL_in_quantifier_clause453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXISTS_in_quantifier_clause460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Vertex_in_quantification_variable473 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_IN_in_quantification_variable475 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_VertexSet_in_quantification_variable477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Edge_in_quantification_variable495 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_IN_in_quantification_variable497 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_EdgeSet_in_quantification_variable499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_quantification_predicate524 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_Name_in_quantification_predicate526 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LPAREN_in_quantification_predicate528 = new BitSet(new long[]{0x0000000C04800000L});
    public static final BitSet FOLLOW_selector_params_in_quantification_predicate530 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_quantification_predicate532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andexpression_in_orexpression555 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_OR_in_orexpression558 = new BitSet(new long[]{0x0000000380001800L});
    public static final BitSet FOLLOW_andexpression_in_orexpression561 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_notexpression_in_andexpression575 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_AND_in_andexpression578 = new BitSet(new long[]{0x0000000380001800L});
    public static final BitSet FOLLOW_notexpression_in_andexpression581 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_NOT_in_notexpression599 = new BitSet(new long[]{0x0000000380001800L});
    public static final BitSet FOLLOW_atom_in_notexpression603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_atom620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom626 = new BitSet(new long[]{0x0000000380001800L});
    public static final BitSet FOLLOW_orexpression_in_atom628 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_atom630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_True_in_condition648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_False_in_condition654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Name_in_condition660 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LPAREN_in_condition662 = new BitSet(new long[]{0x0000000C00003800L});
    public static final BitSet FOLLOW_predicate_params_in_condition664 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_condition667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_param_in_predicate_params690 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_COMMA_in_predicate_params693 = new BitSet(new long[]{0x0000000C00001800L});
    public static final BitSet FOLLOW_predicate_param_in_predicate_params695 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_Number_in_predicate_param718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Label_in_predicate_param724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_expression_in_predicate_param730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_atom_in_set_expression742 = new BitSet(new long[]{0x0000007000000002L});
    public static final BitSet FOLLOW_INTERSECT_in_set_expression746 = new BitSet(new long[]{0x0000000C00001800L});
    public static final BitSet FOLLOW_UNION_in_set_expression751 = new BitSet(new long[]{0x0000000C00001800L});
    public static final BitSet FOLLOW_SETMINUS_in_set_expression756 = new BitSet(new long[]{0x0000000C00001800L});
    public static final BitSet FOLLOW_set_atom_in_set_expression760 = new BitSet(new long[]{0x0000007000000002L});
    public static final BitSet FOLLOW_Name_in_set_atom780 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LPAREN_in_set_atom782 = new BitSet(new long[]{0x0000000C04802000L});
    public static final BitSet FOLLOW_selector_params_in_set_atom784 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_set_atom787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_set_atom816 = new BitSet(new long[]{0x0000000C00001800L});
    public static final BitSet FOLLOW_set_expression_in_set_atom818 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_set_atom820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_param_in_selector_params838 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_COMMA_in_selector_params841 = new BitSet(new long[]{0x0000000C04800000L});
    public static final BitSet FOLLOW_selector_param_in_selector_params843 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_set_in_selector_param0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_candexpression_in_compound_rule_spec896 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_OR_in_compound_rule_spec899 = new BitSet(new long[]{0x0000000080001800L});
    public static final BitSet FOLLOW_candexpression_in_compound_rule_spec902 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_cnotexpression_in_candexpression916 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_AND_in_candexpression919 = new BitSet(new long[]{0x0000000080001800L});
    public static final BitSet FOLLOW_cnotexpression_in_candexpression922 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_NOT_in_cnotexpression936 = new BitSet(new long[]{0x0000000080001800L});
    public static final BitSet FOLLOW_catom_in_cnotexpression940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Name_in_catom952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_catom958 = new BitSet(new long[]{0x0000000080001800L});
    public static final BitSet FOLLOW_compound_rule_spec_in_catom960 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_catom962 = new BitSet(new long[]{0x0000000000000002L});

}