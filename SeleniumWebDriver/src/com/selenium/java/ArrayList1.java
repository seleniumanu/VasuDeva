package com.selenium.java;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) 
	{
		List<Integer> l=new ArrayList<>();
		
		l.add(40);
		l.add(50);
		
		System.out.println(l.size());
		
		/*for (int i = 0; i < l.size(); i++) 
		{
			System.out.println(l.get(i));
		}*/
		
		for(int item:l)
		{
			System.out.println(item);
		}


	}

}
