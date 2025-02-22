package assignments;

import java.util.Arrays;
import java.util.Scanner;

//WAP to create an array of size 4 which belongs to int type and
//copy its values into a new array

public class Assignment28 {

	public static void main(String[] args) {

		int a[] = new int[4];

		for (int i = 0; i <= a.length - 1; i++) {
			Scanner sc = new Scanner(System.in);
			a[i] = sc.nextInt();
		}		
		System.out.println(Arrays.toString(a));
		
		int b[] = new int[a.length];
		
		for(int j = 0 ; j<=b.length-1 ; j++)
		{
			b[j] = a[j];
		}
		System.out.println(Arrays.toString(b));
		
	}
}
