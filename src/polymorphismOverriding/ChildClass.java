package polymorphismOverriding;

public class ChildClass extends ParentClass {

	public void add(int a, int b) {
		int c = a + b;
		System.out.println("Child class overriding method: " + c);
	}

	public void classChildMethod() {
		System.out.println("Child class overriding method called");
	}
}
