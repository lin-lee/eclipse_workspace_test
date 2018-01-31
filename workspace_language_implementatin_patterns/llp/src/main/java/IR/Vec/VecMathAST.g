// START: header
grammar VecMathAST	;
options {output=AST ; }
tokens {VEC ; }		//define imaginary token for vector literal
// END: header

// START: stat
statlist	: stat+	;
stat	: ID '=' expr -> ^('=' ID expr)
		| 'print' expr -> ^('print' expr)
		;
// END: stat

// START: expr		
expr	: multExpr ('+'^ multExpr)*	;
multExpr: primary (('*'^ | '.'^) primary)* ;
primary : INT
		| ID
		| '[' expr (',' expr)* ']' -> ^(VEC expr+)
		;
// END: expr

ID		: 'a'..'z'+	;
INT		: '0'..'9'+	;
WS		: (' '|'\r'|'\n')+ {skip(); } ;		