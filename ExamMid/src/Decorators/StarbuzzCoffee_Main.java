package Decorators;

public class StarbuzzCoffee_Main {

	public static void main(String[] args) {
		Beverage beverage = new DarkRoast();
		System.out.println(beverage.getDescription());//������ǹ����������
		System.out.println(beverage.cost()); //�Ҥ��������
	
		//������ǹ���
		beverage = new Mocha(beverage);
		beverage = new Whip(beverage);
		System.out.println("���� ��ǹ��� ");
		System.out.println(beverage.getDescription());
		System.out.println("new price");
		System.out.println(beverage.cost());
		
		
		
	}

}
