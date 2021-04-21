package pageUI;

public class RegisterPageUI {
	public static final String DYNAMIC_GENDER_RADIO_BUTTON_BY_TEXT = "//label[text()='%s']/preceding-sibling::input";
//	public static final String GENDER_RADIO_BUTTON = "//label[text()='Male']";
	public static final String DYNAMIC_DATE_OF_BIRTH_DROPDOWN_BY_NAME = "//select[@name='%s']";
	public static final String ERROR_MESSAGE_AT_NOTIFICATION = "//div[@class='message-error validation-summary-errors']//li";
	public static final String RULE_PASSWORD_ERROR_MESSAGE = "//span[@id='Password-error']/p";
	public static final String LESS_THAN_6_CHARACTER_MESSAGE ="//span[@id='Password-error']//li";
}
