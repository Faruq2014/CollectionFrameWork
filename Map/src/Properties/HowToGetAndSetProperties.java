package Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class HowToGetAndSetProperties {
	static Properties prop = new Properties();
	static String projectPath = System.getProperty("user.dir");

	public static void main(String[] args) {
		getProperties();
		setProperties();

	}

	public static void getProperties() {

		try {
			InputStream input = new FileInputStream(projectPath + "/src/Properties/config.properties");
			prop.load(input);
			String browserString = prop.getProperty("browser");
			System.out.println(browserString);

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}

	public static void setProperties() {
		try {
			OutputStream output = new FileOutputStream(projectPath + "/src/Properties/config.properties");
			prop.setProperty("Result", "Pass");
			prop.store(output, "Tester: Faruq");
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}
}
