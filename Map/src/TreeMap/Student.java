package TreeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Student {
	int id;
	String name;
	String adress;
	int roll;

	public Student(int id, String name, String adress, int roll) {
		this.id = id;
		this.adress = adress;
		this.name = name;
		this.roll = roll;
	}

	// Used to print student details in main()
	public String toString() {
		return this.roll + " " + this.id + " " + this.name + " " + this.adress;
	}

	public static void main(String[] args) {
		Student khaled = new Student(101202333, "khaled Chowdhury", "Arlington", 101);
		Student Farid = new Student(201202222, "Farid Sikder", "Alexandria", 201);
		Student Arif = new Student(301303333, "Arif Khan", "Washington DC", 301);
		Student Mahmud = new Student(40440444, "Mahmud Khalad", "WoodBridge", 401);
		Student Shimul = new Student(50150555, "Shimul Molla", "Fairfax", 501);
		TreeMap map = new TreeMap();
		map.put(571457181, khaled);
		map.put(2022341234, Farid);
		map.put(2023455432, Arif);
		map.put(703245785, Mahmud);
		map.put(971457181, Shimul);
		System.out.println(map);

		khaled = (Student) map.get(571457181);
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
