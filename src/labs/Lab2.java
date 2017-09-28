package labs;

public class Lab2 {

	public static void main(String[] args) {
		//Create a Student
		Student stu1 = new Student("Allen", "123456789");
		Student stu2 = new Student("Gbenga", "987654321");
		Student stu3 = new Student("Funke", "123687359");
		
		stu1.enroll("Math 251");
		stu1.enroll("Programming 202");
		stu1.enroll("Computer Science 231");
		stu1.showCourses();
		//stu1.checkBalance();
		stu1.payTuition(600);
		//stu1.checkBalance();
		System.out.println(stu1.toString());
	}

}

/*
Create a Student Database with the following attributes:
- New Student constructor that takes name and SSN in the arguments
- Automatically create an email ID based on the name
- Set a private static ID
- Generate a user ID that is combination of Static ID, random 4-digit number between 1000 and 9000, and last 4 of SSN
- Methods: enroll(), pay(), checkBalance(), toString(), showCourses()
- Use encapsulation to set variables (phone, city, state)
*/

class Student{
	private String name;
	private String userId;
	private String ssn;
	private String email;
	private String phone;
	private String city;
	private String state;
	private static int id = 1000;
	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance = 0;
	
	
	//Constructor
	public Student(String name, String ssn) {
		id++;
		this.name = name;
		this.ssn = ssn;
		//setAccountId();
		setUserId();
		setEmail();
	}
	
	//getters and setters
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	private void setEmail() {
		email = name.toLowerCase() + "." + id + "@stumail.com";
		System.out.println("Your email is " + email);
	}
	private void setUserId() {
		int random = (int) (1000 + Math.random()*9000);
		userId = id + "" + random + ssn.substring(5,9);
		System.out.println("User ID: " + userId);
	}
	public String getEmail() {
		return email;
	}
	
	//methods
	public void enroll(String course) {
		this.courses = this.courses + "\n" + course;
		System.out.println(courses);
		balance += costOfCourse;
	}
	public void payTuition(int amount) {
		System.out.println("Payment $" + amount);
		balance -= amount;
	}
	public void checkBalance() {
		System.out.println("Balance: $" + balance);
	}
	public void showCourses() {
		System.out.println(courses);
	}
	@Override
	public String toString() {
		return "[NAME: " + name + "]\n"
				+ "[COURSES: " + courses + "]\n"
				+ "[BALANCE: $" + balance + "]";
	}
	
}
