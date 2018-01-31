package test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTest {
	
	public static Test suite(){
		TestSuite suite = new TestSuite("Test for test");
		
		suite.addTestSuite(StudentTest01.class);
		suite.addTestSuite(StudentTest02.class);
		return suite;
	}

}
