package Observer.weather;

import Observer.weather.impl.CurrentConditionsDisplay;
import Observer.weather.impl.ForecastDisplay;
import Observer.weather.impl.HeatIndexDisplay;
import Observer.weather.impl.StatisticsDisplay;
import Observer.weather.impl.WeatherData;

public class WeatherStation {
	
	public static void main(String [] args){
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay =
				new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = 
				new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay =
				new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay =
				new HeatIndexDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		System.out.println("====================");
		weatherData.setMeasurements(82, 70, 29.2f);
		System.out.println("====================");
		weatherData.setMeasurements(78, 90, 29.2f);
	}

}
