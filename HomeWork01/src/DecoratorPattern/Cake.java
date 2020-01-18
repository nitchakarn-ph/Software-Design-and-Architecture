package DecoratorPattern;

public abstract class Cake {

	protected String nameCake = "unknow";
	
	public String getText() {
		return nameCake; //จะถูกนำไปสร้างเป็นส่วนประกอบ ในคลาส decorator
	}
	
	public abstract double getcost();
}
