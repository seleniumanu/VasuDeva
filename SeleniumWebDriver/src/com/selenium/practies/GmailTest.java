package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTest {

	public static void main(String[] args)
	{
		String expTitle="Gmail";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("Http://Google.co.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("gb_g")).click();
		
		String actTitle=driver.getTitle();
		//validation
		if(expTitle.equals(actTitle))
		{
			System.out.println("Gmail link Working");
		}else
		{
			System.out.println("Gmail link not working");
		}
		
	}

}
