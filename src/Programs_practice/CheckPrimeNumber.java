package Programs_practice;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		sc.close();
		boolean isPrime=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("It is prime number");
		}else {
			System.out.println("It is not a prime number");
		}
		

	}

}
