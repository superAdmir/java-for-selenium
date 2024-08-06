package staticKeywords;

public class StudentStaticVariableMethodTestClass {

	public static void main(String[] args) {
		
		StudentStaticVariableMethod obj = new StudentStaticVariableMethod();
		obj.stuName = "James";
		obj.rollNum = 123456;
		System.out.println("Student name: " + obj.stuName);
		System.out.println("Student roll number: " + obj.rollNum);
		System.out.println("College name: " + StudentStaticVariableMethod.collegeName);
		
		StudentStaticVariableMethod obj1 = new StudentStaticVariableMethod();
		obj1.stuName = "Peter";
		obj1.rollNum = 12345;
		System.out.println("Student name: " + obj1.stuName);
		System.out.println("Student roll number: " + obj1.rollNum);
		System.out.println("College name: " + StudentStaticVariableMethod.collegeName);

	}

}
