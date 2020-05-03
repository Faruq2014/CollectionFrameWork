package Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFileForCSSselenium {
	static Properties prop = new Properties();
	static String projectPath = System.getProperty("user.dir");

	public static void main(String[] args) {
		getProperties();
		setProperties();

	}

	public static void getProperties() {

		try {
			// Properties prop = new Properties();
			// String projectPath = System.getProperty("user.dir");
			InputStream input = new FileInputStream(projectPath + "/src/Properties/config.properties");
			// if you use System class; it will better possibility to work when you transfer
			// this project.
			// InputStream input1 = new
			// FileInputStream("C:/Users/Faruq/WorksSpace/Map/src/Properties/config.properties");
			// if you use one forward slash / it will work on mac and windows.
			// InputStream input2 = new FileInputStream(
			// "C:\\Users\\Faruq\\WorksSpace\\Map\\src\\Properties\\config.properties");
			// if you use two backward slash \\ it will work only windows.
			prop.load(input);
			String browserString = prop.getProperty("browser");
			System.out.println(browserString);
			DynamicCSS.browser = browserString; // this line is for selenium project.
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
