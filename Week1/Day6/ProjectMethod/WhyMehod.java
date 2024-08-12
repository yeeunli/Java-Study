
public class WhyMehod {
	public static void printTwoTimes(String txt, String delimiter) {
		// 매개변수 (parameter)
		System.out.println(txt);
		System.out.println(txt);
		System.out.println(delimiter);
	}

	
	public static String twoTimes(String txt, String delimiter) {
		String out = "";
		out += delimiter + "\n";
		out += txt + "\n";
		out += txt + "\n";
		return out;
	}

	
	
	public static void main(String[] args) {
		
		printTwoTimes("A", "-");
		// 인자 (argument)
		System.out.println(twoTimes("A", "-"));
		printTwoTimes("B","~");
		
		printTwoTimes("C","^");
		

	}

}
