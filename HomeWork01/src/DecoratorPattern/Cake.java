package DecoratorPattern;

public abstract class Cake {

	protected String nameCake = "unknow";
	
	public String getText() {
		return nameCake; //�ж١������ҧ����ǹ��Сͺ 㹤��� decorator
	}
	
	public abstract double getcost();
}
