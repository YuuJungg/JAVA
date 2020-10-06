package hw5;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in); 
	ArrayList<Manageable> movieList = new ArrayList<>();
	void run() {
		readAll("movie.txt");
		System.out.println("------------------------------------");
		System.out.println("2016년 ~ 2018년의 관객수 기준 영화순위 top10");
		System.out.println("------------------------------------");
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
			case 0: m = new Movie(); break;
			case 1: m = new Simple(); break;
			case 2: m = new Detail(); break;
			default: type = 0; break;
			}
			m.read(filein);
			movieList.add(m);
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
		for (Manageable m: movieList)
			m.print();
	}
	void search() {
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("---       검색 기능            ---");
		System.out.println("--------------------------");
		String kwd;
		while (true) {
			System.out.print(">>");
			kwd = scan.next();
			if (kwd.equals("end"))
				break;				
			if (kwd.contains("detail")) {
				for (Manageable m: movieList)
					if (m.matches(kwd))
						m.print();
			}
			else				
				for (Manageable m: movieList) {
					if (m.matches(kwd)) 
						m.print2();
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

}
