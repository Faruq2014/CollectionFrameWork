package Vector;

import java.util.Vector;

public class VectorConstructor {
/*
 * Default capacity of vector is 10;
 * if you go more then 10 with default constructor then
 * Automatically compiler will create new constructor capacity
 * will be 2*cc(current constructor) that means first one 
 * is 10 and then 20->40->80 and so on. As soon as new one created 
 * old one is subjected to garbage collection.  
 */
	public static void main(String[] args) {
		//default constructor 
		Vector v = new Vector(); 
		//capacity is 10 and default incrimental policy 2*cc
		Vector v1 = new Vector<Integer >();
		// default constructor with specific data type
		//capacity is 10 and default incrimental policy 2*cc
		Vector v2 = new Vector(1000);
		//user define constructor with capacity of 1000
		// incrimental policy is 2*cc
		
		Vector v3 = new Vector(1000,5);
		//user define constructor with capacity of 1000
				// incrimental policy is 5 unit at a time.
		// start with 1000, then 
		//1005-->1010-->1015--.1020 and so on...
		//Vector v4= new Vector(Collection c);
		// create an equivalent Vector object
		// for the given collection.
		
		System.out.println(v.capacity());	
		System.out.println(v1.capacity());
		System.out.println(v2.capacity());
		System.out.println(v3.capacity());
		//System.out.println(v4.capacity());
	}

}
