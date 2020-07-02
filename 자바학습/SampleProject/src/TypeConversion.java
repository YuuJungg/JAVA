
public class TypeConversion {

	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		System.out.println(b+i); // b가 int 타입으로 자동 변환
		System.out.println(10/4); 
		System.out.println(10.0/4);
		System.out.println((char)0X12340041);
		System.out.println((byte)(b+i));

	}

}
