import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondPage {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/home/dsharma/Testing/qlik_automation/Framework/drivers/geckodriver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String baseURL = "https://letskodeit.teachable.com/";
		driver.get(baseURL);
		
		//driver.findElement(By.linkText("Login")).click();
		//Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Practice")).click();
		

	}

}
