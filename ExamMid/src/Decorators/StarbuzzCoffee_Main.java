package Decorators;

public class StarbuzzCoffee_Main {

	public static void main(String[] args) {
		Beverage beverage = new DarkRoast();
		System.out.println(beverage.getDescription());//ชื่อส่วนผสมเริ่มต้น
		System.out.println(beverage.cost()); //ราคาเริ่มต้น
	
		//เพิ่มส่วนผสม
		beverage = new Mocha(beverage);
		beverage = new Whip(beverage);
		System.out.println("เพิ่ม ส่วนผสม ");
		System.out.println(beverage.getDescription());
		System.out.println("new price");
		System.out.println(beverage.cost());
		
		
		
	}

}
