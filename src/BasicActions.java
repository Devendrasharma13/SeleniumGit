import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class BasicActions {
	WebDriver driver;
	String baseUrl;

	/*
	 * @Before public void setUp() throws Exception{
	 * System.setProperty("webdriver.gecko.driver",
	 * "/home/dsharma/Testing/qlik_automation/Framework/drivers/geckodriver/geckodriver"
	 * ); driver = new FirefoxDriver(); baseUrl = "https://learn.letskodeit.com/";
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 * driver.manage().window().maximize(); }
	 */
	@Before public void setUp() throws Exception{
		System.out.println("Test started");
	}
	
	@Test
	void test() {
//		driver.get(baseUrl);
		System.setProperty("webdriver.gecko.driver",
				"/home/dsharma/Testing/qlik_automation/Framework/drivers/geckodriver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/V4/");
		System.out.println(driver.getTitle());
		
		// login -->
//		driver.findElement(By.xpath("//a[@class='navbar-link fedora-navbar-link']")).click();
//		System.out.println("Clicked on login ");
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr207828");
		System.out.println("enter username ");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ybEtAju");
		System.out.println("enter password ");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		//driver.close();
		
		
		
		

	}

	
	  @After public void tearDown() throws Exception{
	  driver.close();
	  }
	 

}
