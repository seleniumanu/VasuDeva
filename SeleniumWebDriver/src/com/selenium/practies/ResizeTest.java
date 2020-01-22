package com.selenium.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeTest {

	public static void main(String[] args) 
	{
		FirefoxDriver  driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		
		//finding frames count
		
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		
		//give focus to frame
		
		driver.switchTo().frame(0);
		
		WebElement rs=driver.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
		
		Actions resize=new Actions(driver);
		
		resize.clickAndHold(rs).moveByOffset(150, 200).release(rs).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
