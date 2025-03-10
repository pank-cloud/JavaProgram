package assignments;

import java.util.Stack;

//Write a program to demonstrate the properties of Stack class
//and use some of the Stack functions like pop(), peak() & push()

public class Assignment46 {

	public static void main(String[] args) {

		Stack s = new Stack();
		s.push("ramesh");
		s.push("kumar");
		s.push("999999321");
		s.push("123, abcdef colony, lucknow");
		
		
		System.out.println(s.firstElement());
		System.out.println(s.lastElement());
		
		s.pop();
		System.out.println(s);
		s.push("Finance Department");
		System.out.println(s);
		System.out.println(s.peek()); // the object at the top of this stack 
		
	}
	
}
