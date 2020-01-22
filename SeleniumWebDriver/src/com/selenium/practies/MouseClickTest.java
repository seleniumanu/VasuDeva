package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClickTest {

	public static void main(String[] args) 
	{
		FirefoxDriver  driver=new FirefoxDriver();
		driver.get("https://ceoandhra.nic.in/Forms.aspx");
		driver.manage().window().maximize();
		
		WebElement pdf=driver.findElement(By.xpath(".//*[@id='myjquerymenu']/ul/li[3]"));
		WebElement asc=driver.findElement(By.xpath(".//*[@id='myjquerymenu']/ul/li[3]/ul/li[1]/a"));
		
		Actions mouse=new Actions(driver);
		
		//1st
		/*mouse.moveToElement(pdf).perform();
		mouse.moveToElement(asc).click().perform();*/
		//2nd
		mouse.moveToElement(pdf).moveToElement(asc).click().perform();

	}

}
