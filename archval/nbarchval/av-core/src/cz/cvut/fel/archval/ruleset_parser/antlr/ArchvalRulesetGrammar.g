grammar ArchvalRulesetGrammar;

options {
    output=AST;
}

tokens {
    VALIDATION_UNIT;
    ATOMIC_RULES;
    COMPOUND_RULES;
    VALIDATE_COMMANDS;
    ANALYZE_COMMANDS;
    RULE_EXPRESSION;
}

@rulecatch {
}

@header {
    package cz.cvut.fel.archval.ruleset_parser.antlr;
}

@lexer::header {
    package cz.cvut.fel.archval.ruleset_parser.antlr;
}

validation_unit
	:	
	atomic_rule*
	compound_rule*
	validate_command*
	analyze_command*
	EOF
	->  
	^(VALIDATION_UNIT
        ^(ATOMIC_RULES atomic_rule*)
        ^(COMPOUND_RULES compound_rule*)
        ^(VALIDATE_COMMANDS validate_command*)
    	^(ANALYZE_COMMANDS analyze_command*))
	;	

atomic_rule :
	'atomic_rule' rname=Name '(' grname=Name ')' '{' atomic_rule_spec '}' ';'
	->
	^($rname $grname atomic_rule_spec)
	;

compound_rule :
	'compound_rule' Name '{' compound_rule_spec '}' ';'
	->
	^(Name compound_rule_spec)
	;

validate_command :
	'validate' '(' validate_command_params ')' ';'
	->
	validate_command_params
	;

analyze_command :
	'analyze' '(' analyze_command_params ')' ';'
	->
	analyze_command_params
	;

validate_command_params :
	Name (','! Name)*
	;

analyze_command_params :
	Name (','! Name)*
	;

atomic_rule_spec :
	set_spec_clause '{' orexpression '}'
	->
	set_spec_clause ^(RULE_EXPRESSION orexpression)
	;

set_spec_clause
	:
    	quantifier_clause
    	quantification_variable
    	quantification_predicate?
    	->
    	^(quantifier_clause
    	quantification_variable)
    	quantification_predicate? 	
    	;
 
quantifier_clause
	:	
	'ALL'^
	|
	'EXISTS'^
	;
	
quantification_variable
	:	
	'v' 'IN' 'V' -> ^('v' ^('IN' 'V'))
	|
	'e' 'IN' 'E' -> ^('e' ^('IN' 'E'))
	;
	
quantification_predicate
	:
	(':' Name '(' selector_params ')')
	->
	^(Name selector_params)
	;

orexpression
	:
	andexpression ('OR'^ andexpression)*
	;

andexpression
	:
	notexpression ('AND'^ notexpression)*
	;

notexpression
	:
    	'NOT'^? atom
     	;

atom
	:
	condition
	|
	'(' orexpression ')'
	->
	^(orexpression)
	;

condition
	:
	'true'
	|
	'false'
	|
	Name '(' predicate_params? ')'
	->
	^(Name predicate_params?)
	;

predicate_params
	:
	predicate_param (',' predicate_param)*
	->
	predicate_param predicate_param*
	;

predicate_param
	:
	Number
	|
	Label
	|
	set_expression
	;

set_expression
	:
	set_atom (('INTERSECT'^ | 'UNION'^ | 'SETMINUS'^) set_atom)*
	;

set_atom
	:
      	Name '(' selector_params? ')'
      	->
      	^(Name selector_params?)
	|
	'(' set_expression ')'
	->
	^(set_expression)
	;

selector_params
	:	
	selector_param (',' selector_param)*
	->
	^(selector_param selector_param*)
	;

selector_param
	:
	'v'
	|
	'e'
	|
	Number
	|
	Label
	;

compound_rule_spec
	:
	candexpression ('OR'^ candexpression)*
	;

candexpression
	:
	cnotexpression ('AND'^ cnotexpression)*
	;

cnotexpression : 'NOT'^? Name;

Name : ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;

Number : ('0'..'9')+;

Label : '"' ('a'..'z' | 'A'..'Z' | '0'..'9')* '"';

WS : (' ' | '\t' | '\n' | '\r')+ { $channel=HIDDEN; };
