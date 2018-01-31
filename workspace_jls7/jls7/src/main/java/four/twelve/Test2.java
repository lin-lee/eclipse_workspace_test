package four.twelve;


interface Colorable {
	void setColor(byte r, byte g, byte b);
}

class Point2 {
	int x, y;
}

class ColoredPoint extends Point2 implements Colorable {
	byte r, g, b;

	public void setColor(byte rv, byte gv, byte bv) {
		r = rv;
		g = gv;
		b = bv;
	}
}

public class Test2 {
	public static void main(String[] args) {
		Point2 p = new Point2();
		ColoredPoint cp = new ColoredPoint();
		p = cp;
		Colorable c = cp;
	}
}