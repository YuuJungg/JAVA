package book;

import java.util.Scanner;

public class Pen implements Manageable {
	String name;
	float thickSize;
	int price;
	@Override
	public void read(Scanner scan) {
		// 4 ÇÃ·¯½ºÆæ 0.5 800
		name = scan.next();
		thickSize = scan.nextFloat();
		price = scan.nextInt();		
	}

	@Override
	public void print() {
		System.out.printf("%s %5.2fmm (%d¿ø)\n",
				name, thickSize, price);
		
	}

	@Override
	public boolean matches(String kwd) {
		if (name.contains(kwd))
			return true;
		if (kwd.equals("" + thickSize))
			return true;
		return false;
	}
}
