package com.selenium.java;

public class SwitchStatement
{

	public static void main(String[] args) 
	{
		// Program To Display Weekday Names For a Given Number
		
		int n=8;
		
		switch (n)
		{
		case 1:
				System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tueday");
		break;
		case 3:
			System.out.println("Wednessday");
		break;
		case 4:
			System.out.println("Thursday");
		break;
		
		default:
			System.out.println("Out of Range");
			break;
		}

	}

}
