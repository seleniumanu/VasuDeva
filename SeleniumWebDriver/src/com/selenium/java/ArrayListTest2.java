package com.selenium.java;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) 
	{
		ArrayList<Object> v=new ArrayList<>();
		v.add("Selenium");
		v.add(40);
		v.add(12.56);
		
		System.out.println(v.size());
		
		for (Object item : v)
		{
			System.out.println(item);
		}

	}

}
