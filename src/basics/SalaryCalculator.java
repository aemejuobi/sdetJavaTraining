package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		//Create a variable that defines our career
		
		//Declare a variable
		String career;
		System.out.println("Program is starting");
		
		//Define a variable
		career = "Android Developer";
		System.out.println("My career is " + career);
		
		//Declare and define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		//Compute our annual salary
		//rate*hoursPerWeek*weeksPerYear
		double salary = rate*hoursPerWeek*weeksPerYear;
		System.out.println("My salary as an " + career + " is "
				+ salary + " per year");
		
	}
}
