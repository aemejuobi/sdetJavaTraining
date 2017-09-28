package oop;

public class BankAccount implements IRate{
	String accountNumber;
	private static final String routingNumber = "00000000";
	private String name;
	private String ssn;
	private String accoutType;
	double balance = 0;
	
	//Constructor definitions: unique methods
		//Used to define, setup, initialize properties of an object
		//They're IMPLICITLY called upon instantiation
		//Same name as class itself
		//No return type at all
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	//Overloading: calling same method name w/ diff args
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit){
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
		String msg = null;
		if(initDeposit < 1000){
			msg = "ERROR: Minimum deposit must be at least $1000";
		}else{
			msg = "Thanks for your deposit of: $" + initDeposit;
		}
		System.out.println(msg);
		balance = initDeposit;
	}
	
	//getters and setters
	//Allow the user to define the name
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	
	//Interface Methods
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	public void increaseRate() {
		System.out.println("INCREASING RATE");
	}
	
	
	
	
	//define methods
	public void deposit(double amount) {
		balance += amount;
		showActivity("DEPOSIT");
	}
	
	public void withdraw(double amount) {
		balance += amount;
		showActivity("WITHDRAW");
	}
	
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION " + activity);
		System.out.println("YOUR NEW BALANCE IS: $" + balance);
	}
	
	public void checkBalance() {
		System.out.println("Balance is the " + balance);
	}
	
	public void status() {
		
	}
	
	@Override
	public String toString() {
		return "[ NAME: " + name + ", ACCOUNT#: " + accountNumber + ", ROUTING#: " + routingNumber + ", BALANCE: $" + balance + " ]";
	}
	
}
