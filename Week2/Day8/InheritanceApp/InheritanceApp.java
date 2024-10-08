class Cal{
    
    public int sum(int v1, int v2){
    	return v1+v2;
    }
}

class Cal3 extends Cal{
	
	// method 재정의 (Overriding)
	public int sum(int v1, int v2){
		System.out.println("Cal3!!");
    	return v1+v2;
    }
    
    public int minus(int v1, int v2){
    	return v1-v2;
    }
}

public class InheritanceApp {
	
    public static void main(String[] args) {
    	
        Cal c = new Cal();
        System.out.println(c.sum(2, 1)); // 3
        
        Cal3 c3 = new Cal3();
        System.out.println(c3.sum(2, 1)); // 3
        System.out.println(c3.minus(2, 1)); // 1
        System.out.println(c3.sum(2, 1)); // 3
    }
}