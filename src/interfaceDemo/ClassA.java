package interfaceDemo;

public class ClassA implements InterfaceA, InterfaceB {

	public static void main(String[] args) {

	}

	@Override
	public void interfaceBMethod() {
		System.out.println("Interface B method called");

	}

	@Override
	public void display() {
		System.out.println("Display method called");
	}

	@Override
	public void interfaceAMethod() {
		System.out.println("Interface A method called");

	}

}
