package polymorphismOverriding;

public class TestClass {

	public static void main(String[] args) {

		ChildClass obj = new ChildClass();
		// Overriden method - Dynamic polymorphism
		obj.add(3, 8);
		obj.classParentMethod();
		obj.classChildMethod();

		ParentClass obj1 = new ParentClass();
		// Overriden method
		obj1.add(3, 8);
		obj1.classParentMethod();
		// obj1.classChildMethod();

		ParentClass obj2 = new ChildClass(); // up-casting
		// Overriden method
		obj2.add(3, 8);
		obj2.classParentMethod();
		// obj2.classChildMethod();

	}

}
