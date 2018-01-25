package test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageobjects.EditProfile;
import session.Instance;

public class EditProfileTest {

	EditProfile editProfile;

	@BeforeTest
	public void setUp() {
		editProfile = new EditProfile();
	}

	@Test(priority = 1)
	public void clickEditProfileTest() {
		editProfile.clickEditPrrofileLink();
		Instance.wait.until(ExpectedConditions.visibilityOf(editProfile.usernameField));
		Assert.assertTrue(Instance.driver.findElement(By.xpath("//*[@id=\"username-picker-container\"]/div[1]/h2")).equals("Edit basic info"));
	}

	@Test(priority = 2)
	@Parameters ({"username", "location", "bio"})
	public void editProfileFieldsTest(String username, String location, String bio) {
		editProfile.enterUsername(username);
		editProfile.enterLocation(location);
		editProfile.enterBio(bio);
		editProfile.clickSaveButton();
		Assert.assertTrue(Instance.driver.findElement(By.linkText("Subjects")).equals("Subjects"), "Registration Successful");
	}
}
