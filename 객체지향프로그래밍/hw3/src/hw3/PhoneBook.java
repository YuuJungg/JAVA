package hw3;

public class PhoneBook {
	ContactManager manager = new ContactManager();

	void run() {
		manager.readAll();
		runMenu();
	}

	int inputMenu() {
		int num;
		while (true) {
			System.out.println("############ 연락처 관리 ############");
			System.out.print("(1) 연락처 출력  ");
			System.out.print("(2) 새로 등록  ");
			System.out.print("(3) 삭제  ");
			System.out.print("(4) 검색  ");
			System.out.print("(5) 수정  ");
			System.out.print("(6) 끝내기  ");
			System.out.print("... ");
			num = manager.scan.nextInt();
			if (num >= 1 && num <= 6)
				return num;
			System.out.println("잘못된 번호입니다. 다시 입력해 주세요...");
		}
	}

	void runMenu() {
		int num;
		while (true) {
			num = inputMenu();
			switch (num) {
			case 1: manager.printList(); break;
			case 2: manager.registerContact(); break;
			case 3: manager.deleteContact(); break;
			case 4: manager.searchContact(); break;
			case 5: manager.modifyContact();break;
			default: num = 0; break;
			}
			if (num == 0) break;
		}
	}

	public static void main(String[] args) {
		PhoneBook m = new PhoneBook(); 
		m.run(); 
	}
}
