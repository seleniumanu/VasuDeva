package com.selenium.methods;

public class Method4 

{
	//method with-out  return-type with-out parameters
	
	public void add()
	{
		
		int a=20;
		int b=30;
		int sum=a+b;
		
		System.out.println(sum);
	}
	
	
	
	public static void main(String[] args) 
	{
		Method4 ns=new Method4();
		
		ns.add();//calling a method with method name ,it won't return a value

	}

}
