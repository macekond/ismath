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
    package cz.cvut.fel.archval.core.avd.parser;
}

@lexer::header {
    package cz.cvut.fel.archval.core.avd.parser;
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
	ATOMIC_RULE_KW rname=Name LPAREN grname=Name RPAREN
	LBRACE atomic_rule_spec RBRACE SEMICOLON
	->
	^($rname $grname atomic_rule_spec)
	;

compound_rule :
	COMPOUND_RULE_KW Name
	LBRACE compound_rule_spec RBRACE SEMICOLON
	->
	^(Name compound_rule_spec)
	;

validate_command :
	VALIDATE_KW LPAREN validate_command_params
	RPAREN SEMICOLON
	->
	validate_command_params
	;

analyze_command :
	ANALYZE_KW LPAREN analyze_command_params
	RPAREN SEMICOLON
	->
	analyze_command_params
	;

validate_command_params :
	Name (COMMA! Name)*
	;

analyze_command_params :
	Name (COMMA! Name)*
	;

atomic_rule_spec :
	set_spec_clause LBRACE orexpression RBRACE
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
	ALL^
	|
	EXISTS^
	;

quantification_variable
	:
	Vertex IN VertexSet -> ^(Vertex ^(IN VertexSet))
	|
	Edge IN EdgeSet -> ^(Edge ^(IN EdgeSet))
	;

quantification_predicate
	:
	(COLON Name LPAREN selector_params? RPAREN)
	->
	^(Name selector_params?)
	;

orexpression
	:
	andexpression (OR^ andexpression)*
	;

andexpression
	:
	notexpression (AND^ notexpression)*
	;

notexpression
	:
    	NOT^? atom
     	;

atom
	:
	condition
	|
	LPAREN orexpression RPAREN
	->
	orexpression
	;

condition
	:
	True
	|
	False
	|
	Name LPAREN predicate_params? RPAREN
	->
	^(Name predicate_params?)
	;

predicate_params
	:
	predicate_param (COMMA predicate_param)*
	->
	predicate_param predicate_param*
	;

predicate_param
	:
	Number
	|
	Label
	|
        Vertex
        |
        Edge
        |
	set_expression
	;

set_expression
	:
	set_atom ((INTERSECT^ | UNION^ | SETMINUS^) set_atom)*
	;

set_atom
	:
      	Name LPAREN selector_params? RPAREN
      	->
      	^(Name selector_params?)
	|
	LPAREN set_expression RPAREN
	->
	set_expression
	;

selector_params
	:
	selector_param (COMMA selector_param)*
	->
	selector_param selector_param*
	;

selector_param
	:
	Vertex
	|
	Edge
	|
	Number
	|
	Label
	;

compound_rule_spec
	:
	candexpression (OR^ candexpression)*
	;

candexpression
	:
	cnotexpression (AND^ cnotexpression)*
	;

cnotexpression
	:
	NOT^? catom
	;

catom
	:
	Name
	|
	LPAREN compound_rule_spec RPAREN
	->
	compound_rule_spec
	;
	
// operators
EXISTS	:	'EXISTS';
ALL	:	'ALL';
IN	:	'IN';

INTERSECT
	:	'INTERSECT';
UNION	:	'UNION';
SETMINUS:	'SETMINUS';

NOT 	:	'NOT';
AND	:	'AND';
OR	:	'OR';

// keywords
ATOMIC_RULE_KW
	:	'atomic_rule';
COMPOUND_RULE_KW
	:	'compound_rule';
VALIDATE_KW
	:	'validate';
ANALYZE_KW
	:	'analyze';

// grouping operators
LBRACE 	:	'{';
RBRACE	:	'}';
LPAREN	:	'(';
RPAREN	:	')';
COMMA	:	',';
SEMICOLON
	:	';';
COLON	:	':';

// literals
True	:	'true';
False	:	'false';
Vertex	:	'v';
Edge	:	'e';
VertexSet
	:	'V';
EdgeSet	:	'E';
Name	:	('a'..'z' | 'A'..'Z')
		('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;
Number	:	('0'..'9')+;
Label 	:	'"' ('a'..'z' | 'A'..'Z' | '0'..'9'
		| '_' | '-')* '"';

// whitespace tokens (ignored)
WS : (' ' | '\t' | '\n' | '\r')+ { $channel=HIDDEN; };
