package encapsulation;

public class Student {

	// Can be only accessible in this class below
	private String studentName;
	private int studentRollNo;
	private int studentAge;

	public String getStudentName() {
		return studentName;
	}

	public int getRoolNo() {
		return studentRollNo;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentName(String newName) {

		studentName = newName;
	}

	public void setStudentRollNo(int newRoolNo) {

		studentRollNo = newRoolNo;
	}

	public void setStudentAge(int newAge) {

		studentAge = newAge;
	}

}
