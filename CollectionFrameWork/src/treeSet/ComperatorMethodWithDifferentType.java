package treeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class ComperatorMethodWithDifferentType {
// write a program with Integer follow by decesending order.
	public static void main(String[] args) {
		
TreeSet t = new TreeSet(new MyComperator2()); // customize sorting order constructor
t.add(10);
t.add(0);
t.add(15);
t.add(20);
t.add(20); // duplicate value will not print but no compile or run time error. 
System.out.println(t);
	}
	

}

 class MyComperator2 implements Comparator {

 public int compare(Object obj1, Object obj2) {
	 Integer I1=(Integer)obj1;
	 Integer I2=(Integer)obj2;
	//return I1.compareTo(I2); //ascending
	//return -I1.compareTo(I2);  //Descending
	// return I2.compareTo(I1);//Descending
	 return -I2.compareTo(I1); //ascending
	
	 
}


}
