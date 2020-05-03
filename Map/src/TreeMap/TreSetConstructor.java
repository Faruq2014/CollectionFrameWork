package TreeMap;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeMap;

public class TreSetConstructor {
// there are 4 constructor for treeSet
	public static void main(String[] args) {
		// TreeMap map = new TreeMap(); // default constructor D.N.S.O

		// default natural sorting order.
		// for string alphabetical order, number ascending order.

		TreeMap map = new TreeMap(new MyComparator1()); // customized sorting order.
		// TreeMap m3= new TreeMap(SortedMap m); // pass any collection object
		// TreeMap t4= new TreeMap(Map s); // given sorted map object

		map.put(101, "Faruq");
		map.put(222, null); // duplicate value is allow.
		map.put(133, "khaled");
		map.put(345, "Rayan");
		map.put(13, "arif");
		map.put(13, "arif");// duplicate is key is not allow.
		map.put(545, "shimul");
		// map.put(null, "Murad"); // null is not allowed--> null pointer exception
		// map.put(shimul 879);// default constructor--> only homogeneous object.
		System.out.println(map); // printing ascending order by default based on key.

		// hash map method
		map.replace(1, "farid"); // replace old value
		Object m = map.get(133);
		System.out.println(m);

		// set method
		System.out.println(map.entrySet());
		System.out.println(map.keySet());
		Collection s3 = map.values();
		System.out.println(s3);

		// sorted map Method.

		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		System.out.println(map.headMap(345));
		System.out.println(map.tailMap(13));
		System.out.println(map.subMap(545, 345)); // depend on which constructor used. dnso or customize.
	}

}

class MyComparator1 implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s2.compareTo(s1); // descending order.
	}

}
