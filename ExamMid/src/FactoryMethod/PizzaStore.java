package FactoryMethod;

public abstract class PizzaStore {

	//��ͧ�ӡ����ҧ�֧�ç�ҹ
	
	/*FactoryPizza factory;
	
	public PizzaStore(FactoryPizza factory) {
		this.factory = factory;
	}
	*/
	//�ͧ����¹������ abstract method ������ҵ�ͧ��÷ӡ���¡�ҢҢͧ��ҹ pizza 
	//���������ҹ�����Ը�㹡�����ҧ pizza ᵡ��ҧ�ѹ
	public abstract Pizza createPizza(String type);
	
	public Pizza orderPizza(String type) {
		Pizza pizza = null;
		
		//pizza = factory.createPizza(type);
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
}
