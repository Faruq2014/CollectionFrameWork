package treeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class StringBufferMix {
	/* write a program with String Buffer and String objects followed by accsending order where bigger 
	 * object print last or incremental order.
	// NDSO is not available for string buffer class, 
	// we must toString StringBuffer objects to String Objects.
	 * StringBuffer is not comparable object.
	 * if you using own sorting instead of default sorting
	 * then objects need not to be comparable.
	 */
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new myComparator5());
		t.add("A");
		t.add(new StringBuffer("abcd"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABC");
		t.add("A");  // duplicate; automatically removed
		System.out.println(t);

	}

}

class myComparator5 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		int l1=s1.length();
		int l2=s2.length();
		if(l1<l2) return -1;
		else if(l1>l2)	return +1;
		else
			return s1.compareTo(s2);
	}
	
}
