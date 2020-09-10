package hw2;

import java.util.ArrayList;
import java.util.Scanner;

public class Department {
	Scanner scan = new Scanner(System.in);
	ArrayList<Student> studentList = new ArrayList<>();
	void run() {
		readAll();
		printAll();
	}
	
	void readAll() {
		for (int i = 0; i < 5; i++) {
			Student st = new Student();
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
