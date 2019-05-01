grammar rules;

//basic tokens ==============================================================
LEFT_CURLY_BRACE: '{';
RIGHT_CURLY_BRACE: '}';

LEFT_BRAKET: '[';
RIGHT_BRAKET: ']';

LEFT_PARENTHESES: '(';
RIGHT_PARENTHESES: ')';

SEMICOLON: ';';
COMMA: ',';
DOT: '.';

//SINGLE_QUOTATION_MARK: '\'';
//DOUBLE_QUOTATION_MARK: '"';

ASSIGN_SYMBOL: '=';

EQUAL_SYMBOL: '==';
LOGIC_OR: '||';
LOGIC_AND: '&&';
LOGIC_NOT: '!';

//TODO: scientific notation support
DOUBLE_LITERAL: [+-]?[0-9]*'.'?[0-9]+;
INT_LITERAL: [+-]?[0-9]+;
//TODO: unicode support
CHAR_LITERAL: '\'' [a-zA-Z] '\'';
//TODO: unicode support
STRING_LITERAL: '"' [a-zA-Z0-9 \t]* '"';
BOOL_LITERAL: 'true' | 'false';

ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
XOR: '^';
AND: '&';
OR: '|';
NOT: '~';


//identifier ==============================================================
FUNCTION_NAME: [a-zA-Z_$][a-zA-Z_$0-9]*;

TYPE_NAME: [a-zA-Z_$][a-zA-Z_$0-9]*;

VARIABLE_NAME: [a-zA-Z_$][a-zA-Z_$0-9]*;

IDENTIFIER:
    FUNCTION_NAME
    | VARIABLE_NAME
    ;


//keywords ==============================================================
NAMESPACE_SYMBOL: 'namespace';
FUNCTION_DEFINITION_SYMBOL: 'def';

IF_SYMBOL: 'if';
WHILE_SYMBOL: 'while';
ELSE_SYMBOL: 'else';
ELSE_IF_SYMBOL: 'elif';
RETURN_SYMBOL: 'return';
CONTINUE_SYMBOL: 'continue';
FOR_SYMBOL: 'for';
BREAK_SYMBOL: 'break';


//data type
INT_SYMBOL: 'int';
DOUBLE_SYMBOL: 'double';
CHAR_SYMBOL: 'char';
STRING_SYMBOL: 'string';
BOOL_SYMBOL: 'bool';


//common ==============================================================
WHITE_SPACE: [ \t\r\n]+ -> skip;
NEW_LINE_SYMBOL: [\r\n];

//TODO
rValue:
    INT_LITERAL
//    | DOUBLE_LITERAL
//    | CHAR_LITERAL
//    | STRING_LITERAL
//    | BOOL_LITERAL
    | expression
    ;

//TODO
lValue:
    IDENTIFIER
//    | lValue DOT IDENTIFIER
//    | lValue LEFT_BRAKET expression RIGHT_BRAKET
    ;

expression:
    IDENTIFIER
    | arithmeticExpression
    ;


//program general rules ==============================================================
program: //empty rule
    | code //default namespace
    | NAMESPACE_SYMBOL LEFT_CURLY_BRACE code RIGHT_CURLY_BRACE
    ;

//code is the content of a namespace, which cannot contain namespace
code: //empty
    | code codeContent
    ;

codeContent:
    functionDefinitionBlock
    | assignment
    ;



//arithmetic ==============================================================
arithmeticExpression:
    VARIABLE_NAME
    | INT_LITERAL
//    | DOUBLE_LITERAL
//    | STRING_LITERAL
//    | CHAR_LITERAL
    | arithmeticExpression ADD arithmeticExpression
    | arithmeticExpression SUB arithmeticExpression
    | arithmeticExpression MUL arithmeticExpression
    | arithmeticExpression DIV arithmeticExpression
    | SUB arithmeticExpression
    | arithmeticExpression XOR arithmeticExpression
    | arithmeticExpression OR arithmeticExpression
    | arithmeticExpression AND arithmeticExpression
    | NOT arithmeticExpression
    | LEFT_PARENTHESES arithmeticExpression RIGHT_PARENTHESES
    ;


//assignment ==============================================================
assignment: lValue ASSIGN_SYMBOL rValue;

//basic structure ==============================================================
block:
//	forBlock
//	| whileBlock
//	| ifBlock
//	| functionDefinitionBlock
	pureBlock
	;

pureBlock:
    LEFT_CURLY_BRACE functionBodyCode RIGHT_CURLY_BRACE
    ;

statementWithoutSemicolon: //TODO
    returnStatement
    | assignment
    | variableDefinition
    ;

statementList: /*empty */
    | statementOrBlock statementList
    ;

statementOrBlock: block
    | statement
    ;

statement:
    statementWithoutSemicolon SEMICOLON
    ;

functionBodyCode:
    statementList
    ;

returnStatement:
    RETURN_SYMBOL rValue
    | RETURN_SYMBOL
    ;


//function definition ==============================================================
functionDefinitionBlock:
	FUNCTION_DEFINITION_SYMBOL TYPE_NAME FUNCTION_NAME functionParameterDefinition functionBody;

functionParameterDefinition: LEFT_PARENTHESES (parameterList | /*empty*/ ) RIGHT_PARENTHESES;

parameterList:
    variableDeclaration
    | parameterList COMMA variableDeclaration
    ;

functionBody: LEFT_CURLY_BRACE functionBodyCode RIGHT_CURLY_BRACE;


//logic block ==============================================================
//ifBlock: ;

//loop ==============================================================

//forBlock:
//	FOR_SYMBOL LEFT_PARENTHESES forCondition RIGHT_PARENTHESES LEFT_CURLY_BRACE code RIGHT_CURLY_BRACE;
//
//forCondition: ; //TODO
//
//whileBlock: ;


//variable definition ==============================================================
//TODO: array declaration
//without semicolon
variableDefinition:
    ordinaryVariableDefinition
//    | arrayDefinition
	| variableDeclaration
    ;

ordinaryVariableDefinition: simpleVariableDeclaration ASSIGN_SYMBOL rValue;

//arrayDefinition: arrayDeclaration ASSIGN_SYMBOL rValue;

variableDeclaration:
    simpleVariableDeclaration
//    | arrayDeclaration
;

simpleVariableDeclaration: TYPE_NAME VARIABLE_NAME;

//arrayDeclaration: TYPE_NAME LEFT_BRACKET RIGHT_BRACKET VARIABLE_NAME;


// comment  ==============================================================
comment:
    COMMENT_START_SYMBOL . NEW_LINE_SYMBOL
    ;

COMMENT_START_SYMBOL: '//';
