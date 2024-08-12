class Print{
	public String delimiter;
	
	public void a() { // static 없는 이유: t1.a();처럼 메서드가 클래스가 아닌 인스턴스 소속일 때는 static 빼줘야함 
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
	}

	public void b() {
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");		
	}
	
	public static void c(String delimiter) {
		System.out.println(delimiter);
		System.out.println("c");
		System.out.println("c");		
	}
	
}
public class staticMethod {

	public static void main(String[] args) {
//		Print.a("-"); // 만약, 이 코드로 실행하려면.. 메서드가 클래스 소속이니 static 있어야 함 ex) public static void a() {} 
//		Print.b("-");
		
		// Print 클래스의 인스턴스: t1
		Print t1 = new Print();
		t1.delimiter="-";
		t1.a();
		t1.b();
		
//		Print.a("*");
//		Print.b("*");
		
		// Print 클래스의 인스턴스: t2
		Print t2 = new Print();
		t2.delimiter = "*";
		t2.a();
		t2.b();
		
		Print.c("%");
	}

}
