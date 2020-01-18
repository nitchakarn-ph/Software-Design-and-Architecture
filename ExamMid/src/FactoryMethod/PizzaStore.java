package FactoryMethod;

public abstract class PizzaStore {

	//ต้องทำการอ้างถึงโรงงาน
	
	/*FactoryPizza factory;
	
	public PizzaStore(FactoryPizza factory) {
		this.factory = factory;
	}
	*/
	//ลองเปลี่ยนมาใช้เป็น abstract method เพราะเราต้องการทำการแยกสาขาของร้าน pizza 
	//ซึ่งแต่ละร้านจะมีวิธีในการสร้าง pizza แตกต่างกัน
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
