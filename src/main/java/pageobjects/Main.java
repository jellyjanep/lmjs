package pageobjects;

import session.Instance;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Instance.createChrome("https://www.khanacademy.org/");

		Thread.sleep(5000);
		Instance.quitDriverSession();
	}

}
