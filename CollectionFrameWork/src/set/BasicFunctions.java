package set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class BasicFunctions {
/*Set is the direct child of the interface collection.
 * if we want to represent a group of individual objects as a
 * single entity, where duplicates are not allowed, and 
 * insertion order is not preserved then we should go for 
 * set. 
 * Set interface doesn't contain any new methods. so we have to
 * use only Collection interface methods. 
 * 
 */
	public static void main(String[] args) {
	
Set set=  new HashSet(); 
set.add("Fima");
set.add("Nisa");
System.out.println(set);

//Collections common methods for set. 
Collections.addAll(set, 4, "Khaled", 5,"Farid");
System.out.println("element after added by Collections "+set);
String [] c = {"Arif","Kamal"};
Collections.addAll(set, c);
System.out.println("element after added by Collections c "+set);
int [] c2 = {7,8};
Collections.addAll(set, c2);
System.out.println("element after added by Collections c2 "+set);
//Collections.sort(l);

	}

}
