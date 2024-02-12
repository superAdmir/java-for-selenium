/* <Admir Satara>
 * String Java Program
 */

package fundamentals;

public class StringJavaProgram {

	public static void main(String[] args) {
		stringLiteral();
		newKeyword();
		compareTo();
		booleanEquals();
		booleanEqualsIgnoreCase();
		concat();
		charAt();
		booleanContains();
		toUpperCaseMethod();
		toLowerCaseMethod();
		trimMethod();
		substringMethod();
		booleanStartsWithMethod();
		booleanEndsWithMethod();
		lengthStringMethod();
		replaceMethod();
		converStringToIntParseMethod();
		converStringToIntValueOfMethod();
		converIntToStringValueOfMethod();
		converIntToStringMethod();
	}

	public static void stringLiteral() {
		String s = "Hello1";
		System.out.println("String literal method: " + s);
	}

	public static void newKeyword() {
		String s = new String("Hello2");
		System.out.println("New Keyword method: " + s);
	}

	public static void compareTo() {
		// A to Z = 65 to 90
		// a to z = 97 to 122
		// 0 to 9 = 48 to 57
		// if s1>s2 = positive number
		// if s1<s2 = negative number
		// if s1+s2 = 0 number
		String s1 = "Hello";
		String s2 = "HELLO";
		System.out.println("Compare to method: " + s1.compareTo(s2));
		System.out.println("Compare to method: " + s2.compareTo(s1));
	}

	public static void booleanEquals() {
		String act = "Welcome to Java Selenium.";
		String exp = "Welcome to Java Selenium.";
		boolean result = act.equals(exp);
		System.out.println("Boolean equals method: " + result);
	}

	public static void booleanEqualsIgnoreCase() {
		String act = "WELCOME TO JAVA SELENIUM.";
		String exp = "Welcome to Java Selenium.";
		boolean result = act.equalsIgnoreCase(exp);
		System.out.println("Boolean equals ignore case method: " + result);
	}

	public static void concat() {
		String str1 = "Hello, ";
		String str2 = "Welcome to Java Selenium.";
		System.out.println("Concat method: " + str1.concat(str2));
	}

	public static void charAt() {
		String str1 = "Hello, ";
		System.out.println("CharAt method: " + str1.charAt(4));
	}

	public static void booleanContains() {
		String str1 = "Welcome to Java Selenium.";
		System.out.println("Boolean contains method: " + str1.contains("Java"));
	}

	public static void toUpperCaseMethod() {
		String str1 = "Hello, ";
		System.out.println("To uppercase method: " + str1.toUpperCase());
	}

	public static void toLowerCaseMethod() {
		String str1 = "Hello, ";
		System.out.println("To lowercase method: " + str1.toLowerCase());
	}

	public static void trimMethod() {
		String str1 = " Welcome to Java Selenium. ";
		System.out.println("Trim method before removing space: " + str1);
		System.out.println("Trim method after removing space: " + str1.trim());
	}

	public static void substringMethod() {
		String str1 = "Welcome to Java Selenium.";
		System.out.println("Substring method: " + str1.substring(8));
	}

	public static void booleanStartsWithMethod() {
		String str1 = "Welcome to Java Selenium.";
		System.out.println("Boolean starts with method (true): " + str1.startsWith("Welcome"));
		System.out.println("Boolean starts with method (false): " + str1.startsWith("Hello"));
	}

	public static void booleanEndsWithMethod() {
		String str1 = "Welcome to Java Selenium.";
		System.out.println("Boolean ends with method (true): " + str1.endsWith("Selenium."));
		System.out.println("Boolean ends with method (false): " + str1.endsWith("Hello"));
	}

	public static void lengthStringMethod() {
		String str1 = "Welcome to Java Selenium.";
		System.out.println("Length string method: " + str1.length());
	}

	public static void replaceMethod() {
		String str1 = "Welcome to Java Selenium Session.";
		System.out.println("Replace method: " + str1.replace("S", "H"));
	}

	public static void converStringToIntParseMethod() {
		String str1 = "54321";
		int num = Integer.parseInt(str1);
		System.out.println("Convert String to Int with Parse method: " + num);
	}

	public static void converStringToIntValueOfMethod() {
		String str1 = "54321";
		int num = Integer.valueOf(str1);
		System.out.println("Convert String to Int with valueOf method: " + num);
	}

	public static void converIntToStringValueOfMethod() {
		int i = 123;
		String str = String.valueOf(i);
		System.out.println("Convert Int to String with parse method - String value is: " + str);
	}

	public static void converIntToStringMethod() {
		int i = 123;
		String str = Integer.toString(i);
		System.out.println("Convert Int to String method - String value is: " + str);
	}
}
