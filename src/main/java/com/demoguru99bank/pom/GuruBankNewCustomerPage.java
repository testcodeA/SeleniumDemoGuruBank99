package com.demoguru99bank.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.demoguru99bank.generics.AutoConstant;
import com.demoguru99bank.generics.BasePage;
import com.demoguru99bank.generics.ExcelLibrary;

public class GuruBankNewCustomerPage extends BasePage implements AutoConstant {
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement customernameTextField;
	
	@FindBy(xpath="(//input[@type='radio'])[1]")
	private WebElement maleRadioButton;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement femaleRadioButton;
	
	@FindBy(xpath="//input[@name='dob']")
	private WebElement dateofbirthcalendarDropDown;
	
	@FindBy(xpath="//textarea[@name='addr']")
	private WebElement addressTextArea;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement cityTextField;
	
	@FindBy(xpath="//input[@name='state']")
	private WebElement stateTextField;
   
	@FindBy(xpath="//input[@onkeyup='validatePIN();']")
	private WebElement pincodeTextField;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	private WebElement telephoneTextField;
	
	@FindBy(xpath="//input[@name='emailid']")
	private WebElement emailTextField;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordTextField;
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement submitButton;
	
	@FindBy(xpath="//input[@value='Reset']")
	private WebElement resetButton;
	
	public GuruBankNewCustomerPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void customernameMethod() throws IOException{
		customernameTextField.sendKeys(ExcelLibrary.getCellValue(excel_path, excel_sheet, 3, 0));;
	}
	public void maleMethod(){
		maleRadioButton.sendKeys();;
	}
	public void femaleMethod(){
		femaleRadioButton.click();
	}
	public void dateofbirthMethod() throws IOException{
		
		dateofbirthcalendarDropDown.sendKeys(ExcelLibrary.getCellValue(excel_path, excel_sheet, 3, 2));;
	}
	public void addressMethod() throws IOException{
		addressTextArea.sendKeys(ExcelLibrary.getCellValue(excel_path, excel_sheet, 3, 1));;
	}
	public void cityMethod() throws IOException{
		cityTextField.sendKeys(ExcelLibrary.getCellValue(excel_path, excel_sheet, 3, 3));;
	}
	public void stateMethod() throws IOException{
		stateTextField.sendKeys(ExcelLibrary.getCellValue(excel_path, excel_sheet, 3, 4));;
		
	}
	public void pincodeMethod() throws IOException{
		pincodeTextField.sendKeys(ExcelLibrary.getCellValue(excel_path, excel_sheet, 3, 5));
	}
	public void telephoneMethod() throws IOException{
		telephoneTextField.sendKeys(ExcelLibrary.getCellValue(excel_path, excel_sheet,3, 6));
	}
	public void emailMethod() throws IOException{
		emailTextField.sendKeys(ExcelLibrary.getCellValue(excel_path, excel_sheet,1,0 ));;
	}
	public void passwordMethod() throws IOException{
		passwordTextField.sendKeys(ExcelLibrary.getCellValue(excel_path, excel_sheet, 1, 1));;
	}
	public void submitMethod(){
		submitButton.click();
	}
	public void resetMethod(){
		resetButton.click();
	}
}
