package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
}
	@FindBy(xpath = "//a[@id='accountLink']")
	public WebElement AccountBtn;
	@FindBy(xpath = "//input[@id='nameInput']")
	public WebElement Name;
	@FindBy(xpath = "//input[@id='personalPhoneInput']")
	public WebElement PhoneNumber;
	@FindBy(xpath = "//button[@id='personalUpdateBtn']")
	public WebElement UpdateBtn;
	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement ProfileUpdated;
	
	
	@FindBy(xpath="//input[@id=\"previousPasswordInput\"]")
	public WebElement previousPasswordInput;
	@FindBy(xpath="//input[@id='newPasswordInput']")
	public WebElement NewPasswordInput ;
	@FindBy(xpath="//input[@id='confirmPasswordInput']")
	public WebElement ConfirmPasswordInput;
	@FindBy(xpath="//button[text()='Change Password']")
	public WebElement PasswordUpdated;
	@FindBy(xpath = "//div[text()='Password Updated Successfully']")
	public WebElement PasswordUpdatedSuccess;
	
	
	
	@FindBy(xpath="//input[@id='cardNumberInput']")
	public WebElement CardNumber;
	@FindBy(xpath="//input[@id='nameOnCardInput']")
	public WebElement NameOnCard;
	@FindBy(xpath="//select[@id='expirationMonthInput']")
	public WebElement ExpMonth;
	@FindBy(xpath = "//select[@id='expirationYearInput']")
	public WebElement ExpYear;
	@FindBy(xpath = "//input[@id='securityCodeInput']")
	public WebElement SecurityCode;
	@FindBy(xpath="//button[@id='paymentSubmitBtn']")
	public WebElement UpDatePaymentOption;
	@FindBy(xpath = "//div[@role='alert']//div[text()='Payment Method added sucessfully']")
	public WebElement PaymentMethodaddedSuccess;
	@FindBy(xpath="//div[text()='Payment Method added Successfully']")
	public WebElement PaymentMethodAddedSuccess;
	@FindBy(xpath="//p[text()='Add a payment method']")
	public WebElement AddPaymentMethod;
	@FindBy(xpath="//p[text()='Debit Card Ending in .... ']")
	public List<WebElement> ChooseEdit;
	@FindBy(xpath="//button[text()='Edit' and @class='text-blue-800 cursor-pointer hover:underline']")
	public WebElement EditPaymentMethod;
	@FindBy(xpath="//button[text()='Update Your Card']")
	public WebElement UpdateCardMethod;
	@FindBy(xpath = "//div[@role='alert']//div[text()='Payment Method updateed sucessfully']")
	public WebElement PaymentMethodUpdatedSuccess;
	
	
	@FindBy(xpath="//button[text()='remove']")
	public WebElement RemoveCard;
	@FindBy(xpath="//p[text()='Debit Card Ending in .... ']")
	public WebElement debitCard;
	
	@FindBy(xpath="//div[@class='flex shadow bg-white p-4 rounded']")
	public WebElement CardRemoved;
	
	@FindBy(xpath="//button[@id='paymentSubmitBtn']")
	public WebElement UpdatePaymentMethod;
	@FindBy(xpath="(//button[text()='Edit'])[1]")
	public WebElement EditCardDetail;
	
	@FindBy(xpath="//p[text()='Add Address']")
	public WebElement AddAddress;
	@FindBy(xpath="(//select[@class='account__address-new-dropdown'])[1]")
	public WebElement Country;
	@FindBy(xpath="//input[@id='fullNameInput']")
	public WebElement FullName;
	@FindBy(xpath="//input[@id='phoneNumberInput']")
	public WebElement PhoneNo ;
	@FindBy(xpath="//input[@id='streetInput']")
	public WebElement Street;
	@FindBy(xpath="//input[@id='apartmentInput']")
	public WebElement Apt;
	@FindBy(xpath="//input[@id='cityInput']")
	public WebElement city;
	@FindBy(xpath="(//select[@class='account__address-new-dropdown'])[2]")
	public WebElement State;
	@FindBy(xpath="//input[@id='zipCodeInput']")
	public WebElement Zipcode;
	@FindBy(xpath="//button[@id='addressBtn'] |//button[text()='Add Your Address']")
	public WebElement ADDYourAddress;
	@FindBy(xpath = "//div[text()='Address Added Successfully']")
	public WebElement AddressAddedSucess;
	@FindBy(xpath = "//button[text()='Remove']")
	public WebElement RemoveAddress;
	@FindBy(xpath="//div[@class='account__address-single']")
	public WebElement AddressDetailRemoved;
	@FindBy(xpath="//button[text()='Edit']")
	public WebElement EditAddress;
	@FindBy(xpath="//button[text()='Update Your Address']")
	public WebElement updateAddressDetail;
	@FindBy(xpath="//div[text()='Address Updated Successfully']")
	public WebElement UpdateAddressDisplayed;
	@FindBy(xpath="//div//button[text()='Remove']")
	public WebElement AddressRemove;
}


