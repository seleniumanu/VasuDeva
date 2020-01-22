package com.selenium.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleCheckBox {

	public static void main(String[] args) 
	{
		FirefoxDriver  driver=new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
		WebElement table=driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
		
		List<WebElement> checkList=table.findElements(By.name("group1"));
		
		
		System.out.println(checkList.size());
		
		for (int i = 0; i < checkList.size(); i++) 
		{
			//click on one by one check box
			//checkList.get(i).click();
			/*if(checkList.get(i).getAttribute("value").equals("Cheese"))
			{
				//click on Specific check box
				//checkList.get(i).click();	
			}*/
			
			//Capturing checkbox Names & status  
			//System.out.println(checkList.get(i).getAttribute("checked")+"   "+checkList.get(i).getAttribute("value"));
		checkList.get(i).click();
		System.out.println("Click on :"+checkList.get(i).getAttribute("value"));
		//print the status of all the check boxes
		for (int j = 0; j <checkList.size() ; j++) 
		{
			System.out.println(checkList.get(j).getAttribute("checked")+"   "+checkList.get(j).getAttribute("value"));
		}
		System.out.println("################");
		}
		

	}

}
