package oop;

public class CDAccount extends BankAccount implements IRate{
	String interestRate;
	
	void compound() {
		System.out.print("Compounding interest");
	}
}
