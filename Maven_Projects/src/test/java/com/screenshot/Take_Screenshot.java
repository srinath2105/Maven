package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Take_Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		//System.getProperty("user.dir") used to get userdirectory path.
		//we just need to give user directory and concat with only part of the path that changes from other projects.
		//this makes chromedriver.exe accessible in all projects by giving user dir and concat with the changing path
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("gsrinath@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Test@12345");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\gsrin\\eclipse-workspace\\Maven_Projects\\Screenshots\\fb_login.png");
		FileUtils.copyFile(source, destination);

		Thread.sleep(4000);
		driver.quit();
				
	}
}
