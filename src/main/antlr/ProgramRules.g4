grammar ProgramRules;
import Common, BasicToken, Keyword, FunctionDefinition, Assignment, BasicStructure;

program: /*empty rule*/
    | code //default namespace
    | NAMESPACE LEFT_CURLY_BRACE code RIGHT_CURLY_BRACE
    ;

//code is the content of a namespace, which cannot contain namespace
code: /*empty*/
    | code codeContent
    ;

codeContent:
    functionDefinitionBlock
    | assignStatement
    ;
