package print;

import java.awt.Window;

public class GarbegeCollection {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			new Window(null);
		}

		System.out.println("before garbage collection = " + Window.getWindows().length);
		System.gc();
		System.out.println("after garbage collection = " + Window.getWindows().length);

		String i = null; // value of i is null
		System.gc();
		System.out.println(i); // value of i after gc

		String j = "faruq"; // value of i is null
		System.gc();
		System.out.println(j); // value of i after gc
	}

}
