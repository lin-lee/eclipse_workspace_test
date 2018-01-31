package twelve.five;

class Point {
	int x, y;

	Point() {
		x = 1;
		y = 1;
	}
}

class ColoredPoint extends Point {
	int color = 0xFF00FF;
	
	public ColoredPoint(){
		super.x = 3;
		System.out.println(this.x);
	}
}

public class Test {
	public static void main(String[] args) {
		ColoredPoint cp = new ColoredPoint();
		//cp.x = 2;
		System.out.println("x="+cp.x+",y="+cp.y);
		System.out.println(cp.color);
	}
}
