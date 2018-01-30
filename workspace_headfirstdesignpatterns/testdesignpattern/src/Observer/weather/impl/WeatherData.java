package Observer.weather.impl;

import java.util.ArrayList;

import Observer.weather.inter.Observer;
import Observer.weather.inter.Subject;

public class WeatherData implements Subject {

	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		observers = new ArrayList<Observer>();
	}
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i >= 0)
			observers.remove(i);
	}

	@Override
	public void notifyObservers() {
		for(int i=0; i<observers.size(); i++){
			Observer observer = observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	//当从气象站得到更新观察值时，我们通知观察者
	public void measurementsChanged(){
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
