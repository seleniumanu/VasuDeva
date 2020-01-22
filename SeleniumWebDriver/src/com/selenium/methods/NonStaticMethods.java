package com.selenium.methods;

public class NonStaticMethods 
{
//method with return-type with parameters
	
	public int add(int a,int b)
	{
		
		int sum=a+b;
		
		return sum;
	}
	
	
	public static void main(String[] args) 
	{
		
		NonStaticMethods ns=new NonStaticMethods();
		
		//ns.add(20, 30);//calling a method with method name , it won't return a value
		
		int res=ns.add(50, 60);// calling a method with variable, it will return a value
		
		System.out.println(res);
		
	}
	
	
}
