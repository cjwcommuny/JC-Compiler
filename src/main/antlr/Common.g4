grammar Common;

import BasicToken, Identifier, BasicStructure;

WHITE_SPACE: [ \t\r\n]+ -> skip;

//TODO
rValue: 
    expression
    ;

lValue: 
    IDENTIFIER
    | lValue DOT IDENTIFIER
    | lValue LEFT_BRAKET expression RIGHT_BRAKET
    ;
