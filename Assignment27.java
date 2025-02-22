package assignments;

import java.util.Arrays;
import java.util.Scanner;

//WAP to create an array of size 4 which belongs to int type and 
//accept its input at run-time
public class Assignment27 {

	public static void main(String[] args) {

		int a[] = new int[4];
		Scanner sc = new Scanner(System.in);

		for(int i=0; i<=a.length-1 ; i++)
		{
			System.out.println("Enter the value ");
			a[i] = sc.nextInt();
		}
		
		System.out.println("The array content is " +Arrays.toString(a));
		
	}

}
