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
				System.out.println("�̹� ��ϵ� ��ȣ�Դϴ�.");
				continue;
			}
			c = new Contact(phone);
			c.read(scan); 
			contacts.add(c);
		} 
	}

	void printList() { 
		if (contacts.isEmpty()) { 
			System.out.println("����ó�� ����ֽ��ϴ�.");
			return;
		}
		int i = 0;
		for (Contact c : contacts) 
			c.print(i++); 
	} 

	void registerContact() { 
		String phone = null; 
		System.out.print("��ȭ��ȣ : ");
		phone = scan.next(); 
		if (findContact(phone) != null) { 
			System.out.println("�̹� �����ϴ� ��ȭ��ȣ �Դϴ�."); 
			return;
		}
		Contact c = new Contact(phone); 
		c.readRegister(scan); 
		contacts.add(c); 
	}

	void deleteContact() { 
		printList(); 
		int index = -1; 
		System.out.print("������ ��ȣ: ");
		index = scan.nextInt();
		if (index <= 0 || index > contacts.size()) { 
			System.out.println("��ȣ�� ������ ������ϴ�."); 
			return;
		}
		contacts.remove(index - 1); 
	}

	void modifyContact() {
		printList();
		int index = -1;
		System.out.print("������ ��ȣ: ");
		index = scan.nextInt();
		if (index <= 0 || index > contacts.size()) {
			System.out.println("��ȣ�� ������ ������ϴ�.");
			return;
		}
		contacts.get(index - 1).modify(scan);
	}

	void searchContact() { 
		String kwd = null;
		System.out.print("�˻� Ű����: ");
		kwd = scan.next();
		if (findContact(kwd) == null) {
			System.out.println("�˻������ �������� �ʽ��ϴ�.");
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