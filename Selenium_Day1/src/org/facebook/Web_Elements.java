package org.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Elements {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Day1\\Driver\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		
		browser.get("https://www.facebook.com/");
		Dimension a = new Dimension(500, 500);
		browser.manage().window().setSize(a);
		
		Point p = new Point(400,100);
		browser.manage().window().setPosition(p);
		
		WebElement ele = browser.findElement(By.id("email"));
		ele.sendKeys("srinath@gmail.com");
		
		WebElement ele1 = browser.findElement(By.id("pass"));
		ele1.sendKeys("Password");
		
		WebElement ele2 = browser.findElement(By.name("login"));
		ele2.click();	
	}

}
