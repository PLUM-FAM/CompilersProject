grammar Plum;
r: program EOF;
program: 'PROGRAM' id 'BEGIN' pgm_body? 'END';
id: IDENTIFIER;
pgm_body: decl func_declarations;
decl: (string_decl decl)? | (var_decl decl)?;

/* String Declarations */
string_decl: 'STRING' id ':=' str ';';
str: STRINGLITERAL;

/* Variable Declarations */
var_decl: var_type id_list ';';
var_type: 'FLOAT' | 'INT';
any_type: var_type | 'VOID';
id_list: id id_tail;
id_tail: (','id id_tail)?;

/* Parameter Declarations */
param_decl_list: param_decl param_decl_tail?;
param_decl: var_type id;
param_decl_tail: ',' param_decl param_decl_tail;

/* Function Declarations */
func_declarations: func_decl func_declarations?;
func_decl: 'FUNCTION' any_type id '('param_decl_list?')' 'BEGIN' func_body? 'END';
func_body: decl stmt_list;

/* Statement Declarations */
stmt_list: (stmt stmt_list)?;
stmt: base_stmt | if_stmt | while_stmt;
base_stmt: assign_stmt | read_stmt | write_stmt | return_stmt;

/* Assignment Statements */
assign_stmt: assign_expr ';';
assign_expr: id ':=' expr;
read_stmt: 'READ' '(' id_list ')' ';';
write_stmt: 'WRITE' '(' id_list ')' ';';
return_stmt: 'RETURN' expr ';';

/* Expressions */
expr: expr_prefix factor;
expr_prefix: expr_recurse;
expr_recurse: (factor addop expr_recurse)?;
factor: factor_prefix postfix_expr;
factor_prefix: factor_recurse;
factor_recurse: (postfix_expr mulop factor_recurse)?;
postfix_expr: primary | call_expr;
call_expr: id '(' expr_list? ')';
expr_list: expr expr_list_tail?;
expr_list_tail: (',' expr expr_list_tail)?;
primary: '(' expr ')' | id | INTLITERAL | FLOATLITERAL;
addop: '+' | '-';
mulop: '*' | '/';

/* If Statements */
if_stmt: 'IF' '(' cond ')' decl? stmt_list? else_pre 'ENDIF';
else_pre: else_part?;
else_part: 'ELSE' decl? stmt_list?;
cond: expr compop expr;
compop: '<' | '>' | '=' | '!=' | '<=' | '>=';

/* While Statements */
while_stmt: 'WHILE' '(' cond ')' decl? stmt_list? 'ENDWHILE';

/* Tokens */
KEYWORD : 'PROGRAM'|'BEGIN'|'END'|'FUNCTION'|'READ'|'WRITE'|'IF'|'ELSE'|'ENDIF'|'WHILE'|'ENDWHILE'|'CONTINUE'|'BREAK'|'RETURN'|'INT'|'VOID'|'STRING'|'FLOAT';
OPERATOR: ':='|'+'|'-'|'*'|'/'|'='|'!='|'<'|'>'|'('|')'|';'|','|'<='|'>=';
COMMENT: '--'.*?'\n' -> skip;
IDENTIFIER: [A-z]([0-9]|[A-z])*;
STRINGLITERAL: '"'.*?'"';
FLOATLITERAL: [0-9]*'.'[0-9]+;
INTLITERAL: [0-9]+;
WS :  [ \t\r\n]+ -> skip;
