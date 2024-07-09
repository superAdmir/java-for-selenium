/* <Admir Satara>
 * Advanced Calculator Java Program
 */

package inheritance;

public class AdvancedCalculatorJavaProgram extends CalculatorJavaProgram {

	public int multiplication(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {

		// Sub(Child) Class reference and Sub(Child) Object
		AdvancedCalculatorJavaProgram obj = new AdvancedCalculatorJavaProgram();
		System.out.println("Addition is: " + obj.addition(4, 5));
		System.out.println("Multiplication is: " + obj.multiplication(4, 5));

		// Super(Parent) Class reference and Sub(Child) Class Object
		CalculatorJavaProgram obj1 = new AdvancedCalculatorJavaProgram();
		System.out.println("Addition is (obj1): " + obj1.addition(4, 5));

		// Super(Parent) Class reference and Super(Parent) Class Object
		CalculatorJavaProgram obj2 = new CalculatorJavaProgram();
		System.out.println("Addition is: (obj2) " + obj2.addition(4, 5));

	}

}
