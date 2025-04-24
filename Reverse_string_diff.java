package StringPrograms;

public class Reverse_string_diff {
	  public static void main(String[] args) {
	         String input = "welcome To Java";
	         char[] inputArray = input.toCharArray();

	         // Count non-space characters
	         int nonSpaceCount = 0;
	         for (char c : inputArray) {
	             if (c != ' ') nonSpaceCount++;
	         }

	         // Extract non-space characters
	         char[] nonSpace = new char[nonSpaceCount];
	         int index = 0;
	         for (char c : inputArray) {
	             if (c != ' ') nonSpace[index++] = c;
	         }

	         // Reverse the non-space array
	         char[] reversed = new char[nonSpaceCount];
	         for (int i = 0; i < nonSpaceCount; i++) {
	             reversed[i] = nonSpace[nonSpaceCount - 1 - i];
	         }
	   // Create result array with spaces
	         char[] result = new char[nonSpaceCount + 2]; // 13 chars + 2 spaces
	         int pos = 0;

	         // Copy first 7 characters
	         for (int i = 0; i < 7; i++) {
	             result[pos++] = reversed[i];
	         }
	         result[pos++] = ' '; // First space

	         // Copy next 2 characters
	         for (int i = 7; i < 9; i++) {
	             result[pos++] = reversed[i];
	         }
	         result[pos++] = ' '; // Second space

	         // Copy remaining 4 characters
	         for (int i = 9; i < 13; i++) {
	             result[pos++] = reversed[i];
	         }

	         System.out.println(new String(result));
	     }
	  }
	
	


