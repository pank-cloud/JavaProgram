package assignments;

import java.util.Scanner;

public class Assignment24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select 1 to launch chrome browser");
		System.out.println("Select 2 to launch firefix browser");
		System.out.println("Select 3 to launch edge browser");

		int input = sc.nextInt();
		
		switch(input)
		{
		case 1 : 
			System.out.println("Launch chrome browser");
		    break; 
			
			
		case 2 :
			System.out.println("Launch Firefox browser");
	        break;
	        
		case 3 :
			System.out.println("Launch edge browser");
			break;
			
		default :
			System.out.println("Please select the correct browser value");
			break;
	}
	}
}
