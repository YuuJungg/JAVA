/*
블랙잭 게임 규칙
딜러는 i장의 숫자카드를 랜덤하게 보여주고 V라는 값을 외친다. 
참가자들은 랜덤하게 나열된 i장의 카드 중 3장의 카드를 골라 V라는 값에 가장 근접하게 만들어야 한다. 
3장의 카드의 값은 V값을 넘기지 않으면서 가장 근접하게 만들어야 하고 더 근접하게 만든 선수가 승리한다. 
단,나열된 N장의 카드 중 2장의 카드는 반드시 가장 큰 값과 가장 작은 값을 선택해야만 하는 것이다. 
1.첫번째 줄에선 랜덤한 숫자의 개수 i와(3 <= i <= 100) 최종적으로 가장 근접하게 만들어야 하는 값 V가 주어진다.(300 <= V <= 3000) 
2.단 여기서 주어지는 i장의 카드들은 각각 10 이상 1000이하의 값을 가진다. (10 <= i.value <= 1000)
3.가장 근접한 수를 만들 수 없는 경우에는 -1 출력
*/
import java.util.Random;

public class BlackJack {

	public static void main(String[] args) {
		int[] RandNum = new int[3000];
		int max, min;
		int x = 0;
		int c1 = 0;
		int c2 = 0;

		int Rnum = (int) ((Math.random() * (100 - 3)) + 3); // 3~100 랜덤값
		int V = (int) ((Math.random() * (3000 - 300)) + 300); // 3000~300 랜덤값
		
		for (int i = 0; i < Rnum; i++) // Rnum번 반복해서 난수 생성
		{ 
			RandNum[i] = (int) ((Math.random() * (1000 - 10)) + 10); // 1000~10 랜덤값
			System.out.print(RandNum[i] + " ");
		}
		System.out.println("\rV : " + V);

		max = RandNum[0];
		min = RandNum[0];

		for (int i = 0; i < Rnum; i++) 
		{
			if (RandNum[i] > max) 
				max = RandNum[i];
			if (RandNum[i] < min) 
				min = RandNum[i];
		}
		
		System.out.println("제일 큰 수 = " + max);
		System.out.println("제일 작은 수 = " + min);
		
		for (int i = 0; i< Rnum; i++) 
		{
			if(RandNum[i] >= V) //V와 차이 구하기
				c1 = RandNum[i] - V;
			else
				c2 = V - RandNum[i];
			if(c1<c2)
				x= RandNum[i];
			else
				x = RandNum[i];				
		}
		
		if((max + min) > V)
			System.out.println("-1");
		else
			System.out.println(x + "를 선택하는 것이 게임에서 승리할 수 있다.");
	}
}
