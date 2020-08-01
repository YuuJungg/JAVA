import java.io.FileWriter;
import java.io.IOException;

public class OthersOOp {

	public static void main(String[] args) throws IOException {
		// class : System, Math, FileWriter
		// instance : f1, f2
		
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8)); //내림
		System.out.println(Math.ceil(1.8)); //올림
		
		FileWriter f1 = new FileWriter("data.txt"); //파일에 정보 기록할 때 클래스
		f1.write("Hello");
		f1.write(" Java");
		f1.close();
		
		FileWriter f2 = new FileWriter("data2.txt"); //파일에 정보 기록할 때 클래스
		f2.write("Hello");
		f2.write(" Java2");
		f2.close();
	}

}
