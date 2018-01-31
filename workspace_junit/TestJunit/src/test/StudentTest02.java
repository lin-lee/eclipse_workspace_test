package test;

import junit.framework.TestCase;

import com.Student;

public class StudentTest02 extends TestCase{
	
	private Student testStudent;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		testStudent = new Student("steven_hu", "boy", 170, 23, "上海理工");
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testSetAge(){
		assertTrue(testStudent.setAge(21));
	}
	
	public void testGetSchool(){
		assertEquals("南昌大学", testStudent.getSchool());
	}
	
	public void testGetName(){
		assertEquals("hdy", testStudent.getName());
	}

}
