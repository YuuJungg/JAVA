import java.util.Scanner;

public class MediumNum {

// 2-4
// ���� 3�� �Է¹ް� �߰� ũ�� �� ���
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x,y,z;
		System.out.print("���� 3�� �Է�>>");
		x = scanner.nextInt();
		y = scanner.nextInt();
		z = scanner.nextInt();
		
		if(x<y && y<z)
			System.out.println("�߰� ���� " + y + "�Դϴ�.");
		if(y<x && x<z)
			System.out.println("�߰� ���� " + x + "�Դϴ�.");
		else
			System.out.println("�߰� ���� " + z + "�Դϴ�.");
		
		scanner.close();
			

	}

}
