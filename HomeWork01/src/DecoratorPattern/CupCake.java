package DecoratorPattern;

public class CupCake extends Cake {

	public CupCake() {
		nameCake = "CupCake";
	}
	
	public String getText() {
		return nameCake; // ���ѧ�ѡɳТͧ cake ����ժ������ cup cake 
	}
	
	@Override
	public double getcost() {
		return 15;
	}

}
