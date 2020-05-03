package Properties;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class CreateAndStoreOnXML {

	public static void main(String[] args) {
		OutputStream os = null;
		Properties prop = new Properties();
		String projectPath = System.getProperty("user.dir");
		prop.setProperty("Name", "Faruq");
		prop.setProperty("City", "Alexandria");
		prop.setProperty("County", "Fairfax");
		prop.setProperty("State", "VA");

		try {

			os = new FileOutputStream(projectPath + "/src/Properties/config.xml");
			prop.storeToXML(os, "personal info");
		} catch (Exception e) {

		}

	}

}
