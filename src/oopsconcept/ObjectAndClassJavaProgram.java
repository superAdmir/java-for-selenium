package oopsconcept;

public class ObjectAndClassJavaProgram {
	// Attributes of this class
	int n1 = 5;
	int n2 = 7;
	static int result;
	String firstName = "First name";
	String lastName = "Last name";

	// Method of this class
	public void addition() {
		result = n1 + n2;
	}

	public static void main(String[] args) {
		// Create a object of class
		ObjectAndClassJavaProgram obj = new ObjectAndClassJavaProgram();
		// Multiple objects of one class, change the attribute values in one object
		// without affecting the attribute values in the other
		ObjectAndClassJavaProgram obj1 = new ObjectAndClassJavaProgram();
		// Access to class attributes using object
		obj1.n1 = 10; // Modify attribute values (set the value) / Override existing values
		obj1.n2 = 20;
		// Call class method using object
		obj.addition();
		obj1.addition();
		System.out.println(result);
		// Multiple attributes
		ObjectAndClassJavaProgram obj2 = new ObjectAndClassJavaProgram();
		System.out.println("Name: " + obj2.firstName + " " + obj2.lastName);
	}
}
