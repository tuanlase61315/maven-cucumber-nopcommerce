package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUI.HomePageUI;

public class HomePageObject extends BasePage{
	private WebDriver driver;

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public String getRegisterSuccessMessage() {
		waitForElementVisible(driver, HomePageUI.REGISTER_SUCCESS_MESSAGE);
		return getTextElement(driver, HomePageUI.REGISTER_SUCCESS_MESSAGE);	
	}
	
	
}
