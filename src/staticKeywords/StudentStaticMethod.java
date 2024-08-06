package staticKeywords;

public class StudentStaticMethod {

	String stuName;
	int rollNum;
	static String collegeName = "ABC";

	static void staticMethod() {
		collegeName = "XYZ";
		System.out.println("Static Method Called");
	}

	public StudentStaticMethod(String newName, int newRollNum) {
		stuName = newName;
		rollNum = newRollNum;
	}

	public void display() {
		System.out.println(stuName);
		System.out.println(rollNum);
		System.out.println(collegeName);
	}
}
