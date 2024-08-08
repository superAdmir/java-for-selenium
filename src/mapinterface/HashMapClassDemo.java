package mapinterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapClassDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(4, "John");
		hm.put(1, "James");
		hm.put(2, "Peter");
		hm.put(3, "Alvin");
		hm.put(3, "James"); // Does not allow duplicate
		hm.put(null, "James1"); // Take only one null key
		hm.put(null, "James2");
		hm.put(6, null); // Alow multiple null values
		hm.put(7, null);
		System.out.println("Hash map: " + hm);
		System.out.println("For loops");
		for (Map.Entry<Integer, String> data : hm.entrySet()) {
			System.out.println("Key is: " + data.getKey() + " " + "Value is: " + data.getValue());
		}
	}

}
