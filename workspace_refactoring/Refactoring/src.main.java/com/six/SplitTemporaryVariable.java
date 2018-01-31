package com.six;

public class SplitTemporaryVariable {
	
	private double _primaryForce;
	private double _secondaryForce;
	private double _mass;
	private int _delay;
	
	double getDistanceTravelled(int time){
		final double primaryAcc = _primaryForce / _mass;
		int primaryTime = Math.min(time, _delay);
		double result = 0.5 * primaryAcc * primaryTime * primaryTime;
		int secondaryTime = time - _delay;
		if(secondaryTime > 0){
			double primaryVel = primaryAcc * _delay;
			final double secondAcc = (_primaryForce + _secondaryForce) / _mass;
			result += primaryVel * secondaryTime + 0.5 * secondAcc * secondaryTime * secondaryTime;
		}
		return result;
	}

}
