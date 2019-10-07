import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/home/dsharma/Testing/qlik_automation/Framework/drivers/geckodriver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println(linkList.size());
		
		for(int i=0; i<linkList.size();i++) {
			String str = linkList.get(i).getText();
			if(str.length() != 0) {
				System.out.println(str);
			}
			
		}
		
		driver.quit();
	}

}
