package com.selenium.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizationTest 
{

	
	@Test(dataProvider="getData")
	public void sampleTest(String username,String password)
	{
		System.out.println("Username is :"+username);
		System.out.println("Password is :"+password);
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object [] [] data=new Object[2][2];
		
		data[0][0]="VasuDeva";
		data[0][1]="Selenium";
		data[1][0]="VasuDeva1";
		data[1][1]="Selenium1";
		return data;
	}
}
