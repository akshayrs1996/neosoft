package com.neosoft.hotel.output;
import com.neosoft.hotel.Menu;

public class PrintMenuData extends PrintData{

	@Override
	public void print(Menu m1) {
		// TODO Auto-generated method stub
		System.out.println("Food Item Name  : "+m1.getitemName());
		System.out.println("Food Price : "+m1.getitemPrice());
	}

}
