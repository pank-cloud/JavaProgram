package abstract_class;

public class ReversewithoutChangeIndex {

	public static void main(String[] args) {

		String input = "My name is Pankaj";
		String output = "";
		
		String word[] = input.split(" ");
		
		System.out.println(word[0]);
		System.out.println(word[1]);
		System.out.println(word[2]);
		System.out.println(word[3]);
		
		for(int j = 0 ; j<=word.length-1;j++)
		{
			String reverseword = "";
			for(int i = word[j].length()-1 ; i>=0; i--)
			{
				reverseword = reverseword + word[j].charAt(i);
			}
			
			output = output + reverseword + " ";
		}

		System.out.println(output);
		
	}

}
