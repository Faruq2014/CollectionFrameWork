package Basics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class StaticVariable {

	public static void main(String[] args) throws Throwable {

		String path = System.getProperty("user.dir");
		Faruq e1 = new Faruq();
		FileOutputStream fos = new FileOutputStream(path + "/src/Basics/xyz.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);

		FileInputStream fis = new FileInputStream(path + "/src/Basics/xyz.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Faruq e2 = (Faruq) ois.readObject();
		System.out.println("username is " + e2.userName);
		System.out.println("Password is " + e2.passord);
		System.out.println("salary is " + e2.salary);
		System.out.println("address is " + e2.adress);
	}

}

class Faruq implements Serializable {
	int userName = 10;
	double salary = 2000;
	static String passord = "abc"; // it will print the result without participating serialization.
	static transient String adress = "alexandria"; // transient modifier will not stop printing because it is staic.
	/*
	 * Static variable is not part of object state. As a result it will not
	 * participate in serilization. As a result declaring a static variable as a
	 * transient will not make any difference.
	 * 
	 */
}
