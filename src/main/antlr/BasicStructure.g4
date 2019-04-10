grammar BasicStructure;

import Loop, LogicBlock, FunctionDefinition, Assignment, VariableDefinition, Arithmetic, Common, BasicToken;

//structure with '{' and '}'
block:
	forBlock
	| whileBlock
	| ifBlock
	;

//TODO
expression:
	arithmeticExpression
	| lValue DOT IDENTIFIER
	| lValue LEFT_BRAKECT expression RIGHT_BRACKET
	;

statementList: 
	statementAndBlock
	| statementList statementAndBlock SEMICOLON
	;

statementAndBlock: 
	block 
	| statement
	;

statement: 
	expression SEMICOLON
	| assignStatement
	| variableDeclaration SEMICOLON
	;

assignStatement: assignment SEMICOLON
	;

//code inside a function body, cannot be function definition
ordinaryCode: /*empty */
	| statementList
	;
