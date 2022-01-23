package com.runnerclass;

import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import com.baseclass.Base_Class1;

public class Runner_Class extends Base_Class1{
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
//		System.setProperty("webdriver.chrome.driver", 
//				System.getProperty("user.dir") +"\\Driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		
//		driver.get("https://www.facebook.com/");
//		
//		WebElement create_New = driver.findElement(By.xpath("//a [ text() = 'Create New Account']"));
//		clickOnElement(create_New);
//		
//		Thread.sleep(2000);
//		WebElement text = driver.findElement(By.xpath("//div [ @class = 'mbs _52lq fsl fwb fcb']"));
//		getTextOfElement(text);
//		
//		WebElement fname = driver.findElement(By.name("firstname"));
//		sendKeyToElement(fname,"Sri");
//		
//		WebElement lname = driver.findElement(By.name("lastname"));
//		sendKeyToElement(lname, "Nath");
		
		driver = getBrowser("chrome");
		getUrl("https://www.amazon.in/");
//		WebElement multi = driver.findElement(By.xpath("(//select) [6]"));
//		
//		dropDown("selectbyvalue", multi, "1");
//		dropDown("selectbyindex", multi, "3");
//		dropDown("selectbyindex", multi, "2");
//		
//		multiDropDown("getoptions");
//		
//		navTo("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		
//		WebElement ele = driver.findElement(By.xpath("//a [text ()='Create New Account']"));
//		ele.click();
//		Thread.sleep(3000);
//		
//		WebElement ele5 = driver.findElement(By.id("day"));
//		dropDown("byvalue", ele5, "5");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		
		scrollBy(0, 3000);
		
		getTitle();
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
