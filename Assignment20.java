package assignments;

class Superclass
{
	void testcase1()
	{
		System.out.println("non static method 1");
	}
	
	void testcase2()
	{
	System.out.println("non static method 2");	
	}
	
	void testcase3()
	{
	System.out.println("non static method 3");	
	}
	
}

public class Assignment20 extends Superclass{

	void testcase4()
	{
	System.out.println("subClass non static method");	
	}
		
	public static void main(String[] args) {

		Assignment20 a = new Assignment20();
		a.testcase1();
		a.testcase2();
		a.testcase3();
		a.testcase4();		
	}
}
