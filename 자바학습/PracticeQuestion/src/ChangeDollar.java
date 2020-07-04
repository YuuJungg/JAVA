import java.util.Scanner;

// 2-1

public class ChangeDollar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원화를 입력하세요(단위 원)>>");
		int koreaMoney = scanner.nextInt();  // 원화
		double dollar = koreaMoney / 1100;
		System.out.println(koreaMoney +"원은 " + "$" + dollar + "입니다." );
		scanner.close();	

	}

}
