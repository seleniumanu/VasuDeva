package com.selenium.methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PrimusBank 
{
	FirefoxDriver driver;
	String res;
//appaunch
	
	public String appLaunch(String url)
	{
		
		driver=new FirefoxDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
		//validation
		if (driver.findElement(By.id("txtuId")).isDisplayed()) 
		{
			//System.out.println("Application Launch Successfully");
			res="Pass";
		}else
		{
			//System.out.println("Application Launch Failed");	
			res="Fail";
			
		}
		
		return res;
	}
	//appLogin
	
	public String appLogin(String username,String password)
	{
		driver.findElement(By.id("txtuId")).sendKeys(username);
		driver.findElement(By.name("txtPword")).sendKeys(password);
		driver.findElement(By.id("login")).click();
		String actUrl=driver.getCurrentUrl();
		//validation
		if (driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).isDisplayed())
		{
			//System.out.println("Pass");
			res="Pass";
		}else
		{
			//System.out.println("Fail");
			res="Fail";
		}
		return res;
	}
	//branchCreation
	
	public String branchCreation(String branchName,String add1) throws Exception
	{
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("BtnNewBR")).click();
		
		driver.findElement(By.id("txtbName")).sendKeys(branchName);
		driver.findElement(By.id("txtAdd1")).sendKeys(add1);
		
		driver.findElement(By.id("txtZip")).sendKeys("555555");
		//dropdown
		Select country=new Select(driver.findElement(By.id("lst_counrtyU")));
		country.selectByIndex(1);
		Thread.sleep(3000);
		Select state=new Select(driver.findElement(By.id("lst_stateI")));
		state.selectByIndex(1);
		Thread.sleep(3000);
		Select city=new Select(driver.findElement(By.id("lst_cityI")));
		city.selectByIndex(1);
		Thread.sleep(3000);
		driver.findElement(By.id("btn_insert")).click();
		Thread.sleep(3000);
		Alert al=driver.switchTo().alert();
		
		String msg=al.getText();
		al.accept();
		//validation
		
		if (msg.contains("created Sucessfully"))
		{
			//System.out.println("pass");
			res="Pass";
		}else
			if(msg.contains("Please fill in"))
			{
				//System.out.println("Warning");
				res="Warning";
			}else
				if(msg.contains("already Exist"))
				{
					//System.out.println("Fail");
					res="Fail";
				}
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
		return res;
		
	}
	//appLogout
	
	public String appLogout() throws Exception
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
		
		//validation
		Thread.sleep(2000);
		if (driver.findElement(By.id("txtuId")).isDisplayed()) 
		{
			//System.out.println("appLogout Pass");	
			res="Pass";
		}else
		{
			//System.out.println("appLogout Fail");	
			res="Fail";
		}
		return res;
	}
	//appClose
	public void appClose()
	{
		driver.close();
	}
	
	
	public static void main(String[] args) throws Exception
	{
		PrimusBank app=new PrimusBank();
		
		/*//app.appLaunch("Http://PrimusBank.qedgetech.com");// calling a ns method with method name,it won't return a value
		
		String results=app.appLaunch("Http://PrimusBank.qedgetech.com");
		
		System.out.println(results);
		
		app.appLogin("Admin", "Admin");*/
		/*app.appLaunch("Http://Primusbank.qedgetech.com");
		app.appLogin("Admin", "Admin");
		app.branchCreation("VasuDeva", "Ameerpet");
		app.appLogout();
		app.appClose();*/
		
		//appLaunch
		app.appLaunch("Http://Primusbank.qedgetech.com");
		app.appClose();
		//appLogin
		app.appLaunch("Http://Primusbank.qedgetech.com");
		app.appLogin("Admin", "Admin");
		app.appLogout();
		app.appClose();
		
		//branchCreation
		app.appLaunch("Http://Primusbank.qedgetech.com");
		app.appLogin("Admin", "Admin");
		app.branchCreation("VasuDeva", "Ameerpet");
		app.appLogout();
		app.appClose();

		
	}
}
