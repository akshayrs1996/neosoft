package com.neosoft.decisonmaking.example;

import java.util.Scanner;

public class Bill extends InputData {
	int total=0;
	Scanner scan=new Scanner(System.in);
	public  Bill()
	{
		System.out.println("************Your Bill**********");
		System.out.println("Number Of Item Ordered :"+itemOrdered.size());
		int n=itemOrdered.size();
		System.out.println("Item  Price  Quantity   Total");
		try {
		for(int i=0;i<n;i++)
		{
			System.out.println(itemOrdered.elementAt(i)+"      "+priceOrdered.elementAt(i)+"      "+quantityOrdered.elementAt(i)+"        "+pri.get(i));
			total+=pri.elementAt(i);
		}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
		}
		float gst=(((total)*5)/100);
		float cost=gst+total;
		System.out.println("SGST(2.5%) : "+(gst/2));
		System.out.println("CGST(2.5%) : "+(gst/2));
		System.out.println("Total Amount : "+Math.round(cost)+" Rs");
		System.out.println("Payment Option");
		System.out.println("1.Cash");
		System.out.println("2.Online UPI");
		System.out.println("3.Credit/Debit Card");
		System.out.println("Choose Option : ");
		int ch=scan.nextInt();
		switch(ch) {
		case 1:
		System.out.println("Payment done using Cash");
		break;
		case 2:
		System.out.println("Payment done using Online UPI ");
		break;
		case 3:
		System.out.println("Payment done using Credit/Debit card ");
		break;
		default:
			System.out.println("Wrong Option Entered ");
		}
		System.out.println("*********Thank You**********");
	}

}
