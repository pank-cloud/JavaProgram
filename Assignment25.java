package assignments;

//WAP to reverse a string

public class Assignment25 {
	
	public static void main(String[] args) {

		String input = "Pankaj";
		String output = "";
		
		for(int i = input.length()-1 ; i>=0; i--)
		{
			output = output + input.charAt(i);
		}
		
		System.out.println("Reverse of the string is :" +output);

	}

}
