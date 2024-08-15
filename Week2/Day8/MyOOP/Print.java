
class Print {

	public String delimiter = "";
	
	public Print(String delimiter) {
		// 생성자 함수
		this.delimiter = delimiter;
		
	}

	public void A() {
		System.out.println(this.delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	
	public void B() {
		System.out.println(this.delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}
