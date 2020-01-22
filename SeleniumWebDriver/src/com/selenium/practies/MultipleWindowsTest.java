package com.selenium.practies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.naukri.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("html/body/div[2]/div/ul/li[2]/a/div")).click();
		
		Set<String> windows=driver.getWindowHandles();
		
		System.out.println(windows.size());
		
		/*for (String child : windows)
		{
			System.out.println(child);
			//close all the windows one by one 
			driver.switchTo().window(child);
			System.out.println(driver.getTitle());
			driver.close();
			
			//close all the window except required one
			
			driver.switchTo().window(child);
			
			if (!driver.getTitle().equals("Tech Mahindra")) 
			{
				driver.close();
			}
			
		}*/
		
		Iterator<String> it=windows.iterator();
		
		while(it.hasNext())
		{
			//System.out.println(it.next().toString());
			driver.switchTo().window(it.next().toString());
			System.out.println(driver.getTitle());
			driver.close();
		}
		
		/*List<String> tabs=new ArrayList(windows);
		
		driver.switchTo().window(tabs.get(0));
		
		driver.close();
		
		driver.switchTo().window(tabs.get(2));
		
		driver.close();*/
		

	}

}
