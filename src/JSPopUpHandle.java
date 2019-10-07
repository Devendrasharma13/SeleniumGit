import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JSPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		
		String url ="https://mail.rediff.com/cgi-bin/login.cgi";
		
		System.setProperty("webdriver.gecko.driver", "/home/dsharma/Testing/qlik_automation/Framework/drivers/geckodriver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get(url);
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);

		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
	}

}
