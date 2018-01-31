package test;

import com.Student;

import junit.framework.TestCase;

public class StudentTest01 extends TestCase {
	
	Student testStudent;
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		testStudent = new Student("djm", "boy", 178, 24, "华东政法");
		System.out.println("setUp()");
	}
	
	@Override
	protected void tearDown() throws Exception{
		super.tearDown();
		System.out.println("tearDown()");
	}
	
	public void testGetSex(){
		assertEquals("boy1", testStudent.getSex());
		System.out.println("testGetSex()");
	}
	
	public void testGetAge(){
		assertEquals(24, testStudent.getAge());
		System.out.println("testGetAge()");
	}

}
