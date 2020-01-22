package com.selenium.methods;

public class Method3
{

	//method with  return-type with-out parameters
	
			public int add()
			{
				
				int a=20;
				int b=30;
				int sum=a+b;
				
				return sum;
			}
			
	public static void main(String[] args)
	{
		
		Method3 ns=new Method3();
		int res=ns.add();//callin a method with variable, it will return  a value
		System.out.println(res);
	}

}
