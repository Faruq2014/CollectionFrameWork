package treeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class StringBuffer1 {
	/* write a program with String Buffer follow by decesending order.
	// NDSO is not available for string buffer class, 
	// we must tostring StringBuffer objects to String Objects.
	 * StringBuffer is not comperable object.
	 * if you using own sorting insted of default sorting
	 * then objects need not to be comperable.
	 */
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new myComparator4());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("z"));
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("L"));
		System.out.println(t);

	}

}

class myComparator4 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		//return s1.compareTo(s2); // alphabetical order
		//return -s2.compareTo(s1); // alphabetical order
		
		//reverse order
		//return -s1.compareTo(s2); 
		return s2.compareTo(s1); 
	}
	
}
