package assignments;

import java.util.Arrays;

//WAP to create an array of size 4 which belongs to int type and 
//copy its values into a new array in reverse order

public class Assignment29 {

	public static void main(String[] args) {

		int rollno[] = new int[4];
		rollno[0] = 10;
		rollno[1] = 43;
		rollno[2] = 67;
		rollno[3] = 89;
		
		int reverse[] = new int[rollno.length];
		
		for(int i = 0, j = reverse.length-1; i<=rollno.length-1 ; i++ , j--)
		{
			 reverse[j] = rollno[i];
		}
		
		System.out.println(Arrays.toString(reverse));
		
	}

}
