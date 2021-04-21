package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUI.RegisterPageUI;

public class RegisterPageObject extends BasePage{
	private WebDriver driver;

	public RegisterPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickToGenderRadioByText(String textValue) {
		waitForElementClickable(driver, RegisterPageUI.DYNAMIC_GENDER_RADIO_BUTTON_BY_TEXT, textValue);
		clickToElement(driver, RegisterPageUI.DYNAMIC_GENDER_RADIO_BUTTON_BY_TEXT, textValue);
//		waitForElementClickable(driver, RegisterPageUI.GENDER_RADIO_BUTTON);
//		clickToElement(driver, RegisterPageUI.GENDER_RADIO_BUTTON);
		
	}
	
	public void selectDateOfBirthDropdownByName(String name, String itemText) {
		waitForElementClickable(driver, RegisterPageUI.DYNAMIC_DATE_OF_BIRTH_DROPDOWN_BY_NAME, name);
		selectItemInDropdownByText(driver, RegisterPageUI.DYNAMIC_DATE_OF_BIRTH_DROPDOWN_BY_NAME, itemText, name);
	}
	

}
