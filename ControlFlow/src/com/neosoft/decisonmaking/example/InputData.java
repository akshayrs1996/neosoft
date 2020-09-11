package com.neosoft.decisonmaking.example;

import java.util.Scanner;
import java.util.Vector;

public class InputData extends PrintData {
	
	
	Vector<String> itemOrdered=new Vector<String>();
	Vector<Integer> priceOrdered=new Vector<Integer>();
	Vector<Integer> quantityOrdered=new Vector<Integer>();
	Vector<Integer> pri=new Vector<Integer>();
	 
	public InputData() {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter Index to order food : ");
	int in=scan.nextInt();
	in=in-1;
	System.out.println("Your Ordered Item : ");
	System.out.println(index[in]+"       "+itemName[in]+"     "+itemPrice[in]);
	
	System.out.println("Enter Quantity : ");
	int quantity=scan.nextInt();
	
	itemOrdered.addElement(itemName[in]);
	priceOrdered.addElement(itemPrice[in]);
	quantityOrdered.addElement(quantity);
	
	pri.add(quantity*itemPrice[in]);
	System.out.println("If you Want to order next food ");
	System.out.println("For Yes press 1 Else Press 0 for Bill ");
	int choice=scan.nextInt();
	while(choice==1)
	{
		 System.out.println("Enter Index to order food : ");
		 in=scan.nextInt();
		 in=in-1;
		 System.out.println("Enter Quantity : ");
		 quantity=scan.nextInt();
		 itemOrdered.addElement(itemName[in]);
		 priceOrdered.addElement(itemPrice[in]);
		 quantityOrdered.addElement(quantity);
		 System.out.println("If you Want to order next food ");
		System.out.println("For Yes press 1 Else Press 0 for Bill ");
		choice=scan.nextInt();
	}
	
	}

}
