package TypeVarMembers;

public class C {
	public void mCPublic() {}

	protected void mCProtected() {}

	void mCDefault() {}

	private void mCPrivate() {}
}

interface I {
	void mI();
}

interface I2 {
	void mI2();
}

class CT extends C implements I {
	
	public void mI() {}

}

class Test {
	<T extends C & I & I2> void test(T t) {
		t.mI(); // OK
		t.mI2();
		t.mCPublic(); // OK
		t.mCProtected(); // OK
		t.mCDefault(); // OK
		t.mCPrivate(); // Compile-time error
	}
}
