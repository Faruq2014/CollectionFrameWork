package HashTable;

import java.util.Hashtable;

public class HasTableConstructor {

	public static void main(String[] args) {

		// Hashtable ht = new Hashtable();
// default constructor capacity is integer 11
// default constructor increment ratio is float.75

		Hashtable ht = new Hashtable(25);
// intial capacity is int 20. user define capacity

		// Hashtable ht = new Hashtable(30, 90);
// constructor capacity is integer 30
// constructor increment float ratio is .90

// Hashtable ht4 = new Hashtable(Map m);
// you can convert any map object.
		ht.put(new Temp(5), "A");
		ht.put(new Temp(2), "B");
		ht.put(new Temp(6), "C");
		ht.put(new Temp(15), "D");
		ht.put(new Temp(23), "E");
		ht.put(new Temp(16), "F");
		System.out.println(ht);

		/*
		 * how hash code work: intial capacity is 11. so hash tabe work o to 10 bucket.
		 * if it is o to 10 then it put the value in appropriate bucket. if it is more
		 * than 10 then it works 15%11=6, 23%11=1,16%11=5. if any object has same number
		 * than its put two number in the same bucket. then its print top to bottom and
		 * right to left.
		 */
	}

}

class Temp {
	int i;

	Temp(int i) {
		this.i = i;
	}

	public int hashCode() {
		return i;
// if we change the code 
		// return i % 9;
	}

	public String toString() {
		return i + " ";

	}
}
