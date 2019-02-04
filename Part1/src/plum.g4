lexer grammar Plum;

BEGIN
  :  'BEGIN'
  ;

END
  :  'END'
  ;

FLOAT
  :  DIGIT+ '.' DIGIT+
  ;

INT
  :  DIGIT+
  ;

WS :  [ \t\r\n]+ -> skip ;

IDENTIFIER 
  :  LETTER (LETTER | DIGIT)*
  ;



fragment LETTER : ('a'..'z' | 'A'..'Z');
fragment DIGIT  : ('0'..'9');