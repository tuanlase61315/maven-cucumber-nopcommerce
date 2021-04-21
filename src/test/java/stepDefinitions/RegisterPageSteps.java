package stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.FakerConfig;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.PageGeneratorManager;
import pageObjects.RegisterPageObject;
import testData.UserData;

public class RegisterPageSteps {
	WebDriver driver;
	RegisterPageObject registerPage;
	TestContext testContext;
	FakerConfig fakerData;

	public RegisterPageSteps(TestContext testContext) {
		driver = Hooks.openAndQuitBrowser();
		this.testContext = testContext;
		registerPage = PageGeneratorManager.getRegisterPage(driver);
		fakerData = FakerConfig.getData();
	}

	@When("^Select to Gender raido$")
	public void selectToGenderRaido() {
		registerPage.clickToGenderRadioByText(UserData.Register.gender);
	}

	@When("^Select Date Of Birth dropdown$")
	public void selectDateOfBirthDropdown() {
		registerPage.selectDateOfBirthDropdownByName("DateOfBirthDay", UserData.Register.day);
		registerPage.selectDateOfBirthDropdownByName("DateOfBirthMonth", UserData.Register.month);
		registerPage.selectDateOfBirthDropdownByName("DateOfBirthYear", UserData.Register.year);
	}


}
