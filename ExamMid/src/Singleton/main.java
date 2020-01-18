package Singleton;

public class main {

	public static void main(String[] args) {
		
		//init value
		UserData userData = UserData.getInstance();
		userData.setFirstName("paw");
		userData.setLastName("scarlet");
		
		Example example  = new Example();
		example.printFirstNameUser();
		example.printLastNameUser();
	}
}
