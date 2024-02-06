package JavaBasicPrograms;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value: ");
		int num = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter second value: ");
		int devisor = sc.nextInt();
		
		System.out.println("Quotient is : " + num/devisor);
		System.out.println("Remainder is : " + num%devisor);
		
	}

}
