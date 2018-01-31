package com.seven;

public class RemoveMiddleMan {
	public void test(){
		Person john = new Person();
		Person manager = john.getDepartment().getManager();
		
		Person manager2 = john.getManager();
	}
	
	class Person{
		Department _department;
		
		public Department getDepartment(){
			return _department;
		}	
		public Person getManager(){
			return _department.getManager();
		}
	}

	class Department{
		private String _chargeCode;
		private Person _manager;
		
		public Department(Person manager){
			_manager = manager;
		}
		public Person getManager(){
			return _manager;
		}
		public String getChargeCode() {
			return _chargeCode;
		}
		public void setChargeCode(String arg) {
			this._chargeCode = arg;
		}

	}
}


