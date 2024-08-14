
public class MyOOP2 {

	public static void main(String[] args) {
		// new: 클래스의 인스터스로 복제할 때 사용
		
		
		SecPrint p1 = new SecPrint();
		p1.delimiter="-";
		p1.A();
		p1.A();
		p1.B();
		p1.B();
		
		SecPrint p2 = new SecPrint();
		p2.delimiter="+";
		p2.A();
		p2.A();
		p2.B();
		p2.B();
		
		p1.A();
		p2.A();
		p1.A();
		p2.A();
		
		
	}

}
