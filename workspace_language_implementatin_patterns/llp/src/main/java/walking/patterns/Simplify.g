tree grammar Simplify;
options {
	tokenVocab=VecMath;
	ASTLabelType=CommonTree;
	output=AST;
	filter=true;
	backtrack=true;
}

// START: strategy
topdown : scalarVectorMult;
bottomup: zeroX | xZero ;
// END: strategy

// START: scalarVectorMult
scalarVectorMult : ^('*' INT ^(VEC (e+=.)+)) -> ^(VEC ^('*' INT $e)+)	;
// END scalarVectorMult

// START: multByZero
zeroX : ^('*' a=INT b=INT {$a.int==0}?) -> $a ;  // 0*x -> 0
xZero : ^('*' a=INT b=INT {$b.int==0}?) -> $b ;  // x*0 -> 0
// END: multByZero
