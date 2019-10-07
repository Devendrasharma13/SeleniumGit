import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JSPopUpHandle2 {

	public static void main(String[] args) throws InterruptedException {
		
		String url ="https://svn.afilias-int.info/repos/QARepo/qa-tools/experiments/docker-whois/";
		
		System.setProperty("webdriver.gecko.driver", "/home/dsharma/Testing/qlik_automation/Framework/drivers/geckodriver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://dsharma:Dev1Sha#@svn.afilias-int.info/repos");
		
	}

}
