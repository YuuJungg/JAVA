/*
���� ���� ��Ģ
������ i���� ����ī�带 �����ϰ� �����ְ� V��� ���� ��ģ��. 
�����ڵ��� �����ϰ� ������ i���� ī�� �� 3���� ī�带 ��� V��� ���� ���� �����ϰ� ������ �Ѵ�. 
3���� ī���� ���� V���� �ѱ��� �����鼭 ���� �����ϰ� ������ �ϰ� �� �����ϰ� ���� ������ �¸��Ѵ�. 
��,������ N���� ī�� �� 2���� ī��� �ݵ�� ���� ū ���� ���� ���� ���� �����ؾ߸� �ϴ� ���̴�. 
1.ù��° �ٿ��� ������ ������ ���� i��(3 <= i <= 100) ���������� ���� �����ϰ� ������ �ϴ� �� V�� �־�����.(300 <= V <= 3000) 
2.�� ���⼭ �־����� i���� ī����� ���� 10 �̻� 1000������ ���� ������. (10 <= i.value <= 1000)
3.���� ������ ���� ���� �� ���� ��쿡�� -1 ���
*/
import java.util.Random;

public class BlackJack {

	public static void main(String[] args) {
		int[] RandNum = new int[3000];
		int max, min;
		int x = 0;
		int c1 = 0;
		int c2 = 0;

		int Rnum = (int) ((Math.random() * (100 - 3)) + 3); // 3~100 ������
		int V = (int) ((Math.random() * (3000 - 300)) + 300); // 3000~300 ������
		
		for (int i = 0; i < Rnum; i++) // Rnum�� �ݺ��ؼ� ���� ����
		{ 
			RandNum[i] = (int) ((Math.random() * (1000 - 10)) + 10); // 1000~10 ������
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
		
		System.out.println("���� ū �� = " + max);
		System.out.println("���� ���� �� = " + min);
		
		for (int i = 0; i< Rnum; i++) 
		{
			if(RandNum[i] >= V) //V�� ���� ���ϱ�
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
			System.out.println(x + "�� �����ϴ� ���� ���ӿ��� �¸��� �� �ִ�.");
	}
}
