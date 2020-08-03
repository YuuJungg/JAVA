import java.util.Scanner;

class Student1{  //�İ�
	
	private String name;
	private int studentNum;
	private int grade;
	
	Student1(String Name, int ID, int Grade){
		name =Name;
		studentNum = ID;
		grade = Grade;
	}
	
	int getStudentNum() {
		return studentNum;
	}
	
	String getName() {
		return name;
	}
	
	int getGrade() {
		return grade;
	}
}

class Student2{ //�߾��߹�
	
	private String name;
	private int studentNum;
	private int grade;
	
	Student2(String Name, int ID, int Grade){
		name =Name;
		studentNum = ID;
		grade = Grade;
	}
	
	int getStudentNum() {
		return studentNum;
	}
	
	String getName() {
		return name;
	}
	
	int getGrade() {
		return grade;
	}
}


public class Student {
	String Name1, Name2;  //�̸��� �Է¹޴� ����
	int ID1, ID2, Grade1, Grade2; //�й�, �г� �Է¹޴� ����
	
	public static void main(String[] args) {
		String Menu; //�޴� ���� ����
		String Major1, Major2;  //�а�1:�İ�, �а�2:�߾��߹�
		
		Student1 [] Array1 = new Student1 [4]; //�İ� �迭�� �̿��Ͽ� �л����� �Է� ���� 
		Student2 [] Array2 = new Student2 [4]; //�߾��߹� �迭�� �̿��Ͽ� �л����� �Է� ����
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("================");
		System.out.println("�й�: 201813111");
		System.out.println("�̸�: ������");
		System.out.println("================\n");
		System.out.println("�л� ���� �Է� �ý���");
		
		while(true) {
			System.out.println();
			System.out.println("\t \t�޴��� �����ϼ���.");
			System.out.println("|1. �а� ���� �� �л� ���� �Է� | |2. ���| |0. ������|");
			Menu = scanner.next();  //�޴��� �Է� ����. next():�� ����(�������) ������ �Է¹޴´�.
			// scanner.nextLine():�� �� ������ �Է¹޴´�.
			
			if("0".equals(Menu)) { //0�� �Է¹޾��� ��� �ý��� ����.
				System.out.println("�ý����� ���� �Ǿ����ϴ�.");
				System.exit(0); //��������
				//System.exit(1); ����������
				//exit(): ���� �����ϰ� �ִ� ���μ����� ���� �����Ű�� ����
			}
			
			if("1".equals(Menu)) { //1�� �Է¹޾��� ��� �а� ���� �� �ٷ� �л� ������ �Է�
				System.out.println("|1. �İ� | |2. �߾��߹�|");
				Major1 = scanner.next();
				
				if("1".equals(Major1)) { //�İ� �л� ������ �Է� ����
					String name; //�İ� �л� �̸� ����
					int studentNum, grade; //�İ� �й�, �г� ����
					for(int i=1; i<4; i++) { 
						System.out.println(i + "��° �л��� �̸��� �Է��ϼ���");
						System.out.print(">>");
						name = scanner.next();
						
						System.out.println(i + "��° �л��� �й��� �Է��ϼ���");
						System.out.print(">>");
						studentNum = scanner.nextInt();
						
						System.out.println(i + "��° �л��� �г��� �Է��ϼ���");
						System.out.print(">>");
						grade = scanner.nextInt();
						Array1[i] = new Student1(name, studentNum, grade); //�迭�� ���ʴ�� �̸�, �й�, �г��� ����
					}
					continue; //�̾ ���
				}
				
				else if("2".equals(Major1)) {
					String name;
					int studentNum, grade;
					
					for(int j=1; j<4; j++) {
						System.out.println(j + "��° �л��� �̸��� �Է��ϼ���");
						System.out.print(">>");
						name = scanner.next();
						
						System.out.println(j + "��° �л��� �й��� �Է��ϼ���");
						System.out.print(">>");
						studentNum = scanner.nextInt();
						
						System.out.println(j + "��° �л��� �г��� �Է��ϼ���");
						System.out.print(">>");
						grade = scanner.nextInt();
						Array2[j] = new Student2(name, studentNum, grade);
					}
				}
				
				else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��Ͻʽÿ�.");
					continue;
				}
			}
			
			if("2".equals(Menu)) { //2���� �Է¹޾��� ��� �а� ���� �� �ٷ� �л� ���� ���
				try {
					System.out.println("|1. �İ� | |2. �߾��߹�|");
					Major2 = scanner.next();
					if("1".equals(Major2)) { //�İ� �л� ���� ���
						for(int i=1; i<Array1.length; i++) {
							System.out.print("\n" + i + "��° �л��� �̸�: " + Array1[i].getName());
							System.out.print("\t�й�: " + Array1[i].getStudentNum());
							System.out.print("\t�г�: " + Array1[i].getGrade());
						}
						continue;
					}
					if("2".equals(Major2)) {
						for(int j=1; j<Array2.length;j++) {
							System.out.print("\n" + j + "��° �л��� �̸�: " + Array1[j].getName());
							System.out.print("\t�й�: " + Array1[j].getStudentNum());
							System.out.print("\t�г�: " + Array1[j].getGrade());
						}
					}
					else { //��ϵ� ������ ���� �� �޽��� ���
						System.out.println("��ϵǾ� �ִ� ������ �����ϴ�. ��� �� �ٽ� �õ� �Ͻʽÿ�!");
						continue;
					}
				}
				
				catch(Exception e) { //����� ��� �޽���
					e.getMessage();
					System.out.println("\n������� ��µǾ����ϴ�.");
				} //catch End.
				
			} //Menu Select End
		} //While End
	} // main end

}
