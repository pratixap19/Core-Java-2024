package Programs_practice;

import java.util.Scanner;

public class CheckEvenOrOddNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		sc.close();
		if(num%2==0) {
			System.out.println("It is even number");
		}else {
			System.out.println("It is odd number");
		}

	}

}
