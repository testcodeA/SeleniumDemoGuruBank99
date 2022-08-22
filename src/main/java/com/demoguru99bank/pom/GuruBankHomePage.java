package com.demoguru99bank.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoguru99bank.generics.AutoConstant;
import com.demoguru99bank.generics.BasePage;

public class GuruBankHomePage extends BasePage implements AutoConstant{

	@FindBy(xpath="//a[.='Manager']")
	private WebElement managerLink;
	@FindBy(xpath="//a[.='New Customer']")
	private WebElement newcustomerLink;
	
	@FindBy(xpath="//a[.='Edit Customer']")
	private WebElement editcustomerLink;
	
	@FindBy(xpath="//a[.='Delete Customer']")
	private WebElement deletecustomerLink;
	
	@FindBy(xpath="//a[.='New Account']")
	private WebElement newaccountLink;
	
	@FindBy(xpath="//a[.='Edit Account']")
	private WebElement editaccountLink;
	
	@FindBy(xpath="//a[.='Delete Account']")
	private WebElement deleteaccountLink;
	
	@FindBy(xpath="//a[.='Deposit']")
	private WebElement depositLink;
	
	@FindBy(xpath="//a[.='Withdrawal']")
	private WebElement withdrawlLink;
	
	@FindBy(xpath="//a[.='Fund Transfer']")
	private WebElement fundtransferLink;
	
	@FindBy(xpath="//a[.='Change Password']")
	private WebElement changepasswordLink;
	
	@FindBy(xpath="//a[.='Balance Enquiry']")
	private WebElement balanceenquiryLink;
	
	@FindBy(xpath="//a[.='Mini Statement']")
	private WebElement ministatementLink;
	
	@FindBy(xpath="//a[.='Customised Statement']")
	private WebElement customisedstatementLink;
	
	@FindBy(xpath="//a[.='Log out']")
	private WebElement logoutLink;
	
	public GuruBankHomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void managerMethod(){
		managerLink.click();
	}
	public void newcustomerMethod(){
		newcustomerLink.click();
	}
	public void editcustomerMethod(){
		editcustomerLink.click();
	}
	public void deletecustomerMethod(){
		deletecustomerLink.click();
	}
	public void newaccountMethod(){
		newaccountLink.click();
	}
	public void editaccountMethod(){
		editaccountLink.click();
	}
	public void deleteaccountMethod(){
		deleteaccountLink.click();
	}
	public void depositMethod(){
		depositLink.click();
	}
	public void withdrawlMethod(){
		withdrawlLink.click();
	}
	public void fundtransferMethod(){
		fundtransferLink.click();
	}
	public void changepasswordMethod(){
		changepasswordLink.click();
	}
	public void balanceenquiryMethod(){
		balanceenquiryLink.click();
	}
	public void ministatementMethod(){
		ministatementLink.click();
	}
	public void customisestatementMethod(){
		customisedstatementLink.click();
	}
	public void logoutMethod(){
		logoutLink.click();
	}
	
}
