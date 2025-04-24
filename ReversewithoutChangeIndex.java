package StringPrograms;

public class ReverseWithoutChangeIndex {

	public static void main(String[] args) {

		String input = "My name is Pankaj";
		String output = "";
		
		String word[] = input.split(" ");
		
		System.out.println(word[0]);
		System.out.println(word[1]);
		System.out.println(word[2]);
		System.out.println(word[3]);
		
		for(int i = 0 ; i<=word.length-1;i++)
		{
			String reverseword = "";
			for(int j = word[i].length()-1 ; j>=0; j--)
			{
				reverseword = reverseword + word[i].charAt(j);
			}
			
			output = output + reverseword + " ";
		}

		System.out.println(output);
		
	}


		
	}


