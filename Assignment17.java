package assignments;

//WAP to update a global variable in static & non-static method.

public class Assignment17 {

	int a = 40;
	
	static void add()
	{
		
		Assignment17 asgn = new Assignment17();		
		asgn.a = 10;  // updating the global variable in static method	 	  
		int b = 20;
		
		System.out.println(asgn.a+b);		
	}
	
	void sub()
	{
		a = 100;  // updating the global variable in non static method
		int b = 300;
		System.out.println(b-a);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment17 a17 = new Assignment17();
		add();
        a17.sub();
	}

}
