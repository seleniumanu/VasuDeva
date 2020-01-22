package com.selenium.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BranchCreation_ExcelPara {

	public static void main(String[] args) throws Exception
	{
		//appLaunch
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		//appLogin
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		
		//branch creation with multiple vales(Parameterization)
		//reading the data from excel file
		
		File srcFile=new File("C:\\Users\\vasu\\Desktop\\TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(srcFile);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		int rcnt=ws.getLastRowNum();
		
		for (int i = 1; i <=rcnt; i++)
		{
			String branchName=ws.getRow(i).getCell(0).getStringCellValue();
			
			String add1=ws.getRow(i).getCell(1).getStringCellValue();
			Thread.sleep(3000);
			System.out.println("Reading first set of data from excel file");
			//branchcreation 
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
			Thread.sleep(3000);
			if (msg.contains("created Sucessfully"))
			{
				//System.out.println("pass");
				ws.getRow(i).createCell(2).setCellValue("Pass");	
				}else
				if(msg.contains("Please fill in"))
				{
					//System.out.println("Warning");
					ws.getRow(i).createCell(2).setCellValue("Warning");
				}else
					if(msg.contains("already Exist"))
					{
					//	System.out.println("Fail");
						ws.getRow(i).createCell(2).setCellValue("Fail");
					}
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
			
			FileOutputStream fos=new FileOutputStream(srcFile);
			
			wb.write(fos);
			
		}
		
		wb.close();
		
		//appLogout
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
		
		
		//appClose
		
		driver.close();
		
		

	}

}
