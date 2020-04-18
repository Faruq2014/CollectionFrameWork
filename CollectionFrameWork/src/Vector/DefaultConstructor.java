package Vector;

import java.util.Vector;

public class DefaultConstructor {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println(v.capacity()+" is the default capacity");
		for(int i=1; i<=10; i++) {
			v.addElement(i);
		}
		System.out.println(v.capacity()+"  still is the default capacity");
		v.add("Bismillah");
		System.out.println("adding 11th element "+v.capacity()+ " is new cap");
		System.out.println(v);
	}

}
