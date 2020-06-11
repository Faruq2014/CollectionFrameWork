package property;

import java.util.Properties;

public class SetProperty {

	public static void main(String[] args) {
		System.out.println("Before setProperties method = " + System.getProperty("user.dir"));
		Properties p = System.getProperties();
		// p.put("user.dir", "this/is/the/new/user/dir/path");
		// this the way you can set new path for any file. be careful about it.
		p.put("user.dir", "C:/Users/Faruq/WorksSpace/System");
		System.setProperties(p);
		System.out.println("After setProperties method = " + System.getProperty("user.dir"));

		// same thing we use in selenium.
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		// driver = new ChromeDriver();
	}

}
