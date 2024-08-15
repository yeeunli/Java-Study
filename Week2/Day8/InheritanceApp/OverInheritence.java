class Cal1{
    // method 조금씩 다르게 여러 개 구성 (Overriding)
    public int sum(int v1, int v2){
    	return v1+v2;
    }
    
    public int sum(int v1, int v2, int v3){
    	return this.sum(v1, v2)+v3; // 자기 자신의 method 호출 
    }
}

class Cal2 extends Cal1{
	
	// method 재정의 (Overriding)
	public int sum(int v1, int v2){
		System.out.println("Cal2!!");
    	return super.sum(v1, v2); // 부모의 method 호출 
    }
    
    public int minus(int v1, int v2){
    	return v1-v2;
    }
}

public class OverInheritence {
	
    public static void main(String[] args) {
    	
        Cal1 c = new Cal1();
        System.out.println(c.sum(2, 1)); // 3
        System.out.println(c.sum(2, 1, 1)); // 4
        
        Cal2 c3 = new Cal2();
        System.out.println(c3.sum(2, 1)); // 3
        System.out.println(c3.minus(2, 1)); // 1
        System.out.println(c3.sum(2, 1)); // 3
    }
}