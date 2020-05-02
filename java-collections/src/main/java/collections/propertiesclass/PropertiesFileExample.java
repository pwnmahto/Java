package collections.propertiesclass;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileExample {

	public static void main(String[] args) throws IOException {

		FileReader reader = new FileReader("database.properties");

		Properties properties = new Properties();
		properties.load(reader);

		System.out.println(properties.getProperty("user"));
		System.out.println(properties.getProperty("password"));

	}
}
