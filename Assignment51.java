package assignments;

//this keyword program
public class Assignment51 {

	int rollno;
	String name;
	int marks;
	String subject;
	
	public void studentDetails(int rollno, String name, int marks, String subject)
	{
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		this.subject = subject;	
	}
	
	
	public static void main(String[] args) {
        
		Assignment51 aa = new Assignment51();
		System.out.println("rollno is " +aa.rollno);
	    System.out.println("name is " +aa.name);
	    System.out.println("marks is " +aa.marks);
		System.out.println("subject is " +aa.subject);
		
		aa.studentDetails(23,"Ramesh", 88, "Computer Science");
 // After initialising global variable using this keyword, printing value
		System.out.println("===========================");
		System.out.println("rollno is " +aa.rollno);
	    System.out.println("name is " +aa.name);
	    System.out.println("marks is " +aa.marks);
		System.out.println("subject is " +aa.subject);
		
	}

}
