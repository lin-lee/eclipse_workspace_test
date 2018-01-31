package com.movie;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
	
	private String _name;
	private Vector<Rental> _rentals = new Vector<Rental>();
	
	public Customer(String name){
		this._name = name;
	}
	
	public void addRental(Rental arg){
		this._rentals.addElement(arg);
	}
	
	public String getName(){
		return _name;
	}
	
	public String statement(){
		Enumeration<Rental> rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while(rentals.hasMoreElements()){
			Rental each = rentals.nextElement();
			result += "\t" + each.getMovie().getTitle() + "\t" +
					String.valueOf(each.getCharge()) + "\n";
		}
		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(getTotalFrequestRenterPoints()) +
				" frequest renter points";
		return result;
	}
	
	public String htmlstatement(){
		Enumeration<Rental> rentals = _rentals.elements();
		String result = "<H1>Rental Record for<EM>" + getName() + "</EM></H1><P>\n";
		while(rentals.hasMoreElements()){
			Rental each = rentals.nextElement();
			result += each.getMovie().getTitle() + ": " +
					String.valueOf(each.getCharge()) + "<BR>\n";
		}
		result += "<P>Amount owed is <EM>" + String.valueOf(getTotalCharge()) + "</EM><P>\n";
		result += "You earned <EM>" + String.valueOf(getTotalFrequestRenterPoints()) +
				" </EM>frequest renter points<P>";
		return result;
	}
	
	private double getTotalCharge(){
		double result = 0;
		Enumeration<Rental> rentals = _rentals.elements();
		while(rentals.hasMoreElements()){
			Rental each = rentals.nextElement();
			result += each.getCharge();
		}
		return result;
	}
	
	private int getTotalFrequestRenterPoints(){
		int result = 0;
		Enumeration<Rental> rentals = _rentals.elements();
		while(rentals.hasMoreElements()){
			Rental each = rentals.nextElement();
			result += each.getFrequestRenterPoints();
		}
		return result;
	}
	

}
