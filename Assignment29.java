package assignments;

import java.util.Arrays;
import java.util.Scanner;

//WAP to create an array of size 4 which belongs to int type and 
//copy its values into a new array in reverse order

public class Assignment29 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
		int rollno[] = new int[size];
		for(int i = 0 ; i <= rollno.length-1 ; i++)
		{
			rollno[i] = sc.nextInt();
		}
		
		int reverse[] = new int[rollno.length];
		
		for(int i = 0, j = reverse.length-1; i<=rollno.length-1 ; i++ , j--)
		{
			 reverse[j] = rollno[i];
		}
		
		System.out.println(Arrays.toString(reverse));
		
	}

}
