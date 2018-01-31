package com.seven;


public class InlineClass {
	private String _name;
	private String _areaCode;
	private String _number;
	
	public String getName(){
		return _name;
	}
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
