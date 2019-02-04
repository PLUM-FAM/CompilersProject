lexer grammar Plum;

WS :  [ \t\r\n]+ -> skip;

KEYWORD : 'PROGRAM'|'BEGIN'|'END'|'FUNCTION'|'READ'|'WRITE'|'IF'|'ELSE'|'ENDIF'|'WHILE'|'ENDWHILE'|'CONTINUE'|'BREAK'|'RETURN'|'INT'|'VOID'|'STRING'|'FLOAT';

OPERATOR: ':='|'+'|'-'|'*'|'/'|'='|'!='|'<'|'>'|'('|')'|';'|','|'<='|'>=';

COMMENT: '--'.*?'\n' -> skip;

IDENTIFIER: [A-z]([0-9]|[A-z])*;

