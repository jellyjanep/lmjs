package pageobjects;

import session.Instance;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Instance.openChrome("https://khanacademy.org/");

		Register signUp = new Register();
		EditProfile edit = new EditProfile();
		Search search = new Search();

		signUp.clickSignUp();
		signUp.clickLearner();
		signUp.selectMonth("Sep");
		signUp.selectDay("16");
		signUp.selectYear("1994");
		signUp.signUpwithEmailButton();
		signUp.inputEmail("sdgdftgfghsdh@gmail.com");
		signUp.inputFirstName("SuperMan");
		signUp.inputLastName("Batman");
		signUp.inputPassword("asdfghjkl");
		signUp.clickSubmitButton();


		Thread.sleep(5000);
		Instance.quitDriverSession();
	}

}
