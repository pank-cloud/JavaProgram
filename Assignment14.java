package assignments;

import java.util.Scanner;

//Wap Using if-else conditional Statement Such that above 18 You can Vote 
//and Below 18 You canot vote using Scanner Class

public class Assignment14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age ");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("You are eligible for vote");
		}

		else {
			System.out.println("You are not eligible for vote");
		}

	}

}
