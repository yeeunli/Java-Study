class Accounting {
	
	public double valueOfSupply;
	
	public static double vatRate = 0.1;
	
	public Accounting(double vauleOfSupply) {
		this.valueOfSupply=vauleOfSupply;
	}
	
	public double getVAT() {
		return valueOfSupply * vatRate;
	}
	
	public double getTotal() {
		return valueOfSupply + getVAT();
	}
	
}

public class AccountingApp {

	public static void main(String[] args) {
		Accounting a1 = new Accounting(10000.0);
		
		Accounting a2 = new Accounting(20000.0);
		
		System.out.println("Value of Supply : " + a1.valueOfSupply);
		System.out.println("Value of Supply : " + a2.valueOfSupply);
		
		System.out.println("VAT : " + a1.getVAT());
		System.out.println("VAT : " + a2.getVAT());
		
		System.out.println("Total : " + a1.getTotal());	
		System.out.println("Total : " + a2.getTotal());	
		
		
//		Accounting.valueOfSupply = 10000.0;
//		System.out.println("Value of Supply : " + Accounting.valueOfSupply);
//		System.out.println("VAT : " + Accounting.getVAT());
//		System.out.println("Total : " + Accounting.getTotal());		

	}

}
