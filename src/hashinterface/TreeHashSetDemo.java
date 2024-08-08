package hashinterface;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeHashSetDemo {

	public static void main(String[] args) {

		TreeSet<Integer> hs = new TreeSet<>();
		hs.add(12);
		hs.add(43);
		hs.add(4);
		hs.add(54);
		hs.add(54); // Does not allow duplicates
//		hs.add(null);
//		hs.add(null); Does not allow null

		System.out.println("Hash list: " + hs);

		System.out.println("For loop:");
		for (Integer itr : hs) {
			System.out.println(itr);
		}

		ArrayList<Integer> ar = new ArrayList<>(hs);
		System.out.println("Getting particular element: " + ar.get(2));

	}

}
