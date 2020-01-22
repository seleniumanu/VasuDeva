package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OHRMLogin
{

	public static void main(String[] args) throws Exception 
	{
		String username="Admin";
		String password="Qedge123!@#";
		//appLaunch
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		//validation
		if(driver.findElement(By.id("txtUsername")).isDisplayed())
		{
			System.out.println("Pass");
		}else
		{
			System.out.println("Fail");
		}
		//appLogin
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		//validation
		if (driver.findElement(By.id("welcome")).isDisplayed()) 
		{
			System.out.println("Pass");
		}else
		{
			System.out.println("Fail");
		}
		
		//wait statements
		Thread.sleep(2000);
		//appLogout
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		//wait statements
				Thread.sleep(2000);
		//validation
		if(driver.findElement(By.id("txtUsername")).isDisplayed())
		{
			System.out.println("Pass");
		}else
		{
			System.out.println("Fail");
		}
		
		
		//appClose
		driver.close();

	}

}
