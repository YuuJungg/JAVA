package hw2;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
	Scanner scan = new Scanner(System.in);
	ArrayList<Hamburger> hamburgerList = new ArrayList<>();
	
	void run() {
		readAll();
		printAll();
	}
	
	void readAll() {
		int number = scan.nextInt();
		for (int i = 0; i < number; i++) {
			Hamburger hamburger = new Hamburger();
			hamburger.read(scan);
			hamburgerList.add(hamburger);
		}
	}
	
	void printAll() {
		for (Hamburger hamburger: hamburgerList) {
			hamburger.print();
		}
	}

	public static void main(String[] args) {
		Store s = new Store();
		s.run();
	}
}
