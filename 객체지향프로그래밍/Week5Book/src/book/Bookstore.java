package book;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bookstore {
	Scanner scan = new Scanner(System.in);
	ArrayList<Manageable> sellList = new ArrayList<>();
	void run() {
		readAll("book4.txt");
		printAll();
		search();
	}
	void readAll(String filename) {
		Scanner filein = openFile(filename);
		Manageable m = null;
		int type = 0;
		while (filein.hasNext()) {
			type = filein.nextInt();
			switch (type) {
			case 1: m = new Book(); break;
			case 2: m = new EBook(); break;
			case 4: m = new Pen(); break;
			case 5: m = new Tissue(); break;
			default: type = 0; break;
			}
			m.read(filein);
			sellList.add(m);
		}
		filein.close();
	}
	Scanner openFile(String filename) {
		Scanner filein = null;
		try {
			filein = new Scanner(new File(filename));
		} catch (IOException e) {
			System.out.println("파일 오픈 실패 " + filename);
			System.exit(0);
		}
		return filein;
	}
	void printAll() {
		for (Manageable m: sellList)
			m.print();
	}
	void search() {
		String kwd = null;
		while (true) {
			System.out.print(">> 검색 키워드: ");
			kwd = scan.next();
			if (kwd.equals("end"))
				break;
			for (Manageable m: sellList)
				if (m.matches(kwd))
					m.print();
		}
	}
	public static void main(String[] args) {
		Bookstore store = new Bookstore();
		store.run();
	}

}
