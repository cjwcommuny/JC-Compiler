grammar VariableDefinition;

import BasicToken;
import Identifier;
import Common;

//without semicolon
variableDefinition: variableDeclaration ASSIGN_SYMBOL rValue
	| variableDeclaration
    ;

variableDeclaration: TYPE_NAME VARIABLE_NAME; 