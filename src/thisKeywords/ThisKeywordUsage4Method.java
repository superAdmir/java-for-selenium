package thisKeywords;

public class ThisKeywordUsage4Method {

	public void methodA(ThisKeywordUsage4Method obj) {
		System.out.println("This is method A");
	}

	public void methodCall() {
		methodA(this);
	}

	public static void main(String[] args) {

		ThisKeywordUsage4Method obj1 = new ThisKeywordUsage4Method();
		obj1.methodCall();
	}
}
