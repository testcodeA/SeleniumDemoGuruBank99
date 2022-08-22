package com.demoguru99bank.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoguru99bank.generics.AutoConstant;
import com.demoguru99bank.generics.BasePage;
import com.demoguru99bank.generics.ExcelLibrary;

public class GuruBankEditCustomerPage extends BasePage implements AutoConstant {
	
         @FindBy(xpath="//input[@name='cusid']")
         private WebElement customeridTextBox;
         
         @FindBy(xpath="//input[@name='AccSubmit']")
         private WebElement submitButton;
         
         @FindBy(xpath="//input[@name='res']")
         private WebElement resetButton;
         
         public GuruBankEditCustomerPage(WebDriver driver){
        	 this.driver=driver;
        	 PageFactory.initElements(driver, this);
         }
         public void customeridMethod() throws IOException{
        	 customeridTextBox.sendKeys(ExcelLibrary.getCellValue(excel_path, excel_sheet, 5, 0));
         }
         public void submitMethod(){
        	 submitButton.click();
         }
         public void resetMethod(){
        	 resetButton.click();
         }
         
}

