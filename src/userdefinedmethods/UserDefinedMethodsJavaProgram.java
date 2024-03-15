/* <Admir Satara>
 * User Defined Method Java Program
 */
package userdefinedmethods;

public class UserDefinedMethodsJavaProgram {
	int a = 4, result;
	static int b = 5, result1;

	// Method without returning any values (void method) - using object
	public void withoutReturningAnyValuesUsingObj() {
		System.out.println("Method without returning any values - calling with object!");
	}

	// Method without returning any values (void method) - without object static
	static public void withoutReturningAnyValuesWithoutObj() {
		System.out.println("Method without returning any values - calling without object!");
	}

	// Method returning value (int method) - using object
	public int returningValueUsingObj() {
		result = a * a;
		return result;
	}

	// Method returning value (int method) - without object static
	static public int returningValueWithoutObj() {
		result1 = b * b;
		return result1;
	}

	// Method passing parameter (void method) - using object
	public void passingParameterUsingObj(String name) {
		System.out.println("Passing parameter void method - calling with object: " + name);
	}

	// Method passing parameter (void method) - without object static
	static public void passingParameterWithoutObj(String name) {
		System.out.println("Passing parameter void method - calling without object: " + name);
	}

	// Method passing parameter (int method) - using object
	public int returningValuePassingParameterUsingObj(int a) {
		result = a * a;
		return result;
	}

	// Method passing parameter (int method) - without object static
	static public int returningValuePassingWithoutObj(int b) {
		result1 = b * b;
		return result1;
	}

	public static void main(String[] args) {
		// Calling method using object
		UserDefinedMethodsJavaProgram obj = new UserDefinedMethodsJavaProgram();
		obj.withoutReturningAnyValuesUsingObj();

		// Calling method without using object
		withoutReturningAnyValuesWithoutObj();

		// Calling method using object - returning value
		UserDefinedMethodsJavaProgram obj1 = new UserDefinedMethodsJavaProgram();
		int x = obj1.returningValueUsingObj();
		System.out.println("Method returning value - calling with object: " + x);

		// Calling method without using object - returning value
		int y = returningValueWithoutObj();
		System.out.println("Method returning value - calling without object: " + y);

		// Calling method using object - passing parameter
		UserDefinedMethodsJavaProgram obj3 = new UserDefinedMethodsJavaProgram();
		obj3.passingParameterUsingObj("First name");

		// Calling method without using object - passing parameter
		passingParameterWithoutObj("Last name");

		// Calling method using object - returning value
		UserDefinedMethodsJavaProgram obj4 = new UserDefinedMethodsJavaProgram();
		int x1 = obj4.returningValuePassingParameterUsingObj(4);
		System.out.println("Passing parameter int method - calling with object: " + x1);

		// Calling method without using object - returning value
		int y1 = returningValuePassingWithoutObj(5);
		System.out.println("Passing parameter int method - calling without object: " + y1);
	}

}
