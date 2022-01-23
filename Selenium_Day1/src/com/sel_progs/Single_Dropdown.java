package com.sel_progs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Day1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//a [text ()='Create New Account']"));
		ele.click();
		
		Thread.sleep(3000);
		
		WebElement ele1 = driver.findElement(By.name("firstname"));
		ele1.sendKeys("Sri");
		
		WebElement ele2 = driver.findElement(By.name("lastname"));
		ele2.sendKeys("Nath");
		
		WebElement ele3 = driver.findElement(By.xpath("//input [@name='reg_email__']"));
		ele3.sendKeys("12345");
		
		WebElement ele4 = driver.findElement(By.xpath("//input [@name='reg_passwd__']"));
		ele4.sendKeys("Test@123");
		
		WebElement ele5 = driver.findElement(By.id("day"));
		Select d = new Select(ele5);
		d.selectByValue("5");
		
		WebElement ele6 = driver.findElement(By.id("month"));
		Select m = new Select(ele6);
		m.selectByIndex(1);
		
		WebElement ele7 = driver.findElement(By.id("year"));
		Select y = new Select(ele7);
		y.selectByVisibleText("1995");
		
		WebElement ele8 = driver.findElement(By.xpath("(//input [@class='_8esa']) [2]"));
		ele8.click();
		
		WebElement ele9 = driver.findElement(By.name("websubmit"));
		ele9.click();
		
		Thread.sleep(7000);
		driver.close();
		
		
	}

}
