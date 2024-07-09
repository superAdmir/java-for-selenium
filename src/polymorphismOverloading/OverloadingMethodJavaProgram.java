package polymorphismOverloading;

public class OverloadingMethodJavaProgram {

	public void add(int a, int b) {
		int c = a + b;
		System.out.println("Overloading method: " + c);
	}

	// Number of parameters
	public void add(int a, int b, int c) {
		int d = a + b + c;
		System.out.println("Number of parameters method: " + d);
	}

	// Data type of parameters
	public void add(double a, int b, int c) {
		double d = a + b + c;
		System.out.println("Data type of parameters method: " + d);
	}

	// Sequence of Data type of parameters
	public void add(int a, int b, double c) {
		double d = a + b + c;
		System.out.println("Sequence of data type of parameters method: " + d);
	}

}
