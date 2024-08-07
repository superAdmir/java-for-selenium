package vectorstack;

import java.util.Stack;

public class StackClassDemo {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();
		stack.add("Element1");
		stack.add("Element2");
		stack.add("Element3");
		stack.add("Element3");

		System.out.println("Stack elements: " + stack);
		System.out.println("Initial Stack capacity: " + stack.capacity());
		System.out.println(
				"Looks at the object at the top of this stack without removing it from the stack: " + stack.peek());
		System.out.println(
				"Removes the object at the top of this stack and returns that object as the value of this function: "
						+ stack.pop());

	}

}
