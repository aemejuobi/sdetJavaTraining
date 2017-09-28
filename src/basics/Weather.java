package basics;

public class Weather {
	public static void main(String[] args) {
		//This program will give suggestion on what to wear based on the weather (temperature)
		
		int temp = 65;
		String sunCondition = "Overcast";
		
		if(temp > 80) {
			System.out.println("It's pleasant. Wear shorts and t-shirt");
			
		}else if((temp > 60) && (sunCondition == "Sunny")) {
			System.out.println("It's a bit cooler, where a long sleeve shirt and jeans");
			System.out.println("Wear a hat to keep the sun out of your eyes");
			
		}else if((temp > 50)||(sunCondition == "Overcast")) {
			System.out.println("This is a cool day, make sure to wear warmer clothes");
			
		}else {
			System.out.println("Looks like a cold day, bring a sweater");
		}
		
		System.out.println("The program is ending");
	}
}
