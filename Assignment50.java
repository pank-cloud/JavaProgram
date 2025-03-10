package assignments;

//SIB and IIB
public class Assignment50 {

	public Assignment50()
	{
		this(2.5);
		System.out.println("This is a constructor");
	}
	
	public Assignment50(double a)
	{
		System.out.println("Parameterised constructor");
	}
	
	static
	{
		System.out.println("This is a code of static block 1");
	}
	
	static 
	{
		System.out.println("This is a code of static block 2");
	}
	
	static 
	{
		System.out.println("This is a code of static block 3");
	}
	
	{
		System.out.println("This is IIB block 1");
	}
	
	{
		System.out.println("This is IIB block 2");
	}
	
	public static void main(String[] args) {

	// order of execution is 
	// SIB
	// Main method
	// IIB
		
		Assignment50 an = new Assignment50();

	}

}
