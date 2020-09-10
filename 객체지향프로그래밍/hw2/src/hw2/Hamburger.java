package hw2;

import java.util.Scanner;

public class Hamburger {
	int number;
	String name;
	int price;
	
	void read(Scanner scan) {
		number = scan.nextInt();
		name = scan.next();		
		price = scan.nextInt();
	}
	
	void print() {
		System.out.printf("[%d]%s %d¿ø\n", number, name, price);
	}
}