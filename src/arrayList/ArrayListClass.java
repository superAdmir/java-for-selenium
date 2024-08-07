package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {

	public static void main(String[] args) {

		ArrayList arrList = new ArrayList();
		arrList.add(23);
		arrList.add("ABCD");
		arrList.add('c');
		System.out.println("Array list " + arrList);

		ArrayList<Integer> arrList1 = new ArrayList<Integer>();
		arrList1.add(12);
		arrList1.add(34);
		arrList1.add(56);
		arrList1.add(56);
		arrList1.add(56);
		System.out.println("Integer array list: " + arrList1);

		// Access an element in an ArrayList
		System.out.println("Access an element in an ArrayList: " + arrList1.get(2));
		// Update an element
		System.out.println("Update an element from: " + arrList1.set(0, 15));
		System.out.println("Update an element to: " + arrList1);
		// Count no of elements
		System.out.println("Count number of elements: " + arrList1.size());
		// Insert an element in-between
		arrList1.add(1, 67);
		System.out.println("Insert an element in-between:" + arrList1);

		// Traverse (Iterate) elements in an Arraylist
		// 1. For loop
		System.out.println("For loop:");
		for (int i = 0; i < arrList1.size(); i++) {
			// System.out.println(arrList1.get(i));
			System.out.print(arrList1.get(i));
			System.out.print(" ");

		}

		// 1. Using iterator
		System.out.println(" ");
		System.out.println("Iterator:");
		Iterator itr = arrList1.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
			System.out.print(" ");

		}

	}

}
