package abstract_class;

public class SubStringCount {

	public static void main(String[] args) {

		String str= "Hello World World hi World World";
		String subString = "world";
		
		int count = 0;
		int subStringindex = str.indexOf(subString); //6
		System.out.println(subStringindex);
		
		while(subStringindex != -1)
		{
			count++;  //2
			subStringindex = str.indexOf(subString, subStringindex + subString.length());
		}                            //     World, 17+5
		
		//subString is coming at index 12
		
		System.out.println("The count of the subString is " +count);
	}

}
