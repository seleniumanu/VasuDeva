package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownTest {

	public static void main(String[] args) 
	{
		FirefoxDriver  driver=new FirefoxDriver();
		driver.get("https://Amazon.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Selenium WebDriver");
		
		driver.findElement(By.className("nav-input")).click();

	}

}
