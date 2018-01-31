public class Circle {
	private double radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public double getArea() {
		return 3.1415 * radius * radius;
	}

	public static double getAreaFromRadius(int radius) {
		Circle c = new Circle(radius);
		return c.getArea();
	}
	static int areas[] = new int[0x10000];
	static int radii[] = new int[0x10000];
	static java.util.Random r = new java.util.Random();
	static int MAX_ITERATIONS = 1000;

	public static void gen() {
		for (int i = 0; i < areas.length; i++) {
			areas[i] = (int) getAreaFromRadius(radii[i]);
		}
	}

	public static void main(String args[]) {
		for (int i = 0; i < radii.length; i++) {
			radii[i] = r.nextInt();
		}
		for (int i = 0; i < MAX_ITERATIONS; i++) {
			gen(); // avoid on stack replacement problems
		}
	}
}