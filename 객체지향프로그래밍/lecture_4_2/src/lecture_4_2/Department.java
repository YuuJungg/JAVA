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
			System.out.print("대분류 (1) 학생 (2) 과목 (3) 연관검색  ");
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
			System.out.print("학생세부메뉴 (1) 학생전체출력 (2) 멀티키워드검색  ");
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
			System.out.print("과목세부메뉴 (1) 과목전체출력 (2) 키워드검색  ");
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
			System.out.print("연관검색 메뉴 (1) 과목별 수강생 (2) 요일별 수강생 (3) 타학년 과목 수강생수 조사  ");
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
			System.out.println("바로 엔터면 종료...");
			System.out.print("검색키워드 여러개(빈칸으로 구분): ");
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
		System.out.println("========== 과목 검색 =======");
		while (true) {
			System.out.printf("과목검색키워드: ");
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
				System.out.println("없는 과목명입니다");
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
		System.out.println("========== 과목 검색 =======");
		while (true) {
			System.out.printf("과목검색키워드: ");
			kwd = scan.next();
			Lecture lecture = null;
			for (Lecture lec: lectureList)
				if(lec.matches(kwd))
					lecture = lec;
			if(lecture == null) {
				System.out.println("없는 과목명입니다");
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
		System.out.println("========== 요일별 학생검색 =======");
		while (true) {
			System.out.printf(">> 요일:");
			day = scan.next();
			if(day.equals("end"))
				break;
			System.out.printf("%s요일 수강생: ", day);
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
		System.out.println("========== 과목별로 타학년 수강생 수 =======");
		for (Lecture lec: lectureList) {
			for (Student st: studentList) {
				if(st.containsLecture(lec) && lec.year != st.year)
					student++;
			}
		}
	}
}
