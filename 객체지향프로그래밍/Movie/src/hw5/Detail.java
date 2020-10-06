package hw5;

import java.util.Scanner;

public class Detail extends Simple {
	int charactersNum;
	String characters;
	@Override
	public void read(Scanner scan) {
		super.read(scan);
		charactersNum = scan.nextInt();
		characters = scan.nextLine();	
	}
	@Override
	public void print() {
		super.print();
		System.out.printf("/¡÷ø¨:%s\n", characters);
	}
	@Override
	public boolean matches(String kwd) {
		if (super.matches(kwd))
			return true;
		if (characters.contains(kwd))
			return true;
		return false;
	}
}
