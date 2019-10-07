import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class BasicActions2 {
	WebDriver driver;
	String baseUrl;

	@Before public void setUp() throws Exception{
		System.out.println("Test started");
	}
	
	@Test
	void test() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"/home/dsharma/Testing/qlik_automation/Framework/drivers/geckodriver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/V4/");
		System.out.println(driver.getTitle());
		

		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr207828");
		System.out.println("enter username ");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ybEtAju");
		System.out.println("enter password ");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		String title = driver.getTitle();
		System.out.println(title);
	
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current url "+ currentUrl);
		
		String urlToNavigate = "http://demo.guru99.com/V4/";
		driver.navigate().to(urlToNavigate);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("Current url "+ currentUrl);

		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println("Current url "+ currentUrl);
	
		

	}

	
	  @After public void tearDown() throws Exception{
	  driver.close();
	  }
	 

}
