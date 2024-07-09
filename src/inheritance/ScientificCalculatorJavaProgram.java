/* <Admir Satara>
 * Scientific Calculator Java Program
 */

package inheritance;

public class ScientificCalculatorJavaProgram extends AdvancedCalculatorJavaProgram {

	public int division(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {

		ScientificCalculatorJavaProgram obj = new ScientificCalculatorJavaProgram();
		System.out.println("Addition is: " + obj.addition(4, 5));
		System.out.println("Multiplication is: " + obj.multiplication(4, 5));
		System.out.println("Division is: " + obj.division(25, 5));

	}

}
