package Programs_practice;

import java.util.Scanner;

public class PrintArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		sc.close();
		int temp=num;
		int sum=0;
		int rem;
		while(num>0) {
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("It is armstrong number");
		}else {
			System.out.println("It is not armstrong number");
		}

	}

}
