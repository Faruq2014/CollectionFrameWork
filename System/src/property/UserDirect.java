package property;

import java.util.Properties;

public class UserDirect {

	public static void main(String[] args) {
		System.out.println("Your System property for user");
		Properties p = System.getProperties();
		System.out.println(p.getProperty("user.name")); // property to get User's account name
		System.out.println(p.getProperty("user.home")); // property to get User's home directory
		System.out.println(p.getProperty("user.dir")); // property to get User's current working directory
		System.out.println(p.getProperty("os.name")); // property to get Operating system name
		System.out.println(p.getProperty("os.arch")); // property to get Operating system architecture
		System.out.println(p.getProperty("os.version")); // property to get Operating system version

	}

}
