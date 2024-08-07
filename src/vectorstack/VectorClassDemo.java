package vectorstack;

import java.util.Vector;

public class VectorClassDemo {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<Integer>();
		vector.add(13);
		vector.add(34);
		vector.add(34);
		vector.add(null);

		System.out.println("Vector list: " + vector);

		// vector.clear();
		System.out.println("Clear all elements from the list: " + vector);

		System.out.println("Returns the current capacity of this vector: " + vector.capacity());

		// Iterate

		System.out.println("For loop");
		for (int i = 0; i < vector.size(); i++) {
			System.out.println(vector.get(i));
			System.out.println(" ");

		}

	}

}
