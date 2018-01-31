package five.two;

import java.io.Serializable;


class Point2 {
	int x, y;
}

class ColoredPoint2 extends Point2 {
	int color;
}

public class Test4 {
	public static void main(String[] args) {
		long[] veclong = new long[100];
		//An array can be assigned only to a variable of a compatible
		//array type, or to a variable of type Object, Cloneable or java.io.Serializable
		Object o = veclong; // okay
		Serializable s = veclong;
		Cloneable c = veclong;
		
		Long l = veclong; // compile-time error
		short[] vecshort = veclong; // compile-time error
		Point2[] pvec = new Point2[100];
		ColoredPoint2[] cpvec = new ColoredPoint2[100];
		pvec = cpvec; // okay
		pvec[0] = new Point2(); // okay at compile time,
		// but would throw an
		// exception at run time
		cpvec = pvec; // compile-time error
	}
}