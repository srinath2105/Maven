package com.miniproject;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.baseclass.Base_Class1;
import com.manager.Page_Object_Manager;

public class Automationpractice extends Base_Class1{

	public static WebDriver driver = Base_Class1.getBrowser("chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		getUrl("http://automationpractice.com/index.php");
		moveToElementByAct(pom.getHp().getWomen());
		clickOnElement(pom.getHp().getCasual());
		implicitlyWait();
		
		moveToElementByAct(pom.getCd().getDress());
		clickOnElement(pom.getCd().getAddtocart());
		implicitlyWait();
		clickOnElement(pom.getCd().getProceed());
		
		implicitlyWait();
		clear(pom.getSum().getQty());
		sendKeyToElement(pom.getSum().getQty(), "10");
		clickOnElement(pom.getSum().getProceed());
		
		implicitlyWait();
		sendKeyToElement(pom.getSignin().getEmail(), "srinath@gmail.com");
		clickOnElement(pom.getSignin().getCreateacc());
		
		String a = "";
		try {
			a = getTextOfElement(pom.getSignin().getError());
		} catch (Exception e) {
		}
		
		if (a.contains("email address has already been registered")) {
			
			sendKeyToElement(pom.getSignin().getSigninemail(), "srinath@gmail.com");
			sendKeyToElement(pom.getSignin().getSigninpass(), "Test@123");
			clickOnElement(pom.getSignin().getSignin());
		}
		else {
			implicitlyWait();
			clickOnElement(pom.getSignup().getGender());
			sendKeyToElement(pom.getSignup().getFname(), "Sri");
			sendKeyToElement(pom.getSignup().getLname(), "Nath");
			sendKeyToElement(pom.getSignup().getPass(), "Test@123");
			dropDown("byindex", pom.getSignup().getDay(), "20");
			dropDown("byindex", pom.getSignup().getMonth(), "1");
			dropDown("byvalue", pom.getSignup().getYear(), "1990");
			sendKeyToElement(pom.getSignup().getFirstname(), "Sri");
			sendKeyToElement(pom.getSignup().getLastname(), "Nath");
			sendKeyToElement(pom.getSignup().getAddress(), "#1, Wallstreet");
			sendKeyToElement(pom.getSignup().getCity(),"NY city");
			dropDown("byindex", pom.getSignup().getState(), "31");
			sendKeyToElement(pom.getSignup().getPostcode(), "10000");
			sendKeyToElement(pom.getSignup().getMob(), "0123456789");
			clickOnElement(pom.getSignup().getRegister());
		}
		
		implicitlyWait();
		clickOnElement(pom.getAdd().getProceed());
		clickOnElement(pom.getShip().getAgree());
		clickOnElement(pom.getShip().getProceed());
		clickOnElement(pom.getPay().getProceed());
		clickOnElement(pom.getConfirm().getConfirm());
		scrollBy(0, 300);
		takeScreenshot("Miniproject_POM");
		threadsleep(5000);
		closeBrowser();
	}
}
