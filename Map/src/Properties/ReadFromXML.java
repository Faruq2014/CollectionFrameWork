package Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ReadFromXML {
	static Properties prop = new Properties();
	static String projectPath = System.getProperty("user.dir");

	public static void main(String[] args) {

		getProperties();
		setProperties();
		getProperties();
	}

	public static void setProperties() {
		OutputStream os = null;
		try {

			os = new FileOutputStream(projectPath + "/src/Properties/config.xml");
			prop.setProperty("Country", "US");
			prop.storeToXML(os, "personal info change by Faruq");
		} catch (Exception e) {

		}
	}

	public static void getProperties() {

		try {

			InputStream input = new FileInputStream(projectPath + "/src/Properties/config.xml");
			prop.loadFromXML(input);
			String keyString = prop.getProperty("Name");
			System.out.println(keyString);

			// to print all the info from the file.
			Set set = prop.entrySet();
			Iterator itr = set.iterator();
			while (itr.hasNext()) {
				Map.Entry string = (Map.Entry) itr.next();
				System.out.println(string.getKey() + ": " + string.getValue());

			}

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}

}
