package Properties;

import java.io.FileReader;
import java.util.Properties;

public class Propreader {
	static Properties prop = new Properties();
	static String projectPath = System.getProperty("user.dir");

	public static void main(String[] args) {
		getProperties();

	}

	public static void getProperties() {

		try {
			FileReader reader = new FileReader(projectPath + "/src/Properties/config.properties");
			prop.load(reader);
			String browserString = prop.getProperty("Name");
			System.out.println(browserString);

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}

}
