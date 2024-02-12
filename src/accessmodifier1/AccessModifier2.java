package accessmodifier1;

public class AccessModifier2 extends AccessModifier1 {
	public static void main(String[] args) {
		// DEFAULT - access modifier from a sub class (AccessModifier1) in the same
		// package
		// (accessmodifier1)
		// Inherited from AccessModifier1 class (extends)
		// method1();

		// DEFAULT - access modifier form any class in the same package
		// Without inheritance (delete extends above) and add object of AccessModifier1
		// class
		// AccessModifier1 obj = new AccessModifier1();
		// obj.method1();

		// PRIVATE - access modifier from a sub class (AccessModifier1) in the same
		// package
		// (accessmodifier1)
		// Inherited from AccessModifier1 class (extends)
		// method2();

		// PRIVATE - access modifier form any class in the same package
		// without inheritance (delete extends above) and add object of AccessModifier1
		// class
		// AccessModifier1 obj = new AccessModifier1();
		// obj.method2();

		// PROTECTED - access modifier from a sub class (AccessModifier1) in the same
		// package
		// (accessmodifier1)
		// inherited from AccessModifier1 class (extends)
		// method3();

		// PROTECTED - access modifier form any class in the same package
		// without inheritance (delete extends above) and add object of AccessModifier1
		// class
		// AccessModifier1 obj = new AccessModifier1();
		// obj.method3();

		// PUBLIC - access modifier from a sub class (AccessModifier1) in the same
		// package
		// (accessmodifier1)
		// inherited from AccessModifier1 class (extends)
		// method4();

		// PUBLIC - access modifier form any class in the same package
		// without inheritance (delete extends above) and add object of AccessModifier1
		// class
		// AccessModifier1 obj = new AccessModifier1();
		// obj.method4();
	}
}
