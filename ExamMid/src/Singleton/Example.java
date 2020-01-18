package Singleton;

public class Example {
	
	public void printFirstNameUser() {
		System.out.println(UserData.getInstance().getFirstName());
	}
	
	public void printLastNameUser() {
		System.out.println(UserData.getInstance().getLastName());
	}
}
