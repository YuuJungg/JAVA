import java.util.Scanner;

// 2-1

public class ChangeDollar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>");
		int koreaMoney = scanner.nextInt();  // ��ȭ
		double dollar = koreaMoney / 1100;
		System.out.println(koreaMoney +"���� " + "$" + dollar + "�Դϴ�." );
		scanner.close();	

	}

}
