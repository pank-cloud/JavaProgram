package assignments;

//Wap Using if-else-if conditional Statement Using that make a nested 
//if-else Program

public class Assignment15 {

	public static void main(String[] args) {

		int a = 10;
		int b = 30;
		int c = 20;

		if (a < b) {
			if (b > c) {
				System.out.println("b is greater ");
			}

			else {
				System.out.println("c is greater");
			}
		}

		else if (a > b) {
			if (a > c) {
				System.out.println("a is greater");
			}
			else
			{
				System.out.println("c is greater");
			}
		}

	}

}
