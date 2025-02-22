package assignments;

import java.util.Arrays;

//WAP to accept the values of 2 arrays at run-time 
//and compare if both are equal

import java.util.Scanner;

//WAP to accept the values of 2 arrays at run-time and compare if both are equal

public class Assignment30 {

	public static void main(String[] args) {
		
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int[size];
		
		System.out.println("Enter the values of first array");
		for(int i = 0 ; i<=a.length-1; i++)
		{
			a[i] = sc.nextInt();
		}
		
		int b[] = new int[size];

		System.out.println("Enter the values of second array");
		for(int j= 0 ; j<=b.length-1; j++)
		{
			b[j] = sc.nextInt();
		}
		
		if(Arrays.equals(a, b))
		{
			System.out.println("The arrays are equal");
		}
		else
		{
			System.out.println("The arrays are not equal");
		}
		
	}
	
	
}
