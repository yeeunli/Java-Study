class Foo{
	public static String classVar="I class var";
	public String instanceVar = "I instance var";
	
	public static void classMethod() { // class의 method에서도 마찬가지로,
		System.out.println(classVar); // class를 통해서 접근 가능
//		System.out.println(instanceVar); // instance를 통해야만 접근 가능 
	}
	
	public void instanceMethod() { // instance의 method에서는, 
		System.out.println(classVar); // class 변수와
		System.out.println(instanceVar); // instance 변수 모두 접근 가능 
		
	}
}
public class StaticApp {

	public static void main(String[] args) {
		System.out.println(Foo.classVar); // class를 통해서 접근 가능
//		System.out.println(Foo.instanceVar); // instance를 통해야만 접근 가능 
		
		Foo.classMethod();
//		Foo.instanceMethod(); // instanceMethod는 instance 소속이라 클래스를 통해서 접근 불가
		
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		System.out.println(f1.classVar); // I class var
		System.out.println(f1.instanceVar); // I instance var
		
		f1.classVar="changed by f1";
		System.out.println(Foo.classVar); // changed by f1
		System.out.println(f2.classVar); // changed by f1
		
		f1.instanceVar="changed by f1";
		System.out.println(f1.instanceVar); // changed by f1
		System.out.println(f2.instanceVar); // I instance var
	}

}
