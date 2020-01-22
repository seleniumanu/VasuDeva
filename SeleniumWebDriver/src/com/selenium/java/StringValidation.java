package com.selenium.java;

public class StringValidation {

	public static void main(String[] args) 
	{
		/*String data="Selenium Training";
		String data1="Selenium";
		
		if(data.equals(data1))//true
		{
			System.out.println("Both are equals");
		}else
		{
			System.out.println("Both are not equal");
		}*/
		
		String data="Selenium Training";
		String data1="Selenium";
		
		if (data.contains(data1))
		{
			System.out.println("Exist");
		}else
		{
			System.out.println("not Exist");
		}

	}

}
