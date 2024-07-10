package constructor;

public class ParameterizedConstructor {

	public String empName;
	public int empID;

	public ParameterizedConstructor(String newName, int newID) {
		empName = newName;
		empID = newID;

	}

	public void display() {

		System.out.println(empName);
		System.out.println(empID);
	}

	public static void main(String[] args) {

		ParameterizedConstructor obj = new ParameterizedConstructor("James", 12345);
		ParameterizedConstructor obj1 = new ParameterizedConstructor("Peter", 54321);
		obj.display();
		obj1.display();

	}

}
