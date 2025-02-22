package assignments;

import java.util.Scanner;

//WAP to call Scanner methods
public class Assignment9 {

	public static void main(String[] args) {

		System.out.println("Calling Scanner Methods Program");
		
		Scanner sc = new Scanner(System.in);
		byte a = sc.nextByte();
		System.out.println(a);
		
		short b = sc.nextShort();
		System.out.println(b);
		
		int c = sc.nextInt();
		System.out.println(c);
		
		long d = sc.nextLong();
		System.out.println(d);
		
		float e = sc.nextFloat();
		System.out.println(e);
		
		double f = sc.nextDouble();
		System.out.println(f);
		
		boolean g = sc.nextBoolean();
		System.out.println(g);
		
		String h = sc.next();
		System.out.println(h);
		
		
	}

}
