grammar FunctionDefinition;

import Common;
import BasicToken;
import Keyword;
import Identifier;
import VariableDefinition;

functionDefinitionBlock:
	FUNCTION_DEFINITION TYPE_NAME FUNCTION_NAME functionParameterDefinition functionBody;

functionParameterDefinition: LEFT_BRAKET parameterList RIGHT_BRAKET;

parameterList: /*empty */
    | variableDeclaration
    | parameterList COMMA variableDeclaration
    ;

functionBody: LEFT_CURLY_BRACE /*todo */ RIGHT_CURLY_BRACE;