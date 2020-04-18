package LinkedHashSet;

import java.util.LinkedHashSet;

public class BasicFunctions {
/*LinkedHashSet is the child class of HashSet.
 * it is the combination hashTable and linkedSet
 *  duplicates are not allowed:
 * if you enter duplicate; there will be no compile time error
 * or runtime error. But boolean add method will return false.
 *  
 * insertion order is  preserved:
 * 
 * Heterogeneous objects are allowed.
 * null insertion is possible.
 * implements serealizable and cloneable.
 * since based on hash code, search operation is easy/
 * if search is the main operation and order is
 * important then LinketHashSet is the best.
 * LinketHashSet is best for cashe memory based application. 
 * 
 * 
 */
 
	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("Faruq");
		lhs.add("Khaled");
		lhs.add(100); // Heterogeneous allow
		lhs.add(null); // null value allow
		lhs.add("a");
		System.out.println(lhs.add("Faruq"));
		// no compile or run time error but it will return false.
		// that means no duplicate allowed.
		System.out.println(lhs);
		// insertion order is  preserved:
		// it will print the object based on the way it was inserted.
		
	}

}
