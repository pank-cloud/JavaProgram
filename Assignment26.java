package assignments;

//WAP to check if the given strings are palindrome         

public class Assignment26 {

	public static void main(String[] args) {

		String input = "madam";
		String output = "";
		
		for(int i = input.length()-1 ; i>=0; i--)
		{
			output = output + input.charAt(i);
		}
		
		System.out.println("Reverse of the string is: " +output);
		
		
		if(input.equals(output))
		{
			System.out.println("The given string " +input+ " is Palindrome");
		}
		
		else
		{
			System.out.println("The given string " +input+ " is not Palindrom");
		}
		
		
	}

}
