package lecture_4_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	int id;
	String name;
	String phone;
	int year;
	ArrayList<Lecture> registeredList = new ArrayList<>();
	
	Student(int id2) {
		id = id2;
	}

	void read(Scanner scan, Department department) {
		//id = scan.nextInt();
		name = scan.next();
		phone = scan.next();
		year = scan.nextInt();
		String code = null;
		Lecture lec = null;
		while (true) {
			code = scan.next();
			if (code.equals("0"))
				break;
			lec = department.findLecture(code);
			if (lec == null) {
				System.out.println("잘못된 코드입니다 - " + code);
				continue;
			}
			registeredList.add(lec);
		}
	}
	void print2() {
		System.out.printf("%d %s %s (%d학년)\n", id, name, phone, year);
	}
	
	void print() {
		System.out.printf("%d %s %s (%d학년)\n", id, name, phone, year);
		for (Lecture lec: registeredList) {
			System.out.print("\t");
			lec.print();
		}
	}
	boolean matches(String kwd) {  
		if(name.contains(kwd))
			return true;	
		if(kwd.length() > 3 && (id+"").contains(kwd))
			return true;
		if(kwd.length() > 3 && phone.contains(kwd)) 
			return true;
		if((year+"").contentEquals(kwd))
			return true;
		return false;
	}
	
	public boolean containsLecture(Lecture lecture) {
		for (Lecture lec: registeredList) {
			if(lecture == lec)
				return true;
		}
		return false;
	}
	boolean matchesDay(String day) {
		for (Lecture lec: registeredList) {
			if (lec.matches(day))
				return true;
		}
		return false;
	}
	public boolean matches(String[] kwdArr) {
		for (String kwd: kwdArr)
			if (!matches(kwd))
				return false;
		return true;
	}
	void printName() {
		System.out.printf("%s   ", name);
	}
}

