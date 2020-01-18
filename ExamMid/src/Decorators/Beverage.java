package Decorators;

public abstract class Beverage {
	//เครื่องดื่ม
	String description = ""; //ลักษณะของเครื่องดื่ม
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
