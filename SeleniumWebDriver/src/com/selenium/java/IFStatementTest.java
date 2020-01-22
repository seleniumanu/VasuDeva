package com.selenium.java;

import java.util.Scanner;

public class IFStatementTest {

	public static void main(String[] args) 
	{
		// Program To Check The Given No is "Even" /  "Odd"
		Scanner sc=new Scanner(System.in);
		int  n=sc.nextInt();
		//int n=98;
		
		if(n%2==0)
		{
			System.out.println("Even Number");  //if-block  true
		}else
		{
			System.out.println("Odd Number");   //else-block   false
		}
	}

}
