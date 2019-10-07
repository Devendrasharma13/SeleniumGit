import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstProg {
	
	public static void main(String[] args) {
	
		///home/dsharma/Testing/qlik_automation/Framework/drivers/geckodriver/geckodriver
		System.setProperty("webdriver.gecko.driver", "/home/dsharma/Testing/qlik_automation/Framework/drivers/geckodriver/geckodriver");
		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.google.com");
		
		String title = driver.getTitle();
		if (driver.getTitle() == "Google") {
			System.out.println("Correct title");
		}
		else {
			System.out.println("Incorrect title : "+title);
		}
		
//		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("letskodeit");
//		driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']")).click();
//		driver.findElement(By.xpath("//input[@title='Search']")).click();
//		
		//driver.manage().window().maximize();
		
		//driver.close();
		
	}

}
