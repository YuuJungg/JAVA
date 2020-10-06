package hw3;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactManager {
	ArrayList<Contact> contacts = new ArrayList<>(); 
	static Scanner scan = new Scanner(System.in);

	void readAll() {
		Contact c = null;
		while (true) {
			String phone = scan.next(); 
			if (phone.contentEquals("end"))
				break; 
			if (findContact(phone) != null) {
				System.out.println("이미 등록된 번호입니다.");
				continue;
			}
			c = new Contact(phone);
			c.read(scan); 
			contacts.add(c);
		} 
	}

	void printList() { 
		if (contacts.isEmpty()) { 
			System.out.println("연락처가 비어있습니다.");
			return;
		}
		int i = 0;
		for (Contact c : contacts) 
			c.print(i++); 
	} 

	void registerContact() { 
		String phone = null; 
		System.out.print("전화번호 : ");
		phone = scan.next(); 
		if (findContact(phone) != null) { 
			System.out.println("이미 존재하는 전화번호 입니다."); 
			return;
		}
		Contact c = new Contact(phone); 
		c.readRegister(scan); 
		contacts.add(c); 
	}

	void deleteContact() { 
		printList(); 
		int index = -1; 
		System.out.print("삭제할 번호: ");
		index = scan.nextInt();
		if (index <= 0 || index > contacts.size()) { 
			System.out.println("번호가 범위를 벗어났습니다."); 
			return;
		}
		contacts.remove(index - 1); 
	}

	void modifyContact() {
		printList();
		int index = -1;
		System.out.print("수정할 번호: ");
		index = scan.nextInt();
		if (index <= 0 || index > contacts.size()) {
			System.out.println("번호가 범위를 벗어났습니다.");
			return;
		}
		contacts.get(index - 1).modify(scan);
	}

	void searchContact() { 
		String kwd = null;
		System.out.print("검색 키워드: ");
		kwd = scan.next();
		if (findContact(kwd) == null) {
			System.out.println("검색결과가 존재하지 않습니다.");
			return;
		}
		int i = 1;
		for (Contact cont: contacts) {
			if (cont.compare(kwd))
				cont.print(i);
			i++;
		}
	}
	
	Contact findContact(String kwd) { 
		for (Contact cont: contacts) {
			if (cont.compare(kwd)) {
				return cont;
			}
		}
		return null;
	}
}