package com.demoguru99bank.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.demoguru99bank.generics.BaseTest;
import com.demoguru99bank.pom.GuruBankHomePage;
import com.demoguru99bank.pom.GuruBankLoginPage;
import com.demoguru99bank.pom.GuruBankNewCustomerPage;

public class TC_02VerifyAddNewCustomerTest extends BaseTest{

	@Test
	public void VerifyNewCustomer() throws IOException{
	GuruBankLoginPage login= new GuruBankLoginPage(driver);
	login.loginMethod();
	
	GuruBankHomePage home= new GuruBankHomePage(driver);
	home.newcustomerMethod();
	
	GuruBankNewCustomerPage newCustomer= new GuruBankNewCustomerPage(driver);
	newCustomer.customernameMethod();
	newCustomer.femaleMethod();
	newCustomer.dateofbirthMethod();
	newCustomer.addressMethod();
	newCustomer.cityMethod();
	newCustomer.stateMethod();
	newCustomer.pincodeMethod();
	newCustomer.telephoneMethod();
	newCustomer.emailMethod();
	newCustomer.passwordMethod();
	}
	
	
}
