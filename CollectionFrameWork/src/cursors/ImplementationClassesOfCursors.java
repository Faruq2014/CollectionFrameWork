package cursors;

import java.util.Vector;

public class ImplementationClassesOfCursors {
/*
 * Enumeration, Iterator and List Iterator are interface. Interface can not create 
 * object directly. then how does this interface create objects.
 * here is the implementation.
 * they create anonymous class object. those class are internally implemented.  
 */
	public static void main(String[] args) {
		Vector v = new Vector();
		java.util.Enumeration e=v.elements();
		java.util.Iterator itr=v.iterator();
		java.util.ListIterator ltr=v.listIterator();
		System.out.println(e.getClass().getName());
		System.out.println(itr.getClass().getName());
		System.out.println(ltr.getClass().getName());
		

	}

}
