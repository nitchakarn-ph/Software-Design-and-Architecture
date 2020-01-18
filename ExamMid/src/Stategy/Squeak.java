package Stategy;

public class Squeak implements QuackBehavior {

	//ประเภทเสียงร้องของเป็ด squeak >> คลาสลูกของคลาสเสียงเป็ด
	@Override
	public void quack() {
		System.out.println("Squeak !!");

	}

}
