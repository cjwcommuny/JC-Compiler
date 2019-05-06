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

//SINGLE_QUOTATION_MARK: '\''; DOUBLE_QUOTATION_MARK: '"';

ASSIGN_SYMBOL: '=';

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

LESS_THAN: '<';
LESS_OR_EQUAL_THAN: '<=';
GREATER_THAN: '>';
GREATER_OR_EQUAL_THAN: '>=';
EQUAL_SYMBOL: '==';

//TODO: scientific notation support
INT_LITERAL: [+-]? [0-9]+;
DOUBLE_LITERAL: [+-]? [0-9]* '.'? [0-9]+;
//TODO: unicode support
CHAR_LITERAL: '\'' [a-zA-Z] '\'';
//TODO: unicode support
STRING_LITERAL: '"' [a-zA-Z0-9 \t]* '"';
BOOL_LITERAL: 'true' | 'false';

arrayInitialization:
	simpleArrayInitialization
	| '{' (simpleArrayInitialization ',') simpleArrayInitialization '}';

simpleArrayInitialization: '{' (rValue ',')* rValue '}';


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

//data type INT_SYMBOL: 'int'; DOUBLE_SYMBOL: 'double'; CHAR_SYMBOL: 'char'; STRING_SYMBOL:
// 'string'; BOOL_SYMBOL: 'bool';

//identifier ==============================================================
IDENTIFIER: [a-zA-Z_$][a-zA-Z_$0-9]*;

//common ==============================================================
WHITE_SPACE: [ \t\r\n]+ -> skip;

LINE_COMMENT: '//' ~[\r\n]* -> skip;

COMMENT: '/*' .*? '*/' -> skip;

////TODO
rValue:
	INT_LITERAL # rValueliteral
	| DOUBLE_LITERAL # rValueliteral
	| CHAR_LITERAL # rValueliteral
	| STRING_LITERAL # rValueliteral
	| BOOL_LITERAL # rValueliteral
	| expression # rValueExpressionLabel
	| arrayInitialization # arrayInitializationLabel
	| functionCall # rValueFunctionCallLabel
	;

//TODO
lValue:
	IDENTIFIER # lValueIdentifier
	//    | lValue DOT IDENTIFIER
	| lValue LEFT_BRACKET expression RIGHT_BRACKET # lValueArrayIndex
    ;

expression: IDENTIFIER
    | arithmeticExpression
    | boolExpression
    ;

//namespace definition
namespaceDefinition:
	NAMESPACE_SYMBOL IDENTIFIER LEFT_CURLY_BRACE codeContent+ RIGHT_CURLY_BRACE;

//program general rules ==============================================================
program:
	(namespaceDefinition)+
	; //    | code //default namespace


codeContent:
	variableDefinition SEMICOLON # codeContentVariableDefinition
	| functionDefinitionBlock # codeContentFunctionDefinition
	| structDefinition # codeContentStructDefinition
    ; 

//arithmetic or bool expression ==============================================================
arithmeticExpression:
	IDENTIFIER # identifier
	| INT_LITERAL # arithmeticIntLiteral
	| DOUBLE_LITERAL # arithmeticDoubleLiteral
	| STRING_LITERAL # arithmeticStringLiteral
	| CHAR_LITERAL # arithmeticCharLiteral
	| BOOL_LITERAL # arithmeticBoolLiteral
	| functionCall # functionCallLabel
	| arithmeticExpression ADD arithmeticExpression # infixExpression
	| arithmeticExpression SUB arithmeticExpression # infixExpression
	| arithmeticExpression MUL arithmeticExpression # infixExpression
	| arithmeticExpression DIV arithmeticExpression # infixExpression
	| SUB arithmeticExpression # unaryExpression
	| arithmeticExpression XOR arithmeticExpression # infixExpression
	| arithmeticExpression OR arithmeticExpression # infixExpression
	| arithmeticExpression AND arithmeticExpression # infixExpression
	| NOT arithmeticExpression # unaryExpression
	| LEFT_PARENTHESES arithmeticExpression RIGHT_PARENTHESES # infixExpression
    ;

//bool expression ==============================================================
boolExpression:
	IDENTIFIER //#identifier
	| INT_LITERAL //# intLiteral
	| DOUBLE_LITERAL //# doubleLiteral
	| CHAR_LITERAL //# charLiteral
	| functionCall //# functionCallLabel
	| boolExpression LESS_THAN boolExpression //# less
	| boolExpression GREATER_THAN boolExpression
	| boolExpression LESS_OR_EQUAL_THAN boolExpression
	| boolExpression GREATER_OR_EQUAL_THAN boolExpression
	| boolExpression EQUAL_SYMBOL boolExpression;

//assignment ==============================================================
assignment: lValue ASSIGN_SYMBOL rValue;

//basic structure ==============================================================
block:
	forBlock # forBlockLabel
	| whileBlock # whileBlockLabel
	| logicBlock # logicBlockLabel
	//	| functionDefinitionBlock
	| pureBlock # pureBlockLabel
	| structDefinition # structDefinitionLabel
	;

pureBlock: LEFT_CURLY_BRACE blockBodyCode RIGHT_CURLY_BRACE;

statementWithoutSemicolon: //TODO
	returnStatement # returnStatementLabel
	| assignment # assignmentLabel
	| variableDefinition # variableDefinitionLabel
	| rValue # rValueLabel
	;

statementList: (statementOrBlock)*;

statementOrBlock:
    block
    | statement
    ;


statement: statementWithoutSemicolon SEMICOLON;

blockBodyCode: statementList;

returnStatement: RETURN_SYMBOL rValue | RETURN_SYMBOL;

//function definition ==============================================================
functionDefinitionBlock:
	FUNCTION_DEFINITION_SYMBOL IDENTIFIER IDENTIFIER functionParameterDefinition functionBody;

functionParameterDefinition:
	LEFT_PARENTHESES parameterList RIGHT_PARENTHESES;

parameterList:
	//empty
	| (variableDeclaration ',')* variableDeclaration;

functionBody: LEFT_CURLY_BRACE blockBodyCode RIGHT_CURLY_BRACE;

////logic block ==============================================================
logicBlock: ifBlock elseIfBlock* elseBlock?;

ifBlock: IF_SYMBOL '(' rValue ')' '{' blockBodyCode '}';

elseIfBlock:
	ELSE_IF_SYMBOL '(' rValue ')' '{' blockBodyCode '}';

elseBlock: ELSE_SYMBOL '{' blockBodyCode '}';

//loop ============================================================== TODO: do-while
forBlock: FOR_SYMBOL '(' forCondition ')' '{' blockBodyCode '}';

forCondition:
	initOrStepCondition ';' terminateCondition ';' initOrStepCondition;

initOrStepCondition:
	//empty
	| (statementWithoutSemicolon ',')* statementWithoutSemicolon;

terminateCondition:
	//empty
	| rValue;

whileBlock: WHILE_SYMBOL '(' rValue ')' '{' blockBodyCode '}';

//variable definition ============================================================== without
// semicolon
variableDefinition:
	ordinaryVariableDefinition
	| ordinaryArrayDefinition
	| variableDeclaration;

ordinaryVariableDefinition:
	simpleVariableDeclaration ASSIGN_SYMBOL rValue;

ordinaryArrayDefinition: arrayDeclaration ASSIGN_SYMBOL rValue;

variableDeclaration:
	simpleVariableDeclaration
	| arrayDeclaration;

simpleVariableDeclaration: IDENTIFIER IDENTIFIER;

arrayDeclaration:
	IDENTIFIER (LEFT_BRACKET RIGHT_BRACKET)* IDENTIFIER;

//call function ==============================================================
functionCall: IDENTIFIER '(' ((rValue ',')* rValue)? ')';

//struct ==============================================================
structFieldStatementList: (variableDefinition ';')*;

structDefinition:
	CLASS_DEFINITION_SYMNOL IDENTIFIER '{' structFieldStatementList '}';

//TODO: identifier.identifier