package hashinterface;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<>();
		hs.add(12);
		hs.add(43);
		hs.add(4);
		hs.add(54);
		hs.add(54); // Does not allow duplicates
		hs.add(null);
		hs.add(null);

		System.out.println("Hash list: " + hs);

		System.out.println("For loop:");
		for (Integer itr : hs) {
			System.out.println(itr);
		}

		ArrayList<Integer> ar = new ArrayList<>(hs);
		System.out.println("Getting particular element: " + ar.get(2));

	}

}
