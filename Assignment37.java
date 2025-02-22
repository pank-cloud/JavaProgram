package assignments;

public class Assignment37 {

	public static void main(String[] args) {

		int a[] = new int[4];
		
		int sum = 0;
		
		a[0] = 23;
		a[1] = 45;
		a[2] = 12;
		a[3] = 96;
		
		for(int i = 0 ; i<=a.length-1 ; i++)
		{
			sum  = sum + a[i];
		}
		
		int avg = sum/4;
		System.out.println("Average of the given number is: " +avg);
		
		
	}

}
