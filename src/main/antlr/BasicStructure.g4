grammar BasicStructure;

import Loop, LogicBlock, FunctionDefinition;

block:
//	forBlock
//	| whileBlock
//	| ifBlock
//	| functionDefinitionBlock
	pureBlock
	;

statementWithoutSemicolon: //TODO
    return
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


return:
    RETURN_SYMBOL rValue
    | RETURN_SYMBOL
    ;
