package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;
	public static Actions act;
	public static Select s;
	public static JavascriptExecutor java;
	public static TakesScreenshot ts;

	public static WebDriver getBrowser(String text) { // Browser launch()

		if (text.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (text.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		return driver;
	}

	public static void browserMax() {
		driver.manage().window().maximize();
	}
	
	public static void clickOnElement(WebElement element) { // click()
		element.click();
	}

	public static void sendKeyToElement(WebElement element, String value) { // sendkeys()
		element.sendKeys(value);
	}

	public static String getTextOfElement(WebElement element) { // gettext()
		String a = element.getText();
		System.out.println(a);
		return a;
	}

	public static void getUrl(String Url) { // get()
		driver.get(Url);
	}

	public static void getTitle() {
		String a = driver.getTitle();
		System.out.println(a);
	}

	public static void closeBrowser() { // close()
		driver.close();
	}

	public static void quitBrowser() { // quit()
		driver.quit();
	}

	public static void navTo(String url) { // navigate().to()
		driver.navigate().to(url);
	}

	public static void navForward() { // navigate().forward()
		driver.navigate().forward();
	}

	public static void navBack() { // navigate().back()
		driver.navigate().back();
	}

	public static void navRefresh() { // navigate().refresh()
		driver.navigate().refresh();
	}

	public static void switchAlert() { // switchto().alert()
		driver.switchTo().alert();
	}

	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}

	public void declineAlert() {
		driver.switchTo().alert().dismiss();
	}

	public static void clickByAct(WebElement element) {
		act = new Actions(driver);
		act.click(element).build().perform();
	}

	public static void contextClickByAct(WebElement element) {
		act = new Actions(driver);
		act.contextClick(element).build().perform();
	}

	public static void doubleClickByAct(WebElement element) {
		act = new Actions(driver);
		act.doubleClick(element).build().perform();
	}

	public static void moveToElementByAct(WebElement element) {
		act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}

	public static void dragAndDropByAct(WebElement element, WebElement element1) {
		act = new Actions(driver);
		act.dragAndDrop(element, element1).build().perform();
	}

	public static void clickAndHoldByAct(WebElement element) {
		act = new Actions(driver);
		act.clickAndHold(element).build().perform();
	}

	public static void releaseByAct(WebElement element) {
		act = new Actions(driver);
		act.release(element).build().perform();
	}

	public static void Robot(String text, int a) throws AWTException {
		Robot r = new Robot();

		if (text.equalsIgnoreCase("press")) {
			r.keyPress(a);
		} else if (text.equalsIgnoreCase("release")) {
			r.keyRelease(a);
		}
	}

	public static void dropDown(String type, WebElement element, String value) {
		s = new Select(element);

		if (type.equalsIgnoreCase("byindex")) {
			int i = Integer.parseInt(value);
			s.selectByIndex(i);
		} else if (type.equalsIgnoreCase("byvalue")) {
			s.selectByValue(value);
		} else if (type.equalsIgnoreCase("byvisibletext")) {
			s.selectByVisibleText(value);
		} else if (type.equalsIgnoreCase("deselectbyindex")) {
			int i = Integer.parseInt(value);
			s.selectByIndex(i);
		} else if (type.equalsIgnoreCase("deselectbyvalue")) {
			s.selectByValue(value);
		} else if (type.equalsIgnoreCase("deselectbyvisibletext")) {
			s.selectByVisibleText(value);
		}
	}

	public static void multiDropDown(String type) {

		if (type.equalsIgnoreCase("getoptions")) {
			List<WebElement> alloptions = s.getOptions();
			for (WebElement webElement : alloptions) {
				System.out.println("All options in dropdown are = " + webElement.getText());
			}
		} else if (type.equalsIgnoreCase("allselectedoptions")) {
			List<WebElement> selectedops = s.getAllSelectedOptions();
			for (WebElement webElement1 : selectedops) {
				System.out.println("The Selected Options are = " + webElement1.getText());
			}
		} else if (type.equalsIgnoreCase("firstselectedoptions")) {
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			System.out.println("The First selected option is = " + firstSelectedOption.getText());
		}
	}

	public static void frameSwith(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void windowHandles(String a) {

		Set<String> handles = driver.getWindowHandles();
		for (String string : handles) {
			if (driver.switchTo().window(string).getTitle().equalsIgnoreCase(a)) {
				break;
			}
		}
	}

	public static JavascriptExecutor jSrciptClick(WebElement element) {
		java = (JavascriptExecutor) driver;
		java.executeScript("arguments[0].click();", element);
		return java;
	}

	public static JavascriptExecutor jScriptSendkeys(WebElement element, String text) {
		java = (JavascriptExecutor) driver;
		java.executeScript("arguments[0].value =" + "\'" + text + "\'", element);
		return java;
	}

	public static JavascriptExecutor scrollBy(int h, int v) {
		java = (JavascriptExecutor) driver;
		java.executeScript("window.scrollBy(" + h + "," + v + ")");
		return java;
	}

	public static JavascriptExecutor scrollByElement(WebElement element) {
		java = (JavascriptExecutor) driver;
		java.executeScript("arguments[0].scrollIntoView();", element);
		return java;
	}

	public static void takeScreenshot(String name) throws IOException {
		ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Admin\\eclipse-workspace\\Maven_Projects\\Screenshots\\" + name + ".png");
		FileUtils.copyFile(src, des);
	}

	public static void implicitlyWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public static void isMultiple(WebElement element) {
		s = new Select(element);
		System.out.println(s.isMultiple());
	}

	public static void getCurrentUrl() {
		String a = driver.getCurrentUrl();
		System.out.println(a);
	}

	public static void isEnabled(WebElement element) {
		boolean a = element.isEnabled();
		System.out.println(a);
	}

	public static void isDisplayed(WebElement element) {
		boolean a = element.isDisplayed();
		System.out.println(a);
	}

	public static void isselected(WebElement element) {
		boolean a = element.isSelected();
		System.out.println(a);
	}

	public static void getAttribute(WebElement element, String value) {
		String a = element.getAttribute(value);
		System.out.println(a);
	}

	public static void radioButton(WebElement element) {
		element.click();
	}

	public static void checkBox(WebElement element) {
		element.click();
	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static void threadsleep(int a) throws InterruptedException {
		Thread.sleep(a);
	}

	public static void allDataFromExcel(String path) throws IOException {

		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(0);
		int rn = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < rn; i++) {
			Row r = sheet.getRow(i);
			int rc = r.getPhysicalNumberOfCells();
			System.out.println(" ");
			for (int j = 0; j < rc; j++) {
				Cell cell = r.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType.equals(CellType.STRING)) {
					String s = cell.getStringCellValue();
					System.out.print(s + "   ");
				} else if (cellType.equals(CellType.NUMERIC)) {
					double d = cell.getNumericCellValue();
					int value = (int) d;
					System.out.print(value + "   ");
				}
			}
		}
	}

	public static void particularDataFromExcel(String path, int row, int cell) throws IOException {
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row r = sheetAt.getRow(row);
		Cell c = r.getCell(cell);
		CellType ct = c.getCellType();
		if (ct.equals(CellType.STRING)) {
			String s = c.getStringCellValue();
			System.out.print(s + "   ");
		} else if (ct.equals(CellType.NUMERIC)) {
			double d = c.getNumericCellValue();
			int value = (int) d;
			System.out.print(value + "   ");
		}
	}

}
