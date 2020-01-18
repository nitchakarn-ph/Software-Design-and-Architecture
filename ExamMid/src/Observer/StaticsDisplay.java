package Observer;

public class StaticsDisplay implements Observer , Display{

	private float temp;
	private float humidity;
	private Subject weather;
	
	public StaticsDisplay(Subject weather) {
		this.weather = weather;
		weather.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("display statics");
		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		display();
		
	}
}
