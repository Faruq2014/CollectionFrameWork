package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BasicIteratorLoop {

	public static void main(String[] args) {
		HashMap m = new HashMap(); // default constructor
		m.put("Faruq", 750); // put method
		m.put("Farid", "eight hundred"); // heterogeneous allow
		m.put("Khaled", null); // null is allow for value
		m.put("Mahmud", null); // null is allow for values more than one
		m.put("Shahin", 855); //
		// m.put(null, 900); // no compile time or run time error but it will not print
		m.put(101, "Murad"); // heterogeneous allow
		System.out.println("The HashMap is " + m); // printing inside of {}
		System.out.println("The HashMap size is " + m.size());

		Set s1 = m.entrySet(); // key+value= entry. collection of entry set is called map.
		System.out.println("The HashMap set is " + s1); // printing inside of []
		Iterator itr = s1.iterator();

		while (itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey() + "..." + m1.getValue());
			if (m1.getKey().equals("Faruq")) {
				m1.setValue(100);
			}
			if (m1.getKey().equals("Mahmud")) {
				Set m2 = (Set) m1.getValue();
				System.out.println("mahmud value is " + m2);
			}
		}
		System.out.println("after iterator Hash Map set is " + m);

		// lop instead of iterator.
		System.out.println("printing from loop>>>>>>>>>>>>>>>>>>>>>");

		for (Object i : s1) {
			System.out.println("key&Value " + i);
			// System.out.println("key&Value " + ((Entry) i).getKey() + "..." + ((Entry)
			// i).getValue());

		}
		System.out.println("printing from loop>>>>>>>>>>>>>>>>>>>>>");

		for (Object i : m.keySet()) {
			System.out.println("printing only key " + i);

		}
		System.out.println("printing from loop>>>>>>>>>>>>>>>>>>>>>");
// printing values
		for (Object i : m.values()) {
			System.out.println("printing only values " + i);
		}
	}

}
