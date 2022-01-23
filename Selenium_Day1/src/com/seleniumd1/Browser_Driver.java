package com.seleniumd1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Driver {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Day1\\Driver\\chromedriver.exe");
	
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.close();
	}

}
