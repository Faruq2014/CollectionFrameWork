package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class BasicFunctions {
	/*
	 * Java collection class is used exclusively with static methods that operate on or return collections. It inherits Object class.
     The important points about Java Collections class are:

     Java Collection class supports the polymorphic algorithms that operate on collections.
     Java Collection class throws a NullPointerException if the collections or class objects provided to them are null.
	 * Difference between collection and collections
•	Collection is an interface which can be used to represent a group of individual objects as a single entity.
•	Collections is a utility class present in java.util.package to define several utility methods (like sorting, searching for collection objects. 

	 */

	public static void main(String[] args) {
		List l =new ArrayList();
		l.add(3);
		l.add("Faruq");
		System.out.println(l.containsAll(l));
		System.out.println("element added by list "+l);
		Collections.addAll(l, 4, "Khaled", 5,"Farid");
		System.out.println("element after added by Collections "+l);
		String [] l1 = {"Arif","Kamal"};
		Collections.addAll(l, l1);
		System.out.println("element after added by Collections l1 "+l);
		int [] l2 = {7,8};
		Collections.addAll(l, l2);
		System.out.println("element after added by Collections l2 "+l);
		//Collections.sort(l);
		Collections.reverse(l);
		
		




	}

}
