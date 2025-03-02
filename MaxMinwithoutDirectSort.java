package javaTopics;

import java.util.Arrays;

public class MaxMinwithoutDirectSort {

	public static void main(String[] args) {

		int arr[] = {3, 1, 5, 8, 2, 0};
		
		System.out.println("Before Sorting " +Arrays.toString(arr));
		
		//selection sort
		//logic - solve using two loops - i and j
		// if(arr[i] > arr[i+1]
		// here,it will swap 
		// arr[i] = 1
		//arr[i+1] = 3
		
		for(int i = 0; i<= arr.length-1 ; i++) // i =5
		{
			for(int j=i+1 ; j<=arr.length-1 ; j++)       // j= 5
			{
				if(arr[i] > arr[j]) {
					// swapping
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
					//0, 1, 2, 3, 5, 8
					
					
				}
			}
		}
		
		System.out.println("After Sorting " +Arrays.toString(arr));
		
		System.out.println("Min element of the array is " +arr[0]);
		System.out.println("Min element of the array is " +arr[arr.length-1]);


		
		
		
	}

}
