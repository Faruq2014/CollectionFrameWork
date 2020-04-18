package treeSet;

import java.util.Comparator;
import java.util.TreeSet;
//write a program with String follow by decesending order.
public class StringReverseOrder {

	public static void main(String[] args) {
	
TreeSet t = new TreeSet(new mycomperator3());
t.add("Faruq");
t.add("Khaled");
t.add("Shahin");
t.add("Arif");
t.add("Murad");
t.add("Habib");
System.out.println(t);//DNSO is alphabetical order.
	}

}


class mycomperator3 implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		String s1=(String) obj1;
		String s2=(String) obj2;
		
		//alphebatical order:
		//return s1.compareTo(s2);
		// this rule is by default provided by constructor.
		//return -s2.compareTo(s1);
		
		//Reverse Order:
		//return s2.compareTo(s1);
		          // switch the objects
		
		return -s1.compareTo(s2);
	           // just - sign will reverse the order
	
	
	}
	
}
