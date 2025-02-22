package assignments;

import java.util.Arrays;

//WAP to check if 2 given Strings are ANAGRAM

public class Assignment35 {

	public static void main(String[] args) {

		String input1 = "tea";
		String input2 = "eat";
		
		//Since, sorting can be done using Arrays so converting string to array
		char a[] = input1.toCharArray();
		char b[] = input2.toCharArray();
		
		//sorting arrays a and b alphabetically
		Arrays.sort(a);
		Arrays.sort(b);
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		if(Arrays.equals(a, b))
		{
			System.out.println("The given input is Anagram");
		}
		else
		{
			System.out.println("The given input isn't Anagram");
		}
	}

}
