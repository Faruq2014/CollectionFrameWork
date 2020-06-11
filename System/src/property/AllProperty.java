package property;

import java.util.Properties;
import java.util.Set;

public class AllProperty {

	public static void main(String[] args) {
		Properties properties = System.getProperties();
		Set<Object> keySet = properties.keySet();
		for (Object key : keySet) {
			System.out.println("key= " + key);
		}

	}

}
