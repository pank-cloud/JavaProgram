package assignments;

public class Assignment12 {
	
	static void a()
	{
		System.out.println("first Static method ");
	}
	
	static void b()
	{
		System.out.println("second Static method");
	}
	
	void c(int x , int y)
	{
		int sum = x+y;
		System.out.println("first Non static method");
	}
	
	void d(boolean x, int y, double z)
	{
		double sum = y+z;
		System.out.println("second Non static method ");
	}
	
	public static void main(String[] args) {

		Assignment12 mo = new Assignment12();
		a();
		b();
		mo.c(12, 98);
		mo.d(true, 87, 99);
	}

}
