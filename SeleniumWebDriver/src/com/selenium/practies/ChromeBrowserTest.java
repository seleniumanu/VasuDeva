package com.selenium.practies;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest 
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("Http://Gmail.com");

	}

}
