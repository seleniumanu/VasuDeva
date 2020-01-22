package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://Amazon.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Selenium");
		
		driver.findElement(By.className("nav-input")).click();

	}

}
