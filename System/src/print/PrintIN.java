package print;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class PrintIN {
	static String projectPath = System.getProperty("user.dir");

	public static void main(String[] args) throws IOException {
		File f = new File(projectPath + "/src/print/abc.txt");
		System.out.println("file exist = " + f.exists());
		InputStream i = new FileInputStream(f);
		System.setIn(i);
		System.out.println("OK");
	}

}
