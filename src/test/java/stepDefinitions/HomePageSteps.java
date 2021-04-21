package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Then;
import cucumberOptions.Hooks;
import pageObjects.HomePageObject;
import pageObjects.PageGeneratorManager;

public class HomePageSteps {
	WebDriver driver;
	HomePageObject homePage;
	TestContext testContext;

	public HomePageSteps(TestContext testContext) {
		driver = Hooks.openAndQuitBrowser();
		this.testContext = testContext;
		homePage = PageGeneratorManager.getHomePage(driver);
	}

	@Then("^Verify Register Message is displayed$")
	public void verifyRegisterMessageIsDisplayed() {
		Assert.assertEquals(homePage.getRegisterSuccessMessage(), "Your registration completed");

	}
}
