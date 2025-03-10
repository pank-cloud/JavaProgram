package abstract_class;

import java.util.Arrays;

public class StringIndividualCount {

	public static void main(String[] args) {
		String str= "Hello World World Hi World Hey Hello ABCDEF ";

		String arr[] = str.split(" ");
		System.out.println(Arrays.toString(arr));
		String checkedWords = "";
		for(int i = 0 ; i <= arr.length-1 ; i++)
		{
			if(!checkedWords.contains(arr[i]))
			{
			int count = 0;
			int subStringindex = str.indexOf(arr[i]); //6
		//	System.out.println(subStringindex);
			
			while(subStringindex != -1)
			{
				count++;  //2
				subStringindex = str.indexOf(arr[i], subStringindex + arr[i].length());
			}                            //     World, 6+5
			
			//subString is coming at index 12
			
			System.out.println("The count of " +arr[i] + " " + " is " + count); 
			checkedWords = checkedWords + arr[i];
			}
		}
		// logic = .indexOf()
		
		
	}


	}


