package Properties;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class BasicMethods {
	/*
	 * The properties object contains key and value pair both as a string.
	 * Properties is a subclass of Hashtable. Recompilation is not required .if the
	 * information is changed from a properties file: you don't need to recompile
	 * the java class. just refresh is enough. if you change any information from
	 * source code you must recompile, rerun and restart the server. It is used to
	 * store information which is to be changed frequently.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Properties capitals = new Properties();
		Set states;
		String str;

		capitals.put("Illinois", "Springfield");
		capitals.put("Missouri", "Jefferson City");
		capitals.put("Washington", "Olympia");
		capitals.put("California", "Sacramento");
		capitals.put("Indiana", "Indianapolis");

		// Show all states and capitals in hashtable.
		states = capitals.keySet(); // get set-view of keys
		Iterator itr = states.iterator();

		while (itr.hasNext()) {
			str = (String) itr.next();
			System.out.println("The capital of " + str + " is " + capitals.getProperty(str) + ".");
		}
		System.out.println();

		// look for state not in list -- specify default
		str = capitals.getProperty("Florida", "Not Found");
		System.out.println("The capital of Florida is " + str + ".");

	}

}
