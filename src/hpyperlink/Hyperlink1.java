package hpyperlink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hyperlink1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"/home/dsharma/Testing/qlik_automation/Framework/drivers/geckodriver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		
		// click a link by text
		// driver.findElement(By.linkText("About Us")).click();
		
		// click by xpath
		//driver.findElement(By.xpath("//a[contains(text(),'About Us')]")).click();
		assert driver.findElement(By.linkText("About US")).isDisplayed();

		driver.findElement(By.partialLinkText("About")).click();
		
		String title = driver.getTitle();
		System.out.println("Title: "+title);
		
	}

}
