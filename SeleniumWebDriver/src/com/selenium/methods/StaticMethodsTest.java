package com.selenium.methods;

public class StaticMethodsTest 
{

	//static method with return-type with parameters
	public static int  add(int a ,int b)
	{
		int sum=a+b;
		
		return sum;
		
	}
	public static void main(String[] args)
	{
		// Calling a static method with varible,it will return a value
		
		int res=StaticMethodsTest.add(30, 50);//calling static method ---> classname.methodname
		System.out.println(res);

	}

}
