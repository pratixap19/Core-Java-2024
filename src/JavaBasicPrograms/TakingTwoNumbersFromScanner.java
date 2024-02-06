package JavaBasicPrograms;
//followed QAFox
import java.util.Scanner;

public class TakingTwoNumbersFromScanner {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number");
		
		int firstNumber = scanner.nextInt();
		
		System.out.println("Enter second number");
		
		int secondNumber = scanner.nextInt();
		
		scanner.close();
		System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is : " + (firstNumber + secondNumber));
		
		
		

	}

}
