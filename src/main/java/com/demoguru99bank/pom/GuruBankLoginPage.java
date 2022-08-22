package com.demoguru99bank.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoguru99bank.generics.AutoConstant;
import com.demoguru99bank.generics.BasePage;
import com.demoguru99bank.generics.ExcelLibrary;

public class GuruBankLoginPage extends BasePage implements AutoConstant{
	  
         @FindBy(xpath="//input[@name='uid']")
         private WebElement usernameTextField;
         
         @FindBy(xpath="//input[@name='password']")
         private WebElement passwordTextField;
         
         @FindBy(xpath="//input[@name='btnLogin']")
         private WebElement loginButton;
         
         @FindBy(xpath="//input[@name='btnReset']")
         private WebElement resetButton;
         
         public GuruBankLoginPage(WebDriver driver){
        	 this.driver=driver;
        	 PageFactory.initElements(driver, this);
        	 
         }
      
        public void loginMethod() throws IOException{
        	 usernameTextField.sendKeys(ExcelLibrary.getCellValue(excel_path, excel_sheet, 1, 0));
        	 passwordTextField.sendKeys(ExcelLibrary.getCellValue(excel_path, excel_sheet, 1, 1));
        	 loginButton.click();
        	 
         }
         public void resetMethod(){
        	 resetButton.click();
         }
}
