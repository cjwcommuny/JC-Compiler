grammar ProgramRules;
import Common;
import BasicToken;
import Keyword;
import FunctionDefinition;
import Assignment;


program: /*empty rule*/
    | code
    | NAMESPACE LEFT_CURLY_BRACE code RIGHT_CURLY_BRACE
    ;

code: /*empty */
	| statementList statementAndBlock
    ;

codeContents: /*empty */
    | codeContent codeContents;

codeContent: functionDefinitionBlock
    | assignStatement
    ;




//================================================


expression: 
    ;

statementList: /*empty */
	| statementAndBlock SEMICOLON
    ;

statementAndBlock: block
    | statement
    ;

statement: expression SEMICOLON
    ;

assignStatement: ;