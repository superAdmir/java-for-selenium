package polymorphismOverloading;

public class TestClass {

	public static void main(String[] args) {
		OverloadingMethodJavaProgram obj = new OverloadingMethodJavaProgram();
		// Static polymorphism or Overloading methods
		obj.add(3, 7);
		obj.add(2, 4, 7);
		obj.add(3.4, 6, 7);
		obj.add(3, 6, 3.5);
	}

}
