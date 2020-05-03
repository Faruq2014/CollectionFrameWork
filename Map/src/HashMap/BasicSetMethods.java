package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class BasicSetMethods {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>(5, 80);
		map.put("faruq", "faruq@dmail.com");
		map.put("fima", "fima@dmail.com");
		map.put("nisa", "nisa@dmail.com");
		System.out.println(map);

		// Set method. return type is Set
		// only has three method.
		// .entryset() Entry set is the child interface of map. key+value=entry.
		// it is also use.Map.Entry();
		// .keyset()
		// .values()

		/*
		 * .entryset() return key and value as a Set. data type is Set. Work simillar as
		 * regular hash map get method. it will print inside the []
		 */
		System.out.println(map.entrySet());
		Set s = map.entrySet();
		System.out.println(s);
		/*
		 * .keyset() return only key return value is Set. data type is Set with the
		 * regular hash map get method it is challenging only print key. it will print
		 * inside the []
		 */
		System.out.println(map.keySet());
		Set s1 = map.keySet();
		System.out.println(s1);
		/*
		 * .values() return only values. data type is Collection. With the regular hash
		 * map get method it is challenging only print values. it will print inside the
		 * []
		 */

		Collection s3 = map.values();
		System.out.println(s3);

	}
}
