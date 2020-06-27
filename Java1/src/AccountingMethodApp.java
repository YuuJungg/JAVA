
public class AccountingMethodApp {

	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	public static void main(String[] args) {
		valueOfSupply = 10000.0;
		vatRate = 0.1;
		expenseRate = 0.3;		
		print();
	}

	private static void print() {
		System.out.println("Value of supply : " + valueOfSupply); // 공급가		
		System.out.println("VAT : " + getVAT()); // 부가가치세
		System.out.println("Total : " + getTotal()); // 공급가 + 부가가치세
		System.out.println("Expense : " + getExpense()); // 비용
		System.out.println("Income : " + getIncome()); // 공급가
		System.out.println("Dividend 1 : " + getDiviend1());
		System.out.println("Dividend 2 : " + getDiviend2());
		System.out.println("Dividend 3 : " + getDiviend3());
	}

	private static double getDiviend1() {
		return getIncome() * 0.5;
	}
	
	private static double getDiviend2() {
		return getIncome() * 0.3;
	}
	
	private static double getDiviend3() {
		return getIncome() * 0.2;
	}
	
	private static double getIncome() {
		return valueOfSupply - getExpense();
	}

	private static double getExpense() {
		return valueOfSupply*expenseRate;
	}

	private static double getTotal() {
		return valueOfSupply + getVAT();
	}

	private static double getVAT() {
		return valueOfSupply*vatRate;
	}

}
