package fundamentals;

public class ImmutableStringJavaProgram {

	public static void main(String[] args) {

		String s = "Selenium";
		s.concat("WebDriver");
		s.replace("S", "s");
		s.toUpperCase();
		System.out.println("Immutable string is: " + s);

	}

}
