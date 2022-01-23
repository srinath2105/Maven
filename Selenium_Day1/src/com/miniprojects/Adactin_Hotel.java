package com.miniprojects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Hotel {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://adactinhotelapp.com/index.php");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("srinath21");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("Test@123");
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		WebElement locat = driver.findElement(By.id("location"));
		Select s = new Select(locat);
		s.selectByValue("Los Angeles");
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotel);
		s1.selectByValue("Hotel Sunshine");
		
		WebElement rtype = driver.findElement(By.id("room_type"));
		Select s2 = new Select(rtype);
		s2.selectByValue("Super Deluxe");
		
		WebElement rnos = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(rnos);
		s3.selectByValue("3");
		
		WebElement logindate = driver.findElement(By.id("datepick_in"));
		logindate.clear();
		logindate.sendKeys("10/12/2021");
		
		WebElement logoutdate = driver.findElement(By.id("datepick_out"));
		logoutdate.clear();
		logoutdate.sendKeys("15/12/2021");
		
		WebElement adroom = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adroom);
		s4.selectByValue("2");
		
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
		
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		radio.click();
		
		WebElement conbutton = driver.findElement(By.id("continue"));
		conbutton.click();
		
		WebElement fname = driver.findElement(By.id("first_name"));
		fname.sendKeys("Sri");
		
		WebElement lname = driver.findElement(By.id("last_name"));
		lname.sendKeys("Nath");
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("#1, WallStreet, NY City, New York");
		
		WebElement cardnum = driver.findElement(By.id("cc_num"));
		cardnum.sendKeys("1234567891234567");
		
		WebElement ctype = driver.findElement(By.id("cc_type"));
		Select s5 = new Select(ctype);
		s5.selectByValue("VISA");
		
		WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
		Select s6 = new Select(expmonth);
		s6.selectByValue("1");
		
		WebElement expyear = driver.findElement(By.id("cc_exp_year"));
		Select s7 = new Select(expyear);
		s7.selectByValue("2022");
		
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("999");
		
		WebElement booknow = driver.findElement(By.id("book_now"));
		booknow.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement itinerary = driver.findElement(By.id("my_itinerary"));
		itinerary.click();
		
		Thread.sleep(5000);
		driver.close();
		
	}
}
