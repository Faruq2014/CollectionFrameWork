package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListConstructor {
/*
 * Default capacity of ArrayList is 10;
 * if you go more then 10 with default constructor then
 * Automatically compiler will create new constructor capacity
 * will be 2*3/2+1 of cc(current constructor) that means first one 
 * is 10 and then 16->25 and so on. As soon as new one created 
 * old one is subjected to garbage collection.  
 */
	public static void main(String[] args) {
		//default constructor 
		List l = new ArrayList(); 
		//capacity is 10 and default incrimental policy 2*3/2+1cc
		ArrayList l1 = new ArrayList<Integer >();
		// default constructor with specific data type
		//capacity is 10 and default incrimental policy 2*3/2+1cc
		ArrayList l2 = new ArrayList(1000);
		//user define constructor with capacity of 1000
		// incrimental policy is 2*3/2+1cc
		
		
		//ArrayList l3= new ArrayList(Collection c);
		// create an equivalent ArrayList object
		// for the given collection
		System.out.println(l);
		System.out.println(l1);
		System.out.println(l2);
				
	}

}
