package com.demoguru99bank.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.demoguru99bank.generics.BaseTest;
import com.demoguru99bank.pom.GuruBankDepositPage;
import com.demoguru99bank.pom.GuruBankHomePage;
import com.demoguru99bank.pom.GuruBankLoginPage;

public class TC_05VerfiyDepositTest extends BaseTest {
	@Test
	public void deposit() throws IOException{
		GuruBankLoginPage login= new GuruBankLoginPage(driver);
		login.loginMethod();
		
		GuruBankHomePage home= new GuruBankHomePage(driver);
		home.depositMethod();
		
		GuruBankDepositPage deposit= new GuruBankDepositPage(driver);
		deposit.accountnoMethod();
		deposit.amountMethod();
		deposit.descriptionMethod();
	}

}
