package mapinterface;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapClassDemo {

	public static void main(String[] args) {

		TreeMap<Integer, String> hm = new TreeMap<>();
		hm.put(4, "John");
		hm.put(1, "James");
		hm.put(2, "Peter");
		hm.put(3, "Alvin");
		hm.put(5, "James");
		// hm.put(null, "James1"); //Does not allow null key
		// hm.put(null, "James2");
		hm.put(6, null); // Alow multiple null values
		hm.put(7, null);
		System.out.println("Hash map: " + hm);
		System.out.println("For loops");
		for (Map.Entry<Integer, String> data : hm.entrySet()) {
			System.out.println("Key is: " + data.getKey() + " " + "Value is: " + data.getValue());
		}
	}

}
