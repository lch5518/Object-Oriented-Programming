class SuperClass {
	void methodA() {
		System.out.println("In SuperClass...");
	}
}
class SubClass extends SuperClass{
	void methodA() {
		System.out.println("In SubClass...overriding!!");
	}
	void methodA(int i) {
		System.out.println("In SubClass...overloading!!");
	}
}
public class OverridingAndOverrloading {

	public static void main(String[] args) {
		SuperClass obj1 = new SuperClass();
		SubClass obj2 = new SubClass();
		obj1.methodA();
		obj2.methodA();
		obj2.methodA(1);

	}

}
