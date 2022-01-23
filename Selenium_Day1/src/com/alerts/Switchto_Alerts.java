package com.alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchto_Alerts {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Day1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement simple = driver.findElement(By.xpath("//button [@onclick='alertbox()']"));
		simple.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		WebElement ele1 = driver.findElement(By.xpath("(//a [@class='analystic']) [2]"));
		ele1.click();
		WebElement confirm = driver.findElement(By.xpath("//button [@class='btn btn-primary']"));
		confirm.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		WebElement ele2 = driver.findElement(By.xpath("(//a [@class='analystic']) [3]"));
		ele2.click();
		WebElement prompt = driver.findElement(By.xpath("//button [@class='btn btn-info']"));
		prompt.click();
		driver.switchTo().alert().sendKeys("Srinath");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
