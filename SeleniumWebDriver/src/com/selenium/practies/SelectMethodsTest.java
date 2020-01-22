package com.selenium.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethodsTest 
{
	public static void main(String[] args)
	{
		FirefoxDriver  driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		
		Select sl=new Select(drop);
		
		sl.selectByIndex(32);
		
		//sl.selectByVisibleText("Jewellery");
		//sl.selectByValue("search-alias=baby");
		
		/*List<WebElement> dropList=sl.getOptions();
		System.out.println(dropList.size());
		for (int i = 0; i < dropList.size(); i++) 
		{
			System.out.println(dropList.get(i).getText());
		}*/
		//Verify is it possible to select Multiple Items/ not 
		//System.out.println(sl.isMultiple());
		//Capturing the first selected item from dropDown
		//System.out.println(sl.getFirstSelectedOption().getText());
		//capture all selected item names
		
		List<WebElement> selectedItems=sl.getAllSelectedOptions();
		
		System.out.println(selectedItems.size());
		
		for (int i = 0; i < selectedItems.size(); i++)
		{
			System.out.println(selectedItems.get(i).getText());
		}
		
	}

}
