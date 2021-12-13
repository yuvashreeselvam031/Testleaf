package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperties {

	public static void main(String[] args) throws IOException {
		//step1 : setup the path for properties file
		FileInputStream fis = new FileInputStream("./data/config.properties");
		//step2 : create object for properties
		Properties prop = new Properties();
		//step 3 : load the properties file
		prop.load(fis);
		//step 4 : to read a particular property -> username
		String property = prop.getProperty("username");
		System.out.println(property);
		String property2 = prop.getProperty("password");
		System.out.println(property2);
		
		
	}
}
