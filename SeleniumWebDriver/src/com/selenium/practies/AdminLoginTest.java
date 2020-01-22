package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLoginTest 
{

	public static void main(String[] args)
	{
		
		//appLaunch
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		
		//validation
		if (driver.findElement(By.id("txtuId")).isDisplayed()) 
		{
			System.out.println("Application Launch Successfully");	
		}else
		{
			System.out.println("Application Launch Failed");	
		}
		//appLogin
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		String actUrl=driver.getCurrentUrl();
		//validation
		if (driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).isDisplayed())
		{
			System.out.println("Pass");
		}else
		{
			System.out.println("Fail");
		}
		
	}

}
