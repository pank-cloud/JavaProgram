package assignments;

import java.util.Arrays;

public class Assignment34 {

	public static void main(String[] args) {

		int countOfAlphabet = 0;
		int countOfDigit = 0;
		int countOfSpace = 0;
		int countOfSpecialCharacters = 0;
				
		String s = "My name is abc123&&%%";
		char c[] = s.toCharArray();
		System.out.println(Arrays.toString(c));
				
		for(int i = 0; i<=c.length-1; i++)
		{
			if(Character.isAlphabetic(c[i]))
			{
				countOfAlphabet++;
			}
			
			if(Character.isDigit(c[i]))
			{
				countOfDigit++;
			}
			
			if(Character.isWhitespace(c[i]))
			{
				countOfSpace++;
			}
						
		}
		
		int size = s.length();
		
		countOfSpecialCharacters = size - (countOfAlphabet + countOfDigit + countOfSpace);
		
		
		System.out.println("Count of Special Character is " +countOfSpecialCharacters);
		
		
	}

}
