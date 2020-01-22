package com.selenium.practies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BranchCreationTest 
{

	public static void main(String[] args) throws Exception
	{
				//appLaunch
				
				FirefoxDriver driver=new FirefoxDriver();
				driver.navigate().to("http://primusbank.qedgetech.com/");
				driver.manage().window().maximize();
				
				//validation
				if (driver.findElement(By.id("txtuId")).isDisplayed()) 
				{
					System.out.println("Application Launch Successfully");	
				}else
				{
					System.out.println("Application Launch Failed");	
				}
				//appLogin
				driver.findElement(By.id("txtuId")).sendKeys("Admin");
				driver.findElement(By.name("txtPword")).sendKeys("Admin");
				driver.findElement(By.id("login")).click();
				String actUrl=driver.getCurrentUrl();
				//validation
				if (driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).isDisplayed())
				{
					System.out.println("Pass");
				}else
				{
					System.out.println("Fail");
				}
				//branchcreation
				driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
				Thread.sleep(3000);
				driver.findElement(By.id("BtnNewBR")).click();
				driver.findElement(By.id("txtbName")).sendKeys("");
				driver.findElement(By.id("txtAdd1")).sendKeys("Ameerpet");
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
				//validation
				
				if (msg.contains("created Sucessfully"))
				{
					System.out.println("pass");
				}else
					if(msg.contains("Please fill in"))
					{
						System.out.println("Warning");
					}else
						if(msg.contains("already Exist"))
						{
							System.out.println("Fail");
						}
				Thread.sleep(2000);
				driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
				
				//appLogout
				Thread.sleep(3000);
				driver.findElement(By.xpath(".//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
				
				//validation
				Thread.sleep(2000);
				if (driver.findElement(By.id("txtuId")).isDisplayed()) 
				{
					System.out.println("appLogout Pass");	
				}else
				{
					System.out.println("appLogout Fail");	
				}
				//appClose
				Thread.sleep(2000);
				driver.close();
				
				
				

	}

}
