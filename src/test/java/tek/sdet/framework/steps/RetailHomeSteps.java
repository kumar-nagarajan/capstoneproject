package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.*;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailHomeSteps extends CommonUtility {
// all your step definitions classes wiil extends
// CommonUtility class	
// we need to create object of POMFactory class
// POMFactory instance should be on top of the class

	private POMFactory factory = new POMFactory();
	boolean isElectronics = false;
	boolean isComputers = false;
	boolean isSmartHome = false;
	boolean isSports = false;
	boolean isAutomotive = false;

	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().AllDept);
		SlowDown();
		logger.info("user clicked on All Section button");
	}

	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable data) {
		// List<String> options = data.asList(String.class);
		List<List<String>> optionsToDisplay = data.asLists(String.class);
		SlowDown();
		Assert.assertTrue(isElementDisplayed(
				getDriver().findElement(By.xpath("//span[text() = '" + optionsToDisplay.get(0).get(0) + "']"))));
		logger.info("user clicked All Button, All Sections Elements are present");
	}

	@And("user fill the signup information  with below data")
	public void UerFillTheSignupInformmationWithBelowData(DataTable data) {

		isElementDisplayed(factory.homePage().Electronics);

		logger.info("user entered requrired information into sign up form");
	}

	@When("User on Electronics")
	public void userOnElectronics() {
		click(factory.homePage().Electronics);
		isElementDisplayed(factory.homePage().TvandVideo);
		isElementDisplayed(factory.homePage().VideoGames);
		isElectronics = true;
		logger.info("User is on Electronics");
	}

	@When("User on Computers")
	public void userOnComputers() {
		click(factory.homePage().Computers);
		isElementDisplayed(factory.homePage().Accessories);
		isElementDisplayed(factory.homePage().Networking);
		logger.info("User is on Computers");
		isComputers = true;

	}

	@When("User on Smart Home")
	public void userOnSmartHome() {
		click(factory.homePage().SmartHome);
		isElementDisplayed(factory.homePage().SmartHomeLighting);
		isElementDisplayed(factory.homePage().PlugsandOutlets);
		logger.info("User is on Smart Home");
		isSmartHome = true;

	}

	@When("User on Sports")
	public void userOnSports() {
		click(factory.homePage().Sports);
		isElementDisplayed(factory.homePage().AthleticClothing);
		isElementDisplayed(factory.homePage().ExcerciseandFitness);
		isSports = true;
		logger.info("User is on Sports");

	}

	@When("User on Automotive")
	public void userOnAutomotive() {
		click(factory.homePage().Automative);
		isElementDisplayed(factory.homePage().AutomativePartsandAccessories);
		isElementDisplayed(factory.homePage().MotorcycleandPowersports);
		logger.info("User is on Automotive");
		isAutomotive = true;

	}

	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable data) {
		List<List<String>> department = data.asLists();

		if (isElectronics) {
			String tvAndVideo = (factory.homePage().TvandVideo).getText();
			String videogames = (factory.homePage().VideoGames).getText();
			Assert.assertEquals(tvAndVideo, department.get(0).get(0));
			Assert.assertEquals(videogames, department.get(0).get(1));
		} else if (isComputers) {
			String Accessories = (factory.homePage().Accessories).getText();
			String Networking = (factory.homePage().Networking).getText();
			Assert.assertEquals(Accessories, department.get(0).get(0));
			Assert.assertEquals(Networking, department.get(0).get(1));
		} else if (isSmartHome) {
			String SmartHomeLighting = (factory.homePage().SmartHomeLighting).getText();
			String PlugsandOutlets = (factory.homePage().PlugsandOutlets).getText();
			Assert.assertEquals(SmartHomeLighting, department.get(0).get(0));
			Assert.assertEquals(PlugsandOutlets, department.get(0).get(1));
		} else if (isSports) {
			String AthleticClothing = (factory.homePage().AthleticClothing).getText();
			String ExcerciseandFitness = (factory.homePage().ExcerciseandFitness).getText();
			Assert.assertEquals(AthleticClothing, department.get(0).get(0));
			Assert.assertEquals(ExcerciseandFitness, department.get(0).get(1));

		} else {
			String AutomativePartsandAccessories = (factory.homePage().AutomativePartsandAccessories).getText();
			String MotorcycleandPowersports = (factory.homePage().MotorcycleandPowersports).getText();
			Assert.assertEquals(AutomativePartsandAccessories, department.get(0).get(0));
			Assert.assertEquals(MotorcycleandPowersports, department.get(0).get(1));

		}

		logger.info("All options are  present in all departmnets");

	}

	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String value) {
		SlowDown();
		selectByVisibleText(factory.homePage().Alldepartments, value);
		logger.info("user selected on smart home department");
	}

	@When("User Change the category to {string}")
	public void userchangeTheCategoryTo(String value) {
		SlowDown();
		selectByVisibleText(factory.homePage().Alldepartments, value);
		logger.info("user selected on Electronics department");
	}

	@When("User search for an item {string}")
	public void userSearchForAnItem(String value) {
		SlowDown();
		sendText(factory.homePage().SearchInput, value);
		logger.info("user send text on smart home plug and outlets");
	}

	@When("User Search for an item {string}")
	public void usersearchForAnItem(String value) {
		SlowDown();
		sendText(factory.homePage().SearchInput, value);
		logger.info("user send text on Electronics video games  department");

	}

	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		SlowDown();
		click(factory.homePage().SearchIcon);
		logger.info("User clicked Kasa outdoor Smart Plug in search icon ");
	}

	@When("User Click on Search icon")
	public void userclickOnSearchIcon() {
		SlowDown();
		click(factory.homePage().SearchIcon);
		logger.info("User clicked Apex Legends in search icon ");

	}

	@When("User click on item")
	public void userClickOnItem() {
		SlowDown();
		click(factory.homePage().KasaOutdoorSmartPlug);
		logger.info("user clicked on smart home plug and outlets department");
	}

	@When("User Click on item")
	public void userclickOnItem() {
		SlowDown();
		click(factory.homePage().ApexLegends);
		logger.info("user clicked on Electronic in video games  department");

	}

	@When("User select quantity {string}")
	public void userSelectQuantity(String value) {
		SlowDown();
		selectByVisibleText(factory.homePage().Qty, value);
		logger.info("user selected quantity on qty icon ");
	}

	@When("User Select quantity {string}")
	public void userselectQuantity(String value) {
		SlowDown();
		selectByVisibleText(factory.homePage().Qty, value);
		logger.info("user selected quantity on qty icon ");

	}

	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
		SlowDown();
		click(factory.homePage().AddtoCart);
		logger.info("user clicked on Add to cart button");
	}

	@When("User Click add to Cart button")
	public void userclickAddToCartButton() {
		SlowDown();
		click(factory.homePage().AddtoCart);
		logger.info("user clicked on Add to cart button");

	}

	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String value) {
		SlowDown();
		click(factory.homePage().CartIcon);
		Assert.assertTrue(isElementDisplayed(factory.homePage().totalQuantity, value));
		logger.info("user clicked on cart button and quantity should be 2");

	}

	@Then("the Cart icon quantity should change to {string}")
	public void thecartIconQuantityShouldChangeTo(String value) {
		SlowDown();
		click(factory.homePage().CartIcon);
		Assert.assertTrue(isElementDisplayed(factory.homePage().totalQuantity, value));
		logger.info("user clicked on cart button and quantity should be 5");

	}

	@Then("User click on Cart option")
	public void userClickOnCartOption() {
		SlowDown();
		click(factory.homePage().CartOption);
		logger.info("user clicked on Cart option");
	}

	@Then("User Click on Cart option")
	public void userclickOnCartOption() {
		SlowDown();
		click(factory.homePage().CartOption);
		logger.info("user clicked on Cart option");

	}

	@And("User click on Proceed to Checkout button")
	public void UserClickOnProceddToCheckoutButton() {
		SlowDown();
		click(factory.homePage().ProceedToCheckout);
		logger.info("user clicked on proceed to checkout button");

	}

	@Then("User Click on Proceed to Checkout button")
	public void userclickOnProceedToCheckoutButton() {
		SlowDown();
		click(factory.homePage().ProceedToCheckout);
		logger.info("user clicked on proceed to checkout button");

	}

	@And("User click Add a new address link for shipping address")
	public void UserClickAddANewAddressLinkForShippingAddress() {
		SlowDown();
		click(factory.homePage().AddNewAddress);
		logger.info("user clicked on proceed to Add new address button");
	}

	/*
	 * @And("User fill Debit or credit card information") public void
	 * UserFillDebitOrCreditCardInformation(DataTable data) { List<Map<String,
	 * String>> signUpData = data.asMaps(String.class, String.class);
	 * 
	 * sendText(factory.accountPage().CardNumber,
	 * signUpData.get(0).get("cardNumber")); SlowDown();
	 * sendText(factory.accountPage().NameOnCard,
	 * signUpData.get(0).get("nameOnCard")); SlowDown();
	 * sendText(factory.accountPage().ExpMonth,
	 * signUpData.get(0).get("expirationMonth")); SlowDown();
	 * sendText(factory.accountPage().ExpYear,
	 * signUpData.get(0).get("expirationYear")); SlowDown();
	 * sendText(factory.accountPage().SecurityCode,
	 * signUpData.get(0).get("securityCode"));
	 * 
	 * logger.info("user enter card details");
	 * 
	 * }
	 */
	@And("User click Add a credit card or Debit Card for Payment method")
	public void UserClickAddACreditCardOrDebitCardForPaymentMethod() {
		click(factory.homePage().AddNewCard);
		logger.info("user added your card details");
		SlowDown();

	}

	@Then("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable data) {
		List<Map<String, String>> newAddress = data.asMaps(String.class, String.class);

		selectByVisibleText(factory.accountPage().Country, "United States");

		// sendText(factory.accountPage().Country, signUpData.get(0).get("country"));
		SlowDown();
		sendText(factory.accountPage().FullName, newAddress.get(0).get("fullName"));
		SlowDown();
		sendText(factory.accountPage().PhoneNo, newAddress.get(0).get("phoneNumber"));
		SlowDown();
		sendText(factory.accountPage().Street, newAddress.get(0).get("streetAddress"));
		SlowDown();
		sendText(factory.accountPage().Apt, newAddress.get(0).get("apt"));
		SlowDown();
		sendText(factory.accountPage().city, newAddress.get(0).get("city"));
		SlowDown();
		selectByVisibleText(factory.accountPage().State, "California");
		SlowDown();
		sendText(factory.accountPage().Zipcode, newAddress.get(0).get("zipCode"));
		SlowDown();
		logger.info("user add information and entered successfully");

	}

	/*
	 * @And("User click on Add your card button") public void
	 * UserClickOnAddYourCardButton() { click(factory.accountPage().ADDYourAddress);
	 * SlowDown();
	 * 
	 * 
	 * logger.info("user clicked on add your Address button"); }
	 */
	@And("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		SlowDown();
		click(factory.homePage().PlaceYourOrder);
		logger.info("user clicked on place your order button");
	}

	@Then("User Click on Place Your Order")
	public void userclickOnPlaceYourOrder() {
		SlowDown();
		click(factory.homePage().PlaceYourOrder);
		logger.info("user clicked on place your order button");
	}

	@Then("A Message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String string) {
		SlowDown();
		SlowDown();
		Assert.assertTrue(isElementDisplayed(factory.homePage().OrderPlacedThanks));
		logger.info("a message displayed order placed successfully");
	}

	@Then("a Message Should be displayed {string}")
	public void AmessageshouldBeDisplayed(String value) {
		SlowDown();
		SlowDown();
		Assert.assertTrue(isElementDisplayed(factory.homePage().OrderPlacedSuccessfully));
		logger.info("a message displayed order placed successfully");
	}

}
