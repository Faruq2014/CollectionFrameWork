package cursors;

import java.util.ArrayList;


public class Iterator {
/*
 * 
 * Iterator is a newer program that means its applicable
 * for java 1.00 version and newer. we can  use it for array list, set or so on.
 * we can perform retrieve and remove operation. 
 * universal cursor, can implement to any type of collection classes.
 * able to read
 * able to retrieve
 * able to remove
 * only has three methods:
 * public boolean hasNext();
 *  public object Next();
 *  public boolean remove();
 *  problems: 
 * Enumeration and iterator are single direction cursor means only can go next. 
 * can not go backward or previous.
 * can not perform replace operation or set operation.
 * can not perform addition perform.
 * 
 */
	public static void main(String[] args) {
	
ArrayList l= new ArrayList(12);// define constructor; iterator is working with array list
for (int i=0; i<=10; i++){
l.add(i);
}
System.out.println("the array list is "+l);  // retrieve ability
        java.util.Iterator iter= l.iterator();  // iterator constructor; l is the collection object.
        while (iter.hasNext())             // hasNext method
        {
        	Integer k = (Integer) iter.next();  // next method
        	if(k%2==0)
        		System.out.println("print the even"+k);
        	else {iter.remove();}     // remove method. 
        }
        
        System.out.println("After removing the array list is "+l);
	}

}
