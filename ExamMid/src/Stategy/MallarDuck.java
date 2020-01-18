package Stategy;

public class MallarDuck extends Duck{
	
	public MallarDuck() {
		fly = new FlyWithWings(); //ทำการสร้าง object FlyWithWings ซึ่งเป็นลักษณะเฉพาะของ  Mallar Duck (ซึ่งถือเป็นการกำหนดค่า)
		quack = new Quack(); //ทำการสร้าง object Quack ซึ่งเป็นลักษณะเฉพาะของ  Mallar Duck
		
		//ซึ่งทั้งสองจะใช้ตัวแปรจากแม่ คือ fly และ quack เป็นตัวสร้าง object ในขณะเดียวกันในคลาสแม่ก็ทำการเรียกใช้ method
	}
	
	public void display() {
		System.out.println("This is Mallar Duck.");
	}
	

}
