grammar VecMath;

// START: stat
statlist	: stat+	;
stat		: ID '=' expr
			| 'print' expr
			;
// END: stat

// START: expr			
expr		: multExpr ('+' multExpr)*	;
multExpr	: primary (('*' | '.') primary)*	;
primary		: INT
			| ID
			| '[' expr (',' expr)* ']'
			;	
// END: expr

ID	: 'a'..'z'+	;
INT : '0'..'9'+ ;
WS	: (' '|'\r'|'\n')+ {skip(); }	;				