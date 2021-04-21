package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUI.CommonPageUI;
import pageUI.RegisterPageUI;

public class CommonPageObject extends BasePage {
	private WebDriver driver;

	public CommonPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public String getErrorMessageAtLine01Notification() {
		waitForElementVisible(driver, CommonPageUI.ERROR_MESSAGE_lINE_01_AT_NOTIFICATION);
		return getTextElement(driver, CommonPageUI.ERROR_MESSAGE_lINE_01_AT_NOTIFICATION);
	}

	public String getErrorMessageAtLine02Notification() {
		waitForElementVisible(driver, CommonPageUI.ERROR_MESSAGE_LINE_02_AT_NOTIFICATION);
		return getTextElement(driver, CommonPageUI.ERROR_MESSAGE_LINE_02_AT_NOTIFICATION);
	}

	public String getRulePasswordErrorMessage() {
		waitForElementVisible(driver, RegisterPageUI.RULE_PASSWORD_ERROR_MESSAGE);
		return getTextElement(driver, RegisterPageUI.RULE_PASSWORD_ERROR_MESSAGE);
	}

	public String getLessThan6CharacterErrorMessage() {
		waitForElementVisible(driver, RegisterPageUI.LESS_THAN_6_CHARACTER_MESSAGE);
		return getTextElement(driver, RegisterPageUI.LESS_THAN_6_CHARACTER_MESSAGE);
	}

	// DYNAMIC LOCATOR
	public void clickToDynamicTextLinkByText(WebDriver driver, String textValue) {
		waitForElementClickable(driver, CommonPageUI.DYNAMIC_TEXT_LINK_HEADER_BY_TEXT, textValue);
		clickToElement(driver, CommonPageUI.DYNAMIC_TEXT_LINK_HEADER_BY_TEXT, textValue);
	}

	public void inputToDynamicTextboxByName(WebDriver driver, String textboxName, String inputValue) {
		waitForElementVisible(driver, CommonPageUI.DYNAMIC_TEXTBOX_BY_NAME, textboxName);
		sendkeyToElement(driver, CommonPageUI.DYNAMIC_TEXTBOX_BY_NAME, inputValue, textboxName);
	}

	public void clickToDynamicButtonByText(WebDriver driver, String textValue) {
		waitForElementClickable(driver, CommonPageUI.DYNAMIC_BUTTON_BY_TEXT, textValue);
		clickToElement(driver, CommonPageUI.DYNAMIC_BUTTON_BY_TEXT, textValue);
	}

	public String getItemErrorMessageByID(WebDriver driver, String idValue) {
		waitForElementVisible(driver, CommonPageUI.DYNAMIC_ERROR_MESSAGE_BY_ID, idValue);
		return getElementText(driver, CommonPageUI.DYNAMIC_ERROR_MESSAGE_BY_ID, idValue);
	}

	public boolean isDynamicTextLinkIsDisplayed(WebDriver driver, String textLinkName) {
		waitForElementVisible(driver, CommonPageUI.DYNAMIC_TEXT_LINK_HEADER_BY_TEXT, textLinkName);
		return isElementDisplay(driver, CommonPageUI.DYNAMIC_TEXT_LINK_HEADER_BY_TEXT, textLinkName);
	}

}
