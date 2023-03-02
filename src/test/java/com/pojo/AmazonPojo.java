package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.AmazonBase;

public class AmazonPojo extends AmazonBase {
	
	public AmazonPojo() {
		PageFactory.initElements(driver, this);	}
	
	@FindBy (id = "nav-link-accountList")
	private WebElement helloSignIn; 
	
	@FindBy (xpath = "//a[@id='nav-link-accountList']")
	private WebElement helloSignIn1;	

	@FindBy (name = "email")
	private WebElement emailId;
	
	@FindBy (xpath ="//input[@type='submit']")
    private WebElement continueButton; 
	
	@FindBy (name = "password")
	private WebElement passWord;
	
	@FindBy (xpath = "(//input[@type='submit'])[1]")
	private WebElement signIn;
	
	@FindBy (id = "twotabsearchtextbox")
	private WebElement searchBar;

	@FindBy (xpath = "//span[text()='Apple iPhone 13 (512GB) - (Product) RED']")
	private WebElement iphone13;
	
	@FindBy (xpath = "//input[@id='add-to-cart-button']")
	private WebElement addToCart;
	
	@FindBy (xpath = "//a[@id='nav-cart']")
	private WebElement cart;
	
	@FindBy (xpath = "//span[@class='a-button-text a-declarative']")
	private WebElement dropDown;
	
	@FindBy (xpath = "//input[@value='Delete']")
	private WebElement deleteButton2;
	
	@FindBy (xpath = "//span[@class='a-button-text a-declarative']")
	private WebElement qtyButton;
	
	@FindBy (id = "quantity_2")
	private WebElement qty2;
	
	@FindBy (id = "quantity_1")
	private WebElement qty1;
	
	@FindBy (id = "nav-logo-sprites")
	private WebElement homeButton;
	
	@FindBy (xpath = "//span[text()='Brat Black 46 Cms Casual Backpack']")
	private WebElement skyBag;
	
	@FindBy (name = "proceedToRetailCheckout")
	private WebElement proceedToBuyButton;
	
	@FindBy (xpath = "(//input[@value='Delete'])[1]")
	private WebElement deleteButton1;
	
	@FindBy (xpath = "(//input[@class='a-button-input'])[2]")
	private WebElement useThisAddressButton;
	
	@FindBy (xpath = "(//input[@name='ppw-instrumentRowSelection'])[1]")
	private WebElement debitCardOption;
	
	@FindBy (xpath = "(//a[text()='Enter card details'])[1]")
	private WebElement enterCardDetailsButton;
	
	@FindBy (xpath = "//span[@class='a-list-item']")
	private WebElement errorMessage;
	
	@FindBy (xpath = "//*[@id='nav-al-your-account']/a[13]")
	private WebElement signOutButton;
	
	public WebElement getHelloSignIn1() {
		return helloSignIn1;
	}
	
	public WebElement getSignOutButton() {
		return signOutButton;
	}

	public WebElement getErrorMessage() {
		return errorMessage;
	}

	public WebElement getDeleteButton1() {
		return deleteButton1;
	}
	
	public WebElement getUseThisAddressButton() {
		return useThisAddressButton;
	}

	public WebElement getDebitCardOption() {
		return debitCardOption;
	}

	public WebElement getEnterCardDetailsButton() {
		return enterCardDetailsButton;
	}

	public WebElement getDeleteButton2() {
		return deleteButton2;
	}

	public WebElement getQtyButton() {
		return qtyButton;
	}

	public WebElement getQty2() {
		return qty2;
	}

	public WebElement getQty1() {
		return qty1;
	}

	public WebElement getHomeButton() {
		return homeButton;
	}

	public WebElement getSkyBag() {
		return skyBag;
	}

	public WebElement getProceedToBuyButton() {
		return proceedToBuyButton;
	}

	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getIphone13() {
		return iphone13;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getDropDown() {
		return dropDown;
	}
	

	public WebElement getHelloSignIn() {
		return helloSignIn;
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getSignIn() {
		return signIn;
	}
	

}
