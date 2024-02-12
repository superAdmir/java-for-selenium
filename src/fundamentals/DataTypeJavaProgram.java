/* <Admir Satara>
 * Datatype Java Program
 */
package fundamentals;

public class DataTypeJavaProgram {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = (10 > 2);
		boolean b4 = (1 > 2);
		System.out.println("The value of b1: " + b1);
		System.out.println("The value of b2: " + b2);
		System.out.println("The value of b3: " + b3);
		System.out.println("The value of b4: " + b4);

		char ch1 = 'a';
		char ch2 = 'B';
		char ch3 = 65;
		System.out.println("The value of ch1: " + ch1);
		System.out.println("The value of ch2: " + ch2);
		System.out.println("The value of ch3: " + ch3);

		byte by1 = 100; // max range 127
		byte by2 = -120; // min range - 128
		System.out.println("The value of by1: " + by1);
		System.out.println("The value of by2: " + by2);

		short by3 = 130; // range 32767 to -32767
		System.out.println("The value of by3: " + by3);

		int i = 123456891; // long number range -2147483648 to 2147483648 (32 bit)
		System.out.println("The value of i: " + i);

		long j = 1234568915; // big number range -9223372036854775808 to 9223372036854775808 (64 bit)
		System.out.println("The value of j: " + j);

		float f = 10.5f; // 32 bit (0.0)
		System.out.println("The value of f: " + f);

		double d = 123.23; // 64 bit (0.0)
		System.out.println("The value of d: " + d);

		int i1 = (int) 122.23; // cast from double number (122.23) to int number (122) == downcasting
		System.out.println("The value of i1: " + i1);

		double j1 = (double) 100; // cast from integer number (100) to double number (100.0) == upcasting
		System.out.println("The value of j1: " + j1);
	}
}
