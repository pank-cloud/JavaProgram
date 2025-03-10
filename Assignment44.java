package assignments;

import java.util.HashMap;
import java.util.Map;

// "Write a program to demonstrate the Map interface with the given details:
//1.Name and Bodyweight
//2.BankName and Bank Account ID
//3.Firstname and Lastname
//4.List of Household Items and their Quantities"


public class Assignment44 {

	public static void main(String[] args) {

		//1.Name and Bodyweight

		
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("Pankaj", 67);
		m1.put("Ramesh", 42);
		m1.put("Bhuvan", 98);
		m1.put("Tarun", 53);
		m1.put("Rakesh", 65);
		
		System.out.println(m1);
		
		Map<String, Integer> m2 = new HashMap<String, Integer>();
		System.out.println(m2.isEmpty());
		m2.putAll(m1);
		
		m2.remove("Ramesh");
		System.out.println(m2);
		
		m2.replace("Bhuvan", 78);
		System.out.println(m2);
		
		//2.BankName and Bank Account ID

		Map<String, Integer> m3 = new HashMap<String, Integer>();
		m3.put("Pankaj", 673232131);
		m3.put("Ramesh", 424334322);
		m3.put("Bhuvan", 981231231);
		m3.put("Tarun", 533213321);
		m3.put("Rakesh", 653123213);
		
		System.out.println(m3);

		
		//3.Firstname and Lastname
		
		Map<String, String> m4 = new HashMap<String, String>();
		m4.put("Pankaj", "Mishra");
		m4.put("Ramesh", "Kumar");
		m4.put("Bhuvan", "Sharma");
		m4.put("Tarun", "Kumar");
		m4.put("Rakesh", "Sharma");
		
		System.out.println(m4);

		
		//4.List of Household Items and their Quantities"

		Map<String, Integer> m5 = new HashMap<String, Integer>();
		m5.put("Sugar", 10);
		m5.put("Salt", 4);
		m5.put("Jeggary", 6);
		m5.put("Oil", 8);
		
		System.out.println(m5);

		
	}

}
