package assignments;

import java.util.Arrays;

//WAP to count the number of alphabets present in the String

public class Assignment32 {

	public static void main(String[] args) {

		int countOfAlphabets = 0;
		String a = "abcdef7654321";
		
		char c[] = a.toCharArray();
		System.out.println(Arrays.toString(c));
		
		for(int i = 0; i<=c.length-1; i++)
		{
			if(Character.isAlphabetic(c[i]))
			{
				countOfAlphabets++;
			}
		}
		
		System.out.println(countOfAlphabets);
	}

}
