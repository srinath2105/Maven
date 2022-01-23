package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	public Configuration_Reader() throws Throwable {
		File f = new File("src//test//java//com//adactin//properties//Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	
	public String getBrowser() {
		String browser = p.getProperty("browser");
		//String browser = "chrome";
		return browser;
	}
	
	public String getUrl() {
		String url = p.getProperty("url");
		//String url = "https://adactinhotelapp.com/";
		return url;
	}

}
