package session;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
<<<<<<< HEAD
=======
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
>>>>>>> 4fab8823d489900b4f00648a0ee740f7fa231e02

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

<<<<<<< HEAD
	public WebDriver driver;

	public void openChrome(String url){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tr_lnd_user\\Desktop\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

=======
	public static void quitDriverSession() {
		driver.quit();
>>>>>>> 4fab8823d489900b4f00648a0ee740f7fa231e02
	}
}
