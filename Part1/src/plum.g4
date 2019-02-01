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

IDENTIFIER 
  :  LETTER (LETTER | DIGIT)*
  ;

WS
  :  (' ' | '\t' | '\n' | '\r' | '\f')+
  ; 

fragment LETTER : ('a'..'z' | 'A'..'Z');
fragment DIGIT  : ('0'..'9');