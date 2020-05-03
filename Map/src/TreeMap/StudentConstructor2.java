package TreeMap;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class StudentConstructor2 {
	int id;
	String name;
	String adress;
	int roll;

	public StudentConstructor2(int id, String name, String adress, int roll) {
		this.id = id;
		this.adress = adress;
		this.name = name;
		this.roll = roll;
	}

	// Used to print student details in main()
	public String toString() {
		return this.roll + " " + this.id + "  " + this.name + "  " + this.adress;
	}

	public static void main(String[] args) {
		StudentConstructor2 khaled = new StudentConstructor2(101202333, "khaled Chowdhury", "Arlington", 101);
		StudentConstructor2 Farid = new StudentConstructor2(201202222, "Farid Sikder", "Alexandria", 201);
		StudentConstructor2 Arif = new StudentConstructor2(301303333, "Arif Khan", "Washington DC", 301);
		StudentConstructor2 Mahmud = new StudentConstructor2(40440444, "Mahmud Khalad", "WoodBridge", 401);
		StudentConstructor2 Shimul = new StudentConstructor2(50150555, "Shimul Molla", "Fairfax", 501);
		TreeMap map = new TreeMap(new MyComparator2());
		map.put(571457181, khaled);
		map.put(2022341234, Farid);
		map.put(2023455432, Arif);
		map.put(703245785, Mahmud);
		map.put(971457181, Shimul);
		System.out.println(map);

		khaled = (StudentConstructor2) map.get(571457181);
		System.out.println(khaled);
		Object s1 = map.get(571457181);
		System.out.println(s1);
		Set set1 = map.entrySet();
		Iterator itr = set1.iterator();
		while (itr.hasNext()) {
			Map.Entry stuInfo = (Map.Entry) itr.next();
			System.out.println(stuInfo.getKey() + ":  " + stuInfo.getValue());
			// stuInfo.getKey();

		}
	}
}

class MyComparator2 implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s2.compareTo(s1); // descending order.
	}

}
