package hw2;

import java.util.Random;
import java.util.Scanner;

public class Student {
	int id;
	String name;
	String phone;
	int year;
	int score;
	
	Student(int id2) {
		id = id2;
	}

	void read(Scanner scan) {
		//id = scan.nextInt();
		name = scan.next();
		phone = scan.next();
		year = scan.nextInt();
	}
	
	void print() {
		System.out.printf("%d %s %s %d학년", id, name, phone, year);
		if (score > 0)
			System.out.printf(" [%d점]", score);
		System.out.println();
	}

	boolean matches(String kwd) {  
		if(name.contains(kwd))
			return true;	
		if(kwd.length() > 3 && (id+"").contains(kwd))
			return true;
		if(kwd.length() > 3 && phone.contains(kwd)) 
			return true;
		if((year+"").contentEquals(kwd))
			return true;
		return false;
	}

	public boolean matches(String[] kwdArr) {
		for (String kwd: kwdArr) {
			if(kwd.charAt(0) == '-' && matches(kwd.substring(1)))
				return false;
			if(kwd.charAt(0) != '-' && !matches(kwd))
				return false;
		}
		return true;
	}
	
	static Random rand = new Random();
	public void inputScore() {
		score = rand.nextInt(100) + 1; //Math.randint
		System.out.printf("이름: %s (점수: %d)\n", name, score);
	}

}
