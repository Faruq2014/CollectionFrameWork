package objectGraph;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*All object which is reachable by an object will be 
 * serialize automatically. This group of object is called object graph.
 * In object graph every object should be serializable. 
 * If any of the object is non serializable we will get 
 * run time exception saying not serializable exception. 
 * 
 */
public class ObjectGraph {

	public static void main(String[] args) throws Throwable {
		String path = System.getProperty("user.dir");
		// String projectPath = System.getProperty("user.dir");

		Dog d1 = new Dog();
		FileOutputStream fos = new FileOutputStream(path + "/src/objectGraph/abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);

		FileInputStream fis = new FileInputStream(path + "/src/objectGraph/abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		System.out.println(d2.c.r.j);
	}

}

class Dog implements Serializable {
	Cat c = new Cat();
}

class Cat implements Serializable {
	Rat r = new Rat();
}

class Rat implements Serializable {
	int j = 20;
}