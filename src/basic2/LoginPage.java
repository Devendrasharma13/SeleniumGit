package basic2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {

		String browser = "firefox";
		String url = "https://app.hubspot.com/login";

		By emailId = By.id("username");
		By pwd = By.id("password");
		By loginButton = By.id("loginBtn");
		By loginError = By.cssSelector("h2.private-alert__title");

		WebDriver driver = Util.initDriver(browser);
		Util.launchUrl(driver, url);

		Thread.sleep(5000);

		Util.doSendKeys(driver, emailId, "testemall@test.email");
		Util.doSendKeys(driver, pwd, "nopassword");
		Util.doClick(driver, loginButton);

		Thread.sleep(5000);

		String errorText = Util.doGetText(driver, loginError);
		System.out.println("Captuchered Eror Message: " + errorText);

		if (errorText.equals("That email address doesn't exist.")) {
			System.out.println("Correct error message...");
		} else {
			System.out.println("Incorrect error message....");
		}

		Util.quitBrowser(driver);
	}

}
