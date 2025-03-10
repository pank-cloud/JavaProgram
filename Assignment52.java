package assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

//Exception Handling using try,catch and finally

public class Assignment52 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try
		{
	    System.out.println("Enter the size of the array");
		int arr[] = new int[sc.nextInt()];
		}
		
		catch(NegativeArraySizeException e1)
		{
			System.out.println("Handled the negative value of array size");
			System.out.println("Enter any positive value of array length");
			sc.nextLine();   // To reset input
			int arr[] = new int[sc.nextInt()];
		}
		
		catch(InputMismatchException e2)
		{
			System.out.println("Handled the input datatype mismatch exception");
			System.out.println("Enter array size in int datatype only");
			sc.nextLine();   // To reset input
			int arr[] = new int[sc.nextInt()];
		}		
	}

}
