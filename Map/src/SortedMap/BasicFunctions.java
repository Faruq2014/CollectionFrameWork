package SortedMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class BasicFunctions {

	/*
	 * sorted Map is the child class of Map.
	 * 
	 * if we want to represent a group of individual objects as a key pair value,
	 * where duplicates are not allowed, and insertion order is preserved based on
	 * some condition and based on key values then we should go for Sorted map.
	 * 
	 * duplicates are not allowed: if you enter duplicate; there will be no compile
	 * time error or runtime error. But boolean add method will return false.
	 * 
	 * insertion order is preserved: based on some condition. Heterogeneous objects
	 * are allowed. null insertion is possible. implements serealizable and
	 * cloneable.
	 * 
	 * 
	 * Sorted set specific methods: first(); last(); headMap(103); that means who is
	 * before 103 such as 100, 101,102 tailMap(104); that means who is greater then
	 * 104 ->104,105,110.. subMap(103,110) that means in between 103 and 110->
	 * 104,105,..109. Comparator() return null Default nature of sorting order: for
	 * number-->Ascending order for String-->Alphabetical order.
	 */

	public static void main(String[] args) {
		SortedMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1, "Faruq");
		map.put(2, "Fabiha");
		map.put(3, "faiza");
		map.put(4, "Rayan");
		System.out.println(map);
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		System.out.println(map.headMap(3));
		System.out.println(map.tailMap(2));
		System.out.println(map.subMap(2, 4));
		System.out.println(map.comparator());
	}

}
