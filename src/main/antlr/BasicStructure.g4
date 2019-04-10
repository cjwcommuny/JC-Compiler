grammar BasicStructure;

import Loop, LogicBlock, FunctionDefinition;

block:
	forBlock
	| whileBlock
	| ifBlock
	| functionDefinitionBlock;

expression:;

statementList: /*empty */ | statementAndBlock SEMICOLON;

statementAndBlock: block | statement;

statement: expression SEMICOLON;

assignStatement:;

ordinaryCode: ;