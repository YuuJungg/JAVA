package team;

import java.util.Scanner;

public class Student {
	int id;
	String name;
	String phone;
	int year;
	Team myTeam;
	
	Student(int id2) {
		id = id2;
	}

	void read(Scanner scan) {
		//id = scan.nextInt();
		name = scan.next();
		phone = scan.next();
		year = scan.nextInt();
	}
	
	void print() {
		System.out.printf("%d %s %s %dÇÐ³â", id, name, phone, year);
		if (myTeam != null)
			System.out.printf(" [%sÆÀ]", myTeam.name);
		System.out.println();
	}
	void setTeam(Team t) {
		myTeam = t;
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

	public boolean matches(String[] kwdArr) {
		for (String kwd: kwdArr) {
			if(kwd.charAt(0) == '-' && matches(kwd.substring(1)))
				return false;
			if(kwd.charAt(0) != '-' && !matches(kwd))
				return false;
		}
		return true;
	}
}

