grammar rules;

//test  ==============================================================
TEST_SYMBOL: 'TEST';


//basic tokens ==============================================================
LEFT_CURLY_BRACE: '{';
RIGHT_CURLY_BRACE: '}';

LEFT_BRACKET: '[';
RIGHT_BRACKET: ']';

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

ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
XOR: '^';
AND: '&';
OR: '|';
NOT: '~';

//TODO: scientific notation support
DOUBLE_LITERAL: [+-]?[0-9]*'.'?[0-9]+;
INT_LITERAL: [+-]?[0-9]+;
//TODO: unicode support
CHAR_LITERAL: '\'' [a-zA-Z] '\'';
//TODO: unicode support
STRING_LITERAL: '"' [a-zA-Z0-9 \t]* '"';
BOOL_LITERAL: 'true' | 'false';

arrayInitialization:
    simpleArrayInitialization
    | '{' (simpleArrayInitialization ',') simpleArrayInitialization '}'
    ;

simpleArrayInitialization:
    '{' rValueList '}'
    ;

rValueList:
    (rValue ',')* rValue
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
//INT_SYMBOL: 'int';
//DOUBLE_SYMBOL: 'double';
//CHAR_SYMBOL: 'char';
//STRING_SYMBOL: 'string';
//BOOL_SYMBOL: 'bool';


//identifier ==============================================================
IDENTIFIER: [a-zA-Z_$][a-zA-Z_$0-9]*;




//common ==============================================================
WHITE_SPACE: [ \t\r\n]+ -> skip;

LINE_COMMENT:
    '//' ~[\r\n]*  -> skip
    ;

COMMENT
    : '/*' .*? '*/' -> skip
;


////TODO
rValue:
    INT_LITERAL
    | DOUBLE_LITERAL
    | CHAR_LITERAL
    | STRING_LITERAL
    | BOOL_LITERAL
    | expression
    | arrayInitialization
    | functionCall
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
program: code //default namespace
    | NAMESPACE_SYMBOL IDENTIFIER LEFT_CURLY_BRACE code RIGHT_CURLY_BRACE
    ;

//code is the content of a namespace, which cannot contain namespace
code: //empty
    | codeContent+
    ;

codeContent:
    variableDefinition SEMICOLON
    | functionDefinitionBlock
    ;



//arithmetic ==============================================================
arithmeticExpression:
    IDENTIFIER
    | INT_LITERAL
    | DOUBLE_LITERAL
    | STRING_LITERAL
    | CHAR_LITERAL
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
    | rValue
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
	FUNCTION_DEFINITION_SYMBOL IDENTIFIER IDENTIFIER functionParameterDefinition functionBody;

functionParameterDefinition: LEFT_PARENTHESES parameterList RIGHT_PARENTHESES;

parameterList:
    //empty
    | (variableDeclaration ',')* variableDeclaration
    ;

functionBody: LEFT_CURLY_BRACE functionBodyCode RIGHT_CURLY_BRACE;


////logic block ==============================================================
////ifBlock: ;
//
////loop ==============================================================
//
////forBlock:
////	FOR_SYMBOL LEFT_PARENTHESES forCondition RIGHT_PARENTHESES LEFT_CURLY_BRACE code RIGHT_CURLY_BRACE;
////
////forCondition: ; //TODO
////
////whileBlock: ;
//
//
//variable definition ==============================================================
//without semicolon
variableDefinition:
    ordinaryVariableDefinition
    | ordinaryArrayDefinition
	| variableDeclaration
    ;

ordinaryVariableDefinition: simpleVariableDeclaration ASSIGN_SYMBOL rValue;

ordinaryArrayDefinition: arrayDeclaration ASSIGN_SYMBOL rValue;

variableDeclaration:
    simpleVariableDeclaration
    | arrayDeclaration
;

simpleVariableDeclaration: IDENTIFIER IDENTIFIER;

arrayDeclaration: IDENTIFIER (LEFT_BRACKET RIGHT_BRACKET)* IDENTIFIER;



//call function ==============================================================
functionCall:
    IDENTIFIER '(' rValueList ')'
    ;