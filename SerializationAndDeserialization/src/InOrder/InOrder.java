package InOrder;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class InOrder {

	public static void main(String[] args) throws Throwable {

		Khaled k1 = new Khaled();
		Arif a1 = new Arif();
		Shahin s1 = new Shahin();

		String path = System.getProperty("user.dir");

		FileOutputStream fos = new FileOutputStream(path + "/src/InOrder/xyz.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(k1); // the order of serialize is very important.
		oos.writeObject(a1);
		oos.writeObject(s1);

		FileInputStream fis = new FileInputStream(path + "/src/InOrder/xyz.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Khaled k2 = (Khaled) ois.readObject(); // we must follow serialization order
		Arif a2 = (Arif) ois.readObject(); // to deserialize. otherwise java.lang.ClassCastException:
		Shahin s2 = (Shahin) ois.readObject();

		System.out.println(a2); // we can print any order.
		System.out.println(s2);
		System.out.println(k2.a);
	}

}

class Khaled implements Serializable {
	int a = 10;
}

class Arif implements Serializable {

}

class Shahin implements Serializable {

}