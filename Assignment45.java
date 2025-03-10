package assignments;

import java.util.Enumeration;
import java.util.Vector;

//Write a program to demonstrate the properties of Vector class 
//and also use some of the vector functions like 
//addElements, firstElement, lastElement, removeElement, 
//removeElementAt, removeAllElement & capacity

public class Assignment45 {

	public static void main(String[] args) {

		Vector v1 = new Vector();
		v1.addElement("ravi");
		v1.addElement("kumar");
		v1.addElement("677777888");
		v1.addElement("123 abcde colony, delhi");
		
		System.out.println(v1.firstElement());
		
		System.out.println(v1.lastElement());
		
		v1.removeElement("kumar");
		
		v1.removeElementAt(2);
		
		System.out.println(v1.capacity());
		
		//v1.removeAllElements();
		
		Enumeration e = v1.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}
