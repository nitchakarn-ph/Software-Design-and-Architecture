package Observer;

import java.util.ArrayList;


public class WeatherData implements Subject{

	/*
	 * ������ʹ���� �е�駤�ҵ�����ѧ� ������Ҩ������  the weather data object 
	 * ����ѹ����Ը�㹡���Ѻ�������ش�Ҩҡ the weather station
	 */
	
	/*
	 *㹹�� Subject ����ö���¡��� observable �ǡ�������ͧ��� register() ,remove()
	 * notifyObserver() methods 
	 *  �����ӡ���׺�ʹ�ҡ�������
	 */
	private ArrayList observers; //��������ѧࡵ (observer) �� array list
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
		//����͹
		for(int i=0;i<observers.size();i++) {
			//����¹ type �ͧ  observers ����� Observer ���ͷ��д֧������� ArrayList �ҷӡ�� update ���� Observer
			Observer observer = (Observer)observers.get(i);
			observer.update(temp, humidity, pressure);
		}
		
	}
	
	public void measurementsChanged() {
		//����Ѵ������¹�ŧ�
		notifyObserver();
	}
	
	public void setMeasurements(float temp,float humidity,float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}



