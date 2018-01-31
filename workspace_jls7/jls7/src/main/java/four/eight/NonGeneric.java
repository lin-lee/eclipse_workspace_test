package four.eight;

import java.util.*;

public class NonGeneric {
	Collection<Number> myNumbers() {
		return null;
	}
}

abstract class RawMembers<T> extends NonGeneric implements Collection<String> {
	static Collection<NonGeneric> cng = new ArrayList<NonGeneric>();

	public static void main(String[] args) {
		RawMembers rw = null;
		Collection<Number> cn = rw.myNumbers();
		// OK
		Iterator<String> is = rw.iterator();
		// Unchecked warning
		Collection<NonGeneric> cnn = rw.cng;
		// OK, static member
	}
}