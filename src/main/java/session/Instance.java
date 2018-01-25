package session;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instance {

	public WebDriver driver;

	public void openChrome(String url){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tr_lnd_user\\Desktop\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

	}
}
