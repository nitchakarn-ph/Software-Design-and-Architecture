package Decorators;

public abstract class Beverage {
	//����ͧ����
	String description = ""; //�ѡɳТͧ����ͧ����
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
