package com.selenium.methods;

public class ReusableTest 
{

	public static void main(String[] args)
	{
		//re using non static method 
		Method4 ns=new Method4();
		
		ns.add();
		
		//re using static method
		
		int res=StaticMethodsTest.add(30, 40);
		System.out.println(res);
	}

}
