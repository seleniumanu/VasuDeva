package com.selenium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AdminLoginTest 
{
	FirefoxDriver driver;
	
@Test(priority=1)
public void appLaunch()
{
	driver=new FirefoxDriver();
	driver.navigate().to("http://primusbank.qedgetech.com/");
	driver.manage().window().maximize();
	//validation
	
	
}

@Test(priority=2)
public void appLogin()
{
	driver.findElement(By.id("txtuId")).sendKeys("Admin");
	driver.findElement(By.name("txtPword")).sendKeys("Admin");
	driver.findElement(By.id("login")).click();
	//validation
}

@Test(priority=3)
public void appLogout() throws Exception
{
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
	//validation
}
@Test(priority=4)
public void appClose()
{
	driver.close();
}
}
