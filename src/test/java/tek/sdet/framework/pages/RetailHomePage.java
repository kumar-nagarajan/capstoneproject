package tek.sdet.framework.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
		
	}
	
	@FindBy(xpath="//h1[text()='Shop By department']")
	public WebElement ShopByDepartment;
	
	@FindBy(xpath="//span[text()='All']")
	public WebElement AllDept;
	
	@FindBy(xpath="//span[text()='Electronics']")
	public WebElement Electronics;
	@FindBy(xpath="//span[text()='TV & Video']")
	public WebElement TvandVideo;
	@FindBy(xpath="//span[text()='Video Games']")
	public WebElement VideoGames ;
	
	@FindBy(xpath="//span[text()='Computers']")
	public WebElement Computers;
	@FindBy(xpath="//span[text()='Accessories']")
	public WebElement Accessories;
	@FindBy(xpath="//span[text()='Networking']")
	public WebElement Networking;
	
	@FindBy(xpath="//span[text()='Smart Home']")
	public WebElement SmartHome;
	@FindBy(xpath="//span[text()='Smart Home Lightning']")
	public WebElement SmartHomeLighting;
		
	@FindBy(xpath="//span[text()='Sports']")
	public WebElement Sports;
	@FindBy(xpath="//span[text()='Athletic Clothing']")
	public WebElement AthleticClothing ;
	@FindBy(xpath="//span[text()='Exercise & Fitness']")
	public WebElement ExcerciseandFitness;
	@FindBy(xpath="//span[text()='Plugs and Outlets']")
	public WebElement PlugsandOutlets;
	
	@FindBy(xpath="//span[text()='Automative']")
	public WebElement Automative;
	@FindBy(xpath="//span[text()='Automative Parts & Accessories']")
	public WebElement AutomativePartsandAccessories;
	@FindBy(xpath="//span[text()='MotorCycle & Powersports']")
	public WebElement MotorcycleandPowersports;
	
	@FindBy(xpath="//select[@id='search']")
	public WebElement Alldepartments;
	@FindBy(xpath="//option[text()='Smart Home']")
	public WebElement SmrtHome;
	
	@FindBy(xpath="//input[@id='searchInput']")
	public WebElement SearchInput;
	@FindBy(xpath="//button[@id='searchBtn']")
	public WebElement SearchIcon;
	@FindBy(xpath="//p[text()='Kasa Outdoor Smart Plug']")
	public WebElement KasaOutdoorSmartPlug ;
	@FindBy(xpath="//select[@class='product__select']")
	public WebElement Qty;
	@FindBy(xpath="//button[@id='addToCartBtn']")
	public WebElement AddtoCart ;
	@FindBy(xpath="//p[text()='Cart ']")
	public WebElement CartIcon;
	@FindBy(xpath="//span[@id='cartQuantity']")
	public WebElement CartOption;
	@FindBy(xpath="//span[@id='totalQuantity']")
	public WebElement totalQuantity;
		
	@FindBy(xpath="//button[@id='proceedBtn']")
	public WebElement ProceedToCheckout;
	@FindBy(xpath="//button[@id='addAddressBtn']")
	public WebElement AddNewAddress;
	
	@FindBy(xpath="//button[@id='addPaymentBtn']")
	public WebElement AddNewCard;
	@FindBy(xpath="//button[@id='placeOrderBtn']")
	public WebElement PlaceYourOrder;
	@FindBy(xpath="//div[text()='Order Placed Successfully']")
	public WebElement OrderPlacedSuccessfully;
	@FindBy(xpath="//p[text()='Order Placed, Thanks']")
	public WebElement OrderPlacedThanks;
	
	
	@FindBy(xpath="//option[text()='Electronics']")
	public WebElement Electronicss;
	@FindBy(xpath="//p[text()='Apex Legends - 1,000 Apex Coins']")
	public WebElement ApexLegends ;
}
	

