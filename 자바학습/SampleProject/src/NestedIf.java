import java.util.Scanner;

// 점수와 학년 입력받아 60점 이상이면 합격, 미만이면 불합격 출력.
// 4학년인 경우 70점 이상이어야 합격.

public class NestedIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0~100): ");
		int score = scanner.nextInt(); // 점수읽기
		System.out.print("학년을 입력하세요(1~4): ");
		int year = scanner.nextInt();
		
		if(score >= 60) 
		{
			if(year != 4)
				System.out.println("합격!");
			else if(score >= 70)
				System.out.println("합격!");
			else
				System.out.println("불합격!");
			
		}
		else 
			System.out.println("불합격!");
		
		scanner.close();
		
	}

}
