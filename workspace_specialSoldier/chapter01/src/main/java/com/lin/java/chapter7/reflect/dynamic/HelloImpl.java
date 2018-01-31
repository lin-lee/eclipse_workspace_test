package com.lin.java.chapter7.reflect.dynamic;

public class HelloImpl implements HelloInterface , HelloInterface2 {

	private volatile String infos1;

	private volatile String infos2;

	public String getInfos1() {
		return infos1;
	}

	public String getInfos2() {
		return infos2;
	}
	@Override
	public void setInfo(String infos1, String infos2) {
		this.infos1 = infos1;
		this.infos2 = infos2;
		this.display();
	}

	public void display() {
		System.out.println("\t\t" + infos1 + "\t" + infos2);
	}
	
	public void test() {
		
	}
}
