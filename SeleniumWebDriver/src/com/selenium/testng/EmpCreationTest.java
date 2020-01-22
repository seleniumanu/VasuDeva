package com.selenium.testng;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpCreationTest extends OHRM
{

	@Test(dataProvider="getData")
	public void emp(String fName,String lName)
	{
		driver.findElement(By.linkText("PIM")).click();
		
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(fName);
		driver.findElement(By.id("lastName")).sendKeys(lName);
		
		driver.findElement(By.id("btnSave")).click();
		
		//validation
	}
	
	
	@DataProvider
	
	public Object[][] getData()
	{
		Object [] [] data=new Object[2][2];
		
		data[0][0]="Qedge123";
		data[0][1]="Selenium";
		data[1][0]="Qedge124";
		data[1][1]="Selenium1";
		return data;
	}
}
