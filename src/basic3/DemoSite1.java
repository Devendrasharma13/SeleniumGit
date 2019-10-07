package basic3;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoSite1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "/home/dsharma/driver/geckodriver");
		driver = new FirefoxDriver();
		driver.get("http://demo-store.seleniumacademy.com/");
	}
	
	@Test(enabled = false)
	public void searchProduct() {
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Phones");
		WebElement searchButton = driver.findElement(By.className("search-button"));
		searchButton.click();
		assertEquals(driver.getTitle(), "Search results for: 'Phones'");
	}
	
	@Test(enabled = false)
	public void elementGetAttributesExample() {
		WebElement searchBox = driver.findElement(By.name("q"));
		System.out.println("Name of the box is: "+searchBox.getAttribute("name"));
		System.out.println("Id of the box is: "+searchBox.getAttribute("id"));
		System.out.println("Class of the box is: "+searchBox.getAttribute("class"));
		System.out.println("Placeholder of the box is: "+searchBox.getAttribute("placeholder"));
	}
	
	@Test
	public void searchBoxisDisplayedTest() {
		WebElement searchBox = driver.findElement(By.name("q"));
		boolean actResult = searchBox.isDisplayed();
		System.out.println("search box is displayed: "+searchBox.isDisplayed());
		assertEquals(actResult, false);
	}
	
	
	@AfterMethod//(enabled = false)
	public void tearDown() {
		driver.quit();
	}

}
