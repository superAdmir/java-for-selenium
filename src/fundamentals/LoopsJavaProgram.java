/* <Admir Satara>
 * Loops Java Program
 */

package fundamentals;

public class LoopsJavaProgram {

	public static void main(String[] args) {
		forLoop();
		whileLoop();
		dowhileLoop();
		foreachLoop();
	}

	public static void forLoop() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("For loop: " + i);
		}
	}

	public static void whileLoop() {
		int i = 1;
		while (i <= 10) {
			System.out.println("While loop: " + i);
			i++;
		}
	}

	public static void dowhileLoop() {
		int i = 11;
		do {
			System.out.println("Do-while loop: " + i);
			i++;
		} while (i <= 10);
	}

	public static void foreachLoop() {
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		for (char item : vowels) {
			System.out.println("For-each loop: " + item);
		}
	}
}
