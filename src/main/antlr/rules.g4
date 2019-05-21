grammar rules;

@header {
package parser;
}

@members {
    //added component of generated class
}

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

//SINGLE_QUOTATION_MARK: '\''; DOUBLE_QUOTATION_MARK: '"';

ASSIGN_SYMBOL: '=';

LOGIC_OR: '||';
LOGIC_AND: '&&';
LOGIC_NOT: '!';

add: '+';
sub: '-';
MUL: '*';
DIV: '/';
XOR: '^';
AND: '&';
OR: '|';
NOT: '~';

LESS_THAN: '<';
LESS_OR_EQUAL_THAN: '<=';
GREATER_THAN: '>';
GREATER_OR_EQUAL_THAN: '>=';
EQUAL_SYMBOL: '==';
NOT_EQUAL_SYMBOL: '!=';

//TODO: unicode support
STRING_LITERAL: '"' [a-zA-Z0-9 \t\\]* '"';
BOOL_LITERAL: 'true' | 'false';

arrayInitialization:
    '{' (rValue ',')* rValue '}' # simpleArrayInitialization
//    | '{' (arrayInitialization ',')* arrayInitialization '}' # compoundArrayInitialization
    | IDENTIFIER LEFT_BRACKET int_literal RIGHT_BRACKET # newArray
    ;



//keywords ==============================================================
NAMESPACE_SYMBOL: 'namespace';
FUNCTION_DEFINITION_SYMBOL: 'def';
CLASS_DEFINITION_SYMNOL: 'struct';

IF_SYMBOL: 'if';
WHILE_SYMBOL: 'while';
ELSE_SYMBOL: 'else';
ELSE_IF_SYMBOL: 'elif';
RETURN_SYMBOL: 'return';
CONTINUE_SYMBOL: 'continue';
FOR_SYMBOL: 'for';
BREAK_SYMBOL: 'break';

//data definitionType INT_SYMBOL: 'int'; DOUBLE_SYMBOL: 'double'; CHAR_SYMBOL: 'char'; STRING_SYMBOL:
// 'string'; BOOL_SYMBOL: 'bool';

//identifier ==============================================================
IDENTIFIER: [a-zA-Z_$][a-zA-Z_$0-9]*;

//common ==============================================================
WHITE_SPACE: [ \t\r\n]+ -> skip;

LINE_COMMENT: '//' ~[\r\n]* -> skip;

COMMENT: '/*' .*? '*/' -> skip;

literal: int_literal
    | double_literal
    | CHAR_LITERAL
    | STRING_LITERAL
    | BOOL_LITERAL
    ;

////TODO
rValue:
	expression
	| arrayInitialization
	| functionCall
	| structReference
	| arrayIndex
	;

//TODO
lValue:
	IDENTIFIER
	//    | lValue DOT IDENTIFIER
	| arrayIndex
	| structReference
    ;

arrayIndex:
    (structReference | IDENTIFIER | functionCall) LEFT_BRACKET expression RIGHT_BRACKET
    ;

//namespace definition
namespaceDefinition:
	NAMESPACE_SYMBOL IDENTIFIER LEFT_CURLY_BRACE codeContent+ RIGHT_CURLY_BRACE;

//program general rules ==============================================================
program:
	(namespaceDefinition)+
	; //    | code //default namespace


codeContent:
	variableDefinition SEMICOLON
	| functionDefinitionBlock
	| structDefinition
    ; 

//arithmetic or bool expression ==============================================================
expression:
	IDENTIFIER # identifier
    | literal # literalLabel
	| functionCall # functionCallLabel
	| expression add expression # infixExpression
	| expression sub expression # infixExpression
	| expression MUL expression # infixExpression
	| expression DIV expression # infixExpression
	| sub expression # unaryExpression
	| expression XOR expression # infixExpression
	| expression OR expression # infixExpression
	| expression AND expression # infixExpression
	| NOT expression # unaryExpression
	| LEFT_PARENTHESES expression RIGHT_PARENTHESES # infixExpression
	| expression LESS_THAN expression # infixExpression
    | expression GREATER_THAN expression # infixExpression
    | expression LESS_OR_EQUAL_THAN expression # infixExpression
    | expression GREATER_OR_EQUAL_THAN expression # infixExpression
    | expression EQUAL_SYMBOL expression # infixExpression
    | expression NOT_EQUAL_SYMBOL expression # infixExpression
    | LOGIC_NOT expression # unaryExpression
	| expression LOGIC_OR expression # infixExpression
	| expression LOGIC_AND expression # infixExpression
    ;


//assignment ==============================================================
assignment: lValue ASSIGN_SYMBOL rValue;

//basic structrue ==============================================================
block:
	forBlock
	| whileBlock
	| logicBlock
//	| pureBlock
//	| structDefinition
	;

pureBlock: LEFT_CURLY_BRACE blockBodyCode RIGHT_CURLY_BRACE;

statementWithoutSemicolon: //TODO
	returnStatement # returnInStatement
	| breakStatement # breakStatementLabel
	| continueStatement # continueStatementLabel
	| assignment # assignmentInStatement
	| variableDefinition # variableDefinitionInStatement
	| rValue # rValueInStatement
	;

breakStatement:
    BREAK_SYMBOL
    ;

continueStatement:
    CONTINUE_SYMBOL
    ;

statementList: blockOrStatement*;

blockOrStatement:
    block
    | statementNode
    ;

statementNode: statementWithoutSemicolon SEMICOLON;

blockBodyCode: statementList;

returnStatement: RETURN_SYMBOL rValue | RETURN_SYMBOL;

//function definition ==============================================================
functionDefinitionBlock:
	FUNCTION_DEFINITION_SYMBOL IDENTIFIER IDENTIFIER functionParameterDefinition functionBody;

functionParameterDefinition:
	LEFT_PARENTHESES parameterList RIGHT_PARENTHESES;

parameterList:
	((variableDeclaration ',')* variableDeclaration)?;

functionBody: LEFT_CURLY_BRACE blockBodyCode RIGHT_CURLY_BRACE;

////logic block ==============================================================
logicBlock: ifBlock elseIfBlock* elseBlock?;

ifBlock: IF_SYMBOL '(' rValue ')' '{' blockBodyCode '}';

elseIfBlock:
	ELSE_IF_SYMBOL '(' rValue ')' '{' blockBodyCode '}';

elseBlock: ELSE_SYMBOL '{' blockBodyCode '}';

//loop ============================================================== TODO: do-while
forBlock: FOR_SYMBOL '(' initOrStepCondition SEMICOLON terminateCondition SEMICOLON initOrStepCondition ')' '{' blockBodyCode '}';

initOrStepCondition:
	| ((statementWithoutSemicolon ',')* statementWithoutSemicolon)?
	;

terminateCondition:
	rValue?
	;

whileBlock: WHILE_SYMBOL '(' rValue ')' '{' blockBodyCode '}';

//variable definition ============================================================== without
// semicolon
variableDefinition:
	ordinaryVariableDefinition
	| arrayDefinition
	| variableDeclaration
	;

ordinaryVariableDefinition:
	variableDeclaration ASSIGN_SYMBOL rValue;

variableDeclaration:
	ordinaryVariableDeclaration
	| arrayDeclaration
    ;

ordinaryVariableDeclaration:
    IDENTIFIER IDENTIFIER
    ;

arrayDeclaration:
	IDENTIFIER LEFT_BRACKET RIGHT_BRACKET IDENTIFIER;

arrayDefinition:
    arrayDeclaration ASSIGN_SYMBOL rValue;


//call function ==============================================================
functionCall: IDENTIFIER '(' ((rValue ',')* rValue)? ')';

//struct ==============================================================
structFieldStatementList: (variableDefinition ';')*;

structDefinition:
	CLASS_DEFINITION_SYMNOL IDENTIFIER '{' structFieldStatementList '}';

structReference:
    structReference '.' IDENTIFIER
    | (IDENTIFIER | functionCall) '.' IDENTIFIER
    ;

//TODO: scientific notation support
int_literal: ('+' | '-')? DIGIT+;
double_literal: ('+' | '-')? DIGIT* '.'? DIGIT+;
//TODO: unicode support
CHAR_LITERAL: '\'' [a-zA-Z\\] '\'';

DIGIT: [0-9];