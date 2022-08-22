package com.demoguru99bank.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoguru99bank.generics.AutoConstant;
import com.demoguru99bank.generics.BasePage;
import com.demoguru99bank.generics.ExcelLibrary;

public class GuruBankNewAccountPage  extends BasePage implements AutoConstant{
   @FindBy(xpath="//input[@name='cusid']")
   private WebElement customeridTextField;
   
   @FindBy(xpath="//select[@name='selaccount']")
   private WebElement accounttypeDropDown;
  
   @FindBy(xpath="//select[@name='selaccount']/option[@value='Savings']")
   private WebElement savingsaccountDropDown;
   
   @FindBy(xpath="//select[@name='selaccount']/option[@value='Current']")
   private WebElement currentaccountDropDown;
   
   @FindBy(xpath="//input[@name='inideposit']")
   private WebElement initialdepositTextField;
   
   @FindBy(xpath="//input[@value='submit']")
   private WebElement submitButton;
   
   @FindBy(xpath="//input[@type='reset']")
   private WebElement resetButton;
   
   public GuruBankNewAccountPage(WebDriver driver){
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   public void customeridMethod() throws IOException{
	   customeridTextField.sendKeys(ExcelLibrary.getCellValue(excel_path, excel_sheet, 5, 0));
   }
   public void accountypeMethod(){
	  // BasePage.selectByVisibleText(accounttypeDropDown, "Savings");
	  BasePage.selectByVisibleText(accounttypeDropDown, "Current");
   }
   public void initialDepositMethod() throws IOException{
	   initialdepositTextField.sendKeys(ExcelLibrary.getCellValue(excel_path, excel_sheet, 7, 0));
   }
   public void submitMethod(){
	   submitButton.click();
   }
   public void resetButton(){
	   resetButton.click();
   }
   
}
