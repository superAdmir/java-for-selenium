package constructor;

public class OverloadingConstructor {

	public String empName;
	public int empID;
	public int age;

	public OverloadingConstructor(String newName, int newID) {
		empName = newName;
		empID = newID;

	}

	public OverloadingConstructor(String newName, int newID, int newAge) {
		empName = newName;
		empID = newID;
		age = newAge;

	}

	public void display() {

		System.out.println(empName);
		System.out.println(empID);
		System.out.println(age);
	}

	public static void main(String[] args) {

		OverloadingConstructor obj = new OverloadingConstructor("James", 12345);
		OverloadingConstructor obj1 = new OverloadingConstructor("Peter", 54321, 45);
		obj.display();
		obj1.display();

	}
}
