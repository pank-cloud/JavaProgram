package assignments;

import java.util.Date;

//Date class program
public class Assignment53 {

	public static void main(String[] args) {

		Date dt = new Date();
		System.out.println(dt.getTime());   //epoch time
		
		Date dt1 = new Date(dt.getTime());
		System.out.println(dt1);  //actual date + time
		
		// To print date as Mar 10 2025
		String dt2 = dt1.toString();
		String date = dt2.substring(8, 10);
		String month = dt2.substring(4, 7);
		String year = dt2.substring(dt2.length()-4);
		
		// Lets concatenate
		
		System.out.println("Final date is " +date+ "/" +month+ "/" +year); 
		
		
	}

}
