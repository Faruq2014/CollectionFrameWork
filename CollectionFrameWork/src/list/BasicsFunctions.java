package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BasicsFunctions {
/*
 * List is the direct child of collection interface so all the classes is happily allowed to use by 
 * list class.
 * duplicates are allowed
 * Insertion order is preserved means we will retrieve data same way we inserted them.
 */
	public static void main(String[] args) {
List<String> al= new ArrayList<String>();
al.add("Faruq");  
al.add("Farid");  
al.add("Khaled");  
al.add(1,"Arif");  
System.out.println("An element at 2nd position: "+al.get(2));  
for(String s:al){  
 System.out.println(s+" -->printing in the same order we added them.");  
}
al.add(null); // null is allowed
System.out.println(al.get(4)+"  value is allowed");
al.add("Faruq"); // duplicated are allowed.
for(String s:al){  
	 System.out.println(s+" -->duplicated are allowed..");  
	}
al.set(5, "Kamal"); // updating the record
System.out.println("An element at 6th position is updating: "+al.get(5)); 

System.out.println("the size of the list is "+al.size());
System.out.println("is element  empty "+al.isEmpty());
System.out.println("the size of the list is "+al.size());
System.out.println("Deleting the 5th element "+al.remove(4));
System.out.println("the size of the list is "+al.size());
//al.clear(); //to delete all the elements.
// retain
List<String> c= new ArrayList<String>();
c.add("Faruq");
c.add("Khaled");
// difference between clear and retain is .. retain will delete rest of them.
al.retainAll(c);
System.out.println("the size of the list is after retain "+al.size());
for(String s1:c){  
	 System.out.println(s1+" -->after retaining..");  
	}

//System.out.println(al.get(4));// out of index exception
Collections.addAll(al,  "Shimul","Habib");
//List is the direct child of Collection interface. All the collection interface child 
//inherit common Collections class.
System.out.println("after adding collectiond "+al);
Collections.sort(al);

System.out.println("after sorting collections " +al);


	}

}
