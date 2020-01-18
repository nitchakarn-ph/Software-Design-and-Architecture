package Observer;

import java.util.ArrayList;


public class WeatherData implements Subject{

	/*
	 * เราไม่สนใจว่า จะตั้งค่าตัวแปรยังไง เพราะเราจะรู้โดย  the weather data object 
	 * ซึ่งมันรู้วิธีในการรับค่าล่าสุดมาจาก the weather station
	 */
	
	/*
	 *ในนี้ Subject สามารถเรียกว่า observable พวกเราไม่ต้องการ register() ,remove()
	 * notifyObserver() methods 
	 *  เราได้ทำการสืบทอดจากแม่แล้ว
	 */
	private ArrayList observers; //เพิ่มผู้สังเกต (observer) เป็น array list
	private float temp;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<String>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i>0) {
			observers.remove(i);
		}
		
	}

	@Override
	public void notifyObserver() {
		//แจ้งเตือน
		for(int i=0;i<observers.size();i++) {
			//เปลี่ยน type ของ  observers ให้เป็น Observer เพื่อที่จะดึงข้อมูลใน ArrayList มาทำการ update ค่าใน Observer
			Observer observer = (Observer)observers.get(i);
			observer.update(temp, humidity, pressure);
		}
		
	}
	
	public void measurementsChanged() {
		//การวัดทีเปลี่ยนแปลงไป
		notifyObserver();
	}
	
	public void setMeasurements(float temp,float humidity,float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}



