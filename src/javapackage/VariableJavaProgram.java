/* <Admir Satara>
 * Variable Java Program
 */

package javapackage;

public class VariableJavaProgram {
	// Global variable
	static int k = 20; // Declare static variable to be used in static method

	public static void main(String arg[]) {
		VariableJavaProgram obj = new VariableJavaProgram();
		System.out.println("The value of global k variable is: " + k + " in main static method");
		obj.method1();
		obj.method2();
	}

	public void method1() {
		// Local variable
		int i; // Declaration of variable
		i = 5; // Initialization of variable
		System.out.println("The value of local i variable is: " + i + " in method 1");

		int j = 10;
		System.out.println("The value of local j variable is: " + j + " in method 1");
		System.out.println("The value of global k variable is: " + k + " in method 1");
	}

	public void method2() {
		System.out.println("The value of global k variable is: " + k + " in method 2");

	}

}