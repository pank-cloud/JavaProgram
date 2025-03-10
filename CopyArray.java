package abstract_class;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {

		//create 1 array
		// create another array without values array2
		// create a loop and store the value of array 1 to array2
		
		int arr1[] = {12, 43, 32, 14};
		
		int arr2[] = new int[4];
		
		for(int i = 0 ; i<=arr2.length-1; i++)
		{
			arr2[i] = arr1[i];
		}
		
		for(int i = 0 ; i<=arr2.length-1; i++)
		{
			System.out.println(Arrays.toString(arr2));
		}
		
	   Arrays.toString(arr2);
	    
	}
}
