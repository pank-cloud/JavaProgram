package javaTopics;

    class Parent_Class 
    {
    	
       void login()
	  {
    	 
		System.out.println("Login with EmailID");
	  }
    }

public class Method_Overriding extends Parent_Class
{
	
	   void login()
	{
		super.login();
		System.out.println("login with mobile number");

	}
	   
	   static void abc()
	   {
		   int a  =  10;
		   a=5;
		   System.out.println(a);
	   }
	   
	   
	     void abcd()
	   {
		   int a  =  10;
		   a=5;
		   System.out.println(a);
	   }
	
	public static void main(String[] args) 	
	{
		Method_Overriding mo = new Method_Overriding();
		mo.login();
		abc();
		
	}

}
