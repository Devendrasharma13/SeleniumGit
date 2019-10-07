import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		String url ="https://cgi-lib.berkeley.edu/ex/fup.html";
		
		System.setProperty("webdriver.gecko.driver", "/home/dsharma/Testing/qlik_automation/Framework/drivers/geckodriver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get(url);
		
		driver.findElement(By.name("upfile")).sendKeys("/home/dsharma/testfile.txt");
		
	}

}
