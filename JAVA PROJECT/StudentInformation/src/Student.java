import java.util.Scanner;

class Student1{  //컴공
	
	private String name;
	private int studentNum;
	private int grade;
	
	Student1(String Name, int ID, int Grade){
		name =Name;
		studentNum = ID;
		grade = Grade;
	}
	
	int getStudentNum() {
		return studentNum;
	}
	
	String getName() {
		return name;
	}
	
	int getGrade() {
		return grade;
	}
}

class Student2{ //중어중문
	
	private String name;
	private int studentNum;
	private int grade;
	
	Student2(String Name, int ID, int Grade){
		name =Name;
		studentNum = ID;
		grade = Grade;
	}
	
	int getStudentNum() {
		return studentNum;
	}
	
	String getName() {
		return name;
	}
	
	int getGrade() {
		return grade;
	}
}


public class Student {
	String Name1, Name2;  //이름을 입력받는 변수
	int ID1, ID2, Grade1, Grade2; //학번, 학년 입력받는 변수
	
	public static void main(String[] args) {
		String Menu; //메뉴 선택 변수
		String Major1, Major2;  //학과1:컴공, 학과2:중어중문
		
		Student1 [] Array1 = new Student1 [4]; //컴공 배열을 이용하여 학생수를 입력 받음 
		Student2 [] Array2 = new Student2 [4]; //중어중문 배열을 이용하여 학생수를 입력 받음
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("================");
		System.out.println("학번: 201813111");
		System.out.println("이름: 조유정");
		System.out.println("================\n");
		System.out.println("학생 정보 입력 시스템");
		
		while(true) {
			System.out.println();
			System.out.println("\t \t메뉴를 선택하세요.");
			System.out.println("|1. 학과 선택 및 학생 정보 입력 | |2. 결과| |0. 끝내기|");
			Menu = scanner.next();  //메뉴를 입력 받음. next():한 글자(공백기준) 단위로 입력받는다.
			// scanner.nextLine():한 줄 단위로 입력받는다.
			
			if("0".equals(Menu)) { //0을 입력받았을 경우 시스템 종료.
				System.out.println("시스템이 종료 되었습니다.");
				System.exit(0); //정상종료
				//System.exit(1); 비정상종료
				//exit(): 현재 실행하고 있는 프로세스를 강제 종료시키는 역할
			}
			
			if("1".equals(Menu)) { //1을 입력받았을 경우 학과 선택 후 바로 학생 정보를 입력
				System.out.println("|1. 컴공 | |2. 중어중문|");
				Major1 = scanner.next();
				
				if("1".equals(Major1)) { //컴공 학생 정보를 입력 받음
					String name; //컴공 학생 이름 변수
					int studentNum, grade; //컴공 학번, 학년 변수
					for(int i=1; i<4; i++) { 
						System.out.println(i + "번째 학생의 이름을 입력하세요");
						System.out.print(">>");
						name = scanner.next();
						
						System.out.println(i + "번째 학생의 학번을 입력하세요");
						System.out.print(">>");
						studentNum = scanner.nextInt();
						
						System.out.println(i + "번째 학생의 학년을 입력하세요");
						System.out.print(">>");
						grade = scanner.nextInt();
						Array1[i] = new Student1(name, studentNum, grade); //배열에 차례대로 이름, 학번, 학년을 저장
					}
					continue; //이어서 계속
				}
				
				else if("2".equals(Major1)) {
					String name;
					int studentNum, grade;
					
					for(int j=1; j<4; j++) {
						System.out.println(j + "번째 학생의 이름을 입력하세요");
						System.out.print(">>");
						name = scanner.next();
						
						System.out.println(j + "번째 학생의 학번을 입력하세요");
						System.out.print(">>");
						studentNum = scanner.nextInt();
						
						System.out.println(j + "번째 학생의 학년을 입력하세요");
						System.out.print(">>");
						grade = scanner.nextInt();
						Array2[j] = new Student2(name, studentNum, grade);
					}
				}
				
				else {
					System.out.println("잘못 입력하셨습니다. 다시 입력하십시오.");
					continue;
				}
			}
			
			if("2".equals(Menu)) { //2번을 입력받았을 경우 학과 선택 후 바로 학생 정보 출력
				try {
					System.out.println("|1. 컴공 | |2. 중어중문|");
					Major2 = scanner.next();
					if("1".equals(Major2)) { //컴공 학생 정보 출력
						for(int i=1; i<Array1.length; i++) {
							System.out.print("\n" + i + "번째 학생의 이름: " + Array1[i].getName());
							System.out.print("\t학번: " + Array1[i].getStudentNum());
							System.out.print("\t학년: " + Array1[i].getGrade());
						}
						continue;
					}
					if("2".equals(Major2)) {
						for(int j=1; j<Array2.length;j++) {
							System.out.print("\n" + j + "번째 학생의 이름: " + Array1[j].getName());
							System.out.print("\t학번: " + Array1[j].getStudentNum());
							System.out.print("\t학년: " + Array1[j].getGrade());
						}
					}
					else { //등록된 정보가 없을 때 메시지 출력
						System.out.println("등록되어 있는 정보가 없습니다. 등록 후 다시 시도 하십시오!");
						continue;
					}
				}
				
				catch(Exception e) { //결과값 출력 메시지
					e.getMessage();
					System.out.println("\n결과값이 출력되었습니다.");
				} //catch End.
				
			} //Menu Select End
		} //While End
	} // main end

}
