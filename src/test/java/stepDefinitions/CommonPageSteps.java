package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.CommonPageObject;
import pageObjects.PageGeneratorManager;
import testData.UserData;

public class CommonPageSteps {
	WebDriver driver;
	CommonPageObject commonPage;
	TestContext testContext;

	public CommonPageSteps(TestContext testContext) {
		driver = Hooks.openAndQuitBrowser();
		this.testContext = testContext;
		commonPage = PageGeneratorManager.getCommonPage(driver);
	}

	@When("^Click to \"([^\"]*)\" link text$")
	public void clickToDynamicLinkText(String linkText) {
		switch (linkText) {
		case "Register":
			commonPage.clickToDynamicTextLinkByText(driver, "Register");
			break;
		case "Log out":
			commonPage.clickToDynamicTextLinkByText(driver, "Log out");
			break;
		case "Log in":
			commonPage.clickToDynamicTextLinkByText(driver, "Log in");
			break;
		}
	}

	@When("^Input to \"([^\"]*)\" textbox with valid data$")
	public void inputToDynamicTextboxWithValidData(String textboxName) {
		switch (textboxName) {
		case "FirstName":
			commonPage.inputToDynamicTextboxByName(driver, "FirstName", UserData.Register.firstname);
			break;
		case "LastName":
			commonPage.inputToDynamicTextboxByName(driver, "LastName", UserData.Register.lastname);
			break;
		case "Email":
			commonPage.inputToDynamicTextboxByName(driver, "Email", UserData.Register.email);
			break;
		case "Company":
			commonPage.inputToDynamicTextboxByName(driver, "Company", UserData.Register.company);
			break;
		case "Password":
//			testContext.getDataContext().setContext(Context.PASSWORD, fakerData.getPassword());
//			commonPage.inputToDynamicTextboxByName(driver, "Password", (String) testContext.getDataContext().getContext(Context.PASSWORD));
			commonPage.inputToDynamicTextboxByName(driver, "Password", UserData.Register.password);
			break;
		case "ConfirmPassword":
//			commonPage.inputToDynamicTextboxByName(driver, "ConfirmPassword", (String) testContext.getDataContext().getContext(Context.PASSWORD));
			commonPage.inputToDynamicTextboxByName(driver, "ConfirmPassword", UserData.Register.password);
			break;
		}

	}

	@When("^Click to \"([^\"]*)\" button$")
	public void clickToSomethingButton(String buttonName) {
		switch (buttonName) {
		case "Register":
			commonPage.clickToDynamicButtonByText(driver, "Register");
			break;
		case "Log in":
			commonPage.clickToDynamicButtonByText(driver, "Log in");
			break;
		}

	}

	@When("^Input to \"([^\"]*)\" textbox with \"([^\"]*)\"$")
	public void inputToDynamicTextbox(String textboxName, String inputValue) {
		switch (textboxName) {
		case "Email":
			commonPage.inputToDynamicTextboxByName(driver, textboxName, inputValue);
			break;
		case "Password":
			commonPage.inputToDynamicTextboxByName(driver, textboxName, inputValue);
			break;
		case "ConfirmPassword":
			commonPage.inputToDynamicTextboxByName(driver, textboxName, inputValue);
			break;
		}

	}

	@Then("^Verify error message \"([^\"]*)\" is displayed at \"([^\"]*)\"$")
	public void verifyErrorMessageIsDisplayed(String errorMessage, String textboxName) {
		switch (errorMessage) {
		case "First name is required.":
			Assert.assertEquals(commonPage.getItemErrorMessageByID(driver, "FirstName-error"), errorMessage);
			break;
		case "Last name is required.":
			Assert.assertEquals(commonPage.getItemErrorMessageByID(driver, "LastName-error"), errorMessage);
			break;
		case "Email is required.":
			Assert.assertEquals(commonPage.getItemErrorMessageByID(driver, "Email-error"), errorMessage);
			break;
		case "Password is required.":
			if (textboxName.equals("Password")) {
				Assert.assertEquals(commonPage.getItemErrorMessageByID(driver, "Password-error"), errorMessage);
				break;
			} else if (textboxName.equals("ConfirmPassword")) {
				Assert.assertEquals(commonPage.getItemErrorMessageByID(driver, "ConfirmPassword-error"), errorMessage);
				break;
			}
		case "The specified email already exists":
			Assert.assertEquals(commonPage.getErrorMessageAtLine02Notification(), errorMessage);
			break;
		case "Password must meet the following rules:":
			Assert.assertEquals(commonPage.getRulePasswordErrorMessage(), errorMessage);
			break;
		case "must have at least 6 characters":
			Assert.assertEquals(commonPage.getLessThan6CharacterErrorMessage(), errorMessage);
			break;
		case "The password and confirmation password do not match.":
			Assert.assertEquals(commonPage.getItemErrorMessageByID(driver, "ConfirmPassword-error"), errorMessage);
			break;
		case "Please enter your email":
			Assert.assertEquals(commonPage.getItemErrorMessageByID(driver, "Email-error"), errorMessage);
			break;
		case "Login was unsuccessful. Please correct the errors and try again.":
			Assert.assertEquals(commonPage.getErrorMessageAtLine01Notification(), errorMessage);
			break;
		case "No customer account found":
			Assert.assertEquals(commonPage.getErrorMessageAtLine02Notification(), errorMessage);
			break;	
		case "The credentials provided are incorrect":
			Assert.assertEquals(commonPage.getErrorMessageAtLine02Notification(), errorMessage);
			break;
		}
		
		
	}

	@Then("^Verify \"([^\"]*)\" link text is displayed$")
	public void verifyDynamicLinkTextIsDisplayed(String textLink) {
		Assert.assertTrue(commonPage.isDynamicTextLinkIsDisplayed(driver, textLink));
	}

}
