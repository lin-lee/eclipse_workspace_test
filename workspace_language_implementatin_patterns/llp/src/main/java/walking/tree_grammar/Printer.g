// START: header
tree grammar Printer;
options {
	tokenVocab=VecMath;
	ASTLabelType=CommonTree;
}
@members { void print(String s){ System.out.print(s); } }
// END header

// START: prog
prog	: stat+ ;
stat	: ^('=' ID {print($ID.text+" = ");} expr) {print("\n");}
		| ^('print' {print("print ");}  expr) {print("\n"); }	
		;
// END prog

// START: expr	
expr	: ^('+' expr {print("+");} expr)
		| ^('*' expr {print("*");} expr)
		| ^('.' expr {print(".");} expr)
		| ^(VEC {print("[");} expr ({print(", ");} expr)* {print("]");})
		| INT {print($INT.text);}
		| ID {print($ID.text); }
		;		
		
// END: expr