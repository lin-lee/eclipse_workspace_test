package com.six;

public class ReplateTempWithQuery {
	
	private int _quantity;
	private int _itemPrice;
	
	double getPrice(){
		return basePrice() * discountFactor();
	}
	
	private int basePrice(){
		return _quantity * _itemPrice;
	}
	private double discountFactor(){
		final double discountFactor;
		if(basePrice() > 1000)
			discountFactor = 0.95;
		else
			discountFactor = 0.98;
		return discountFactor;
	}

}
