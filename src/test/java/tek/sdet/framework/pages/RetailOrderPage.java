package tek.sdet.framework.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
		
}
	@FindBy(xpath="//a[@id='orderLink']")
	public WebElement Orders;
	@FindBy(xpath="(//p[text()='Show Details'])[1]")
	public WebElement FirstOrder;
	@FindBy(xpath="//button[@id='cancelBtn']")
	public WebElement CancelTheOder ;
	@FindBy(xpath="//select[@id='reasonInput']")
	public WebElement SelectCancellationReason;
	@FindBy(xpath="//button[@id='orderSubmitBtn']")
	public WebElement CancelOrder;
	@FindBy(xpath="//p[text()='Your Order Has Been Cancelled']")
	public WebElement YourOrderHasBeenCancelled;
	
	
	@FindBy(xpath="//button[text()='Return Items']")
	public WebElement ReturnItems;
	@FindBy(xpath="//select[@id='reasonInput']")
	public WebElement ReasonForReturn;
	@FindBy(xpath="//select[@id='dropOffInput']")
	public WebElement DropOffPlace;
	@FindBy(xpath="//button[@id='orderSubmitBtn']")
	public WebElement ReturnOrder;
	@FindBy(xpath="//p[text()='Return was successfull']")
	public WebElement ReturnWasSuccessful;
	
	
	@FindBy(xpath="//button[@id='reviewBtn']")
	public WebElement Review;
	@FindBy(xpath="//input[@id='headlineInput']")
	public WebElement HeadLineInput ;
	@FindBy(xpath="//textarea[@id='descriptionInput']")
	public WebElement ReviewText ;
	@FindBy(xpath="//button[@id='reviewSubmitBtn']")
	public WebElement AddYourReview ;
	@FindBy(xpath="//div[text()='Your review was added successfully']")
	public WebElement YourReviewWasAddedSuccessfully;
	@FindBy(xpath="(//p[@class='order__cancel-item-wrapper']/following::input[@type='checkbox'])[1]")
	public WebElement CheckBox;
	@FindBy(xpath="//p[@class='order__cancel-item-wrapper']/following::input[@type='checkbox']")
	public List<WebElement> checkBoxes;
			
	
}
