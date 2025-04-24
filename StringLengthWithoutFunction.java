package StringPrograms;

public class StringLengthWithoutFunction {

	public static void main(String[] args) {
		
		String s = "Mahesh";
		int count = 0;
		//for-each loop
		
		for(char a : s.toCharArray())
		{
			count++;
		}
		
		System.out.println(count);
		
		
	}

}
