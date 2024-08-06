package superKeywords;

public class realUsageChildClass extends realUsageParentClass {
	int empAge;

	realUsageChildClass(int empID, String empName, int empAge) {
		super(empAge, empName);
		this.empAge = empAge;
	}

	public void showRecord() {
		System.out.println("Emp ID: " + empID);
		System.out.println("Emp name: " + empName);
		System.out.println("Emp age: " + empAge);

	}
}
