tree grammar Reduce;
options{
	tokenVocab=VecMath;
	ASTLabelType=CommonTree;
	output=AST;
	filter=true;
	backtrack=true;
}
// START: strategy
bottomup
	:	xPlusx
	|	multBy2
	|	combineShifts
	;
// END: strategy

// START: xPlusx
xPlusx : ^('+' i=INT j=INT {$i.int==$j.int}?) -> ^(MULT["*"] INT["2"] $j)	;
// END: xPlusx

//
multBy2
		: ^('*' x=INT {$x.int==2}? y=.) -> ^(SHIFT["<<"] $y INT["1"])
		| ^('*' a=.	b=INT {$b.int==2}?) -> ^(SHIFT["<<"] $a INT["1"])
		;
		
combineShifts		//x<<n<<m to be x<<(n+m)
		: ^(SHIFT ^(SHIFT e=. n=INT) m=INT) -> ^(SHIFT["<<"] $e INT[String.valueOf($n.int+$m.int)])
		;