package thisKeywords;

public class ThisKeywordUsage2Method {

	public void methodA() {
		System.out.println("This is a method A");

	}

	public void methodB() {
		this.methodA();
		System.out.println("This is a method B");

	}

	public static void main(String[] args) {

		ThisKeywordUsage2Method obj = new ThisKeywordUsage2Method();
		obj.methodB();
	}
}
