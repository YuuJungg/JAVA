package team;

import java.util.ArrayList;
import java.util.Scanner;

public class Department {
	Scanner scan = new Scanner(System.in);
	ArrayList<Student> studentList = new ArrayList<>();
	void run() {
		readAllStudent();
		readTeams();
		printTeams();
		printAllStudent();
		search();
	}

	void search() {
		String kwd;
		kwd = scan.nextLine();
		String[] kwdArr;
		while (true) {
			System.out.print("팀검색키워드: ");
			kwd = scan.next();
			for(Team t: teamList) {
				if(t.matches(kwd))
					t.print();
			}
		}
	}
	
	void readAllStudent() {
		int id = 0;
		while (true) {
			id = scan.nextInt();
			if(id == 0)
				break;
			Student st = new Student(id);
			st.read(scan);
			studentList.add(st);
		}
	}
		
	void printAllStudent() {
		for (Student st: studentList) {
			st.print();
		}
	}
	ArrayList <Team> teamList = new ArrayList<>(); 
	void readTeams() {
		String name = null;
		while (true) {
			name = scan.next();
			if(name.equals("end"))
				break;
			Team team = new Team(name);
			team.read(scan, this);
			teamList.add(team);
		}
	}
	private void printTeams() {
		for (Team t: teamList)
			t.print();
	}

	public static void main(String[] args) {
		Department m = new Department();
		m.run();
	}

	public Student findStudent(int num) {
		if (num <= 0 || num > studentList.size())
			return null;
		return studentList.get(num - 1);
	}
	
}
