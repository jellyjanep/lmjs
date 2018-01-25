package setup;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import session.Instance;

public class Setup {

	@BeforeTest
	@Parameters ({"browser","url"})
	public void setup(String browser, String url){
		switch(browser) {
		case "chrome":
			Instance.createChrome(url);
			break;
		case "firefox":
			Instance.createChrome(url);
			break;
		}
	}
}
