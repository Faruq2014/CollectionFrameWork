package TreeMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class StudentConstructor3 {
	int id;
	String name;
	String adress;
	int roll;

	public StudentConstructor3(int id, String name, String adress, int roll) {
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
		StudentConstructor3 khaled = new StudentConstructor3(101202333, "khaled Chowdhury", "Arlington", 101);
		StudentConstructor3 Farid = new StudentConstructor3(201202222, "Farid Sikder", "Alexandria", 201);
		StudentConstructor3 Arif = new StudentConstructor3(301303333, "Arif Khan", "Washington DC", 301);
		StudentConstructor3 Mahmud = new StudentConstructor3(40440444, "Mahmud Khalad", "WoodBridge", 401);
		StudentConstructor3 Shimul = new StudentConstructor3(50150555, "Shimul Molla", "Fairfax", 501);
		Map map = new HashMap();
		map.put(571457181, khaled);
		map.put(2022341234, Farid);
		map.put(2023455432, Arif);
		map.put(703245785, Mahmud);
		map.put(971457181, Shimul);
		System.out.println("printing from Hash Map");
		System.out.println(map);
		System.out.println("Converting Hash Map to tree map");
		TreeMap Tmap = new TreeMap(map);
		System.out.println("printing from tree map");
		System.out.println(Tmap);

		System.out.println("<<<<<<<<< Tree Map Function>>>>>>>>>>>>>");
		Set s1 = Tmap.entrySet();
		Iterator itr = s1.iterator();

		while (itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey() + "..." + m1.getValue());

		}
		System.out.println("headMap: " + Tmap.headMap(2023455432));
		System.out.println("First entry is: " + Tmap.firstEntry());
		// Getting the value of 971457181
		System.out.println("The Value 0f 971457181 is : " + Tmap.get(971457181));

		// Print Properties details
		System.out.println("Current Properties: " + Tmap.toString());

		// Using entrySet() to get the set view
		System.out.println("The set is: " + Tmap.entrySet());

	}
}
