package assignments;

import java.util.Arrays;

//WAP to count the number of spaces present in the String

public class Assignment33 {

	public static void main(String[] args) {

		int countOfSpace = 0;
		
		String a = "abcdef 67891";
		char c[] = a.toCharArray();
		System.out.println(Arrays.toString(c));
		
		for(int i = 0; i<=c.length-1 ;i++)
		{
			if(Character.isSpaceChar(c[i]))
			{
				countOfSpace++;
			}
		}
		
		System.out.println(countOfSpace);
		
	}

}
