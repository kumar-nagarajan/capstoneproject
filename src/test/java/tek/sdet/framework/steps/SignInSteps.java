package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String expectedTitle = "React App";
		String actualTitle = getTitle();// wrote this one in CommonUtility
		Assert.assertEquals(expectedTitle, actualTitle);
		logger.info(actualTitle + "is equal to" + expectedTitle);

	}

	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {
		sendText(factory.signInPage().emailField, email);
		sendText(factory.signInPage().passwordField, password);
		logger.info("user entered email " + email + " and password " + password);
		SlowDown();
	}

	@When("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.signInPage().loginButton);
		logger.info("user clicked on login button");
	}

	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		SlowDown();

		click(factory.signInPage().SignInBtn);
		SlowDown();

		logger.info("user clicked on Sign In option");
		
	}

	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		SlowDown();
		Assert.assertTrue(isElementDisplayed(factory.signInPage().LoggedIn));
		logger.info("user logged in into account");
	}

	@When("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		SlowDown();
		click(factory.signInPage().CreateAccountBtn);
		logger.info("user clicked on create new account button");
	}

	@When("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable data) {
		SlowDown();
		List<Map<String, String>> signUpData = data.asMaps(String.class, String.class);
		sendText(factory.signInPage().nameInput, signUpData.get(0).get("name"));
		SlowDown();
		sendText(factory.signInPage().NewEmail, signUpData.get(0).get("email"));
		SlowDown();
		sendText(factory.signInPage().Password1, signUpData.get(0).get("password"));
		SlowDown();
		sendText(factory.signInPage().ConfirmPassword1, signUpData.get(0).get("confirmPassword"));
		SlowDown();
		logger.info("user entered requrired information into sign up form");
	}

	@When("User click on SignUp button")
	public void userClickOnSignUpButton() {
		SlowDown();
		click(factory.signInPage().signUpBtn);
		logger.info("user clicked on Sign up button");
	}

	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		SlowDown();
		Assert.assertTrue(isElementDisplayed(factory.signInPage().YourProfile));
		Assert.assertTrue(isElementDisplayed(factory.signInPage().LoggedIn));
		logger.info("Account Was created");
	}

}
