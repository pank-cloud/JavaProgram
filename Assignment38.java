package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//How to sort a collection

public class Assignment38 {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<Integer>();

		li.add(23);
		li.add(43);
		li.add(62);
		li.add(54);
		li.add(76);
		
	    Collections.sort(li);
		System.out.println(li);
		
	}

}
