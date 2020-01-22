package com.selenium.practies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptAlertsTest {

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver  driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(3000);
		//handle java script alerts
		
		Alert al=driver.switchTo().alert();
		
		System.out.println(al.getText());
		
		al.accept();//ok

	}

}
