package three.seven;
	
class Near {
	int it;

	public int getItNear() {
		return getIt();
	}

	private int getIt() {
		return it;
	}
}

public class Far extends Near {
	int getItFar() {
		return super.getItNear();
	}
}

