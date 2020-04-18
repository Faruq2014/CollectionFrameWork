package linkedList;

import java.util.LinkedList;

public class BasicFunctions {

	public static void main(String[] args) {
	LinkedList l1 = new LinkedList();
	l1.add("Faruq");
	l1.add(100);
	l1.add(null);
	l1.add("Java");
	l1.add("Faruq");
	System.out.println("linked list are  "+l1);
	// update
	l1.set(1, 200);
	l1.set(4, "software");
	System.out.println("after updating "+l1);
	// linkedlist specific method.
	l1.addFirst("Farid");
	System.out.println("after adding without indexing first one "+l1);
	l1.addLast("Khaled");
	System.out.println("after adding without indexing last one "+l1);
	l1.removeFirst();
	System.out.println("after removing without indexing first one "+l1);
    l1.removeLast();
    System.out.println("after removing without indexing last one "+l1);
	System.out.println("the first object in the linked list is  "+l1.getFirst());
	System.out.println("the last object in the linked list is  "+l1.getLast());
          
	}

}
