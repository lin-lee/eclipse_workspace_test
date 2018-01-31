package com.six;

import java.util.Date;

public class RemoveAssignmentsToParameters {
	
	int discount(final int inputVal, final int quantity, final int yearToDate){
		int result = inputVal;
		if(inputVal > 50)
			result -= 2;
		if(quantity > 100)
			result -= 1;
		if(yearToDate > 10000)
			result -= 4;
		return result;
	}
	
	public static void main(String [] args){
		int x = 5;
		triple(x);
		System.out.println("x after triple:" + x);
		
		Date d1 = new Date("1 Apr 98");
		nextDateUpdate(d1);
		System.out.println("d1 after nextDay: " + d1);
		
		Date d2 = new Date("1 Apr 98");
		nextDateReplace(d2);
		System.out.println("d2 after nextDay: " + d2);
	}
	
	private static void triple(int arg){
		arg = arg * 3;
		System.out.println("arg in triple: " + arg);
	}
	private static void nextDateUpdate(Date arg){
		arg.setDate(arg.getDate() + 1);
		System.out.println("arg in nextDay: " + arg);
	}
	private static void nextDateReplace(Date arg){
		arg = new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 1);
		System.out.println("arg in nextDay: " + arg);
	}
	

}
