package com.neosoft.hotel.input;

import com.neosoft.hotel.Menu;

public class InputData implements inputInter {

	@Override
	public Menu fillMenuData() {
		// TODO Auto-generated method stub
		Menu m1=new Menu();
		m1.setitemName("Coffee");
		m1.setitemPrice(50);
		return m1;
		
	}

}
