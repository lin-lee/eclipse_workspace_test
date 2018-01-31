package com.eight;

public class SelfEncapsulateField {
	private int _low, _high;
	
	SelfEncapsulateField(int low, int high){
		_low = low;
		_high = high;
	}
	boolean includes(int arg){
		return arg >= getLow() && arg <= getHigh();
	}
	void grow(int factor){
		setHigh(getHigh() * factor);
	}
	public int getLow() {
		return _low;
	}
	public void setLow(int arg) {
		this._low = arg;
	}
	public int getHigh() {
		return _high;
	}
	public void setHigh(int arg) {
		this._high = arg;
	}

}

class CappedRange extends SelfEncapsulateField{
	private int _cap;
	CappedRange(int low, int high, int cap) {
		super(low, high);
		_cap = cap;
	}
	
	int getCap(){
		return _cap;
	}
	@Override
	public int getHigh(){
		return Math.min(super.getHigh(), getCap());
	}
	
}
