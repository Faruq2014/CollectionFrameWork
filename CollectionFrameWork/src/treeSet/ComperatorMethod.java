package treeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class ComperatorMethod {
// write a program with Integer follow by decesending order.
	public static void main(String[] args) {
		
TreeSet t = new TreeSet(new MyComperator()); // customize sorting order constructor
t.add(10);
t.add(0);
t.add(15);
t.add(20);
t.add(20); // duplicate value will not print but no compile or run time error. 
System.out.println(t);
	}
	

}

 class MyComperator implements Comparator {

 public int compare(Object obj1, Object obj2) {
	 Integer I1=(Integer)obj1;
	 Integer I2=(Integer)obj2;
	 if(I1<I2)
		 return+1; // +1 means positve 
	 else if (I1>I2)
		 return -1;   //-1 means negative
	 else 
		 return 0;
	 
}


}
