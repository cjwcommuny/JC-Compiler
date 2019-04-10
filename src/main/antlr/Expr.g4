grammar Expr;

prog: stat+ ;

stat: expr NEW_LINE
    | ID '=' expr NEW_LINE
    | NEW_LINE
    ;

expr: expr ('*' | '/') expr
    | expr ('+' | '-') expr
    | INT
    | ID
    | '(' expr ')'
    ;

ID: [a-zA-Z]+;
INT: [0-9]+;
NEW_LINE: '\r'? '\n';
WHITE_SPACE: [ \t]+ -> skip;
