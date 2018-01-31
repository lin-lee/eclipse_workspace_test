package com.six;

public class IntroduceExplainingVariable {
	
	private int _quantity;
	private double _itemPrice;

	double price(){
		return basePrice() -quantityDiscount() + shipping();
	}
	
	private double basePrice(){
		return  _quantity * _itemPrice;
	}
	private double quantityDiscount(){
		return Math.max(0, _quantity-500) * _itemPrice * 0.05;
	}
	private double shipping(){
		return Math.min(basePrice() * 0.1, 100.0);
	}
}
