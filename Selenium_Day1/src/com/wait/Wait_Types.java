package com.wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class Wait_Types {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		WebElement create_New = driver.findElement(By.xpath("//a [text() ='Create New Account']"));
		create_New.click();
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Implicit wait
//		WebDriverWait w = new WebDriverWait(driver, 3); //explicit wait
		
		Wait w = new FluentWait (driver).pollingEvery(3, TimeUnit.SECONDS); //fluent wait
		WebElement fname = driver.findElement(By.name("firstname"));
		
//		w.until(ExpectedConditions.elementToBeSelected(fname)); //explicit wait
		fname.sendKeys("Sri");
		
//		WebDriverWait w = new WebDriverWait(driver, 3);
//		WebElement lname = driver.findElement(By.name("lastname"));
//		w.until(ExpectedConditions.visibilityOf(lname));
//		lname.sendKeys("Nath");
	}
}
