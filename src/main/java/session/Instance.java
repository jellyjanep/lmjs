package session;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Instance {

	public static WebDriver driver;
	public WebDriverWait wait;

	public static void openChrome(String url){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tr_lnd_user\\Desktop\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

	}

	public static void quitDriverSession() {
		driver.quit();

	}
}
