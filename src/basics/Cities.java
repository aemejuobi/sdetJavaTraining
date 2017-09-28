package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define an array
		String[] cities = {"New York", "San Fransisco", "Miami", "Dallas"};
		String[] states = {"Texas", "Florida", "California", "Missouri"};
		//System.out.println(cities[0]);
		for(int i=0; i<cities.length; i++) {
			System.out.println("City at " + i + ": " + cities[i]);
		}
		
		System.out.println("\n");
		
		for(int i=0; i<states.length; i++) {
			System.out.println(states[i]);
		}
		
		System.out.println("\n");
		int i=0;
		do {
			System.out.println("State: " + states[i]);
			i=i+1;
		}while(i<states.length);
		
		System.out.println("\n");
		
		int n=0;
		boolean stateFound = false;
		while(!stateFound) {
			String state = states[n];
			System.out.println(state);
			if(state == "Texas") {
				System.out.println("STATE FOUND");
				stateFound = true;
			}
		}n++;
		

	}

}
