package basic3;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Search {
	static WebDriver driver;
	By loginButton = By.id("loginBtn");
	
	@BeforeMethod
	public void launchBrowser() {
		String url = "https://app.hubspot.com/login";
		driver = Util.initDriver();
		Util.launchUrl(driver, url);
		Util.hardWait(10000);
	}
	
	@Test(enabled = false)
	public void urlTitleTest() {
		String title = Util.urlTitle(driver);
		System.out.println(title);
		assertEquals(title, "HubSpot Login");
	}
	
	@Test
	public void loginButtonTest() {
		WebElement logingBtn = Util.getElement(driver, loginButton);
		System.out.println(logingBtn.isEnabled());
	}
	      
	@AfterMethod
	public void closingBrowser() {
		System.out.println("Clossing the Browser...");
		Util.hardWait(5000);
		Util.closeBrowser(driver);
	}

}
