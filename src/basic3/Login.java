package basic3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		String browser = "firefox";
		String url = "https://app.hubspot.com/login";
		
		By email = By.id("username");
		By pwd = By.id("password");
		By loginButton = By.id("ssoBtn");
		By loginError = By.cssSelector("h2.private-alert__title");
		
		WebDriver driver =  Util.initDriver();
		Util.launchUrl(driver, url);
		Thread.sleep(10000);
		Util.doSendKey(driver, email, "dfsdffo@sdfdf.com");
		Util.doSendKey(driver, pwd, "password");
		Util.doClick(driver, loginButton);
		Util.closeBrowser(driver);

	}
	

}
