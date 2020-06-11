package print;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintOut {
	static String projectPath = System.getProperty("user.dir");

	public static void main(String[] args) throws Throwable {

		System.out.println("Assalamualikum");
		System.err.println("This is an error message.");
		// to write or print to a file or any other device directly.
		System.setErr(new PrintStream(new FileOutputStream(projectPath + "/src/print/xyz.txt")));
		System.setOut(new PrintStream(new FileOutputStream(projectPath + "/src/print/abc.txt")));
		System.out.println("Assalamualikum");
		System.out.println("i am printing directly on abc.txt");
		System.out.println("i am khaled");

		System.err.println("this error message is not going to print on console");
	}

}
