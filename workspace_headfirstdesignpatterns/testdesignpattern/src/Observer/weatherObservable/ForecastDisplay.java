package Observer.weatherObservable;

import java.util.Observable;
import java.util.Observer;

import Observer.weather.inter.DisplayElement;

public class ForecastDisplay implements Observer, DisplayElement {
	
	private float currentPressure = 29.92f;
	private float lastPressure;
	public ForecastDisplay(Observable observable){
		observable.addObserver(this);
	}
	@Override
	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

	@Override
	public void update(Observable observable, Object arg) {
		// TODO Auto-generated method stub
		if(observable instanceof WeatherData){
			WeatherData weatherData = (WeatherData) observable;
			lastPressure = currentPressure;
			currentPressure = weatherData.getPressure();
			display();
		}
		
	}

}
