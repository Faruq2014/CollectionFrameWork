package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		List <String>l =new ArrayList<String>();

		l.add("Faruq");
		System.out.println(l.containsAll(l));
		System.out.println("element added by list "+l);
		Collections.addAll(l, "Khaled","Farid");
		System.out.println("element after added by Collections "+l);
		String [] l1 = {"Arif","Kamal"};
		Collections.addAll(l, l1);
		System.out.println("element after added by Collections l1 "+l);
		Collections.shuffle(l);
		System.out.println("after suffeling "+l);
        Collections.sort(l);
		System.out.println("after sorting "+ l);

	}

}
