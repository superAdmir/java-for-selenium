package superKeywords;

public class superKeywordMethod2 extends superKeywordMethod1 {

	// Usage super with variable
	int empID = 12345;
	String empName = "Peter";

	// Usage super with method
	public void empMethod() {
		System.out.println("This is child method.");
	}

	// Usage super with constructor
	superKeywordMethod2() {
		// super();
		System.out.println("This is child constructor");
	}

	// Usage super with variable
	public void showRecordWithoutSuperKeyword() {
		System.out.println("showRecordWithoutSuperKeyword");
		empMethod();
		System.out.println("Emp ID: " + empID);
		System.out.println("Emp name: " + empName);
	}

	public void showRecordWithSuperKeyword() {

		// Usage super with method
		super.empMethod();
		// Usage super with variable
		System.out.println("showRecordWithSuperKeyword");
		System.out.println("Emp ID: " + super.empID);
		System.out.println("Emp name: " + super.empName);
	}

}
