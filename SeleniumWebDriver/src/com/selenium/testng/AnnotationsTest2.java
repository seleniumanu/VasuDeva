package com.selenium.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTest2 
{
	@Test
	public void method1()
	{
		System.out.println("Method1 Executed");
	}
	@Test
	public void method2()
	{
		System.out.println("Method2 Executed");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("BeforeTest Executed");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("AfterTest Executed");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("BeforeSuite Executed");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("AfterSuite Executed");
	}
}
