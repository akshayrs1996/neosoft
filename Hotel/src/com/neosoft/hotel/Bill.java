package com.neosoft.hotel;

import java.util.Scanner;

import com.neosoft.hotel.Menu;
import com.neosoft.hotel.input.inputInter;
import com.neosoft.hotel.output.PrintData;
import com.neosoft.hotel.output.PrintMenuData;
import com.neosoft.hotel.input.InputData;

public class Bill {
	static InputData i1=new InputData();
	static Menu m1=i1.fillMenuData();
	Scanner sc = new Scanner(System.in);
	PrintData pd=new PrintMenuData();
	
	
	public void calculation() {
		
		System.out.println("Enter Quantity : ");
		int quantity=sc.nextInt();
		int price=m1.getitemPrice();
		int totalCost=price*quantity;
		 
		float gst=(((totalCost)*5)/100);
		float cost=gst+totalCost;
		
		System.out.println("*********Your Bill********");
		pd.print(m1);
		System.out.println("Quantity : "+quantity);
		System.out.println("SGST(2.5%) : "+(gst/2));
		System.out.println("CGST(2.5%) : "+(gst/2));
		System.out.println("Total Amount : "+Math.round(cost)+" Rs");
		System.out.println("*********Thank You**********");
		// TODO Auto-generated method stub
		
	}
}
