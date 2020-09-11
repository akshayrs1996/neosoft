package com.neosoft.decisonmaking.example;

import java.util.Scanner;
import java.util.Vector;

import java.util.ArrayList;
import java.util.List;

public class InputData extends PrintData {

	List<String> itemOrdered = new ArrayList<String>();
	List<Integer> priceOrdered = new ArrayList<Integer>();
	List<Integer> quantityOrdered = new ArrayList<Integer>();
	List<Integer> pri = new Vector<Integer>();

	public InputData() {
		Scanner scan = new Scanner(System.in);

		int in, quantity, choice = 1;
		while (choice == 1) {
			System.out.println("Enter Index to order food : ");
			in = scan.nextInt();
			in = in - 1;
			System.out.println("Enter Quantity : ");
			quantity = scan.nextInt();
			itemOrdered.add(itemName[in]);
			priceOrdered.add(itemPrice[in]);
			quantityOrdered.add(quantity);
			pri.add(quantity * itemPrice[in]);
			System.out.println("If you Want to order next food ");
			System.out.println("For Yes press 1 Else Press 0 for Bill ");
			choice = scan.nextInt();
		}

	}


}
