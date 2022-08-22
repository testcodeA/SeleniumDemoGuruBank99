package com.demoguru99bank.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.demoguru99bank.generics.BaseTest;
import com.demoguru99bank.pom.GuruBankEditCustomerPage;
import com.demoguru99bank.pom.GuruBankHomePage;
import com.demoguru99bank.pom.GuruBankLoginPage;

public class TC_03VerifyEditCustomeTest extends BaseTest {
	@Test
	public void editCustomer() throws IOException {
		GuruBankLoginPage login= new GuruBankLoginPage(driver);
		login.loginMethod();
		GuruBankHomePage home= new GuruBankHomePage(driver);
		home.editcustomerMethod();
		GuruBankEditCustomerPage editCustomer= new GuruBankEditCustomerPage(driver);
		editCustomer.customeridMethod();
		//editCustomer.submitMethod();
	}

}
