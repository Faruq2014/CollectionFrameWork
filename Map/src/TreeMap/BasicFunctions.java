package TreeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class BasicFunctions {
	/*
	 * under lying data structure is--> RED->BLAck Tree Tree Duplicate is not
	 * allowed insertion order not applicable all elements will be inserted under
	 * some condition based on keys only. Heterogeneous objects are not
	 * allowed.(only on treeSet and treeMap) no compile time error if we following
	 * DSNO then it must be homogeneous and comparable. if we following our own
	 * order by using comparator then heterogeneous is allowed. but run time error
	 * is class cashed exception. null is allowed not allow for keys after 1.6
	 * version. null is allow for values.
	 */
	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		;
		map.put(101, "Faruq");
		map.put(102, "Fabiha");
		map.put(103, "faiza");
		map.put(104, "Rayan");
		map.put(105, "Rafid");
		System.out.println(map);

		System.out.println("<<<<<<<<< Tree Map Function>>>>>>>>>>>>>");
		Set s1 = map.entrySet();
		Iterator itr = s1.iterator();

		while (itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey() + "..." + m1.getValue());

		}
		map.remove(105);
		System.out.println("After remove function");
		System.out.println(s1);

		System.out.println("<<<<<<<<< Sorted Map Function>>>>>>>>>>>>>");
		// Returns key-value pairs whose keys are less than the specified key.
		System.out.println("headMap: " + map.headMap(103));
		// Returns key-value pairs whose keys are greater than or equal to the specified
		// key.
		System.out.println("tailMap: " + map.tailMap(103));
		// Returns key-value pairs exists in between the specified key.
		System.out.println("subMap: " + map.subMap(102, 104));

		System.out.println("<<<<<<<<< Navigable Map Function>>>>>>>>>>>>>");
		// Maintains descending order
		System.out.println("descendingMap: " + map.descendingMap());
		// Returns key-value pairs whose keys are less than or equal to the specified
		// key.
		System.out.println("headMap: " + map.headMap(102, true));
		// Returns key-value pairs whose keys are greater than or equal to the specified
		// key.
		System.out.println("tailMap: " + map.tailMap(102, true));
		// Returns key-value pairs exists in between the specified key.
		System.out.println("subMap: " + map.subMap(100, false, 102, true));
	}

}
