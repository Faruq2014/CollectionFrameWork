package Properties;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicCSS {
	public static WebDriver driver;
	public static String browser = null;

	public static void main(String[] args) throws InterruptedException {
		setBrowser();
		TestPopUp();
	}

	public static void setBrowser() {
		PropertiesFileForCSSselenium.getProperties();
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	}

	public static void TestPopUp() throws InterruptedException {
		// Open browser

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		// driver = new ChromeDriver();

		driver.get("https://www.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(".desktop-free-trial-container")).click();
		// It will return the parent window name as a String
		driver.quit();
		PropertiesFileForCSSselenium.setProperties(); // just printing a message that from
		// properties class that result:pass.
	}
}
