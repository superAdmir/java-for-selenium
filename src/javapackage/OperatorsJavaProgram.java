/* <Admir Satara>
 * Operators Java Program
 */
package javapackage;

public class OperatorsJavaProgram {

	public static void main(String[] args) {

		aritmeticOperator();
		relationalOperator();
		logicalOperator();
		assignmentOperator();
		conditionalOperator();
		instanceofOperator();
	}

	public static void aritmeticOperator() {
		int a = 5, b = 10;

		int c = a + b;
		System.out.println("-----------------Aritmetic operator----------------");
		System.out.println("Addition is: " + c);
		int c1 = b - a;
		System.out.println("Substraction is: " + c1);
		int c2 = b * a;
		System.out.println("Multiplication is: " + c2);
		int c3 = b / a;
		System.out.println("Division is: " + c3);
		int c4 = b % a;
		System.out.println("Module is: " + c4);
		int c5 = a++;
		System.out.println("Increment is: " + c5);
		System.out.println("A is: " + a);
		int c7 = a--;
		System.out.println("Decrement is: " + c7);
		int c8 = --a;
		System.out.println("Decrement is: " + c8);
	}

	public static void relationalOperator() {
		int a = 5, b = 10;
		System.out.println("-----------------Relational operator----------------");
		System.out.println("Equal to: " + (a == b));
		System.out.println("Not equal to: " + (a != b));
		System.out.println("Greater than: " + (a > b));
		System.out.println("Less than: " + (a < b));
		System.out.println("Greater than or equal to: " + (a >= b));
		System.out.println("Less than or equal to: " + (a <= b));
	}

	public static void logicalOperator() {
		int a = 50, b = 17;
		System.out.println("-----------------Logical operator----------------");
		System.out.println("Logical AND: " + ((a > b) && (a != b)));
		System.out.println("Logical AND: " + ((a > b) && (a == b)));
		System.out.println("Logical AND: " + ((a < b) && (a == b)));
		System.out.println("Logical OR: " + ((a > b) || (a != b)));
		System.out.println("Logical OR: " + ((a > b) || (a == b)));
		System.out.println("Logical OR: " + ((a < b) || (a == b)));
		System.out.println("Logical NOT: " + (!((a < b) && (a != b))));
		System.out.println("Logical NOT: " + (!((a > b) && (a != b))));
		System.out.println("Logical NOT: " + (!((a < b) && (a == b))));
	}

	public static void assignmentOperator() {
		int a = 50, b = 17, c1 = 1, c2 = 1, c3 = 1;
		int c = a + b;
		System.out.println("-----------------Logical operator----------------");
		System.out.println("Assingment = : " + c);
		c1 += a;
		System.out.println("Assingment += : " + c1);
		c2 -= a;
		System.out.println("Assingment -= : " + c2);
		c3 *= a;
		System.out.println("Assingment *= : " + c3);
	}

	public static void conditionalOperator() {
		int a = 50, b = 17;
		String d, d1;
		System.out.println("-----------------Conditional operator----------------");
		d = (a > b) ? "Passed" : "Failed";
		System.out.println("Conditional: " + d);
		d1 = (a < b) ? "Passed" : "Failed";
		System.out.println("Conditional: " + d1);
	}

	public static void instanceofOperator() {
		OperatorsJavaProgram obj = new OperatorsJavaProgram();
		System.out.println("instanceof: " + (obj instanceof OperatorsJavaProgram)); // true
	}

}
