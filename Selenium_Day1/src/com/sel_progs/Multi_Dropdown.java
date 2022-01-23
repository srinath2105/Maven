package com.sel_progs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Day1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		WebElement multi = driver.findElement(By.xpath("(//select) [6]"));
		
		Select a= new Select(multi);
		a.selectByValue("1");
		a.selectByIndex(3);
		a.selectByVisibleText("Appium");
		
		List<WebElement> alloptions = a.getOptions();
		//getoptions() used to get all options inside a selected dropdown
		for (WebElement webElement : alloptions) {
			//foreach loop is used to print all the options one by one
			System.out.println("All options in dropdown are = " +webElement.getText());
			//getText() is used to get the text vaule in a selected webelement.
			
		}
		
		System.out.println("\n==================================\n");

		List<WebElement> selectedops = a.getAllSelectedOptions();
		//getAllSelectedOptions is used to get the selected options inside dropdown
		for (WebElement webElement1 : selectedops) {
			
			System.out.println("The Selected Options are = " +webElement1.getText());
		}
		
		System.out.println("\n==================================\n");
		
		WebElement firstSelectedOption = a.getFirstSelectedOption();
		//getFirstSelectedOption() is used to get the first selected option in a dropdown
		System.out.println("The First selected option is = " +firstSelectedOption.getText());
		
		System.out.println("\n==================================\n Updated list after deselecting \n==================================\n");
		
		Thread.sleep(3000);
		
		a.deselectByValue("3");
		a.deselectByVisibleText("Appium");
		a.selectByIndex(4);
		
		List<WebElement> newselect = a.getAllSelectedOptions();
		for (WebElement webElement : newselect) {
			
			System.out.println("New selected option is = " +webElement.getText());
		}
		
		System.out.println("\n==================================\n");
		
		WebElement newfirstselect = a.getFirstSelectedOption();
		System.out.println("New First selected option is = " +newfirstselect.getText());
		
		Thread.sleep(5000);
		driver.close();
	}
	
}
