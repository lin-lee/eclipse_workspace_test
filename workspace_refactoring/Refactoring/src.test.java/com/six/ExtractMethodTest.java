package com.six;

import org.junit.Test;

public class ExtractMethodTest {
	@Test
	public void testPrintOwing(){
		ExtractMethod extractMethod = new ExtractMethod();
		extractMethod.printOwing(0.0d);
	}

}
