package polymorphismOverriding;

public class ParentClass {

	public void add(int a, int b) {
		int c = a + b;
		System.out.println("Parent class overriding method: " + c);
	}

	public void classParentMethod() {
		System.out.println("Parent class overriding method called");
	}

}
