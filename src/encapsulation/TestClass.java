package encapsulation;

public class TestClass {

	public static void main(String[] args) {

		Student obj = new Student();
		obj.setStudentName("James");
		obj.setStudentRollNo(12345);
		obj.setStudentAge(18);

		System.out.println("Student name is: " + obj.getStudentName());
		System.out.println("Student roll number is: " + obj.getRoolNo());
		System.out.println("Student age is: " + obj.getStudentAge());
	}
}
