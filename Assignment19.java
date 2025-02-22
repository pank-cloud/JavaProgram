package assignments;

class Parentclass {

	static void testcase1() {
		System.out.println("First static method");
	}

	static void testcase2() {
		System.out.println("Second static method");
	}

}

public class Assignment19 extends Parentclass {

	static void testcase3() {
		System.out.println("subClass");
	}

	public static void main(String[] args) {
		// Assignment19 a = new Assignment19();
		Parentclass.testcase1();
		Parentclass.testcase2();
		testcase3();
	}
}