package assignments;

import java.util.Scanner;

/*WAP to calculate Area and Circumference for 
Square, Triangle, Rectangle and Circle using scanner class*/
public class Assignment6 {

	static void Square(int a) {
		int area = a * a;
		int circumference = 4 * a;

		System.out.println(area);
		System.out.println(circumference);
	}

	static void Triangle(int a, int b, int c, int h) {
		double area = 0.5 * b * h;
		int circumference = a + b + c;
		System.out.println(area);
		System.out.println(circumference);
	}

	static void Rectangle(int a, int b)
	{
		int area = a * b;
		int circumference = 2*(a + b);
				
	    System.out.println(area);
		System.out.println(circumference);
	}
	
	  static void Circle(double r)
	  {
		  double area = (Math.PI)*r*r;
		  double circumference = 2*(Math.PI)*r;
		  
		  System.out.println(area);
		  System.out.println(circumference);
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int val1 = sc.nextInt();
		Square(val1);
		
		int val2 = sc.nextInt();
		int val3 = sc.nextInt();
		int val4 = sc.nextInt();
		int val5 = sc.nextInt();
		
		Triangle(val2, val3, val4, val5);
		
		int val6 = sc.nextInt();
		int val7 = sc.nextInt();		
		
		Rectangle(val6, val7);
		
		double val8 = sc.nextDouble();
		Circle(val8);
	}
}
