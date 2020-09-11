package com.neosoft.hotel.output;
import com.neosoft.hotel.Menu;
public abstract class PrintData {
	public void printHeader() {
		System.out.println("**********Menu Details**************");
	}
	public abstract void print(Menu m1);

}
