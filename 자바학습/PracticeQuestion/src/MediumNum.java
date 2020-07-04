import java.util.Scanner;

public class MediumNum {

// 2-4
// 정수 3개 입력받고 중간 크기 수 출력
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x,y,z;
		System.out.print("정수 3개 입력>>");
		x = scanner.nextInt();
		y = scanner.nextInt();
		z = scanner.nextInt();
		
		if(x<y && y<z)
			System.out.println("중간 값은 " + y + "입니다.");
		if(y<x && x<z)
			System.out.println("중간 값은 " + x + "입니다.");
		else
			System.out.println("중간 값은 " + z + "입니다.");
		
		scanner.close();
			

	}

}
