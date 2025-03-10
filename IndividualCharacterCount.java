package javaTopics;

import java.util.Arrays;

public class IndividualCharacterCount {

	public static void main(String[] args) {

		//logic - first we need to convert string to array then sort it
		// then we need to compare the value c[i] with c[i + 1] if equal 
		// then count++ or else if(count > 1) then print count value
		
		
		String s1 = "auutomationtestingg";
		char c1[] = s1.toCharArray();
		Arrays.sort(c1);
		System.out.println(Arrays.toString(c1));
		int count = 1;
		for(int i = 0 ; i<c1.length-1 ; i++)
		{
			if(c1[i] == c1[i+1])
			{
				count++;
			}
			// To print count of duplicate characters
			
			/*else if(count>1)
			{
				System.out.println(c1[i] + " has occured " +count+ " times");
				count = 1;
			} */
			
			// To print count of individual characters
			else 
			{
				System.out.println(c1[i] + " has occured " +count+ " times");
				count = 1;
			} 
			
		}
		
		//To print the last duplicate character
		if(count > 1)
		{
			System.out.println(c1[c1.length-1] + " has occured " +count+ " times");
		}
		
	}

}
