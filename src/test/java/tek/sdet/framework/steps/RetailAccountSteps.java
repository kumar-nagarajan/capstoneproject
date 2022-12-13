package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.accountPage().AccountBtn);
		logger.info("user clicked on Account button");

	}

	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String value1, String value2) {
		clearTextUsingSendKeys(factory.accountPage().Name);
		sendText(factory.accountPage().Name, value1);
		clearTextUsingSendKeys(factory.accountPage().PhoneNumber);
		sendText(factory.accountPage().PhoneNumber, value2);
		logger.info("user updated name and phone numer");
	}

	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().UpdateBtn);
		logger.info("user clicked on update button");

	}

	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		SlowDown();
		Assert.assertTrue(isElementDisplayed(factory.accountPage().ProfileUpdated));
		logger.info("user profile updated message is Displayed");
	}

	@When("User enter below information")
	public void userEnterBelowInformation(DataTable data) {
		List<Map<String, String>> passwordUpdate = data.asMaps(String.class, String.class);
		sendText(factory.accountPage().previousPasswordInput, passwordUpdate.get(0).get("previousPassword"));
		SlowDown();
		sendText(factory.accountPage().NewPasswordInput, passwordUpdate.get(0).get("newPassword"));
		SlowDown();
		sendText(factory.accountPage().ConfirmPasswordInput, passwordUpdate.get(0).get("confirmPassword"));
		SlowDown();
		logger.info("user updated newpassword and confirm password");
	}

	@When("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
		click(factory.accountPage().PasswordUpdated);
		logger.info("user clicked on update button");
		SlowDown();
	}

	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String value) {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().PasswordUpdatedSuccess, value));

		logger.info("user password updated message is Displayed");
	}

	@And("User click on Add a payment method link")
	public void UserClickOnAddAPaymentMethodLink() {
		click(factory.accountPage().AddPaymentMethod);
		logger.info("user clicked on Add Your payment method");
	}

	@When("User fill Debit or credit card information")
	public void UserFillDebitOrCreditCardInformation(DataTable data) {
		List<Map<String, String>> paymentInformation = data.asMaps(String.class, String.class);
		sendText(factory.accountPage().CardNumber, paymentInformation.get(0).get("cardNumber"));
		SlowDown();
		sendText(factory.accountPage().NameOnCard, paymentInformation.get(0).get("nameOnCard"));
		SlowDown();
		selectByVisibleText(factory.accountPage().ExpMonth, paymentInformation.get(0).get("expirationMonth"));
		SlowDown();
		selectByVisibleText(factory.accountPage().ExpYear, paymentInformation.get(0).get("expirationYear"));
		SlowDown();
		sendText(factory.accountPage().SecurityCode, paymentInformation.get(0).get("securityCode"));
		logger.info("user added card details");
	}

	@And("User click on Add your card button")
	public void UserClickOnAddYourCardButton() {
		click(factory.accountPage().UpdatePaymentMethod);
		logger.info("user added your card detail");
		SlowDown();
	}

	@Then("a Message should be displayed {string}")
	public void aMessageShouldBeDisplayed1(String value) {
		// SlowDown();
		Assert.assertTrue(isElementDisplayed(factory.accountPage().PaymentMethodaddedSuccess, value));
		logger.info("Payment Method added message successfully");
	}

	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		// click(factory.accountPage().ChooseEdit);
		List<WebElement> cardList = factory.accountPage().ChooseEdit;
		for (WebElement card : cardList) {
			if (card.getText().contains("4126")) {
				System.out.println(card.getText());
				card.click();
				break;
			}
		}
		SlowDown();
		click(factory.accountPage().EditPaymentMethod);
		logger.info("user edit your card detail");
	}

	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable data) {
		List<Map<String, String>> paymentInformation = data.asMaps(String.class, String.class);
		clearTextUsingSendKeys(factory.accountPage().CardNumber);
		sendText(factory.accountPage().CardNumber, paymentInformation.get(0).get("cardNumber"));
		SlowDown();
		clearTextUsingSendKeys(factory.accountPage().NameOnCard);
		sendText(factory.accountPage().NameOnCard, paymentInformation.get(0).get("nameOnCard"));
		SlowDown();
		selectByVisibleText(factory.accountPage().ExpMonth, paymentInformation.get(0).get("expirationMonth"));
		SlowDown();
		selectByVisibleText(factory.accountPage().ExpYear, paymentInformation.get(0).get("expirationYear"));
		SlowDown();
		clearTextUsingSendKeys(factory.accountPage().SecurityCode);
		sendText(factory.accountPage().SecurityCode, paymentInformation.get(0).get("securityCode"));
		logger.info("user edit new card details");
	}

	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.accountPage().UpdatePaymentMethod);
		logger.info("user updated your card detail");
	}

	@Then("a MEssage should be displayed {string}")
	public void amessageShouldBeDisplayed1(String value) {
		// SlowDown();
		Assert.assertTrue(isElementDisplayed(factory.accountPage().PaymentMethodUpdatedSuccess, value));
		logger.info("Payment Method updated message successfully");

	}

	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		SlowDown();
		click(factory.accountPage().debitCard);
		click(factory.accountPage().RemoveCard);
		logger.info("user clicked on Remove button");
	}

	@Then("payment details should be removed")
	public void PaymentDetailsShouldBeRemoved() {
		logger.info("user Card detail removed sucessfully");
	}

	@And("User click on Add address option")
	public void UserClickOnAddAddressOption() {
		click(factory.accountPage().AddAddress);
		logger.info("user clicked on Add Address button");
	}

	@And("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable data) {
		List<Map<String, String>> addressData = data.asMaps(String.class, String.class);
		selectByVisibleText(factory.accountPage().Country, "United States");
		SlowDown();
		sendText(factory.accountPage().FullName, addressData.get(0).get("fullName"));
		SlowDown();
		sendText(factory.accountPage().PhoneNo, addressData.get(0).get("phoneNumber"));
		SlowDown();
		sendText(factory.accountPage().Street, addressData.get(0).get("streetAddress"));
		SlowDown();
		sendText(factory.accountPage().Apt, addressData.get(0).get("apt"));
		SlowDown();
		sendText(factory.accountPage().city, addressData.get(0).get("city"));
		SlowDown();
		selectByVisibleText(factory.accountPage().State, "California");
		SlowDown();
		sendText(factory.accountPage().Zipcode, addressData.get(0).get("zipCode"));
		SlowDown();
		logger.info("user add information and entered successfully");
	}

	@And("User click Add Your Address button")
	public void UserClickAndYourAddressButton() {
		click(factory.accountPage().ADDYourAddress);
		SlowDown();
		logger.info("user clicked on add your Address button");
	}

	@Then("a message should be Displayed {string}")
	public void AMessageShouldBeDisplayed(String value) {

		Assert.assertTrue(isElementDisplayed(factory.accountPage().AddressAddedSucess, value));
		logger.info("user Address Added Sucess message is Displayed");
	}

	@And("User click on edit address option")
	public void UserClickOnEditAddressOption() {
		click(factory.accountPage().EditAddress);
		logger.info("user clicked on edit Address button");
	}

	@And("user fill new Address form with below information")
	public void UserFillNewaddressFormWithBelowInformation(DataTable data) {
		List<Map<String, String>> newAddressData = data.asMaps(String.class, String.class);
		selectByVisibleText(factory.accountPage().Country, "United States");
		clearTextUsingSendKeys(factory.accountPage().FullName);
		sendText(factory.accountPage().FullName, newAddressData.get(0).get("fullName"));
		SlowDown();
		clearTextUsingSendKeys(factory.accountPage().PhoneNo);
		sendText(factory.accountPage().PhoneNo, newAddressData.get(0).get("phoneNumber"));
		SlowDown();
		clearTextUsingSendKeys(factory.accountPage().Street);
		sendText(factory.accountPage().Street, newAddressData.get(0).get("streetAddress"));
		SlowDown();
		clearTextUsingSendKeys(factory.accountPage().Apt);
		sendText(factory.accountPage().Apt, newAddressData.get(0).get("apt"));
		SlowDown();
		clearTextUsingSendKeys(factory.accountPage().city);
		sendText(factory.accountPage().city, newAddressData.get(0).get("city"));
		SlowDown();
		selectByVisibleText(factory.accountPage().State, "California");
		SlowDown();
		clearTextUsingSendKeys(factory.accountPage().Zipcode);
		sendText(factory.accountPage().Zipcode, newAddressData.get(0).get("zipCode"));
		SlowDown();
		logger.info("user edit Address information and entered successfully");
	}

	@And("User click update Your Address button")
	public void UserClickUpdateYourAddressButton() {
		click(factory.accountPage().updateAddressDetail);
		logger.info("user clicked on update address button");
		SlowDown();
	}

	@Then("a message should Be displayed {string}")
	public void AMessageShouldbeDisplayed(String value) {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().UpdateAddressDisplayed, value));
		logger.info("user Address updated Sucess message is Displayed");

	}

	@And("User click on remove option of Address section")
	public void UserClickOnRemoveOptionOfAddressSection() {
		SlowDown();
		click(factory.accountPage().RemoveAddress);
		logger.info("user clicked on Remove button");
	}

	@Then("Address details should be removed")
	public void AddressDetailsShouldBeRemoved() {
		SlowDown();
		logger.info("user Address detail removed sucessfully");
	}

}
