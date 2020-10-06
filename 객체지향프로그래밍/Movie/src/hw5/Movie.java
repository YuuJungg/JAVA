package hw5;

import java.util.Scanner;

public class Movie implements Manageable {
	int index;
	String title;
	int year;
	int audience;
	int rank;
	@Override
	public void read(Scanner scan) {
		index = scan.nextInt();
		title = scan.nextLine();
		year = scan.nextInt();
		audience = scan.nextInt();
		rank = scan.nextInt();
	}
	@Override
	public void print() {
		System.out.printf("[%d]%s/%d≥‚ %d¿ß (%d)", index, title, year, rank, audience);
	}
	@Override
	public void print2() {
		System.out.printf("%s,", title);
	}
	@Override
	public boolean matches(String kwd) {
		if (kwd.equals("" + index))
			return true;
		if (title.contains(kwd))
			return true;
		if (kwd.equals("" + year))
			return true;
		if (kwd.equals("" + audience))
			return true;
		if (kwd.equals("" + rank))
			return true;
		return false;
	}
}
