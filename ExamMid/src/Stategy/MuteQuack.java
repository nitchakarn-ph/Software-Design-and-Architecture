package Stategy;

public class MuteQuack implements QuackBehavior {

	//ประเภทเสียงร้องของเป็ด MuteQuack >> คลาสลูกของคลาสเสียงเป็ด
	@Override
	public void quack() {
		System.out.println("Mute Quack !!");
	}

}
