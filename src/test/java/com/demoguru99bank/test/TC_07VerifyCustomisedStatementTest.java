package com.demoguru99bank.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.demoguru99bank.generics.BaseTest;
import com.demoguru99bank.pom.BankGuruCustomisedStatementPage;
import com.demoguru99bank.pom.GuruBankHomePage;
import com.demoguru99bank.pom.GuruBankLoginPage;

public class TC_07VerifyCustomisedStatementTest extends BaseTest {
@Test
public void customisedStatement() throws IOException{
	GuruBankLoginPage login= new GuruBankLoginPage(driver);
	login.loginMethod();
	
	GuruBankHomePage home= new GuruBankHomePage(driver);
	home.customisestatementMethod();
	
	BankGuruCustomisedStatementPage customised= new BankGuruCustomisedStatementPage(driver);
	customised.accountnumberMethod();
	customised.fromdateMethod();
	customised.todateMethod();
	customised.minimumtransactionMethod();
	customised.numberofTransactionsMethod();
	//customised.submitMethod();
}
}
