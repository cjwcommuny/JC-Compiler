grammar Common;

import BasicToken, Identifier, BasicStructure, Arithmetic;

WHITE_SPACE: [ \t\r\n]+ -> skip;

//TODO
rValue: 
    expression
//    | DOUBLE_LITERAL
    | INT_LITERAL
//    | CHAR_LITERAL
//    | STRING_LITERAL
//    | BOOL_LITERAL
    ;

//TODO
lValue: 
    IDENTIFIER
//    | lValue DOT IDENTIFIER
//    | lValue LEFT_BRAKET expression RIGHT_BRAKET
    ;

expression:
    IDENTIFIER
    | arithmeticExpression
    ;
