// $ANTLR 3.1.3 July 11, 2010 13:49:50 ArchvalRulesetGrammar.g 2011-05-07 21:58:55

    package cz.cvut.fel.archval.core.avd.parser;


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
    // ArchvalRulesetGrammar.g:109:1: quantification_predicate : ( COLON Name LPAREN ( selector_params )? RPAREN ) -> ^( Name ( selector_params )? ) ;
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
            // ArchvalRulesetGrammar.g:110:2: ( ( COLON Name LPAREN ( selector_params )? RPAREN ) -> ^( Name ( selector_params )? ) )
            // ArchvalRulesetGrammar.g:111:2: ( COLON Name LPAREN ( selector_params )? RPAREN )
            {
            // ArchvalRulesetGrammar.g:111:2: ( COLON Name LPAREN ( selector_params )? RPAREN )
            // ArchvalRulesetGrammar.g:111:3: COLON Name LPAREN ( selector_params )? RPAREN
            {
            COLON50=(Token)match(input,COLON,FOLLOW_COLON_in_quantification_predicate524);  
            stream_COLON.add(COLON50);

            Name51=(Token)match(input,Name,FOLLOW_Name_in_quantification_predicate526);  
            stream_Name.add(Name51);

            LPAREN52=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_quantification_predicate528);  
            stream_LPAREN.add(LPAREN52);

            // ArchvalRulesetGrammar.g:111:21: ( selector_params )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Vertex||LA10_0==Edge||(LA10_0>=Number && LA10_0<=Label)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ArchvalRulesetGrammar.g:111:21: selector_params
                    {
                    pushFollow(FOLLOW_selector_params_in_quantification_predicate530);
                    selector_params53=selector_params();

                    state._fsp--;

                    stream_selector_params.add(selector_params53.getTree());

                    }
                    break;

            }

            RPAREN54=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_quantification_predicate533);  
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
            // 112:2: -> ^( Name ( selector_params )? )
            {
                // ArchvalRulesetGrammar.g:113:2: ^( Name ( selector_params )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_Name.nextNode(), root_1);

                // ArchvalRulesetGrammar.g:113:9: ( selector_params )?
                if ( stream_selector_params.hasNext() ) {
                    adaptor.addChild(root_1, stream_selector_params.nextTree());

                }
                stream_selector_params.reset();

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

            pushFollow(FOLLOW_andexpression_in_orexpression557);
            andexpression55=andexpression();

            state._fsp--;

            adaptor.addChild(root_0, andexpression55.getTree());
            // ArchvalRulesetGrammar.g:118:16: ( OR andexpression )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==OR) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:118:17: OR andexpression
            	    {
            	    OR56=(Token)match(input,OR,FOLLOW_OR_in_orexpression560); 
            	    OR56_tree = (Object)adaptor.create(OR56);
            	    root_0 = (Object)adaptor.becomeRoot(OR56_tree, root_0);

            	    pushFollow(FOLLOW_andexpression_in_orexpression563);
            	    andexpression57=andexpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, andexpression57.getTree());

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

            pushFollow(FOLLOW_notexpression_in_andexpression577);
            notexpression58=notexpression();

            state._fsp--;

            adaptor.addChild(root_0, notexpression58.getTree());
            // ArchvalRulesetGrammar.g:123:16: ( AND notexpression )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==AND) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:123:17: AND notexpression
            	    {
            	    AND59=(Token)match(input,AND,FOLLOW_AND_in_andexpression580); 
            	    AND59_tree = (Object)adaptor.create(AND59);
            	    root_0 = (Object)adaptor.becomeRoot(AND59_tree, root_0);

            	    pushFollow(FOLLOW_notexpression_in_andexpression583);
            	    notexpression60=notexpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, notexpression60.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
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
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==NOT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ArchvalRulesetGrammar.g:128:9: NOT
                    {
                    NOT61=(Token)match(input,NOT,FOLLOW_NOT_in_notexpression601); 
                    NOT61_tree = (Object)adaptor.create(NOT61);
                    root_0 = (Object)adaptor.becomeRoot(NOT61_tree, root_0);


                    }
                    break;

            }

            pushFollow(FOLLOW_atom_in_notexpression605);
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
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Name||(LA14_0>=True && LA14_0<=False)) ) {
                alt14=1;
            }
            else if ( (LA14_0==LPAREN) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ArchvalRulesetGrammar.g:133:2: condition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_condition_in_atom622);
                    condition63=condition();

                    state._fsp--;

                    adaptor.addChild(root_0, condition63.getTree());

                    }
                    break;
                case 2 :
                    // ArchvalRulesetGrammar.g:135:2: LPAREN orexpression RPAREN
                    {
                    LPAREN64=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom628);  
                    stream_LPAREN.add(LPAREN64);

                    pushFollow(FOLLOW_orexpression_in_atom630);
                    orexpression65=orexpression();

                    state._fsp--;

                    stream_orexpression.add(orexpression65.getTree());
                    RPAREN66=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom632);  
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
            int alt16=3;
            switch ( input.LA(1) ) {
            case True:
                {
                alt16=1;
                }
                break;
            case False:
                {
                alt16=2;
                }
                break;
            case Name:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ArchvalRulesetGrammar.g:142:2: True
                    {
                    root_0 = (Object)adaptor.nil();

                    True67=(Token)match(input,True,FOLLOW_True_in_condition650); 
                    True67_tree = (Object)adaptor.create(True67);
                    adaptor.addChild(root_0, True67_tree);


                    }
                    break;
                case 2 :
                    // ArchvalRulesetGrammar.g:144:2: False
                    {
                    root_0 = (Object)adaptor.nil();

                    False68=(Token)match(input,False,FOLLOW_False_in_condition656); 
                    False68_tree = (Object)adaptor.create(False68);
                    adaptor.addChild(root_0, False68_tree);


                    }
                    break;
                case 3 :
                    // ArchvalRulesetGrammar.g:146:2: Name LPAREN ( predicate_params )? RPAREN
                    {
                    Name69=(Token)match(input,Name,FOLLOW_Name_in_condition662);  
                    stream_Name.add(Name69);

                    LPAREN70=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_condition664);  
                    stream_LPAREN.add(LPAREN70);

                    // ArchvalRulesetGrammar.g:146:14: ( predicate_params )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( ((LA15_0>=Name && LA15_0<=LPAREN)||LA15_0==Vertex||LA15_0==Edge||(LA15_0>=Number && LA15_0<=Label)) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ArchvalRulesetGrammar.g:146:14: predicate_params
                            {
                            pushFollow(FOLLOW_predicate_params_in_condition666);
                            predicate_params71=predicate_params();

                            state._fsp--;

                            stream_predicate_params.add(predicate_params71.getTree());

                            }
                            break;

                    }

                    RPAREN72=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_condition669);  
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
            pushFollow(FOLLOW_predicate_param_in_predicate_params692);
            predicate_param73=predicate_param();

            state._fsp--;

            stream_predicate_param.add(predicate_param73.getTree());
            // ArchvalRulesetGrammar.g:153:18: ( COMMA predicate_param )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:153:19: COMMA predicate_param
            	    {
            	    COMMA74=(Token)match(input,COMMA,FOLLOW_COMMA_in_predicate_params695);  
            	    stream_COMMA.add(COMMA74);

            	    pushFollow(FOLLOW_predicate_param_in_predicate_params697);
            	    predicate_param75=predicate_param();

            	    state._fsp--;

            	    stream_predicate_param.add(predicate_param75.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ArchvalRulesetGrammar.g:158:1: predicate_param : ( Number | Label | Vertex | Edge | set_expression );
    public final ArchvalRulesetGrammarParser.predicate_param_return predicate_param() throws RecognitionException {
        ArchvalRulesetGrammarParser.predicate_param_return retval = new ArchvalRulesetGrammarParser.predicate_param_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Number76=null;
        Token Label77=null;
        Token Vertex78=null;
        Token Edge79=null;
        ArchvalRulesetGrammarParser.set_expression_return set_expression80 = null;


        Object Number76_tree=null;
        Object Label77_tree=null;
        Object Vertex78_tree=null;
        Object Edge79_tree=null;

        try {
            // ArchvalRulesetGrammar.g:159:2: ( Number | Label | Vertex | Edge | set_expression )
            int alt18=5;
            switch ( input.LA(1) ) {
            case Number:
                {
                alt18=1;
                }
                break;
            case Label:
                {
                alt18=2;
                }
                break;
            case Vertex:
                {
                alt18=3;
                }
                break;
            case Edge:
                {
                alt18=4;
                }
                break;
            case Name:
            case LPAREN:
                {
                alt18=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ArchvalRulesetGrammar.g:160:2: Number
                    {
                    root_0 = (Object)adaptor.nil();

                    Number76=(Token)match(input,Number,FOLLOW_Number_in_predicate_param720); 
                    Number76_tree = (Object)adaptor.create(Number76);
                    adaptor.addChild(root_0, Number76_tree);


                    }
                    break;
                case 2 :
                    // ArchvalRulesetGrammar.g:162:2: Label
                    {
                    root_0 = (Object)adaptor.nil();

                    Label77=(Token)match(input,Label,FOLLOW_Label_in_predicate_param726); 
                    Label77_tree = (Object)adaptor.create(Label77);
                    adaptor.addChild(root_0, Label77_tree);


                    }
                    break;
                case 3 :
                    // ArchvalRulesetGrammar.g:164:9: Vertex
                    {
                    root_0 = (Object)adaptor.nil();

                    Vertex78=(Token)match(input,Vertex,FOLLOW_Vertex_in_predicate_param739); 
                    Vertex78_tree = (Object)adaptor.create(Vertex78);
                    adaptor.addChild(root_0, Vertex78_tree);


                    }
                    break;
                case 4 :
                    // ArchvalRulesetGrammar.g:166:9: Edge
                    {
                    root_0 = (Object)adaptor.nil();

                    Edge79=(Token)match(input,Edge,FOLLOW_Edge_in_predicate_param759); 
                    Edge79_tree = (Object)adaptor.create(Edge79);
                    adaptor.addChild(root_0, Edge79_tree);


                    }
                    break;
                case 5 :
                    // ArchvalRulesetGrammar.g:168:2: set_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_set_expression_in_predicate_param772);
                    set_expression80=set_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, set_expression80.getTree());

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
    // ArchvalRulesetGrammar.g:171:1: set_expression : set_atom ( ( INTERSECT | UNION | SETMINUS ) set_atom )* ;
    public final ArchvalRulesetGrammarParser.set_expression_return set_expression() throws RecognitionException {
        ArchvalRulesetGrammarParser.set_expression_return retval = new ArchvalRulesetGrammarParser.set_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INTERSECT82=null;
        Token UNION83=null;
        Token SETMINUS84=null;
        ArchvalRulesetGrammarParser.set_atom_return set_atom81 = null;

        ArchvalRulesetGrammarParser.set_atom_return set_atom85 = null;


        Object INTERSECT82_tree=null;
        Object UNION83_tree=null;
        Object SETMINUS84_tree=null;

        try {
            // ArchvalRulesetGrammar.g:172:2: ( set_atom ( ( INTERSECT | UNION | SETMINUS ) set_atom )* )
            // ArchvalRulesetGrammar.g:173:2: set_atom ( ( INTERSECT | UNION | SETMINUS ) set_atom )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_set_atom_in_set_expression784);
            set_atom81=set_atom();

            state._fsp--;

            adaptor.addChild(root_0, set_atom81.getTree());
            // ArchvalRulesetGrammar.g:173:11: ( ( INTERSECT | UNION | SETMINUS ) set_atom )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=INTERSECT && LA20_0<=SETMINUS)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:173:12: ( INTERSECT | UNION | SETMINUS ) set_atom
            	    {
            	    // ArchvalRulesetGrammar.g:173:12: ( INTERSECT | UNION | SETMINUS )
            	    int alt19=3;
            	    switch ( input.LA(1) ) {
            	    case INTERSECT:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case UNION:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case SETMINUS:
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
            	            // ArchvalRulesetGrammar.g:173:13: INTERSECT
            	            {
            	            INTERSECT82=(Token)match(input,INTERSECT,FOLLOW_INTERSECT_in_set_expression788); 
            	            INTERSECT82_tree = (Object)adaptor.create(INTERSECT82);
            	            root_0 = (Object)adaptor.becomeRoot(INTERSECT82_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // ArchvalRulesetGrammar.g:173:26: UNION
            	            {
            	            UNION83=(Token)match(input,UNION,FOLLOW_UNION_in_set_expression793); 
            	            UNION83_tree = (Object)adaptor.create(UNION83);
            	            root_0 = (Object)adaptor.becomeRoot(UNION83_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // ArchvalRulesetGrammar.g:173:35: SETMINUS
            	            {
            	            SETMINUS84=(Token)match(input,SETMINUS,FOLLOW_SETMINUS_in_set_expression798); 
            	            SETMINUS84_tree = (Object)adaptor.create(SETMINUS84);
            	            root_0 = (Object)adaptor.becomeRoot(SETMINUS84_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_set_atom_in_set_expression802);
            	    set_atom85=set_atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, set_atom85.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ArchvalRulesetGrammar.g:176:1: set_atom : ( Name LPAREN ( selector_params )? RPAREN -> ^( Name ( selector_params )? ) | LPAREN set_expression RPAREN -> set_expression );
    public final ArchvalRulesetGrammarParser.set_atom_return set_atom() throws RecognitionException {
        ArchvalRulesetGrammarParser.set_atom_return retval = new ArchvalRulesetGrammarParser.set_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Name86=null;
        Token LPAREN87=null;
        Token RPAREN89=null;
        Token LPAREN90=null;
        Token RPAREN92=null;
        ArchvalRulesetGrammarParser.selector_params_return selector_params88 = null;

        ArchvalRulesetGrammarParser.set_expression_return set_expression91 = null;


        Object Name86_tree=null;
        Object LPAREN87_tree=null;
        Object RPAREN89_tree=null;
        Object LPAREN90_tree=null;
        Object RPAREN92_tree=null;
        RewriteRuleTokenStream stream_Name=new RewriteRuleTokenStream(adaptor,"token Name");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_selector_params=new RewriteRuleSubtreeStream(adaptor,"rule selector_params");
        RewriteRuleSubtreeStream stream_set_expression=new RewriteRuleSubtreeStream(adaptor,"rule set_expression");
        try {
            // ArchvalRulesetGrammar.g:177:2: ( Name LPAREN ( selector_params )? RPAREN -> ^( Name ( selector_params )? ) | LPAREN set_expression RPAREN -> set_expression )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Name) ) {
                alt22=1;
            }
            else if ( (LA22_0==LPAREN) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ArchvalRulesetGrammar.g:178:8: Name LPAREN ( selector_params )? RPAREN
                    {
                    Name86=(Token)match(input,Name,FOLLOW_Name_in_set_atom822);  
                    stream_Name.add(Name86);

                    LPAREN87=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_set_atom824);  
                    stream_LPAREN.add(LPAREN87);

                    // ArchvalRulesetGrammar.g:178:20: ( selector_params )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==Vertex||LA21_0==Edge||(LA21_0>=Number && LA21_0<=Label)) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ArchvalRulesetGrammar.g:178:20: selector_params
                            {
                            pushFollow(FOLLOW_selector_params_in_set_atom826);
                            selector_params88=selector_params();

                            state._fsp--;

                            stream_selector_params.add(selector_params88.getTree());

                            }
                            break;

                    }

                    RPAREN89=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_set_atom829);  
                    stream_RPAREN.add(RPAREN89);



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
                    // 179:8: -> ^( Name ( selector_params )? )
                    {
                        // ArchvalRulesetGrammar.g:180:8: ^( Name ( selector_params )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_Name.nextNode(), root_1);

                        // ArchvalRulesetGrammar.g:180:15: ( selector_params )?
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
                    // ArchvalRulesetGrammar.g:182:2: LPAREN set_expression RPAREN
                    {
                    LPAREN90=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_set_atom858);  
                    stream_LPAREN.add(LPAREN90);

                    pushFollow(FOLLOW_set_expression_in_set_atom860);
                    set_expression91=set_expression();

                    state._fsp--;

                    stream_set_expression.add(set_expression91.getTree());
                    RPAREN92=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_set_atom862);  
                    stream_RPAREN.add(RPAREN92);



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
                    // 183:2: -> set_expression
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
    // ArchvalRulesetGrammar.g:187:1: selector_params : selector_param ( COMMA selector_param )* -> selector_param ( selector_param )* ;
    public final ArchvalRulesetGrammarParser.selector_params_return selector_params() throws RecognitionException {
        ArchvalRulesetGrammarParser.selector_params_return retval = new ArchvalRulesetGrammarParser.selector_params_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA94=null;
        ArchvalRulesetGrammarParser.selector_param_return selector_param93 = null;

        ArchvalRulesetGrammarParser.selector_param_return selector_param95 = null;


        Object COMMA94_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_selector_param=new RewriteRuleSubtreeStream(adaptor,"rule selector_param");
        try {
            // ArchvalRulesetGrammar.g:188:2: ( selector_param ( COMMA selector_param )* -> selector_param ( selector_param )* )
            // ArchvalRulesetGrammar.g:189:2: selector_param ( COMMA selector_param )*
            {
            pushFollow(FOLLOW_selector_param_in_selector_params880);
            selector_param93=selector_param();

            state._fsp--;

            stream_selector_param.add(selector_param93.getTree());
            // ArchvalRulesetGrammar.g:189:17: ( COMMA selector_param )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==COMMA) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:189:18: COMMA selector_param
            	    {
            	    COMMA94=(Token)match(input,COMMA,FOLLOW_COMMA_in_selector_params883);  
            	    stream_COMMA.add(COMMA94);

            	    pushFollow(FOLLOW_selector_param_in_selector_params885);
            	    selector_param95=selector_param();

            	    state._fsp--;

            	    stream_selector_param.add(selector_param95.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
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
            // 190:2: -> selector_param ( selector_param )*
            {
                adaptor.addChild(root_0, stream_selector_param.nextTree());
                // ArchvalRulesetGrammar.g:191:17: ( selector_param )*
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
    // ArchvalRulesetGrammar.g:194:1: selector_param : ( Vertex | Edge | Number | Label );
    public final ArchvalRulesetGrammarParser.selector_param_return selector_param() throws RecognitionException {
        ArchvalRulesetGrammarParser.selector_param_return retval = new ArchvalRulesetGrammarParser.selector_param_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set96=null;

        Object set96_tree=null;

        try {
            // ArchvalRulesetGrammar.g:195:2: ( Vertex | Edge | Number | Label )
            // ArchvalRulesetGrammar.g:
            {
            root_0 = (Object)adaptor.nil();

            set96=(Token)input.LT(1);
            if ( input.LA(1)==Vertex||input.LA(1)==Edge||(input.LA(1)>=Number && input.LA(1)<=Label) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set96));
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
    // ArchvalRulesetGrammar.g:205:1: compound_rule_spec : candexpression ( OR candexpression )* ;
    public final ArchvalRulesetGrammarParser.compound_rule_spec_return compound_rule_spec() throws RecognitionException {
        ArchvalRulesetGrammarParser.compound_rule_spec_return retval = new ArchvalRulesetGrammarParser.compound_rule_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR98=null;
        ArchvalRulesetGrammarParser.candexpression_return candexpression97 = null;

        ArchvalRulesetGrammarParser.candexpression_return candexpression99 = null;


        Object OR98_tree=null;

        try {
            // ArchvalRulesetGrammar.g:206:2: ( candexpression ( OR candexpression )* )
            // ArchvalRulesetGrammar.g:207:2: candexpression ( OR candexpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_candexpression_in_compound_rule_spec938);
            candexpression97=candexpression();

            state._fsp--;

            adaptor.addChild(root_0, candexpression97.getTree());
            // ArchvalRulesetGrammar.g:207:17: ( OR candexpression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==OR) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:207:18: OR candexpression
            	    {
            	    OR98=(Token)match(input,OR,FOLLOW_OR_in_compound_rule_spec941); 
            	    OR98_tree = (Object)adaptor.create(OR98);
            	    root_0 = (Object)adaptor.becomeRoot(OR98_tree, root_0);

            	    pushFollow(FOLLOW_candexpression_in_compound_rule_spec944);
            	    candexpression99=candexpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, candexpression99.getTree());

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
    // $ANTLR end "compound_rule_spec"

    public static class candexpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "candexpression"
    // ArchvalRulesetGrammar.g:210:1: candexpression : cnotexpression ( AND cnotexpression )* ;
    public final ArchvalRulesetGrammarParser.candexpression_return candexpression() throws RecognitionException {
        ArchvalRulesetGrammarParser.candexpression_return retval = new ArchvalRulesetGrammarParser.candexpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND101=null;
        ArchvalRulesetGrammarParser.cnotexpression_return cnotexpression100 = null;

        ArchvalRulesetGrammarParser.cnotexpression_return cnotexpression102 = null;


        Object AND101_tree=null;

        try {
            // ArchvalRulesetGrammar.g:211:2: ( cnotexpression ( AND cnotexpression )* )
            // ArchvalRulesetGrammar.g:212:2: cnotexpression ( AND cnotexpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_cnotexpression_in_candexpression958);
            cnotexpression100=cnotexpression();

            state._fsp--;

            adaptor.addChild(root_0, cnotexpression100.getTree());
            // ArchvalRulesetGrammar.g:212:17: ( AND cnotexpression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==AND) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ArchvalRulesetGrammar.g:212:18: AND cnotexpression
            	    {
            	    AND101=(Token)match(input,AND,FOLLOW_AND_in_candexpression961); 
            	    AND101_tree = (Object)adaptor.create(AND101);
            	    root_0 = (Object)adaptor.becomeRoot(AND101_tree, root_0);

            	    pushFollow(FOLLOW_cnotexpression_in_candexpression964);
            	    cnotexpression102=cnotexpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, cnotexpression102.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ArchvalRulesetGrammar.g:215:1: cnotexpression : ( NOT )? catom ;
    public final ArchvalRulesetGrammarParser.cnotexpression_return cnotexpression() throws RecognitionException {
        ArchvalRulesetGrammarParser.cnotexpression_return retval = new ArchvalRulesetGrammarParser.cnotexpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT103=null;
        ArchvalRulesetGrammarParser.catom_return catom104 = null;


        Object NOT103_tree=null;

        try {
            // ArchvalRulesetGrammar.g:216:2: ( ( NOT )? catom )
            // ArchvalRulesetGrammar.g:217:2: ( NOT )? catom
            {
            root_0 = (Object)adaptor.nil();

            // ArchvalRulesetGrammar.g:217:5: ( NOT )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==NOT) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ArchvalRulesetGrammar.g:217:5: NOT
                    {
                    NOT103=(Token)match(input,NOT,FOLLOW_NOT_in_cnotexpression978); 
                    NOT103_tree = (Object)adaptor.create(NOT103);
                    root_0 = (Object)adaptor.becomeRoot(NOT103_tree, root_0);


                    }
                    break;

            }

            pushFollow(FOLLOW_catom_in_cnotexpression982);
            catom104=catom();

            state._fsp--;

            adaptor.addChild(root_0, catom104.getTree());

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
    // ArchvalRulesetGrammar.g:220:1: catom : ( Name | LPAREN compound_rule_spec RPAREN -> compound_rule_spec );
    public final ArchvalRulesetGrammarParser.catom_return catom() throws RecognitionException {
        ArchvalRulesetGrammarParser.catom_return retval = new ArchvalRulesetGrammarParser.catom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Name105=null;
        Token LPAREN106=null;
        Token RPAREN108=null;
        ArchvalRulesetGrammarParser.compound_rule_spec_return compound_rule_spec107 = null;


        Object Name105_tree=null;
        Object LPAREN106_tree=null;
        Object RPAREN108_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_compound_rule_spec=new RewriteRuleSubtreeStream(adaptor,"rule compound_rule_spec");
        try {
            // ArchvalRulesetGrammar.g:221:2: ( Name | LPAREN compound_rule_spec RPAREN -> compound_rule_spec )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Name) ) {
                alt27=1;
            }
            else if ( (LA27_0==LPAREN) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ArchvalRulesetGrammar.g:222:2: Name
                    {
                    root_0 = (Object)adaptor.nil();

                    Name105=(Token)match(input,Name,FOLLOW_Name_in_catom994); 
                    Name105_tree = (Object)adaptor.create(Name105);
                    adaptor.addChild(root_0, Name105_tree);


                    }
                    break;
                case 2 :
                    // ArchvalRulesetGrammar.g:224:2: LPAREN compound_rule_spec RPAREN
                    {
                    LPAREN106=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catom1000);  
                    stream_LPAREN.add(LPAREN106);

                    pushFollow(FOLLOW_compound_rule_spec_in_catom1002);
                    compound_rule_spec107=compound_rule_spec();

                    state._fsp--;

                    stream_compound_rule_spec.add(compound_rule_spec107.getTree());
                    RPAREN108=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catom1004);  
                    stream_RPAREN.add(RPAREN108);



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
                    // 225:2: -> compound_rule_spec
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
    public static final BitSet FOLLOW_LPAREN_in_quantification_predicate528 = new BitSet(new long[]{0x0000000C04802000L});
    public static final BitSet FOLLOW_selector_params_in_quantification_predicate530 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_quantification_predicate533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andexpression_in_orexpression557 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_OR_in_orexpression560 = new BitSet(new long[]{0x0000000380001800L});
    public static final BitSet FOLLOW_andexpression_in_orexpression563 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_notexpression_in_andexpression577 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_AND_in_andexpression580 = new BitSet(new long[]{0x0000000380001800L});
    public static final BitSet FOLLOW_notexpression_in_andexpression583 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_NOT_in_notexpression601 = new BitSet(new long[]{0x0000000380001800L});
    public static final BitSet FOLLOW_atom_in_notexpression605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_atom622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom628 = new BitSet(new long[]{0x0000000380001800L});
    public static final BitSet FOLLOW_orexpression_in_atom630 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_atom632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_True_in_condition650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_False_in_condition656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Name_in_condition662 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LPAREN_in_condition664 = new BitSet(new long[]{0x0000000C04803800L});
    public static final BitSet FOLLOW_predicate_params_in_condition666 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_condition669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_param_in_predicate_params692 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_COMMA_in_predicate_params695 = new BitSet(new long[]{0x0000000C04801800L});
    public static final BitSet FOLLOW_predicate_param_in_predicate_params697 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_Number_in_predicate_param720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Label_in_predicate_param726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Vertex_in_predicate_param739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Edge_in_predicate_param759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_expression_in_predicate_param772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_atom_in_set_expression784 = new BitSet(new long[]{0x0000007000000002L});
    public static final BitSet FOLLOW_INTERSECT_in_set_expression788 = new BitSet(new long[]{0x0000000C04801800L});
    public static final BitSet FOLLOW_UNION_in_set_expression793 = new BitSet(new long[]{0x0000000C04801800L});
    public static final BitSet FOLLOW_SETMINUS_in_set_expression798 = new BitSet(new long[]{0x0000000C04801800L});
    public static final BitSet FOLLOW_set_atom_in_set_expression802 = new BitSet(new long[]{0x0000007000000002L});
    public static final BitSet FOLLOW_Name_in_set_atom822 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LPAREN_in_set_atom824 = new BitSet(new long[]{0x0000000C04802000L});
    public static final BitSet FOLLOW_selector_params_in_set_atom826 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_set_atom829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_set_atom858 = new BitSet(new long[]{0x0000000C04801800L});
    public static final BitSet FOLLOW_set_expression_in_set_atom860 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_set_atom862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_param_in_selector_params880 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_COMMA_in_selector_params883 = new BitSet(new long[]{0x0000000C04800000L});
    public static final BitSet FOLLOW_selector_param_in_selector_params885 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_set_in_selector_param0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_candexpression_in_compound_rule_spec938 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_OR_in_compound_rule_spec941 = new BitSet(new long[]{0x0000000080001800L});
    public static final BitSet FOLLOW_candexpression_in_compound_rule_spec944 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_cnotexpression_in_candexpression958 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_AND_in_candexpression961 = new BitSet(new long[]{0x0000000080001800L});
    public static final BitSet FOLLOW_cnotexpression_in_candexpression964 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_NOT_in_cnotexpression978 = new BitSet(new long[]{0x0000000080001800L});
    public static final BitSet FOLLOW_catom_in_cnotexpression982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Name_in_catom994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_catom1000 = new BitSet(new long[]{0x0000000080001800L});
    public static final BitSet FOLLOW_compound_rule_spec_in_catom1002 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_catom1004 = new BitSet(new long[]{0x0000000000000002L});

}