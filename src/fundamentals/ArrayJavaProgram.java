/* <Admir Satara>
 * Array Java Program
 */

package fundamentals;

public class ArrayJavaProgram {

	public static void main(String[] args) {
		onedArray();
		twodArray();
	}

	public static void onedArray() {
		// Declaration of array
		int a[];
		int[] b;
		// Instantiation of array
		a = new int[5];
		// Declaration and instantiation
		int c[] = new int[6];
		// How to add element
		c[0] = 10;
		c[1] = 123;
		c[2] = 23;
		c[3] = 34;
		// How to retrieve element
		System.out.println("Retrieve specific element: " + c[0]);
		// How to print array length
		System.out.println("Array length: " + c.length);
		// Hot to print all elements of array
		for (int i = 0; i < c.length; i++) {
			System.out.println("All elements of array: " + c[i]);
		}
		// Array literal
		int d[] = { 10, 12, 14, 16, 18, 20 };
		System.out.println("Retrieve specific element array literal: " + d[3]);
		System.out.println("Array literal length: " + d.length);
		for (int i = 0; i < d.length; i++) {
			System.out.println("All elements of array literal: " + d[i]);
		}
	}

	public static void twodArray() {
		// Declaration of array
		int a[][];
		int[][] b;
		// Instantiation of array
		a = new int[5][];
		// Declaration and instantiation
		int c[][] = new int[6][];
		// Array literal
		int d[][] = { { 2, 3 }, { 3, 5 }, { 5, 7 } };

		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 2; column++) {
				System.out.print(d[row][column] + " ");
			}
			System.out.println();
		}
	}
}
