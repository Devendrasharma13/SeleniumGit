package basic2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Util {

	static WebDriver driver;

	/**
	 * This method is used for the WebElement on the basis of By locator
	 * 
	 * @param driver
	 * @param locator
	 * @return WebElement
	 */
	public static WebElement getElement(WebDriver driver, By locator) {
		WebElement element = null;

		try {
			element = driver.findElement(locator);
		} catch (Exception e) {
			System.out.println("some exception occurred while creating the webelement...");
		}

		return element;
	}

	/**
	 * This method initialize the given browser
	 * 
	 * @param browser
	 * @return WebDriver
	 */
	public static WebDriver initDriver(String browser) {

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/home/dsharma/driver/chromedriver");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/home/dsharma/driver/geckodriver");
			driver = new FirefoxDriver();
		} else {
			System.out.println("Please pass the correct browser name....");
		}

		return driver;
	}

	/**
	 * This method launch the given url
	 * 
	 * @param driver
	 * @param url
	 */
	public static void launchUrl(WebDriver driver, String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			System.out.println("some exception occured while getting the title...");
		}
	}

	public static void doSendKeys(WebDriver driver, By locator, String value) {
		getElement(driver, locator).sendKeys(value);
	}

	public static void doClick(WebDriver driver, By locator) {
		getElement(driver, locator).click();
	}

	public static String doGetText(WebDriver driver, By locator) {
		return getElement(driver, locator).getText();
	}

	public static void quitBrowser(WebDriver driver) {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println("Some Exception....");
		}
	}
}
