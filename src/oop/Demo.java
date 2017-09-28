package oop;

class Person{
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println("Email " + name + " at " + email + " for food to eat");
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}

public class Demo {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Benga";
		person1.email = "email@email.com";
		person1.phone = "555-555-5555";
		
		//Abstraction
		person1.walk();
		person1.eat();
		person1.sleep();
		
		
		/*
		// Person
		String name= "Allen";
		String email = "email@email.com";
		String phone = "555-555-5555";
		
		//Action, activity, behavior
		System.out.println(name + " is walking");
		System.out.println(name + " is eating");
		walking("Benga");*/

	}
	
	/*static void walking(String name) {
		System.out.println(name + " is walking");
	}*/
	

}
