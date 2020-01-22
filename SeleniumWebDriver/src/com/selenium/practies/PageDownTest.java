package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class PageDownTest {

	public static void main(String[] args) 
	{
		FirefoxDriver  driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//page down 
		Actions page=new Actions(driver);
		page.sendKeys(Keys.PAGE_DOWN).perform();
		
		
		driver.findElement(By.linkText("Create a Page")).click();

	}

}
