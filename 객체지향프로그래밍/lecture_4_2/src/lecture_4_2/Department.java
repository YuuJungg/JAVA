package lecture_4_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Department {
	Scanner scan = new Scanner(System.in);
	ArrayList<Student> studentList = new ArrayList<>();
	ArrayList<Lecture> lectureList = new ArrayList<>();
	
	void run() {
		readAllLectures();
		readAllStudent();
		runMenu();
	}	
	void runMenu() {
		int menu;
		while (true) {
			System.out.print("��з� (1) �л� (2) ���� (3) �����˻�  ");
			menu = scan.nextInt();
			switch (menu) {
			case 1: studentMenu(); break;
			case 2: subjectMenu(); break;
			case 3: searchMenu(); break;
			default: break;
			}
		}
	}
	void studentMenu() {
		int student;
		while (true) {
			System.out.print("�л����θ޴� (1) �л���ü��� (2) ��ƼŰ����˻�  ");
			student = scan.nextInt();
			switch (student) {
			case 1: printAllStudent(); break;
			case 2: search(); break;
			default: break;
			}
			if (student == 0)
				break;
		}
	}
	void subjectMenu() {
		while (true) {
			System.out.print("���񼼺θ޴� (1) ������ü��� (2) Ű����˻�  ");
			int subject = scan.nextInt();
			switch (subject) {
			case 1: printAllLectures(); break;
			case 2: subjectSearch(); break;
			default: break;
			}
			if (subject == 0)
				break;
		}
	}
	void searchMenu() {
		while (true) {
			System.out.print("�����˻� �޴� (1) ���� ������ (2) ���Ϻ� ������ (3) Ÿ�г� ���� �������� ����  ");
			int search = scan.nextInt();
			switch (search) {
			case 1: searchStudentsByLecture(); break;
			case 2: searchStudentsByDay(); break;
			case 3: searchStudentsByOtherLecture(); break;
			}
			if (search == 0)
				break;
		}
	}
	void search() {
		String kwd;
		String[] kwdArr;
		kwd = scan.nextLine();
		while (true) {
			System.out.println("�ٷ� ���͸� ����...");
			System.out.print("�˻�Ű���� ������(��ĭ���� ����): ");
			kwd = scan.nextLine();
			if(kwd.equals(""))
				break;
			kwdArr = kwd.split(" ");
			for(Student st: studentList) {
				if(st.matches(kwdArr))
					st.print2();
			}
		}
	}
	void subjectSearch() {
		String kwd;
		kwd = scan.nextLine();
		String[] kwdArr;
		System.out.println("========== ���� �˻� =======");
		while (true) {
			System.out.printf("����˻�Ű����: ");
			kwd = scan.nextLine();
			if(kwd.equals("end"))
				break;
			kwdArr = kwd.split(" ");
			for(Lecture lec: lectureList) {
				if(lec.matches(kwdArr))
					lec.print();
			}
			Lecture lecture = null;
			for (Lecture lec: lectureList)
				if(lec.matches(kwd))
					lecture = lec;
			if(lecture == null) {
				System.out.println("���� ������Դϴ�");
				return;
			}
		}
	}
	void readAllStudent() {
		int id = 0;
		while (true) {
			id = scan.nextInt();
			if (id == 0)
				break;
			Student st = new Student(id);
			st.read(scan, this);
			studentList.add(st);
		}
	}
	void printAllStudent() {
		for (Student st : studentList) {
			st.print();
		}
	}
	void readAllLectures() {
		String code = null;
		while (true) {
			code = scan.next();
			if (code.contentEquals("end"))
				break;
			Lecture lec = new Lecture(code);
			lec.read(scan);
			lectureList.add(lec);
		}
	}
	void printAllLectures() {
		for (Lecture lec : lectureList) {
			lec.print();
		}
	}
	public static void main(String[] args) {
		Department m = new Department();
		m.run();
	}
	public Lecture findLecture(String code) {
		for (Lecture lec : lectureList) {
			if (lec.matches(code)) {
				return lec;
			}
		}
		return null;
	}	
	void searchStudentsByLecture() {
		String kwd;
		System.out.println("========== ���� �˻� =======");
		while (true) {
			System.out.printf("����˻�Ű����: ");
			kwd = scan.next();
			Lecture lecture = null;
			for (Lecture lec: lectureList)
				if(lec.matches(kwd))
					lecture = lec;
			if(lecture == null) {
				System.out.println("���� ������Դϴ�");
				return;
			}
			lecture.print();
			for (Student st: studentList) {
				if (st.containsLecture(lecture)) {
					System.out.print("\t");
					st.print2();
				}
			}
		}
	}
	void searchStudentsByDay() {
		String day;
		System.out.println("========== ���Ϻ� �л��˻� =======");
		while (true) {
			System.out.printf(">> ����:");
			day = scan.next();
			if(day.equals("end"))
				break;
			System.out.printf("%s���� ������: ", day);
			for (Student st: studentList) {
				if (st.matchesDay(day)) {
					st.printName();
				}
			}
			System.out.println();
		}
	}
	void searchStudentsByOtherLecture() {
		int student = 0;
		System.out.println("========== ���񺰷� Ÿ�г� ������ �� =======");
		for (Lecture lec: lectureList) {
			for (Student st: studentList) {
				if(st.containsLecture(lec) && lec.year != st.year)
					student++;
			}
		}
	}
}
