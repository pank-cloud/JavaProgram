package abstract_class;

public class removeSpace {

	public static void main(String[] args) {

		String name = "My name is Pankaj";
		String lowercaseName = name.toLowerCase();
		String reverseName = "";
          char a[] = lowercaseName.toCharArray();		
		
          for(int i = a.length-1; i>=0 ; i--)
          {
        	  if(a[i] == ' ')
        	  {
        		  continue;
        	  }
        	  else
        	  {
        		  reverseName = reverseName + lowercaseName.charAt(i);
        		  
              }
        	  
		
//		String newName1 = name.substring(0, 2);
//		String newName2 = name.substring(3, 7);
//		String newName3 = name.substring(8, 10);
//		String newName4 = name.substring(11);
//		
//		System.out.println(newName1 + newName2 + newName3 + newName4);

 	}
          
    	  System.out.println("The reverse of the given string is " +reverseName);

	}}


