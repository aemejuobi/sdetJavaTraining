package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("469829874", 1000);
		BankAccount acc2 = new BankAccount("565322374", 3000);
		BankAccount acc3 = new BankAccount("765109874", 10000);
		
		acc1.setName("Allen");
		System.out.println(acc1.getName());
		acc1.makeDeposit(5000);
		acc1.makeDeposit(4000);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
	}

}

class BankAccount implements IInterest{
	//Properties of bank account
	private static int id = 1000; //Internal id
	private String accountNumber; //id + random 2-digit number + first 2 of ssn
	private static final String routingNumber = "0045400657";
	private String name;
	private String ssn;
	private double balance;
	
	//Constructor
	public BankAccount(String ssn, double initDeposit) {
		balance = initDeposit;
		this.ssn = ssn;
		id++;
		setAccountNumber();
	}
	
	//Setting up getters and setters
	private void setAccountNumber() {
		int random = (int) (Math.random()*100);
		accountNumber = id + "" + random + ssn.substring(0, 1);
		System.out.println("Your Account Number: " + accountNumber);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	//Methods
	public void payBill(double amount) {
		balance -= amount;
		System.out.println("Paying bill: " + amount);
		showBalance();
	}
	public void makeDeposit(double amount) {
		System.out.println("Making deposit: " + amount);
		balance += amount;
		showBalance();
	}
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}
	public void accrue() {
		balance = balance*(1 + rate/100);
		showBalance();
	}
	@Override
	public String toString() {
		return "[Name: " + name + " ]\n"
				+ "[Account Number: " + accountNumber + "]\n"
				+ "[Routing Number: " + routingNumber + "]\n"
				+ "[Balance: " + balance + "]";
	}
	
}
