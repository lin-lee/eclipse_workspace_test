package Observer.weather.inter;

public interface Observer {
	
	public void update(float temp, float humidity, float pressure);

}
