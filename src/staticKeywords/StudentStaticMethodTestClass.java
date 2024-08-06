package staticKeywords;

public class StudentStaticMethodTestClass {

	public static void main(String[] args) {
		
		StudentStaticMethod.staticMethod();

		StudentStaticMethod obj = new StudentStaticMethod("James", 12345);
		StudentStaticMethod obj1 = new StudentStaticMethod("Peter", 123456);

		obj.display();
		obj1.display();
	}

}
