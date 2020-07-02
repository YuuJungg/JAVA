import java.util.Scanner;

/*
 아메리카노는 2000, 다른 커피는 3500
 */
public class CoffeePrice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("무슨 커피 드릴까요? ");
		String order = scanner.next();  // 주문읽기
		int price = 0;
		switch (order) {
			case "에스프레소":
			case "카푸치노":
			case "카페라떼":
				price = 3500; break;
			case "아메리카노":
				price = 2000; break;
			default: System.out.println("메뉴에 없습니다!");
		}
		
		if(price != 0)
			System.out.println(order + "는 " + price + "원입니다.");
		
		scanner.close();
		
		

	}

}
