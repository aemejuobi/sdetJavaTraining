package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of the Rings";
		
		if(bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word " + wordChoice);
		}
		
		String browser = "Chrome";
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome!");
		}
		
		String firstName = "Allen";
		String lastName = "Emejuobi";
		String ssn = "000000000";
		
		System.out.println("There are " + ssn.length() + " digits in you SSN");
		
		//Print the initials and the last 4 digits of ssn
		System.out.println(firstName.substring(0, 1));
		System.out.println(lastName.substring(0, 1));
		System.out.println(ssn.substring(5));
		

	}

}
