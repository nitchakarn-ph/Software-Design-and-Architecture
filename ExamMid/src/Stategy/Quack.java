package Stategy;

public class Quack implements QuackBehavior {

	//ประเภทเสียงร้องของเป็ด Quack >> คลาสลูกของคลาสเสียงเป็ด
	@Override
	public void quack() {
		System.out.println("Quack !!!");

	}

}
