package com;

public class Test {
	public static void main(String [] args){
		PFTMXClient c = new PFTMXClient();
		String a = c.getPFTMXPort().get_Performance_And_Seats(
				"test1", "jjl4yk11f82ce6c0f33a5c003f2fec56", "20150316102435", "20150425102435");
		System.out.println(a);
	}
}
