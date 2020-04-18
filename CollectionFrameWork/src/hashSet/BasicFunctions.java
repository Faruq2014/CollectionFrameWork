package hashSet;

import java.util.HashSet;

public class BasicFunctions {
/*
 * duplicates are not allowed:
 * if you enter duplicate; there will be no compile time error
 * or runtime error. But boolean add method will return false. 
 * insertion order is not preserved:
 * object will preserved based on hash code of the object rights.
 * Heterogeneous objects are allowed.
 * null insertion is possible.
 * implements serealizable and cloneable.
 * since based on hash code, search operation is easy/
 * if search is the main operation then hashSet is the best.
 * random access is not easy. 
 * 
 */

	public static void main(String[] args) {
		
HashSet h = new HashSet();  //default constructor with .75 load factor.
h.add("Faruq");
h.add("Khaled");
h.add(100); // Heterogeneous allow
h.add(null); // null value allow
h.add("a");
System.out.println(h.add("Faruq"));
// no compile or run time error but it will return false.
// that means no duplicate allowed.
System.out.println(h);
// insertion order is not preserved:
// it will print the object based on hash code.
// which data will come firsr or last is tough to tell. 
	}

}
