/* <Admir Satara>
 * Control Flow Java Program
 */
package javapackage;

public class ControlFlowJavaProgram {

	public static void main(String[] args) {
		ifStatement();
		ifElseStatement();
		ifElseIfStatement();
		nestedifElseStatement();
		switchStatement();

	}

	public static void ifStatement() {

		int n = 10;

		if (n > 0) {
			System.out.println("If: my number is positive.");
		}
		System.out.println("Code after if statement.");
	}

	public static void ifElseStatement() {

		int n = 10;

		if (n > 0) {
			System.out.println("If else: my number is positive.");
		} else {
			System.out.println("If else: my number is negative.");
		}
		System.out.println("Code after if else statement.");
	}

	public static void ifElseIfStatement() {

		int n = 0;

		if (n > 0) {
			System.out.println("If else if: my number is positive.");
		} else if (n < 0) {
			System.out.println("If else if: my number is negative.");
		} else {
			System.out.println("If else if: my number is zero.");
		}
		System.out.println("Code after if else if statement.");
	}

	public static void nestedifElseStatement() {

		int n1 = 3, n2 = 4, n3 = 10, largestNumber;

		if (n1 > n2) {
			if (n1 > n3) {
				largestNumber = n1;
			} else {
				largestNumber = n3;
			}
		} else {
			if (n2 > n3) {
				largestNumber = n2;
			} else {
				largestNumber = n3;
			}
		}
		System.out.println("Nested if else: Largest number is " + largestNumber);
	}

	public static void switchStatement() {

		int week = 5;
		String day;

		switch (week) {
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wednesday";
			break;
		case 4:
			day = "Thursday";
			break;
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		case 7:
			day = "Sunday";
			break;

		default:
			day = "Invalid day.";
			break;
		}
		System.out.println("Switch: day is: " + day);

	}
}
