package assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//Write a program to demonstrate the properties of List in Java

public class Assignment42 {

	public static void main(String[] args) {

		List li = new ArrayList();
		li.add("Pankaj");
		li.add("21");
		li.add(true);
		li.add("Pankaj");
		li.add(null);
		li.add(null);
		
		System.out.println(li);
		
		List li1 = new ArrayList();
		li1.add("Kumar");
		li1.add("24");
		li1.add(false);
		li1.add("Kumar");
		li1.add(null);
		li1.add(null);
		
		li1.addAll(li);
		
		System.out.println(li1);
		
		li1.remove("24");
		li1.removeAll(li);
		
		boolean a = li1.equals(li);
		System.out.println(a);
		
		boolean b = li1.contains("Kumar");
		System.out.println(b);

		
		System.out.println(li1);

		// Traverse using Iterator
		System.out.println("Traverse using Iterator in forward direction");
		Iterator i1 = li.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		System.out.println("===================");
		// Traverse using ListIterator
		
		System.out.println("Traverse using ListIterator in forward direction");

		ListIterator i2 = li.listIterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
		System.out.println("Traverse using ListIterator in backward direction");
		
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
		
		
		
	}

}
