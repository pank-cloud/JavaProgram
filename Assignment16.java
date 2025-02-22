package assignments;

//WAP to update a local variable in static & non-static method.

public class Assignment16 {
	
	static void add()
	{
		int a = 20;
		int b = 30;
		
		b = 200; //updating a local variable in static method
		
		int c = a+b;
		System.out.println(c);
		
	}
	
	void sub()
	{
		int a = 10; 
		int b = 20;
		
		a=80;   //updating a local variable in non static method
				
		int c = a-b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		Assignment16  a = new Assignment16();
		add();
		a.sub();

	}

}
