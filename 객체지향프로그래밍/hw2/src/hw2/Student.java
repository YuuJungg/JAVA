package hw2;

import java.util.Scanner;

public class Student {
	int id;
	String name;
	String phone;
	int year;
	
	void read(Scanner scan) {
		id = scan.nextInt();
		name = scan.next();
		phone = scan.next();
		year = scan.nextInt();
	}
	
	void print() {
		System.out.printf("%d %s %s %d«–≥‚\n", id, name, phone, year);
	}

}
