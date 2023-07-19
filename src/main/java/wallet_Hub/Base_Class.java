package wallet_Hub;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base_Class {
	
	String path;
	FileInputStream fis;
	Properties prop;
	
	public Base_Class() throws IOException {
		
		path = System.getProperty("user.dir")+"//config.properties";
		fis = new FileInputStream(path);
		prop = new Properties();
		prop.load(fis);
	}

}
