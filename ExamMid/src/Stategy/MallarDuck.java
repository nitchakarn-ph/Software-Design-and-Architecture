package Stategy;

public class MallarDuck extends Duck{
	
	public MallarDuck() {
		fly = new FlyWithWings(); //�ӡ�����ҧ object FlyWithWings ������ѡɳ�੾�Тͧ  Mallar Duck (��觶���繡�á�˹����)
		quack = new Quack(); //�ӡ�����ҧ object Quack ������ѡɳ�੾�Тͧ  Mallar Duck
		
		//��觷���ͧ�������èҡ��� ��� fly ��� quack �繵�����ҧ object 㹢�����ǡѹ㹤�������ӡ�����¡�� method
	}
	
	public void display() {
		System.out.println("This is Mallar Duck.");
	}
	

}
