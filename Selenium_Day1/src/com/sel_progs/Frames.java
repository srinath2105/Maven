package com.sel_progs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Day1\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		WebElement single = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(single);
		
		WebElement textbox1 = driver.findElement(By.xpath("//input [@type='text']"));
		textbox1.sendKeys("Single frame");
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		WebElement iframe_button = driver.findElement(By.xpath("(//a [@class='analystic']) [2]"));
		iframe_button.click();
		
		WebElement first_frame = driver.findElement(By.xpath("//iframe [@src='MultipleFrames.html']"));
		driver.switchTo().frame(first_frame);
		
		WebElement seco_frame = driver.findElement(By.xpath("//iframe [@src='SingleFrame.html']"));
		driver.switchTo().frame(seco_frame);
		
		WebElement textbox2 = driver.findElement(By.xpath("//input [@type='text']"));
		textbox2.sendKeys("Multi Frame");
		
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		WebElement sframe_button = driver.findElement(By.xpath("(//a [@class='analystic']) [1]"));
		sframe_button.click();
		
		Thread.sleep(3000);
		driver.close();
	}

}
