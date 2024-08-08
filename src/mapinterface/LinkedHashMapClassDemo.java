package mapinterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClassDemo {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
		hm.put(4, "John");
		hm.put(1, "James");
		hm.put(2, "Peter");
		hm.put(3, "Alvin");
		hm.put(5, "James");
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
