package labs;

public class Lab1 {

	public static void main(String[] args) {
		System.out.println(addNumbers(5));
		System.out.println("Factorial: " + factorial(4));
		int[] array = {5, -2, 0, -438, 63};
		System.out.println(minValue(array));
		 
	}

	/* Write a function that takes a value n and returns 
	 * the sum of numbers 1 to n.*/
	public static int addNumbers(int n) {
		 int sum=0;
		 for(int i=0; i<=n; i++) {
			 sum+=i;
		 }
		 return sum;
	}
	
	/*Write a function that computes the factorial value.
	 * Definition: n! = n*(n-1)! , where 0! = 1*/
	public static int factorial(int x) {
		if(x==0) {
			return 1;
		}
		System.out.println(x);
		return factorial(x-1)*x;
	}
	
	/*Write 3 functions that take an array as a parameter 
	 * and return the minimum, average, and maximum values 
	 * of that array. 
	 * Hint: this should be static functions with a return 
	 * type of the same data type as the array declaration.*/
	public static int minValue(int[] array) {
		int minimum = array[0];
		for(int i=0; i<array.length; i++) {
			if(array[i]< minimum) {
				minimum = array[i];
			}
		}
		return minimum;
	}
	
	public static int maxValue(int[] array) {
		int maximum = array[0];
		for(int i=0; i<array.length; i++) {
			if(array[i] > maximum) {
				maximum = array[i];
			}
		}
		return maximum;
	}
	
	public static int averageValue(int[] array) {
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			sum +=array[i];
		}
		return sum / array.length;
	}
	
	
}
