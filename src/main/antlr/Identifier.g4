grammar Identifier;

FUNCTION_NAME: [a-zA-Z_$][a-zA-Z_$0-9]*;

TYPE_NAME: [a-zA-Z_$][a-zA-Z_$0-9]*;

VARIABLE_NAME: [a-zA-Z_$][a-zA-Z_$0-9]*;

IDENTIFIER: 
    FUNCTION_NAME
    | VARIABLE_NAME
    ;
