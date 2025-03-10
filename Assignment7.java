package assignments;

//WAP to call Method Overloading
public class Assignment7 {

	static void add()
	{
		System.out.println("Non Parameterized Method");
	}
	
	static void add(double a, int b, boolean f)
	{
		System.out.println(" static Parameterized Method");
	}
	
	void add(char c)
	{
		System.out.println("Non-static Parameterized Method");
	}
		
	public static void main(String[] args) {

		Assignment7 a = new Assignment7();
		a.add('h');
		add();
		add(43345.0, 20, false);
		
	}

}
