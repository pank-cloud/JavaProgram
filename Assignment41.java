package assignments;

////Write a program to demonstrate the following functions like
//append, insert, replace, delete, reverse, capacity, charAt, length, 
//substring(int) & substring (start & end index) using StringBuilder concept

public class Assignment41 {

	public static void main(String[] args) {

		StringBuilder sbi = new StringBuilder("Pankaj");
		
		sbi.append(" Mishra");
		System.out.println(sbi);
		
		sbi.insert(6, " Kumar");
		System.out.println(sbi);
		
		sbi.replace(7, 12, "abcd");
		System.out.println(sbi);
		
		sbi.delete(7, 12);
		System.out.println(sbi);
		
		sbi.reverse();
		System.out.println(sbi);
		
		System.out.println(sbi.capacity());
		
		System.out.println(sbi.length());
		
		System.out.println(sbi.charAt(7));
		
		System.out.println(sbi.substring(7));
		
		System.out.println(sbi.substring(7, 13));
		
		
		
	}

}
