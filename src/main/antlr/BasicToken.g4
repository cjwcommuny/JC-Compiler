grammar BasicToken;

LEFT_CURLY_BRACE: '{';
RIGHT_CURLY_BRACE: '}';

LEFT_BRAKET: '[';
RIGHT_BRAKET: ']';

LEFT_PARENTHESES: '(';
RIGHT_PARENTHESES: ')';

SEMICOLON: ';';
COMMA: ',';
DOT: '.';

//SINGLE_QUOTATION_MARK: '\'';
//DOUBLE_QUOTATION_MARK: '"';

ASSIGN_SYMBOL: '=';

EQUAL_SYMBOL: '==';
LOGIC_OR: '||';
LOGIC_AND: '&&';
LOGIC_NOT: '!';

//TODO: scientific notation support
DOUBLE_LITERAL: [+-]?[0-9]*'.'?[0-9]+;
INT_LITERAL: [+-]?[0-9]+;
//TODO: unicode support
CHAR_LITERAL: '\'' [a-zA-Z] '\'';
//TODO: unicode support
STRING_LITERAL: '"' [a-zA-Z0-9 \t]* '"';
BOOL_LITERAL: 'true' | 'false';

ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
XOR: '^';
AND: '&';
OR: '|';
NOT: '~';