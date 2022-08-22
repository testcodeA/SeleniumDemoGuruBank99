package com.demoguru99bank.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.demoguru99bank.generics.BaseTest;
import com.demoguru99bank.pom.GuruBankFundTransferPage;
import com.demoguru99bank.pom.GuruBankHomePage;
import com.demoguru99bank.pom.GuruBankLoginPage;

public class TC_06VerifyFundTransferTest extends BaseTest {
      @Test
      public void fundTransfer() throws IOException{
    	  GuruBankLoginPage login=new  GuruBankLoginPage(driver);
    	  login.loginMethod();
    	  
    	  GuruBankHomePage home= new GuruBankHomePage(driver);
    	  home.fundtransferMethod();
    	  
    	  GuruBankFundTransferPage transfer= new GuruBankFundTransferPage(driver);
    	  transfer.payersaccnoTextField();
    	  transfer.payeeaccount();
    	  transfer.amountMethod();
    	  transfer.descriptionMethod();
    	//  transfer.submitMethod();
    	  
      }
}
