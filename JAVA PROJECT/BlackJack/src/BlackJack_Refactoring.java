import java.util.Random;

class BlackJackGame{	
	int[] RandNum = new int[3000];
	int max, min;
	int selectValue = 0;
	int differenceWithV1 = 0;
	int differenceWithV2 = 0;
	int Rnum = (int) ((Math.random() * (100 - 3)) + 3); 
	int V = (int) ((Math.random() * (3000 - 300)) + 300); 
	
	public void randomValue10_1000() {
		for (int i = 0; i < Rnum; i++) {
			RandNum[i] = (int) ((Math.random() * (1000 - 10)) + 10); // 1000~10 랜덤값
			System.out.print(RandNum[i] + " ");
		}
	}
	
	public void V() {
		System.out.println("\rV : " + V);
	}

	public void findMaxMin() {
		max = RandNum[0];
		min = RandNum[0];

		for (int i = 0; i < Rnum; i++) {
			if (RandNum[i] > max) {
				max = RandNum[i];
			}
			if (RandNum[i] < min) {
				min = RandNum[i];
			}
		}		

		System.out.println("제일 큰 수 = " + max);
		System.out.println("제일 작은 수 = " + min);
	}
	
	public void differenceWith() {
			for (int i = 0; i < Rnum; i++) {
			
			if (RandNum[i] >= V) {
				differenceWithV1 = RandNum[i] - V;
			}else {
				differenceWithV2 = V - RandNum[i];
			}
			
			if (differenceWithV1 < differenceWithV2) {
				selectValue = RandNum[i];
			}else {
				selectValue = RandNum[i];
			}
		}
	}
	
	public void result() {
		if ((max + min) > V) {
			System.out.println("-1");
		}else {
			System.out.println(selectValue + "를 선택하는 것이 게임에서 승리할 수 있다.");
		}
	}
	
}
public class BlackJack_Refactoring {

	public static void main(String[] args) {
		BlackJackGame blackjack = new BlackJackGame();
		blackjack.randomValue10_1000();
		blackjack.V();
		blackjack.findMaxMin();
		blackjack.differenceWith();
		blackjack.result();
	}

}
