package Project;

public class Book {
	
	private String name;
	private Integer price;
	private Integer quantity;
	private Integer uniqueID;
	//�зӡ�� increment �������� ��������ҡ 1 .... ��Ф�Ҩ�����Ѻ�ҫ��
	//��ҷ������繤����������
	private static int count = 0; 
	
	public Book(String name,Integer price,int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.uniqueID = count++;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public Integer getPrice() {
		return this.price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Integer getQuantity() {
		return this.quantity;
	}
	
	public void setUniqueID(int uniqueID) {
		this.uniqueID = uniqueID;
	}
	
	public Integer getUniqueID() {
		return this.uniqueID;
	}
	
	public void changQuatity(int changeNumber) {
		this.quantity += changeNumber;
	}
	
}
