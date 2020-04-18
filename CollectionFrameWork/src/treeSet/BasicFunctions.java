package treeSet;

import java.util.TreeSet;

public class BasicFunctions {
/*under lying data structure is--> Balance Tree
 *Duplicate is not allowed
 * insertion order not applicable
 * all elements will be inserted under some condition.
 * Heterogeneous objects are not allowed.(only on treeSet and treeMap) no compile time error
 * but run time error is class cashed exception.
 *  null is allowed. only once. 
 */
	public static void main(String[] args) {
		
TreeSet t = new TreeSet(); // default DNSO
/*
 * if we use default constructor objects must be homogeneous and comparable. 
 * otherwise we will get Class Cast Exception
 */
t.add("A"); // Homogeneous data only for treeSet 
t.add("a");
t.add("B");
t.add("Z");
t.add("L");
//t.add(new Integer(10));// heterogeneous data, no compile time error
 // but run time error CCE
//t.add(null); 
/*for empty set as a first element null insertion is possible.
 * for noempty set null insertion is not possible. we will 
 * get runtime exception : null pointer exception.
 * 
 */
System.out.println(t);
// print in alphabetical order. small a uni code is 97. bigger A=65
// bigger number letter print or save after.



	}

}
