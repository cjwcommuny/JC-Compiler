grammar Arithmetic;

import BasicToken, Common;

arithmeticExpression: 
    rValue
    | arithmeticExpression ADD arithmeticExpression
    | arithmeticExpression SUB arithmeticExpression
    | arithmeticExpression MUL arithmeticExpression
    | arithmeticExpression DIV arithmeticExpression
    | SUB arithmeticExpression
    | arithmeticExpression XOR arithmeticExpression
    | arithmeticExpression OR arithmeticExpression
    | arithmeticExpression AND arithmeticExpression
    | NOT arithmeticExpression
    | LEFT_PARENTHESES arithmeticExpression RIGHT_PARENTHESES
    ;
