package Properties;

import java.io.FileWriter;
import java.util.Properties;

public class CreatePropertiesFile {
	static String projectPath = System.getProperty("user.dir");

	public static void main(String[] args) throws Throwable {

		Properties prop = new Properties();

		prop.setProperty("Name", "Faruq");
		prop.setProperty("address", "Alexandria");
		prop.store(new FileWriter("info.properties"), projectPath + "/src/Properties/");
	}

}
