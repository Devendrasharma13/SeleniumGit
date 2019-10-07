package basic3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Util {

	static WebDriver driver;
	
	static public WebDriver initDriver() {
		System.setProperty("webdriver.gecko.driver", "/home/dsharma/driver/geckodriver");
		driver = new FirefoxDriver();
		
		return driver;
	}
	
	static public void launchUrl(WebDriver driver, String url){
		driver.get(url);
	}
	
	static public void closeBrowser(WebDriver driver) {
		driver.close();
	}
	
	static public void doSendKey(WebDriver driver, By locator,String value ) {
		getElement(driver, locator).sendKeys(value);
		
	}
	
	static public void doClick(WebDriver driver, By locator) {
		getElement(driver, locator).click();
	}
	
	public static WebElement getElement(WebDriver driver, By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
		}catch(Exception e) {
			System.out.println("some exception occured while creating webelement...");
		}
		
		return element;
	}
	
	public static String urlTitle(WebDriver driver) {
		return driver.getTitle();
	}
	
	public static void hardWait(int waitTime) {
		try {
			Thread.sleep(waitTime);
		} catch (InterruptedException e) {
			System.out.println("Found exception "+e.getMessage());
			//e.printStackTrace();
		}
	}
}
