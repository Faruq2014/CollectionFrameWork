package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class BasicFunctions {

	public static void main(String[] args) {
		/*
		 * the common rule for Array list interface.
		 * Re-sizable Arrays/ Growable arrays
		 * Duplicate objects are allowed
		 * Insertion order is preserved.
		 * null is allow
		 * Heterogeneous objects are allowed.
		 * Serializable 
		 *  cloneable 
		 *  random access.
		 *  not synchronized 
		 *  not thread safe
		 *  Multiple thread can run at a time, as a result performance is very well
		 * best option is for frequent operation of retrievable. 
		 * 
		 * 
		 * 
		 */
	
ArrayList L = new ArrayList();
L.add("Faruq");
L.add(100);  //Heterogeneous. 
L.add("Faruq");// allow duplicate
L.add(null); // allow null 
// insertion preserved means Faruq is saved on o index, 100 is 1st index, faruq is 2nd and so on.
System.out.println("insertion preserved Faruq is on 0th index )"+L.get(0));
// List specific methods
System.out.println("The array is "+ L);
L.remove(2);
System.out.println("after removing "+L);
L.add(2, "Khaled");
L.add(null);
L.add("Farid");
System.out.println("final array "+L);
// random access: it will take the same amount of time to access to any index.
System.out.println(L.get(0));
System.out.println(L.get(3));

Collections.addAll(L,  "Shimul","Habib",300);
// ArrayList is the indirect child of Collection interface. All the collection interface child 
// inherit common Collections class.
System.out.println("after adding collectiond "+L);
//Collections.sort(L); // not possible because of mixing data type.
	}

}
