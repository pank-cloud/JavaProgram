package assignments;

//WAP to implement super calling statement (parameterized and non parameterized) 

	class Parent
	{
		public Parent()
		{	
			System.out.println("Parent class Non parameterised constructor");
		}
		
		public Parent(int a)
		{
			System.out.println("Parent class parameterised constructor");
		}
		
	}
	
		public class Assignment22 extends Parent{
	
		public Assignment22()
		{
			
			System.out.println("non parameterised constructor");
		}
		
		public Assignment22(String a)
		{
			super(123);
			System.out.println("parameterised constructor");
		}
			
		public static void main(String[] args) {
			
		new Assignment22();
		new Assignment22("abc");
		
	}

} 


