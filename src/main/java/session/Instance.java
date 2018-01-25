package session;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Instance {
	protected static WebDriver driver;
	protected AjaxElementLocatorFactory ajaxElemLocate;

	public static void createChrome(String url) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tr_lnd_user\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void quitDriverSession() {
		driver.quit();
	}
}
