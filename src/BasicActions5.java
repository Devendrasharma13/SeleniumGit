import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

class BasicActions5 {
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
		
		WebElement element = driver.findElement(By.id("carselect"));
		Select sel = new Select(element);
		
		Thread.sleep(1000);
		sel.selectByIndex(2);

		Thread.sleep(1000);
		sel.selectByValue("BMW");
		List<WebElement> options = sel.getOptions();
		
		int size = options.size();
		
		for (int i = 0; i < size; i++) {
			String optionsName = options.get(i).getText();
			
		}
		
	}

	  @After public void tearDown() throws Exception{
	  driver.close();
	  }
	 

}
