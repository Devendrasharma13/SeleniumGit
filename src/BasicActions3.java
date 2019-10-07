import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class BasicActions3 {
	WebDriver driver;
	String baseUrl;

	@Before public void setUp() throws Exception{
		System.out.println("Test started");
	}
	
	@Test
	void test() throws InterruptedException {
		String baseUrl ="https://learn.letskodeit.com/p/practice";
		
		System.setProperty("webdriver.gecko.driver",
				"/home/dsharma/Testing/qlik_automation/Framework/drivers/geckodriver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get(baseUrl);
		System.out.println(driver.getTitle());
		
		WebElement bmwRadioBtn = driver.findElement(By.id("bmwradio"));
		bmwRadioBtn.click();
		
		Thread.sleep(2000);
		
		WebElement benzRadioBtn = driver.findElement(By.id("benzradio"));
		benzRadioBtn.click();
		
		System.out.println("Check bmwRadioBtn : "+bmwRadioBtn.isSelected());
		System.out.println("Check benzRadioBtn : "+benzRadioBtn.isSelected());

		
		WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
		bmwCheckBox.click();
		System.out.println("Check bmwCheckBox : "+bmwCheckBox.isSelected());

		
		
		//driver.close();
		
		
		
		

	}

	
	  @After public void tearDown() throws Exception{
	  driver.close();
	  }
	 

}
