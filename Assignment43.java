package assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Write a program to demonstrate the properties of Set in Java

public class Assignment43 {

	public static void main(String[] args) {

		Set<Integer> s1 = new HashSet<Integer>();
		s1.add(43);
		s1.add(23);
		s1.add(43);
		s1.add(54);
		s1.add(65);
		s1.add(null);
		s1.add(null);
		
		System.out.println(s1);
		
		Set<Integer> s2 = new HashSet<Integer>();
		s2.add(51);
		s2.add(98);
		s2.add(76);
		s2.add(null);
		
		Iterator i1 = s1.iterator();
		
		System.out.println("Traverse using forward iteration");
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		s1.remove(43);
		
		System.out.println(s1);
		
		s2.addAll(s1);
		
		System.out.println(s2);
		
		boolean b = s2.equals(s1);
		System.out.println(b);
		
		System.out.println(s2.contains(23));
		
		
		
		
	}

}
