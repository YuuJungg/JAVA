import java.util.Scanner;

// 2-5
// Scanner �� �̿��Ͽ� �ﰢ���� ���� ���̸� ��Ÿ���� ������ 3�� �Է¹ް�
// �� 3���� ���� �ﰢ���� ���� �� �ִ� �� �Ǻ��϶�. 
// �ﰢ���� �Ƿ��� �� ���� ���� �ٸ� �� ���� �պ��� Ŀ�� �Ѵ�.

public class Triangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� 3���� �Է��Ͻÿ�>>");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		
		if((x+y)<z || (x+z)<y || (y+z)<x)
			System.out.println("�ﰢ���� �ȵ˴ϴ�");
		else
			System.out.println("�ﰢ���� �˴ϴ�");
		
		scanner.close();

	}

}
