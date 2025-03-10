package javaTopics;

//here child class inherit properties of parent class.

class parent
{
	static void login()
	{
		System.out.println("login to amazon");
	}
	
}

public class Single_level extends parent{


	void logout()
	{
		System.out.println("logout from amazon");
	}
	
	public static void main(String[] args) {
		
		login();
		Single_level sl = new Single_level();
		sl.logout();

	}

}
