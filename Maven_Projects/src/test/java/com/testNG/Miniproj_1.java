package com.testNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.Base_Class1;
import com.manager.Page_Object_Manager;

public class Miniproj_1 extends Base_Class1 {
	
	public static WebDriver driver = Base_Class1.getBrowser("chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@BeforeMethod
	private void signin() {
		getUrl("http://automationpractice.com/index.php");
		driver.findElement(By.className("login")).click();
		sendKeyToElement(pom.getSignin().getSigninemail(), "srinath@gmail.com");
		sendKeyToElement(pom.getSignin().getSigninpass(), "Test@123");
		clickOnElement(pom.getSignin().getSignin());
	}
	
	@Test 
	private void placing_order() throws IOException, InterruptedException {
		moveToElementByAct(pom.getHp().getWomen());
		clickOnElement(pom.getHp().getCasual());
		moveToElementByAct(pom.getCd().getDress());
		clickOnElement(pom.getCd().getAddtocart());
		implicitlyWait();
		clickOnElement(pom.getCd().getProceed());
		clear(pom.getSum().getQty());
		sendKeyToElement(pom.getSum().getQty(), "10");
		clickOnElement(pom.getSum().getProceed());
		implicitlyWait();
		clickOnElement(pom.getAdd().getProceed());
		implicitlyWait();
		clickOnElement(pom.getShip().getAgree());
		clickOnElement(pom.getShip().getProceed());
		implicitlyWait();
		clickOnElement(pom.getPay().getProceed());
		clickOnElement(pom.getConfirm().getConfirm());
		scrollBy(0, 300);
		takeScreenshot("Miniproject_POM");
		threadsleep(5000);
		System.out.println("Order placed suceessfully");
	}
	
	@AfterMethod
	private void siginout() {
		driver.findElement(By.className("logout")).click();
		implicitlyWait();
		closeBrowser();
	}
	
}
