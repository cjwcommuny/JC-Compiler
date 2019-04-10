grammar FunctionDefinition;

import Common, BasicToken, Keyword, Identifier, VariableDefinition, BasicStructure;

functionDefinitionBlock:
	FUNCTION_DEFINITION_SYMBOL TYPE_NAME FUNCTION_NAME functionParameterDefinition functionBody;

functionParameterDefinition: LEFT_PARENTHESES parameterList RIGHT_PARENTHESES;

parameterList: /*empty */
    | variableDeclaration
    | parameterList COMMA variableDeclaration
    ;

functionBody: LEFT_CURLY_BRACE ordinaryCode RIGHT_CURLY_BRACE;
