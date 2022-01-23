package com.sel_progs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Screenshot {

public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Day1\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();

		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		
		WebElement create_New = driver.findElement(By.xpath("//a [@data-testid='open-registration-form-button']"));
		//basic xpath syntax "//a [@data-testid='open-registration-form-button']" to findElement "create new account button"
		create_New.click();
		
		Thread.sleep(3000);
		//delay for 3000ms - 3sec
		
		WebElement f_Name = driver.findElement(By.xpath("// input[contains(@placeholder,'First name')]"));
		//contains attribute xpath syntax = "// input[@placeholder='First name']", can also use (By.name("firstname"));
		f_Name.sendKeys("Sri");
		
		WebElement l_Name = driver.findElement(By.xpath("(//input [@class='inputtext _58mg _5dba _2ph-']) [2]"));
		//index xpath syntax = "(//input [@class='inputtext _58mg _5dba _2ph-']) [2]"
		l_Name.sendKeys("Nath");
		
		WebElement mob = driver.findElement(By.xpath("//input [@name='reg_email__']"));
		//basic xpath
		mob.sendKeys("srinath05@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("//input [@name='reg_passwd__']"));
		//basic xpath
		pass.sendKeys("Test@12345");
		
		WebElement gender = driver.findElement(By.xpath("//label [text() ='Male']"));
		//text xpath syntax = "//label [text() ='Male']"  (Button)
		gender.click();
		
		WebElement sign_Up = driver.findElement(By.xpath("//button [contains(text(), 'Sign Up')]"));
		//text contains xpath syntax = "//button [contains(text(), 'Sign Up')]" (Button)
		sign_Up.click();
		
		TakesScreenshot sh= (TakesScreenshot) driver;
		//TakeScreenshot interface import syntax, sh- refname
		//"narrowing" syntax for converting 'WebDriver' (small interface) into 'TakeScreenshot' (large interface)
		//here we are sending properties from interface 'WebDriver' through obj 'driver' into interface 'TakeScreenshot' to perform screenshot.
		
		File src = sh.getScreenshotAs(OutputType.FILE);
		//sh.getScreenshotAs(OutputType.FILE); syntax to perform screenshot with Returntype (ctrl+2 then l) File src, scr - refname
		//here we are using the properties from obj created in TakeScreenshot to perform screenshot with getScreenshotAs() method, since output is a file we are declaring OutputType.FILE in this method.
		//then we take return type using ctrl+2 then l 
		
		File des = new File("C:\\Users\\gsrin\\eclipse-workspace\\Selenium_Day1\\Screenshot\\SignUp.png");
		//creating destination path with given folder path, file name 'Signup' and format '.png' (only png format is supported)
		//here we are creating new object to store destination path, so that we can copy the screenshot taken in source path into destination path (folder) we created.
		
		FileUtils.copyFile(src, des);
		//copy pasting file from source to destination - screenshot folder.
		//here we are performing copy from source to destination path, for that we use 'copyFile();' method, as this method is inside 'FileUtils' class we have to give "FileUtils.copyFile(source,destination)", format.
		
		Thread.sleep(5000);
		driver.close();
	}

}

