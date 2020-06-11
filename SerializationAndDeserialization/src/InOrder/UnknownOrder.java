package InOrder;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class UnknownOrder {

	public static void main(String[] args) throws Throwable {
		Khaled1 k1 = new Khaled1();
		Arif1 a1 = new Arif1();
		Shahin1 s1 = new Shahin1();

		String path = System.getProperty("user.dir");

		FileOutputStream fos = new FileOutputStream(path + "/src/InOrder/xyz.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(k1); // the order of serialize is very important.
		oos.writeObject(a1);
		oos.writeObject(s1);

		FileInputStream fis = new FileInputStream(path + "/src/InOrder/xyz.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Object o = ois.readObject(); // if we do not know the order we can use
		if (o instanceof Shahin1) { // instance of method.
			Shahin1 s2 = (Shahin1) o;

		} else if (o instanceof Arif1) {
			Arif1 a2 = (Arif1) o;

		} else if (o instanceof Khaled1) { // khaled is last one. we are not following the order.
			Khaled1 k2 = (Khaled1) o;

		} else {
			System.out.println("object does not exist.");
		}

		System.out.println(a1.a); // we can print any order.
		System.out.println(s1.a);
		System.out.println(k1.a);
	}

}

class Khaled1 implements Serializable {
	String a = "khaled";
}

class Arif1 implements Serializable {
	String a = "arif";
}

class Shahin1 implements Serializable {
	String a = "shahin";
}