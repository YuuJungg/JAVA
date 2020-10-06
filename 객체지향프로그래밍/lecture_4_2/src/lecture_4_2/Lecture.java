package lecture_4_2;

import java.util.Scanner;

public class Lecture {
	String code;
	String title;
	int year;
	String date;
	String time;
	
	Lecture(String code) {
		this.code = code;
	}
	void read(Scanner scan) {
		title = scan.next();
		year = scan.nextInt();
		date = scan.next();
		time = scan.next();
	}
	void print() {
		System.out.printf("[%s] %s %d학년 (%s요일 %s)\n",
				code, title, year, date, time);
	}	
	boolean matches(String kwd) {
		if (code.contentEquals(kwd))
			return true;
		if (title.contains(kwd))
			return true;
		if (kwd.contentEquals("" + year))
			return true;
		if (kwd.contentEquals(date))
			return true;
		if (kwd.contentEquals(time))
			return true;
		return false;
	}
	public boolean matches(String[] kwdArr) {
		for (String kwd: kwdArr) {
			if (code.contentEquals(kwd))
			return true;
			if (title.contains(kwd))
				return true;
			if (kwd.contentEquals("" + year))
				return true;
			if (kwd.contentEquals(date))
				return true;
			if (kwd.contentEquals(time))
				return true;
			return false;
		}
		return true;
	}
}
