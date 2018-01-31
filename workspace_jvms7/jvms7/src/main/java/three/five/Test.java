package three.five;

public class Test {
	
	void whileInt() {
		int i = 0;
		while (i < 100) {
			i++;
		}
	}
	
	void whileDouble() {
		double i = 0.0;
		while (i < 100.1) {
			i++;
		}
	}
	
	int lessThan100(double d) {
		if (d < 100.0) {
			return 1;
		} else {
			return -1;
		}
	}
	
	int greaterThan100(double d) {
		if (d > 100.0) {
			return 1;
		} else {
			return -1;
		}
	}

}
