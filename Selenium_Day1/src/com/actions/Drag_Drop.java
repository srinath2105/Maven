package com.actions;


import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Day1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/drop.html");
		Actions act = new Actions(driver);
		//actions syntax to perform set of actions in program
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Thread.sleep(3000);
		
		act.clickAndHold(drag).build().perform();
		//to click and hold a webelement, build().perform(); is mandatory to perform actions
		act.release(drop).build().perform();
		//to release the webelement
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.flipkart.com/");
		WebElement close_Button = driver.findElement(By.xpath("//button [@class='_2KpZ6l _2doB4z']"));
		Thread.sleep(2000);
		act.click(close_Button).build().perform();
		//to click a webelement
		WebElement top_offers = driver.findElement(By.xpath("(//div [@class='xtXmba']) [1]"));
		Thread.sleep(2000);
		act.contextClick(top_offers).build().perform();
		//to right click a webelement
		
		WebElement fashion = driver.findElement(By.className("xtXmba"));
		act.moveToElement(fashion).build().perform();
		//to perfom mouse hover
		
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
