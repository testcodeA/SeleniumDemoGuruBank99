package com.demoguru99bank.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest  implements AutoConstant{
	public WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		//WebDriverManager.chromedriver().setup();
		System.setProperty(chrome_key, chrome_value);
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException{
		Thread.sleep(6000);
		driver.quit();
	}

}
