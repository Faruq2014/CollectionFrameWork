package Basics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FinalVariable {

	public static void main(String[] args) throws Throwable {
		String path = System.getProperty("user.dir");
		Khaled e1 = new Khaled();
		FileOutputStream fos = new FileOutputStream(path + "/src/Basics/xyz.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);

		FileInputStream fis = new FileInputStream(path + "/src/Basics/xyz.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Khaled e2 = (Khaled) ois.readObject();
		System.out.println("username is " + e2.userName);
		System.out.println("username1 is " + e2.userName1);
		System.out.println("Password is " + e2.passord);
		System.out.println("salary is " + e2.salary);
		System.out.println("address is " + e2.adress);

	}

}

class Khaled implements Serializable {
	final int userName = 10; // participating directly with value.
	final transient int userName1 = 10;// transient will have no use.
	double salary = 2000;
	transient String passord = "abc";
	static String adress = "alexandria";
	/*
	 * Final Variable will be participating in serialization directly. by their
	 * value. Due to this declaring a final variable as transient there is no use or
	 * impact.
	 */
}
