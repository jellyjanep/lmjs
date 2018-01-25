package pageobjects;

import session.Instance;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Search extends Instance{

	@FindBy(className = "inactiveSearch_2mcs2o") public WebElement searchField;
	@FindBy(linkText = "Overview of Pixar in a box (video) | Khan Academy") public WebElement searchResult;

	public Search(){
		PageFactory.initElements(driver, this);
	}

	public void searchSomething(String somethingToSearch) {
		searchField.sendKeys(somethingToSearch);
		searchField.submit();
	}

	public void clickResult() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(searchResult));
		searchResult.click();
	}

}
