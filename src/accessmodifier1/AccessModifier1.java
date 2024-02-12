package accessmodifier1;

public class AccessModifier1 {
	public static void main(String[] args) {
		// Default access modifier from the same class
		method1();
		// Private access modifier from the same class
		method2();
		// Protected access modifier from the same class
		method3();
		// Public access modifier from the same class
		method4();
	}

	static void method1() {
		System.out.println("Default access modifier in AccessModifier1 class.");
	}

	private static void method2() {
		System.out.println("Private access modifier in AccessModifier1 class.");
	}

	protected static void method3() {
		System.out.println("Protected access modifier in AccessModifier1 class.");
	}

	public static void method4() {
		System.out.println("Public access modifier in AccessModifier1 class.");
	}

}
