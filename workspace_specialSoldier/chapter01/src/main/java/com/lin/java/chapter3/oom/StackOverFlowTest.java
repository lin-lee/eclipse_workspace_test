package com.lin.java.chapter3.oom;

public class StackOverFlowTest {
	
	public static void main(String [] args){
		new StackOverFlowTest().testStackOver();
	}

	public void testStackOver(){
		this.testStackOver();
	}
}
