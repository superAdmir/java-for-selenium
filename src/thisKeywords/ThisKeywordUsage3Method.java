package thisKeywords;

public class ThisKeywordUsage3Method {

	ThisKeywordUsage3Method() {
		this(4);
		System.out.println("This is default constructor");

	}

	ThisKeywordUsage3Method(int a) {
		System.out.println("This is parameterized constructor and value of a: " + a);

	}

	public static void main(String[] args) {

		ThisKeywordUsage3Method obj = new ThisKeywordUsage3Method();
	}
}
