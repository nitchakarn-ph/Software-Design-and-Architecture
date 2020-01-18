package Observer;

public class CurrentConditionDisplay implements Observer, Display {
	//แสดงองค์ประกอบของ weather data object
	
	private float temp;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionDisplay(Subject weaterData) {
		//เพื่อเรียกใช้ register ของ  observer โดยการเรียกผ่าน Subject
		this.weatherData = weaterData;
		weaterData.registerObserver(this);
				
	}
	@Override
	public void display() {
		System.out.println("Current condition : "+ temp + "F degree and "+ humidity + "% humidity");

	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		display();
	}

}
