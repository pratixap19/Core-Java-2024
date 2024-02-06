package JavaBasicPrograms;
//The factorial of a number is the multiplication of all the numbers 
//between 1 and the number itself. 
//It is written like this: n!. So the factorial of 5 is 5! (=5X4X3X2X1).
public class FactorialNumber {

	public static void main(String[] args) {
		int num = 8;
		int factorial=1;
		for(int i=1;i<=num;i++) {
			factorial = factorial*i; //1, 2, 6, 24, 120
		}
		System.out.println(factorial);
	}	
}
