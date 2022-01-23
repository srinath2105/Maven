package com.robot_windowhandles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Day1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Actions a = new Actions(driver);
		WebElement close_Button = driver.findElement(By.xpath("//button [@class='_2KpZ6l _2doB4z']"));
		Thread.sleep(2000);
		a.click(close_Button).build().perform();
		
		WebElement top_offers = driver.findElement(By.xpath("(//div [@class='xtXmba']) [1]"));
		a.contextClick(top_offers).build().perform();
		Thread.sleep(2000);
		Robot r = new Robot(); //robot syntax to perform keyboard actions
		//keyPress=method, keyEvent=class, VK=virtualkey
		
		r.keyPress(KeyEvent.VK_DOWN); // it presses down key in keyboard
		r.keyRelease(KeyEvent.VK_DOWN); // it releases down key in keyboard
		r.keyPress(KeyEvent.VK_ENTER); // it presses enter key in keyboard
		r.keyRelease(KeyEvent.VK_ENTER); // it releases enter key in keyboard
		Thread.sleep(2000);
		
		WebElement groceries = driver.findElement(By.xpath("(//div [@class='xtXmba']) [2]"));
		a.contextClick(groceries).build().perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);		
		Thread.sleep(2000);
		
		a.contextClick(groceries).build().perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement mobiles = driver.findElement(By.xpath("(//div [@class='xtXmba']) [3]"));
		a.contextClick(mobiles).build().perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);		
		
		Set<String> all_tabs = driver.getWindowHandles(); //getWindowHandles()- used to get id's of all tabs opened in browser, its return type is Set<String>
		for (String string : all_tabs) { //opening foreach loop to print the titles of all tabs opened in browser
			
			System.out.println(driver.switchTo().window(string).getTitle());
			
		}
		
		String s = "Mobile Phones Online at Best Prices in India";
		for (String string : all_tabs) { //opening another foreach loop to switch into another tab
			
			if (driver.switchTo().window(string).getTitle().equalsIgnoreCase(s)) { 
				//if statement used as to check if any tab title equals specified tab title ref name 's'
				//driver.switchTo().window(string).getTitle() = gets all tab titles
				//equalsIgnoreCase(s) = checks if any tab title matches with 's' without case sensitivity
				break;
			}
		}
		
		
		Thread.sleep(4000);
		driver.quit();
		
	}

}
