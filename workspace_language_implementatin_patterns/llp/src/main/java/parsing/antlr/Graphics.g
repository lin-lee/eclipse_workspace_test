

//START: grammar
grammar Graphics;

file : command+ ;
command : 'line' 'from' point 'to' point ;
point : INT ',' INT ;

//END: grammar

//START: lex
INT : '0'..'9'+ ;
WS : (' ' | '\t' | '\r' | '\n'){skip();} ;
//END: lex