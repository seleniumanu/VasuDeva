package com.selenium.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesTest {

	public static void main(String[] args) 
	{
		FirefoxDriver  driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		//finding frames count
		
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		
		// give focus to the particular frame 
		//1. Index
		//driver.switchTo().frame(0);
		//2. String
		//driver.switchTo().frame(driver.findElement(By.xpath(".//*[@id='content']/iframe")));
		//3. WebElement
		WebElement frame1=driver.findElement(By.xpath(".//*[@id='content']/iframe"));
		driver.switchTo().frame(frame1);
		
		WebElement drg=driver.findElement(By.id("draggable"));
		WebElement drp=driver.findElement(By.id("droppable"));
		
		Actions dAd=new Actions(driver);
		
		dAd.dragAndDrop(drg, drp).perform();
		
		//give focus to the previous html document
		
		driver.switchTo().defaultContent();
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='content']/h1")).getText());
		
		

	}

}
