 package assignments;

//WAP to create relation between multiple classes containing both static 
//and non-static methods. Multi Level Inheritance

 class GrandParentC {

	static void a() {
		System.out.println("Grand Parent class Method 1");
	}

	void b() {
		System.out.println("Grand Parent class Method 2");
	}

}

class Parent_c extends GrandParentC {

	static void c() {
		System.out.println("Parent class method 1");
	}

	void d() {
		System.out.println("Parent class method 2");
	}

}

public class Assignment21 extends Parent_c {
	static void e() {
		System.out.println("Child class method 1");
	}

	void f() {
		System.out.println("Child class method 2");
	}

	public static void main(String[] args) {

		Assignment21 cc = new Assignment21();
		a();
		cc.b();
		c();
		cc.d();
		e();
		cc.f();
	}
}
