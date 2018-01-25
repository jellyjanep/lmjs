package pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import session.Instance;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Instance.openChrome("https://www.khanacademy.org/");

		Register signUp = new Register();
		EditProfile edit = new EditProfile();
		Search search = new Search();

		signUp.clickSignUp();
		signUp.clickLearner();
		signUp.selectMonth("Sep");
		signUp.selectDay("16");
		signUp.selectYear("1994");
		signUp.signUpwithEmailButton();
<<<<<<< HEAD
		signUp.inputEmail("aasdasdwcwfw@gmail.com");
=======
		signUp.inputEmail("48drsdh@gmail.com");
>>>>>>> 08469c6a676c3dfddd705108a0e224d5fd334013
		signUp.inputFirstName("SuperMan");
		signUp.inputLastName("Batman");
		signUp.inputPassword("asdfghjkl");
		signUp.clickSubmitButton();



		signUp.chooseCategory();
		signUp.clickContinue();
		signUp.chooseCategory2();
		signUp.clickContinue2();

		//edit profile

		edit.clickEditPrrofileLink();
		edit.enterUsername("leonel");
		edit.enterLocation("Cebu City, Central Visayas, Philippines");
		edit.clickSaveButton();

		//search
		search.searchSomething("Pixar in a box");
		search.clickResult();

		Thread.sleep(5000);
		Instance.quitDriverSession();
	}

}
