package cursors;

import java.util.Vector;
import java.util.*;
public class Enumeration {
/*
 * Enumeration is a legasy program that means its ony applicable
 * for java 1.00 version and older. we can not use it for array list, set or so on.
 * we only can perform retrieve operation, we can not do remove operation. 
 * only has two methods:
 * has more elements
 * has next elements
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector v = new Vector(15,5);  // defined constructor
 for(int i= 1; i<=10; i++)
 {
	v.addElement(i);
	//System.out.println("the list is "+v); // just for fun
	//System.out.println("the list is "+i);
}
 System.out.println("the list is "+v);
 
 java.util.Enumeration e =  v.elements();
 
 while(e.hasMoreElements())
 {
	Integer k=(Integer) e.nextElement(); 
	 if(k%2==0) 
		 System.out.println(k); // printing even number
	
 }
 System.out.println(v);
// e.hasMoreElements();
//System.out.println(e.nextElement());
 
String innerClass= e.getClass().getName();

	}

}
