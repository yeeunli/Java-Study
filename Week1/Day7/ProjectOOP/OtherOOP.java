import java.io.FileWriter;
import java.io.IOException;

public class OtherOOP {
	
	// class: System, Math, FileWriter
	// instance: f1, f2
	
	// 클래스의 복제본을 만든게 인스턴스 

	public static void main(String[] args) throws IOException {
		System.out.println(Math.PI); // PI라는 변수가 들어있고, 
		System.out.println(Math.floor(1.8)); // floor라는 메서드가 들어있고, 
		System.out.println(Math.ceil(1.8)); // ceil이라는 메서드가 들어있음
		
		// 즉, 비슷한 주제의 변수와 메서드가 그룹으로 묶인 형태가 Math라는 클래스
		
		FileWriter f1 = new FileWriter("data.txt");
		f1.write("Hello");
		f1.write(" Java");
		f1.close();
		
		FileWriter f2 = new FileWriter("data2.txt");
		f2.write("Hello");
		f2.write(" Java2");
		f2.close();

	}

}
