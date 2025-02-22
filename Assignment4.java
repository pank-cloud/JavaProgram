package assignments;

//WAP to call non  static methods in main method
public class Assignment4 {
int d  = 10;
	void testcase1()
	{
		System.out.println("login");
	}
	
	void testcase2()
	{
		System.out.println("Search");
	}
	
	public static void main(String[] args) {

		Assignment4 a = new Assignment4();
		int z = a.d;
		System.out.println(z);
		a.testcase1();
		a.testcase2();		
	}

}
