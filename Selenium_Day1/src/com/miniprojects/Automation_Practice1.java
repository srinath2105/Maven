package com.miniprojects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Automation_Practice1 {
	
	 static String a = "";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		WebElement women = driver.findElement(By.xpath("//a [@title='Women']"));
		Actions act = new Actions(driver);
			
		act.moveToElement(women).build().perform();
		WebElement casual = driver.findElement(By.xpath("(//a [@title='Casual Dresses']) [1]"));
		casual.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement img = driver.findElement(By.xpath("//img [@title='Printed Dress']"));
		act.moveToElement(img);
		
		WebElement add = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[1]"));
		act.click(add).build().perform();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement proceed = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span"));
		proceed.click();
		
		
		WebElement qty = driver.findElement(By.xpath("//input [@class='cart_quantity_input form-control grey']"));
		qty.clear();
		qty.sendKeys("10");
		
		WebElement proceed2 = driver.findElement(By.xpath("//span [text () = 'Proceed to checkout']"));
		proceed2.click();
		
		WebElement create_Email = driver.findElement(By.id("email_create"));
		create_Email.sendKeys("srinath@gmail.com");
		
		WebElement create_acc = driver.findElement(By.id("SubmitCreate"));
		create_acc.click();
		
		try {
			
			WebElement email_Error = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[1]/ol/li"));
     		a = email_Error.getText();
			
		} catch (Exception e) {

     		e.printStackTrace();
		}
			
		
     	if (a.equalsIgnoreCase("An account using this email address has already been registered. Please enter a valid password or request a new one.")) {
			
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys("srinath@gmail.com");
			
			WebElement pass1 = driver.findElement(By.id("passwd"));
			pass1.sendKeys("Test@123");
			
			WebElement login = driver.findElement(By.id("SubmitLogin"));
			login.click();
			
		}

		else {

			WebElement gender = driver.findElement(By.xpath("//div [@id = 'uniform-id_gender1']"));
			gender.click();
			
			WebElement fname = driver .findElement(By.id("customer_firstname"));
			fname.sendKeys("Sr");
			
			WebElement lname = driver.findElement(By.id("customer_lastname"));
			lname.sendKeys("Na");
			
			WebElement pass = driver.findElement(By.id("passwd"));
			pass.sendKeys("Test@123");
			
			WebElement day = driver.findElement(By.id("days"));
			Select s = new Select(day);
			s.selectByValue("10");
			
			WebElement month = driver.findElement(By.id("months"));
			Select s1 = new Select(month);
			s1.selectByValue("10");
			
			WebElement year = driver.findElement(By.id("years"));
			Select s2 = new Select(year);
			s2.selectByValue("2010");
			
			WebElement firstname = driver.findElement(By.id("firstname"));
			firstname.sendKeys("i");
			
			WebElement lastname = driver.findElement(By.id("lastname"));
			lastname.sendKeys("th");
			
			WebElement address = driver.findElement(By.id("address1"));
			address.sendKeys("#1, Wallstreet");
			
			WebElement city = driver.findElement(By.name("city"));
			city.sendKeys("NY city");
			
			WebElement state = driver.findElement(By.id("id_state"));
			Select s3 = new Select(state);
			s3.selectByValue("32");
			
			WebElement post = driver.findElement(By.id("postcode"));
			post.sendKeys("10000");
			
			WebElement phnum = driver.findElement(By.id("phone_mobile"));
			phnum.sendKeys("0123456789");
			
			WebElement register = driver.findElement(By.xpath("//span [text() = 'Register' ]"));
			register.click();
			
		}

		WebElement proceed3 = driver.findElement(By.xpath("//span [text()= 'Proceed to checkout']"));
		proceed3.click();
		
		WebElement checkbox = driver.findElement(By.id("cgv"));
		checkbox.click();
		
		WebElement proceed4 = driver.findElement(By.xpath("(//span [contains (text() , 'Proceed ')]) [2]"));
		proceed4.click();
		
		WebElement checkout = driver.findElement(By.xpath("(//span [ contains (text() , 'order processing')]) [1]"));
		checkout.click();
		
		WebElement confirm = driver.findElement(By.xpath("//span [ contains (text() , 'I confirm')]"));
		confirm.click();
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
