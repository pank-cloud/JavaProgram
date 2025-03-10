package assignments;

//Write a program to demonstrate the following functions like
//append, insert, replace, delete, reverse, capacity, charAt, length, 
//substring(int) & substring (start & end index) using StringBuffer concept

public class Assignment40 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Pankaj");
		sb.append(" Mishra");
		System.out.println(sb);
		
		sb.insert(6, " Kumar");
		System.out.println(sb);
			
		sb.replace(7, 12, "abc");
		System.out.println(sb);
		
		sb.delete(7, 11);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		System.out.println(sb.capacity());
	
		System.out.println(sb.length());
		
		System.out.println(sb.charAt(7));
		
		System.out.println(sb.substring(0, 6));
		
		System.out.println(sb.substring(7));

	}

}
