class Calc {
	int v1, v2;
	Calc(int v1, int v2) {
		System.out.println("Calc init!!");
		this.v1 = v1; 
		this.v2 = v2;
	}
	
	public int sum() {
		return this.v1+v2;
	}
}

class Calc3 extends Calc {
	// 상속 받은 클래스의 부모가 생성자를 가졌다면, 자식도 무조건 생성자 가져야 함 

	Calc3(int v1, int v2) {
		super(v1, v2);
		System.out.println("Calc3 init!!");
	}
	
	public int minus() {
		return this.v1-v2;
	}
	
}

public class ConInheritence {

	public static void main(String[] args) {
		Calc c = new Calc(2,1);
		Calc3 c3 = new Calc3(1,3);
		
		System.out.println(c3.sum());
		System.out.println(c3.minus());

	}

}
