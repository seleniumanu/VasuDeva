package com.selenium.java;

public class ForLoopTest 
{

	public static void main(String[] args)
	{
		//program to print "selenium" 20 times 
/*for(int i=1;i<=20;i++)
{
	System.out.println(i+"    "+"Selenium");
}*/
		
		for (int i = 1; i <=10; i++) //ten tables
		{
			for (int j = 1; j <=10; j++) // ten iteration
			{
				System.out.println(i+"  x  "+j+"   =   "+i*j);
			}
			
		}

	}

}
