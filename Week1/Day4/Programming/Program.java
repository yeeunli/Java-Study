
public class Program {
	// 프로그래밍이란, 
	// 컴퓨터가 인간이 하기 힘들거나 반복적인 일을 
	// 대신 해주도록, 순차적으로 실행되도록, 자동화 하는 것
	
	public static void main(String[] args) { // args: parameter 매개변수 
		
		// eclipse에서 매개변수 전달하는 방법: 
		// run configurations의 arguments 탭에서
		// 배열 순서대로 큰 따옴표로 구분하여 전달 가능
		// 장점: 사용자로부터 직접 변수 값을 입력받지 않아도 됨 
		
		String id = args[0];
		String bright = args[1];
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(id);
		System.out.println(bright);
		
	}
}