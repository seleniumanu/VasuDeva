package com.selenium.testng;

import org.testng.annotations.Test;

public class MultipleTestNg 
{
	@Test(priority=0)
	public void appLaunch()
	{
		System.out.println("AppLaunch");
	}
	@Test()
	public void appLogin()
	{
		System.out.println("AppLogin");
	}
	@Test()
	public void appLogout()
	{
		System.out.println("AppLogout");
	}
	@Test(priority=3)
	public void appClose()
	{
		System.out.println("AppClose");
	}
}
