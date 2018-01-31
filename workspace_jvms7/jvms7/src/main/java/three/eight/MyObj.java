package three.eight;

public class MyObj {
	
	int i; // An instance variable

	MyObj example() {
		MyObj o = new MyObj();
		return silly(o);
	}

	MyObj silly(MyObj o) {
		if (o != null) {
			return o;
		} else {
			return o;
		}
	}

	void setIt(int value) {
		i = value;
	}

	int getIt() {
		return i;
	}
}
