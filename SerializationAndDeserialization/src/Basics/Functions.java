package Basics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Functions {

	public static void main(String[] args) throws Throwable {
		String path = System.getProperty("user.dir");
		Employee e1 = new Employee();
		FileOutputStream fos = new FileOutputStream(path + "/src/Basics/xyz.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);

		FileInputStream fis = new FileInputStream(path + "/src/Basics/xyz.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e2 = (Employee) ois.readObject();
		System.out.println("username is " + e2.userName);
		System.out.println("Password is " + e2.passord);
		System.out.println("salary is " + e2.salary);
	}

}

class Employee implements Serializable {
	int userName = 10;
	String passord = "abc";
	double salary = 2000;

}