import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameConcept {

	public static void main(String[] args) {

	
		System.setProperty("webdriver.gecko.driver", "/home/dsharma/Testing/qlik_automation/Framework/drivers/geckodriver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		driver.switchTo().frame("main");
		
		String text = driver.findElement(By.cssSelector("body > h2")).getText();
		System.out.println(text);
		
	}

}
