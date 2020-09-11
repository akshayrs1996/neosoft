package com.neosoft.decisonmaking.example;

public class PrintData extends Hotel {
	public  PrintData()
	{
		System.out.println("Index  Item    Price");
		for(int i=0;i<5;i++)
		{
			System.out.println(index[i]+"       "+itemName[i]+"     "+itemPrice[i]);
		}
	}

}
