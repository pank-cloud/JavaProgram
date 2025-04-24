package StringPrograms;

import java.util.Arrays;

public class DuplicateCharacters {

	public static void main(String[] args) 
	{
		
		String s1 = "pankaj";
		char a[] = s1.toCharArray();
		Arrays.sort(a);        //{[a, a, j, k, n, p]}
	    System.out.println(Arrays.toString(a));
	    
	    int count = 1;
	    
	    for(int i = 0; i < a.length-1 ; i++)
	    {
	    if(a[i] == a[i+1])
	    {
	    	count++;
	    }
	    else if(count>1)
	    {
	    	System.out.println(a[i] +"has occured" + i + "times");
	    }
	    }
	    
	    if(count > 1)
	    {
	    	
	    }
	    
	}

}
