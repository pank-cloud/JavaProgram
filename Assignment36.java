package assignments;

//WAP to check if 24 is a part of your array if yes print its indexing
public class Assignment36 {

	public static void main(String[] args) {

		int arr[] = new int[4];
		arr[0] = 23;
		arr[1] = 76;
		arr[2] = 24;
		arr[3] = 54;
				
		for(int i = 0; i<=arr.length-1 ; i++)
		{
			if(arr[i] == 24)
			{
				System.out.println("The number is found at index " +i);
				break;
			}
		}	
	}
}
