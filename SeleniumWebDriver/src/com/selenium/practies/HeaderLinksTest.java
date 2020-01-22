package com.selenium.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeaderLinksTest 
 {

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver  driver=new FirefoxDriver();
		driver.get("https://in.yahoo.com/?p=us");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("uh-search-box")).sendKeys("Selenium");
		
		Thread.sleep(3000);
		
		List<WebElement> items=driver.findElements(By.xpath("//*[contains(@id,'ui_3_18_0_3_15')]/div/div/div/ul/li/span/span/b"));
		
		System.out.println(items.size());
		
		items.get(2).click();

	}

}
