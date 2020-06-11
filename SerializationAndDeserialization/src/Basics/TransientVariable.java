package Basics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientVariable {

	public static void main(String[] args) throws Throwable {

		String path = System.getProperty("user.dir");
		Employee1 e1 = new Employee1();
		FileOutputStream fos = new FileOutputStream(path + "/src/Basics/xyz.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);

		FileInputStream fis = new FileInputStream(path + "/src/Basics/xyz.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee1 e2 = (Employee1) ois.readObject();
		System.out.println("username is " + e2.userName);
		System.out.println("Password is " + e2.passord);
		System.out.println("salary is " + e2.salary);
		// System.out.println(e2.userName + e2.passord + e2.salary);
	}

}

class Employee1 implements Serializable {
	int userName = 10;
	transient String passord = "abc";
	double salary = 2000;
	/*
	 * transient is a modifier applicable only for variable. At the time of
	 * serialization if we do not want to save the value of a prticular variable to
	 * meet security constraints theen we should go for transient key word. At the
	 * time of serialization JVM ignores orginal value of transient variables and
	 * save default values to the file. Hence transient means not to serialize.
	 */
}
