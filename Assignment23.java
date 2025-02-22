package assignments;

public class Assignment23 {

	public Assignment23()
	{
		this(123);
		System.out.println("Constructor overloading");
		
	}
	
	public Assignment23(int a)
	{
		this(true);
		System.out.println("Constructor overloading 1");
	}
	
	public Assignment23(boolean a)
	{
		System.out.println("Constructor overloading 2");
	}
	
	public static void main(String[] args) {

	    new Assignment23();
		
		
	}

}
