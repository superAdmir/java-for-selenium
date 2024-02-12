package accessmodifier2;

import accessmodifier1.AccessModifier1;

public class AccessModifier3 extends AccessModifier1 {
	public static void main(String[] args) {
		// DEFAULT - access modifier from a sub class outside of a package
		// (accessmodifier1)
		// inherited from AccessModifier1 class (extends)
		// method1();

		// DEFAULT - access modifier from any class outside of a package
		// (accessmodifier1)
		// without inheritance (delete extends above) and add object of AccessModifier1
		// class
		// AccessModifier1 obj = new AccessModifier1();
		// obj.method1();

		// PRIVATE - access modifier from a sub class outside of a package
		// (accessmodifier1)
		// inherited from AccessModifier1 class (extends)
		// method2();

		// PRIVATE - access modifier form any class outside package (accessmodifier1)
		// without inheritance (delete extends above) and add object of AccessModifier1
		// class
		// AccessModifier1 obj = new AccessModifier1();
		// obj.method2();

		// PROTECTED - access modifier from a sub class outside of a package
		// (accessmodifier1)
		// inherited from AccessModifier1 class (extends)
		// method3();

		// PROTECTED - access modifier form any class outside of a package
		// (accessmodifier1)
		// without inheritance (delete extends above) and add object of AccessModifier1
		// class
		// AccessModifier1 obj = new AccessModifier1();
		// obj.method3();

		// PUBLIC - access modifier from a sub class outside of a package
		// (accessmodifier1)
		// inherited from AccessModifier1 class (extends)
		// method4();

		// PUBLIC - access modifier form any class outside of a package
		// (accessmodifier1)
		// without inheritance (delete extends above) and add object of AccessModifier1
		// class
		// AccessModifier1 obj = new AccessModifier1();
		// obj.method4();
	}
}
