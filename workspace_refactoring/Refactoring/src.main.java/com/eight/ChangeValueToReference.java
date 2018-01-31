package com.eight;

import java.util.Collection;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Iterator;

public class ChangeValueToReference {
	
	static int numberOfOrdersFor(Collection<Order> orders, String customer){
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
			_customer = Customer.getNamed(customer);
		}

		public String getCustomerName() {
			return _customer.getName();
		}

		public void setCustomer(String arg) {
			this._customer = Customer.getNamed(arg);
		}
	}
	
	
}
class Customer{
	private final String _name;
	private static final Dictionary<String, Customer> _instances =
			new Hashtable<String, Customer>();
	private Customer(String name){
		_name = name;
	}
	static void loadCustomer(){
		new Customer("Lemon Car Hire").store();
		new Customer("Associated Coffee Machines").store();
		new Customer("Bilston Gasworks").store();
	}
	private void store(){
		_instances.put(this.getName(), this);
	}
	public String getName(){
		return _name;
	}
	public static Customer getNamed(String name){
		return _instances.get(name);
	}
}

