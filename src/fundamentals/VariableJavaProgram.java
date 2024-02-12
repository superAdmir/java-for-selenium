/* <Admir Satara>
 * Variable Java Program
 */

package fundamentals;

public class VariableJavaProgram {
	// Global variable
	static int k = 20; // Declaration of static variable to be used in static method

	public static void main(String arg[]) {
		VariableJavaProgram obj = new VariableJavaProgram();
		System.out.println("The value of global k variable is: " + k + " in main static main() method");
		obj.method1();
		obj.method2();
	}

	public void method1() {
		// Local variable
		int i; // Declaration of variable
		i = 5; // Initialization of variable
		System.out.println("The value of local i variable is: " + i + " in method1()");
		int j = 10;
		System.out.println("The value of local j variable is: " + j + " in method1()");
		System.out.println("The value of global k variable is: " + k + " in method1()");
	}

	public void method2() {
		System.out.println("The value of global k variable is: " + k + " in method2()");
	}
}