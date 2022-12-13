package tek.sdet.framework.steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.*;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();

	@Given("User is On retail website")
	public void userIsOnRetailWebsite() {
		String expectedTitle = "React App";
		String actualTitle = getTitle();// wrote this one in CommonUtility
		Assert.assertEquals(expectedTitle, actualTitle);
		logger.info(actualTitle + "is equal to" + expectedTitle);
	}

	@When("User click On Sign in option")
	public void userClickOnSignInOption() {
		click(factory.signInPage().SignInBtn);
		logger.info("user clicked on Sign In option");

	}

	@When("User click On login button")
	public void userClickOnLoginButton() {
		click(factory.signInPage().loginButton);
		logger.info("user clicked on login button");

	}

	@When("User Should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		SlowDown();
		Assert.assertTrue(isElementDisplayed(factory.signInPage().LoggedIn));
		logger.info("user logged in into account");

	}

	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.orderPage().Orders);
		SlowDown();
		logger.info("user clicked on Orders section button");

	}

	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		click(factory.orderPage().FirstOrder);
		SlowDown();
		logger.info("user clicked on First Order button");

	}

	@When("User click On Cancel The Order button")
	public void userClickonCancelTheOrderButton() {
		click(factory.orderPage().CancelTheOder);
		SlowDown();
		logger.info("user clicked on Cancel Order button");

	}

	@When("User Select the cancelation Reason {string}")
	public void userselectTheCancelationReason(String value) {
		SlowDown();
		selectByVisibleText(factory.orderPage().SelectCancellationReason, value);
		logger.info("user selected on BroughtWrongItem");

	}

	@When("User click On Cancel Order button")
	public void userClickOnCancelOrderButton() {
		SlowDown();
		click(factory.orderPage().CancelOrder);
		logger.info("user clicked on cancel order button");
	}

	@Then("a cancelation Message should be displayed {string}")
	public void aCancelationmessageShouldBeDisplayed(String value) {
		SlowDown();
		Assert.assertTrue(isElementDisplayed(factory.orderPage().YourOrderHasBeenCancelled, value));
		logger.info("user clicked on cancel order button Your Order Has Been Cancelled is displayed");

	}

	@And("User click on Return Items button")
	public void UserClickOnReturnItemsButton() {
		SlowDown();
		click(factory.orderPage().ReturnItems);
		logger.info("user clicked on Return Items button");
		click(factory.orderPage().CheckBox);

	}

	@And("User select the Return Reason {string}")
	public void UserSelectTheReturnReason(String value) {
		SlowDown();
		selectByVisibleText(factory.orderPage().ReasonForReturn, value);
		logger.info("user selected on Item Demaged");
	}

	@And("User select the drop off service {string}")
	public void UserSelectTheDropOffService(String value) {
		SlowDown();
		selectByVisibleText(factory.orderPage().DropOffPlace, value);
		logger.info("user selected on DropOff Place as FedEx");
	}

	@And("User click on Return Order button")
	public void UserClickOnReturnorderButton() {
		SlowDown();
		List<WebElement> checkBox = factory.orderPage().checkBoxes;
		for (int i = 0; i < checkBox.size();) {
			checkBox.get(0).click();
			break;
		}
		logger.info("user clicked on check box button");

		click(factory.orderPage().ReturnOrder);
		logger.info("user clicked on Return Order button ");
	}

	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String value) {
		SlowDown();
		Assert.assertTrue(isElementDisplayed(factory.orderPage().ReturnWasSuccessful, value));
		logger.info("user clicked on return order button Return Was Successful is displayed");

	}

	@And("User click on Review button")
	public void UserClickOnReviewButton() {
		SlowDown();
		click(factory.orderPage().Review);
		logger.info("user clicked on Review button ");
	}

	@And("User write Review headline {string} and {string}")
	public void UserWriteReviewHeadline(String value1, String value2) {
		SlowDown();
		sendText(factory.orderPage().HeadLineInput, value1);
		sendText(factory.orderPage().ReviewText, value2);
		logger.info("user send comments on Headlineinput and review text column");

	}

	@And("User click Add your Review button")
	public void UserClickAddYourReviewButton() {
		SlowDown();
		click(factory.orderPage().AddYourReview);
		logger.info("user clicked on AddYourReview button ");
	}

	@Then("a review message should be displayed {string}")
	public void AReviewMessageShouldBeDisplayed(String value) {
		SlowDown();
		Assert.assertTrue(isElementDisplayed(factory.orderPage().YourReviewWasAddedSuccessfully, value));
		logger.info("user clicked on Add Your Review  button Your Review Was Added Sucessfully is displayed");

	}
}
