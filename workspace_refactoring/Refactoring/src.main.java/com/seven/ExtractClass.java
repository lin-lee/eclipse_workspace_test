package com.seven;

public class ExtractClass {
	private String _name;
	private TelephoneNumber _officeTelephone = new TelephoneNumber();
	
	public String getName(){
		return _name;
	}
	public String getTelephoneNumber(){
		return _officeTelephone.getTelephoneNumber();
	}
	public TelephoneNumber getTelephone() {
		return _officeTelephone;
	}
	
	
	class TelephoneNumber{
		private String _areaCode;
		private String _number;
		
		public String getTelephoneNumber(){
			return ("(" + getAreaCode() + ") ") + getNumber();
		}
		String getAreaCode(){
			return _areaCode;
		}
		void setAreaCode(String arg){
			_areaCode = arg;
		}
		public String getNumber() {
			return _number;
		}
		public void setNumber(String arg) {
			this._number = arg;
		}
	}
	
	
}
