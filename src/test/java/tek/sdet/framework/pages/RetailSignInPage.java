package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//a[text()='Sign in']")
	public WebElement SignInBtn;
	@FindBy(xpath = "//a[@id='accountLink']")
	public WebElement LoggedIn;
	@FindBy(id = "email")
	public WebElement emailField;
	@FindBy(id = "password")
	public WebElement passwordField;
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement loginButton;

	@FindBy(xpath = "//a[@id='newAccountBtn']")
	public WebElement CreateAccountBtn;
	@FindBy(xpath = "//button[@id='signupBtn']")
	public WebElement signUpBtn;
	@FindBy(id = "nameInput")
	public WebElement nameInput;
	@FindBy(id = "emailInput")
	public WebElement NewEmail;
	@FindBy(id = "passwordInput")
	public WebElement Password1;
	@FindBy(id = "confirmPasswordInput")
	public WebElement ConfirmPassword1;
	@FindBy(xpath = "//h1[text()='Your Profile']")
	public WebElement YourProfile;
}