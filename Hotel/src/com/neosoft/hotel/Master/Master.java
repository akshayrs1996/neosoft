
package com.neosoft.hotel.Master;
import java.util.Scanner;
import com.neosoft.hotel.Bill;
import com.neosoft.hotel.Menu;
import com.neosoft.hotel.input.inputInter;
import com.neosoft.hotel.output.PrintData;
import com.neosoft.hotel.output.PrintMenuData;
import com.neosoft.hotel.input.InputData;
public class Master {
	static InputData i1=new InputData();
	static Menu m1=i1.fillMenuData();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PrintData pd=new PrintMenuData();
		pd.printHeader();
		pd.print(m1);
		Bill b1=new Bill();
		b1.calculation();
		
		
		
	}

}
