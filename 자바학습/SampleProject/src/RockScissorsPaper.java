import java.util.Scanner;

public class RockScissorsPaper {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		
		System.out.print("ö�� >> ");
		String a = scanner.next();  // ö��
		System.out.print("���� >> ");
		String b = scanner.next();  // ö��
		
		if(a.equals("����"))
		{
			if(b.equals("����"))
				System.out.println("�����ϴ�.");
			else if(b.equals("����"))
				System.out.println("���� �̰���ϴ�.");
			else 
				System.out.println("ö���� �̰���ϴ�.");
			
		}
		else if(a.equals("����"))
		{
			if(b.equals("����"))
				System.out.println("ö���� �̰���ϴ�.");
			else if(b.equals("����"))
				System.out.println("�����ϴ�.");
			else 
				System.out.println("���� �̰���ϴ�.");
		}
		else
		{
			if(b.equals("����"))
				System.out.println("���� �̰���ϴ�.");
			else if(b.equals("����"))
				System.out.println("ö���� �̰���ϴ�.");
			else 
				System.out.println("�����ϴ�.");
		}
		
		
		
		
	}

}
