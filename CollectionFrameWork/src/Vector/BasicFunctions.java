package Vector;

import java.util.Collections;
import java.util.Vector;

public class BasicFunctions {
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
	 * synchronized 
	 *  thread safe
	 *  Multiple thread can not run at a time, only one thread can run at a time 
	 *  as a result other thread have to wait. performance is not very well.
	 * best option is for frequent operation of retrievable. 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Vector v = new Vector(12,2);
		System.out.println(v.capacity()+" is the default capacity");
		for(int i=1; i<=12; i++) {
			v.addElement(i);
		}
		
		//vector specific method
		v.addElement("Bismillah");
		System.out.println(v);
		v.removeElement(2);
		System.out.println(v); //+ " 2nd index means 3 should be removed.");
		//v.removeAllElements();// remove all elements
		//System.out.println(v);
		System.out.println(v.firstElement()+" is the first element");
		
		// vector is one of the child of List interface
		// list specific method
		v.add("Alhamdullillah"); 
		System.out.println(v.get(0)+ "is the first element");//random accessC
		
		// vector is the indirect child of Collection interface.
		Collections.addAll(v, 23,"Inshallah");
		System.out.println(v);
		
		
	}

}
