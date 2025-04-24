package StringPrograms;

public class AlternateCharacterString {

	public static void main(String[] args) {

		String s = "MaheshSonwane";
		// Ms
		char a[] =s.toCharArray();
	// output = Vks
	 // i = i+2 for incrementing value of i by 2
		for(int i = 0; i<=a.length/2-1; i+=4)
		{
			System.out.print(a[i]);
		}
		
	}

}


 












