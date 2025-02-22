package assignments;

//WAP using For Loop to achieve 5 random results for both Area & 
//Circumference of Circle.

public class Assignment18 {

	void Cir() {
		for (int i = 0; i <= 4; i++) {
			double r = Math.random();
			double cir = 2 * Math.PI * r;

			System.out.print("circumference is : ");
			System.out.print(cir);
			System.out.println();

		}
	}

	void Area() {
		for (int i = 0; i <= 4; i++) {
			double r = Math.random();
			double area = Math.PI * r * r;
			System.out.print("area is : ");
			System.out.print(area);
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Assignment18 a18 = new Assignment18();
		a18.Cir();
		System.out.println();
		a18.Area();
	}

}
