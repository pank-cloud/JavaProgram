package assignments;

import java.util.Arrays;

//WAP to count the number of numeric values present in the String

public class Assignment31 {
	
	public static void main(String[] args) {

		int countOfNumeric = 0;
		
		String c = "abcdef12345";
		char a[] = c.toCharArray();
		System.out.println(Arrays.toString(a));
		
		for(int i = 0; i<=a.length-1 ; i++)
		{
			if(Character.isDigit(a[i]))
			{
				countOfNumeric++;
			}
		}
		System.out.println(countOfNumeric);
		
	}

}
