package org.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Driver {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Day1\\Driver\\chromedriver.exe");
		WebDriver browser= new ChromeDriver();
		browser.get("https://www.youtube.com/");
		browser.manage().window().maximize();
		Thread.sleep(5000);
		String title = browser.getTitle();
		System.out.println("Title of the page is    =" +title);
		browser.navigate().to("https://www.amazon.in/");
		browser.navigate().back();
		String currentUrl = browser.getCurrentUrl();
		System.out.println("Current URL of the page is    =" +currentUrl);
		browser.get("https://www.flipkart.com/");
		Thread.sleep(7000);
		browser.navigate().to("https://mail.google.com/mail");
		Thread.sleep(5000);
		browser.navigate().back();
		Thread.sleep(3000);
		String pagesource = browser.getPageSource();
		System.out.println(pagesource);
		browser.close();
		
	}

}
