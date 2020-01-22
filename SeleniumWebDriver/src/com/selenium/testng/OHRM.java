package com.selenium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class OHRM
{
	
	FirefoxDriver driver;
	@BeforeSuite
	public void appLaunch()
	{
		driver=new FirefoxDriver();
		driver.navigate().to("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		//validation
		
		Assert.assertTrue(driver.findElement(By.id("txtUsername")).isDisplayed());
	}
	
	@BeforeTest
	public void appLogin()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@AfterTest
	public void appLogout()
	{

		driver.findElement(By.id("welcome")).click();
		
		driver.findElement(By.linkText("Logout")).click();
		
	}
	
	@AfterSuite
	public void appclose()
	{
		driver.close();
	}
}
