package team;

import java.util.ArrayList;
import java.util.Scanner;

public class Team {
	String name;
	ArrayList<Student> members = new ArrayList<>();
	Team(String name){
		this.name = name;
	}
	
	void read(Scanner scan, Department department) {
		int num = 0;
		Student st = null;
		while (true) {
			num = scan.nextInt();
			if (num == 0) break;
			st = department.findStudent(num);
			members.add(st);
			st.setTeam(this);
		}
	}
	void print() {
		System.out.printf("%s: ", name);
		for (Student st: members)
			System.out.printf("%s ", st.name);
		System.out.println();
	}

	public boolean matches(String kwd) {
		if (kwd.equals(name))
			return true;
		for (Student st: members)
			if (st.matches(kwd))
				return true;
		return false;
	}
}
	
