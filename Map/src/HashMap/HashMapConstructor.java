package HashMap;

import java.util.HashMap;

public class HashMapConstructor {

	public static void main(String[] args) {
		HashMap m1 = new HashMap();
		// default constructor capacity is integer 16
		// default constructor increment ratio is float.75

		HashMap m2 = new HashMap(20);
		// intial capacity is int 20.

		HashMap m3 = new HashMap(30, 90);
		// constructor capacity is integer 30
		// constructor increment ratio is .90

		// HashMap m3 = new HashMap(Map m);
		// you can convert any map object.

	}

}
