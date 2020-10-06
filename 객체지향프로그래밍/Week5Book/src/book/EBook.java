package book;

import java.util.Scanner;

public class EBook extends Book {
	String url;
	String format;
	@Override
	public void read(Scanner scan) {
		super.read(scan);
		url = scan.next();
		format = scan.next();
	}
	@Override
	public void print() {
		super.print();
		System.out.printf("\t%s [%s]\n", url, format);
	}
	@Override
	void printBookType() {
		System.out.print("[전자책] ");
	}
	@Override
	public boolean matches(String kwd) {
		if (kwd.equals("전자책"))
			return true;
		if (super.matches(kwd))
			return true;
		if (url.contains(kwd))
			return true;
		if (format.equals(kwd))
			return true;
		return false;
	}
}
