grammar ArrayInit;

init : '{' value (',' value)* '}';

value: init
    | INT
    ;

INT: [0-9]+;
WHITE_SPACE: [ \t\r\n]+ -> skip;