package com.selenium.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsTest {

	public static void main(String[] args)
	{
		
		FirefoxDriver  driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("u_0_6")).click();
		
		WebElement radio=driver.findElement(By.className("_5k_3"));
		
		List<WebElement> radioList=radio.findElements(By.tagName("label"));
		
		System.out.println(radioList.size());
		
		for (WebElement element : radioList)
		{
			System.out.println(element.getText());
		}
		
		/*for (int i = 0; i <radioList.size(); i++) 
		{
			radioList.get(i).click();
			for (int j = 0; j < radioList.size(); j++) 
			{
				System.out.println(radioList.get(j).getAttribute("checked"));
			}
			System.out.println("###################");
		}*/
	}
	

}
