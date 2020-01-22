package com.selenium.methods;

public class Method2 

{

	
	//method with-out  return-type with parameters
	
		public void add(int a,int b)
		{
			
			int sum=a+b;
			
			System.out.println(sum);
		}
		
	
	public static void main(String[] args) 
	{
		Method2 ns=new Method2();
		ns.add(20, 50);//calling a method with method name, it won't return a value

	}

}
