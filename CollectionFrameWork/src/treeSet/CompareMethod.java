package treeSet;

import java.util.TreeSet;

public class CompareMethod {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(); // default DNSO
		/*
		 * if we use default constructor objects must be homogeneous and comparable. 
		 * method is:
		 * obj1.compareTo(obj2);
		 * if the result is -negative it will insert and print after
		 * if the result is + positive it will insert and print before
		 * if the result is = or 0 it will give run time exception Class Cast Exception
		 * 
		 */
		t.add("A"); // Homogeneous data only for treeSet 
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("L");
		
		System.out.println("A".compareTo("a"));
		System.out.println("B".compareTo("Z"));
		System.out.println("Z".compareTo("L"));
		System.out.println("A".compareTo(null)); //java.lang.NullPointerException
		// because null is not comparable to the A
	}

}
