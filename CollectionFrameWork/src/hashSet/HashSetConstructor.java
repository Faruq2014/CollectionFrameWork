package hashSet;

import java.util.HashSet;

public class HashSetConstructor {
/*
 * default constructor capacity is 16.
 * default fill ratio or load factor is 0.75
 * means if 75% is filled up then a new hash set will be created.
 * 
 */
	public static void main(String[] args) {
		HashSet h1= new HashSet();// default constructor
		HashSet h2= new HashSet(20);// user define size with .75 ratio
		HashSet h3= new HashSet(20,  90);//define size is 20, ratio is.90
		//HashSet h4= new HashSet(collection c); for any type of collection objects.
		
	}

}
