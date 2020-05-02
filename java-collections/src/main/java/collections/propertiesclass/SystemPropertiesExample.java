package collections.propertiesclass;

import java.util.Properties;

public class SystemPropertiesExample {

	public static void main(String[] args) {

		Properties properties = System.getProperties();

		properties.forEach((key, value) -> System.out.println(key + " : " + value));

	}

}
