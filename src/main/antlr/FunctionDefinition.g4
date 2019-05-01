grammar FunctionDefinition;

import Common, BasicToken, Keyword, Identifier, VariableDefinition, BasicStructure;

functionDefinitionBlock:
	FUNCTION_DEFINITION_SYMBOL TYPE_NAME FUNCTION_NAME functionParameterDefinition functionBody;

functionParameterDefinition: LEFT_PARENTHESES (parameterList | /*empty*/ ) RIGHT_PARENTHESES;

parameterList:
    variableDeclaration
    | parameterList COMMA variableDeclaration
    ;

functionBody: LEFT_CURLY_BRACE functionBodyCode RIGHT_CURLY_BRACE;
