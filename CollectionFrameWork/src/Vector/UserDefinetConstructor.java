package Vector;

import java.util.Vector;

public class UserDefinetConstructor {

	public static void main(String[] args) {
		Vector v = new Vector(12);
		System.out.println(v.capacity()+" is the default capacity");
		for(int i=1; i<=12; i++) {
			v.addElement(i);
		}
		System.out.println(v.capacity()+"  still is the default capacity");
		v.add("Bismillah");
		System.out.println("adding 13th element "+v.capacity()+ " is new capp is cc*2");
		System.out.println(v);
	}

}
