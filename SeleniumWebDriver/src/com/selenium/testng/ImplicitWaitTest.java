package com.selenium.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ImplicitWaitTest 
{
@Test
public void implicit() throws Exception
{
	FirefoxDriver driver=new FirefoxDriver();
	driver.navigate().to("http://Gmail.com");
	driver.manage().window().maximize();
	
	//implicit
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	// Explicit
	
	WebDriverWait myWait=new WebDriverWait(driver, 20);
	
	driver.findElement(By.id("identifierId")).sendKeys("vasu.584");
	
	driver.findElement(By.xpath(".//*[@id='identifierNext']/span/span")).click();
	
	//Thread.sleep(2000);
	
	myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
	
	driver.findElement(By.name("password")).sendKeys("Qedge");
	
	
}
}
