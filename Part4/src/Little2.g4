grammar Little2;
r : program EOF;
program : 'PROGRAM' id 'BEGIN' pgm_body 'END';
id : IDENTIFIER;
pgm_body : decl? func_declarations?;
decl : (string_decl decl?)|(var_decl decl?);

string_decl : 'STRING' id ':=' str ';';
str : STRINGLITERAL;

var_decl : var_type id_list ';';
var_type : ('FLOAT')|('INT');
any_type : (var_type)|('VOID');
id_list : id id_tail?;
id_tail : ',' id id_tail?;

param_decl_list : (param_decl param_decl_tail?)?;
param_decl : var_type id;
param_decl_tail : ',' param_decl param_decl_tail?;

func_declarations : func_decl func_declarations?;
func_decl : 'FUNCTION' any_type id '(' param_decl_list ')' 'BEGIN' func_body 'END';
func_body : decl? stmt_list?;

stmt_list : (stmt)+;
stmt : (base_stmt)|(if_stmt)|(while_stmt);
base_stmt : (assign_stmt)|(read_stmt)|(write_stmt)|(return_stmt);

assign_stmt : assign_expr ';';
assign_expr : id ':=' expr;
read_stmt : 'READ' '(' id_list ')' ';';
write_stmt : 'WRITE' '(' id_list ')' ';';
return_stmt : 'RETURN' expr ';';

expr
    : '!' expr #bangExpr
    | '(' expr ')'  #parensExpr
    | expr ('*'|'/') expr #multdivmodExpr
    | expr ('+'|'-') expr   #addminusExpr
    | expr '&&' expr               #andExpr
    | expr '||' expr                #orExpr
    | INTLITERAL #intExpr
    | FLOATLITERAL #floatExpr
    | id         #idExpr
    ;

if_stmt : 'IF' '(' cond ')' decl? stmt_list? else_prefix 'ENDIF';
else_prefix: else_part?;
else_part : 'ELSE' decl? stmt_list?;
cond : expr compop expr;
compop : '<'|'>'|'='|'!='|'<='|'>=';

while_stmt : 'WHILE' '(' cond ')' decl? stmt_list? 'ENDWHILE';

COMMENT : '--'.*?'\n' -> skip;

STRINGLITERAL : '"'.*?'"';

KEYWORD : ('PROGRAM'|'BEGIN'|'FUNCTION'|'READ'|'WRITE'|'ELSE'|'ENDIF'|'ENDWHILE'|'CONTINUE'|'BREAK'|'RETURN'|'INT'|'VOID'|'STRING'|'FLOAT'|'END'|'IF'|'WHILE');

IDENTIFIER : [A-z]([0-9]|[A-z])*;

FLOATLITERAL : [0-9]*'.'[0-9]+;

INTLITERAL : [0-9]+;

OPERATOR : (':='|'!='|'<='|'>='|'+'|'-'|'*'|'/'|'('|')'|';'|','|'<'|'>'|'=');

WS : [ \t\r\n]+ -> skip ;