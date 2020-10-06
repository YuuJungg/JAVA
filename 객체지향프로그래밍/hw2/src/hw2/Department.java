package hw2;

import java.util.ArrayList;
import java.util.Scanner;

public class Department {
	Scanner scan = new Scanner(System.in);
	ArrayList<Student> studentList = new ArrayList<>();
	void run() {
		readAll();
		inputScores();
		printAll();
		search();
	}
	
	void inputScores() {
		for (Student st: studentList) {
			st.inputScore();
		}
		
	}

	void search() {
		String kwd;
		kwd = scan.nextLine();
		String[] kwdArr;
		while (true) {
			System.out.print("멀티키워드 검색: ");
			kwd = scan.nextLine();
			if(kwd.contentEquals("end"))
				break;
			kwdArr = kwd.split(" ");
			for(Student st: studentList) {
				if(st.matches(kwdArr))
					st.print();
			}
		}
	}
	
	void readAll() {
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
		
	void printAll() {
		for (Student st: studentList) {
			st.print();
		}
	}

	public static void main(String[] args) {
		Department m = new Department();
		m.run();
	}
}
