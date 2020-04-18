package linkedList;

import java.util.LinkedList;

public class LinkedListConstructor {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		LinkedList ll1 = new LinkedList<Integer>();
		ll1.add("Alhamdulillah");
		//LinkedList ll2 = new LinkedList(Collection c);
		// create an equivalent LinkedList object
				// for the given collection.
		System.out.println(ll.contains(ll));
		System.out.println(ll1.get(0));
	}

}
