package com.eight;

import java.util.Collection;
import java.util.Iterator;

public class ReplaceDataValueWithObject {
	
	private static int numberOfOrdersFor(Collection<Order> orders, String customer){
		int result = 0;
		Iterator<Order> iterator = orders.iterator();
		while(iterator.hasNext()){
			Order each = iterator.next();
			if(each.getCustomerName().equals(customer))
				result++;
		}
		return result;
	}
	
	class Order{
		private Customer _customer;
		
		public Order(String customer){
			_customer = new Customer(customer);
		}

		public String getCustomerName() {
			return _customer.getName();
		}

		public void setCustomer(String arg) {
			this._customer = new Customer(arg);
		}
	}
	
	class Customer{
		private final String _name;
		public Customer(String name){
			_name = name;
		}
		public String getName(){
			return _name;
		}
	}

}
