package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Indexing {

	public static void main(String[] args) {
		  List<Integer> list = new ArrayList<Integer>();  
	        list.add(46);  
	        list.add(67);  
	        list.add(24);  
	        list.add(16);  
	        list.add(8);  
	        list.add(12);  
System.out.println("Value of maximum element from the collection: "+Collections.max(list));  
System.out.println("Value of minimum element from the collection: "+Collections.min(list));
	Collections.reverseOrder();
	System.out.println(list);
	Collections.addAll(list, 100,300);
	System.out.println(list);
	Collections.shuffle(list);
	Collections.sort(list);
	System.out.println(list);


	
	}

}
