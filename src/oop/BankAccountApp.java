package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Create a new bank account
		
		BankAccount account1 = new BankAccount();
		
		//account1.name = "Allen";
		//With Encapsulation
		account1.setName("Ghost");
		System.out.println(account1.getName());
		account1.setSsn("111111111");
		account1.getSsn();
		
		account1.balance = 100000;
		account1.accountNumber = "012345678";
		account1.setRate();
		account1.increaseRate();
		
		account1.deposit(15000);
		
		
		
		//Polymorphism through overriding
		System.out.println(account1.toString());
		
		
		//Polymorphism through overloading
		BankAccount account2 = new BankAccount("Checking Account");
		
		BankAccount account3 = new BankAccount("Checking Account", 200000);
		
		
		/*
		//Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.name = "Benga";
		cd1.accoutType = "CD Account";
		System.out.println(cd1.toString());
		*/
		
		
	}

}
