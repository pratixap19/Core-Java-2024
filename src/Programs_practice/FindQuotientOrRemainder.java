package Programs_practice;

import java.util.Scanner;

public class FindQuotientOrRemainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		
		System.out.println("Enter devisor");
		int devisor=sc.nextInt();
		sc.close();
		
		System.out.println("Quotient is:" + num/devisor);
		System.out.println("Remainder is:" + num%devisor);
		
		
	}

}
