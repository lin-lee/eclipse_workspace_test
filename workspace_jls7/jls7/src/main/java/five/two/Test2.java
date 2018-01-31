package five.two;

class Point {
	int x, y;
}

class Point3D extends Point {
	int z;
}

interface Colorable {
	void setColor(int color);
}

class ColoredPoint extends Point implements Colorable {
	int color;

	public void setColor(int color) {
		this.color = color;
	}
}

public class Test2 {
	public static void main(String[] args) {
		// Assignments to variables of class type:
		Point p = new Point();
		p = new Point3D();
		// OK because Point3D is a subclass of Point
		Point3D p3d = p;
		// Error: will require a cast because a Point
		// might not be a Point3D (even though it is,
		// dynamically, in this example.)
		// Assignments to variables of type Object:
		Object o = p; // OK: any object to Object
		int[] a = new int[3];
		Object o2 = a; // OK: an array to Object
		// Assignments to variables of interface type:
		ColoredPoint cp = new ColoredPoint();
		Colorable c = cp;

		// OK: ColoredPoint implements Colorable
		// Assignments to variables of array type:
		byte[] b = new byte[4];
		a = b;
		// Error: these are not arrays of the same primitive type
		Point3D[] p3da = new Point3D[3];
		Point[] pa = p3da;
		// OK: since we can assign a Point3D to a Point
		p3da = pa;
		// Error: (cast needed) since a Point
		// can't be assigned to a Point3D
	}
}