package HashMap;

import java.util.HashMap;

public class BasicMerhods {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		System.out.println(map);
		// boolean is empty method.
		if (map.isEmpty()) {
			System.out.println("map is empty" + " lets fill it up");
			map.put(1, "Faruq");
			map.put(2, "Fabiha");
			map.put(3, "faiza");
			map.put(4, "Rayan");
			System.out.println(map.toString());
		}
		if (!map.isEmpty()) {
			System.out.println("map is not empty");
			System.out.println(map.size() + "is the size of the map");
			String F = map.get(3).toUpperCase();
			System.out.println(F);

		}
		System.out.println();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		// String replace method
		map.replace(1, "farid"); // replace old value
		System.out.println("after replacing faruq " + map);
		map.replace(1, "farid", "Faruq"); // replace old value with new value.
		System.out.println("after replacing farid " + map);
		map.replaceAll((k, v) -> "Faruq"); // replace all
		System.out.println("after replacing all " + map);

		System.out.println();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		// String remove method
		map.remove(1); // removing individual by key
		System.out.println("after removing 1 " + map);
		map.remove(2, "Faruq"); // key and value based remove.
		System.out.println("after removing 2 " + map);
		map.clear();
		System.out.println("after removing all " + map);
		System.out.println();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		if (map.isEmpty()) {
			System.out.println("map is empty" + " lets fill it up again");
			map.put(1, "Faruq");
			map.put(2, "Fabiha");
			map.put(3, "faiza");
			map.put(4, "Rayan");
			System.out.println(map.toString());
		}

		// String absent method
		map.putIfAbsent(5, "Rafid"); // if absent then put method.
		System.out.println("after absent method " + map);
		if (map.putIfAbsent(5, "Rafid") != null) {
			map.replace(5, "Azmi");
			System.out.println("after if map.putIfAbsen " + map);
		}

		String f = map.putIfAbsent(3, "faiza");
		if (!(f == null)) {
			System.out.println("faiza is present");
		}
		System.out.println();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		// boolean search or contain method key
		System.out.println(map.containsKey(3));
		if ((map.containsKey(3) == true)) {
			System.out.println(map.get(3) + " is present");
		}

		boolean b = map.containsKey(10);
		if (b == false) {
			System.out.println("key 10 is not present");
		} else {
			System.out.println("present");
		}

		// boolean search method key
		boolean b1 = map.containsValue("Faruq");
		if (b1 == true) {
			System.out.println(map.get(1));
			System.out.println("Faruq is present");
		}

		// String get method.
		String m = map.get(3);
		System.out.println(m);
		String m2 = map.getOrDefault(1, "do not know the actual string");
		System.out.println(m2);// it will print default value of key 1.

		// boolean equals()
		System.out.println("// boolean equals()");
		System.out.println(map.get(3).equals("faiza"));
		boolean f1 = map.get(1).contentEquals("Faruq");
		System.out.println(f1);
		if (f1 == true) {
			map.replace(1, "Shimul");
		}

		boolean f2 = map.get(2).equalsIgnoreCase("fabiha");
		if (f2 == true) {
			System.out.println(f2);
		}
		System.out.println(map);
	}

}
