
public class Casting {

	public static void main(String[] args) {
		double a = 1.1;
		double b =1; // 값의 손실이 없기 때문에 가능 
		System.out.println(b);
		
		// int c = 1.1; // 값의 손실이 있기에 불가능 
		int c = (int) 1.1; // 따라서, 캐스팅 필요 -> 즉, 손실 발생 감안하고 데이터 타입 변환해줌
		System.out.println(c);
		
		String f = Integer.toString(1);
		System.out.println(f);
		System.out.println(f.getClass());
	}

}
