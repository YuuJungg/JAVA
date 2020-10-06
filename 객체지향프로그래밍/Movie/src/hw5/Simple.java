package hw5;

import java.util.ArrayList;
import java.util.Scanner;

public class Simple extends Movie {
	int genreNum;
	ArrayList<String> genres = new ArrayList<>();
	@Override
	public void read(Scanner scan) {
		super.read(scan);
		String tmp;
		genreNum = scan.nextInt();
		for (int i = 0; i < genreNum; i++) {
			tmp = scan.next();
			genres.add(tmp);
		}
	}
	@Override
	public void print() {
		super.print();
		System.out.printf("/");
		for (String a: genres)
			System.out.printf("%s ", a);
	}
	@Override
	public boolean matches(String kwd) {
		if (super.matches(kwd))
			return true;
		for (String a: genres)
			if (genres.contains(a))
				return true;
		return false;
	}
	

}
