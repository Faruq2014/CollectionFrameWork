package sortedSet;

public class BasicFunctions {
	
	/*sortedSet is the child class of Set.
 * Set is the direct child of the collection interface . Set interface does not have any 
 * own methods. set use collection interface method. 
 * if we want to represent a group of individual objects as a
 * single entity, where duplicates are not allowed, and 
 * insertion order is  preserved based on some condition then we should go for 
 * SortedSet. 
	 * 
	 *  duplicates are not allowed:
	 * if you enter duplicate; there will be no compile time error
	 * or runtime error. But boolean add method will return false.
	 *  
	 * insertion order is  preserved:
	 * based on some condition
	 * Heterogeneous objects are allowed.
	 * null insertion is possible.
	 * implements serealizable and cloneable.
	 * 
	 * 
	 * Sorted set specific methods:
	 * first();
	 * last();
	 * headSet(103); that means who is before 103 such as 100, 101,102
	 * tailSet(104); that means who is greater then 104 ->104,105,110..
	 * subSet(103,110) that means in between 103 and 110-> 104,105,..109.
	 * Comparator() return null
	 * Default nature of sorting order:
	 * for number-->Ascending order
	 * for String-->Alphabetical order. 
	 */

	public static void main(String[] args) {
		

	}

}
