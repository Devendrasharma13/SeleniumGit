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

class BasicActions4 {
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
		
		boolean isChecked = false;
		List<WebElement> radioButtons = driver.findElements(By.xpath("//input[contains(@type,'radio') and contains(@name,'cars')]"));
		int size = radioButtons.size();
		for(int i=0; i<size;i++) {
			isChecked = radioButtons.get(i).isSelected();
			
			if(!isChecked) {
				radioButtons.get(i).click();
				Thread.sleep(1000);
			}
		}
		

	}

	
	  @After public void tearDown() throws Exception{
	  driver.close();
	  }
	 

}
