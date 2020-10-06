package hw5;

import java.util.Scanner;

public interface Manageable {
	void read(Scanner scan);
	void print();
	void print2();
	boolean matches(String kwd);
}
