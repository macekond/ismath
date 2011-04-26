grammar ArchvalRulesetGrammar;

@header {
package cz.cvut.fel.archval.ruleset_parser.antlr;
import java.util.HashMap;
}

@lexer::header {
package cz.cvut.fel.archval.ruleset_parser.antlr;
}

validation_unit:
    atomic_rule*
    compound_rule*
    validate_command*
    analyze_command*
    EOF;

atomic_rule :
    'atomic_rule' Name '(' Name ')' '{' atomic_rule_spec '}' ';';

compound_rule :
    'compound_rule' Name '{' compound_rule_spec '}' ';';

validate_command :
    'validate' '(' validate_command_params ')' ';';

analyze_command :
    'analyze' '(' analyze_command_params ')' ';';

validate_command_params : Name (',' Name)*;

analyze_command_params : Name (',' Name)*;

atomic_rule_spec : set_spec_clause '{' orexpression '}';

set_spec_clause :
    ( ('ALL') | ('EXISTS')) 'v' 'IN' 'V' (':' Name '(' selector_params ')')?
    |
    ( ('ALL') | ('EXISTS')) 'e' 'IN' 'E' (':' Name '(' selector_params ')')?
    ;

orexpression : andexpression (('OR') andexpression)*;

andexpression : notexpression (('AND') notexpression)*;

notexpression : ('NOT')? atom;

atom : condition | '(' orexpression ')';

condition : 'true' | 'false' | Name '(' predicate_params? ')';

predicate_params : predicate_param (',' predicate_param)*;

predicate_param : Number | Label | set_expression;

set_expression : set_atom ((('INTERSECT') | ('UNION') | ('SETMINUS')) set_atom)*;

set_atom :
    Name '(' selector_params? ')'
    |
    '(' set_expression ')'
    ;

selector_params : selector_param (',' selector_param)*;

selector_param : 'v' | 'e' | Number | Label;

compound_rule_spec : candexpression ('OR' candexpression)*;

candexpression : cnotexpression ('AND' cnotexpression)*;

cnotexpression : ('NOT')? Name;

Name : ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;

Number : ('0'..'9')+;

Label : '"' ('a'..'z' | 'A'..'Z' | '0'..'9')* '"';

WS
	: (' '
	| '\t'
	| '\n'
	| '\r')+ { $channel=HIDDEN; };
