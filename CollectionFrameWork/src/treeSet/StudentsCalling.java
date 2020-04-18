package treeSet;

import java.util.TreeSet;

public class StudentsCalling {

	
	public static void main(String[] args) {
		Students s1 = new Students("Shimul", 101); 
		Students s2 = new Students("Kamal", 102);
		Students s3 = new Students("Habib", 103);
		Students s4 = new Students("Habib2", 104);
		Students s5 = new Students("Shahin", 105);
		Students s6 = new Students("Razu", 106);
		Students s7 = new Students("Abu", 107);
		Students s8 = new Students("Sarfarz", 108);
		Students s9 = new Students("Awolad", 109);
		Students s10 = new Students("Arif", 110);
		Students s11 = new Students("Arif", 111); // duplicate won't take
		
		TreeSet t = new TreeSet();
		t.add(s11);
		t.add(s10);
		t.add(s9);
		t.add(s8);
		t.add(s7);
		t.add(s6);
		t.add(s5);
		t.add(s4);
		t.add(s3);
		t.add(s2);
		t.add(s1);
		System.out.println(t);
		
		
		TreeSet t1 = new TreeSet(new mycomparator6());
		t1.add(s10);
		t1.add(s9);
		t1.add(s8);
		t1.add(s7);
		t1.add(s6);
		t1.add(s5);
		t1.add(s4);
		t1.add(s3);
		t1.add(s2);
		t1.add(s1);
		System.out.println(t1);
		System.out.println("size print by name "+t1.size());
		System.out.println("size print by id "+t.size());
		
	}
	

}
