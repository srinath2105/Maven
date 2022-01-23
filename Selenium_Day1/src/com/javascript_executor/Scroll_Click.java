package com.javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Click {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Day1\\Driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		 
		 JavascriptExecutor java= (JavascriptExecutor) driver; //javascriptexecutor syntax
		 java.executeScript("arguments[0].value ='Mobile'", search); // used to sendkeys to a textbox using javascriptexecutor
		 
		 Thread.sleep(2000);
		 WebElement s_Button = driver.findElement(By.id("nav-search-submit-button"));
		 java.executeScript("arguments[0].click();", s_Button); //arguments[0].click(); used to click webelement,where arguments[0] is predefined
		 
		 Thread.sleep(2000);
		 java.executeScript("window.scrollBy(0,3000)"); //scroll by (horizontal value, vertical value). it scrolls down here
		 
		 Thread.sleep(2000);
		 java.executeScript("window.scrollBy(0,-1500)"); //if vertical value is in negative '-1500', it will scroll up
		 
		 Thread.sleep(2000);
		 WebElement m21 = driver.findElement(By.xpath("(//span [contains (text() , 'Samsung Galaxy M21')]) [4]"));
		 java.executeScript("arguments[0].scrollIntoView();", m21); //used to scroll to the selected webelement
		 
		 Thread.sleep(2000);
		 java.executeScript("window.scroll(0,0)");
		 
		 Thread.sleep(3000);
		 driver.close();		 
		 
	}
}
