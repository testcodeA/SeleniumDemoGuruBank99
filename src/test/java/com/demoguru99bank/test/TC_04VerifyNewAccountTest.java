package com.demoguru99bank.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.demoguru99bank.generics.BaseTest;
import com.demoguru99bank.pom.GuruBankHomePage;
import com.demoguru99bank.pom.GuruBankLoginPage;
import com.demoguru99bank.pom.GuruBankNewAccountPage;

public class TC_04VerifyNewAccountTest extends BaseTest {
	@Test
	public void newaccount() throws IOException{
		GuruBankLoginPage login= new GuruBankLoginPage(driver);
		login.loginMethod();
		
		GuruBankHomePage home= new GuruBankHomePage(driver);
		home.newaccountMethod();
		
		GuruBankNewAccountPage newAccount= new GuruBankNewAccountPage(driver);
		newAccount.customeridMethod();
		newAccount.accountypeMethod();
		newAccount.initialDepositMethod();
		//newAccount.submitMethod();
	}

}
