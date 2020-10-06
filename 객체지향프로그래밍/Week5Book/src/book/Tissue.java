package book;

import java.util.Scanner;

public class Tissue implements Manageable {
	String name;
	int nSheet;
	int price;
	
	@Override
	public void read(Scanner scan) {
		name = scan.next();
		nSheet = scan.nextInt();
		price = scan.nextInt();		
	}

	@Override
	public void print() {
		System.out.printf("%s %dÀå (%d¿ø)\n",
				name, nSheet, price);
		
	}

	@Override
	public boolean matches(String kwd) {
		if (name.contains(kwd))
			return true;
		if (kwd.equals("" + nSheet))
			return true;
		return false;
	}

}
