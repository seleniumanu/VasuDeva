package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownTest4 {

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver  driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//day
		Select  day=new Select(driver.findElement(By.id("day"))); 
		day.selectByIndex(2);
		Thread.sleep(2000);
		//month
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByIndex(4);
		Thread.sleep(2000);
		//Year
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByIndex(7);
		
		
		
		

	}

}
