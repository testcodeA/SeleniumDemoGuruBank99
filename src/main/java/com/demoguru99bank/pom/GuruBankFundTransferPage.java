package com.demoguru99bank.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoguru99bank.generics.AutoConstant;
import com.demoguru99bank.generics.BasePage;
import com.demoguru99bank.generics.ExcelLibrary;

public class GuruBankFundTransferPage extends BasePage implements AutoConstant {
        @FindBy(xpath="//input[@name='payersaccount']")
        private WebElement payersaccnoTextField;
        
        @FindBy(xpath="//input[@name='payeeaccount']")
        private WebElement payeeaccount;
        
        @FindBy(xpath="//input[@name='ammount']")
        private WebElement amountTextField;
        
        @FindBy(xpath="//input[@name='desc']")
        private WebElement descriptionTextField;
        
        @FindBy(xpath="//input[@name='AccSubmit']")
        private WebElement submitButton;
        
        @FindBy(xpath="//input[@name='res']")
        private WebElement resetButton;
        
        public GuruBankFundTransferPage(WebDriver driver){
        	this.driver=driver;
        	PageFactory.initElements(driver, this);
        }
        public void payersaccnoTextField() throws IOException{
        	payersaccnoTextField.sendKeys(ExcelLibrary.getCellValue(excel_path, excel_sheet, 11, 0));	
        }
        public void payeeaccount() throws IOException{
        	payeeaccount.sendKeys(ExcelLibrary.getCellValue(excel_path, excel_sheet, 11, 1));
        }
        public void amountMethod() throws IOException{
        	amountTextField.sendKeys(ExcelLibrary.getCellValue(excel_path, excel_sheet, 11, 2));
        }
        public void descriptionMethod() throws IOException{
        	descriptionTextField.sendKeys(ExcelLibrary.getCellValue(excel_path, excel_sheet, 11, 3));
        	
        }
        public void submitMethod(){
        	submitButton.click();
        }
        public void resetMethod(){
        	resetButton.click();
        }
}
