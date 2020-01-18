package Observer;

public class WeatherStation_Main {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
		StaticsDisplay statisticsDisplay = new StaticsDisplay(weatherData);
		
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(45, 10, 15.60F);
	}

}
