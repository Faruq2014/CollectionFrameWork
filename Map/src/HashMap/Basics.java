package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Basics {
	/*
	 * Under lying data structure of Hash map is hash table. insertion order is not
	 * preserved , it is based on hash code of keys. Duplicate keys are not allowed
	 * but value can be duplicated. Heterogeneous data are allowed. Null is allowed
	 * but only one time for key, many time for values . hash map implements
	 * Serialization and colon able interface but Not random access. Hash map is
	 * best for if frequent operation is search operation.
	 * 
	 */
	public static void main(String[] args) {
		HashMap m = new HashMap(); // default constructor
		m.put("Faruq", 750); // put method
		m.put("Farid", "eight hundred"); // heterogeneous allow
		m.put("Khaled", null); // null is allow for value
		m.put("Mahmud", null); // null is allow for values more than one
		m.put(null, 855); // null is allow for key only one time
		m.put(null, 900); // no compile time or run time error but it will not print
		m.put(101, "Murad"); // heterogeneous allow
		System.out.println(m);
		System.out.println(m.put("Faruq", 1000) + " retun old value.");
		// already present: old value will be replaced with new value. but returns
		// old value.

		// Set method
		Set s = m.keySet(); // only return key object
		System.out.println(s);
		Collection s1 = m.values();
		System.out.println(s1); // only printing values
		Set s3 = m.entrySet(); // printing each entry set.
								// means key and value.
		System.out.println(s3);

	}

}
