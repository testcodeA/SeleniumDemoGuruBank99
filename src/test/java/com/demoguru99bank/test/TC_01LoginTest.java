package com.demoguru99bank.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.demoguru99bank.generics.BaseTest;
import com.demoguru99bank.pom.GuruBankLoginPage;

public class TC_01LoginTest extends BaseTest {
	@Test
	public void login() throws IOException{
	GuruBankLoginPage login=new GuruBankLoginPage(driver);
       login.loginMethod();
	}
}
