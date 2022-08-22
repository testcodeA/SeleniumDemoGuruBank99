package com.demoguru99bank.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoguru99bank.generics.AutoConstant;
import com.demoguru99bank.generics.BasePage;
import com.demoguru99bank.generics.ExcelLibrary;

public class GuruBankDepositPage extends BasePage implements AutoConstant{
  @FindBy(xpath="//input[@name='accountno']")
  private WebElement accountnoTextField;
  
  @FindBy(xpath="(//input[@type='text'])[2]")
  private WebElement amountTextField;
  
  @FindBy(xpath="//input[@name='desc']")
  private WebElement descriptionTextBox;
  
  @FindBy(xpath="//input[@name='AccSubmit']")
  private WebElement submitButton;
  
  @FindBy(xpath="//input[@value='Reset']")
  private WebElement resetButton;
  
  public GuruBankDepositPage(WebDriver driver){
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
	  
  }
  public void accountnoMethod() throws IOException{
	  accountnoTextField.sendKeys(ExcelLibrary.getCellValue(excel_path, excel_sheet, 9, 0));
  }
  public void amountMethod() throws IOException{
	  amountTextField.sendKeys(ExcelLibrary.getCellValue(excel_path, excel_sheet, 9, 1));
  }
  public void descriptionMethod() throws IOException{
	  descriptionTextBox.sendKeys(ExcelLibrary.getCellValue(excel_path, excel_sheet, 9, 2));
  }
  public void submitMethod(){
	  submitButton.click();
  }
  public void resetMethod(){
	  resetButton.click();
  }
  
}
