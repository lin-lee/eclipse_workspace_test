package com.six;

import java.util.Enumeration;
import java.util.Vector;

public class ExtractMethod {
	
	private Vector<Order> _orders = new Vector<Order>();
	private String _name;
	
	void printOwing(double amount){

		printBanner();
		double outstanding = getOutstanding();	
		printDetails(outstanding);
	}
	
	void printBanner(){
		System.out.println("*******************");
		System.out.println("****** Customer Owes *******");
		System.out.println("********************");
	}
	void printDetails(double outstanding){
		System.out.println("name:" + _name);
		System.out.println("amount:" + outstanding);
	}
	double getOutstanding(){
		Enumeration<Order> e = _orders.elements();
		double result = 0.0;
		while(e.hasMoreElements()){
			Order each = e.nextElement();
			result += each.getAmount();
		}
		return result;
	}
	
	class Order{
		private double amount;
		private String name;
		public double getAmount() {
			return amount;
		}
		public String getName() {
			return name;
		}
	}

}
