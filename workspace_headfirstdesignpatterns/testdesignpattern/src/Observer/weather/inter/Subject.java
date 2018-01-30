package Observer.weather.inter;

public interface Subject {
	
	public void registerObserver(Observer o);
	
	public void removeObserver(Observer o);
	
	public void notifyObservers();

}
