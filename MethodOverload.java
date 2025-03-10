package javaTopics;

public class MethodOverload {

	static void add()
	{
		System.out.println();
	}
	
	static void add(double a, double b)
	{
		System.out.println("Parameterised Method");
		double sum = a + b;
		System.out.println(sum);
	}
	
	static void add(long a)
	{
		System.out.println("long data type " +a);
	}
	
	void add(boolean a)
	{
		System.out.println("boolean data type - " +a);
	}
	
	public static void main(String[] args)
	{
		MethodOverload mo = new MethodOverload();
		add();
		add(32, 43);			
		add(981239021);
		mo.add(true);
	}

}
