package linkedlist;

import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		LinkedList<String> llist = new LinkedList<String>();
		llist.add("C");
		llist.add("C++");
		llist.add("Java");
		llist.add("Python");
		llist.add(null);
		// Print values
		System.out.println("LinkedList: " + llist);

		llist.addFirst("C");
		System.out.println("Add first element to LinkedList: " + llist);

		llist.addLast("Java Script");
		System.out.println("Add last element to LinkedList: " + llist);

		llist.remove(4);
		System.out.println("Remove element from LinkedList: " + llist);

		System.out.println("Display only first element to LinkedList: " + llist.peek());

		llist.pollFirst();
		System.out.println("Remove first element to LinkedList: " + llist);

		// Iterate

		System.out.println("Foor loop");
		for (int i = 0; i < llist.size(); i++) {
			System.out.println(llist.get(i));

		}

	}

}
