package com.demoguru99bank.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoguru99bank.generics.AutoConstant;
import com.demoguru99bank.generics.BasePage;
import com.demoguru99bank.generics.ExcelLibrary;

public class BankGuruCustomisedStatementPage extends BasePage implements AutoConstant {
	@FindBy(xpath="//input[@name='accountno']")
	private WebElement accountnumberTextField;
	
	@FindBy(xpath="//input[@name='fdate']")
	private WebElement fromdateDropDown;
	
	@FindBy(xpath="//input[@name='tdate']")
	private WebElement todateDropDown;
	
	@FindBy(xpath="//input[@name='amountlowerlimit']")
	private WebElement minimumtransactionvalueTextField;
	
	@FindBy(xpath="//input[@name='numtransaction']")
	private WebElement numberofTransactionTextField;
	
	@FindBy(xpath="//input[@name='AccSubmit']")
	private WebElement submitButton;
	
	@FindBy(xpath="//input[@type='reset']")
	private WebElement resetButton;
	
	public BankGuruCustomisedStatementPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void accountnumberMethod() throws IOException{
		accountnumberTextField.sendKeys(ExcelLibrary.getCellValue(excel_path, excel_sheet, 9, 0));
	}
	public void fromdateMethod(){
		fromdateDropDown.sendKeys("06101987");
	}
	public void todateMethod(){
		todateDropDown.sendKeys("09091997");
	}
	public void minimumtransactionMethod() throws IOException{
		minimumtransactionvalueTextField.sendKeys(ExcelLibrary.getCellValue(excel_path, excel_sheet, 13, 0));
	}
	public void numberofTransactionsMethod() throws IOException{
		numberofTransactionTextField.sendKeys(ExcelLibrary.getCellValue(excel_path, excel_sheet, 13, 1));
	}
	public void submitMethod(){
		submitButton.click();
	}
	public void resetMethod(){
		resetButton.click();
	}

}
