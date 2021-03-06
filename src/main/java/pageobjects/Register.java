package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import session.Instance;

public class Register extends Instance {

	{
		wait = new WebDriverWait(driver, 60);
	}

	@FindBy(css = "a[href='/signup?continue=%2F']") public WebElement signUp;
	@FindBy(css = "#_kareact_1 > div > div.progressShell_zx7qjx-o_O-standaloneProgressShell_zrqlgn-o_O-progressShellPadding_107aw0v > section.actionScreen_1012r2-o_O-actionScreenHeight_ogyq09-o_O-actionScreenPadding_18razct > div > div:nth-child(1) > div.buttonToggleContainer_1v7orrz > button.button_dn23dd-o_O-selected_jtxorj") public WebElement learner;
	@FindBy(css = "select[name = 'birth[month]']") public WebElement birthMonth;
	@FindBy(css = "select[name='birth[day]']") public WebElement birthDay;
	@FindBy(css = "select[name='birth[year]']") public WebElement birthYear;
	@FindBy(xpath = "//*[@id='_kareact_1']/div/div[3]/section[2]/div/div[2]/div[2]/div[3]/button/div") public WebElement signUpWithEmail;
	@FindBy(css = "#_kareact_1 > div > div.progressShell_zx7qjx-o_O-standaloneProgressShell_zrqlgn-o_O-progressShellPadding_107aw0v > section.actionScreen_1012r2-o_O-actionScreenHeight_ogyq09-o_O-actionScreenPadding_18razct > div > form > div:nth-child(1) > div.fieldWrapper_1u6tck2 > input") public WebElement email;
	@FindBy(css = "#_kareact_1 > div > div.progressShell_zx7qjx-o_O-standaloneProgressShell_zrqlgn-o_O-progressShellPadding_107aw0v > section.actionScreen_1012r2-o_O-actionScreenHeight_ogyq09-o_O-actionScreenPadding_18razct > div > form > div:nth-child(2) > div > label:nth-child(1) > input") public WebElement firstName;
	@FindBy(css = "#_kareact_1 > div > div.progressShell_zx7qjx-o_O-standaloneProgressShell_zrqlgn-o_O-progressShellPadding_107aw0v > section.actionScreen_1012r2-o_O-actionScreenHeight_ogyq09-o_O-actionScreenPadding_18razct > div > form > div:nth-child(2) > div > label:nth-child(2) > input") public WebElement lastName;
	@FindBy(css = "#_kareact_1 > div > div.progressShell_zx7qjx-o_O-standaloneProgressShell_zrqlgn-o_O-progressShellPadding_107aw0v > section.actionScreen_1012r2-o_O-actionScreenHeight_ogyq09-o_O-actionScreenPadding_18razct > div > form > div:nth-child(3) > div.fieldWrapper_1u6tck2 > input") public WebElement password;
	@FindBy(css = "#_kareact_1 > div > div.progressShell_zx7qjx-o_O-standaloneProgressShell_zrqlgn-o_O-progressShellPadding_107aw0v > section.actionScreen_1012r2-o_O-actionScreenHeight_ogyq09-o_O-actionScreenPadding_18razct > div > nav > div.submitButton_yqytgq > button") public WebElement submitButton;
	@FindBy(css = "#_kareact_0 > div > div:nth-child(2) > div.box-sizing-border-box-reset > div > span > div > div.classesDashboard_gnyqjt > div > div.modal_4pxiv7-o_O-animateOutModal_8lk218-o_O-modalUp_y1os62-o_O-modal_1p5hahj > div.class-picker-contents.modalBody_169fhmr > div.container_vvcha2 > div:nth-child(3) > label:nth-child(10) > div.container_1v2pd2u > input") public WebElement category;
	@FindBy(css = "#_kareact_0 > div > div:nth-child(2) > div.box-sizing-border-box-reset > div > span > div > div.classesDashboard_gnyqjt > div > div.modal_4pxiv7-o_O-animateOutModal_8lk218-o_O-modalUp_y1os62-o_O-modal_1p5hahj > div.footer_zzcjr0 > span:nth-child(7) > span.continueMobile_kcqyq6 > button > div") public WebElement continueButton;
	@FindBy(css ="#_kareact_0 > div > div:nth-child(2) > div.box-sizing-border-box-reset > div > span > div > div.classesDashboard_gnyqjt > div > div.modal_4pxiv7-o_O-animateOutModal_8lk218-o_O-modalUp_y1os62-o_O-modal_1p5hahj > div.class-picker-contents.modalBody_169fhmr > div.container_1277oa8 > div:nth-child(1) > div.list_vznojx > label:nth-child(10) > div.container_1vsbbgx > input") public WebElement category2;
	@FindBy(css ="#_kareact_0 > div > div:nth-child(2) > div.box-sizing-border-box-reset > div > span > div > div.classesDashboard_gnyqjt > div > div.modal_4pxiv7-o_O-animateOutModal_8lk218-o_O-modalUp_y1os62-o_O-modal_1p5hahj > div.footer_zzcjr0 > span:nth-child(7) > span.continueMobile_kcqyq6 > button") public WebElement continueButton2;

	public Register(){
		PageFactory.initElements(driver, this);
	}

	public void clickSignUp(){
		signUp.click();
	}

	public void clickLearner(){
		learner.click();
	}
	public void selectMonth(String month){
		(new Select(birthMonth)).selectByVisibleText("Sep");
	}
	public void selectDay(String day){
		(new Select(birthDay)).selectByVisibleText("16");
	}
	public void selectYear(String year){
		(new Select(birthYear)).selectByVisibleText("1994");
	}
	public void signUpwithEmailButton(){
		signUpWithEmail.click();
	}
	public void inputEmail(String email){
		this.email.sendKeys(email);
	}
	public void inputFirstName(String firstName){
		this.firstName.sendKeys(firstName);
	}
	public void inputLastName(String lastName){
		this.lastName.sendKeys(lastName);
	}
	public void inputPassword(String password){
		this.password.sendKeys(password);
	}
	public void clickSubmitButton(){
		submitButton.click();
	}


	public void chooseCategory(){
		wait.until(ExpectedConditions.elementToBeClickable(category));
		category.click();
	}
	public void clickContinue(){
		continueButton.click();
	}
	public void chooseCategory2(){
		wait.until(ExpectedConditions.elementToBeClickable(category2));
		category2.click();
	}
	public void clickContinue2(){
		continueButton2.click();
	}

}
