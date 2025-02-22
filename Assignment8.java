package assignments;

//WAP to call Constructor Overloading
public class Assignment8 {

	Assignment8()
	{
		System.out.println("Default Constructor");
	}
	
	Assignment8(int a)
	{
		System.out.println("Parameterized Constructor");
	}
	
	Assignment8(double b)
	{
	   System.out.println("Parameterized Constructor");
	}
	
	Assignment8(boolean a, char c)
	{
		System.out.println("Parameterized Constructor");
	}

	public static void main(String[] args) {

		new Assignment8();
		new Assignment8(19);
		new Assignment8(24.6);
		new Assignment8(true, 'a');		
	}

}
