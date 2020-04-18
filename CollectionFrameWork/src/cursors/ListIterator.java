package cursors;

import java.util.LinkedList;

public class ListIterator {
	
	/*
	 * 
	 * List Iterator is a newer program that means its applicable
	 * for java 1.00 version and newer. Most powerful cursor.
	 * we can perform retrieve and remove operation. 
	 * able to read
	 * able to retrieve
	 * able to remove
	 * can  perform replace operation or set operation.
	 * can  perform addition perform.
	 * List iterator are Bidirectional cursor means only can go next 
	 * can go backward or previous.
	 * List Iterator is direct child of Iterator. so it inherit all the iterator methods.
	 * List iterator has total 9 methods.
	 * Forward Function:
	 * public boolean hasNext();
	 *  public object next();
	 *  public int  nextIndex();
	 *  backward Function:
	 *  public boolean hasPrevious();
	 *  public object previous();
	 *  public int  previousIndex();
	 *  
	 * public void remove();
	 * public void set(object new);
	 * public void add(object new);
	 * 
	 * Problem:
	 * List iterator is not an universal cursor.
	 * it is only applicable for list implemented classes. 
	 */

	public static void main(String[] args) {
		
LinkedList ll = new LinkedList();// linkedlist only have two type of constructor, empty or with object collection.
ll.add("Faruq");
ll.add("Farid");
ll.add("Khaled");
ll.add("Selim");
ll.add("Arif");
int l1=ll.size();
System.out.println(l1);
System.out.println(ll);
// ListIterator 
java.util.ListIterator ltr = ll.listIterator(); //constructor
while(ltr.hasNext()) { // hasNext method
	String s=(String) ltr.next();
	if(s.equals("Selim")){ltr.remove();}
	else if(s.equals("Faruq")) {ltr.remove();}//remove function
	else if(s.equals("Khaled")) {ltr.add("Kamal");}
	// add function, kamal will add after khaled.
	else if(s.equals("Farid")) {ltr.set("Shimul");} // replace function
}
System.out.println("after hasNext function");
System.out.println(ll);
//Shimul, Khaled, Kamal, Arif
System.out.println(l1);


while (ltr.hasPrevious()) {
	
	String ss =(String) ltr.previous();
	if(ss.equals("Khaled")) {ltr.remove();}
	else if(ss.equals("Kamal")) {ltr.add("Habib");}
	else if(ss.equals("Arif")) {ltr.add("Murad");}
	else if(ss.equals("Shimul")) {ltr.set("Mahmud");}

}


System.out.println("after hasPrevious function");
System.out.println(ll);


	}

}
