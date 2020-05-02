package collections.propertiesclass;

import java.util.Enumeration;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

/**
 * Properties is a subclass of Hashtable. It is used to maintain lists of values
 * in which the key and the value, both are String.
 */

public class PropertiesExample {

	public static void main(String[] args) {

		Properties properties = new Properties();

		properties.setProperty("name", "jhon");
		properties.setProperty("gender", "male");
		properties.setProperty("email", "jhon@xyz.com");
		properties.setProperty("password", "12345");
		properties.setProperty("address", "mumbai");

		// Iterating properties using Enumeration
		@SuppressWarnings("unchecked")
		Enumeration<String> enums = (Enumeration<String>) properties.propertyNames();
		while (enums.hasMoreElements()) {
			String key = enums.nextElement();
			String value = properties.getProperty(key);
			System.out.println(key + " : " + value);
		}
		System.out.println("\n*****######*****\n");

		// Iterating properties using For-Each
		Set<String> keys = properties.stringPropertyNames();
		for (String key : keys) {
			System.out.println(key + " : " + properties.getProperty(key));
		}
		System.out.println("\n*****######*****\n");

		// Iterating properties using Entry Set
		Set<Entry<Object, Object>> entries = properties.entrySet();
		for (Entry<Object, Object> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println("\n*****######*****\n");

		// Iterating properties using Java 8 forEach method
		properties.forEach((key, value) -> System.out.println(key + " : " + value));

	}

}
