grammar VariableDefinition;

import BasicToken, Identifier, Common;

//TODO: array declaration
//without semicolon
variableDefinition:
    ordinaryVariableDefinition
    | arrayDefinition
	| variableDeclaration
    ;

ordinaryVariableDefinition: ordinaryVariableDeclaration ASSIGN_SYMBOL rValue;

arrayDefinition: arrayDeclaration ASSIGN_SYMBOL rValue;

variableDeclaration: 
    ordinaryVariableDeclaration
    | arrayDeclaration
;

ordinaryVariableDeclaration: TYPE_NAME VARIABLE_NAME; 

arrayDeclaration: TYPE_NAME LEFT_BRACKET RIGHT_BRACKET VARIABLE_NAME;