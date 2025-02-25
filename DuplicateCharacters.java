package abstract_class;

import java.util.Arrays;

public class DuplicateCharacters {

	public static void main(String[] args) {

		String name = "automationuubbb";
		char c1[] = name.toCharArray();
		
		Arrays.sort(c1); // {a b b b b c c c d}
		
		int count = 1; 
		
		for(int i = 0 ; i<c1.length-1 ; i++)
		{

			if(c1[i] == c1[i+1])
			{
				count++;

			}

			else if(count > 1)
			{	
				System.out.println(c1[i] + " has occured " +count + "times");	
				count = 1;
			}
		}
			
		if(count > 1)
		{
			System.out.println(c1[c1.length-1] + " has occured" + count + " times");
		}

	}

}
