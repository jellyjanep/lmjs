package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import session.Instance;

public class EditProfile extends Instance {

    @FindBy(className = "kui-button base_1h2bej0-o_O-notDisabled_ro0g1e-o_O-small_10vmyc6-o_O-base_1mjjido-o_O-notDisabled_1lqcz1c") public WebElement editProfileButton;
    @FindBy(id = "username") public WebElement usernameField;
    @FindBy(id = "select2-drop-mask") public WebElement locationField;
    @FindBy(id = "bio-picker") public WebElement bioField;
    @FindBy(className = "kui-button base_1h2bej0-o_O-notDisabled_ro0g1e-o_O-small_10vmyc6-o_O-base_foy1xn-o_O-notDisabled_lhbaf0") public WebElement saveButton;


    public EditProfile() {
        PageFactory.initElements(driver, this);
    }

    public void clickEditPrrofileLink() {
        editProfileButton.click();
    }

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterLocation(String location) {
        (new Select(locationField)).selectByVisibleText(location);
    }

    public void enterBio(String bio) {
        bioField.sendKeys(bio);
    }

    public void clickSaveButton() {
        saveButton.click();
    }

}
