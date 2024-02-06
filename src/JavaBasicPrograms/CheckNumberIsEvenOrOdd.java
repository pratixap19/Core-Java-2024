package JavaBasicPrograms;
//followed QAFox
import java.util.Scanner;

public class CheckNumberIsEvenOrOdd {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number:");
		
		int num = scanner.nextInt();
		scanner.close();
		
		if(num%2==0) {
			System.out.println("Number given by user is even");
		}
		else {
			System.out.println("Number given by user is odd");
		}
		

	}

}
